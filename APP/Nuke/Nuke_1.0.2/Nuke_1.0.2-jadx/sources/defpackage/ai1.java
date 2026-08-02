package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ai1 implements qo0 {
    public static final ai1 a;
    private static final yo2 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ai1 ai1Var = new ai1();
        a = ai1Var;
        b12 b12Var = new b12("nuke.module.wechat.item.contact.ModifyFriendsCount.ModifyFriendsCountConf", ai1Var, 1);
        b12Var.l("count", true);
        descriptor = b12Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        vx vxVarB = y40Var.b(yo2Var);
        boolean z = true;
        int i = 0;
        int iU = 0;
        while (z) {
            int iJ = vxVarB.j(yo2Var);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    throw new e83(iJ);
                }
                iU = vxVarB.u(yo2Var, 0);
                i = 1;
            }
        }
        vxVarB.a(yo2Var);
        return new ci1(i, iU);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qo0
    public final w41[] b() {
        return new w41[]{f11.a};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        ci1 ci1Var = (ci1) obj;
        ci1Var.getClass();
        int i = ci1Var.a;
        yo2 yo2Var = descriptor;
        wx wxVarB = ve0Var.b(yo2Var);
        if (wxVarB.d(yo2Var) || i != 10) {
            ((dv2) wxVarB).u(0, i, yo2Var);
        }
        wxVarB.a(yo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return descriptor;
    }
}
