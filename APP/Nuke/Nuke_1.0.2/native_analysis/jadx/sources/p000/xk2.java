package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xk2 {

    /* JADX INFO: renamed from: a */
    public final String f13068a;

    /* JADX INFO: renamed from: b */
    public final wk2 f13069b;

    public xk2(String str, wk2 wk2Var) {
        this.f13068a = str;
        this.f13069b = wk2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk2)) {
            return false;
        }
        xk2 xk2Var = (xk2) obj;
        return this.f13068a.equals(xk2Var.f13068a) && this.f13069b == xk2Var.f13069b;
    }

    public final int hashCode() {
        return this.f13069b.hashCode() + (this.f13068a.hashCode() * 31);
    }

    public final String toString() {
        return "ScriptToastRequest(message=" + this.f13068a + ", duration=" + this.f13069b + ")";
    }
}
