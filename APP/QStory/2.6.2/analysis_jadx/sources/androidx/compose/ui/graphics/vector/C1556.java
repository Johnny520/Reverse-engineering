package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1556 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4560;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4561;

    public C1556(float f, float f2) {
        super(3);
        this.f4561 = f;
        this.f4560 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556)) {
            return false;
        }
        C1556 c1556 = (C1556) obj;
        return Float.compare(this.f4561, c1556.f4561) == 0 && Float.compare(this.f4560, c1556.f4560) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4560) + (Float.hashCode(this.f4561) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f4561);
        sb.append(", y=");
        return AbstractC0053.m157(sb, this.f4560, ')');
    }
}
