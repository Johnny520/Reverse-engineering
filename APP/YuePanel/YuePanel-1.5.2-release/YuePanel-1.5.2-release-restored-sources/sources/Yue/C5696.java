package Yue;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Yue.ۥ۠ۧ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5696 {
    /* JADX INFO: renamed from: ۥ */
    public static /* synthetic */ boolean m2374(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
