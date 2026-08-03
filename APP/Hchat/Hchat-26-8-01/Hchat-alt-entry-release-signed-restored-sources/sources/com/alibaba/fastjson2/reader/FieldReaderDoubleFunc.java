package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderDoubleFunc<T> extends FieldReader<T> {
    final BiConsumer<T, Double> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderDoubleFunc(String str, Class cls, int i9, long j3, String str2, Locale locale, Double d10, Method method, BiConsumer<T, Double> biConsumer) {
        super(str, cls, cls, i9, j3, str2, locale, d10, method, null);
        this.function = biConsumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        this.function.accept(t9, TypeUtils.toDouble(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) throws Exception {
        Double d10;
        try {
            d10 = jSONReader.readDouble();
        } catch (Exception e6) {
            if ((jSONReader.features(this.features) & JSONReader.Feature.NullOnError.mask) == 0) {
                throw e6;
            }
            d10 = null;
        }
        this.function.accept(t9, d10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return jSONReader.readDouble();
    }
}
