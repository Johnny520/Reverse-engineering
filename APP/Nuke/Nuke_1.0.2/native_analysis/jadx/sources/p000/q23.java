package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q23 extends hd2 implements Runnable {

    /* JADX INFO: renamed from: l */
    public final long f8711l;

    public q23(long j, u00 u00Var) {
        super(u00Var, u00Var.mo2508f());
        this.f8711l = j;
    }

    @Override // p000.r21
    /* JADX INFO: renamed from: V */
    public final String mo4047V() {
        return super.mo4047V() + "(timeMillis=" + this.f8711l + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        a20 a20Var = this.f7930j;
        AbstractC0179eu.m1430K(a20Var);
        if (a20Var.mo15o(f20.f2746i) != null) {
            c80.m664g();
            return;
        }
        m4326z(new p23("Timed out waiting for " + this.f8711l + " ms", this));
    }
}
