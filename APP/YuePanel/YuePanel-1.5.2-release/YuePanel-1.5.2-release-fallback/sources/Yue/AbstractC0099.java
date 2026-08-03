package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0099 extends Yue.AbstractC6982 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Yue.InterfaceC3804 f182;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f183;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f184;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public java.util.concurrent.ScheduledExecutorService f185;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.util.concurrent.ScheduledFuture<?> f186;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public long f187;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f188;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final java.lang.Object f189;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟$ۥ, reason: contains not printable characters */
    public class RunnableC0100 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.util.ArrayList<Yue.InterfaceC6981> f190;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0099 f191;

        public RunnableC0100(Yue.AbstractC0099 r1) {
                r0 = this;
                r0.f191 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f190 = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                java.util.ArrayList<Yue.ۥۢۥۡ۠> r0 = r7.f190
                r0.clear()
                java.util.ArrayList<Yue.ۥۢۥۡ۠> r0 = r7.f190     // Catch: java.lang.Exception -> L44
                Yue.ۥۣ۟۟ r1 = r7.f191     // Catch: java.lang.Exception -> L44
                java.util.Collection r1 = r1.mo555()     // Catch: java.lang.Exception -> L44
                r0.addAll(r1)     // Catch: java.lang.Exception -> L44
                Yue.ۥۣ۟۟ r0 = r7.f191     // Catch: java.lang.Exception -> L44
                java.lang.Object r0 = Yue.AbstractC0099.m549(r0)     // Catch: java.lang.Exception -> L44
                monitor-enter(r0)     // Catch: java.lang.Exception -> L44
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L41
                double r1 = (double) r1     // Catch: java.lang.Throwable -> L41
                Yue.ۥۣ۟۟ r3 = r7.f191     // Catch: java.lang.Throwable -> L41
                long r3 = Yue.AbstractC0099.m550(r3)     // Catch: java.lang.Throwable -> L41
                double r3 = (double) r3     // Catch: java.lang.Throwable -> L41
                r5 = 4609434218613702656(0x3ff8000000000000, double:1.5)
                double r3 = r3 * r5
                double r1 = r1 - r3
                long r1 = (long) r1     // Catch: java.lang.Throwable -> L41
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
                java.util.ArrayList<Yue.ۥۢۥۡ۠> r0 = r7.f190     // Catch: java.lang.Exception -> L44
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L44
            L2f:
                boolean r3 = r0.hasNext()     // Catch: java.lang.Exception -> L44
                if (r3 == 0) goto L44
                java.lang.Object r3 = r0.next()     // Catch: java.lang.Exception -> L44
                Yue.ۥۢۥۡ۠ r3 = (Yue.InterfaceC6981) r3     // Catch: java.lang.Exception -> L44
                Yue.ۥۣ۟۟ r4 = r7.f191     // Catch: java.lang.Exception -> L44
                Yue.AbstractC0099.m551(r4, r3, r1)     // Catch: java.lang.Exception -> L44
                goto L2f
            L41:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
                throw r1     // Catch: java.lang.Exception -> L44
            L44:
                java.util.ArrayList<Yue.ۥۢۥۡ۠> r0 = r7.f190
                r0.clear()
                return
        }
    }

    public AbstractC0099() {
            r3 = this;
            r3.<init>()
            java.lang.Class<Yue.ۥۣ۟۟> r0 = Yue.AbstractC0099.class
            Yue.ۥ۠ۨۡۥ r0 = Yue.C3805.m15249(r0)
            r3.f182 = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 60
            long r0 = r0.toNanos(r1)
            r3.f187 = r0
            r0 = 0
            r3.f188 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f189 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m549(Yue.AbstractC0099 r0) {
            java.lang.Object r0 = r0.f189
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ long m550(Yue.AbstractC0099 r2) {
            long r0 = r2.f187
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static /* synthetic */ void m551(Yue.AbstractC0099 r0, Yue.InterfaceC6981 r1, long r2) {
            r0.m553(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final void m552() {
            r3 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r3.f185
            r1 = 0
            if (r0 == 0) goto La
            r0.shutdownNow()
            r3.f185 = r1
        La:
            java.util.concurrent.ScheduledFuture<?> r0 = r3.f186
            if (r0 == 0) goto L14
            r2 = 0
            r0.cancel(r2)
            r3.f186 = r1
        L14:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final void m553(Yue.InterfaceC6981 r3, long r4) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C6989
            if (r0 != 0) goto L5
            return
        L5:
            Yue.ۥۢۥۡۥ r3 = (Yue.C6989) r3
            long r0 = r3.m27031()
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L1e
            Yue.ۥ۠ۨۡۥ r4 = r2.f182
            java.lang.String r5 = "Closing connection due to no pong received: {}"
            r4.mo10321(r5, r3)
            r4 = 1006(0x3ee, float:1.41E-42)
            java.lang.String r5 = "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection"
            r3.mo26955(r4, r5)
            goto L2f
        L1e:
            boolean r4 = r3.isOpen()
            if (r4 == 0) goto L28
            r3.mo26945()
            goto L2f
        L28:
            Yue.ۥ۠ۨۡۥ r4 = r2.f182
            java.lang.String r5 = "Trying to ping a non open connection: {}"
            r4.mo10321(r5, r3)
        L2f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public int m554() {
            r4 = this;
            java.lang.Object r0 = r4.f189
            monitor-enter(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> Le
            long r2 = r4.f187     // Catch: java.lang.Throwable -> Le
            long r1 = r1.toSeconds(r2)     // Catch: java.lang.Throwable -> Le
            int r1 = (int) r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public abstract java.util.Collection<Yue.InterfaceC6981> mo555();

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public boolean m556() {
            r1 = this;
            boolean r0 = r1.f184
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m557() {
            r1 = this;
            boolean r0 = r1.f183
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m558() {
            r8 = this;
            r8.m552()
            Yue.ۥۡۢ۠ۢ r0 = new Yue.ۥۡۢ۠ۢ
            java.lang.String r1 = "connectionLostChecker"
            r0.<init>(r1)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            r8.f185 = r0
            Yue.ۥۣ۟۟$ۥ r2 = new Yue.ۥۣ۟۟$ۥ
            r2.<init>(r8)
            java.util.concurrent.ScheduledExecutorService r1 = r8.f185
            long r5 = r8.f187
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            r3 = r5
            java.util.concurrent.ScheduledFuture r0 = r1.scheduleAtFixedRate(r2, r3, r5, r7)
            r8.f186 = r0
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m559(int r6) {
            r5 = this;
            java.lang.Object r0 = r5.f189
            monitor-enter(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1e
            long r2 = (long) r6     // Catch: java.lang.Throwable -> L1e
            long r1 = r1.toNanos(r2)     // Catch: java.lang.Throwable -> L1e
            r5.f187 = r1     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L20
            Yue.ۥ۠ۨۡۥ r6 = r5.f182     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "Connection lost timer stopped"
            r6.mo10348(r1)     // Catch: java.lang.Throwable -> L1e
            r5.m552()     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r6 = move-exception
            goto L5b
        L20:
            boolean r6 = r5.f188     // Catch: java.lang.Throwable -> L1e
            if (r6 == 0) goto L59
            Yue.ۥ۠ۨۡۥ r6 = r5.f182     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "Connection lost timer restarted"
            r6.mo10348(r1)     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L4e
            java.util.Collection r1 = r5.mo555()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L4e
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L4e
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L4e
        L38:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L4e
            if (r1 == 0) goto L56
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L4e
            Yue.ۥۢۥۡ۠ r1 = (Yue.InterfaceC6981) r1     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L4e
            boolean r2 = r1 instanceof Yue.C6989     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L4e
            if (r2 == 0) goto L38
            Yue.ۥۢۥۡۥ r1 = (Yue.C6989) r1     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L4e
            r1.m27041()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L4e
            goto L38
        L4e:
            r6 = move-exception
            Yue.ۥ۠ۨۡۥ r1 = r5.f182     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "Exception during connection lost restart"
            r1.error(r2, r6)     // Catch: java.lang.Throwable -> L1e
        L56:
            r5.m558()     // Catch: java.lang.Throwable -> L1e
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r6
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m560(boolean r1) {
            r0 = this;
            r0.f184 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public void m561(boolean r1) {
            r0 = this;
            r0.f183 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m562() {
            r5 = this;
            java.lang.Object r0 = r5.f189
            monitor-enter(r0)
            long r1 = r5.f187     // Catch: java.lang.Throwable -> L14
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L16
            Yue.ۥ۠ۨۡۥ r1 = r5.f182     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "Connection lost timer deactivated"
            r1.mo10348(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            goto L25
        L16:
            Yue.ۥ۠ۨۡۥ r1 = r5.f182     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "Connection lost timer started"
            r1.mo10348(r2)     // Catch: java.lang.Throwable -> L14
            r1 = 1
            r5.f188 = r1     // Catch: java.lang.Throwable -> L14
            r5.m558()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void m563() {
            r3 = this;
            java.lang.Object r0 = r3.f189
            monitor-enter(r0)
            java.util.concurrent.ScheduledExecutorService r1 = r3.f185     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto Le
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f186     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L1b
            goto Le
        Lc:
            r1 = move-exception
            goto L1d
        Le:
            r1 = 0
            r3.f188 = r1     // Catch: java.lang.Throwable -> Lc
            Yue.ۥ۠ۨۡۥ r1 = r3.f182     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "Connection lost timer stopped"
            r1.mo10348(r2)     // Catch: java.lang.Throwable -> Lc
            r3.m552()     // Catch: java.lang.Throwable -> Lc
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }
}
