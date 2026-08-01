package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲子苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3642 implements InterfaceC3647 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f11310;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3452 f11311;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public volatile C3656 f11312;

    public C3642(InterfaceC3452 interfaceC3452, int i) {
        this.f11311 = interfaceC3452;
        this.f11310 = i;
    }

    @Override // com.google.protobuf.InterfaceC3647
    public final C3656 getDescriptor() {
        if (this.f11312 == null) {
            C3662 descriptorForType = this.f11311.getDescriptorForType();
            C3656 c3656 = descriptorForType.f11366[this.f11310];
            synchronized (this) {
                try {
                    if (this.f11312 == null) {
                        this.f11312 = c3656;
                    }
                } finally {
                }
            }
        }
        return this.f11312;
    }
}
