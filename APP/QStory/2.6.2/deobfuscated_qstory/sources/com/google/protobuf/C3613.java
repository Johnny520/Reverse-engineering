package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3613 extends C3635 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11248;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11249;

    public C3613(C3656 c3656, String str, Class cls, Class cls2, String str2) {
        super(c3656, str, cls, cls2, str2);
        this.f11248 = GeneratedMessage.getMethodOrDie(cls, AbstractC0053.m156("get", str, "Bytes"), new Class[0]);
        this.f11249 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m156("set", str, "Bytes"), ByteString.class);
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo7829(GeneratedMessage.AbstractC3304 abstractC3304, Object obj) {
        if (obj instanceof ByteString) {
            GeneratedMessage.invokeOrDie(this.f11249, abstractC3304, obj);
        } else {
            super.mo7829(abstractC3304, obj);
        }
    }

    @Override // com.google.protobuf.C3635, com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object mo7830(GeneratedMessage generatedMessage) {
        return GeneratedMessage.invokeOrDie(this.f11248, generatedMessage, new Object[0]);
    }
}
