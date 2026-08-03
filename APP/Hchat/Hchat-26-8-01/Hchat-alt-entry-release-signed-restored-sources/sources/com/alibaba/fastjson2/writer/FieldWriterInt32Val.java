package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.JDKUtils;
import java.lang.reflect.Field;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterInt32Val<T> extends FieldWriterInt32<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldWriterInt32Val(String str, int i9, long j3, String str2, String str3, Field field) {
        Class cls = Integer.TYPE;
        super(str, i9, j3, str2, str3, cls, cls, field, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t9) {
        return Integer.valueOf(getFieldValueInt(t9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getFieldValueInt(T t9) {
        if (t9 == null) {
            C0086a.m450i(this.fieldName, "field.get error, ");
            return 0;
        }
        try {
            long j3 = this.fieldOffset;
            return j3 != -1 ? JDKUtils.UNSAFE.getInt(t9, j3) : this.field.getInt(t9);
        } catch (IllegalAccessException e6) {
            e = e6;
            C0086a.m456o("field.get error, ", this.fieldName, e);
            return 0;
        } catch (IllegalArgumentException e7) {
            e = e7;
            C0086a.m456o("field.get error, ", this.fieldName, e);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriterInt32, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        int fieldValueInt = getFieldValueInt(t9);
        if (fieldValueInt == 0 && jSONWriter.isEnabled(JSONWriter.Feature.NotWriteDefaultValue)) {
            return false;
        }
        writeInt32(jSONWriter, fieldValueInt);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriterInt32, com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        jSONWriter.writeInt32(getFieldValueInt(t9));
    }
}
