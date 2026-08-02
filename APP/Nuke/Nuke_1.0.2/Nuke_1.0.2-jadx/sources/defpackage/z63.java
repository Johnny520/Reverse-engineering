package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z63 implements qo0 {
    public static final z63 a;
    private static final yo2 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        z63 z63Var = new z63();
        a = z63Var;
        b12 b12Var = new b12("nuke.ui.model.UIConfig.ThemeConfig", z63Var, 2);
        b12Var.l("accentColorHex", true);
        b12Var.l("recentAccentColorHexes", true);
        descriptor = b12Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        vx vxVarB = y40Var.b(yo2Var);
        j71[] j71VarArr = b73.c;
        String str = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iJ = vxVarB.j(yo2Var);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                nv2 nv2Var = nv2.a;
                str = (String) vxVarB.x(yo2Var, 0, str);
                i |= 1;
            } else {
                if (iJ != 1) {
                    throw new e83(iJ);
                }
                list = (List) vxVarB.t(yo2Var, 1, (w41) j71VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        vxVarB.a(yo2Var);
        return new b73(i, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: w41[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qo0
    public final w41[] b() {
        return new w41[]{se.D(nv2.a), b73.c[1].getValue()};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        b73 b73Var = (b73) obj;
        b73Var.getClass();
        List list = b73Var.b;
        String str = b73Var.a;
        yo2 yo2Var = descriptor;
        wx wxVarB = ve0Var.b(yo2Var);
        j71[] j71VarArr = b73.c;
        if (wxVarB.d(yo2Var) || str != null) {
            nv2 nv2Var = nv2.a;
            wxVarB.h(yo2Var, 0, str);
        }
        if (wxVarB.d(yo2Var) || !t11.l(list, be0.h)) {
            ((dv2) wxVarB).w(yo2Var, 1, (w41) j71VarArr[1].getValue(), list);
        }
        wxVarB.a(yo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return descriptor;
    }
}
