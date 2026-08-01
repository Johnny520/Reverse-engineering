package kotlinx.coroutines.channels;

import androidx.compose.animation.core.C1171;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6261;
import kotlinx.coroutines.JobCancellationException;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6043 extends AbstractC6261 implements InterfaceC6039 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C6022 f15143;

    public AbstractC6043(InterfaceC5192 interfaceC5192, C6022 c6022, boolean z, boolean z2) {
        super(interfaceC5192, z, z2);
        this.f15143 = c6022;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    public final InterfaceC6044 iterator() {
        C6022 c6022 = this.f15143;
        c6022.getClass();
        return new C6023(c6022);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo8991(InterfaceC7387 interfaceC7387) {
        this.f15143.mo8991(interfaceC7387);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public Object mo8992(Object obj, InterfaceC5189 interfaceC5189) {
        return this.f15143.mo8992(obj, interfaceC5189);
    }

    @Override // kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void mo10844(CancellationException cancellationException) {
        this.f15143.m10801(cancellationException, true);
        m11131(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo10803(ContinuationImpl continuationImpl) {
        C6022 c6022 = this.f15143;
        c6022.getClass();
        return C6022.m10781(c6022, continuationImpl);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo8994(Throwable th) {
        return this.f15143.m10801(th, false);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final Object mo10806(ContinuationImpl continuationImpl) {
        C6022 c6022 = this.f15143;
        c6022.getClass();
        Object objM10779 = C6022.m10779(c6022, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10779;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public Object mo8995(Object obj) {
        return this.f15143.mo8995(obj);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final C1171 mo10809() {
        return this.f15143.mo10809();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Object mo10814() {
        return this.f15143.mo10814();
    }

    @Override // kotlinx.coroutines.C6292, kotlinx.coroutines.InterfaceC6284, kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo10815(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo11082(), null, this);
        }
        mo10844(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C1171 mo10819() {
        return this.f15143.mo10819();
    }
}
