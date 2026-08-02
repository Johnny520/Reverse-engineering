package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sw0 {
    static {
        C0505no c0505no = C0505no.f7266k;
        C0160eb.m1321z("\"\\");
        C0160eb.m1321z("\t ,=");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m5006a(r92 r92Var) {
        if (t11.m5086l(r92Var.f9456h.f5391b, "HEAD")) {
            return false;
        }
        int i = r92Var.f9459k;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || wg3.m5892e(r92Var) != -1) {
            return true;
        }
        String strM2557a = r92Var.f9461m.m2557a("Transfer-Encoding");
        if (strM2557a == null) {
            strM2557a = null;
        }
        return "chunked".equalsIgnoreCase(strM2557a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5007b(C0700sn c0700sn, yw0 yw0Var, js0 js0Var) {
        List listUnmodifiableList;
        List listUnmodifiableList2;
        int i;
        y00 y00Var;
        yw0 yw0Var2;
        String str;
        y00 y00Var2;
        c0700sn.getClass();
        yw0Var.getClass();
        js0Var.getClass();
        if (c0700sn == C0700sn.f10200D) {
            return;
        }
        Pattern pattern = y00.f13251k;
        int size = js0Var.size();
        int i2 = 0;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            if ("Set-Cookie".equalsIgnoreCase(js0Var.m2558b(i3))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(js0Var.m2560d(i3));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = null;
        }
        List list = be0.f819h;
        List list2 = listUnmodifiableList == null ? list : listUnmodifiableList;
        int size2 = list2.size();
        int i4 = 0;
        ArrayList arrayList2 = null;
        while (i4 < size2) {
            String str2 = (String) list2.get(i4);
            str2.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = ug3.f11300a;
            char c = ';';
            int iM5495c = ug3.m5495c(str2, ';', i2, str2.length());
            char c2 = '=';
            int iM5495c2 = ug3.m5495c(str2, '=', i2, iM5495c);
            if (iM5495c2 == iM5495c) {
                i = i2;
                y00Var = null;
            } else {
                int iM5499g = ug3.m5499g(str2, i2, iM5495c2);
                String strSubstring = str2.substring(iM5499g, ug3.m5500h(str2, iM5499g, iM5495c2));
                if (strSubstring.length() != 0 && ug3.m5498f(strSubstring) == -1) {
                    int iM5499g2 = ug3.m5499g(str2, iM5495c2 + 1, iM5495c);
                    String strSubstring2 = str2.substring(iM5499g2, ug3.m5500h(str2, iM5499g2, iM5495c));
                    if (ug3.m5498f(strSubstring2) == -1) {
                        int i5 = iM5495c + 1;
                        int length = str2.length();
                        long j = 253402300799999L;
                        int i6 = i2;
                        int i7 = i6;
                        boolean z = i7 == true ? 1 : 0;
                        long jM5055G = 253402300799999L;
                        String str3 = null;
                        String strSubstring3 = null;
                        long j2 = -1;
                        boolean z2 = true;
                        String str4 = null;
                        boolean z3 = i7;
                        while (true) {
                            String strSubstring4 = "";
                            if (i5 < length) {
                                int iM5495c3 = ug3.m5495c(str2, c, i5, length);
                                int iM5495c4 = ug3.m5495c(str2, c2, i5, iM5495c3);
                                int iM5499g3 = ug3.m5499g(str2, i5, iM5495c4);
                                String strSubstring5 = str2.substring(iM5499g3, ug3.m5500h(str2, iM5499g3, iM5495c4));
                                if (iM5495c4 < iM5495c3) {
                                    int iM5499g4 = ug3.m5499g(str2, iM5495c4 + 1, iM5495c3);
                                    strSubstring4 = str2.substring(iM5499g4, ug3.m5500h(str2, iM5499g4, iM5495c3));
                                }
                                if (strSubstring5.equalsIgnoreCase("expires")) {
                                    try {
                                        jM5055G = t11.m5055G(strSubstring4, strSubstring4.length());
                                        z3 = 1;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                    try {
                                        long j3 = Long.parseLong(strSubstring4);
                                        j2 = j3 <= 0 ? Long.MIN_VALUE : j3;
                                    } catch (NumberFormatException e) {
                                        Pattern patternCompile = Pattern.compile("-?\\d+");
                                        patternCompile.getClass();
                                        if (!patternCompile.matcher(strSubstring4).matches()) {
                                            throw e;
                                        }
                                        j2 = wv2.m6012d0(strSubstring4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z3 = 1;
                                } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                    if (wv2.m6005W(strSubstring4, ".", false)) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String strM4866b = sg3.m4866b(pv2.m4012y0(strSubstring4, "."));
                                    if (strM4866b == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str3 = strM4866b;
                                    z2 = false;
                                } else if (strSubstring5.equalsIgnoreCase("path")) {
                                    strSubstring3 = strSubstring4;
                                } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                    z = true;
                                } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                    i6 = 1;
                                } else if (strSubstring5.equalsIgnoreCase("samesite")) {
                                    str4 = strSubstring4;
                                }
                                i5 = iM5495c3 + 1;
                                c = ';';
                                c2 = '=';
                                z3 = z3;
                                z = z;
                            } else {
                                if (j2 == Long.MIN_VALUE) {
                                    yw0Var2 = yw0Var;
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j4 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    if (j4 < jCurrentTimeMillis || j4 > 253402300799999L) {
                                        yw0Var2 = yw0Var;
                                    } else {
                                        yw0Var2 = yw0Var;
                                        j = j4;
                                    }
                                } else {
                                    yw0Var2 = yw0Var;
                                    j = jM5055G;
                                }
                                String str5 = yw0Var2.f13644d;
                                if (str3 == null) {
                                    str = str5;
                                } else if (t11.m5086l(str5, str3) || (wv2.m6005W(str5, str3, false) && str5.charAt((str5.length() - str3.length()) - 1) == '.' && !sg3.f10139a.m3539b(str5))) {
                                    str = str3;
                                } else {
                                    i = 0;
                                    y00Var2 = null;
                                    y00Var = y00Var2;
                                }
                                if (str5.length() != str.length()) {
                                    k42 k42Var = k42.f5336d;
                                    k42Var.getClass();
                                    String unicode = IDN.toUnicode(str);
                                    unicode.getClass();
                                    List listM3987C0 = pv2.m3987C0(unicode, new char[]{'.'});
                                    if (t11.m5086l(AbstractC0142du.m1166v0(listM3987C0), "")) {
                                        int size3 = listM3987C0.size() - 1;
                                        if (size3 < 0) {
                                            size3 = 0;
                                        }
                                        AbstractC0142du.m1144B0(size3, listM3987C0);
                                    }
                                    kj1 kj1Var = k42Var.f5337a;
                                    AtomicBoolean atomicBoolean = (AtomicBoolean) kj1Var.f5594i;
                                    if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
                                        try {
                                            ((CountDownLatch) kj1Var.f5595j).await();
                                        } catch (InterruptedException unused2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    } else {
                                        boolean z4 = false;
                                        while (true) {
                                            try {
                                                try {
                                                    kj1Var.m2704I();
                                                    throw null;
                                                } catch (InterruptedIOException unused3) {
                                                    Thread.interrupted();
                                                    z4 = true;
                                                } catch (IOException e2) {
                                                    kj1Var.f5596k = e2;
                                                    if (z4) {
                                                        Thread.currentThread().interrupt();
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                if (z4) {
                                                    Thread.currentThread().interrupt();
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder("Unable to load ");
                                    sb.append(kj1Var.f5597l);
                                    sb.append(" resource.");
                                    IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
                                    illegalStateException.initCause((IOException) kj1Var.f5596k);
                                    throw illegalStateException;
                                }
                                i = 0;
                                if (strSubstring3 == null || !wv2.m6012d0(strSubstring3, "/", false)) {
                                    String strM6356b = yw0Var2.m6356b();
                                    int iM4008u0 = pv2.m4008u0(strM6356b, '/', 0, 6);
                                    strSubstring3 = iM4008u0 != 0 ? strM6356b.substring(0, iM4008u0) : "/";
                                }
                                y00Var2 = new y00(strSubstring, strSubstring2, j, str, strSubstring3, z ? 1 : 0, i6, z3, z2, str4);
                                y00Var = y00Var2;
                            }
                        }
                    }
                }
            }
            if (y00Var != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(y00Var);
            }
            i4++;
            i2 = i;
        }
        if (arrayList2 != null) {
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
            listUnmodifiableList2.getClass();
        } else {
            listUnmodifiableList2 = null;
        }
        if (listUnmodifiableList2 != null) {
            list = listUnmodifiableList2;
        }
        list.isEmpty();
    }
}
