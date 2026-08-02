package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class au extends l2 {
    public final w41 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public au(w41 w41Var) {
        this.a = w41Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public void d(ve0 ve0Var, Object obj) {
        int i = i(obj);
        yo2 yo2VarE = e();
        yo2VarE.getClass();
        wx wxVarB = ve0Var.b(yo2VarE);
        Iterator itH = h(obj);
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) wxVarB).w(e(), i2, this.a, itH.next());
        }
        wxVarB.a(yo2VarE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public void k(vx vxVar, int i, Object obj) {
        n(i, obj, vxVar.t(e(), i, this.a, null));
    }

    public abstract void n(int i, Object obj, Object obj2);
}
