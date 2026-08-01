package p042W;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p006D.AbstractC0079h;
import p037T.AbstractC0274y;
import p037T.C0265p;
import p045Y.AbstractC0357c;
import p051b0.C0493b;
import p051b0.C0494c;
import p051b0.C0495d;

/* JADX INFO: renamed from: W.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0343o extends AbstractC0274y {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f777a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0343o(LinkedHashMap linkedHashMap) {
        this.f777a = linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: a */
    public final Object mo476a(C0493b c0493b) throws C0495d {
        if (c0493b.mo585x() == 9) {
            c0493b.mo583t();
            return null;
        }
        Object objMo602c = mo602c();
        try {
            c0493b.mo572b();
            while (c0493b.mo577k()) {
                C0342n c0342n = (C0342n) this.f777a.get(c0493b.mo582r());
                if (c0342n == null || !c0342n.f769e) {
                    c0493b.mo563D();
                } else {
                    mo604e(objMo602c, c0493b, c0342n);
                }
            }
            c0493b.mo574f();
            return mo603d(objMo602c);
        } catch (IllegalAccessException e2) {
            AbstractC0079h abstractC0079h = AbstractC0357c.f834a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalStateException e3) {
            throw new C0265p(e3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: b */
    public final void mo477b(C0494c c0494c, Object obj) throws IOException {
        if (obj == null) {
            c0494c.mo591i();
            return;
        }
        c0494c.mo587c();
        try {
            Iterator it = this.f777a.values().iterator();
            while (it.hasNext()) {
                ((C0342n) it.next()).m601a(c0494c, obj);
            }
            c0494c.mo589f();
        } catch (IllegalAccessException e2) {
            AbstractC0079h abstractC0079h = AbstractC0357c.f834a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo602c();

    /* JADX INFO: renamed from: d */
    public abstract Object mo603d(Object obj);

    /* JADX INFO: renamed from: e */
    public abstract void mo604e(Object obj, C0493b c0493b, C0342n c0342n);
}
