package p063e7;

import java.net.SocketAddress;
import p009a8.AbstractC0172a;
import p281t6.C8159m0;
import p281t6.C8171x;
import p281t6.InterfaceC8155k0;

/* JADX INFO: renamed from: e7.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2044k implements InterfaceC8155k0 {

    /* JADX INFO: renamed from: a */
    public final SocketAddress f5747a;

    /* JADX INFO: renamed from: b */
    public final SocketAddress f5748b;

    /* JADX INFO: renamed from: c */
    public final String f5749c;

    /* JADX INFO: renamed from: d */
    public final String f5750d;

    /* JADX INFO: renamed from: e */
    public final String f5751e;

    /* JADX INFO: renamed from: f */
    public final C8171x f5752f;

    /* JADX INFO: renamed from: g */
    public final int f5753g;

    public C2044k(SocketAddress socketAddress, SocketAddress socketAddress2, String str, String str2, String str3, C8171x c8171x) {
        str.getClass();
        str2.getClass();
        c8171x.getClass();
        this.f5747a = socketAddress;
        this.f5748b = socketAddress2;
        this.f5749c = str;
        this.f5750d = str2;
        this.f5751e = str3;
        this.f5752f = c8171x;
        this.f5753g = C8159m0.f27282s.m31643a(m7378g()).m31642b();
    }

    @Override // p281t6.InterfaceC8155k0
    /* JADX INFO: renamed from: a */
    public String mo7372a() {
        return this.f5749c;
    }

    @Override // p281t6.InterfaceC8155k0
    /* JADX INFO: renamed from: b */
    public String mo7373b() {
        return this.f5750d;
    }

    /* JADX INFO: renamed from: c */
    public String m7374c() {
        String strM411a;
        SocketAddress socketAddress = this.f5748b;
        return (socketAddress == null || (strM411a = AbstractC0172a.m411a(socketAddress)) == null) ? "localhost" : strM411a;
    }

    /* JADX INFO: renamed from: d */
    public int m7375d() {
        SocketAddress socketAddress = this.f5748b;
        return socketAddress != null ? AbstractC0172a.m412b(socketAddress) : this.f5753g;
    }

    /* JADX INFO: renamed from: e */
    public String m7376e() {
        String strM411a;
        SocketAddress socketAddress = this.f5747a;
        return (socketAddress == null || (strM411a = AbstractC0172a.m411a(socketAddress)) == null) ? "unknown" : strM411a;
    }

    /* JADX INFO: renamed from: f */
    public int m7377f() {
        SocketAddress socketAddress = this.f5747a;
        if (socketAddress != null) {
            return AbstractC0172a.m412b(socketAddress);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public String m7378g() {
        return "http";
    }

    @Override // p281t6.InterfaceC8155k0
    public C8171x getMethod() {
        return this.f5752f;
    }

    public String toString() {
        return "CIOConnectionPoint(uri=" + mo7373b() + ", method=" + getMethod() + ", version=" + mo7372a() + ", localAddress=" + m7374c() + ", localPort=" + m7375d() + ", remoteAddress=" + m7376e() + ", remotePort=" + m7377f() + ')';
    }
}
