package p123Y3;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Comparator;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1976d;
import p208n4.C2714m;
import p208n4.InterfaceC2708g;

/* JADX INFO: renamed from: Y3.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1774e {

    /* JADX INFO: renamed from: a */
    public static final byte[] f6072a = new byte[0];

    /* JADX INFO: renamed from: b */
    public static final C2714m f6073b;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p123Y3.AbstractC1774e.<clinit>():void");
    }

    /* JADX INFO: renamed from: a */
    public static final void m3160a(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException("length=" + j5 + ", offset=" + j6 + ", count=" + j6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3161b(Closeable closeable) {
        AbstractC1665j.m2985e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m3162c(String str, char c5, int i5, int i6) {
        AbstractC1665j.m2985e(str, "<this>");
        while (i5 < i6) {
            if (str.charAt(i5) == c5) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    /* JADX INFO: renamed from: d */
    public static final int m3163d(String str, int i5, String str2, int i6) {
        AbstractC1665j.m2985e(str, "<this>");
        while (i5 < i6) {
            if (AbstractC1976d.m3628V(str2, str.charAt(i5))) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m3164e(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC1665j.m2985e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final int m3165f(String str) {
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = str.charAt(i5);
            if (AbstractC1665j.m2987g(cCharAt, 31) <= 0 || AbstractC1665j.m2987g(cCharAt, 127) >= 0) {
                return i5;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static final int m3166g(int i5, int i6, String str) {
        AbstractC1665j.m2985e(str, "<this>");
        while (i5 < i6) {
            char cCharAt = str.charAt(i5);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    /* JADX INFO: renamed from: h */
    public static final int m3167h(int i5, int i6, String str) {
        AbstractC1665j.m2985e(str, "<this>");
        int i7 = i6 - 1;
        if (i5 <= i7) {
            while (true) {
                char cCharAt = str.charAt(i7);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i7 + 1;
                }
                if (i7 == i5) {
                    break;
                }
                i7--;
            }
        }
        return i5;
    }

    /* JADX INFO: renamed from: i */
    public static final String[] m3168i(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC1665j.m2985e(strArr, "<this>");
        AbstractC1665j.m2985e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i5]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i5++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m3169j(String str) {
        AbstractC1665j.m2985e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    /* JADX INFO: renamed from: k */
    public static final int m3170k(char c5) {
        if ('0' <= c5 && c5 < ':') {
            return c5 - '0';
        }
        if ('a' <= c5 && c5 < 'g') {
            return c5 - 'W';
        }
        if ('A' > c5 || c5 >= 'G') {
            return -1;
        }
        return c5 - '7';
    }

    /* JADX INFO: renamed from: l */
    public static final int m3171l(InterfaceC2708g interfaceC2708g) {
        AbstractC1665j.m2985e(interfaceC2708g, "<this>");
        return (interfaceC2708g.readByte() & 255) | ((interfaceC2708g.readByte() & 255) << 16) | ((interfaceC2708g.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: m */
    public static final int m3172m(String str, int i5) {
        if (str != null) {
            try {
                long j5 = Long.parseLong(str);
                if (j5 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j5 < 0) {
                    return 0;
                }
                return (int) j5;
            } catch (NumberFormatException unused) {
            }
        }
        return i5;
    }

    /* JADX INFO: renamed from: n */
    public static final String m3173n(int i5, int i6, String str) {
        int iM3166g = m3166g(i5, i6, str);
        String strSubstring = str.substring(iM3166g, m3167h(iM3166g, i6, str));
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
