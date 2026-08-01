package com.google.protobuf;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰子世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3633 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11280;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11281;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11282;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11283;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11284;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11285;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11286;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11287;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11288;

    public C3633(Class cls, Class cls2, String str) {
        this.f11285 = GeneratedMessage.getMethodOrDie(cls, AbstractC0053.m156("get", str, "List"), new Class[0]);
        this.f11284 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m156("get", str, "List"), new Class[0]);
        String strM152 = AbstractC0053.m152("get", str);
        Class cls3 = Integer.TYPE;
        java.lang.reflect.Method methodOrDie = GeneratedMessage.getMethodOrDie(cls, strM152, cls3);
        this.f11283 = methodOrDie;
        this.f11282 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m152("get", str), cls3);
        Class<?> returnType = methodOrDie.getReturnType();
        this.f11281 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m152("set", str), cls3, returnType);
        this.f11280 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m152("add", str), returnType);
        this.f11287 = GeneratedMessage.getMethodOrDie(cls, AbstractC0053.m156("get", str, "Count"), new Class[0]);
        this.f11286 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m156("get", str, "Count"), new Class[0]);
        this.f11288 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m152("clear", str), new Class[0]);
    }
}
