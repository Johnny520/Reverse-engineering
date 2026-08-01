package com.google.protobuf;

import com.android.dx.io.Opcodes;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世兰哲子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3576 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f11198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3662 f11199;

    public C3576(C3662 c3662, int i) {
        this.f11199 = c3662;
        this.f11198 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3576)) {
            return false;
        }
        C3576 c3576 = (C3576) obj;
        return this.f11199 == c3576.f11199 && this.f11198 == c3576.f11198;
    }

    public final int hashCode() {
        return (this.f11199.hashCode() * Opcodes.MAX_VALUE) + this.f11198;
    }
}
