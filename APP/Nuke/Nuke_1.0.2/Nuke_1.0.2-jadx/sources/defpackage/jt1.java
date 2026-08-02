package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jt1 extends hm1 {
    public final fj d;
    public boolean e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jt1(fj fjVar, kt1 kt1Var) {
        boolean z = fjVar.b;
        this.a = kt1Var;
        this.b = z;
        this.d = fjVar;
        this.e = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hm1
    public final void a() {
        fj fjVar = this.d;
        switch (fjVar.d) {
            case 0:
                ((v3) fjVar.e).e();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hm1
    public final void b() {
        fj fjVar = this.d;
        switch (fjVar.d) {
            case 0:
                ((v3) fjVar.e).f();
                break;
            default:
                ((g8) fjVar.e).j(fjVar);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hm1
    public final void c(em1 em1Var) {
        dj djVar = new dj(em1Var);
        fj fjVar = this.d;
        switch (fjVar.d) {
            case 0:
                ((v3) fjVar.e).g(djVar);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hm1
    public final void d(em1 em1Var) {
        em1Var.getClass();
        new dj(em1Var);
        fj fjVar = this.d;
        switch (fjVar.d) {
            case 0:
                ((v3) fjVar.e).h();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(boolean z) {
        this.e = z;
        f(z && this.d.b);
    }
}
