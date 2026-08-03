package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBigDecimalField<T> extends FieldWriter<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterBigDecimalField(String str, int i9, long j3, String str2, String str3, Field field) {
        super(str, i9, j3, str2, str3, BigDecimal.class, BigDecimal.class, field, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        BigDecimal bigDecimal = (BigDecimal) getFieldValue(t9);
        if (bigDecimal == null) {
            return writeFloatNull(jSONWriter);
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeDecimal(bigDecimal, this.features, this.decimalFormat);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        jSONWriter.writeDecimal((BigDecimal) getFieldValue(t9), this.features, this.decimalFormat);
    }
}
