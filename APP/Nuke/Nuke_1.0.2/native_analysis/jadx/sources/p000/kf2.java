package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kf2 {

    /* JADX INFO: renamed from: a */
    public final String f5499a;

    /* JADX INFO: renamed from: b */
    public final uf2 f5500b;

    /* JADX INFO: renamed from: c */
    public final String f5501c;

    /* JADX INFO: renamed from: d */
    public final String f5502d;

    /* JADX INFO: renamed from: e */
    public final j31 f5503e;

    /* JADX INFO: renamed from: f */
    public final boolean f5504f;

    /* JADX INFO: renamed from: g */
    public final boolean f5505g;

    /* JADX INFO: renamed from: h */
    public final List f5506h;

    /* JADX INFO: renamed from: i */
    public final Double f5507i;

    /* JADX INFO: renamed from: j */
    public final Double f5508j;

    /* JADX INFO: renamed from: k */
    public final Double f5509k;

    /* JADX INFO: renamed from: l */
    public final Integer f5510l;

    /* JADX INFO: renamed from: m */
    public final Integer f5511m;

    /* JADX INFO: renamed from: n */
    public final String f5512n;

    /* JADX INFO: renamed from: o */
    public final if2 f5513o;

    /* JADX INFO: renamed from: p */
    public final int f5514p;

    /* JADX INFO: renamed from: q */
    public final int f5515q;

    /* JADX INFO: renamed from: r */
    public final boolean f5516r;

    /* JADX INFO: renamed from: s */
    public final vf2 f5517s;

    public kf2(String str, uf2 uf2Var, String str2, String str3, j31 j31Var, boolean z, boolean z2, List list, Double d, Double d2, Double d3, Integer num, Integer num2, String str4, if2 if2Var, int i, int i2, boolean z3, vf2 vf2Var) {
        str.getClass();
        this.f5499a = str;
        this.f5500b = uf2Var;
        this.f5501c = str2;
        this.f5502d = str3;
        this.f5503e = j31Var;
        this.f5504f = z;
        this.f5505g = z2;
        this.f5506h = list;
        this.f5507i = d;
        this.f5508j = d2;
        this.f5509k = d3;
        this.f5510l = num;
        this.f5511m = num2;
        this.f5512n = str4;
        this.f5513o = if2Var;
        this.f5514p = i;
        this.f5515q = i2;
        this.f5516r = z3;
        this.f5517s = vf2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf2)) {
            return false;
        }
        kf2 kf2Var = (kf2) obj;
        return t11.m5086l(this.f5499a, kf2Var.f5499a) && this.f5500b == kf2Var.f5500b && this.f5501c.equals(kf2Var.f5501c) && t11.m5086l(this.f5502d, kf2Var.f5502d) && t11.m5086l(this.f5503e, kf2Var.f5503e) && this.f5504f == kf2Var.f5504f && this.f5505g == kf2Var.f5505g && this.f5506h.equals(kf2Var.f5506h) && t11.m5086l(this.f5507i, kf2Var.f5507i) && t11.m5086l(this.f5508j, kf2Var.f5508j) && t11.m5086l(this.f5509k, kf2Var.f5509k) && t11.m5086l(this.f5510l, kf2Var.f5510l) && t11.m5086l(this.f5511m, kf2Var.f5511m) && t11.m5086l(this.f5512n, kf2Var.f5512n) && t11.m5086l(this.f5513o, kf2Var.f5513o) && this.f5514p == kf2Var.f5514p && this.f5515q == kf2Var.f5515q && this.f5516r == kf2Var.f5516r && this.f5517s.equals(kf2Var.f5517s);
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f5501c, (this.f5500b.hashCode() + (this.f5499a.hashCode() * 31)) * 31, 31);
        String str = this.f5502d;
        int iHashCode = (iM2207f + (str == null ? 0 : str.hashCode())) * 31;
        j31 j31Var = this.f5503e;
        int iHashCode2 = (this.f5506h.hashCode() + hk1.m2205d(hk1.m2205d((iHashCode + (j31Var == null ? 0 : j31Var.hashCode())) * 31, 31, this.f5504f), 31, this.f5505g)) * 31;
        Double d = this.f5507i;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f5508j;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f5509k;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f5510l;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5511m;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f5512n;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        if2 if2Var = this.f5513o;
        return this.f5517s.hashCode() + hk1.m2205d(vi0.m5685d(this.f5515q, vi0.m5685d(this.f5514p, (iHashCode8 + (if2Var != null ? if2Var.hashCode() : 0)) * 31, 31), 31), 31, this.f5516r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScriptConfigProperty(key=");
        sb.append(this.f5499a);
        sb.append(", type=");
        sb.append(this.f5500b);
        sb.append(", title=");
        hk1.m2216o(sb, this.f5501c, ", description=", this.f5502d, ", defaultValue=");
        sb.append(this.f5503e);
        sb.append(", required=");
        sb.append(this.f5504f);
        sb.append(", sensitive=");
        sb.append(this.f5505g);
        sb.append(", options=");
        sb.append(this.f5506h);
        sb.append(", minimum=");
        sb.append(this.f5507i);
        sb.append(", maximum=");
        sb.append(this.f5508j);
        sb.append(", multipleOf=");
        sb.append(this.f5509k);
        sb.append(", minLength=");
        sb.append(this.f5510l);
        sb.append(", maxLength=");
        sb.append(this.f5511m);
        sb.append(", format=");
        sb.append(this.f5512n);
        sb.append(", items=");
        sb.append(this.f5513o);
        sb.append(", minItems=");
        sb.append(this.f5514p);
        sb.append(", maxItems=");
        sb.append(this.f5515q);
        sb.append(", uniqueItems=");
        sb.append(this.f5516r);
        sb.append(", ui=");
        sb.append(this.f5517s);
        sb.append(")");
        return sb.toString();
    }
}
