package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class zh0 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public di0 f7900h;

    /* JADX INFO: renamed from: i */
    public Object f7901i;

    /* JADX INFO: renamed from: j */
    public C0479mm f7902j;

    /* JADX INFO: renamed from: k */
    public ai0 f7903k;

    /* JADX INFO: renamed from: l */
    public int f7904l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f7905m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ vh0 f7906n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ ai0 f7907o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0302i f7908p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0479mm f7909q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh0(vh0 vh0Var, ai0 ai0Var, C0302i c0302i, C0479mm c0479mm, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f7906n = vh0Var;
        this.f7907o = ai0Var;
        this.f7908p = c0302i;
        this.f7909q = c0479mm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        zh0 zh0Var = new zh0(this.f7906n, this.f7907o, this.f7908p, this.f7909q, interfaceC0322ik);
        zh0Var.f7905m = obj;
        return zh0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((zh0) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final java.lang.Object mo16m(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f7904l
            r1 = 2
            r2 = 1
            r3 = 0
            zk r4 = p000.EnumC1007zk.f7916d
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r9.f7901i
            ai0 r0 = (p000.ai0) r0
            di0 r1 = r9.f7900h
            java.lang.Object r9 = r9.f7905m
            xh0 r9 = (p000.xh0) r9
            p000.w60.m4891M(r10)     // Catch: java.lang.Throwable -> L1c
            goto Lbf
        L1c:
            r10 = move-exception
            goto Lda
        L1f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C0921xc.m5134o(r9)
            return r3
        L25:
            ai0 r0 = r9.f7903k
            mm r2 = r9.f7902j
            java.lang.Object r5 = r9.f7901i
            ww r5 = (p000.InterfaceC0904ww) r5
            di0 r6 = r9.f7900h
            java.lang.Object r7 = r9.f7905m
            xh0 r7 = (p000.xh0) r7
            p000.w60.m4891M(r10)
            r10 = r6
            r6 = r5
            r5 = r10
            r10 = r0
            r0 = r7
            goto La7
        L3c:
            p000.w60.m4891M(r10)
            java.lang.Object r10 = r9.f7905m
            yk r10 = (p000.InterfaceC0966yk) r10
            xh0 r0 = new xh0
            pk r10 = r10.mo1328f()
            n2 r5 = p000.C0496n2.f4129I
            nk r10 = r10.mo64l(r5)
            r10.getClass()
            c40 r10 = (p000.c40) r10
            vh0 r5 = r9.f7906n
            r0.<init>(r5, r10)
            ai0 r10 = r9.f7907o
            java.util.concurrent.atomic.AtomicReference r5 = r10.f175a
        L5d:
            java.lang.Object r6 = r5.get()
            xh0 r6 = (p000.xh0) r6
            if (r6 == 0) goto L78
            vh0 r7 = r0.f7349a
            vh0 r8 = r6.f7349a
            int r7 = r7.compareTo(r8)
            if (r7 < 0) goto L70
            goto L78
        L70:
            java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "Current mutation had a higher priority"
            r9.<init>(r10)
            throw r9
        L78:
            boolean r7 = r5.compareAndSet(r6, r0)
            if (r7 == 0) goto Lee
            if (r6 == 0) goto L8d
            c40 r5 = r6.f7350b
            cu r6 = new cu
            java.lang.String r7 = "Mutation interrupted"
            r8 = 0
            r6.<init>(r7, r8)
            r5.mo478a(r6)
        L8d:
            di0 r5 = r10.f176b
            r9.f7905m = r0
            r9.f7900h = r5
            i r6 = r9.f7908p
            r9.f7901i = r6
            mm r7 = r9.f7909q
            r9.f7902j = r7
            r9.f7903k = r10
            r9.f7904l = r2
            java.lang.Object r2 = r5.m712e(r9)
            if (r2 != r4) goto La6
            goto Lb9
        La6:
            r2 = r7
        La7:
            r9.f7905m = r0     // Catch: java.lang.Throwable -> Ld4
            r9.f7900h = r5     // Catch: java.lang.Throwable -> Ld4
            r9.f7901i = r10     // Catch: java.lang.Throwable -> Ld4
            r9.f7902j = r3     // Catch: java.lang.Throwable -> Ld4
            r9.f7903k = r3     // Catch: java.lang.Throwable -> Ld4
            r9.f7904l = r1     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r9 = r6.invoke(r2, r9)     // Catch: java.lang.Throwable -> Ld4
            if (r9 != r4) goto Lba
        Lb9:
            return r4
        Lba:
            r1 = r10
            r10 = r9
            r9 = r0
            r0 = r1
            r1 = r5
        Lbf:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f175a     // Catch: java.lang.Throwable -> Ld2
        Lc1:
            boolean r2 = r0.compareAndSet(r9, r3)     // Catch: java.lang.Throwable -> Ld2
            if (r2 == 0) goto Lc8
            goto Lce
        Lc8:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Ld2
            if (r2 == r9) goto Lc1
        Lce:
            r1.m714g(r3)
            return r10
        Ld2:
            r9 = move-exception
            goto Lea
        Ld4:
            r9 = move-exception
            r1 = r10
            r10 = r9
            r9 = r0
            r0 = r1
            r1 = r5
        Lda:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f175a     // Catch: java.lang.Throwable -> Ld2
        Ldc:
            boolean r2 = r0.compareAndSet(r9, r3)     // Catch: java.lang.Throwable -> Ld2
            if (r2 != 0) goto Le9
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Ld2
            if (r2 != r9) goto Le9
            goto Ldc
        Le9:
            throw r10     // Catch: java.lang.Throwable -> Ld2
        Lea:
            r1.m714g(r3)
            throw r9
        Lee:
            java.lang.Object r7 = r5.get()
            if (r7 == r6) goto L78
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zh0.mo16m(java.lang.Object):java.lang.Object");
    }
}
