package ae;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ae.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0325x {
    /* JADX INFO: renamed from: a */
    public static final int m998a(AtomicInteger atomicInteger, int i10) {
        int i11;
        int i12;
        atomicInteger.getClass();
        do {
            i11 = atomicInteger.get();
            if ((i11 & i10) != 0) {
                return 0;
            }
            i12 = i11 | i10;
        } while (!atomicInteger.compareAndSet(i11, i12));
        return i12;
    }
}
