package androidx.compose.p001ui.platform;

import p221.C8735;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2752 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2752 f6007 = new C2752(0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f6008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f6009;

    public C2752(long j, long j2) {
        this.f6009 = j;
        this.f6008 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2752) {
            C2752 c2752 = (C2752) obj;
            return C8735.m13916(this.f6009, c2752.f6009) && this.f6008 == c2752.f6008;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6008) + (Long.hashCode(this.f6009) * 31);
    }
}
