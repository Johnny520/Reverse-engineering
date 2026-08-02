package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ux2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f11546l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ x22 f11547m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux2(x22 x22Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f11546l = i;
        this.f11547m = x22Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f11546l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                ((ux2) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            case 1:
                ((ux2) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            case 2:
                ((ux2) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            case 3:
                ((ux2) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            case 4:
                ((ux2) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            case 5:
                ((ux2) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((ux2) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            default:
                ((ux2) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
        }
        return a83Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f11546l;
        x22 x22Var = this.f11547m;
        switch (i) {
            case 0:
                return new ux2(x22Var, t00Var, 0);
            case 1:
                return new ux2(x22Var, t00Var, 1);
            case 2:
                return new ux2(x22Var, t00Var, 2);
            case 3:
                return new ux2(x22Var, t00Var, 3);
            case 4:
                return new ux2(x22Var, t00Var, 4);
            case 5:
                return new ux2(x22Var, t00Var, 5);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new ux2(x22Var, t00Var, 6);
            default:
                return new ux2(x22Var, t00Var, 7);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f11546l;
        a83 a83Var = a83.f116a;
        x22 x22Var = this.f11547m;
        switch (i) {
            case 0:
                fg1.m1627T(obj);
                x22Var.m6025a();
                break;
            case 1:
                fg1.m1627T(obj);
                x22Var.m6026c();
                break;
            case 2:
                fg1.m1627T(obj);
                x22Var.m6026c();
                break;
            case 3:
                fg1.m1627T(obj);
                x22Var.m6025a();
                break;
            case 4:
                fg1.m1627T(obj);
                x22Var.m6026c();
                break;
            case 5:
                fg1.m1627T(obj);
                x22Var.m6026c();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                fg1.m1627T(obj);
                x22Var.m6025a();
                break;
            default:
                fg1.m1627T(obj);
                x22Var.m6026c();
                break;
        }
        return a83Var;
    }
}
