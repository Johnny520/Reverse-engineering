package p178i3;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import p051J.C0810b;
import p056K2.C0891q;
import p058L.C0906H;
import p074O2.C1047e;
import p074O2.C1052j;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p117X2.C1675t;
import p121Y1.C1753n;
import p127Z2.AbstractC1784a;
import p154e2.C2023b;
import p160f3.AbstractC2100C;
import p160f3.AbstractC2123a;
import p160f3.AbstractC2162v;
import p160f3.C2124a0;
import p160f3.C2136g0;
import p160f3.EnumC2161u;
import p172h3.C2242b;
import p172h3.C2246f;
import p172h3.C2255o;
import p172h3.EnumC2241a;
import p172h3.InterfaceC2247g;
import p172h3.InterfaceC2257q;
import p184j3.AbstractC2384c;
import p184j3.C2382a;
import p190k3.C2455c;
import p201m3.C2608e;

/* JADX INFO: renamed from: i3.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2339t {

    /* JADX INFO: renamed from: a */
    public static final C1753n f7625a;

    /* JADX INFO: renamed from: b */
    public static final C1753n f7626b;

    /* JADX INFO: renamed from: c */
    public static final C1753n f7627c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 10;
        f7625a = new C1753n(i5, "NO_VALUE");
        f7626b = new C1753n(i5, "NONE");
        f7627c = new C1753n(i5, "PENDING");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2338s m4165a(int i5, EnumC2241a enumC2241a) {
        int i6 = (i5 & 1) != 0 ? 0 : 1;
        int i7 = (i5 & 2) == 0 ? 16 : 0;
        if (i6 <= 0 && i7 <= 0 && enumC2241a != EnumC2241a.f7351d) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC2241a).toString());
        }
        int i8 = i7 + i6;
        if (i8 < 0) {
            i8 = Integer.MAX_VALUE;
        }
        return new C2338s(i6, i8, enumC2241a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C2318C m4166b(Object obj) {
        if (obj == null) {
            obj = AbstractC2384c.f7730b;
        }
        return new C2318C(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m4167c(Object[] objArr, long j5, Object obj) {
        objArr[((int) j5) & (objArr.length - 1)] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC2323d m4168d(InterfaceC2323d interfaceC2323d) {
        return ((interfaceC2323d instanceof InterfaceC2316A) || (interfaceC2323d instanceof C2322c)) ? interfaceC2323d : new C2322c(interfaceC2323d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x0021 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r1.mo9c(r10, r0) == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0052, B:28:0x0067, B:30:0x006f, B:20:0x0047, B:23:0x004e), top: B:47:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [h3.o] */
    /* JADX WARN: Type inference failed for: r8v1, types: [h3.q] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2, types: [h3.q] */
    /* JADX WARN: Type inference failed for: r8v3, types: [h3.q] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0081 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4169e(InterfaceC2324e interfaceC2324e, C2255o c2255o, boolean z5, AbstractC1178c abstractC1178c) {
        C2325f c2325f;
        C2242b it;
        ?? r8;
        C2242b c2242b;
        InterfaceC2324e interfaceC2324e2;
        Object objM4068b;
        if (abstractC1178c instanceof C2325f) {
            c2325f = (C2325f) abstractC1178c;
            int i5 = c2325f.f7579l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2325f.f7579l = i5 - Integer.MIN_VALUE;
            } else {
                c2325f = new C2325f(abstractC1178c);
            }
        }
        Object obj = c2325f.f7578k;
        int i6 = c2325f.f7579l;
        CancellationException cancellationException = null;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        try {
            if (i6 == 0) {
                AbstractC1784a.m3205S(obj);
                it = c2255o.iterator();
                c2255o = c2255o;
                c2325f.f7574g = interfaceC2324e;
                c2325f.f7575h = c2255o;
                c2325f.f7576i = it;
                c2325f.f7577j = z5;
                c2325f.f7579l = 1;
                objM4068b = it.m4068b(c2325f);
                if (objM4068b != enumC1152a) {
                }
            } else if (i6 == 1) {
                z5 = c2325f.f7577j;
                c2242b = c2325f.f7576i;
                InterfaceC2257q interfaceC2257q = c2325f.f7575h;
                interfaceC2324e2 = c2325f.f7574g;
                AbstractC1784a.m3205S(obj);
                r8 = interfaceC2257q;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z5 = c2325f.f7577j;
                c2242b = c2325f.f7576i;
                InterfaceC2257q interfaceC2257q2 = c2325f.f7575h;
                interfaceC2324e2 = c2325f.f7574g;
                AbstractC1784a.m3205S(obj);
                ?? r82 = interfaceC2257q2;
                it = c2242b;
                interfaceC2324e = interfaceC2324e2;
                c2255o = r82;
                c2325f.f7574g = interfaceC2324e;
                c2325f.f7575h = c2255o;
                c2325f.f7576i = it;
                c2325f.f7577j = z5;
                c2325f.f7579l = 1;
                objM4068b = it.m4068b(c2325f);
                if (objM4068b != enumC1152a) {
                    return enumC1152a;
                }
                interfaceC2324e2 = interfaceC2324e;
                c2242b = it;
                obj = objM4068b;
                r8 = c2255o;
                if (((Boolean) obj).booleanValue()) {
                    if (z5) {
                        r8.mo4080c(null);
                    }
                    return C0891q.f2780a;
                }
                Object objM4069c = c2242b.m4069c();
                c2325f.f7574g = interfaceC2324e2;
                c2325f.f7575h = r8;
                c2325f.f7576i = c2242b;
                c2325f.f7577j = z5;
                c2325f.f7579l = 2;
                r82 = r8;
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x002f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [W2.e] */
    /* JADX WARN: Type inference failed for: r5v0, types: [i3.d] */
    /* JADX WARN: Type inference failed for: r6v0, types: [W2.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.StringBuilder] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4170f(InterfaceC2323d interfaceC2323d, InterfaceC1603e interfaceC1603e, AbstractC1178c abstractC1178c) {
        C2331l c2331l;
        ?? r12;
        C1675t c1675t;
        C2382a e5;
        C0906H c0906h;
        ?? r13;
        C1753n c1753n = AbstractC2384c.f7730b;
        if (abstractC1178c instanceof C2331l) {
            c2331l = (C2331l) abstractC1178c;
            int i5 = c2331l.f7603k;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2331l.f7603k = i5 - Integer.MIN_VALUE;
            } else {
                c2331l = new C2331l(abstractC1178c);
            }
        }
        Object obj = c2331l.f7602j;
        int i6 = c2331l.f7603k;
        if (i6 == 0) {
            AbstractC1784a.m3205S(obj);
            C1675t c1675t2 = new C1675t();
            c1675t2.f5710e = c1753n;
            C0906H c0906h2 = new C0906H(3, (Object) interfaceC1603e, c1675t2);
            try {
                c2331l.f7599g = (AbstractC1184i) interfaceC1603e;
                c2331l.f7600h = c1675t2;
                c2331l.f7601i = c0906h2;
                c2331l.f7603k = 1;
                Object objMo3119i = interfaceC2323d.mo3119i(c0906h2, c2331l);
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (objMo3119i == enumC1152a) {
                    return enumC1152a;
                }
                r13 = interfaceC1603e;
                c1675t = c1675t2;
            } catch (C2382a e6) {
                r12 = interfaceC1603e;
                c1675t = c1675t2;
                e5 = e6;
                c0906h = c0906h2;
                r13 = r12;
                if (e5.f7724d != c0906h) {
                }
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0906h = c2331l.f7601i;
            c1675t = c2331l.f7600h;
            r12 = (InterfaceC1603e) c2331l.f7599g;
            try {
                AbstractC1784a.m3205S(obj);
                r13 = r12;
            } catch (C2382a e7) {
                e5 = e7;
                r13 = r12;
                if (e5.f7724d != c0906h) {
                    throw e5;
                }
            }
        }
        Object obj2 = c1675t.f5710e;
        if (obj2 != c1753n) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + r13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final C2335p m4171g(C1753n c1753n, C2455c c2455c, C2345z c2345z, Float f2) {
        InterfaceC2247g.f7390c.getClass();
        C2246f c2246f = C2246f.f7388a;
        C2023b c2023b = new C2023b(4, c1753n, C1052j.f3286d);
        C2318C c2318cM4166b = m4166b(f2);
        InterfaceC1051i interfaceC1051i = (InterfaceC1051i) c2023b.f6753f;
        InterfaceC2323d interfaceC2323d = (InterfaceC2323d) c2023b.f6752e;
        EnumC2161u enumC2161u = c2345z.equals(C2342w.f7634a) ? EnumC2161u.f7105d : EnumC2161u.f7108g;
        C0810b c0810b = new C0810b(c2345z, interfaceC2323d, c2318cM4166b, f2, null, 5);
        InterfaceC1051i interfaceC1051iM3985g = AbstractC2162v.m3985g(c2455c.mo1202f(), interfaceC1051i, true);
        C2608e c2608e = AbstractC2100C.f7029a;
        if (interfaceC1051iM3985g != c2608e && interfaceC1051iM3985g.mo1166C(C1047e.f3285d) == null) {
            interfaceC1051iM3985g = interfaceC1051iM3985g.mo1168m(c2608e);
        }
        AbstractC2123a c2124a0 = enumC2161u == EnumC2161u.f7106e ? new C2124a0(interfaceC1051iM3985g, c0810b) : new C2136g0(interfaceC1051iM3985g, true);
        c2124a0.m3949f0(enumC2161u, c2124a0, c0810b);
        return new C2335p(c2318cM4166b);
    }
}
