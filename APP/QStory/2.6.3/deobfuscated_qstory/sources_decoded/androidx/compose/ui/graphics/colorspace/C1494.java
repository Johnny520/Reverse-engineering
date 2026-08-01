package androidx.compose.ui.graphics.colorspace;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1494 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f4244;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f4245;

    public C1494(float f, float f2) {
        this.f4245 = f;
        this.f4244 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1494)) {
            return false;
        }
        C1494 c1494 = (C1494) obj;
        return Float.compare(this.f4245, c1494.f4245) == 0 && Float.compare(this.f4244, c1494.f4244) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4244) + (Float.hashCode(this.f4245) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f4245);
        sb.append(", y=");
        return AbstractC0053.m155(sb, this.f4244, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float[] m2667() {
        float f = this.f4245;
        float f2 = this.f4244;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }
}
