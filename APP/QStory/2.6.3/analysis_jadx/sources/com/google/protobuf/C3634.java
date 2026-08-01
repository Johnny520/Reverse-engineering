package com.google.protobuf;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰子世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3634 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11285;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11286;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11288;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11290;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11291;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11292;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11293;

    public C3634(Class cls, Class cls2, String str) {
        this.f11290 = GeneratedMessage.getMethodOrDie(cls, AbstractC0053.m158("get", str, "List"), new Class[0]);
        this.f11289 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m158("get", str, "List"), new Class[0]);
        String strM157 = AbstractC0053.m157("get", str);
        Class cls3 = Integer.TYPE;
        java.lang.reflect.Method methodOrDie = GeneratedMessage.getMethodOrDie(cls, strM157, cls3);
        this.f11288 = methodOrDie;
        this.f11287 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m157("get", str), cls3);
        Class<?> returnType = methodOrDie.getReturnType();
        this.f11286 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m157("set", str), cls3, returnType);
        this.f11285 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m157("add", str), returnType);
        this.f11292 = GeneratedMessage.getMethodOrDie(cls, AbstractC0053.m158("get", str, "Count"), new Class[0]);
        this.f11291 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m158("get", str, "Count"), new Class[0]);
        this.f11293 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m157("clear", str), new Class[0]);
    }
}
