package androidx.compose.animation;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f1637;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f1638;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1639;

    public C1229(float f, float f2, long j) {
        this.f1639 = f;
        this.f1638 = f2;
        this.f1637 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1229)) {
            return false;
        }
        C1229 c1229 = (C1229) obj;
        return Float.compare(this.f1639, c1229.f1639) == 0 && Float.compare(this.f1638, c1229.f1638) == 0 && this.f1637 == c1229.f1637;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1637) + AbstractC0900.m705(Float.hashCode(this.f1639) * 31, this.f1638, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f1639 + ", distance=" + this.f1638 + ", duration=" + this.f1637 + ')';
    }
}
