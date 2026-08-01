package p076f5;

import bsh.C1259t2;
import p032c5.C1328b;
import p032c5.C1344r;
import p045d5.C1883e;
import p061e5.C2028a;
import p094g5.C2526i;
import p094g5.C2528k;
import p094g5.InterfaceC2518a;
import p094g5.InterfaceC2519b;
import p094g5.InterfaceC2520c;
import p094g5.InterfaceC2522e;
import p094g5.InterfaceC2525h;
import p094g5.InterfaceC2527j;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p254r5.C6498f0;
import p254r5.InterfaceC6489b;
import p269s5.C7187b;
import p269s5.C7188c;
import p269s5.InterfaceC7190e;
import p280t5.C8130u;
import p309v5.AbstractC8826h;
import p309v5.C8822d;
import p376zd.C10010p0;
import p376zd.C9987e;

/* JADX INFO: renamed from: f5.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C2293e implements InterfaceC2520c {

    /* JADX INFO: renamed from: a */
    public final String f6276a;

    /* JADX INFO: renamed from: b */
    public final C8822d f6277b;

    /* JADX INFO: renamed from: c */
    public final boolean f6278c;

    /* JADX INFO: renamed from: d */
    public C6498f0 f6279d;

    /* JADX INFO: renamed from: e */
    public int f6280e;

    /* JADX INFO: renamed from: f */
    public C6496e0 f6281f;

    /* JADX INFO: renamed from: g */
    public C6496e0 f6282g;

    /* JADX INFO: renamed from: h */
    public InterfaceC7190e f6283h;

    /* JADX INFO: renamed from: i */
    public InterfaceC2522e f6284i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2525h f6285j;

    /* JADX INFO: renamed from: k */
    public C2528k f6286k;

    /* JADX INFO: renamed from: l */
    public AbstractC2290b f6287l;

    /* JADX INFO: renamed from: f5.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements InterfaceC7190e {

        /* JADX INFO: renamed from: q */
        public final C8822d f6288q;

        /* JADX INFO: renamed from: r */
        public final int f6289r;

        /* JADX INFO: renamed from: s */
        public final C6498f0 f6290s;

        public a(C8822d c8822d, int i10, int i11, C6498f0 c6498f0, InterfaceC2527j interfaceC2527j) {
            if (i11 < 0) {
                C9987e.m38645a("size < 0");
                throw null;
            }
            C8822d c8822dM33862r = c8822d.m33862r(i10, (i11 * 2) + i10);
            this.f6288q = c8822dM33862r;
            this.f6289r = i11;
            this.f6290s = c6498f0;
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = i12 * 2;
                try {
                    C6496e0 c6496e0 = (C6496e0) c6498f0.get(c8822dM33862r.m33858n(i13));
                    if (interfaceC2527j != null) {
                        interfaceC2527j.m9032b(c8822dM33862r, i13, 2, "  " + c6496e0);
                    }
                } catch (ClassCastException e10) {
                    C8130u.m31512a("bogus class cpi", e10);
                    throw null;
                }
            }
        }

        @Override // p269s5.InterfaceC7190e
        /* JADX INFO: renamed from: c */
        public boolean mo8383c() {
            return false;
        }

        @Override // p269s5.InterfaceC7190e
        public C7188c getType(int i10) {
            return ((C6496e0) this.f6290s.get(this.f6288q.m33858n(i10 * 2))).m25760n();
        }

        @Override // p269s5.InterfaceC7190e
        /* JADX INFO: renamed from: h */
        public InterfaceC7190e mo8384h(C7188c c7188c) {
            throw new UnsupportedOperationException("unsupported");
        }

        @Override // p269s5.InterfaceC7190e
        public int size() {
            return this.f6289r;
        }
    }

    public C2293e(C8822d c8822d, String str, boolean z10) {
        if (c8822d == null) {
            C1259t2.m5095a("bytes == null");
            throw null;
        }
        if (str == null) {
            C1259t2.m5095a("filePath == null");
            throw null;
        }
        this.f6276a = str;
        this.f6277b = c8822d;
        this.f6278c = z10;
        this.f6280e = -1;
    }

    /* JADX INFO: renamed from: x */
    public static String m8359x(Object obj) {
        return obj == null ? "(none)" : obj.toString();
    }

    @Override // p094g5.InterfaceC2520c
    /* JADX INFO: renamed from: a */
    public C6492c0 mo8360a() {
        InterfaceC2518a interfaceC2518aMo9028k = m8362c().mo9028k("SourceFile");
        if (interfaceC2518aMo9028k instanceof C1344r) {
            return ((C1344r) interfaceC2518aMo9028k).m5352b();
        }
        return null;
    }

    @Override // p094g5.InterfaceC2520c
    /* JADX INFO: renamed from: b */
    public int mo8361b() {
        m8381v();
        return this.f6280e;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC2519b m8362c() {
        m8380u();
        return this.f6286k;
    }

    /* JADX INFO: renamed from: d */
    public C1883e m8363d() {
        C1328b c1328b = (C1328b) m8362c().mo9028k("BootstrapMethods");
        return c1328b != null ? c1328b.m5338b() : C1883e.f5233s;
    }

    /* JADX INFO: renamed from: e */
    public C8822d m8364e() {
        return this.f6277b;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC6489b m8365f() {
        m8381v();
        return this.f6279d;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC2522e m8366g() {
        m8380u();
        return this.f6284i;
    }

    /* JADX INFO: renamed from: h */
    public String m8367h() {
        return this.f6276a;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC7190e m8368i() {
        m8381v();
        return this.f6283h;
    }

    /* JADX INFO: renamed from: j */
    public int m8369j() {
        return this.f6277b.m33853i(0);
    }

    /* JADX INFO: renamed from: k */
    public int m8370k() {
        return this.f6277b.m33858n(6);
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC2525h m8371l() {
        m8380u();
        return this.f6285j;
    }

    /* JADX INFO: renamed from: m */
    public int m8372m() {
        return this.f6277b.m33858n(4);
    }

    /* JADX INFO: renamed from: n */
    public C6496e0 m8373n() {
        m8381v();
        return this.f6282g;
    }

    /* JADX INFO: renamed from: o */
    public C6496e0 m8374o() {
        m8381v();
        return this.f6281f;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8375p(int i10) {
        return i10 == -889275714;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m8376q(int i10, int i11) {
        if (i10 >= 0) {
            return i11 == 53 ? i10 <= 0 : i11 < 53 && i11 >= 45;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC7190e m8377r(int i10, int i11) {
        if (i11 == 0) {
            return C7187b.f23814s;
        }
        C6498f0 c6498f0 = this.f6279d;
        if (c6498f0 != null) {
            return new a(this.f6277b, i10, i11, c6498f0, null);
        }
        C10010p0.m38820a("pool not yet initialized");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m8378s() {
        try {
            m8379t();
        } catch (C2526i e10) {
            e10.m3685a("...while parsing " + this.f6276a);
            throw e10;
        } catch (RuntimeException e11) {
            C2526i c2526i = new C2526i(e11);
            c2526i.m3685a("...while parsing " + this.f6276a);
            throw c2526i;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m8379t() {
        if (this.f6277b.m33861q() < 10) {
            throw new C2526i("severely truncated class file");
        }
        if (this.f6278c) {
            if (!m8375p(m8369j())) {
                throw new C2526i("bad class file magic (" + AbstractC8826h.m33901j(m8369j()) + ")");
            }
            if (!m8376q(m8372m(), m8370k())) {
                throw new C2526i("unsupported class file version " + m8370k() + "." + m8372m());
            }
        }
        C2028a c2028a = new C2028a(this.f6277b);
        c2028a.m7303i(null);
        C6498f0 c6498f0M7298d = c2028a.m7298d();
        this.f6279d = c6498f0M7298d;
        c6498f0M7298d.mo6829t();
        int iM7297b = c2028a.m7297b();
        int iM33858n = this.f6277b.m33858n(iM7297b);
        this.f6281f = (C6496e0) this.f6279d.get(this.f6277b.m33858n(iM7297b + 2));
        this.f6282g = (C6496e0) this.f6279d.mo25733p(this.f6277b.m33858n(iM7297b + 4));
        int iM33858n2 = this.f6277b.m33858n(iM7297b + 6);
        int i10 = iM7297b + 8;
        this.f6283h = m8377r(i10, iM33858n2);
        int i11 = i10 + (iM33858n2 * 2);
        if (this.f6278c) {
            String strM28417k = this.f6281f.m25760n().m28417k();
            if (!this.f6276a.endsWith(".class") || !this.f6276a.startsWith(strM28417k) || this.f6276a.length() != strM28417k.length() + 6) {
                throw new C2526i("class name (" + strM28417k + ") does not match path (" + this.f6276a + ")");
            }
        }
        this.f6280e = iM33858n;
        C2294f c2294f = new C2294f(this, this.f6281f, i11, this.f6287l);
        c2294f.m8394i(null);
        this.f6284i = c2294f.m8388j();
        C2296h c2296h = new C2296h(this, this.f6281f, c2294f.m8391d(), this.f6287l);
        c2296h.m8394i(null);
        this.f6285j = c2296h.m8395j();
        C2291c c2291c = new C2291c(this, 0, c2296h.m8391d(), this.f6287l);
        c2291c.m8353e(null);
        C2528k c2528kM8350b = c2291c.m8350b();
        this.f6286k = c2528kM8350b;
        c2528kM8350b.mo6829t();
        int iM8349a = c2291c.m8349a();
        if (iM8349a == this.f6277b.m33861q()) {
            return;
        }
        throw new C2526i("extra bytes at end of class file, at offset " + AbstractC8826h.m33901j(iM8349a));
    }

    /* JADX INFO: renamed from: u */
    public final void m8380u() {
        if (this.f6286k == null) {
            m8378s();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m8381v() {
        if (this.f6280e == -1) {
            m8378s();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m8382w(AbstractC2290b abstractC2290b) {
        if (abstractC2290b != null) {
            this.f6287l = abstractC2290b;
        } else {
            C1259t2.m5095a("attributeFactory == null");
        }
    }

    public C2293e(byte[] bArr, String str, boolean z10) {
        this(new C8822d(bArr), str, z10);
    }
}
