package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1739 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.C5911 f5410;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public final long f5411;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.ref.WeakReference<Yue.InterfaceC1632> f5412;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public java.lang.String f5413;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public java.lang.Thread f5414;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public java.lang.ref.WeakReference<Yue.InterfaceC1665> f5415;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class C1740 extends Yue.AbstractC5386 implements Yue.InterfaceC2839<Yue.AbstractC5611<? super java.lang.StackTraceElement>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f5416;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f5417;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1739 f5418;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5911 f5419;

        public C1740(Yue.C1739 r1, Yue.C5911 r2, Yue.InterfaceC1598<? super Yue.C1739.C1740> r3) {
                r0 = this;
                r0.f5418 = r1
                r0.f5419 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r5) {
                r3 = this;
                Yue.ۥۣ۟ۨۥ$ۥ r0 = new Yue.ۥۣ۟ۨۥ$ۥ
                Yue.ۥۣ۟ۨۥ r1 = r3.f5418
                Yue.ۥۢ۟ۧۥ r2 = r3.f5419
                r0.<init>(r1, r2, r5)
                r0.f5417 = r4
                return r0
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.AbstractC5611<? super java.lang.StackTraceElement> r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥۡۨۢ۠ r1 = (Yue.AbstractC5611) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m8282(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r4.f5416
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r5)
                goto L2f
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                Yue.C5391.m20403(r5)
                java.lang.Object r5 = r4.f5417
                Yue.ۥۡۨۢ۠ r5 = (Yue.AbstractC5611) r5
                Yue.ۥۣ۟ۨۥ r1 = r4.f5418
                Yue.ۥۢ۟ۧۥ r3 = r4.f5419
                Yue.ۥ۟ۧۧۨ r3 = r3.getCallerFrame()
                r4.f5416 = r2
                java.lang.Object r5 = Yue.C1739.m8271(r1, r5, r3, r4)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                return r5
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m8282(@Yue.InterfaceC4418 Yue.AbstractC5611<? super java.lang.StackTraceElement> r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥۣ۟ۨۥ$ۥ r1 = (Yue.C1739.C1740) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {80}, m = "yieldFrames", n = {}, s = {})
    public static final class C1741 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f5420;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public java.lang.Object f5421;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public java.lang.Object f5422;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f5423;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1739 f5424;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f5425;

        public C1741(Yue.C1739 r1, Yue.InterfaceC1598<? super Yue.C1739.C1741> r2) {
                r0 = this;
                r0.f5424 = r1
                r0.<init>(r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f5423 = r2
                int r2 = r1.f5425
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f5425 = r2
                Yue.ۥۣ۟ۨۥ r2 = r1.f5424
                r0 = 0
                java.lang.Object r2 = Yue.C1739.m8271(r2, r0, r0, r1)
                return r2
        }
    }

    public C1739(@Yue.InterfaceC4543 Yue.InterfaceC1632 r1, @Yue.InterfaceC4543 Yue.C5911 r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.f5410 = r2
            r0.f5411 = r3
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.f5412 = r2
            java.lang.String r1 = "CREATED"
            r0.f5413 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m8271(Yue.C1739 r0, Yue.AbstractC5611 r1, Yue.InterfaceC1665 r2, Yue.InterfaceC1598 r3) {
            java.lang.Object r0 = r0.m8281(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DebugCoroutineInfo(state="
            r0.append(r1)
            java.lang.String r1 = r2.m8277()
            r0.append(r1)
            java.lang.String r1 = ",context="
            r0.append(r1)
            Yue.ۥ۟ۧۦۥ r1 = r2.m8273()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.List<java.lang.StackTraceElement> m8272() {
            r3 = this;
            Yue.ۥۢ۟ۧۥ r0 = r3.f5410
            if (r0 != 0) goto L9
            java.util.List r0 = Yue.C1208.m6210()
            return r0
        L9:
            Yue.ۥۣ۟ۨۥ$ۥ r1 = new Yue.ۥۣ۟ۨۥ$ۥ
            r2 = 0
            r1.<init>(r3, r0, r2)
            Yue.ۥۡۨۢ r0 = Yue.C5613.m20982(r1)
            java.util.List r0 = Yue.C5629.m21197(r0)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC1632 m8273() {
            r1 = this;
            java.lang.ref.WeakReference<Yue.ۥ۟ۧۦۥ> r0 = r1.f5412
            java.lang.Object r0 = r0.get()
            Yue.ۥ۟ۧۦۥ r0 = (Yue.InterfaceC1632) r0
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C5911 m8274() {
            r1 = this;
            Yue.ۥۢ۟ۧۥ r0 = r1.f5410
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.util.List<java.lang.StackTraceElement> m8275() {
            r1 = this;
            java.util.List r0 = r1.m8272()
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Yue.InterfaceC1665 m8276() {
            r1 = this;
            java.lang.ref.WeakReference<Yue.ۥ۟ۧۧۨ> r0 = r1.f5415
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            Yue.ۥ۟ۧۧۨ r0 = (Yue.InterfaceC1665) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.lang.String m8277() {
            r1 = this;
            java.lang.String r0 = r1.f5413
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.util.List<java.lang.StackTraceElement> m8278() {
            r3 = this;
            Yue.ۥ۟ۧۧۨ r0 = r3.m8276()
            if (r0 != 0) goto Lb
            java.util.List r0 = Yue.C1208.m6210()
            return r0
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L10:
            if (r0 == 0) goto L20
            java.lang.StackTraceElement r2 = r0.getStackTraceElement()
            if (r2 == 0) goto L1b
            r1.add(r2)
        L1b:
            Yue.ۥ۟ۧۧۨ r0 = r0.getCallerFrame()
            goto L10
        L20:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m8279(@Yue.InterfaceC4543 Yue.InterfaceC1665 r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.f5415 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m8280(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
            r2 = this;
            java.lang.String r0 = r2.f5413
            boolean r0 = Yue.C3329.m13897(r0, r3)
            if (r0 == 0) goto L17
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L17
            Yue.ۥ۟ۧۧۨ r0 = r2.m8276()
            if (r0 == 0) goto L17
            return
        L17:
            r2.f5413 = r3
            boolean r0 = r4 instanceof Yue.InterfaceC1665
            r1 = 0
            if (r0 == 0) goto L21
            Yue.ۥ۟ۧۧۨ r4 = (Yue.InterfaceC1665) r4
            goto L22
        L21:
            r4 = r1
        L22:
            r2.m8279(r4)
            java.lang.String r4 = "RUNNING"
            boolean r3 = Yue.C3329.m13897(r3, r4)
            if (r3 == 0) goto L31
            java.lang.Thread r1 = java.lang.Thread.currentThread()
        L31:
            r2.f5414 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final java.lang.Object m8281(Yue.AbstractC5611<? super java.lang.StackTraceElement> r6, Yue.InterfaceC1665 r7, Yue.InterfaceC1598<? super Yue.C6593> r8) {
            r5 = this;
            boolean r0 = r8 instanceof Yue.C1739.C1741
            if (r0 == 0) goto L13
            r0 = r8
            Yue.ۥۣ۟ۨۥ$ۥ۟ r0 = (Yue.C1739.C1741) r0
            int r1 = r0.f5425
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5425 = r1
            goto L18
        L13:
            Yue.ۥۣ۟ۨۥ$ۥ۟ r0 = new Yue.ۥۣ۟ۨۥ$ۥ۟
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f5423
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f5425
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f5422
            Yue.ۥ۟ۧۧۨ r6 = (Yue.InterfaceC1665) r6
            java.lang.Object r7 = r0.f5421
            Yue.ۥۡۨۢ۠ r7 = (Yue.AbstractC5611) r7
            java.lang.Object r2 = r0.f5420
            Yue.ۥۣ۟ۨۥ r2 = (Yue.C1739) r2
            Yue.C5391.m20403(r8)
            goto L5e
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            Yue.C5391.m20403(r8)
            r2 = r5
        L41:
            if (r7 != 0) goto L46
            Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
            return r6
        L46:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 == 0) goto L61
            r0.f5420 = r2
            r0.f5421 = r6
            r0.f5422 = r7
            r0.f5425 = r3
            java.lang.Object r8 = r6.mo20973(r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r4 = r7
            r7 = r6
            r6 = r4
        L5e:
            r4 = r7
            r7 = r6
            r6 = r4
        L61:
            Yue.ۥ۟ۧۧۨ r7 = r7.getCallerFrame()
            if (r7 == 0) goto L68
            goto L41
        L68:
            Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
            return r6
    }
}
