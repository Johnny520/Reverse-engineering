package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1555 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4559;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4560;

    public C1555(float f, float f2) {
        super(3);
        this.f4560 = f;
        this.f4559 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1555)) {
            return false;
        }
        C1555 c1555 = (C1555) obj;
        return Float.compare(this.f4560, c1555.f4560) == 0 && Float.compare(this.f4559, c1555.f4559) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4559) + (Float.hashCode(this.f4560) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f4560);
        sb.append(", y=");
        return AbstractC0053.m155(sb, this.f4559, ')');
    }
}
