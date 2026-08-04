package org.simpleframework.xml.convert;

import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class RegistryBinder {
    private final Cache<Class> cache = new ConcurrentCache();
    private final ConverterFactory factory = new ConverterFactory();

    private Converter create(Class cls) {
        return this.factory.getInstance(cls);
    }

    public void bind(Class cls, Class cls2) {
        this.cache.cache(cls, cls2);
    }

    public Converter lookup(Class cls) {
        Class clsFetch = this.cache.fetch(cls);
        if (clsFetch != null) {
            return create(clsFetch);
        }
        return null;
    }
}
