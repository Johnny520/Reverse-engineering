package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6255 {

    /* JADX INFO: renamed from: Yue.ۥۢۡۥ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {100}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    public static final class C6256<T> extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public long f22306;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public java.lang.Object f22307;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public java.lang.Object f22308;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f22309;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f22310;

        public C6256(Yue.InterfaceC1598<? super Yue.C6255.C6256> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r3) {
                r2 = this;
                r2.f22309 = r3
                int r3 = r2.f22310
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r3 | r0
                r2.f22310 = r3
                r0 = 0
                r3 = 0
                java.lang.Object r3 = Yue.C6255.m23314(r0, r3, r2)
                return r3
        }
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.C6253 m23310(long r3, @Yue.InterfaceC4418 Yue.InterfaceC3383 r5) {
            Yue.ۥۢۡۤۨ r0 = new Yue.ۥۢۡۤۨ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Timed out waiting for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " ms"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r5)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <U, T extends U> java.lang.Object m23311(Yue.RunnableC6254<U, ? super T> r4, Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r5) {
            Yue.ۥ۟ۧۤۢ<T> r0 = r4.f20408
            Yue.ۥ۟ۧۦۥ r0 = r0.getContext()
            Yue.ۥ۟ۨۨ r0 = Yue.C1804.m8492(r0)
            long r1 = r4.f22305
            Yue.ۥ۟ۧۦۥ r3 = r4.getContext()
            Yue.ۥۣۣ۠۟ r0 = r0.mo8438(r1, r4, r3)
            Yue.C3399.m14044(r4, r0)
            java.lang.Object r4 = Yue.C6589.m25381(r4, r4, r5)
            return r4
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> java.lang.Object m23312(long r2, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r5) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L19
            Yue.ۥۢۡۥ r0 = new Yue.ۥۢۡۥ
            r0.<init>(r2, r5)
            java.lang.Object r2 = m23311(r0, r4)
            java.lang.Object r3 = Yue.C3341.m13947()
            if (r2 != r3) goto L18
            Yue.C1757.m8349(r5)
        L18:
            return r2
        L19:
            Yue.ۥۢۡۤۨ r2 = new Yue.ۥۢۡۤۨ
            java.lang.String r3 = "Timed out immediately"
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> java.lang.Object m23313(long r0, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r3) {
            long r0 = Yue.C1804.m8493(r0)
            java.lang.Object r0 = m23312(r0, r2, r3)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> java.lang.Object m23314(long r7, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r9, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r10) {
            boolean r0 = r10 instanceof Yue.C6255.C6256
            if (r0 == 0) goto L13
            r0 = r10
            Yue.ۥۢۡۥ۟$ۥ r0 = (Yue.C6255.C6256) r0
            int r1 = r0.f22310
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22310 = r1
            goto L18
        L13:
            Yue.ۥۢۡۥ۟$ۥ r0 = new Yue.ۥۢۡۥ۟$ۥ
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f22309
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f22310
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f22308
            Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ r7 = (Yue.C5264.C5272) r7
            java.lang.Object r8 = r0.f22307
            Yue.ۥۣ۠ۢۢ r8 = (Yue.InterfaceC2839) r8
            Yue.C5391.m20403(r10)     // Catch: Yue.C6253 -> L32
            goto L6f
        L32:
            r8 = move-exception
            goto L70
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            Yue.C5391.m20403(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ r10 = new Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ
            r10.<init>()
            r0.f22307 = r9     // Catch: Yue.C6253 -> L68
            r0.f22308 = r10     // Catch: Yue.C6253 -> L68
            r0.f22306 = r7     // Catch: Yue.C6253 -> L68
            r0.f22310 = r4     // Catch: Yue.C6253 -> L68
            Yue.ۥۢۡۥ r2 = new Yue.ۥۢۡۥ     // Catch: Yue.C6253 -> L68
            r2.<init>(r7, r0)     // Catch: Yue.C6253 -> L68
            r10.f19776 = r2     // Catch: Yue.C6253 -> L68
            java.lang.Object r7 = m23311(r2, r9)     // Catch: Yue.C6253 -> L68
            java.lang.Object r8 = Yue.C3341.m13947()     // Catch: Yue.C6253 -> L68
            if (r7 != r8) goto L6b
            Yue.C1757.m8349(r0)     // Catch: Yue.C6253 -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L70
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r10 = r7
        L6f:
            return r10
        L70:
            Yue.ۥ۠ۦ۟ۡ r9 = r8.f22304
            T r7 = r7.f19776
            if (r9 != r7) goto L77
            return r3
        L77:
            throw r8
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> java.lang.Object m23315(long r0, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC1662, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r3) {
            long r0 = Yue.C1804.m8493(r0)
            java.lang.Object r0 = m23314(r0, r2, r3)
            return r0
    }
}
