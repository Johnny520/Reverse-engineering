package io.ktor.network.sockets;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4861 extends AbstractC4855 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InetSocketAddress f12641;

    public C4861(InetSocketAddress inetSocketAddress) {
        this.f12641 = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4861.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return AbstractC5227.m9466(this.f12641, ((C4861) obj).f12641);
    }

    public final int hashCode() {
        return this.f12641.hashCode();
    }

    public final String toString() {
        String string = this.f12641.toString();
        string.getClass();
        return string;
    }

    @Override // io.ktor.network.sockets.AbstractC4855
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final SocketAddress mo8985() {
        return this.f12641;
    }
}
