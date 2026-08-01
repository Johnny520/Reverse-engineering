package p002A1;

import java.util.HashMap;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p027E4.C0330q;
import p048I1.C0780e;
import p117X2.AbstractC1665j;
import p135b.AbstractC1838z;
import p135b.C1809A;
import p135b.C1833u;

/* JADX INFO: renamed from: A1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0134g implements InterfaceC0143p {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f527d = 0;

    /* JADX INFO: renamed from: e */
    public final Object f528e;

    /* JADX INFO: renamed from: f */
    public final Object f529f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0134g(InterfaceC0132e interfaceC0132e, InterfaceC0143p interfaceC0143p) {
        AbstractC1665j.m2985e(interfaceC0132e, "defaultLifecycleObserver");
        this.f528e = interfaceC0132e;
        this.f529f = interfaceC0143p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0143p
    /* JADX INFO: renamed from: d */
    public final void mo147d(InterfaceC0145r interfaceC0145r, EnumC0140m enumC0140m) {
        switch (this.f527d) {
            case 0:
                InterfaceC0132e interfaceC0132e = (InterfaceC0132e) this.f528e;
                switch (AbstractC0133f.f526a[enumC0140m.ordinal()]) {
                    case BuildConfig.VERSION_CODE /* 1 */:
                        interfaceC0132e.getClass();
                        break;
                    case 2:
                        interfaceC0132e.mo180b(interfaceC0145r);
                        break;
                    case 3:
                        interfaceC0132e.mo181c(interfaceC0145r);
                        break;
                    case 4:
                        interfaceC0132e.getClass();
                        break;
                    case 5:
                        interfaceC0132e.mo182f(interfaceC0145r);
                        break;
                    case 6:
                        interfaceC0132e.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new C0330q();
                }
                InterfaceC0143p interfaceC0143p = (InterfaceC0143p) this.f529f;
                if (interfaceC0143p != null) {
                    interfaceC0143p.mo147d(interfaceC0145r, enumC0140m);
                    return;
                }
                return;
            case BuildConfig.VERSION_CODE /* 1 */:
                if (enumC0140m == EnumC0140m.ON_START) {
                    ((AbstractC0142o) this.f528e).mo185b(this);
                    ((C0780e) this.f529f).m1328d();
                    return;
                }
                return;
            case 2:
                HashMap map = ((C0129b) this.f529f).f519a;
                List list = (List) map.get(enumC0140m);
                Object obj = this.f528e;
                C0129b.m177a(list, interfaceC0145r, enumC0140m, obj);
                C0129b.m177a((List) map.get(EnumC0140m.ON_ANY), interfaceC0145r, enumC0140m, obj);
                return;
            default:
                C1833u c1833u = (C1833u) this.f528e;
                int i5 = AbstractC1838z.f6239a[enumC0140m.ordinal()];
                if (i5 == 1) {
                    c1833u.m3298g(true);
                    return;
                }
                if (i5 == 2) {
                    c1833u.m3298g(false);
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    c1833u.m707e();
                    ((AbstractC0142o) this.f529f).mo185b(this);
                    return;
                }
        }
    }

    public C0134g(InterfaceC0144q interfaceC0144q) {
        this.f528e = interfaceC0144q;
        C0131d c0131d = C0131d.f523c;
        Class<?> cls = interfaceC0144q.getClass();
        C0129b c0129b = (C0129b) c0131d.f524a.get(cls);
        this.f529f = c0129b == null ? c0131d.m179a(cls, null) : c0129b;
    }

    public C0134g(AbstractC0142o abstractC0142o, C0780e c0780e) {
        this.f528e = abstractC0142o;
        this.f529f = c0780e;
    }

    public C0134g(C1833u c1833u, C1809A c1809a, AbstractC0142o abstractC0142o) {
        this.f528e = c1833u;
        this.f529f = abstractC0142o;
    }
}
