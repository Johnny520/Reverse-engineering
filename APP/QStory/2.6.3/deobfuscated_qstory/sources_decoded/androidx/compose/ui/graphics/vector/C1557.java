package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1557 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4563;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4564;

    public C1557(float f, float f2) {
        super(1);
        this.f4564 = f;
        this.f4563 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557)) {
            return false;
        }
        C1557 c1557 = (C1557) obj;
        return Float.compare(this.f4564, c1557.f4564) == 0 && Float.compare(this.f4563, c1557.f4563) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4563) + (Float.hashCode(this.f4564) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f4564);
        sb.append(", y=");
        return AbstractC0053.m155(sb, this.f4563, ')');
    }
}
