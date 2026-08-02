package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pg implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ sz1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ pg(sz1 sz1Var, int i) {
        this.h = i;
        this.i = sz1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        sz1 sz1Var = this.i;
        rz1 rz1Var = (rz1) obj;
        switch (i) {
            case 0:
                rz1.i(rz1Var, sz1Var, 0, 0);
                break;
            case 1:
                rz1.i(rz1Var, sz1Var, 0, 0);
                break;
            case 2:
                rz1.i(rz1Var, sz1Var, 0, 0);
                break;
            case 3:
                if (rz1Var.e() == d61.h || rz1Var.f() == 0) {
                    rz1.a(rz1Var, sz1Var);
                    sz1Var.f0(z01.c(0L, sz1Var.l), 0.0f, null);
                } else {
                    long jF = ((long) (rz1Var.f() - sz1Var.h)) << 32;
                    rz1.a(rz1Var, sz1Var);
                    sz1Var.f0(z01.c(jF, sz1Var.l), 0.0f, null);
                }
                break;
            case 4:
                rz1.g(rz1Var, sz1Var, 0, 0);
                break;
            case 5:
                rz1.i(rz1Var, sz1Var, 0, 0);
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                rz1.i(rz1Var, sz1Var, 0, 0);
                break;
            default:
                rz1.g(rz1Var, sz1Var, 0, 0);
                break;
        }
        return a83Var;
    }
}
