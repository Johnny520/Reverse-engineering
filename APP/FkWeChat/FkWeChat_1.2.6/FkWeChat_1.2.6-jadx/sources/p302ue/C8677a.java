package p302ue;

import p299ub.C8614c;
import p331we.AbstractC9231a;
import p376zd.C9987e;

/* JADX INFO: renamed from: ue.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8677a {

    /* JADX INFO: renamed from: a */
    public static final C8677a f28773a = new C8677a();

    /* JADX INFO: renamed from: b */
    public static final char[] f28774b;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        charArray.getClass();
        f28774b = charArray;
    }

    /* JADX INFO: renamed from: a */
    public final String m33329a(String str, String str2, String str3, AbstractC9231a abstractC9231a) {
        str.getClass();
        str2.getClass();
        String str4 = m33330b(str) + ":" + str2;
        if (str3 != null) {
            return str4 + ":user:" + m33331c(str3);
        }
        if (abstractC9231a == null) {
            C9987e.m38645a("Either key or query must be provided for auto-generated cache key.");
            return null;
        }
        return str4 + ":auto:" + m33331c(abstractC9231a.m35948c());
    }

    /* JADX INFO: renamed from: b */
    public final String m33330b(String str) {
        str.getClass();
        return "dkcb:" + m33331c(str);
    }

    /* JADX INFO: renamed from: c */
    public final String m33331c(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(C8614c.f28652b);
        bytes.getClass();
        StringBuilder sb2 = new StringBuilder(bytes.length);
        for (byte b10 : bytes) {
            int i10 = b10 & 255;
            char c10 = (char) i10;
            if (m33332d(c10)) {
                sb2.append('%');
                char[] cArr = f28774b;
                sb2.append(cArr[i10 >>> 4]);
                sb2.append(cArr[b10 & 15]);
            } else {
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m33332d(char c10) {
        return c10 == ':' || c10 == '%';
    }
}
