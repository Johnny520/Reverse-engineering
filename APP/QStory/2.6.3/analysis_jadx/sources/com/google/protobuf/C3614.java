package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3614 extends C3636 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11253;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11254;

    public C3614(C3657 c3657, String str, Class cls, Class cls2, String str2) {
        super(c3657, str, cls, cls2, str2);
        this.f11253 = GeneratedMessage.getMethodOrDie(cls, AbstractC0053.m158("get", str, "Bytes"), new Class[0]);
        this.f11254 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m158("set", str, "Bytes"), ByteString.class);
    }

    @Override // com.google.protobuf.C3636, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo7816(GeneratedMessage.AbstractC3305 abstractC3305, Object obj) {
        if (obj instanceof ByteString) {
            GeneratedMessage.invokeOrDie(this.f11254, abstractC3305, obj);
        } else {
            super.mo7816(abstractC3305, obj);
        }
    }

    @Override // com.google.protobuf.C3636, com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object mo7817(GeneratedMessage generatedMessage) {
        return GeneratedMessage.invokeOrDie(this.f11253, generatedMessage, new Object[0]);
    }
}
