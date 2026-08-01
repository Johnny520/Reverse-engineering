package com.google.protobuf;

import bsh.C3466;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲兰苏楪子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4196 extends AbstractC4370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC4303 f11360;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4176 f11361;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.protobuf.飘花落叶言子世楪哲苏兰] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public C4196(RopeByteString ropeByteString) {
        C4176 c4176 = new C4176(ropeByteString);
        this.f11361 = c4176;
        this.f11360 = c4176.hasNext() ? c4176.next().iterator2() : 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11360 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.protobuf.飘花落叶言子世楪哲苏兰] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.google.protobuf.InterfaceC4303
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte mo8036() {
        InterfaceC4303 interfaceC4303 = this.f11360;
        if (interfaceC4303 == null) {
            C3466.m5896();
            return (byte) 0;
        }
        byte bMo8036 = interfaceC4303.mo8036();
        if (!this.f11360.hasNext()) {
            C4176 c4176 = this.f11361;
            this.f11360 = c4176.hasNext() ? c4176.next().iterator2() : 0;
        }
        return bMo8036;
    }
}
