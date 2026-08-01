package p209;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7932 f21967 = new C7932(17, C7916.f21938, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f21968;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f21969;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21970;

    public C7932(int i, float f, int i2) {
        this.f21970 = f;
        this.f21969 = i;
        this.f21968 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7932)) {
            return false;
        }
        C7932 c7932 = (C7932) obj;
        float f = c7932.f21970;
        float f2 = C7916.f21939;
        return Float.compare(this.f21970, f) == 0 && this.f21969 == c7932.f21969 && this.f21968 == c7932.f21968;
    }

    public final int hashCode() {
        float f = C7916.f21939;
        return Integer.hashCode(this.f21968) + AbstractC0053.m143(this.f21969, Float.hashCode(this.f21970) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) C7916.m13384(this.f21970));
        sb.append(", trim=");
        String str = "Invalid";
        int i = this.f21969;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.f21968;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
