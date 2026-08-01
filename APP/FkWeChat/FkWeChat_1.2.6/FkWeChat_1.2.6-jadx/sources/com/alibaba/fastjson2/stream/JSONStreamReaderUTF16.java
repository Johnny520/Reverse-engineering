package com.alibaba.fastjson2.stream;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderAdapter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class JSONStreamReaderUTF16<T> extends JSONStreamReader<T> {
    char[] buf;
    final JSONReader.Context context;
    final Reader input;

    public JSONStreamReaderUTF16(Reader reader, ObjectReaderAdapter objectReaderAdapter) {
        super(objectReaderAdapter);
        this.input = reader;
        this.context = JSONFactory.createReadContext();
    }

    @Override // com.alibaba.fastjson2.stream.StreamReader
    public <T> T readLineObject() {
        Type[] typeArr;
        try {
            if (this.inputEnd) {
                return null;
            }
            if (this.input == null && this.off >= this.end) {
                return null;
            }
            if (!seekLine()) {
                return null;
            }
            char[] cArr = this.buf;
            int i10 = this.lineStart;
            JSONReader jSONReaderM6241of = JSONReader.m6241of(cArr, i10, this.lineEnd - i10, this.context);
            ObjectReaderAdapter objectReaderAdapter = this.objectReader;
            return objectReaderAdapter != null ? objectReaderAdapter.readObject(jSONReaderM6241of, null, null, this.features) : (!jSONReaderM6241of.isArray() || (typeArr = this.types) == null || typeArr.length == 0) ? (T) jSONReaderM6241of.readAny() : (T) jSONReaderM6241of.readList(typeArr);
        } catch (IOException e10) {
            C1565a.m6255a("seekLine error", e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // com.alibaba.fastjson2.stream.StreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean seekLine() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.stream.JSONStreamReaderUTF16.seekLine():boolean");
    }

    public JSONStreamReaderUTF16(Reader reader, Type[] typeArr) {
        super(typeArr);
        this.input = reader;
        this.context = JSONFactory.createReadContext();
    }
}
