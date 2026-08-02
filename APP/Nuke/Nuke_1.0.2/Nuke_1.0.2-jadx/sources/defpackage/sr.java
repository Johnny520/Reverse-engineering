package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sr implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ in0 i;
    public final /* synthetic */ boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ sr(in0 in0Var, boolean z) {
        this.h = 1;
        this.i = in0Var;
        this.j = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        int i2 = 2;
        switch (i) {
            case 0:
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(1 & iIntValue, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    sp0.i(this.j, this.i, fg1.G(rh1.a, 0.0f, 0.0f, 14.0f, 0.0f, 11), false, 0, go0Var, 384, 56);
                }
                break;
            case 1:
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    go0Var2.R();
                } else {
                    String strP = rg3.P(R.string.home_settings_safety_mode, go0Var2);
                    String strP2 = rg3.P(R.string.home_settings_safety_mode_description, go0Var2);
                    kw kwVar = sp0.d;
                    in0 in0Var = this.i;
                    boolean z = this.j;
                    kw kwVarI0 = xe1.i0(842521472, new sr(i2, in0Var, z), go0Var2);
                    boolean zF = go0Var2.f(in0Var) | go0Var2.g(z);
                    Object objL = go0Var2.L();
                    if (zF || objL == nx.a) {
                        objL = new qh(4, in0Var, z);
                        go0Var2.f0(objL);
                    }
                    sp0.g(strP, null, strP2, kwVar, kwVarI0, null, false, (xm0) objL, null, go0Var2, 27648, 354);
                }
                break;
            default:
                px pxVar3 = (px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    go0Var3.R();
                } else {
                    sp0.i(this.j, this.i, null, false, 0, go0Var3, 0, 60);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ sr(int i, in0 in0Var, boolean z) {
        this.h = i;
        this.j = z;
        this.i = in0Var;
    }
}
