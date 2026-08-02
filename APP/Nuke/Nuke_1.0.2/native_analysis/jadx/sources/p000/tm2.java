package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tm2 {

    /* JADX INFO: renamed from: a */
    public final sm2 f10849a;

    /* JADX INFO: renamed from: b */
    public final sm2 f10850b;

    /* JADX INFO: renamed from: c */
    public final boolean f10851c;

    public tm2(sm2 sm2Var, sm2 sm2Var2, boolean z) {
        this.f10849a = sm2Var;
        this.f10850b = sm2Var2;
        this.f10851c = z;
    }

    /* JADX INFO: renamed from: a */
    public static tm2 m5332a(tm2 tm2Var, sm2 sm2Var, sm2 sm2Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            sm2Var = tm2Var.f10849a;
        }
        if ((i & 2) != 0) {
            sm2Var2 = tm2Var.f10850b;
        }
        tm2Var.getClass();
        return new tm2(sm2Var, sm2Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm2)) {
            return false;
        }
        tm2 tm2Var = (tm2) obj;
        return t11.m5086l(this.f10849a, tm2Var.f10849a) && t11.m5086l(this.f10850b, tm2Var.f10850b) && this.f10851c == tm2Var.f10851c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10851c) + ((this.f10850b.hashCode() + (this.f10849a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f10849a + ", end=" + this.f10850b + ", handlesCrossed=" + this.f10851c + ')';
    }
}
