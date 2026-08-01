package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲子苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3643 implements InterfaceC3648 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f11315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3453 f11316;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public volatile C3657 f11317;

    public C3643(InterfaceC3453 interfaceC3453, int i) {
        this.f11316 = interfaceC3453;
        this.f11315 = i;
    }

    @Override // com.google.protobuf.InterfaceC3648
    public final C3657 getDescriptor() {
        if (this.f11317 == null) {
            C3663 descriptorForType = this.f11316.getDescriptorForType();
            C3657 c3657 = descriptorForType.f11371[this.f11315];
            synchronized (this) {
                try {
                    if (this.f11317 == null) {
                        this.f11317 = c3657;
                    }
                } finally {
                }
            }
        }
        return this.f11317;
    }
}
