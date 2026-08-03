from pathlib import Path
p=Path('decode_cherry_strings.py')
s=p.read_text(encoding='utf-8')
s=s.replace("rows.append({'constant':value,'decoded':decoded,'occurrences':len(paths),'first_path':paths[0]})", "decoded = decoded.encode('utf-8', 'backslashreplace').decode('utf-8')\n        rows.append({'constant':value,'decoded':decoded,'occurrences':len(paths),'first_path':paths[0]})")
p.write_text(s,encoding='utf-8')
