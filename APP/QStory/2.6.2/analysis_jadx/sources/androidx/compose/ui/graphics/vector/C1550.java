package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1550 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4543;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f4544;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f4545;

    public C1550(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f4543 = f;
        this.f4542 = f2;
        this.f4541 = f3;
        this.f4540 = f4;
        this.f4545 = f5;
        this.f4544 = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1550)) {
            return false;
        }
        C1550 c1550 = (C1550) obj;
        return Float.compare(this.f4543, c1550.f4543) == 0 && Float.compare(this.f4542, c1550.f4542) == 0 && Float.compare(this.f4541, c1550.f4541) == 0 && Float.compare(this.f4540, c1550.f4540) == 0 && Float.compare(this.f4545, c1550.f4545) == 0 && Float.compare(this.f4544, c1550.f4544) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4544) + AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(this.f4543) * 31, this.f4542, 31), this.f4541, 31), this.f4540, 31), this.f4545, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f4543);
        sb.append(", dy1=");
        sb.append(this.f4542);
        sb.append(", dx2=");
        sb.append(this.f4541);
        sb.append(", dy2=");
        sb.append(this.f4540);
        sb.append(", dx3=");
        sb.append(this.f4545);
        sb.append(", dy3=");
        return AbstractC0053.m157(sb, this.f4544, ')');
    }
}
