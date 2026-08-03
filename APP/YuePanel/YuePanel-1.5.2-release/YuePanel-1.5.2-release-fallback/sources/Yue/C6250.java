package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nokio/Timeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
public class C6250 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6250.C6252 f22299 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C6250 f22300 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f22301;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public long f22302;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long f22303;

    /* JADX INFO: renamed from: Yue.ۥۢۡۤۧ$ۥ, reason: contains not printable characters */
    public static final class C6251 extends Yue.C6250 {
        public C6251() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.C6250
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public Yue.C6250 mo12060(long r1) {
                r0 = this;
                return r0
        }

        @Override // Yue.C6250
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo12062() {
                r0 = this;
                return
        }

        @Override // Yue.C6250
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public Yue.C6250 mo12063(long r1, @Yue.InterfaceC4418 java.util.concurrent.TimeUnit r3) {
                r0 = this;
                java.lang.String r1 = "unit"
                Yue.C3329.m13906(r3, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۤۧ$ۥ۟, reason: contains not printable characters */
    public static final class C6252 {
        public C6252() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C6252(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final long m23308(long r4, long r6) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L7
                goto L11
            L7:
                int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r0 != 0) goto Lc
                goto L12
            Lc:
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 >= 0) goto L11
                goto L12
            L11:
                r4 = r6
            L12:
                return r4
        }
    }

    static {
            Yue.ۥۢۡۤۧ$ۥ۟ r0 = new Yue.ۥۢۡۤۧ$ۥ۟
            r1 = 0
            r0.<init>(r1)
            Yue.C6250.f22299 = r0
            Yue.ۥۢۡۤۧ$ۥ r0 = new Yue.ۥۢۡۤۧ$ۥ
            r0.<init>()
            Yue.C6250.f22300 = r0
            return
    }

    public C6250() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m23304(@Yue.InterfaceC4418 java.util.concurrent.locks.Condition r10) throws java.io.InterruptedIOException {
            r9 = this;
            java.lang.String r0 = "condition"
            Yue.C3329.m13906(r10, r0)
            boolean r0 = r9.mo12061()     // Catch: java.lang.InterruptedException -> L50
            long r1 = r9.mo12064()     // Catch: java.lang.InterruptedException -> L50
            r3 = 0
            if (r0 != 0) goto L19
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L19
            r10.await()     // Catch: java.lang.InterruptedException -> L50
            return
        L19:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L50
            if (r0 == 0) goto L2d
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L2d
            long r7 = r9.mo12059()     // Catch: java.lang.InterruptedException -> L50
            long r7 = r7 - r5
            long r1 = java.lang.Math.min(r1, r7)     // Catch: java.lang.InterruptedException -> L50
            goto L35
        L2d:
            if (r0 == 0) goto L35
            long r0 = r9.mo12059()     // Catch: java.lang.InterruptedException -> L50
            long r1 = r0 - r5
        L35:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L43
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L50
            r10.await(r1, r0)     // Catch: java.lang.InterruptedException -> L50
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L50
            long r3 = r3 - r5
        L43:
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 >= 0) goto L48
            return
        L48:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L50
            java.lang.String r0 = "timeout"
            r10.<init>(r0)     // Catch: java.lang.InterruptedException -> L50
            throw r10     // Catch: java.lang.InterruptedException -> L50
        L50:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException
            java.lang.String r0 = "interrupted"
            r10.<init>(r0)
            throw r10
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.C6250 mo12057() {
            r1 = this;
            r0 = 0
            r1.f22301 = r0
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.C6250 mo12058() {
            r2 = this;
            r0 = 0
            r2.f22303 = r0
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C6250 m23305(long r3, @Yue.InterfaceC4418 java.util.concurrent.TimeUnit r5) {
            r2 = this;
            java.lang.String r0 = "unit"
            Yue.C3329.m13906(r5, r0)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L19
            long r0 = java.lang.System.nanoTime()
            long r3 = r5.toNanos(r3)
            long r0 = r0 + r3
            Yue.ۥۢۡۤۧ r3 = r2.mo12060(r0)
            return r3
        L19:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "duration <= 0: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public long mo12059() {
            r2 = this;
            boolean r0 = r2.f22301
            if (r0 == 0) goto L7
            long r0 = r2.f22302
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No deadline"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Yue.C6250 mo12060(long r2) {
            r1 = this;
            r0 = 1
            r1.f22301 = r0
            r1.f22302 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo12061() {
            r1 = this;
            boolean r0 = r1.f22301
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final <T> T m23306(@Yue.InterfaceC4418 Yue.C6250 r12, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r13) {
            r11 = this;
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r12, r0)
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r13, r0)
            long r0 = r11.mo12064()
            Yue.ۥۢۡۤۧ$ۥ۟ r2 = Yue.C6250.f22299
            long r3 = r12.mo12064()
            long r5 = r11.mo12064()
            long r2 = r2.m23308(r3, r5)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.mo12063(r2, r4)
            boolean r2 = r11.mo12061()
            r3 = 1
            if (r2 == 0) goto L6e
            long r5 = r11.mo12059()
            boolean r2 = r12.mo12061()
            if (r2 == 0) goto L41
            long r7 = r11.mo12059()
            long r9 = r12.mo12059()
            long r7 = java.lang.Math.min(r7, r9)
            r11.mo12060(r7)
        L41:
            java.lang.Object r13 = r13.invoke()     // Catch: java.lang.Throwable -> L58
            Yue.C3249.m13687(r3)
            r11.mo12063(r0, r4)
            boolean r12 = r12.mo12061()
            if (r12 == 0) goto L54
            r11.mo12060(r5)
        L54:
            Yue.C3249.m13686(r3)
            return r13
        L58:
            r13 = move-exception
            Yue.C3249.m13687(r3)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.mo12063(r0, r2)
            boolean r12 = r12.mo12061()
            if (r12 == 0) goto L6a
            r11.mo12060(r5)
        L6a:
            Yue.C3249.m13686(r3)
            throw r13
        L6e:
            boolean r2 = r12.mo12061()
            if (r2 == 0) goto L7b
            long r5 = r12.mo12059()
            r11.mo12060(r5)
        L7b:
            java.lang.Object r13 = r13.invoke()     // Catch: java.lang.Throwable -> L92
            Yue.C3249.m13687(r3)
            r11.mo12063(r0, r4)
            boolean r12 = r12.mo12061()
            if (r12 == 0) goto L8e
            r11.mo12057()
        L8e:
            Yue.C3249.m13686(r3)
            return r13
        L92:
            r13 = move-exception
            Yue.C3249.m13687(r3)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.mo12063(r0, r2)
            boolean r12 = r12.mo12061()
            if (r12 == 0) goto La4
            r11.mo12057()
        La4:
            Yue.C3249.m13686(r3)
            throw r13
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo12062() throws java.io.IOException {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L25
            boolean r0 = r4.f22301
            if (r0 == 0) goto L24
            long r0 = r4.f22302
            long r2 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1c
            goto L24
        L1c:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "deadline reached"
            r0.<init>(r1)
            throw r0
        L24:
            return
        L25:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "interrupted"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public Yue.C6250 mo12063(long r3, @Yue.InterfaceC4418 java.util.concurrent.TimeUnit r5) {
            r2 = this;
            java.lang.String r0 = "unit"
            Yue.C3329.m13906(r5, r0)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L12
            long r3 = r5.toNanos(r3)
            r2.f22303 = r3
            return r2
        L12:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "timeout < 0: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public long mo12064() {
            r2 = this;
            long r0 = r2.f22303
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m23307(@Yue.InterfaceC4418 java.lang.Object r10) throws java.io.InterruptedIOException {
            r9 = this;
            java.lang.String r0 = "monitor"
            Yue.C3329.m13906(r10, r0)
            boolean r0 = r9.mo12061()     // Catch: java.lang.InterruptedException -> L57
            long r1 = r9.mo12064()     // Catch: java.lang.InterruptedException -> L57
            r3 = 0
            if (r0 != 0) goto L19
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L19
            r10.wait()     // Catch: java.lang.InterruptedException -> L57
            return
        L19:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L57
            if (r0 == 0) goto L2d
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L2d
            long r7 = r9.mo12059()     // Catch: java.lang.InterruptedException -> L57
            long r7 = r7 - r5
            long r1 = java.lang.Math.min(r1, r7)     // Catch: java.lang.InterruptedException -> L57
            goto L35
        L2d:
            if (r0 == 0) goto L35
            long r0 = r9.mo12059()     // Catch: java.lang.InterruptedException -> L57
            long r1 = r0 - r5
        L35:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4a
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r1 / r3
            long r3 = r3 * r7
            long r3 = r1 - r3
            int r0 = (int) r3     // Catch: java.lang.InterruptedException -> L57
            r10.wait(r7, r0)     // Catch: java.lang.InterruptedException -> L57
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L57
            long r3 = r3 - r5
        L4a:
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 >= 0) goto L4f
            return
        L4f:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L57
            java.lang.String r0 = "timeout"
            r10.<init>(r0)     // Catch: java.lang.InterruptedException -> L57
            throw r10     // Catch: java.lang.InterruptedException -> L57
        L57:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException
            java.lang.String r0 = "interrupted"
            r10.<init>(r0)
            throw r10
    }
}
