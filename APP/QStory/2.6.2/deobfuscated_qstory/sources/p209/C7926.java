package p209;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7926 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7926 f21954 = new C7926(1.0f, 0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f21955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21956;

    public C7926(float f, float f2) {
        this.f21956 = f;
        this.f21955 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7926)) {
            return false;
        }
        C7926 c7926 = (C7926) obj;
        return this.f21956 == c7926.f21956 && this.f21955 == c7926.f21955;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21955) + (Float.hashCode(this.f21956) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f21956);
        sb.append(", skewX=");
        return AbstractC0053.m157(sb, this.f21955, ')');
    }
}
