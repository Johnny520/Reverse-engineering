package com.tendcloud.tenddata;

import java.net.InetAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.tendcloud.tenddata.aj */
/* JADX INFO: loaded from: classes.dex */
public final class C0028aj {

    /* JADX INFO: renamed from: a */
    private static final String f166a = "https://dns.qq.com";

    /* JADX INFO: renamed from: b */
    private static final String f167b = "biYRrllT";

    /* JADX INFO: renamed from: c */
    private static final String f168c = "3658";

    /* JADX INFO: renamed from: d */
    private static final String f169d = "DES";

    /* JADX INFO: renamed from: e */
    private static final String f170e = "DES/ECB/PKCS5Padding";

    /* JADX INFO: renamed from: f */
    private static final String f171f = "utf-8";

    /* JADX INFO: renamed from: g */
    private static final String f172g = "TD_ts_cache_profile";

    /* JADX INFO: renamed from: h */
    private static final long f173h = 86400000;

    /* JADX INFO: renamed from: i */
    private static Map<String, Integer> f174i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static String m115a(String str) {
        try {
            return m119e(m118d(new String(C0030al.m130a(C0030al.m129a().url(f166a + "/d?dn=" + m120f(str) + "&id=" + f168c).method(EnumC0035aq.GET).build()).m213c(), f171f)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m116b(String str) {
        try {
            if (f174i.get(str) == null) {
                f174i.put(str, 0);
            }
        } catch (Throwable unused) {
        }
        return f174i.get(str).intValue();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m117c(String str) {
        try {
            return System.currentTimeMillis() - C0125s.m727b(C0020ab.f132g, f172g, C0131y.m777e(str), 0L) <= f173h;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m118d(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(f167b.getBytes(f171f), f169d);
            Cipher cipher = Cipher.getInstance(f170e);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(C0131y.m775d(str)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m119e(String str) {
        try {
            if (C0131y.m767b(str)) {
                return null;
            }
            for (String str2 : str.split(";")) {
                if (!m121g(str2)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m120f(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(f167b.getBytes(f171f), f169d);
            Cipher cipher = Cipher.getInstance(f170e);
            cipher.init(1, secretKeySpec);
            return C0131y.m748a(cipher.doFinal(str.getBytes(f171f)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m121g(String str) {
        try {
            InetAddress byAddress = InetAddress.getByAddress(InetAddress.getByName(str).getAddress());
            if (byAddress.isSiteLocalAddress() || byAddress.isLoopbackAddress()) {
                return true;
            }
            return byAddress.isAnyLocalAddress();
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void updateFailureCountWithHost(String str) {
        f174i.put(str, Integer.valueOf(m116b(str) + 1));
    }

    public static void updateTimeStamp(String str) {
        try {
            C0125s.m725a(C0020ab.f132g, f172g, C0131y.m777e(str), System.currentTimeMillis());
        } catch (Throwable unused) {
        }
    }
}
