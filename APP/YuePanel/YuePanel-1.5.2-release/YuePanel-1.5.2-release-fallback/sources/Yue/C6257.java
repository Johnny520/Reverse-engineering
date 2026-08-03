package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3421(name = "TimersKt")
public final class C6257 {

    /* JADX INFO: renamed from: Yue.ۥۢۡۥ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    public static final class C6258 extends java.util.TimerTask {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825<java.util.TimerTask, Yue.C6593> f22311;

        public C6258(Yue.InterfaceC2825<? super java.util.TimerTask, Yue.C6593> r1) {
                r0 = this;
                r0.f22311 = r1
                r0.<init>()
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r1 = this;
                Yue.ۥۣ۠ۡ۟<java.util.TimerTask, Yue.ۥۣۢ۠ۤ> r0 = r1.f22311
                r0.invoke(r1)
                return
        }
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.util.Timer m23316(java.lang.String r7, boolean r8, long r9, long r11, Yue.InterfaceC2825<? super java.util.TimerTask, Yue.C6593> r13) {
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r13, r0)
            java.util.Timer r7 = m23326(r7, r8)
            Yue.ۥۢۡۥ۠$ۥ r2 = new Yue.ۥۢۡۥ۠$ۥ
            r2.<init>(r13)
            r1 = r7
            r3 = r9
            r5 = r11
            r1.scheduleAtFixedRate(r2, r3, r5)
            return r7
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.util.Timer m23317(java.lang.String r1, boolean r2, java.util.Date r3, long r4, Yue.InterfaceC2825<? super java.util.TimerTask, Yue.C6593> r6) {
            java.lang.String r0 = "startAt"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r6, r0)
            java.util.Timer r1 = m23326(r1, r2)
            Yue.ۥۢۡۥ۠$ۥ r2 = new Yue.ۥۢۡۥ۠$ۥ
            r2.<init>(r6)
            r1.scheduleAtFixedRate(r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.util.Timer m23318(java.lang.String r6, boolean r7, long r8, long r10, Yue.InterfaceC2825 r12, int r13, java.lang.Object r14) {
            r14 = r13 & 1
            if (r14 == 0) goto L5
            r6 = 0
        L5:
            r14 = r13 & 2
            if (r14 == 0) goto La
            r7 = 0
        La:
            r13 = r13 & 4
            if (r13 == 0) goto L10
            r8 = 0
        L10:
            r2 = r8
            java.lang.String r8 = "action"
            Yue.C3329.m13906(r12, r8)
            java.util.Timer r6 = m23326(r6, r7)
            Yue.ۥۢۡۥ۠$ۥ r1 = new Yue.ۥۢۡۥ۠$ۥ
            r1.<init>(r12)
            r0 = r6
            r4 = r10
            r0.scheduleAtFixedRate(r1, r2, r4)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.util.Timer m23319(java.lang.String r0, boolean r1, java.util.Date r2, long r3, Yue.InterfaceC2825 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r0 = 0
        L5:
            r6 = r6 & 2
            if (r6 == 0) goto La
            r1 = 0
        La:
            java.lang.String r6 = "startAt"
            Yue.C3329.m13906(r2, r6)
            java.lang.String r6 = "action"
            Yue.C3329.m13906(r5, r6)
            java.util.Timer r0 = m23326(r0, r1)
            Yue.ۥۢۡۥ۠$ۥ r1 = new Yue.ۥۢۡۥ۠$ۥ
            r1.<init>(r5)
            r0.scheduleAtFixedRate(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.util.TimerTask m23320(java.util.Timer r7, long r8, long r10, Yue.InterfaceC2825<? super java.util.TimerTask, Yue.C6593> r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r12, r0)
            Yue.ۥۢۡۥ۠$ۥ r0 = new Yue.ۥۢۡۥ۠$ۥ
            r0.<init>(r12)
            r1 = r7
            r2 = r0
            r3 = r8
            r5 = r10
            r1.schedule(r2, r3, r5)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.util.TimerTask m23321(java.util.Timer r1, long r2, Yue.InterfaceC2825<? super java.util.TimerTask, Yue.C6593> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥۢۡۥ۠$ۥ r0 = new Yue.ۥۢۡۥ۠$ۥ
            r0.<init>(r4)
            r1.schedule(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.util.TimerTask m23322(java.util.Timer r1, java.util.Date r2, long r3, Yue.InterfaceC2825<? super java.util.TimerTask, Yue.C6593> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "time"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥۢۡۥ۠$ۥ r0 = new Yue.ۥۢۡۥ۠$ۥ
            r0.<init>(r5)
            r1.schedule(r0, r2, r3)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.util.TimerTask m23323(java.util.Timer r1, java.util.Date r2, Yue.InterfaceC2825<? super java.util.TimerTask, Yue.C6593> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "time"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۢۡۥ۠$ۥ r0 = new Yue.ۥۢۡۥ۠$ۥ
            r0.<init>(r3)
            r1.schedule(r0, r2)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.util.TimerTask m23324(java.util.Timer r7, long r8, long r10, Yue.InterfaceC2825<? super java.util.TimerTask, Yue.C6593> r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r12, r0)
            Yue.ۥۢۡۥ۠$ۥ r0 = new Yue.ۥۢۡۥ۠$ۥ
            r0.<init>(r12)
            r1 = r7
            r2 = r0
            r3 = r8
            r5 = r10
            r1.scheduleAtFixedRate(r2, r3, r5)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.util.TimerTask m23325(java.util.Timer r1, java.util.Date r2, long r3, Yue.InterfaceC2825<? super java.util.TimerTask, Yue.C6593> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "time"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥۢۡۥ۠$ۥ r0 = new Yue.ۥۢۡۥ۠$ۥ
            r0.<init>(r5)
            r1.scheduleAtFixedRate(r0, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.util.Timer m23326(@Yue.InterfaceC4543 java.lang.String r1, boolean r2) {
            if (r1 != 0) goto L8
            java.util.Timer r1 = new java.util.Timer
            r1.<init>(r2)
            goto Le
        L8:
            java.util.Timer r0 = new java.util.Timer
            r0.<init>(r1, r2)
            r1 = r0
        Le:
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.util.Timer m23327(java.lang.String r7, boolean r8, long r9, long r11, Yue.InterfaceC2825<? super java.util.TimerTask, Yue.C6593> r13) {
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r13, r0)
            java.util.Timer r7 = m23326(r7, r8)
            Yue.ۥۢۡۥ۠$ۥ r2 = new Yue.ۥۢۡۥ۠$ۥ
            r2.<init>(r13)
            r1 = r7
            r3 = r9
            r5 = r11
            r1.schedule(r2, r3, r5)
            return r7
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final java.util.Timer m23328(java.lang.String r1, boolean r2, java.util.Date r3, long r4, Yue.InterfaceC2825<? super java.util.TimerTask, Yue.C6593> r6) {
            java.lang.String r0 = "startAt"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r6, r0)
            java.util.Timer r1 = m23326(r1, r2)
            Yue.ۥۢۡۥ۠$ۥ r2 = new Yue.ۥۢۡۥ۠$ۥ
            r2.<init>(r6)
            r1.schedule(r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ java.util.Timer m23329(java.lang.String r6, boolean r7, long r8, long r10, Yue.InterfaceC2825 r12, int r13, java.lang.Object r14) {
            r14 = r13 & 1
            if (r14 == 0) goto L5
            r6 = 0
        L5:
            r14 = r13 & 2
            if (r14 == 0) goto La
            r7 = 0
        La:
            r13 = r13 & 4
            if (r13 == 0) goto L10
            r8 = 0
        L10:
            r2 = r8
            java.lang.String r8 = "action"
            Yue.C3329.m13906(r12, r8)
            java.util.Timer r6 = m23326(r6, r7)
            Yue.ۥۢۡۥ۠$ۥ r1 = new Yue.ۥۢۡۥ۠$ۥ
            r1.<init>(r12)
            r0 = r6
            r4 = r10
            r0.schedule(r1, r2, r4)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ java.util.Timer m23330(java.lang.String r0, boolean r1, java.util.Date r2, long r3, Yue.InterfaceC2825 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r0 = 0
        L5:
            r6 = r6 & 2
            if (r6 == 0) goto La
            r1 = 0
        La:
            java.lang.String r6 = "startAt"
            Yue.C3329.m13906(r2, r6)
            java.lang.String r6 = "action"
            Yue.C3329.m13906(r5, r6)
            java.util.Timer r0 = m23326(r0, r1)
            Yue.ۥۢۡۥ۠$ۥ r1 = new Yue.ۥۢۡۥ۠$ۥ
            r1.<init>(r5)
            r0.schedule(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final java.util.TimerTask m23331(Yue.InterfaceC2825<? super java.util.TimerTask, Yue.C6593> r1) {
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۢۡۥ۠$ۥ r0 = new Yue.ۥۢۡۥ۠$ۥ
            r0.<init>(r1)
            return r0
    }
}
