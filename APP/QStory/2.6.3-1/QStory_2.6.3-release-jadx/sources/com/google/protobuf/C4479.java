package com.google.protobuf;

import androidx.activity.AbstractC0900;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲苏兰子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4479 implements InterfaceC4476 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4495 f11676;

    public C4479(C4495 c4495, String str, Class cls, Class cls2) {
        this.f11676 = c4495;
        this.f11675 = GeneratedMessage.getMethodOrDie(cls, AbstractC0900.m718("get", str, "Case"), new Class[0]);
        this.f11674 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m718("get", str, "Case"), new Class[0]);
        this.f11673 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0900.m717("clear", str), new Class[0]);
    }

    @Override // com.google.protobuf.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo8379(GeneratedMessage.AbstractC4137 abstractC4137) {
        return ((InterfaceC4231) GeneratedMessage.invokeOrDie(this.f11674, abstractC4137, new Object[0])).getNumber() != 0;
    }

    @Override // com.google.protobuf.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4489 mo8380(GeneratedMessage.AbstractC4137 abstractC4137) {
        int number = ((InterfaceC4231) GeneratedMessage.invokeOrDie(this.f11674, abstractC4137, new Object[0])).getNumber();
        if (number > 0) {
            return this.f11676.m8437(number);
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8381(GeneratedMessage generatedMessage) {
        return ((InterfaceC4231) GeneratedMessage.invokeOrDie(this.f11675, generatedMessage, new Object[0])).getNumber() != 0;
    }

    @Override // com.google.protobuf.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C4489 mo8382(GeneratedMessage generatedMessage) {
        int number = ((InterfaceC4231) GeneratedMessage.invokeOrDie(this.f11675, generatedMessage, new Object[0])).getNumber();
        if (number > 0) {
            return this.f11676.m8437(number);
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8383(GeneratedMessage.AbstractC4137 abstractC4137) {
        GeneratedMessage.invokeOrDie(this.f11673, abstractC4137, new Object[0]);
    }
}
