package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be implements qo0 {
    public static final be a;
    private static final yo2 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        be beVar = new be();
        a = beVar;
        b12 b12Var = new b12("nuke.module.wechat.item.chat.AntiRevoke.AntiRevokeConf", beVar, 2);
        b12Var.l("pattern", true);
        b12Var.l("timeFormat", true);
        descriptor = b12Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        vx vxVarB = y40Var.b(yo2Var);
        String strN = null;
        boolean z = true;
        int i = 0;
        String strN2 = null;
        while (z) {
            int iJ = vxVarB.j(yo2Var);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strN = vxVarB.n(yo2Var, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    throw new e83(iJ);
                }
                strN2 = vxVarB.n(yo2Var, 1);
                i |= 2;
            }
        }
        vxVarB.a(yo2Var);
        return new de(i, strN, strN2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qo0
    public final w41[] b() {
        nv2 nv2Var = nv2.a;
        return new w41[]{nv2Var, nv2Var};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        de deVar = (de) obj;
        deVar.getClass();
        String str = deVar.b;
        String str2 = deVar.a;
        yo2 yo2Var = descriptor;
        wx wxVarB = ve0Var.b(yo2Var);
        if (wxVarB.d(yo2Var) || !t11.l(str2, "\"$sender\"尝试撤回一条消息")) {
            ((dv2) wxVarB).x(yo2Var, 0, str2);
        }
        if (wxVarB.d(yo2Var) || !t11.l(str, "yyyy/MM/dd HH:mm:ss")) {
            ((dv2) wxVarB).x(yo2Var, 1, str);
        }
        wxVarB.a(yo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return descriptor;
    }
}
