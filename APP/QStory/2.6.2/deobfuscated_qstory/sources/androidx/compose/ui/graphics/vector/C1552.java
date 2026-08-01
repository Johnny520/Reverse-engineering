package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1552 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4550;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4552;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4553;

    public C1552(float f, float f2, float f3, float f4) {
        super(2);
        this.f4553 = f;
        this.f4552 = f2;
        this.f4551 = f3;
        this.f4550 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1552)) {
            return false;
        }
        C1552 c1552 = (C1552) obj;
        return Float.compare(this.f4553, c1552.f4553) == 0 && Float.compare(this.f4552, c1552.f4552) == 0 && Float.compare(this.f4551, c1552.f4551) == 0 && Float.compare(this.f4550, c1552.f4550) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4550) + AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(this.f4553) * 31, this.f4552, 31), this.f4551, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f4553);
        sb.append(", dy1=");
        sb.append(this.f4552);
        sb.append(", dx2=");
        sb.append(this.f4551);
        sb.append(", dy2=");
        return AbstractC0053.m157(sb, this.f4550, ')');
    }
}
