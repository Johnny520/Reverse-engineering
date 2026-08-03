package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import p012ah.C0086a;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderCharValueField<T> extends FieldReader<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderCharValueField(String str, int i9, long j3, String str2, Character ch2, Field field) {
        Class cls = Character.TYPE;
        super(str, cls, cls, i9, j3, str2, null, ch2, null, field);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        char cCharValue;
        if (obj instanceof String) {
            cCharValue = ((String) obj).charAt(0);
        } else {
            if (!(obj instanceof Character)) {
                C0086a.m464w("cast to char error");
                return;
            }
            cCharValue = ((Character) obj).charValue();
        }
        try {
            this.field.set(t9, Character.valueOf(cCharValue));
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        char charValue = jSONReader.readCharValue();
        if (charValue == 0 && jSONReader.wasNull()) {
            return;
        }
        accept((Object) t9, charValue);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Character.valueOf(jSONReader.readCharValue());
    }
}
