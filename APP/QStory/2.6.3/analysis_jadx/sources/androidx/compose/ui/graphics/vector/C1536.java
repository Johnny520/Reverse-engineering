package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1536 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4461;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4462;

    public C1536(float f, float f2) {
        super(1);
        this.f4462 = f;
        this.f4461 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1536)) {
            return false;
        }
        C1536 c1536 = (C1536) obj;
        return Float.compare(this.f4462, c1536.f4462) == 0 && Float.compare(this.f4461, c1536.f4461) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4461) + (Float.hashCode(this.f4462) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f4462);
        sb.append(", dy=");
        return AbstractC0053.m155(sb, this.f4461, ')');
    }
}
