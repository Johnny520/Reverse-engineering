package p000;

import nuke.p003ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p00 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7902h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f7903i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f7904j;

    public /* synthetic */ p00(HomeActivity homeActivity, boolean z) {
        this.f7902h = 2;
        this.f7904j = homeActivity;
        this.f7903i = z;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        vk1 vk1VarM2884i;
        int i = this.f7902h;
        a83 a83Var = a83.f116a;
        boolean z = this.f7903i;
        Object obj = this.f7904j;
        switch (i) {
            case 0:
                xm0 xm0Var = (xm0) obj;
                if (z) {
                    xm0Var.mo6a();
                }
                return a83Var;
            case 1:
                C0416l9 c0416l9 = (C0416l9) obj;
                if (z && (vk1VarM2884i = c0416l9.m2884i()) != null) {
                    ((lq2) vk1VarM2884i).m2963p(a83Var);
                }
                return a83Var;
            default:
                return HomeActivity.onCreate$lambda$0$16$0((HomeActivity) obj, z);
        }
    }

    public /* synthetic */ p00(int i, Object obj, boolean z) {
        this.f7902h = i;
        this.f7903i = z;
        this.f7904j = obj;
    }
}
