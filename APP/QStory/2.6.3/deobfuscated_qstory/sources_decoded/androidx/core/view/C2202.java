package androidx.core.view;

import android.graphics.Point;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2202 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Point f6480;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6481;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6482;

    public C2202(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f6482 = i;
        this.f6481 = i2;
        this.f6480 = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2202) {
            C2202 c2202 = (C2202) obj;
            if (this.f6482 == c2202.f6482 && this.f6481 == c2202.f6481 && this.f6480.equals(c2202.f6480)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6480.hashCode() + (((this.f6482 * 31) + this.f6481) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f6482;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.f6481);
        sb.append(", center=");
        sb.append(this.f6480);
        sb.append('}');
        return sb.toString();
    }
}
