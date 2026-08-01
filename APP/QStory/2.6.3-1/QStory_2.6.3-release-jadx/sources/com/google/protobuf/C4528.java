package com.google.protobuf;

import com.android.p002dx.p005io.Opcodes;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏子哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4528 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f11843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f11844;

    public C4528(int i, InterfaceC4273 interfaceC4273) {
        this.f11844 = interfaceC4273;
        this.f11843 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4528)) {
            return false;
        }
        C4528 c4528 = (C4528) obj;
        return this.f11844 == c4528.f11844 && this.f11843 == c4528.f11843;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f11844) * Opcodes.MAX_VALUE) + this.f11843;
    }
}
