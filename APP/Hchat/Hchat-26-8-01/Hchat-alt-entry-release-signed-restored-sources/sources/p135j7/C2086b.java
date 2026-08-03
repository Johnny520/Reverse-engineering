package p135j7;

import java.util.Comparator;
import java.util.Iterator;
import p152k7.AbstractC2331a;
import p152k7.AbstractC2332b;
import p166l7.C2518f;
import p229p7.C3336f;
import p241q7.InterfaceC3444a;
import p257r7.C3716f;
import p379z7.C6107c;

/* JADX INFO: renamed from: j7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2086b extends AbstractC2332b implements InterfaceC3444a, Comparator {

    /* JADX INFO: renamed from: m */
    public final C3716f f6992m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2086b(C3716f c3716f) {
        this.f6992m = c3716f;
        c3716f.f7660j = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static C2518f m5142k0(C6107c c6107c, int i9) {
        C2518f c2518f = null;
        if (c6107c != null && c6107c.size() != 0) {
            if (c6107c.size() == 1 && i9 == 0) {
                return (C2518f) c6107c.f24642g[0];
            }
            Iterator it = c6107c.iterator();
            while (it.hasNext()) {
                C2518f c2518f2 = (C2518f) it.next();
                if (c2518f2 != null && (i9 == 0 || i9 == c2518f2.mo5913U())) {
                    if (c2518f == null || ((C3336f) c2518f2.f8138m).f10723o.f12083n > ((C3336f) c2518f.f8138m).f10723o.f12083n) {
                        c2518f = c2518f2;
                    }
                }
            }
        }
        return c2518f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: X */
    public final void mo5141X() {
        this.f6992m.mo633k(this.f9926k.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((C2518f) obj).mo5913U(), ((C2518f) obj2).mo5913U());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p241q7.InterfaceC3444a
    /* JADX INFO: renamed from: m */
    public final void mo1926m(AbstractC2331a abstractC2331a) {
        C3716f c3716f = this.f6992m;
        if (abstractC2331a != c3716f) {
            return;
        }
        mo5557c0(c3716f.f12083n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2334d
    /* JADX INFO: renamed from: n */
    public final AbstractC2331a mo1892n() {
        return new C2518f();
    }
}
