package com.google.protobuf;

import bsh.C2632;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3539 extends AbstractC3537 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11177;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ByteString f11178;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f11179 = 0;

    public C3539(ByteString byteString) {
        this.f11178 = byteString;
        this.f11177 = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11179 < this.f11177;
    }

    @Override // com.google.protobuf.InterfaceC3470
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final byte mo7490() {
        int i = this.f11179;
        if (i < this.f11177) {
            this.f11179 = i + 1;
            return this.f11178.internalByteAt(i);
        }
        C2632.m5291();
        return (byte) 0;
    }
}
