package p178i3;

import p051J.C0810b;
import p074O2.C1047e;
import p074O2.C1052j;
import p074O2.InterfaceC1051i;
import p121Y1.C1753n;
import p154e2.C2023b;
import p160f3.AbstractC2100C;
import p160f3.AbstractC2123a;
import p160f3.AbstractC2162v;
import p160f3.C2124a0;
import p160f3.C2136g0;
import p160f3.EnumC2161u;
import p172h3.C2246f;
import p172h3.EnumC2241a;
import p172h3.InterfaceC2247g;
import p184j3.AbstractC2384c;
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

    static {
        int i5 = 10;
        f7625a = new C1753n(i5, "NO_VALUE");
        f7626b = new C1753n(i5, "NONE");
        f7627c = new C1753n(i5, "PENDING");
    }

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

    /* JADX INFO: renamed from: b */
    public static final C2318C m4166b(Object obj) {
        if (obj == null) {
            obj = AbstractC2384c.f7730b;
        }
        return new C2318C(obj);
    }

    /* JADX INFO: renamed from: c */
    public static final void m4167c(Object[] objArr, long j5, Object obj) {
        objArr[((int) j5) & (objArr.length - 1)] = obj;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2323d m4168d(InterfaceC2323d interfaceC2323d) {
        return ((interfaceC2323d instanceof InterfaceC2316A) || (interfaceC2323d instanceof C2322c)) ? interfaceC2323d : new C2322c(interfaceC2323d);
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4169e(p178i3.InterfaceC2324e r7, p172h3.C2255o r8, boolean r9, p084Q2.AbstractC1178c r10) {
        /*
            boolean r0 = r10 instanceof p178i3.C2325f
            if (r0 == 0) goto L13
            r0 = r10
            i3.f r0 = (p178i3.C2325f) r0
            int r1 = r0.f7579l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7579l = r1
            goto L18
        L13:
            i3.f r0 = new i3.f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f7578k
            int r1 = r0.f7579l
            r2 = 0
            r3 = 2
            r4 = 1
            P2.a r5 = p079P2.EnumC1152a.f3788d
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L3f
            if (r1 != r3) goto L37
            boolean r9 = r0.f7577j
            h3.b r7 = r0.f7576i
            h3.q r8 = r0.f7575h
            i3.e r1 = r0.f7574g
            p127Z2.AbstractC1784a.m3205S(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L52
        L35:
            r7 = move-exception
            goto L8c
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f7577j
            h3.b r7 = r0.f7576i
            h3.q r8 = r0.f7575h
            i3.e r1 = r0.f7574g
            p127Z2.AbstractC1784a.m3205S(r10)     // Catch: java.lang.Throwable -> L35
            goto L67
        L4b:
            p127Z2.AbstractC1784a.m3205S(r10)
            h3.b r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L52:
            r0.f7574g = r7     // Catch: java.lang.Throwable -> L35
            r0.f7575h = r8     // Catch: java.lang.Throwable -> L35
            r0.f7576i = r10     // Catch: java.lang.Throwable -> L35
            r0.f7577j = r9     // Catch: java.lang.Throwable -> L35
            r0.f7579l = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.m4068b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L63
            goto L83
        L63:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L67:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L84
            java.lang.Object r10 = r7.m4069c()     // Catch: java.lang.Throwable -> L35
            r0.f7574g = r1     // Catch: java.lang.Throwable -> L35
            r0.f7575h = r8     // Catch: java.lang.Throwable -> L35
            r0.f7576i = r7     // Catch: java.lang.Throwable -> L35
            r0.f7577j = r9     // Catch: java.lang.Throwable -> L35
            r0.f7579l = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.mo9c(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L83:
            return r5
        L84:
            if (r9 == 0) goto L89
            r8.mo4080c(r2)
        L89:
            K2.q r7 = p056K2.C0891q.f2780a
            return r7
        L8c:
            throw r7     // Catch: java.lang.Throwable -> L8d
        L8d:
            r10 = move-exception
            if (r9 == 0) goto La6
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L97
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L97:
            if (r2 != 0) goto La3
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La3:
            r8.mo4080c(r2)
        La6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p178i3.AbstractC2339t.m4169e(i3.e, h3.o, boolean, Q2.c):java.lang.Object");
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4170f(p178i3.InterfaceC2323d r5, p112W2.InterfaceC1603e r6, p084Q2.AbstractC1178c r7) {
        /*
            Y1.n r0 = p184j3.AbstractC2384c.f7730b
            boolean r1 = r7 instanceof p178i3.C2331l
            if (r1 == 0) goto L15
            r1 = r7
            i3.l r1 = (p178i3.C2331l) r1
            int r2 = r1.f7603k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f7603k = r2
            goto L1a
        L15:
            i3.l r1 = new i3.l
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f7602j
            int r2 = r1.f7603k
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            L.H r5 = r1.f7601i
            X2.t r6 = r1.f7600h
            Q2.i r1 = r1.f7599g
            W2.e r1 = (p112W2.InterfaceC1603e) r1
            p127Z2.AbstractC1784a.m3205S(r7)     // Catch: p184j3.C2382a -> L2f
            goto L69
        L2f:
            r7 = move-exception
            goto L65
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            p127Z2.AbstractC1784a.m3205S(r7)
            X2.t r7 = new X2.t
            r7.<init>()
            r7.f5710e = r0
            L.H r2 = new L.H
            r4 = 3
            r2.<init>(r4, r6, r7)
            r4 = r6
            Q2.i r4 = (p084Q2.AbstractC1184i) r4     // Catch: p184j3.C2382a -> L60
            r1.f7599g = r4     // Catch: p184j3.C2382a -> L60
            r1.f7600h = r7     // Catch: p184j3.C2382a -> L60
            r1.f7601i = r2     // Catch: p184j3.C2382a -> L60
            r1.f7603k = r3     // Catch: p184j3.C2382a -> L60
            java.lang.Object r5 = r5.mo3119i(r2, r1)     // Catch: p184j3.C2382a -> L60
            P2.a r1 = p079P2.EnumC1152a.f3788d
            if (r5 != r1) goto L5d
            return r1
        L5d:
            r1 = r6
            r6 = r7
            goto L69
        L60:
            r5 = move-exception
            r1 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L65:
            java.lang.Object r2 = r7.f7724d
            if (r2 != r5) goto L82
        L69:
            java.lang.Object r5 = r6.f5710e
            if (r5 == r0) goto L6e
            return r5
        L6e:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L82:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p178i3.AbstractC2339t.m4170f(i3.d, W2.e, Q2.c):java.lang.Object");
    }

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
