package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3618 implements InterfaceC3644 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3657 f11263;

    public C3618(C3663 c3663, int i) {
        this.f11263 = c3663.f11370[i].f11230[0];
    }

    @Override // com.google.protobuf.InterfaceC3644
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo7820(GeneratedMessage.AbstractC3305 abstractC3305) {
        return abstractC3305.hasField(this.f11263);
    }

    @Override // com.google.protobuf.InterfaceC3644
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3657 mo7821(GeneratedMessage.AbstractC3305 abstractC3305) {
        C3657 c3657 = this.f11263;
        if (abstractC3305.hasField(c3657)) {
            return c3657;
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC3644
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo7822(GeneratedMessage generatedMessage) {
        return generatedMessage.hasField(this.f11263);
    }

    @Override // com.google.protobuf.InterfaceC3644
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3657 mo7823(GeneratedMessage generatedMessage) {
        C3657 c3657 = this.f11263;
        if (generatedMessage.hasField(c3657)) {
            return c3657;
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC3644
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7824(GeneratedMessage.AbstractC3305 abstractC3305) {
        abstractC3305.clearField(this.f11263);
    }
}
