package com.google.protobuf;

import com.android.dx.io.Opcodes;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世兰哲子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3577 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f11203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3663 f11204;

    public C3577(C3663 c3663, int i) {
        this.f11204 = c3663;
        this.f11203 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3577)) {
            return false;
        }
        C3577 c3577 = (C3577) obj;
        return this.f11204 == c3577.f11204 && this.f11203 == c3577.f11203;
    }

    public final int hashCode() {
        return (this.f11204.hashCode() * Opcodes.MAX_VALUE) + this.f11203;
    }
}
