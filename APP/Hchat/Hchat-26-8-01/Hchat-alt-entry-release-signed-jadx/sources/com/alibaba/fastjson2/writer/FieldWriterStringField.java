package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterStringField<T> extends FieldWriter<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterStringField(String str, int i9, long j3, String str2, String str3, Field field) {
        super(str, i9, j3, str2, str3, String.class, String.class, field, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        String strTrim = (String) getFieldValue(t9);
        long features = this.features | jSONWriter.getFeatures();
        if (strTrim == null) {
            long j3 = JSONWriter.Feature.WriteNulls.mask;
            long j4 = JSONWriter.Feature.NullAsDefaultValue.mask;
            long j5 = JSONWriter.Feature.WriteNullStringAsEmpty.mask;
            if (((j3 | j4 | j5) & features) == 0 || (JSONWriter.Feature.NotWriteDefaultValue.mask & features) != 0) {
                return false;
            }
            if (((j4 | j5) & features) != 0) {
                writeFieldName(jSONWriter);
                jSONWriter.writeString(HttpUrl.FRAGMENT_ENCODE_SET);
                return true;
            }
        } else if (this.trim) {
            strTrim = strTrim.trim();
        }
        if (strTrim != null && strTrim.isEmpty() && (features & JSONWriter.Feature.IgnoreEmpty.mask) != 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        if (this.symbol && jSONWriter.jsonb) {
            jSONWriter.writeSymbol(strTrim);
        } else if (this.raw) {
            jSONWriter.writeRaw(strTrim);
        } else {
            jSONWriter.writeString(strTrim);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        String strTrim = (String) getFieldValue(t9);
        if (strTrim == null) {
            jSONWriter.writeNull();
            return;
        }
        if (this.trim) {
            strTrim = strTrim.trim();
        }
        if (this.raw) {
            jSONWriter.writeRaw(strTrim);
        } else {
            jSONWriter.writeString(strTrim);
        }
    }
}
