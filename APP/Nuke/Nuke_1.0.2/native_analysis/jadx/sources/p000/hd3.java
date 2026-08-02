package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hd3 {

    /* JADX INFO: renamed from: a */
    public final yi1 f3962a;

    /* JADX INFO: renamed from: b */
    public final Object f3963b;

    public hd3(yi1 yi1Var, Object obj) {
        this.f3962a = yi1Var;
        this.f3963b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd3)) {
            return false;
        }
        hd3 hd3Var = (hd3) obj;
        return this.f3962a.equals(hd3Var.f3962a) && this.f3963b.equals(hd3Var.f3963b);
    }

    public final int hashCode() {
        return this.f3963b.hashCode() + (this.f3962a.hashCode() * 31);
    }

    public final String toString() {
        return "WeMsgEvent(message=" + this.f3962a + ", rawMessage=" + this.f3963b + ")";
    }
}
