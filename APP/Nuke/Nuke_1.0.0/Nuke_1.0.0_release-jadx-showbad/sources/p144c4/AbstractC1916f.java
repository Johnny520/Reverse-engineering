package p144c4;

import com.bumptech.glide.AbstractC1925g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import p000A.C0002B;
import p007B0.C0173F;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0974n;
import p061L2.C0958A;
import p061L2.C0981u;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p118X3.C1684F;
import p118X3.C1692b;
import p118X3.C1701k;
import p118X3.C1707q;
import p118X3.C1709s;
import p123Y3.AbstractC1773d;
import p123Y3.AbstractC1774e;
import p123Y3.AbstractC1776g;
import p132a3.C1804d;
import p143c3.C1904f;
import p143c3.C1909k;
import p149d3.AbstractC1976d;
import p149d3.AbstractC1983k;
import p179i4.AbstractC2352g;
import p191k4.C2475a;
import p191k4.C2476b;
import p208n4.C2709h;

/* JADX INFO: renamed from: c4.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1916f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2709h c2709h = C2709h.f8630g;
        C2475a.m4416e("\"\\");
        C2475a.m4416e("\t ,=");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m3406a(C1684F c1684f) {
        if (AbstractC1665j.m2981a(c1684f.f5738d.f5713b, "HEAD")) {
            return false;
        }
        int i5 = c1684f.f5741g;
        if (((i5 < 100 || i5 >= 200) && i5 != 204 && i5 != 304) || AbstractC1776g.m3177d(c1684f) != -1) {
            return true;
        }
        String strM3038a = c1684f.f5743i.m3038a("Transfer-Encoding");
        if (strM3038a == null) {
            strM3038a = null;
        }
        return "chunked".equalsIgnoreCase(strM3038a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0214, code lost:
    
        if (((java.util.regex.Pattern) r6.f5710e).matcher(r0).matches() == false) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3407b(C1692b c1692b, C1709s c1709s, C1707q c1707q) {
        List listUnmodifiableList;
        List listUnmodifiableList2;
        C1701k c1701k;
        C0981u c0981u;
        List list;
        String str;
        C1701k c1701k2;
        List listM3643k0;
        int i5;
        String str2;
        AbstractC1665j.m2985e(c1692b, "<this>");
        AbstractC1665j.m2985e(c1709s, "url");
        AbstractC1665j.m2985e(c1707q, "headers");
        if (c1692b == C1692b.f5786c) {
            return;
        }
        Pattern pattern = C1701k.f5835k;
        int size = c1707q.size();
        int i6 = 0;
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            if ("Set-Cookie".equalsIgnoreCase(c1707q.m3039b(i7))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(c1707q.m3041d(i7));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC1665j.m2984d(listUnmodifiableList, "unmodifiableList(...)");
        } else {
            listUnmodifiableList = null;
        }
        C0981u c0981u2 = C0981u.f3047d;
        List list2 = listUnmodifiableList == null ? c0981u2 : listUnmodifiableList;
        int size2 = list2.size();
        int i8 = 0;
        ArrayList arrayList2 = null;
        while (i8 < size2) {
            String str3 = (String) list2.get(i8);
            AbstractC1665j.m2985e(str3, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = AbstractC1774e.f6072a;
            char c5 = ';';
            int iM3162c = AbstractC1774e.m3162c(str3, ';', i6, str3.length());
            int iM3162c2 = AbstractC1774e.m3162c(str3, '=', i6, iM3162c);
            if (iM3162c2 == iM3162c) {
                c1701k = null;
                c0981u = c0981u2;
                list = list2;
                i6 = 0;
            } else {
                String strM3173n = AbstractC1774e.m3173n(i6, iM3162c2, str3);
                if (strM3173n.length() != 0 && AbstractC1774e.m3165f(strM3173n) == -1) {
                    String strM3173n2 = AbstractC1774e.m3173n(iM3162c2 + 1, iM3162c, str3);
                    if (AbstractC1774e.m3165f(strM3173n2) == -1) {
                        int i9 = iM3162c + 1;
                        int length = str3.length();
                        long j5 = 253402300799999L;
                        boolean z5 = false;
                        String str4 = null;
                        String str5 = null;
                        String str6 = null;
                        long jM3522E = 253402300799999L;
                        long j6 = -1;
                        boolean z6 = false;
                        boolean z7 = true;
                        boolean z8 = false;
                        while (true) {
                            if (i9 < length) {
                                C0981u c0981u3 = c0981u2;
                                int iM3162c3 = AbstractC1774e.m3162c(str3, c5, i9, length);
                                int i10 = length;
                                int iM3162c4 = AbstractC1774e.m3162c(str3, '=', i9, iM3162c3);
                                String strM3173n3 = AbstractC1774e.m3173n(i9, iM3162c4, str3);
                                String strM3173n4 = iM3162c4 < iM3162c3 ? AbstractC1774e.m3173n(iM3162c4 + 1, iM3162c3, str3) : "";
                                if (strM3173n3.equalsIgnoreCase("expires")) {
                                    try {
                                        jM3522E = AbstractC1925g.m3522E(strM3173n4, strM3173n4.length());
                                        z6 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (strM3173n3.equalsIgnoreCase("max-age")) {
                                    try {
                                        long j7 = Long.parseLong(strM3173n4);
                                        j6 = j7 <= 0 ? Long.MIN_VALUE : j7;
                                    } catch (NumberFormatException e5) {
                                        Pattern patternCompile = Pattern.compile("-?\\d+");
                                        AbstractC1665j.m2984d(patternCompile, "compile(...)");
                                        if (!patternCompile.matcher(strM3173n4).matches()) {
                                            throw e5;
                                        }
                                        j6 = AbstractC1983k.m3656S(strM3173n4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z6 = true;
                                } else if (strM3173n3.equalsIgnoreCase("domain")) {
                                    if (strM3173n4.endsWith(".")) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String strM3159b = AbstractC1773d.m3159b(AbstractC1976d.m3642j0(strM3173n4, "."));
                                    if (strM3159b == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str4 = strM3159b;
                                    z7 = false;
                                } else if (strM3173n3.equalsIgnoreCase("path")) {
                                    str6 = strM3173n4;
                                } else if (strM3173n3.equalsIgnoreCase("secure")) {
                                    z8 = true;
                                } else if (strM3173n3.equalsIgnoreCase("httponly")) {
                                    z5 = true;
                                } else if (strM3173n3.equalsIgnoreCase("samesite")) {
                                    str5 = strM3173n4;
                                }
                                i9 = iM3162c3 + 1;
                                length = i10;
                                c0981u2 = c0981u3;
                                c5 = ';';
                            } else {
                                c0981u = c0981u2;
                                if (j6 == Long.MIN_VALUE) {
                                    list = list2;
                                    j5 = Long.MIN_VALUE;
                                } else if (j6 != -1) {
                                    if (j6 <= 9223372036854775L) {
                                        list = list2;
                                        j = j6 * ((long) 1000);
                                    } else {
                                        list = list2;
                                    }
                                    long j8 = jCurrentTimeMillis + j;
                                    if (j8 >= jCurrentTimeMillis && j8 <= 253402300799999L) {
                                        j5 = j8;
                                    }
                                } else {
                                    list = list2;
                                    j5 = jM3522E;
                                }
                                String str7 = c1709s.f5871d;
                                if (str4 == null) {
                                    str = str7;
                                } else {
                                    if (!AbstractC1665j.m2981a(str7, str4)) {
                                        if (AbstractC1983k.m3650M(str7, str4) && str7.charAt((str7.length() - str4.length()) - 1) == '.') {
                                            C1675t c1675t = AbstractC1773d.f6071a;
                                            C1675t c1675t2 = AbstractC1773d.f6071a;
                                            c1675t2.getClass();
                                        }
                                        i6 = 0;
                                        c1701k2 = null;
                                        c1701k = c1701k2;
                                    }
                                    str = str4;
                                }
                                if (str7.length() != str.length()) {
                                    C2476b c2476b = C2476b.f7969d;
                                    c2476b.getClass();
                                    String unicode = IDN.toUnicode(str);
                                    AbstractC1665j.m2982b(unicode);
                                    char[] cArr = {'.'};
                                    AbstractC1665j.m2985e(unicode, "<this>");
                                    if (cArr.length == 1) {
                                        listM3643k0 = AbstractC1976d.m3643k0(unicode, String.valueOf(cArr[0]));
                                    } else {
                                        C1909k c1909k = new C1909k(new C1904f(unicode, new C0002B(14, cArr)));
                                        ArrayList arrayList3 = new ArrayList(AbstractC0974n.m2029K(c1909k, 10));
                                        Iterator it = c1909k.iterator();
                                        while (true) {
                                            C0958A c0958a = (C0958A) it;
                                            if (!c0958a.hasNext()) {
                                                break;
                                            }
                                            C1804d c1804d = (C1804d) c0958a.next();
                                            AbstractC1665j.m2985e(c1804d, "range");
                                            arrayList3.add(unicode.subSequence(c1804d.f6140d, c1804d.f6141e + 1).toString());
                                        }
                                        listM3643k0 = arrayList3;
                                    }
                                    if (AbstractC1665j.m2981a(AbstractC0973m.m2017X(listM3643k0), "")) {
                                        int size3 = listM3643k0.size() - 1;
                                        if (size3 < 0) {
                                            size3 = 0;
                                        }
                                        if (size3 < 0) {
                                            throw new IllegalArgumentException(AbstractC0231b.m397h(size3, "Requested element count ", " is less than zero.").toString());
                                        }
                                        if (size3 != 0) {
                                            if (size3 >= listM3643k0.size()) {
                                                AbstractC0973m.m2024e0(listM3643k0);
                                            } else if (size3 == 1) {
                                                AbstractC2352g.m4211y(AbstractC0973m.m2012S(listM3643k0));
                                            } else {
                                                ArrayList arrayList4 = new ArrayList(size3);
                                                Iterator it2 = listM3643k0.iterator();
                                                int i11 = 0;
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        i5 = 1;
                                                        break;
                                                    }
                                                    arrayList4.add(it2.next());
                                                    i5 = 1;
                                                    i11++;
                                                    if (i11 == size3) {
                                                        break;
                                                    }
                                                }
                                                int size4 = arrayList4.size();
                                                if (size4 != 0 && size4 == i5) {
                                                    AbstractC2352g.m4211y(arrayList4.get(0));
                                                }
                                            }
                                        }
                                    }
                                    C0173F c0173f = c2476b.f7970a;
                                    AtomicBoolean atomicBoolean = (AtomicBoolean) c0173f.f612e;
                                    if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
                                        try {
                                            ((CountDownLatch) c0173f.f613f).await();
                                        } catch (InterruptedException unused2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    } else {
                                        boolean z9 = false;
                                        while (true) {
                                            try {
                                                try {
                                                    c0173f.m257n();
                                                    throw null;
                                                } catch (Throwable th) {
                                                    if (z9) {
                                                        Thread.currentThread().interrupt();
                                                    }
                                                    throw th;
                                                }
                                            } catch (InterruptedIOException unused3) {
                                                Thread.interrupted();
                                                z9 = true;
                                            } catch (IOException e6) {
                                                c0173f.f614g = e6;
                                                if (z9) {
                                                    Thread.currentThread().interrupt();
                                                }
                                            }
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder("Unable to load ");
                                    sb.append(c0173f.f615h);
                                    sb.append(" resource.");
                                    IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
                                    illegalStateException.initCause((IOException) c0173f.f614g);
                                    throw illegalStateException;
                                }
                                String strSubstring = "/";
                                String str8 = str6;
                                i6 = 0;
                                if (str8 == null || !AbstractC1983k.m3656S(str8, "/", false)) {
                                    String strM3047b = c1709s.m3047b();
                                    int iM3639g0 = AbstractC1976d.m3639g0(strM3047b, '/', 0, 6);
                                    if (iM3639g0 != 0) {
                                        strSubstring = strM3047b.substring(0, iM3639g0);
                                        AbstractC1665j.m2984d(strSubstring, "substring(...)");
                                    }
                                    str2 = strSubstring;
                                } else {
                                    str2 = str8;
                                }
                                c1701k2 = new C1701k(strM3173n, strM3173n2, j5, str, str2, z8, z5, z6, z7, str5);
                                c1701k = c1701k2;
                            }
                        }
                    }
                }
            }
            if (c1701k != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(c1701k);
            }
            i8++;
            list2 = list;
            c0981u2 = c0981u;
        }
        C0981u c0981u4 = c0981u2;
        if (arrayList2 != null) {
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
            AbstractC1665j.m2984d(listUnmodifiableList2, "unmodifiableList(...)");
        } else {
            listUnmodifiableList2 = null;
        }
        (listUnmodifiableList2 == null ? c0981u4 : listUnmodifiableList2).isEmpty();
    }
}
