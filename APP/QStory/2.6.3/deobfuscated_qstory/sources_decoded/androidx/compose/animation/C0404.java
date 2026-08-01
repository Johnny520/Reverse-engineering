package androidx.compose.animation;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0404 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f1346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1347;

    public C0404(float f, float f2) {
        this.f1347 = f;
        this.f1346 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0404)) {
            return false;
        }
        C0404 c0404 = (C0404) obj;
        return Float.compare(this.f1347, c0404.f1347) == 0 && Float.compare(this.f1346, c0404.f1346) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1346) + (Float.hashCode(this.f1347) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f1347);
        sb.append(", velocityCoefficient=");
        return AbstractC0053.m155(sb, this.f1346, ')');
    }
}
