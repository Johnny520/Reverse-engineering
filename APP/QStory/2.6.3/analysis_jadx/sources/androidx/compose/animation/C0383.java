package androidx.compose.animation;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f1292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f1293;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1294;

    public C0383(float f, float f2, long j) {
        this.f1294 = f;
        this.f1293 = f2;
        this.f1292 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0383)) {
            return false;
        }
        C0383 c0383 = (C0383) obj;
        return Float.compare(this.f1294, c0383.f1294) == 0 && Float.compare(this.f1293, c0383.f1293) == 0 && this.f1292 == c0383.f1292;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1292) + AbstractC0053.m145(Float.hashCode(this.f1294) * 31, this.f1293, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f1294 + ", distance=" + this.f1293 + ", duration=" + this.f1292 + ')';
    }
}
