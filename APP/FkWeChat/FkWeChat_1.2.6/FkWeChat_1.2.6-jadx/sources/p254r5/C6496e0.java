package p254r5;

import ae.C0307f;
import bsh.C1259t2;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p215oc.C5725t;
import p269s5.C7188c;

/* JADX INFO: renamed from: r5.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6496e0 extends AbstractC6500g0 {

    /* JADX INFO: renamed from: q */
    public final C7188c f20404q;

    /* JADX INFO: renamed from: r */
    public C6492c0 f20405r;

    /* JADX INFO: renamed from: s */
    public static final ConcurrentMap f20396s = new ConcurrentHashMap(1000, 0.75f);

    /* JADX INFO: renamed from: t */
    public static final C6496e0 f20397t = new C6496e0(C7188c.f23837P);

    /* JADX INFO: renamed from: u */
    public static final C6496e0 f20398u = new C6496e0(C7188c.f23841T);

    /* JADX INFO: renamed from: v */
    public static final C6496e0 f20399v = new C6496e0(C7188c.f23842U);

    /* JADX INFO: renamed from: w */
    public static final C6496e0 f20400w = new C6496e0(C7188c.f23843V);

    /* JADX INFO: renamed from: x */
    public static final C6496e0 f20401x = new C6496e0(C7188c.f23844W);

    /* JADX INFO: renamed from: y */
    public static final C6496e0 f20402y = new C6496e0(C7188c.f23845X);

    /* JADX INFO: renamed from: z */
    public static final C6496e0 f20403z = new C6496e0(C7188c.f23847Z);

    /* JADX INFO: renamed from: A */
    public static final C6496e0 f20383A = new C6496e0(C7188c.f23846Y);

    /* JADX INFO: renamed from: B */
    public static final C6496e0 f20384B = new C6496e0(C7188c.f23848a0);

    /* JADX INFO: renamed from: C */
    public static final C6496e0 f20385C = new C6496e0(C7188c.f23849b0);

    /* JADX INFO: renamed from: D */
    public static final C6496e0 f20386D = new C6496e0(C7188c.f23850c0);

    /* JADX INFO: renamed from: E */
    public static final C6496e0 f20387E = new C6496e0(C7188c.f23851d0);

    /* JADX INFO: renamed from: F */
    public static final C6496e0 f20388F = new C6496e0(C7188c.f23852e0);

    /* JADX INFO: renamed from: G */
    public static final C6496e0 f20389G = new C6496e0(C7188c.f23853f0);

    /* JADX INFO: renamed from: H */
    public static final C6496e0 f20390H = new C6496e0(C7188c.f23854g0);

    /* JADX INFO: renamed from: I */
    public static final C6496e0 f20391I = new C6496e0(C7188c.f23856i0);

    /* JADX INFO: renamed from: J */
    public static final C6496e0 f20392J = new C6496e0(C7188c.f23855h0);

    /* JADX INFO: renamed from: K */
    public static final C6496e0 f20393K = new C6496e0(C7188c.f23858k0);

    /* JADX INFO: renamed from: L */
    public static final C6496e0 f20394L = new C6496e0(C7188c.f23834M);

    /* JADX INFO: renamed from: M */
    public static final C6496e0 f20395M = new C6496e0(C7188c.f23836O);

    static {
        m25757t();
    }

    public C6496e0(C7188c c7188c) {
        if (c7188c == null) {
            C1259t2.m5095a("type == null");
            throw null;
        }
        if (c7188c == C7188c.f23829H) {
            C5725t.m23179a("KNOWN_NULL is not representable");
            throw null;
        }
        this.f20404q = c7188c;
        this.f20405r = null;
    }

    /* JADX INFO: renamed from: k */
    public static C6496e0 m25756k(C7188c c7188c) {
        switch (c7188c.mo6841i()) {
            case 0:
                return f20385C;
            case 1:
                return f20398u;
            case 2:
                return f20399v;
            case 3:
                return f20400w;
            case 4:
                return f20401x;
            case 5:
                return f20402y;
            case 6:
                return f20383A;
            case 7:
                return f20403z;
            case 8:
                return f20384B;
            default:
                C0307f.m923a("not primitive: ", c7188c);
                return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m25757t() {
        m25759v(f20397t);
        m25759v(f20398u);
        m25759v(f20399v);
        m25759v(f20400w);
        m25759v(f20401x);
        m25759v(f20402y);
        m25759v(f20403z);
        m25759v(f20383A);
        m25759v(f20384B);
        m25759v(f20385C);
        m25759v(f20386D);
        m25759v(f20387E);
        m25759v(f20388F);
        m25759v(f20389G);
        m25759v(f20390H);
        m25759v(f20391I);
        m25759v(f20392J);
        m25759v(f20393K);
        m25759v(f20394L);
    }

    /* JADX INFO: renamed from: u */
    public static C6496e0 m25758u(C7188c c7188c) {
        C6496e0 c6496e0 = new C6496e0(c7188c);
        C6496e0 c6496e02 = (C6496e0) f20396s.putIfAbsent(c7188c, c6496e0);
        return c6496e02 != null ? c6496e02 : c6496e0;
    }

    /* JADX INFO: renamed from: v */
    public static void m25759v(C6496e0 c6496e0) {
        if (f20396s.putIfAbsent(c6496e0.m25760n(), c6496e0) == null) {
            return;
        }
        C6494d0.m25749a("Attempted re-init of ", c6496e0);
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        return this.f20404q.m28419p().compareTo(((C6496e0) abstractC6487a).f20404q.m28419p());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6496e0) && this.f20404q == ((C6496e0) obj).f20404q;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return this.f20404q.mo6828g();
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23832K;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public boolean mo25728h() {
        return false;
    }

    public int hashCode() {
        return this.f20404q.hashCode();
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "type";
    }

    /* JADX INFO: renamed from: n */
    public C7188c m25760n() {
        return this.f20404q;
    }

    /* JADX INFO: renamed from: p */
    public C6492c0 m25761p() {
        if (this.f20405r == null) {
            this.f20405r = new C6492c0(this.f20404q.m28419p());
        }
        return this.f20405r;
    }

    /* JADX INFO: renamed from: s */
    public String m25762s() {
        String strM25741n = m25761p().m25741n();
        int iLastIndexOf = strM25741n.lastIndexOf(47);
        return iLastIndexOf == -1 ? "default" : strM25741n.substring(strM25741n.lastIndexOf(91) + 2, iLastIndexOf).replace('/', '.');
    }

    public String toString() {
        return "type{" + mo6828g() + '}';
    }
}
