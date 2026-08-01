package p045d5;

import bsh.C1259t2;
import p239q5.C6260k;
import p254r5.C6492c0;
import p269s5.C7188c;
import p309v5.AbstractC8824f;
import p376zd.C9987e;

/* JADX INFO: renamed from: d5.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1893o extends AbstractC8824f {

    /* JADX INFO: renamed from: s */
    public static final C1893o f5271s = new C1893o(0);

    /* JADX INFO: renamed from: d5.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f5272a;

        /* JADX INFO: renamed from: b */
        public final int f5273b;

        /* JADX INFO: renamed from: c */
        public final C6492c0 f5274c;

        /* JADX INFO: renamed from: d */
        public final C6492c0 f5275d;

        /* JADX INFO: renamed from: e */
        public final C6492c0 f5276e;

        /* JADX INFO: renamed from: f */
        public final int f5277f;

        public a(int i10, int i11, C6492c0 c6492c0, C6492c0 c6492c02, C6492c0 c6492c03, int i12) {
            if (i10 < 0) {
                C9987e.m38645a("startPc < 0");
                throw null;
            }
            if (i11 < 0) {
                C9987e.m38645a("length < 0");
                throw null;
            }
            if (c6492c0 == null) {
                C1259t2.m5095a("name == null");
                throw null;
            }
            if (c6492c02 == null && c6492c03 == null) {
                C1259t2.m5095a("(descriptor == null) && (signature == null)");
                throw null;
            }
            if (i12 < 0) {
                C9987e.m38645a("index < 0");
                throw null;
            }
            this.f5272a = i10;
            this.f5273b = i11;
            this.f5274c = c6492c0;
            this.f5275d = c6492c02;
            this.f5276e = c6492c03;
            this.f5277f = i12;
        }

        /* JADX INFO: renamed from: b */
        public C6260k m6807b() {
            return C6260k.m24713i(this.f5274c, this.f5276e);
        }

        /* JADX INFO: renamed from: c */
        public final C6492c0 m6808c() {
            return this.f5276e;
        }

        /* JADX INFO: renamed from: d */
        public C7188c m6809d() {
            return C7188c.m28404v(this.f5275d.m25741n());
        }

        /* JADX INFO: renamed from: e */
        public boolean m6810e(a aVar) {
            return this.f5272a == aVar.f5272a && this.f5273b == aVar.f5273b && this.f5277f == aVar.f5277f && this.f5274c.equals(aVar.f5274c);
        }

        /* JADX INFO: renamed from: f */
        public boolean m6811f(int i10, int i11) {
            int i12;
            return i11 == this.f5277f && i10 >= (i12 = this.f5272a) && i10 < i12 + this.f5273b;
        }

        /* JADX INFO: renamed from: g */
        public a m6812g(C6492c0 c6492c0) {
            return new a(this.f5272a, this.f5273b, this.f5274c, this.f5275d, c6492c0, this.f5277f);
        }
    }

    public C1893o(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: E */
    public static C1893o m6799E(C1893o c1893o, C1893o c1893o2) {
        if (c1893o == f5271s) {
            return c1893o2;
        }
        int size = c1893o.size();
        int size2 = c1893o2.size();
        C1893o c1893o3 = new C1893o(size + size2);
        for (int i10 = 0; i10 < size; i10++) {
            c1893o3.m6805K(i10, c1893o.m6801F(i10));
        }
        for (int i11 = 0; i11 < size2; i11++) {
            c1893o3.m6805K(size + i11, c1893o2.m6801F(i11));
        }
        c1893o3.mo6829t();
        return c1893o3;
    }

    /* JADX INFO: renamed from: H */
    public static C1893o m6800H(C1893o c1893o, C1893o c1893o2) {
        int size = c1893o.size();
        C1893o c1893o3 = new C1893o(size);
        for (int i10 = 0; i10 < size; i10++) {
            a aVarM6801F = c1893o.m6801F(i10);
            a aVarM6802G = c1893o2.m6802G(aVarM6801F);
            if (aVarM6802G != null) {
                aVarM6801F = aVarM6801F.m6812g(aVarM6802G.m6808c());
            }
            c1893o3.m6805K(i10, aVarM6801F);
        }
        c1893o3.mo6829t();
        return c1893o3;
    }

    /* JADX INFO: renamed from: F */
    public a m6801F(int i10) {
        return (a) m33887w(i10);
    }

    /* JADX INFO: renamed from: G */
    public a m6802G(a aVar) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar2 = (a) m33887w(i10);
            if (aVar2 != null && aVar2.m6810e(aVar)) {
                return aVar2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public a m6803I(int i10, int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar = (a) m33887w(i12);
            if (aVar != null && aVar.m6811f(i10, i11)) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public void m6804J(int i10, int i11, int i12, C6492c0 c6492c0, C6492c0 c6492c02, C6492c0 c6492c03, int i13) {
        m33889y(i10, new a(i11, i12, c6492c0, c6492c02, c6492c03, i13));
    }

    /* JADX INFO: renamed from: K */
    public void m6805K(int i10, a aVar) {
        if (aVar != null) {
            m33889y(i10, aVar);
        } else {
            C1259t2.m5095a("item == null");
        }
    }
}
