package p000A;

import androidx.compose.p134ui.input.pointer.PointerInputEventHandler;
import p007B0.AbstractC0181N;
import p007B0.C0209w;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p108V3.C1541N;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1604f;
import p160f3.InterfaceC2160t;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p204n0.C2683b;

/* JADX INFO: renamed from: A.F0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0011F0 implements InterfaceC1604f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f50d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1601c f51e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0011F0(InterfaceC1601c interfaceC1601c, int i5) {
        this.f50d = i5;
        this.f51e = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        switch (this.f50d) {
            case 0:
                ((Integer) obj3).getClass();
                C1383r c1383r = (C1383r) ((InterfaceC1373m) obj2);
                c1383r.m2568W(-102778667);
                Object objM2558L = c1383r.m2558L();
                C1357e c1357e = C1371l.f4833a;
                if (objM2558L == c1357e) {
                    objM2558L = AbstractC1385s.m2622l(c1383r);
                    c1383r.m2585g0(objM2558L);
                }
                InterfaceC2160t interfaceC2160t = (InterfaceC2160t) objM2558L;
                Object objM2558L2 = c1383r.m2558L();
                if (objM2558L2 == c1357e) {
                    objM2558L2 = AbstractC1385s.m2629s(null);
                    c1383r.m2585g0(objM2558L2);
                }
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) objM2558L2;
                InterfaceC1347Y interfaceC1347YM2633w = AbstractC1385s.m2633w(this.f51e, c1383r);
                boolean zM2582f = c1383r.m2582f(null);
                Object objM2558L3 = c1383r.m2558L();
                if (zM2582f || objM2558L3 == c1357e) {
                    objM2558L3 = new C0013G0(interfaceC1347Y, 0);
                    c1383r.m2585g0(objM2558L3);
                }
                AbstractC1385s.m2613c(null, (InterfaceC1601c) objM2558L3, c1383r);
                boolean zM2586h = c1383r.m2586h(interfaceC2160t) | c1383r.m2582f(null) | c1383r.m2582f(interfaceC1347YM2633w);
                Object objM2558L4 = c1383r.m2558L();
                if (zM2586h || objM2558L4 == c1357e) {
                    objM2558L4 = new C1541N(interfaceC2160t, interfaceC1347Y, interfaceC1347YM2633w);
                    c1383r.m2585g0(objM2558L4);
                }
                InterfaceC2207p interfaceC2207pM265a = AbstractC0181N.m265a(C2204m.f7185a, null, (PointerInputEventHandler) objM2558L4);
                c1383r.m2597p(false);
                return interfaceC2207pM265a;
            default:
                this.f51e.mo1h(new C2683b(((C0209w) obj2).f713c));
                return C0891q.f2780a;
        }
    }
}
