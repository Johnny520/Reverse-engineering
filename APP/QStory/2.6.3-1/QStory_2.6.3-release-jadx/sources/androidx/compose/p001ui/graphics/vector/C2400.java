package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2400 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f4953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4956;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f4957;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f4958;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float f4959;

    public C2400(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f4956 = f;
        this.f4955 = f2;
        this.f4954 = f3;
        this.f4953 = z;
        this.f4958 = z2;
        this.f4957 = f4;
        this.f4959 = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2400)) {
            return false;
        }
        C2400 c2400 = (C2400) obj;
        return Float.compare(this.f4956, c2400.f4956) == 0 && Float.compare(this.f4955, c2400.f4955) == 0 && Float.compare(this.f4954, c2400.f4954) == 0 && this.f4953 == c2400.f4953 && this.f4958 == c2400.f4958 && Float.compare(this.f4957, c2400.f4957) == 0 && Float.compare(this.f4959, c2400.f4959) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4959) + AbstractC0900.m705(AbstractC0900.m701(AbstractC0900.m701(AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f4956) * 31, this.f4955, 31), this.f4954, 31), 31, this.f4953), 31, this.f4958), this.f4957, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f4956);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f4955);
        sb.append(", theta=");
        sb.append(this.f4954);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f4953);
        sb.append(", isPositiveArc=");
        sb.append(this.f4958);
        sb.append(", arcStartX=");
        sb.append(this.f4957);
        sb.append(", arcStartY=");
        return AbstractC0900.m715(sb, this.f4959, ')');
    }
}
