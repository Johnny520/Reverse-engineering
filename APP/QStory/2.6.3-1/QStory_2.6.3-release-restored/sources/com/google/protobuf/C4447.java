package com.google.protobuf;

import androidx.activity.AbstractC0900;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4447 extends C4468 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11600;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11601;

    public C4447(C4489 c4489, String str, Class cls, Class cls2, String str2) {
        super(c4489, str, cls, cls2, str2);
        this.f11600 = GeneratedMessage.getMethodOrDie(this.f11645, "newBuilder", new Class[0]);
        this.f11601 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m718("get", str, "Builder"), new Class[0]);
    }

    @Override // com.google.protobuf.C4468, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC4286 mo8377() {
        return (InterfaceC4286) GeneratedMessage.invokeOrDie(this.f11600, null, new Object[0]);
    }

    @Override // com.google.protobuf.C4468, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4286 mo8378(GeneratedMessage.AbstractC4137 abstractC4137) {
        return (InterfaceC4286) GeneratedMessage.invokeOrDie(this.f11601, abstractC4137, new Object[0]);
    }

    @Override // com.google.protobuf.C4468, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo8375(GeneratedMessage.AbstractC4137 abstractC4137, Object obj) {
        if (!this.f11645.isInstance(obj)) {
            obj = ((InterfaceC4286) GeneratedMessage.invokeOrDie(this.f11600, null, new Object[0])).mergeFrom((InterfaceC4285) obj).buildPartial();
        }
        super.mo8375(abstractC4137, obj);
    }
}
