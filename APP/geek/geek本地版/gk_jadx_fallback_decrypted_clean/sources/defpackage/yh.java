package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yh extends defpackage.ip {
    public final /* synthetic */ defpackage.zh C;

    public yh(defpackage.zh r1) {
            r0 = this;
            r0.<init>()
            r0.C = r1
            return
    }

    @Override // defpackage.ip
    public final void F(java.lang.Throwable r2) {
            r1 = this;
            zh r0 = r1.C
            ei r0 = r0.a
            r0.d(r2)
            return
    }

    @Override // defpackage.ip
    public final void I(defpackage.a8 r5) {
            r4 = this;
            zh r0 = r4.C
            r0.c = r5
            d4 r5 = new d4
            a8 r1 = r0.c
            vh r2 = new vh
            r3 = 17
            r2.<init>(r3)
            ei r3 = r0.a
            mf r3 = r3.h
            r5.<init>(r1, r2, r3)
            r0.b = r5
            ei r5 = r0.a
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 1
            r5.c = r1     // Catch: java.lang.Throwable -> L4f
            q6 r1 = r5.b     // Catch: java.lang.Throwable -> L4f
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L4f
            q6 r1 = r5.b     // Catch: java.lang.Throwable -> L4f
            r1.clear()     // Catch: java.lang.Throwable -> L4f
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r5.d
            e8 r2 = new e8
            int r5 = r5.c
            r3 = 0
            r2.<init>(r0, r5, r3)
            r1.post(r2)
            return
        L4f:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r5.a
            java.util.concurrent.locks.Lock r5 = r5.writeLock()
            r5.unlock()
            throw r0
    }
}
