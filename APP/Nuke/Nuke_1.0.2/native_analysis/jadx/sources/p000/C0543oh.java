package p000;

import java.util.List;

/* JADX INFO: renamed from: oh */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0543oh implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7676h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f7677i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f7678j;

    public /* synthetic */ C0543oh(List list, xk1 xk1Var, int i) {
        this.f7676h = i;
        this.f7677i = list;
        this.f7678j = xk1Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f7676h;
        a83 a83Var = a83.f116a;
        xk1 xk1Var = this.f7678j;
        List list = this.f7677i;
        s81 s81Var = (s81) obj;
        switch (i) {
            case 0:
                s81Var.getClass();
                C0923yh c0923yh = C0923yh.f13455o;
                s81Var.m4761b(list.size(), new C0906y0(2, list), new C0906y0(list, 3, false), new C0402kw(802480018, true, new C0019ai(list, xk1Var, 0)));
                break;
            case 1:
                s81Var.getClass();
                C0462mi c0462mi = C0462mi.f6654o;
                s81Var.m4761b(list.size(), new C0906y0(4, list), new C0906y0(list, 5, false), new C0402kw(802480018, true, new C0019ai(list, xk1Var, 1)));
                break;
            case 2:
                s81Var.getClass();
                s81.m4760a(s81Var, "hooker_debug_actions", tp0.f10878e, 2);
                s81.m4760a(s81Var, "hooker_debug_summary", new C0402kw(-1823242558, true, new C0907y1(2, list)), 2);
                if (!list.isEmpty()) {
                    s81Var.m4761b(list.size(), new C0962zh(5, new C0920ye(29), list), new C0906y0(list, 7, false), new C0402kw(2039820996, true, new C0019ai(list, xk1Var, 2)));
                } else {
                    s81.m4760a(s81Var, "hooker_debug_empty", tp0.f10879f, 2);
                }
                break;
            default:
                s81Var.getClass();
                rc3 rc3Var = rc3.f9513o;
                s81Var.m4761b(list.size(), new C0906y0(8, list), new C0906y0(list, 9, false), new C0402kw(802480018, true, new C0019ai(list, xk1Var, 3)));
                break;
        }
        return a83Var;
    }
}
