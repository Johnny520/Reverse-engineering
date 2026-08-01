package com.google.protobuf;

import androidx.activity.AbstractC0900;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰世苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4465 extends C4468 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4498 f11623;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11624;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11625;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11626;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final java.lang.reflect.Method f11627;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f11628;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final java.lang.reflect.Method f11629;

    public C4465(C4489 c4489, String str, Class cls, Class cls2, String str2) {
        super(c4489, str, cls, cls2, str2);
        this.f11623 = c4489.m8424();
        this.f11625 = GeneratedMessage.getMethodOrDie(this.f11645, "valueOf", C4496.class);
        this.f11624 = GeneratedMessage.getMethodOrDie(this.f11645, "getValueDescriptor", new Class[0]);
        boolean zM8412 = c4489.m8412();
        this.f11628 = !zM8412;
        if (zM8412) {
            return;
        }
        this.f11629 = GeneratedMessage.getMethodOrDie(cls, AbstractC0900.m718("get", str, "Value"), new Class[0]);
        this.f11626 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m718("get", str, "Value"), new Class[0]);
        this.f11627 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m718("set", str, "Value"), Integer.TYPE);
    }

    @Override // com.google.protobuf.C4468, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo8391(GeneratedMessage.AbstractC4137 abstractC4137) {
        if (this.f11628) {
            return this.f11623.m8441(((Integer) GeneratedMessage.invokeOrDie(this.f11626, abstractC4137, new Object[0])).intValue());
        }
        return GeneratedMessage.invokeOrDie(this.f11624, super.mo8391(abstractC4137), new Object[0]);
    }

    @Override // com.google.protobuf.C4468, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo8392(GeneratedMessage generatedMessage) {
        if (this.f11628) {
            return this.f11623.m8441(((Integer) GeneratedMessage.invokeOrDie(this.f11629, generatedMessage, new Object[0])).intValue());
        }
        return GeneratedMessage.invokeOrDie(this.f11624, super.mo8392(generatedMessage), new Object[0]);
    }

    @Override // com.google.protobuf.C4468, com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo8375(GeneratedMessage.AbstractC4137 abstractC4137, Object obj) {
        if (this.f11628) {
            GeneratedMessage.invokeOrDie(this.f11627, abstractC4137, Integer.valueOf(((C4496) obj).f11731.getNumber()));
        } else {
            super.mo8375(abstractC4137, GeneratedMessage.invokeOrDie(this.f11625, null, obj));
        }
    }
}
