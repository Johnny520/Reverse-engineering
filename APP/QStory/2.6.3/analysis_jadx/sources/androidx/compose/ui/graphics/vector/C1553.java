package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1553 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4555;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4556;

    public C1553(float f, float f2) {
        super(3);
        this.f4556 = f;
        this.f4555 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1553)) {
            return false;
        }
        C1553 c1553 = (C1553) obj;
        return Float.compare(this.f4556, c1553.f4556) == 0 && Float.compare(this.f4555, c1553.f4555) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4555) + (Float.hashCode(this.f4556) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f4556);
        sb.append(", dy=");
        return AbstractC0053.m155(sb, this.f4555, ')');
    }
}
