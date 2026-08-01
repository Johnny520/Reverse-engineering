package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4174 implements InterfaceC4364 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11313;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public GeneratedMessage f11314;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public GeneratedMessage.AbstractC4137 f11315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC4364 f11316;

    public C4174(GeneratedMessage generatedMessage, InterfaceC4364 interfaceC4364, boolean z) {
        Charset charset = AbstractC4234.f11404;
        generatedMessage.getClass();
        this.f11314 = generatedMessage;
        this.f11316 = interfaceC4364;
        this.f11313 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC4274 m7938() {
        GeneratedMessage.AbstractC4137 abstractC4137 = this.f11315;
        return abstractC4137 != null ? abstractC4137 : this.f11314;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final GeneratedMessage m7939() {
        if (this.f11314 == null) {
            this.f11314 = (GeneratedMessage) this.f11315.buildPartial();
        }
        return this.f11314;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final GeneratedMessage.AbstractC4137 m7940() {
        GeneratedMessage.AbstractC4137 abstractC4137 = this.f11315;
        if (abstractC4137 != null) {
            return abstractC4137;
        }
        GeneratedMessage.AbstractC4137 abstractC41372 = (GeneratedMessage.AbstractC4137) this.f11314.newBuilderForType(this);
        this.f11315 = abstractC41372;
        abstractC41372.mergeFrom((InterfaceC4285) this.f11314);
        abstractC41372.markClean();
        return abstractC41372;
    }

    @Override // com.google.protobuf.InterfaceC4364
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo7941() {
        m7944();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7942() {
        GeneratedMessage generatedMessage = this.f11314;
        this.f11314 = (GeneratedMessage) (generatedMessage != null ? generatedMessage.getDefaultInstanceForType() : this.f11315.getDefaultInstanceForType());
        GeneratedMessage.AbstractC4137 abstractC4137 = this.f11315;
        if (abstractC4137 != null) {
            abstractC4137.dispose();
            this.f11315 = null;
        }
        m7944();
        this.f11313 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final GeneratedMessage m7943() {
        this.f11313 = true;
        return m7939();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7944() {
        InterfaceC4364 interfaceC4364;
        if (this.f11315 != null) {
            this.f11314 = null;
        }
        if (!this.f11313 || (interfaceC4364 = this.f11316) == null) {
            return;
        }
        interfaceC4364.mo7941();
        this.f11313 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7945(GeneratedMessage generatedMessage) {
        if (this.f11315 == null) {
            GeneratedMessage generatedMessage2 = this.f11314;
            if (generatedMessage2 == generatedMessage2.getDefaultInstanceForType()) {
                this.f11314 = generatedMessage;
            } else {
                m7940().mergeFrom((InterfaceC4285) generatedMessage);
            }
        }
        m7944();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7946(GeneratedMessage generatedMessage) {
        Charset charset = AbstractC4234.f11404;
        generatedMessage.getClass();
        this.f11314 = generatedMessage;
        GeneratedMessage.AbstractC4137 abstractC4137 = this.f11315;
        if (abstractC4137 != null) {
            abstractC4137.dispose();
            this.f11315 = null;
        }
        m7944();
    }
}
