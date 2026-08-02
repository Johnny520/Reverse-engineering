package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c2 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ kt i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c2(kt ktVar, int i) {
        this.h = i;
        this.i = ktVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        t60 t60Var;
        int i = this.h;
        kt ktVar = this.i;
        switch (i) {
            case 0:
                my0 my0Var = (my0) p40.p(ktVar, ly0.a);
                if (my0Var == null) {
                    nz0.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + my0Var);
                }
                my0 my0Var2 = ktVar.D;
                ktVar.D = my0Var;
                if (my0Var2 != null && !t11.l(my0Var, my0Var2) && ((t60Var = ktVar.F) != null || !ktVar.M)) {
                    if (t60Var != null) {
                        ktVar.N0(t60Var);
                    }
                    ktVar.F = null;
                    ktVar.S0();
                }
                return a83.a;
            default:
                ktVar.B.a();
                return Boolean.TRUE;
        }
    }
}
