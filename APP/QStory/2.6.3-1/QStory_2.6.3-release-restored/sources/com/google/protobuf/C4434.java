package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰世哲子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4434 implements InterfaceC4513 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f11582;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f11583;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11584;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final WireFormat$FieldType f11585;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4230 f11586;

    public C4434(InterfaceC4230 interfaceC4230, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, boolean z2) {
        this.f11586 = interfaceC4230;
        this.f11584 = i;
        this.f11585 = wireFormat$FieldType;
        this.f11583 = z;
        this.f11582 = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11584 - ((C4434) obj).f11584;
    }

    @Override // com.google.protobuf.InterfaceC4513
    public final int getNumber() {
        return this.f11584;
    }

    @Override // com.google.protobuf.InterfaceC4513
    public final boolean isPacked() {
        return this.f11582;
    }

    @Override // com.google.protobuf.InterfaceC4513
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final WireFormat$JavaType mo8363() {
        return this.f11585.getJavaType();
    }

    @Override // com.google.protobuf.InterfaceC4513
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean mo8364(Object obj) {
        return obj instanceof InterfaceC4273;
    }

    @Override // com.google.protobuf.InterfaceC4513
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo8365() {
        return this.f11583;
    }

    @Override // com.google.protobuf.InterfaceC4513
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final WireFormat$FieldType mo8366() {
        return this.f11585;
    }

    @Override // com.google.protobuf.InterfaceC4513
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo8367(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        throw null;
    }
}
