package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5942<T> extends Yue.AbstractC0094<Yue.C5945> implements Yue.InterfaceC4320<T>, Yue.InterfaceC0937<T>, Yue.InterfaceC2855<T> {

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _state;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f21665;

    /* JADX INFO: renamed from: Yue.ۥۢ۠۟ۢ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {386, 398, 403}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class C5943 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f21666;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public java.lang.Object f21667;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public java.lang.Object f21668;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public java.lang.Object f21669;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public java.lang.Object f21670;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f21671;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5942<T> f21672;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public int f21673;

        public C5943(Yue.C5942<T> r1, Yue.InterfaceC1598<? super Yue.C5942.C5943> r2) {
                r0 = this;
                r0.f21672 = r1
                r0.<init>(r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f21671 = r2
                int r2 = r1.f21673
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f21673 = r2
                Yue.ۥۢ۠۟ۢ<T> r2 = r1.f21672
                r0 = 0
                java.lang.Object r2 = r2.mo392(r0, r1)
                return r2
        }
    }

    public C5942(@Yue.InterfaceC4418 java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0._state = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m22035() {
            return
    }

    @Override // Yue.InterfaceC4320, Yue.InterfaceC5941
    public T getValue() {
            r2 = this;
            Yue.ۥۢ۠ۦۢ r0 = Yue.C4542.f14549
            java.lang.Object r1 = r2._state
            if (r1 != r0) goto L7
            r1 = 0
        L7:
            return r1
    }

    @Override // Yue.InterfaceC4320
    public void setValue(T r2) {
            r1 = this;
            if (r2 != 0) goto L4
            Yue.ۥۢ۠ۦۢ r2 = Yue.C4542.f14549
        L4:
            r0 = 0
            r1.m22038(r0, r2)
            return
    }

    @Override // Yue.InterfaceC5741, Yue.InterfaceC2464
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ */
    public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r11, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r12) {
            r10 = this;
            boolean r0 = r12 instanceof Yue.C5942.C5943
            if (r0 == 0) goto L13
            r0 = r12
            Yue.ۥۢ۠۟ۢ$ۥ r0 = (Yue.C5942.C5943) r0
            int r1 = r0.f21673
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21673 = r1
            goto L18
        L13:
            Yue.ۥۢ۠۟ۢ$ۥ r0 = new Yue.ۥۢ۠۟ۢ$ۥ
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f21671
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f21673
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L77
            if (r2 == r6) goto L65
            if (r2 == r5) goto L4e
            if (r2 != r4) goto L46
            java.lang.Object r11 = r0.f21670
            java.lang.Object r2 = r0.f21669
            Yue.ۥ۠ۦ۟ۡ r2 = (Yue.InterfaceC3383) r2
            java.lang.Object r6 = r0.f21668
            Yue.ۥۢ۠۟ۤ r6 = (Yue.C5945) r6
            java.lang.Object r7 = r0.f21667
            Yue.ۥۣۣ۠ۢ r7 = (Yue.InterfaceC2466) r7
            java.lang.Object r8 = r0.f21666
            Yue.ۥۢ۠۟ۢ r8 = (Yue.C5942) r8
            Yue.C5391.m20403(r12)     // Catch: java.lang.Throwable -> L43
            goto Lab
        L43:
            r11 = move-exception
            goto Lee
        L46:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L4e:
            java.lang.Object r11 = r0.f21670
            java.lang.Object r2 = r0.f21669
            Yue.ۥ۠ۦ۟ۡ r2 = (Yue.InterfaceC3383) r2
            java.lang.Object r6 = r0.f21668
            Yue.ۥۢ۠۟ۤ r6 = (Yue.C5945) r6
            java.lang.Object r7 = r0.f21667
            Yue.ۥۣۣ۠ۢ r7 = (Yue.InterfaceC2466) r7
            java.lang.Object r8 = r0.f21666
            Yue.ۥۢ۠۟ۢ r8 = (Yue.C5942) r8
            Yue.C5391.m20403(r12)     // Catch: java.lang.Throwable -> L43
            goto Ld5
        L65:
            java.lang.Object r11 = r0.f21668
            r6 = r11
            Yue.ۥۢ۠۟ۤ r6 = (Yue.C5945) r6
            java.lang.Object r11 = r0.f21667
            Yue.ۥۣۣ۠ۢ r11 = (Yue.InterfaceC2466) r11
            java.lang.Object r2 = r0.f21666
            r8 = r2
            Yue.ۥۢ۠۟ۢ r8 = (Yue.C5942) r8
            Yue.C5391.m20403(r12)     // Catch: java.lang.Throwable -> L43
            goto L9c
        L77:
            Yue.C5391.m20403(r12)
            Yue.ۥ۟۟ۢۦ r12 = r10.m518()
            Yue.ۥۢ۠۟ۤ r12 = (Yue.C5945) r12
            boolean r2 = r11 instanceof Yue.C6037     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L9a
            r2 = r11
            Yue.ۥۣۢ۠ۨ r2 = (Yue.C6037) r2     // Catch: java.lang.Throwable -> L96
            r0.f21666 = r10     // Catch: java.lang.Throwable -> L96
            r0.f21667 = r11     // Catch: java.lang.Throwable -> L96
            r0.f21668 = r12     // Catch: java.lang.Throwable -> L96
            r0.f21673 = r6     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r2.m22715(r0)     // Catch: java.lang.Throwable -> L96
            if (r2 != r1) goto L9a
            return r1
        L96:
            r11 = move-exception
            r8 = r10
            r6 = r12
            goto Lee
        L9a:
            r8 = r10
            r6 = r12
        L9c:
            Yue.ۥ۟ۧۦۥ r12 = r0.getContext()     // Catch: java.lang.Throwable -> L43
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r2 = Yue.InterfaceC3383.f10824     // Catch: java.lang.Throwable -> L43
            Yue.ۥ۟ۧۦۥ$ۥ۟ r12 = r12.get(r2)     // Catch: java.lang.Throwable -> L43
            Yue.ۥ۠ۦ۟ۡ r12 = (Yue.InterfaceC3383) r12     // Catch: java.lang.Throwable -> L43
            r7 = r11
            r2 = r12
            r11 = r3
        Lab:
            java.lang.Object r12 = r8._state     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto Lb2
            Yue.C3399.m14046(r2)     // Catch: java.lang.Throwable -> L43
        Lb2:
            if (r11 == 0) goto Lba
            boolean r9 = Yue.C3329.m13897(r11, r12)     // Catch: java.lang.Throwable -> L43
            if (r9 != 0) goto Ld5
        Lba:
            Yue.ۥۢ۠ۦۢ r11 = Yue.C4542.f14549     // Catch: java.lang.Throwable -> L43
            if (r12 != r11) goto Lc0
            r11 = r3
            goto Lc1
        Lc0:
            r11 = r12
        Lc1:
            r0.f21666 = r8     // Catch: java.lang.Throwable -> L43
            r0.f21667 = r7     // Catch: java.lang.Throwable -> L43
            r0.f21668 = r6     // Catch: java.lang.Throwable -> L43
            r0.f21669 = r2     // Catch: java.lang.Throwable -> L43
            r0.f21670 = r12     // Catch: java.lang.Throwable -> L43
            r0.f21673 = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Object r11 = r7.mo5352(r11, r0)     // Catch: java.lang.Throwable -> L43
            if (r11 != r1) goto Ld4
            return r1
        Ld4:
            r11 = r12
        Ld5:
            boolean r12 = r6.m22052()     // Catch: java.lang.Throwable -> L43
            if (r12 != 0) goto Lab
            r0.f21666 = r8     // Catch: java.lang.Throwable -> L43
            r0.f21667 = r7     // Catch: java.lang.Throwable -> L43
            r0.f21668 = r6     // Catch: java.lang.Throwable -> L43
            r0.f21669 = r2     // Catch: java.lang.Throwable -> L43
            r0.f21670 = r11     // Catch: java.lang.Throwable -> L43
            r0.f21673 = r4     // Catch: java.lang.Throwable -> L43
            java.lang.Object r12 = r6.m22049(r0)     // Catch: java.lang.Throwable -> L43
            if (r12 != r1) goto Lab
            return r1
        Lee:
            r8.m522(r6)
            throw r11
    }

    @Override // Yue.InterfaceC5741
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    public java.util.List<T> mo19669() {
            r1 = this;
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = Yue.C1207.m6190(r0)
            return r0
    }

    @Override // Yue.InterfaceC2855
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.InterfaceC2464<T> mo5533(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, int r2, @Yue.InterfaceC4418 Yue.EnumC0847 r3) {
            r0 = this;
            Yue.ۥۣ۠ۢۡ r1 = Yue.C5944.m22042(r0, r1, r2, r3)
            return r1
    }

    @Override // Yue.InterfaceC4319, Yue.InterfaceC2466
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public java.lang.Object mo5352(T r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2) {
            r0 = this;
            r0.setValue(r1)
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
    }

    @Override // Yue.AbstractC0094
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public /* bridge */ /* synthetic */ Yue.AbstractC0096 mo519() {
            r1 = this;
            Yue.ۥۢ۠۟ۤ r0 = r1.m22036()
            return r0
    }

    @Override // Yue.AbstractC0094
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public /* bridge */ /* synthetic */ Yue.AbstractC0096[] mo520(int r1) {
            r0 = this;
            Yue.ۥۢ۠۟ۤ[] r1 = r0.m22037(r1)
            return r1
    }

    @Override // Yue.InterfaceC4320
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo16929(T r1, T r2) {
            r0 = this;
            if (r1 != 0) goto L4
            Yue.ۥۢ۠ۦۢ r1 = Yue.C4542.f14549
        L4:
            if (r2 != 0) goto L8
            Yue.ۥۢ۠ۦۢ r2 = Yue.C4542.f14549
        L8:
            boolean r1 = r0.m22038(r1, r2)
            return r1
    }

    @Override // Yue.InterfaceC4319
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo16926() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "MutableStateFlow.resetReplayCache is not supported"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.C5945 m22036() {
            r1 = this;
            Yue.ۥۢ۠۟ۤ r0 = new Yue.ۥۢ۠۟ۤ
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Yue.C5945[] m22037(int r1) {
            r0 = this;
            Yue.ۥۢ۠۟ۤ[] r1 = new Yue.C5945[r1]
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m22038(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            r6.m524()
            monitor-enter(r6)
            java.lang.Object r0 = r6._state     // Catch: java.lang.Throwable -> L11
            r1 = 0
            if (r7 == 0) goto L13
            boolean r7 = Yue.C3329.m13897(r0, r7)     // Catch: java.lang.Throwable -> L11
            if (r7 != 0) goto L13
            monitor-exit(r6)
            return r1
        L11:
            r7 = move-exception
            goto L5f
        L13:
            boolean r7 = Yue.C3329.m13897(r0, r8)     // Catch: java.lang.Throwable -> L11
            r0 = 1
            if (r7 == 0) goto L1c
            monitor-exit(r6)
            return r0
        L1c:
            r6._state = r8     // Catch: java.lang.Throwable -> L11
            int r7 = r6.f21665     // Catch: java.lang.Throwable -> L11
            r8 = r7 & 1
            if (r8 != 0) goto L59
            int r7 = r7 + r0
            r6.f21665 = r7     // Catch: java.lang.Throwable -> L11
            Yue.ۥ۟۟ۢۦ[] r8 = r6.m524()     // Catch: java.lang.Throwable -> L11
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L11
            monitor-exit(r6)
        L2e:
            Yue.ۥۢ۠۟ۤ[] r8 = (Yue.C5945[]) r8
            if (r8 == 0) goto L40
            int r2 = r8.length
            r3 = r1
        L34:
            if (r3 >= r2) goto L40
            r4 = r8[r3]
            if (r4 == 0) goto L3d
            r4.m22051()
        L3d:
            int r3 = r3 + 1
            goto L34
        L40:
            monitor-enter(r6)
            int r8 = r6.f21665     // Catch: java.lang.Throwable -> L4a
            if (r8 != r7) goto L4c
            int r7 = r7 + r0
            r6.f21665 = r7     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r6)
            return r0
        L4a:
            r7 = move-exception
            goto L57
        L4c:
            Yue.ۥ۟۟ۢۦ[] r7 = r6.m524()     // Catch: java.lang.Throwable -> L4a
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L2e
        L57:
            monitor-exit(r6)
            throw r7
        L59:
            int r7 = r7 + 2
            r6.f21665 = r7     // Catch: java.lang.Throwable -> L11
            monitor-exit(r6)
            return r0
        L5f:
            monitor-exit(r6)
            throw r7
    }

    @Override // Yue.InterfaceC4319
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public boolean mo16927(T r1) {
            r0 = this;
            r0.setValue(r1)
            r1 = 1
            return r1
    }
}
