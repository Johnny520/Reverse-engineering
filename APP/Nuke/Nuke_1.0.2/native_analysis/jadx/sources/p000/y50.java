package p000;

import java.util.HashMap;
import java.util.List;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y50 implements fa1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13307h = 1;

    /* JADX INFO: renamed from: i */
    public final Object f13308i;

    /* JADX INFO: renamed from: j */
    public final Object f13309j;

    public y50(ha1 ha1Var) {
        this.f13308i = ha1Var;
        C0252gt c0252gt = C0252gt.f3696c;
        Class<?> cls = ha1Var.getClass();
        C0178et c0178et = (C0178et) c0252gt.f3697a.get(cls);
        this.f13309j = c0178et == null ? c0252gt.m2025a(cls, null) : c0178et;
    }

    @Override // p000.fa1
    /* JADX INFO: renamed from: g */
    public final void mo533g(ia1 ia1Var, z91 z91Var) {
        int i = this.f13307h;
        Object obj = this.f13308i;
        Object obj2 = this.f13309j;
        switch (i) {
            case 0:
                w50 w50Var = (w50) obj;
                switch (x50.f12812a[z91Var.ordinal()]) {
                    case 1:
                        w50Var.getClass();
                        break;
                    case 2:
                        w50Var.mo5849c(ia1Var);
                        break;
                    case 3:
                        w50Var.mo470e(ia1Var);
                        break;
                    case 4:
                        w50Var.getClass();
                        break;
                    case 5:
                        w50Var.mo469b(ia1Var);
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        w50Var.getClass();
                        break;
                    case 7:
                        C0676s.m4651j("ON_ANY must not been send by anybody");
                        break;
                    default:
                        c80.m675s();
                        break;
                }
                fa1 fa1Var = (fa1) obj2;
                if (fa1Var != null) {
                    fa1Var.mo533g(ia1Var, z91Var);
                }
                break;
            case 1:
                if (z91Var == z91.ON_START) {
                    ((ba1) obj).mo506b(this);
                    ((qc2) obj2).m4136d();
                }
                break;
            case 2:
                jt1 jt1Var = (jt1) obj;
                int i2 = nt1.f7324a[z91Var.ordinal()];
                if (i2 == 1) {
                    jt1Var.m2563g(true);
                    break;
                } else if (i2 == 2) {
                    jt1Var.m2563g(false);
                    break;
                } else if (i2 == 3) {
                    jt1Var.m2220e();
                    ((ba1) obj2).mo506b(this);
                    break;
                }
                break;
            default:
                HashMap map = ((C0178et) obj2).f2586a;
                C0178et.m1417a((List) map.get(z91Var), ia1Var, z91Var, obj);
                C0178et.m1417a((List) map.get(z91.ON_ANY), ia1Var, z91Var, obj);
                break;
        }
    }

    public y50(w50 w50Var, fa1 fa1Var) {
        w50Var.getClass();
        this.f13308i = w50Var;
        this.f13309j = fa1Var;
    }

    public y50(ba1 ba1Var, qc2 qc2Var) {
        this.f13308i = ba1Var;
        this.f13309j = qc2Var;
    }

    public y50(jt1 jt1Var, ot1 ot1Var, ba1 ba1Var) {
        this.f13308i = jt1Var;
        this.f13309j = ba1Var;
    }
}
