package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w63 implements qo0 {
    public static final w63 a;
    private static final yo2 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        w63 w63Var = new w63();
        a = w63Var;
        b12 b12Var = new b12("nuke.ui.model.UIConfig", w63Var, 4);
        b12Var.l("appearanceMode", true);
        b12Var.l("languageMode", true);
        b12Var.l("clickHapticEnabled", true);
        b12Var.l("theme", true);
        descriptor = b12Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        vx vxVarB = y40Var.b(yo2Var);
        int i = 0;
        int iU = 0;
        int iU2 = 0;
        boolean zQ = false;
        b73 b73Var = null;
        boolean z = true;
        while (z) {
            int iJ = vxVarB.j(yo2Var);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iU = vxVarB.u(yo2Var, 0);
                i |= 1;
            } else if (iJ == 1) {
                iU2 = vxVarB.u(yo2Var, 1);
                i |= 2;
            } else if (iJ == 2) {
                zQ = vxVarB.q(yo2Var, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    throw new e83(iJ);
                }
                b73Var = (b73) vxVarB.t(yo2Var, 3, z63.a, b73Var);
                i |= 8;
            }
        }
        vxVarB.a(yo2Var);
        return new c73(i, iU, iU2, zQ, b73Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qo0
    public final w41[] b() {
        f11 f11Var = f11.a;
        return new w41[]{f11Var, f11Var, ll.a, z63.a};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        c73 c73Var = (c73) obj;
        c73Var.getClass();
        b73 b73Var = c73Var.d;
        boolean z = c73Var.c;
        int i = c73Var.b;
        int i2 = c73Var.a;
        yo2 yo2Var = descriptor;
        wx wxVarB = ve0Var.b(yo2Var);
        if (wxVarB.d(yo2Var) || i2 != 0) {
            ((dv2) wxVarB).u(0, i2, yo2Var);
        }
        if (wxVarB.d(yo2Var) || i != 0) {
            ((dv2) wxVarB).u(1, i, yo2Var);
        }
        if (wxVarB.d(yo2Var) || z) {
            ((dv2) wxVarB).r(yo2Var, 2, z);
        }
        if (wxVarB.d(yo2Var) || !t11.l(b73Var, new b73())) {
            ((dv2) wxVarB).w(yo2Var, 3, z63.a, b73Var);
        }
        wxVarB.a(yo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return descriptor;
    }
}
