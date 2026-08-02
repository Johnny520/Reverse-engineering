package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x03 {

    /* JADX INFO: renamed from: a */
    public final C0690sd f12754a;

    /* JADX INFO: renamed from: b */
    public final m13 f12755b;

    /* JADX INFO: renamed from: c */
    public final List f12756c;

    /* JADX INFO: renamed from: d */
    public final int f12757d;

    /* JADX INFO: renamed from: e */
    public final boolean f12758e;

    /* JADX INFO: renamed from: f */
    public final int f12759f;

    /* JADX INFO: renamed from: g */
    public final e70 f12760g;

    /* JADX INFO: renamed from: h */
    public final d61 f12761h;

    /* JADX INFO: renamed from: i */
    public final xl0 f12762i;

    /* JADX INFO: renamed from: j */
    public final long f12763j;

    public x03(C0690sd c0690sd, m13 m13Var, List list, int i, boolean z, int i2, e70 e70Var, d61 d61Var, xl0 xl0Var, long j) {
        this.f12754a = c0690sd;
        this.f12755b = m13Var;
        this.f12756c = list;
        this.f12757d = i;
        this.f12758e = z;
        this.f12759f = i2;
        this.f12760g = e70Var;
        this.f12761h = d61Var;
        this.f12762i = xl0Var;
        this.f12763j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x03)) {
            return false;
        }
        x03 x03Var = (x03) obj;
        return t11.m5086l(this.f12754a, x03Var.f12754a) && t11.m5086l(this.f12755b, x03Var.f12755b) && t11.m5086l(this.f12756c, x03Var.f12756c) && this.f12757d == x03Var.f12757d && this.f12758e == x03Var.f12758e && this.f12759f == x03Var.f12759f && t11.m5086l(this.f12760g, x03Var.f12760g) && this.f12761h == x03Var.f12761h && t11.m5086l(this.f12762i, x03Var.f12762i) && C0221fz.m1757b(this.f12763j, x03Var.f12763j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f12763j) + ((this.f12762i.hashCode() + ((this.f12761h.hashCode() + ((this.f12760g.hashCode() + vi0.m5685d(this.f12759f, hk1.m2205d((((this.f12756c.hashCode() + hk1.m2206e(this.f12755b, this.f12754a.hashCode() * 31, 31)) * 31) + this.f12757d) * 31, 31, this.f12758e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f12754a);
        sb.append(", style=");
        sb.append(this.f12755b);
        sb.append(", placeholders=");
        sb.append(this.f12756c);
        sb.append(", maxLines=");
        sb.append(this.f12757d);
        sb.append(", softWrap=");
        sb.append(this.f12758e);
        sb.append(", overflow=");
        int i = this.f12759f;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f12760g);
        sb.append(", layoutDirection=");
        sb.append(this.f12761h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f12762i);
        sb.append(", constraints=");
        sb.append((Object) C0221fz.m1766k(this.f12763j));
        sb.append(')');
        return sb.toString();
    }
}
