package androidx.compose.ui;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2131 implements InterfaceC2118 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f6294;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f6295;

    public C2131(float f, float f2) {
        this.f6295 = f;
        this.f6294 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2131)) {
            return false;
        }
        C2131 c2131 = (C2131) obj;
        return Float.compare(this.f6295, c2131.f6295) == 0 && Float.compare(this.f6294, c2131.f6294) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6294) + (Float.hashCode(this.f6295) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f6295);
        sb.append(", verticalBias=");
        return AbstractC0053.m157(sb, this.f6294, ')');
    }

    @Override // androidx.compose.ui.InterfaceC2118
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo3849(long j, long j2, LayoutDirection layoutDirection) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f3 = this.f6295;
        if (layoutDirection != layoutDirection2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.f6294) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }
}
