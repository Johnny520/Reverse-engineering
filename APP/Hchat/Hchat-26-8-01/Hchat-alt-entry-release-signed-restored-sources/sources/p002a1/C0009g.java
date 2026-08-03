package p002a1;

import gg.AbstractC1417m;
import p071f1.C1020o0;
import p071f1.InterfaceC1031u;
import p072f2.C1054q;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1855m;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p118i1.C1902b;
import p159l0.C2425g;
import p175m0.C2684b;
import p175m0.C2698i;
import p276sf.C3967n;
import p308v1.AbstractC4434w;
import p308v1.C4376b0;
import p339x1.AbstractC5613i0;
import p339x1.AbstractC5614i1;
import p339x1.C5593d;
import p339x1.C5602f0;
import p339x1.C5603f1;
import p339x1.C5647t1;
import p356y0.InterfaceC5853o;
import p357y1.C5881f2;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: a1.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0009g extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f24h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f25i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0009g(InterfaceC5853o interfaceC5853o, InterfaceC1235p interfaceC1235p, int i9) {
        super(2);
        this.f23g = 2;
        this.f24h = interfaceC5853o;
        this.f25i = interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9 = this.f23g;
        C3967n c3967n = C3967n.f12976a;
        Object obj3 = this.f25i;
        Object obj4 = this.f24h;
        switch (i9) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C1054q c1054q = (C1054q) obj2;
                ViewOnAttachStateChangeListenerC0011i viewOnAttachStateChangeListenerC0011i = (ViewOnAttachStateChangeListenerC0011i) obj3;
                if (!((C5881f2) obj4).f23881b.m2381b(c1054q.f3352f)) {
                    viewOnAttachStateChangeListenerC0011i.m162m(iIntValue, c1054q);
                    viewOnAttachStateChangeListenerC0011i.f35n.mo8208p(c3967n);
                }
                break;
            case 1:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c1836h0.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1836h0.m4519V();
                } else {
                    Boolean bool = (Boolean) ((C4376b0) obj4).f14591g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    InterfaceC1235p interfaceC1235p = (InterfaceC1235p) obj3;
                    c1836h0.m4529c0(bool);
                    boolean zM4536g = c1836h0.m4536g(zBooleanValue);
                    if (zBooleanValue) {
                        interfaceC1235p.invoke(c1836h0, 0);
                    } else {
                        if (c1836h0.f6108l != 0) {
                            AbstractC1855m.m4573a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!c1836h0.f6094S) {
                            if (zM4536g) {
                                C2425g c2425g = c1836h0.f6082G;
                                int i10 = c2425g.f7941g;
                                int i11 = c2425g.f7942h;
                                C2684b c2684b = c1836h0.f6088M;
                                c2684b.getClass();
                                c2684b.m6130d(false);
                                c2684b.f8742b.f8739j.m6136U(C2698i.f8767c);
                                AbstractC1874r.m4629k(c1836h0.f6115s, i10, i11);
                                c1836h0.f6082G.m5779t();
                            } else {
                                c1836h0.m4518U();
                            }
                        }
                    }
                    if (c1836h0.f6121y && c1836h0.f6082G.f7943i == c1836h0.f6122z) {
                        c1836h0.f6122z = -1;
                        c1836h0.f6121y = false;
                    }
                    c1836h0.m4553p(false);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                AbstractC4434w.m8878b((InterfaceC5853o) obj4, (InterfaceC1235p) obj3, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            default:
                InterfaceC1031u interfaceC1031u = (InterfaceC1031u) obj;
                C1902b c1902b = (C1902b) obj2;
                AbstractC5614i1 abstractC5614i1 = (AbstractC5614i1) obj4;
                C5602f0 c5602f0 = abstractC5614i1.f22868u;
                if (!c5602f0.m10011H()) {
                    abstractC5614i1.f22865Q = true;
                } else {
                    abstractC5614i1.f22862N = interfaceC1031u;
                    abstractC5614i1.f22861M = c1902b;
                    C5647t1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0)).getSnapshotObserver();
                    C1020o0 c1020o0 = AbstractC5614i1.f22844T;
                    snapshotObserver.f23001a.m9162c(abstractC5614i1, C5593d.f22732j, (C5603f1) obj3);
                    abstractC5614i1.f22865Q = false;
                }
                break;
        }
        return c3967n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0009g(Object obj, int i9, Object obj2) {
        super(2);
        this.f23g = i9;
        this.f24h = obj;
        this.f25i = obj2;
    }
}
