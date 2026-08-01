package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1554 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4558;

    public C1554(float f, float f2) {
        super(3);
        this.f4558 = f;
        this.f4557 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1554)) {
            return false;
        }
        C1554 c1554 = (C1554) obj;
        return Float.compare(this.f4558, c1554.f4558) == 0 && Float.compare(this.f4557, c1554.f4557) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4557) + (Float.hashCode(this.f4558) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f4558);
        sb.append(", dy=");
        return AbstractC0053.m155(sb, this.f4557, ')');
    }
}
