package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4986
public final class C5555<R> extends Yue.C3781 implements Yue.InterfaceC5553<R>, Yue.InterfaceC5564<R>, Yue.InterfaceC1598<R>, Yue.InterfaceC1665 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f20509 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f20510 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _parentHandle;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _result;

    @Yue.InterfaceC4418
    volatile /* synthetic */ java.lang.Object _state;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1598<R> f20511;

    /* JADX INFO: renamed from: Yue.ۥۡۧۨۥ$ۥ, reason: contains not printable characters */
    public static final class C5556 extends Yue.AbstractC0641<java.lang.Object> {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.C5555<?> f20512;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.AbstractC0637 f20513;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final long f20514;

        public C5556(@Yue.InterfaceC4418 Yue.C5555<?> r3, @Yue.InterfaceC4418 Yue.AbstractC0637 r4) {
                r2 = this;
                r2.<init>()
                r2.f20512 = r3
                r2.f20513 = r4
                Yue.ۥۡۨۡۨ r3 = Yue.C5566.m20859()
                long r0 = r3.m20972()
                r2.f20514 = r0
                r4.m4183(r2)
                return
        }

        @Override // Yue.AbstractC4632
        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AtomicSelectOp(sequence="
                r0.append(r1)
                long r1 = r3.mo4207()
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.AbstractC0641
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo4204(@Yue.InterfaceC4543 java.lang.Object r1, @Yue.InterfaceC4543 java.lang.Object r2) {
                r0 = this;
                r0.m20855(r2)
                Yue.ۥ۟ۢ۟ۥ r1 = r0.f20513
                r1.mo4180(r0, r2)
                return
        }

        @Override // Yue.AbstractC0641
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public long mo4207() {
                r2 = this;
                long r0 = r2.f20514
                return r0
        }

        @Override // Yue.AbstractC0641
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public java.lang.Object mo357(@Yue.InterfaceC4543 java.lang.Object r2) {
                r1 = this;
                if (r2 != 0) goto L9
                java.lang.Object r0 = r1.m20856()
                if (r0 == 0) goto L9
                return r0
            L9:
                Yue.ۥ۟ۢ۟ۥ r0 = r1.f20513     // Catch: java.lang.Throwable -> L10
                java.lang.Object r2 = r0.mo4182(r1)     // Catch: java.lang.Throwable -> L10
                return r2
            L10:
                r0 = move-exception
                if (r2 != 0) goto L16
                r1.m20857()
            L16:
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m20855(java.lang.Object r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r4 = 1
                goto L5
            L4:
                r4 = 0
            L5:
                if (r4 == 0) goto L9
                r0 = 0
                goto Ld
            L9:
                java.lang.Object r0 = Yue.C5566.m20863()
            Ld:
                Yue.ۥۡۧۨۥ<?> r1 = r3.f20512
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.C5555.f20509
                boolean r0 = Yue.C0084.m471(r2, r1, r3, r0)
                if (r0 == 0) goto L1e
                if (r4 == 0) goto L1e
                Yue.ۥۡۧۨۥ<?> r4 = r3.f20512
                Yue.C5555.m20841(r4)
            L1e:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final java.lang.Object m20856() {
                r5 = this;
                Yue.ۥۡۧۨۥ<?> r0 = r5.f20512
            L2:
                java.lang.Object r1 = r0._state
                r2 = 0
                if (r1 != r5) goto L8
                return r2
            L8:
                boolean r3 = r1 instanceof Yue.AbstractC4632
                if (r3 == 0) goto L14
                Yue.ۥۣۣۡۡ r1 = (Yue.AbstractC4632) r1
                Yue.ۥۡۧۨۥ<?> r2 = r5.f20512
                r1.mo4203(r2)
                goto L2
            L14:
                java.lang.Object r3 = Yue.C5566.m20863()
                if (r1 != r3) goto L29
                Yue.ۥۡۧۨۥ<?> r1 = r5.f20512
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = Yue.C5555.f20509
                java.lang.Object r4 = Yue.C5566.m20863()
                boolean r1 = Yue.C0084.m471(r3, r1, r4, r5)
                if (r1 == 0) goto L2
                return r2
            L29:
                java.lang.Object r0 = Yue.C5566.m20861()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m20857() {
                r3 = this;
                Yue.ۥۡۧۨۥ<?> r0 = r3.f20512
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C5555.f20509
                java.lang.Object r2 = Yue.C5566.m20863()
                Yue.C0084.m471(r1, r0, r3, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۨۥ$ۥ۟, reason: contains not printable characters */
    public static final class C5557 extends Yue.C3783 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.InterfaceC1892 f20515;

        public C5557(@Yue.InterfaceC4418 Yue.InterfaceC1892 r1) {
                r0 = this;
                r0.<init>()
                r0.f20515 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۨۥ$ۥ۟۟, reason: contains not printable characters */
    public static final class C5558 extends Yue.AbstractC4632 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.C3783.C3787 f20516;

        public C5558(@Yue.InterfaceC4418 Yue.C3783.C3787 r1) {
                r0 = this;
                r0.<init>()
                r0.f20516 = r1
                return
        }

        @Override // Yue.AbstractC4632
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ */
        public Yue.AbstractC0641<?> mo4202() {
                r1 = this;
                Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟ r0 = r1.f20516
                Yue.ۥ۟ۢ۠ r0 = r0.mo4202()
                return r0
        }

        @Override // Yue.AbstractC4632
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ */
        public java.lang.Object mo4203(@Yue.InterfaceC4543 java.lang.Object r4) {
                r3 = this;
                if (r4 == 0) goto L25
                Yue.ۥۡۧۨۥ r4 = (Yue.C5555) r4
                Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟ r0 = r3.f20516
                r0.m15190()
                Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟ r0 = r3.f20516
                Yue.ۥ۟ۢ۠ r0 = r0.mo4202()
                r1 = 0
                java.lang.Object r0 = r0.m4205(r1)
                if (r0 != 0) goto L1b
                Yue.ۥ۠ۨ۠ۥ$ۥ۟۟۟ r1 = r3.f20516
                Yue.ۥ۠ۨ۠ۥ$ۥ r1 = r1.f12003
                goto L1f
            L1b:
                java.lang.Object r1 = Yue.C5566.m20863()
            L1f:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.C5555.f20509
                Yue.C0084.m471(r2, r4, r3, r1)
                return r0
            L25:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>"
                r4.<init>(r0)
                throw r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۨۥ$ۥ۟۟۟, reason: contains not printable characters */
    public final class C5559 extends Yue.AbstractC3387 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5555<R> f20517;

        public C5559(Yue.C5555 r1) {
                r0 = this;
                r0.f20517 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.mo4448(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        @Override // Yue.AbstractC1419
        /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
        public void mo4448(@Yue.InterfaceC4543 java.lang.Throwable r2) {
                r1 = this;
                Yue.ۥۡۧۨۥ<R> r2 = r1.f20517
                boolean r2 = r2.mo20844()
                if (r2 == 0) goto L15
                Yue.ۥۡۧۨۥ<R> r2 = r1.f20517
                Yue.ۥ۠ۦ۠۟ r0 = r1.m14079()
                java.util.concurrent.CancellationException r0 = r0.mo13982()
                r2.mo20847(r0)
            L15:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۨۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class RunnableC5560 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5555 f20518;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825 f20519;

        public RunnableC5560(Yue.C5555 r1, Yue.InterfaceC2825 r2) {
                r0 = this;
                r0.f20518 = r1
                r0.f20519 = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                Yue.ۥۡۧۨۥ r0 = r2.f20518
                boolean r0 = r0.mo20844()
                if (r0 == 0) goto L13
                Yue.ۥۣ۠ۡ۟ r0 = r2.f20519
                Yue.ۥۡۧۨۥ r1 = r2.f20518
                Yue.ۥ۟ۧۤۢ r1 = r1.mo20846()
                Yue.C0941.m5356(r0, r1)
            L13:
                return
        }
    }

    static {
            java.lang.String r0 = "_state"
            java.lang.Class<Yue.ۥۡۧۨۥ> r1 = Yue.C5555.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.C5555.f20509 = r0
            java.lang.String r0 = "_result"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            Yue.C5555.f20510 = r0
            return
    }

    public C5555(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super R> r1) {
            r0 = this;
            r0.<init>()
            r0.f20511 = r1
            java.lang.Object r1 = Yue.C5566.m20863()
            r0._state = r1
            java.lang.Object r1 = Yue.C5566.m20860()
            r0._result = r1
            r1 = 0
            r0._parentHandle = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    private final void m20840() {
            r7 = this;
            Yue.ۥ۟ۧۦۥ r0 = r7.getContext()
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r1 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = r0.get(r1)
            r1 = r0
            Yue.ۥ۠ۦ۟ۡ r1 = (Yue.InterfaceC3383) r1
            if (r1 != 0) goto L10
            return
        L10:
            Yue.ۥۡۧۨۥ$ۥ۟۟۟ r4 = new Yue.ۥۡۧۨۥ$ۥ۟۟۟
            r4.<init>(r7)
            r5 = 2
            r6 = 0
            r2 = 1
            r3 = 0
            Yue.ۥۣۣ۠۟ r0 = Yue.InterfaceC3383.C3384.m13992(r1, r2, r3, r4, r5, r6)
            r7.m20854(r0)
            boolean r1 = r7.mo20845()
            if (r1 == 0) goto L29
            r0.mo352()
        L29:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final /* synthetic */ void m20841(Yue.C5555 r0) {
            r0.m20849()
            return
    }

    @Override // Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public Yue.InterfaceC1665 getCallerFrame() {
            r2 = this;
            Yue.ۥ۟ۧۤۢ<R> r0 = r2.f20511
            boolean r1 = r0 instanceof Yue.InterfaceC1665
            if (r1 == 0) goto L9
            Yue.ۥ۟ۧۧۨ r0 = (Yue.InterfaceC1665) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC1598
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 getContext() {
            r1 = this;
            Yue.ۥ۟ۧۤۢ<R> r0 = r1.f20511
            Yue.ۥ۟ۧۦۥ r0 = r0.getContext()
            return r0
    }

    @Override // Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC1598
    public void resumeWith(@Yue.InterfaceC4418 java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._result
            java.lang.Object r1 = Yue.C5566.m20860()
            if (r0 != r1) goto L1b
            r0 = 1
            r1 = 0
            java.lang.Object r0 = Yue.C1423.m7054(r4, r1, r0, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C5555.f20510
            java.lang.Object r2 = Yue.C5566.m20860()
            boolean r0 = Yue.C0084.m471(r1, r3, r2, r0)
            if (r0 == 0) goto L0
            goto L53
        L1b:
            java.lang.Object r1 = Yue.C3341.m13947()
            if (r0 != r1) goto L54
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C5555.f20510
            java.lang.Object r1 = Yue.C3341.m13947()
            java.lang.Object r2 = Yue.C5566.m20858()
            boolean r0 = Yue.C0084.m471(r0, r3, r1, r2)
            if (r0 == 0) goto L0
            boolean r0 = Yue.C5388.m20384(r4)
            if (r0 == 0) goto L4e
            Yue.ۥ۟ۧۤۢ<R> r0 = r3.f20511
            java.lang.Throwable r4 = Yue.C5388.m20380(r4)
            Yue.C3329.m13903(r4)
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            java.lang.Object r4 = Yue.C5391.m20390(r4)
            java.lang.Object r4 = Yue.C5388.m20377(r4)
            r0.resumeWith(r4)
            goto L53
        L4e:
            Yue.ۥ۟ۧۤۢ<R> r0 = r3.f20511
            r0.resumeWith(r4)
        L53:
            return
        L54:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            r4.<init>(r0)
            throw r4
    }

    @Override // Yue.C3783
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SelectInstance(state="
            r0.append(r1)
            java.lang.Object r1 = r2._state
            r0.append(r1)
            java.lang.String r1 = ", result="
            r0.append(r1)
            java.lang.Object r1 = r2._result
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC5564
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.Object mo20842(@Yue.InterfaceC4543 Yue.C3783.C3787 r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = Yue.C5566.m20863()
            r2 = 0
            if (r0 != r1) goto L36
            if (r4 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C5555.f20509
            java.lang.Object r1 = Yue.C5566.m20863()
            boolean r0 = Yue.C0084.m471(r0, r3, r1, r2)
            if (r0 != 0) goto L30
            goto L0
        L18:
            Yue.ۥۡۧۨۥ$ۥ۟۟ r0 = new Yue.ۥۡۧۨۥ$ۥ۟۟
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C5555.f20509
            java.lang.Object r2 = Yue.C5566.m20863()
            boolean r1 = Yue.C0084.m471(r1, r3, r2, r0)
            if (r1 == 0) goto L0
            java.lang.Object r4 = r0.mo4203(r3)
            if (r4 == 0) goto L30
            return r4
        L30:
            r3.m20849()
            Yue.ۥۢ۠ۦۢ r4 = Yue.C0935.f2703
            return r4
        L36:
            boolean r1 = r0 instanceof Yue.AbstractC4632
            if (r1 == 0) goto L6a
            if (r4 == 0) goto L64
            Yue.ۥ۟ۢ۠ r1 = r4.mo4202()
            boolean r2 = r1 instanceof Yue.C5555.C5556
            if (r2 == 0) goto L58
            r2 = r1
            Yue.ۥۡۧۨۥ$ۥ r2 = (Yue.C5555.C5556) r2
            Yue.ۥۡۧۨۥ<?> r2 = r2.f20512
            if (r2 == r3) goto L4c
            goto L58
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L58:
            r2 = r0
            Yue.ۥۣۣۡۡ r2 = (Yue.AbstractC4632) r2
            boolean r1 = r1.m18453(r2)
            if (r1 == 0) goto L64
            java.lang.Object r4 = Yue.C0640.f1626
            return r4
        L64:
            Yue.ۥۣۣۡۡ r0 = (Yue.AbstractC4632) r0
            r0.mo4203(r3)
            goto L0
        L6a:
            if (r4 != 0) goto L6d
            return r2
        L6d:
            Yue.ۥ۠ۨ۠ۥ$ۥ r4 = r4.f12003
            if (r0 != r4) goto L74
            Yue.ۥۢ۠ۦۢ r4 = Yue.C0935.f2703
            return r4
        L74:
            return r2
    }

    @Override // Yue.InterfaceC5564
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.lang.Object mo20843(@Yue.InterfaceC4418 Yue.AbstractC0637 r2) {
            r1 = this;
            Yue.ۥۡۧۨۥ$ۥ r0 = new Yue.ۥۡۧۨۥ$ۥ
            r0.<init>(r1, r2)
            r2 = 0
            java.lang.Object r2 = r0.mo4203(r2)
            return r2
    }

    @Override // Yue.InterfaceC5553
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo20834(@Yue.InterfaceC4418 Yue.InterfaceC5561 r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r2) {
            r0 = this;
            r1.mo14088(r0, r2)
            return
    }

    @Override // Yue.InterfaceC5553
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public <Q> void mo20835(@Yue.InterfaceC4418 Yue.InterfaceC5562<? extends Q> r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Q, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r2) {
            r0 = this;
            r1.mo359(r0, r2)
            return
    }

    @Override // Yue.InterfaceC5564
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean mo20844() {
            r4 = this;
            r0 = 0
            java.lang.Object r0 = r4.mo20842(r0)
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0935.f2703
            if (r0 != r1) goto Lb
            r0 = 1
            goto Le
        Lb:
            if (r0 != 0) goto Lf
            r0 = 0
        Le:
            return r0
        Lf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected trySelectIdempotent result "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.InterfaceC5564
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean mo20845() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._state
            java.lang.Object r1 = Yue.C5566.m20863()
            if (r0 != r1) goto La
            r0 = 0
            return r0
        La:
            boolean r1 = r0 instanceof Yue.AbstractC4632
            if (r1 == 0) goto L14
            Yue.ۥۣۣۡۡ r0 = (Yue.AbstractC4632) r0
            r0.mo4203(r2)
            goto L0
        L14:
            r0 = 1
            return r0
    }

    @Override // Yue.InterfaceC5564
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public Yue.InterfaceC1598<R> mo20846() {
            r0 = this;
            return r0
    }

    @Override // Yue.InterfaceC5564
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void mo20847(@Yue.InterfaceC4418 java.lang.Throwable r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._result
            java.lang.Object r1 = Yue.C5566.m20860()
            if (r0 != r1) goto L1d
            Yue.ۥ۟ۦۣۢ r0 = new Yue.ۥ۟ۦۣۢ
            r1 = 2
            r2 = 0
            r3 = 0
            r0.<init>(r5, r3, r1, r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C5555.f20510
            java.lang.Object r2 = Yue.C5566.m20860()
            boolean r0 = Yue.C0084.m471(r1, r4, r2, r0)
            if (r0 == 0) goto L0
            goto L46
        L1d:
            java.lang.Object r1 = Yue.C3341.m13947()
            if (r0 != r1) goto L47
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C5555.f20510
            java.lang.Object r1 = Yue.C3341.m13947()
            java.lang.Object r2 = Yue.C5566.m20858()
            boolean r0 = Yue.C0084.m471(r0, r4, r1, r2)
            if (r0 == 0) goto L0
            Yue.ۥ۟ۧۤۢ<R> r0 = r4.f20511
            Yue.ۥ۟ۧۤۢ r0 = Yue.C3332.m13940(r0)
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            java.lang.Object r5 = Yue.C5391.m20390(r5)
            java.lang.Object r5 = Yue.C5388.m20377(r5)
            r0.resumeWith(r5)
        L46:
            return
        L47:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            r5.<init>(r0)
            throw r5
    }

    @Override // Yue.InterfaceC5553
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public <P, Q> void mo20836(@Yue.InterfaceC4418 Yue.InterfaceC5563<? super P, ? extends Q> r1, P r2, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Q, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r3) {
            r0 = this;
            r1.mo512(r0, r2, r3)
            return
    }

    @Override // Yue.InterfaceC5564
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void mo20848(@Yue.InterfaceC4418 Yue.InterfaceC1892 r3) {
            r2 = this;
            Yue.ۥۡۧۨۥ$ۥ۟ r0 = new Yue.ۥۡۧۨۥ$ۥ۟
            r0.<init>(r3)
            boolean r1 = r2.mo20845()
            if (r1 != 0) goto L15
            r2.m15159(r0)
            boolean r0 = r2.mo20845()
            if (r0 != 0) goto L15
            return
        L15:
            r3.mo352()
            return
    }

    @Override // Yue.InterfaceC5553
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo20837(long r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r5) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L14
            boolean r3 = r2.mo20844()
            if (r3 == 0) goto L13
            Yue.ۥ۟ۧۤۢ r3 = r2.mo20846()
            Yue.C6589.m25377(r5, r3)
        L13:
            return
        L14:
            Yue.ۥۡۧۨۥ$ۥ۟۟۟۟ r0 = new Yue.ۥۡۧۨۥ$ۥ۟۟۟۟
            r0.<init>(r2, r5)
            Yue.ۥ۟ۧۦۥ r5 = r2.getContext()
            Yue.ۥ۟ۨۨ r5 = Yue.C1804.m8492(r5)
            Yue.ۥ۟ۧۦۥ r1 = r2.getContext()
            Yue.ۥۣۣ۠۟ r3 = r5.mo8438(r3, r0, r1)
            r2.mo20848(r3)
            return
    }

    @Override // Yue.InterfaceC5553
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public <P, Q> void mo20838(@Yue.InterfaceC4418 Yue.InterfaceC5563<? super P, ? extends Q> r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Q, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r2) {
            r0 = this;
            Yue.InterfaceC5553.C5554.m20839(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public final void m20849() {
            r2 = this;
            Yue.ۥۣۣ۠۟ r0 = r2.m20851()
            if (r0 == 0) goto L9
            r0.mo352()
        L9:
            java.lang.Object r0 = r2.m15170()
            Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
        Lf:
            boolean r1 = Yue.C3329.m13897(r0, r2)
            if (r1 != 0) goto L26
            boolean r1 = r0 instanceof Yue.C5555.C5557
            if (r1 == 0) goto L21
            r1 = r0
            Yue.ۥۡۧۨۥ$ۥ۟ r1 = (Yue.C5555.C5557) r1
            Yue.ۥۣۣ۠۟ r1 = r1.f20515
            r1.mo352()
        L21:
            Yue.ۥ۠ۨ۠ۥ r0 = r0.m15171()
            goto Lf
        L26:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final void m20850(Yue.InterfaceC2823<? extends java.lang.Object> r4, Yue.InterfaceC2823<Yue.C6593> r5) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._result
            java.lang.Object r1 = Yue.C5566.m20860()
            if (r0 != r1) goto L19
            java.lang.Object r0 = r4.invoke()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C5555.f20510
            java.lang.Object r2 = Yue.C5566.m20860()
            boolean r0 = Yue.C0084.m471(r1, r3, r2, r0)
            if (r0 == 0) goto L0
            return
        L19:
            java.lang.Object r1 = Yue.C3341.m13947()
            if (r0 != r1) goto L33
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C5555.f20510
            java.lang.Object r1 = Yue.C3341.m13947()
            java.lang.Object r2 = Yue.C5566.m20858()
            boolean r0 = Yue.C0084.m471(r0, r3, r1, r2)
            if (r0 == 0) goto L0
            r5.invoke()
            return
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already resumed"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final Yue.InterfaceC1892 m20851() {
            r1 = this;
            java.lang.Object r0 = r1._parentHandle
            Yue.ۥۣۣ۠۟ r0 = (Yue.InterfaceC1892) r0
            return r0
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final java.lang.Object m20852() {
            r3 = this;
            boolean r0 = r3.mo20845()
            if (r0 != 0) goto L9
            r3.m20840()
        L9:
            java.lang.Object r0 = r3._result
            java.lang.Object r1 = Yue.C5566.m20860()
            if (r0 != r1) goto L28
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C5555.f20510
            java.lang.Object r1 = Yue.C5566.m20860()
            java.lang.Object r2 = Yue.C3341.m13947()
            boolean r0 = Yue.C0084.m471(r0, r3, r1, r2)
            if (r0 == 0) goto L26
            java.lang.Object r0 = Yue.C3341.m13947()
            return r0
        L26:
            java.lang.Object r0 = r3._result
        L28:
            java.lang.Object r1 = Yue.C5566.m20858()
            if (r0 == r1) goto L38
            boolean r1 = r0 instanceof Yue.C1417
            if (r1 != 0) goto L33
            return r0
        L33:
            Yue.ۥ۟ۦۣۢ r0 = (Yue.C1417) r0
            java.lang.Throwable r0 = r0.f4520
            throw r0
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final void m20853(@Yue.InterfaceC4418 java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r2.mo20844()
            if (r0 == 0) goto L14
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
            java.lang.Object r3 = Yue.C5391.m20390(r3)
            java.lang.Object r3 = Yue.C5388.m20377(r3)
            r2.resumeWith(r3)
            goto L2d
        L14:
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L2d
            java.lang.Object r0 = r2.m20852()
            boolean r1 = r0 instanceof Yue.C1417
            if (r1 == 0) goto L26
            Yue.ۥ۟ۦۣۢ r0 = (Yue.C1417) r0
            java.lang.Throwable r0 = r0.f4520
            if (r0 == r3) goto L2d
        L26:
            Yue.ۥ۟ۧۦۥ r0 = r2.getContext()
            Yue.C1650.m7933(r0, r3)
        L2d:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final void m20854(Yue.InterfaceC1892 r1) {
            r0 = this;
            r0._parentHandle = r1
            return
    }
}
