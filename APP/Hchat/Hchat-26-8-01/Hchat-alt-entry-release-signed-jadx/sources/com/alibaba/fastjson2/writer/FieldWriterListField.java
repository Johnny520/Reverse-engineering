package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterListField<T> extends FieldWriterList<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterListField(String str, Type type, int i9, long j3, String str2, String str3, Type type2, Class cls, Field field, Class<?> cls2) {
        super(str, type, i9, j3, str2, str3, type2, cls, field, null, cls2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        List<String> list = (List) getFieldValue(t9);
        JSONWriter.Context context = jSONWriter.context;
        if (list == null) {
            long features = this.features | context.getFeatures();
            if (((JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask) & features) == 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            jSONWriter.writeArrayNull(features);
            return true;
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
        jSONWriter.popPath(list);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        String path;
        List list = (List) getFieldValue(t9);
        if (list == null) {
            jSONWriter.writeNull();
            return;
        }
        boolean zIsRefDetect = jSONWriter.isRefDetect();
        if (zIsRefDetect && (path = jSONWriter.setPath(this.fieldName, list)) != null) {
            jSONWriter.writeReference(path);
            jSONWriter.popPath(list);
        } else {
            writeList(jSONWriter, false, list);
            if (zIsRefDetect) {
                jSONWriter.popPath(list);
            }
        }
    }
}
