package androidx.compose.foundation.gestures;

import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1346 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f1848;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1849;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f1850;

    public C1346(long j, long j2, boolean z) {
        this.f1850 = j;
        this.f1849 = j2;
        this.f1848 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1346 m1845(C1346 c1346) {
        return new C1346(C8158.m13084(this.f1850, c1346.f1850), Math.max(this.f1849, c1346.f1849), this.f1848 || c1346.f1848);
    }
}
