package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世子苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4426 extends AbstractC4490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4495 f11572;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f11573;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f11574 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C4489[] f11575;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DescriptorProtos$OneofDescriptorProto f11577;

    public C4426(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto, C4495 c4495, int i) {
        this.f11577 = descriptorProtos$OneofDescriptorProto;
        this.f11573 = AbstractC4424.m8356(null, c4495, descriptorProtos$OneofDescriptorProto.getName());
        this.f11576 = i;
        this.f11572 = c4495;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4490 mo8358() {
        return this.f11572;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo8359() {
        return this.f11577.getName();
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8360() {
        return this.f11573;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C4488 mo8361() {
        return this.f11572.mo8361();
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC4285 mo8362() {
        return this.f11577;
    }
}
