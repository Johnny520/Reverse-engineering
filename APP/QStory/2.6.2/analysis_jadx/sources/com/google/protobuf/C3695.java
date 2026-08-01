package com.google.protobuf;

import com.android.dx.io.Opcodes;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏子哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3695 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f11493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f11494;

    public C3695(int i, InterfaceC3440 interfaceC3440) {
        this.f11494 = interfaceC3440;
        this.f11493 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3695)) {
            return false;
        }
        C3695 c3695 = (C3695) obj;
        return this.f11494 == c3695.f11494 && this.f11493 == c3695.f11493;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f11494) * Opcodes.MAX_VALUE) + this.f11493;
    }
}
