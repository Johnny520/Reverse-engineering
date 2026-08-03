package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderNumberFunc<T, V> extends FieldReader<T> {
    final BiConsumer<T, V> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderNumberFunc(String str, Class<V> cls, int i9, long j3, String str2, Locale locale, Number number, Method method, BiConsumer<T, V> biConsumer) {
        super(str, cls, cls, i9, j3, str2, locale, number, method, null);
        this.function = biConsumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, int i9) {
        this.function.accept(t9, (V) Integer.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) throws Exception {
        Number number;
        try {
            number = jSONReader.readNumber();
        } catch (Exception e6) {
            if ((jSONReader.features(this.features) & JSONReader.Feature.NullOnError.mask) == 0) {
                throw e6;
            }
            number = null;
        }
        this.function.accept(t9, number);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        this.function.accept(t9, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, long j3) {
        this.function.accept(t9, (V) Long.valueOf(j3));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return jSONReader.readNumber();
    }
}
