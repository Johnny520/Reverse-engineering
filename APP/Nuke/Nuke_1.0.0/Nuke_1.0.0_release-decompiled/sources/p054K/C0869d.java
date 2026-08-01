package p054K;

import com.bumptech.glide.AbstractC1925g;
import p000A.AbstractC0070k0;
import p061L2.C0981u;
import p092S0.AbstractC1251D;
import p092S0.C1260M;
import p092S0.C1263a;
import p092S0.InterfaceC1281s;
import p110W0.InterfaceC1580e;
import p117X2.AbstractC1665j;
import p130a1.C1791d;
import p153e1.AbstractC2006b;
import p153e1.C2005a;
import p153e1.C2008d;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: K.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0869d {

    /* JADX INFO: renamed from: a */
    public String f2713a;

    /* JADX INFO: renamed from: b */
    public C1260M f2714b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1580e f2715c;

    /* JADX INFO: renamed from: d */
    public int f2716d;

    /* JADX INFO: renamed from: e */
    public boolean f2717e;

    /* JADX INFO: renamed from: f */
    public int f2718f;

    /* JADX INFO: renamed from: g */
    public int f2719g;

    /* JADX INFO: renamed from: i */
    public InterfaceC2007c f2721i;

    /* JADX INFO: renamed from: j */
    public C1263a f2722j;

    /* JADX INFO: renamed from: k */
    public boolean f2723k;

    /* JADX INFO: renamed from: l */
    public long f2724l;

    /* JADX INFO: renamed from: m */
    public C0867b f2725m;

    /* JADX INFO: renamed from: n */
    public InterfaceC1281s f2726n;

    /* JADX INFO: renamed from: o */
    public EnumC2017m f2727o;

    /* JADX INFO: renamed from: s */
    public long f2731s;

    /* JADX INFO: renamed from: h */
    public long f2720h = AbstractC0866a.f2701a;

    /* JADX INFO: renamed from: p */
    public long f2728p = AbstractC2006b.m3691h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q */
    public int f2729q = -1;

    /* JADX INFO: renamed from: r */
    public int f2730r = -1;

    public C0869d(String str, C1260M c1260m, InterfaceC1580e interfaceC1580e, int i5, boolean z5, int i6, int i7) {
        this.f2713a = str;
        this.f2714b = c1260m;
        this.f2715c = interfaceC1580e;
        this.f2716d = i5;
        this.f2717e = z5;
        this.f2718f = i6;
        this.f2719g = i7;
        long j5 = 0;
        this.f2724l = (j5 & 4294967295L) | (j5 << 32);
    }

    /* JADX INFO: renamed from: f */
    public static long m1894f(C0869d c0869d, long j5, EnumC2017m enumC2017m) {
        int iM3681i;
        C1260M c1260m = c0869d.f2714b;
        C0867b c0867b = c0869d.f2725m;
        InterfaceC2007c interfaceC2007c = c0869d.f2721i;
        AbstractC1665j.m2982b(interfaceC2007c);
        InterfaceC1580e interfaceC1580e = c0869d.f2715c;
        if ((c0867b == null || enumC2017m != c0867b.f2704a || !AbstractC1251D.m2319h(c1260m, enumC2017m).equals(c0867b.f2705b) || interfaceC2007c.mo272b() != c0867b.f2706c.f6727d || interfaceC1580e != c0867b.f2707d) && ((c0867b = C0867b.f2703h) == null || enumC2017m != c0867b.f2704a || !AbstractC1251D.m2319h(c1260m, enumC2017m).equals(c0867b.f2705b) || interfaceC2007c.mo272b() != c0867b.f2706c.f6727d || interfaceC1580e != c0867b.f2707d)) {
            c0867b = new C0867b(enumC2017m, AbstractC1251D.m2319h(c1260m, enumC2017m), new C2008d(interfaceC2007c.mo272b(), interfaceC2007c.mo282p()), interfaceC1580e);
            C0867b.f2703h = c0867b;
        }
        c0869d.f2725m = c0867b;
        int i5 = c0869d.f2719g;
        C2008d c2008d = c0867b.f2706c;
        float f2 = c0867b.f2710g;
        float f5 = c0867b.f2709f;
        if (Float.isNaN(f2) || Float.isNaN(f5)) {
            float fM2347b = AbstractC1251D.m2312a(AbstractC0868c.f2711a, c0867b.f2708e, AbstractC2006b.m3685b(0, 0, 15), c2008d, c0867b.f2707d, 1, 96).m2347b();
            float fM2347b2 = AbstractC1251D.m2312a(AbstractC0868c.f2712b, c0867b.f2708e, AbstractC2006b.m3685b(0, 0, 15), c2008d, c0867b.f2707d, 2, 96).m2347b() - fM2347b;
            c0867b.f2710g = fM2347b;
            c0867b.f2709f = fM2347b2;
            f5 = fM2347b2;
            f2 = fM2347b;
        }
        if (i5 != 1) {
            int iRound = Math.round((f5 * (i5 - 1)) + f2);
            iM3681i = iRound >= 0 ? iRound : 0;
            int iM3679g = C2005a.m3679g(j5);
            if (iM3681i > iM3679g) {
                iM3681i = iM3679g;
            }
        } else {
            iM3681i = C2005a.m3681i(j5);
        }
        return AbstractC2006b.m3684a(C2005a.m3682j(j5), C2005a.m3680h(j5), iM3681i, C2005a.m3679g(j5));
    }

    /* JADX INFO: renamed from: a */
    public final int m1895a(int i5, EnumC2017m enumC2017m) {
        int i6 = this.f2729q;
        int i7 = this.f2730r;
        if (i5 == i6 && i6 != -1) {
            return i7;
        }
        long jM3684a = AbstractC2006b.m3684a(0, i5, 0, Integer.MAX_VALUE);
        if (this.f2719g > 1) {
            jM3684a = m1894f(this, jM3684a, enumC2017m);
        }
        InterfaceC1281s interfaceC1281sM1899e = m1899e(enumC2017m);
        long jM3538o = AbstractC1925g.m3538o(jM3684a, this.f2717e, this.f2716d, interfaceC1281sM1899e.mo426c());
        boolean z5 = this.f2717e;
        int i8 = this.f2716d;
        int i9 = this.f2718f;
        int iM83j = AbstractC0070k0.m83j(new C1263a((C1791d) interfaceC1281sM1899e, ((z5 || !(i8 == 2 || i8 == 4 || i8 == 5)) && i9 >= 1) ? i9 : 1, i8, jM3538o).m2347b());
        int iM3681i = C2005a.m3681i(jM3684a);
        if (iM83j < iM3681i) {
            iM83j = iM3681i;
        }
        this.f2729q = i5;
        this.f2730r = iM83j;
        return iM83j;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1896b(long j5, EnumC2017m enumC2017m) {
        InterfaceC1281s interfaceC1281s;
        this.f2731s = (this.f2731s << 2) | 3;
        boolean z5 = true;
        long jM1894f = this.f2719g > 1 ? m1894f(this, j5, enumC2017m) : j5;
        C1263a c1263a = this.f2722j;
        boolean z6 = false;
        if (c1263a != null && (interfaceC1281s = this.f2726n) != null && !interfaceC1281s.mo425b() && enumC2017m == this.f2727o && (C2005a.m3674b(jM1894f, this.f2728p) || (C2005a.m3680h(jM1894f) == C2005a.m3680h(this.f2728p) && C2005a.m3682j(jM1894f) == C2005a.m3682j(this.f2728p) && C2005a.m3679g(jM1894f) >= c1263a.m2347b() && !c1263a.f4548d.f5042d))) {
            if (!C2005a.m3674b(jM1894f, this.f2728p)) {
                C1263a c1263a2 = this.f2722j;
                AbstractC1665j.m2982b(c1263a2);
                this.f2724l = AbstractC2006b.m3687d(jM1894f, (((long) AbstractC0070k0.m83j(Math.min(c1263a2.f4545a.f6115i.m2693c(), c1263a2.m2349d()))) << 32) | (((long) AbstractC0070k0.m83j(c1263a2.m2347b())) & 4294967295L));
                if (this.f2716d == 3 || (((int) (r12 >> 32)) >= c1263a2.m2349d() && ((int) (4294967295L & r12)) >= c1263a2.m2347b())) {
                    z5 = false;
                }
                this.f2723k = z5;
                this.f2728p = jM1894f;
            }
            return false;
        }
        InterfaceC1281s interfaceC1281sM1899e = m1899e(enumC2017m);
        long jM3538o = AbstractC1925g.m3538o(jM1894f, this.f2717e, this.f2716d, interfaceC1281sM1899e.mo426c());
        boolean z7 = this.f2717e;
        int i5 = this.f2716d;
        int i6 = this.f2718f;
        C1263a c1263a3 = new C1263a((C1791d) interfaceC1281sM1899e, ((z7 || !(i5 == 2 || i5 == 4 || i5 == 5)) && i6 >= 1) ? i6 : 1, i5, jM3538o);
        this.f2728p = jM1894f;
        this.f2724l = AbstractC2006b.m3687d(jM1894f, (((long) AbstractC0070k0.m83j(c1263a3.m2347b())) & 4294967295L) | (((long) AbstractC0070k0.m83j(c1263a3.m2349d())) << 32));
        if (this.f2716d != 3 && (((int) (r1 >> 32)) < c1263a3.m2349d() || ((int) (r1 & 4294967295L)) < c1263a3.m2347b())) {
            z6 = true;
        }
        this.f2723k = z6;
        this.f2722j = c1263a3;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m1897c() {
        this.f2722j = null;
        this.f2726n = null;
        this.f2727o = null;
        this.f2729q = -1;
        this.f2730r = -1;
        this.f2728p = AbstractC2006b.m3691h(0, 0, 0, 0);
        long j5 = 0;
        this.f2724l = (j5 & 4294967295L) | (j5 << 32);
        this.f2723k = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m1898d(InterfaceC2007c interfaceC2007c) {
        long jM1892a;
        InterfaceC2007c interfaceC2007c2 = this.f2721i;
        if (interfaceC2007c != null) {
            int i5 = AbstractC0866a.f2702b;
            jM1892a = AbstractC0866a.m1892a(interfaceC2007c.mo272b(), interfaceC2007c.mo282p());
        } else {
            jM1892a = AbstractC0866a.f2701a;
        }
        if (interfaceC2007c2 == null) {
            this.f2721i = interfaceC2007c;
            this.f2720h = jM1892a;
        } else if (interfaceC2007c == null || this.f2720h != jM1892a) {
            this.f2721i = interfaceC2007c;
            this.f2720h = jM1892a;
            this.f2731s = (this.f2731s << 2) | 1;
            m1897c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC1281s m1899e(EnumC2017m enumC2017m) {
        InterfaceC1281s c1791d = this.f2726n;
        if (c1791d == null || enumC2017m != this.f2727o || c1791d.mo425b()) {
            this.f2727o = enumC2017m;
            String str = this.f2713a;
            C1260M c1260mM2319h = AbstractC1251D.m2319h(this.f2714b, enumC2017m);
            InterfaceC2007c interfaceC2007c = this.f2721i;
            AbstractC1665j.m2982b(interfaceC2007c);
            InterfaceC1580e interfaceC1580e = this.f2715c;
            C0981u c0981u = C0981u.f3047d;
            c1791d = new C1791d(str, c1260mM2319h, c0981u, c0981u, interfaceC1580e, interfaceC2007c);
        }
        this.f2726n = c1791d;
        return c1791d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f2722j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) AbstractC0866a.m1893b(this.f2720h));
        sb.append(", history=");
        sb.append(this.f2731s);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
