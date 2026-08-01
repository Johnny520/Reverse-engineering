package p000;

import android.graphics.Point;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class cw0 {

    /* JADX INFO: renamed from: a */
    public final int f904a;

    /* JADX INFO: renamed from: b */
    public final int f905b;

    /* JADX INFO: renamed from: c */
    public final Point f906c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cw0(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f904a = i;
        this.f905b = i2;
        this.f906c = new Point(i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cw0) {
            cw0 cw0Var = (cw0) obj;
            if (this.f904a == cw0Var.f904a && this.f905b == cw0Var.f905b && this.f906c.equals(cw0Var.f906c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f906c.hashCode() + (((this.f904a * 31) + this.f905b) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f904a;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.f905b);
        sb.append(", center=");
        sb.append(this.f906c);
        sb.append('}');
        return sb.toString();
    }
}
