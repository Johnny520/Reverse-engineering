package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲苏兰子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3647 implements InterfaceC3644 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3663 f11331;

    public C3647(C3663 c3663, String str, Class cls, Class cls2) {
        this.f11331 = c3663;
        this.f11330 = GeneratedMessage.getMethodOrDie(cls, AbstractC0053.m158("get", str, "Case"), new Class[0]);
        this.f11329 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m158("get", str, "Case"), new Class[0]);
        this.f11328 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m157("clear", str), new Class[0]);
    }

    @Override // com.google.protobuf.InterfaceC3644
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo7820(GeneratedMessage.AbstractC3305 abstractC3305) {
        return ((InterfaceC3399) GeneratedMessage.invokeOrDie(this.f11329, abstractC3305, new Object[0])).getNumber() != 0;
    }

    @Override // com.google.protobuf.InterfaceC3644
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C3657 mo7821(GeneratedMessage.AbstractC3305 abstractC3305) {
        int number = ((InterfaceC3399) GeneratedMessage.invokeOrDie(this.f11329, abstractC3305, new Object[0])).getNumber();
        if (number > 0) {
            return this.f11331.m7878(number);
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC3644
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo7822(GeneratedMessage generatedMessage) {
        return ((InterfaceC3399) GeneratedMessage.invokeOrDie(this.f11330, generatedMessage, new Object[0])).getNumber() != 0;
    }

    @Override // com.google.protobuf.InterfaceC3644
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C3657 mo7823(GeneratedMessage generatedMessage) {
        int number = ((InterfaceC3399) GeneratedMessage.invokeOrDie(this.f11330, generatedMessage, new Object[0])).getNumber();
        if (number > 0) {
            return this.f11331.m7878(number);
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC3644
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7824(GeneratedMessage.AbstractC3305 abstractC3305) {
        GeneratedMessage.invokeOrDie(this.f11328, abstractC3305, new Object[0]);
    }
}
