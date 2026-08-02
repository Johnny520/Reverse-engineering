package defpackage;

import java.util.HashMap;
import java.util.List;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y50 implements fa1 {
    public final /* synthetic */ int h = 1;
    public final Object i;
    public final Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y50(ha1 ha1Var) {
        this.i = ha1Var;
        gt gtVar = gt.c;
        Class<?> cls = ha1Var.getClass();
        et etVar = (et) gtVar.a.get(cls);
        this.j = etVar == null ? gtVar.a(cls, null) : etVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fa1
    public final void g(ia1 ia1Var, z91 z91Var) {
        int i = this.h;
        Object obj = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                w50 w50Var = (w50) obj;
                switch (x50.a[z91Var.ordinal()]) {
                    case 1:
                        w50Var.getClass();
                        break;
                    case 2:
                        w50Var.c(ia1Var);
                        break;
                    case 3:
                        w50Var.e(ia1Var);
                        break;
                    case 4:
                        w50Var.getClass();
                        break;
                    case 5:
                        w50Var.b(ia1Var);
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        w50Var.getClass();
                        break;
                    case 7:
                        s.j("ON_ANY must not been send by anybody");
                        break;
                    default:
                        c80.s();
                        break;
                }
                fa1 fa1Var = (fa1) obj2;
                if (fa1Var != null) {
                    fa1Var.g(ia1Var, z91Var);
                }
                break;
            case 1:
                if (z91Var == z91.ON_START) {
                    ((ba1) obj).b(this);
                    ((qc2) obj2).d();
                }
                break;
            case 2:
                jt1 jt1Var = (jt1) obj;
                int i2 = nt1.a[z91Var.ordinal()];
                if (i2 == 1) {
                    jt1Var.g(true);
                    break;
                } else if (i2 == 2) {
                    jt1Var.g(false);
                    break;
                } else if (i2 == 3) {
                    jt1Var.e();
                    ((ba1) obj2).b(this);
                    break;
                }
                break;
            default:
                HashMap map = ((et) obj2).a;
                et.a((List) map.get(z91Var), ia1Var, z91Var, obj);
                et.a((List) map.get(z91.ON_ANY), ia1Var, z91Var, obj);
                break;
        }
    }

    public y50(w50 w50Var, fa1 fa1Var) {
        w50Var.getClass();
        this.i = w50Var;
        this.j = fa1Var;
    }

    public y50(ba1 ba1Var, qc2 qc2Var) {
        this.i = ba1Var;
        this.j = qc2Var;
    }

    public y50(jt1 jt1Var, ot1 ot1Var, ba1 ba1Var) {
        this.i = jt1Var;
        this.j = ba1Var;
    }
}
