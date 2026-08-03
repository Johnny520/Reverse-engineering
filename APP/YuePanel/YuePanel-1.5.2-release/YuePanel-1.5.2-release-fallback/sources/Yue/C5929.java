package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5929 implements Yue.InterfaceC5754 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final long f21604;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long f21605;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۨۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    public static final class C5930 extends Yue.AbstractC6067 implements Yue.InterfaceC2841<Yue.InterfaceC2466<? super Yue.EnumC5752>, java.lang.Integer, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f21606;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f21607;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ int f21608;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5929 f21609;

        public C5930(Yue.C5929 r1, Yue.InterfaceC1598<? super Yue.C5929.C5930> r2) {
                r0 = this;
                r0.f21609 = r1
                r1 = 3
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r9.f21606
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f21607
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                Yue.C5391.m20403(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f21607
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                Yue.C5391.m20403(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f21607
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                Yue.C5391.m20403(r10)
                goto L64
            L38:
                Yue.C5391.m20403(r10)
                goto L9c
            L3c:
                Yue.C5391.m20403(r10)
                java.lang.Object r10 = r9.f21607
                r1 = r10
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                int r10 = r9.f21608
                if (r10 <= 0) goto L53
                Yue.ۥۡۨۨۦ r10 = Yue.EnumC5752.f21193
                r9.f21606 = r6
                java.lang.Object r10 = r1.mo5352(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                Yue.ۥۢ۟ۨۨ r10 = r9.f21609
                long r6 = Yue.C5929.m22005(r10)
                r9.f21607 = r1
                r9.f21606 = r5
                java.lang.Object r10 = Yue.C1804.m8490(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                Yue.ۥۢ۟ۨۨ r10 = r9.f21609
                long r5 = Yue.C5929.m22004(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                Yue.ۥۡۨۨۦ r10 = Yue.EnumC5752.f21194
                r9.f21607 = r1
                r9.f21606 = r4
                java.lang.Object r10 = r1.mo5352(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                Yue.ۥۢ۟ۨۨ r10 = r9.f21609
                long r4 = Yue.C5929.m22004(r10)
                r9.f21607 = r1
                r9.f21606 = r3
                java.lang.Object r10 = Yue.C1804.m8490(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                Yue.ۥۡۨۨۦ r10 = Yue.EnumC5752.f21195
                r3 = 0
                r9.f21607 = r3
                r9.f21606 = r2
                java.lang.Object r10 = r1.mo5352(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                Yue.ۥۣۢ۠ۤ r10 = Yue.C6593.f23016
                return r10
        }

        @Override // Yue.InterfaceC2841
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public /* bridge */ /* synthetic */ java.lang.Object mo11720(Yue.InterfaceC2466<? super Yue.EnumC5752> r1, java.lang.Integer r2, Yue.InterfaceC1598<? super Yue.C6593> r3) {
                r0 = this;
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                Yue.ۥ۟ۧۤۢ r3 = (Yue.InterfaceC1598) r3
                java.lang.Object r1 = r0.m22006(r1, r2, r3)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m22006(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super Yue.EnumC5752> r3, int r4, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r5) {
                r2 = this;
                Yue.ۥۢ۟ۨۨ$ۥ r0 = new Yue.ۥۢ۟ۨۨ$ۥ
                Yue.ۥۢ۟ۨۨ r1 = r2.f21609
                r0.<init>(r1, r5)
                r0.f21607 = r3
                r0.f21608 = r4
                Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
                java.lang.Object r3 = r0.invokeSuspend(r3)
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۨۨ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C5931 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.EnumC5752, Yue.InterfaceC1598<? super java.lang.Boolean>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f21610;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f21611;

        public C5931(Yue.InterfaceC1598<? super Yue.C5929.C5931> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r3) {
                r1 = this;
                Yue.ۥۢ۟ۨۨ$ۥ۟ r0 = new Yue.ۥۢ۟ۨۨ$ۥ۟
                r0.<init>(r3)
                r0.f21611 = r2
                return r0
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.EnumC5752 r1, Yue.InterfaceC1598<? super java.lang.Boolean> r2) {
                r0 = this;
                Yue.ۥۡۨۨۦ r1 = (Yue.EnumC5752) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m22007(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                Yue.C3341.m13947()
                int r0 = r1.f21610
                if (r0 != 0) goto L1a
                Yue.C5391.m20403(r2)
                java.lang.Object r2 = r1.f21611
                Yue.ۥۡۨۨۦ r2 = (Yue.EnumC5752) r2
                Yue.ۥۡۨۨۦ r0 = Yue.EnumC5752.f21193
                if (r2 == r0) goto L14
                r2 = 1
                goto L15
            L14:
                r2 = 0
            L15:
                java.lang.Boolean r2 = Yue.C0828.m4773(r2)
                return r2
            L1a:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m22007(@Yue.InterfaceC4418 Yue.EnumC5752 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super java.lang.Boolean> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥۢ۟ۨۨ$ۥ۟ r1 = (Yue.C5929.C5931) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    public C5929(long r5, long r7) {
            r4 = this;
            r4.<init>()
            r4.f21604 = r5
            r4.f21605 = r7
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            java.lang.String r3 = " ms) cannot be negative"
            if (r2 < 0) goto L32
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 < 0) goto L14
            return
        L14:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "replayExpiration("
            r5.append(r6)
            r5.append(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L32:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "stopTimeout("
            r7.append(r8)
            r7.append(r5)
            r7.append(r3)
            java.lang.String r5 = r7.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ long m22004(Yue.C5929 r2) {
            long r0 = r2.f21605
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ long m22005(Yue.C5929 r2) {
            long r0 = r2.f21604
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof Yue.C5929
            if (r0 == 0) goto L18
            long r0 = r4.f21604
            Yue.ۥۢ۟ۨۨ r5 = (Yue.C5929) r5
            long r2 = r5.f21604
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
            long r0 = r4.f21605
            long r2 = r5.f21605
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            return r5
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    public int hashCode() {
            r3 = this;
            long r0 = r3.f21604
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f21605
            int r1 = java.lang.Long.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r11 = this;
            r0 = 2
            java.util.List r0 = Yue.C1207.m6189(r0)
            long r1 = r11.f21604
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r2 = "ms"
            if (r1 <= 0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "stopTimeout="
            r1.append(r3)
            long r3 = r11.f21604
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L28:
            long r3 = r11.f21605
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L4c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "replayExpiration="
            r1.append(r3)
            long r3 = r11.f21605
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L4c:
            java.util.List r2 = Yue.C1207.m6180(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SharingStarted.WhileSubscribed("
            r0.append(r1)
            r9 = 63
            r10 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r1 = Yue.C1219.m6398(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC5754
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC2464<Yue.EnumC5752> mo21487(@Yue.InterfaceC4418 Yue.InterfaceC5941<java.lang.Integer> r3) {
            r2 = this;
            Yue.ۥۢ۟ۨۨ$ۥ r0 = new Yue.ۥۢ۟ۨۨ$ۥ
            r1 = 0
            r0.<init>(r2, r1)
            Yue.ۥۣ۠ۢۡ r3 = Yue.C2472.m11656(r3, r0)
            Yue.ۥۢ۟ۨۨ$ۥ۟ r0 = new Yue.ۥۢ۟ۨۨ$ۥ۟
            r0.<init>(r1)
            Yue.ۥۣ۠ۢۡ r3 = Yue.C2472.m11561(r3, r0)
            Yue.ۥۣ۠ۢۡ r3 = Yue.C2472.m11557(r3)
            return r3
    }
}
