package p333x0;

import androidx.compose.runtime.C0556o4;
import androidx.compose.runtime.InterfaceC0465b4;
import androidx.compose.runtime.InterfaceC0474d;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: x0.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9303i extends AbstractC9304j {

    /* JADX INFO: renamed from: b */
    public int f31839b;

    /* JADX INFO: renamed from: d */
    public int f31841d;

    /* JADX INFO: renamed from: f */
    public int f31843f;

    /* JADX INFO: renamed from: g */
    public int f31844g;

    /* JADX INFO: renamed from: a */
    public AbstractC9298d[] f31838a = new AbstractC9298d[16];

    /* JADX INFO: renamed from: c */
    public int[] f31840c = new int[16];

    /* JADX INFO: renamed from: e */
    public Object[] f31842e = new Object[16];

    /* JADX INFO: renamed from: x0.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a implements InterfaceC9299e {

        /* JADX INFO: renamed from: a */
        public int f31845a;

        /* JADX INFO: renamed from: b */
        public int f31846b;

        /* JADX INFO: renamed from: c */
        public int f31847c;

        public a() {
        }

        @Override // p333x0.InterfaceC9299e
        /* JADX INFO: renamed from: a */
        public Object mo36236a(int i10) {
            return C9303i.this.f31842e[this.f31847c + i10];
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC9298d m36260b() {
            return C9303i.this.f31838a[this.f31845a];
        }

        /* JADX INFO: renamed from: c */
        public final boolean m36261c() {
            if (this.f31845a >= C9303i.this.f31839b) {
                return false;
            }
            AbstractC9298d abstractC9298dM36260b = m36260b();
            this.f31846b += abstractC9298dM36260b.m36232d();
            this.f31847c += abstractC9298dM36260b.m36234f();
            int i10 = this.f31845a + 1;
            this.f31845a = i10;
            return i10 < C9303i.this.f31839b;
        }

        @Override // p333x0.InterfaceC9299e
        public int getInt(int i10) {
            return C9303i.this.f31840c[this.f31846b + i10];
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m36247a() {
        this.f31839b = 0;
        this.f31841d = 0;
        AbstractC5102r.m20672x(this.f31842e, null, 0, this.f31843f);
        this.f31843f = 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m36248b(int i10, int i11) {
        return AbstractC2368o.m8578e(i10 + AbstractC2368o.m8582i(i10, 1024), i11);
    }

    /* JADX INFO: renamed from: c */
    public final void m36249c(AbstractC9298d abstractC9298d) {
        int i10 = this.f31844g;
        int iM36232d = abstractC9298d.m36232d();
        if (i10 == ((iM36232d == 0 ? 0 : -1) >>> (32 - iM36232d))) {
            abstractC9298d.m36234f();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m36250d(InterfaceC0474d interfaceC0474d, C0556o4 c0556o4, InterfaceC0465b4 interfaceC0465b4, InterfaceC9300f interfaceC9300f) {
        if (m36253g()) {
            a aVar = new a();
            while (true) {
                InterfaceC0474d interfaceC0474d2 = interfaceC0474d;
                C0556o4 c0556o42 = c0556o4;
                InterfaceC0465b4 interfaceC0465b42 = interfaceC0465b4;
                InterfaceC9300f interfaceC9300f2 = interfaceC9300f;
                aVar.m36260b().m36230b(aVar, interfaceC0474d2, c0556o42, interfaceC0465b42, interfaceC9300f2);
                if (!aVar.m36261c()) {
                    break;
                }
                interfaceC0474d = interfaceC0474d2;
                c0556o4 = c0556o42;
                interfaceC0465b4 = interfaceC0465b42;
                interfaceC9300f = interfaceC9300f2;
            }
        }
        m36247a();
    }

    /* JADX INFO: renamed from: e */
    public final int m36251e() {
        return this.f31839b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m36252f() {
        return m36251e() == 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m36253g() {
        return m36251e() != 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m36254h(C9303i c9303i) {
        AbstractC9298d[] abstractC9298dArr = this.f31838a;
        int i10 = this.f31839b - 1;
        this.f31839b = i10;
        AbstractC9298d abstractC9298d = abstractC9298dArr[i10];
        abstractC9298dArr[i10] = null;
        c9303i.m36256j(abstractC9298d);
        Object[] objArr = this.f31842e;
        Object[] objArr2 = c9303i.f31842e;
        int iM36234f = c9303i.f31843f - abstractC9298d.m36234f();
        int iM36234f2 = this.f31843f - abstractC9298d.m36234f();
        System.arraycopy(objArr, iM36234f2, objArr2, iM36234f, this.f31843f - iM36234f2);
        AbstractC5102r.m20672x(this.f31842e, null, this.f31843f - abstractC9298d.m36234f(), this.f31843f);
        AbstractC5102r.m20658j(this.f31840c, c9303i.f31840c, c9303i.f31841d - abstractC9298d.m36232d(), this.f31841d - abstractC9298d.m36232d(), this.f31841d);
        this.f31843f -= abstractC9298d.m36234f();
        this.f31841d -= abstractC9298d.m36232d();
    }

    /* JADX INFO: renamed from: i */
    public final void m36255i(AbstractC9298d abstractC9298d) {
        m36256j(abstractC9298d);
    }

    /* JADX INFO: renamed from: j */
    public final void m36256j(AbstractC9298d abstractC9298d) {
        if (this.f31839b == this.f31838a.length) {
            m36259m();
        }
        int iM36232d = this.f31841d + abstractC9298d.m36232d();
        int length = this.f31840c.length;
        if (iM36232d > length) {
            m36257k(length, iM36232d);
        }
        int iM36234f = this.f31843f + abstractC9298d.m36234f();
        int length2 = this.f31842e.length;
        if (iM36234f > length2) {
            m36258l(length2, iM36234f);
        }
        AbstractC9298d[] abstractC9298dArr = this.f31838a;
        int i10 = this.f31839b;
        this.f31839b = i10 + 1;
        abstractC9298dArr[i10] = abstractC9298d;
        this.f31841d += abstractC9298d.m36232d();
        this.f31843f += abstractC9298d.m36234f();
    }

    /* JADX INFO: renamed from: k */
    public final void m36257k(int i10, int i11) {
        int[] iArr = new int[m36248b(i10, i11)];
        AbstractC5102r.m20658j(this.f31840c, iArr, 0, 0, i10);
        this.f31840c = iArr;
    }

    /* JADX INFO: renamed from: l */
    public final void m36258l(int i10, int i11) {
        Object[] objArr = new Object[m36248b(i10, i11)];
        System.arraycopy(this.f31842e, 0, objArr, 0, i10);
        this.f31842e = objArr;
    }

    /* JADX INFO: renamed from: m */
    public final void m36259m() {
        int iM8582i = AbstractC2368o.m8582i(this.f31839b, 1024);
        int i10 = this.f31839b;
        AbstractC9298d[] abstractC9298dArr = new AbstractC9298d[iM8582i + i10];
        System.arraycopy(this.f31838a, 0, abstractC9298dArr, 0, i10);
        this.f31838a = abstractC9298dArr;
    }

    public String toString() {
        return super.toString();
    }

    /* JADX INFO: renamed from: x0.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        /* JADX INFO: renamed from: b */
        public static final void m36263b(C9303i c9303i, int i10, Object obj) {
            c9303i.f31842e[(c9303i.f31843f - c9303i.f31838a[c9303i.f31839b - 1].m36234f()) + i10] = obj;
        }

        /* JADX INFO: renamed from: c */
        public static final void m36264c(C9303i c9303i, int i10, Object obj, int i11, Object obj2) {
            int iM36234f = c9303i.f31843f - c9303i.f31838a[c9303i.f31839b - 1].m36234f();
            Object[] objArr = c9303i.f31842e;
            objArr[i10 + iM36234f] = obj;
            objArr[iM36234f + i11] = obj2;
        }

        /* JADX INFO: renamed from: d */
        public static final void m36265d(C9303i c9303i, int i10, Object obj, int i11, Object obj2, int i12, Object obj3, int i13, Object obj4) {
            int iM36234f = c9303i.f31843f - c9303i.f31838a[c9303i.f31839b - 1].m36234f();
            Object[] objArr = c9303i.f31842e;
            objArr[i10 + iM36234f] = obj;
            objArr[i11 + iM36234f] = obj2;
            objArr[i12 + iM36234f] = obj3;
            objArr[iM36234f + i13] = obj4;
        }

        /* JADX INFO: renamed from: e */
        public static final void m36266e(C9303i c9303i, int i10, Object obj, int i11, Object obj2, int i12, Object obj3) {
            int iM36234f = c9303i.f31843f - c9303i.f31838a[c9303i.f31839b - 1].m36234f();
            Object[] objArr = c9303i.f31842e;
            objArr[i10 + iM36234f] = obj;
            objArr[i11 + iM36234f] = obj2;
            objArr[iM36234f + i12] = obj3;
        }

        /* JADX INFO: renamed from: a */
        public static C9303i m36262a(C9303i c9303i) {
            return c9303i;
        }
    }
}
