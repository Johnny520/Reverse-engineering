package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世子苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3593 extends AbstractC3657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3662 f11222;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f11223;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f11224 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C3656[] f11225;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11226;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DescriptorProtos$OneofDescriptorProto f11227;

    public C3593(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto, C3662 c3662, int i) {
        this.f11227 = descriptorProtos$OneofDescriptorProto;
        this.f11223 = AbstractC3591.m7810(null, c3662, descriptorProtos$OneofDescriptorProto.getName());
        this.f11226 = i;
        this.f11222 = c3662;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC3657 mo7812() {
        return this.f11222;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo7813() {
        return this.f11227.getName();
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo7814() {
        return this.f11223;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C3655 mo7815() {
        return this.f11222.mo7815();
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3452 mo7816() {
        return this.f11227;
    }
}
