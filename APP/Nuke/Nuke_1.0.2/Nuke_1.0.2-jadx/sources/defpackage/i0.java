package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xk1 i;
    public final /* synthetic */ xk1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i0(xk1 xk1Var, xk1 xk1Var2, int i) {
        this.h = i;
        this.i = xk1Var;
        this.j = xk1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        ArrayList arrayListY0;
        int i = this.h;
        int i2 = 0;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.j;
        xk1 xk1Var2 = this.i;
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
                zq zqVar = (zq) obj;
                zqVar.getClass();
                Iterator it = ((List) xk1Var2.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (!t11.l(((zq) it.next()).a, zqVar.a)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    arrayListY0 = du.H0((List) xk1Var2.getValue());
                    arrayListY0.set(i2, zqVar);
                } else {
                    arrayListY0 = du.y0((List) xk1Var2.getValue(), zqVar);
                }
                xk1Var2.setValue(arrayListY0);
                xk1Var.setValue(null);
                break;
            default:
                s81 s81Var = (s81) obj;
                s81Var.getClass();
                List list = (List) xk1Var2.getValue();
                int i3 = 1;
                s81Var.b(list.size(), new zh(2, new ye(i3), list), new y0(list, 6, false), new kw(2039820996, true, new z0(list, xk1Var2, xk1Var, i3)));
                break;
        }
        return a83Var;
    }
}
