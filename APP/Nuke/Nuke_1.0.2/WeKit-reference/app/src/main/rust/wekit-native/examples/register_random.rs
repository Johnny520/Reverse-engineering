use std::time::{SystemTime, UNIX_EPOCH};

use wekit_native::nuke_client::{
    current_signer_observations, prepare_registration, send_prepared_registration,
    sign_prepared_registration_with_signer_observations, ClientAuth, DEFAULT_WECHAT_PLATFORM,
    NUKE_NATIVE_GENERATION,
};

fn next_u64(state: &mut u64) -> u64 {
    *state ^= *state << 13;
    *state ^= *state >> 7;
    *state ^= *state << 17;
    *state
}

fn random_wxid() -> String {
    let nanos = SystemTime::now()
        .duration_since(UNIX_EPOCH)
        .expect("clock before epoch")
        .as_nanos() as u64;
    let mut state = nanos ^ ((std::process::id() as u64) << 32);
    let alphabet = b"abcdefghijklmnopqrstuvwxyz0123456789";
    let mut out = String::from("wxid_");
    for _ in 0..14 {
        out.push(alphabet[(next_u64(&mut state) as usize) % alphabet.len()] as char);
    }
    out
}

fn main() {
    let user_id = random_wxid();
    let mut nonce_state = SystemTime::now()
        .duration_since(UNIX_EPOCH)
        .expect("clock before epoch")
        .as_nanos() as u64;
    let timestamp = SystemTime::now()
        .duration_since(UNIX_EPOCH)
        .expect("clock before epoch")
        .as_secs()
        .to_string();
    let nonce = format!("{}-{}", user_id, next_u64(&mut nonce_state));
    let auth = ClientAuth {
        user_id: user_id.clone(),
        platform: DEFAULT_WECHAT_PLATFORM.to_owned(),
        timestamp,
        nonce,
        signature: String::new(),
    };
    let prepared = prepare_registration(&auth).expect("prepare registration");
    let observations = current_signer_observations(0).expect("signer clock");
    let signed = sign_prepared_registration_with_signer_observations(
        &prepared,
        &auth,
        observations,
    )
    .expect("sign registration");

    println!("userId={user_id}");
    println!("generation={NUKE_NATIVE_GENERATION}");
    println!("requestBody={}", prepared.request_body);
    println!("signatureLength={}", signed.signature.len());
    match send_prepared_registration(
        "https://www.guang233.com/api/client/users",
        &prepared,
        &signed,
    ) {
        Ok(result) => {
            println!("httpStatus={}", result.http_status);
            println!("responseBody={}", result.response_body);
        }
        Err(error) => {
            println!("registrationError={error}");
            println!("registrationErrorDebug={error:?}");
            std::process::exit(1);
        }
    }
}
