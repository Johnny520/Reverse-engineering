package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0013"}, m115d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "blockedThread", "Ljava/lang/Thread;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "isScopedCoroutine", "", "()Z", "afterCompletion", "", "state", "", "joinBlocking", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
final class BlockingCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> {
    private final java.lang.Thread blockedThread;
    private final kotlinx.coroutines.EventLoop eventLoop;

    public BlockingCoroutine(kotlin.coroutines.CoroutineContext r2, java.lang.Thread r3, kotlinx.coroutines.EventLoop r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.blockedThread = r3
            r1.eventLoop = r4
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void afterCompletion(java.lang.Object r3) {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = r2.blockedThread
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L20
            java.lang.Thread r0 = r2.blockedThread
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r1 != 0) goto L16
            r1 = 0
            goto L1b
        L16:
            r1.unpark(r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L1b:
            if (r1 != 0) goto L20
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L20:
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean isScopedCoroutine() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final T joinBlocking() {
            r7 = this;
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L7
            goto La
        L7:
            r0.registerTimeLoopThread()
        La:
            kotlinx.coroutines.EventLoop r0 = r7.eventLoop     // Catch: java.lang.Throwable -> L8a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L13
            goto L16
        L13:
            kotlinx.coroutines.EventLoop.incrementUseCount$default(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L8a
        L16:
        L17:
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L70
            kotlinx.coroutines.EventLoop r0 = r7.eventLoop     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L28
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L2c
        L28:
            long r4 = r0.processNextEvent()     // Catch: java.lang.Throwable -> L80
        L2c:
            boolean r0 = r7.isCompleted()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L5d
            kotlinx.coroutines.EventLoop r0 = r7.eventLoop     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L37
            goto L3a
        L37:
            kotlinx.coroutines.EventLoop.decrementUseCount$default(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L8a
        L3a:
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 != 0) goto L42
            goto L45
        L42:
            r0.unregisterTimeLoopThread()
        L45:
            java.lang.Object r0 = r7.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L55
            r3 = r0
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
        L55:
            if (r3 != 0) goto L58
            return r0
        L58:
            r1 = r3
            r2 = 0
            java.lang.Throwable r3 = r1.cause
            throw r3
        L5d:
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L65
            r0 = r3
            goto L6a
        L65:
            r0.parkNanos(r7, r4)     // Catch: java.lang.Throwable -> L80
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L80
        L6a:
            if (r0 != 0) goto L17
            java.util.concurrent.locks.LockSupport.parkNanos(r7, r4)     // Catch: java.lang.Throwable -> L80
            goto L17
        L70:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L80
            r0.<init>()     // Catch: java.lang.Throwable -> L80
            r4 = r0
            r5 = 0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L80
            r7.cancelCoroutine(r6)     // Catch: java.lang.Throwable -> L80
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L80
            throw r0     // Catch: java.lang.Throwable -> L80
        L80:
            r0 = move-exception
            kotlinx.coroutines.EventLoop r4 = r7.eventLoop     // Catch: java.lang.Throwable -> L8a
            if (r4 != 0) goto L86
            goto L89
        L86:
            kotlinx.coroutines.EventLoop.decrementUseCount$default(r4, r2, r1, r3)     // Catch: java.lang.Throwable -> L8a
        L89:
            throw r0     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r1 != 0) goto L92
            goto L95
        L92:
            r1.unregisterTimeLoopThread()
        L95:
            throw r0
    }
}
