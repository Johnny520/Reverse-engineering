package io.ktor.network.selector;

import java.nio.channels.SelectableChannel;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Result;
import kotlinx.coroutines.InterfaceC5447;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4009 implements InterfaceC4008 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12269 = AtomicIntegerFieldUpdater.newUpdater(C4009.class, "_interestedOps");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractSelectableChannel f12272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AtomicBoolean f12270 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4000 f12271 = new C4000();
    private volatile /* synthetic */ int _interestedOps = 0;

    public C4009(AbstractSelectableChannel abstractSelectableChannel) {
        this.f12272 = abstractSelectableChannel;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f12270.compareAndSet(false, true)) {
            this._interestedOps = 0;
            C4000 c4000 = this.f12271;
            SelectInterest.Companion.getClass();
            for (SelectInterest selectInterest : SelectInterest.AllInterests) {
                c4000.getClass();
                selectInterest.getClass();
                InterfaceC5447 interfaceC5447 = (InterfaceC5447) C4000.f12251[selectInterest.ordinal()].getAndSet(c4000, null);
                if (interfaceC5447 != null) {
                    interfaceC5447.resumeWith(Result.m8745constructorimpl(new Result.Failure(new ClosedChannelCancellationException())));
                }
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5398
    public void dispose() {
        close();
    }

    @Override // io.ktor.network.selector.InterfaceC4008
    public final boolean isClosed() {
        return this.f12270.get();
    }

    @Override // io.ktor.network.selector.InterfaceC4008
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo8414(SelectInterest selectInterest, boolean z) {
        int i;
        selectInterest.getClass();
        int flag = selectInterest.getFlag();
        do {
            i = this._interestedOps;
        } while (!f12269.compareAndSet(this, i, z ? i | flag : (~flag) & i));
    }

    @Override // io.ktor.network.selector.InterfaceC4008
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public SelectableChannel mo8415() {
        return this.f12272;
    }

    @Override // io.ktor.network.selector.InterfaceC4008
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final int mo8416() {
        return this._interestedOps;
    }

    @Override // io.ktor.network.selector.InterfaceC4008
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final C4000 mo8417() {
        return this.f12271;
    }
}
