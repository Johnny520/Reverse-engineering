package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ar implements qo0 {
    public static final ar a;
    private static final yo2 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ar arVar = new ar();
        a = arVar;
        b12 b12Var = new b12("nuke.module.wechat.item.chat.ChatAutoReply.ChatAutoReplyConf", arVar, 1);
        b12Var.l("tasks", true);
        descriptor = b12Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        vx vxVarB = y40Var.b(yo2Var);
        j71[] j71VarArr = cr.b;
        List list = null;
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
                list = (List) vxVarB.t(yo2Var, 0, (w41) j71VarArr[0].getValue(), list);
                i = 1;
            }
        }
        vxVarB.a(yo2Var);
        return new cr(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: w41[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qo0
    public final w41[] b() {
        return new w41[]{cr.b[0].getValue()};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        cr crVar = (cr) obj;
        crVar.getClass();
        List list = crVar.a;
        yo2 yo2Var = descriptor;
        wx wxVarB = ve0Var.b(yo2Var);
        j71[] j71VarArr = cr.b;
        if (wxVarB.d(yo2Var) || !t11.l(list, be0.h)) {
            ((dv2) wxVarB).w(yo2Var, 0, (w41) j71VarArr[0].getValue(), list);
        }
        wxVarB.a(yo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return descriptor;
    }
}
