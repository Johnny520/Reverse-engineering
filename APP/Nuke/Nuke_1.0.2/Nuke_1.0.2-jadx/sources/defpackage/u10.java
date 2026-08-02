package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u10 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ w10 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ u10(w10 w10Var, int i) {
        this.h = i;
        this.i = w10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        bt2 bt2Var;
        int i = this.h;
        a83 a83Var = a83.a;
        w10 w10Var = this.i;
        switch (i) {
            case 0:
                sp0.W(w10Var);
                return a83Var;
            case 1:
                w10Var.E.h(true);
                break;
            case 2:
                w10Var.E.d(true);
                break;
            case 3:
                w10Var.E.f();
                break;
            case 4:
                sp0.W(w10Var);
                return a83Var;
            case 5:
                w10Var.E.p();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                w10Var.z.w.i.r.z(w10Var.F.e);
                break;
            default:
                t91 t91Var = w10Var.z;
                gl0 gl0Var = w10Var.G;
                boolean z = w10Var.A;
                if (!t91Var.b()) {
                    gl0.a(gl0Var);
                } else if (!z && (bt2Var = t91Var.c) != null) {
                    ((v60) bt2Var).b();
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
