package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vg1 {

    /* JADX INFO: renamed from: a */
    public final a63 f11945a;

    /* JADX INFO: renamed from: b */
    public final a63 f11946b;

    /* JADX INFO: renamed from: c */
    public final String f11947c;

    /* JADX INFO: renamed from: d */
    public final e63 f11948d;

    /* JADX INFO: renamed from: e */
    public final n30 f11949e;

    public vg1(a63 a63Var, a63 a63Var2, String str, e63 e63Var) {
        if (a63Var2 == null || str == null) {
            throw null;
        }
        this.f11945a = a63Var;
        this.f11946b = a63Var2;
        this.f11947c = str;
        this.f11948d = e63Var;
        this.f11949e = new n30(a63Var.f97c, new o30(new q30(str), new q30(m5673a(false))));
    }

    /* JADX INFO: renamed from: a */
    public final String m5673a(boolean z) {
        StringBuilder sb = new StringBuilder("(");
        if (z) {
            sb.append(this.f11945a.f95a);
        }
        for (a63 a63Var : this.f11948d.f2329a) {
            sb.append(a63Var.f95a);
        }
        sb.append(")");
        sb.append(this.f11946b.f95a);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vg1)) {
            return false;
        }
        vg1 vg1Var = (vg1) obj;
        return vg1Var.f11945a.equals(this.f11945a) && vg1Var.f11947c.equals(this.f11947c) && vg1Var.f11948d.equals(this.f11948d) && vg1Var.f11946b.equals(this.f11946b);
    }

    public final int hashCode() {
        return this.f11946b.f95a.hashCode() + ((Arrays.hashCode(this.f11948d.f2329a) + hk1.m2207f(this.f11947c, hk1.m2207f(this.f11945a.f95a, 527, 31), 31)) * 31);
    }

    public final String toString() {
        return this.f11945a + "." + this.f11947c + "(" + this.f11948d + ")";
    }
}
