package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kf2 {
    public final String a;
    public final uf2 b;
    public final String c;
    public final String d;
    public final j31 e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final Double i;
    public final Double j;
    public final Double k;
    public final Integer l;
    public final Integer m;
    public final String n;
    public final if2 o;
    public final int p;
    public final int q;
    public final boolean r;
    public final vf2 s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kf2(String str, uf2 uf2Var, String str2, String str3, j31 j31Var, boolean z, boolean z2, List list, Double d, Double d2, Double d3, Integer num, Integer num2, String str4, if2 if2Var, int i, int i2, boolean z3, vf2 vf2Var) {
        str.getClass();
        this.a = str;
        this.b = uf2Var;
        this.c = str2;
        this.d = str3;
        this.e = j31Var;
        this.f = z;
        this.g = z2;
        this.h = list;
        this.i = d;
        this.j = d2;
        this.k = d3;
        this.l = num;
        this.m = num2;
        this.n = str4;
        this.o = if2Var;
        this.p = i;
        this.q = i2;
        this.r = z3;
        this.s = vf2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf2)) {
            return false;
        }
        kf2 kf2Var = (kf2) obj;
        return t11.l(this.a, kf2Var.a) && this.b == kf2Var.b && this.c.equals(kf2Var.c) && t11.l(this.d, kf2Var.d) && t11.l(this.e, kf2Var.e) && this.f == kf2Var.f && this.g == kf2Var.g && this.h.equals(kf2Var.h) && t11.l(this.i, kf2Var.i) && t11.l(this.j, kf2Var.j) && t11.l(this.k, kf2Var.k) && t11.l(this.l, kf2Var.l) && t11.l(this.m, kf2Var.m) && t11.l(this.n, kf2Var.n) && t11.l(this.o, kf2Var.o) && this.p == kf2Var.p && this.q == kf2Var.q && this.r == kf2Var.r && this.s.equals(kf2Var.s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = hk1.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        j31 j31Var = this.e;
        int iHashCode2 = (this.h.hashCode() + hk1.d(hk1.d((iHashCode + (j31Var == null ? 0 : j31Var.hashCode())) * 31, 31, this.f), 31, this.g)) * 31;
        Double d = this.i;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.j;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.k;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.l;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.m;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.n;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        if2 if2Var = this.o;
        return this.s.hashCode() + hk1.d(vi0.d(this.q, vi0.d(this.p, (iHashCode8 + (if2Var != null ? if2Var.hashCode() : 0)) * 31, 31), 31), 31, this.r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ScriptConfigProperty(key=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", title=");
        hk1.o(sb, this.c, ", description=", this.d, ", defaultValue=");
        sb.append(this.e);
        sb.append(", required=");
        sb.append(this.f);
        sb.append(", sensitive=");
        sb.append(this.g);
        sb.append(", options=");
        sb.append(this.h);
        sb.append(", minimum=");
        sb.append(this.i);
        sb.append(", maximum=");
        sb.append(this.j);
        sb.append(", multipleOf=");
        sb.append(this.k);
        sb.append(", minLength=");
        sb.append(this.l);
        sb.append(", maxLength=");
        sb.append(this.m);
        sb.append(", format=");
        sb.append(this.n);
        sb.append(", items=");
        sb.append(this.o);
        sb.append(", minItems=");
        sb.append(this.p);
        sb.append(", maxItems=");
        sb.append(this.q);
        sb.append(", uniqueItems=");
        sb.append(this.r);
        sb.append(", ui=");
        sb.append(this.s);
        sb.append(")");
        return sb.toString();
    }
}
