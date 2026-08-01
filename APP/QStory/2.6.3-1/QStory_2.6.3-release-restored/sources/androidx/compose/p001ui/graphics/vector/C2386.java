package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2386 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4892;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4893;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4894;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4895;

    public C2386(float f, float f2, float f3, float f4) {
        super(1);
        this.f4895 = f;
        this.f4894 = f2;
        this.f4893 = f3;
        this.f4892 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2386)) {
            return false;
        }
        C2386 c2386 = (C2386) obj;
        return Float.compare(this.f4895, c2386.f4895) == 0 && Float.compare(this.f4894, c2386.f4894) == 0 && Float.compare(this.f4893, c2386.f4893) == 0 && Float.compare(this.f4892, c2386.f4892) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4892) + AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f4895) * 31, this.f4894, 31), this.f4893, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f4895);
        sb.append(", dy1=");
        sb.append(this.f4894);
        sb.append(", dx2=");
        sb.append(this.f4893);
        sb.append(", dy2=");
        return AbstractC0900.m715(sb, this.f4892, ')');
    }
}
