package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世子苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3594 extends AbstractC3658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3663 f11227;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f11228;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f11229 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C3657[] f11230;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11231;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DescriptorProtos$OneofDescriptorProto f11232;

    public C3594(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto, C3663 c3663, int i) {
        this.f11232 = descriptorProtos$OneofDescriptorProto;
        this.f11228 = AbstractC3592.m7797(null, c3663, descriptorProtos$OneofDescriptorProto.getName());
        this.f11231 = i;
        this.f11227 = c3663;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC3658 mo7799() {
        return this.f11227;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo7800() {
        return this.f11232.getName();
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo7801() {
        return this.f11228;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3656 mo7802() {
        return this.f11227.mo7802();
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3453 mo7803() {
        return this.f11232;
    }
}
