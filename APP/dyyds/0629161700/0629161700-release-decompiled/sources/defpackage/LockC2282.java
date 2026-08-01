package defpackage;

/* JADX INFO: renamed from: ᲈᛷᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class LockC2282 implements java.util.concurrent.locks.Lock {
    @Override // java.util.concurrent.locks.Lock
    public final void lock() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lockInterruptibly() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.locks.Lock
    public final java.util.concurrent.locks.Condition newCondition() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Should not be called"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.concurrent.locks.Lock
    public final void unlock() {
            r0 = this;
            return
    }
}
