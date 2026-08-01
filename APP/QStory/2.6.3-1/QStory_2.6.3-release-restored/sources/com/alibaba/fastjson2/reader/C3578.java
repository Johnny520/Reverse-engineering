package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3578 implements Supplier {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Class f8731;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f8732;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Constructor f8733;

    public C3578(Constructor constructor) {
        constructor.setAccessible(true);
        this.f8733 = constructor;
        Class declaringClass = constructor.getDeclaringClass();
        this.f8731 = declaringClass;
        this.f8732 = constructor.getParameterCount() == 0 && Modifier.isPublic(constructor.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers());
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Constructor constructor = this.f8733;
        try {
            return this.f8732 ? this.f8731.newInstance() : constructor.getParameterCount() == 1 ? constructor.newInstance(new Object[1]) : constructor.newInstance(null);
        } catch (Throwable th) {
            C1123.m1403("create instance error", th);
            return null;
        }
    }
}
