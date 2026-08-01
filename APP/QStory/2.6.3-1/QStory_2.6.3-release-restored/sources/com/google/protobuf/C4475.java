package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲子苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4475 implements InterfaceC4480 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f11660;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4285 f11661;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public volatile C4489 f11662;

    public C4475(InterfaceC4285 interfaceC4285, int i) {
        this.f11661 = interfaceC4285;
        this.f11660 = i;
    }

    @Override // com.google.protobuf.InterfaceC4480
    public final C4489 getDescriptor() {
        if (this.f11662 == null) {
            C4495 descriptorForType = this.f11661.getDescriptorForType();
            C4489 c4489 = descriptorForType.f11716[this.f11660];
            synchronized (this) {
                try {
                    if (this.f11662 == null) {
                        this.f11662 = c4489;
                    }
                } finally {
                }
            }
        }
        return this.f11662;
    }
}
