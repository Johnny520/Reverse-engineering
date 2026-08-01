package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C0478;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.sync.C5379;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReference f3214 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5379 f3213 = new C5379();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m1991(C1087 c1087, InterfaceC6557 interfaceC6557, SuspendLambda suspendLambda) {
        MutatePriority mutatePriority = MutatePriority.Default;
        c1087.getClass();
        return AbstractC5398.m10503(new MutatorMutex$mutate$2(mutatePriority, c1087, interfaceC6557, null), suspendLambda);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1992(C1087 c1087, C1091 c1091) {
        AtomicReference atomicReference = c1087.f3214;
        while (true) {
            C1091 c10912 = (C1091) atomicReference.get();
            if (c10912 != null && c1091.f3219.compareTo(c10912.f3219) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(c10912, c1091)) {
                if (atomicReference.get() != c10912) {
                    break;
                }
            }
            if (c10912 != null) {
                c10912.f3218.mo10252(new MutationInterruptedException());
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m1993(C0478 c0478, MutatePriority mutatePriority, InterfaceC6553 interfaceC6553, InterfaceC4356 interfaceC4356) {
        return AbstractC5398.m10503(new MutatorMutex$mutateWith$2(mutatePriority, this, interfaceC6553, c0478, null), interfaceC4356);
    }
}
