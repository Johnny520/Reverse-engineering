package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰世哲子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3602 implements InterfaceC3681 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f11237;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f11238;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11239;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final WireFormat$FieldType f11240;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3398 f11241;

    public C3602(InterfaceC3398 interfaceC3398, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, boolean z2) {
        this.f11241 = interfaceC3398;
        this.f11239 = i;
        this.f11240 = wireFormat$FieldType;
        this.f11238 = z;
        this.f11237 = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11239 - ((C3602) obj).f11239;
    }

    @Override // com.google.protobuf.InterfaceC3681
    public final int getNumber() {
        return this.f11239;
    }

    @Override // com.google.protobuf.InterfaceC3681
    public final boolean isPacked() {
        return this.f11237;
    }

    @Override // com.google.protobuf.InterfaceC3681
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final WireFormat$JavaType mo7804() {
        return this.f11240.getJavaType();
    }

    @Override // com.google.protobuf.InterfaceC3681
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean mo7805(Object obj) {
        return obj instanceof InterfaceC3441;
    }

    @Override // com.google.protobuf.InterfaceC3681
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo7806() {
        return this.f11238;
    }

    @Override // com.google.protobuf.InterfaceC3681
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final WireFormat$FieldType mo7807() {
        return this.f11240;
    }

    @Override // com.google.protobuf.InterfaceC3681
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo7808(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        throw null;
    }
}
