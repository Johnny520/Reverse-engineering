package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e30 extends i01 {
    public final dz l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e30(za2 za2Var, kt2 kt2Var, r72 r72Var, s72 s72Var, dz dzVar) {
        super(za2Var, kt2Var, r72Var, s72Var);
        if (dzVar != null) {
            this.l = dzVar;
        } else {
            um2.f("cst == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i01
    public String f() {
        return this.l.b();
    }
}
