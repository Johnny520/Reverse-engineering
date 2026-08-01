package kotlinx.coroutines.sync;

import androidx.compose.foundation.C1067;
import androidx.compose.foundation.C1093;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4360;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InterfaceC5412;
import kotlinx.coroutines.InterfaceC5447;
import kotlinx.coroutines.internal.AbstractC5361;
import p052.InterfaceC6551;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5382 implements InterfaceC5447, InterfaceC5412 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C5380 f14996;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5444 f14997;

    public C5382(C5380 c5380, C5444 c5444) {
        this.f14996 = c5380;
        this.f14997 = c5444;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final InterfaceC4360 getContext() {
        return this.f14997.f15095;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final void resumeWith(Object obj) {
        this.f14997.resumeWith(obj);
    }

    @Override // kotlinx.coroutines.InterfaceC5447
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo10433(Object obj) throws DispatchException {
        this.f14997.mo10433(obj);
    }

    @Override // kotlinx.coroutines.InterfaceC5447
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo10434(Object obj, InterfaceC6551 interfaceC6551) throws DispatchException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5380.f14991;
        C5380 c5380 = this.f14996;
        atomicReferenceFieldUpdater.set(c5380, null);
        C1067 c1067 = new C1067(c5380, 24, this);
        C5444 c5444 = this.f14997;
        c5444.m10538(C5176.f14739, c5444.f15031, new C1093(c1067, 1));
    }

    @Override // kotlinx.coroutines.InterfaceC5412
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10263(AbstractC5361 abstractC5361, int i) {
        this.f14997.mo10263(abstractC5361, i);
    }

    @Override // kotlinx.coroutines.InterfaceC5447
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo10435(Throwable th) {
        return this.f14997.mo10435(th);
    }

    @Override // kotlinx.coroutines.InterfaceC5447
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4485 mo10436(Object obj, InterfaceC6551 interfaceC6551) {
        C5380 c5380 = this.f14996;
        C1093 c1093 = new C1093(c5380, 2, this);
        C4485 c4485M10536 = this.f14997.m10536((C5176) obj, c1093);
        if (c4485M10536 != null) {
            C5380.f14991.set(c5380, null);
        }
        return c4485M10536;
    }
}
