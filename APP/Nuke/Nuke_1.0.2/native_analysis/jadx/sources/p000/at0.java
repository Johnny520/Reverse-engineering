package p000;

import java.util.Map;
import nuke.p003ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f374h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ lp1 f375i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f376j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ HomeActivity f377k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ xk1 f378l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean f379m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Map f380n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ xk1 f381o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ xk1 f382p;

    public /* synthetic */ at0(lp1 lp1Var, xk1 xk1Var, HomeActivity homeActivity, xk1 xk1Var2, boolean z, Map map, xk1 xk1Var3, xk1 xk1Var4) {
        this.f375i = lp1Var;
        this.f376j = xk1Var;
        this.f377k = homeActivity;
        this.f378l = xk1Var2;
        this.f379m = z;
        this.f380n = map;
        this.f381o = xk1Var3;
        this.f382p = xk1Var4;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        switch (this.f374h) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                lp1 lp1Var = this.f375i;
                xk1 xk1Var = this.f376j;
                HomeActivity homeActivity = this.f377k;
                xk1 xk1Var2 = this.f378l;
                return HomeActivity.onCreate$lambda$0$17(this.f379m, lp1Var, xk1Var, homeActivity, xk1Var2, this.f380n, this.f381o, this.f382p, (InterfaceC0596px) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return HomeActivity.onCreate$lambda$0$17$0(this.f375i, this.f376j, this.f377k, this.f378l, this.f379m, this.f380n, this.f381o, this.f382p, (InterfaceC0596px) obj, iIntValue2);
        }
    }

    public /* synthetic */ at0(boolean z, lp1 lp1Var, xk1 xk1Var, HomeActivity homeActivity, xk1 xk1Var2, Map map, xk1 xk1Var3, xk1 xk1Var4) {
        this.f379m = z;
        this.f375i = lp1Var;
        this.f376j = xk1Var;
        this.f377k = homeActivity;
        this.f378l = xk1Var2;
        this.f380n = map;
        this.f381o = xk1Var3;
        this.f382p = xk1Var4;
    }
}
