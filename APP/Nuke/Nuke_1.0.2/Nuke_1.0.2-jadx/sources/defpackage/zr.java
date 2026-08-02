package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zr implements qo0 {
    public static final zr a;
    private static final yo2 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        zr zrVar = new zr();
        a = zrVar;
        b12 b12Var = new b12("nuke.module.wechat.item.entertain.ChatAvatarRotator.ChatAvatarRotatorConf", zrVar, 1);
        b12Var.l("duration", true);
        descriptor = b12Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        vx vxVarB = y40Var.b(yo2Var);
        long jZ = 0;
        boolean z = true;
        int i = 0;
        while (z) {
            int iJ = vxVarB.j(yo2Var);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    throw new e83(iJ);
                }
                jZ = vxVarB.z(yo2Var, 0);
                i = 1;
            }
        }
        vxVarB.a(yo2Var);
        return new bs(jZ, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qo0
    public final w41[] b() {
        return new w41[]{ed1.a};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        bs bsVar = (bs) obj;
        bsVar.getClass();
        long j = bsVar.a;
        yo2 yo2Var = descriptor;
        wx wxVarB = ve0Var.b(yo2Var);
        if (wxVarB.d(yo2Var) || j != 1000) {
            ((dv2) wxVarB).v(yo2Var, 0, j);
        }
        wxVarB.a(yo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return descriptor;
    }
}
