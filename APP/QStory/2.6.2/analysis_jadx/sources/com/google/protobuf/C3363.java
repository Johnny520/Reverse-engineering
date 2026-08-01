package com.google.protobuf;

import bsh.C2632;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲兰苏楪子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3363 extends AbstractC3537 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC3470 f11010;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3343 f11011;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.protobuf.飘花落叶言子世楪哲苏兰] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public C3363(RopeByteString ropeByteString) {
        C3343 c3343 = new C3343(ropeByteString);
        this.f11011 = c3343;
        this.f11010 = c3343.hasNext() ? c3343.next().iterator2() : 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11010 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.protobuf.飘花落叶言子世楪哲苏兰] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.google.protobuf.InterfaceC3470
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte mo7490() {
        InterfaceC3470 interfaceC3470 = this.f11010;
        if (interfaceC3470 == null) {
            C2632.m5291();
            return (byte) 0;
        }
        byte bMo7490 = interfaceC3470.mo7490();
        if (!this.f11010.hasNext()) {
            C3343 c3343 = this.f11011;
            this.f11010 = c3343.hasNext() ? c3343.next().iterator2() : 0;
        }
        return bMo7490;
    }
}
