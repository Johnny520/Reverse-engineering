package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3706 extends AbstractC3710 {
    @Override // com.google.protobuf.AbstractC3710
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo7949(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C3707) obj2;
    }

    @Override // com.google.protobuf.AbstractC3710
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3707 mo7950(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C3707 c3707 = generatedMessageLite.unknownFields;
        if (c3707 != C3707.f11516) {
            return c3707;
        }
        C3707 c37072 = new C3707();
        generatedMessageLite.unknownFields = c37072;
        return c37072;
    }
}
