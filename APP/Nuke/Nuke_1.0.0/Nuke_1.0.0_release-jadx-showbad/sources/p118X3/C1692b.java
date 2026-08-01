package p118X3;

import java.io.IOException;
import java.util.LinkedHashMap;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1983k;

/* JADX INFO: renamed from: X3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1692b implements InterfaceC1690L {

    /* JADX INFO: renamed from: b */
    public static final C1692b f5785b = new C1692b();

    /* JADX INFO: renamed from: c */
    public static final C1692b f5786c = new C1692b();

    /* JADX INFO: renamed from: d */
    public static final C1692b f5787d = new C1692b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C1698h m3008a(C1692b c1692b, String str) {
        C1698h c1698h = new C1698h(str);
        C1698h.f5807d.put(str, c1698h);
        return c1698h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static EnumC1689K m3009c(String str) {
        AbstractC1665j.m2985e(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return EnumC1689K.f5769h;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return EnumC1689K.f5768g;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return EnumC1689K.f5767f;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return EnumC1689K.f5770i;
            }
        } else if (str.equals("SSLv3")) {
            return EnumC1689K.f5771j;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static EnumC1716z m3010d(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return EnumC1716z.f5944f;
        }
        if (str.equals("http/1.1")) {
            return EnumC1716z.f5945g;
        }
        if (str.equals("h2_prior_knowledge")) {
            return EnumC1716z.f5948j;
        }
        if (str.equals("h2")) {
            return EnumC1716z.f5947i;
        }
        if (str.equals("spdy/3.1")) {
            return EnumC1716z.f5946h;
        }
        if (str.equals("quic")) {
            return EnumC1716z.f5949k;
        }
        if (AbstractC1983k.m3656S(str, "h3", false)) {
            return EnumC1716z.f5950l;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public synchronized C1698h m3011b(String str) {
        C1698h c1698h;
        String strConcat;
        try {
            AbstractC1665j.m2985e(str, "javaName");
            LinkedHashMap linkedHashMap = C1698h.f5807d;
            c1698h = (C1698h) linkedHashMap.get(str);
            if (c1698h == null) {
                if (AbstractC1983k.m3656S(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    AbstractC1665j.m2984d(strSubstring, "substring(...)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (AbstractC1983k.m3656S(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    AbstractC1665j.m2984d(strSubstring2, "substring(...)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                c1698h = (C1698h) linkedHashMap.get(strConcat);
                if (c1698h == null) {
                    c1698h = new C1698h(str);
                }
                linkedHashMap.put(str, c1698h);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1698h;
    }
}
