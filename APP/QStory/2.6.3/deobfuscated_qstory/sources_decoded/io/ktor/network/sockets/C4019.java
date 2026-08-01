package io.ktor.network.sockets;

import java.net.SocketAddress;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4019 extends AbstractC4023 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SocketAddress f12276;

    static {
        try {
            Class.forName("java.net.UnixDomainSocketAddress");
        } catch (ClassNotFoundException unused) {
        }
    }

    public C4019(SocketAddress socketAddress) {
        this.f12276 = socketAddress;
        if (socketAddress.getClass().getName().equals("java.net.UnixDomainSocketAddress")) {
            return;
        }
        C5925.m11311("address should be java.net.UnixDomainSocketAddress");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4019.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f12276.equals(((C4019) obj).f12276);
    }

    public final int hashCode() {
        return this.f12276.hashCode();
    }

    public final String toString() {
        return this.f12276.toString();
    }

    @Override // io.ktor.network.sockets.AbstractC4023
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SocketAddress mo8426() {
        return this.f12276;
    }
}
