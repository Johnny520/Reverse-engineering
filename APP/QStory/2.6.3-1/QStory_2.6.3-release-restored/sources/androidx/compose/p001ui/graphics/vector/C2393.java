package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2393 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f4910;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4911;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4913;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f4914;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f4915;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float f4916;

    public C2393(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f4913 = f;
        this.f4912 = f2;
        this.f4911 = f3;
        this.f4910 = z;
        this.f4915 = z2;
        this.f4914 = f4;
        this.f4916 = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2393)) {
            return false;
        }
        C2393 c2393 = (C2393) obj;
        return Float.compare(this.f4913, c2393.f4913) == 0 && Float.compare(this.f4912, c2393.f4912) == 0 && Float.compare(this.f4911, c2393.f4911) == 0 && this.f4910 == c2393.f4910 && this.f4915 == c2393.f4915 && Float.compare(this.f4914, c2393.f4914) == 0 && Float.compare(this.f4916, c2393.f4916) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4916) + AbstractC0900.m705(AbstractC0900.m701(AbstractC0900.m701(AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f4913) * 31, this.f4912, 31), this.f4911, 31), 31, this.f4910), 31, this.f4915), this.f4914, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f4913);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f4912);
        sb.append(", theta=");
        sb.append(this.f4911);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f4910);
        sb.append(", isPositiveArc=");
        sb.append(this.f4915);
        sb.append(", arcStartDx=");
        sb.append(this.f4914);
        sb.append(", arcStartDy=");
        return AbstractC0900.m715(sb, this.f4916, ')');
    }
}
