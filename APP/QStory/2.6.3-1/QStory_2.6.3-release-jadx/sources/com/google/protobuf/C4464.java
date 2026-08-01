package com.google.protobuf;

import androidx.activity.AbstractC0900;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰世子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4464 extends C4467 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11622;

    public C4464(Class cls, Class cls2, String str) {
        super(cls, cls2, str);
        this.f11622 = GeneratedMessage.getMethodOrDie(this.f11640, "newBuilder", new Class[0]);
        this.f11621 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m718("get", str, "Builder"), Integer.TYPE);
    }

    @Override // com.google.protobuf.C4467, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4286 mo8377() {
        return (InterfaceC4286) GeneratedMessage.invokeOrDie(this.f11622, null, new Object[0]);
    }

    @Override // com.google.protobuf.C4467, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo8388(GeneratedMessage.AbstractC4137 abstractC4137, Object obj) {
        if (!this.f11640.isInstance(obj)) {
            obj = ((InterfaceC4286) GeneratedMessage.invokeOrDie(this.f11622, null, new Object[0])).mergeFrom((InterfaceC4285) obj).build();
        }
        super.mo8388(abstractC4137, obj);
    }

    @Override // com.google.protobuf.C4467, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo8389(GeneratedMessage.AbstractC4137 abstractC4137, int i, Object obj) {
        if (!this.f11640.isInstance(obj)) {
            obj = ((InterfaceC4286) GeneratedMessage.invokeOrDie(this.f11622, null, new Object[0])).mergeFrom((InterfaceC4285) obj).build();
        }
        super.mo8389(abstractC4137, i, obj);
    }

    @Override // com.google.protobuf.C4467, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC4286 mo8390(GeneratedMessage.AbstractC4137 abstractC4137, int i) {
        return (InterfaceC4286) GeneratedMessage.invokeOrDie(this.f11621, abstractC4137, Integer.valueOf(i));
    }
}
