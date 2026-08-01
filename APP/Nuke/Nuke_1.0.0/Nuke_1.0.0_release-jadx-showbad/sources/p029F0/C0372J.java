package p029F0;

import me.dartcv.nuke.BuildConfig;
import p041H0.AbstractC0567L;
import p041H0.AbstractC0596h0;
import p041H0.C0564I;
import p041H0.C0587d;
import p041H0.C0594g0;
import p041H0.C0618s0;
import p047I0.AbstractC0691Q;
import p047I0.C0684M0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p056K2.C0891q;
import p077P0.C1128o;
import p095T.AbstractC1385s;
import p095T.AbstractC1387t;
import p095T.C1316H0;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p100U.C1441b;
import p100U.C1448i;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p181j0.ViewOnAttachStateChangeListenerC2369d;
import p211o0.C2735J;
import p211o0.InterfaceC2760s;
import p228r0.C3029b;

/* JADX INFO: renamed from: F0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0372J extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1168e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1169f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f1170g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0372J(int i5, Object obj, Object obj2) {
        super(2);
        this.f1168e = i5;
        this.f1169f = obj;
        this.f1170g = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f1168e;
        Object obj3 = this.f1169f;
        Object obj4 = this.f1170g;
        C0891q c0891q = C0891q.f2780a;
        switch (i5) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Number) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (!c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1383r.m2563R();
                } else {
                    Boolean bool = (Boolean) ((C0365C) obj3).f1145g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    InterfaceC1603e interfaceC1603e = (InterfaceC1603e) obj4;
                    c1383r.m2570Y(bool);
                    boolean zM2584g = c1383r.m2584g(zBooleanValue);
                    if (zBooleanValue) {
                        interfaceC1603e.mo0g(c1383r, 0);
                    } else {
                        if (c1383r.f4895l != 0) {
                            AbstractC1387t.m2638a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!c1383r.f4881S) {
                            if (zM2584g) {
                                C1316H0 c1316h0 = c1383r.f4869G;
                                int i6 = c1316h0.f4697g;
                                int i7 = c1316h0.f4698h;
                                C1441b c1441b = c1383r.f4875M;
                                c1441b.getClass();
                                c1441b.m2733d(false);
                                c1441b.f5104b.f5102h.m2728z(C1448i.f5122c);
                                AbstractC1385s.m2618h(c1383r.f4902s, i6, i7);
                                c1383r.f4869G.m2434t();
                            } else {
                                c1383r.m2562Q();
                            }
                        }
                    }
                    if (c1383r.f4908y && c1383r.f4869G.f4699i == c1383r.f4909z) {
                        c1383r.f4909z = -1;
                        c1383r.f4908y = false;
                    }
                    c1383r.m2597p(false);
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC2760s interfaceC2760s = (InterfaceC2760s) obj;
                C3029b c3029b = (C3029b) obj2;
                AbstractC0596h0 abstractC0596h0 = (AbstractC0596h0) obj3;
                C0564I c0564i = abstractC0596h0.f1932r;
                if (!c0564i.m801I()) {
                    abstractC0596h0.f1930N = true;
                } else {
                    abstractC0596h0.f1927K = interfaceC2760s;
                    abstractC0596h0.f1926J = c3029b;
                    C0618s0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).getSnapshotObserver();
                    C2735J c2735j = AbstractC0596h0.f1912P;
                    snapshotObserver.f1972a.m3867c(abstractC0596h0, C0587d.f1875h, (C0594g0) obj4);
                    abstractC0596h0.f1930N = false;
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                AbstractC0691Q.m1199a((ViewTreeObserverOnGlobalLayoutListenerC0772y) obj3, (InterfaceC1603e) obj4, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                C1128o c1128o = (C1128o) obj2;
                ViewOnAttachStateChangeListenerC2369d viewOnAttachStateChangeListenerC2369d = (ViewOnAttachStateChangeListenerC2369d) obj4;
                if (!((C0684M0) obj3).f2201b.m4346b(c1128o.f3714g)) {
                    viewOnAttachStateChangeListenerC2369d.m4225l(iIntValue2, c1128o);
                    viewOnAttachStateChangeListenerC2369d.f7688k.mo4090o(c0891q);
                }
                break;
        }
        return c0891q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0372J(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, InterfaceC1603e interfaceC1603e, int i5) {
        super(2);
        this.f1168e = 2;
        this.f1169f = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f1170g = interfaceC1603e;
    }
}
