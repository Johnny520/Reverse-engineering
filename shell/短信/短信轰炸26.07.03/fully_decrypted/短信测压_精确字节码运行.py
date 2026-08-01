# -*- coding: utf-8 -*-
import marshal, pathlib
pyc = pathlib.Path(__file__).with_name("decrypted_sms") / "layer6.pyc"
code = marshal.loads(pyc.read_bytes()[16:])
exec(code, {"__name__": "__main__", "__file__": str(pyc)})
