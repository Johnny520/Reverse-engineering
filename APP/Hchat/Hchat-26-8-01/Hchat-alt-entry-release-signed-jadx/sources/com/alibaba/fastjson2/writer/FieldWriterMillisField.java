package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.JDKUtils;
import java.lang.reflect.Field;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterMillisField<T> extends FieldWriterDate<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldWriterMillisField(String str, int i9, long j3, String str2, String str3, Field field) {
        Class cls = Long.TYPE;
        super(str, i9, j3, str2, str3, cls, cls, field, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getFieldLong(T t9) {
        if (t9 == null) {
            C0086a.m450i(this.fieldName, "field.get error, ");
            return 0L;
        }
        try {
            long j3 = this.fieldOffset;
            return j3 != -1 ? JDKUtils.UNSAFE.getLong(t9, j3) : this.field.getLong(t9);
        } catch (IllegalAccessException e6) {
            e = e6;
            C0086a.m456o("field.get error, ", this.fieldName, e);
            return 0L;
        } catch (IllegalArgumentException e7) {
            e = e7;
            C0086a.m456o("field.get error, ", this.fieldName, e);
            return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t9) {
        return Long.valueOf(getFieldLong(t9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        writeDate(jSONWriter, getFieldLong(t9));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        writeDate(jSONWriter, false, getFieldLong(t9));
    }
}
