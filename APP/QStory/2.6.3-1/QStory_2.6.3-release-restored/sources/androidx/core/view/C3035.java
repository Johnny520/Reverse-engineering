package androidx.core.view;

import android.graphics.Point;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3035 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Point f6825;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6826;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6827;

    public C3035(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f6827 = i;
        this.f6826 = i2;
        this.f6825 = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3035) {
            C3035 c3035 = (C3035) obj;
            if (this.f6827 == c3035.f6827 && this.f6826 == c3035.f6826 && this.f6825.equals(c3035.f6825)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6825.hashCode() + (((this.f6827 * 31) + this.f6826) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f6827;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.f6826);
        sb.append(", center=");
        sb.append(this.f6825);
        sb.append('}');
        return sb.toString();
    }
}
