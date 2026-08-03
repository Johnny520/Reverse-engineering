from pathlib import Path
root = Path.cwd()
analysis = root / 'FunBox_v2162_analysis'
url_tsv = analysis / 'URL清单.tsv'
rows = []
for line in url_tsv.read_text(encoding='utf-8-sig').splitlines()[1:]:
    parts = line.split('\t', 2)
    if len(parts) != 3:
        continue
    url, category, locations = parts
    loc_items = [x for x in locations.split('; ') if x]
    first = loc_items[0] if loc_items else '-'
    rows.append(f'| `{url}` | {category} | `{first}`（共 {len(loc_items)} 处，完整位置见 TSV） |')
table = '\n'.join(rows) if rows else '| （扫描未命中） | — | — |'
report = next(root.glob('FunBox_v2162_*说明.md'))
text = report.read_text(encoding='utf-8')
text = text.replace('{url_md}', table)
text = text.replace('Java/脚本/WebUI 静态扫描未出现 Retrofit/OkHttp 请求构造或业务 HTTP Base URL。', 'Java/脚本/WebUI 的网络关键字扫描结果位于 `FunBox_v2162_analysis/API_network_scan.txt`。')
report.write_text(text, encoding='utf-8')

patterns = ['retrofit', 'okhttpclient', 'request.builder', 'newcall(', 'baseurl', 'websocket', 'wss://', 'http://', 'https://']
hits = []
for base in (root / 'FunBox_v2162_readable' / 'sources', root / 'FunBox_v2162_apktool' / 'unknown' / 'webroot'):
    for p in base.rglob('*'):
        if not p.is_file():
            continue
        body = p.read_text(encoding='utf-8', errors='ignore').lower()
        found = [pat for pat in patterns if pat in body]
        if found:
            hits.append((p.relative_to(root).as_posix(), found))
out = analysis / 'API_network_scan.txt'
with out.open('w', encoding='utf-8') as f:
    f.write('扫描范围：可读 Java 源码与 WebUI 脚本\n')
    f.write('关键词：' + ', '.join(patterns) + '\n\n')
    if hits:
        for path, found in hits:
            f.write(path + '\t命中：' + ', '.join(found) + '\n')
    else:
        f.write('未命中 Retrofit、OkHttpClient、Request.Builder、newCall、BaseUrl、WebSocket 或 HTTP(S) 业务请求构造。\n')
print(f'report={report.name}; urls={len(rows)}; api_hits={len(hits)}')
