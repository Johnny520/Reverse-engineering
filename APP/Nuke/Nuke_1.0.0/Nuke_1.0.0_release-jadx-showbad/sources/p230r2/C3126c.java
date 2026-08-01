package p230r2;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import p213o2.AbstractC2770B;
import p213o2.C2789r;
import p224q2.InterfaceC2924o;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3126c extends AbstractC2770B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9831a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f9832b;

    /* JADX INFO: renamed from: c */
    public final Object f9833c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3126c(C3138n c3138n, InterfaceC2924o interfaceC2924o) {
        this.f9832b = c3138n;
        this.f9833c = interfaceC2924o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        switch (this.f9831a) {
            case 0:
                if (c3390a.m5630J() == 9) {
                    c3390a.m5626F();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC2924o) this.f9833c).mo602c();
                c3390a.m5639b();
                while (c3390a.m5647n()) {
                    collection.add(((C3138n) this.f9832b).f9879c.mo4964b(c3390a));
                }
                c3390a.m5643h();
                return collection;
            default:
                Class cls = (Class) this.f9832b;
                Object objMo4964b = ((C3114S) this.f9833c).f9824f.mo4964b(c3390a);
                if (objMo4964b == null || cls.isInstance(objMo4964b)) {
                    return objMo4964b;
                }
                throw new C2789r("Expected a " + cls.getName() + " but was " + objMo4964b.getClass().getName() + "; at path " + c3390a.m5646m(true));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        switch (this.f9831a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    c3391b.m5659c();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C3138n) this.f9832b).mo4965c(c3391b, it.next());
                    }
                    c3391b.m5662h();
                } else {
                    c3391b.m5666n();
                }
                break;
            default:
                ((C3114S) this.f9833c).f9824f.mo4965c(c3391b, obj);
                break;
        }
    }

    public C3126c(C3114S c3114s, Class cls) {
        this.f9833c = c3114s;
        this.f9832b = cls;
    }
}
