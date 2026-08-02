package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ps0 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ qs0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ps0(qs0 qs0Var, int i) {
        this.h = i;
        this.i = qs0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        a83 a83Var = a83.a;
        qs0 qs0Var = this.i;
        switch (i) {
            case 0:
                if (qs0Var.C == null) {
                    nz0.b("Font resolution state is not set.");
                    s.b();
                }
                break;
            default:
                if (qs0Var.C == null) {
                    nz0.b("Font resolution state is not set.");
                    s.b();
                }
                break;
        }
        return null;
    }
}
