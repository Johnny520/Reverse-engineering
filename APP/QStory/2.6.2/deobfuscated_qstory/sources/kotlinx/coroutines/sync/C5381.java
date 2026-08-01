package kotlinx.coroutines.sync;

import androidx.compose.foundation.C1067;
import androidx.compose.foundation.C1093;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4359;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InterfaceC5411;
import kotlinx.coroutines.InterfaceC5446;
import kotlinx.coroutines.internal.AbstractC5360;
import p052.InterfaceC6550;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5381 implements InterfaceC5446, InterfaceC5411 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C5379 f14996;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5443 f14997;

    public C5381(C5379 c5379, C5443 c5443) {
        this.f14996 = c5379;
        this.f14997 = c5443;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final InterfaceC4359 getContext() {
        return this.f14997.f15095;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final void resumeWith(Object obj) {
        this.f14997.resumeWith(obj);
    }

    @Override // kotlinx.coroutines.InterfaceC5446
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo10429(Object obj) throws DispatchException {
        this.f14997.mo10429(obj);
    }

    @Override // kotlinx.coroutines.InterfaceC5446
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo10430(Object obj, InterfaceC6550 interfaceC6550) throws DispatchException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5379.f14991;
        C5379 c5379 = this.f14996;
        atomicReferenceFieldUpdater.set(c5379, null);
        C1067 c1067 = new C1067(c5379, 24, this);
        C5443 c5443 = this.f14997;
        c5443.m10534(C5175.f14739, c5443.f15031, new C1093(c1067, 1));
    }

    @Override // kotlinx.coroutines.InterfaceC5411
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10259(AbstractC5360 abstractC5360, int i) {
        this.f14997.mo10259(abstractC5360, i);
    }

    @Override // kotlinx.coroutines.InterfaceC5446
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo10431(Throwable th) {
        return this.f14997.mo10431(th);
    }

    @Override // kotlinx.coroutines.InterfaceC5446
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4484 mo10432(Object obj, InterfaceC6550 interfaceC6550) {
        C5379 c5379 = this.f14996;
        C1093 c1093 = new C1093(c5379, 2, this);
        C4484 c4484M10532 = this.f14997.m10532((C5175) obj, c1093);
        if (c4484M10532 != null) {
            C5379.f14991.set(c5379, null);
        }
        return c4484M10532;
    }
}
