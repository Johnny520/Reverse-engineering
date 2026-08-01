package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4450 implements InterfaceC4476 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4489 f11608;

    public C4450(C4495 c4495, int i) {
        this.f11608 = c4495.f11715[i].f11575[0];
    }

    @Override // com.google.protobuf.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo8379(GeneratedMessage.AbstractC4137 abstractC4137) {
        return abstractC4137.hasField(this.f11608);
    }

    @Override // com.google.protobuf.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4489 mo8380(GeneratedMessage.AbstractC4137 abstractC4137) {
        C4489 c4489 = this.f11608;
        if (abstractC4137.hasField(c4489)) {
            return c4489;
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo8381(GeneratedMessage generatedMessage) {
        return generatedMessage.hasField(this.f11608);
    }

    @Override // com.google.protobuf.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4489 mo8382(GeneratedMessage generatedMessage) {
        C4489 c4489 = this.f11608;
        if (generatedMessage.hasField(c4489)) {
            return c4489;
        }
        return null;
    }

    @Override // com.google.protobuf.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8383(GeneratedMessage.AbstractC4137 abstractC4137) {
        abstractC4137.clearField(this.f11608);
    }
}
