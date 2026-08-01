package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰世苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3632 extends C3635 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C3665 f11273;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11274;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11275;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11276;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final java.lang.reflect.Method f11277;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f11278;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final java.lang.reflect.Method f11279;

    public C3632(C3656 c3656, String str, Class cls, Class cls2, String str2) {
        super(c3656, str, cls, cls2, str2);
        this.f11273 = c3656.m7878();
        this.f11275 = GeneratedMessage.getMethodOrDie(this.f11295, "valueOf", C3663.class);
        this.f11274 = GeneratedMessage.getMethodOrDie(this.f11295, "getValueDescriptor", new Class[0]);
        boolean zM7866 = c3656.m7866();
        this.f11278 = !zM7866;
        if (zM7866) {
            return;
        }
        this.f11279 = GeneratedMessage.getMethodOrDie(cls, AbstractC0053.m156("get", str, "Value"), new Class[0]);
        this.f11276 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m156("get", str, "Value"), new Class[0]);
        this.f11277 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m156("set", str, "Value"), Integer.TYPE);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo7845(GeneratedMessage.AbstractC3304 abstractC3304) {
        if (this.f11278) {
            return this.f11273.m7895(((Integer) GeneratedMessage.invokeOrDie(this.f11276, abstractC3304, new Object[0])).intValue());
        }
        return GeneratedMessage.invokeOrDie(this.f11274, super.mo7845(abstractC3304), new Object[0]);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo7846(GeneratedMessage generatedMessage) {
        if (this.f11278) {
            return this.f11273.m7895(((Integer) GeneratedMessage.invokeOrDie(this.f11279, generatedMessage, new Object[0])).intValue());
        }
        return GeneratedMessage.invokeOrDie(this.f11274, super.mo7846(generatedMessage), new Object[0]);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7829(GeneratedMessage.AbstractC3304 abstractC3304, Object obj) {
        if (this.f11278) {
            GeneratedMessage.invokeOrDie(this.f11277, abstractC3304, Integer.valueOf(((C3663) obj).f11381.getNumber()));
        } else {
            super.mo7829(abstractC3304, GeneratedMessage.invokeOrDie(this.f11275, null, obj));
        }
    }
}
