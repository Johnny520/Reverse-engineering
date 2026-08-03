package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C0551 extends Yue.AbstractC6115 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile Yue.C0551 f1435;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public static final java.util.concurrent.Executor f1436 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public static final java.util.concurrent.Executor f1437 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public Yue.AbstractC6115 f1438;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final Yue.AbstractC6115 f1439;

    static {
            Yue.ۥ۟ۡۦۢ r0 = new Yue.ۥ۟ۡۦۢ
            r0.<init>()
            Yue.C0551.f1436 = r0
            Yue.ۥ۟ۡۦۣ r0 = new Yue.ۥ۟ۡۦۣ
            r0.<init>()
            Yue.C0551.f1437 = r0
            return
    }

    public C0551() {
            r1 = this;
            r1.<init>()
            Yue.ۥۣ۟ۨۧ r0 = new Yue.ۥۣ۟ۨۧ
            r0.<init>()
            r1.f1439 = r0
            r1.f1438 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m1939(java.lang.Runnable r0) {
            m1944(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m1940(java.lang.Runnable r0) {
            m1945(r0)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.util.concurrent.Executor m1941() {
            java.util.concurrent.Executor r0 = Yue.C0551.f1437
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Yue.C0551 m1942() {
            Yue.ۥ۟ۡۦۤ r0 = Yue.C0551.f1435
            if (r0 == 0) goto L7
            Yue.ۥ۟ۡۦۤ r0 = Yue.C0551.f1435
            return r0
        L7:
            java.lang.Class<Yue.ۥ۟ۡۦۤ> r0 = Yue.C0551.class
            monitor-enter(r0)
            Yue.ۥ۟ۡۦۤ r1 = Yue.C0551.f1435     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            Yue.ۥ۟ۡۦۤ r1 = new Yue.ۥ۟ۡۦۤ     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            Yue.C0551.f1435 = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1c
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            Yue.ۥ۟ۡۦۤ r0 = Yue.C0551.f1435
            return r0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static java.util.concurrent.Executor m1943() {
            java.util.concurrent.Executor r0 = Yue.C0551.f1436
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m1944(java.lang.Runnable r1) {
            Yue.ۥ۟ۡۦۤ r0 = m1942()
            r0.mo1948(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m1945(java.lang.Runnable r1) {
            Yue.ۥ۟ۡۦۤ r0 = m1942()
            r0.mo1946(r1)
            return
    }

    @Override // Yue.AbstractC6115
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void mo1946(@Yue.InterfaceC4410 java.lang.Runnable r2) {
            r1 = this;
            Yue.ۥۢۡ۟ r0 = r1.f1438
            r0.mo1946(r2)
            return
    }

    @Override // Yue.AbstractC6115
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo1947() {
            r1 = this;
            Yue.ۥۢۡ۟ r0 = r1.f1438
            boolean r0 = r0.mo1947()
            return r0
    }

    @Override // Yue.AbstractC6115
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo1948(@Yue.InterfaceC4410 java.lang.Runnable r2) {
            r1 = this;
            Yue.ۥۢۡ۟ r0 = r1.f1438
            r0.mo1948(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m1949(@Yue.InterfaceC4544 Yue.AbstractC6115 r1) {
            r0 = this;
            if (r1 != 0) goto L4
            Yue.ۥۢۡ۟ r1 = r0.f1439
        L4:
            r0.f1438 = r1
            return
    }
}
