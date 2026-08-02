package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l2 implements w41 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public Object a(y40 y40Var) {
        return j(y40Var);
    }

    public abstract Object f();

    public abstract int g(Object obj);

    public abstract Iterator h(Object obj);

    public abstract int i(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object j(y40 y40Var) {
        Object objF = f();
        int iG = g(objF);
        vx vxVarB = y40Var.b(e());
        while (true) {
            int iJ = vxVarB.j(e());
            if (iJ == -1) {
                vxVarB.a(e());
                return m(objF);
            }
            k(vxVarB, iJ + iG, objF);
        }
    }

    public abstract void k(vx vxVar, int i, Object obj);

    public abstract Object l(Object obj);

    public abstract Object m(Object obj);
}
