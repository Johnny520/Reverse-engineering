package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tb1 extends AbstractC0812vj {

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f10666d;

    public tb1() {
        super(true);
        this.f10666d = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: j */
    public final void m5153j(Object obj) {
        List<ow1> listM5879t0;
        Object x92Var;
        synchronized (this.f10666d) {
            listM5879t0 = we1.m5879t0(this.f10666d);
        }
        for (ow1 ow1Var : listM5879t0) {
            AbstractC0812vj abstractC0812vj = (AbstractC0812vj) ow1Var.f7862h;
            in0 in0Var = (in0) ow1Var.f7863i;
            ArrayList arrayList = st0.f10362a;
            abstractC0812vj.getClass();
            if (st0.f10362a.contains(abstractC0812vj) && st0.m5001b(abstractC0812vj)) {
                try {
                    in0Var.mo5j(obj);
                    x92Var = a83.f116a;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Throwable thM6237a = y92.m6237a(x92Var);
                if (thM6237a != null) {
                    pp1 pp1Var = pp1.f8445a;
                    pp1.m3936h(abstractC0812vj, "after_callback", thM6237a, vi0.m5691j("Listener ", mo9d(), " callback failed"));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5154k(AbstractC0812vj abstractC0812vj) {
        abstractC0812vj.getClass();
        synchronized (this.f10666d) {
            this.f10666d.remove(abstractC0812vj);
        }
    }
}
