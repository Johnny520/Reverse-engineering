package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1563 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4601;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4602;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4603;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4604;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f4605;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f4606;

    public C1563(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f4604 = f;
        this.f4603 = f2;
        this.f4602 = f3;
        this.f4601 = f4;
        this.f4606 = f5;
        this.f4605 = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1563)) {
            return false;
        }
        C1563 c1563 = (C1563) obj;
        return Float.compare(this.f4604, c1563.f4604) == 0 && Float.compare(this.f4603, c1563.f4603) == 0 && Float.compare(this.f4602, c1563.f4602) == 0 && Float.compare(this.f4601, c1563.f4601) == 0 && Float.compare(this.f4606, c1563.f4606) == 0 && Float.compare(this.f4605, c1563.f4605) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4605) + AbstractC0053.m145(AbstractC0053.m145(AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(this.f4604) * 31, this.f4603, 31), this.f4602, 31), this.f4601, 31), this.f4606, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f4604);
        sb.append(", y1=");
        sb.append(this.f4603);
        sb.append(", x2=");
        sb.append(this.f4602);
        sb.append(", y2=");
        sb.append(this.f4601);
        sb.append(", x3=");
        sb.append(this.f4606);
        sb.append(", y3=");
        return AbstractC0053.m155(sb, this.f4605, ')');
    }
}
