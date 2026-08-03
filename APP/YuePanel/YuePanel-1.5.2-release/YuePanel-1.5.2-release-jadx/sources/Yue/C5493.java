package Yue;

import Yue.C5256;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "Internal")
public final class C5493 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final C5256.C0687 m2250(@InterfaceC6399 C5256.C0687 c0687, @InterfaceC6399 String str) {
        C5499.m17103(c0687, "builder");
        C5499.m17103(str, "line");
        return c0687.m16123(str);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final C5256.C0687 m2251(@InterfaceC6399 C5256.C0687 c0687, @InterfaceC6399 String str, @InterfaceC6399 String str2) {
        C5499.m17103(c0687, "builder");
        C5499.m17103(str, "name");
        C5499.m17103(str2, "value");
        return c0687.m16124(str, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m17084(@InterfaceC6399 C4110 c4110, @InterfaceC6399 SSLSocket sSLSocket, boolean z) {
        C5499.m17103(c4110, "connectionSpec");
        C5499.m17103(sSLSocket, "sslSocket");
        c4110.m11702(sSLSocket, z);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final C7141 m17085(@InterfaceC6399 C3633 c3633, @InterfaceC6399 C7101 c7101) {
        C5499.m17103(c3633, "cache");
        C5499.m17103(c7101, "request");
        return c3633.m9896(c7101);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String m17086(@InterfaceC6399 C4216 c4216, boolean z) {
        C5499.m17103(c4216, "cookie");
        return c4216.m12134(z);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final C4216 m17087(long j, @InterfaceC6399 C5385 c5385, @InterfaceC6399 String str) {
        C5499.m17103(c5385, "url");
        C5499.m17103(str, "setCookie");
        return C4216.f8555.m12147(j, c5385, str);
    }
}
