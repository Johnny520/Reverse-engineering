package p230r2;

import com.bumptech.glide.AbstractC1923e;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p213o2.AbstractC2770B;
import p213o2.C2789r;
import p241t2.AbstractC3211c;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3143s extends AbstractC2770B {

    /* JADX INFO: renamed from: a */
    public final C3145u f9896a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3143s(C3145u c3145u) {
        this.f9896a = c3145u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        if (c3390a.m5630J() == 9) {
            c3390a.m5626F();
            return null;
        }
        Object objMo5416d = mo5416d();
        Map map = this.f9896a.f9899a;
        try {
            c3390a.m5640c();
            while (c3390a.m5647n()) {
                C3142r c3142r = (C3142r) map.get(c3390a.m5624D());
                if (c3142r == null) {
                    c3390a.m5636P();
                } else {
                    mo5418f(objMo5416d, c3390a, c3142r);
                }
            }
            c3390a.m5644j();
            return mo5417e(objMo5416d);
        } catch (IllegalAccessException e5) {
            AbstractC1923e abstractC1923e = AbstractC3211c.f9992a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e5);
        } catch (IllegalStateException e6) {
            throw new C2789r(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        if (obj == null) {
            c3391b.m5666n();
            return;
        }
        c3391b.m5660d();
        try {
            Iterator it = this.f9896a.f9900b.iterator();
            while (it.hasNext()) {
                ((C3142r) it.next()).m5415a(c3391b, obj);
            }
            c3391b.m5663j();
        } catch (IllegalAccessException e5) {
            AbstractC1923e abstractC1923e = AbstractC3211c.f9992a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e5);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo5416d();

    /* JADX INFO: renamed from: e */
    public abstract Object mo5417e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract void mo5418f(Object obj, C3390a c3390a, C3142r c3142r);
}
