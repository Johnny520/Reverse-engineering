package androidx.compose.animation;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f1691;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1692;

    public C1250(float f, float f2) {
        this.f1692 = f;
        this.f1691 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1250)) {
            return false;
        }
        C1250 c1250 = (C1250) obj;
        return Float.compare(this.f1692, c1250.f1692) == 0 && Float.compare(this.f1691, c1250.f1691) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1691) + (Float.hashCode(this.f1692) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f1692);
        sb.append(", velocityCoefficient=");
        return AbstractC0900.m715(sb, this.f1691, ')');
    }
}
