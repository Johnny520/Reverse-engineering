package com.google.protobuf;

import bsh.C2633;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3540 extends AbstractC3538 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11182;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ByteString f11183;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f11184 = 0;

    public C3540(ByteString byteString) {
        this.f11183 = byteString;
        this.f11182 = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11184 < this.f11182;
    }

    @Override // com.google.protobuf.InterfaceC3471
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final byte mo7477() {
        int i = this.f11184;
        if (i < this.f11182) {
            this.f11184 = i + 1;
            return this.f11183.internalByteAt(i);
        }
        C2633.m5336();
        return (byte) 0;
    }
}
