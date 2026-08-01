package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1551 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4546;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4547;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4549;

    public C1551(float f, float f2, float f3, float f4) {
        super(1);
        this.f4549 = f;
        this.f4548 = f2;
        this.f4547 = f3;
        this.f4546 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1551)) {
            return false;
        }
        C1551 c1551 = (C1551) obj;
        return Float.compare(this.f4549, c1551.f4549) == 0 && Float.compare(this.f4548, c1551.f4548) == 0 && Float.compare(this.f4547, c1551.f4547) == 0 && Float.compare(this.f4546, c1551.f4546) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4546) + AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(this.f4549) * 31, this.f4548, 31), this.f4547, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f4549);
        sb.append(", dy1=");
        sb.append(this.f4548);
        sb.append(", dx2=");
        sb.append(this.f4547);
        sb.append(", dy2=");
        return AbstractC0053.m157(sb, this.f4546, ')');
    }
}
