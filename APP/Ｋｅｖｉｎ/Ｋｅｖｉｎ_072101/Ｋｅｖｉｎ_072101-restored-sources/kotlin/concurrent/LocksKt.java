package kotlin.concurrent;

/* JADX INFO: compiled from: Locks.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u001a6\u0010\u0006\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\b\u001a6\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, m115d2 = {"read", "T", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "action", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withLock", "Ljava/util/concurrent/locks/Lock;", "(Ljava/util/concurrent/locks/Lock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "write", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class LocksKt {
    private static final <T> T read(java.util.concurrent.locks.ReentrantReadWriteLock r3, kotlin.jvm.functions.Function0<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.readLock()
            r0.lock()
            r1 = 1
            java.lang.Object r2 = r4.invoke()     // Catch: java.lang.Throwable -> L22
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r0.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r2
        L22:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r0.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r2
    }

    private static final <T> T withLock(java.util.concurrent.locks.Lock r2, kotlin.jvm.functions.Function0<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.lock()
            r0 = 1
            java.lang.Object r1 = r3.invoke()     // Catch: java.lang.Throwable -> L1e
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r2.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r1
        L1e:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r2.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r1
    }

    private static final <T> T write(java.util.concurrent.locks.ReentrantReadWriteLock r8, kotlin.jvm.functions.Function0<? extends T> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r8.readLock()
            int r1 = r8.getWriteHoldCount()
            r2 = 0
            if (r1 != 0) goto L1b
            int r1 = r8.getReadHoldCount()
            goto L1c
        L1b:
            r1 = r2
        L1c:
            r3 = r2
        L1d:
            if (r3 >= r1) goto L27
            r4 = r3
            r5 = 0
            r0.unlock()
            int r3 = r3 + 1
            goto L1d
        L27:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r8.writeLock()
            r3.lock()
            r4 = 1
            java.lang.Object r5 = r9.invoke()     // Catch: java.lang.Throwable -> L49
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
        L38:
            if (r2 >= r1) goto L42
            r6 = r2
            r7 = 0
            r0.lock()
            int r2 = r2 + 1
            goto L38
        L42:
            r3.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            return r5
        L49:
            r5 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
        L4d:
            if (r2 >= r1) goto L57
            r6 = r2
            r7 = 0
            r0.lock()
            int r2 = r2 + 1
            goto L4d
        L57:
            r3.unlock()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            throw r5
    }
}
