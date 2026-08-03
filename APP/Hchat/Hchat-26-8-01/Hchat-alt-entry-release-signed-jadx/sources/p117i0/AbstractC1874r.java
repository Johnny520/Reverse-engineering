package p117i0;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p015b0.C0154t;
import p020b5.C0184c;
import p023b8.C0205c;
import p070f0.C0970b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p116i.C1738b1;
import p131j0.C2046b;
import p136j8.C2104o;
import p159l0.C2420b;
import p159l0.C2425g;
import p159l0.C2429k;
import p174m.C2571a;
import p175m0.C2685b0;
import p175m0.C2705l0;
import p249qg.InterfaceC3599t;
import p266s0.C3874d;
import p266s0.C3877g;
import p266s0.C3878h;
import p276sf.C3967n;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: i0.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1874r {

    /* JADX INFO: renamed from: a */
    public static final Object f6231a = new Object();

    /* JADX INFO: renamed from: b */
    public static final C1808a0 f6232b = new C1808a0();

    /* JADX INFO: renamed from: c */
    public static final C0205c f6233c = new C0205c(3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final void m4615A(InterfaceC1235p interfaceC1235p, C1836h0 c1836h0, Object obj) {
        if (c1836h0.f6094S || !AbstractC1416l.m3825a(c1836h0.m4514P(), obj)) {
            c1836h0.m4545k0(obj);
            c1836h0.m4526b(interfaceC1235p, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final C2571a m4616B(InterfaceC1220a interfaceC1220a) {
        return new C2571a(new C0970b(interfaceC1220a, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final int m4617C(int i9) {
        int i10 = 306783378 & i9;
        int i11 = 613566756 & i9;
        return (i9 & (-920350135)) | (i11 >> 1) | i10 | ((i10 << 1) & i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final C3878h m4618D(C1873q1[] c1873q1Arr, C3878h c3878h, C3878h c3878h2) {
        C3877g c3877g = new C3877g(C3878h.f12733j);
        for (C1873q1 c1873q1 : c1873q1Arr) {
            AbstractC1869p1 abstractC1869p1 = c1873q1.f6225a;
            if (c1873q1.f6230f || !c3878h.containsKey(abstractC1869p1)) {
                c3877g.put(abstractC1869p1, abstractC1869p1.m4586c(c1873q1, (InterfaceC1870p2) c3878h2.get(abstractC1869p1)));
            }
        }
        return c3877g.m8061a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4619a(C1873q1 c1873q1, C3874d c3874d, C1836h0 c1836h0, int i9) {
        InterfaceC1870p2 interfaceC1870p2;
        boolean z9;
        C1876r1 c1876r1M4557t;
        c1836h0.m4527b0(-149765515);
        C1856m0 c1856m0 = c1836h0.f6120x;
        C3878h c3878hM4546l = c1836h0.m4546l();
        c1836h0.m4522Y(201, AbstractC1855m.f6170b);
        Object objM4514P = c1836h0.m4514P();
        if (AbstractC1416l.m3825a(objM4514P, C1851l.f6155a)) {
            interfaceC1870p2 = null;
        } else {
            objM4514P.getClass();
            interfaceC1870p2 = (InterfaceC1870p2) objM4514P;
        }
        AbstractC1869p1 abstractC1869p1 = c1873q1.f6225a;
        InterfaceC1870p2 interfaceC1870p2M4586c = abstractC1869p1.m4586c(c1873q1, interfaceC1870p2);
        boolean zEquals = interfaceC1870p2M4586c.equals(interfaceC1870p2);
        if (!zEquals) {
            c1836h0.m4545k0(interfaceC1870p2M4586c);
        }
        if (!c1836h0.f6094S) {
            C2425g c2425g = c1836h0.f6082G;
            Object objM5761b = c2425g.m5761b(c2425g.f7936b, c2425g.f7941g);
            objM5761b.getClass();
            C3878h c3878h = (C3878h) objM5761b;
            if (!(c1836h0.m4503E() && zEquals) && (c1873q1.f6230f || !c3878hM4546l.containsKey(abstractC1869p1))) {
                c3878hM4546l = c3878hM4546l.m8066c(abstractC1869p1, interfaceC1870p2M4586c);
            } else if ((zEquals && !c1836h0.f6119w) || !c1836h0.f6119w) {
                c3878hM4546l = c3878h;
            }
            if (c1836h0.f6121y || c3878h != c3878hM4546l) {
                z9 = true;
            }
            if (z9 && !c1836h0.f6094S) {
                c1836h0.m4512N(c3878hM4546l);
            }
            c1856m0.m4577c(c1836h0.f6119w ? 1 : 0);
            c1836h0.f6119w = z9;
            c1836h0.f6086K = c3878hM4546l;
            c1836h0.m4520W(202, AbstractC1855m.f6171c, c3878hM4546l, 0);
            c3874d.invoke(c1836h0, Integer.valueOf((i9 >> 3) & 14));
            c1836h0.m4553p(false);
            c1836h0.m4553p(false);
            c1836h0.f6119w = c1856m0.m4576b() != 0;
            c1836h0.f6086K = null;
            c1876r1M4557t = c1836h0.m4557t();
            if (c1876r1M4557t == null) {
                c1876r1M4557t.f6241d = new C1738b1(c1873q1, c3874d, i9, 1);
                return;
            }
            return;
        }
        if (c1873q1.f6230f || !c3878hM4546l.containsKey(abstractC1869p1)) {
            c3878hM4546l = c3878hM4546l.m8066c(abstractC1869p1, interfaceC1870p2M4586c);
        }
        c1836h0.f6085J = true;
        z9 = false;
        if (z9) {
            c1836h0.m4512N(c3878hM4546l);
        }
        c1856m0.m4577c(c1836h0.f6119w ? 1 : 0);
        c1836h0.f6119w = z9;
        c1836h0.f6086K = c3878hM4546l;
        c1836h0.m4520W(202, AbstractC1855m.f6171c, c3878hM4546l, 0);
        c3874d.invoke(c1836h0, Integer.valueOf((i9 >> 3) & 14));
        c1836h0.m4553p(false);
        c1836h0.m4553p(false);
        c1836h0.f6119w = c1856m0.m4576b() != 0;
        c1836h0.f6086K = null;
        c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4620b(C1873q1[] c1873q1Arr, InterfaceC1235p interfaceC1235p, C1836h0 c1836h0, int i9) {
        C3878h c3878hM4543j0;
        boolean z9;
        C1876r1 c1876r1M4557t;
        c1836h0.m4527b0(415205898);
        C1856m0 c1856m0 = c1836h0.f6120x;
        C3878h c3878hM4546l = c1836h0.m4546l();
        c1836h0.m4522Y(201, AbstractC1855m.f6170b);
        if (c1836h0.f6094S) {
            c3878hM4543j0 = c1836h0.m4543j0(c3878hM4546l, m4618D(c1873q1Arr, c3878hM4546l, C3878h.f12733j));
            c1836h0.f6085J = true;
        } else {
            C2425g c2425g = c1836h0.f6082G;
            Object objM5767h = c2425g.m5767h(c2425g.f7941g, 0);
            objM5767h.getClass();
            C3878h c3878h = (C3878h) objM5767h;
            C2425g c2425g2 = c1836h0.f6082G;
            Object objM5767h2 = c2425g2.m5767h(c2425g2.f7941g, 1);
            objM5767h2.getClass();
            C3878h c3878h2 = (C3878h) objM5767h2;
            C3878h c3878hM4618D = m4618D(c1873q1Arr, c3878hM4546l, c3878h2);
            if (!c1836h0.m4503E() || c1836h0.f6121y || !c3878h2.equals(c3878hM4618D)) {
                c3878hM4543j0 = c1836h0.m4543j0(c3878hM4546l, c3878hM4618D);
                if (c1836h0.f6121y || !AbstractC1416l.m3825a(c3878hM4543j0, c3878h)) {
                    z9 = true;
                }
                if (z9 && !c1836h0.f6094S) {
                    c1836h0.m4512N(c3878hM4543j0);
                }
                c1856m0.m4577c(c1836h0.f6119w ? 1 : 0);
                c1836h0.f6119w = z9;
                c1836h0.f6086K = c3878hM4543j0;
                c1836h0.m4520W(202, AbstractC1855m.f6171c, c3878hM4543j0, 0);
                interfaceC1235p.invoke(c1836h0, Integer.valueOf((i9 >> 3) & 14));
                c1836h0.m4553p(false);
                c1836h0.m4553p(false);
                c1836h0.f6119w = c1856m0.m4576b() != 0;
                c1836h0.f6086K = null;
                c1876r1M4557t = c1836h0.m4557t();
                if (c1876r1M4557t == null) {
                    c1876r1M4557t.f6241d = new C1738b1(c1873q1Arr, interfaceC1235p, i9, 2);
                    return;
                }
                return;
            }
            c1836h0.f6108l = c1836h0.f6082G.m5778s() + c1836h0.f6108l;
            c3878hM4543j0 = c3878h;
        }
        z9 = false;
        if (z9) {
            c1836h0.m4512N(c3878hM4543j0);
        }
        c1856m0.m4577c(c1836h0.f6119w ? 1 : 0);
        c1836h0.f6119w = z9;
        c1836h0.f6086K = c3878hM4543j0;
        c1836h0.m4520W(202, AbstractC1855m.f6171c, c3878hM4543j0, 0);
        interfaceC1235p.invoke(c1836h0, Integer.valueOf((i9 >> 3) & 14));
        c1836h0.m4553p(false);
        c1836h0.m4553p(false);
        c1836h0.f6119w = c1856m0.m4576b() != 0;
        c1836h0.f6086K = null;
        c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m4621c(Object obj, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0) {
        boolean zM4534f = c1836h0.m4534f(obj);
        Object objM4514P = c1836h0.m4514P();
        if (zM4534f || objM4514P == C1851l.f6155a) {
            objM4514P = new C1895y(interfaceC1231l);
            c1836h0.m4545k0(objM4514P);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m4622d(Object obj, Object obj2, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0) {
        boolean zM4534f = c1836h0.m4534f(obj) | c1836h0.m4534f(obj2);
        Object objM4514P = c1836h0.m4514P();
        if (zM4534f || objM4514P == C1851l.f6155a) {
            objM4514P = new C1895y(interfaceC1231l);
            c1836h0.m4545k0(objM4514P);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m4623e(Object[] objArr, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0) {
        boolean zM4534f = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zM4534f |= c1836h0.m4534f(obj);
        }
        Object objM4514P = c1836h0.m4514P();
        if (zM4534f || objM4514P == C1851l.f6155a) {
            c1836h0.m4545k0(new C1895y(interfaceC1231l));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m4624f(InterfaceC1235p interfaceC1235p, C1836h0 c1836h0, Object obj) {
        InterfaceC5561g interfaceC5561g = c1836h0.f6093R;
        boolean zM4534f = c1836h0.m4534f(obj);
        Object objM4514P = c1836h0.m4514P();
        if (zM4534f || objM4514P == C1851l.f6155a) {
            objM4514P = new C1875r0(interfaceC5561g, interfaceC1235p);
            c1836h0.m4545k0(objM4514P);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m4625g(Object obj, Object obj2, InterfaceC1235p interfaceC1235p, C1836h0 c1836h0) {
        InterfaceC5561g interfaceC5561g = c1836h0.f6093R;
        boolean zM4534f = c1836h0.m4534f(obj) | c1836h0.m4534f(obj2);
        Object objM4514P = c1836h0.m4514P();
        if (zM4534f || objM4514P == C1851l.f6155a) {
            objM4514P = new C1875r0(interfaceC5561g, interfaceC1235p);
            c1836h0.m4545k0(objM4514P);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final void m4626h(Object obj, Object obj2, Object obj3, InterfaceC1235p interfaceC1235p, C1836h0 c1836h0) {
        InterfaceC5561g interfaceC5561g = c1836h0.f6093R;
        boolean zM4534f = c1836h0.m4534f(obj) | c1836h0.m4534f(obj2) | c1836h0.m4534f(obj3);
        Object objM4514P = c1836h0.m4514P();
        if (zM4534f || objM4514P == C1851l.f6155a) {
            objM4514P = new C1875r0(interfaceC5561g, interfaceC1235p);
            c1836h0.m4545k0(objM4514P);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final void m4627i(Object[] objArr, InterfaceC1235p interfaceC1235p, C1836h0 c1836h0) {
        InterfaceC5561g interfaceC5561g = c1836h0.f6093R;
        boolean zM4534f = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zM4534f |= c1836h0.m4534f(obj);
        }
        Object objM4514P = c1836h0.m4514P();
        if (zM4534f || objM4514P == C1851l.f6155a) {
            c1836h0.m4545k0(new C1875r0(interfaceC5561g, interfaceC1235p));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final void m4628j(InterfaceC1220a interfaceC1220a, C1836h0 c1836h0) {
        C2705l0 c2705l0 = c1836h0.f6088M.f8742b.f8739j;
        c2705l0.m6136U(C2685b0.f8753c);
        AbstractC1089i.m2727F0(c2705l0, 0, interfaceC1220a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final void m4629k(List list, int i9, int i10) {
        int iM4635q = m4635q(i9, list);
        if (iM4635q < 0) {
            iM4635q = -(iM4635q + 1);
        }
        while (iM4635q < list.size() && ((C1860n0) list.get(iM4635q)).f6185b < i10) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m4630l(C2429k c2429k, List list, C1871q c1871q) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            int iM5818c = c2429k.m5818c((C2420b) list.get(i9));
            int iM5808N = c2429k.m5808N(c2429k.f7964b, c2429k.m5832r(iM5818c));
            Object obj = iM5808N < c2429k.m5822g(c2429k.f7964b, c2429k.m5832r(iM5818c + 1)) ? c2429k.f7965c[c2429k.m5823h(iM5808N)] : C1851l.f6155a;
            C1876r1 c1876r1 = obj instanceof C1876r1 ? (C1876r1) obj : null;
            if (c1876r1 != null) {
                c1876r1.f6238a = c1871q;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final void m4631m(C2425g c2425g, ArrayList arrayList, int i9) {
        boolean zM5771l = c2425g.m5771l(i9);
        int[] iArr = c2425g.f7936b;
        if (zM5771l) {
            arrayList.add(c2425g.m5773n(i9));
            return;
        }
        int i10 = iArr[(i9 * 5) + 3] + i9;
        for (int i11 = i9 + 1; i11 < i10; i11 += iArr[(i11 * 5) + 3]) {
            m4631m(c2425g, arrayList, i11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC3599t m4632n(C1836h0 c1836h0) {
        return new C1818c2(c1836h0.f6093R);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final C2046b m4633o() {
        C0184c c0184c = AbstractC1850k2.f6154b;
        C2046b c2046b = (C2046b) c0184c.m818o();
        if (c2046b != null) {
            return c2046b;
        }
        C2046b c2046b2 = new C2046b(new C1832g0[0]);
        c0184c.m797O(c2046b2);
        return c2046b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final C1892x m4634p(InterfaceC1220a interfaceC1220a) {
        C0184c c0184c = AbstractC1850k2.f6153a;
        return new C1892x(interfaceC1220a, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final int m4635q(int i9, List list) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iM3827c = AbstractC1416l.m3827c(((C1860n0) list.get(i11)).f6185b, i9);
            if (iM3827c < 0) {
                i10 = i11 + 1;
            } else {
                if (iM3827c <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final long m4636r(C1836h0 c1836h0) {
        return c1836h0.f6095T;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final C1819d m4637s(InterfaceC5561g interfaceC5561g) {
        C1819d c1819d = (C1819d) interfaceC5561g.mo2062s(C1823e.f6048i);
        if (c1819d != null) {
            return c1819d;
        }
        C2104o.m5276A("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final void m4638t(C1836h0 c1836h0, Integer num, InterfaceC1235p interfaceC1235p) {
        if (c1836h0.f6094S) {
            c1836h0.m4526b(interfaceC1235p, num);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static C1845j1 m4639u(Object obj) {
        return new C1845j1(obj, C1823e.f6052m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final Object m4640v(C3878h c3878h, AbstractC1869p1 abstractC1869p1) {
        abstractC1869p1.getClass();
        Object objMo4585b = c3878h.get(abstractC1869p1);
        if (objMo4585b == null) {
            objMo4585b = abstractC1869p1.mo4585b();
        }
        return ((InterfaceC1870p2) objMo4585b).mo4454a(c3878h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final void m4641w(InterfaceC1231l interfaceC1231l, C1836h0 c1836h0) {
        c1836h0.m4526b(new C0154t(interfaceC1231l, 13), C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final C1828f0 m4642x(C1836h0 c1836h0) {
        C1836h0 c1836h02;
        c1836h0.m4522Y(206, AbstractC1855m.f6173e);
        if (c1836h0.f6094S) {
            C2429k.m5794z(c1836h0.f6084I);
        }
        Object objM4506H = c1836h0.m4506H();
        C1848k0 c1822d2 = objM4506H instanceof C1848k0 ? (C1848k0) objM4506H : null;
        if (c1822d2 == null) {
            c1836h02 = c1836h0;
            c1822d2 = new C1822d2(new C1824e0(new C1828f0(c1836h02, c1836h0.f6095T, c1836h0.f6113q, c1836h0.f6078C, c1836h0.f6104h.f6221z)), -1);
            c1836h02.m4547l0(c1822d2);
        } else {
            c1836h02 = c1836h0;
        }
        InterfaceC1810a2 interfaceC1810a2 = c1822d2.f6147a;
        interfaceC1810a2.getClass();
        C1828f0 c1828f0 = ((C1824e0) interfaceC1810a2).f6054g;
        c1828f0.f6061f.setValue(c1836h02.m4546l());
        c1836h02.m4553p(false);
        return c1828f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final InterfaceC1809a1 m4643y(Object obj, C1836h0 c1836h0) {
        Object objM4514P = c1836h0.m4514P();
        if (objM4514P == C1851l.f6155a) {
            objM4514P = m4639u(obj);
            c1836h0.m4545k0(objM4514P);
        }
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
        interfaceC1809a1.setValue(obj);
        return interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final void m4644z(C2429k c2429k, int i9, Object obj) {
        int iM5823h = c2429k.m5823h(i9);
        Object[] objArr = c2429k.f7965c;
        Object obj2 = objArr[iM5823h];
        objArr[iM5823h] = C1851l.f6155a;
        if (obj == obj2) {
            return;
        }
        AbstractC1855m.m4573a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
