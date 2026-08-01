package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰世苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3633 extends C3636 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C3666 f11278;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11279;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11280;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11281;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final java.lang.reflect.Method f11282;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f11283;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final java.lang.reflect.Method f11284;

    public C3633(C3657 c3657, String str, Class cls, Class cls2, String str2) {
        super(c3657, str, cls, cls2, str2);
        this.f11278 = c3657.m7865();
        this.f11280 = GeneratedMessage.getMethodOrDie(this.f11300, "valueOf", C3664.class);
        this.f11279 = GeneratedMessage.getMethodOrDie(this.f11300, "getValueDescriptor", new Class[0]);
        boolean zM7853 = c3657.m7853();
        this.f11283 = !zM7853;
        if (zM7853) {
            return;
        }
        this.f11284 = GeneratedMessage.getMethodOrDie(cls, AbstractC0053.m158("get", str, "Value"), new Class[0]);
        this.f11281 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m158("get", str, "Value"), new Class[0]);
        this.f11282 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m158("set", str, "Value"), Integer.TYPE);
    }

    @Override // com.google.protobuf.C3636, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo7832(GeneratedMessage.AbstractC3305 abstractC3305) {
        if (this.f11283) {
            return this.f11278.m7882(((Integer) GeneratedMessage.invokeOrDie(this.f11281, abstractC3305, new Object[0])).intValue());
        }
        return GeneratedMessage.invokeOrDie(this.f11279, super.mo7832(abstractC3305), new Object[0]);
    }

    @Override // com.google.protobuf.C3636, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo7833(GeneratedMessage generatedMessage) {
        if (this.f11283) {
            return this.f11278.m7882(((Integer) GeneratedMessage.invokeOrDie(this.f11284, generatedMessage, new Object[0])).intValue());
        }
        return GeneratedMessage.invokeOrDie(this.f11279, super.mo7833(generatedMessage), new Object[0]);
    }

    @Override // com.google.protobuf.C3636, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7816(GeneratedMessage.AbstractC3305 abstractC3305, Object obj) {
        if (this.f11283) {
            GeneratedMessage.invokeOrDie(this.f11282, abstractC3305, Integer.valueOf(((C3664) obj).f11386.getNumber()));
        } else {
            super.mo7816(abstractC3305, GeneratedMessage.invokeOrDie(this.f11280, null, obj));
        }
    }
}
