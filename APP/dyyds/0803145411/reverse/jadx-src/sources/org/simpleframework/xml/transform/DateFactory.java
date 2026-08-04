package org.simpleframework.xml.transform;

import java.lang.reflect.Constructor;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class DateFactory<T extends Date> {
    private final Constructor<T> factory;

    public DateFactory(Class<T> cls) {
        this(cls, Long.TYPE);
    }

    public T getInstance(Object... objArr) {
        return this.factory.newInstance(objArr);
    }

    public DateFactory(Class<T> cls, Class... clsArr) {
        this.factory = cls.getDeclaredConstructor(clsArr);
    }
}
