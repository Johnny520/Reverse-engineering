package com.google.protobuf;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰子世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4466 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11630;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11631;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11633;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11635;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11636;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11637;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11638;

    public C4466(Class cls, Class cls2, String str) {
        this.f11635 = GeneratedMessage.getMethodOrDie(cls, AbstractC0900.m718("get", str, "List"), new Class[0]);
        this.f11634 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m718("get", str, "List"), new Class[0]);
        String strM717 = AbstractC0900.m717("get", str);
        Class cls3 = Integer.TYPE;
        java.lang.reflect.Method methodOrDie = GeneratedMessage.getMethodOrDie(cls, strM717, cls3);
        this.f11633 = methodOrDie;
        this.f11632 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m717("get", str), cls3);
        Class<?> returnType = methodOrDie.getReturnType();
        this.f11631 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m717("set", str), cls3, returnType);
        this.f11630 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m717("add", str), returnType);
        this.f11637 = GeneratedMessage.getMethodOrDie(cls, AbstractC0900.m718("get", str, "Count"), new Class[0]);
        this.f11636 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m718("get", str, "Count"), new Class[0]);
        this.f11638 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m717("clear", str), new Class[0]);
    }
}
