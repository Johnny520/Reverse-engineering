package com.google.protobuf;

import com.android.dx.io.Opcodes;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏子哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3696 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f11498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f11499;

    public C3696(int i, InterfaceC3441 interfaceC3441) {
        this.f11499 = interfaceC3441;
        this.f11498 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3696)) {
            return false;
        }
        C3696 c3696 = (C3696) obj;
        return this.f11499 == c3696.f11499 && this.f11498 == c3696.f11498;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f11499) * Opcodes.MAX_VALUE) + this.f11498;
    }
}
