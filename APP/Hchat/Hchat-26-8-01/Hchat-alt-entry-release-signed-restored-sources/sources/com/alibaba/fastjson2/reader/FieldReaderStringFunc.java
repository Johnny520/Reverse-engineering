package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.function.BiConsumer;
import p012ah.C0086a;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderStringFunc<T, V> extends FieldReader<T> {
    final String format;
    final BiConsumer<T, V> function;
    final boolean trim;
    final boolean upper;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderStringFunc(String str, Class<V> cls, int i9, long j3, String str2, Locale locale, Object obj, Method method, BiConsumer<T, V> biConsumer) {
        super(str, cls, cls, i9, j3, str2, locale, obj, method, null);
        this.function = biConsumer;
        this.format = str2;
        this.trim = "trim".equals(str2) || (j3 & JSONReader.Feature.TrimString.mask) != 0;
        this.upper = "upper".equals(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
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
            this.function.accept(t9, string);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), super.toString(), " error"), e6);
        }
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
        }
        this.function.accept(t9, string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(Class cls) {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return jSONReader.readString();
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, long j3) {
        accept(t9, Long.toString(j3));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, int i9) {
        accept(t9, Integer.toString(i9));
    }
}
