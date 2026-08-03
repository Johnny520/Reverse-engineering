package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import p012ah.C0086a;
import p025bc.AbstractC0255e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt32ValueArrayFinalField<T> extends FieldReaderObjectField<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderInt32ValueArrayFinalField(String str, Class cls, int i9, long j3, String str2, int[] iArr, Field field) {
        super(str, cls, cls, i9, j3, str2, iArr, field);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        if (jSONReader.readIfNull()) {
            return;
        }
        try {
            int[] iArr = (int[]) this.field.get(t9);
            if (jSONReader.nextIfArrayStart()) {
                int i9 = 0;
                while (!jSONReader.nextIfArrayEnd()) {
                    int int32Value = jSONReader.readInt32Value();
                    if (iArr != null && i9 < iArr.length) {
                        iArr[i9] = int32Value;
                    }
                    i9++;
                }
            }
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0255e.m1024m(new StringBuilder("set "), this.fieldName, " error", jSONReader), e6);
        }
    }
}
