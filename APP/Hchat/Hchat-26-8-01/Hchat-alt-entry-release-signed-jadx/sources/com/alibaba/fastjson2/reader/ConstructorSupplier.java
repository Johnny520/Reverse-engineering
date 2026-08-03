package com.alibaba.fastjson2.reader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.function.Supplier;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ConstructorSupplier implements Supplier {
    final Constructor constructor;
    final Class objectClass;
    final int parameterCount;
    final boolean useClassNewInstance;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ConstructorSupplier(Constructor constructor) {
        constructor.setAccessible(true);
        this.constructor = constructor;
        Class declaringClass = constructor.getDeclaringClass();
        this.objectClass = declaringClass;
        int parameterCount = constructor.getParameterCount();
        this.parameterCount = parameterCount;
        this.useClassNewInstance = parameterCount == 0 && Modifier.isPublic(constructor.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Supplier
    public Object get() {
        try {
            if (this.useClassNewInstance) {
                return this.objectClass.newInstance();
            }
            int i9 = this.parameterCount;
            Constructor constructor = this.constructor;
            return i9 == 1 ? constructor.newInstance(new Object[1]) : constructor.newInstance(null);
        } catch (Throwable th2) {
            C0086a.m465x("create instance error", th2);
            return null;
        }
    }
}
