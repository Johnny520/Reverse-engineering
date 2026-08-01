package io.ktor.network.sockets;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4029 extends AbstractC4023 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InetSocketAddress f12296;

    public C4029(InetSocketAddress inetSocketAddress) {
        this.f12296 = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4029.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return AbstractC4395.m8907(this.f12296, ((C4029) obj).f12296);
    }

    public final int hashCode() {
        return this.f12296.hashCode();
    }

    public final String toString() {
        String string = this.f12296.toString();
        string.getClass();
        return string;
    }

    @Override // io.ktor.network.sockets.AbstractC4023
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final SocketAddress mo8426() {
        return this.f12296;
    }
}
