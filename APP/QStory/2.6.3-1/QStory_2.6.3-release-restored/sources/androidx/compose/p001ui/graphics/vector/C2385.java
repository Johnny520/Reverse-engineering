package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2385 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4887;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4889;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f4890;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f4891;

    public C2385(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f4889 = f;
        this.f4888 = f2;
        this.f4887 = f3;
        this.f4886 = f4;
        this.f4891 = f5;
        this.f4890 = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2385)) {
            return false;
        }
        C2385 c2385 = (C2385) obj;
        return Float.compare(this.f4889, c2385.f4889) == 0 && Float.compare(this.f4888, c2385.f4888) == 0 && Float.compare(this.f4887, c2385.f4887) == 0 && Float.compare(this.f4886, c2385.f4886) == 0 && Float.compare(this.f4891, c2385.f4891) == 0 && Float.compare(this.f4890, c2385.f4890) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4890) + AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f4889) * 31, this.f4888, 31), this.f4887, 31), this.f4886, 31), this.f4891, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f4889);
        sb.append(", dy1=");
        sb.append(this.f4888);
        sb.append(", dx2=");
        sb.append(this.f4887);
        sb.append(", dy2=");
        sb.append(this.f4886);
        sb.append(", dx3=");
        sb.append(this.f4891);
        sb.append(", dy3=");
        return AbstractC0900.m715(sb, this.f4890, ')');
    }
}
