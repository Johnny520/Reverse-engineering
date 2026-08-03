package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6198 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public long f22177;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public long f22178;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long f22179;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public long f22180;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.locks.ReentrantLock f22181;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.locks.Condition f22182;

    /* JADX INFO: renamed from: Yue.ۥۢۡۢۨ$ۥ, reason: contains not printable characters */
    public static final class C6199 extends Yue.AbstractC2753 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6198 f22183;

        public C6199(Yue.InterfaceC5794 r1, Yue.C6198 r2) {
                r0 = this;
                r0.f22183 = r2
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC2753, Yue.InterfaceC5794
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo4176(@Yue.InterfaceC4418 Yue.C0843 r3, long r4) throws java.io.IOException {
                r2 = this;
                java.lang.String r0 = "source"
                Yue.C3329.m13906(r3, r0)
            L5:
                r0 = 0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 <= 0) goto L25
                Yue.ۥۢۡۢۨ r0 = r2.f22183     // Catch: java.lang.InterruptedException -> L16
                long r0 = r0.m23185(r4)     // Catch: java.lang.InterruptedException -> L16
                super.mo4176(r3, r0)     // Catch: java.lang.InterruptedException -> L16
                long r4 = r4 - r0
                goto L5
            L16:
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                r3.interrupt()
                java.io.InterruptedIOException r3 = new java.io.InterruptedIOException
                java.lang.String r4 = "interrupted"
                r3.<init>(r4)
                throw r3
            L25:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۢۨ$ۥ۟, reason: contains not printable characters */
    public static final class C6200 extends Yue.AbstractC2754 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6198 f22184;

        public C6200(Yue.InterfaceC5839 r1, Yue.C6198 r2) {
                r0 = this;
                r0.f22184 = r2
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC2754, Yue.InterfaceC5839
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r2, long r3) {
                r1 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥۢۡۢۨ r0 = r1.f22184     // Catch: java.lang.InterruptedException -> L10
                long r3 = r0.m23185(r3)     // Catch: java.lang.InterruptedException -> L10
                long r2 = super.mo4179(r2, r3)     // Catch: java.lang.InterruptedException -> L10
                return r2
            L10:
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                r2.interrupt()
                java.io.InterruptedIOException r2 = new java.io.InterruptedIOException
                java.lang.String r3 = "interrupted"
                r2.<init>(r3)
                throw r2
        }
    }

    public C6198() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            r2.<init>(r0)
            return
    }

    public C6198(long r1) {
            r0 = this;
            r0.<init>()
            r0.f22177 = r1
            r1 = 8192(0x2000, double:4.0474E-320)
            r0.f22179 = r1
            r1 = 262144(0x40000, double:1.295163E-318)
            r0.f22180 = r1
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r0.f22181 = r1
            java.util.concurrent.locks.Condition r1 = r1.newCondition()
            java.lang.String r2 = "newCondition(...)"
            Yue.C3329.m13905(r1, r2)
            r0.f22182 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m23174(Yue.C6198 r7, long r8, long r10, long r12, int r14, java.lang.Object r15) {
            r15 = r14 & 2
            if (r15 == 0) goto L6
            long r10 = r7.f22179
        L6:
            r3 = r10
            r10 = r14 & 4
            if (r10 == 0) goto Ld
            long r12 = r7.f22180
        Ld:
            r5 = r12
            r0 = r7
            r1 = r8
            r0.m23178(r1, r3, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final long m23175(long r10, long r12) {
            r9 = this;
            long r0 = r9.f22178
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L9
            return r12
        L9:
            long r0 = r9.f22177
            long r0 = r0 - r10
            long r0 = java.lang.Math.max(r0, r2)
            long r4 = r9.f22180
            long r6 = r9.m23182(r0)
            long r4 = r4 - r6
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 < 0) goto L24
            long r10 = r10 + r0
            long r0 = r9.m23179(r12)
            long r10 = r10 + r0
            r9.f22177 = r10
            return r12
        L24:
            long r6 = r9.f22179
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L34
            long r12 = r9.f22180
            long r12 = r9.m23179(r12)
            long r10 = r10 + r12
            r9.f22177 = r10
            return r4
        L34:
            long r12 = java.lang.Math.min(r6, r12)
            long r4 = r9.f22180
            long r4 = r12 - r4
            long r4 = r9.m23179(r4)
            long r0 = r0 + r4
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L4f
            long r0 = r9.f22180
            long r0 = r9.m23179(r0)
            long r10 = r10 + r0
            r9.f22177 = r10
            return r12
        L4f:
            long r10 = -r0
            return r10
    }

    @Yue.InterfaceC3422
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m23176(long r10) {
            r9 = this;
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            r0 = r9
            r1 = r10
            m23174(r0, r1, r3, r5, r7, r8)
            return
    }

    @Yue.InterfaceC3422
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m23177(long r10, long r12) {
            r9 = this;
            r7 = 4
            r8 = 0
            r5 = 0
            r0 = r9
            r1 = r10
            r3 = r12
            m23174(r0, r1, r3, r5, r7, r8)
            return
    }

    @Yue.InterfaceC3422
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m23178(long r6, long r8, long r10) {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.f22181
            r0.lock()
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            java.lang.String r4 = "Failed requirement."
            if (r3 < 0) goto L3c
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L32
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 < 0) goto L28
            r5.f22178 = r6     // Catch: java.lang.Throwable -> L26
            r5.f22179 = r8     // Catch: java.lang.Throwable -> L26
            r5.f22180 = r10     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.locks.Condition r6 = r5.f22182     // Catch: java.lang.Throwable -> L26
            r6.signalAll()     // Catch: java.lang.Throwable -> L26
            Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L26
            r0.unlock()
            return
        L26:
            r6 = move-exception
            goto L46
        L28:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L26
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L26
            throw r6     // Catch: java.lang.Throwable -> L26
        L32:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L26
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L26
            throw r6     // Catch: java.lang.Throwable -> L26
        L3c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L26
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L26
            throw r6     // Catch: java.lang.Throwable -> L26
        L46:
            r0.unlock()
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final long m23179(long r3) {
            r2 = this;
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r3 = r3 * r0
            long r0 = r2.f22178
            long r3 = r3 / r0
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.util.concurrent.locks.Condition m23180() {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.f22182
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.util.concurrent.locks.ReentrantLock m23181() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.f22181
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final long m23182(long r3) {
            r2 = this;
            long r0 = r2.f22178
            long r3 = r3 * r0
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r3 = r3 / r0
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.InterfaceC5794 m23183(@Yue.InterfaceC4418 Yue.InterfaceC5794 r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۢۡۢۨ$ۥ r0 = new Yue.ۥۢۡۢۨ$ۥ
            r0.<init>(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final Yue.InterfaceC5839 m23184(@Yue.InterfaceC4418 Yue.InterfaceC5839 r2) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۢۡۢۨ$ۥ۟ r0 = new Yue.ۥۢۡۢۨ$ۥ۟
            r0.<init>(r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final long m23185(long r7) {
            r6 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L27
            java.util.concurrent.locks.ReentrantLock r2 = r6.f22181
            r2.lock()
        Lb:
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r3 = r6.m23175(r3, r7)     // Catch: java.lang.Throwable -> L22
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 < 0) goto L1b
            r2.unlock()
            return r3
        L1b:
            java.util.concurrent.locks.Condition r5 = r6.f22182     // Catch: java.lang.Throwable -> L22
            long r3 = -r3
            r5.awaitNanos(r3)     // Catch: java.lang.Throwable -> L22
            goto Lb
        L22:
            r7 = move-exception
            r2.unlock()
            throw r7
        L27:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Failed requirement."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }
}
