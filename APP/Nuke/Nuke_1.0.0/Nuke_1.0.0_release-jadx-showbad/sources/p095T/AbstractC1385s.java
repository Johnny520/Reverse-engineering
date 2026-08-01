package p095T;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000A.C0002B;
import p000A.C0072l0;
import p041H0.C0549A;
import p041H0.C0619t;
import p047I0.C0711a0;
import p056K2.C0891q;
import p061L2.AbstractC0972l;
import p061L2.C0981u;
import p074O2.InterfaceC1051i;
import p100U.C1429B;
import p100U.C1439L;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p136b0.C1843e;
import p136b0.C1846h;
import p136b0.C1847i;
import p160f3.InterfaceC2160t;
import p186k.C2438t;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: T.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1385s {

    /* JADX INFO: renamed from: a */
    public static final C0549A f4911a = new C0549A(1);

    /* JADX INFO: renamed from: b */
    public static final Object f4912b = new Object();

    /* JADX INFO: renamed from: c */
    public static final C1317I f4913c = new C1317I();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final int m2609A(int i5) {
        int i6 = 306783378 & i5;
        int i7 = 613566756 & i5;
        return (i5 & (-920350135)) | (i7 >> 1) | i6 | ((i6 << 1) & i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final C1847i m2610B(C1386s0[] c1386s0Arr, InterfaceC1378o0 interfaceC1378o0, InterfaceC1378o0 interfaceC1378o02) {
        C1846h c1846h = new C1846h(C1847i.f6255g);
        for (C1386s0 c1386s0 : c1386s0Arr) {
            AbstractC1384r0 abstractC1384r0 = c1386s0.f4914a;
            if (c1386s0.f4919f || !((C1847i) interfaceC1378o0).containsKey(abstractC1384r0)) {
                c1846h.put(abstractC1384r0, abstractC1384r0.m2608c(c1386s0, (InterfaceC1345W0) ((C1847i) interfaceC1378o02).get(abstractC1384r0)));
            }
        }
        return c1846h.m3306a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
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
    public static final void m2611a(C1386s0 c1386s0, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        InterfaceC1345W0 interfaceC1345W0;
        boolean z5;
        C1388t0 c1388t0M2599r;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-149765515);
        C0619t c0619t = c1383r.f4907x;
        InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
        c1383r.m2566U(201, AbstractC1387t.f4921b);
        Object objM2558L = c1383r.m2558L();
        if (AbstractC1665j.m2981a(objM2558L, C1371l.f4833a)) {
            interfaceC1345W0 = null;
        } else {
            AbstractC1665j.m2983c(objM2558L, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            interfaceC1345W0 = (InterfaceC1345W0) objM2558L;
        }
        AbstractC1384r0 abstractC1384r0 = c1386s0.f4914a;
        InterfaceC1345W0 interfaceC1345W0M2608c = abstractC1384r0.m2608c(c1386s0, interfaceC1345W0);
        boolean zEquals = interfaceC1345W0M2608c.equals(interfaceC1345W0);
        if (!zEquals) {
            c1383r.m2585g0(interfaceC1345W0M2608c);
        }
        if (!c1383r.f4881S) {
            C1316H0 c1316h0 = c1383r.f4869G;
            Object objM2416b = c1316h0.m2416b(c1316h0.f4692b, c1316h0.f4697g);
            AbstractC1665j.m2983c(objM2416b, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1378o0 interfaceC1378o0 = (InterfaceC1378o0) objM2416b;
            if (!(c1383r.m2547A() && zEquals) && (c1386s0.f4919f || !((C1847i) interfaceC1378o0M2593l).containsKey(abstractC1384r0))) {
                interfaceC1378o0M2593l = ((C1847i) interfaceC1378o0M2593l).m3311b(abstractC1384r0, interfaceC1345W0M2608c);
            } else if ((zEquals && !c1383r.f4906w) || !c1383r.f4906w) {
                interfaceC1378o0M2593l = interfaceC1378o0;
            }
            if (c1383r.f4908y || interfaceC1378o0 != interfaceC1378o0M2593l) {
                z5 = true;
            }
            if (z5 && !c1383r.f4881S) {
                c1383r.m2556J(interfaceC1378o0M2593l);
            }
            c0619t.m1059c(c1383r.f4906w ? 1 : 0);
            c1383r.f4906w = z5;
            c1383r.f4873K = interfaceC1378o0M2593l;
            c1383r.m2564S(202, 0, AbstractC1387t.f4922c, interfaceC1378o0M2593l);
            c1843e.mo0g(c1383r, Integer.valueOf((i5 >> 3) & 14));
            c1383r.m2597p(false);
            c1383r.m2597p(false);
            c1383r.f4906w = c0619t.m1058b() != 0;
            c1383r.f4873K = null;
            c1388t0M2599r = c1383r.m2599r();
            if (c1388t0M2599r == null) {
                c1388t0M2599r.f4928d = new C1399z(i5, 0, c1386s0, c1843e);
                return;
            }
            return;
        }
        if (c1386s0.f4919f || !((C1847i) interfaceC1378o0M2593l).containsKey(abstractC1384r0)) {
            interfaceC1378o0M2593l = ((C1847i) interfaceC1378o0M2593l).m3311b(abstractC1384r0, interfaceC1345W0M2608c);
        }
        c1383r.f4872J = true;
        z5 = false;
        if (z5) {
            c1383r.m2556J(interfaceC1378o0M2593l);
        }
        c0619t.m1059c(c1383r.f4906w ? 1 : 0);
        c1383r.f4906w = z5;
        c1383r.f4873K = interfaceC1378o0M2593l;
        c1383r.m2564S(202, 0, AbstractC1387t.f4922c, interfaceC1378o0M2593l);
        c1843e.mo0g(c1383r, Integer.valueOf((i5 >> 3) & 14));
        c1383r.m2597p(false);
        c1383r.m2597p(false);
        c1383r.f4906w = c0619t.m1058b() != 0;
        c1383r.f4873K = null;
        c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
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
    public static final void m2612b(C1386s0[] c1386s0Arr, InterfaceC1603e interfaceC1603e, InterfaceC1373m interfaceC1373m, int i5) {
        InterfaceC1378o0 interfaceC1378o0M2583f0;
        boolean z5;
        C1388t0 c1388t0M2599r;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(415205898);
        C0619t c0619t = c1383r.f4907x;
        InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
        c1383r.m2566U(201, AbstractC1387t.f4921b);
        if (c1383r.f4881S) {
            interfaceC1378o0M2583f0 = c1383r.m2583f0(interfaceC1378o0M2593l, m2610B(c1386s0Arr, interfaceC1378o0M2593l, C1847i.f6255g));
            c1383r.f4872J = true;
        } else {
            C1316H0 c1316h0 = c1383r.f4869G;
            Object objM2422h = c1316h0.m2422h(c1316h0.f4697g, 0);
            AbstractC1665j.m2983c(objM2422h, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1378o0 interfaceC1378o0 = (InterfaceC1378o0) objM2422h;
            C1316H0 c1316h02 = c1383r.f4869G;
            Object objM2422h2 = c1316h02.m2422h(c1316h02.f4697g, 1);
            AbstractC1665j.m2983c(objM2422h2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1378o0 interfaceC1378o02 = (InterfaceC1378o0) objM2422h2;
            C1847i c1847iM2610B = m2610B(c1386s0Arr, interfaceC1378o0M2593l, interfaceC1378o02);
            if (!c1383r.m2547A() || c1383r.f4908y || !interfaceC1378o02.equals(c1847iM2610B)) {
                interfaceC1378o0M2583f0 = c1383r.m2583f0(interfaceC1378o0M2593l, c1847iM2610B);
                if (c1383r.f4908y || !AbstractC1665j.m2981a(interfaceC1378o0M2583f0, interfaceC1378o0)) {
                    z5 = true;
                }
                if (z5 && !c1383r.f4881S) {
                    c1383r.m2556J(interfaceC1378o0M2583f0);
                }
                c0619t.m1059c(c1383r.f4906w ? 1 : 0);
                c1383r.f4906w = z5;
                c1383r.f4873K = interfaceC1378o0M2583f0;
                c1383r.m2564S(202, 0, AbstractC1387t.f4922c, interfaceC1378o0M2583f0);
                interfaceC1603e.mo0g(c1383r, Integer.valueOf((i5 >> 3) & 14));
                c1383r.m2597p(false);
                c1383r.m2597p(false);
                c1383r.f4906w = c0619t.m1058b() != 0;
                c1383r.f4873K = null;
                c1388t0M2599r = c1383r.m2599r();
                if (c1388t0M2599r == null) {
                    c1388t0M2599r.f4928d = new C1399z(i5, 1, c1386s0Arr, interfaceC1603e);
                    return;
                }
                return;
            }
            c1383r.f4895l = c1383r.f4869G.m2433s() + c1383r.f4895l;
            interfaceC1378o0M2583f0 = interfaceC1378o0;
        }
        z5 = false;
        if (z5) {
            c1383r.m2556J(interfaceC1378o0M2583f0);
        }
        c0619t.m1059c(c1383r.f4906w ? 1 : 0);
        c1383r.f4906w = z5;
        c1383r.f4873K = interfaceC1378o0M2583f0;
        c1383r.m2564S(202, 0, AbstractC1387t.f4922c, interfaceC1378o0M2583f0);
        interfaceC1603e.mo0g(c1383r, Integer.valueOf((i5 >> 3) & 14));
        c1383r.m2597p(false);
        c1383r.m2597p(false);
        c1383r.f4906w = c0619t.m1058b() != 0;
        c1383r.f4873K = null;
        c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m2613c(Object obj, InterfaceC1601c interfaceC1601c, InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        boolean zM2582f = c1383r.m2582f(obj);
        Object objM2558L = c1383r.m2558L();
        if (zM2582f || objM2558L == C1371l.f4833a) {
            objM2558L = new C1313G(interfaceC1601c);
            c1383r.m2585g0(objM2558L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m2614d(Object obj, Object obj2, InterfaceC1601c interfaceC1601c, InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        boolean zM2582f = c1383r.m2582f(obj) | c1383r.m2582f(obj2);
        Object objM2558L = c1383r.m2558L();
        if (zM2582f || objM2558L == C1371l.f4833a) {
            objM2558L = new C1313G(interfaceC1601c);
            c1383r.m2585g0(objM2558L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m2615e(InterfaceC1373m interfaceC1373m, InterfaceC1603e interfaceC1603e, Object obj) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        InterfaceC1051i interfaceC1051i = c1383r.f4880R;
        boolean zM2582f = c1383r.m2582f(obj);
        Object objM2558L = c1383r.m2558L();
        if (zM2582f || objM2558L == C1371l.f4833a) {
            objM2558L = new C1338T(interfaceC1051i, interfaceC1603e);
            c1383r.m2585g0(objM2558L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m2616f(Object obj, Object obj2, InterfaceC1603e interfaceC1603e, InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        InterfaceC1051i interfaceC1051i = c1383r.f4880R;
        boolean zM2582f = c1383r.m2582f(obj) | c1383r.m2582f(obj2);
        Object objM2558L = c1383r.m2558L();
        if (zM2582f || objM2558L == C1371l.f4833a) {
            objM2558L = new C1338T(interfaceC1051i, interfaceC1603e);
            c1383r.m2585g0(objM2558L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m2617g(InterfaceC1599a interfaceC1599a, InterfaceC1373m interfaceC1373m) {
        C1439L c1439l = ((C1383r) interfaceC1373m).f4875M.f5104b.f5102h;
        c1439l.m2728z(C1429B.f5086c);
        AbstractC1784a.m3202P(c1439l, 0, interfaceC1599a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final void m2618h(List list, int i5, int i6) {
        int iM2625o = m2625o(i5, list);
        if (iM2625o < 0) {
            iM2625o = -(iM2625o + 1);
        }
        while (iM2625o < list.size() && ((C1329O) list.get(iM2625o)).f4755b < i6) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final void m2619i(C2438t c2438t, int i5) {
        if (c2438t.f7878b == 0 || !(c2438t.m4336c(0) == i5 || c2438t.m4336c(c2438t.f7878b - 1) == i5)) {
            int i6 = c2438t.f7878b;
            c2438t.m4334a(i5);
            while (i6 > 0) {
                int i7 = ((i6 + 1) >>> 1) - 1;
                int iM4336c = c2438t.m4336c(i7);
                if (i5 <= iM4336c) {
                    break;
                }
                c2438t.m4338e(i6, iM4336c);
                i6 = i7;
            }
            c2438t.m4338e(i6, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m2620j(C1324L0 c1324l0, List list, C1397y c1397y) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int iM2473c = c1324l0.m2473c((C1349a) list.get(i5));
            int iM2463N = c1324l0.m2463N(c1324l0.f4724b, c1324l0.m2487r(iM2473c));
            Object obj = iM2463N < c1324l0.m2477g(c1324l0.f4724b, c1324l0.m2487r(iM2473c + 1)) ? c1324l0.f4725c[c1324l0.m2478h(iM2463N)] : C1371l.f4833a;
            C1388t0 c1388t0 = obj instanceof C1388t0 ? (C1388t0) obj : null;
            if (c1388t0 != null) {
                c1388t0.f4925a = c1397y;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final void m2621k(C1316H0 c1316h0, ArrayList arrayList, int i5) {
        boolean zM2426l = c1316h0.m2426l(i5);
        int[] iArr = c1316h0.f4692b;
        if (zM2426l) {
            arrayList.add(c1316h0.m2428n(i5));
            return;
        }
        int i6 = iArr[(i5 * 5) + 3] + i5;
        for (int i7 = i5 + 1; i7 < i6; i7 += iArr[(i7 * 5) + 3]) {
            m2621k(c1316h0, arrayList, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC2160t m2622l(InterfaceC1373m interfaceC1373m) {
        return new C1312F0(((C1383r) interfaceC1373m).f4880R);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final C1483e m2623m() {
        C0072l0 c0072l0 = AbstractC1335R0.f4767b;
        C1483e c1483e = (C1483e) c0072l0.m105i();
        if (c1483e != null) {
            return c1483e;
        }
        C1483e c1483e2 = new C1483e(new C1381q[0]);
        c0072l0.m115u(c1483e2);
        return c1483e2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final C1311F m2624n(InterfaceC1599a interfaceC1599a) {
        C0072l0 c0072l0 = AbstractC1335R0.f4766a;
        return new C1311F(interfaceC1599a, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final int m2625o(int i5, List list) {
        int size = list.size() - 1;
        int i6 = 0;
        while (i6 <= size) {
            int i7 = (i6 + size) >>> 1;
            int iM2987g = AbstractC1665j.m2987g(((C1329O) list.get(i7)).f4755b, i5);
            if (iM2987g < 0) {
                i6 = i7 + 1;
            } else {
                if (iM2987g <= 0) {
                    return i7;
                }
                size = i7 - 1;
            }
        }
        return -(i6 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final C0711a0 m2626p(InterfaceC1051i interfaceC1051i) {
        C0711a0 c0711a0 = (C0711a0) interfaceC1051i.mo1166C(C1357e.f4794f);
        if (c0711a0 != null) {
            return c0711a0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m2627q(InterfaceC1373m interfaceC1373m, Integer num, InterfaceC1603e interfaceC1603e) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        if (c1383r.f4881S) {
            c1383r.m2574b(interfaceC1603e, num);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static List m2628r(C1324L0 c1324l0, int i5, C1324L0 c1324l02, boolean z5, boolean z6, boolean z7) {
        List list;
        boolean z8;
        int i6;
        int i7;
        int iM2490u = c1324l0.m2490u(i5);
        int i8 = i5 + iM2490u;
        int iM2476f = c1324l0.m2476f(i5);
        int iM2476f2 = c1324l0.m2476f(i8);
        int i9 = iM2476f2 - iM2476f;
        boolean z9 = i5 >= 0 && (c1324l0.f4724b[(c1324l0.m2487r(i5) * 5) + 1] & 201326592) != 0;
        c1324l02.m2492w(iM2490u);
        c1324l02.m2493x(i9, c1324l02.f4742t);
        if (c1324l0.f4729g < i8) {
            c1324l0.m2451B(i8);
        }
        if (c1324l0.f4733k < iM2476f2) {
            c1324l0.m2452C(iM2476f2, i8);
        }
        int[] iArr = c1324l02.f4724b;
        int i10 = c1324l02.f4742t;
        int i11 = i10 * 5;
        AbstractC0972l.m1991O(c1324l0.f4724b, iArr, i11, i5 * 5, i8 * 5);
        Object[] objArr = c1324l02.f4725c;
        int i12 = c1324l02.f4731i;
        System.arraycopy(c1324l0.f4725c, iM2476f, objArr, i12, i9);
        int i13 = c1324l02.f4744v;
        iArr[i11 + 2] = i13;
        int i14 = i10 - i5;
        int i15 = i10 + iM2490u;
        int iM2477g = i12 - c1324l02.m2477g(iArr, i10);
        int i16 = c1324l02.f4735m;
        int i17 = c1324l02.f4734l;
        int length = objArr.length;
        boolean z10 = z9;
        int i18 = i16;
        int i19 = i10;
        while (i19 < i15) {
            if (i19 != i10) {
                int i20 = (i19 * 5) + 2;
                iArr[i20] = iArr[i20] + i14;
            }
            int[] iArr2 = iArr;
            int iM2477g2 = c1324l02.m2477g(iArr, i19) + iM2477g;
            if (i18 < i19) {
                i6 = i10;
                i7 = 0;
            } else {
                i6 = i10;
                i7 = c1324l02.f4733k;
            }
            iArr2[(i19 * 5) + 4] = C1324L0.m2448i(iM2477g2, i7, i17, length);
            if (i19 == i18) {
                i18++;
            }
            i19++;
            i10 = i6;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        c1324l02.f4735m = i18;
        int iM2443b = AbstractC1322K0.m2443b(c1324l0.f4726d, i5, c1324l0.m2485p());
        int iM2443b2 = AbstractC1322K0.m2443b(c1324l0.f4726d, i8, c1324l0.m2485p());
        if (iM2443b < iM2443b2) {
            ArrayList arrayList = c1324l0.f4726d;
            ArrayList arrayList2 = new ArrayList(iM2443b2 - iM2443b);
            for (int i21 = iM2443b; i21 < iM2443b2; i21++) {
                C1349a c1349a = (C1349a) arrayList.get(i21);
                c1349a.f4783a += i14;
                arrayList2.add(c1349a);
            }
            c1324l02.f4726d.addAll(AbstractC1322K0.m2443b(c1324l02.f4726d, c1324l02.f4742t, c1324l02.m2485p()), arrayList2);
            arrayList.subList(iM2443b, iM2443b2).clear();
            list = arrayList2;
        } else {
            list = C0981u.f3047d;
        }
        if (!list.isEmpty()) {
            HashMap map = c1324l0.f4727e;
            HashMap map2 = c1324l02.f4727e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i22 = 0; i22 < size; i22++) {
                }
            }
        }
        int i23 = c1324l02.f4744v;
        c1324l02.m2464O(i13);
        int iM2454E = c1324l0.m2454E(c1324l0.f4724b, i5);
        if (!z7) {
            z8 = false;
        } else if (z5) {
            boolean z11 = iM2454E >= 0;
            if (z11) {
                c1324l0.m2465P();
                c1324l0.m2471a(iM2454E - c1324l0.f4742t);
                c1324l0.m2465P();
            }
            c1324l0.m2471a(i5 - c1324l0.f4742t);
            boolean zM2457H = c1324l0.m2457H();
            if (z11) {
                c1324l0.m2462M();
                c1324l0.m2479j();
                c1324l0.m2462M();
                c1324l0.m2479j();
            }
            z8 = zM2457H;
        } else {
            boolean zM2458I = c1324l0.m2458I(i5, iM2490u);
            c1324l0.m2459J(iM2476f, i9, i5 - 1);
            z8 = zM2458I;
        }
        if (z8) {
            AbstractC1387t.m2638a("Unexpectedly removed anchors");
        }
        int i24 = c1324l02.f4737o;
        int i25 = iArr3[i11 + 1];
        c1324l02.f4737o = i24 + ((1073741824 & i25) != 0 ? 1 : i25 & 67108863);
        if (z6) {
            c1324l02.f4742t = i15;
            c1324l02.f4731i = i12 + i9;
        }
        if (z10) {
            c1324l02.m2469T(i13);
        }
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static C1366i0 m2629s(Object obj) {
        return new C1366i0(obj, C1357e.f4798j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final Object m2630t(InterfaceC1378o0 interfaceC1378o0, AbstractC1384r0 abstractC1384r0) {
        AbstractC1665j.m2983c(abstractC1384r0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        C1847i c1847i = (C1847i) interfaceC1378o0;
        Object objMo2400b = c1847i.get(abstractC1384r0);
        if (objMo2400b == null) {
            objMo2400b = abstractC1384r0.mo2400b();
        }
        return ((InterfaceC1345W0) objMo2400b).mo2404a(c1847i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final void m2631u(InterfaceC1373m interfaceC1373m, InterfaceC1601c interfaceC1601c) {
        ((C1383r) interfaceC1373m).m2574b(new C0002B(11, interfaceC1601c), C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final C1379p m2632v(InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2566U(206, AbstractC1387t.f4924e);
        if (c1383r.f4881S) {
            C1324L0.m2449z(c1383r.f4871I);
        }
        Object objM2550D = c1383r.m2550D();
        C1308D0 c1314g0 = objM2550D instanceof C1308D0 ? (C1308D0) objM2550D : null;
        if (c1314g0 == null) {
            c1314g0 = new C1314G0(new C1377o(new C1379p(c1383r, c1383r.f4882T, c1383r.f4900q, c1383r.f4865C, c1383r.f4891h.f4974w)), -1);
            c1383r.m2587h0(c1314g0);
        }
        InterfaceC1306C0 interfaceC1306C0 = c1314g0.f4672a;
        AbstractC1665j.m2983c(interfaceC1306C0, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl.CompositionContextHolder");
        C1379p c1379p = ((C1377o) interfaceC1306C0).f4851d;
        c1379p.f4857f.setValue(c1383r.m2593l());
        c1383r.m2597p(false);
        return c1379p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC1347Y m2633w(Object obj, InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        Object objM2558L = c1383r.m2558L();
        if (objM2558L == C1371l.f4833a) {
            objM2558L = m2629s(obj);
            c1383r.m2585g0(objM2558L);
        }
        InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) objM2558L;
        interfaceC1347Y.setValue(obj);
        return interfaceC1347Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final void m2634x(C1324L0 c1324l0, int i5, Object obj) {
        int iM2478h = c1324l0.m2478h(i5);
        Object[] objArr = c1324l0.f4725c;
        Object obj2 = objArr[iM2478h];
        objArr[iM2478h] = C1371l.f4833a;
        if (obj == obj2) {
            return;
        }
        AbstractC1387t.m2638a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final void m2635y(InterfaceC1373m interfaceC1373m, InterfaceC1603e interfaceC1603e, Object obj) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        if (c1383r.f4881S || !AbstractC1665j.m2981a(c1383r.m2558L(), obj)) {
            c1383r.m2585g0(obj);
            c1383r.m2574b(interfaceC1603e, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final int m2636z(C2438t c2438t) {
        int iM4336c;
        int i5 = c2438t.f7878b;
        int iM4336c2 = c2438t.m4336c(0);
        while (c2438t.f7878b != 0 && c2438t.m4336c(0) == iM4336c2) {
            int i6 = c2438t.f7878b;
            if (i6 == 0) {
                AbstractC2477a.m4424e("IntList is empty.");
                throw null;
            }
            c2438t.m4338e(0, c2438t.f7877a[i6 - 1]);
            c2438t.m4337d(c2438t.f7878b - 1);
            int i7 = c2438t.f7878b;
            int i8 = i7 >>> 1;
            int i9 = 0;
            while (i9 < i8) {
                int iM4336c3 = c2438t.m4336c(i9);
                int i10 = (i9 + 1) * 2;
                int i11 = i10 - 1;
                int iM4336c4 = c2438t.m4336c(i11);
                if (i10 >= i7 || (iM4336c = c2438t.m4336c(i10)) <= iM4336c4) {
                    if (iM4336c4 > iM4336c3) {
                        c2438t.m4338e(i9, iM4336c4);
                        c2438t.m4338e(i11, iM4336c3);
                        i9 = i11;
                    }
                } else if (iM4336c > iM4336c3) {
                    c2438t.m4338e(i9, iM4336c);
                    c2438t.m4338e(i10, iM4336c3);
                    i9 = i10;
                }
            }
        }
        return iM4336c2;
    }
}
