package Yue;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
@InterfaceC5572(name = "LocksKt")
public final class C5860 {
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final <T> T m2527(ReentrantReadWriteLock reentrantReadWriteLock, InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(reentrantReadWriteLock, "<this>");
        C5499.m17103(interfaceC5122, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            lock.unlock();
            C5437.m16929(1);
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> T m2528(Lock lock, InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(lock, "<this>");
        C5499.m17103(interfaceC5122, "action");
        lock.lock();
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            lock.unlock();
            C5437.m16929(1);
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> T m18147(ReentrantReadWriteLock reentrantReadWriteLock, InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(reentrantReadWriteLock, "<this>");
        C5499.m17103(interfaceC5122, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            C5437.m16929(1);
        }
    }
}
