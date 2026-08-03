package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTimeout extends okio.Timeout {
    public static final okio.AsyncTimeout.Companion Companion = null;
    private static final long IDLE_TIMEOUT_MILLIS = 0;
    private static final long IDLE_TIMEOUT_NANOS = 0;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final java.util.concurrent.locks.Condition condition = null;
    private static okio.AsyncTimeout head;
    private static final java.util.concurrent.locks.ReentrantLock lock = null;
    private boolean inQueue;
    private okio.AsyncTimeout next;
    private long timeoutAt;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ boolean access$cancelScheduledTimeout(okio.AsyncTimeout.Companion r0, okio.AsyncTimeout r1) {
                boolean r0 = r0.cancelScheduledTimeout(r1)
                return r0
        }

        public static final /* synthetic */ void access$scheduleTimeout(okio.AsyncTimeout.Companion r0, okio.AsyncTimeout r1, long r2, boolean r4) {
                r0.scheduleTimeout(r1, r2, r4)
                return
        }

        private final boolean cancelScheduledTimeout(okio.AsyncTimeout r5) {
                r4 = this;
                okio.AsyncTimeout$Companion r0 = okio.AsyncTimeout.Companion
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()
                r0.lock()
                boolean r1 = okio.AsyncTimeout.access$getInQueue$p(r5)     // Catch: java.lang.Throwable -> L32
                r2 = 0
                if (r1 != 0) goto L14
                r0.unlock()
                return r2
            L14:
                okio.AsyncTimeout.access$setInQueue$p(r5, r2)     // Catch: java.lang.Throwable -> L32
                okio.AsyncTimeout r1 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L32
            L1b:
                if (r1 == 0) goto L39
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r1)     // Catch: java.lang.Throwable -> L32
                if (r3 != r5) goto L34
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r5)     // Catch: java.lang.Throwable -> L32
                okio.AsyncTimeout.access$setNext$p(r1, r3)     // Catch: java.lang.Throwable -> L32
                r1 = 0
                okio.AsyncTimeout.access$setNext$p(r5, r1)     // Catch: java.lang.Throwable -> L32
                r0.unlock()
                return r2
            L32:
                r5 = move-exception
                goto L3e
            L34:
                okio.AsyncTimeout r1 = okio.AsyncTimeout.access$getNext$p(r1)     // Catch: java.lang.Throwable -> L32
                goto L1b
            L39:
                r0.unlock()
                r5 = 1
                return r5
            L3e:
                r0.unlock()
                throw r5
        }

        private final void scheduleTimeout(okio.AsyncTimeout r6, long r7, boolean r9) {
                r5 = this;
                okio.AsyncTimeout$Companion r0 = okio.AsyncTimeout.Companion
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()
                r0.lock()
                boolean r1 = okio.AsyncTimeout.access$getInQueue$p(r6)     // Catch: java.lang.Throwable -> L2a
                if (r1 != 0) goto La3
                r1 = 1
                okio.AsyncTimeout.access$setInQueue$p(r6, r1)     // Catch: java.lang.Throwable -> L2a
                okio.AsyncTimeout r1 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L2a
                if (r1 != 0) goto L2d
                okio.AsyncTimeout r1 = new okio.AsyncTimeout     // Catch: java.lang.Throwable -> L2a
                r1.<init>()     // Catch: java.lang.Throwable -> L2a
                okio.AsyncTimeout.access$setHead$cp(r1)     // Catch: java.lang.Throwable -> L2a
                okio.AsyncTimeout$Watchdog r1 = new okio.AsyncTimeout$Watchdog     // Catch: java.lang.Throwable -> L2a
                r1.<init>()     // Catch: java.lang.Throwable -> L2a
                r1.start()     // Catch: java.lang.Throwable -> L2a
                goto L2d
            L2a:
                r6 = move-exception
                goto Lab
            L2d:
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2a
                r3 = 0
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 == 0) goto L47
                if (r9 == 0) goto L47
                long r3 = r6.deadlineNanoTime()     // Catch: java.lang.Throwable -> L2a
                long r3 = r3 - r1
                long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L2a
                long r7 = r7 + r1
                okio.AsyncTimeout.access$setTimeoutAt$p(r6, r7)     // Catch: java.lang.Throwable -> L2a
                goto L57
            L47:
                if (r3 == 0) goto L4e
                long r7 = r7 + r1
                okio.AsyncTimeout.access$setTimeoutAt$p(r6, r7)     // Catch: java.lang.Throwable -> L2a
                goto L57
            L4e:
                if (r9 == 0) goto L9d
                long r7 = r6.deadlineNanoTime()     // Catch: java.lang.Throwable -> L2a
                okio.AsyncTimeout.access$setTimeoutAt$p(r6, r7)     // Catch: java.lang.Throwable -> L2a
            L57:
                long r7 = okio.AsyncTimeout.access$remainingNanos(r6, r1)     // Catch: java.lang.Throwable -> L2a
                okio.AsyncTimeout r9 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L2a
                r9.getClass()     // Catch: java.lang.Throwable -> L2a
            L62:
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r9)     // Catch: java.lang.Throwable -> L2a
                if (r3 == 0) goto L80
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r9)     // Catch: java.lang.Throwable -> L2a
                r3.getClass()     // Catch: java.lang.Throwable -> L2a
                long r3 = okio.AsyncTimeout.access$remainingNanos(r3, r1)     // Catch: java.lang.Throwable -> L2a
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 >= 0) goto L78
                goto L80
            L78:
                okio.AsyncTimeout r9 = okio.AsyncTimeout.access$getNext$p(r9)     // Catch: java.lang.Throwable -> L2a
                r9.getClass()     // Catch: java.lang.Throwable -> L2a
                goto L62
            L80:
                okio.AsyncTimeout r7 = okio.AsyncTimeout.access$getNext$p(r9)     // Catch: java.lang.Throwable -> L2a
                okio.AsyncTimeout.access$setNext$p(r6, r7)     // Catch: java.lang.Throwable -> L2a
                okio.AsyncTimeout.access$setNext$p(r9, r6)     // Catch: java.lang.Throwable -> L2a
                okio.AsyncTimeout r6 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L2a
                if (r9 != r6) goto L99
                okio.AsyncTimeout$Companion r6 = okio.AsyncTimeout.Companion     // Catch: java.lang.Throwable -> L2a
                java.util.concurrent.locks.Condition r6 = r6.getCondition()     // Catch: java.lang.Throwable -> L2a
                r6.signal()     // Catch: java.lang.Throwable -> L2a
            L99:
                r0.unlock()
                return
            L9d:
                java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L2a
                r6.<init>()     // Catch: java.lang.Throwable -> L2a
                throw r6     // Catch: java.lang.Throwable -> L2a
            La3:
                java.lang.String r6 = "Unbalanced enter/exit"
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2a
                r7.<init>(r6)     // Catch: java.lang.Throwable -> L2a
                throw r7     // Catch: java.lang.Throwable -> L2a
            Lab:
                r0.unlock()
                throw r6
        }

        public final okio.AsyncTimeout awaitTimeout$okio() {
                r7 = this;
                okio.AsyncTimeout r0 = okio.AsyncTimeout.access$getHead$cp()
                r0.getClass()
                okio.AsyncTimeout r0 = okio.AsyncTimeout.access$getNext$p(r0)
                r1 = 0
                if (r0 != 0) goto L3f
                long r2 = java.lang.System.nanoTime()
                java.util.concurrent.locks.Condition r0 = r7.getCondition()
                long r4 = okio.AsyncTimeout.access$getIDLE_TIMEOUT_MILLIS$cp()
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                r0.await(r4, r6)
                okio.AsyncTimeout r0 = okio.AsyncTimeout.access$getHead$cp()
                r0.getClass()
                okio.AsyncTimeout r0 = okio.AsyncTimeout.access$getNext$p(r0)
                if (r0 != 0) goto L3e
                long r4 = java.lang.System.nanoTime()
                long r4 = r4 - r2
                long r2 = okio.AsyncTimeout.access$getIDLE_TIMEOUT_NANOS$cp()
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 < 0) goto L3e
                okio.AsyncTimeout r0 = okio.AsyncTimeout.access$getHead$cp()
                return r0
            L3e:
                return r1
            L3f:
                long r2 = java.lang.System.nanoTime()
                long r2 = okio.AsyncTimeout.access$remainingNanos(r0, r2)
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 <= 0) goto L57
                java.util.concurrent.locks.Condition r0 = r7.getCondition()
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
                r0.await(r2, r4)
                return r1
            L57:
                okio.AsyncTimeout r2 = okio.AsyncTimeout.access$getHead$cp()
                r2.getClass()
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r0)
                okio.AsyncTimeout.access$setNext$p(r2, r3)
                okio.AsyncTimeout.access$setNext$p(r0, r1)
                return r0
        }

        public final java.util.concurrent.locks.Condition getCondition() {
                r1 = this;
                java.util.concurrent.locks.Condition r0 = okio.AsyncTimeout.access$getCondition$cp()
                return r0
        }

        public final java.util.concurrent.locks.ReentrantLock getLock() {
                r1 = this;
                java.util.concurrent.locks.ReentrantLock r0 = okio.AsyncTimeout.access$getLock$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Watchdog extends java.lang.Thread {
        public Watchdog() {
                r1 = this;
                java.lang.String r0 = "Okio Watchdog"
                r1.<init>(r0)
                r0 = 1
                r1.setDaemon(r0)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r3 = this;
            L0:
                okio.AsyncTimeout$Companion r0 = okio.AsyncTimeout.Companion     // Catch: java.lang.InterruptedException -> L0
                java.util.concurrent.locks.ReentrantLock r1 = r0.getLock()     // Catch: java.lang.InterruptedException -> L0
                r1.lock()     // Catch: java.lang.InterruptedException -> L0
                okio.AsyncTimeout r0 = r0.awaitTimeout$okio()     // Catch: java.lang.Throwable -> L1b
                okio.AsyncTimeout r2 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L1b
                if (r0 != r2) goto L1d
                r0 = 0
                okio.AsyncTimeout.access$setHead$cp(r0)     // Catch: java.lang.Throwable -> L1b
                r1.unlock()     // Catch: java.lang.InterruptedException -> L0
                return
            L1b:
                r0 = move-exception
                goto L26
            L1d:
                r1.unlock()     // Catch: java.lang.InterruptedException -> L0
                if (r0 == 0) goto L0
                r0.timedOut()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L26:
                r1.unlock()     // Catch: java.lang.InterruptedException -> L0
                throw r0     // Catch: java.lang.InterruptedException -> L0
        }
    }



    static {
            okio.AsyncTimeout$Companion r0 = new okio.AsyncTimeout$Companion
            r1 = 0
            r0.<init>(r1)
            okio.AsyncTimeout.Companion = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            okio.AsyncTimeout.lock = r0
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            r0.getClass()
            okio.AsyncTimeout.condition = r0
            r0 = 60000(0xea60, double:2.9644E-319)
            okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r2.toNanos(r0)
            okio.AsyncTimeout.IDLE_TIMEOUT_NANOS = r0
            return
    }

    public AsyncTimeout() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.util.concurrent.locks.Condition access$getCondition$cp() {
            java.util.concurrent.locks.Condition r0 = okio.AsyncTimeout.condition
            return r0
    }

    public static final /* synthetic */ okio.AsyncTimeout access$getHead$cp() {
            okio.AsyncTimeout r0 = okio.AsyncTimeout.head
            return r0
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_MILLIS$cp() {
            long r0 = okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS
            return r0
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_NANOS$cp() {
            long r0 = okio.AsyncTimeout.IDLE_TIMEOUT_NANOS
            return r0
    }

    public static final /* synthetic */ boolean access$getInQueue$p(okio.AsyncTimeout r0) {
            boolean r0 = r0.inQueue
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.locks.ReentrantLock access$getLock$cp() {
            java.util.concurrent.locks.ReentrantLock r0 = okio.AsyncTimeout.lock
            return r0
    }

    public static final /* synthetic */ okio.AsyncTimeout access$getNext$p(okio.AsyncTimeout r0) {
            okio.AsyncTimeout r0 = r0.next
            return r0
    }

    public static final /* synthetic */ long access$remainingNanos(okio.AsyncTimeout r0, long r1) {
            long r0 = r0.remainingNanos(r1)
            return r0
    }

    public static final /* synthetic */ void access$setHead$cp(okio.AsyncTimeout r0) {
            okio.AsyncTimeout.head = r0
            return
    }

    public static final /* synthetic */ void access$setInQueue$p(okio.AsyncTimeout r0, boolean r1) {
            r0.inQueue = r1
            return
    }

    public static final /* synthetic */ void access$setNext$p(okio.AsyncTimeout r0, okio.AsyncTimeout r1) {
            r0.next = r1
            return
    }

    public static final /* synthetic */ void access$setTimeoutAt$p(okio.AsyncTimeout r0, long r1) {
            r0.timeoutAt = r1
            return
    }

    private final long remainingNanos(long r3) {
            r2 = this;
            long r0 = r2.timeoutAt
            long r0 = r0 - r3
            return r0
    }

    public final java.io.IOException access$newTimeoutException(java.io.IOException r1) {
            r0 = this;
            java.io.IOException r1 = r0.newTimeoutException(r1)
            return r1
    }

    public final void enter() {
            r5 = this;
            long r0 = r5.timeoutNanos()
            boolean r2 = r5.hasDeadline()
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L11
            if (r2 != 0) goto L11
            return
        L11:
            okio.AsyncTimeout$Companion r3 = okio.AsyncTimeout.Companion
            okio.AsyncTimeout.Companion.access$scheduleTimeout(r3, r5, r0, r2)
            return
    }

    public final boolean exit() {
            r1 = this;
            okio.AsyncTimeout$Companion r0 = okio.AsyncTimeout.Companion
            boolean r0 = okio.AsyncTimeout.Companion.access$cancelScheduledTimeout(r0, r1)
            return r0
    }

    public java.io.IOException newTimeoutException(java.io.IOException r3) {
            r2 = this;
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Lc
            r0.initCause(r3)
        Lc:
            return r0
    }

    public final okio.Sink sink(okio.Sink r2) {
            r1 = this;
            r2.getClass()
            okio.AsyncTimeout$sink$1 r0 = new okio.AsyncTimeout$sink$1
            r0.<init>(r1, r2)
            return r0
    }

    public final okio.Source source(okio.Source r2) {
            r1 = this;
            r2.getClass()
            okio.AsyncTimeout$source$1 r0 = new okio.AsyncTimeout$source$1
            r0.<init>(r1, r2)
            return r0
    }

    public void timedOut() {
            r0 = this;
            return
    }

    public final <T> T withTimeout(fg.a r2) {
            r1 = this;
            r2.getClass()
            r1.enter()
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            boolean r0 = r1.exit()
            if (r0 != 0) goto L11
            return r2
        L11:
            r2 = 0
            java.io.IOException r2 = r1.access$newTimeoutException(r2)
            throw r2
        L17:
            r2 = move-exception
            goto L26
        L19:
            r2 = move-exception
            boolean r0 = r1.exit()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L21
            goto L25
        L21:
            java.io.IOException r2 = r1.access$newTimeoutException(r2)     // Catch: java.lang.Throwable -> L17
        L25:
            throw r2     // Catch: java.lang.Throwable -> L17
        L26:
            r1.exit()
            throw r2
    }
}
