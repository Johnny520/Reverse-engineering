package Yue;

import Yue.InterfaceC7144;
import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;
import net.bytebuddy.asm.Advice;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6625 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2186 = "PathParser";

    /* JADX INFO: renamed from: Yue.ۥۣۣۡۨ$ۥ */
    public static class C1034 {

        /* JADX INFO: renamed from: ۥ */
        public int f2187;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f2188;
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m3101(ArrayList<C1035> arrayList, char c, float[] fArr) {
        arrayList.add(new C1035(c, fArr));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m3102(@InterfaceC6490 C1035[] c1035Arr, @InterfaceC6490 C1035[] c1035Arr2) {
        if (c1035Arr == null || c1035Arr2 == null || c1035Arr.length != c1035Arr2.length) {
            return false;
        }
        for (int i = 0; i < c1035Arr.length; i++) {
            if (c1035Arr[i].f2189 != c1035Arr2[i].f2189 || c1035Arr[i].f2190.length != c1035Arr2[i].f2190.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static float[] m21065(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C1035[] m21066(@InterfaceC6391 String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 1;
        while (i2 < str.length()) {
            int iM21073 = m21073(str, i2);
            String strTrim = str.substring(i, iM21073).trim();
            if (!strTrim.isEmpty()) {
                m3101(arrayList, strTrim.charAt(0), m21070(strTrim));
            }
            i = iM21073;
            i2 = iM21073 + 1;
        }
        if (i2 - i == 1 && i < str.length()) {
            m3101(arrayList, str.charAt(i), new float[0]);
        }
        return (C1035[]) arrayList.toArray(new C1035[0]);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Path m21067(@InterfaceC6391 String str) {
        Path path = new Path();
        try {
            C1035.m21081(m21066(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C1035[] m21068(@InterfaceC6391 C1035[] c1035Arr) {
        C1035[] c1035Arr2 = new C1035[c1035Arr.length];
        for (int i = 0; i < c1035Arr.length; i++) {
            c1035Arr2[i] = new C1035(c1035Arr[i]);
        }
        return c1035Arr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m21069(String str, int i, C1034 c1034) {
        c1034.f2188 = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = i; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ' ') {
                z = false;
                z3 = true;
                if (z3) {
                }
            } else {
                if (cCharAt != 'E' && cCharAt != 'e') {
                    switch (cCharAt) {
                        case ',':
                            break;
                        case '-':
                            if (i2 == i || z) {
                                z = false;
                            } else {
                                c1034.f2188 = true;
                                z = false;
                                z3 = true;
                            }
                            break;
                        case '.':
                            if (z2) {
                                c1034.f2188 = true;
                                z = false;
                                z3 = true;
                            } else {
                                z = false;
                                z2 = true;
                            }
                            break;
                        default:
                            z = false;
                            break;
                    }
                } else {
                    z = true;
                }
                if (z3) {
                }
            }
            c1034.f2187 = i2;
        }
        c1034.f2187 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static float[] m21070(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C1034 c1034 = new C1034();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                m21069(str, i, c1034);
                int i3 = c1034.f2187;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = c1034.f2188 ? i3 : i3 + 1;
            }
            return m21065(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m21071(@InterfaceC6391 C1035[] c1035Arr, float f, @InterfaceC6391 C1035[] c1035Arr2, @InterfaceC6391 C1035[] c1035Arr3) {
        if (!m21072(c1035Arr, c1035Arr2, c1035Arr3, f)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m21072(@InterfaceC6391 C1035[] c1035Arr, @InterfaceC6391 C1035[] c1035Arr2, @InterfaceC6391 C1035[] c1035Arr3, float f) {
        if (c1035Arr.length != c1035Arr2.length || c1035Arr2.length != c1035Arr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!m3102(c1035Arr2, c1035Arr3)) {
            return false;
        }
        for (int i = 0; i < c1035Arr.length; i++) {
            c1035Arr[i].m21084(c1035Arr2[i], c1035Arr3[i], f);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m21073(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m21074(@InterfaceC6391 C1035[] c1035Arr, @InterfaceC6391 Path path) {
        float[] fArr = new float[6];
        char c = Advice.OffsetMapping.ForOrigin.Renderer.ForMethodName.SYMBOL;
        for (C1035 c1035 : c1035Arr) {
            C1035.m21078(path, fArr, c, c1035.f2189, c1035.f2190);
            c = c1035.f2189;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m21075(@InterfaceC6391 C1035[] c1035Arr, @InterfaceC6391 C1035[] c1035Arr2) {
        for (int i = 0; i < c1035Arr2.length; i++) {
            c1035Arr[i].f2189 = c1035Arr2[i].f2189;
            for (int i2 = 0; i2 < c1035Arr2[i].f2190.length; i2++) {
                c1035Arr[i].f2190[i2] = c1035Arr2[i].f2190[i2];
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۣۡۨ$ۥ۟ */
    public static class C1035 {

        /* JADX INFO: renamed from: ۥ */
        private char f2189;

        /* JADX INFO: renamed from: ۥ۟ */
        private final float[] f2190;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1035(char c, float[] fArr) {
            this.f2189 = c;
            this.f2190 = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m21078(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            int i3;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c3 = c2;
            boolean z = false;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    i2 = i;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    i2 = i;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i2 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i2 = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i4 = 0;
            char c4 = c;
            while (i4 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i3 = i4;
                        int i5 = i3 + 2;
                        int i6 = i3 + 3;
                        int i7 = i3 + 4;
                        int i8 = i3 + 5;
                        path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i5], fArr2[i6], fArr2[i7], fArr2[i8]);
                        f15 = fArr2[i7];
                        float f19 = fArr2[i8];
                        float f20 = fArr2[i5];
                        float f21 = fArr2[i6];
                        f16 = f19;
                        f12 = f21;
                        f11 = f20;
                    } else if (c3 == 'H') {
                        i3 = i4;
                        path.lineTo(fArr2[i3], f16);
                        f15 = fArr2[i3];
                    } else if (c3 == 'Q') {
                        i3 = i4;
                        int i9 = i3 + 1;
                        int i10 = i3 + 2;
                        int i11 = i3 + 3;
                        path.quadTo(fArr2[i3], fArr2[i9], fArr2[i10], fArr2[i11]);
                        float f22 = fArr2[i3];
                        float f23 = fArr2[i9];
                        f15 = fArr2[i10];
                        f16 = fArr2[i11];
                        f11 = f22;
                        f12 = f23;
                    } else if (c3 == 'V') {
                        i3 = i4;
                        path.lineTo(f15, fArr2[i3]);
                        f16 = fArr2[i3];
                    } else if (c3 != 'a') {
                        if (c3 != 'c') {
                            if (c3 == 'h') {
                                path.rLineTo(fArr2[i4], 0.0f);
                                f15 += fArr2[i4];
                            } else if (c3 != 'q') {
                                if (c3 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i4]);
                                    f4 = fArr2[i4];
                                } else if (c3 == 'L') {
                                    int i12 = i4 + 1;
                                    path.lineTo(fArr2[i4], fArr2[i12]);
                                    f15 = fArr2[i4];
                                    f16 = fArr2[i12];
                                } else if (c3 == 'M') {
                                    f15 = fArr2[i4];
                                    f16 = fArr2[i4 + 1];
                                    if (i4 > 0) {
                                        path.lineTo(f15, f16);
                                    } else {
                                        path.moveTo(f15, f16);
                                        i3 = i4;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 'S') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    float f24 = f16;
                                    float f25 = f15;
                                    int i13 = i4 + 1;
                                    int i14 = i4 + 2;
                                    int i15 = i4 + 3;
                                    path.cubicTo(f25, f24, fArr2[i4], fArr2[i13], fArr2[i14], fArr2[i15]);
                                    f = fArr2[i4];
                                    f2 = fArr2[i13];
                                    f15 = fArr2[i14];
                                    f16 = fArr2[i15];
                                    f11 = f;
                                    f12 = f2;
                                } else if (c3 == 'T') {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    int i16 = i4 + 1;
                                    path.quadTo(f15, f16, fArr2[i4], fArr2[i16]);
                                    i3 = i4;
                                    f12 = f16;
                                    f11 = f15;
                                    f15 = fArr2[i4];
                                    f16 = fArr2[i16];
                                } else if (c3 == 'l') {
                                    int i17 = i4 + 1;
                                    path.rLineTo(fArr2[i4], fArr2[i17]);
                                    f15 += fArr2[i4];
                                    f4 = fArr2[i17];
                                } else if (c3 == 'm') {
                                    float f26 = fArr2[i4];
                                    f15 += f26;
                                    float f27 = fArr2[i4 + 1];
                                    f16 += f27;
                                    if (i4 > 0) {
                                        path.rLineTo(f26, f27);
                                    } else {
                                        path.rMoveTo(f26, f27);
                                        i3 = i4;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 's') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        float f28 = f15 - f11;
                                        f5 = f16 - f12;
                                        f6 = f28;
                                    } else {
                                        f6 = 0.0f;
                                        f5 = 0.0f;
                                    }
                                    int i18 = i4 + 1;
                                    int i19 = i4 + 2;
                                    int i20 = i4 + 3;
                                    path.rCubicTo(f6, f5, fArr2[i4], fArr2[i18], fArr2[i19], fArr2[i20]);
                                    f = fArr2[i4] + f15;
                                    f2 = fArr2[i18] + f16;
                                    f15 += fArr2[i19];
                                    f3 = fArr2[i20];
                                } else if (c3 == 't') {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f7 = f15 - f11;
                                        f8 = f16 - f12;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i21 = i4 + 1;
                                    path.rQuadTo(f7, f8, fArr2[i4], fArr2[i21]);
                                    float f29 = f7 + f15;
                                    float f30 = f8 + f16;
                                    f15 += fArr2[i4];
                                    f16 += fArr2[i21];
                                    f12 = f30;
                                    f11 = f29;
                                }
                                f16 += f4;
                            } else {
                                int i22 = i4 + 1;
                                int i23 = i4 + 2;
                                int i24 = i4 + 3;
                                path.rQuadTo(fArr2[i4], fArr2[i22], fArr2[i23], fArr2[i24]);
                                f = fArr2[i4] + f15;
                                f2 = fArr2[i22] + f16;
                                f15 += fArr2[i23];
                                f3 = fArr2[i24];
                            }
                            i3 = i4;
                        } else {
                            int i25 = i4 + 2;
                            int i26 = i4 + 3;
                            int i27 = i4 + 4;
                            int i28 = i4 + 5;
                            path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                            f = fArr2[i25] + f15;
                            f2 = fArr2[i26] + f16;
                            f15 += fArr2[i27];
                            f3 = fArr2[i28];
                        }
                        f16 += f3;
                        f11 = f;
                        f12 = f2;
                        i3 = i4;
                    } else {
                        int i29 = i4 + 5;
                        int i30 = i4 + 6;
                        i3 = i4;
                        m21080(path, f15, f16, fArr2[i29] + f15, fArr2[i30] + f16, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f15 += fArr2[i29];
                        f16 += fArr2[i30];
                    }
                    i4 = i3 + i2;
                    c4 = c2;
                    c3 = c4;
                    z = false;
                } else {
                    i3 = i4;
                    int i31 = i3 + 5;
                    int i32 = i3 + 6;
                    m21080(path, f15, f16, fArr2[i31], fArr2[i32], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f15 = fArr2[i31];
                    f16 = fArr2[i32];
                }
                f12 = f16;
                f11 = f15;
                i4 = i3 + i2;
                c4 = c2;
                c3 = c4;
                z = false;
            }
            fArr[z ? 1 : 0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m21079(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int iCeil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d7);
            double dSin = Math.sin(d7);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * dCos;
            double d13 = d4 * dSin;
            double d14 = (d12 * dSin2) - (d13 * dCos2);
            double d15 = d11 * dSin;
            double d16 = d4 * dCos;
            double d17 = (dSin2 * d15) + (dCos2 * d16);
            double d18 = d9 / ((double) iCeil);
            double d19 = d17;
            double d20 = d14;
            int i = 0;
            double d21 = d5;
            double d22 = d6;
            double d23 = d8;
            while (i < iCeil) {
                double d24 = d23 + d18;
                double dSin3 = Math.sin(d24);
                double dCos3 = Math.cos(d24);
                double d25 = (d + ((d10 * dCos) * dCos3)) - (d13 * dSin3);
                double d26 = d2 + (d10 * dSin * dCos3) + (d16 * dSin3);
                double d27 = (d12 * dSin3) - (d13 * dCos3);
                double d28 = (dSin3 * d15) + (dCos3 * d16);
                double d29 = d24 - d23;
                double dTan = Math.tan(d29 / 2.0d);
                double dSin4 = (Math.sin(d29) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d30 = d21 + (d20 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d30, (float) (d22 + (d19 * dSin4)), (float) (d25 - (dSin4 * d27)), (float) (d26 - (dSin4 * d28)), (float) d25, (float) d26);
                i++;
                d18 = d18;
                dSin = dSin;
                d21 = d25;
                d15 = d15;
                dCos = dCos;
                d23 = d24;
                d19 = d28;
                d20 = d27;
                iCeil = iCeil;
                d22 = d26;
                d10 = d3;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m21080(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            double d4 = d3 * dCos;
            double d5 = f2;
            double d6 = f5;
            double d7 = (d4 + (d5 * dSin)) / d6;
            double d8 = (((double) (-f)) * dSin) + (d5 * dCos);
            double d9 = f6;
            double d10 = d8 / d9;
            double d11 = f4;
            double d12 = ((((double) f3) * dCos) + (d11 * dSin)) / d6;
            double d13 = ((((double) (-f3)) * dSin) + (d11 * dCos)) / d9;
            double d14 = d7 - d12;
            double d15 = d10 - d13;
            double d16 = (d7 + d12) / 2.0d;
            double d17 = (d10 + d13) / 2.0d;
            double d18 = (d14 * d14) + (d15 * d15);
            if (d18 == 0.0d) {
                Log.w(C6625.f2186, " Points are coincident");
                return;
            }
            double d19 = (1.0d / d18) - 0.25d;
            if (d19 < 0.0d) {
                Log.w(C6625.f2186, "Points are too far apart " + d18);
                float fSqrt = (float) (Math.sqrt(d18) / 1.99999d);
                m21080(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d19);
            double d20 = d14 * dSqrt;
            double d21 = dSqrt * d15;
            if (z == z2) {
                d = d16 - d21;
                d2 = d17 + d20;
            } else {
                d = d16 + d21;
                d2 = d17 - d20;
            }
            double dAtan2 = Math.atan2(d10 - d2, d7 - d);
            double dAtan22 = Math.atan2(d13 - d2, d12 - d) - dAtan2;
            if (z2 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d22 = d * d6;
            double d23 = d2 * d9;
            m21079(path, (d22 * dCos) - (d23 * dSin), (d22 * dSin) + (d23 * dCos), d6, d9, d3, d5, radians, dAtan2, dAtan22);
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static void m21081(@InterfaceC6391 C1035[] c1035Arr, @InterfaceC6391 Path path) {
            C6625.m21074(c1035Arr, path);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public float[] m21082() {
            return this.f2190;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public char m21083() {
            return this.f2189;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m21084(@InterfaceC6391 C1035 c1035, @InterfaceC6391 C1035 c10352, float f) {
            this.f2189 = c1035.f2189;
            int i = 0;
            while (true) {
                float[] fArr = c1035.f2190;
                if (i >= fArr.length) {
                    return;
                }
                this.f2190[i] = (fArr[i] * (1.0f - f)) + (c10352.f2190[i] * f);
                i++;
            }
        }

        public C1035(C1035 c1035) {
            this.f2189 = c1035.f2189;
            float[] fArr = c1035.f2190;
            this.f2190 = C6625.m21065(fArr, 0, fArr.length);
        }
    }
}
