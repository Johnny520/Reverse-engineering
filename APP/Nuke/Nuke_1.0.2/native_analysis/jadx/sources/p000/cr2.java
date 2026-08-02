package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cr2 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f1700h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ dr2 f1701i;

    public cr2(dr2 dr2Var, boolean z) {
        this.f1701i = dr2Var;
        this.f1700h = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b93.m494a();
        f90 f90Var = this.f1701i.f2166a;
        boolean z = f90Var.f2862a;
        boolean z2 = this.f1700h;
        f90Var.f2862a = z2;
        if (z != z2) {
            ((br2) f90Var.f2863b).mo583a(z2);
        }
    }
}
