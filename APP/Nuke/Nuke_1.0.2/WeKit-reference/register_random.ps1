$ErrorActionPreference = 'Stop'
$root = Split-Path -Parent $MyInvocation.MyCommand.Path
$crate = Join-Path $root 'app\src\main\rust\wekit-native'
if (-not (Test-Path (Join-Path $crate 'Cargo.toml'))) { throw "Cargo.toml not found: $crate" }
Push-Location $crate
try {
    cargo run --quiet --example register_random
    if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
} finally {
    Pop-Location
}
