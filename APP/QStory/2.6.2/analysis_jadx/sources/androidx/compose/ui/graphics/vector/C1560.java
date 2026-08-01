package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1560 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4575;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4576;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4577;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4578;

    public C1560(float f, float f2, float f3, float f4) {
        super(2);
        this.f4578 = f;
        this.f4577 = f2;
        this.f4576 = f3;
        this.f4575 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1560)) {
            return false;
        }
        C1560 c1560 = (C1560) obj;
        return Float.compare(this.f4578, c1560.f4578) == 0 && Float.compare(this.f4577, c1560.f4577) == 0 && Float.compare(this.f4576, c1560.f4576) == 0 && Float.compare(this.f4575, c1560.f4575) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4575) + AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(this.f4578) * 31, this.f4577, 31), this.f4576, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f4578);
        sb.append(", y1=");
        sb.append(this.f4577);
        sb.append(", x2=");
        sb.append(this.f4576);
        sb.append(", y2=");
        return AbstractC0053.m157(sb, this.f4575, ')');
    }
}
