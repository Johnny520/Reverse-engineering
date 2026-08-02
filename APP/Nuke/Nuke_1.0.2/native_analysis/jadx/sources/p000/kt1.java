package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kt1 extends t11 {

    /* JADX INFO: renamed from: k */
    public final C0205fj f5766k;

    /* JADX INFO: renamed from: l */
    public final ia1 f5767l;

    public kt1(C0205fj c0205fj, ia1 ia1Var) {
        c0205fj.getClass();
        this.f5766k = c0205fj;
        this.f5767l = ia1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt1)) {
            return false;
        }
        kt1 kt1Var = (kt1) obj;
        return t11.m5086l(this.f5766k, kt1Var.f5766k) && t11.m5086l(this.f5767l, kt1Var.f5767l);
    }

    public final int hashCode() {
        int iHashCode = this.f5766k.hashCode() * 31;
        ia1 ia1Var = this.f5767l;
        return iHashCode + (ia1Var == null ? 0 : ia1Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f5766k + ", owner=" + this.f5767l + ')';
    }
}
