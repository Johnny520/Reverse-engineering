package com.google.protobuf;

import bsh.C3466;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4372 extends AbstractC4370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ByteString f11528;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f11529 = 0;

    public C4372(ByteString byteString) {
        this.f11528 = byteString;
        this.f11527 = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11529 < this.f11527;
    }

    @Override // com.google.protobuf.InterfaceC4303
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final byte mo8036() {
        int i = this.f11529;
        if (i < this.f11527) {
            this.f11529 = i + 1;
            return this.f11528.internalByteAt(i);
        }
        C3466.m5896();
        return (byte) 0;
    }
}
