package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pp0 {
    public static final kw a = new kw(-228120187, false, new ow(8));
    public static final kw b = new kw(1963610818, false, new ow(9));
    public static final h70 c = new h70(1.0f, 1.0f);
    public static final qd3 d = new qd3(0.31006f, 0.31616f);
    public static final qd3 e = new qd3(0.34567f, 0.3585f);
    public static final qd3 f = new qd3(0.32168f, 0.33767f);
    public static final qd3 g = new qd3(0.31271f, 0.32902f);
    public static final float[] h = {0.964212f, 1.0f, 0.825188f};
    public static final hh1 i;
    public static final hh1 j;
    public static sx0 k = null;
    public static boolean l = false;
    public static Method m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = 19;
        i = new hh1(i2, "NONE");
        j = new hh1(i2, "PENDING");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void A(bi0 bi0Var, e9 e9Var, byte b2, String str, int i2) {
        HashMap map = bi0Var.f;
        if (b2 == 1) {
            byte[] bArr = (byte[]) e9Var.k;
            int i3 = e9Var.i;
            e9Var.i = i3 + 1;
            map.put(str, new rz(i2, bArr[i3] == 1));
            return;
        }
        if (b2 == 2) {
            map.put(str, new uz(i2, e9Var.h()));
            return;
        }
        if (b2 == 3) {
            map.put(str, new tz(Float.intBitsToFloat(e9Var.h()), i2));
            return;
        }
        if (b2 == 4) {
            long jI = e9Var.i(e9Var.i);
            e9Var.i += 8;
            map.put(str, new vz(jI, i2));
            return;
        }
        long jI2 = e9Var.i(e9Var.i);
        e9Var.i += 8;
        double dLongBitsToDouble = Double.longBitsToDouble(jI2);
        sz szVar = new sz();
        szVar.a = i2;
        szVar.b = dLongBitsToDouble;
        map.put(str, szVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void B(bi0 bi0Var, e9 e9Var, byte b2, String str, int i2, int i3, byte b3) throws Exception {
        Object objK;
        byte b4 = b2;
        HashMap map = bi0Var.f;
        boolean z = b4 == 9 || b4 == 10 || b4 == 11;
        int iH = z ? e9Var.h() : e9Var.j() & 65535;
        int i4 = z ? 4 : 2;
        boolean z2 = (b3 & 64) != 0;
        if (z2 && iH != 32) {
            s.l("name size not match");
            return;
        }
        switch (b4) {
            case 9:
                b4 = 6;
                break;
            case 10:
                b4 = 7;
                break;
            case 11:
                b4 = 8;
                break;
        }
        if (b4 == 6) {
            map.put(str, new xz(i3, i2 + i4, z2 ? e9Var.k(iH) : e9Var.k(iH), iH, z2));
            return;
        }
        if (b4 == 7) {
            if (z2) {
                objK = e9Var.k(iH);
            } else {
                e9Var.getClass();
                objK = new byte[iH];
                System.arraycopy((byte[]) e9Var.k, e9Var.i, objK, 0, iH);
                e9Var.i += iH;
            }
            map.put(str, new pz(i3, i2 + i4, objK, iH, z2));
            return;
        }
        if (z2) {
            map.put(str, new wz(i3, i2 + i4, e9Var.k(iH), iH, true));
            return;
        }
        e9 e9Var2 = bi0Var.h;
        byte[] bArr = (byte[]) e9Var2.k;
        int i5 = e9Var2.i;
        e9Var2.i = i5 + 1;
        int i6 = bArr[i5] & 255;
        String strK = e9Var2.k(i6);
        ov2 ov2Var = (ov2) bi0Var.c.get(strK);
        int i7 = iH - (i6 + 1);
        if (i7 < 0) {
            throw new Exception("parse dara failed");
        }
        if (ov2Var != null) {
            try {
                map.put(str, new wz(i3, i2 + 2, ov2.a((byte[]) e9Var2.k, e9Var2.i, i7), iH, false));
            } catch (Exception e2) {
                Log.e("FastKV", bi0Var.b, e2);
            }
        } else {
            s11.I(bi0Var, "object with tag: " + strK + " without encoder");
        }
        e9Var.i = i2 + i4 + iH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        throw new java.lang.Exception("parse dara failed");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean C(bi0 bi0Var, boolean z) {
        int iH;
        bi0 bi0Var2;
        if (z) {
            s11.I(bi0Var, "miss cipher");
            return false;
        }
        e9 e9Var = bi0Var.h;
        String str = bi0Var.b;
        e9Var.i = 12;
        while (true) {
            try {
                int i2 = e9Var.i;
                int i3 = bi0Var.d;
                boolean z2 = true;
                if (i2 >= i3) {
                    if (i2 == i3) {
                        return true;
                    }
                    Log.e("FastKV", str, new Exception("parse dara failed"));
                    return false;
                }
                byte[] bArr = (byte[]) e9Var.k;
                int i4 = i2 + 1;
                e9Var.i = i4;
                byte b2 = bArr[i2];
                byte b3 = (byte) (b2 & 63);
                if (b3 < 1 || b3 > 11) {
                    break;
                }
                int i5 = i2 + 2;
                e9Var.i = i5;
                int i6 = bArr[i4] & 255;
                if (i6 == 0) {
                    throw new IllegalStateException("invalid key size");
                }
                if (b2 < 0) {
                    e9Var.i = i5 + i6;
                    if (b3 <= 5) {
                        iH = bi0.y[b3];
                    } else {
                        if (b3 != 9 && b3 != 10 && b3 != 11) {
                            z2 = false;
                        }
                        iH = z2 ? e9Var.h() : e9Var.j() & 65535;
                    }
                    int i7 = e9Var.i + iH;
                    e9Var.i = i7;
                    bi0Var.m = (i7 - i2) + bi0Var.m;
                    ArrayList arrayList = bi0Var.n;
                    nm2 nm2Var = new nm2();
                    nm2Var.h = i2;
                    nm2Var.i = i7;
                    arrayList.add(nm2Var);
                } else {
                    String strK = e9Var.k(i6);
                    int i8 = e9Var.i;
                    if (b3 <= 5) {
                        A(bi0Var, e9Var, b3, strK, i8);
                        bi0Var2 = bi0Var;
                    } else {
                        bi0Var2 = bi0Var;
                        B(bi0Var2, e9Var, b3, strK, i8, i2, b2);
                    }
                    bi0Var = bi0Var2;
                }
            } catch (Exception e2) {
                Log.e("FastKV", str, e2);
                return false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x029a, code lost:
    
        defpackage.s.j("");
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long D(String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        int iMin;
        int i8;
        int i9;
        int i10;
        int i11;
        double d2;
        long jR;
        char cCharAt;
        int i12;
        char cCharAt2;
        int i13;
        int i14;
        char cCharAt3;
        if (str.length() == 0) {
            s.j("The string is empty");
            return 0L;
        }
        char cCharAt4 = str.charAt(0);
        int i15 = 1;
        char c2 = '-';
        char c3 = '+';
        if (cCharAt4 != '+') {
            i3 = cCharAt4 != '-' ? 0 : 1;
            i2 = i3;
        } else {
            i2 = 0;
            i3 = 1;
        }
        if (str.length() <= i3) {
            s.j("No components");
            return 0L;
        }
        if (str.charAt(i3) != 'P') {
            s.j("");
            return 0L;
        }
        int i16 = i3 + 1;
        if (i16 == str.length()) {
            s.j("");
            return 0L;
        }
        int i17 = 0;
        ed0 ed0Var = null;
        long jQ = 0;
        long j3 = 0;
        while (i16 < str.length()) {
            char cCharAt5 = str.charAt(i16);
            if (cCharAt5 != 'T') {
                xc1 xc1Var = xc1.c;
                int i18 = i15;
                char cCharAt6 = str.charAt(i16);
                if (cCharAt6 == c3) {
                    i4 = i16 + 1;
                } else {
                    if (cCharAt6 == c2) {
                        i4 = i16 + 1;
                        i5 = -1;
                        while (i4 < str.length() && str.charAt(i4) == '0') {
                            i4++;
                        }
                        j2 = 0;
                        while (true) {
                            if (i4 >= str.length()) {
                                char cCharAt7 = str.charAt(i4);
                                i6 = i16;
                                if ('0' <= cCharAt7 && cCharAt7 < ':') {
                                    i13 = cCharAt7 - '0';
                                    i14 = i2;
                                    long j4 = xc1Var.a;
                                    if (j2 <= j4 && (j2 != j4 || i13 <= xc1Var.b)) {
                                        j2 = (j2 << 3) + (j2 << i18) + ((long) i13);
                                        i4++;
                                        i16 = i6;
                                        xc1Var = xc1Var;
                                        i2 = i14;
                                    }
                                }
                            } else {
                                i6 = i16;
                            }
                        }
                        int i19 = i14;
                        while (i4 < str.length() && '0' <= (cCharAt3 = str.charAt(i4)) && cCharAt3 < ':') {
                            i4++;
                        }
                        if (i4 != str.length()) {
                            if (i4 != i6 + ((cCharAt5 == '+' || cCharAt5 == '-') ? i18 : 0)) {
                                j2 = 4611686018427387903L;
                                long j5 = j2;
                                char cCharAt8 = str.charAt(i4);
                                ed0 ed0Var2 = ed0.SECONDS;
                                if (cCharAt8 == '.') {
                                    int i20 = i4 + 1;
                                    int iMin2 = Math.min(i4 + 7, str.length());
                                    int i21 = 0;
                                    for (int i22 = i20; i22 < iMin2; i22++) {
                                        char cCharAt9 = str.charAt(i22);
                                        if ('0' > cCharAt9 || cCharAt9 >= ':') {
                                            for (i7 = 0; i7 < 6 - (i22 - i20); i7++) {
                                                i21 = (i21 << 1) + (i21 << 3);
                                            }
                                            iMin = Math.min(i22 + 9, str.length());
                                            i8 = i22;
                                            i9 = 0;
                                            while (true) {
                                                if (i8 >= iMin) {
                                                    i12 = iMin;
                                                    cCharAt2 = str.charAt(i8);
                                                    i10 = i8;
                                                    if ('0' <= cCharAt2 && cCharAt2 < ':') {
                                                        i9 = (cCharAt2 - '0') + (i9 << 3) + (i9 << 1);
                                                        i8 = i10 + 1;
                                                        iMin = i12;
                                                    }
                                                } else {
                                                    i10 = i8;
                                                }
                                            }
                                            for (i11 = 0; i11 < 9 - (i10 - i22); i11++) {
                                                i9 = (i9 << 1) + (i9 << 3);
                                            }
                                            i4 = i10;
                                            while (i4 < str.length() && '0' <= (cCharAt = str.charAt(i4)) && cCharAt < ':') {
                                                i4++;
                                            }
                                            if (i4 != i20 || i4 == str.length() || str.charAt(i4) != 'S') {
                                                s.j("");
                                                return 0L;
                                            }
                                            long j6 = (((long) i21) * 1000000000) + ((long) i9);
                                            long j7 = i5;
                                            double d3 = j6;
                                            switch (ed0Var2.ordinal()) {
                                                case 0:
                                                    d2 = 1.0E-15d;
                                                    jR = gf1.R(d3 * d2);
                                                    break;
                                                case 1:
                                                    d2 = 1.0E-12d;
                                                    jR = gf1.R(d3 * d2);
                                                    break;
                                                case 2:
                                                    d2 = 1.0E-9d;
                                                    jR = gf1.R(d3 * d2);
                                                    break;
                                                case 3:
                                                    d2 = 1.0E-6d;
                                                    jR = gf1.R(d3 * d2);
                                                    break;
                                                case 4:
                                                    d2 = 6.0E-5d;
                                                    jR = gf1.R(d3 * d2);
                                                    break;
                                                case 5:
                                                    d2 = 0.0036d;
                                                    jR = gf1.R(d3 * d2);
                                                    break;
                                                case AIChatConfig.DefaultContextRounds /* 6 */:
                                                    d2 = 0.0864d;
                                                    jR = gf1.R(d3 * d2);
                                                    break;
                                                default:
                                                    c80.u("Unknown unit: ", ed0Var2);
                                                    jR = 0;
                                                    break;
                                            }
                                            j3 = jR * j7;
                                        } else {
                                            i21 = (cCharAt9 - '0') + (i21 << 3) + (i21 << 1);
                                        }
                                    }
                                    while (i7 < 6 - (i22 - i20)) {
                                    }
                                    iMin = Math.min(i22 + 9, str.length());
                                    i8 = i22;
                                    i9 = 0;
                                    while (true) {
                                        if (i8 >= iMin) {
                                        }
                                        i9 = (cCharAt2 - '0') + (i9 << 3) + (i9 << 1);
                                        i8 = i10 + 1;
                                        iMin = i12;
                                    }
                                    while (i11 < 9 - (i10 - i22)) {
                                    }
                                    i4 = i10;
                                    while (i4 < str.length()) {
                                        i4++;
                                    }
                                    if (i4 != i20) {
                                    }
                                    s.j("");
                                    return 0L;
                                }
                                char cCharAt10 = str.charAt(i4);
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
                                    throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                                }
                                if (ed0Var != null && ed0Var.compareTo(ed0Var2) <= 0) {
                                    s.j("Unexpected order of duration components");
                                    return 0L;
                                }
                                if (ed0Var2 == ed0Var3) {
                                    if (i17 != 0) {
                                        s.j("");
                                        return 0L;
                                    }
                                    jQ = qp0.q(j5, ed0Var2) * ((long) i5);
                                } else {
                                    if (i17 == 0) {
                                        s.j("");
                                        return 0L;
                                    }
                                    long jL = l(jQ, qp0.q(j5, ed0Var2) * ((long) i5));
                                    if (jL == 9223372036854759646L) {
                                        s.j("");
                                        return 0L;
                                    }
                                    jQ = jL;
                                }
                                i16 = i4 + 1;
                                ed0Var = ed0Var2;
                                i15 = i18;
                                i2 = i19;
                                c2 = '-';
                                c3 = '+';
                            }
                        }
                        s.j("");
                        return 0L;
                    }
                    i4 = i16;
                }
                i5 = i18;
                while (i4 < str.length()) {
                    i4++;
                }
                j2 = 0;
                while (true) {
                    if (i4 >= str.length()) {
                    }
                    j2 = (j2 << 3) + (j2 << i18) + ((long) i13);
                    i4++;
                    i16 = i6;
                    xc1Var = xc1Var;
                    i2 = i14;
                }
                int i192 = i14;
                while (i4 < str.length()) {
                    i4++;
                }
                if (i4 != str.length()) {
                }
                s.j("");
                return 0L;
            }
            if (i17 != 0 || (i16 = i16 + 1) == str.length()) {
                s.j("");
                return 0L;
            }
            i17 = i15;
        }
        int i23 = i2;
        long jE = ad0.e(G(jQ, ed0.MILLISECONDS), G(j3, ed0.NANOSECONDS));
        return (i23 == 0 || jE == ad0.l) ? jE : ad0.g(jE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 E(uh1 uh1Var, float f2) {
        return (f2 == 1.0f && f2 == 1.0f) ? uh1Var : te.N(uh1Var, f2, f2, 0.0f, null, 524284);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int F(qm2 qm2Var, int i2) {
        int i3;
        int[] iArr = qm2Var.m;
        int i4 = i2 + 1;
        int length = qm2Var.l.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long G(long j2, ed0 ed0Var) {
        TimeUnit timeUnit = ed0Var.h;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j2 && j2 <= jConvert) {
            long jConvert2 = timeUnit2.convert(j2, timeUnit);
            z8 z8Var = ad0.i;
            long j3 = jConvert2 << 1;
            int i2 = cd0.a;
            return j3;
        }
        if (ed0Var.compareTo(ed0.MILLISECONDS) < 0) {
            return r(ci0.E(TimeUnit.MILLISECONDS.convert(j2, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j2);
        if (j2 < -9223372036854775807L) {
            j2 = -9223372036854775807L;
        }
        return r(qp0.q(Math.abs(j2), ed0Var) * jSignum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void H(List list, y9 y9Var) {
        Path path;
        int i2;
        float f2;
        int i3;
        qy1 qy1Var;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        List list2 = list;
        y9 y9Var2 = y9Var;
        Path path2 = y9Var2.a;
        Path path3 = y9Var2.a;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path3.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path3.setFillType(fillType2);
        qy1 qy1Var2 = list2.isEmpty() ? yx1.c : (qy1) list2.get(0);
        int size = list2.size();
        float f12 = 0.0f;
        int i4 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (i4 < size) {
            qy1 qy1Var3 = (qy1) list2.get(i4);
            if (qy1Var3 instanceof yx1) {
                path3.close();
                path = path3;
                i2 = size;
                f2 = f12;
                i3 = i4;
                qy1Var = qy1Var3;
                f13 = f17;
                f15 = f13;
                f14 = f18;
                f16 = f14;
            } else {
                if (qy1Var3 instanceof ky1) {
                    ky1 ky1Var = (ky1) qy1Var3;
                    float f19 = ky1Var.c;
                    f15 += f19;
                    float f20 = ky1Var.d;
                    f16 += f20;
                    path3.rMoveTo(f19, f20);
                    path = path3;
                    i2 = size;
                    f2 = f12;
                    i3 = i4;
                    f17 = f15;
                    f18 = f16;
                } else {
                    if (qy1Var3 instanceof cy1) {
                        cy1 cy1Var = (cy1) qy1Var3;
                        float f21 = cy1Var.c;
                        float f22 = cy1Var.d;
                        path3.moveTo(f21, f22);
                        f16 = f22;
                        f18 = f16;
                        path = path3;
                        f15 = f21;
                        f17 = f15;
                    } else {
                        if (qy1Var3 instanceof jy1) {
                            jy1 jy1Var = (jy1) qy1Var3;
                            float f23 = jy1Var.d;
                            float f24 = jy1Var.c;
                            path3.rLineTo(f24, f23);
                            f15 += f24;
                            f16 += f23;
                        } else if (qy1Var3 instanceof by1) {
                            by1 by1Var = (by1) qy1Var3;
                            float f25 = by1Var.d;
                            float f26 = by1Var.c;
                            y9Var2.e(f26, f25);
                            f15 = f26;
                            path = path3;
                            f16 = f25;
                        } else if (qy1Var3 instanceof iy1) {
                            float f27 = ((iy1) qy1Var3).c;
                            path3.rLineTo(f27, f12);
                            f15 += f27;
                        } else if (qy1Var3 instanceof ay1) {
                            float f28 = ((ay1) qy1Var3).c;
                            y9Var2.e(f28, f16);
                            f15 = f28;
                        } else if (qy1Var3 instanceof oy1) {
                            float f29 = ((oy1) qy1Var3).c;
                            path3.rLineTo(f12, f29);
                            f16 += f29;
                        } else if (qy1Var3 instanceof py1) {
                            float f30 = ((py1) qy1Var3).c;
                            y9Var2.e(f15, f30);
                            f16 = f30;
                        } else if (qy1Var3 instanceof hy1) {
                            hy1 hy1Var = (hy1) qy1Var3;
                            path3.rCubicTo(hy1Var.c, hy1Var.d, hy1Var.e, hy1Var.f, hy1Var.g, hy1Var.h);
                            Path path4 = path3;
                            float f31 = hy1Var.e + f15;
                            float f32 = hy1Var.f + f16;
                            f15 += hy1Var.g;
                            f16 += hy1Var.h;
                            f14 = f32;
                            path = path4;
                            i2 = size;
                            f2 = f12;
                            i3 = i4;
                            qy1Var = qy1Var3;
                            f13 = f31;
                        } else {
                            Path path5 = path3;
                            if (qy1Var3 instanceof zx1) {
                                zx1 zx1Var = (zx1) qy1Var3;
                                y9Var2.c(zx1Var.c, zx1Var.d, zx1Var.e, zx1Var.f, zx1Var.g, zx1Var.h);
                                f6 = zx1Var.e;
                                f7 = zx1Var.f;
                                f8 = zx1Var.g;
                                f9 = zx1Var.h;
                            } else {
                                if (qy1Var3 instanceof my1) {
                                    if (qy1Var2.a) {
                                        f10 = f15 - f13;
                                        f11 = f16 - f14;
                                    } else {
                                        f10 = f12;
                                        f11 = f10;
                                    }
                                    my1 my1Var = (my1) qy1Var3;
                                    path5.rCubicTo(f10, f11, my1Var.c, my1Var.d, my1Var.e, my1Var.f);
                                    path5 = path5;
                                    float f33 = my1Var.c + f15;
                                    float f34 = my1Var.d + f16;
                                    f15 += my1Var.e;
                                    f16 += my1Var.f;
                                    f13 = f33;
                                    f14 = f34;
                                } else if (qy1Var3 instanceof ey1) {
                                    if (qy1Var2.a) {
                                        f15 = (f15 * 2.0f) - f13;
                                        f16 = (2.0f * f16) - f14;
                                    }
                                    ey1 ey1Var = (ey1) qy1Var3;
                                    y9Var.c(f15, f16, ey1Var.c, ey1Var.d, ey1Var.e, ey1Var.f);
                                    f6 = ey1Var.c;
                                    f7 = ey1Var.d;
                                    f8 = ey1Var.e;
                                    f9 = ey1Var.f;
                                } else {
                                    if (qy1Var3 instanceof ly1) {
                                        ly1 ly1Var = (ly1) qy1Var3;
                                        float f35 = ly1Var.f;
                                        float f36 = ly1Var.e;
                                        float f37 = ly1Var.d;
                                        float f38 = ly1Var.c;
                                        path5.rQuadTo(f38, f37, f36, f35);
                                        f6 = f38 + f15;
                                        f5 = f37 + f16;
                                        f15 += f36;
                                        f16 += f35;
                                    } else if (qy1Var3 instanceof dy1) {
                                        dy1 dy1Var = (dy1) qy1Var3;
                                        float f39 = dy1Var.f;
                                        float f40 = dy1Var.e;
                                        f5 = dy1Var.d;
                                        f6 = dy1Var.c;
                                        path5.quadTo(f6, f5, f40, f39);
                                        f16 = f39;
                                        f15 = f40;
                                    } else if (qy1Var3 instanceof ny1) {
                                        if (qy1Var2.b) {
                                            f3 = f15 - f13;
                                            f4 = f16 - f14;
                                        } else {
                                            f3 = f12;
                                            f4 = f3;
                                        }
                                        ny1 ny1Var = (ny1) qy1Var3;
                                        float f41 = ny1Var.d;
                                        float f42 = ny1Var.c;
                                        path5.rQuadTo(f3, f4, f42, f41);
                                        float f43 = f3 + f15;
                                        float f44 = f4 + f16;
                                        f15 += f42;
                                        f16 += f41;
                                        f13 = f43;
                                        f14 = f44;
                                    } else if (qy1Var3 instanceof fy1) {
                                        if (qy1Var2.b) {
                                            f15 = (f15 * 2.0f) - f13;
                                            f16 = (2.0f * f16) - f14;
                                        }
                                        fy1 fy1Var = (fy1) qy1Var3;
                                        float f45 = fy1Var.d;
                                        float f46 = fy1Var.c;
                                        path5.quadTo(f15, f16, f46, f45);
                                        path = path5;
                                        i2 = size;
                                        f2 = f12;
                                        i3 = i4;
                                        f13 = f15;
                                        f14 = f16;
                                        qy1Var = qy1Var3;
                                        f15 = f46;
                                        f16 = f45;
                                    } else if (qy1Var3 instanceof gy1) {
                                        gy1 gy1Var = (gy1) qy1Var3;
                                        float f47 = gy1Var.h + f15;
                                        float f48 = gy1Var.i + f16;
                                        i2 = size;
                                        i3 = i4;
                                        path = path5;
                                        f2 = 0.0f;
                                        q(y9Var, f15, f16, f47, f48, gy1Var.c, gy1Var.d, gy1Var.e, gy1Var.f, gy1Var.g);
                                        f13 = f47;
                                        f15 = f13;
                                        f14 = f48;
                                        f16 = f14;
                                        qy1Var = qy1Var3;
                                    } else {
                                        path = path5;
                                        i2 = size;
                                        f2 = f12;
                                        i3 = i4;
                                        if (!(qy1Var3 instanceof xx1)) {
                                            c80.s();
                                            return;
                                        }
                                        xx1 xx1Var = (xx1) qy1Var3;
                                        float f49 = xx1Var.i;
                                        float f50 = xx1Var.h;
                                        qy1Var = qy1Var3;
                                        q(y9Var, f15, f16, f50, f49, xx1Var.c, xx1Var.d, xx1Var.e, xx1Var.f, xx1Var.g);
                                        f14 = f49;
                                        f16 = f14;
                                        f13 = f50;
                                        f15 = f13;
                                    }
                                    f14 = f5;
                                    path = path5;
                                    i2 = size;
                                    f2 = f12;
                                    i3 = i4;
                                    qy1Var = qy1Var3;
                                    f13 = f6;
                                }
                                path = path5;
                            }
                            f14 = f7;
                            f15 = f8;
                            f16 = f9;
                            path = path5;
                            i2 = size;
                            f2 = f12;
                            i3 = i4;
                            qy1Var = qy1Var3;
                            f13 = f6;
                        }
                        path = path3;
                    }
                    i2 = size;
                    f2 = f12;
                    i3 = i4;
                }
                qy1Var = qy1Var3;
            }
            i4 = i3 + 1;
            list2 = list;
            y9Var2 = y9Var;
            path3 = path;
            size = i2;
            qy1Var2 = qy1Var;
            f12 = f2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String I(int i2) {
        char[] cArr = new char[2];
        for (int i3 = 0; i3 < 2; i3++) {
            cArr[1 - i3] = Character.forDigit(i2 & 15, 16);
            i2 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String J(int i2) {
        char[] cArr = new char[4];
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[3 - i3] = Character.forDigit(i2 & 15, 16);
            i2 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String K(int i2) {
        char[] cArr = new char[8];
        for (int i3 = 0; i3 < 8; i3++) {
            cArr[7 - i3] = Character.forDigit(i2 & 15, 16);
            i2 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String L(long j2) {
        char[] cArr = new char[16];
        for (int i2 = 0; i2 < 16; i2++) {
            cArr[15 - i2] = Character.forDigit(((int) j2) & 15, 16);
            j2 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int M(int i2) {
        int i3 = i2 >> 7;
        int i4 = 0;
        while (i3 != 0) {
            i3 >>= 7;
            i4++;
        }
        return i4 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int N(int i2) {
        int i3 = 306783378 & i2;
        int i4 = 613566756 & i2;
        return (i2 & (-920350135)) | (i4 >> 1) | i3 | ((i3 << 1) & i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(in0 in0Var, uh1 uh1Var, in0 in0Var2, px pxVar, int i2) {
        int i3;
        ia1 ia1Var;
        e70 e70Var;
        int i4;
        d61 d61Var;
        yy1 yy1Var;
        v6 v6Var = v6.v;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-180024211);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.h(in0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.f(uh1Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 |= go0Var.h(v6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= go0Var.h(in0Var2) ? 16384 : 8192;
        }
        if (go0Var.O(i5 & 1, (i5 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(go0Var.T);
            uh1 uh1VarM = tl.M(go0Var, uh1Var.c(qk0.a).c(ol0.a).c(ql0.a).c(ll0.a));
            e70 e70Var2 = (e70) go0Var.j(ly.h);
            d61 d61Var2 = (d61) go0Var.j(ly.n);
            yy1 yy1VarL = go0Var.l();
            ia1 ia1Var2 = (ia1) go0Var.j(zb1.a);
            tc2 tc2Var = (tc2) go0Var.j(fc1.a);
            go0Var.W(1314774735);
            int i6 = i5 & 14;
            int iHashCode2 = Long.hashCode(go0Var.T);
            Context context = (Context) go0Var.j(r7.b);
            eo0 eo0VarL = rg3.L(go0Var);
            fc2 fc2Var = (fc2) go0Var.j(hc2.a);
            View view = (View) go0Var.j(r7.f);
            boolean zH = go0Var.h(context) | ((((i6 & 14) ^ 6) > 4 && go0Var.f(in0Var)) || (i6 & 6) == 4) | go0Var.h(eo0VarL) | go0Var.h(fc2Var) | go0Var.d(iHashCode2) | go0Var.h(view);
            Object objL = go0Var.L();
            if (zH || objL == nx.a) {
                ia1Var = ia1Var2;
                e70Var = e70Var2;
                i4 = iHashCode;
                d61Var = d61Var2;
                yy1Var = yy1VarL;
                mc mcVar = new mc(context, in0Var, eo0VarL, fc2Var, iHashCode2, view);
                go0Var.f0(mcVar);
                objL = mcVar;
            } else {
                e70Var = e70Var2;
                d61Var = d61Var2;
                yy1Var = yy1VarL;
                i4 = iHashCode;
                ia1Var = ia1Var2;
            }
            xm0 xm0Var = (xm0) objL;
            go0Var.S(125, 1, null, null);
            go0Var.r = true;
            if (go0Var.S) {
                go0Var.k(xm0Var);
            } else {
                go0Var.i0();
            }
            hx.c.getClass();
            yf3.c(go0Var, gx.d, yy1Var);
            yf3.c(go0Var, lc.l, uh1VarM);
            yf3.c(go0Var, lc.m, e70Var);
            yf3.c(go0Var, lc.n, ia1Var);
            yf3.c(go0Var, lc.o, tc2Var);
            yf3.c(go0Var, lc.p, d61Var);
            yf3.c(go0Var, gx.f, Integer.valueOf(i4));
            yf3.c(go0Var, lc.j, in0Var2);
            yf3.c(go0Var, lc.k, v6Var);
            go0Var.p(true);
            go0Var.p(false);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new i8(in0Var, uh1Var, in0Var2, i2, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(in0 in0Var, uh1 uh1Var, in0 in0Var2, px pxVar, int i2, int i3) {
        int i4;
        int i5;
        v6 v6Var = v6.v;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1783766393);
        if ((i2 & 48) == 0) {
            i4 = (go0Var.f(uh1Var) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i5 = i4 | 384;
        } else {
            i5 = i4 | (go0Var.h(in0Var2) ? 256 : 128);
        }
        if (go0Var.O(i5 & 1, (i5 & 147) != 146)) {
            if (i6 != 0) {
                in0Var2 = v6Var;
            }
            a(in0Var, uh1Var, in0Var2, go0Var, (i5 & 112) | 3078 | ((i5 << 6) & 57344));
        } else {
            go0Var.R();
        }
        in0 in0Var3 = in0Var2;
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new kc(in0Var, uh1Var, in0Var3, i2, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(boolean z, final xm0 xm0Var, px pxVar, final int i2, final int i3) {
        final boolean z2;
        int i4;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-361453782);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            z2 = z;
        } else {
            z2 = z;
            i4 = (go0Var.g(z2) ? 4 : 2) | i2;
        }
        int i6 = i4 | (go0Var.h(xm0Var) ? 32 : 16);
        if (go0Var.O(i6 & 1, (i6 & 19) != 18)) {
            boolean z3 = i5 != 0 ? true : z2;
            Object objA = cc1.a(go0Var);
            if (objA == null) {
                go0Var.W(535274673);
                objA = dc1.a(go0Var);
            } else {
                go0Var.W(535271790);
            }
            go0Var.p(false);
            if (objA == null) {
                s.l("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = go0Var.f(objA);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (zF || objL == ebVar) {
                gm1 gm1Var = objA instanceof gm1 ? (gm1) objA : null;
                fm1 navigationEventDispatcher = gm1Var != null ? gm1Var.getNavigationEventDispatcher() : null;
                pt1 pt1Var = objA instanceof pt1 ? (pt1) objA : null;
                objL = new gj(navigationEventDispatcher, pt1Var != null ? pt1Var.getOnBackPressedDispatcher() : null);
                go0Var.f0(objL);
            }
            gj gjVar = (gj) objL;
            long j2 = go0Var.T;
            boolean zF2 = go0Var.f(gjVar) | go0Var.e(j2);
            Object objL2 = go0Var.L();
            Object obj = objL2;
            if (zF2 || objL2 == ebVar) {
                sw swVar = new sw(new hj(j2, objA));
                swVar.j = new c0(29);
                go0Var.f0(swVar);
                obj = swVar;
            }
            sw swVar2 = (sw) obj;
            go0Var.W(-585307852);
            boolean zH = go0Var.h(swVar2) | ((i6 & 112) == 32);
            Object objL3 = go0Var.L();
            if (zH || objL3 == ebVar) {
                objL3 = new r1(7, swVar2, xm0Var);
                go0Var.f0(objL3);
            }
            eu.r((xm0) objL3, go0Var);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i7 = i6 & 14;
            boolean zH2 = go0Var.h(swVar2) | (i7 == 4);
            Object objL4 = go0Var.L();
            if (zH2 || objL4 == ebVar) {
                objL4 = new ij(swVar2, z3, 0);
                go0Var.f0(objL4);
            }
            eu.h(boolValueOf, swVar2, null, (in0) objL4, go0Var, i7);
            boolean zH3 = go0Var.h(gjVar) | go0Var.h(swVar2);
            Object objL5 = go0Var.L();
            if (zH3 || objL5 == ebVar) {
                objL5 = new d2(5, gjVar, swVar2);
                go0Var.f0(objL5);
            }
            eu.d(gjVar, swVar2, (in0) objL5, go0Var);
            go0Var.p(false);
            z2 = z3;
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0(z2, xm0Var, i2, i3) { // from class: jj
                public final /* synthetic */ boolean h;
                public final /* synthetic */ xm0 i;
                public final /* synthetic */ int j;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.j = i3;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = pp0.N(1);
                    pp0.c(this.h, this.i, (px) obj2, iN, this.j);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(kw kwVar, px pxVar, int i2) {
        Object x92Var;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-501639161);
        int i3 = i2 | 6;
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            go0Var.W(-2140895558);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                try {
                    pp1 pp1Var = pp1.a;
                    x92Var = (c73) pp1.c().b(se.D(c73.Companion.serializer()), null, "ui_config");
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                objL = (c73) (x92Var instanceof x92 ? null : x92Var);
                if (objL == null) {
                    objL = new c73();
                }
                go0Var.f0(objL);
            }
            c73 c73Var = (c73) objL;
            go0Var.p(false);
            boolean zS = op0.s(go0Var);
            c73Var.getClass();
            int i4 = c73Var.a;
            if (i4 == 1) {
                zS = false;
            } else if (i4 == 2) {
                zS = true;
            }
            b73 b73Var = c73Var.d;
            boolean zG = go0Var.g(zS) | go0Var.f(b73Var);
            Object objL2 = go0Var.L();
            if (zG || objL2 == ebVar) {
                objL2 = p7.L(b73Var, zS);
                go0Var.f0(objL2);
            }
            lp1 lp1Var = (lp1) objL2;
            z13.a(zS, false, new ju(lp1Var.g), xe1.i0(1304942345, new tt0(lp1Var, c73Var, kwVar, 4), go0Var), go0Var, 3120);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new o0(kwVar, i2, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(ci1 ci1Var, xm0 xm0Var, in0 in0Var, px pxVar, int i2) {
        int i3;
        String strValueOf;
        int i4 = ci1Var.a;
        go0 go0Var = (go0) pxVar;
        go0Var.X(952038297);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(ci1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(xm0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.h(in0Var) ? 256 : 128;
        }
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            boolean z = i4 == -1;
            int i5 = i3 & 14;
            boolean z2 = i5 == 4;
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (z2 || objL == ebVar) {
                objL = op0.u(Boolean.valueOf(z));
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            boolean z3 = i5 == 4;
            Object objL2 = go0Var.L();
            if (z3 || objL2 == ebVar) {
                if (z) {
                    strValueOf = "10000";
                } else {
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    strValueOf = String.valueOf(i4);
                }
                objL2 = op0.u(strValueOf);
                go0Var.f0(objL2);
            }
            xk1 xk1Var2 = (xk1) objL2;
            Integer numE0 = wv2.e0((String) xk1Var2.getValue());
            qp0.d(true, xm0Var, null, rg3.P(R.string.modify_friends_count_config_title, go0Var), null, xe1.i0(665256220, new fe(xm0Var, in0Var, xk1Var, numE0, ((Boolean) xk1Var.getValue()).booleanValue() || numE0 != null, 1), go0Var), xe1.i0(1952799429, new tr(xk1Var, xk1Var2, numE0), go0Var), go0Var, (i3 & 112) | 1769478, 20);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(ci1Var, xm0Var, in0Var, i2, 11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ju2 f(Object obj) {
        if (obj == null) {
            obj = up0.e;
        }
        return new ju2(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: go0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final void g(ep1 ep1Var, uh1 uh1Var, kw kwVar, kw kwVar2, px pxVar, int i2) {
        Object obj;
        uh1 uh1Var2;
        boolean z;
        uh1 htVar;
        ?? r3;
        zo1 zo1Var = zo1.b;
        ep1Var.getClass();
        nx1 nx1Var = ep1Var.h;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1792006350);
        int i3 = i2 | (go0Var.f(ep1Var) ? 4 : 2) | 48;
        if (go0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            Object objL = go0Var.L();
            Object obj2 = nx.a;
            if (objL == obj2) {
                objL = op0.u(new rs1(0L));
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            yi0 yi0Var = te.g;
            Object objL2 = go0Var.L();
            if (objL2 == obj2) {
                objL2 = new pr(xk1Var, 13);
                go0Var.f0(objL2);
            }
            uh1 uh1VarE = t11.E(yi0Var, (in0) objL2);
            rk rkVar = sn.j;
            nf1 nf1VarD = dm.d(rkVar, false);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarE);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            lc lcVar = gx.e;
            yf3.c(go0Var, lcVar, nf1VarD);
            lc lcVar2 = gx.d;
            yf3.c(go0Var, lcVar2, yy1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            lc lcVar3 = gx.f;
            yf3.c(go0Var, lcVar3, numValueOf);
            v6 v6Var = gx.g;
            yf3.b(go0Var, v6Var);
            lc lcVar4 = gx.c;
            yf3.c(go0Var, lcVar4, uh1VarM);
            uh1 uh1VarA = hm.a();
            boolean zC = ep1Var.c();
            rh1 rh1Var = rh1.a;
            if (zC) {
                go0Var.W(1625286441);
                Object objL3 = go0Var.L();
                if (objL3 == obj2) {
                    objL3 = new vi1(19);
                    go0Var.f0(objL3);
                }
                AtomicInteger atomicInteger = nn2.a;
                htVar = new ht((in0) objL3);
                z = false;
                go0Var.p(false);
            } else {
                z = false;
                go0Var.W(1625371970);
                go0Var.p(false);
                htVar = rh1Var;
            }
            uh1 uh1VarC = uh1VarA.c(htVar);
            nf1 nf1VarD2 = dm.d(rkVar, z);
            int iHashCode2 = Long.hashCode(go0Var.T);
            yy1 yy1VarL2 = go0Var.l();
            uh1 uh1VarM2 = tl.M(go0Var, uh1VarC);
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, lcVar, nf1VarD2);
            yf3.c(go0Var, lcVar2, yy1VarL2);
            vi0.q(iHashCode2, go0Var, lcVar3, go0Var, v6Var);
            yf3.c(go0Var, lcVar4, uh1VarM2);
            nn0 nn0Var = kwVar;
            nn0Var.e(hm.a, go0Var, 54);
            go0Var.p(true);
            boolean zC2 = ep1Var.c();
            a83 a83Var = a83.a;
            if (zC2) {
                go0Var.W(1625550406);
                dm.a(vw2.a(hm.a(), a83Var, zo1Var), go0Var, 0);
                long jD = rs1.b(((rs1) nx1Var.getValue()).a, 0L) ? 0L : rs1.d(((rs1) nx1Var.getValue()).a, ((rs1) xk1Var.getValue()).a);
                boolean z2 = (i3 & 14) == 4;
                Object objL4 = go0Var.L();
                if (z2 || objL4 == obj2) {
                    objL4 = new ta(16, ep1Var);
                    go0Var.f0(objL4);
                }
                h((xm0) objL4, jD, hm.a(), kwVar2, go0Var, 3072);
                r3 = 0;
                go0Var.p(false);
            } else {
                r3 = 0;
                go0Var.W(1626123162);
                go0Var.p(false);
            }
            if (((Boolean) ep1Var.k.getValue()).booleanValue()) {
                go0Var.W(1626163772);
                dm.a(vw2.a(hm.a(), a83Var, zo1Var), go0Var, r3);
                go0Var.p(r3);
            } else {
                go0Var.W(1626315610);
                go0Var.p(r3);
            }
            go0Var.p(true);
            uh1Var2 = rh1Var;
            obj = nn0Var;
        } else {
            obj = kwVar;
            go0Var.R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new v1(ep1Var, uh1Var2, obj, kwVar2, i2, 8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(final xm0 xm0Var, final long j2, final uh1 uh1Var, final kw kwVar, px pxVar, final int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-928246840);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.h(xm0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.e(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.f(uh1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go0Var.h(kwVar) ? 2048 : 1024;
        }
        if (go0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = op0.u(new h11(0L));
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            uh1 uh1VarC = uh1Var.c(te.g);
            Object objL2 = go0Var.L();
            if (objL2 == ebVar) {
                objL2 = new pr(xk1Var, 14);
                go0Var.f0(objL2);
            }
            uh1 uh1VarG = gf1.G(uh1VarC, (in0) objL2);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objL3 = go0Var.L();
            if (z || objL3 == ebVar) {
                objL3 = new wo1(j2, xm0Var, xk1Var);
                go0Var.f0(objL3);
            }
            uh1 uh1VarL = te.L(uh1VarG, (in0) objL3);
            int i4 = i3 & 7168;
            nf1 nf1VarD = dm.d(sn.j, false);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarL);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, nf1VarD);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            kwVar.e(hm.a, go0Var, Integer.valueOf(((i4 >> 6) & 112) | 6));
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0() { // from class: xo1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pp0.h(xm0Var, j2, uh1Var, kwVar, (px) obj, pp0.N(i2 | 1));
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final q9 i() {
        return new q9(new Paint(7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final View j(th1 th1Var) {
        ab3 ab3Var = sp0.c0(th1Var.h).v;
        View interopView = ab3Var != null ? ab3Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        s.l("Could not fetch interop view");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ab3 k(r61 r61Var) {
        ab3 ab3Var = r61Var.v;
        if (ab3Var != null) {
            return ab3Var;
        }
        throw vi0.e("Required value was null.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long l(long j2, long j3) {
        if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
            return (j3 == 4611686018427387903L || j3 == -4611686018427387903L) ? j3 : ci0.E(j2 + j3, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j3 || j3 >= 4611686018427387903L) && (j3 ^ j2) < 0) {
            return 9223372036854759646L;
        }
        return j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static nu0 m(vu0 vu0Var) {
        Context context = up0.i;
        if (context == null) {
            t11.S("hostContext");
            throw null;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            str.getClass();
            Context context2 = up0.i;
            if (context2 == null) {
                t11.S("hostContext");
                throw null;
            }
            try {
                return new nu0(str, context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode, y(vu0Var), vu0Var.ordinal());
            } catch (Throwable unused) {
                s.i("Can not get PackageInfo!");
                return null;
            }
        } catch (Throwable unused2) {
            s.i("Can not get PackageInfo!");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                fg1.m(th, th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final qy2 o(t60 t60Var) {
        bz2 bz2Var;
        oy2 oy2Var = new oy2();
        tb3.c(t60Var, sy2.a, new xq2(new xq2(5, oy2Var), new e2(1, oy2Var, oy2.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 7)));
        lk1 lk1Var = new lk1();
        lk1 lk1Var2 = oy2Var.a;
        Object[] objArr = lk1Var2.a;
        int i2 = lk1Var2.b;
        int i3 = 0;
        int i4 = 0;
        boolean z = true;
        py2 py2Var = null;
        while (true) {
            bz2Var = bz2.b;
            if (i4 >= i2) {
                break;
            }
            py2 py2Var2 = (py2) objArr[i4];
            if (!z || py2Var2 != bz2Var) {
                if (py2Var2 == bz2Var && py2Var == bz2Var) {
                    z = false;
                    break;
                    break;
                }
                if (py2Var2 != bz2Var) {
                    lk1 lk1Var3 = oy2Var.b;
                    Object[] objArr2 = lk1Var3.a;
                    int i5 = lk1Var3.b;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (!((Boolean) ((in0) objArr2[i6]).j(py2Var2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                lk1Var.a(py2Var2);
                z = false;
                py2Var = py2Var2;
            }
            i4++;
        }
        if (((py2) (lk1Var.h() ? null : lk1Var.a[lk1Var.b - 1])) == bz2Var) {
            lk1Var.k(lk1Var.b - 1);
        }
        jk1 jk1Var = lk1Var.c;
        if (jk1Var == null) {
            jk1Var = new jk1(i3, lk1Var);
            lk1Var.c = jk1Var;
        }
        return new qy2(jk1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean p(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        int i2 = wa3.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = va3.d;
            va3 va3Var = (va3) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (va3Var == null) {
                va3Var = new va3();
                va3Var.a = null;
                va3Var.b = null;
                va3Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, va3Var);
            }
            WeakReference weakReference2 = va3Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                va3Var.c = new WeakReference(keyEvent);
                if (va3Var.b == null) {
                    va3Var.b = new SparseArray();
                }
                SparseArray sparseArray = va3Var.b;
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
                    c80.g();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void q(y9 y9Var, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d3 * dSin) + (d2 * dCos)) / d11;
        double d14 = ((d3 * dCos) + ((-d2) * dSin)) / d7;
        double d15 = ((d5 * dSin) + (d4 * dCos)) / d11;
        double d16 = ((d5 * dCos) + ((-d4) * dSin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            q(y9Var, d2, d3, d4, d5, d11 * dSqrt, d7 * dSqrt, d8, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d17 * dSqrt2;
        double d24 = dSqrt2 * d18;
        if (z == z2) {
            d9 = d19 - d24;
            d10 = d20 + d23;
        } else {
            d9 = d19 + d24;
            d10 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d14 - d10, d13 - d9);
        double dAtan22 = Math.atan2(d16 - d10, d15 - d9) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d25 = d9 * d11;
        double d26 = d10 * d7;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d12);
        double dSin2 = Math.sin(d12);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d11;
        double d30 = d29 * dCos2;
        double d31 = d7 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d7 * dCos2;
        double d35 = (dCos3 * d34) + (dSin3 * d33);
        double d36 = dAtan22 / ((double) iCeil);
        double d37 = dAtan2;
        double d38 = d32;
        int i2 = 0;
        double d39 = d35;
        double d40 = d3;
        while (i2 < iCeil) {
            double d41 = d37 + d36;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            int i3 = iCeil;
            double d42 = (((d11 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d43 = (d34 * dSin4) + (d11 * dSin2 * dCos4) + d28;
            double d44 = (d30 * dSin4) - (d31 * dCos4);
            double d45 = (dCos4 * d34) + (dSin4 * d33);
            double d46 = d41 - d37;
            double dTan = Math.tan(d46 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            y9Var.c((float) ((d38 * dSqrt3) + d2), (float) ((d39 * dSqrt3) + d40), (float) (d42 - (dSqrt3 * d44)), (float) (d43 - (dSqrt3 * d45)), (float) d42, (float) d43);
            d36 = d36;
            d2 = d42;
            i2++;
            d33 = d33;
            dSin2 = dSin2;
            d27 = d27;
            d37 = d41;
            d39 = d45;
            d38 = d44;
            iCeil = i3;
            d40 = d43;
            d11 = d6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long r(long j2) {
        long j3 = (j2 << 1) + 1;
        ad0.i.getClass();
        int i2 = cd0.a;
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fp s(int i2) {
        um0 um0Var = um0.k;
        float fG = rg3.G((i2 >> 16) & 255);
        float fG2 = rg3.G((i2 >> 8) & 255);
        float fG3 = rg3.G(i2 & 255);
        double[][] dArr = rg3.d;
        double d2 = fG;
        double[] dArr2 = dArr[0];
        double d3 = fG2;
        double d4 = fG3;
        double d5 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d5, (float) d6, (float) ((d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]))};
        float[][] fArr2 = rg3.a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float[] fArr6 = um0Var.g;
        float f10 = um0Var.e;
        float f11 = um0Var.b;
        float f12 = fArr6[0] * f7;
        float f13 = fArr6[1] * f8;
        float f14 = fArr6[2] * f9;
        float f15 = um0Var.h;
        float fPow = (float) Math.pow((Math.abs(f12) * f15) / 100.0f, 0.41999998688697815d);
        float fPow2 = (float) Math.pow((Math.abs(f13) * f15) / 100.0f, 0.41999998688697815d);
        float fPow3 = (float) Math.pow((Math.abs(f14) * f15) / 100.0f, 0.41999998688697815d);
        float fSignum = ((Math.signum(f12) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f13) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f14) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        float f16 = ((((-12.0f) * fSignum2) + (fSignum * 11.0f)) + fSignum3) / 11.0f;
        float f17 = ((fSignum + fSignum2) - (fSignum3 * 2.0f)) / 9.0f;
        float f18 = fSignum2 * 20.0f;
        float f19 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f18)) / 20.0f;
        float f20 = (((fSignum * 40.0f) + f18) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f21 = fAtan2;
        float f22 = (f21 * 3.1415927f) / 180.0f;
        float fPow4 = ((float) Math.pow((f20 * um0Var.c) / f11, um0Var.j * f10)) * 100.0f;
        float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f21) < 20.14d ? 360.0f + f21 : f21) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * um0Var.f) * um0Var.d) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, um0Var.a)), 0.7300000190734863d)) * ((float) Math.sqrt(fPow4 / 100.0f));
        float f23 = um0Var.i * fPow5;
        Math.sqrt((r2 * f10) / (f11 + 4.0f));
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f22;
        return new fp(f21, fPow5, fPow4, f24, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fp t(float f2, float f3, float f4) {
        float f5 = um0.k.i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(((double) f2) / 100.0d))) * r0.e) / (r0.b + 4.0f));
        float f6 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((((double) f5) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new fp(f4, f3, f2, f6, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String u(vu0 vu0Var) {
        Context context = up0.i;
        if (context == null) {
            t11.S("hostContext");
            throw null;
        }
        String str = up0.l;
        if (str == null) {
            t11.S("moduleApkPath");
            throw null;
        }
        File file = new File(str);
        String str2 = "NukeModuleSign{moduleVersionName = 1.0.2(release), moduleVersionCode = 234, buildTime = 1785243782422, apkLength = " + file.length() + ", apkLastModified = " + file.lastModified() + "}";
        if (yp1.a[vu0Var.ordinal()] != 1) {
            try {
                String str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                str3.getClass();
                try {
                    int i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    StringBuilder sbO = vi0.o("NukeDexCacheSumSign{module = ", str2, ", versionName = ", str3, ", versionCode = ");
                    sbO.append(i2);
                    sbO.append("}");
                    return sbO.toString();
                } catch (Throwable unused) {
                    s.i("Can not get PackageInfo!");
                    return null;
                }
            } catch (Throwable unused2) {
                s.i("Can not get PackageInfo!");
                return null;
            }
        }
        try {
            String str4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            str4.getClass();
            try {
                int i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                String strY = y(vu0Var);
                StringBuilder sbO2 = vi0.o("NukeDexCacheSumSign{module = ", str2, ", versionName = ", str4, ", versionCode = ");
                sbO2.append(i3);
                sbO2.append(", patchId = ");
                sbO2.append(strY);
                sbO2.append("}");
                return sbO2.toString();
            } catch (Throwable unused3) {
                s.i("Can not get PackageInfo!");
                return null;
            }
        } catch (Throwable unused4) {
            s.i("Can not get PackageInfo!");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sx0 v() {
        sx0 sx0Var = k;
        if (sx0Var != null) {
            return sx0Var;
        }
        rx0 rx0Var = new rx0("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = s93.a;
        ft2 ft2Var = new ft2(ju.b);
        ye0 ye0Var = new ye0(3);
        ye0Var.k(12.0f, 2.0f);
        ye0Var.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        ye0Var.m(4.48f, 10.0f, 10.0f, 10.0f);
        ye0Var.m(10.0f, -4.48f, 10.0f, -10.0f);
        ye0Var.l(17.52f, 2.0f, 12.0f, 2.0f);
        ye0Var.c();
        ye0Var.k(13.0f, 17.0f);
        ye0Var.h(-2.0f);
        ye0Var.o(-6.0f);
        ye0Var.h(2.0f);
        ye0Var.o(6.0f);
        ye0Var.c();
        ye0Var.k(13.0f, 9.0f);
        ye0Var.h(-2.0f);
        ye0Var.i(11.0f, 7.0f);
        ye0Var.h(2.0f);
        ye0Var.o(2.0f);
        ye0Var.c();
        rx0.a(rx0Var, ye0Var.a, ft2Var);
        sx0 sx0VarB = rx0Var.b();
        k = sx0VarB;
        return sx0VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Paint w(q9 q9Var) {
        if (q9Var == null) {
            jz0.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + d72.a(q9Var.getClass()).b());
        }
        return (Paint) q9Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object x(ln2 ln2Var, yn2 yn2Var) {
        Object objG = ln2Var.h.g(yn2Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String y(vu0 vu0Var) {
        Object x92Var;
        if (vu0Var != vu0.i) {
            return "";
        }
        try {
            Class clsH = up0.H("com.tencent.mm.boot.BuildConfig");
            hi0 hi0VarR = op0.y(clsH).r();
            hi0VarR.b = "CLIENT_VERSION_ARM64";
            String strValueOf = String.valueOf(((pi0) du.o0(hi0VarR.c())).g0());
            hi0 hi0VarR2 = op0.y(clsH).r();
            hi0VarR2.b = "AAB_ENABLED";
            Object objG0 = ((pi0) du.o0(hi0VarR2.c())).g0();
            objG0.getClass();
            x92Var = (((Boolean) objG0).booleanValue() ? "traditional" : "googlePlay") + "-" + strValueOf;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        return (String) (x92Var instanceof x92 ? "" : x92Var);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void z(PackageInfo packageInfo, File file) {
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
