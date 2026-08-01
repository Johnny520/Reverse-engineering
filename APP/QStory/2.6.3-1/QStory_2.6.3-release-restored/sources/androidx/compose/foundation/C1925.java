package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C1319;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.sync.C6212;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1925 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReference f3560 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6212 f3559 = new C6212();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m2561(C1925 c1925, InterfaceC7387 interfaceC7387, SuspendLambda suspendLambda) {
        MutatePriority mutatePriority = MutatePriority.Default;
        c1925.getClass();
        return AbstractC6231.m11066(new MutatorMutex$mutate$2(mutatePriority, c1925, interfaceC7387, null), suspendLambda);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2562(C1925 c1925, C1929 c1929) {
        AtomicReference atomicReference = c1925.f3560;
        while (true) {
            C1929 c19292 = (C1929) atomicReference.get();
            if (c19292 != null && c1929.f3565.compareTo(c19292.f3565) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(c19292, c1929)) {
                if (atomicReference.get() != c19292) {
                    break;
                }
            }
            if (c19292 != null) {
                c19292.f3564.mo10815(new MutationInterruptedException());
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m2563(C1319 c1319, MutatePriority mutatePriority, InterfaceC7383 interfaceC7383, InterfaceC5189 interfaceC5189) {
        return AbstractC6231.m11066(new MutatorMutex$mutateWith$2(mutatePriority, this, interfaceC7383, c1319, null), interfaceC5189);
    }
}
