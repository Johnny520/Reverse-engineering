package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1553 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4554;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4555;

    public C1553(float f, float f2) {
        super(3);
        this.f4555 = f;
        this.f4554 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1553)) {
            return false;
        }
        C1553 c1553 = (C1553) obj;
        return Float.compare(this.f4555, c1553.f4555) == 0 && Float.compare(this.f4554, c1553.f4554) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4554) + (Float.hashCode(this.f4555) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f4555);
        sb.append(", dy=");
        return AbstractC0053.m157(sb, this.f4554, ')');
    }
}
