param(
    [string]$Root = (Get-Location).Path
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

Add-Type -TypeDefinition @'
using System;
public static class XhsStringDecoder {
  static short S(int x) { return unchecked((short)x); }
  static int Ushr(int x, int n) { return unchecked((int)((uint)x >> n)); }
  public static ulong M1006(ulong input) {
    short a=unchecked((short)(input&0xffff));
    short b=unchecked((short)((input>>16)&0xffff));
    short c=S(a+b);
    c=S((c<<9)|Ushr(c,23));
    c=S(c+a);
    b=S(b^a);
    short d=S((a<<13)|Ushr(a,19));
    d=S(d^b);
    d=S(d^(b<<5));
    b=S((b<<10)|Ushr(b,22));
    long upper=((long)c)<<16;
    long middle=unchecked((long)((ulong)upper | (ulong)(long)b));
    middle=unchecked(middle<<16);
    long result=unchecked((long)((ulong)middle | (ulong)(long)d));
    return unchecked((ulong)result);
  }
  public static string Decode(long input,string[] pool) {
    unchecked {
      ulong raw=(ulong)input;
      ulong x=raw&0xffffffffUL;
      x^=x>>33;
      x*=7109453100751455733UL;
      x^=x>>28;
      x*=14638054099313767859UL;
      x=M1006(x>>32);
      ulong mix=(x>>32)&0xffffUL;
      x=M1006(x);
      mix^=(x>>16)&0xffffffffffff0000UL;
      int pos=(int)((raw>>32)^mix);
      x=M1006(x);
      x^=((ulong)pool[pos/8191][pos%8191])<<32;
      int count=(int)((x>>32)&0xffffUL);
      char[] output=new char[count];
      for(int i=0;i<count;i++) {
        int p=pos+i+1;
        x=M1006(x);
        x^=((ulong)pool[p/8191][p%8191])<<32;
        output[i]=(char)((x>>32)&0xffffUL);
      }
      return new string(output);
    }
  }
}
'@

$sourceRoot = Join-Path $Root 'XHS_260731175346-decompiled\sources'
$restoredRoot = Join-Path $Root 'XHS_260731175346-restored-sources'
$decoderPath = Join-Path $sourceRoot 'xhss\AbstractC0775.java'
$decoderText = [IO.File]::ReadAllText($decoderPath)
$poolRegex = [regex]'(?s)r1 = (?<i>\d+).*?java\.lang\.String r2 = "(?<s>(?:\\.|[^"\\])*)".*?r0\[r1\] = r2'
$pool = New-Object string[] 11
foreach ($match in $poolRegex.Matches($decoderText)) {
    $raw = $match.Groups['s'].Value
    $decoded = [regex]::Replace($raw, '\\u([0-9a-fA-F]{4})', { param($m) [char]([Convert]::ToInt32($m.Groups[1].Value, 16)) })
    $pool[[int]$match.Groups['i'].Value] = $decoded
}
if (@($pool | Where-Object { $null -eq $_ }).Count -ne 0) { throw '字符串池提取数量不足' }

function ConvertTo-JavaLiteral([string]$value) {
    $sb = New-Object Text.StringBuilder
    [void]$sb.Append('"')
    foreach ($ch in $value.ToCharArray()) {
        switch ([int][char]$ch) {
            8 { [void]$sb.Append('\\b'); continue }
            9 { [void]$sb.Append('\\t'); continue }
            10 { [void]$sb.Append('\\n'); continue }
            12 { [void]$sb.Append('\\f'); continue }
            13 { [void]$sb.Append('\\r'); continue }
            34 { [void]$sb.Append('\\"'); continue }
            92 { [void]$sb.Append('\\\\'); continue }
            default {
                if ([int][char]$ch -lt 32) { [void]$sb.Append(('\\u{0:X4}' -f [int][char]$ch)) }
                else { [void]$sb.Append($ch) }
            }
        }
    }
    [void]$sb.Append('"')
    return $sb.ToString()
}

if (Test-Path $restoredRoot) { Remove-Item -LiteralPath $restoredRoot -Recurse -Force }
Copy-Item -LiteralPath $sourceRoot -Destination $restoredRoot -Recurse

$directPattern = [regex]'(?<call>(?:xhss\.)?AbstractC0775\.m1313\(\s*(?<arg>-?\d+)(?:L)?\s*\))'
$variablePattern = [regex]'(?<call>(?:xhss\.)?AbstractC0775\.m1313\(\s*(?<arg>r\d+)\s*\))'
$literalAssignPattern = [regex]'(?<var>r\d+)\s*=\s*(?<num>-?\d+)(?:L)?(?:\s*;)?'
$unresolved = New-Object System.Collections.Generic.List[string]
$replaced = 0
$removedStatements = 0
$utf8NoBom = New-Object Text.UTF8Encoding($false)

foreach ($file in Get-ChildItem -LiteralPath $restoredRoot -Recurse -Filter '*.java') {
    $lines = [IO.File]::ReadAllLines($file.FullName)
    $known = @{}
    $out = New-Object System.Collections.Generic.List[string]
    foreach ($line in $lines) {
        if ($line -match '^\s*(?:public|private|protected|static|final)\b.*\(') { $known.Clear() }
        foreach ($a in [regex]::Matches($line, '(?<var>r\d+)\s*=\s*(?<num>-?\d+)')) {
            $known[$a.Groups['var'].Value] = [int64]$a.Groups['num'].Value
        }
        if ($line -notmatch 'AbstractC0775\.m1313\(') {
            foreach ($a in [regex]::Matches($line, '(?<var>r\d+)\s*=\s*')) {
                $tail = $line.Substring($a.Index + $a.Length)
                if ($tail -notmatch '^-?\d') { [void]$known.Remove($a.Groups['var'].Value) }
            }
        }
        $newLine = $line
        foreach ($m in $directPattern.Matches($line)) {
            $value = [XhsStringDecoder]::Decode([int64]$m.Groups['arg'].Value, $pool)
            $newLine = $newLine.Replace($m.Groups['call'].Value, (ConvertTo-JavaLiteral $value))
            $replaced++
        }
        foreach ($m in $variablePattern.Matches($line)) {
            $var = $m.Groups['arg'].Value
            if ($known.ContainsKey($var)) {
                try {
                    $value = [XhsStringDecoder]::Decode($known[$var], $pool)
                    $newLine = $newLine.Replace($m.Groups['call'].Value, (ConvertTo-JavaLiteral $value))
                    $replaced++
                } catch {
                    [void]$unresolved.Add("$($file.FullName):${var}:$($known[$var])")
                }
            } else {
                [void]$unresolved.Add("$($file.FullName):$var")
            }
        }
        if ($newLine.Trim() -match '^"(?:[^"\\]|\\.)*";?\s*(?://.*)?$') {
            $newLine = $newLine -replace '^\s*"(?:[^"\\]|\\.)*";?\s*', '        /* removed unused decoded string */ '
            $removedStatements++
        }
        $out.Add($newLine)
    }
    [IO.File]::WriteAllLines($file.FullName, $out, $utf8NoBom)
}

$restoredDecoder = Join-Path $restoredRoot 'xhss\AbstractC0775.java'
$decoderLines = [IO.File]::ReadAllLines($restoredDecoder)
$decoderLines = $decoderLines | Where-Object { $_ -notmatch 'm1313\(|f2556|m1006\(' }
[IO.File]::WriteAllLines($restoredDecoder, $decoderLines, $utf8NoBom)

$urlFiles = New-Object System.Collections.Generic.List[string]
$urlRegex = [regex]'https?://[^"''\s<>()\\]+'
foreach ($file in Get-ChildItem -LiteralPath $restoredRoot -Recurse -File) {
    $text = [IO.File]::ReadAllText($file.FullName)
    foreach ($match in $urlRegex.Matches($text)) { [void]$urlFiles.Add("$($file.FullName)`t$($match.Value)") }
}
$urlFiles | Sort-Object -Unique | Set-Content -LiteralPath (Join-Path $Root 'XHS_260731175346-urls.tsv') -Encoding utf8
$unresolved | Sort-Object -Unique | Set-Content -LiteralPath (Join-Path $Root 'XHS_260731175346-unresolved-m1313.tsv') -Encoding utf8

$report = Join-Path $Root 'XHS_260731175346-report.md'
$sha = (Get-FileHash (Join-Path $Root 'XHS_260731175346.apk') -Algorithm SHA256).Hash
$javaCount = (Get-ChildItem -LiteralPath $restoredRoot -Recurse -Filter '*.java' | Measure-Object).Count
$smaliCount = (Get-ChildItem -LiteralPath (Join-Path $Root 'XHS_260731175346-apktool-full') -Recurse -Filter '*.smali' | Measure-Object).Count
$urlCount = ($urlFiles | Sort-Object -Unique | Measure-Object).Count
$reportText = @"
# XHS_260731175346 APK static recovery report

- Original APK is preserved unchanged.
- JADX output: XHS_260731175346-decompiled/
- Apktool output: XHS_260731175346-apktool-full/
- Restored sources: XHS_260731175346-restored-sources/
- URL inventory: XHS_260731175346-urls.tsv
- SHA-256: $sha
- Restored Java files: $javaCount
- Smali files: $smaliCount
- Static URL entries: $urlCount
- Replaced decoder calls: $replaced
- Removed unused decoder statements: $removedStatements

The string pool decoder is xhss.AbstractC0775.m1313(long), backed by xhss.AbstractC0561.m1006(long). The restored copy replaces statically resolvable calls with literals and removes the decoder implementation from the copy.

Confirmed crypto names: PBKDF2WithHmacSHA256, GZIPOutputStream, AES/CBC/PKCS5Padding, AES. The routine also XORs ciphertext with the derived key, reverses bytes, and emits unpadded Base64.

Native libraries remain ELF artifacts: libnative.so, libmmkv.so, libdexkit.so. Java native declarations are not original C/C++ source.

This report is static evidence. Presence of a URL string does not prove runtime access.
"@
[IO.File]::WriteAllText($report, $reportText, $utf8NoBom)

Write-Output "RESTORED=$restoredRoot"
Write-Output "REPLACED=$replaced"
Write-Output "REMOVED=$removedStatements"
Write-Output "UNRESOLVED=$($unresolved.Count)"
Write-Output "URLS=$urlCount"
