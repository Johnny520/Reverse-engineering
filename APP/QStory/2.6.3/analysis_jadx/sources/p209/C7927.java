package p209;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7927 f21951 = new C7927(1.0f, 0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f21952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21953;

    public C7927(float f, float f2) {
        this.f21953 = f;
        this.f21952 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7927)) {
            return false;
        }
        C7927 c7927 = (C7927) obj;
        return this.f21953 == c7927.f21953 && this.f21952 == c7927.f21952;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21952) + (Float.hashCode(this.f21953) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f21953);
        sb.append(", skewX=");
        return AbstractC0053.m155(sb, this.f21952, ')');
    }
}
