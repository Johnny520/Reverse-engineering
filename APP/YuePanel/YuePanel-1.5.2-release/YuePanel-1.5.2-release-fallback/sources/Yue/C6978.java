package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6978 extends Yue.AbstractC1675 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6978 f24344 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f24345 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, Yue.InterfaceC2825<java.lang.Throwable, java.lang.Throwable>> f24346 = null;

    static {
            Yue.ۥۢۥۡ r0 = new Yue.ۥۢۥۡ
            r0.<init>()
            Yue.C6978.f24344 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            Yue.C6978.f24345 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            Yue.C6978.f24346 = r0
            return
    }

    public C6978() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.AbstractC1675
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC2825<java.lang.Throwable, java.lang.Throwable> mo6046(@Yue.InterfaceC4418 java.lang.Class<? extends java.lang.Throwable> r7) {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = Yue.C6978.f24345
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, Yue.ۥۣ۠ۡ۟<java.lang.Throwable, java.lang.Throwable>> r2 = Yue.C6978.f24346     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L6e
            Yue.ۥۣ۠ۡ۟ r2 = (Yue.InterfaceC2825) r2     // Catch: java.lang.Throwable -> L6e
            r1.unlock()
            if (r2 == 0) goto L17
            return r2
        L17:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L27
            int r2 = r0.getReadHoldCount()
            goto L28
        L27:
            r2 = r3
        L28:
            r4 = r3
        L29:
            if (r4 >= r2) goto L31
            r1.unlock()
            int r4 = r4 + 1
            goto L29
        L31:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, Yue.ۥۣ۠ۡ۟<java.lang.Throwable, java.lang.Throwable>> r4 = Yue.C6978.f24346     // Catch: java.lang.Throwable -> L61
            java.lang.Object r5 = r4.get(r7)     // Catch: java.lang.Throwable -> L61
            Yue.ۥۣ۠ۡ۟ r5 = (Yue.InterfaceC2825) r5     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L4e
        L42:
            if (r3 >= r2) goto L4a
            r1.lock()
            int r3 = r3 + 1
            goto L42
        L4a:
            r0.unlock()
            return r5
        L4e:
            Yue.ۥۣ۠ۡ۟ r5 = Yue.C2257.m10450(r7)     // Catch: java.lang.Throwable -> L61
            r4.put(r7, r5)     // Catch: java.lang.Throwable -> L61
        L55:
            if (r3 >= r2) goto L5d
            r1.lock()
            int r3 = r3 + 1
            goto L55
        L5d:
            r0.unlock()
            return r5
        L61:
            r7 = move-exception
        L62:
            if (r3 >= r2) goto L6a
            r1.lock()
            int r3 = r3 + 1
            goto L62
        L6a:
            r0.unlock()
            throw r7
        L6e:
            r7 = move-exception
            r1.unlock()
            throw r7
    }
}
