package io.ktor.network.sockets;

import java.net.SocketAddress;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4851 extends AbstractC4855 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SocketAddress f12621;

    static {
        try {
            Class.forName("java.net.UnixDomainSocketAddress");
        } catch (ClassNotFoundException unused) {
        }
    }

    public C4851(SocketAddress socketAddress) {
        this.f12621 = socketAddress;
        if (socketAddress.getClass().getName().equals("java.net.UnixDomainSocketAddress")) {
            return;
        }
        C6755.m11870("address should be java.net.UnixDomainSocketAddress");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4851.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f12621.equals(((C4851) obj).f12621);
    }

    public final int hashCode() {
        return this.f12621.hashCode();
    }

    public final String toString() {
        return this.f12621.toString();
    }

    @Override // io.ktor.network.sockets.AbstractC4855
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SocketAddress mo8985() {
        return this.f12621;
    }
}
