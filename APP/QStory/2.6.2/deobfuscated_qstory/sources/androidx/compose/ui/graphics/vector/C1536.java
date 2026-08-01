package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1536 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4461;

    public C1536(float f, float f2) {
        super(1);
        this.f4461 = f;
        this.f4460 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1536)) {
            return false;
        }
        C1536 c1536 = (C1536) obj;
        return Float.compare(this.f4461, c1536.f4461) == 0 && Float.compare(this.f4460, c1536.f4460) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4460) + (Float.hashCode(this.f4461) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f4461);
        sb.append(", dy=");
        return AbstractC0053.m157(sb, this.f4460, ')');
    }
}
