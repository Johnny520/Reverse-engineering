package io.ktor.network.sockets;

import java.net.SocketAddress;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p376zd.C10010p0;

/* JADX INFO: renamed from: io.ktor.network.sockets.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3426d0 extends AbstractC3442t {

    /* JADX INFO: renamed from: b */
    public static final a f9432b = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: c */
    public static final Class f9433c;

    /* JADX INFO: renamed from: a */
    public final SocketAddress f9434a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<?> cls = null;
        try {
            cls = Class.forName("java.net.UnixDomainSocketAddress");
        } catch (ClassNotFoundException unused) {
        }
        f9433c = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3426d0(SocketAddress socketAddress) {
        super(null);
        socketAddress.getClass();
        this.f9434a = socketAddress;
        if (AbstractC1061t.m3842c(mo12804a().getClass().getName(), "java.net.UnixDomainSocketAddress")) {
            return;
        }
        C10010p0.m38820a("address should be java.net.UnixDomainSocketAddress");
        throw null;
    }

    @Override // io.ktor.network.sockets.AbstractC3442t
    /* JADX INFO: renamed from: a */
    public SocketAddress mo12804a() {
        return this.f9434a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC1061t.m3842c(C3426d0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return AbstractC1061t.m3842c(mo12804a(), ((C3426d0) obj).mo12804a());
    }

    public int hashCode() {
        return mo12804a().hashCode();
    }

    public String toString() {
        return mo12804a().toString();
    }

    /* JADX INFO: renamed from: io.ktor.network.sockets.d0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
