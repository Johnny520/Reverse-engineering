package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3615 extends C3636 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11255;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11256;

    public C3615(C3657 c3657, String str, Class cls, Class cls2, String str2) {
        super(c3657, str, cls, cls2, str2);
        this.f11255 = GeneratedMessage.getMethodOrDie(this.f11300, "newBuilder", new Class[0]);
        this.f11256 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m158("get", str, "Builder"), new Class[0]);
    }

    @Override // com.google.protobuf.C3636, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC3454 mo7818() {
        return (InterfaceC3454) GeneratedMessage.invokeOrDie(this.f11255, null, new Object[0]);
    }

    @Override // com.google.protobuf.C3636, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3454 mo7819(GeneratedMessage.AbstractC3305 abstractC3305) {
        return (InterfaceC3454) GeneratedMessage.invokeOrDie(this.f11256, abstractC3305, new Object[0]);
    }

    @Override // com.google.protobuf.C3636, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7816(GeneratedMessage.AbstractC3305 abstractC3305, Object obj) {
        if (!this.f11300.isInstance(obj)) {
            obj = ((InterfaceC3454) GeneratedMessage.invokeOrDie(this.f11255, null, new Object[0])).mergeFrom((InterfaceC3453) obj).buildPartial();
        }
        super.mo7816(abstractC3305, obj);
    }
}
