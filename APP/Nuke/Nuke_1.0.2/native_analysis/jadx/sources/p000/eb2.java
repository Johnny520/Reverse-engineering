package p000;

import android.graphics.Point;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eb2 {

    /* JADX INFO: renamed from: a */
    public final int f2381a;

    /* JADX INFO: renamed from: b */
    public final int f2382b;

    /* JADX INFO: renamed from: c */
    public final Point f2383c;

    public eb2(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f2381a = i;
        this.f2382b = i2;
        this.f2383c = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eb2) {
            eb2 eb2Var = (eb2) obj;
            if (this.f2381a == eb2Var.f2381a && this.f2382b == eb2Var.f2382b && this.f2383c.equals(eb2Var.f2383c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2383c.hashCode() + (((this.f2381a * 31) + this.f2382b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f2381a;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.f2382b);
        sb.append(", center=");
        sb.append(this.f2383c);
        sb.append('}');
        return sb.toString();
    }
}
