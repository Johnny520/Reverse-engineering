package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j72 extends q43 {

    /* JADX INFO: renamed from: a */
    public final l72 f4908a;

    public j72(l72 l72Var) {
        this.f4908a = l72Var;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        if (l41Var.m2814I() == 9) {
            l41Var.m2810E();
            return null;
        }
        Object objMo2467d = mo2467d();
        Map map = this.f4908a.f5973a;
        try {
            l41Var.m2825c();
            while (l41Var.m2832p()) {
                i72 i72Var = (i72) map.get(l41Var.m2808B());
                if (i72Var == null) {
                    l41Var.m2821P();
                } else {
                    mo2469f(objMo2467d, l41Var, i72Var);
                }
            }
            l41Var.m2829j();
            return mo2468e(objMo2467d);
        } catch (IllegalAccessException e) {
            tp0 tp0Var = h72.f3884a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new t31(e2);
        }
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        if (obj == null) {
            o41Var.m3498p();
            return;
        }
        o41Var.m3492e();
        try {
            Iterator it = this.f4908a.f5974b.iterator();
            while (it.hasNext()) {
                ((i72) it.next()).m2297a(o41Var, obj);
            }
            o41Var.m3495j();
        } catch (IllegalAccessException e) {
            tp0 tp0Var = h72.f3884a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo2467d();

    /* JADX INFO: renamed from: e */
    public abstract Object mo2468e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract void mo2469f(Object obj, l41 l41Var, i72 i72Var);
}
