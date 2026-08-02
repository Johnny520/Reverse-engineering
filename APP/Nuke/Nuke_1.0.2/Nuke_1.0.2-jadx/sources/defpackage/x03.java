package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x03 {
    public final sd a;
    public final m13 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final e70 g;
    public final d61 h;
    public final xl0 i;
    public final long j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x03(sd sdVar, m13 m13Var, List list, int i, boolean z, int i2, e70 e70Var, d61 d61Var, xl0 xl0Var, long j) {
        this.a = sdVar;
        this.b = m13Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = e70Var;
        this.h = d61Var;
        this.i = xl0Var;
        this.j = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x03)) {
            return false;
        }
        x03 x03Var = (x03) obj;
        return t11.l(this.a, x03Var.a) && t11.l(this.b, x03Var.b) && t11.l(this.c, x03Var.c) && this.d == x03Var.d && this.e == x03Var.e && this.f == x03Var.f && t11.l(this.g, x03Var.g) && this.h == x03Var.h && t11.l(this.i, x03Var.i) && fz.b(this.j, x03Var.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + vi0.d(this.f, hk1.d((((this.c.hashCode() + hk1.e(this.b, this.a.hashCode() * 31, 31)) * 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) fz.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}
