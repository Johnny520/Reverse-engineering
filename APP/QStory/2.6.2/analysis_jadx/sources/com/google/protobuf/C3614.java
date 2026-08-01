package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3614 extends C3635 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11250;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11251;

    public C3614(C3656 c3656, String str, Class cls, Class cls2, String str2) {
        super(c3656, str, cls, cls2, str2);
        this.f11250 = GeneratedMessage.getMethodOrDie(this.f11295, "newBuilder", new Class[0]);
        this.f11251 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m156("get", str, "Builder"), new Class[0]);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC3453 mo7831() {
        return (InterfaceC3453) GeneratedMessage.invokeOrDie(this.f11250, null, new Object[0]);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3453 mo7832(GeneratedMessage.AbstractC3304 abstractC3304) {
        return (InterfaceC3453) GeneratedMessage.invokeOrDie(this.f11251, abstractC3304, new Object[0]);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7829(GeneratedMessage.AbstractC3304 abstractC3304, Object obj) {
        if (!this.f11295.isInstance(obj)) {
            obj = ((InterfaceC3453) GeneratedMessage.invokeOrDie(this.f11250, null, new Object[0])).mergeFrom((InterfaceC3452) obj).buildPartial();
        }
        super.mo7829(abstractC3304, obj);
    }
}
