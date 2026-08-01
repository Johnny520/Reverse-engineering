package p239q5;

import bsh.C1259t2;
import java.util.concurrent.ConcurrentHashMap;
import p269s5.C7188c;
import p269s5.InterfaceC7189d;
import p309v5.InterfaceC8837s;
import p376zd.C9987e;

/* JADX INFO: renamed from: q5.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6267r implements InterfaceC7189d, InterfaceC8837s, Comparable {

    /* JADX INFO: renamed from: t */
    public static final ConcurrentHashMap f19437t = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: u */
    public static final ThreadLocal f19438u = new a();

    /* JADX INFO: renamed from: q */
    public final int f19439q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC7189d f19440r;

    /* JADX INFO: renamed from: s */
    public final C6260k f19441s;

    /* JADX INFO: renamed from: q5.r$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b initialValue() {
            return new b(null);
        }
    }

    public C6267r(int i10, InterfaceC7189d interfaceC7189d, C6260k c6260k) {
        if (i10 < 0) {
            C9987e.m38645a("reg < 0");
            throw null;
        }
        if (interfaceC7189d == null) {
            C1259t2.m5095a("type == null");
            throw null;
        }
        this.f19439q = i10;
        this.f19440r = interfaceC7189d;
        this.f19441s = c6260k;
    }

    /* JADX INFO: renamed from: A */
    public static C6267r m24732A(int i10, InterfaceC7189d interfaceC7189d) {
        return m24739w(i10, interfaceC7189d, null);
    }

    /* JADX INFO: renamed from: B */
    public static C6267r m24733B(int i10, InterfaceC7189d interfaceC7189d, C6260k c6260k) {
        if (c6260k != null) {
            return m24739w(i10, interfaceC7189d, c6260k);
        }
        C1259t2.m5095a("local  == null");
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static C6267r m24734C(int i10, InterfaceC7189d interfaceC7189d, C6260k c6260k) {
        return m24739w(i10, interfaceC7189d, c6260k);
    }

    /* JADX INFO: renamed from: F */
    public static String m24735F(int i10) {
        return "v" + i10;
    }

    /* JADX INFO: renamed from: v */
    public static int m24738v(int i10, InterfaceC7189d interfaceC7189d, C6260k c6260k) {
        return ((((c6260k != null ? c6260k.hashCode() : 0) * 31) + interfaceC7189d.hashCode()) * 31) + i10;
    }

    /* JADX INFO: renamed from: w */
    public static C6267r m24739w(int i10, InterfaceC7189d interfaceC7189d, C6260k c6260k) {
        b bVar = (b) f19438u.get();
        bVar.m24763d(i10, interfaceC7189d, c6260k);
        ConcurrentHashMap concurrentHashMap = f19437t;
        C6267r c6267rM24764e = (C6267r) concurrentHashMap.get(bVar);
        if (c6267rM24764e == null) {
            c6267rM24764e = bVar.m24764e();
            C6267r c6267r = (C6267r) concurrentHashMap.putIfAbsent(c6267rM24764e, c6267rM24764e);
            if (c6267r != null) {
                return c6267r;
            }
        }
        return c6267rM24764e;
    }

    /* JADX INFO: renamed from: D */
    public boolean m24740D(C6267r c6267r) {
        if (c6267r != null && this.f19440r.getType().equals(c6267r.f19440r.getType())) {
            C6260k c6260k = this.f19441s;
            C6260k c6260k2 = c6267r.f19441s;
            if (c6260k == c6260k2) {
                return true;
            }
            if (c6260k != null && c6260k.equals(c6260k2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public String m24741E() {
        return m24735F(this.f19439q);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m24742G(boolean r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = r3.m24741E()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            q5.k r1 = r3.f19441s
            if (r1 == 0) goto L1e
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L1e:
            s5.d r1 = r3.f19440r
            s5.c r1 = r1.getType()
            r0.append(r1)
            s5.d r2 = r3.f19440r
            if (r1 == r2) goto L57
            java.lang.String r1 = "="
            r0.append(r1)
            if (r4 == 0) goto L42
            s5.d r1 = r3.f19440r
            boolean r2 = r1 instanceof p254r5.C6492c0
            if (r2 == 0) goto L42
            r5.c0 r1 = (p254r5.C6492c0) r1
            java.lang.String r4 = r1.m25744v()
            r0.append(r4)
            goto L57
        L42:
            if (r4 == 0) goto L52
            s5.d r4 = r3.f19440r
            boolean r1 = r4 instanceof p254r5.AbstractC6487a
            if (r1 == 0) goto L52
            java.lang.String r4 = r4.mo6828g()
            r0.append(r4)
            goto L57
        L52:
            s5.d r4 = r3.f19440r
            r0.append(r4)
        L57:
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p239q5.C6267r.m24742G(boolean):java.lang.String");
    }

    /* JADX INFO: renamed from: H */
    public C6267r m24743H(C6260k c6260k) {
        C6260k c6260k2 = this.f19441s;
        return (c6260k2 == c6260k || (c6260k2 != null && c6260k2.equals(c6260k))) ? this : m24734C(this.f19439q, this.f19440r, c6260k);
    }

    /* JADX INFO: renamed from: I */
    public C6267r m24744I(int i10) {
        return i10 == 0 ? this : m24745J(this.f19439q + i10);
    }

    /* JADX INFO: renamed from: J */
    public C6267r m24745J(int i10) {
        return this.f19439q == i10 ? this : m24734C(i10, this.f19440r, this.f19441s);
    }

    /* JADX INFO: renamed from: K */
    public C6267r m24746K() {
        InterfaceC7189d interfaceC7189d = this.f19440r;
        C7188c type = interfaceC7189d instanceof C7188c ? (C7188c) interfaceC7189d : interfaceC7189d.getType();
        if (type.m28412F()) {
            type = type.m28421t();
        }
        return type == interfaceC7189d ? this : m24734C(this.f19439q, type, this.f19441s);
    }

    /* JADX INFO: renamed from: L */
    public C6267r m24747L(InterfaceC7189d interfaceC7189d) {
        return m24734C(this.f19439q, interfaceC7189d, this.f19441s);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6267r) {
            C6267r c6267r = (C6267r) obj;
            return m24749j(c6267r.f19439q, c6267r.f19440r, c6267r.f19441s);
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m24749j(bVar.f19442a, bVar.f19443b, bVar.f19444c);
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return m24742G(true);
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return this.f19440r.getType();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(C6267r c6267r) {
        int i10 = this.f19439q;
        int i11 = c6267r.f19439q;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        if (this == c6267r) {
            return 0;
        }
        int iCompareTo = this.f19440r.getType().compareTo(c6267r.f19440r.getType());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C6260k c6260k = this.f19441s;
        C6260k c6260k2 = c6267r.f19441s;
        if (c6260k == null) {
            return c6260k2 == null ? 0 : -1;
        }
        if (c6260k2 == null) {
            return 1;
        }
        return c6260k.compareTo(c6260k2);
    }

    public int hashCode() {
        return m24738v(this.f19439q, this.f19440r, this.f19441s);
    }

    @Override // p269s5.InterfaceC7189d
    /* JADX INFO: renamed from: i */
    public final int mo6841i() {
        return this.f19440r.mo6841i();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m24749j(int i10, InterfaceC7189d interfaceC7189d, C6260k c6260k) {
        if (this.f19439q != i10 || !this.f19440r.equals(interfaceC7189d)) {
            return false;
        }
        C6260k c6260k2 = this.f19441s;
        if (c6260k2 != c6260k) {
            return c6260k2 != null && c6260k2.equals(c6260k);
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public boolean m24750k(C6267r c6267r) {
        return m24740D(c6267r) && this.f19439q == c6267r.f19439q;
    }

    @Override // p269s5.InterfaceC7189d
    /* JADX INFO: renamed from: l */
    public final boolean mo6842l() {
        return false;
    }

    @Override // p269s5.InterfaceC7189d
    /* JADX INFO: renamed from: m */
    public final int mo6843m() {
        return this.f19440r.mo6843m();
    }

    /* JADX INFO: renamed from: n */
    public int m24751n() {
        return this.f19440r.getType().m28416j();
    }

    /* JADX INFO: renamed from: p */
    public C6260k m24752p() {
        return this.f19441s;
    }

    @Override // p269s5.InterfaceC7189d
    /* JADX INFO: renamed from: r */
    public InterfaceC7189d mo6844r() {
        return this.f19440r.mo6844r();
    }

    /* JADX INFO: renamed from: s */
    public int m24753s() {
        return this.f19439q + m24751n();
    }

    /* JADX INFO: renamed from: t */
    public int m24754t() {
        return this.f19439q;
    }

    public String toString() {
        return m24742G(false);
    }

    /* JADX INFO: renamed from: u */
    public InterfaceC7189d m24755u() {
        return this.f19440r;
    }

    /* JADX INFO: renamed from: x */
    public C6267r m24756x(C6267r c6267r, boolean z10) {
        InterfaceC7189d type;
        if (this != c6267r) {
            if (c6267r == null || this.f19439q != c6267r.m24754t()) {
                return null;
            }
            C6260k c6260k = this.f19441s;
            C6260k c6260k2 = (c6260k == null || !c6260k.equals(c6267r.m24752p())) ? null : this.f19441s;
            boolean z11 = c6260k2 == this.f19441s;
            if ((z10 && !z11) || (type = getType()) != c6267r.getType()) {
                return null;
            }
            if (this.f19440r.equals(c6267r.m24755u())) {
                type = this.f19440r;
            }
            if (type != this.f19440r || !z11) {
                int i10 = this.f19439q;
                return c6260k2 == null ? m24732A(i10, type) : m24733B(i10, type, c6260k2);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: y */
    public boolean m24757y() {
        return this.f19440r.getType().m28408B();
    }

    /* JADX INFO: renamed from: z */
    public boolean m24758z() {
        return (m24754t() & 1) == 0;
    }

    /* JADX INFO: renamed from: q5.r$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f19442a;

        /* JADX INFO: renamed from: b */
        public InterfaceC7189d f19443b;

        /* JADX INFO: renamed from: c */
        public C6260k f19444c;

        public b() {
        }

        /* JADX INFO: renamed from: d */
        public void m24763d(int i10, InterfaceC7189d interfaceC7189d, C6260k c6260k) {
            this.f19442a = i10;
            this.f19443b = interfaceC7189d;
            this.f19444c = c6260k;
        }

        /* JADX INFO: renamed from: e */
        public C6267r m24764e() {
            return new C6267r(this.f19442a, this.f19443b, this.f19444c, null);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6267r) {
                return ((C6267r) obj).m24749j(this.f19442a, this.f19443b, this.f19444c);
            }
            return false;
        }

        public int hashCode() {
            return C6267r.m24738v(this.f19442a, this.f19443b, this.f19444c);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public /* synthetic */ C6267r(int i10, InterfaceC7189d interfaceC7189d, C6260k c6260k, a aVar) {
        this(i10, interfaceC7189d, c6260k);
    }
}
