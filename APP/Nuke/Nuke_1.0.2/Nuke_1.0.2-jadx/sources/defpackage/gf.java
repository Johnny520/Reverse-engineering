package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gf implements mn0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ c73 i;
    public final /* synthetic */ in0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gf(in0 in0Var, c73 c73Var) {
        this.j = in0Var;
        this.i = c73Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        eb ebVar = nx.a;
        in0 in0Var = this.j;
        c73 c73Var = this.i;
        switch (i) {
            case 0:
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(1 & iIntValue, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    String strP = rg3.P(R.string.home_settings_click_haptic, go0Var);
                    String strP2 = rg3.P(R.string.home_settings_click_haptic_subtitle, go0Var);
                    kw kwVarI0 = xe1.i0(-136923485, new gf(c73Var, in0Var), go0Var);
                    boolean zF = go0Var.f(in0Var) | go0Var.h(c73Var);
                    Object objL = go0Var.L();
                    if (zF || objL == ebVar) {
                        objL = new r1(4, in0Var, c73Var);
                        go0Var.f0(objL);
                    }
                    sp0.g(strP, null, strP2, null, kwVarI0, null, false, (xm0) objL, null, go0Var, 24576, 362);
                }
                break;
            default:
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    go0Var2.R();
                } else {
                    boolean z = c73Var.c;
                    boolean zF2 = go0Var2.f(in0Var) | go0Var2.h(c73Var);
                    Object objL2 = go0Var2.L();
                    if (zF2 || objL2 == ebVar) {
                        objL2 = new hf(in0Var, c73Var, 2);
                        go0Var2.f0(objL2);
                    }
                    sp0.i(z, (in0) objL2, null, false, 0, go0Var2, 0, 60);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ gf(c73 c73Var, in0 in0Var) {
        this.i = c73Var;
        this.j = in0Var;
    }
}
