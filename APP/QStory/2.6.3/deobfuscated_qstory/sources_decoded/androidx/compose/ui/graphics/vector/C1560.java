package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1560 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4576;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4577;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4578;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4579;

    public C1560(float f, float f2, float f3, float f4) {
        super(2);
        this.f4579 = f;
        this.f4578 = f2;
        this.f4577 = f3;
        this.f4576 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1560)) {
            return false;
        }
        C1560 c1560 = (C1560) obj;
        return Float.compare(this.f4579, c1560.f4579) == 0 && Float.compare(this.f4578, c1560.f4578) == 0 && Float.compare(this.f4577, c1560.f4577) == 0 && Float.compare(this.f4576, c1560.f4576) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4576) + AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(this.f4579) * 31, this.f4578, 31), this.f4577, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f4579);
        sb.append(", y1=");
        sb.append(this.f4578);
        sb.append(", x2=");
        sb.append(this.f4577);
        sb.append(", y2=");
        return AbstractC0053.m155(sb, this.f4576, ')');
    }
}
