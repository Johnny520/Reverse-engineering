package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3341 implements InterfaceC3531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f10963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public GeneratedMessage f10964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public GeneratedMessage.AbstractC3304 f10965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC3531 f10966;

    public C3341(GeneratedMessage generatedMessage, InterfaceC3531 interfaceC3531, boolean z) {
        Charset charset = AbstractC3401.f11054;
        generatedMessage.getClass();
        this.f10964 = generatedMessage;
        this.f10966 = interfaceC3531;
        this.f10963 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC3441 m7392() {
        GeneratedMessage.AbstractC3304 abstractC3304 = this.f10965;
        return abstractC3304 != null ? abstractC3304 : this.f10964;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final GeneratedMessage m7393() {
        if (this.f10964 == null) {
            this.f10964 = (GeneratedMessage) this.f10965.buildPartial();
        }
        return this.f10964;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final GeneratedMessage.AbstractC3304 m7394() {
        GeneratedMessage.AbstractC3304 abstractC3304 = this.f10965;
        if (abstractC3304 != null) {
            return abstractC3304;
        }
        GeneratedMessage.AbstractC3304 abstractC33042 = (GeneratedMessage.AbstractC3304) this.f10964.newBuilderForType(this);
        this.f10965 = abstractC33042;
        abstractC33042.mergeFrom((InterfaceC3452) this.f10964);
        abstractC33042.markClean();
        return abstractC33042;
    }

    @Override // com.google.protobuf.InterfaceC3531
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo7395() {
        m7398();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7396() {
        GeneratedMessage generatedMessage = this.f10964;
        this.f10964 = (GeneratedMessage) (generatedMessage != null ? generatedMessage.getDefaultInstanceForType() : this.f10965.getDefaultInstanceForType());
        GeneratedMessage.AbstractC3304 abstractC3304 = this.f10965;
        if (abstractC3304 != null) {
            abstractC3304.dispose();
            this.f10965 = null;
        }
        m7398();
        this.f10963 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final GeneratedMessage m7397() {
        this.f10963 = true;
        return m7393();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7398() {
        InterfaceC3531 interfaceC3531;
        if (this.f10965 != null) {
            this.f10964 = null;
        }
        if (!this.f10963 || (interfaceC3531 = this.f10966) == null) {
            return;
        }
        interfaceC3531.mo7395();
        this.f10963 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7399(com.google.protobuf.GeneratedMessage r3) {
        /*
            r2 = this;
            com.google.protobuf.GeneratedMessage$飘花落叶言子楪世苏哲兰 r0 = r2.f10965
            if (r0 != 0) goto Lf
            com.google.protobuf.GeneratedMessage r0 = r2.f10964
            com.google.protobuf.飘花落叶言世苏楪哲子兰 r1 = r0.getDefaultInstanceForType()
            if (r0 != r1) goto Lf
            r2.f10964 = r3
            goto L16
        Lf:
            com.google.protobuf.GeneratedMessage$飘花落叶言子楪世苏哲兰 r0 = r2.m7394()
            r0.mergeFrom(r3)
        L16:
            r2.m7398()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3341.m7399(com.google.protobuf.GeneratedMessage):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7400(GeneratedMessage generatedMessage) {
        Charset charset = AbstractC3401.f11054;
        generatedMessage.getClass();
        this.f10964 = generatedMessage;
        GeneratedMessage.AbstractC3304 abstractC3304 = this.f10965;
        if (abstractC3304 != null) {
            abstractC3304.dispose();
            this.f10965 = null;
        }
        m7398();
    }
}
