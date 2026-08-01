package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲苏兰子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3646 implements InterfaceC3643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final java.lang.reflect.Method f11324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11325;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3662 f11326;

    public C3646(C3662 c3662, String str, Class cls, Class cls2) {
        this.f11326 = c3662;
        this.f11325 = GeneratedMessage.getMethodOrDie(cls, AbstractC0053.m156("get", str, "Case"), new Class[0]);
        this.f11324 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m156("get", str, "Case"), new Class[0]);
        this.f11323 = GeneratedMessage.getMethodOrDie(cls2, AbstractC0053.m152("clear", str), new Class[0]);
    }

    @Override // com.google.protobuf.InterfaceC3643
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo7833(GeneratedMessage.AbstractC3304 abstractC3304) {
        return ((InterfaceC3398) GeneratedMessage.invokeOrDie(this.f11324, abstractC3304, new Object[0])).getNumber() != 0;
    }

    @Override // com.google.protobuf.InterfaceC3643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C3656 mo7834(GeneratedMessage.AbstractC3304 abstractC3304) {
        int number = ((InterfaceC3398) GeneratedMessage.invokeOrDie(this.f11324, abstractC3304, new Object[0])).getNumber();
        if (number > 0) {
            return this.f11326.m7891(number);
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC3643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo7835(GeneratedMessage generatedMessage) {
        return ((InterfaceC3398) GeneratedMessage.invokeOrDie(this.f11325, generatedMessage, new Object[0])).getNumber() != 0;
    }

    @Override // com.google.protobuf.InterfaceC3643
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C3656 mo7836(GeneratedMessage generatedMessage) {
        int number = ((InterfaceC3398) GeneratedMessage.invokeOrDie(this.f11325, generatedMessage, new Object[0])).getNumber();
        if (number > 0) {
            return this.f11326.m7891(number);
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC3643
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7837(GeneratedMessage.AbstractC3304 abstractC3304) {
        GeneratedMessage.invokeOrDie(this.f11323, abstractC3304, new Object[0]);
    }
}
