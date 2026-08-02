package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gb1 implements yo2 {

    /* JADX INFO: renamed from: a */
    public final yo2 f3385a;

    /* JADX INFO: renamed from: b */
    public final yo2 f3386b;

    public gb1(yo2 yo2Var, yo2 yo2Var2) {
        yo2Var.getClass();
        yo2Var2.getClass();
        this.f3385a = yo2Var;
        this.f3386b = yo2Var2;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: a */
    public final int mo249a(String str) {
        str.getClass();
        Integer numM6013e0 = wv2.m6013e0(str);
        if (numM6013e0 != null) {
            return numM6013e0.intValue();
        }
        C0676s.m4651j(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final String mo250b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: c */
    public final s11 mo251c() {
        return yv2.f13634i;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final int mo252d() {
        return 2;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final String mo253e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb1)) {
            return false;
        }
        gb1 gb1Var = (gb1) obj;
        return t11.m5086l(this.f3385a, gb1Var.f3385a) && t11.m5086l(this.f3386b, gb1Var.f3386b);
    }

    public final int hashCode() {
        return this.f3386b.hashCode() + ((this.f3385a.hashCode() + 710441009) * 31);
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: i */
    public final List mo255i(int i) {
        if (i >= 0) {
            return be0.f819h;
        }
        C0676s.m4645c(hk1.m2208g(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: j */
    public final yo2 mo256j(int i) {
        if (i < 0) {
            C0676s.m4645c(hk1.m2208g(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f3385a;
        }
        if (i2 == 1) {
            return this.f3386b;
        }
        C0676s.m4653l("Unreached");
        return null;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: k */
    public final boolean mo257k(int i) {
        if (i >= 0) {
            return false;
        }
        C0676s.m4645c(hk1.m2208g(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f3385a + ", " + this.f3386b + ')';
    }
}
