package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j72 extends q43 {
    public final l72 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j72(l72 l72Var) {
        this.a = l72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        if (l41Var.I() == 9) {
            l41Var.E();
            return null;
        }
        Object objD = d();
        Map map = this.a.a;
        try {
            l41Var.c();
            while (l41Var.p()) {
                i72 i72Var = (i72) map.get(l41Var.B());
                if (i72Var == null) {
                    l41Var.P();
                } else {
                    f(objD, l41Var, i72Var);
                }
            }
            l41Var.j();
            return e(objD);
        } catch (IllegalAccessException e) {
            tp0 tp0Var = h72.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new t31(e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        if (obj == null) {
            o41Var.p();
            return;
        }
        o41Var.e();
        try {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((i72) it.next()).a(o41Var, obj);
            }
            o41Var.j();
        } catch (IllegalAccessException e) {
            tp0 tp0Var = h72.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, l41 l41Var, i72 i72Var);
}
