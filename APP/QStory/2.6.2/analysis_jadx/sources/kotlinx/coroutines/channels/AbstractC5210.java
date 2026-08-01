package kotlinx.coroutines.channels;

import androidx.compose.animation.core.C0325;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5428;
import kotlinx.coroutines.JobCancellationException;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5210 extends AbstractC5428 implements InterfaceC5206 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C5189 f14798;

    public AbstractC5210(InterfaceC4359 interfaceC4359, C5189 c5189, boolean z, boolean z2) {
        super(interfaceC4359, z, z2);
        this.f14798 = c5189;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    public final InterfaceC5211 iterator() {
        C5189 c5189 = this.f14798;
        c5189.getClass();
        return new C5190(c5189);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo8442(InterfaceC6557 interfaceC6557) {
        this.f14798.mo8442(interfaceC6557);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public Object mo8443(Object obj, InterfaceC4356 interfaceC4356) {
        return this.f14798.mo8443(obj, interfaceC4356);
    }

    @Override // kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void mo10281(CancellationException cancellationException) {
        this.f14798.m10238(cancellationException, true);
        m10569(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo10240(ContinuationImpl continuationImpl) {
        C5189 c5189 = this.f14798;
        c5189.getClass();
        return C5189.m10218(c5189, continuationImpl);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo10242(ContinuationImpl continuationImpl) {
        C5189 c5189 = this.f14798;
        c5189.getClass();
        Object objM10216 = C5189.m10216(c5189, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10216;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public Object mo8445(Object obj) {
        return this.f14798.mo8445(obj);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final C0325 mo10247() {
        return this.f14798.mo10247();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public boolean mo8446(Throwable th) {
        return this.f14798.m10238(th, false);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Object mo10251() {
        return this.f14798.mo10251();
    }

    @Override // kotlinx.coroutines.C5459, kotlinx.coroutines.InterfaceC5451, kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo10252(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo10519(), null, this);
        }
        mo10281(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C0325 mo10256() {
        return this.f14798.mo10256();
    }
}
