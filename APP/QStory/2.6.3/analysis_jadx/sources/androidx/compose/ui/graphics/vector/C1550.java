package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1550 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4544;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f4545;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f4546;

    public C1550(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f4544 = f;
        this.f4543 = f2;
        this.f4542 = f3;
        this.f4541 = f4;
        this.f4546 = f5;
        this.f4545 = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1550)) {
            return false;
        }
        C1550 c1550 = (C1550) obj;
        return Float.compare(this.f4544, c1550.f4544) == 0 && Float.compare(this.f4543, c1550.f4543) == 0 && Float.compare(this.f4542, c1550.f4542) == 0 && Float.compare(this.f4541, c1550.f4541) == 0 && Float.compare(this.f4546, c1550.f4546) == 0 && Float.compare(this.f4545, c1550.f4545) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4545) + AbstractC0053.m145(AbstractC0053.m145(AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(this.f4544) * 31, this.f4543, 31), this.f4542, 31), this.f4541, 31), this.f4546, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f4544);
        sb.append(", dy1=");
        sb.append(this.f4543);
        sb.append(", dx2=");
        sb.append(this.f4542);
        sb.append(", dy2=");
        sb.append(this.f4541);
        sb.append(", dx3=");
        sb.append(this.f4546);
        sb.append(", dy3=");
        return AbstractC0053.m155(sb, this.f4545, ')');
    }
}
