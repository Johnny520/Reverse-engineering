package com.google.protobuf;

import androidx.activity.AbstractC0900;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4446 extends C4468 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11598;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11599;

    public C4446(C4489 c4489, String str, Class cls, Class cls2, String str2) {
        super(c4489, str, cls, cls2, str2);
        this.f11598 = GeneratedMessage.getMethodOrDie(cls, AbstractC0900.m718("get", str, "Bytes"), new Class[0]);
        this.f11599 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m718("set", str, "Bytes"), ByteString.class);
    }

    @Override // com.google.protobuf.C4468, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo8375(GeneratedMessage.AbstractC4137 abstractC4137, Object obj) {
        if (obj instanceof ByteString) {
            GeneratedMessage.invokeOrDie(this.f11599, abstractC4137, obj);
        } else {
            super.mo8375(abstractC4137, obj);
        }
    }

    @Override // com.google.protobuf.C4468, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object mo8376(GeneratedMessage generatedMessage) {
        return GeneratedMessage.invokeOrDie(this.f11598, generatedMessage, new Object[0]);
    }
}
