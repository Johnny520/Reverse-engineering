package p180;

import android.graphics.Insets;
import androidx.activity.AbstractC0900;
import androidx.core.os.AbstractC3008;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8494 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8494 f21151 = new C8494(0, 0, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f21152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f21153;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f21154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21155;

    public C8494(int i, int i2, int i3, int i4) {
        this.f21155 = i;
        this.f21154 = i2;
        this.f21153 = i3;
        this.f21152 = i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C8494 m13497(Insets insets) {
        return m13498(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C8494 m13498(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f21151 : new C8494(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C8494 m13499(C8494 c8494, C8494 c84942) {
        return m13498(Math.min(c8494.f21155, c84942.f21155), Math.min(c8494.f21154, c84942.f21154), Math.min(c8494.f21153, c84942.f21153), Math.min(c8494.f21152, c84942.f21152));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8494 m13500(C8494 c8494, C8494 c84942) {
        return m13498(Math.max(c8494.f21155, c84942.f21155), Math.max(c8494.f21154, c84942.f21154), Math.max(c8494.f21153, c84942.f21153), Math.max(c8494.f21152, c84942.f21152));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8494.class != obj.getClass()) {
            return false;
        }
        C8494 c8494 = (C8494) obj;
        return this.f21152 == c8494.f21152 && this.f21155 == c8494.f21155 && this.f21153 == c8494.f21153 && this.f21154 == c8494.f21154;
    }

    public final int hashCode() {
        return (((((this.f21155 * 31) + this.f21154) * 31) + this.f21153) * 31) + this.f21152;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f21155);
        sb.append(", top=");
        sb.append(this.f21154);
        sb.append(", right=");
        sb.append(this.f21153);
        sb.append(", bottom=");
        return AbstractC0900.m716(sb, this.f21152, '}');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Insets m13501() {
        return AbstractC3008.m4531(this.f21155, this.f21154, this.f21153, this.f21152);
    }
}
