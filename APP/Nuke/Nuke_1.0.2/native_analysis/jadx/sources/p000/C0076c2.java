package p000;

/* JADX INFO: renamed from: c2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0076c2 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1107h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0399kt f1108i;

    public /* synthetic */ C0076c2(C0399kt c0399kt, int i) {
        this.f1107h = i;
        this.f1108i = c0399kt;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        t60 t60Var;
        int i = this.f1107h;
        C0399kt c0399kt = this.f1108i;
        switch (i) {
            case 0:
                my0 my0Var = (my0) p40.m3733p(c0399kt, ly0.f6399a);
                if (my0Var == null) {
                    nz0.m3456a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + my0Var);
                }
                my0 my0Var2 = c0399kt.f5747D;
                c0399kt.f5747D = my0Var;
                if (my0Var2 != null && !t11.m5086l(my0Var, my0Var2) && ((t60Var = c0399kt.f5749F) != null || !c0399kt.f5756M)) {
                    if (t60Var != null) {
                        c0399kt.m5469N0(t60Var);
                    }
                    c0399kt.f5749F = null;
                    c0399kt.m2737S0();
                }
                return a83.f116a;
            default:
                c0399kt.f5745B.mo6a();
                return Boolean.TRUE;
        }
    }
}
