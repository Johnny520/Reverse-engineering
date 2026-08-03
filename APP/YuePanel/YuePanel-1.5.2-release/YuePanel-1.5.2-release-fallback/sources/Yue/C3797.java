package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
@Yue.InterfaceC3421(name = "LocksKt")
public final class C3797 {
    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> T m15220(java.util.concurrent.locks.ReentrantReadWriteLock r1, Yue.InterfaceC2823<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r2, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.lock()
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L20
            Yue.C3249.m13687(r0)
            r1.unlock()
            Yue.C3249.m13686(r0)
            return r2
        L20:
            r2 = move-exception
            Yue.C3249.m13687(r0)
            r1.unlock()
            Yue.C3249.m13686(r0)
            throw r2
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> T m15221(java.util.concurrent.locks.Lock r1, Yue.InterfaceC2823<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r2, r0)
            r1.lock()
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L1c
            Yue.C3249.m13687(r0)
            r1.unlock()
            Yue.C3249.m13686(r0)
            return r2
        L1c:
            r2 = move-exception
            Yue.C3249.m13687(r0)
            r1.unlock()
            Yue.C3249.m13686(r0)
            throw r2
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> T m15222(java.util.concurrent.locks.ReentrantReadWriteLock r4, Yue.InterfaceC2823<? extends T> r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r5, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.readLock()
            int r1 = r4.getWriteHoldCount()
            r2 = 0
            if (r1 != 0) goto L1a
            int r1 = r4.getReadHoldCount()
            goto L1b
        L1a:
            r1 = r2
        L1b:
            r3 = r2
        L1c:
            if (r3 >= r1) goto L24
            r0.unlock()
            int r3 = r3 + 1
            goto L1c
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.lock()
            r3 = 1
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L42
            Yue.C3249.m13687(r3)
        L33:
            if (r2 >= r1) goto L3b
            r0.lock()
            int r2 = r2 + 1
            goto L33
        L3b:
            r4.unlock()
            Yue.C3249.m13686(r3)
            return r5
        L42:
            r5 = move-exception
            Yue.C3249.m13687(r3)
        L46:
            if (r2 >= r1) goto L4e
            r0.lock()
            int r2 = r2 + 1
            goto L46
        L4e:
            r4.unlock()
            Yue.C3249.m13686(r3)
            throw r5
    }
}
