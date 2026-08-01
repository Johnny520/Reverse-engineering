package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1558 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f4564;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4565;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4566;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4567;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f4568;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f4569;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float f4570;

    public C1558(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f4567 = f;
        this.f4566 = f2;
        this.f4565 = f3;
        this.f4564 = z;
        this.f4569 = z2;
        this.f4568 = f4;
        this.f4570 = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1558)) {
            return false;
        }
        C1558 c1558 = (C1558) obj;
        return Float.compare(this.f4567, c1558.f4567) == 0 && Float.compare(this.f4566, c1558.f4566) == 0 && Float.compare(this.f4565, c1558.f4565) == 0 && this.f4564 == c1558.f4564 && this.f4569 == c1558.f4569 && Float.compare(this.f4568, c1558.f4568) == 0 && Float.compare(this.f4570, c1558.f4570) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4570) + AbstractC0053.m144(AbstractC0053.m140(AbstractC0053.m140(AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(this.f4567) * 31, this.f4566, 31), this.f4565, 31), 31, this.f4564), 31, this.f4569), this.f4568, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f4567);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f4566);
        sb.append(", theta=");
        sb.append(this.f4565);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f4564);
        sb.append(", isPositiveArc=");
        sb.append(this.f4569);
        sb.append(", arcStartDx=");
        sb.append(this.f4568);
        sb.append(", arcStartDy=");
        return AbstractC0053.m157(sb, this.f4570, ')');
    }
}
