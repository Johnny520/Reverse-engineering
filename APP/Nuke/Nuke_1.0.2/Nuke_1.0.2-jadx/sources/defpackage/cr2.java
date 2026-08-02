package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cr2 implements Runnable {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ dr2 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cr2(dr2 dr2Var, boolean z) {
        this.i = dr2Var;
        this.h = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        b93.a();
        f90 f90Var = this.i.a;
        boolean z = f90Var.a;
        boolean z2 = this.h;
        f90Var.a = z2;
        if (z != z2) {
            ((br2) f90Var.b).a(z2);
        }
    }
}
