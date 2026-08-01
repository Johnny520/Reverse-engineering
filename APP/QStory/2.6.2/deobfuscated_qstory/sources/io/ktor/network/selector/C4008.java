package io.ktor.network.selector;

import java.nio.channels.SelectableChannel;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Result;
import kotlinx.coroutines.InterfaceC5446;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4008 implements InterfaceC4007 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12265 = AtomicIntegerFieldUpdater.newUpdater(C4008.class, "_interestedOps");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractSelectableChannel f12268;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AtomicBoolean f12266 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3999 f12267 = new C3999();
    private volatile /* synthetic */ int _interestedOps = 0;

    public C4008(AbstractSelectableChannel abstractSelectableChannel) {
        this.f12268 = abstractSelectableChannel;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f12266.compareAndSet(false, true)) {
            this._interestedOps = 0;
            C3999 c3999 = this.f12267;
            SelectInterest.Companion.getClass();
            for (SelectInterest selectInterest : SelectInterest.AllInterests) {
                c3999.getClass();
                selectInterest.getClass();
                InterfaceC5446 interfaceC5446 = (InterfaceC5446) C3999.f12247[selectInterest.ordinal()].getAndSet(c3999, null);
                if (interfaceC5446 != null) {
                    interfaceC5446.resumeWith(Result.m8755constructorimpl(new Result.Failure(new ClosedChannelCancellationException())));
                }
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5397
    public void dispose() {
        close();
    }

    @Override // io.ktor.network.selector.InterfaceC4007
    public final boolean isClosed() {
        return this.f12266.get();
    }

    @Override // io.ktor.network.selector.InterfaceC4007
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final int mo8424() {
        return this._interestedOps;
    }

    @Override // io.ktor.network.selector.InterfaceC4007
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo8425(SelectInterest selectInterest, boolean z) {
        int i;
        selectInterest.getClass();
        int flag = selectInterest.getFlag();
        do {
            i = this._interestedOps;
        } while (!f12265.compareAndSet(this, i, z ? i | flag : (~flag) & i));
    }

    @Override // io.ktor.network.selector.InterfaceC4007
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public SelectableChannel mo8426() {
        return this.f12268;
    }

    @Override // io.ktor.network.selector.InterfaceC4007
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C3999 mo8427() {
        return this.f12267;
    }
}
