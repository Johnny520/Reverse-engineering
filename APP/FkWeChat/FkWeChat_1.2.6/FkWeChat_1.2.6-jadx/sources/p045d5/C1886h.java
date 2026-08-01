package p045d5;

import bsh.C1259t2;
import p254r5.C6496e0;
import p269s5.C7187b;
import p269s5.InterfaceC7190e;
import p309v5.AbstractC8824f;
import p309v5.C8829k;
import p376zd.C9987e;

/* JADX INFO: renamed from: d5.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1886h extends AbstractC8824f {

    /* JADX INFO: renamed from: s */
    public static final C1886h f5242s = new C1886h(0);

    /* JADX INFO: renamed from: d5.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f5243a;

        /* JADX INFO: renamed from: b */
        public final int f5244b;

        /* JADX INFO: renamed from: c */
        public final int f5245c;

        /* JADX INFO: renamed from: d */
        public final C6496e0 f5246d;

        public a(int i10, int i11, int i12, C6496e0 c6496e0) {
            if (i10 < 0) {
                C9987e.m38645a("startPc < 0");
                throw null;
            }
            if (i11 < i10) {
                C9987e.m38645a("endPc < startPc");
                throw null;
            }
            if (i12 < 0) {
                C9987e.m38645a("handlerPc < 0");
                throw null;
            }
            this.f5243a = i10;
            this.f5244b = i11;
            this.f5245c = i12;
            this.f5246d = c6496e0;
        }

        /* JADX INFO: renamed from: a */
        public boolean m6731a(int i10) {
            return i10 >= this.f5243a && i10 < this.f5244b;
        }

        /* JADX INFO: renamed from: b */
        public int m6732b() {
            return this.f5244b;
        }

        /* JADX INFO: renamed from: c */
        public C6496e0 m6733c() {
            C6496e0 c6496e0 = this.f5246d;
            return c6496e0 != null ? c6496e0 : C6496e0.f20397t;
        }

        /* JADX INFO: renamed from: d */
        public int m6734d() {
            return this.f5245c;
        }

        /* JADX INFO: renamed from: e */
        public int m6735e() {
            return this.f5243a;
        }
    }

    public C1886h(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m6723K(a aVar, a[] aVarArr, int i10) {
        C6496e0 c6496e0M6733c = aVar.m6733c();
        for (int i11 = 0; i11 < i10; i11++) {
            C6496e0 c6496e0M6733c2 = aVarArr[i11].m6733c();
            if (c6496e0M6733c2 == c6496e0M6733c || c6496e0M6733c2 == C6496e0.f20397t) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public a m6724E(int i10) {
        return (a) m33887w(i10);
    }

    /* JADX INFO: renamed from: F */
    public C1886h m6725F(int i10) {
        int size = size();
        a[] aVarArr = new a[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            a aVarM6724E = m6724E(i12);
            if (aVarM6724E.m6731a(i10) && m6723K(aVarM6724E, aVarArr, i11)) {
                aVarArr[i11] = aVarM6724E;
                i11++;
            }
        }
        if (i11 == 0) {
            return f5242s;
        }
        C1886h c1886h = new C1886h(i11);
        for (int i13 = 0; i13 < i11; i13++) {
            c1886h.m6727H(i13, aVarArr[i13]);
        }
        c1886h.mo6829t();
        return c1886h;
    }

    /* JADX INFO: renamed from: G */
    public void m6726G(int i10, int i11, int i12, int i13, C6496e0 c6496e0) {
        m33889y(i10, new a(i11, i12, i13, c6496e0));
    }

    /* JADX INFO: renamed from: H */
    public void m6727H(int i10, a aVar) {
        if (aVar != null) {
            m33889y(i10, aVar);
        } else {
            C1259t2.m5095a("item == null");
        }
    }

    /* JADX INFO: renamed from: I */
    public InterfaceC7190e m6728I() {
        int size = size();
        if (size == 0) {
            return C7187b.f23814s;
        }
        C7187b c7187b = new C7187b(size);
        for (int i10 = 0; i10 < size; i10++) {
            c7187b.m28400N(i10, m6724E(i10).m6733c().m25760n());
        }
        c7187b.mo6829t();
        return c7187b;
    }

    /* JADX INFO: renamed from: J */
    public C8829k m6729J(int i10) {
        if (i10 < -1) {
            C9987e.m38645a("noException < -1");
            return null;
        }
        int i11 = i10 >= 0 ? 1 : 0;
        int size = size();
        if (size == 0) {
            return i11 != 0 ? C8829k.m33905D(i10) : C8829k.f29361u;
        }
        C8829k c8829k = new C8829k(size + i11);
        for (int i12 = 0; i12 < size; i12++) {
            c8829k.m33917w(m6724E(i12).m6734d());
        }
        if (i11 != 0) {
            c8829k.m33917w(i10);
        }
        c8829k.mo6829t();
        return c8829k;
    }

    /* JADX INFO: renamed from: a */
    public int m6730a() {
        return (size() * 8) + 2;
    }
}
