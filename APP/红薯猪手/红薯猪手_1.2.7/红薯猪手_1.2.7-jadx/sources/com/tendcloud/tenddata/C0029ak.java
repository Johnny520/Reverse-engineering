package com.tendcloud.tenddata;

import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ak */
/* JADX INFO: loaded from: classes.dex */
public final class C0029ak {

    /* JADX INFO: renamed from: a */
    private static volatile HashMap<String, C0029ak> f175a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private static final String f176b = "TD_IP_CACHE";

    /* JADX INFO: renamed from: c */
    private String f177c = null;

    /* JADX INFO: renamed from: d */
    private String f178d = null;

    /* JADX INFO: renamed from: e */
    private String f179e = null;

    /* JADX INFO: renamed from: f */
    private String f180f = null;

    /* JADX INFO: renamed from: g */
    private String f181g = null;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.ak$a */
    public static class a {
        public static final int resolvedIp = 1;
        public static final int savedIp = 3;
        public static final int staticIp = 4;
        public static final int successIp = 2;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m122a(String str, int i) {
        if (!C0131y.m767b(str) && f175a.containsKey(str)) {
            if (f175a == null) {
                return null;
            }
            C0029ak c0029ak = f175a.get(str);
            if (c0029ak == null) {
                return null;
            }
            if (i == 1) {
                return c0029ak.f178d;
            }
            if (i == 2) {
                return c0029ak.f180f;
            }
            if (i == 3) {
                return c0029ak.f179e;
            }
            if (i != 4) {
                return null;
            }
            return c0029ak.f177c;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static URL m123a(URL url, String str) {
        return C0122o.m687b() ? url : new URL(url.getProtocol(), str, url.getPort(), url.getFile());
    }

    /* JADX INFO: renamed from: a */
    public static void m124a(String str) {
        String strM122a = m122a(str, 1);
        if (strM122a == null || strM122a.equalsIgnoreCase(m122a(str, 3)) || C0020ab.f132g == null) {
            return;
        }
        C0125s.m726a(C0020ab.f132g, f176b, C0131y.m777e(str), m122a(str, 1));
        m126a(str, m122a(str, 1), 3);
    }

    /* JADX INFO: renamed from: a */
    public static void m125a(String str, String str2) {
        if (C0020ab.f132g != null) {
            C0125s.m726a(C0020ab.f132g, f176b, C0131y.m777e(str), str2);
            m126a(str, str2, 2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m126a(String str, String str2, int i) {
        if (!C0131y.m767b(str) && f175a.containsKey(str)) {
            if (f175a == null) {
                return;
            }
            C0029ak c0029ak = f175a.get(str);
            if (i == 1) {
                c0029ak.f178d = str2;
            } else if (i == 2) {
                c0029ak.f180f = str2;
            } else if (i == 3) {
                c0029ak.f179e = str2;
            } else if (i == 4) {
                c0029ak.f177c = str2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m127b(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m128b(String str, String str2) {
        if (!C0131y.m767b(str) && !f175a.containsKey(str)) {
            if (f175a == null) {
                return;
            }
            try {
                C0029ak c0029ak = new C0029ak();
                c0029ak.f181g = str;
                c0029ak.f177c = str2;
                c0029ak.f179e = C0125s.m728b(C0020ab.f132g, f176b, C0131y.m777e(str), (String) null);
                c0029ak.f178d = m127b(c0029ak.f181g);
                f175a.put(c0029ak.f181g, c0029ak);
            } catch (Throwable unused) {
            }
        }
    }
}
