#[path = "../../WeKit-reference/app/src/main/rust/wekit-native/src/nuke_crypto/mod.rs"]
mod nuke_crypto;

use nuke_crypto::sign::{
    DEFAULT_SIGNER_COMPANION_SECRET, DEFAULT_SIGNER_KID, DEFAULT_SIGNER_ROOT,
    NativeSignerContext, native_signer_mode, sign_native_canonical,
};

fn main() {
    let mut args = std::env::args().skip(1);
    let user_id = args.next().expect("user id");
    let platform = args.next().unwrap_or_else(|| "WECHAT".to_owned());
    let timestamp = args.next().expect("epoch seconds");
    let nonce = args.next().expect("request nonce");
    let monotonic_millis = args
        .next()
        .expect("monotonic millis")
        .parse::<u64>()
        .expect("numeric monotonic millis");
    let runtime_flags = u64::from_str_radix(
        args.next()
            .as_deref()
            .unwrap_or("20800ea080215080")
            .trim_start_matches("0x"),
        16,
    )
    .expect("hex runtime flags");
    let generation = args.next().unwrap_or_else(|| "2026071502".to_owned());
    let body = format!(r#"{{"userId":"{user_id}","platform":"{platform}"}}"#);
    let canonical = [
        "POST",
        "/api/client/users",
        &user_id,
        &platform,
        &timestamp,
        &nonce,
        &generation,
        &body,
    ]
    .join("\n");
    let signature = sign_native_canonical(NativeSignerContext {
        root: DEFAULT_SIGNER_ROOT,
        companion_secret: DEFAULT_SIGNER_COMPANION_SECRET,
        canonical: canonical.as_bytes(),
        runtime_flags,
        mode: native_signer_mode(runtime_flags),
        kid: DEFAULT_SIGNER_KID,
        timestamps: [
            timestamp.parse().expect("numeric epoch seconds"),
            monotonic_millis,
            0,
        ],
        accepted_samples: 0,
    });

    println!("body={body}");
    println!("canonical_hex={}", hex(canonical.as_bytes()));
    println!("signature={signature}");
}

fn hex(bytes: &[u8]) -> String {
    const HEX: &[u8; 16] = b"0123456789abcdef";
    let mut output = String::with_capacity(bytes.len() * 2);
    for &byte in bytes {
        output.push(HEX[(byte >> 4) as usize] as char);
        output.push(HEX[(byte & 0x0f) as usize] as char);
    }
    output
}
