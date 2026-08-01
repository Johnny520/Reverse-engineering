package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3705 extends AbstractC3709 {
    @Override // com.google.protobuf.AbstractC3709
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo7962(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C3706) obj2;
    }

    @Override // com.google.protobuf.AbstractC3709
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3706 mo7963(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C3706 c3706 = generatedMessageLite.unknownFields;
        if (c3706 != C3706.f11511) {
            return c3706;
        }
        C3706 c37062 = new C3706();
        generatedMessageLite.unknownFields = c37062;
        return c37062;
    }
}
