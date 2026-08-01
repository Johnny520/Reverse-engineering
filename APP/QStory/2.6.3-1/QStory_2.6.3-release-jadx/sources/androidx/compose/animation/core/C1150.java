package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.InterfaceC5189;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.sync.C6212;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReference f1382 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6212 f1381 = new C6212();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m1492(C1150 c1150, InterfaceC7387 interfaceC7387, InterfaceC5189 interfaceC5189) {
        MutatePriority mutatePriority = MutatePriority.Default;
        c1150.getClass();
        return AbstractC6231.m11066(new MutatorMutex$mutate$2(mutatePriority, c1150, interfaceC7387, null), interfaceC5189);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1493(C1150 c1150, C1151 c1151) {
        AtomicReference atomicReference = c1150.f1382;
        while (true) {
            C1151 c11512 = (C1151) atomicReference.get();
            if (c11512 != null && c1151.f1384.compareTo(c11512.f1384) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(c11512, c1151)) {
                if (atomicReference.get() != c11512) {
                    break;
                }
            }
            if (c11512 != null) {
                c11512.f1383.mo10815(new MutationInterruptedException());
                return;
            }
            return;
        }
    }
}
