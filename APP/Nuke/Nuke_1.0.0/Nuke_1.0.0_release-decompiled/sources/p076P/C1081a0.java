package p076P;

import androidx.compose.p134ui.input.pointer.PointerInputEventHandler;
import p000A.C0071l;
import p007B0.AbstractC0181N;
import p029F0.InterfaceC0377O;
import p041H0.C0551B;
import p041H0.C0589e;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p047I0.AbstractC0757q0;
import p056K2.C0891q;
import p077P0.AbstractC1126m;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.C1843e;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.InterfaceC2207p;
import p211o0.InterfaceC2738M;
import p244u.AbstractC3282o;

/* JADX INFO: renamed from: P.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1081a0 implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC2207p f3366d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2738M f3367e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f3368f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f3369g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ float f3370h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1843e f3371i;

    public C1081a0(InterfaceC2207p interfaceC2207p, InterfaceC2738M interfaceC2738M, long j5, float f2, float f5, C1843e c1843e) {
        this.f3366d = interfaceC2207p;
        this.f3367e = interfaceC2738M;
        this.f3368f = j5;
        this.f3369g = f2;
        this.f3370h = f5;
        this.f3371i = c1843e;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        int iIntValue = ((Number) obj2).intValue();
        C1383r c1383r = (C1383r) interfaceC1373m;
        boolean zM2560O = c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2);
        C0891q c0891q = C0891q.f2780a;
        if (!zM2560O) {
            c1383r.m2563R();
            return c0891q;
        }
        InterfaceC2207p interfaceC2207pM2143b = AbstractC1085c0.m2143b(this.f3366d, this.f3367e, AbstractC1085c0.m2144c(this.f3368f, this.f3369g, c1383r), ((InterfaceC2007c) c1383r.m2590j(AbstractC0757q0.f2358h)).mo268G(this.f3370h));
        Object objM2558L = c1383r.m2558L();
        C1357e c1357e = C1371l.f4833a;
        if (objM2558L == c1357e) {
            objM2558L = new C0071l(28);
            c1383r.m2585g0(objM2558L);
        }
        InterfaceC2207p interfaceC2207pM2162a = AbstractC1126m.m2162a(interfaceC2207pM2143b, false, (InterfaceC1601c) objM2558L);
        Object objM2558L2 = c1383r.m2558L();
        if (objM2558L2 == c1357e) {
            objM2558L2 = C1079Z.f3364a;
            c1383r.m2585g0(objM2558L2);
        }
        InterfaceC2207p interfaceC2207pM265a = AbstractC0181N.m265a(interfaceC2207pM2162a, c0891q, (PointerInputEventHandler) objM2558L2);
        InterfaceC0377O interfaceC0377OM5561d = AbstractC3282o.m5561d(C2194c.f7160d, true);
        int iHashCode = Long.hashCode(c1383r.f4882T);
        InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
        InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207pM265a);
        InterfaceC0593g.f1909a.getClass();
        C0551B c0551b = C0591f.f1902b;
        c1383r.m2571Z();
        if (c1383r.f4881S) {
            c1383r.m2592k(c0551b);
        } else {
            c1383r.m2591j0();
        }
        AbstractC1385s.m2635y(c1383r, C0591f.f1905e, interfaceC0377OM5561d);
        AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
        C0589e c0589e = C0591f.f1906f;
        if (c1383r.f4881S || !AbstractC1665j.m2981a(c1383r.m2558L(), Integer.valueOf(iHashCode))) {
            c1383r.m2585g0(Integer.valueOf(iHashCode));
            c1383r.m2574b(c0589e, Integer.valueOf(iHashCode));
        }
        AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
        this.f3371i.mo0g(c1383r, 0);
        c1383r.m2597p(true);
        return c0891q;
    }
}
