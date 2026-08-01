package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1559 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4572;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4574;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4575;

    public C1559(float f, float f2, float f3, float f4) {
        super(1);
        this.f4575 = f;
        this.f4574 = f2;
        this.f4573 = f3;
        this.f4572 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559)) {
            return false;
        }
        C1559 c1559 = (C1559) obj;
        return Float.compare(this.f4575, c1559.f4575) == 0 && Float.compare(this.f4574, c1559.f4574) == 0 && Float.compare(this.f4573, c1559.f4573) == 0 && Float.compare(this.f4572, c1559.f4572) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4572) + AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(this.f4575) * 31, this.f4574, 31), this.f4573, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f4575);
        sb.append(", y1=");
        sb.append(this.f4574);
        sb.append(", x2=");
        sb.append(this.f4573);
        sb.append(", y2=");
        return AbstractC0053.m155(sb, this.f4572, ')');
    }
}
