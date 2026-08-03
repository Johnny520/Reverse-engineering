package Yue;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4079 {
    /* JADX INFO: renamed from: ۥ */
    public static /* synthetic */ boolean m1036(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
