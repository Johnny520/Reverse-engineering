package io.ktor.network.sockets;

import java.net.SocketAddress;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4018 extends AbstractC4022 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SocketAddress f12272;

    static {
        try {
            Class.forName("java.net.UnixDomainSocketAddress");
        } catch (ClassNotFoundException unused) {
        }
    }

    public C4018(SocketAddress socketAddress) {
        this.f12272 = socketAddress;
        if (socketAddress.getClass().getName().equals("java.net.UnixDomainSocketAddress")) {
            return;
        }
        C5919.m11250("address should be java.net.UnixDomainSocketAddress");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4018.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f12272.equals(((C4018) obj).f12272);
    }

    public final int hashCode() {
        return this.f12272.hashCode();
    }

    public final String toString() {
        return this.f12272.toString();
    }

    @Override // io.ktor.network.sockets.AbstractC4022
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SocketAddress mo8436() {
        return this.f12272;
    }
}
