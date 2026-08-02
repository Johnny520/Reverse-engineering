package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q33 {

    /* JADX INFO: renamed from: a */
    public final C0690sd f8721a;

    /* JADX INFO: renamed from: b */
    public final us1 f8722b;

    public q33(C0690sd c0690sd, us1 us1Var) {
        this.f8721a = c0690sd;
        this.f8722b = us1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q33)) {
            return false;
        }
        q33 q33Var = (q33) obj;
        return t11.m5086l(this.f8721a, q33Var.f8721a) && this.f8722b.equals(q33Var.f8722b);
    }

    public final int hashCode() {
        return this.f8722b.hashCode() + (this.f8721a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f8721a) + ", offsetMapping=" + this.f8722b + ')';
    }
}
