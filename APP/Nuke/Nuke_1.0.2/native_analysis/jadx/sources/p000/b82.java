package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b82 extends AbstractC0602q2 implements d20 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0110cy f736i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ c82 f737j;

    /* JADX WARN: Illegal instructions before constructor call */
    public b82(C0110cy c0110cy, c82 c82Var) {
        gd3 gd3Var = gd3.f3439q;
        this.f736i = c0110cy;
        this.f737j = c82Var;
        super(gd3Var);
    }

    @Override // p000.d20
    /* JADX INFO: renamed from: p */
    public final void mo490p(a20 a20Var, Throwable th) throws Throwable {
        C0110cy c0110cy = this.f736i;
        c82 c82Var = this.f737j;
        AbstractC0691se.m4829R(th, new C0640r1(12, c0110cy, c82Var));
        d20 d20Var = (d20) c82Var.f1233h.mo15o(gd3.f3439q);
        if (d20Var == null) {
            throw th;
        }
        d20Var.mo490p(a20Var, th);
    }
}
