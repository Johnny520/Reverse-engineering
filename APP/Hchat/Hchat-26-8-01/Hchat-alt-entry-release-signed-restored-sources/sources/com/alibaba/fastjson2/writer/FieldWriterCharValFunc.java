package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.function.ToCharFunction;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterCharValFunc extends FieldWriter {
    final ToCharFunction function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldWriterCharValFunc(String str, int i9, long j3, String str2, String str3, Method method, ToCharFunction toCharFunction) {
        Class cls = Character.TYPE;
        super(str, i9, j3, str2, str3, cls, cls, null, method);
        this.function = toCharFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(Object obj) {
        return Character.valueOf(this.function.applyAsChar(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, Object obj) {
        char cApplyAsChar = this.function.applyAsChar(obj);
        writeFieldName(jSONWriter);
        jSONWriter.writeChar(cApplyAsChar);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, Object obj) {
        jSONWriter.writeChar(this.function.applyAsChar(obj));
    }
}
