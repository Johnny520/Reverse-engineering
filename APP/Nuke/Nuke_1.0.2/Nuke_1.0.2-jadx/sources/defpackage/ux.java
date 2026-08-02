package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ux extends ox {
    public final u21 j;
    public int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ux(dk dkVar, u21 u21Var) {
        super(dkVar);
        this.j = u21Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ox
    public final void a() {
        this.h = true;
        this.k++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ox
    public final void b() {
        this.h = false;
        dk dkVar = (dk) this.i;
        dkVar.w("\n");
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.j.a.d;
            str.getClass();
            dkVar.w(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ox
    public final void c() {
        if (this.h) {
            this.h = false;
        } else {
            b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ox
    public final void k() {
        e(' ');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ox
    public final void m() {
        this.k--;
    }
}
