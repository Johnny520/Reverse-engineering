package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰世子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3631 extends C3634 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11271;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11272;

    public C3631(Class cls, Class cls2, String str) {
        super(cls, cls2, str);
        this.f11272 = GeneratedMessage.getMethodOrDie(this.f11290, "newBuilder", new Class[0]);
        this.f11271 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m156("get", str, "Builder"), Integer.TYPE);
    }

    @Override // com.google.protobuf.C3634, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC3453 mo7831() {
        return (InterfaceC3453) GeneratedMessage.invokeOrDie(this.f11272, null, new Object[0]);
    }

    @Override // com.google.protobuf.C3634, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo7842(GeneratedMessage.AbstractC3304 abstractC3304, Object obj) {
        if (!this.f11290.isInstance(obj)) {
            obj = ((InterfaceC3453) GeneratedMessage.invokeOrDie(this.f11272, null, new Object[0])).mergeFrom((InterfaceC3452) obj).build();
        }
        super.mo7842(abstractC3304, obj);
    }

    @Override // com.google.protobuf.C3634, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo7843(GeneratedMessage.AbstractC3304 abstractC3304, int i, Object obj) {
        if (!this.f11290.isInstance(obj)) {
            obj = ((InterfaceC3453) GeneratedMessage.invokeOrDie(this.f11272, null, new Object[0])).mergeFrom((InterfaceC3452) obj).build();
        }
        super.mo7843(abstractC3304, i, obj);
    }

    @Override // com.google.protobuf.C3634, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC3453 mo7844(GeneratedMessage.AbstractC3304 abstractC3304, int i) {
        return (InterfaceC3453) GeneratedMessage.invokeOrDie(this.f11271, abstractC3304, Integer.valueOf(i));
    }
}
