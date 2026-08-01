package com.google.protobuf;

import bsh.C2633;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲兰苏楪子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3364 extends AbstractC3538 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC3471 f11015;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3344 f11016;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.protobuf.飘花落叶言子世楪哲苏兰] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public C3364(RopeByteString ropeByteString) {
        C3344 c3344 = new C3344(ropeByteString);
        this.f11016 = c3344;
        this.f11015 = c3344.hasNext() ? c3344.next().iterator2() : 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11015 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.protobuf.飘花落叶言子世楪哲苏兰] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.google.protobuf.InterfaceC3471
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte mo7477() {
        InterfaceC3471 interfaceC3471 = this.f11015;
        if (interfaceC3471 == null) {
            C2633.m5336();
            return (byte) 0;
        }
        byte bMo7477 = interfaceC3471.mo7477();
        if (!this.f11015.hasNext()) {
            C3344 c3344 = this.f11016;
            this.f11015 = c3344.hasNext() ? c3344.next().iterator2() : 0;
        }
        return bMo7477;
    }
}
