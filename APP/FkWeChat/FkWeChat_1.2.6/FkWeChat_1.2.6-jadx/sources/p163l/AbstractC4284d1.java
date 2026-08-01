package p163l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.d1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4284d1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m16830a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
