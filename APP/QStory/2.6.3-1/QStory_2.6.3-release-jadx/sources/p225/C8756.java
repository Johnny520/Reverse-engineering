package p225;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8756 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8756 f22296 = new C8756(1.0f, 0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f22297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f22298;

    public C8756(float f, float f2) {
        this.f22298 = f;
        this.f22297 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8756)) {
            return false;
        }
        C8756 c8756 = (C8756) obj;
        return this.f22298 == c8756.f22298 && this.f22297 == c8756.f22297;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22297) + (Float.hashCode(this.f22298) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f22298);
        sb.append(", skewX=");
        return AbstractC0900.m715(sb, this.f22297, ')');
    }
}
