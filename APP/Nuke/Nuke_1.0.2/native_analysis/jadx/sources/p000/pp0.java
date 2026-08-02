package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pp0 {

    /* JADX INFO: renamed from: a */
    public static final C0402kw f8432a = new C0402kw(-228120187, false, new C0558ow(8));

    /* JADX INFO: renamed from: b */
    public static final C0402kw f8433b = new C0402kw(1963610818, false, new C0558ow(9));

    /* JADX INFO: renamed from: c */
    public static final h70 f8434c = new h70(1.0f, 1.0f);

    /* JADX INFO: renamed from: d */
    public static final qd3 f8435d = new qd3(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: e */
    public static final qd3 f8436e = new qd3(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: f */
    public static final qd3 f8437f = new qd3(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: g */
    public static final qd3 f8438g = new qd3(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: h */
    public static final float[] f8439h = {0.964212f, 1.0f, 0.825188f};

    /* JADX INFO: renamed from: i */
    public static final hh1 f8440i;

    /* JADX INFO: renamed from: j */
    public static final hh1 f8441j;

    /* JADX INFO: renamed from: k */
    public static sx0 f8442k = null;

    /* JADX INFO: renamed from: l */
    public static boolean f8443l = false;

    /* JADX INFO: renamed from: m */
    public static Method f8444m;

    static {
        int i = 19;
        f8440i = new hh1(i, "NONE");
        f8441j = new hh1(i, "PENDING");
    }

    /* JADX INFO: renamed from: A */
    public static void m3889A(bi0 bi0Var, C0158e9 c0158e9, byte b, String str, int i) {
        HashMap map = bi0Var.f872f;
        if (b == 1) {
            byte[] bArr = (byte[]) c0158e9.f2354k;
            int i2 = c0158e9.f2352i;
            c0158e9.f2352i = i2 + 1;
            map.put(str, new C0675rz(i, bArr[i2] == 1));
            return;
        }
        if (b == 2) {
            map.put(str, new C0791uz(i, c0158e9.m1301h()));
            return;
        }
        if (b == 3) {
            map.put(str, new C0754tz(Float.intBitsToFloat(c0158e9.m1301h()), i));
            return;
        }
        if (b == 4) {
            long jM1302i = c0158e9.m1302i(c0158e9.f2352i);
            c0158e9.f2352i += 8;
            map.put(str, new C0828vz(jM1302i, i));
            return;
        }
        long jM1302i2 = c0158e9.m1302i(c0158e9.f2352i);
        c0158e9.f2352i += 8;
        double dLongBitsToDouble = Double.longBitsToDouble(jM1302i2);
        C0713sz c0713sz = new C0713sz();
        c0713sz.f9291a = i;
        c0713sz.f10434b = dLongBitsToDouble;
        map.put(str, c0713sz);
    }

    /* JADX INFO: renamed from: B */
    public static void m3890B(bi0 bi0Var, C0158e9 c0158e9, byte b, String str, int i, int i2, byte b2) throws Exception {
        Object objM1304k;
        byte b3 = b;
        HashMap map = bi0Var.f872f;
        boolean z = b3 == 9 || b3 == 10 || b3 == 11;
        int iM1301h = z ? c0158e9.m1301h() : c0158e9.m1303j() & 65535;
        int i3 = z ? 4 : 2;
        boolean z2 = (b2 & 64) != 0;
        if (z2 && iM1301h != 32) {
            C0676s.m4653l("name size not match");
            return;
        }
        switch (b3) {
            case 9:
                b3 = 6;
                break;
            case 10:
                b3 = 7;
                break;
            case 11:
                b3 = 8;
                break;
        }
        if (b3 == 6) {
            map.put(str, new C0904xz(i2, i + i3, z2 ? c0158e9.m1304k(iM1301h) : c0158e9.m1304k(iM1301h), iM1301h, z2));
            return;
        }
        if (b3 == 7) {
            if (z2) {
                objM1304k = c0158e9.m1304k(iM1301h);
            } else {
                c0158e9.getClass();
                objM1304k = new byte[iM1301h];
                System.arraycopy((byte[]) c0158e9.f2354k, c0158e9.f2352i, objM1304k, 0, iM1301h);
                c0158e9.f2352i += iM1301h;
            }
            map.put(str, new C0598pz(i2, i + i3, objM1304k, iM1301h, z2));
            return;
        }
        if (z2) {
            map.put(str, new C0865wz(i2, i + i3, c0158e9.m1304k(iM1301h), iM1301h, true));
            return;
        }
        C0158e9 c0158e92 = bi0Var.f874h;
        byte[] bArr = (byte[]) c0158e92.f2354k;
        int i4 = c0158e92.f2352i;
        c0158e92.f2352i = i4 + 1;
        int i5 = bArr[i4] & 255;
        String strM1304k = c0158e92.m1304k(i5);
        ov2 ov2Var = (ov2) bi0Var.f869c.get(strM1304k);
        int i6 = iM1301h - (i5 + 1);
        if (i6 < 0) {
            throw new Exception("parse dara failed");
        }
        if (ov2Var != null) {
            try {
                map.put(str, new C0865wz(i2, i + 2, ov2.m3644a((byte[]) c0158e92.f2354k, c0158e92.f2352i, i6), iM1301h, false));
            } catch (Exception e) {
                Log.e("FastKV", bi0Var.f868b, e);
            }
        } else {
            s11.m4664I(bi0Var, "object with tag: " + strM1304k + " without encoder");
        }
        c0158e9.f2352i = i + i3 + iM1301h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        throw new java.lang.Exception("parse dara failed");
     */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m3891C(bi0 bi0Var, boolean z) {
        int iM1301h;
        bi0 bi0Var2;
        if (z) {
            s11.m4664I(bi0Var, "miss cipher");
            return false;
        }
        C0158e9 c0158e9 = bi0Var.f874h;
        String str = bi0Var.f868b;
        c0158e9.f2352i = 12;
        while (true) {
            try {
                int i = c0158e9.f2352i;
                int i2 = bi0Var.f870d;
                boolean z2 = true;
                if (i >= i2) {
                    if (i == i2) {
                        return true;
                    }
                    Log.e("FastKV", str, new Exception("parse dara failed"));
                    return false;
                }
                byte[] bArr = (byte[]) c0158e9.f2354k;
                int i3 = i + 1;
                c0158e9.f2352i = i3;
                byte b = bArr[i];
                byte b2 = (byte) (b & 63);
                if (b2 < 1 || b2 > 11) {
                    break;
                }
                int i4 = i + 2;
                c0158e9.f2352i = i4;
                int i5 = bArr[i3] & 255;
                if (i5 == 0) {
                    throw new IllegalStateException("invalid key size");
                }
                if (b < 0) {
                    c0158e9.f2352i = i4 + i5;
                    if (b2 <= 5) {
                        iM1301h = bi0.f865y[b2];
                    } else {
                        if (b2 != 9 && b2 != 10 && b2 != 11) {
                            z2 = false;
                        }
                        iM1301h = z2 ? c0158e9.m1301h() : c0158e9.m1303j() & 65535;
                    }
                    int i6 = c0158e9.f2352i + iM1301h;
                    c0158e9.f2352i = i6;
                    bi0Var.f879m = (i6 - i) + bi0Var.f879m;
                    ArrayList arrayList = bi0Var.f880n;
                    nm2 nm2Var = new nm2();
                    nm2Var.f7259h = i;
                    nm2Var.f7260i = i6;
                    arrayList.add(nm2Var);
                } else {
                    String strM1304k = c0158e9.m1304k(i5);
                    int i7 = c0158e9.f2352i;
                    if (b2 <= 5) {
                        m3889A(bi0Var, c0158e9, b2, strM1304k, i7);
                        bi0Var2 = bi0Var;
                    } else {
                        bi0Var2 = bi0Var;
                        m3890B(bi0Var2, c0158e9, b2, strM1304k, i7, i, b);
                    }
                    bi0Var = bi0Var2;
                }
            } catch (Exception e) {
                Log.e("FastKV", str, e);
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x029a, code lost:
    
        p000.C0676s.m4651j("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x029d, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010a, code lost:
    
        r25 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
    
        if (r5 == r26.length()) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0116, code lost:
    
        if (r2 == '+') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0118, code lost:
    
        if (r2 == '-') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011a, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011c, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0120, code lost:
    
        if (r5 == (r23 + r2)) goto L195;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0199 A[LOOP:7: B:106:0x0197->B:107:0x0199, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0172  */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m3892D(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int iMin;
        int i7;
        int i8;
        int i9;
        int i10;
        double d;
        long jM1870R;
        char cCharAt;
        int i11;
        char cCharAt2;
        int i12;
        int i13;
        char cCharAt3;
        if (str.length() == 0) {
            C0676s.m4651j("The string is empty");
            return 0L;
        }
        char cCharAt4 = str.charAt(0);
        int i14 = 1;
        char c = '-';
        char c2 = '+';
        if (cCharAt4 != '+') {
            i2 = cCharAt4 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            C0676s.m4651j("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            C0676s.m4651j("");
            return 0L;
        }
        int i15 = i2 + 1;
        if (i15 == str.length()) {
            C0676s.m4651j("");
            return 0L;
        }
        int i16 = 0;
        ed0 ed0Var = null;
        long jM4262q = 0;
        long j2 = 0;
        while (i15 < str.length()) {
            char cCharAt5 = str.charAt(i15);
            if (cCharAt5 != 'T') {
                xc1 xc1Var = xc1.f12960c;
                int i17 = i14;
                char cCharAt6 = str.charAt(i15);
                if (cCharAt6 == c2) {
                    i3 = i15 + 1;
                } else {
                    if (cCharAt6 == c) {
                        i3 = i15 + 1;
                        i4 = -1;
                        while (i3 < str.length() && str.charAt(i3) == '0') {
                            i3++;
                        }
                        j = 0;
                        while (true) {
                            if (i3 >= str.length()) {
                                char cCharAt7 = str.charAt(i3);
                                i5 = i15;
                                if ('0' <= cCharAt7 && cCharAt7 < ':') {
                                    i12 = cCharAt7 - '0';
                                    i13 = i;
                                    long j3 = xc1Var.f12961a;
                                    if (j <= j3 && (j != j3 || i12 <= xc1Var.f12962b)) {
                                        j = (j << 3) + (j << i17) + ((long) i12);
                                        i3++;
                                        i15 = i5;
                                        xc1Var = xc1Var;
                                        i = i13;
                                    }
                                }
                            } else {
                                i5 = i15;
                            }
                        }
                        int i18 = i13;
                        while (i3 < str.length() && '0' <= (cCharAt3 = str.charAt(i3)) && cCharAt3 < ':') {
                            i3++;
                        }
                        if (i3 != str.length()) {
                            if (i3 != i5 + ((cCharAt5 == '+' || cCharAt5 == '-') ? i17 : 0)) {
                                j = 4611686018427387903L;
                                long j4 = j;
                                char cCharAt8 = str.charAt(i3);
                                ed0 ed0Var2 = ed0.SECONDS;
                                if (cCharAt8 == '.') {
                                    int i19 = i3 + 1;
                                    int iMin2 = Math.min(i3 + 7, str.length());
                                    int i20 = 0;
                                    for (int i21 = i19; i21 < iMin2; i21++) {
                                        char cCharAt9 = str.charAt(i21);
                                        if ('0' > cCharAt9 || cCharAt9 >= ':') {
                                            for (i6 = 0; i6 < 6 - (i21 - i19); i6++) {
                                                i20 = (i20 << 1) + (i20 << 3);
                                            }
                                            iMin = Math.min(i21 + 9, str.length());
                                            i7 = i21;
                                            i8 = 0;
                                            while (true) {
                                                if (i7 >= iMin) {
                                                    i11 = iMin;
                                                    cCharAt2 = str.charAt(i7);
                                                    i9 = i7;
                                                    if ('0' <= cCharAt2 && cCharAt2 < ':') {
                                                        i8 = (cCharAt2 - '0') + (i8 << 3) + (i8 << 1);
                                                        i7 = i9 + 1;
                                                        iMin = i11;
                                                    }
                                                } else {
                                                    i9 = i7;
                                                }
                                            }
                                            for (i10 = 0; i10 < 9 - (i9 - i21); i10++) {
                                                i8 = (i8 << 1) + (i8 << 3);
                                            }
                                            i3 = i9;
                                            while (i3 < str.length() && '0' <= (cCharAt = str.charAt(i3)) && cCharAt < ':') {
                                                i3++;
                                            }
                                            if (i3 != i19 || i3 == str.length() || str.charAt(i3) != 'S') {
                                                C0676s.m4651j("");
                                                return 0L;
                                            }
                                            long j5 = (((long) i20) * 1000000000) + ((long) i8);
                                            long j6 = i4;
                                            double d2 = j5;
                                            switch (ed0Var2.ordinal()) {
                                                case 0:
                                                    d = 1.0E-15d;
                                                    jM1870R = gf1.m1870R(d2 * d);
                                                    break;
                                                case 1:
                                                    d = 1.0E-12d;
                                                    jM1870R = gf1.m1870R(d2 * d);
                                                    break;
                                                case 2:
                                                    d = 1.0E-9d;
                                                    jM1870R = gf1.m1870R(d2 * d);
                                                    break;
                                                case 3:
                                                    d = 1.0E-6d;
                                                    jM1870R = gf1.m1870R(d2 * d);
                                                    break;
                                                case 4:
                                                    d = 6.0E-5d;
                                                    jM1870R = gf1.m1870R(d2 * d);
                                                    break;
                                                case 5:
                                                    d = 0.0036d;
                                                    jM1870R = gf1.m1870R(d2 * d);
                                                    break;
                                                case AIChatConfig.DefaultContextRounds /* 6 */:
                                                    d = 0.0864d;
                                                    jM1870R = gf1.m1870R(d2 * d);
                                                    break;
                                                default:
                                                    c80.m677u("Unknown unit: ", ed0Var2);
                                                    jM1870R = 0;
                                                    break;
                                            }
                                            j2 = jM1870R * j6;
                                        } else {
                                            i20 = (cCharAt9 - '0') + (i20 << 3) + (i20 << 1);
                                        }
                                    }
                                    while (i6 < 6 - (i21 - i19)) {
                                    }
                                    iMin = Math.min(i21 + 9, str.length());
                                    i7 = i21;
                                    i8 = 0;
                                    while (true) {
                                        if (i7 >= iMin) {
                                        }
                                        i8 = (cCharAt2 - '0') + (i8 << 3) + (i8 << 1);
                                        i7 = i9 + 1;
                                        iMin = i11;
                                    }
                                    while (i10 < 9 - (i9 - i21)) {
                                    }
                                    i3 = i9;
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i19) {
                                    }
                                    C0676s.m4651j("");
                                    return 0L;
                                }
                                char cCharAt10 = str.charAt(i3);
                                ed0 ed0Var3 = ed0.DAYS;
                                if (cCharAt10 == 'D') {
                                    ed0Var2 = ed0Var3;
                                } else if (cCharAt10 == 'H') {
                                    ed0Var2 = ed0.HOURS;
                                } else if (cCharAt10 == 'M') {
                                    ed0Var2 = ed0.MINUTES;
                                } else if (cCharAt10 != 'S') {
                                    ed0Var2 = null;
                                }
                                if (ed0Var2 == null) {
                                    throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                }
                                if (ed0Var != null && ed0Var.compareTo(ed0Var2) <= 0) {
                                    C0676s.m4651j("Unexpected order of duration components");
                                    return 0L;
                                }
                                if (ed0Var2 == ed0Var3) {
                                    if (i16 != 0) {
                                        C0676s.m4651j("");
                                        return 0L;
                                    }
                                    jM4262q = qp0.m4262q(j4, ed0Var2) * ((long) i4);
                                } else {
                                    if (i16 == 0) {
                                        C0676s.m4651j("");
                                        return 0L;
                                    }
                                    long jM3914l = m3914l(jM4262q, qp0.m4262q(j4, ed0Var2) * ((long) i4));
                                    if (jM3914l == 9223372036854759646L) {
                                        C0676s.m4651j("");
                                        return 0L;
                                    }
                                    jM4262q = jM3914l;
                                }
                                i15 = i3 + 1;
                                ed0Var = ed0Var2;
                                i14 = i17;
                                i = i18;
                                c = '-';
                                c2 = '+';
                            }
                        }
                        C0676s.m4651j("");
                        return 0L;
                    }
                    i3 = i15;
                }
                i4 = i17;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 >= str.length()) {
                    }
                    j = (j << 3) + (j << i17) + ((long) i12);
                    i3++;
                    i15 = i5;
                    xc1Var = xc1Var;
                    i = i13;
                }
                int i182 = i13;
                while (i3 < str.length()) {
                    i3++;
                }
                if (i3 != str.length()) {
                }
                C0676s.m4651j("");
                return 0L;
            }
            if (i16 != 0 || (i15 = i15 + 1) == str.length()) {
                C0676s.m4651j("");
                return 0L;
            }
            i16 = i14;
        }
        int i22 = i;
        long jM134e = ad0.m134e(m3895G(jM4262q, ed0.MILLISECONDS), m3895G(j2, ed0.NANOSECONDS));
        return (i22 == 0 || jM134e == ad0.f158l) ? jM134e : ad0.m136g(jM134e);
    }

    /* JADX INFO: renamed from: E */
    public static final uh1 m3893E(uh1 uh1Var, float f) {
        return (f == 1.0f && f == 1.0f) ? uh1Var : AbstractC0731te.m5185N(uh1Var, f, f, 0.0f, null, 524284);
    }

    /* JADX INFO: renamed from: F */
    public static final int m3894F(qm2 qm2Var, int i) {
        int i2;
        int[] iArr = qm2Var.f9044m;
        int i3 = i + 1;
        int length = qm2Var.f9043l.length;
        iArr.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    /* JADX INFO: renamed from: G */
    public static final long m3895G(long j, ed0 ed0Var) {
        TimeUnit timeUnit = ed0Var.f2398h;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            C0953z8 c0953z8 = ad0.f155i;
            long j2 = jConvert2 << 1;
            int i = cd0.f1486a;
            return j2;
        }
        if (ed0Var.compareTo(ed0.MILLISECONDS) < 0) {
            return m3920r(ci0.m780E(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return m3920r(qp0.m4262q(Math.abs(j), ed0Var) * jSignum);
    }

    /* JADX INFO: renamed from: H */
    public static final void m3896H(List list, C0915y9 c0915y9) {
        Path path;
        int i;
        float f;
        int i2;
        qy1 qy1Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        C0915y9 c0915y92 = c0915y9;
        Path path2 = c0915y92.f13365a;
        Path path3 = c0915y92.f13365a;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path3.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path3.setFillType(fillType2);
        qy1 qy1Var2 = list2.isEmpty() ? yx1.f13662c : (qy1) list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i3 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i3 < size) {
            qy1 qy1Var3 = (qy1) list2.get(i3);
            if (qy1Var3 instanceof yx1) {
                path3.close();
                path = path3;
                i = size;
                f = f11;
                i2 = i3;
                qy1Var = qy1Var3;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (qy1Var3 instanceof ky1) {
                    ky1 ky1Var = (ky1) qy1Var3;
                    float f18 = ky1Var.f5849c;
                    f14 += f18;
                    float f19 = ky1Var.f5850d;
                    f15 += f19;
                    path3.rMoveTo(f18, f19);
                    path = path3;
                    i = size;
                    f = f11;
                    i2 = i3;
                    f16 = f14;
                    f17 = f15;
                } else {
                    if (qy1Var3 instanceof cy1) {
                        cy1 cy1Var = (cy1) qy1Var3;
                        float f20 = cy1Var.f1775c;
                        float f21 = cy1Var.f1776d;
                        path3.moveTo(f20, f21);
                        f15 = f21;
                        f17 = f15;
                        path = path3;
                        f14 = f20;
                        f16 = f14;
                    } else {
                        if (qy1Var3 instanceof jy1) {
                            jy1 jy1Var = (jy1) qy1Var3;
                            float f22 = jy1Var.f5276d;
                            float f23 = jy1Var.f5275c;
                            path3.rLineTo(f23, f22);
                            f14 += f23;
                            f15 += f22;
                        } else if (qy1Var3 instanceof by1) {
                            by1 by1Var = (by1) qy1Var3;
                            float f24 = by1Var.f1080d;
                            float f25 = by1Var.f1079c;
                            c0915y92.m6233e(f25, f24);
                            f14 = f25;
                            path = path3;
                            f15 = f24;
                        } else if (qy1Var3 instanceof iy1) {
                            float f26 = ((iy1) qy1Var3).f4832c;
                            path3.rLineTo(f26, f11);
                            f14 += f26;
                        } else if (qy1Var3 instanceof ay1) {
                            float f27 = ((ay1) qy1Var3).f443c;
                            c0915y92.m6233e(f27, f15);
                            f14 = f27;
                        } else if (qy1Var3 instanceof oy1) {
                            float f28 = ((oy1) qy1Var3).f7884c;
                            path3.rLineTo(f11, f28);
                            f15 += f28;
                        } else if (qy1Var3 instanceof py1) {
                            float f29 = ((py1) qy1Var3).f8647c;
                            c0915y92.m6233e(f14, f29);
                            f15 = f29;
                        } else if (qy1Var3 instanceof hy1) {
                            hy1 hy1Var = (hy1) qy1Var3;
                            path3.rCubicTo(hy1Var.f4179c, hy1Var.f4180d, hy1Var.f4181e, hy1Var.f4182f, hy1Var.f4183g, hy1Var.f4184h);
                            Path path4 = path3;
                            float f30 = hy1Var.f4181e + f14;
                            float f31 = hy1Var.f4182f + f15;
                            f14 += hy1Var.f4183g;
                            f15 += hy1Var.f4184h;
                            f13 = f31;
                            path = path4;
                            i = size;
                            f = f11;
                            i2 = i3;
                            qy1Var = qy1Var3;
                            f12 = f30;
                        } else {
                            Path path5 = path3;
                            if (qy1Var3 instanceof zx1) {
                                zx1 zx1Var = (zx1) qy1Var3;
                                c0915y92.m6231c(zx1Var.f14137c, zx1Var.f14138d, zx1Var.f14139e, zx1Var.f14140f, zx1Var.f14141g, zx1Var.f14142h);
                                f5 = zx1Var.f14139e;
                                f6 = zx1Var.f14140f;
                                f7 = zx1Var.f14141g;
                                f8 = zx1Var.f14142h;
                            } else {
                                if (qy1Var3 instanceof my1) {
                                    if (qy1Var2.f9287a) {
                                        f9 = f14 - f12;
                                        f10 = f15 - f13;
                                    } else {
                                        f9 = f11;
                                        f10 = f9;
                                    }
                                    my1 my1Var = (my1) qy1Var3;
                                    path5.rCubicTo(f9, f10, my1Var.f6918c, my1Var.f6919d, my1Var.f6920e, my1Var.f6921f);
                                    path5 = path5;
                                    float f32 = my1Var.f6918c + f14;
                                    float f33 = my1Var.f6919d + f15;
                                    f14 += my1Var.f6920e;
                                    f15 += my1Var.f6921f;
                                    f12 = f32;
                                    f13 = f33;
                                } else if (qy1Var3 instanceof ey1) {
                                    if (qy1Var2.f9287a) {
                                        f14 = (f14 * 2.0f) - f12;
                                        f15 = (2.0f * f15) - f13;
                                    }
                                    ey1 ey1Var = (ey1) qy1Var3;
                                    c0915y9.m6231c(f14, f15, ey1Var.f2681c, ey1Var.f2682d, ey1Var.f2683e, ey1Var.f2684f);
                                    f5 = ey1Var.f2681c;
                                    f6 = ey1Var.f2682d;
                                    f7 = ey1Var.f2683e;
                                    f8 = ey1Var.f2684f;
                                } else {
                                    if (qy1Var3 instanceof ly1) {
                                        ly1 ly1Var = (ly1) qy1Var3;
                                        float f34 = ly1Var.f6403f;
                                        float f35 = ly1Var.f6402e;
                                        float f36 = ly1Var.f6401d;
                                        float f37 = ly1Var.f6400c;
                                        path5.rQuadTo(f37, f36, f35, f34);
                                        f5 = f37 + f14;
                                        f4 = f36 + f15;
                                        f14 += f35;
                                        f15 += f34;
                                    } else if (qy1Var3 instanceof dy1) {
                                        dy1 dy1Var = (dy1) qy1Var3;
                                        float f38 = dy1Var.f2262f;
                                        float f39 = dy1Var.f2261e;
                                        f4 = dy1Var.f2260d;
                                        f5 = dy1Var.f2259c;
                                        path5.quadTo(f5, f4, f39, f38);
                                        f15 = f38;
                                        f14 = f39;
                                    } else if (qy1Var3 instanceof ny1) {
                                        if (qy1Var2.f9288b) {
                                            f2 = f14 - f12;
                                            f3 = f15 - f13;
                                        } else {
                                            f2 = f11;
                                            f3 = f2;
                                        }
                                        ny1 ny1Var = (ny1) qy1Var3;
                                        float f40 = ny1Var.f7368d;
                                        float f41 = ny1Var.f7367c;
                                        path5.rQuadTo(f2, f3, f41, f40);
                                        float f42 = f2 + f14;
                                        float f43 = f3 + f15;
                                        f14 += f41;
                                        f15 += f40;
                                        f12 = f42;
                                        f13 = f43;
                                    } else if (qy1Var3 instanceof fy1) {
                                        if (qy1Var2.f9288b) {
                                            f14 = (f14 * 2.0f) - f12;
                                            f15 = (2.0f * f15) - f13;
                                        }
                                        fy1 fy1Var = (fy1) qy1Var3;
                                        float f44 = fy1Var.f3196d;
                                        float f45 = fy1Var.f3195c;
                                        path5.quadTo(f14, f15, f45, f44);
                                        path = path5;
                                        i = size;
                                        f = f11;
                                        i2 = i3;
                                        f12 = f14;
                                        f13 = f15;
                                        qy1Var = qy1Var3;
                                        f14 = f45;
                                        f15 = f44;
                                    } else if (qy1Var3 instanceof gy1) {
                                        gy1 gy1Var = (gy1) qy1Var3;
                                        float f46 = gy1Var.f3741h + f14;
                                        float f47 = gy1Var.f3742i + f15;
                                        i = size;
                                        i2 = i3;
                                        path = path5;
                                        f = 0.0f;
                                        m3919q(c0915y9, f14, f15, f46, f47, gy1Var.f3736c, gy1Var.f3737d, gy1Var.f3738e, gy1Var.f3739f, gy1Var.f3740g);
                                        f12 = f46;
                                        f14 = f12;
                                        f13 = f47;
                                        f15 = f13;
                                        qy1Var = qy1Var3;
                                    } else {
                                        path = path5;
                                        i = size;
                                        f = f11;
                                        i2 = i3;
                                        if (!(qy1Var3 instanceof xx1)) {
                                            c80.m675s();
                                            return;
                                        }
                                        xx1 xx1Var = (xx1) qy1Var3;
                                        float f48 = xx1Var.f13226i;
                                        float f49 = xx1Var.f13225h;
                                        qy1Var = qy1Var3;
                                        m3919q(c0915y9, f14, f15, f49, f48, xx1Var.f13220c, xx1Var.f13221d, xx1Var.f13222e, xx1Var.f13223f, xx1Var.f13224g);
                                        f13 = f48;
                                        f15 = f13;
                                        f12 = f49;
                                        f14 = f12;
                                    }
                                    f13 = f4;
                                    path = path5;
                                    i = size;
                                    f = f11;
                                    i2 = i3;
                                    qy1Var = qy1Var3;
                                    f12 = f5;
                                }
                                path = path5;
                            }
                            f13 = f6;
                            f14 = f7;
                            f15 = f8;
                            path = path5;
                            i = size;
                            f = f11;
                            i2 = i3;
                            qy1Var = qy1Var3;
                            f12 = f5;
                        }
                        path = path3;
                    }
                    i = size;
                    f = f11;
                    i2 = i3;
                }
                qy1Var = qy1Var3;
            }
            i3 = i2 + 1;
            list2 = list;
            c0915y92 = c0915y9;
            path3 = path;
            size = i;
            qy1Var2 = qy1Var;
            f11 = f;
        }
    }

    /* JADX INFO: renamed from: I */
    public static String m3897I(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: J */
    public static String m3898J(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: K */
    public static String m3899K(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: L */
    public static String m3900L(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: M */
    public static int m3901M(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: N */
    public static final int m3902N(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    /* JADX INFO: renamed from: a */
    public static final void m3903a(in0 in0Var, uh1 uh1Var, in0 in0Var2, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        ia1 ia1Var;
        e70 e70Var;
        int i3;
        d61 d61Var;
        yy1 yy1Var;
        C0799v6 c0799v6 = C0799v6.f11773v;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-180024211);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1984h(in0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1980f(uh1Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= go0Var.m1984h(c0799v6) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= go0Var.m1984h(in0Var2) ? 16384 : 8192;
        }
        if (go0Var.m1958O(i4 & 1, (i4 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(go0Var.f3614T);
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1Var.mo4491c(qk0.f9012a).mo4491c(ol0.f7721a).mo4491c(ql0.f9023a).mo4491c(ll0.f6186a));
            e70 e70Var2 = (e70) go0Var.m1988j(AbstractC0441ly.f6382h);
            d61 d61Var2 = (d61) go0Var.m1988j(AbstractC0441ly.f6388n);
            yy1 yy1VarM1990l = go0Var.m1990l();
            ia1 ia1Var2 = (ia1) go0Var.m1988j(zb1.f13820a);
            tc2 tc2Var = (tc2) go0Var.m1988j(fc1.f2903a);
            go0Var.m1966W(1314774735);
            int i5 = i4 & 14;
            int iHashCode2 = Long.hashCode(go0Var.f3614T);
            Context context = (Context) go0Var.m1988j(AbstractC0646r7.f9411b);
            eo0 eo0VarM4458L = rg3.m4458L(go0Var);
            fc2 fc2Var = (fc2) go0Var.m1988j(hc2.f3953a);
            View view = (View) go0Var.m1988j(AbstractC0646r7.f9415f);
            boolean zM1984h = go0Var.m1984h(context) | ((((i5 & 14) ^ 6) > 4 && go0Var.m1980f(in0Var)) || (i5 & 6) == 4) | go0Var.m1984h(eo0VarM4458L) | go0Var.m1984h(fc2Var) | go0Var.m1976d(iHashCode2) | go0Var.m1984h(view);
            Object objM1956L = go0Var.m1956L();
            if (zM1984h || objM1956L == C0520nx.f7360a) {
                ia1Var = ia1Var2;
                e70Var = e70Var2;
                i3 = iHashCode;
                d61Var = d61Var2;
                yy1Var = yy1VarM1990l;
                C0456mc c0456mc = new C0456mc(context, in0Var, eo0VarM4458L, fc2Var, iHashCode2, view);
                go0Var.m1981f0(c0456mc);
                objM1956L = c0456mc;
            } else {
                e70Var = e70Var2;
                d61Var = d61Var2;
                yy1Var = yy1VarM1990l;
                i3 = iHashCode;
                ia1Var = ia1Var2;
            }
            xm0 xm0Var = (xm0) objM1956L;
            go0Var.m1962S(125, 1, null, null);
            go0Var.f3633r = true;
            if (go0Var.f3613S) {
                go0Var.m1989k(xm0Var);
            } else {
                go0Var.m1987i0();
            }
            InterfaceC0293hx.f4166c.getClass();
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1Var);
            yf3.m6268c(go0Var, C0419lc.f6045l, uh1VarM5285M);
            yf3.m6268c(go0Var, C0419lc.f6046m, e70Var);
            yf3.m6268c(go0Var, C0419lc.f6047n, ia1Var);
            yf3.m6268c(go0Var, C0419lc.f6048o, tc2Var);
            yf3.m6268c(go0Var, C0419lc.f6049p, d61Var);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(i3));
            yf3.m6268c(go0Var, C0419lc.f6043j, in0Var2);
            yf3.m6268c(go0Var, C0419lc.f6044k, c0799v6);
            go0Var.m1994p(true);
            go0Var.m1994p(false);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0305i8(in0Var, uh1Var, in0Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3904b(in0 in0Var, uh1 uh1Var, in0 in0Var2, InterfaceC0596px interfaceC0596px, int i, int i2) {
        int i3;
        int i4;
        C0799v6 c0799v6 = C0799v6.f11773v;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1783766393);
        if ((i & 48) == 0) {
            i3 = (go0Var.m1980f(uh1Var) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 384;
        } else {
            i4 = i3 | (go0Var.m1984h(in0Var2) ? 256 : 128);
        }
        if (go0Var.m1958O(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                in0Var2 = c0799v6;
            }
            m3903a(in0Var, uh1Var, in0Var2, go0Var, (i4 & 112) | 3078 | ((i4 << 6) & 57344));
        } else {
            go0Var.m1961R();
        }
        in0 in0Var3 = in0Var2;
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0382kc(in0Var, uh1Var, in0Var3, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m3905c(boolean z, final xm0 xm0Var, InterfaceC0596px interfaceC0596px, final int i, final int i2) {
        final boolean z2;
        int i3;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            i3 = (go0Var.m1982g(z2) ? 4 : 2) | i;
        }
        int i5 = i3 | (go0Var.m1984h(xm0Var) ? 32 : 16);
        if (go0Var.m1958O(i5 & 1, (i5 & 19) != 18)) {
            boolean z3 = i4 != 0 ? true : z2;
            Object objM741a = cc1.m741a(go0Var);
            if (objM741a == null) {
                go0Var.m1966W(535274673);
                objM741a = dc1.m990a(go0Var);
            } else {
                go0Var.m1966W(535271790);
            }
            go0Var.m1994p(false);
            if (objM741a == null) {
                C0676s.m4653l("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zM1980f = go0Var.m1980f(objM741a);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (zM1980f || objM1956L == c0160eb) {
                gm1 gm1Var = objM741a instanceof gm1 ? (gm1) objM741a : null;
                fm1 navigationEventDispatcher = gm1Var != null ? gm1Var.getNavigationEventDispatcher() : null;
                pt1 pt1Var = objM741a instanceof pt1 ? (pt1) objM741a : null;
                objM1956L = new C0242gj(navigationEventDispatcher, pt1Var != null ? pt1Var.getOnBackPressedDispatcher() : null);
                go0Var.m1981f0(objM1956L);
            }
            C0242gj c0242gj = (C0242gj) objM1956L;
            long j = go0Var.f3614T;
            boolean zM1980f2 = go0Var.m1980f(c0242gj) | go0Var.m1978e(j);
            Object objM1956L2 = go0Var.m1956L();
            Object obj = objM1956L2;
            if (zM1980f2 || objM1956L2 == c0160eb) {
                C0710sw c0710sw = new C0710sw(new C0279hj(j, objM741a));
                c0710sw.f10385j = new C0074c0(29);
                go0Var.m1981f0(c0710sw);
                obj = c0710sw;
            }
            C0710sw c0710sw2 = (C0710sw) obj;
            go0Var.m1966W(-585307852);
            boolean zM1984h = go0Var.m1984h(c0710sw2) | ((i5 & 112) == 32);
            Object objM1956L3 = go0Var.m1956L();
            if (zM1984h || objM1956L3 == c0160eb) {
                objM1956L3 = new C0640r1(7, c0710sw2, xm0Var);
                go0Var.m1981f0(objM1956L3);
            }
            AbstractC0179eu.m1468r((xm0) objM1956L3, go0Var);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i6 = i5 & 14;
            boolean zM1984h2 = go0Var.m1984h(c0710sw2) | (i6 == 4);
            Object objM1956L4 = go0Var.m1956L();
            if (zM1984h2 || objM1956L4 == c0160eb) {
                objM1956L4 = new C0315ij(c0710sw2, z3, 0);
                go0Var.m1981f0(objM1956L4);
            }
            AbstractC0179eu.m1458h(boolValueOf, c0710sw2, null, (in0) objM1956L4, go0Var, i6);
            boolean zM1984h3 = go0Var.m1984h(c0242gj) | go0Var.m1984h(c0710sw2);
            Object objM1956L5 = go0Var.m1956L();
            if (zM1984h3 || objM1956L5 == c0160eb) {
                objM1956L5 = new C0115d2(5, c0242gj, c0710sw2);
                go0Var.m1981f0(objM1956L5);
            }
            AbstractC0179eu.m1452d(c0242gj, c0710sw2, (in0) objM1956L5, go0Var);
            go0Var.m1994p(false);
            z2 = z3;
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0(z2, xm0Var, i, i2) { // from class: jj

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ boolean f5055h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ xm0 f5056i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ int f5057j;

                {
                    this.f5057j = i2;
                }

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM3902N = pp0.m3902N(1);
                    pp0.m3905c(this.f5055h, this.f5056i, (InterfaceC0596px) obj2, iM3902N, this.f5057j);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m3906d(C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        Object x92Var;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-501639161);
        int i2 = i | 6;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            go0Var.m1966W(-2140895558);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                try {
                    pp1 pp1Var = pp1.f8445a;
                    x92Var = (c73) pp1.m3931c().m3605b(AbstractC0691se.m4815D(c73.Companion.serializer()), null, "ui_config");
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                objM1956L = (c73) (x92Var instanceof x92 ? null : x92Var);
                if (objM1956L == null) {
                    objM1956L = new c73();
                }
                go0Var.m1981f0(objM1956L);
            }
            c73 c73Var = (c73) objM1956L;
            go0Var.m1994p(false);
            boolean zM3596s = op0.m3596s(go0Var);
            c73Var.getClass();
            int i3 = c73Var.f1221a;
            if (i3 == 1) {
                zM3596s = false;
            } else if (i3 == 2) {
                zM3596s = true;
            }
            b73 b73Var = c73Var.f1224d;
            boolean zM1982g = go0Var.m1982g(zM3596s) | go0Var.m1980f(b73Var);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1982g || objM1956L2 == c0160eb) {
                objM1956L2 = AbstractC0570p7.m3756L(b73Var, zM3596s);
                go0Var.m1981f0(objM1956L2);
            }
            lp1 lp1Var = (lp1) objM1956L2;
            z13.m6380a(zM3596s, false, new C0363ju(lp1Var.f6239g), xe1.m6126i0(1304942345, new tt0(lp1Var, c73Var, c0402kw, 4), go0Var), go0Var, 3120);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0524o0(c0402kw, i, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m3907e(ci1 ci1Var, xm0 xm0Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        String strValueOf;
        int i3 = ci1Var.f1571a;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(952038297);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(ci1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(xm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 256 : 128;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            boolean z = i3 == -1;
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (z2 || objM1956L == c0160eb) {
                objM1956L = op0.m3598u(Boolean.valueOf(z));
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            boolean z3 = i4 == 4;
            Object objM1956L2 = go0Var.m1956L();
            if (z3 || objM1956L2 == c0160eb) {
                if (z) {
                    strValueOf = "10000";
                } else {
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    strValueOf = String.valueOf(i3);
                }
                objM1956L2 = op0.m3598u(strValueOf);
                go0Var.m1981f0(objM1956L2);
            }
            xk1 xk1Var2 = (xk1) objM1956L2;
            Integer numM6013e0 = wv2.m6013e0((String) xk1Var2.getValue());
            qp0.m4249d(true, xm0Var, null, rg3.m4462P(R.string.modify_friends_count_config_title, go0Var), null, xe1.m6126i0(665256220, new C0200fe(xm0Var, in0Var, xk1Var, numM6013e0, ((Boolean) xk1Var.getValue()).booleanValue() || numM6013e0 != null, 1), go0Var), xe1.m6126i0(1952799429, new C0746tr(xk1Var, xk1Var2, numM6013e0), go0Var), go0Var, (i2 & 112) | 1769478, 20);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(ci1Var, xm0Var, in0Var, i, 11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final ju2 m3908f(Object obj) {
        if (obj == null) {
            obj = up0.f11397e;
        }
        return new ju2(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: g */
    public static final void m3909g(ep1 ep1Var, uh1 uh1Var, C0402kw c0402kw, C0402kw c0402kw2, InterfaceC0596px interfaceC0596px, int i) {
        Object obj;
        uh1 uh1Var2;
        boolean z;
        uh1 c0289ht;
        ?? r3;
        zo1 zo1Var = zo1.f13995b;
        ep1Var.getClass();
        nx1 nx1Var = ep1Var.f2555h;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1792006350);
        int i2 = i | (go0Var.m1980f(ep1Var) ? 4 : 2) | 48;
        if (go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM1956L = go0Var.m1956L();
            Object obj2 = C0520nx.f7360a;
            if (objM1956L == obj2) {
                objM1956L = op0.m3598u(new rs1(0L));
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            yi0 yi0Var = AbstractC0731te.f10695g;
            Object objM1956L2 = go0Var.m1956L();
            if (objM1956L2 == obj2) {
                objM1956L2 = new C0590pr(xk1Var, 13);
                go0Var.m1981f0(objM1956L2);
            }
            uh1 uh1VarM5053E = t11.m5053E(yi0Var, (in0) objM1956L2);
            C0659rk c0659rk = C0700sn.f10222j;
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(c0659rk, false);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM5053E);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            C0419lc c0419lc = C0256gx.f3730e;
            yf3.m6268c(go0Var, c0419lc, nf1VarM1060d);
            C0419lc c0419lc2 = C0256gx.f3729d;
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C0419lc c0419lc3 = C0256gx.f3731f;
            yf3.m6268c(go0Var, c0419lc3, numValueOf);
            C0799v6 c0799v6 = C0256gx.f3732g;
            yf3.m6267b(go0Var, c0799v6);
            C0419lc c0419lc4 = C0256gx.f3728c;
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M);
            uh1 uh1VarM2219a = C0282hm.m2219a();
            boolean zM1405c = ep1Var.m1405c();
            rh1 rh1Var = rh1.f9587a;
            if (zM1405c) {
                go0Var.m1966W(1625286441);
                Object objM1956L3 = go0Var.m1956L();
                if (objM1956L3 == obj2) {
                    objM1956L3 = new vi1(19);
                    go0Var.m1981f0(objM1956L3);
                }
                AtomicInteger atomicInteger = nn2.f7265a;
                c0289ht = new C0289ht((in0) objM1956L3);
                z = false;
                go0Var.m1994p(false);
            } else {
                z = false;
                go0Var.m1966W(1625371970);
                go0Var.m1994p(false);
                c0289ht = rh1Var;
            }
            uh1 uh1VarMo4491c = uh1VarM2219a.mo4491c(c0289ht);
            nf1 nf1VarM1060d2 = AbstractC0135dm.m1060d(c0659rk, z);
            int iHashCode2 = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l2 = go0Var.m1990l();
            uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, uh1VarMo4491c);
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, c0419lc, nf1VarM1060d2);
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l2);
            vi0.m5698q(iHashCode2, go0Var, c0419lc3, go0Var, c0799v6);
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M2);
            nn0 nn0Var = c0402kw;
            nn0Var.mo489e(C0282hm.f4075a, go0Var, 54);
            go0Var.m1994p(true);
            boolean zM1405c2 = ep1Var.m1405c();
            a83 a83Var = a83.f116a;
            if (zM1405c2) {
                go0Var.m1966W(1625550406);
                AbstractC0135dm.m1057a(vw2.m5804a(C0282hm.m2219a(), a83Var, zo1Var), go0Var, 0);
                long jM4611d = rs1.m4609b(((rs1) nx1Var.getValue()).f9744a, 0L) ? 0L : rs1.m4611d(((rs1) nx1Var.getValue()).f9744a, ((rs1) xk1Var.getValue()).f9744a);
                boolean z2 = (i2 & 14) == 4;
                Object objM1956L4 = go0Var.m1956L();
                if (z2 || objM1956L4 == obj2) {
                    objM1956L4 = new C0727ta(16, ep1Var);
                    go0Var.m1981f0(objM1956L4);
                }
                m3910h((xm0) objM1956L4, jM4611d, C0282hm.m2219a(), c0402kw2, go0Var, 3072);
                r3 = 0;
                go0Var.m1994p(false);
            } else {
                r3 = 0;
                go0Var.m1966W(1626123162);
                go0Var.m1994p(false);
            }
            if (((Boolean) ep1Var.f2558k.getValue()).booleanValue()) {
                go0Var.m1966W(1626163772);
                AbstractC0135dm.m1057a(vw2.m5804a(C0282hm.m2219a(), a83Var, zo1Var), go0Var, r3);
                go0Var.m1994p(r3);
            } else {
                go0Var.m1966W(1626315610);
                go0Var.m1994p(r3);
            }
            go0Var.m1994p(true);
            uh1Var2 = rh1Var;
            obj = nn0Var;
        } else {
            obj = c0402kw;
            go0Var.m1961R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0794v1(ep1Var, uh1Var2, obj, c0402kw2, i, 8);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m3910h(final xm0 xm0Var, final long j, final uh1 uh1Var, final C0402kw c0402kw, InterfaceC0596px interfaceC0596px, final int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-928246840);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1984h(xm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1978e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1980f(uh1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 2048 : 1024;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = op0.m3598u(new h11(0L));
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            uh1 uh1VarMo4491c = uh1Var.mo4491c(AbstractC0731te.f10695g);
            Object objM1956L2 = go0Var.m1956L();
            if (objM1956L2 == c0160eb) {
                objM1956L2 = new C0590pr(xk1Var, 14);
                go0Var.m1981f0(objM1956L2);
            }
            uh1 uh1VarM1859G = gf1.m1859G(uh1VarMo4491c, (in0) objM1956L2);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objM1956L3 = go0Var.m1956L();
            if (z || objM1956L3 == c0160eb) {
                objM1956L3 = new wo1(j, xm0Var, xk1Var);
                go0Var.m1981f0(objM1956L3);
            }
            uh1 uh1VarM5183L = AbstractC0731te.m5183L(uh1VarM1859G, (in0) objM1956L3);
            int i3 = i2 & 7168;
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, false);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM5183L);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            c0402kw.mo489e(C0282hm.f4075a, go0Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0() { // from class: xo1
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pp0.m3910h(xm0Var, j, uh1Var, c0402kw, (InterfaceC0596px) obj, pp0.m3902N(i | 1));
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: i */
    public static final C0611q9 m3911i() {
        return new C0611q9(new Paint(7));
    }

    /* JADX INFO: renamed from: j */
    public static final View m3912j(th1 th1Var) {
        ab3 ab3Var = sp0.m4933c0(th1Var.f10757h).f9398v;
        View interopView = ab3Var != null ? ab3Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        C0676s.m4653l("Could not fetch interop view");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static final ab3 m3913k(r61 r61Var) {
        ab3 ab3Var = r61Var.f9398v;
        if (ab3Var != null) {
            return ab3Var;
        }
        throw vi0.m5686e("Required value was null.");
    }

    /* JADX INFO: renamed from: l */
    public static final long m3914l(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : ci0.m780E(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX INFO: renamed from: m */
    public static nu0 m3915m(vu0 vu0Var) {
        Context context = up0.f11401i;
        if (context == null) {
            t11.m5067S("hostContext");
            throw null;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            str.getClass();
            Context context2 = up0.f11401i;
            if (context2 == null) {
                t11.m5067S("hostContext");
                throw null;
            }
            try {
                return new nu0(str, context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode, m3927y(vu0Var), vu0Var.ordinal());
            } catch (Throwable unused) {
                C0676s.m4650i("Can not get PackageInfo!");
                return null;
            }
        } catch (Throwable unused2) {
            C0676s.m4650i("Can not get PackageInfo!");
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m3916n(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                fg1.m1638m(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static final qy2 m3917o(t60 t60Var) {
        bz2 bz2Var;
        oy2 oy2Var = new oy2();
        tb3.m5157c(t60Var, sy2.f10433a, new xq2(new xq2(5, oy2Var), new C0151e2(1, oy2Var, oy2.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 7)));
        lk1 lk1Var = new lk1();
        lk1 lk1Var2 = oy2Var.f7885a;
        Object[] objArr = lk1Var2.f6163a;
        int i = lk1Var2.f6164b;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        py2 py2Var = null;
        while (true) {
            bz2Var = bz2.f1088b;
            if (i3 >= i) {
                break;
            }
            py2 py2Var2 = (py2) objArr[i3];
            if (!z || py2Var2 != bz2Var) {
                if (py2Var2 == bz2Var && py2Var == bz2Var) {
                    z = false;
                    break;
                    break;
                }
                if (py2Var2 != bz2Var) {
                    lk1 lk1Var3 = oy2Var.f7886b;
                    Object[] objArr2 = lk1Var3.f6163a;
                    int i4 = lk1Var3.f6164b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (!((Boolean) ((in0) objArr2[i5]).mo5j(py2Var2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                lk1Var.m2925a(py2Var2);
                z = false;
                py2Var = py2Var2;
            }
            i3++;
        }
        if (((py2) (lk1Var.m2932h() ? null : lk1Var.f6163a[lk1Var.f6164b - 1])) == bz2Var) {
            lk1Var.m2935k(lk1Var.f6164b - 1);
        }
        jk1 jk1Var = lk1Var.f6165c;
        if (jk1Var == null) {
            jk1Var = new jk1(i2, lk1Var);
            lk1Var.f6165c = jk1Var;
        }
        return new qy2(jk1Var);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m3918p(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        int i = wa3.f12444a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = va3.f11868d;
            va3 va3Var = (va3) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (va3Var == null) {
                va3Var = new va3();
                va3Var.f11869a = null;
                va3Var.f11870b = null;
                va3Var.f11871c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, va3Var);
            }
            WeakReference weakReference2 = va3Var.f11871c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                va3Var.f11871c = new WeakReference(keyEvent);
                if (va3Var.f11870b == null) {
                    va3Var.f11870b = new SparseArray();
                }
                SparseArray sparseArray = va3Var.f11870b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    c80.m664g();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static final void m3919q(C0915y9 c0915y9, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            m3919q(c0915y9, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan22 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan22 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            c0915y9.m6231c((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            d = d41;
            i++;
            d32 = d32;
            dSin2 = dSin2;
            d26 = d26;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final long m3920r(long j) {
        long j2 = (j << 1) + 1;
        ad0.f155i.getClass();
        int i = cd0.f1486a;
        return j2;
    }

    /* JADX INFO: renamed from: s */
    public static C0211fp m3921s(int i) {
        um0 um0Var = um0.f11361k;
        float fM4453G = rg3.m4453G((i >> 16) & 255);
        float fM4453G2 = rg3.m4453G((i >> 8) & 255);
        float fM4453G3 = rg3.m4453G(i & 255);
        double[][] dArr = rg3.f9562d;
        double d = fM4453G;
        double[] dArr2 = dArr[0];
        double d2 = fM4453G2;
        double d3 = fM4453G3;
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d4, (float) d5, (float) ((d3 * dArr4[2]) + (d2 * dArr4[1]) + (d * dArr4[0]))};
        float[][] fArr2 = rg3.f9559a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float[] fArr6 = um0Var.f11368g;
        float f9 = um0Var.f11366e;
        float f10 = um0Var.f11363b;
        float f11 = fArr6[0] * f6;
        float f12 = fArr6[1] * f7;
        float f13 = fArr6[2] * f8;
        float f14 = um0Var.f11369h;
        float fPow = (float) Math.pow((Math.abs(f11) * f14) / 100.0f, 0.41999998688697815d);
        float fPow2 = (float) Math.pow((Math.abs(f12) * f14) / 100.0f, 0.41999998688697815d);
        float fPow3 = (float) Math.pow((Math.abs(f13) * f14) / 100.0f, 0.41999998688697815d);
        float fSignum = ((Math.signum(f11) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f12) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f13) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        float f15 = ((((-12.0f) * fSignum2) + (fSignum * 11.0f)) + fSignum3) / 11.0f;
        float f16 = ((fSignum + fSignum2) - (fSignum3 * 2.0f)) / 9.0f;
        float f17 = fSignum2 * 20.0f;
        float f18 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f17)) / 20.0f;
        float f19 = (((fSignum * 40.0f) + f17) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f16, f15)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f20 = fAtan2;
        float f21 = (f20 * 3.1415927f) / 180.0f;
        float fPow4 = ((float) Math.pow((f19 * um0Var.f11364c) / f10, um0Var.f11371j * f9)) * 100.0f;
        float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f20) < 20.14d ? 360.0f + f20 : f20) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * um0Var.f11367f) * um0Var.f11365d) * ((float) Math.sqrt((f16 * f16) + (f15 * f15)))) / (f18 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, um0Var.f11362a)), 0.7300000190734863d)) * ((float) Math.sqrt(fPow4 / 100.0f));
        float f22 = um0Var.f11370i * fPow5;
        Math.sqrt((r2 * f9) / (f10 + 4.0f));
        float f23 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f21;
        return new C0211fp(f20, fPow5, fPow4, f23, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    /* JADX INFO: renamed from: t */
    public static C0211fp m3922t(float f, float f2, float f3) {
        float f4 = um0.f11361k.f11370i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(((double) f) / 100.0d))) * r0.f11366e) / (r0.f11363b + 4.0f));
        float f5 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f4) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new C0211fp(f3, f2, f, f5, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* JADX INFO: renamed from: u */
    public static String m3923u(vu0 vu0Var) {
        Context context = up0.f11401i;
        if (context == null) {
            t11.m5067S("hostContext");
            throw null;
        }
        String str = up0.f11404l;
        if (str == null) {
            t11.m5067S("moduleApkPath");
            throw null;
        }
        File file = new File(str);
        String str2 = "NukeModuleSign{moduleVersionName = 1.0.2(release), moduleVersionCode = 234, buildTime = 1785243782422, apkLength = " + file.length() + ", apkLastModified = " + file.lastModified() + "}";
        if (yp1.f13554a[vu0Var.ordinal()] != 1) {
            try {
                String str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                str3.getClass();
                try {
                    int i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    StringBuilder sbM5696o = vi0.m5696o("NukeDexCacheSumSign{module = ", str2, ", versionName = ", str3, ", versionCode = ");
                    sbM5696o.append(i);
                    sbM5696o.append("}");
                    return sbM5696o.toString();
                } catch (Throwable unused) {
                    C0676s.m4650i("Can not get PackageInfo!");
                    return null;
                }
            } catch (Throwable unused2) {
                C0676s.m4650i("Can not get PackageInfo!");
                return null;
            }
        }
        try {
            String str4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            str4.getClass();
            try {
                int i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                String strM3927y = m3927y(vu0Var);
                StringBuilder sbM5696o2 = vi0.m5696o("NukeDexCacheSumSign{module = ", str2, ", versionName = ", str4, ", versionCode = ");
                sbM5696o2.append(i2);
                sbM5696o2.append(", patchId = ");
                sbM5696o2.append(strM3927y);
                sbM5696o2.append("}");
                return sbM5696o2.toString();
            } catch (Throwable unused3) {
                C0676s.m4650i("Can not get PackageInfo!");
                return null;
            }
        } catch (Throwable unused4) {
            C0676s.m4650i("Can not get PackageInfo!");
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static final sx0 m3924v() {
        sx0 sx0Var = f8442k;
        if (sx0Var != null) {
            return sx0Var;
        }
        rx0 rx0Var = new rx0("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = s93.f9998a;
        ft2 ft2Var = new ft2(C0363ju.f5212b);
        ye0 ye0Var = new ye0(3);
        ye0Var.m6259k(12.0f, 2.0f);
        ye0Var.m6252d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        ye0Var.m6261m(4.48f, 10.0f, 10.0f, 10.0f);
        ye0Var.m6261m(10.0f, -4.48f, 10.0f, -10.0f);
        ye0Var.m6260l(17.52f, 2.0f, 12.0f, 2.0f);
        ye0Var.m6251c();
        ye0Var.m6259k(13.0f, 17.0f);
        ye0Var.m6256h(-2.0f);
        ye0Var.m6263o(-6.0f);
        ye0Var.m6256h(2.0f);
        ye0Var.m6263o(6.0f);
        ye0Var.m6251c();
        ye0Var.m6259k(13.0f, 9.0f);
        ye0Var.m6256h(-2.0f);
        ye0Var.m6257i(11.0f, 7.0f);
        ye0Var.m6256h(2.0f);
        ye0Var.m6263o(2.0f);
        ye0Var.m6251c();
        rx0.m4624a(rx0Var, ye0Var.f13428a, ft2Var);
        sx0 sx0VarM4625b = rx0Var.m4625b();
        f8442k = sx0VarM4625b;
        return sx0VarM4625b;
    }

    /* JADX INFO: renamed from: w */
    public static final Paint m3925w(C0611q9 c0611q9) {
        if (c0611q9 == null) {
            jz0.m2596a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + d72.m967a(c0611q9.getClass()).m590b());
        }
        return (Paint) c0611q9.f8830c;
    }

    /* JADX INFO: renamed from: x */
    public static final Object m3926x(ln2 ln2Var, yn2 yn2Var) {
        Object objM4505g = ln2Var.f6221h.m4505g(yn2Var);
        if (objM4505g == null) {
            return null;
        }
        return objM4505g;
    }

    /* JADX INFO: renamed from: y */
    public static String m3927y(vu0 vu0Var) {
        Object x92Var;
        if (vu0Var != vu0.f12174i) {
            return "";
        }
        try {
            Class clsM5529H = up0.m5529H("com.tencent.mm.boot.BuildConfig");
            hi0 hi0VarM3241r = op0.m3602y(clsM5529H).m3241r();
            hi0VarM3241r.f13871b = "CLIENT_VERSION_ARM64";
            String strValueOf = String.valueOf(((pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c())).m3867g0());
            hi0 hi0VarM3241r2 = op0.m3602y(clsM5529H).m3241r();
            hi0VarM3241r2.f13871b = "AAB_ENABLED";
            Object objM3867g0 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r2.m2194c())).m3867g0();
            objM3867g0.getClass();
            x92Var = (((Boolean) objM3867g0).booleanValue() ? "traditional" : "googlePlay") + "-" + strValueOf;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        return (String) (x92Var instanceof x92 ? "" : x92Var);
    }

    /* JADX INFO: renamed from: z */
    public static void m3928z(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }
}
