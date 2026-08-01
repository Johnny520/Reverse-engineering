package io.ktor.network.sockets;

import java.net.InetSocketAddress;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: io.ktor.network.sockets.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3435m extends AbstractC3442t {

    /* JADX INFO: renamed from: a */
    public final InetSocketAddress f9479a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3435m(String str, int i10) {
        this(new InetSocketAddress(str, i10));
        str.getClass();
    }

    @Override // io.ktor.network.sockets.AbstractC3442t
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InetSocketAddress mo12804a() {
        return this.f9479a;
    }

    /* JADX INFO: renamed from: c */
    public final int m12823c() {
        return mo12804a().getPort();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC1061t.m3842c(C3435m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return AbstractC1061t.m3842c(mo12804a(), ((C3435m) obj).mo12804a());
    }

    public int hashCode() {
        return mo12804a().hashCode();
    }

    public String toString() {
        String string = mo12804a().toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3435m(InetSocketAddress inetSocketAddress) {
        super(null);
        inetSocketAddress.getClass();
        this.f9479a = inetSocketAddress;
    }
}
