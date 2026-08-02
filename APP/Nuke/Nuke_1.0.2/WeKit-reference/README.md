# Nuke 1.0.2 protocol reference

This directory is a reduced reference extracted from WeKit for the Nuke 1.0.2
client protocol. It contains a dependency-free Python backend probe, the
recovered Rust crypto implementation, and one Android integration example.

Run the real backend check:

```powershell
python .\test_nuke_api.py
```

Run the reusable client directly:

```powershell
python .\nuke_client.py --version-code 234
```

Both commands call `https://www.guang233.com/api/client/update` over HTTPS.
They do not load the APK, `libnuke_bridge.so`, or the downloaded engine.

Documentation:

- `MODIFICATIONS.md`: exact cleanup and code changes.
- `NUKE_1.0.2_REVERSE_REPORT.md`: endpoints, directory map, native packaging,
  REST v3 encryption, signing, and backend connection flow.
- `REGISTRATION.md`: direct registration command, generated request fields, and
  the latest live server response.

Registration entry point:

```powershell
.\register_random.ps1
```

This invokes `app/src/main/rust/wekit-native/examples/register_random.rs`,
which creates a fresh `wxid_`, generates the local signer packet, and sends a
real `POST /api/client/users`. Each attempt is recorded under
`app/src/main/rust/wekit-native/registration_results/`.

The Rust source under `app/src/main/rust/wekit-native` is retained as reverse
engineering evidence and for its offline crypto vectors. `Experiments2.kt` is
an integration reference for merging the native call back into a full WeKit
checkout.

The live Python acceptance test covers the public update API. The retained
signer is an offline oracle reference; current authenticated users/report POSTs
remain tracked separately in `NUKE_1.0.2_REVERSE_REPORT.md`.
