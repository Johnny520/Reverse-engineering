package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterCharMethod<T> extends FieldWriter<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterCharMethod(String str, int i9, long j3, String str2, String str3, Field field, Method method, Class cls) {
        super(str, i9, j3, str2, str3, cls, cls, field, method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t9) {
        try {
            return this.method.invoke(t9, null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e6) {
            C0086a.m456o("invoke getter method error, ", this.fieldName, e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        Character ch2 = (Character) getFieldValue(t9);
        if (ch2 != null) {
            writeFieldName(jSONWriter);
            jSONWriter.writeChar(ch2.charValue());
            return true;
        }
        long features = jSONWriter.context.getFeatures() | this.features;
        long j3 = JSONWriter.Feature.WriteNulls.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.NullAsDefaultValue;
        if (((j3 | feature.mask) & features) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        if ((features & feature.mask) != 0) {
            jSONWriter.writeChar((char) 0);
        } else {
            jSONWriter.writeNull();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        Character ch2 = (Character) getFieldValue(t9);
        if (ch2 == null) {
            jSONWriter.writeNull();
        } else {
            jSONWriter.writeChar(ch2.charValue());
        }
    }
}
