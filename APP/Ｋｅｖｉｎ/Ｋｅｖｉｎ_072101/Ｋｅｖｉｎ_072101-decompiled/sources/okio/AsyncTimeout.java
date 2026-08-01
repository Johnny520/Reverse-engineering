package okio;

/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0004J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\fH\u0014J%\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, m115d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "()V", "inQueue", "", "next", "timeoutAt", "", "access$newTimeoutException", "Ljava/io/IOException;", "cause", "enter", "", "exit", "newTimeoutException", "remainingNanos", "now", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "timedOut", "withTimeout", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "Watchdog", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
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

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @kotlin.Metadata(m114d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0002J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m115d2 = {"Lokio/AsyncTimeout$Companion;", "", "()V", "IDLE_TIMEOUT_MILLIS", "", "IDLE_TIMEOUT_NANOS", "TIMEOUT_WRITE_SIZE", "", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "head", "Lokio/AsyncTimeout;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "awaitTimeout", "awaitTimeout$okio", "cancelScheduledTimeout", "", "node", "scheduleTimeout", "", "timeoutNanos", "hasDeadline", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ boolean access$cancelScheduledTimeout(okio.AsyncTimeout.Companion r1, okio.AsyncTimeout r2) {
                boolean r0 = r1.cancelScheduledTimeout(r2)
                return r0
        }

        public static final /* synthetic */ void access$scheduleTimeout(okio.AsyncTimeout.Companion r0, okio.AsyncTimeout r1, long r2, boolean r4) {
                r0.scheduleTimeout(r1, r2, r4)
                return
        }

        private final boolean cancelScheduledTimeout(okio.AsyncTimeout r6) {
                r5 = this;
                okio.AsyncTimeout$Companion r0 = okio.AsyncTimeout.Companion
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()
                java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
                r0.lock()
                r1 = 0
                boolean r2 = okio.AsyncTimeout.access$getInQueue$p(r6)     // Catch: java.lang.Throwable -> L42
                r3 = 0
                if (r2 != 0) goto L17
                r0.unlock()
                return r3
            L17:
                okio.AsyncTimeout.access$setInQueue$p(r6, r3)     // Catch: java.lang.Throwable -> L42
                okio.AsyncTimeout r2 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L42
            L1e:
                if (r2 == 0) goto L3c
                okio.AsyncTimeout r4 = okio.AsyncTimeout.access$getNext$p(r2)     // Catch: java.lang.Throwable -> L42
                if (r4 != r6) goto L36
                okio.AsyncTimeout r4 = okio.AsyncTimeout.access$getNext$p(r6)     // Catch: java.lang.Throwable -> L42
                okio.AsyncTimeout.access$setNext$p(r2, r4)     // Catch: java.lang.Throwable -> L42
                r4 = 0
                okio.AsyncTimeout.access$setNext$p(r6, r4)     // Catch: java.lang.Throwable -> L42
                r0.unlock()
                return r3
            L36:
                okio.AsyncTimeout r4 = okio.AsyncTimeout.access$getNext$p(r2)     // Catch: java.lang.Throwable -> L42
                r2 = r4
                goto L1e
            L3c:
                r0.unlock()
                r0 = 1
                return r0
            L42:
                r1 = move-exception
                r0.unlock()
                throw r1
        }

        private final void scheduleTimeout(okio.AsyncTimeout r10, long r11, boolean r13) {
                r9 = this;
                okio.AsyncTimeout$Companion r0 = okio.AsyncTimeout.Companion
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()
                java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
                r0.lock()
                r1 = 0
                boolean r2 = okio.AsyncTimeout.access$getInQueue$p(r10)     // Catch: java.lang.Throwable -> Lba
                if (r2 != 0) goto Lad
                r2 = 1
                okio.AsyncTimeout.access$setInQueue$p(r10, r2)     // Catch: java.lang.Throwable -> Lba
                okio.AsyncTimeout r2 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> Lba
                if (r2 != 0) goto L2e
                okio.AsyncTimeout$Companion r2 = okio.AsyncTimeout.Companion     // Catch: java.lang.Throwable -> Lba
                okio.AsyncTimeout r2 = new okio.AsyncTimeout     // Catch: java.lang.Throwable -> Lba
                r2.<init>()     // Catch: java.lang.Throwable -> Lba
                okio.AsyncTimeout.access$setHead$cp(r2)     // Catch: java.lang.Throwable -> Lba
                okio.AsyncTimeout$Watchdog r2 = new okio.AsyncTimeout$Watchdog     // Catch: java.lang.Throwable -> Lba
                r2.<init>()     // Catch: java.lang.Throwable -> Lba
                r2.start()     // Catch: java.lang.Throwable -> Lba
            L2e:
                long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lba
                r4 = 0
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 == 0) goto L48
                if (r13 == 0) goto L48
                long r4 = r10.deadlineNanoTime()     // Catch: java.lang.Throwable -> Lba
                long r4 = r4 - r2
                long r4 = java.lang.Math.min(r11, r4)     // Catch: java.lang.Throwable -> Lba
                long r4 = r4 + r2
                okio.AsyncTimeout.access$setTimeoutAt$p(r10, r4)     // Catch: java.lang.Throwable -> Lba
                goto L5b
            L48:
                int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r4 == 0) goto L52
                long r4 = r2 + r11
                okio.AsyncTimeout.access$setTimeoutAt$p(r10, r4)     // Catch: java.lang.Throwable -> Lba
                goto L5b
            L52:
                if (r13 == 0) goto La7
                long r4 = r10.deadlineNanoTime()     // Catch: java.lang.Throwable -> Lba
                okio.AsyncTimeout.access$setTimeoutAt$p(r10, r4)     // Catch: java.lang.Throwable -> Lba
            L5b:
                long r4 = okio.AsyncTimeout.access$remainingNanos(r10, r2)     // Catch: java.lang.Throwable -> Lba
                okio.AsyncTimeout r6 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> Lba
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> Lba
            L66:
                okio.AsyncTimeout r7 = okio.AsyncTimeout.access$getNext$p(r6)     // Catch: java.lang.Throwable -> Lba
                if (r7 == 0) goto L86
                okio.AsyncTimeout r7 = okio.AsyncTimeout.access$getNext$p(r6)     // Catch: java.lang.Throwable -> Lba
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.lang.Throwable -> Lba
                long r7 = okio.AsyncTimeout.access$remainingNanos(r7, r2)     // Catch: java.lang.Throwable -> Lba
                int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r7 >= 0) goto L7d
                goto L86
            L7d:
                okio.AsyncTimeout r7 = okio.AsyncTimeout.access$getNext$p(r6)     // Catch: java.lang.Throwable -> Lba
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.lang.Throwable -> Lba
                r6 = r7
                goto L66
            L86:
                okio.AsyncTimeout r7 = okio.AsyncTimeout.access$getNext$p(r6)     // Catch: java.lang.Throwable -> Lba
                okio.AsyncTimeout.access$setNext$p(r10, r7)     // Catch: java.lang.Throwable -> Lba
                okio.AsyncTimeout.access$setNext$p(r6, r10)     // Catch: java.lang.Throwable -> Lba
                okio.AsyncTimeout r7 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> Lba
                if (r6 != r7) goto L9f
                okio.AsyncTimeout$Companion r7 = okio.AsyncTimeout.Companion     // Catch: java.lang.Throwable -> Lba
                java.util.concurrent.locks.Condition r7 = r7.getCondition()     // Catch: java.lang.Throwable -> Lba
                r7.signal()     // Catch: java.lang.Throwable -> Lba
            L9f:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lba
                r0.unlock()
                return
            La7:
                java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Lba
                r4.<init>()     // Catch: java.lang.Throwable -> Lba
                throw r4     // Catch: java.lang.Throwable -> Lba
            Lad:
                r2 = 0
                java.lang.String r3 = "Unbalanced enter/exit"
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lba
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lba
                r2.<init>(r3)     // Catch: java.lang.Throwable -> Lba
                throw r2     // Catch: java.lang.Throwable -> Lba
            Lba:
                r1 = move-exception
                r0.unlock()
                throw r1
        }

        public final okio.AsyncTimeout awaitTimeout$okio() throws java.lang.InterruptedException {
                r8 = this;
                okio.AsyncTimeout r0 = okio.AsyncTimeout.access$getHead$cp()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                okio.AsyncTimeout r0 = okio.AsyncTimeout.access$getNext$p(r0)
                r1 = 0
                if (r0 != 0) goto L40
                long r2 = java.lang.System.nanoTime()
                java.util.concurrent.locks.Condition r4 = r8.getCondition()
                long r5 = okio.AsyncTimeout.access$getIDLE_TIMEOUT_MILLIS$cp()
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
                r4.await(r5, r7)
                okio.AsyncTimeout r4 = okio.AsyncTimeout.access$getHead$cp()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                okio.AsyncTimeout r4 = okio.AsyncTimeout.access$getNext$p(r4)
                if (r4 != 0) goto L3e
                long r4 = java.lang.System.nanoTime()
                long r4 = r4 - r2
                long r6 = okio.AsyncTimeout.access$getIDLE_TIMEOUT_NANOS$cp()
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 < 0) goto L3e
                okio.AsyncTimeout r1 = okio.AsyncTimeout.access$getHead$cp()
                goto L3f
            L3e:
            L3f:
                return r1
            L40:
                long r2 = java.lang.System.nanoTime()
                long r2 = okio.AsyncTimeout.access$remainingNanos(r0, r2)
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 <= 0) goto L58
                java.util.concurrent.locks.Condition r4 = r8.getCondition()
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
                r4.await(r2, r5)
                return r1
            L58:
                okio.AsyncTimeout r4 = okio.AsyncTimeout.access$getHead$cp()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                okio.AsyncTimeout r5 = okio.AsyncTimeout.access$getNext$p(r0)
                okio.AsyncTimeout.access$setNext$p(r4, r5)
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

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m115d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "()V", "run", "", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    private static final class Watchdog extends java.lang.Thread {
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
                r4 = this;
            L1:
                r0 = 0
                okio.AsyncTimeout$Companion r1 = okio.AsyncTimeout.Companion     // Catch: java.lang.InterruptedException -> L39
                java.util.concurrent.locks.ReentrantLock r1 = r1.getLock()     // Catch: java.lang.InterruptedException -> L39
                java.util.concurrent.locks.Lock r1 = (java.util.concurrent.locks.Lock) r1     // Catch: java.lang.InterruptedException -> L39
                r1.lock()     // Catch: java.lang.InterruptedException -> L39
                r2 = 0
                okio.AsyncTimeout$Companion r3 = okio.AsyncTimeout.Companion     // Catch: java.lang.Throwable -> L34
                okio.AsyncTimeout r3 = r3.awaitTimeout$okio()     // Catch: java.lang.Throwable -> L34
                r0 = r3
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L34
                if (r0 != r3) goto L28
                okio.AsyncTimeout$Companion r3 = okio.AsyncTimeout.Companion     // Catch: java.lang.Throwable -> L34
                r3 = 0
                okio.AsyncTimeout.access$setHead$cp(r3)     // Catch: java.lang.Throwable -> L34
                r1.unlock()     // Catch: java.lang.InterruptedException -> L39
                return
            L28:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L34
                r1.unlock()     // Catch: java.lang.InterruptedException -> L39
                if (r0 == 0) goto L1
                r0.timedOut()     // Catch: java.lang.InterruptedException -> L39
                goto L1
            L34:
                r2 = move-exception
                r1.unlock()     // Catch: java.lang.InterruptedException -> L39
                throw r2     // Catch: java.lang.InterruptedException -> L39
            L39:
                r0 = move-exception
                goto L1
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
            java.util.concurrent.locks.ReentrantLock r0 = okio.AsyncTimeout.lock
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            java.lang.String r1 = "newCondition(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            okio.AsyncTimeout.condition = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 60
            long r0 = r0.toMillis(r1)
            okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS
            long r0 = r0.toNanos(r1)
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

    public static final /* synthetic */ boolean access$getInQueue$p(okio.AsyncTimeout r1) {
            boolean r0 = r1.inQueue
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.locks.ReentrantLock access$getLock$cp() {
            java.util.concurrent.locks.ReentrantLock r0 = okio.AsyncTimeout.lock
            return r0
    }

    public static final /* synthetic */ okio.AsyncTimeout access$getNext$p(okio.AsyncTimeout r1) {
            okio.AsyncTimeout r0 = r1.next
            return r0
    }

    public static final /* synthetic */ long access$remainingNanos(okio.AsyncTimeout r2, long r3) {
            long r0 = r2.remainingNanos(r3)
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

    public final java.io.IOException access$newTimeoutException(java.io.IOException r2) {
            r1 = this;
            java.io.IOException r0 = r1.newTimeoutException(r2)
            return r0
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

    protected java.io.IOException newTimeoutException(java.io.IOException r3) {
            r2 = this;
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Lf
            r1 = r3
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.initCause(r1)
        Lf:
            r1 = r0
            java.io.IOException r1 = (java.io.IOException) r1
            return r1
    }

    public final okio.Sink sink(okio.Sink r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.AsyncTimeout$sink$1 r0 = new okio.AsyncTimeout$sink$1
            r0.<init>(r1, r2)
            okio.Sink r0 = (okio.Sink) r0
            return r0
    }

    public final okio.Source source(okio.Source r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.AsyncTimeout$source$1 r0 = new okio.AsyncTimeout$source$1
            r0.<init>(r1, r2)
            okio.Source r0 = (okio.Source) r0
            return r0
    }

    protected void timedOut() {
            r0 = this;
            return
    }

    public final <T> T withTimeout(kotlin.jvm.functions.Function0<? extends T> r7) {
            r6 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 0
            r6.enter()
            r2 = 0
            r3 = 1
            java.lang.Object r4 = r7.invoke()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r1 = 1
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            boolean r5 = r6.exit()
            if (r5 != 0) goto L21
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            r2 = r4
            return r4
        L21:
            java.io.IOException r2 = r6.access$newTimeoutException(r2)
            throw r2
        L26:
            r4 = move-exception
            goto L3a
        L28:
            r4 = move-exception
            boolean r5 = r6.exit()     // Catch: java.lang.Throwable -> L26
            if (r5 != 0) goto L33
            r5 = r4
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch: java.lang.Throwable -> L26
            goto L39
        L33:
            java.io.IOException r5 = r6.access$newTimeoutException(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch: java.lang.Throwable -> L26
        L39:
            throw r5     // Catch: java.lang.Throwable -> L26
        L3a:
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            boolean r5 = r6.exit()
            if (r5 == 0) goto L4a
            if (r1 == 0) goto L4a
            java.io.IOException r2 = r6.access$newTimeoutException(r2)
            throw r2
        L4a:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r4
    }
}
