package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世子苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3592 extends AbstractC3657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3658[] f11218;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3655 f11219;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final DescriptorProtos$ServiceDescriptorProto f11220;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f11221;

    public C3592(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, C3655 c3655) {
        this.f11220 = descriptorProtos$ServiceDescriptorProto;
        this.f11221 = AbstractC3591.m7810(c3655, null, descriptorProtos$ServiceDescriptorProto.getName());
        this.f11219 = c3655;
        this.f11218 = new C3658[descriptorProtos$ServiceDescriptorProto.getMethodCount()];
        for (int i = 0; i < descriptorProtos$ServiceDescriptorProto.getMethodCount(); i++) {
            this.f11218[i] = new C3658(descriptorProtos$ServiceDescriptorProto.getMethod(i), this);
        }
        c3655.f11331.m7884(this);
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC3657 mo7812() {
        return this.f11219;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String mo7813() {
        return this.f11220.getName();
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String mo7814() {
        return this.f11221;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3655 mo7815() {
        return this.f11219;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC3452 mo7816() {
        return this.f11220;
    }
}
