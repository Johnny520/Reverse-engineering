//! Minimal Nuke protocol reference and optional JNI entry point.

#![allow(clippy::not_unsafe_ptr_arg_deref, clippy::missing_safety_doc)]

pub mod nuke_client;
pub mod nuke_crypto;

use std::{
    ffi::CString,
    fs::File,
    io::Read,
    panic::{AssertUnwindSafe, catch_unwind},
    time::{SystemTime, UNIX_EPOCH},
};

use jni::sys::{
    JNI_VERSION_1_6, JNIEnv as RawJNIEnv, JavaVM, jint, jobject, jstring,
};
use libc::c_void;

fn new_jstring(env: *mut RawJNIEnv, value: &str) -> jstring {
    if env.is_null() {
        return std::ptr::null_mut();
    }
    unsafe {
        let fns = *env;
        let value = CString::new(value)
            .unwrap_or_else(|_| CString::new("native string conversion failed").unwrap());
        ((*fns).v1_6.NewStringUTF)(env, value.as_ptr())
    }
}

fn random_uuid_v4() -> Result<String, String> {
    let mut bytes = [0u8; 16];
    File::open("/dev/urandom")
        .and_then(|mut source| source.read_exact(&mut bytes))
        .map_err(|error| format!("nonce generation failed: {error}"))?;
    bytes[6] = (bytes[6] & 0x0f) | 0x40;
    bytes[8] = (bytes[8] & 0x3f) | 0x80;
    Ok(format!(
        "{:02x}{:02x}{:02x}{:02x}-{:02x}{:02x}-{:02x}{:02x}-{:02x}{:02x}-{:02x}{:02x}{:02x}{:02x}{:02x}{:02x}",
        bytes[0], bytes[1], bytes[2], bytes[3], bytes[4], bytes[5], bytes[6], bytes[7],
        bytes[8], bytes[9], bytes[10], bytes[11], bytes[12], bytes[13], bytes[14], bytes[15]
    ))
}

fn nuke_client_error(message: impl Into<String>) -> String {
    serde_json::json!({
        "success": false,
        "error": message.into(),
    })
    .to_string()
}

fn nuke_request_headers(auth: &nuke_client::ClientAuth) -> serde_json::Value {
    serde_json::json!({
        "Content-Type": "application/json",
        "X-Client-Id": auth.user_id,
        "X-Platform": auth.platform,
        "X-Timestamp": auth.timestamp,
        "X-Nonce": auth.nonce,
        "X-Native-Generation": nuke_client::NUKE_NATIVE_GENERATION,
        "X-Signature": auth.signature,
    })
}

fn run_nuke_client_transaction() -> String {
    use nuke_client::{
        ClientAuth, DEFAULT_CLIENT_REPORT_URL, DEFAULT_WECHAT_PLATFORM, DEFAULT_WECHAT_USER_ID,
        client_users_endpoint_for_report, current_native_sync_signer_observations,
        fixed_native_wechat_report, is_valid_wechat_user_id, prepare_one_report,
        prepare_registration, send_prepared_registration, send_prepared_report,
        sign_prepared_registration_with_signer_observations,
        sign_prepared_report_with_signer_observations,
    };

    let user_id = DEFAULT_WECHAT_USER_ID;
    if !is_valid_wechat_user_id(user_id) {
        return nuke_client_error("invalid built-in WeChat user id");
    }

    let result = (|| -> Result<serde_json::Value, String> {
        let timestamp = SystemTime::now()
            .duration_since(UNIX_EPOCH)
            .map_err(|error| format!("clock failed: {error}"))?
            .as_secs()
            .to_string();
        let registration_endpoint = client_users_endpoint_for_report(DEFAULT_CLIENT_REPORT_URL)
            .map_err(|error| error.to_string())?;
        let registration_auth = ClientAuth {
            user_id: user_id.to_owned(),
            platform: DEFAULT_WECHAT_PLATFORM.to_owned(),
            timestamp: timestamp.clone(),
            nonce: random_uuid_v4()?,
            signature: String::new(),
        };
        let report_auth = ClientAuth {
            user_id: user_id.to_owned(),
            platform: DEFAULT_WECHAT_PLATFORM.to_owned(),
            timestamp,
            nonce: random_uuid_v4()?,
            signature: String::new(),
        };
        let observations =
            current_native_sync_signer_observations(0).map_err(|error| error.to_string())?;

        let prepared_registration =
            prepare_registration(&registration_auth).map_err(|error| error.to_string())?;
        let signed_registration = sign_prepared_registration_with_signer_observations(
            &prepared_registration,
            &registration_auth,
            observations.registration,
        )
        .map_err(|error| error.to_string())?;
        let registration = send_prepared_registration(
            &registration_endpoint,
            &prepared_registration,
            &signed_registration,
        )
        .map_err(|error| error.to_string())?;

        let report_json = fixed_native_wechat_report()
            .to_json_bytes()
            .map_err(|error| error.to_string())?;
        let prepared_report =
            prepare_one_report(&report_json, &report_auth).map_err(|error| error.to_string())?;
        let signed_report = sign_prepared_report_with_signer_observations(
            &prepared_report,
            &report_auth,
            observations.report,
        )
        .map_err(|error| error.to_string())?;
        let report = send_prepared_report(
            DEFAULT_CLIENT_REPORT_URL,
            &prepared_report,
            &signed_report,
        )
        .map_err(|error| error.to_string())?;

        Ok(serde_json::json!({
            "success": true,
            "userId": user_id,
            "registration": {
                "endpoint": registration_endpoint,
                "httpStatus": registration.http_status,
                "requestHeaders": nuke_request_headers(&signed_registration),
                "requestBody": registration.request_body,
                "canonicalPayload": registration.canonical_payload,
                "responseBody": registration.response_body,
                "code": registration.code,
                "message": registration.message,
            },
            "report": {
                "endpoint": DEFAULT_CLIENT_REPORT_URL,
                "httpStatus": report.http_status,
                "requestHeaders": nuke_request_headers(&signed_report),
                "requestBody": report.request_body,
                "canonicalPayload": report.canonical_payload,
                "responseBody": report.response_body,
                "decryptedJson": report.decrypted_json,
            },
        }))
    })();

    match result {
        Ok(value) => value.to_string(),
        Err(error) => nuke_client_error(error),
    }
}

/// Android integration reference used by `Experiments2.kt`.
#[unsafe(no_mangle)]
pub extern "C" fn Java_dev_ujhhgtg_wekit_features_items_debug_Experiments2_submitNukeReportNative(
    env: *mut RawJNIEnv,
    _thiz: jobject,
) -> jstring {
    let result = catch_unwind(AssertUnwindSafe(run_nuke_client_transaction))
        .unwrap_or_else(|_| nuke_client_error("native client panicked"));
    new_jstring(env, &result)
}

#[unsafe(no_mangle)]
pub extern "C" fn JNI_OnLoad(_vm: *mut JavaVM, _reserved: *mut c_void) -> jint {
    JNI_VERSION_1_6
}
