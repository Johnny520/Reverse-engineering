package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2371 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4807;

    public C2371(float f, float f2) {
        super(1);
        this.f4807 = f;
        this.f4806 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2371)) {
            return false;
        }
        C2371 c2371 = (C2371) obj;
        return Float.compare(this.f4807, c2371.f4807) == 0 && Float.compare(this.f4806, c2371.f4806) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4806) + (Float.hashCode(this.f4807) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f4807);
        sb.append(", dy=");
        return AbstractC0900.m715(sb, this.f4806, ')');
    }
}
