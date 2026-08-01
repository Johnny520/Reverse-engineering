package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.InterfaceC4357;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.sync.C5380;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0304 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReference f1037 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5380 f1036 = new C5380();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m932(C0304 c0304, InterfaceC6558 interfaceC6558, InterfaceC4357 interfaceC4357) {
        MutatePriority mutatePriority = MutatePriority.Default;
        c0304.getClass();
        return AbstractC5399.m10507(new MutatorMutex$mutate$2(mutatePriority, c0304, interfaceC6558, null), interfaceC4357);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m933(C0304 c0304, C0305 c0305) {
        AtomicReference atomicReference = c0304.f1037;
        while (true) {
            C0305 c03052 = (C0305) atomicReference.get();
            if (c03052 != null && c0305.f1039.compareTo(c03052.f1039) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(c03052, c0305)) {
                if (atomicReference.get() != c03052) {
                    break;
                }
            }
            if (c03052 != null) {
                c03052.f1038.mo10256(new MutationInterruptedException());
                return;
            }
            return;
        }
    }
}
