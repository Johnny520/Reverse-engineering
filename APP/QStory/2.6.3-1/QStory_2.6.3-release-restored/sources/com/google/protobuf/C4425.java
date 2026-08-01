package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世子苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4425 extends AbstractC4490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4491[] f11568;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4488 f11569;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final DescriptorProtos$ServiceDescriptorProto f11570;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f11571;

    public C4425(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, C4488 c4488) {
        this.f11570 = descriptorProtos$ServiceDescriptorProto;
        this.f11571 = AbstractC4424.m8356(c4488, null, descriptorProtos$ServiceDescriptorProto.getName());
        this.f11569 = c4488;
        this.f11568 = new C4491[descriptorProtos$ServiceDescriptorProto.getMethodCount()];
        for (int i = 0; i < descriptorProtos$ServiceDescriptorProto.getMethodCount(); i++) {
            this.f11568[i] = new C4491(descriptorProtos$ServiceDescriptorProto.getMethod(i), this);
        }
        c4488.f11681.m8430(this);
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC4490 mo8358() {
        return this.f11569;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String mo8359() {
        return this.f11570.getName();
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String mo8360() {
        return this.f11571;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4488 mo8361() {
        return this.f11569;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC4285 mo8362() {
        return this.f11570;
    }
}
