package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ei implements qo0 {
    public static final ei a;
    private static final yo2 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ei eiVar = new ei();
        a = eiVar;
        b12 b12Var = new b12("nuke.module.wechat.item.chat.AutoReceiveTransferMoney.TransferAutoReplyConf", eiVar, 2);
        b12Var.l("isEnabled", true);
        b12Var.l("replyContent", true);
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
        boolean zQ = false;
        while (z) {
            int iJ = vxVarB.j(yo2Var);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                zQ = vxVarB.q(yo2Var, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    throw new e83(iJ);
                }
                strN = vxVarB.n(yo2Var, 1);
                i |= 2;
            }
        }
        vxVarB.a(yo2Var);
        return new gi(i, strN, zQ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qo0
    public final w41[] b() {
        return new w41[]{ll.a, nv2.a};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        gi giVar = (gi) obj;
        giVar.getClass();
        String str = giVar.b;
        boolean z = giVar.a;
        yo2 yo2Var = descriptor;
        wx wxVarB = ve0Var.b(yo2Var);
        if (wxVarB.d(yo2Var) || z) {
            ((dv2) wxVarB).r(yo2Var, 0, z);
        }
        if (wxVarB.d(yo2Var) || !t11.l(str, "")) {
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
