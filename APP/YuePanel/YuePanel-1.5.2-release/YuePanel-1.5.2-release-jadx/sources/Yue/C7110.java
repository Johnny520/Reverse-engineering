package Yue;

import java.net.Proxy;

/* JADX INFO: renamed from: Yue.ۥۡۦۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7110 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C7110 f2689 = new C7110();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final String m3401(@InterfaceC6399 C7101 c7101, @InterfaceC6399 Proxy.Type type) {
        C5499.m17103(c7101, "request");
        C5499.m17103(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(c7101.m22156());
        sb.append(' ');
        C7110 c7110 = f2689;
        if (c7110.m3402(c7101, type)) {
            sb.append(c7101.m22160());
        } else {
            sb.append(c7110.m22226(c7101.m22160()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m3402(C7101 c7101, Proxy.Type type) {
        return !c7101.m22155() && type == Proxy.Type.HTTP;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String m22226(@InterfaceC6399 C5385 c5385) {
        C5499.m17103(c5385, "url");
        String strM16767 = c5385.m16767();
        String strM16769 = c5385.m16769();
        if (strM16769 == null) {
            return strM16767;
        }
        return strM16767 + '?' + strM16769;
    }
}
