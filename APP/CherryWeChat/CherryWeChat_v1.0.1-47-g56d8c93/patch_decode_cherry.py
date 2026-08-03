from pathlib import Path
p=Path('decode_cherry_strings.py')
s=p.read_text(encoding='utf-8')
s=s.replace("for p in SRC.rglob('*.java'):", "for p in [SRC / 'io' / 'github' / 'cherrywechat' / 'HookEntry.java']:")
p.write_text(s,encoding='utf-8')
