package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e30 extends i01 {

    /* JADX INFO: renamed from: l */
    public final AbstractC0147dz f2301l;

    public e30(za2 za2Var, kt2 kt2Var, r72 r72Var, s72 s72Var, AbstractC0147dz abstractC0147dz) {
        super(za2Var, kt2Var, r72Var, s72Var);
        if (abstractC0147dz != null) {
            this.f2301l = abstractC0147dz;
        } else {
            um2.m5516f("cst == null");
            throw null;
        }
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: f */
    public String mo1217f() {
        return this.f2301l.mo23b();
    }
}
