package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ List i;
    public final /* synthetic */ xk1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ oh(List list, xk1 xk1Var, int i) {
        this.h = i;
        this.i = list;
        this.j = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.j;
        List list = this.i;
        s81 s81Var = (s81) obj;
        switch (i) {
            case 0:
                s81Var.getClass();
                yh yhVar = yh.o;
                s81Var.b(list.size(), new y0(2, list), new y0(list, 3, false), new kw(802480018, true, new ai(list, xk1Var, 0)));
                break;
            case 1:
                s81Var.getClass();
                mi miVar = mi.o;
                s81Var.b(list.size(), new y0(4, list), new y0(list, 5, false), new kw(802480018, true, new ai(list, xk1Var, 1)));
                break;
            case 2:
                s81Var.getClass();
                s81.a(s81Var, "hooker_debug_actions", tp0.e, 2);
                s81.a(s81Var, "hooker_debug_summary", new kw(-1823242558, true, new y1(2, list)), 2);
                if (!list.isEmpty()) {
                    s81Var.b(list.size(), new zh(5, new ye(29), list), new y0(list, 7, false), new kw(2039820996, true, new ai(list, xk1Var, 2)));
                } else {
                    s81.a(s81Var, "hooker_debug_empty", tp0.f, 2);
                }
                break;
            default:
                s81Var.getClass();
                rc3 rc3Var = rc3.o;
                s81Var.b(list.size(), new y0(8, list), new y0(list, 9, false), new kw(802480018, true, new ai(list, xk1Var, 3)));
                break;
        }
        return a83Var;
    }
}
