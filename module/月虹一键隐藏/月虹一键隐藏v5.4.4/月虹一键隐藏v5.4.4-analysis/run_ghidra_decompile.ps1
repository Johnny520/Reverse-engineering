$ErrorActionPreference = 'Stop'

$Workspace = Split-Path -Parent $PSScriptRoot
$Tools = Join-Path $Workspace 'tools'
$Target = Join-Path $PSScriptRoot 'main.unpacked'
$ProjectDir = Join-Path $PSScriptRoot 'ghidra_project'
$SourceDir = Join-Path $PSScriptRoot 'restored_source'
$ScriptDir = Join-Path $PSScriptRoot 'ghidra_scripts'
$JavaHome = 'jadx-gui-1.5.5-with-jre-win\jre'

$GhidraDir = Get-ChildItem -LiteralPath $Tools -Directory |
    Where-Object { $_.Name -like 'ghidra_*' } |
    Sort-Object Name -Descending |
    Select-Object -First 1

if (-not $GhidraDir) {
    throw "Ghidra directory was not found under $Tools"
}

$Headless = Join-Path $GhidraDir.FullName 'support\analyzeHeadless.bat'
if (-not (Test-Path -LiteralPath $Headless)) {
    throw "analyzeHeadless.bat was not found at $Headless"
}

New-Item -ItemType Directory -Path $ProjectDir -Force | Out-Null
New-Item -ItemType Directory -Path $SourceDir -Force | Out-Null
$env:JAVA_HOME = $JavaHome

$COutput = Join-Path $SourceDir 'main.decompiled.c'
$IndexOutput = Join-Path $SourceDir 'functions.tsv'

& $Headless $ProjectDir 'YH_YC_main' `
    -import $Target `
    -overwrite `
    -analysisTimeoutPerFile 3600 `
    -scriptPath $ScriptDir `
    -postScript 'DecompileAll.java' $COutput $IndexOutput

if ($LASTEXITCODE -ne 0) {
    throw "Ghidra headless analysis exited with code $LASTEXITCODE"
}

Get-Item -LiteralPath $COutput, $IndexOutput | Select-Object FullName,Length,LastWriteTime
