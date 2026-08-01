package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4538 extends AbstractC4542 {
    @Override // com.google.protobuf.AbstractC4542
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo8508(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C4539) obj2;
    }

    @Override // com.google.protobuf.AbstractC4542
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4539 mo8509(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C4539 c4539 = generatedMessageLite.unknownFields;
        if (c4539 != C4539.f11861) {
            return c4539;
        }
        C4539 c45392 = new C4539();
        generatedMessageLite.unknownFields = c45392;
        return c45392;
    }
}
