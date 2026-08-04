package yyds;

import android.graphics.Point;

/* JADX INFO: renamed from: yyds.ᛷᛲᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1489 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f7033;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f7034;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Point f7035;

    public C1489(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f7033 = i;
        this.f7034 = i2;
        this.f7035 = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1489)) {
            return false;
        }
        C1489 c1489 = (C1489) obj;
        return this.f7033 == c1489.f7033 && this.f7034 == c1489.f7034 && this.f7035.equals(c1489.f7035);
    }

    public final int hashCode() {
        return this.f7035.hashCode() + (((this.f7033 * 31) + this.f7034) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f7033;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.f7034);
        sb.append(", center=");
        sb.append(this.f7035);
        sb.append('}');
        return sb.toString();
    }
}
