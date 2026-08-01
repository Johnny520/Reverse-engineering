package p000;

/* JADX INFO: renamed from: ew */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0187ew extends av0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f1536f;

    /* JADX INFO: renamed from: g */
    public Object f1537g;

    /* JADX INFO: renamed from: h */
    public int f1538h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f1539i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1540j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0187ew(Object obj, Object obj2, InterfaceC0322ik interfaceC0322ik, int i) {
        super(interfaceC0322ik);
        this.f1536f = i;
        this.f1539i = obj;
        this.f1540j = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f1536f;
        Object obj2 = this.f1540j;
        switch (i) {
            case 0:
                C0187ew c0187ew = new C0187ew((InterfaceC0618pk) this.f1539i, (InterfaceC0904ww) obj2, interfaceC0322ik, 0);
                c0187ew.f1537g = obj;
                return c0187ew;
            case 1:
                C0187ew c0187ew2 = new C0187ew((C0381k6) obj2, interfaceC0322ik);
                c0187ew2.f1539i = obj;
                return c0187ew2;
            default:
                C0187ew c0187ew3 = new C0187ew((jr0) this.f1539i, (zt0) obj2, interfaceC0322ik, 2);
                c0187ew3.f1537g = obj;
                return c0187ew3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1536f;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                return ((C0187ew) mo15g((r51) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 1:
                return ((C0187ew) mo15g((q01) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            default:
                return ((C0187ew) mo15g((r51) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x0113 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: ww */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: r51 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: r51 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v25, resolved type: r51 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v26, resolved type: r51 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a A[Catch: CancellationException -> 0x0131, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0131, blocks: (B:74:0x014a, B:77:0x0158, B:63:0x012d, B:68:0x0138), top: B:87:0x0113 }] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a3 -> B:34:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0107 -> B:53:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0160 -> B:72:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0171 -> B:72:0x0144). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16m(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.f1536f
            jr0 r2 = p000.jr0.f2935f
            r3 = 2
            na1 r4 = p000.na1.f4229a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            zk r6 = p000.EnumC1007zk.f7916d
            r7 = 1
            java.lang.Object r8 = r1.f1540j
            r9 = 0
            switch(r0) {
                case 0: goto L10b;
                case 1: goto Ld6;
                default: goto L14;
            }
        L14:
            zt0 r8 = (p000.zt0) r8
            int r0 = r1.f1538h
            pb0 r10 = p000.pb0.f4800a
            if (r0 == 0) goto L3b
            if (r0 == r7) goto L31
            if (r0 != r3) goto L2b
            java.lang.Object r0 = r1.f1537g
            r51 r0 = (p000.r51) r0
            p000.w60.m4891M(r17)
            r5 = r17
            goto La7
        L2b:
            p000.C0921xc.m5134o(r5)
            r4 = r9
            goto Ld5
        L31:
            java.lang.Object r0 = r1.f1537g
            r51 r0 = (p000.r51) r0
            p000.w60.m4891M(r17)
            r5 = r17
            goto L51
        L3b:
            p000.w60.m4891M(r17)
            java.lang.Object r0 = r1.f1537g
            r51 r0 = (p000.r51) r0
        L42:
            java.lang.Object r5 = r1.f1539i
            jr0 r5 = (p000.jr0) r5
            r1.f1537g = r0
            r1.f1538h = r7
            java.lang.Object r5 = r0.m3387a(r5, r1)
            if (r5 != r6) goto L51
            goto La5
        L51:
            ir0 r5 = (p000.ir0) r5
            java.util.List r9 = r5.f2610a
            int r12 = r9.size()
            r13 = 0
        L5a:
            if (r13 >= r12) goto Lc7
            java.lang.Object r14 = r9.get(r13)
            nr0 r14 = (p000.nr0) r14
            boolean r14 = p000.w60.m4903j(r14)
            if (r14 != 0) goto Lc4
            int r5 = r5.f2612c
            if (r5 != r3) goto L71
            rb0 r0 = p000.rb0.f5347a
            r8.f7995d = r0
            goto Ld5
        L71:
            int r5 = r9.size()
            r12 = 0
        L76:
            if (r12 >= r5) goto L9b
            java.lang.Object r13 = r9.get(r12)
            nr0 r13 = (p000.nr0) r13
            boolean r14 = r13.m2737b()
            if (r14 != 0) goto L98
            s51 r14 = r0.f5302i
            long r14 = r14.f5645A
            r17 = r12
            long r11 = r0.m3388d()
            boolean r11 = p000.w60.m4879A(r13, r14, r11)
            if (r11 == 0) goto L95
            goto L98
        L95:
            int r12 = r17 + 1
            goto L76
        L98:
            r8.f7995d = r10
            goto Ld5
        L9b:
            r1.f1537g = r0
            r1.f1538h = r3
            java.lang.Object r5 = r0.m3387a(r2, r1)
            if (r5 != r6) goto La7
        La5:
            r4 = r6
            goto Ld5
        La7:
            ir0 r5 = (p000.ir0) r5
            java.util.List r5 = r5.f2610a
            int r9 = r5.size()
            r11 = 0
        Lb0:
            if (r11 >= r9) goto L42
            java.lang.Object r12 = r5.get(r11)
            nr0 r12 = (p000.nr0) r12
            boolean r12 = r12.m2737b()
            if (r12 == 0) goto Lc1
            r8.f7995d = r10
            goto Ld5
        Lc1:
            int r11 = r11 + 1
            goto Lb0
        Lc4:
            int r13 = r13 + 1
            goto L5a
        Lc7:
            qb0 r0 = new qb0
            r1 = 0
            java.lang.Object r1 = r9.get(r1)
            nr0 r1 = (p000.nr0) r1
            r0.<init>(r1)
            r8.f7995d = r0
        Ld5:
            return r4
        Ld6:
            int r0 = r1.f1538h
            if (r0 == 0) goto Leb
            if (r0 != r7) goto Le6
            java.lang.Object r0 = r1.f1537g
            java.lang.Object r2 = r1.f1539i
            q01 r2 = (p000.q01) r2
            p000.w60.m4891M(r17)
            goto L108
        Le6:
            p000.C0921xc.m5134o(r5)
            r4 = r9
            goto L10a
        Leb:
            p000.w60.m4891M(r17)
            java.lang.Object r0 = r1.f1539i
            q01 r0 = (p000.q01) r0
            r2 = r0
        Lf3:
            r0 = r8
            k6 r0 = (p000.C0381k6) r0
            java.lang.Object r0 = r0.invoke()
            if (r0 == 0) goto L107
            r1.f1539i = r2
            r1.f1537g = r0
            r1.f1538h = r7
            r2.m3184b(r1, r0)
            r4 = r6
            goto L10a
        L107:
            r0 = r9
        L108:
            if (r0 != 0) goto Lf3
        L10a:
            return r4
        L10b:
            java.lang.Object r0 = r1.f1539i
            r10 = r0
            pk r10 = (p000.InterfaceC0618pk) r10
            int r0 = r1.f1538h
            r11 = 3
            if (r0 == 0) goto L13c
            if (r0 == r7) goto L133
            if (r0 == r3) goto L128
            if (r0 != r11) goto L123
            java.lang.Object r0 = r1.f1537g
            r51 r0 = (p000.r51) r0
            p000.w60.m4891M(r17)
            goto L143
        L123:
            p000.C0921xc.m5134o(r5)
            r4 = r9
            goto L176
        L128:
            java.lang.Object r0 = r1.f1537g
            r5 = r0
            r51 r5 = (p000.r51) r5
            p000.w60.m4891M(r17)     // Catch: java.util.concurrent.CancellationException -> L131
            goto L144
        L131:
            r0 = move-exception
            goto L163
        L133:
            java.lang.Object r0 = r1.f1537g
            r5 = r0
            r51 r5 = (p000.r51) r5
            p000.w60.m4891M(r17)     // Catch: java.util.concurrent.CancellationException -> L131
            goto L158
        L13c:
            p000.w60.m4891M(r17)
            java.lang.Object r0 = r1.f1537g
            r51 r0 = (p000.r51) r0
        L143:
            r5 = r0
        L144:
            boolean r0 = p000.pf1.m3028D(r10)
            if (r0 == 0) goto L176
            r0 = r8
            ww r0 = (p000.InterfaceC0904ww) r0     // Catch: java.util.concurrent.CancellationException -> L131
            r1.f1537g = r5     // Catch: java.util.concurrent.CancellationException -> L131
            r1.f1538h = r7     // Catch: java.util.concurrent.CancellationException -> L131
            java.lang.Object r0 = r0.invoke(r5, r1)     // Catch: java.util.concurrent.CancellationException -> L131
            if (r0 != r6) goto L158
            goto L173
        L158:
            r1.f1537g = r5     // Catch: java.util.concurrent.CancellationException -> L131
            r1.f1538h = r3     // Catch: java.util.concurrent.CancellationException -> L131
            java.lang.Object r0 = p000.p30.m3004n(r5, r2, r1)     // Catch: java.util.concurrent.CancellationException -> L131
            if (r0 != r6) goto L144
            goto L173
        L163:
            boolean r9 = p000.pf1.m3028D(r10)
            if (r9 == 0) goto L175
            r1.f1537g = r5
            r1.f1538h = r11
            java.lang.Object r0 = p000.p30.m3004n(r5, r2, r1)
            if (r0 != r6) goto L144
        L173:
            r4 = r6
            goto L176
        L175:
            throw r0
        L176:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0187ew.mo16m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187ew(C0381k6 c0381k6, InterfaceC0322ik interfaceC0322ik) {
        super(interfaceC0322ik);
        this.f1536f = 1;
        this.f1540j = c0381k6;
    }
}
