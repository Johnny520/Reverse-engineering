package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3617 implements InterfaceC3643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3656 f11258;

    public C3617(C3662 c3662, int i) {
        this.f11258 = c3662.f11365[i].f11225[0];
    }

    @Override // com.google.protobuf.InterfaceC3643
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo7833(GeneratedMessage.AbstractC3304 abstractC3304) {
        return abstractC3304.hasField(this.f11258);
    }

    @Override // com.google.protobuf.InterfaceC3643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3656 mo7834(GeneratedMessage.AbstractC3304 abstractC3304) {
        C3656 c3656 = this.f11258;
        if (abstractC3304.hasField(c3656)) {
            return c3656;
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC3643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo7835(GeneratedMessage generatedMessage) {
        return generatedMessage.hasField(this.f11258);
    }

    @Override // com.google.protobuf.InterfaceC3643
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3656 mo7836(GeneratedMessage generatedMessage) {
        C3656 c3656 = this.f11258;
        if (generatedMessage.hasField(c3656)) {
            return c3656;
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC3643
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7837(GeneratedMessage.AbstractC3304 abstractC3304) {
        abstractC3304.clearField(this.f11258);
    }
}
