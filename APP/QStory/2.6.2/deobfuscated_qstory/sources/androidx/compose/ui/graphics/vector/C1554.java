package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1554 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4556;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4557;

    public C1554(float f, float f2) {
        super(3);
        this.f4557 = f;
        this.f4556 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1554)) {
            return false;
        }
        C1554 c1554 = (C1554) obj;
        return Float.compare(this.f4557, c1554.f4557) == 0 && Float.compare(this.f4556, c1554.f4556) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4556) + (Float.hashCode(this.f4557) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f4557);
        sb.append(", dy=");
        return AbstractC0053.m157(sb, this.f4556, ')');
    }
}
