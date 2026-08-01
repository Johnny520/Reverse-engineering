package p154k5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p006a5.C0065a;
import p123i5.C3198a;
import p154k5.C3975i;
import p215oc.C5725t;
import p239q5.C6260k;
import p239q5.C6267r;
import p239q5.C6268s;
import p239q5.C6269t;
import p254r5.AbstractC6487a;
import p254r5.AbstractC6518w;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p269s5.C7188c;
import p280t5.C8110a;
import p376zd.C10010p0;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3989w {

    /* JADX INFO: renamed from: a */
    public final C3198a f11742a;

    /* JADX INFO: renamed from: b */
    public final int f11743b;

    /* JADX INFO: renamed from: c */
    public ArrayList f11744c;

    /* JADX INFO: renamed from: g */
    public int f11748g;

    /* JADX INFO: renamed from: h */
    public final int f11749h;

    /* JADX INFO: renamed from: f */
    public int f11747f = -1;

    /* JADX INFO: renamed from: d */
    public boolean f11745d = false;

    /* JADX INFO: renamed from: e */
    public boolean f11746e = false;

    public C3989w(C3198a c3198a, int i10, int i11, int i12) {
        this.f11742a = c3198a;
        this.f11743b = i11;
        this.f11744c = new ArrayList(i10);
        this.f11749h = i12;
    }

    /* JADX INFO: renamed from: b */
    public static void m15878b(HashSet hashSet, AbstractC3976j abstractC3976j) {
        if (abstractC3976j instanceof C3974h) {
            hashSet.add(((C3974h) abstractC3976j).m15750A());
            return;
        }
        int i10 = 0;
        if (abstractC3976j instanceof C3986t) {
            C3986t c3986t = (C3986t) abstractC3976j;
            while (i10 < c3986t.m15866C()) {
                hashSet.add(c3986t.m15864A(i10));
                i10++;
            }
            return;
        }
        if (!(abstractC3976j instanceof C3984r)) {
            if (abstractC3976j instanceof C3985s) {
                m15879c(hashSet, ((C3985s) abstractC3976j).m15863A());
            }
        } else {
            C6269t c6269tM15861A = ((C3984r) abstractC3976j).m15861A();
            int size = c6269tM15861A.size();
            while (i10 < size) {
                m15879c(hashSet, c6269tM15861A.m24792x(i10));
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m15879c(HashSet hashSet, C6267r c6267r) {
        if (c6267r == null) {
            return;
        }
        C6260k c6260kM24752p = c6267r.m24752p();
        C6492c0 c6492c0M24715g = c6260kM24752p.m24715g();
        C6492c0 c6492c0M24716h = c6260kM24752p.m24716h();
        C7188c type = c6267r.getType();
        if (type != C7188c.f23829H) {
            hashSet.add(C6496e0.m25758u(type));
        } else {
            hashSet.add(C6496e0.m25758u(C7188c.f23837P));
        }
        if (c6492c0M24715g != null) {
            hashSet.add(c6492c0M24715g);
        }
        if (c6492c0M24716h != null) {
            hashSet.add(c6492c0M24716h);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m15880i(C3974h c3974h, C3975i.a aVar) {
        int iMo13474a;
        AbstractC6487a abstractC6487aM15750A = c3974h.m15750A();
        int iMo13474a2 = aVar.mo13474a(abstractC6487aM15750A);
        if (iMo13474a2 >= 0) {
            c3974h.m15754E(iMo13474a2);
        }
        if (!(abstractC6487aM15750A instanceof AbstractC6518w) || (iMo13474a = aVar.mo13474a(((AbstractC6518w) abstractC6487aM15750A).m25802k())) < 0) {
            return;
        }
        c3974h.m15753D(iMo13474a);
    }

    /* JADX INFO: renamed from: k */
    public static void m15881k(C3986t c3986t, C3975i.a aVar) {
        for (int i10 = 0; i10 < c3986t.m15866C(); i10++) {
            AbstractC6487a abstractC6487aM15864A = c3986t.m15864A(i10);
            c3986t.m15870G(i10, aVar.mo13474a(abstractC6487aM15864A));
            if (abstractC6487aM15864A instanceof AbstractC6518w) {
                c3986t.m15869F(aVar.mo13474a(((AbstractC6518w) abstractC6487aM15864A).m25802k()));
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m15882u(AbstractC3976j abstractC3976j) {
        if (abstractC3976j instanceof C3984r) {
            C6269t c6269tM15861A = ((C3984r) abstractC3976j).m15861A();
            int size = c6269tM15861A.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (m15883v(c6269tM15861A.m24792x(i10))) {
                    return true;
                }
            }
        } else if ((abstractC3976j instanceof C3985s) && m15883v(((C3985s) abstractC3976j).m15863A())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m15883v(C6267r c6267r) {
        return (c6267r == null || c6267r.m24752p().m24715g() == null) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public void m15884A(int i10, C3970f c3970f) {
        int size = (this.f11744c.size() - i10) - 1;
        try {
            this.f11744c.set(size, ((C3969e0) this.f11744c.get(size)).m15746E(c3970f));
        } catch (ClassCastException unused) {
            C9987e.m38645a("non-reversible instruction");
        } catch (IndexOutOfBoundsException unused2) {
            C9987e.m38645a("too few instructions");
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m15885B(int i10) {
        int size = this.f11744c.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC3976j abstractC3976j = (AbstractC3976j) this.f11744c.get(i11);
            if (!(abstractC3976j instanceof C3970f)) {
                this.f11744c.set(i11, abstractC3976j.mo15748x(i10));
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m15886C(int i10) {
        int size = this.f11744c.size();
        int i11 = this.f11743b + this.f11747f + this.f11748g;
        int i12 = i11 - this.f11749h;
        C8110a c8110a = new C8110a(i11);
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 >= i12) {
                c8110a.mo31332e(i13, i13 + i10, 1);
            } else {
                c8110a.mo31332e(i13, i13, 1);
            }
        }
        for (int i14 = 0; i14 < size; i14++) {
            AbstractC3976j abstractC3976j = (AbstractC3976j) this.f11744c.get(i14);
            if (!(abstractC3976j instanceof C3970f)) {
                this.f11744c.set(i14, abstractC3976j.mo15784v(c8110a));
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public int m15887D() {
        return this.f11744c.size();
    }

    /* JADX INFO: renamed from: E */
    public final void m15888E(AbstractC3976j abstractC3976j) {
        if (!this.f11745d && abstractC3976j.m15777m().m24858a() >= 0) {
            this.f11745d = true;
        }
        if (this.f11746e || !m15882u(abstractC3976j)) {
            return;
        }
        this.f11746e = true;
    }

    /* JADX INFO: renamed from: a */
    public void m15889a(AbstractC3976j abstractC3976j) {
        this.f11744c.add(abstractC3976j);
        m15888E(abstractC3976j);
    }

    /* JADX INFO: renamed from: d */
    public final void m15890d(int i10) {
        m15886C(i10);
        this.f11748g += i10;
    }

    /* JADX INFO: renamed from: e */
    public final void m15891e(int i10) {
        m15885B(i10);
        this.f11747f += i10;
    }

    /* JADX INFO: renamed from: f */
    public final void m15892f(C3978l[] c3978lArr) {
        do {
            int i10 = ((this.f11743b + this.f11747f) + this.f11748g) - this.f11749h;
            Iterator it = this.f11744c.iterator();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (it.hasNext()) {
                C6268s c6268sM15778n = ((AbstractC3976j) it.next()).m15778n();
                for (int i15 = 0; i15 < c6268sM15778n.size(); i15++) {
                    C6267r c6267rM24769G = c6268sM15778n.m24769G(i15);
                    if (c6267rM24769G.m24757y()) {
                        boolean z10 = c6267rM24769G.m24754t() >= i10;
                        if (c6267rM24769G.m24758z()) {
                            if (z10) {
                                i12++;
                            } else {
                                i14++;
                            }
                        } else if (z10) {
                            i11++;
                        } else {
                            i13++;
                        }
                    }
                }
            }
            if (i11 > i12 && i13 > i14) {
                m15891e(1);
            } else if (i11 > i12) {
                m15890d(1);
            } else {
                if (i13 <= i14) {
                    return;
                }
                m15891e(1);
                if (this.f11749h != 0 && i12 > i11) {
                    m15890d(1);
                }
            }
        } while (m15908z(c3978lArr));
    }

    /* JADX INFO: renamed from: g */
    public final void m15893g() {
        int size = this.f11744c.size();
        int iMo15679b = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC3976j abstractC3976j = (AbstractC3976j) this.f11744c.get(i10);
            abstractC3976j.m15783u(iMo15679b);
            iMo15679b += abstractC3976j.mo15679b();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m15894h() {
        do {
            m15893g();
        } while (m15900p());
    }

    /* JADX INFO: renamed from: j */
    public void m15895j(C3975i.a aVar) {
        for (AbstractC3976j abstractC3976j : this.f11744c) {
            if (abstractC3976j instanceof C3974h) {
                m15880i((C3974h) abstractC3976j, aVar);
            } else if (abstractC3976j instanceof C3986t) {
                m15881k((C3986t) abstractC3976j, aVar);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m15896l(C3978l[] c3978lArr) {
        int size = this.f11744c.size();
        int i10 = this.f11747f;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC3976j abstractC3976j = (AbstractC3976j) this.f11744c.get(i11);
            C3978l c3978l = c3978lArr[i11];
            C3978l c3978lM15898n = m15898n(abstractC3976j, c3978l);
            if (c3978lM15898n == null) {
                int iM15774j = abstractC3976j.m15774j(m15897m(abstractC3976j).m15793b().mo15831g(abstractC3976j));
                if (iM15774j > i10) {
                    i10 = iM15774j;
                }
            } else {
                if (c3978l == c3978lM15898n) {
                }
            }
            c3978lArr[i11] = c3978lM15898n;
        }
        return i10;
    }

    /* JADX INFO: renamed from: m */
    public final C3978l m15897m(AbstractC3976j abstractC3976j) {
        C3978l c3978lM15898n = m15898n(abstractC3976j.m15773i(), abstractC3976j.m15776l());
        if (c3978lM15898n != null) {
            return c3978lM15898n;
        }
        throw new C0065a("No expanded opcode for " + abstractC3976j);
    }

    /* JADX INFO: renamed from: n */
    public final C3978l m15898n(AbstractC3976j abstractC3976j, C3978l c3978l) {
        while (c3978l != null && (!c3978l.m15793b().mo15834j(abstractC3976j) || (this.f11742a.f8504c && c3978l.m15796e() == 26))) {
            c3978l = AbstractC3979m.m15800b(c3978l, this.f11742a);
        }
        return c3978l;
    }

    /* JADX INFO: renamed from: o */
    public C3977k m15899o() {
        if (this.f11747f >= 0) {
            C5725t.m23179a("already processed");
            return null;
        }
        C3978l[] c3978lArrM15905w = m15905w();
        m15908z(c3978lArrM15905w);
        if (this.f11742a.f8502a) {
            m15892f(c3978lArrM15905w);
        }
        m15906x(c3978lArrM15905w);
        m15894h();
        return C3977k.m15785I(this.f11744c, this.f11747f + this.f11743b + this.f11748g);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m15900p() {
        int size = this.f11744c.size();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            AbstractC3976j abstractC3976j = (AbstractC3976j) this.f11744c.get(i10);
            if (abstractC3976j instanceof C3969e0) {
                C3978l c3978lM15776l = abstractC3976j.m15776l();
                C3969e0 c3969e0 = (C3969e0) abstractC3976j;
                if (c3978lM15776l.m15793b().mo15829b(c3969e0)) {
                    continue;
                } else {
                    if (c3978lM15776l.m15792a() == 40) {
                        C3978l c3978lM15898n = m15898n(abstractC3976j, c3978lM15776l);
                        if (c3978lM15898n == null) {
                            C5725t.m23179a("method too long");
                            return false;
                        }
                        this.f11744c.set(i10, abstractC3976j.mo15716w(c3978lM15898n));
                    } else {
                        try {
                            int i11 = i10 + 1;
                            C3970f c3970f = (C3970f) this.f11744c.get(i11);
                            this.f11744c.set(i10, new C3969e0(AbstractC3979m.f11555Q, c3969e0.m15777m(), C6268s.f19445s, c3969e0.m15742A()));
                            this.f11744c.add(i10, c3969e0.m15746E(c3970f));
                            size++;
                            i10 = i11;
                        } catch (ClassCastException unused) {
                            C10010p0.m38820a("unpaired TargetInsn");
                            return false;
                        } catch (IndexOutOfBoundsException unused2) {
                            C10010p0.m38820a("unpaired TargetInsn (dangling)");
                            return false;
                        }
                    }
                    z10 = true;
                }
            }
            i10++;
        }
        return z10;
    }

    /* JADX INFO: renamed from: q */
    public AbstractC3976j m15901q(int i10) {
        return (AbstractC3976j) this.f11744c.get(i10);
    }

    /* JADX INFO: renamed from: r */
    public HashSet m15902r() {
        HashSet hashSet = new HashSet(20);
        Iterator it = this.f11744c.iterator();
        while (it.hasNext()) {
            m15878b(hashSet, (AbstractC3976j) it.next());
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: s */
    public boolean m15903s() {
        return this.f11746e;
    }

    /* JADX INFO: renamed from: t */
    public boolean m15904t() {
        return this.f11745d;
    }

    /* JADX INFO: renamed from: w */
    public final C3978l[] m15905w() {
        int size = this.f11744c.size();
        C3978l[] c3978lArr = new C3978l[size];
        for (int i10 = 0; i10 < size; i10++) {
            c3978lArr[i10] = ((AbstractC3976j) this.f11744c.get(i10)).m15776l();
        }
        return c3978lArr;
    }

    /* JADX INFO: renamed from: x */
    public final void m15906x(C3978l[] c3978lArr) {
        if (this.f11747f != 0) {
            this.f11744c = m15907y(c3978lArr);
            return;
        }
        int size = this.f11744c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC3976j abstractC3976j = (AbstractC3976j) this.f11744c.get(i10);
            C3978l c3978lM15776l = abstractC3976j.m15776l();
            C3978l c3978l = c3978lArr[i10];
            if (c3978lM15776l != c3978l) {
                this.f11744c.set(i10, abstractC3976j.mo15716w(c3978l));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m15907y(p154k5.C3978l[] r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = r11.f11744c
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0 * 2
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L13:
            if (r3 >= r0) goto L89
            java.util.ArrayList r4 = r11.f11744c
            java.lang.Object r4 = r4.get(r3)
            k5.j r4 = (p154k5.AbstractC3976j) r4
            k5.l r5 = r4.m15776l()
            r6 = r12[r3]
            if (r6 == 0) goto L28
            r7 = 0
            r9 = r7
            goto L41
        L28:
            k5.l r6 = r11.m15897m(r4)
            k5.p r7 = r6.m15793b()
            java.util.BitSet r7 = r7.mo15831g(r4)
            k5.j r8 = r4.m15769e(r7)
            k5.j r9 = r4.m15770f(r7)
            k5.j r4 = r4.m15771g(r7)
            r7 = r8
        L41:
            boolean r8 = r4 instanceof p154k5.C3970f
            if (r8 == 0) goto L52
            r8 = r4
            k5.f r8 = (p154k5.C3970f) r8
            boolean r10 = r8.m15747A()
            if (r10 == 0) goto L52
            r2.add(r8)
            goto L86
        L52:
            if (r7 == 0) goto L57
            r1.add(r7)
        L57:
            boolean r7 = r4 instanceof p154k5.AbstractC3973g0
            if (r7 != 0) goto L78
            int r7 = r2.size()
            if (r7 <= 0) goto L78
            java.util.Iterator r7 = r2.iterator()
        L65:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L75
            java.lang.Object r8 = r7.next()
            k5.f r8 = (p154k5.C3970f) r8
            r1.add(r8)
            goto L65
        L75:
            r2.clear()
        L78:
            if (r6 == r5) goto L7e
            k5.j r4 = r4.mo15716w(r6)
        L7e:
            r1.add(r4)
            if (r9 == 0) goto L86
            r1.add(r9)
        L86:
            int r3 = r3 + 1
            goto L13
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p154k5.C3989w.m15907y(k5.l[]):java.util.ArrayList");
    }

    /* JADX INFO: renamed from: z */
    public final boolean m15908z(C3978l[] c3978lArr) {
        int i10 = this.f11747f;
        if (i10 < 0) {
            i10 = 0;
        }
        boolean z10 = false;
        while (true) {
            int iM15896l = m15896l(c3978lArr);
            if (i10 >= iM15896l) {
                this.f11747f = i10;
                return z10;
            }
            int i11 = iM15896l - i10;
            int size = this.f11744c.size();
            for (int i12 = 0; i12 < size; i12++) {
                AbstractC3976j abstractC3976j = (AbstractC3976j) this.f11744c.get(i12);
                if (!(abstractC3976j instanceof C3970f)) {
                    this.f11744c.set(i12, abstractC3976j.mo15748x(i11));
                }
            }
            z10 = true;
            i10 = iM15896l;
        }
    }
}
