package io.ktor.network.selector;

import java.nio.channels.SelectableChannel;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Result;
import kotlinx.coroutines.InterfaceC6279;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4841 implements InterfaceC4840 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12614 = AtomicIntegerFieldUpdater.newUpdater(C4841.class, "_interestedOps");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractSelectableChannel f12617;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AtomicBoolean f12615 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4832 f12616 = new C4832();
    private volatile /* synthetic */ int _interestedOps = 0;

    public C4841(AbstractSelectableChannel abstractSelectableChannel) {
        this.f12617 = abstractSelectableChannel;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f12615.compareAndSet(false, true)) {
            this._interestedOps = 0;
            C4832 c4832 = this.f12616;
            SelectInterest.Companion.getClass();
            for (SelectInterest selectInterest : SelectInterest.AllInterests) {
                c4832.getClass();
                selectInterest.getClass();
                InterfaceC6279 interfaceC6279 = (InterfaceC6279) C4832.f12596[selectInterest.ordinal()].getAndSet(c4832, null);
                if (interfaceC6279 != null) {
                    interfaceC6279.resumeWith(Result.m9304constructorimpl(new Result.Failure(new ClosedChannelCancellationException())));
                }
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6230
    public void dispose() {
        close();
    }

    @Override // io.ktor.network.selector.InterfaceC4840
    public final boolean isClosed() {
        return this.f12615.get();
    }

    @Override // io.ktor.network.selector.InterfaceC4840
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo8973(SelectInterest selectInterest, boolean z) {
        int i;
        selectInterest.getClass();
        int flag = selectInterest.getFlag();
        do {
            i = this._interestedOps;
        } while (!f12614.compareAndSet(this, i, z ? i | flag : (~flag) & i));
    }

    @Override // io.ktor.network.selector.InterfaceC4840
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public SelectableChannel mo8974() {
        return this.f12617;
    }

    @Override // io.ktor.network.selector.InterfaceC4840
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final int mo8975() {
        return this._interestedOps;
    }

    @Override // io.ktor.network.selector.InterfaceC4840
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final C4832 mo8976() {
        return this.f12616;
    }
}
