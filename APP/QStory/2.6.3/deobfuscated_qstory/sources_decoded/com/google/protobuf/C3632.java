package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰世子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3632 extends C3635 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11277;

    public C3632(Class cls, Class cls2, String str) {
        super(cls, cls2, str);
        this.f11277 = GeneratedMessage.getMethodOrDie(this.f11295, "newBuilder", new Class[0]);
        this.f11276 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m158("get", str, "Builder"), Integer.TYPE);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC3454 mo7818() {
        return (InterfaceC3454) GeneratedMessage.invokeOrDie(this.f11277, null, new Object[0]);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo7829(GeneratedMessage.AbstractC3305 abstractC3305, Object obj) {
        if (!this.f11295.isInstance(obj)) {
            obj = ((InterfaceC3454) GeneratedMessage.invokeOrDie(this.f11277, null, new Object[0])).mergeFrom((InterfaceC3453) obj).build();
        }
        super.mo7829(abstractC3305, obj);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo7830(GeneratedMessage.AbstractC3305 abstractC3305, int i, Object obj) {
        if (!this.f11295.isInstance(obj)) {
            obj = ((InterfaceC3454) GeneratedMessage.invokeOrDie(this.f11277, null, new Object[0])).mergeFrom((InterfaceC3453) obj).build();
        }
        super.mo7830(abstractC3305, i, obj);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC3454 mo7831(GeneratedMessage.AbstractC3305 abstractC3305, int i) {
        return (InterfaceC3454) GeneratedMessage.invokeOrDie(this.f11276, abstractC3305, Integer.valueOf(i));
    }
}
