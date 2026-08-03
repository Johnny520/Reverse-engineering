package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.Locale;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt64Method<T> extends FieldReaderObject<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderInt64Method(String str, int i9, long j3, String str2, Locale locale, Long l10, Method method) {
        super(str, Long.class, Long.class, i9, j3, str2, locale, l10, method, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        try {
            this.method.invoke(t9, TypeUtils.toLong(obj));
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        try {
            this.method.invoke(t9, jSONReader.readInt64());
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0255e.m1024m(new StringBuilder("set "), this.fieldName, " error", jSONReader), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValueJSONB(JSONReader jSONReader, T t9) {
        try {
            this.method.invoke(t9, jSONReader.readInt64());
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0255e.m1024m(new StringBuilder("set "), this.fieldName, " error", jSONReader), e6);
        }
    }
}
