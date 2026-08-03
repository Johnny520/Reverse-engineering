package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderObjectFunc<T, V> extends FieldReaderObject<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderObjectFunc(String str, Type type, Class<V> cls, int i9, long j3, String str2, Locale locale, Object obj, Method method, BiConsumer<T, V> biConsumer, ObjectReader objectReader) {
        super(str, type, cls, i9, j3, str2, locale, obj, method, null, biConsumer);
        this.initReader = objectReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        Type type = this.fieldType;
        if (type == Float.class) {
            obj = TypeUtils.toFloat(obj);
        } else if (type == Double.class) {
            obj = TypeUtils.toDouble(obj);
        }
        if (obj == null && this.fieldClass == StackTraceElement[].class) {
            return;
        }
        this.function.accept(t9, obj);
    }
}
