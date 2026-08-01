package kotlinx.coroutines.channels;

import androidx.compose.animation.core.C0325;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5429;
import kotlinx.coroutines.JobCancellationException;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5211 extends AbstractC5429 implements InterfaceC5207 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C5190 f14798;

    public AbstractC5211(InterfaceC4360 interfaceC4360, C5190 c5190, boolean z, boolean z2) {
        super(interfaceC4360, z, z2);
        this.f14798 = c5190;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    public final InterfaceC5212 iterator() {
        C5190 c5190 = this.f14798;
        c5190.getClass();
        return new C5191(c5190);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo8432(InterfaceC6558 interfaceC6558) {
        this.f14798.mo8432(interfaceC6558);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public Object mo8433(Object obj, InterfaceC4357 interfaceC4357) {
        return this.f14798.mo8433(obj, interfaceC4357);
    }

    @Override // kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void mo10285(CancellationException cancellationException) {
        this.f14798.m10242(cancellationException, true);
        m10572(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo10244(ContinuationImpl continuationImpl) {
        C5190 c5190 = this.f14798;
        c5190.getClass();
        return C5190.m10222(c5190, continuationImpl);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo8435(Throwable th) {
        return this.f14798.m10242(th, false);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final Object mo10247(ContinuationImpl continuationImpl) {
        C5190 c5190 = this.f14798;
        c5190.getClass();
        Object objM10220 = C5190.m10220(c5190, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10220;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public Object mo8436(Object obj) {
        return this.f14798.mo8436(obj);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final C0325 mo10250() {
        return this.f14798.mo10250();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Object mo10255() {
        return this.f14798.mo10255();
    }

    @Override // kotlinx.coroutines.C5460, kotlinx.coroutines.InterfaceC5452, kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo10256(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo10523(), null, this);
        }
        mo10285(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C0325 mo10260() {
        return this.f14798.mo10260();
    }
}
