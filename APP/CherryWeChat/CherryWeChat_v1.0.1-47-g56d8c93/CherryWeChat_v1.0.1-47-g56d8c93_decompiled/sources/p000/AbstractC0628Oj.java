package p000;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Oj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0628Oj {

    /* JADX INFO: renamed from: a */
    public static final float[][] f2007a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    public static final float[][] f2008b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    public static final float[] f2009c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    public static final float[][] f2010d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: e */
    public static final C2610v1 f2011e = new C2610v1("REMOVED_TASK", 10);

    /* JADX INFO: renamed from: f */
    public static final C2610v1 f2012f = new C2610v1("CLOSED_EMPTY", 10);

    /* JADX INFO: renamed from: g */
    public static final C0668Pg f2013g = new C0668Pg(20);

    /* JADX INFO: renamed from: h */
    public static final C1517hw f2014h = new C1517hw(3);

    /* JADX INFO: renamed from: i */
    public static final C1517hw f2015i = new C1517hw(4);

    /* JADX INFO: renamed from: j */
    public static final C1517hw f2016j = new C1517hw(2);

    /* JADX INFO: renamed from: k */
    public static long f2017k = 0;

    /* JADX INFO: renamed from: l */
    public static Method f2018l = null;

    /* JADX INFO: renamed from: m */
    public static boolean f2019m = true;

    /* JADX INFO: renamed from: n */
    public static Field f2020n;

    /* JADX INFO: renamed from: o */
    public static boolean f2021o;

    /* JADX INFO: renamed from: B */
    public static final void m1222B(InterfaceC1137ac interfaceC1137ac, Throwable th) {
        if (th instanceof C1324de) {
            th = ((C1324de) th).f4800a;
        }
        try {
            if (((C0046B2) interfaceC1137ac.mo24m(C1456gf.f5159c)) != null) {
                return;
            }
            AbstractC0585Nj.m1125D(interfaceC1137ac, th);
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0148Dc.m268b(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0585Nj.m1125D(interfaceC1137ac, th);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final int m1223C(C0607O4 c0607o4, Object obj, int i) {
        int i2 = c0607o4.f1947c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM1482d = AbstractC0714Qj.m1482d(i2, i, c0607o4.f1945a);
            if (iM1482d < 0 || AbstractC0585Nj.m1134a(obj, c0607o4.f1946b[iM1482d])) {
                return iM1482d;
            }
            int i3 = iM1482d + 1;
            while (i3 < i2 && c0607o4.f1945a[i3] == i) {
                if (AbstractC0585Nj.m1134a(obj, c0607o4.f1946b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM1482d - 1; i4 >= 0 && c0607o4.f1945a[i4] == i; i4--) {
                if (AbstractC0585Nj.m1134a(obj, c0607o4.f1946b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: D */
    public static int m1224D(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f2009c;
        return AbstractC2797za.m5363a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: E */
    public static InterfaceC0190Eb m1225E(InterfaceC0190Eb interfaceC0190Eb) {
        AbstractC0233Fb abstractC0233Fb = interfaceC0190Eb instanceof AbstractC0233Fb ? (AbstractC0233Fb) interfaceC0190Eb : null;
        if (abstractC0233Fb == null || (interfaceC0190Eb = abstractC0233Fb.f732c) != null) {
            return interfaceC0190Eb;
        }
        AbstractC1217bc abstractC1217bc = (AbstractC1217bc) abstractC0233Fb.f731b.mo24m(C1456gf.f5158b);
        InterfaceC0190Eb c1367ee = abstractC1217bc != null ? new C1367ee(abstractC1217bc, abstractC0233Fb) : abstractC0233Fb;
        abstractC0233Fb.f732c = c1367ee;
        return c1367ee;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m1226F() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC2749yB.m5331a();
        }
        try {
            if (f2018l == null) {
                f2017k = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2018l = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2018l.invoke(null, Long.valueOf(f2017k))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX INFO: renamed from: H */
    public static boolean m1227H(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: I */
    public static boolean m1228I(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: L */
    public static float m1229L(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: M */
    public static long m1230M(int i, byte[] bArr) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    /* JADX INFO: renamed from: N */
    public static final long m1231N(String str) {
        char cCharAt;
        int length = str.length();
        int i = (length <= 0 || AbstractC2564tz.m5056Q("+-", str.charAt(0), 0, 2) < 0) ? 0 : 1;
        if (length - i > 16) {
            int i2 = i;
            while (true) {
                if (i < length) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 == '0') {
                        if (i2 == i) {
                            i2++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i++;
                } else if (length - i2 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!str.startsWith("+") || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(AbstractC2564tz.m5052M(1, str));
    }

    /* JADX INFO: renamed from: T */
    public static final void m1232T(Object obj) throws Throwable {
        if (obj instanceof C0297Gw) {
            throw ((C0297Gw) obj).f1010a;
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m1233U(int i, long j, byte[] bArr) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    /* JADX INFO: renamed from: V */
    public static final C2323oh m1234V(File file) {
        int length;
        List list;
        int iM5056Q;
        String path = file.getPath();
        char c = File.separatorChar;
        int iM5056Q2 = AbstractC2564tz.m5056Q(path, c, 0, 4);
        if (iM5056Q2 != 0) {
            length = (iM5056Q2 <= 0 || path.charAt(iM5056Q2 + (-1)) != ':') ? (iM5056Q2 == -1 && path.length() > 0 && AbstractC0148Dc.m274h(path.charAt(AbstractC2564tz.m5053N(path)), ':', false)) ? path.length() : 0 : iM5056Q2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c || (iM5056Q = AbstractC2564tz.m5056Q(path, c, 2, 4)) < 0) {
            length = 1;
        } else {
            int iM5056Q3 = AbstractC2564tz.m5056Q(path, c, iM5056Q + 1, 4);
            length = iM5056Q3 >= 0 ? iM5056Q3 + 1 : path.length();
        }
        String strSubstring = path.substring(0, length);
        String strSubstring2 = path.substring(length);
        if (strSubstring2.length() == 0) {
            list = C0452Kf.f1484a;
        } else {
            List listM5066a0 = AbstractC2564tz.m5066a0(strSubstring2, new char[]{c});
            ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listM5066a0, 10));
            Iterator it = listM5066a0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new C2323oh(new File(strSubstring), list);
    }

    /* JADX INFO: renamed from: W */
    public static final long m1235W(long j, EnumC0666Pe enumC0666Pe) {
        EnumC0666Pe enumC0666Pe2 = EnumC0666Pe.NANOSECONDS;
        TimeUnit timeUnit = enumC0666Pe.f2131a;
        TimeUnit timeUnit2 = enumC0666Pe.f2131a;
        long jConvert = timeUnit.convert(4611686018426999999L, enumC0666Pe2.f2131a);
        if ((-jConvert) > j || j > jConvert) {
            return m1244m(AbstractC0828TB.m1640g(EnumC0666Pe.MILLISECONDS.f2131a.convert(j, timeUnit2)));
        }
        long jConvert2 = enumC0666Pe2.f2131a.convert(j, timeUnit2) << 1;
        int i = C0537Me.f1749d;
        int i2 = AbstractC0580Ne.f1877a;
        return jConvert2;
    }

    /* JADX INFO: renamed from: Y */
    public static float m1236Y() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m1237a(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (AbstractC0585Nj.m1139g(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final long m1238b(String str) {
        EnumC0666Pe enumC0666Pe;
        int i;
        long jM1245n;
        char cCharAt;
        String str2 = str;
        int length = str2.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i2 = C0537Me.f1749d;
        int i3 = 0;
        char cCharAt2 = str2.charAt(0);
        char c = 1;
        int i4 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z = i4 > 0 && str2.length() > 0 && AbstractC0148Dc.m274h(str2.charAt(0), '-', false);
        if (length <= i4) {
            throw new IllegalArgumentException("No components");
        }
        if (str2.charAt(i4) != 'P') {
            throw new IllegalArgumentException();
        }
        int i5 = i4 + 1;
        if (i5 == length) {
            throw new IllegalArgumentException();
        }
        EnumC0666Pe enumC0666Pe2 = null;
        char c2 = 0;
        long jM1034e = 0;
        while (i5 < length) {
            if (str2.charAt(i5) != 'T') {
                int i6 = i5;
                while (i6 < str2.length() && (('0' <= (cCharAt = str2.charAt(i6)) && cCharAt < ':') || AbstractC2564tz.m5056Q("+-.", cCharAt, i3, 2) >= 0)) {
                    i6++;
                }
                String strSubstring = str2.substring(i5, i6);
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i5;
                if (length2 < 0 || length2 >= str2.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str2.charAt(length2);
                int i7 = length2 + 1;
                if (c2 == 0) {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    enumC0666Pe = EnumC0666Pe.DAYS;
                } else if (cCharAt3 == 'H') {
                    enumC0666Pe = EnumC0666Pe.HOURS;
                } else if (cCharAt3 == 'M') {
                    enumC0666Pe = EnumC0666Pe.MINUTES;
                } else {
                    if (cCharAt3 != 'S') {
                        throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                    }
                    enumC0666Pe = EnumC0666Pe.SECONDS;
                }
                if (enumC0666Pe2 != null && enumC0666Pe2.compareTo(enumC0666Pe) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iM5056Q = AbstractC2564tz.m5056Q(strSubstring, '.', i3, 6);
                if (enumC0666Pe != EnumC0666Pe.SECONDS || iM5056Q <= 0) {
                    EnumC0666Pe enumC0666Pe3 = enumC0666Pe;
                    jM1034e = C0537Me.m1034e(jM1034e, m1235W(m1231N(strSubstring), enumC0666Pe3));
                    str2 = str;
                    enumC0666Pe2 = enumC0666Pe3;
                    length = length;
                    i5 = i7;
                    c = c;
                } else {
                    long jM1034e2 = C0537Me.m1034e(jM1034e, m1235W(m1231N(strSubstring.substring(i3, iM5056Q)), enumC0666Pe));
                    double d = Double.parseDouble(strSubstring.substring(iM5056Q));
                    TimeUnit timeUnit = EnumC0666Pe.NANOSECONDS.f2131a;
                    TimeUnit timeUnit2 = enumC0666Pe.f2131a;
                    char c3 = c;
                    EnumC0666Pe enumC0666Pe4 = enumC0666Pe;
                    long jConvert = timeUnit.convert(1L, timeUnit2);
                    double dConvert = jConvert > 0 ? jConvert * d : d / timeUnit2.convert(1L, timeUnit);
                    if (Double.isNaN(dConvert)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    if (Double.isNaN(dConvert)) {
                        throw new IllegalArgumentException("Cannot round NaN value.");
                    }
                    long jRound = Math.round(dConvert);
                    if (-4611686018426999999L > jRound || jRound >= 4611686018427000000L) {
                        i = length;
                        long jConvert2 = EnumC0666Pe.MILLISECONDS.f2131a.convert(1L, timeUnit2);
                        double dConvert2 = jConvert2 > 0 ? d * jConvert2 : d / timeUnit2.convert(1L, r2);
                        if (Double.isNaN(dConvert2)) {
                            throw new IllegalArgumentException("Cannot round NaN value.");
                        }
                        jM1245n = m1245n(Math.round(dConvert2));
                    } else {
                        int i8 = C0537Me.f1749d;
                        int i9 = AbstractC0580Ne.f1877a;
                        i = length;
                        jM1245n = jRound << c3;
                    }
                    jM1034e = C0537Me.m1034e(jM1034e2, jM1245n);
                    str2 = str;
                    length = i;
                    i5 = i7;
                    c = c3;
                    enumC0666Pe2 = enumC0666Pe4;
                }
                i3 = 0;
            } else {
                if (c2 != 0 || (i5 = i5 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                c2 = c;
            }
        }
        char c4 = c;
        if (!z) {
            return jM1034e;
        }
        long j = ((-(jM1034e >> c4)) << c4) + ((long) (((int) jM1034e) & 1));
        int i10 = AbstractC0580Ne.f1877a;
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static void m1239c(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: i */
    public static final void m1240i(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m1241j(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jM1230M = m1230M(0, bArr) & 67108863;
        int i = 3;
        long jM1230M2 = (m1230M(3, bArr) >> 2) & 67108611;
        long jM1230M3 = (m1230M(6, bArr) >> 4) & 67092735;
        long jM1230M4 = (m1230M(9, bArr) >> 6) & 66076671;
        long jM1230M5 = (m1230M(12, bArr) >> 8) & 1048575;
        long j = jM1230M2 * 5;
        long j2 = jM1230M3 * 5;
        long j3 = jM1230M4 * 5;
        long j4 = jM1230M5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jM1230M6 = j9 + (m1230M(0, bArr3) & 67108863);
            long jM1230M7 = j5 + ((m1230M(i, bArr3) >> 2) & 67108863);
            long jM1230M8 = j6 + ((m1230M(6, bArr3) >> 4) & 67108863);
            long jM1230M9 = j7 + ((m1230M(9, bArr3) >> 6) & 67108863);
            long j10 = jM1230M2;
            long jM1230M10 = j8 + (((m1230M(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j11 = (jM1230M10 * j) + (jM1230M9 * j2) + (jM1230M8 * j3) + (jM1230M7 * j4) + (jM1230M6 * jM1230M);
            long j12 = (jM1230M10 * j2) + (jM1230M9 * j3) + (jM1230M8 * j4) + (jM1230M7 * jM1230M) + (jM1230M6 * j10);
            long j13 = (jM1230M10 * j3) + (jM1230M9 * j4) + (jM1230M8 * jM1230M) + (jM1230M7 * j10) + (jM1230M6 * jM1230M3);
            long j14 = (jM1230M10 * j4) + (jM1230M9 * jM1230M) + (jM1230M8 * j10) + (jM1230M7 * jM1230M3) + (jM1230M6 * jM1230M4);
            long j15 = jM1230M9 * j10;
            long j16 = jM1230M10 * jM1230M;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jM1230M8 * jM1230M3) + (jM1230M7 * jM1230M4) + (jM1230M6 * jM1230M5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jM1230M2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jM1230M11 = m1230M(16, bArr) + j50;
        long j54 = jM1230M11 & 4294967295L;
        long jM1230M12 = m1230M(20, bArr) + j51 + (jM1230M11 >> 32);
        long jM1230M13 = m1230M(24, bArr) + j52 + (jM1230M12 >> 32);
        long jM1230M14 = (m1230M(28, bArr) + j53 + (jM1230M13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        m1233U(0, j54, bArr4);
        m1233U(4, jM1230M12 & 4294967295L, bArr4);
        m1233U(8, jM1230M13 & 4294967295L, bArr4);
        m1233U(12, jM1230M14, bArr4);
        return bArr4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static InterfaceC0190Eb m1242k(InterfaceC0190Eb interfaceC0190Eb, InterfaceC0190Eb interfaceC0190Eb2, Function2 function2) {
        if (function2 instanceof AbstractC2571u5) {
            return ((AbstractC2571u5) function2).mo447h(interfaceC0190Eb2, interfaceC0190Eb);
        }
        InterfaceC1137ac interfaceC1137acMo263e = interfaceC0190Eb2.mo263e();
        return interfaceC1137acMo263e == C0366If.f1247a ? new C0544Ml(interfaceC0190Eb2, interfaceC0190Eb, function2) : new C0587Nl(interfaceC0190Eb2, interfaceC1137acMo263e, function2, interfaceC0190Eb);
    }

    /* JADX INFO: renamed from: l */
    public static final C1194ax m1243l(C2557ts c2557ts) {
        LinkedHashMap linkedHashMap = c2557ts.f7638a;
        InterfaceC2075ix interfaceC2075ix = (InterfaceC2075ix) linkedHashMap.get(f2014h);
        if (interfaceC2075ix == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC2752yE interfaceC2752yE = (InterfaceC2752yE) linkedHashMap.get(f2015i);
        if (interfaceC2752yE == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f2016j);
        String str = (String) linkedHashMap.get(C1456gf.f5170n);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC1474gx interfaceC1474gxM2897b = interfaceC2075ix.getSavedStateRegistry().m2897b();
        C1342dx c1342dx = interfaceC1474gxM2897b instanceof C1342dx ? (C1342dx) interfaceC1474gxM2897b : null;
        if (c1342dx == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        C1386ex c1386exM1250y = m1250y(interfaceC2752yE);
        C1194ax c1194ax = (C1194ax) c1386exM1250y.f4935d.get(str);
        if (c1194ax != null) {
            return c1194ax;
        }
        Class[] clsArr = C1194ax.f4091f;
        c1342dx.m2598a();
        Bundle bundle2 = c1342dx.f4834c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = c1342dx.f4834c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = c1342dx.f4834c;
        if (bundle5 != null && bundle5.isEmpty()) {
            c1342dx.f4834c = null;
        }
        C1194ax c1194axM1491m = AbstractC0714Qj.m1491m(bundle3, bundle);
        c1386exM1250y.f4935d.put(str, c1194axM1491m);
        return c1194axM1491m;
    }

    /* JADX INFO: renamed from: m */
    public static final long m1244m(long j) {
        long j2 = (j << 1) + 1;
        int i = C0537Me.f1749d;
        int i2 = AbstractC0580Ne.f1877a;
        return j2;
    }

    /* JADX INFO: renamed from: n */
    public static final long m1245n(long j) {
        if (-4611686018426L > j || j >= 4611686018427L) {
            return m1244m(AbstractC0828TB.m1640g(j));
        }
        long j2 = (j * ((long) 1000000)) << 1;
        int i = C0537Me.f1749d;
        int i2 = AbstractC0580Ne.f1877a;
        return j2;
    }

    /* JADX INFO: renamed from: o */
    public static final void m1246o(InterfaceC2075ix interfaceC2075ix) {
        EnumC0675Pn enumC0675Pn = ((C1185ao) interfaceC2075ix.getLifecycle()).f4064c;
        if (enumC0675Pn != EnumC0675Pn.f2148b && enumC0675Pn != EnumC0675Pn.f2149c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC2075ix.getSavedStateRegistry().m2897b() == null) {
            C1342dx c1342dx = new C1342dx(interfaceC2075ix.getSavedStateRegistry(), (InterfaceC2752yE) interfaceC2075ix);
            interfaceC2075ix.getSavedStateRegistry().m2898c("androidx.lifecycle.internal.SavedStateHandlesProvider", c1342dx);
            interfaceC2075ix.getLifecycle().mo1555a(new C1297cv(4, c1342dx));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m1247p(Activity activity) {
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            AbstractC0295Gu.m625r(-141922899327029L);
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().setStatusBarColor(0);
            View decorView = activity.getWindow().getDecorView();
            AbstractC0295Gu.m625r(-142004503705653L);
            int systemUiVisibility = decorView.getSystemUiVisibility();
            HashMap map = AbstractC0999XA.f3193a;
            decorView.setSystemUiVisibility(C1517hw.m2895h() ? (systemUiVisibility | 1024) & (-8193) : systemUiVisibility | 9216);
            attributes.layoutInDisplayCutoutMode = 1;
            activity.getWindow().setAttributes(attributes);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m1248u(C2656w4 c2656w4) {
        C2610v1 c2610v1;
        ArrayList arrayList = new ArrayList();
        C1381es c1381es = C1381es.f4925b;
        Iterator it = ((ConcurrentMap) c2656w4.f9196b).values().iterator();
        while (it.hasNext()) {
            for (C2516su c2516su : (List) it.next()) {
                int iOrdinal = c2516su.f8810d.ordinal();
                if (iOrdinal == 1) {
                    c2610v1 = C2610v1.f8996B;
                } else if (iOrdinal == 2) {
                    c2610v1 = C2610v1.f8997C;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    c2610v1 = C2610v1.f8998D;
                }
                int i = c2516su.f8812f;
                String strSubstring = c2516su.f8813g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new C1425fs(c2610v1, i, strSubstring, c2516su.f8811e.name()));
            }
        }
        C2516su c2516su2 = (C2516su) c2656w4.f9197c;
        Integer numValueOf = c2516su2 != null ? Integer.valueOf(c2516su2.f8812f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((C1425fs) it2.next()).f5026b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC0717Qm m1249v(InterfaceC0717Qm interfaceC0717Qm) {
        return interfaceC0717Qm.getDescriptor().mo208h() ? interfaceC0717Qm : new C1295ct(interfaceC0717Qm);
    }

    /* JADX INFO: renamed from: y */
    public static final C1386ex m1250y(InterfaceC2752yE interfaceC2752yE) {
        AbstractC2580uE abstractC2580uEMo171a;
        C1299cx c1299cx = new C1299cx();
        C2709xE viewModelStore = interfaceC2752yE.getViewModelStore();
        AbstractC2189lc defaultViewModelCreationExtras = interfaceC2752yE instanceof InterfaceC2420qk ? ((InterfaceC2420qk) interfaceC2752yE).getDefaultViewModelCreationExtras() : C2098jc.f7385b;
        AbstractC2580uE abstractC2580uE = (AbstractC2580uE) viewModelStore.f9284a.get("androidx.lifecycle.internal.SavedStateHandlesVM");
        if (!C1386ex.class.isInstance(abstractC2580uE)) {
            C2557ts c2557ts = new C2557ts(defaultViewModelCreationExtras);
            c2557ts.m5044a(C1456gf.f5170n, "androidx.lifecycle.internal.SavedStateHandlesVM");
            try {
                abstractC2580uEMo171a = c1299cx.mo2563b(C1386ex.class, c2557ts);
            } catch (AbstractMethodError unused) {
                abstractC2580uEMo171a = c1299cx.mo171a(C1386ex.class);
            }
            abstractC2580uE = abstractC2580uEMo171a;
            AbstractC2580uE abstractC2580uE2 = (AbstractC2580uE) viewModelStore.f9284a.put("androidx.lifecycle.internal.SavedStateHandlesVM", abstractC2580uE);
            if (abstractC2580uE2 != null) {
                abstractC2580uE2.mo297b();
            }
        }
        return (C1386ex) abstractC2580uE;
    }

    /* JADX INFO: renamed from: A */
    public float mo1251A(View view) {
        if (f2019m) {
            try {
                return AbstractC0660PE.m1318a(view);
            } catch (NoSuchMethodError unused) {
                f2019m = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: G */
    public abstract boolean mo865G(float f);

    /* JADX INFO: renamed from: J */
    public abstract boolean mo866J(View view);

    /* JADX INFO: renamed from: K */
    public abstract boolean mo867K(float f, float f2);

    /* JADX INFO: renamed from: O */
    public abstract void mo730O(C0430K c0430k, C0430K c0430k2);

    /* JADX INFO: renamed from: P */
    public abstract void mo731P(C0430K c0430k, Thread thread);

    /* JADX INFO: renamed from: Q */
    public void mo1252Q(View view, float f) {
        if (f2019m) {
            try {
                AbstractC0660PE.m1319b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f2019m = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: R */
    public void mo1253R(View view, int i) {
        if (!f2021o) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2020n = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2021o = true;
        }
        Field field = f2020n;
        if (field != null) {
            try {
                f2020n.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public abstract boolean mo868S(View view, float f);

    /* JADX INFO: renamed from: X */
    public abstract void mo869X(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    /* JADX INFO: renamed from: d */
    public abstract int mo870d(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* JADX INFO: renamed from: e */
    public abstract float mo871e(int i);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo732f(AbstractFutureC0473L abstractFutureC0473L, C0301H c0301h);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo733g(AbstractFutureC0473L abstractFutureC0473L, Object obj, Object obj2);

    /* JADX INFO: renamed from: h */
    public abstract boolean mo734h(AbstractFutureC0473L abstractFutureC0473L, C0430K c0430k, C0430K c0430k2);

    /* JADX INFO: renamed from: q */
    public abstract int mo872q();

    /* JADX INFO: renamed from: r */
    public abstract int mo873r();

    /* JADX INFO: renamed from: s */
    public abstract int mo874s();

    /* JADX INFO: renamed from: t */
    public abstract int mo875t();

    /* JADX INFO: renamed from: w */
    public abstract int mo876w(View view);

    /* JADX INFO: renamed from: x */
    public abstract int mo877x(CoordinatorLayout coordinatorLayout);

    /* JADX INFO: renamed from: z */
    public abstract int mo878z();
}
