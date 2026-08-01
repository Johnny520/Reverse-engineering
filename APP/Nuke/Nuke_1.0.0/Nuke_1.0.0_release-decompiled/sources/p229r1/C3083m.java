package p229r1;

import android.graphics.Point;

/* JADX INFO: renamed from: r1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3083m {

    /* JADX INFO: renamed from: a */
    public final int f9799a;

    /* JADX INFO: renamed from: b */
    public final int f9800b;

    /* JADX INFO: renamed from: c */
    public final Point f9801c;

    public C3083m(int i5, int i6, Point point) {
        int i7 = point.x;
        int i8 = point.y;
        this.f9799a = i5;
        this.f9800b = i6;
        this.f9801c = new Point(i7, i8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3083m) {
            C3083m c3083m = (C3083m) obj;
            if (this.f9799a == c3083m.f9799a && this.f9800b == c3083m.f9800b && this.f9801c.equals(c3083m.f9801c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9801c.hashCode() + (((this.f9799a * 31) + this.f9800b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i5 = this.f9799a;
        sb.append(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.f9800b);
        sb.append(", center=");
        sb.append(this.f9801c);
        sb.append('}');
        return sb.toString();
    }
}
