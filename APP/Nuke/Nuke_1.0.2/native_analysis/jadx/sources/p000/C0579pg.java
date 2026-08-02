package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: pg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0579pg implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8305h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ sz1 f8306i;

    public /* synthetic */ C0579pg(sz1 sz1Var, int i) {
        this.f8305h = i;
        this.f8306i = sz1Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f8305h;
        a83 a83Var = a83.f116a;
        sz1 sz1Var = this.f8306i;
        rz1 rz1Var = (rz1) obj;
        switch (i) {
            case 0:
                rz1.m4641i(rz1Var, sz1Var, 0, 0);
                break;
            case 1:
                rz1.m4641i(rz1Var, sz1Var, 0, 0);
                break;
            case 2:
                rz1.m4641i(rz1Var, sz1Var, 0, 0);
                break;
            case 3:
                if (rz1Var.mo2896e() == d61.f1885h || rz1Var.mo2897f() == 0) {
                    rz1.m4638a(rz1Var, sz1Var);
                    sz1Var.mo2506f0(z01.m6373c(0L, sz1Var.f10442l), 0.0f, null);
                } else {
                    long jMo2897f = ((long) (rz1Var.mo2897f() - sz1Var.f10438h)) << 32;
                    rz1.m4638a(rz1Var, sz1Var);
                    sz1Var.mo2506f0(z01.m6373c(jMo2897f, sz1Var.f10442l), 0.0f, null);
                }
                break;
            case 4:
                rz1.m4639g(rz1Var, sz1Var, 0, 0);
                break;
            case 5:
                rz1.m4641i(rz1Var, sz1Var, 0, 0);
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                rz1.m4641i(rz1Var, sz1Var, 0, 0);
                break;
            default:
                rz1.m4639g(rz1Var, sz1Var, 0, 0);
                break;
        }
        return a83Var;
    }
}
