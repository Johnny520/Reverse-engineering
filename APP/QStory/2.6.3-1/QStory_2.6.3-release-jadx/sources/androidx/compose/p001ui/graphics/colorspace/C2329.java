package androidx.compose.p001ui.graphics.colorspace;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2329 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f4589;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f4590;

    public C2329(float f, float f2) {
        this.f4590 = f;
        this.f4589 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2329)) {
            return false;
        }
        C2329 c2329 = (C2329) obj;
        return Float.compare(this.f4590, c2329.f4590) == 0 && Float.compare(this.f4589, c2329.f4589) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4589) + (Float.hashCode(this.f4590) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f4590);
        sb.append(", y=");
        return AbstractC0900.m715(sb, this.f4589, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float[] m3227() {
        float f = this.f4590;
        float f2 = this.f4589;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }
}
