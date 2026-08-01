package p227r;

import p000A.C0011F0;
import p007B0.AbstractC0208v;
import p007B0.C0200n;
import p007B0.C0209w;
import p007B0.InterfaceC0169B;
import p047I0.InterfaceC0697T0;
import p056K2.C0891q;
import p058L.C0927b0;
import p074O2.InterfaceC1046d;
import p076P.C1073T;
import p079P2.EnumC1152a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.C1674s;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: r.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2945D {

    /* JADX INFO: renamed from: a */
    public static final float f9309a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        if (p204n0.C2683b.m4644b(p007B0.AbstractC0208v.m317g(r6, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005c -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5150a(p007B0.C0185S r12, long r13, p084Q2.AbstractC1178c r15) {
        /*
            boolean r0 = r15 instanceof p227r.C3022x
            if (r0 == 0) goto L13
            r0 = r15
            r.x r0 = (p227r.C3022x) r0
            int r1 = r0.f9578j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9578j = r1
            goto L18
        L13:
            r.x r0 = new r.x
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f9577i
            int r1 = r0.f9578j
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            X2.s r12 = r0.f9576h
            B0.S r13 = r0.f9575g
            p127Z2.AbstractC1784a.m3205S(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5f
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            p127Z2.AbstractC1784a.m3205S(r15)
            B0.T r15 = r12.f645i
            B0.n r15 = r15.f653w
            boolean r15 = m5155f(r15, r13)
            if (r15 == 0) goto L44
            goto Lc4
        L44:
            X2.s r15 = new X2.s
            r15.<init>()
            r15.f5708d = r13
        L4b:
            r0.f9575g = r12
            r0.f9576h = r15
            r0.f9578j = r2
            B0.o r13 = p007B0.EnumC0201o.f703e
            java.lang.Object r13 = r12.m271a(r13, r0)
            P2.a r14 = p079P2.EnumC1152a.f3788d
            if (r13 != r14) goto L5c
            return r14
        L5c:
            r11 = r15
            r15 = r13
            r13 = r11
        L5f:
            B0.n r15 = (p007B0.C0200n) r15
            java.lang.Object r14 = r15.f696a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L69:
            if (r5 >= r1) goto L80
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            B0.w r7 = (p007B0.C0209w) r7
            long r7 = r7.f711a
            long r9 = r13.f5708d
            boolean r7 = p007B0.AbstractC0208v.m315e(r7, r9)
            if (r7 == 0) goto L7d
            goto L81
        L7d:
            int r5 = r5 + 1
            goto L69
        L80:
            r6 = r3
        L81:
            B0.w r6 = (p007B0.C0209w) r6
            if (r6 != 0) goto L87
            r6 = r3
            goto Lbb
        L87:
            boolean r14 = p007B0.AbstractC0208v.m314d(r6)
            if (r14 == 0) goto Laf
            java.lang.Object r14 = r15.f696a
            int r15 = r14.size()
        L93:
            if (r4 >= r15) goto La4
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            B0.w r5 = (p007B0.C0209w) r5
            boolean r5 = r5.f714d
            if (r5 == 0) goto La1
            goto La5
        La1:
            int r4 = r4 + 1
            goto L93
        La4:
            r1 = r3
        La5:
            B0.w r1 = (p007B0.C0209w) r1
            if (r1 != 0) goto Laa
            goto Lbb
        Laa:
            long r14 = r1.f711a
            r13.f5708d = r14
            goto Lc5
        Laf:
            long r14 = p007B0.AbstractC0208v.m317g(r6, r2)
            r4 = 0
            boolean r14 = p204n0.C2683b.m4644b(r14, r4)
            if (r14 != 0) goto Lc5
        Lbb:
            if (r6 == 0) goto Lc4
            boolean r12 = r6.m321b()
            if (r12 != 0) goto Lc4
            return r6
        Lc4:
            return r3
        Lc5:
            r15 = r13
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.AbstractC2945D.m5150a(B0.S, long, Q2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X2.t] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5151b(p007B0.C0185S r8, long r9, p084Q2.AbstractC1178c r11) {
        /*
            boolean r0 = r11 instanceof p227r.C3024y
            if (r0 == 0) goto L13
            r0 = r11
            r.y r0 = (p227r.C3024y) r0
            int r1 = r0.f9591k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9591k = r1
            goto L18
        L13:
            r.y r0 = new r.y
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f9590j
            int r1 = r0.f9591k
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            X2.p r8 = r0.f9589i
            X2.t r9 = r0.f9588h
            B0.w r10 = r0.f9587g
            p127Z2.AbstractC1784a.m3205S(r11)     // Catch: p007B0.C0202p -> La7
            goto L9a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            p127Z2.AbstractC1784a.m3205S(r11)
            B0.T r11 = r8.f645i
            B0.n r11 = r11.f653w
            boolean r11 = m5155f(r11, r9)
            if (r11 == 0) goto L43
            goto La6
        L43:
            B0.T r11 = r8.f645i
            B0.n r11 = r11.f653w
            java.lang.Object r11 = r11.f696a
            int r1 = r11.size()
            r4 = 0
        L4e:
            if (r4 >= r1) goto L63
            java.lang.Object r5 = r11.get(r4)
            r6 = r5
            B0.w r6 = (p007B0.C0209w) r6
            long r6 = r6.f711a
            boolean r6 = p007B0.AbstractC0208v.m315e(r6, r9)
            if (r6 == 0) goto L60
            goto L64
        L60:
            int r4 = r4 + 1
            goto L4e
        L63:
            r5 = r3
        L64:
            r10 = r5
            B0.w r10 = (p007B0.C0209w) r10
            if (r10 != 0) goto L6a
            goto La6
        L6a:
            X2.t r9 = new X2.t
            r9.<init>()
            X2.t r11 = new X2.t
            r11.<init>()
            r11.f5710e = r10
            I0.T0 r1 = r8.m277f()
            long r4 = r1.mo776c()
            X2.p r1 = new X2.p     // Catch: p007B0.C0202p -> La7
            r1.<init>()     // Catch: p007B0.C0202p -> La7
            r.z r6 = new r.z     // Catch: p007B0.C0202p -> La7
            r6.<init>(r1, r11, r9, r3)     // Catch: p007B0.C0202p -> La7
            r0.f9587g = r10     // Catch: p007B0.C0202p -> La7
            r0.f9588h = r9     // Catch: p007B0.C0202p -> La7
            r0.f9589i = r1     // Catch: p007B0.C0202p -> La7
            r0.f9591k = r2     // Catch: p007B0.C0202p -> La7
            java.lang.Object r8 = r8.m279j(r4, r6, r0)     // Catch: p007B0.C0202p -> La7
            P2.a r11 = p079P2.EnumC1152a.f3788d
            if (r8 != r11) goto L99
            return r11
        L99:
            r8 = r1
        L9a:
            boolean r8 = r8.f5705d     // Catch: p007B0.C0202p -> La7
            if (r8 == 0) goto La6
            java.lang.Object r8 = r9.f5710e     // Catch: p007B0.C0202p -> La7
            B0.w r8 = (p007B0.C0209w) r8     // Catch: p007B0.C0202p -> La7
            if (r8 != 0) goto La5
            return r10
        La5:
            return r8
        La6:
            return r3
        La7:
            java.lang.Object r8 = r9.f5710e
            B0.w r8 = (p007B0.C0209w) r8
            if (r8 != 0) goto Lae
            goto Laf
        Lae:
            r10 = r8
        Laf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.AbstractC2945D.m5151b(B0.S, long, Q2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0160 -> B:63:0x0166). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5152c(p007B0.C0185S r21, long r22, p000A.C0002B r24, p084Q2.AbstractC1176a r25) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.AbstractC2945D.m5152c(B0.S, long, A.B, Q2.a):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public static Object m5153d(InterfaceC0169B interfaceC0169B, InterfaceC1601c interfaceC1601c, InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        C1073T c1073t = new C1073T(23);
        Object objM4197j = AbstractC2352g.m4197j(interfaceC0169B, new C2941B(new C1073T(24), new C1674s(), null, new C0011F0(interfaceC1601c, 1), interfaceC1603e, new C1073T(23), new C0927b0(c1073t, 2), null), interfaceC1046d);
        C0891q c0891q = C0891q.f2780a;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (objM4197j != enumC1152a) {
            objM4197j = c0891q;
        }
        return objM4197j == enumC1152a ? objM4197j : c0891q;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5154e(p007B0.C0185S r4, long r5, p112W2.InterfaceC1601c r7, p084Q2.AbstractC1178c r8) {
        /*
            boolean r0 = r8 instanceof p227r.C2943C
            if (r0 == 0) goto L13
            r0 = r8
            r.C r0 = (p227r.C2943C) r0
            int r1 = r0.f9303j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9303j = r1
            goto L18
        L13:
            r.C r0 = new r.C
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9302i
            int r1 = r0.f9303j
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            W2.c r4 = r0.f9301h
            B0.S r5 = r0.f9300g
            p127Z2.AbstractC1784a.m3205S(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            p127Z2.AbstractC1784a.m3205S(r8)
        L36:
            r0.f9300g = r4
            r0.f9301h = r7
            r0.f9303j = r2
            java.lang.Object r8 = m5150a(r4, r5, r0)
            P2.a r5 = p079P2.EnumC1152a.f3788d
            if (r8 != r5) goto L45
            return r5
        L45:
            B0.w r8 = (p007B0.C0209w) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = p007B0.AbstractC0208v.m314d(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.mo1h(r8)
            long r5 = r8.f711a
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.AbstractC2945D.m5154e(B0.S, long, W2.c, Q2.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: f */
    public static final boolean m5155f(C0200n c0200n, long j5) {
        Object obj;
        ?? r6 = c0200n.f696a;
        int size = r6.size();
        boolean z5 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i5);
            if (AbstractC0208v.m315e(((C0209w) obj).f711a, j5)) {
                break;
            }
            i5++;
        }
        C0209w c0209w = (C0209w) obj;
        if (c0209w != null && c0209w.f714d) {
            z5 = true;
        }
        return true ^ z5;
    }

    /* JADX INFO: renamed from: g */
    public static final float m5156g(InterfaceC0697T0 interfaceC0697T0, int i5) {
        return i5 == 2 ? interfaceC0697T0.mo777d() * f9309a : interfaceC0697T0.mo777d();
    }
}
