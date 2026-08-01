package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class f71 {

    /* JADX INFO: renamed from: a */
    public final C0200f8 f1614a;

    /* JADX INFO: renamed from: b */
    public final s71 f1615b;

    /* JADX INFO: renamed from: c */
    public final List f1616c;

    /* JADX INFO: renamed from: d */
    public final int f1617d;

    /* JADX INFO: renamed from: e */
    public final boolean f1618e;

    /* JADX INFO: renamed from: f */
    public final int f1619f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0968ym f1620g;

    /* JADX INFO: renamed from: h */
    public final k50 f1621h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0369jv f1622i;

    /* JADX INFO: renamed from: j */
    public final long f1623j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f71(C0200f8 c0200f8, s71 s71Var, List list, int i, boolean z, int i2, InterfaceC0968ym interfaceC0968ym, k50 k50Var, InterfaceC0369jv interfaceC0369jv, long j) {
        this.f1614a = c0200f8;
        this.f1615b = s71Var;
        this.f1616c = list;
        this.f1617d = i;
        this.f1618e = z;
        this.f1619f = i2;
        this.f1620g = interfaceC0968ym;
        this.f1621h = k50Var;
        this.f1622i = interfaceC0369jv;
        this.f1623j = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f71)) {
            return false;
        }
        f71 f71Var = (f71) obj;
        return p30.m3002l(this.f1614a, f71Var.f1614a) && p30.m3002l(this.f1615b, f71Var.f1615b) && this.f1616c.equals(f71Var.f1616c) && this.f1617d == f71Var.f1617d && this.f1618e == f71Var.f1618e && this.f1619f == f71Var.f1619f && p30.m3002l(this.f1620g, f71Var.f1620g) && this.f1621h == f71Var.f1621h && p30.m3002l(this.f1622i, f71Var.f1622i) && C0617pj.m3131b(this.f1623j, f71Var.f1623j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f1623j) + ((this.f1622i.hashCode() + ((this.f1621h.hashCode() + ((this.f1620g.hashCode() + AbstractC0748t1.m4144b(this.f1619f, AbstractC0748t1.m4145c((((this.f1616c.hashCode() + AbstractC0748t1.m4147e(this.f1615b, this.f1614a.hashCode() * 31, 31)) * 31) + this.f1617d) * 31, 31, this.f1618e), 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f1614a);
        sb.append(", style=");
        sb.append(this.f1615b);
        sb.append(", placeholders=");
        sb.append(this.f1616c);
        sb.append(", maxLines=");
        sb.append(this.f1617d);
        sb.append(", softWrap=");
        sb.append(this.f1618e);
        sb.append(", overflow=");
        int i = this.f1619f;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f1620g);
        sb.append(", layoutDirection=");
        sb.append(this.f1621h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f1622i);
        sb.append(", constraints=");
        sb.append((Object) C0617pj.m3140k(this.f1623j));
        sb.append(')');
        return sb.toString();
    }
}
