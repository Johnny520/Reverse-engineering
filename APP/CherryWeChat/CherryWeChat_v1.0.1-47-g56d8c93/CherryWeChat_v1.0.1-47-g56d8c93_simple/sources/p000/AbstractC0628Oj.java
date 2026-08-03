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
    public static final float[][] f2007a = null;

    /* JADX INFO: renamed from: b */
    public static final float[][] f2008b = null;

    /* JADX INFO: renamed from: c */
    public static final float[] f2009c = null;

    /* JADX INFO: renamed from: d */
    public static final float[][] f2010d = null;

    /* JADX INFO: renamed from: e */
    public static final C2610v1 f2011e = null;

    /* JADX INFO: renamed from: f */
    public static final C2610v1 f2012f = null;

    /* JADX INFO: renamed from: g */
    public static final C0668Pg f2013g = null;

    /* JADX INFO: renamed from: h */
    public static final C1517hw f2014h = null;

    /* JADX INFO: renamed from: i */
    public static final C1517hw f2015i = null;

    /* JADX INFO: renamed from: j */
    public static final C1517hw f2016j = null;

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

    static {
        f2007a = new float[][]{new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
        f2008b = new float[][]{new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
        f2009c = new float[]{95.047f, 100.0f, 108.883f};
        f2010d = new float[][]{new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
        f2011e = new C2610v1("REMOVED_TASK", 10);
        f2012f = new C2610v1("CLOSED_EMPTY", 10);
        f2013g = new C0668Pg(20);
        f2014h = new C1517hw(3);
        f2015i = new C1517hw(4);
        f2016j = new C1517hw(2);
    }

    /* JADX INFO: renamed from: B */
    public static final void m1222B(InterfaceC1137ac r3, Throwable r4) {
        if ((r4 instanceof C1324de) == false) goto L16;
        r4 = ((C1324de) r4).f4800a;
    L16:
        if (((C0046B2) r3.mo24m(C1456gf.f5159c)) == null) goto L8;
        return;
    L8:
        AbstractC0585Nj.m1125D(r3, r4);
        return;
    L10:
        th = move-exception;
        if (r4 == th) goto L14;
        RuntimeException r1 = new RuntimeException("Exception while trying to handle coroutine exception", th);
        AbstractC0148Dc.m268b(r1, r4);
        r4 = r1;
    L14:
        AbstractC0585Nj.m1125D(r3, r4);
    }

    /* JADX INFO: renamed from: C */
    public static final int m1223C(C0607O4 r4, Object r5, int r6) {
        int r0 = r4.f1947c;
        if (r0 != 0) goto L32;
        return -1;
    L32:
        int r1 = AbstractC0714Qj.m1482d(r0, r6, r4.f1945a);     // Catch: IndexOutOfBoundsException -> L30
        if (r1 >= 0) goto L10;
    L11:
        return r1;
    L10:
        if (AbstractC0585Nj.m1134a(r5, r4.f1946b[r1]) == true) goto L11;
        int r2 = r1 + 1;
    L13:
        if (r2 >= r0) goto L20;
        if (r4.f1945a[r2] != r6) goto L20;
        if (AbstractC0585Nj.m1134a(r5, r4.f1946b[r2]) == true) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r12 = r1 - 1;
    L21:
        if (r12 < 0) goto L29;
        if (r4.f1945a[r12] != r6) goto L29;
        if (AbstractC0585Nj.m1134a(r5, r4.f1946b[r12]) == true) goto L26;
        r12 = r12 - 1;
        goto L21
    L26:
        return r12;
    L29:
        return ~r2;
    L31:
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: D */
    public static int m1224D(float r15) {
        if (r15 >= 1.0f) goto L7;
        return -16777216;
    L7:
        if (r15 <= 99.0f) goto L10;
        return -1;
    L10:
        float r1 = (r15 + 16.0f) / 116.0f;
        if (r15 <= 8.0f) goto L13;
        float r152 = (r1 * r1) * r1;
    L14:
        float r3 = (r1 * r1) * r1;
        if (r3 <= 0.008856452f) goto L17;
        boolean r5 = true;
    L18:
        if (r5 == false) goto L20;
        float r8 = r3;
    L21:
        if (r5 == true) goto L24;
        r3 = ((r1 * 116.0f) - 16.0f) / 903.2963f;
    L24:
        float[] r0 = f2009c;
        return AbstractC2797za.m5363a(r8 * r0[0], r152 * r0[1], r3 * r0[2]);
    L20:
        r8 = ((r1 * 116.0f) - 16.0f) / 903.2963f;
        goto L21
    L17:
        r5 = false;
        goto L18
    L13:
        r152 = r15 / 903.2963f;
        goto L14
    }

    /* JADX INFO: renamed from: E */
    public static InterfaceC0190Eb m1225E(InterfaceC0190Eb r2) {
        if ((r2 instanceof AbstractC0233Fb) == false) goto L5;
        AbstractC0233Fb r0 = (AbstractC0233Fb) r2;
    L6:
        if (r0 == null) goto L15;
        r2 = r0.f732c;
        if (r2 != null) goto L15;
        AbstractC1217bc r22 = (AbstractC1217bc) r0.f731b.mo24m(C1456gf.f5158b);
        if (r22 == null) goto L12;
        InterfaceC0190Eb r1 = new C1367ee(r22, r0);
    L13:
        r0.f732c = r1;
        return r1;
    L12:
        r1 = r0;
    L15:
        return r2;
    L5:
        r0 = null;
        goto L6
    }

    /* JADX INFO: renamed from: F */
    public static boolean m1226F() {
        if (Build.VERSION.SDK_INT < 29) goto L23;
        return AbstractC2749yB.m5331a();
    L23:
    L12:
        e = move-exception;
        if ((e instanceof InvocationTargetException) == false) goto L21;
        Throwable r0 = e.getCause();
        if ((r0 instanceof RuntimeException) == false) goto L20;
        throw ((RuntimeException) r0);
    L20:
        throw new RuntimeException(r0);
    L21:
        return false;
    L8:
        if (f2018l != null) goto L10;
        f2017k = Trace.class.getField("TRACE_TAG_APP").getLong(null);     // Catch: Exception -> L12
        f2018l = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});     // Catch: Exception -> L12
    L10:
        return ((Boolean) f2018l.invoke(null, new Object[]{Long.valueOf(f2017k)})).booleanValue();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m1227H(Uri r2) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if ("content".equals(r2.getScheme()) == true) goto L6;
        return false;
    L6:
        if ("media".equals(r2.getAuthority()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m1228I(byte r1) {
        if (r1 <= (-65)) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: L */
    public static float m1229L(int r6) {
        float r62 = r6 / 255.0f;
        if (r62 > 0.04045f) goto L7;
        float r63 = r62 / 12.92f;
    L6:
        return r63 * 100.0f;
    L7:
        r63 = (float) Math.pow((r62 + 0.055f) / 1.055f, 2.4000000953674316d);
        goto L6
    }

    /* JADX INFO: renamed from: M */
    public static long m1230M(int r2, byte[] r3) {
        int r0 = ((r3[r2] & 255) | ((r3[r2 + 1] & 255) << 8)) | ((r3[r2 + 2] & 255) << 16);
        return ((long) (((r3[r2 + 3] & 255) << 24) | r0)) & 4294967295L;
    }

    /* JADX INFO: renamed from: N */
    public static final long m1231N(String r10) {
        int r0 = r10.length();
        if (r0 > 0) goto L5;
    L7:
        int r3 = 0;
    L9:
        if ((r0 - r3) <= 16) goto L29;
        int r4 = r3;
    L11:
        if (r3 >= r0) goto L21;
        char r8 = r10.charAt(r3);
        if (r8 != '0') goto L17;
        if (r4 != r3) goto L19;
        r4 = r4 + 1;
    L19:
        r3 = r3 + 1;
        goto L11
    L17:
        if ('1' > r8) goto L29;
        if (r8 >= ':') goto L29;
    L21:
        if ((r0 - r4) <= 16) goto L29;
        if (r10.charAt(0) != '-') goto L26;
        return Long.MIN_VALUE;
    L26:
        return Long.MAX_VALUE;
    L29:
        if (r10.startsWith("+") == false) goto L37;
        if (r0 <= 1) goto L37;
        char r02 = r10.charAt(1);
        if ('0' > r02) goto L37;
        if (r02 >= ':') goto L37;
        return Long.parseLong(AbstractC2564tz.m5052M(1, r10));
    L37:
        return Long.parseLong(r10);
    L5:
        if (AbstractC2564tz.m5056Q("+-", r10.charAt(0), 0, 2) < 0) goto L7;
        r3 = 1;
        goto L9
    }

    /* JADX INFO: renamed from: T */
    public static final void m1232T(Object r1) {
        if ((r1 instanceof C0297Gw) == true) goto L6;
        return;
    L6:
        throw ((C0297Gw) r1).f1010a;
    }

    /* JADX INFO: renamed from: U */
    public static void m1233U(int r4, long r5, byte[] r7) {
        int r0 = 0;
    L4:
        if (r0 >= 4) goto L6;
        r7[r4 + r0] = (byte) (255 & r5);
        r0 = r0 + 1;
        r5 = r5 >> 8;
        goto L4
    }

    /* JADX INFO: renamed from: V */
    public static final C2323oh m1234V(File r6) {
        String r62 = r6.getPath();
        char r0 = File.separatorChar;
        int r3 = AbstractC2564tz.m5056Q(r62, r0, 0, 4);
        if (r3 != 0) goto L16;
        if (r62.length() > 1) goto L7;
    L14:
        int r2 = 1;
    L28:
        String r32 = r62.substring(0, r2);
        String r63 = r62.substring(r2);
        if (r63.length() != 0) goto L31;
        List r64 = C0452Kf.f1484a;
    L37:
        return new C2323oh(new File(r32), r64);
    L31:
        List r65 = AbstractC2564tz.m5066a0(r63, new char[]{r0});
        ArrayList r02 = new ArrayList(AbstractC2539ta.m5019d0(r65, 10));
        Iterator r66 = r65.iterator();
    L33:
        if (r66.hasNext() == false) goto L35;
        r02.add(new File((String) r66.next()));
        goto L33
    L35:
        r64 = r02;
        goto L37
    L7:
        if (r62.charAt(1) != r0) goto L14;
        int r33 = AbstractC2564tz.m5056Q(r62, r0, 2, 4);
        if (r33 < 0) goto L14;
        int r22 = AbstractC2564tz.m5056Q(r62, r0, r33 + 1, 4);
        if (r22 < 0) goto L13;
        r2 = r22 + 1;
        goto L28
    L13:
        r2 = r62.length();
        goto L28
    L16:
        if (r3 <= 0) goto L21;
        if (r62.charAt(r3 - 1) != ':') goto L21;
        r2 = r3 + 1;
    L21:
        if (r3 == (-1)) goto L23;
    L27:
        r2 = 0;
        goto L28
    L23:
        if (r62.length() <= 0) goto L27;
        if (AbstractC0148Dc.m274h(r62.charAt(AbstractC2564tz.m5053N(r62)), ':', false) == false) goto L27;
        r2 = r62.length();
        goto L28
    }

    /* JADX INFO: renamed from: W */
    public static final long m1235W(long r5, EnumC0666Pe r7) {
        EnumC0666Pe r0 = EnumC0666Pe.f2124b;
        TimeUnit r1 = r7.f2131a;
        TimeUnit r72 = r7.f2131a;
        long r12 = r1.convert(4611686018426999999L, r0.f2131a);
        if ((-r12) > r5) goto L9;
        if (r5 > r12) goto L9;
        long r52 = r0.f2131a.convert(r5, r72) << 1;
        int r73 = C0537Me.f1749d;
        int r74 = AbstractC0580Ne.f1877a;
        return r52;
    L9:
        return m1244m(AbstractC0828TB.m1640g(EnumC0666Pe.f2125c.f2131a.convert(r5, r72)));
    }

    /* JADX INFO: renamed from: Y */
    public static float m1236Y() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m1237a(String r4) {
        int r1 = 0;
    L4:
        if (r1 >= r4.length()) goto L13;
        char r2 = r4.charAt(r1);
        if (AbstractC0585Nj.m1139g(r2, 128) >= 0) goto L11;
        if (Character.isLetter(r2) == true) goto L17;
        r1 = r1 + 1;
        goto L4
    L17:
        return true;
    L11:
        return true;
    L13:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final long m1238b(String r25) {
        String r0 = r25;
        int r1 = r0.length();
        if (r1 == 0) goto L120;
        int r2 = C0537Me.f1749d;
        int r22 = 0;
        char r3 = r0.charAt(0);
        char r6 = 1;
        if (r3 == '+') goto L8;
        if (r3 == '-') goto L8;
        int r32 = 0;
    L9:
        if (r32 > 0) goto L11;
    L15:
        boolean r4 = false;
    L16:
        if (r1 <= r32) goto L118;
        if (r0.charAt(r32) != 'P') goto L116;
        int r33 = r32 + 1;
        if (r33 == r1) goto L114;
        EnumC0666Pe r5 = null;
        char r9 = 0;
        long r10 = 0;
    L22:
        if (r33 >= r1) goto L108;
        if (r0.charAt(r33) == 'T') goto L25;
        int r12 = r33;
    L33:
        if (r12 >= r0.length()) goto L42;
        char r13 = r0.charAt(r12);
        if ('0' > r13) goto L40;
        if (r13 >= ':') goto L40;
    L41:
        r12 = r12 + 1;
    L40:
        if (AbstractC2564tz.m5056Q("+-.", r13, r22, 2) >= 0) goto L41;
    L42:
        String r122 = r0.substring(r33, r12);
        if (r122.length() == 0) goto L107;
        int r132 = r122.length() + r33;
        if (r132 < 0) goto L105;
        if (r132 >= r0.length()) goto L105;
        char r34 = r0.charAt(r132);
        int r133 = r132 + 1;
        if (r9 != 0) goto L56;
        if (r34 != 'D') goto L54;
        EnumC0666Pe r35 = EnumC0666Pe.f2129g;
    L66:
        if (r5 != null) goto L68;
    L72:
        int r52 = AbstractC2564tz.m5056Q(r122, '.', r22, 6);
        if (r35 != EnumC0666Pe.f2126d) goto L103;
        if (r52 <= 0) goto L103;
        long r102 = C0537Me.m1034e(r10, m1235W(m1231N(r122.substring(r22, r52)), r35));
        double r14 = Double.parseDouble(r122.substring(r52));
        TimeUnit r53 = EnumC0666Pe.f2124b.f2131a;
        TimeUnit r123 = r35.f2131a;
        char r16 = r6;
        EnumC0666Pe r19 = r35;
        long r23 = r53.convert(1, r123);
        if (r23 <= 0) goto L78;
        double r24 = r23 * r14;
    L80:
        if (Double.isNaN(r24) == true) goto L102;
        if (Double.isNaN(r24) == true) goto L100;
        long r26 = Math.round(r24);
        if ((-4611686018426999999L) <= r26) goto L86;
    L88:
        int r36 = r1;
        long r02 = EnumC0666Pe.f2125c.f2131a.convert(1, r123);
        if (r02 <= 0) goto L91;
        double r142 = r14 * r02;
    L93:
        if (Double.isNaN(r142) == true) goto L98;
        long r03 = m1245n(Math.round(r142));
    L95:
        r10 = C0537Me.m1034e(r102, r03);
        r0 = r25;
        r1 = r36;
        r33 = r133;
        r6 = r16;
        r5 = r19;
    L96:
        r22 = 0;
        goto L22
    L98:
        throw new IllegalArgumentException("Cannot round NaN value.");
    L91:
        r142 = r14 / r123.convert(1, r2);
        goto L93
    L86:
        if (r26 >= 4611686018427000000L) goto L88;
        int r54 = C0537Me.f1749d;
        int r55 = AbstractC0580Ne.f1877a;
        r36 = r1;
        r03 = r26 << r16;
        goto L95
    L100:
        throw new IllegalArgumentException("Cannot round NaN value.");
    L102:
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    L78:
        r24 = r14 / r123.convert(1, r53);
    L103:
        EnumC0666Pe r192 = r35;
        r10 = C0537Me.m1034e(r10, m1235W(m1231N(r122), r192));
        r0 = r25;
        r5 = r192;
        r1 = r1;
        r33 = r133;
        r6 = r6;
        goto L96
    L68:
        if (r5.compareTo(r35) > 0) goto L72;
        throw new IllegalArgumentException("Unexpected order of duration components");
    L54:
        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + r34);
    L56:
        if (r34 != 'H') goto L58;
        r35 = EnumC0666Pe.f2128f;
        goto L66
    L58:
        if (r34 != 'M') goto L60;
        r35 = EnumC0666Pe.f2127e;
        goto L66
    L60:
        if (r34 != 'S') goto L63;
        r35 = EnumC0666Pe.f2126d;
        goto L66
    L63:
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + r34);
    L105:
        throw new IllegalArgumentException("Missing unit for value ".concat(r122));
    L107:
        throw new IllegalArgumentException();
    L25:
        if (r9 != 0) goto L30;
        r33 = r33 + 1;
        if (r33 == r1) goto L30;
        r9 = r6;
    L30:
        throw new IllegalArgumentException();
    L108:
        char r162 = r6;
        if (r4 == false) goto L112;
        long r04 = ((-(r10 >> r162)) << r162) + ((long) (((int) r10) & 1));
        int r27 = AbstractC0580Ne.f1877a;
        return r04;
    L112:
        return r10;
    L114:
        throw new IllegalArgumentException();
    L116:
        throw new IllegalArgumentException();
    L118:
        throw new IllegalArgumentException("No components");
    L11:
        if (r0.length() <= 0) goto L15;
        if (AbstractC0148Dc.m274h(r0.charAt(0), '-', false) == false) goto L15;
        r4 = true;
    L8:
        r32 = 1;
        goto L9
    L120:
        throw new IllegalArgumentException("The string is empty");
    }

    /* JADX INFO: renamed from: c */
    public static void m1239c(String r2) {
        if (r2.length() <= 127) goto L6;
        r2 = r2.substring(0, 127);
    L6:
        Trace.beginSection(r2);
    }

    /* JADX INFO: renamed from: i */
    public static final void m1240i(int r1) {
        if (r1 < 1) goto L6;
        return;
    L6:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r1, "Expected positive parallelism level, but got ").toString());
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m1241j(byte[] r59, byte[] r60) {
        if (r59.length != 32) goto L14;
        long r4 = m1230M(0, r59) & 67108863;
        int r8 = 3;
        long r9 = (m1230M(3, r59) >> 2) & 67108611;
        long r13 = (m1230M(6, r59) >> 4) & 67092735;
        long r17 = (m1230M(9, r59) >> 6) & 66076671;
        long r21 = (m1230M(12, r59) >> 8) & 1048575;
        long r25 = r9 * 5;
        long r27 = r13 * 5;
        long r29 = r17 * 5;
        long r31 = r21 * 5;
        byte[] r7 = new byte[17];
        long r35 = 0;
        long r37 = 0;
        long r39 = 0;
        long r41 = 0;
        long r43 = 0;
        int r15 = 0;
    L6:
        if (r15 >= r60.length) goto L11;
        int r6 = Math.min(16, r60.length - r15);
        System.arraycopy(r60, r15, r7, 0, r6);
        r7[r6] = 1;
        if (r6 == 16) goto L10;
        Arrays.fill(r7, r6 + 1, 17, (byte) 0);
    L10:
        long r432 = r43 + (m1230M(0, r7) & 67108863);
        long r352 = r35 + ((m1230M(r8, r7) >> 2) & 67108863);
        long r372 = r37 + ((m1230M(6, r7) >> 4) & 67108863);
        long r392 = r39 + ((m1230M(9, r7) >> 6) & 67108863);
        long r51 = r9;
        long r412 = r41 + (((m1230M(12, r7) >> 8) & 67108863) | ((long) (r7[16] << 24)));
        long r82 = (r412 * r25) + ((r392 * r27) + ((r372 * r29) + ((r352 * r31) + (r432 * r4))));
        long r49 = (r412 * r27) + ((r392 * r29) + ((r372 * r31) + ((r352 * r4) + (r432 * r51))));
        long r53 = (r412 * r29) + ((r392 * r31) + ((r372 * r4) + ((r352 * r51) + (r432 * r13))));
        long r55 = (r412 * r31) + ((r392 * r4) + ((r372 * r51) + ((r352 * r13) + (r432 * r17))));
        long r373 = r372 * r13;
        long r393 = r392 * r51;
        long r413 = r412 * r4;
        long r414 = r413 + (r393 + (r373 + ((r352 * r17) + (r432 * r21))));
        long r492 = r49 + (r82 >> 26);
        long r532 = r53 + (r492 >> 26);
        long r552 = r55 + (r532 >> 26);
        long r415 = r414 + (r552 >> 26);
        long r353 = r415 >> 26;
        r41 = r415 & 67108863;
        long r354 = (r353 * 5) + (r82 & 67108863);
        r15 = r15 + 16;
        r37 = r532 & 67108863;
        r39 = r552 & 67108863;
        r43 = r354 & 67108863;
        r35 = (r492 & 67108863) + (r354 >> 26);
        r9 = r51;
        r8 = 3;
        goto L6
    L11:
        long r374 = r37 + (r35 >> 26);
        long r83 = r374 & 67108863;
        long r394 = r39 + (r374 >> 26);
        long r10 = r394 & 67108863;
        long r416 = r41 + (r394 >> 26);
        long r132 = r416 & 67108863;
        long r42 = ((r416 >> 26) * 5) + r43;
        long r172 = r42 >> 26;
        long r44 = r42 & 67108863;
        long r62 = (r35 & 67108863) + r172;
        long r23 = r44 + 5;
        long r212 = r23 & 67108863;
        long r173 = r62 + (r23 >> 26);
        long r232 = r83 + (r173 >> 26);
        long r252 = r10 + (r232 >> 26);
        long r19 = r252 & 67108863;
        long r272 = (r132 + (r252 >> 26)) - 67108864;
        long r12 = r272 >> 63;
        long r45 = r44 & r12;
        long r63 = r62 & r12;
        long r84 = r83 & r12;
        long r102 = r10 & r12;
        long r253 = r132 & r12;
        long r122 = ~r12;
        long r64 = r63 | ((r173 & 67108863) & r122);
        long r85 = r84 | ((r232 & 67108863) & r122);
        long r103 = r102 | (r19 & r122);
        long r46 = ((r45 | (r212 & r122)) | (r64 << 26)) & 4294967295L;
        long r65 = ((r64 >> 6) | (r85 << 20)) & 4294967295L;
        long r86 = ((r85 >> 12) | (r103 << 14)) & 4294967295L;
        long r104 = ((r103 >> 18) | ((r253 | (r272 & r122)) << 8)) & 4294967295L;
        long r123 = m1230M(16, r59) + r46;
        long r47 = r123 & 4294967295L;
        long r14 = (m1230M(20, r59) + r65) + (r123 >> 32);
        long r124 = (m1230M(24, r59) + r86) + (r14 >> 32);
        long r0 = ((m1230M(28, r59) + r104) + (r124 >> 32)) & 4294967295L;
        byte[] r3 = new byte[16];
        m1233U(0, r47, r3);
        m1233U(4, r14 & 4294967295L, r3);
        m1233U(8, r124 & 4294967295L, r3);
        m1233U(12, r0, r3);
        return r3;
    L14:
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static InterfaceC0190Eb m1242k(InterfaceC0190Eb r2, InterfaceC0190Eb r3, Function2 r4) {
        if ((r4 instanceof AbstractC2571u5) == true) goto L5;
        InterfaceC1137ac r0 = r3.mo263e();
        if (r0 != C0366If.f1247a) goto L11;
        return new C0544Ml(r3, r2, r4);
    L11:
        return new C0587Nl(r3, r0, r4, r2);
    L5:
        return ((AbstractC2571u5) r4).mo447h(r3, r2);
    }

    /* JADX INFO: renamed from: l */
    public static final C1194ax m1243l(C2557ts r7) {
        LinkedHashMap r72 = r7.f7638a;
        InterfaceC2075ix r0 = (InterfaceC2075ix) r72.get(f2014h);
        if (r0 == null) goto L37;
        InterfaceC2752yE r1 = (InterfaceC2752yE) r72.get(f2015i);
        if (r1 == null) goto L35;
        Bundle r2 = (Bundle) r72.get(f2016j);
        String r73 = (String) r72.get(C1456gf.f5170n);
        if (r73 == null) goto L33;
        InterfaceC1474gx r02 = r0.getSavedStateRegistry().m2897b();
        if ((r02 instanceof C1342dx) == false) goto L11;
        C1342dx r03 = (C1342dx) r02;
    L12:
        if (r03 == null) goto L31;
        C1386ex r12 = m1250y(r1);
        C1194ax r3 = (C1194ax) r12.f4935d.get(r73);
        if (r3 != null) goto L29;
        Class[] r32 = C1194ax.f4091f;
        r03.m2598a();
        Bundle r33 = r03.f4834c;
        if (r33 == null) goto L18;
        Bundle r34 = r33.getBundle(r73);
    L19:
        Bundle r5 = r03.f4834c;
        if (r5 == null) goto L22;
        r5.remove(r73);
    L22:
        Bundle r52 = r03.f4834c;
        if (r52 != null) goto L25;
    L27:
        C1194ax r04 = AbstractC0714Qj.m1491m(r34, r2);
        r12.f4935d.put(r73, r04);
        return r04;
    L25:
        if (r52.isEmpty() != true) goto L27;
        r03.f4834c = null;
        goto L27
    L18:
        r34 = null;
        goto L19
    L29:
        return r3;
    L31:
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    L11:
        r03 = null;
        goto L12
    L33:
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    L35:
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
    L37:
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* JADX INFO: renamed from: m */
    public static final long m1244m(long r2) {
        long r22 = (r2 << 1) + 1;
        int r0 = C0537Me.f1749d;
        int r02 = AbstractC0580Ne.f1877a;
        return r22;
    }

    /* JADX INFO: renamed from: n */
    public static final long m1245n(long r2) {
        if ((-4611686018426L) > r2) goto L9;
        if (r2 >= 4611686018427L) goto L9;
        long r22 = (r2 * ((long) 1000000)) << 1;
        int r0 = C0537Me.f1749d;
        int r02 = AbstractC0580Ne.f1877a;
        return r22;
    L9:
        return m1244m(AbstractC0828TB.m1640g(r2));
    }

    /* JADX INFO: renamed from: o */
    public static final void m1246o(InterfaceC2075ix r3) {
        EnumC0675Pn r0 = ((C1185ao) r3.getLifecycle()).f4064c;
        if (r0 == EnumC0675Pn.f2148b) goto L10;
        if (r0 == EnumC0675Pn.f2149c) goto L10;
        throw new IllegalArgumentException("Failed requirement.");
    L10:
        if (r3.getSavedStateRegistry().m2897b() != null) goto L13;
        C1342dx r02 = new C1342dx(r3.getSavedStateRegistry(), (InterfaceC2752yE) r3);
        r3.getSavedStateRegistry().m2898c("androidx.lifecycle.internal.SavedStateHandlesProvider", r02);
        r3.getLifecycle().mo1555a(new C1297cv(4, r02));
        return;
    }

    /* JADX INFO: renamed from: p */
    public static void m1247p(Activity r4) {
        WindowManager.LayoutParams r0 = r4.getWindow().getAttributes();     // Catch: Exception -> L8
        AbstractC0295Gu.m625r(-141922899327029L);     // Catch: Exception -> L8
        r4.getWindow().clearFlags(67108864);     // Catch: Exception -> L8
        r4.getWindow().addFlags(Integer.MIN_VALUE);     // Catch: Exception -> L8
        r4.getWindow().setStatusBarColor(0);     // Catch: Exception -> L8
        View r1 = r4.getWindow().getDecorView();     // Catch: Exception -> L8
        AbstractC0295Gu.m625r(-142004503705653L);     // Catch: Exception -> L8
        int r2 = r1.getSystemUiVisibility();     // Catch: Exception -> L8
        HashMap r3 = AbstractC0999XA.f3193a;     // Catch: Exception -> L8
        if (C1517hw.m2895h() == false) goto L5;
        int r22 = (r2 | 1024) & (-8193);     // Catch: Exception -> L8
    L6:
        r1.setSystemUiVisibility(r22);     // Catch: Exception -> L8
        r0.layoutInDisplayCutoutMode = 1;     // Catch: Exception -> L8
        r4.getWindow().setAttributes(r0);     // Catch: Exception -> L8
        return;
    L5:
        r22 = r2 | 9216;     // Catch: Exception -> L8
    }

    /* JADX INFO: renamed from: u */
    public static void m1248u(C2656w4 r8) {
        ArrayList r0 = new ArrayList();
        C1381es r1 = C1381es.f4925b;
        Iterator r12 = ((ConcurrentMap) r8.f9196b).values().iterator();
    L4:
        if (r12.hasNext() == false) goto L24;
        Iterator r2 = ((List) r12.next()).iterator();
    L7:
        if (r2.hasNext() == false) goto L4;
        C2516su r3 = (C2516su) r2.next();
        int r4 = r3.f8810d.ordinal();
        if (r4 != 1) goto L11;
        C2610v1 r42 = C2610v1.f8996B;
    L19:
        int r5 = r3.f8812f;
        String r6 = r3.f8813g;
        if (r6.startsWith("type.googleapis.com/google.crypto.") == false) goto L23;
        r6 = r6.substring(34);
    L23:
        r0.add(new C1425fs(r42, r5, r6, r3.f8811e.name()));
        goto L7
    L11:
        if (r4 != 2) goto L13;
        r42 = C2610v1.f8997C;
        goto L19
    L13:
        if (r4 != 3) goto L16;
        r42 = C2610v1.f8998D;
        goto L19
    L16:
        throw new IllegalStateException("Unknown key status");
    L24:
        C2516su r82 = (C2516su) r8.f9197c;
        if (r82 == null) goto L27;
        Integer r83 = Integer.valueOf(r82.f8812f);
    L28:
        if (r83 != null) goto L43;
    L39:
        Collections.unmodifiableList(r0);     // Catch: GeneralSecurityException -> L37
        return;
    L43:
        int r84 = r83.intValue();     // Catch: GeneralSecurityException -> L37
        Iterator r13 = r0.iterator();     // Catch: GeneralSecurityException -> L37
    L31:
        if (r13.hasNext() == false) goto L36;
        if (((C1425fs) r13.next()).f5026b != r84) goto L31;
    L36:
        throw new GeneralSecurityException("primary key ID is not present in entries");     // Catch: GeneralSecurityException -> L37
    L37:
        e = move-exception;
        throw new IllegalStateException(e);
    L27:
        r83 = null;
        goto L28
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC0717Qm m1249v(InterfaceC0717Qm r1) {
        if (r1.getDescriptor().mo208h() == false) goto L6;
        return r1;
    L6:
        return new C1295ct(r1);
    }

    /* JADX INFO: renamed from: y */
    public static final C1386ex m1250y(InterfaceC2752yE r6) {
        C1299cx r0 = new C1299cx();
        C2709xE r1 = r6.getViewModelStore();
        if ((r6 instanceof InterfaceC2420qk) == false) goto L5;
        AbstractC2189lc r62 = ((InterfaceC2420qk) r6).getDefaultViewModelCreationExtras();
    L6:
        AbstractC2580uE r2 = (AbstractC2580uE) r1.f9284a.get("androidx.lifecycle.internal.SavedStateHandlesVM");
        if (C1386ex.class.isInstance(r2) == true) goto L17;
        C2557ts r22 = new C2557ts(r62);
        r22.m5044a(C1456gf.f5170n, "androidx.lifecycle.internal.SavedStateHandlesVM");
        AbstractC2580uE r63 = r0.mo2563b(C1386ex.class, r22);     // Catch: AbstractMethodError -> L12
    L11:
        r2 = r63;
        AbstractC2580uE r64 = (AbstractC2580uE) r1.f9284a.put("androidx.lifecycle.internal.SavedStateHandlesVM", r2);
        if (r64 == null) goto L17;
        r64.mo297b();
    L12:
        r63 = r0.mo171a(C1386ex.class);
    L17:
        return (C1386ex) r2;
    L5:
        r62 = C2098jc.f7385b;
        goto L6
    }

    /* JADX INFO: renamed from: A */
    public float mo1251A(View r2) {
        if (f2019m == false) goto L8;
        return AbstractC0660PE.m1318a(r2);
    L6:
        f2019m = false;
    L8:
        return r2.getAlpha();
    }

    /* JADX INFO: renamed from: G */
    public abstract boolean mo865G(float r1);

    /* JADX INFO: renamed from: J */
    public abstract boolean mo866J(View r1);

    /* JADX INFO: renamed from: K */
    public abstract boolean mo867K(float r1, float r2);

    /* JADX INFO: renamed from: O */
    public abstract void mo730O(C0430K r1, C0430K r2);

    /* JADX INFO: renamed from: P */
    public abstract void mo731P(C0430K r1, Thread r2);

    /* JADX INFO: renamed from: Q */
    public void mo1252Q(View r2, float r3) {
        if (f2019m == true) goto L9;
    L7:
        r2.setAlpha(r3);
        return;
    L9:
        AbstractC0660PE.m1319b(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f2019m = false;
        goto L7
    }

    /* JADX INFO: renamed from: R */
    public void mo1253R(View r4, int r5) {
        if (f2021o == false) goto L15;
    L7:
        Field r0 = f2020n;
        if (r0 == null) goto L17;
        int r02 = r0.getInt(r4);     // Catch: IllegalAccessException -> L12
        f2020n.setInt(r4, r5 | (r02 & (-13)));     // Catch: IllegalAccessException -> L12
        return;
    L18:
        return;
    L17:
        return;
    L15:
        Field r1 = View.class.getDeclaredField("mViewFlags");     // Catch: NoSuchFieldException -> L11
        f2020n = r1;     // Catch: NoSuchFieldException -> L11
        r1.setAccessible(true);     // Catch: NoSuchFieldException -> L11
    L6:
        f2021o = true;
        goto L7
    }

    /* JADX INFO: renamed from: S */
    public abstract boolean mo868S(View r1, float r2);

    /* JADX INFO: renamed from: X */
    public abstract void mo869X(ViewGroup.MarginLayoutParams r1, int r2, int r3);

    /* JADX INFO: renamed from: d */
    public abstract int mo870d(ViewGroup.MarginLayoutParams r1);

    /* JADX INFO: renamed from: e */
    public abstract float mo871e(int r1);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo732f(AbstractFutureC0473L r1, C0301H r2);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo733g(AbstractFutureC0473L r1, Object r2, Object r3);

    /* JADX INFO: renamed from: h */
    public abstract boolean mo734h(AbstractFutureC0473L r1, C0430K r2, C0430K r3);

    /* JADX INFO: renamed from: q */
    public abstract int mo872q();

    /* JADX INFO: renamed from: r */
    public abstract int mo873r();

    /* JADX INFO: renamed from: s */
    public abstract int mo874s();

    /* JADX INFO: renamed from: t */
    public abstract int mo875t();

    /* JADX INFO: renamed from: w */
    public abstract int mo876w(View r1);

    /* JADX INFO: renamed from: x */
    public abstract int mo877x(CoordinatorLayout r1);

    /* JADX INFO: renamed from: z */
    public abstract int mo878z();
}
