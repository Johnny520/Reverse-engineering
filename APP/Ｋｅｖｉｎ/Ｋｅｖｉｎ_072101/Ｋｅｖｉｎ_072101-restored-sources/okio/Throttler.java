package okio;

/* JADX INFO: compiled from: Throttler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0014J$\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u001bJ\f\u0010\u001c\u001a\u00020\u0004*\u00020\u0004H\u0002J\f\u0010\u001d\u001a\u00020\u0004*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m115d2 = {"Lokio/Throttler;", "", "()V", "allocatedUntil", "", "(J)V", "bytesPerSecond", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "maxByteCount", "waitByteCount", "byteCountOrWaitNanos", "now", "byteCount", "byteCountOrWaitNanos$okio", "", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "take", "take$okio", "bytesToNanos", "nanosToBytes", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private final java.util.concurrent.locks.Condition condition;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private long maxByteCount;
    private long waitByteCount;



    public Throttler() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            r2.<init>(r0)
            return
    }

    public Throttler(long r3) {
            r2 = this;
            r2.<init>()
            r2.allocatedUntil = r3
            r0 = 8192(0x2000, double:4.0474E-320)
            r2.waitByteCount = r0
            r0 = 262144(0x40000, double:1.295163E-318)
            r2.maxByteCount = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.lock = r0
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            java.lang.String r1 = "newCondition(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.condition = r0
            return
    }

    public static /* synthetic */ void bytesPerSecond$default(okio.Throttler r7, long r8, long r10, long r12, int r14, java.lang.Object r15) {
            r15 = r14 & 2
            if (r15 == 0) goto L8
            long r10 = r7.waitByteCount
            r3 = r10
            goto L9
        L8:
            r3 = r10
        L9:
            r10 = r14 & 4
            if (r10 == 0) goto L11
            long r12 = r7.maxByteCount
            r5 = r12
            goto L12
        L11:
            r5 = r12
        L12:
            r0 = r7
            r1 = r8
            r0.bytesPerSecond(r1, r3, r5)
            return
    }

    private final long bytesToNanos(long r5) {
            r4 = this;
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 * r5
            long r2 = r4.bytesPerSecond
            long r0 = r0 / r2
            return r0
    }

    private final long nanosToBytes(long r5) {
            r4 = this;
            long r0 = r4.bytesPerSecond
            long r0 = r0 * r5
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 / r2
            return r0
    }

    public final long byteCountOrWaitNanos$okio(long r11, long r13) {
            r10 = this;
            long r0 = r10.bytesPerSecond
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L9
            return r13
        L9:
            long r0 = r10.allocatedUntil
            long r0 = r0 - r11
            long r0 = java.lang.Math.max(r0, r2)
            long r4 = r10.maxByteCount
            long r6 = r10.nanosToBytes(r0)
            long r4 = r4 - r6
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 < 0) goto L25
            long r2 = r11 + r0
            long r6 = r10.bytesToNanos(r13)
            long r2 = r2 + r6
            r10.allocatedUntil = r2
            return r13
        L25:
            long r6 = r10.waitByteCount
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r2 = r10.maxByteCount
            long r2 = r10.bytesToNanos(r2)
            long r2 = r2 + r11
            r10.allocatedUntil = r2
            return r4
        L35:
            long r6 = r10.waitByteCount
            long r6 = java.lang.Math.min(r6, r13)
            long r8 = r10.maxByteCount
            long r8 = r6 - r8
            long r8 = r10.bytesToNanos(r8)
            long r8 = r8 + r0
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 != 0) goto L52
            long r2 = r10.maxByteCount
            long r2 = r10.bytesToNanos(r2)
            long r2 = r2 + r11
            r10.allocatedUntil = r2
            return r6
        L52:
            long r2 = -r8
            return r2
    }

    public final void bytesPerSecond(long r10) {
            r9 = this;
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            r0 = r9
            r1 = r10
            bytesPerSecond$default(r0, r1, r3, r5, r7, r8)
            return
    }

    public final void bytesPerSecond(long r10, long r12) {
            r9 = this;
            r7 = 4
            r8 = 0
            r5 = 0
            r0 = r9
            r1 = r10
            r3 = r12
            bytesPerSecond$default(r0, r1, r3, r5, r7, r8)
            return
    }

    public final void bytesPerSecond(long r9, long r11, long r13) {
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            r1 = 0
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 < 0) goto L12
            r4 = r5
            goto L13
        L12:
            r4 = r6
        L13:
            java.lang.String r7 = "Failed requirement."
            if (r4 == 0) goto L4e
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1d
            r2 = r5
            goto L1e
        L1d:
            r2 = r6
        L1e:
            if (r2 == 0) goto L44
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 < 0) goto L25
            goto L26
        L25:
            r5 = r6
        L26:
            if (r5 == 0) goto L3a
            r8.bytesPerSecond = r9     // Catch: java.lang.Throwable -> L58
            r8.waitByteCount = r11     // Catch: java.lang.Throwable -> L58
            r8.maxByteCount = r13     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.locks.Condition r2 = r8.condition     // Catch: java.lang.Throwable -> L58
            r2.signalAll()     // Catch: java.lang.Throwable -> L58
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L58
            r0.unlock()
            return
        L3a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L58
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L58
            throw r2     // Catch: java.lang.Throwable -> L58
        L44:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L58
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L58
            throw r2     // Catch: java.lang.Throwable -> L58
        L4e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L58
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L58
            throw r2     // Catch: java.lang.Throwable -> L58
        L58:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final java.util.concurrent.locks.Condition getCondition() {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.condition
            return r0
    }

    public final java.util.concurrent.locks.ReentrantLock getLock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            return r0
    }

    public final okio.Sink sink(okio.Sink r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Throttler$sink$1 r0 = new okio.Throttler$sink$1
            r0.<init>(r2, r1)
            okio.Sink r0 = (okio.Sink) r0
            return r0
    }

    public final okio.Source source(okio.Source r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Throttler$source$1 r0 = new okio.Throttler$source$1
            r0.<init>(r2, r1)
            okio.Source r0 = (okio.Source) r0
            return r0
    }

    public final long take$okio(long r12) {
            r11 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto L30
            java.util.concurrent.locks.ReentrantLock r2 = r11.lock
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
        L13:
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2b
            long r6 = r11.byteCountOrWaitNanos$okio(r4, r12)     // Catch: java.lang.Throwable -> L2b
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 < 0) goto L24
            r2.unlock()
            return r6
        L24:
            java.util.concurrent.locks.Condition r8 = r11.condition     // Catch: java.lang.Throwable -> L2b
            long r9 = -r6
            r8.awaitNanos(r9)     // Catch: java.lang.Throwable -> L2b
            goto L13
        L2b:
            r0 = move-exception
            r2.unlock()
            throw r0
        L30:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
