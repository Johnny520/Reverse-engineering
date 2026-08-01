package p164;

import android.graphics.Insets;
import androidx.activity.AbstractC0053;
import androidx.core.os.AbstractC2175;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7664 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7664 f20811 = new C7664(0, 0, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f20812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20814;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f20815;

    public C7664(int i, int i2, int i3, int i4) {
        this.f20815 = i;
        this.f20814 = i2;
        this.f20813 = i3;
        this.f20812 = i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C7664 m12909(Insets insets) {
        return m12910(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7664 m12910(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f20811 : new C7664(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C7664 m12911(C7664 c7664, C7664 c76642) {
        return m12910(Math.min(c7664.f20815, c76642.f20815), Math.min(c7664.f20814, c76642.f20814), Math.min(c7664.f20813, c76642.f20813), Math.min(c7664.f20812, c76642.f20812));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7664 m12912(C7664 c7664, C7664 c76642) {
        return m12910(Math.max(c7664.f20815, c76642.f20815), Math.max(c7664.f20814, c76642.f20814), Math.max(c7664.f20813, c76642.f20813), Math.max(c7664.f20812, c76642.f20812));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7664.class != obj.getClass()) {
            return false;
        }
        C7664 c7664 = (C7664) obj;
        return this.f20812 == c7664.f20812 && this.f20815 == c7664.f20815 && this.f20813 == c7664.f20813 && this.f20814 == c7664.f20814;
    }

    public final int hashCode() {
        return (((((this.f20815 * 31) + this.f20814) * 31) + this.f20813) * 31) + this.f20812;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f20815);
        sb.append(", top=");
        sb.append(this.f20814);
        sb.append(", right=");
        sb.append(this.f20813);
        sb.append(", bottom=");
        return AbstractC0053.m154(sb, this.f20812, '}');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Insets m12913() {
        return AbstractC2175.m3961(this.f20815, this.f20814, this.f20813, this.f20812);
    }
}
