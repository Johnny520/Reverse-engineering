package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderStringMethod<T> extends FieldReaderObject<T> {
    final boolean trim;
    final boolean upper;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderStringMethod(String str, Type type, Class cls, int i9, long j3, String str2, Locale locale, String str3, Method method) {
        super(str, type, cls, i9, j3, str2, locale, str3, method, null, null);
        this.trim = "trim".equals(str2) || (j3 & JSONReader.Feature.TrimString.mask) != 0;
        this.upper = "upper".equals(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        String string = ((obj instanceof String) || obj == null) ? (String) obj : obj.toString();
        if (string != null) {
            if (this.trim) {
                string = string.trim();
            }
            if (this.upper) {
                string = string.toUpperCase();
            }
        }
        try {
            this.method.invoke(t9, string);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        String string = jSONReader.readString();
        if (string != null) {
            if (this.trim) {
                string = string.trim();
            }
            if (this.upper) {
                string = string.toUpperCase();
            }
        }
        try {
            this.method.invoke(t9, string);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0255e.m1024m(new StringBuilder("set "), this.fieldName, " error", jSONReader), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(Class cls) {
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public String readFieldValue(JSONReader jSONReader) {
        String string = jSONReader.readString();
        if (string == null) {
            return string;
        }
        if (this.trim) {
            string = string.trim();
        }
        return this.upper ? string.toUpperCase() : string;
    }
}
