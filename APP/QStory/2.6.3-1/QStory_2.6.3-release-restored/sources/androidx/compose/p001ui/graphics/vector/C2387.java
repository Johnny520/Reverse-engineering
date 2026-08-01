package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2387 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4897;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4898;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4899;

    public C2387(float f, float f2, float f3, float f4) {
        super(2);
        this.f4899 = f;
        this.f4898 = f2;
        this.f4897 = f3;
        this.f4896 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2387)) {
            return false;
        }
        C2387 c2387 = (C2387) obj;
        return Float.compare(this.f4899, c2387.f4899) == 0 && Float.compare(this.f4898, c2387.f4898) == 0 && Float.compare(this.f4897, c2387.f4897) == 0 && Float.compare(this.f4896, c2387.f4896) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4896) + AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f4899) * 31, this.f4898, 31), this.f4897, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f4899);
        sb.append(", dy1=");
        sb.append(this.f4898);
        sb.append(", dx2=");
        sb.append(this.f4897);
        sb.append(", dy2=");
        return AbstractC0900.m715(sb, this.f4896, ')');
    }
}
