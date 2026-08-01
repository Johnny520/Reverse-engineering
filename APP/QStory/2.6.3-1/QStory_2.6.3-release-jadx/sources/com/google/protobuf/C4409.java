package com.google.protobuf;

import com.android.p002dx.p005io.Opcodes;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世兰哲子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4409 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f11548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4495 f11549;

    public C4409(C4495 c4495, int i) {
        this.f11549 = c4495;
        this.f11548 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4409)) {
            return false;
        }
        C4409 c4409 = (C4409) obj;
        return this.f11549 == c4409.f11549 && this.f11548 == c4409.f11548;
    }

    public final int hashCode() {
        return (this.f11549.hashCode() * Opcodes.MAX_VALUE) + this.f11548;
    }
}
