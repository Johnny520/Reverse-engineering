package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zr1 implements w41 {

    /* JADX INFO: renamed from: a */
    public final w41 f14073a;

    /* JADX INFO: renamed from: b */
    public final zo2 f14074b;

    public zr1(w41 w41Var) {
        w41Var.getClass();
        this.f14073a = w41Var;
        this.f14074b = new zo2(w41Var.mo168e());
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        if (y40Var.mo899g()) {
            return y40Var.mo896c(this.f14073a);
        }
        return null;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        if (obj != null) {
            ve0Var.mo1180e(this.f14073a, obj);
        } else {
            ve0Var.mo1178c();
        }
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return this.f14074b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zr1.class == obj.getClass() && t11.m5086l(this.f14073a, ((zr1) obj).f14073a);
    }

    public final int hashCode() {
        return this.f14073a.hashCode();
    }
}
