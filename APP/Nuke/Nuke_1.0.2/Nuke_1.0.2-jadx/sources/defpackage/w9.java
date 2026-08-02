package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w9 implements on0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ w9(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on0
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.h;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                x9 x9Var = (x9) obj5;
                m63 m63VarB = ((yl0) x9Var.e).b((mx2) obj, (im0) obj2, ((gm0) obj3).a, ((hm0) obj4).a);
                if (m63VarB instanceof m63) {
                    Object obj6 = m63VarB.h;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                vu2 vu2Var = new vu2(m63VarB, x9Var.j);
                x9Var.j = vu2Var;
                Object obj7 = vu2Var.c;
                obj7.getClass();
                return (Typeface) obj7;
            default:
                kw kwVar = (kw) obj5;
                o71 o71Var = (o71) obj;
                ((Integer) obj2).getClass();
                px pxVar = (px) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) pxVar).f(o71Var) ? 4 : 2;
                }
                go0 go0Var = (go0) pxVar;
                if (go0Var.O(iIntValue & 1, (iIntValue & 131) != 130)) {
                    kwVar.e(o71Var, go0Var, Integer.valueOf(iIntValue & 14));
                } else {
                    go0Var.R();
                }
                return a83.a;
        }
    }
}
