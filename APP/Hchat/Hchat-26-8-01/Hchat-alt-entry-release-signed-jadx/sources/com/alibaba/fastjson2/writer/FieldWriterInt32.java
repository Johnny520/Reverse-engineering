package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterInt32<T> extends FieldWriter<T> {
    final boolean toString;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterInt32(String str, int i9, long j3, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i9, j3, str2, str3, type, cls, field, method);
        this.toString = (j3 & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0 || "string".equals(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        return cls == this.fieldClass ? ObjectWriterImplInt32.INSTANCE : jSONWriter.getObjectWriter(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        try {
            Integer num = (Integer) getFieldValue(t9);
            if (num == null) {
                return writeIntNull(jSONWriter);
            }
            writeInt32(jSONWriter, num.intValue());
            return true;
        } catch (RuntimeException e6) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeInt32(JSONWriter jSONWriter, int i9) {
        if (this.toString) {
            writeFieldName(jSONWriter);
            jSONWriter.writeString(Integer.toString(i9));
            return;
        }
        writeFieldName(jSONWriter);
        String str = this.format;
        if (str != null) {
            jSONWriter.writeInt32(i9, str);
        } else {
            jSONWriter.writeInt32(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        Integer num = (Integer) getFieldValue(t9);
        if (num == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeInt32(num);
        }
    }
}
