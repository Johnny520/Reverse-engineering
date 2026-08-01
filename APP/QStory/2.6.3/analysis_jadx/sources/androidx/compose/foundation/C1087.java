package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C0478;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.sync.C5380;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReference f3215 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5380 f3214 = new C5380();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m2001(C1087 c1087, InterfaceC6558 interfaceC6558, SuspendLambda suspendLambda) {
        MutatePriority mutatePriority = MutatePriority.Default;
        c1087.getClass();
        return AbstractC5399.m10507(new MutatorMutex$mutate$2(mutatePriority, c1087, interfaceC6558, null), suspendLambda);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2002(C1087 c1087, C1091 c1091) {
        AtomicReference atomicReference = c1087.f3215;
        while (true) {
            C1091 c10912 = (C1091) atomicReference.get();
            if (c10912 != null && c1091.f3220.compareTo(c10912.f3220) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(c10912, c1091)) {
                if (atomicReference.get() != c10912) {
                    break;
                }
            }
            if (c10912 != null) {
                c10912.f3219.mo10256(new MutationInterruptedException());
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m2003(C0478 c0478, MutatePriority mutatePriority, InterfaceC6554 interfaceC6554, InterfaceC4357 interfaceC4357) {
        return AbstractC5399.m10507(new MutatorMutex$mutateWith$2(mutatePriority, this, interfaceC6554, c0478, null), interfaceC4357);
    }
}
