package org.simpleframework.xml.transform;

import java.lang.reflect.Constructor;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
class DateFactory<T extends Date> {
    private final Constructor<T> factory;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DateFactory(Class<T> cls) throws Exception {
        this(cls, Long.TYPE);
    }

    public T getInstance(Object... objArr) throws Exception {
        return this.factory.newInstance(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public DateFactory(Class<T> cls, Class... clsArr) throws Exception {
        this.factory = cls.getDeclaredConstructor(clsArr);
    }
}
