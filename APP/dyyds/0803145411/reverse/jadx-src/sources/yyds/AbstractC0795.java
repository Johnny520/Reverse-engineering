package yyds;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yyds.ᛴᛲᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0795 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final TimeZone f3653 = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final String f3654 = AbstractC0473.m1315(AbstractC0473.m1310(C1284.class.getName(), "okhttp3."), "Client");

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C1605 m1800(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1843 c1843 = (C1843) it.next();
            C2534 c2534 = c1843.f9270;
            C2534 c25342 = c1843.f9271;
            String strM4576 = c2534.m4576();
            String strM45762 = c25342.m4576();
            arrayList.add(strM4576);
            arrayList.add(AbstractC0473.m1314(strM45762).toString());
        }
        return new C1605((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final String m1801(C0082 c0082, boolean z) {
        int i = c0082.f664;
        String str = c0082.f670;
        if (AbstractC0473.m1301(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = c0082.f665;
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final long m1802(C0837 c0837) {
        String strM3306 = c0837.f3847.m3306("Content-Length");
        if (strM3306 == null) {
            return -1L;
        }
        byte[] bArr = AbstractC1429.f6782;
        try {
            return Long.parseLong(strM3306);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final boolean m1803(C0082 c0082, C0082 c00822) {
        return AbstractC1544.m3188(c0082.f670, c00822.f670) && c0082.f664 == c00822.f664 && AbstractC1544.m3188(c0082.f665, c00822.f665);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final int m1804(long j) {
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        long millis = TimeUnit.SECONDS.toMillis(j);
        if (millis > 2147483647L) {
            C0188.m806("timeout".concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        C0188.m806("timeout".concat(" too small"));
        return 0;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final boolean m1805(InterfaceC1590 interfaceC1590, int i) {
        long jNanoTime = System.nanoTime();
        long jMo2199 = interfaceC1590.mo693().mo2195() ? interfaceC1590.mo693().mo2199() - jNanoTime : Long.MAX_VALUE;
        interfaceC1590.mo693().mo2201(Math.min(jMo2199, TimeUnit.MILLISECONDS.toNanos(i)) + jNanoTime);
        try {
            C1507 c1507 = new C1507();
            while (interfaceC1590.mo692(8192L, c1507) != -1) {
                c1507.m3030(c1507.f7087);
            }
            if (jMo2199 == Long.MAX_VALUE) {
                interfaceC1590.mo693().mo2196();
                return true;
            }
            interfaceC1590.mo693().mo2201(jNanoTime + jMo2199);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo2199 == Long.MAX_VALUE) {
                interfaceC1590.mo693().mo2196();
                return false;
            }
            interfaceC1590.mo693().mo2201(jNanoTime + jMo2199);
            return false;
        } catch (Throwable th) {
            if (jMo2199 == Long.MAX_VALUE) {
                interfaceC1590.mo693().mo2196();
            } else {
                interfaceC1590.mo693().mo2201(jNanoTime + jMo2199);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final List m1806(Object[] objArr) {
        return (objArr == null || objArr.length == 0) ? C1860.f9345 : objArr.length == 1 ? Collections.singletonList(objArr[0]) : Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final List m1807(List list) {
        return list.isEmpty() ? C1860.f9345 : list.size() == 1 ? Collections.singletonList(list.get(0)) : Collections.unmodifiableList(Arrays.asList(list.toArray()));
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final void m1808(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!AbstractC1544.m3188(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final Charset m1809(InterfaceC0981 interfaceC0981, Charset charset) {
        int iMo2134 = interfaceC0981.mo2134(AbstractC1429.f6783);
        if (iMo2134 == -1) {
            return charset;
        }
        if (iMo2134 == 0) {
            return AbstractC0347.f1806;
        }
        if (iMo2134 == 1) {
            return AbstractC0347.f1807;
        }
        if (iMo2134 == 2) {
            Charset charset2 = AbstractC0347.f1806;
            Charset charset3 = AbstractC0347.f1810;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            AbstractC0347.f1810 = charsetForName;
            return charsetForName;
        }
        if (iMo2134 == 3) {
            return AbstractC0347.f1809;
        }
        if (iMo2134 != 4) {
            throw new AssertionError();
        }
        Charset charset4 = AbstractC0347.f1806;
        Charset charset5 = AbstractC0347.f1808;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        AbstractC0347.f1808 = charsetForName2;
        return charsetForName2;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final String m1810(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }
}
