package androidx.compose.ui.graphics.colorspace;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1494 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f4243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f4244;

    public C1494(float f, float f2) {
        this.f4244 = f;
        this.f4243 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1494)) {
            return false;
        }
        C1494 c1494 = (C1494) obj;
        return Float.compare(this.f4244, c1494.f4244) == 0 && Float.compare(this.f4243, c1494.f4243) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4243) + (Float.hashCode(this.f4244) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f4244);
        sb.append(", y=");
        return AbstractC0053.m157(sb, this.f4243, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float[] m2657() {
        float f = this.f4244;
        float f2 = this.f4243;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }
}
