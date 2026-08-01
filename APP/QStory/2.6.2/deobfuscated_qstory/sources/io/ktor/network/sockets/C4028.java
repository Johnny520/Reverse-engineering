package io.ktor.network.sockets;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4028 extends AbstractC4022 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InetSocketAddress f12292;

    public C4028(InetSocketAddress inetSocketAddress) {
        this.f12292 = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4028.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return AbstractC4394.m8917(this.f12292, ((C4028) obj).f12292);
    }

    public final int hashCode() {
        return this.f12292.hashCode();
    }

    public final String toString() {
        String string = this.f12292.toString();
        string.getClass();
        return string;
    }

    @Override // io.ktor.network.sockets.AbstractC4022
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final SocketAddress mo8436() {
        return this.f12292;
    }
}
