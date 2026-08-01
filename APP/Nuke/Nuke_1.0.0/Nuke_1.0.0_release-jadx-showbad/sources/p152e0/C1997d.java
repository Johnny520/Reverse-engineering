package p152e0;

import java.util.Map;
import p000A.C0038T0;
import p000A.C0049a;
import p000A.C0075n;
import p008B1.C0214b;
import p052J1.AbstractC0831a;
import p056K2.C0891q;
import p092S0.C1286x;
import p092S0.C1287y;
import p095T.AbstractC1385s;
import p095T.C1341U0;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1386s0;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p136b0.C1843e;
import p186k.AbstractC2415L;
import p186k.C2408E;

/* JADX INFO: renamed from: e0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1997d implements InterfaceC1996c {

    /* JADX INFO: renamed from: h */
    public static final C0038T0 f6713h;

    /* JADX INFO: renamed from: d */
    public final Map f6714d;

    /* JADX INFO: renamed from: e */
    public final C2408E f6715e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1999f f6716f;

    /* JADX INFO: renamed from: g */
    public final C0049a f6717g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 29;
        f6713h = new C0038T0(i5, new C1287y((byte) 0, 14), new C1286x(21));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1997d(Map map) {
        this.f6714d = map;
        long[] jArr = AbstractC2415L.f7816a;
        this.f6715e = new C2408E();
        this.f6717g = new C0049a(19, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152e0.InterfaceC1996c
    /* JADX INFO: renamed from: e */
    public final void mo3667e(Object obj, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(533563200);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2586h(obj) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2586h(this) ? 256 : 128;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            c1383r.m2570Y(obj);
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (objM2558L == c1357e) {
                C0049a c0049a = this.f6717g;
                if (!((Boolean) c0049a.mo1h(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f6714d.get(obj);
                C1341U0 c1341u0 = AbstractC2001h.f6721a;
                C2002i c2002i = new C2002i(new C2000g(map, c0049a));
                c1383r.m2585g0(c2002i);
                objM2558L = c2002i;
            }
            C2002i c2002i2 = (C2002i) objM2558L;
            AbstractC1385s.m2612b(new C1386s0[]{AbstractC2001h.f6721a.mo2399a(c2002i2), AbstractC0831a.f2692a.mo2399a(c2002i2)}, c1843e, c1383r, (i6 & 112) | 8);
            boolean zM2586h = c1383r.m2586h(this) | c1383r.m2586h(obj) | c1383r.m2586h(c2002i2);
            Object objM2558L2 = c1383r.m2558L();
            if (zM2586h || objM2558L2 == c1357e) {
                objM2558L2 = new C0075n(this, obj, c2002i2, 11);
                c1383r.m2585g0(objM2558L2);
            }
            AbstractC1385s.m2613c(C0891q.f2780a, (InterfaceC1601c) objM2558L2, c1383r);
            if (c1383r.f4908y && c1383r.f4869G.f4699i == c1383r.f4909z) {
                c1383r.f4909z = -1;
                c1383r.f4908y = false;
            }
            c1383r.m2597p(false);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0214b(this, obj, c1843e, i5, 6);
        }
    }
}
