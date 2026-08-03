package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterInt32ValFunc extends FieldWriterInt32 {
    final ToIntFunction function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldWriterInt32ValFunc(String str, int i9, long j3, String str2, String str3, Method method, ToIntFunction toIntFunction) {
        Class cls = Integer.TYPE;
        super(str, i9, j3, str2, str3, cls, cls, null, method);
        this.function = toIntFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(Object obj) {
        return Integer.valueOf(this.function.applyAsInt(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriterInt32, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, Object obj) {
        try {
            writeInt32(jSONWriter, this.function.applyAsInt(obj));
            return true;
        } catch (RuntimeException e6) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriterInt32, com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, Object obj) {
        jSONWriter.writeInt32(this.function.applyAsInt(obj));
    }
}
