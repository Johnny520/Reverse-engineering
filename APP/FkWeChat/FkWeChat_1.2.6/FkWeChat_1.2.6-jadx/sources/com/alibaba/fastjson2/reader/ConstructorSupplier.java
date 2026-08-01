package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ConstructorSupplier implements Supplier {
    final Constructor constructor;
    final Class objectClass;
    final boolean useClassNewInstance;

    public ConstructorSupplier(Constructor constructor) {
        constructor.setAccessible(true);
        this.constructor = constructor;
        Class declaringClass = constructor.getDeclaringClass();
        this.objectClass = declaringClass;
        this.useClassNewInstance = constructor.getParameterCount() == 0 && Modifier.isPublic(constructor.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers());
    }

    @Override // java.util.function.Supplier
    public Object get() {
        try {
            if (this.useClassNewInstance) {
                return this.objectClass.newInstance();
            }
            int parameterCount = this.constructor.getParameterCount();
            Constructor constructor = this.constructor;
            return parameterCount == 1 ? constructor.newInstance(new Object[1]) : constructor.newInstance(null);
        } catch (Throwable th) {
            C1565a.m6255a("create instance error", th);
            return null;
        }
    }
}
