package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
public final class C2818 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.Executor f9198;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2823<Yue.C6593> f9199;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Object f9200;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC2947("lock")
    public int f9201;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC2947("lock")
    public boolean f9202;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC2947("lock")
    public boolean f9203;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC2947("lock")
    public final java.util.List<Yue.InterfaceC2823<Yue.C6593>> f9204;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Runnable f9205;

    public C2818(@Yue.InterfaceC4418 java.util.concurrent.Executor r2, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r3) {
            r1 = this;
            java.lang.String r0 = "executor"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "reportFullyDrawn"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f9198 = r2
            r1.f9199 = r3
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f9200 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9204 = r2
            Yue.ۥۣۣ۠۠ r2 = new Yue.ۥۣۣ۠۠
            r2.<init>(r1)
            r1.f9205 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m12268(Yue.C2818 r0) {
            m12269(r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final void m12269(Yue.C2818 r2) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r0 = r2.f9200
            monitor-enter(r0)
            r1 = 0
            r2.f9202 = r1     // Catch: java.lang.Throwable -> L1c
            int r1 = r2.f9201     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            boolean r1 = r2.f9203     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r1 = r2.f9199     // Catch: java.lang.Throwable -> L1c
            r1.invoke()     // Catch: java.lang.Throwable -> L1c
            r2.m12272()     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r2 = move-exception
            goto L22
        L1e:
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L22:
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m12270(@Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r3) {
            r2 = this;
            java.lang.String r0 = "callback"
            Yue.C3329.m13906(r3, r0)
            java.lang.Object r0 = r2.f9200
            monitor-enter(r0)
            boolean r1 = r2.f9203     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto Le
            r1 = 1
            goto L14
        Le:
            java.util.List<Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ>> r1 = r2.f9204     // Catch: java.lang.Throwable -> L1b
            r1.add(r3)     // Catch: java.lang.Throwable -> L1b
            r1 = 0
        L14:
            monitor-exit(r0)
            if (r1 == 0) goto L1a
            r3.invoke()
        L1a:
            return
        L1b:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m12271() {
            r2 = this;
            java.lang.Object r0 = r2.f9200
            monitor-enter(r0)
            boolean r1 = r2.f9203     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L10
            int r1 = r2.f9201     // Catch: java.lang.Throwable -> Le
            int r1 = r1 + 1
            r2.f9201 = r1     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r1 = move-exception
            goto L14
        L10:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        L14:
            monitor-exit(r0)
            throw r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m12272() {
            r3 = this;
            java.lang.Object r0 = r3.f9200
            monitor-enter(r0)
            r1 = 1
            r3.f9203 = r1     // Catch: java.lang.Throwable -> L1c
            java.util.List<Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ>> r1 = r3.f9204     // Catch: java.lang.Throwable -> L1c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1c
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1c
            Yue.ۥۣ۠۠ۨ r2 = (Yue.InterfaceC2823) r2     // Catch: java.lang.Throwable -> L1c
            r2.invoke()     // Catch: java.lang.Throwable -> L1c
            goto Lc
        L1c:
            r1 = move-exception
            goto L27
        L1e:
            java.util.List<Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ>> r1 = r3.f9204     // Catch: java.lang.Throwable -> L1c
            r1.clear()     // Catch: java.lang.Throwable -> L1c
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L27:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m12273() {
            r2 = this;
            java.lang.Object r0 = r2.f9200
            monitor-enter(r0)
            boolean r1 = r2.f9203     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m12274() {
            r2 = this;
            boolean r0 = r2.f9202
            if (r0 != 0) goto L12
            int r0 = r2.f9201
            if (r0 != 0) goto L12
            r0 = 1
            r2.f9202 = r0
            java.util.concurrent.Executor r0 = r2.f9198
            java.lang.Runnable r1 = r2.f9205
            r0.execute(r1)
        L12:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m12275(@Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r3) {
            r2 = this;
            java.lang.String r0 = "callback"
            Yue.C3329.m13906(r3, r0)
            java.lang.Object r0 = r2.f9200
            monitor-enter(r0)
            java.util.List<Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ>> r1 = r2.f9204     // Catch: java.lang.Throwable -> L11
            r1.remove(r3)     // Catch: java.lang.Throwable -> L11
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L11:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m12276() {
            r2 = this;
            java.lang.Object r0 = r2.f9200
            monitor-enter(r0)
            boolean r1 = r2.f9203     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            int r1 = r2.f9201     // Catch: java.lang.Throwable -> L13
            if (r1 <= 0) goto L15
            int r1 = r1 + (-1)
            r2.f9201 = r1     // Catch: java.lang.Throwable -> L13
            r2.m12274()     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L19
        L15:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L19:
            monitor-exit(r0)
            throw r1
    }
}
