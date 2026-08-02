package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rb1 implements yo2 {

    /* JADX INFO: renamed from: a */
    public final yo2 f9498a;

    public rb1(yo2 yo2Var) {
        this.f9498a = yo2Var;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: a */
    public final int mo249a(String str) {
        str.getClass();
        Integer numM6013e0 = wv2.m6013e0(str);
        if (numM6013e0 != null) {
            return numM6013e0.intValue();
        }
        C0676s.m4651j(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: c */
    public final s11 mo251c() {
        return yv2.f13633h;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final int mo252d() {
        return 1;
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
        if (!(obj instanceof rb1)) {
            return false;
        }
        rb1 rb1Var = (rb1) obj;
        return t11.m5086l(this.f9498a, rb1Var.f9498a) && t11.m5086l(mo250b(), rb1Var.mo250b());
    }

    public final int hashCode() {
        return mo250b().hashCode() + (this.f9498a.hashCode() * 31);
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: i */
    public final List mo255i(int i) {
        if (i >= 0) {
            return be0.f819h;
        }
        c80.m674r(vi0.m5695n(i, "Illegal index ", ", "), mo250b(), " expects only non-negative indices");
        return null;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: j */
    public final yo2 mo256j(int i) {
        if (i >= 0) {
            return this.f9498a;
        }
        c80.m674r(vi0.m5695n(i, "Illegal index ", ", "), mo250b(), " expects only non-negative indices");
        return null;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: k */
    public final boolean mo257k(int i) {
        if (i >= 0) {
            return false;
        }
        c80.m674r(vi0.m5695n(i, "Illegal index ", ", "), mo250b(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return mo250b() + '(' + this.f9498a + ')';
    }
}
