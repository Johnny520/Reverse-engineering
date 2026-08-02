package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: i0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0297i0 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4198h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xk1 f4199i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f4200j;

    public /* synthetic */ C0297i0(xk1 xk1Var, xk1 xk1Var2, int i) {
        this.f4198h = i;
        this.f4199i = xk1Var;
        this.f4200j = xk1Var2;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        ArrayList arrayListM1169y0;
        int i = this.f4198h;
        int i2 = 0;
        a83 a83Var = a83.f116a;
        xk1 xk1Var = this.f4200j;
        xk1 xk1Var2 = this.f4199i;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                xk1Var2.setValue(str);
                xk1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                Set set = (Set) obj;
                set.getClass();
                xk1Var2.setValue(set);
                xk1Var.setValue(Boolean.FALSE);
                break;
            case 2:
                Set set2 = (Set) obj;
                set2.getClass();
                xk1Var2.setValue(set2);
                xk1Var.setValue(Boolean.FALSE);
                break;
            case 3:
                C0971zq c0971zq = (C0971zq) obj;
                c0971zq.getClass();
                Iterator it = ((List) xk1Var2.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (!t11.m5086l(((C0971zq) it.next()).f14022a, c0971zq.f14022a)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    arrayListM1169y0 = AbstractC0142du.m1150H0((List) xk1Var2.getValue());
                    arrayListM1169y0.set(i2, c0971zq);
                } else {
                    arrayListM1169y0 = AbstractC0142du.m1169y0((List) xk1Var2.getValue(), c0971zq);
                }
                xk1Var2.setValue(arrayListM1169y0);
                xk1Var.setValue(null);
                break;
            default:
                s81 s81Var = (s81) obj;
                s81Var.getClass();
                List list = (List) xk1Var2.getValue();
                int i3 = 1;
                s81Var.m4761b(list.size(), new C0962zh(2, new C0920ye(i3), list), new C0906y0(list, 6, false), new C0402kw(2039820996, true, new C0945z0(list, xk1Var2, xk1Var, i3)));
                break;
        }
        return a83Var;
    }
}
