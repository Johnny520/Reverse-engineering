package gb;

import gb.C2713t1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p024b9.AbstractC1061t;
import p160kb.EnumC4222b;
import p160kb.EnumC4242v;
import p160kb.InterfaceC4224d;
import p160kb.InterfaceC4227g;
import p160kb.InterfaceC4228h;
import p160kb.InterfaceC4229i;
import p160kb.InterfaceC4230j;
import p160kb.InterfaceC4232l;
import p160kb.InterfaceC4233m;
import p160kb.InterfaceC4236p;
import p160kb.InterfaceC4238r;
import p172l8.C4700i0;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p215oc.C5729x;
import p244qb.C6379j;
import p314vb.C8897d;

/* JADX INFO: renamed from: gb.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2664g {

    /* JADX INFO: renamed from: a */
    public static final C2664g f6996a = new C2664g();

    /* JADX INFO: renamed from: b */
    public static boolean f6997b;

    /* JADX INFO: renamed from: gb.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6998a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f6999b;

        static {
            int[] iArr = new int[EnumC4242v.values().length];
            try {
                iArr[EnumC4242v.f12418t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4242v.f12417s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4242v.f12416r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6998a = iArr;
            int[] iArr2 = new int[C2713t1.b.values().length];
            try {
                iArr2[C2713t1.b.f7096q.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[C2713t1.b.f7097r.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[C2713t1.b.f7098s.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f6999b = iArr2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m9403d(InterfaceC4238r interfaceC4238r, InterfaceC4230j interfaceC4230j) {
        InterfaceC4229i interfaceC4229iMo10903M;
        InterfaceC4230j interfaceC4230jMo10893F0;
        return (interfaceC4230j instanceof InterfaceC4224d) && (interfaceC4229iMo10903M = interfaceC4238r.mo10903M(interfaceC4238r.mo10932n(interfaceC4238r.mo10948v0((InterfaceC4224d) interfaceC4230j)))) != null && (interfaceC4230jMo10893F0 = interfaceC4238r.mo10893F0(interfaceC4229iMo10903M)) != null && interfaceC4238r.mo10906P(interfaceC4230jMo10893F0);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m9404e(InterfaceC4238r interfaceC4238r, InterfaceC4230j interfaceC4230j) {
        InterfaceC4236p interfaceC4236pMo10763e = interfaceC4238r.mo10763e(interfaceC4230j);
        if (!(interfaceC4236pMo10763e instanceof InterfaceC4228h)) {
            return false;
        }
        Collection collectionMo10929l = interfaceC4238r.mo10929l(interfaceC4236pMo10763e);
        if ((collectionMo10929l instanceof Collection) && collectionMo10929l.isEmpty()) {
            return false;
        }
        Iterator it = collectionMo10929l.iterator();
        while (it.hasNext()) {
            InterfaceC4230j interfaceC4230jMo10764f = interfaceC4238r.mo10764f((InterfaceC4229i) it.next());
            if (interfaceC4230jMo10764f != null && interfaceC4238r.mo10906P(interfaceC4230jMo10764f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m9405f(InterfaceC4238r interfaceC4238r, InterfaceC4230j interfaceC4230j) {
        return interfaceC4238r.mo10906P(interfaceC4230j) || m9403d(interfaceC4238r, interfaceC4230j);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m9406g(InterfaceC4238r interfaceC4238r, C2713t1 c2713t1, InterfaceC4230j interfaceC4230j, InterfaceC4230j interfaceC4230j2, boolean z10) {
        C2713t1 c2713t12;
        InterfaceC4230j interfaceC4230j3;
        Collection<InterfaceC4229i> collectionMo10916a0 = interfaceC4238r.mo10916a0(interfaceC4230j);
        if ((collectionMo10916a0 instanceof Collection) && collectionMo10916a0.isEmpty()) {
            return false;
        }
        for (InterfaceC4229i interfaceC4229i : collectionMo10916a0) {
            if (AbstractC1061t.m3842c(interfaceC4238r.mo10897I(interfaceC4229i), interfaceC4238r.mo10763e(interfaceC4230j2))) {
                return true;
            }
            if (z10) {
                c2713t12 = c2713t1;
                interfaceC4230j3 = interfaceC4230j2;
                if (m9407v(f6996a, c2713t12, interfaceC4230j3, interfaceC4229i, false, 8, null)) {
                    return true;
                }
            } else {
                c2713t12 = c2713t1;
                interfaceC4230j3 = interfaceC4230j2;
            }
            c2713t1 = c2713t12;
            interfaceC4230j2 = interfaceC4230j3;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m9407v(C2664g c2664g, C2713t1 c2713t1, InterfaceC4229i interfaceC4229i, InterfaceC4229i interfaceC4229i2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c2664g.m9425u(c2713t1, interfaceC4229i, interfaceC4229i2, z10);
    }

    /* JADX INFO: renamed from: x */
    public static final C4700i0 m9408x(Collection collection, C2713t1 c2713t1, InterfaceC4238r interfaceC4238r, InterfaceC4230j interfaceC4230j, C2713t1.a aVar) {
        aVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aVar.mo9615a(new C2660f(c2713t1, interfaceC4238r, (InterfaceC4230j) it.next(), interfaceC4230j));
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m9409y(C2713t1 c2713t1, InterfaceC4238r interfaceC4238r, InterfaceC4230j interfaceC4230j, InterfaceC4230j interfaceC4230j2) {
        return f6996a.m9423s(c2713t1, interfaceC4238r.mo10894G0(interfaceC4230j), interfaceC4230j2);
    }

    /* JADX INFO: renamed from: A */
    public final List m9410A(C2713t1 c2713t1, List list) {
        int i10;
        InterfaceC4238r interfaceC4238rM9606j = c2713t1.m9606j();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                InterfaceC4232l interfaceC4232lMo10894G0 = interfaceC4238rM9606j.mo10894G0((InterfaceC4230j) obj);
                int iMo10943t = interfaceC4238rM9606j.mo10943t(interfaceC4232lMo10894G0);
                while (true) {
                    if (i10 >= iMo10943t) {
                        arrayList.add(obj);
                        break;
                    }
                    InterfaceC4229i interfaceC4229iMo10903M = interfaceC4238rM9606j.mo10903M(interfaceC4238rM9606j.mo10918c0(interfaceC4232lMo10894G0, i10));
                    i10 = (interfaceC4229iMo10903M != null ? interfaceC4238rM9606j.mo10898J(interfaceC4229iMo10903M) : null) == null ? i10 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m9411c(C2713t1 c2713t1, InterfaceC4230j interfaceC4230j, InterfaceC4230j interfaceC4230j2) {
        InterfaceC4238r interfaceC4238rM9606j = c2713t1.m9606j();
        if (!interfaceC4238rM9606j.mo10906P(interfaceC4230j) && !interfaceC4238rM9606j.mo10906P(interfaceC4230j2)) {
            return null;
        }
        if (m9405f(interfaceC4238rM9606j, interfaceC4230j) && m9405f(interfaceC4238rM9606j, interfaceC4230j2)) {
            return Boolean.TRUE;
        }
        if (interfaceC4238rM9606j.mo10906P(interfaceC4230j)) {
            if (m9406g(interfaceC4238rM9606j, c2713t1, interfaceC4230j, interfaceC4230j2, false)) {
                return Boolean.TRUE;
            }
        } else if (interfaceC4238rM9606j.mo10906P(interfaceC4230j2) && (m9404e(interfaceC4238rM9606j, interfaceC4230j) || m9406g(interfaceC4238rM9606j, c2713t1, interfaceC4230j2, interfaceC4230j, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean m9412h(gb.C2713t1 r13, p160kb.InterfaceC4230j r14, p160kb.InterfaceC4230j r15) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.C2664g.m9412h(gb.t1, kb.j, kb.j):java.lang.Boolean");
    }

    /* JADX INFO: renamed from: i */
    public final List m9413i(C2713t1 c2713t1, InterfaceC4230j interfaceC4230j, InterfaceC4236p interfaceC4236p) {
        C2713t1.c cVarMo10900K;
        InterfaceC4238r interfaceC4238rM9606j = c2713t1.m9606j();
        List listMo10887B0 = interfaceC4238rM9606j.mo10887B0(interfaceC4230j, interfaceC4236p);
        if (listMo10887B0 != null) {
            return listMo10887B0;
        }
        if (!interfaceC4238rM9606j.mo10886B(interfaceC4236p) && interfaceC4238rM9606j.mo10955z(interfaceC4230j)) {
            return AbstractC5114x.m20800o();
        }
        if (interfaceC4238rM9606j.mo10901K0(interfaceC4236p)) {
            if (!interfaceC4238rM9606j.mo10923h0(interfaceC4238rM9606j.mo10763e(interfaceC4230j), interfaceC4236p)) {
                return AbstractC5114x.m20800o();
            }
            InterfaceC4230j interfaceC4230jMo10921f0 = interfaceC4238rM9606j.mo10921f0(interfaceC4230j, EnumC4222b.f12410q);
            if (interfaceC4230jMo10921f0 != null) {
                interfaceC4230j = interfaceC4230jMo10921f0;
            }
            return AbstractC5112w.m20789e(interfaceC4230j);
        }
        C6379j c6379j = new C6379j();
        c2713t1.m9607k();
        ArrayDeque arrayDequeM9604h = c2713t1.m9604h();
        arrayDequeM9604h.getClass();
        Set setM9605i = c2713t1.m9605i();
        setM9605i.getClass();
        arrayDequeM9604h.push(interfaceC4230j);
        while (!arrayDequeM9604h.isEmpty()) {
            InterfaceC4230j interfaceC4230j2 = (InterfaceC4230j) arrayDequeM9604h.pop();
            interfaceC4230j2.getClass();
            if (setM9605i.add(interfaceC4230j2)) {
                InterfaceC4230j interfaceC4230jMo10921f02 = interfaceC4238rM9606j.mo10921f0(interfaceC4230j2, EnumC4222b.f12410q);
                if (interfaceC4230jMo10921f02 == null) {
                    interfaceC4230jMo10921f02 = interfaceC4230j2;
                }
                if (interfaceC4238rM9606j.mo10923h0(interfaceC4238rM9606j.mo10763e(interfaceC4230jMo10921f02), interfaceC4236p)) {
                    c6379j.add(interfaceC4230jMo10921f02);
                    cVarMo10900K = C2713t1.c.C10086c.f7102a;
                } else {
                    cVarMo10900K = interfaceC4238rM9606j.mo10939q0(interfaceC4230jMo10921f02) == 0 ? C2713t1.c.b.f7101a : c2713t1.m9606j().mo10900K(interfaceC4230jMo10921f02);
                }
                if (AbstractC1061t.m3842c(cVarMo10900K, C2713t1.c.C10086c.f7102a)) {
                    cVarMo10900K = null;
                }
                if (cVarMo10900K != null) {
                    InterfaceC4238r interfaceC4238rM9606j2 = c2713t1.m9606j();
                    Iterator it = interfaceC4238rM9606j2.mo10929l(interfaceC4238rM9606j2.mo10763e(interfaceC4230j2)).iterator();
                    while (it.hasNext()) {
                        arrayDequeM9604h.add(cVarMo10900K.mo9618a(c2713t1, (InterfaceC4229i) it.next()));
                    }
                }
            }
        }
        c2713t1.m9601e();
        return c6379j;
    }

    /* JADX INFO: renamed from: j */
    public final List m9414j(C2713t1 c2713t1, InterfaceC4230j interfaceC4230j, InterfaceC4236p interfaceC4236p) {
        return m9410A(c2713t1, m9413i(c2713t1, interfaceC4230j, interfaceC4236p));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9415k(C2713t1 c2713t1, InterfaceC4229i interfaceC4229i, InterfaceC4229i interfaceC4229i2, boolean z10) {
        InterfaceC4238r interfaceC4238rM9606j = c2713t1.m9606j();
        InterfaceC4229i interfaceC4229iM9612p = c2713t1.m9612p(c2713t1.m9613q(interfaceC4229i));
        InterfaceC4229i interfaceC4229iM9612p2 = c2713t1.m9612p(c2713t1.m9613q(interfaceC4229i2));
        if (c2713t1.m9609m() && interfaceC4238rM9606j.mo10919d0(interfaceC4229iM9612p) && interfaceC4238rM9606j.mo10895H(interfaceC4229iM9612p2)) {
            C2664g c2664g = f6996a;
            InterfaceC4227g interfaceC4227gMo10898J = interfaceC4238rM9606j.mo10898J(interfaceC4229iM9612p);
            interfaceC4227gMo10898J.getClass();
            InterfaceC4230j interfaceC4230jMo10759a = interfaceC4238rM9606j.mo10759a(interfaceC4227gMo10898J);
            InterfaceC4230j interfaceC4230jMo10764f = interfaceC4238rM9606j.mo10764f(interfaceC4229iM9612p2);
            interfaceC4230jMo10764f.getClass();
            return c2664g.m9415k(c2713t1, interfaceC4230jMo10759a, interfaceC4238rM9606j.mo10890D0(interfaceC4230jMo10764f), z10);
        }
        C2664g c2664g2 = f6996a;
        Boolean boolM9412h = c2664g2.m9412h(c2713t1, interfaceC4238rM9606j.mo10942s0(interfaceC4229iM9612p), interfaceC4238rM9606j.mo10893F0(interfaceC4229iM9612p2));
        if (boolM9412h == null) {
            Boolean boolM9600c = c2713t1.m9600c(interfaceC4229iM9612p, interfaceC4229iM9612p2, z10);
            return boolM9600c != null ? boolM9600c.booleanValue() : c2664g2.m9426w(c2713t1, interfaceC4238rM9606j.mo10942s0(interfaceC4229iM9612p), interfaceC4238rM9606j.mo10893F0(interfaceC4229iM9612p2));
        }
        boolean zBooleanValue = boolM9412h.booleanValue();
        c2713t1.m9600c(interfaceC4229iM9612p, interfaceC4229iM9612p2, z10);
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: l */
    public final EnumC4242v m9416l(EnumC4242v enumC4242v, EnumC4242v enumC4242v2) {
        enumC4242v.getClass();
        enumC4242v2.getClass();
        EnumC4242v enumC4242v3 = EnumC4242v.f12418t;
        if (enumC4242v == enumC4242v3) {
            return enumC4242v2;
        }
        if (enumC4242v2 == enumC4242v3 || enumC4242v == enumC4242v2) {
            return enumC4242v;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m9417m(C2713t1 c2713t1, InterfaceC4229i interfaceC4229i, InterfaceC4229i interfaceC4229i2) {
        c2713t1.getClass();
        interfaceC4229i.getClass();
        interfaceC4229i2.getClass();
        InterfaceC4238r interfaceC4238rM9606j = c2713t1.m9606j();
        if (interfaceC4229i == interfaceC4229i2) {
            return true;
        }
        C2664g c2664g = f6996a;
        if (c2664g.m9421q(interfaceC4238rM9606j, interfaceC4229i) && c2664g.m9421q(interfaceC4238rM9606j, interfaceC4229i2)) {
            InterfaceC4229i interfaceC4229iM9612p = c2713t1.m9612p(c2713t1.m9613q(interfaceC4229i));
            InterfaceC4229i interfaceC4229iM9612p2 = c2713t1.m9612p(c2713t1.m9613q(interfaceC4229i2));
            InterfaceC4230j interfaceC4230jMo10942s0 = interfaceC4238rM9606j.mo10942s0(interfaceC4229iM9612p);
            if (!interfaceC4238rM9606j.mo10923h0(interfaceC4238rM9606j.mo10897I(interfaceC4229iM9612p), interfaceC4238rM9606j.mo10897I(interfaceC4229iM9612p2))) {
                return false;
            }
            if (interfaceC4238rM9606j.mo10939q0(interfaceC4230jMo10942s0) == 0) {
                return interfaceC4238rM9606j.mo10914Y(interfaceC4229iM9612p) || interfaceC4238rM9606j.mo10914Y(interfaceC4229iM9612p2) || interfaceC4238rM9606j.mo10953y(interfaceC4230jMo10942s0) == interfaceC4238rM9606j.mo10953y(interfaceC4238rM9606j.mo10942s0(interfaceC4229iM9612p2));
            }
        }
        return m9407v(c2664g, c2713t1, interfaceC4229i, interfaceC4229i2, false, 8, null) && m9407v(c2664g, c2713t1, interfaceC4229i2, interfaceC4229i, false, 8, null);
    }

    /* JADX INFO: renamed from: n */
    public final List m9418n(C2713t1 c2713t1, InterfaceC4230j interfaceC4230j, InterfaceC4236p interfaceC4236p) {
        C2713t1.c cVar;
        c2713t1.getClass();
        interfaceC4230j.getClass();
        interfaceC4236p.getClass();
        InterfaceC4238r interfaceC4238rM9606j = c2713t1.m9606j();
        if (interfaceC4238rM9606j.mo10955z(interfaceC4230j)) {
            return f6996a.m9414j(c2713t1, interfaceC4230j, interfaceC4236p);
        }
        if (!interfaceC4238rM9606j.mo10886B(interfaceC4236p) && !interfaceC4238rM9606j.mo10899J0(interfaceC4236p)) {
            return f6996a.m9413i(c2713t1, interfaceC4230j, interfaceC4236p);
        }
        C6379j<InterfaceC4230j> c6379j = new C6379j();
        c2713t1.m9607k();
        ArrayDeque arrayDequeM9604h = c2713t1.m9604h();
        arrayDequeM9604h.getClass();
        Set setM9605i = c2713t1.m9605i();
        setM9605i.getClass();
        arrayDequeM9604h.push(interfaceC4230j);
        while (!arrayDequeM9604h.isEmpty()) {
            InterfaceC4230j interfaceC4230j2 = (InterfaceC4230j) arrayDequeM9604h.pop();
            interfaceC4230j2.getClass();
            if (setM9605i.add(interfaceC4230j2)) {
                if (interfaceC4238rM9606j.mo10955z(interfaceC4230j2)) {
                    c6379j.add(interfaceC4230j2);
                    cVar = C2713t1.c.C10086c.f7102a;
                } else {
                    cVar = C2713t1.c.b.f7101a;
                }
                if (AbstractC1061t.m3842c(cVar, C2713t1.c.C10086c.f7102a)) {
                    cVar = null;
                }
                if (cVar != null) {
                    InterfaceC4238r interfaceC4238rM9606j2 = c2713t1.m9606j();
                    Iterator it = interfaceC4238rM9606j2.mo10929l(interfaceC4238rM9606j2.mo10763e(interfaceC4230j2)).iterator();
                    while (it.hasNext()) {
                        arrayDequeM9604h.add(cVar.mo9618a(c2713t1, (InterfaceC4229i) it.next()));
                    }
                }
            }
        }
        c2713t1.m9601e();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC4230j interfaceC4230j3 : c6379j) {
            C2664g c2664g = f6996a;
            interfaceC4230j3.getClass();
            AbstractC5070c0.m20492E(arrayList, c2664g.m9414j(c2713t1, interfaceC4230j3, interfaceC4236p));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        return r7.mo10946u0(r7.mo10897I(r8), r2);
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p160kb.InterfaceC4237q m9419o(p160kb.InterfaceC4238r r7, p160kb.InterfaceC4229i r8, p160kb.InterfaceC4229i r9) {
        /*
            r6 = this;
            int r0 = r7.mo10939q0(r8)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L5e
            kb.m r4 = r7.mo10912W(r8, r2)
            boolean r5 = r7.mo10766h(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L5b
            kb.i r3 = r7.mo10903M(r3)
            if (r3 != 0) goto L1d
            goto L5b
        L1d:
            kb.j r4 = r7.mo10942s0(r3)
            boolean r4 = r7.mo10892F(r4)
            if (r4 == 0) goto L33
            kb.j r4 = r7.mo10942s0(r9)
            boolean r4 = r7.mo10892F(r4)
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = r1
        L34:
            boolean r5 = p024b9.AbstractC1061t.m3842c(r3, r9)
            if (r5 != 0) goto L52
            if (r4 == 0) goto L4b
            kb.p r4 = r7.mo10897I(r3)
            kb.p r5 = r7.mo10897I(r9)
            boolean r4 = p024b9.AbstractC1061t.m3842c(r4, r5)
            if (r4 == 0) goto L4b
            goto L52
        L4b:
            kb.q r3 = r6.m9419o(r7, r3, r9)
            if (r3 == 0) goto L5b
            return r3
        L52:
            kb.p r8 = r7.mo10897I(r8)
            kb.q r7 = r7.mo10946u0(r8, r2)
            return r7
        L5b:
            int r2 = r2 + 1
            goto L6
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.C2664g.m9419o(kb.r, kb.i, kb.i):kb.q");
    }

    /* JADX INFO: renamed from: p */
    public final boolean m9420p(C2713t1 c2713t1, InterfaceC4230j interfaceC4230j) {
        InterfaceC4238r interfaceC4238rM9606j = c2713t1.m9606j();
        InterfaceC4236p interfaceC4236pMo10763e = interfaceC4238rM9606j.mo10763e(interfaceC4230j);
        if (interfaceC4238rM9606j.mo10886B(interfaceC4236pMo10763e)) {
            return interfaceC4238rM9606j.mo10945u(interfaceC4236pMo10763e);
        }
        if (interfaceC4238rM9606j.mo10945u(interfaceC4238rM9606j.mo10763e(interfaceC4230j))) {
            return true;
        }
        c2713t1.m9607k();
        ArrayDeque arrayDequeM9604h = c2713t1.m9604h();
        arrayDequeM9604h.getClass();
        Set setM9605i = c2713t1.m9605i();
        setM9605i.getClass();
        arrayDequeM9604h.push(interfaceC4230j);
        while (!arrayDequeM9604h.isEmpty()) {
            InterfaceC4230j interfaceC4230j2 = (InterfaceC4230j) arrayDequeM9604h.pop();
            interfaceC4230j2.getClass();
            if (setM9605i.add(interfaceC4230j2)) {
                C2713t1.c cVar = interfaceC4238rM9606j.mo10955z(interfaceC4230j2) ? C2713t1.c.C10086c.f7102a : C2713t1.c.b.f7101a;
                if (AbstractC1061t.m3842c(cVar, C2713t1.c.C10086c.f7102a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    InterfaceC4238r interfaceC4238rM9606j2 = c2713t1.m9606j();
                    Iterator it = interfaceC4238rM9606j2.mo10929l(interfaceC4238rM9606j2.mo10763e(interfaceC4230j2)).iterator();
                    while (it.hasNext()) {
                        InterfaceC4230j interfaceC4230jMo9618a = cVar.mo9618a(c2713t1, (InterfaceC4229i) it.next());
                        if (interfaceC4238rM9606j.mo10945u(interfaceC4238rM9606j.mo10763e(interfaceC4230jMo9618a))) {
                            c2713t1.m9601e();
                            return true;
                        }
                        arrayDequeM9604h.add(interfaceC4230jMo9618a);
                    }
                }
            }
        }
        c2713t1.m9601e();
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m9421q(InterfaceC4238r interfaceC4238r, InterfaceC4229i interfaceC4229i) {
        return (!interfaceC4238r.mo10927k(interfaceC4238r.mo10897I(interfaceC4229i)) || interfaceC4238r.mo10931m0(interfaceC4229i) || interfaceC4238r.mo10895H(interfaceC4229i) || interfaceC4238r.mo10910U(interfaceC4229i) || interfaceC4238r.mo10937p0(interfaceC4229i)) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m9422r(InterfaceC4238r interfaceC4238r, InterfaceC4230j interfaceC4230j, InterfaceC4230j interfaceC4230j2) {
        if (interfaceC4238r.mo10763e(interfaceC4230j) != interfaceC4238r.mo10763e(interfaceC4230j2)) {
            return false;
        }
        if (interfaceC4238r.mo10938q(interfaceC4230j) || !interfaceC4238r.mo10938q(interfaceC4230j2)) {
            return !interfaceC4238r.mo10953y(interfaceC4230j) || interfaceC4238r.mo10953y(interfaceC4230j2);
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m9423s(C2713t1 c2713t1, InterfaceC4232l interfaceC4232l, InterfaceC4230j interfaceC4230j) {
        boolean zM9417m;
        C2713t1 c2713t12 = c2713t1;
        c2713t12.getClass();
        interfaceC4232l.getClass();
        interfaceC4230j.getClass();
        InterfaceC4238r interfaceC4238rM9606j = c2713t12.m9606j();
        InterfaceC4236p interfaceC4236pMo10763e = interfaceC4238rM9606j.mo10763e(interfaceC4230j);
        int iMo10943t = interfaceC4238rM9606j.mo10943t(interfaceC4232l);
        int iMo10944t0 = interfaceC4238rM9606j.mo10944t0(interfaceC4236pMo10763e);
        if (iMo10943t != iMo10944t0 || iMo10943t != interfaceC4238rM9606j.mo10939q0(interfaceC4230j)) {
            return false;
        }
        for (int i10 = 0; i10 < iMo10944t0; i10++) {
            InterfaceC4233m interfaceC4233mMo10912W = interfaceC4238rM9606j.mo10912W(interfaceC4230j, i10);
            InterfaceC4229i interfaceC4229iMo10903M = interfaceC4238rM9606j.mo10903M(interfaceC4233mMo10912W);
            if (interfaceC4229iMo10903M != null) {
                InterfaceC4233m interfaceC4233mMo10918c0 = interfaceC4238rM9606j.mo10918c0(interfaceC4232l, i10);
                interfaceC4238rM9606j.mo10904N(interfaceC4233mMo10918c0);
                EnumC4242v enumC4242v = EnumC4242v.f12418t;
                InterfaceC4229i interfaceC4229iMo10903M2 = interfaceC4238rM9606j.mo10903M(interfaceC4233mMo10918c0);
                interfaceC4229iMo10903M2.getClass();
                C2664g c2664g = f6996a;
                EnumC4242v enumC4242vM9416l = c2664g.m9416l(interfaceC4238rM9606j.mo10909T(interfaceC4238rM9606j.mo10946u0(interfaceC4236pMo10763e, i10)), interfaceC4238rM9606j.mo10904N(interfaceC4233mMo10912W));
                if (enumC4242vM9416l == null) {
                    return c2713t12.m9610n();
                }
                if (enumC4242vM9416l != enumC4242v || (!c2664g.m9427z(interfaceC4238rM9606j, interfaceC4229iMo10903M2, interfaceC4229iMo10903M, interfaceC4236pMo10763e) && !c2664g.m9427z(interfaceC4238rM9606j, interfaceC4229iMo10903M, interfaceC4229iMo10903M2, interfaceC4236pMo10763e))) {
                    if (c2713t12.f7091h > 100) {
                        C8897d.m34134a("Arguments depth is too high. Some related argument: ", interfaceC4229iMo10903M2);
                        return false;
                    }
                    c2713t12.f7091h++;
                    int i11 = a.f6998a[enumC4242vM9416l.ordinal()];
                    if (i11 == 1) {
                        zM9417m = c2664g.m9417m(c2713t12, interfaceC4229iMo10903M2, interfaceC4229iMo10903M);
                    } else if (i11 == 2) {
                        c2713t12 = c2713t1;
                        zM9417m = m9407v(c2664g, c2713t12, interfaceC4229iMo10903M2, interfaceC4229iMo10903M, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            C5729x.m23182a();
                            return false;
                        }
                        zM9417m = m9407v(c2664g, c2713t12, interfaceC4229iMo10903M, interfaceC4229iMo10903M2, false, 8, null);
                        c2713t12 = c2713t1;
                    }
                    c2713t12.f7091h--;
                    if (!zM9417m) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m9424t(C2713t1 c2713t1, InterfaceC4229i interfaceC4229i, InterfaceC4229i interfaceC4229i2) {
        c2713t1.getClass();
        interfaceC4229i.getClass();
        interfaceC4229i2.getClass();
        return m9407v(this, c2713t1, interfaceC4229i, interfaceC4229i2, false, 8, null);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m9425u(C2713t1 c2713t1, InterfaceC4229i interfaceC4229i, InterfaceC4229i interfaceC4229i2, boolean z10) {
        c2713t1.getClass();
        interfaceC4229i.getClass();
        interfaceC4229i2.getClass();
        if (interfaceC4229i == interfaceC4229i2) {
            return true;
        }
        if (c2713t1.mo9602f(interfaceC4229i, interfaceC4229i2)) {
            return m9415k(c2713t1, interfaceC4229i, interfaceC4229i2, z10);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m9426w(gb.C2713t1 r18, p160kb.InterfaceC4230j r19, p160kb.InterfaceC4230j r20) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.C2664g.m9426w(gb.t1, kb.j, kb.j):boolean");
    }

    /* JADX INFO: renamed from: z */
    public final boolean m9427z(InterfaceC4238r interfaceC4238r, InterfaceC4229i interfaceC4229i, InterfaceC4229i interfaceC4229i2, InterfaceC4236p interfaceC4236p) {
        InterfaceC4230j interfaceC4230jMo10764f = interfaceC4238r.mo10764f(interfaceC4229i);
        if (interfaceC4230jMo10764f instanceof InterfaceC4224d) {
            InterfaceC4224d interfaceC4224d = (InterfaceC4224d) interfaceC4230jMo10764f;
            if (interfaceC4238r.mo10928k0(interfaceC4224d) || !interfaceC4238r.mo10766h(interfaceC4238r.mo10932n(interfaceC4238r.mo10948v0(interfaceC4224d))) || interfaceC4238r.mo10930m(interfaceC4224d) != EnumC4222b.f12410q) {
                return false;
            }
            interfaceC4238r.mo10897I(interfaceC4229i2);
        }
        return false;
    }
}
