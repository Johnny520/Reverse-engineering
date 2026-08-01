package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2395 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4924;

    public C2395(float f, float f2, float f3, float f4) {
        super(2);
        this.f4924 = f;
        this.f4923 = f2;
        this.f4922 = f3;
        this.f4921 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2395)) {
            return false;
        }
        C2395 c2395 = (C2395) obj;
        return Float.compare(this.f4924, c2395.f4924) == 0 && Float.compare(this.f4923, c2395.f4923) == 0 && Float.compare(this.f4922, c2395.f4922) == 0 && Float.compare(this.f4921, c2395.f4921) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4921) + AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f4924) * 31, this.f4923, 31), this.f4922, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f4924);
        sb.append(", y1=");
        sb.append(this.f4923);
        sb.append(", x2=");
        sb.append(this.f4922);
        sb.append(", y2=");
        return AbstractC0900.m715(sb, this.f4921, ')');
    }
}
