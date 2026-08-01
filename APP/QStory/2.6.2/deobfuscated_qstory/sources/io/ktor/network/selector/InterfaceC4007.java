package io.ktor.network.selector;

import java.io.Closeable;
import java.nio.channels.SelectableChannel;
import kotlinx.coroutines.InterfaceC5397;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4007 extends Closeable, InterfaceC5397 {
    boolean isClosed();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    int mo8424();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    void mo8425(SelectInterest selectInterest, boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    SelectableChannel mo8426();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    C3999 mo8427();
}
