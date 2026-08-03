package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterListMethod<T> extends FieldWriterList<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterListMethod(String str, Type type, int i9, long j3, String str2, String str3, Field field, Method method, Type type2, Class cls, Class<?> cls2) {
        super(str, type, i9, j3, str2, str3, type2, cls, field, method, cls2);
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
            List<String> list = TypeUtils.toList(getFieldValue(t9));
            long features = this.features | jSONWriter.getFeatures();
            if (list == null) {
                if (((JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask) & features) == 0) {
                    return false;
                }
                writeFieldName(jSONWriter);
                jSONWriter.writeArrayNull(features);
                return true;
            }
            if ((JSONWriter.Feature.NotWriteEmptyArray.mask & features) != 0 && list.isEmpty()) {
                return false;
            }
            String path = jSONWriter.setPath(this, list);
            if (path != null) {
                writeFieldName(jSONWriter);
                jSONWriter.writeReference(path);
                jSONWriter.popPath(list);
                return true;
            }
            if (this.itemType == String.class) {
                writeListStr(jSONWriter, true, list);
            } else {
                writeList(jSONWriter, true, list);
            }
            if ((features & JSONWriter.Feature.ReferenceDetection.mask) != 0) {
                jSONWriter.popPath(list);
            }
            return true;
        } catch (JSONException e6) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        List list = TypeUtils.toList(getFieldValue(t9));
        if (list == null) {
            jSONWriter.writeNull();
        } else {
            writeList(jSONWriter, false, list);
        }
    }
}
