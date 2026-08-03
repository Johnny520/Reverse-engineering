package Yue;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: Yue.ۥۢۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8407 extends AbstractC4255 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C8407 f3475 = new C8407();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final ReentrantReadWriteLock f3476 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final WeakHashMap<Class<? extends Throwable>, InterfaceC5124<Throwable, Throwable>> f25107 = new WeakHashMap<>();

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, ARITH, INVOKE] complete} */
    @Override // Yue.AbstractC4255
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5124<Throwable, Throwable> mo885(@InterfaceC6399 Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = f3476;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            InterfaceC5124<Throwable, Throwable> interfaceC5124 = f25107.get(cls);
            if (interfaceC5124 != null) {
                return interfaceC5124;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, InterfaceC5124<Throwable, Throwable>> weakHashMap = f25107;
                InterfaceC5124<Throwable, Throwable> interfaceC51242 = weakHashMap.get(cls);
                if (interfaceC51242 != null) {
                    return interfaceC51242;
                }
                InterfaceC5124<Throwable, Throwable> interfaceC5124M1651 = C4732.m1651(cls);
                weakHashMap.put(cls, interfaceC5124M1651);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                return interfaceC5124M1651;
            } finally {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}
