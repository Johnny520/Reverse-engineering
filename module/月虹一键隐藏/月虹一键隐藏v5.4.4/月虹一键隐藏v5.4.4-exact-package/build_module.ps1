param(
    [string]$SourceModule = (Join-Path $PSScriptRoot '..\月虹一键隐藏v5.4.4'),
    [string]$OutputDirectory = (Join-Path $PSScriptRoot 'dist')
)

$ErrorActionPreference = 'Stop'
$ExpectedMainSha256 = 'E4F8A0B4A161E73BFC7A65DD5E0B9709700102EC6F9B962B9B84A366D06EA935'
$ArtifactName = 'YH_YC-v5.4.4-exact.zip'

Add-Type -AssemblyName System.IO.Compression
Add-Type -AssemblyName System.IO.Compression.FileSystem

$sourceRoot = (Resolve-Path -LiteralPath $SourceModule).Path.TrimEnd('\', '/')
$mainPath = Join-Path $sourceRoot 'main'
if (-not (Test-Path -LiteralPath $mainPath -PathType Leaf)) {
    throw "main not found: $mainPath"
}

$actualMainHash = (Get-FileHash -LiteralPath $mainPath -Algorithm SHA256).Hash
if ($actualMainHash -ne $ExpectedMainSha256) {
    throw "main SHA-256 mismatch. expected=$ExpectedMainSha256 actual=$actualMainHash"
}

[System.IO.Directory]::CreateDirectory($OutputDirectory) | Out-Null
$outputRoot = [System.IO.Path]::GetFullPath($OutputDirectory)
$zipPath = Join-Path $outputRoot $ArtifactName
$manifestPath = Join-Path $outputRoot 'build-manifest.json'

if ([System.IO.File]::Exists($zipPath)) {
    [System.IO.File]::Delete($zipPath)
}

$sourceFiles = Get-ChildItem -LiteralPath $sourceRoot -Recurse -Force -File |
    Sort-Object { $_.FullName.Substring($sourceRoot.Length) }

if ($sourceFiles.Count -eq 0) {
    throw "module directory is empty: $sourceRoot"
}

$executablePaths = @(
    'main',
    'service.sh',
    'customize.sh',
    'META-INF/com/google/android/update-binary'
)

$zip = [System.IO.Compression.ZipFile]::Open(
    $zipPath,
    [System.IO.Compression.ZipArchiveMode]::Create
)

try {
    foreach ($file in $sourceFiles) {
        $relativePath = $file.FullName.Substring($sourceRoot.Length).TrimStart('\', '/')
        $entryName = $relativePath.Replace('\', '/')
        $compression = [System.IO.Compression.CompressionLevel]::Optimal
        $entry = $zip.CreateEntry($entryName, $compression)
        $entry.LastWriteTime = [DateTimeOffset]::new($file.LastWriteTime)

        # Unix regular-file mode bits are stored in the high 16 bits.
        if ($executablePaths -contains $entryName -or $entryName.EndsWith('.sh')) {
            $entry.ExternalAttributes = -2115174400 # 0100755 << 16
        }
        else {
            $entry.ExternalAttributes = -2119958528 # 0100644 << 16
        }

        $input = [System.IO.File]::OpenRead($file.FullName)
        $output = $entry.Open()
        try {
            $input.CopyTo($output)
        }
        finally {
            $output.Dispose()
            $input.Dispose()
        }
    }
}
finally {
    $zip.Dispose()
}

$fileRecords = [System.Collections.Generic.List[object]]::new()
$verifiedZip = [System.IO.Compression.ZipFile]::OpenRead($zipPath)
$sha256 = [System.Security.Cryptography.SHA256]::Create()
try {
    foreach ($file in $sourceFiles) {
        $relativePath = $file.FullName.Substring($sourceRoot.Length).TrimStart('\', '/')
        $entryName = $relativePath.Replace('\', '/')
        $entry = $verifiedZip.GetEntry($entryName)
        if ($null -eq $entry) {
            throw "ZIP entry missing: $entryName"
        }

        $sourceHash = (Get-FileHash -LiteralPath $file.FullName -Algorithm SHA256).Hash
        $stream = $entry.Open()
        try {
            $zipHash = [System.BitConverter]::ToString($sha256.ComputeHash($stream)).Replace('-', '')
        }
        finally {
            $stream.Dispose()
        }
        if ($zipHash -ne $sourceHash) {
            throw "ZIP content mismatch: $entryName"
        }

        $fileRecords.Add([ordered]@{
            path = $entryName
            size = $file.Length
            sha256 = $sourceHash
        })
    }
}
finally {
    $sha256.Dispose()
    $verifiedZip.Dispose()
}

$zipHash = (Get-FileHash -LiteralPath $zipPath -Algorithm SHA256).Hash
$manifest = [ordered]@{
    artifact = $zipPath
    artifact_sha256 = $zipHash
    source_module = $sourceRoot
    main_sha256 = $actualMainHash
    main_unchanged = $true
    file_count = $fileRecords.Count
    files = $fileRecords
}
$manifest | ConvertTo-Json -Depth 5 | Set-Content -LiteralPath $manifestPath -Encoding UTF8

Write-Host "Built: $zipPath"
Write-Host "ZIP SHA-256: $zipHash"
Write-Host "main SHA-256: $actualMainHash"
Write-Host "Manifest: $manifestPath"

