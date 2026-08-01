package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰世哲子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3601 implements InterfaceC3680 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f11232;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f11233;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11234;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final WireFormat$FieldType f11235;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3397 f11236;

    public C3601(InterfaceC3397 interfaceC3397, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, boolean z2) {
        this.f11236 = interfaceC3397;
        this.f11234 = i;
        this.f11235 = wireFormat$FieldType;
        this.f11233 = z;
        this.f11232 = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11234 - ((C3601) obj).f11234;
    }

    @Override // com.google.protobuf.InterfaceC3680
    public final int getNumber() {
        return this.f11234;
    }

    @Override // com.google.protobuf.InterfaceC3680
    public final boolean isPacked() {
        return this.f11232;
    }

    @Override // com.google.protobuf.InterfaceC3680
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final WireFormat$JavaType mo7817() {
        return this.f11235.getJavaType();
    }

    @Override // com.google.protobuf.InterfaceC3680
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean mo7818(Object obj) {
        return obj instanceof InterfaceC3440;
    }

    @Override // com.google.protobuf.InterfaceC3680
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo7819() {
        return this.f11233;
    }

    @Override // com.google.protobuf.InterfaceC3680
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final WireFormat$FieldType mo7820() {
        return this.f11235;
    }

    @Override // com.google.protobuf.InterfaceC3680
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo7821(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        throw null;
    }
}
