package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1558 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f4565;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4566;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4567;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4568;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f4569;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f4570;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float f4571;

    public C1558(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f4568 = f;
        this.f4567 = f2;
        this.f4566 = f3;
        this.f4565 = z;
        this.f4570 = z2;
        this.f4569 = f4;
        this.f4571 = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1558)) {
            return false;
        }
        C1558 c1558 = (C1558) obj;
        return Float.compare(this.f4568, c1558.f4568) == 0 && Float.compare(this.f4567, c1558.f4567) == 0 && Float.compare(this.f4566, c1558.f4566) == 0 && this.f4565 == c1558.f4565 && this.f4570 == c1558.f4570 && Float.compare(this.f4569, c1558.f4569) == 0 && Float.compare(this.f4571, c1558.f4571) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4571) + AbstractC0053.m145(AbstractC0053.m141(AbstractC0053.m141(AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(this.f4568) * 31, this.f4567, 31), this.f4566, 31), 31, this.f4565), 31, this.f4570), this.f4569, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f4568);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f4567);
        sb.append(", theta=");
        sb.append(this.f4566);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f4565);
        sb.append(", isPositiveArc=");
        sb.append(this.f4570);
        sb.append(", arcStartDx=");
        sb.append(this.f4569);
        sb.append(", arcStartDy=");
        return AbstractC0053.m155(sb, this.f4571, ')');
    }
}
