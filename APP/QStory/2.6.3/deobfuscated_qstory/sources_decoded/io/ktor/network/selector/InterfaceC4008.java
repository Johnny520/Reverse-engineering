package io.ktor.network.selector;

import java.io.Closeable;
import java.nio.channels.SelectableChannel;
import kotlinx.coroutines.InterfaceC5398;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4008 extends Closeable, InterfaceC5398 {
    boolean isClosed();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    void mo8414(SelectInterest selectInterest, boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    SelectableChannel mo8415();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    int mo8416();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    C4000 mo8417();
}
