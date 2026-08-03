package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.JDKUtils;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderStringField<T> extends FieldReader<T> {
    final boolean emptyToNull;
    final long fieldOffset;
    final boolean trim;
    final boolean upper;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderStringField(String str, Class cls, int i9, long j3, String str2, String str3, Field field) {
        super(str, cls, cls, i9, j3, str2, null, str3, null, field);
        this.trim = "trim".equals(str2) || (j3 & JSONReader.Feature.TrimString.mask) != 0;
        this.upper = "upper".equals(str2);
        this.fieldOffset = JDKUtils.UNSAFE.objectFieldOffset(field);
        this.emptyToNull = (j3 & JSONReader.Feature.EmptyStringAsNull.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        String string = (obj == null || (obj instanceof String)) ? (String) obj : obj.toString();
        if (string != null) {
            if (this.trim) {
                string = string.trim();
            }
            if (this.upper) {
                string = string.toUpperCase();
            }
            if (this.emptyToNull && string.isEmpty()) {
                string = null;
            }
        }
        JDKUtils.UNSAFE.putObject(t9, this.fieldOffset, string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        String string = jSONReader.readString();
        if (string != null) {
            if (this.trim) {
                string = string.trim();
            }
            if (this.upper) {
                string = string.toUpperCase();
            }
            if (this.emptyToNull && string.isEmpty()) {
                string = null;
            }
        }
        JDKUtils.UNSAFE.putObject(t9, this.fieldOffset, string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValueJSONB(JSONReader jSONReader, T t9) {
        String string = jSONReader.readString();
        if (string != null) {
            if (this.trim) {
                string = string.trim();
            }
            if (this.upper) {
                string = string.toUpperCase();
            }
            if (this.emptyToNull && string.isEmpty()) {
                string = null;
            }
        }
        accept(t9, (this.emptyToNull && string != null && string.isEmpty()) ? null : string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(Class cls) {
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public String readFieldValue(JSONReader jSONReader) {
        String string = jSONReader.readString();
        if (this.trim && string != null) {
            string = string.trim();
        }
        if (this.emptyToNull && string != null && string.isEmpty()) {
            return null;
        }
        return string;
    }
}
