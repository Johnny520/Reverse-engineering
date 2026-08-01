$ErrorActionPreference = 'Stop'

$workspace = [IO.Path]::GetFullPath((Join-Path $PSScriptRoot '..'))
$sourcePath = Get-ChildItem -LiteralPath $workspace -Directory | ForEach-Object {
    Join-Path $_.FullName 'webroot\index.html'
} | Where-Object { Test-Path -LiteralPath $_ } | Select-Object -First 1
if (-not $sourcePath) {
    throw 'Source webroot/index.html was not found.'
}
$outputPath = Join-Path $PSScriptRoot 'webroot.decoded.html'
$wrapper = [IO.File]::ReadAllText($sourcePath, [Text.Encoding]::UTF8)
$match = [regex]::Match($wrapper, 'var _k="([^"]+)",_rk="([^"]+)",_e="([^"]+)"')
if (-not $match.Success) {
    throw 'Encrypted payload declaration was not found.'
}

$rc4Key = [Text.Encoding]::ASCII.GetBytes($match.Groups[1].Value)
$xorKey = [Text.Encoding]::ASCII.GetBytes($match.Groups[2].Value)
$stage1 = [Convert]::FromBase64String($match.Groups[3].Value)
$stage2 = [byte[]]::new($stage1.Length)
for ($i = 0; $i -lt $stage1.Length; $i++) {
    $stage2[$i] = $stage1[$i] -bxor $xorKey[$i % $xorKey.Length]
}

$s = [int[]](0..255)
$j = 0
for ($i = 0; $i -lt 256; $i++) {
    $j = ($j + $s[$i] + $rc4Key[$i % $rc4Key.Length]) % 256
    $tmp = $s[$i]; $s[$i] = $s[$j]; $s[$j] = $tmp
}

$stage3 = [byte[]]::new($stage2.Length)
$a = 0
$b = 0
for ($n = 0; $n -lt $stage2.Length; $n++) {
    $a = ($a + 1) % 256
    $b = ($b + $s[$a]) % 256
    $tmp = $s[$a]; $s[$a] = $s[$b]; $s[$b] = $tmp
    $keystreamByte = $s[($s[$a] + $s[$b]) % 256]
    $stage3[$n] = $stage2[$n] -bxor $keystreamByte
}

$stage4 = [Convert]::FromBase64String([Text.Encoding]::ASCII.GetString($stage3))
$input = [IO.MemoryStream]::new($stage4, $false)
$gzip = [IO.Compression.GZipStream]::new($input, [IO.Compression.CompressionMode]::Decompress)
$output = [IO.MemoryStream]::new()
$gzip.CopyTo($output)
$gzip.Dispose()
$input.Dispose()
[IO.File]::WriteAllBytes($outputPath, $output.ToArray())
$output.Dispose()

$decoded = Get-Item -LiteralPath $outputPath
$hash = Get-FileHash -LiteralPath $outputPath -Algorithm SHA256
[PSCustomObject]@{
    Output = $decoded.FullName
    Bytes = $decoded.Length
    SHA256 = $hash.Hash
    GzipMagic = ('{0:X2}{1:X2}' -f $stage4[0], $stage4[1])
}
