package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterStringMethod<T> extends FieldWriter<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterStringMethod(String str, int i9, String str2, String str3, long j3, Field field, Method method) {
        super(str, i9, j3, str2, str3, String.class, String.class, field, method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(Object obj) {
        try {
            return this.method.invoke(obj, null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e6) {
            C0086a.m456o("invoke getter method error, ", this.fieldName, e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        try {
            String strTrim = (String) getFieldValue(t9);
            long features = this.features | jSONWriter.getFeatures();
            if (strTrim == null) {
                if (((JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask) & features) == 0) {
                    return false;
                }
            } else if (this.trim) {
                strTrim = strTrim.trim();
            }
            if (strTrim != null && strTrim.isEmpty() && (features & JSONWriter.Feature.IgnoreEmpty.mask) != 0) {
                return false;
            }
            writeString(jSONWriter, strTrim);
            return true;
        } catch (JSONException e6) {
            if ((jSONWriter.getFeatures(this.features) | JSONWriter.Feature.IgnoreNonFieldGetter.mask) != 0) {
                return false;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        String strTrim = (String) getFieldValue(t9);
        if (this.trim && strTrim != null) {
            strTrim = strTrim.trim();
        }
        if (this.symbol && jSONWriter.jsonb) {
            jSONWriter.writeSymbol(strTrim);
        } else if (this.raw) {
            jSONWriter.writeRaw(strTrim);
        } else {
            jSONWriter.writeString(strTrim);
        }
    }
}
