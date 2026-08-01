package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2389 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4902;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4903;

    public C2389(float f, float f2) {
        super(3);
        this.f4903 = f;
        this.f4902 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2389)) {
            return false;
        }
        C2389 c2389 = (C2389) obj;
        return Float.compare(this.f4903, c2389.f4903) == 0 && Float.compare(this.f4902, c2389.f4902) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4902) + (Float.hashCode(this.f4903) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f4903);
        sb.append(", dy=");
        return AbstractC0900.m715(sb, this.f4902, ')');
    }
}
