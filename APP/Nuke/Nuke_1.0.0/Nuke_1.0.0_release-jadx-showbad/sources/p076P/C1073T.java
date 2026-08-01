package p076P;

import java.util.LinkedHashMap;
import me.dartcv.nuke.BuildConfig;
import p021D3.C0274k;
import p027E4.C0330q;
import p056K2.C0887m;
import p056K2.C0891q;
import p091S.AbstractC1247s;
import p092S0.C1286x;
import p095T.AbstractC1385s;
import p095T.AbstractC1387t;
import p095T.C1305C;
import p095T.C1341U0;
import p112W2.InterfaceC1599a;
import p139c.AbstractC1883f;
import p140c0.AbstractC1885b;
import p140c0.C1884a;
import p152e0.AbstractC2001h;
import p152e0.C1997d;
import p153e1.C2010f;
import p158f0.C2088t;
import p163g0.AbstractC2173e;
import p163g0.AbstractC2175g;
import p216p.AbstractC2816I;
import p216p.C2829W;
import p216p.C2848h0;
import p216p.C2869z;
import p227r.AbstractC2945D;
import p255w.C3385p;

/* JADX INFO: renamed from: P.T */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1073T implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3341d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [S0.y.g(java.lang.Object, java.lang.Object):java.lang.Object, T.C.<init>(W2.c):void, Z2.a.a(boolean, W2.a, T.m, int):void, a.a.b(int, int, T.m, W2.c, h0.f, h0.p, p.h, r.k, u.h, u.U, w.p, boolean):void, p.m.k(T.m):p.h0, x.l.c(b0.e, T.m, int):void] */
    public /* synthetic */ C1073T(int i5) {
        this.f3341d = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() throws IllegalAccessException {
        int i5 = this.f3341d;
        C0891q c0891q = C0891q.f2780a;
        switch (i5) {
            case 0:
                return new C1071Q();
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C1077X();
            case 2:
                return new C2010f(0);
            case 3:
                return AbstractC1247s.f4455a;
            case 4:
                return new C1093g0(null, 32767);
            case 5:
                AbstractC1387t.m2639b("Unexpected call to default provider");
                throw new C0330q();
            case 6:
                C0887m c0887m = C0274k.f881a;
                C0274k.m477t();
                return c0891q;
            case 7:
                return AbstractC1385s.m2629s("");
            case 8:
                return AbstractC1385s.m2629s(null);
            case 9:
                return AbstractC1385s.m2629s(null);
            case 10:
                return AbstractC1385s.m2629s(Boolean.FALSE);
            case 11:
                return AbstractC1385s.m2629s(Boolean.FALSE);
            case 12:
                return c0891q;
            case 13:
                C1305C c1305c = AbstractC1883f.f6405a;
                return null;
            case 14:
                C1341U0 c1341u0 = AbstractC1885b.f6407a;
                return C1884a.f6406d;
            case 15:
                return new C1997d(new LinkedHashMap());
            case 16:
                C1341U0 c1341u02 = AbstractC2001h.f6721a;
                return null;
            case 17:
                C1341U0 c1341u03 = AbstractC2173e.f7133a;
                return null;
            case 18:
                C1341U0 c1341u04 = AbstractC2175g.f7135a;
                return null;
            case 19:
                C2088t c2088t = new C2088t(new C1286x(27));
                c2088t.m3868d();
                return c2088t;
            case 20:
                C1305C c1305c2 = AbstractC2816I.f8869a;
                return C2869z.f9060a;
            case 21:
                return new C2829W();
            case 22:
                return new C2848h0(0);
            case 23:
                float f2 = AbstractC2945D.f9309a;
                return c0891q;
            case 24:
                float f5 = AbstractC2945D.f9309a;
                return Boolean.TRUE;
            case 25:
                return new C3385p(0, 0);
            case 26:
                return AbstractC1385s.m2629s(Boolean.FALSE);
            case 27:
                return AbstractC1385s.m2629s(Boolean.FALSE);
            default:
                return AbstractC1385s.m2629s(Boolean.FALSE);
        }
    }
}
