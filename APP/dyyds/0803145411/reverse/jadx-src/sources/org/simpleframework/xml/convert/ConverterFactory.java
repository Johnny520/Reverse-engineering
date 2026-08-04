package org.simpleframework.xml.convert;

import java.lang.reflect.Constructor;
import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class ConverterFactory {
    private final Cache<Converter> cache = new ConcurrentCache();

    private Constructor getConstructor(Class cls) throws NoSuchMethodException {
        Constructor declaredConstructor = cls.getDeclaredConstructor(null);
        if (!declaredConstructor.isAccessible()) {
            declaredConstructor.setAccessible(true);
        }
        return declaredConstructor;
    }

    private Converter getConverter(Class cls) throws ConvertException, NoSuchMethodException {
        Constructor constructor = getConstructor(cls);
        if (constructor != null) {
            return getConverter(cls, constructor);
        }
        throw new ConvertException("No default constructor for %s", cls);
    }

    public Converter getInstance(Convert convert) throws ConvertException {
        Class<? extends Converter> clsValue = convert.value();
        if (clsValue.isInterface()) {
            throw new ConvertException("Can not instantiate %s", clsValue);
        }
        return getInstance(clsValue);
    }

    private Converter getConverter(Class cls, Constructor constructor) {
        Converter converter = (Converter) constructor.newInstance(null);
        if (converter != null) {
            this.cache.cache(cls, converter);
        }
        return converter;
    }

    public Converter getInstance(Class cls) {
        Converter converterFetch = this.cache.fetch(cls);
        return converterFetch == null ? getConverter(cls) : converterFetch;
    }
}
