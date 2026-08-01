package ga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0184l;
import p160kb.EnumC4242v;
import p160kb.InterfaceC4229i;
import p160kb.InterfaceC4233m;
import p160kb.InterfaceC4236p;
import p160kb.InterfaceC4237q;
import p160kb.InterfaceC4238r;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p212o9.C5667c;
import p213oa.C5693d;
import p358y9.AbstractC9611b;
import p358y9.C9618e0;
import p358y9.C9652w;
import p358y9.EnumC9613c;

/* JADX INFO: renamed from: ga.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2578d {

    /* JADX INFO: renamed from: ga.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC4229i f6851a;

        /* JADX INFO: renamed from: b */
        public final C9618e0 f6852b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC4237q f6853c;

        public a(InterfaceC4229i interfaceC4229i, C9618e0 c9618e0, InterfaceC4237q interfaceC4237q) {
            this.f6851a = interfaceC4229i;
            this.f6852b = c9618e0;
            this.f6853c = interfaceC4237q;
        }

        /* JADX INFO: renamed from: a */
        public final C9618e0 m9139a() {
            return this.f6852b;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC4229i m9140b() {
            return this.f6851a;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC4237q m9141c() {
            return this.f6853c;
        }
    }

    /* JADX INFO: renamed from: I */
    public static final Iterable m9104I(AbstractC2578d abstractC2578d, InterfaceC4238r interfaceC4238r, a aVar) {
        InterfaceC4229i interfaceC4229iM9140b;
        InterfaceC4236p interfaceC4236pMo10897I;
        List listMo10885A0;
        InterfaceC4229i interfaceC4229iM9140b2;
        aVar.getClass();
        if ((abstractC2578d.mo9138z() && (interfaceC4229iM9140b2 = aVar.m9140b()) != null && interfaceC4238r.mo10911V(interfaceC4229iM9140b2)) || (interfaceC4229iM9140b = aVar.m9140b()) == null || (interfaceC4236pMo10897I = interfaceC4238r.mo10897I(interfaceC4229iM9140b)) == null || (listMo10885A0 = interfaceC4238r.mo10885A0(interfaceC4236pMo10897I)) == null) {
            return null;
        }
        List listMo10940r = interfaceC4238r.mo10940r(aVar.m9140b());
        Iterator it = listMo10885A0.iterator();
        Iterator it2 = listMo10940r.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC5116y.m20814z(listMo10885A0, 10), AbstractC5116y.m20814z(listMo10940r, 10)));
        while (it.hasNext() && it2.hasNext()) {
            InterfaceC4237q interfaceC4237q = (InterfaceC4237q) it.next();
            InterfaceC4229i interfaceC4229iMo10903M = interfaceC4238r.mo10903M((InterfaceC4233m) it2.next());
            arrayList.add(interfaceC4229iMo10903M == null ? new a(null, aVar.m9139a(), interfaceC4237q) : new a(interfaceC4229iMo10903M, abstractC2578d.m9119f(interfaceC4229iMo10903M, aVar.m9139a()), interfaceC4237q));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static final C2590h m9108e(C2619q1 c2619q1, C2590h[] c2590hArr, int i10) {
        Map mapM9308b;
        C2590h c2590h;
        return (c2619q1 == null || (mapM9308b = c2619q1.m9308b()) == null || (c2590h = (C2590h) mapM9308b.get(Integer.valueOf(i10))) == null) ? (i10 < 0 || i10 >= c2590hArr.length) ? C2590h.f6880e.m9254a() : c2590hArr[i10] : c2590h;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m9109i(AbstractC2578d abstractC2578d, a aVar, Object obj) {
        obj.getClass();
        return abstractC2578d.mo9124l(obj, aVar.m9140b());
    }

    /* JADX INFO: renamed from: A */
    public abstract InterfaceC4238r mo9110A();

    /* JADX INFO: renamed from: B */
    public abstract boolean mo9111B(InterfaceC4229i interfaceC4229i);

    /* JADX INFO: renamed from: C */
    public abstract boolean mo9112C();

    /* JADX INFO: renamed from: D */
    public abstract boolean mo9113D(InterfaceC4229i interfaceC4229i, InterfaceC4229i interfaceC4229i2);

    /* JADX INFO: renamed from: E */
    public abstract boolean mo9114E(InterfaceC4237q interfaceC4237q);

    /* JADX INFO: renamed from: F */
    public abstract boolean mo9115F(InterfaceC4229i interfaceC4229i);

    /* JADX INFO: renamed from: G */
    public final C2602l m9116G(C2602l c2602l, C2602l c2602l2) {
        return c2602l == null ? c2602l2 : (c2602l2 != null && ((c2602l.m9270d() && !c2602l2.m9270d()) || ((c2602l.m9270d() || !c2602l2.m9270d()) && (c2602l.m9269c().compareTo(c2602l2.m9269c()) < 0 || c2602l.m9269c().compareTo(c2602l2.m9269c()) <= 0)))) ? c2602l2 : c2602l;
    }

    /* JADX INFO: renamed from: H */
    public final List m9117H(InterfaceC4229i interfaceC4229i) {
        return m9122j(new a(interfaceC4229i, m9119f(interfaceC4229i, mo9130r()), null), new C2575c(this, mo9110A()));
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0184l m9118d(InterfaceC4229i interfaceC4229i, Iterable iterable, C2619q1 c2619q1, boolean z10) {
        int size;
        InterfaceC4229i interfaceC4229iM9140b;
        interfaceC4229i.getClass();
        iterable.getClass();
        List listM9117H = m9117H(interfaceC4229i);
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m9117H((InterfaceC4229i) it.next()));
        }
        if (m9135w()) {
            size = 1;
            break;
        }
        if (mo9112C() && (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty())) {
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (!mo9113D(interfaceC4229i, (InterfaceC4229i) it2.next())) {
                    size = 1;
                    break;
                }
            }
        }
        size = listM9117H.size();
        C2590h[] c2590hArr = new C2590h[size];
        int i10 = 0;
        while (i10 < size) {
            C2590h c2590hM9121h = m9121h((a) listM9117H.get(i10));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar = (a) AbstractC5081g0.m20579m0((List) it3.next(), i10);
                C2590h c2590hM9120g = (aVar == null || (interfaceC4229iM9140b = aVar.m9140b()) == null) ? null : m9120g(interfaceC4229iM9140b);
                if (c2590hM9120g != null) {
                    arrayList2.add(c2590hM9120g);
                }
            }
            c2590hArr[i10] = AbstractC2625s1.m9318a(c2590hM9121h, arrayList2, i10 == 0 && mo9112C(), i10 == 0 && mo9131s(), z10);
            i10++;
        }
        return new C2572b(c2619q1, c2590hArr);
    }

    /* JADX INFO: renamed from: f */
    public final C9618e0 m9119f(InterfaceC4229i interfaceC4229i, C9618e0 c9618e0) {
        return mo9125m().m37582d(c9618e0, mo9126n(interfaceC4229i));
    }

    /* JADX INFO: renamed from: g */
    public final C2590h m9120g(InterfaceC4229i interfaceC4229i) {
        EnumC2599k enumC2599kM9137y;
        EnumC2599k enumC2599kM9137y2 = m9137y(interfaceC4229i);
        EnumC2593i enumC2593i = null;
        if (enumC2599kM9137y2 == null) {
            InterfaceC4229i interfaceC4229iMo9134v = mo9134v(interfaceC4229i);
            enumC2599kM9137y = interfaceC4229iMo9134v != null ? m9137y(interfaceC4229iMo9134v) : null;
        } else {
            enumC2599kM9137y = enumC2599kM9137y2;
        }
        InterfaceC4238r interfaceC4238rMo9110A = mo9110A();
        C5667c c5667c = C5667c.f17796a;
        if (c5667c.m22891l(mo9136x(interfaceC4238rMo9110A.mo10942s0(interfaceC4229i)))) {
            enumC2593i = EnumC2593i.f6888q;
        } else if (c5667c.m22890k(mo9136x(interfaceC4238rMo9110A.mo10893F0(interfaceC4229i)))) {
            enumC2593i = EnumC2593i.f6889r;
        }
        return new C2590h(enumC2599kM9137y, enumC2593i, mo9110A().mo10895H(interfaceC4229i) || mo9115F(interfaceC4229i), enumC2599kM9137y != enumC2599kM9137y2);
    }

    /* JADX INFO: renamed from: h */
    public final C2590h m9121h(a aVar) {
        Iterable iterableM20800o;
        C2602l c2602lM9127o;
        InterfaceC4229i interfaceC4229iM9140b;
        InterfaceC4236p interfaceC4236pMo10897I;
        if (aVar.m9140b() == null) {
            InterfaceC4238r interfaceC4238rMo9110A = mo9110A();
            InterfaceC4237q interfaceC4237qM9141c = aVar.m9141c();
            if ((interfaceC4237qM9141c != null ? interfaceC4238rMo9110A.mo10909T(interfaceC4237qM9141c) : null) == EnumC4242v.f12416r) {
                return C2590h.f6880e.m9254a();
            }
        }
        boolean z10 = false;
        boolean z11 = aVar.m9141c() == null;
        InterfaceC4229i interfaceC4229iM9140b2 = aVar.m9140b();
        if (interfaceC4229iM9140b2 == null || (iterableM20800o = mo9126n(interfaceC4229iM9140b2)) == null) {
            iterableM20800o = AbstractC5114x.m20800o();
        }
        InterfaceC4238r interfaceC4238rMo9110A2 = mo9110A();
        InterfaceC4229i interfaceC4229iM9140b3 = aVar.m9140b();
        InterfaceC4237q interfaceC4237qMo10913X = (interfaceC4229iM9140b3 == null || (interfaceC4236pMo10897I = interfaceC4238rMo9110A2.mo10897I(interfaceC4229iM9140b3)) == null) ? null : interfaceC4238rMo9110A2.mo10913X(interfaceC4236pMo10897I);
        boolean z12 = mo9129q() == EnumC9613c.f32729v;
        if (z11) {
            if (z12 || !mo9133u() || (interfaceC4229iM9140b = aVar.m9140b()) == null || !mo9111B(interfaceC4229iM9140b)) {
                iterableM20800o = AbstractC5081g0.m20531C0(mo9128p(), iterableM20800o);
            } else {
                Iterable iterableMo9128p = mo9128p();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterableMo9128p) {
                    if (!mo9125m().m37593p(obj)) {
                        arrayList.add(obj);
                    }
                }
                iterableM20800o = AbstractC5081g0.m20533E0(arrayList, iterableM20800o);
            }
        }
        EnumC2593i enumC2593iM37584g = mo9125m().m37584g(iterableM20800o);
        C2602l c2602lM37585h = mo9125m().m37585h(iterableM20800o, new C2569a(this, aVar));
        if (c2602lM37585h != null) {
            EnumC2599k enumC2599kM9269c = c2602lM37585h.m9269c();
            if (c2602lM37585h.m9269c() == EnumC2599k.f6899s && interfaceC4237qMo10913X != null) {
                z10 = true;
            }
            return new C2590h(enumC2599kM9269c, enumC2593iM37584g, z10, c2602lM37585h.m9270d());
        }
        EnumC9613c enumC9613cMo9129q = (z11 || z12) ? mo9129q() : EnumC9613c.f32728u;
        C9618e0 c9618e0M9139a = aVar.m9139a();
        C9652w c9652wM37627a = c9618e0M9139a != null ? c9618e0M9139a.m37627a(enumC9613cMo9129q) : null;
        C2602l c2602lM9127o2 = interfaceC4237qMo10913X != null ? m9127o(interfaceC4237qMo10913X) : null;
        C2602l c2602lMo9132t = mo9132t(c2602lM9127o2, c9652wM37627a);
        boolean z13 = (c2602lM9127o2 != null ? c2602lM9127o2.m9269c() : null) == EnumC2599k.f6899s || !(interfaceC4237qMo10913X == null || c9652wM37627a == null || !c9652wM37627a.m37757c());
        InterfaceC4237q interfaceC4237qM9141c2 = aVar.m9141c();
        if (interfaceC4237qM9141c2 == null || (c2602lM9127o = m9127o(interfaceC4237qM9141c2)) == null) {
            c2602lM9127o = null;
        } else if (c2602lM9127o.m9269c() == EnumC2599k.f6898r) {
            c2602lM9127o = C2602l.m9267b(c2602lM9127o, EnumC2599k.f6897q, false, 2, null);
        }
        C2602l c2602lM9116G = m9116G(c2602lM9127o, c2602lMo9132t);
        EnumC2599k enumC2599kM9269c2 = c2602lM9116G != null ? c2602lM9116G.m9269c() : null;
        if (c2602lM9116G != null && c2602lM9116G.m9270d()) {
            z10 = true;
        }
        return new C2590h(enumC2599kM9269c2, enumC2593iM37584g, z13, z10);
    }

    /* JADX INFO: renamed from: j */
    public final List m9122j(Object obj, InterfaceC0184l interfaceC0184l) {
        ArrayList arrayList = new ArrayList(1);
        m9123k(obj, arrayList, interfaceC0184l);
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final void m9123k(Object obj, List list, InterfaceC0184l interfaceC0184l) {
        list.add(obj);
        Iterable iterable = (Iterable) interfaceC0184l.mo27m(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m9123k(it.next(), list, interfaceC0184l);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract boolean mo9124l(Object obj, InterfaceC4229i interfaceC4229i);

    /* JADX INFO: renamed from: m */
    public abstract AbstractC9611b mo9125m();

    /* JADX INFO: renamed from: n */
    public abstract Iterable mo9126n(InterfaceC4229i interfaceC4229i);

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ga.C2602l m9127o(p160kb.InterfaceC4237q r5) {
        /*
            r4 = this;
            kb.r r0 = r4.mo9110A()
            boolean r1 = r4.mo9114E(r5)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.util.List r5 = r0.mo10947v(r5)
            if (r5 == 0) goto L1a
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L1a
            goto Lbd
        L1a:
            java.util.Iterator r1 = r5.iterator()
        L1e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r1.next()
            kb.i r3 = (p160kb.InterfaceC4229i) r3
            boolean r3 = r0.mo10925j(r3)
            if (r3 != 0) goto L1e
            if (r5 == 0) goto L39
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L39
            goto L51
        L39:
            java.util.Iterator r1 = r5.iterator()
        L3d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r1.next()
            kb.i r3 = (p160kb.InterfaceC4229i) r3
            ga.k r3 = r4.m9137y(r3)
            if (r3 == 0) goto L3d
            r1 = r5
            goto L8f
        L51:
            if (r5 == 0) goto L5a
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L5a
            goto Lbd
        L5a:
            java.util.Iterator r1 = r5.iterator()
        L5e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r1.next()
            kb.i r3 = (p160kb.InterfaceC4229i) r3
            kb.i r3 = r4.mo9134v(r3)
            if (r3 == 0) goto L5e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r5.iterator()
        L79:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r2.next()
            kb.i r3 = (p160kb.InterfaceC4229i) r3
            kb.i r3 = r4.mo9134v(r3)
            if (r3 == 0) goto L79
            r1.add(r3)
            goto L79
        L8f:
            if (r1 == 0) goto L98
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L98
            goto Lb1
        L98:
            java.util.Iterator r2 = r1.iterator()
        L9c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r2.next()
            kb.i r3 = (p160kb.InterfaceC4229i) r3
            boolean r3 = r0.mo10924i0(r3)
            if (r3 != 0) goto L9c
            ga.k r0 = ga.EnumC2599k.f6899s
            goto Lb3
        Lb1:
            ga.k r0 = ga.EnumC2599k.f6898r
        Lb3:
            ga.l r2 = new ga.l
            if (r1 == r5) goto Lb9
            r5 = 1
            goto Lba
        Lb9:
            r5 = 0
        Lba:
            r2.<init>(r0, r5)
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.AbstractC2578d.m9127o(kb.q):ga.l");
    }

    /* JADX INFO: renamed from: p */
    public abstract Iterable mo9128p();

    /* JADX INFO: renamed from: q */
    public abstract EnumC9613c mo9129q();

    /* JADX INFO: renamed from: r */
    public abstract C9618e0 mo9130r();

    /* JADX INFO: renamed from: s */
    public abstract boolean mo9131s();

    /* JADX INFO: renamed from: t */
    public abstract C2602l mo9132t(C2602l c2602l, C9652w c9652w);

    /* JADX INFO: renamed from: u */
    public abstract boolean mo9133u();

    /* JADX INFO: renamed from: v */
    public abstract InterfaceC4229i mo9134v(InterfaceC4229i interfaceC4229i);

    /* JADX INFO: renamed from: w */
    public boolean m9135w() {
        return false;
    }

    /* JADX INFO: renamed from: x */
    public abstract C5693d mo9136x(InterfaceC4229i interfaceC4229i);

    /* JADX INFO: renamed from: y */
    public final EnumC2599k m9137y(InterfaceC4229i interfaceC4229i) {
        InterfaceC4238r interfaceC4238rMo9110A = mo9110A();
        if (interfaceC4238rMo9110A.mo10953y(interfaceC4238rMo9110A.mo10942s0(interfaceC4229i))) {
            return EnumC2599k.f6898r;
        }
        if (interfaceC4238rMo9110A.mo10953y(interfaceC4238rMo9110A.mo10893F0(interfaceC4229i))) {
            return null;
        }
        return EnumC2599k.f6899s;
    }

    /* JADX INFO: renamed from: z */
    public abstract boolean mo9138z();
}
