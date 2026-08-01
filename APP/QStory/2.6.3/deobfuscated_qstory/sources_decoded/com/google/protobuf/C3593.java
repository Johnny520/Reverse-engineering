package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世子苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3593 extends AbstractC3658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3659[] f11223;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3656 f11224;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final DescriptorProtos$ServiceDescriptorProto f11225;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f11226;

    public C3593(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto, C3656 c3656) {
        this.f11225 = descriptorProtos$ServiceDescriptorProto;
        this.f11226 = AbstractC3592.m7797(c3656, null, descriptorProtos$ServiceDescriptorProto.getName());
        this.f11224 = c3656;
        this.f11223 = new C3659[descriptorProtos$ServiceDescriptorProto.getMethodCount()];
        for (int i = 0; i < descriptorProtos$ServiceDescriptorProto.getMethodCount(); i++) {
            this.f11223[i] = new C3659(descriptorProtos$ServiceDescriptorProto.getMethod(i), this);
        }
        c3656.f11336.m7871(this);
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC3658 mo7799() {
        return this.f11224;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String mo7800() {
        return this.f11225.getName();
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String mo7801() {
        return this.f11226;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3656 mo7802() {
        return this.f11224;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC3453 mo7803() {
        return this.f11225;
    }
}
