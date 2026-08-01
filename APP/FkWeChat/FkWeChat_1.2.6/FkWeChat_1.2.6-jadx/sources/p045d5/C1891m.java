package p045d5;

import bsh.C1193i2;
import bsh.C1259t2;
import p020b5.C0996b;
import p254r5.C6496e0;
import p269s5.C7187b;
import p269s5.C7188c;
import p309v5.C8829k;

/* JADX INFO: renamed from: d5.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1891m {

    /* JADX INFO: renamed from: a */
    public final AbstractC1894p f5265a;

    /* JADX INFO: renamed from: b */
    public final C1890l f5266b;

    /* JADX INFO: renamed from: c */
    public final C8829k f5267c;

    public C1891m(AbstractC1894p abstractC1894p, C1890l c1890l, C8829k c8829k) {
        if (abstractC1894p == null) {
            C1259t2.m5095a("locals == null");
            throw null;
        }
        if (c1890l == null) {
            C1259t2.m5095a("stack == null");
            throw null;
        }
        c8829k.m33930v();
        this.f5265a = abstractC1894p;
        this.f5266b = c1890l;
        this.f5267c = c8829k;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1894p m6777a(AbstractC1894p abstractC1894p, C8829k c8829k) {
        if (!(abstractC1894p instanceof C1895q)) {
            return abstractC1894p;
        }
        C1895q c1895q = (C1895q) abstractC1894p;
        return c8829k.size() == 0 ? c1895q.mo6821z() : c1895q;
    }

    /* JADX INFO: renamed from: b */
    public void m6778b(C0996b c0996b) {
        this.f5265a.mo6818w(c0996b);
        this.f5266b.m6773w(c0996b);
    }

    /* JADX INFO: renamed from: c */
    public C1891m m6779c() {
        return new C1891m(this.f5265a.mo6819x(), this.f5266b.m6776z(), this.f5267c);
    }

    /* JADX INFO: renamed from: d */
    public AbstractC1894p m6780d() {
        return this.f5265a;
    }

    /* JADX INFO: renamed from: e */
    public C1890l m6781e() {
        return this.f5266b;
    }

    /* JADX INFO: renamed from: f */
    public C8829k m6782f() {
        return this.f5267c;
    }

    /* JADX INFO: renamed from: g */
    public void m6783g(C7187b c7187b) {
        int size = c7187b.size();
        int iM28416j = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C7188c c7188cM28398G = c7187b.m28398G(i10);
            this.f5265a.mo6816D(iM28416j, c7188cM28398G);
            iM28416j += c7188cM28398G.m28416j();
        }
    }

    /* JADX INFO: renamed from: h */
    public C1891m m6784h(C6496e0 c6496e0) {
        C1890l c1890lM6776z = m6781e().m6776z();
        c1890lM6776z.m6775y();
        c1890lM6776z.m6771G(c6496e0);
        return new C1891m(m6780d(), c1890lM6776z, this.f5267c);
    }

    /* JADX INFO: renamed from: i */
    public void m6785i(C7188c c7188c) {
        this.f5265a.mo6813A(c7188c);
        this.f5266b.m6765A(c7188c);
    }

    /* JADX INFO: renamed from: j */
    public C1891m m6786j(int i10, int i11) {
        this.f5267c.m33910F().m33917w(i10);
        return new C1891m(this.f5265a.mo6821z(), this.f5266b, C8829k.m33905D(i10)).m6789m(this, i10, i11);
    }

    /* JADX INFO: renamed from: k */
    public final C8829k m6787k(C8829k c8829k) {
        if (this.f5267c.equals(c8829k)) {
            return this.f5267c;
        }
        C8829k c8829k2 = new C8829k();
        int size = this.f5267c.size();
        int size2 = c8829k.size();
        for (int i10 = 0; i10 < size && i10 < size2 && this.f5267c.m33920z(i10) == c8829k.m33920z(i10); i10++) {
            c8829k2.m33917w(i10);
        }
        c8829k2.mo6829t();
        return c8829k2;
    }

    /* JADX INFO: renamed from: l */
    public C1891m m6788l(C1891m c1891m) {
        AbstractC1894p abstractC1894pMo6814B = m6780d().mo6814B(c1891m.m6780d());
        C1890l c1890lM6766B = m6781e().m6766B(c1891m.m6781e());
        C8829k c8829kM6787k = m6787k(c1891m.f5267c);
        AbstractC1894p abstractC1894pM6777a = m6777a(abstractC1894pMo6814B, c8829kM6787k);
        return (abstractC1894pM6777a == m6780d() && c1890lM6766B == m6781e() && this.f5267c == c8829kM6787k) ? this : new C1891m(abstractC1894pM6777a, c1890lM6766B, c8829kM6787k);
    }

    /* JADX INFO: renamed from: m */
    public C1891m m6789m(C1891m c1891m, int i10, int i11) {
        C1895q c1895qMo6815C = m6780d().mo6815C(c1891m.m6780d(), i11);
        C1890l c1890lM6766B = m6781e().m6766B(c1891m.m6781e());
        C8829k c8829kM33910F = c1891m.f5267c.m33910F();
        c8829kM33910F.m33917w(i10);
        c8829kM33910F.mo6829t();
        if (c1895qMo6815C == m6780d() && c1890lM6766B == m6781e() && this.f5267c.equals(c8829kM33910F)) {
            return this;
        }
        boolean zEquals = this.f5267c.equals(c8829kM33910F);
        C8829k c8829k = this.f5267c;
        if (!zEquals) {
            int size = c8829k.size();
            int size2 = c8829kM33910F.size();
            C8829k c8829k2 = this.f5267c;
            if (size > size2) {
                c8829k2 = c8829kM33910F;
                c8829kM33910F = c8829k2;
            }
            int size3 = c8829kM33910F.size();
            int size4 = c8829k2.size();
            for (int i12 = size4 - 1; i12 >= 0; i12--) {
                if (c8829k2.m33920z(i12) != c8829kM33910F.m33920z((size3 - size4) + i12)) {
                    C1193i2.m4438a("Incompatible merged subroutines");
                    return null;
                }
            }
            c8829k = c8829kM33910F;
        }
        return new C1891m(c1895qMo6815C, c1890lM6766B, c8829k);
    }

    /* JADX INFO: renamed from: n */
    public void m6790n() {
        this.f5265a.mo6829t();
        this.f5266b.mo6829t();
    }

    /* JADX INFO: renamed from: o */
    public C1891m m6791o(int i10, int i11) {
        AbstractC1894p abstractC1894p = this.f5265a;
        AbstractC1894p abstractC1894pM6827K = abstractC1894p instanceof C1895q ? ((C1895q) abstractC1894p).m6827K(i11) : null;
        try {
            C8829k c8829kM33910F = this.f5267c.m33910F();
            if (c8829kM33910F.m33911G() != i10) {
                throw new RuntimeException("returning from invalid subroutine");
            }
            c8829kM33910F.mo6829t();
            if (abstractC1894pM6827K == null) {
                return null;
            }
            return new C1891m(abstractC1894pM6827K, this.f5266b, c8829kM33910F);
        } catch (IndexOutOfBoundsException unused) {
            C1193i2.m4438a("returning from invalid subroutine");
            return null;
        } catch (NullPointerException unused2) {
            C1259t2.m5095a("can't return from non-subroutine");
            return null;
        }
    }

    public C1891m(AbstractC1894p abstractC1894p, C1890l c1890l) {
        this(abstractC1894p, c1890l, C8829k.f29361u);
    }

    public C1891m(int i10, int i11) {
        this(new C1898t(i10), new C1890l(i11));
    }
}
