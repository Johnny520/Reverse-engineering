package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ag3 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f195l;

    /* JADX INFO: renamed from: m */
    public int f196m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ bg3 f197n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag3(bg3 bg3Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f195l = i;
        this.f197n = bg3Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f195l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((ag3) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f195l;
        bg3 bg3Var = this.f197n;
        switch (i) {
            case 0:
                return new ag3(bg3Var, t00Var, 0);
            default:
                return new ag3(bg3Var, t00Var, 1);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws Throwable {
        int i = this.f195l;
        bg3 bg3Var = this.f197n;
        k20 k20Var = k20.f5323h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                int i2 = this.f196m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = bg3Var.f848h;
                    this.f196m = 1;
                    Object objM2099e = viewTreeObserverOnGlobalLayoutListenerC0045b7.f638G.m2099e(this);
                    if (objM2099e != k20Var) {
                        objM2099e = a83Var;
                    }
                    if (objM2099e == k20Var) {
                    }
                } else if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            default:
                int i3 = this.f196m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b72 = bg3Var.f848h;
                    this.f196m = 1;
                    Object objM5850a = viewTreeObserverOnGlobalLayoutListenerC0045b72.f640H.m5850a(this);
                    if (objM5850a != k20Var) {
                        objM5850a = a83Var;
                    }
                    if (objM5850a == k20Var) {
                    }
                } else if (i3 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
        }
        return k20Var;
    }
}
