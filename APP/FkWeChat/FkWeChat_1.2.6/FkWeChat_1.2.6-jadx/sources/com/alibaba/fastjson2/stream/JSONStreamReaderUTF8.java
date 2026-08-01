package com.alibaba.fastjson2.stream;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class JSONStreamReaderUTF8<T> extends JSONStreamReader<T> {
    byte[] buf;
    final Charset charset;
    final JSONReader.Context context;
    final InputStream input;

    public JSONStreamReaderUTF8(InputStream inputStream, Charset charset, Type[] typeArr) {
        super(typeArr);
        this.charset = charset;
        this.input = inputStream;
        this.context = JSONFactory.createReadContext();
    }

    @Override // com.alibaba.fastjson2.stream.StreamReader
    public <T> T readLineObject() {
        Type[] typeArr;
        try {
            if (this.inputEnd && this.off >= this.end) {
                return null;
            }
            if (this.input == null && this.off >= this.end) {
                return null;
            }
            if (!seekLine()) {
                return null;
            }
            byte[] bArr = this.buf;
            int i10 = this.lineStart;
            JSONReader jSONReaderM6237of = JSONReader.m6237of(bArr, i10, this.lineEnd - i10, this.charset, this.context);
            ObjectReaderAdapter objectReaderAdapter = this.objectReader;
            return objectReaderAdapter != null ? objectReaderAdapter.readObject(jSONReaderM6237of, null, null, this.features) : (!jSONReaderM6237of.isArray() || (typeArr = this.types) == null || typeArr.length == 0) ? (T) jSONReaderM6237of.readAny() : (T) jSONReaderM6237of.readList(typeArr);
        } catch (IOException e10) {
            C1565a.m6255a("seekLine error", e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    @Override // com.alibaba.fastjson2.stream.StreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean seekLine() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.stream.JSONStreamReaderUTF8.seekLine():boolean");
    }

    public JSONStreamReaderUTF8(InputStream inputStream, Charset charset, ObjectReaderAdapter objectReaderAdapter) {
        super(objectReaderAdapter);
        this.charset = charset;
        this.input = inputStream;
        this.context = JSONFactory.createReadContext();
    }
}
