package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u10 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11051h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ w10 f11052i;

    public /* synthetic */ u10(w10 w10Var, int i) {
        this.f11051h = i;
        this.f11052i = w10Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        bt2 bt2Var;
        int i = this.f11051h;
        a83 a83Var = a83.f116a;
        w10 w10Var = this.f11052i;
        switch (i) {
            case 0:
                sp0.m4924W(w10Var);
                return a83Var;
            case 1:
                w10Var.f12264E.m344h(true);
                break;
            case 2:
                w10Var.f12264E.m341d(true);
                break;
            case 3:
                w10Var.f12264E.m342f();
                break;
            case 4:
                sp0.m4924W(w10Var);
                return a83Var;
            case 5:
                w10Var.f12264E.m352p();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                w10Var.f12269z.f10644w.f6964i.f10639r.m438z(w10Var.f12265F.f13218e);
                break;
            default:
                t91 t91Var = w10Var.f12269z;
                gl0 gl0Var = w10Var.f12266G;
                boolean z = w10Var.f12260A;
                if (!t91Var.m5144b()) {
                    gl0.m1938a(gl0Var);
                } else if (!z && (bt2Var = t91Var.f10624c) != null) {
                    ((v60) bt2Var).m5626b();
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
