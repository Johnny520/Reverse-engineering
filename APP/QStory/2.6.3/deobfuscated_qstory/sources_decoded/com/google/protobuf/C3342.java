package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3342 implements InterfaceC3532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f10968;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public GeneratedMessage f10969;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public GeneratedMessage.AbstractC3305 f10970;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC3532 f10971;

    public C3342(GeneratedMessage generatedMessage, InterfaceC3532 interfaceC3532, boolean z) {
        Charset charset = AbstractC3402.f11059;
        generatedMessage.getClass();
        this.f10969 = generatedMessage;
        this.f10971 = interfaceC3532;
        this.f10968 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC3442 m7379() {
        GeneratedMessage.AbstractC3305 abstractC3305 = this.f10970;
        return abstractC3305 != null ? abstractC3305 : this.f10969;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final GeneratedMessage m7380() {
        if (this.f10969 == null) {
            this.f10969 = (GeneratedMessage) this.f10970.buildPartial();
        }
        return this.f10969;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final GeneratedMessage.AbstractC3305 m7381() {
        GeneratedMessage.AbstractC3305 abstractC3305 = this.f10970;
        if (abstractC3305 != null) {
            return abstractC3305;
        }
        GeneratedMessage.AbstractC3305 abstractC33052 = (GeneratedMessage.AbstractC3305) this.f10969.newBuilderForType(this);
        this.f10970 = abstractC33052;
        abstractC33052.mergeFrom((InterfaceC3453) this.f10969);
        abstractC33052.markClean();
        return abstractC33052;
    }

    @Override // com.google.protobuf.InterfaceC3532
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo7382() {
        m7385();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7383() {
        GeneratedMessage generatedMessage = this.f10969;
        this.f10969 = (GeneratedMessage) (generatedMessage != null ? generatedMessage.getDefaultInstanceForType() : this.f10970.getDefaultInstanceForType());
        GeneratedMessage.AbstractC3305 abstractC3305 = this.f10970;
        if (abstractC3305 != null) {
            abstractC3305.dispose();
            this.f10970 = null;
        }
        m7385();
        this.f10968 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final GeneratedMessage m7384() {
        this.f10968 = true;
        return m7380();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7385() {
        InterfaceC3532 interfaceC3532;
        if (this.f10970 != null) {
            this.f10969 = null;
        }
        if (!this.f10968 || (interfaceC3532 = this.f10971) == null) {
            return;
        }
        interfaceC3532.mo7382();
        this.f10968 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7386(com.google.protobuf.GeneratedMessage r3) {
        /*
            r2 = this;
            com.google.protobuf.GeneratedMessage$飘花落叶言子楪世苏哲兰 r0 = r2.f10970
            if (r0 != 0) goto Lf
            com.google.protobuf.GeneratedMessage r0 = r2.f10969
            com.google.protobuf.飘花落叶言世苏楪哲子兰 r1 = r0.getDefaultInstanceForType()
            if (r0 != r1) goto Lf
            r2.f10969 = r3
            goto L16
        Lf:
            com.google.protobuf.GeneratedMessage$飘花落叶言子楪世苏哲兰 r0 = r2.m7381()
            r0.mergeFrom(r3)
        L16:
            r2.m7385()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3342.m7386(com.google.protobuf.GeneratedMessage):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7387(GeneratedMessage generatedMessage) {
        Charset charset = AbstractC3402.f11059;
        generatedMessage.getClass();
        this.f10969 = generatedMessage;
        GeneratedMessage.AbstractC3305 abstractC3305 = this.f10970;
        if (abstractC3305 != null) {
            abstractC3305.dispose();
            this.f10970 = null;
        }
        m7385();
    }
}
