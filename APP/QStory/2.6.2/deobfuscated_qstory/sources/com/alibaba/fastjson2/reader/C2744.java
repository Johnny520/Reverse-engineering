package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2744 implements Supplier {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Class f8384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f8385;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Constructor f8386;

    public C2744(Constructor constructor) {
        constructor.setAccessible(true);
        this.f8386 = constructor;
        Class declaringClass = constructor.getDeclaringClass();
        this.f8384 = declaringClass;
        this.f8385 = constructor.getParameterCount() == 0 && Modifier.isPublic(constructor.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers());
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Constructor constructor = this.f8386;
        try {
            return this.f8385 ? this.f8384.newInstance() : constructor.getParameterCount() == 1 ? constructor.newInstance(new Object[1]) : constructor.newInstance(null);
        } catch (Throwable th) {
            C0276.m842("create instance error", th);
            return null;
        }
    }
}
