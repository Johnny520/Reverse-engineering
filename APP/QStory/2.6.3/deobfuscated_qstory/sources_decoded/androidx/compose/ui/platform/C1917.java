package androidx.compose.ui.platform;

import p205.C7906;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1917 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1917 f5662 = new C1917(0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f5663;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f5664;

    public C1917(long j, long j2) {
        this.f5664 = j;
        this.f5663 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1917) {
            C1917 c1917 = (C1917) obj;
            return C7906.m13357(this.f5664, c1917.f5664) && this.f5663 == c1917.f5663;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5663) + (Long.hashCode(this.f5664) * 31);
    }
}
