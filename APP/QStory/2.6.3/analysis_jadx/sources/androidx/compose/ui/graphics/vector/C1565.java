package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1565 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f4608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4609;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4610;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4611;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f4612;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f4613;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float f4614;

    public C1565(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f4611 = f;
        this.f4610 = f2;
        this.f4609 = f3;
        this.f4608 = z;
        this.f4613 = z2;
        this.f4612 = f4;
        this.f4614 = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1565)) {
            return false;
        }
        C1565 c1565 = (C1565) obj;
        return Float.compare(this.f4611, c1565.f4611) == 0 && Float.compare(this.f4610, c1565.f4610) == 0 && Float.compare(this.f4609, c1565.f4609) == 0 && this.f4608 == c1565.f4608 && this.f4613 == c1565.f4613 && Float.compare(this.f4612, c1565.f4612) == 0 && Float.compare(this.f4614, c1565.f4614) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4614) + AbstractC0053.m145(AbstractC0053.m141(AbstractC0053.m141(AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(this.f4611) * 31, this.f4610, 31), this.f4609, 31), 31, this.f4608), 31, this.f4613), this.f4612, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f4611);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f4610);
        sb.append(", theta=");
        sb.append(this.f4609);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f4608);
        sb.append(", isPositiveArc=");
        sb.append(this.f4613);
        sb.append(", arcStartX=");
        sb.append(this.f4612);
        sb.append(", arcStartY=");
        return AbstractC0053.m155(sb, this.f4614, ')');
    }
}
