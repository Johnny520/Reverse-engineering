package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1556 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4561;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4562;

    public C1556(float f, float f2) {
        super(3);
        this.f4562 = f;
        this.f4561 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556)) {
            return false;
        }
        C1556 c1556 = (C1556) obj;
        return Float.compare(this.f4562, c1556.f4562) == 0 && Float.compare(this.f4561, c1556.f4561) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4561) + (Float.hashCode(this.f4562) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f4562);
        sb.append(", y=");
        return AbstractC0053.m155(sb, this.f4561, ')');
    }
}
