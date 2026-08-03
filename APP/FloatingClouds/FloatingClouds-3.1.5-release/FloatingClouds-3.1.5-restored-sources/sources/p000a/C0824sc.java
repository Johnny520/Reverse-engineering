package p000a;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: a.sc */
/* JADX INFO: loaded from: classes.dex */
public final class C0824sc {
    /* JADX INFO: renamed from: a */
    public static float[] m1921a(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a[] m1922b(String str) {
        int i;
        String strTrim;
        float[] fArrM1921a;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    }
                    i4++;
                }
                if (cCharAt == 'e' || cCharAt == 'E') {
                    i4++;
                } else {
                    strTrim = str.substring(i3, i4).trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.charAt(i2) == 'z' || strTrim.charAt(i2) == 'Z') {
                            fArrM1921a = new float[i2];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < strTrim.length(); i11++) {
                                        char cCharAt2 = strTrim.charAt(i11);
                                        if (cCharAt2 == ' ') {
                                            i7 = 0;
                                            i9 = 1;
                                            if (i9 != 0) {
                                            }
                                        } else {
                                            if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 != 0) {
                                            }
                                        }
                                        if (i6 < i11) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                            i5++;
                                        }
                                        i6 = i10 == 0 ? i11 : i11 + 1;
                                        i2 = 0;
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArrM1921a = m1921a(fArr, i5);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(C0944z.m2227g("error in parsing \"", strTrim, "\""), e);
                            }
                        }
                        arrayList.add(new a(strTrim.charAt(i2), fArrM1921a));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
            }
            strTrim = str.substring(i3, i4).trim();
            if (!strTrim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new a(str.charAt(i3), new float[0]));
        }
        return (a[]) arrayList.toArray(new a[i]);
    }

    /* JADX INFO: renamed from: c */
    public static a[] m1923c(a[] aVarArr) {
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr2[i] = new a(aVarArr[i]);
        }
        return aVarArr2;
    }

    /* JADX INFO: renamed from: a.sc$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public char f3282a;

        /* JADX INFO: renamed from: b */
        public final float[] f3283b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(char c, float[] fArr) {
            this.f3282a = c;
            this.f3283b = fArr;
        }

        /* JADX INFO: renamed from: a */
        public static void m1924a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            double d4 = f2;
            double d5 = f5;
            double d6 = ((d4 * dSin) + (d3 * dCos)) / d5;
            double d7 = f6;
            double d8 = ((d4 * dCos) + (((double) (-f)) * dSin)) / d7;
            double d9 = f4;
            double d10 = ((d9 * dSin) + (((double) f3) * dCos)) / d5;
            double d11 = ((d9 * dCos) + (((double) (-f3)) * dSin)) / d7;
            double d12 = d6 - d10;
            double d13 = d8 - d11;
            double d14 = (d6 + d10) / 2.0d;
            double d15 = (d8 + d11) / 2.0d;
            double d16 = (d13 * d13) + (d12 * d12);
            if (d16 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d17 = (1.0d / d16) - 0.25d;
            if (d17 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d16);
                float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
                m1924a(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d17);
            double d18 = dSqrt * d12;
            double d19 = dSqrt * d13;
            if (z == z2) {
                d = d14 - d19;
                d2 = d15 + d18;
            } else {
                d = d14 + d19;
                d2 = d15 - d18;
            }
            double dAtan2 = Math.atan2(d8 - d2, d6 - d);
            double dAtan22 = Math.atan2(d11 - d2, d10 - d) - dAtan2;
            if (z2 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d20 = d * d5;
            double d21 = d2 * d7;
            double d22 = (d20 * dCos) - (d21 * dSin);
            double d23 = (d21 * dCos) + (d20 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(radians);
            double dSin2 = Math.sin(radians);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d24 = -d5;
            double d25 = d24 * dCos2;
            double d26 = d7 * dSin2;
            double d27 = (d25 * dSin3) - (d26 * dCos3);
            double d28 = d24 * dSin2;
            double d29 = d7 * dCos2;
            double d30 = dAtan22 / ((double) iCeil);
            double d31 = (dCos3 * d29) + (dSin3 * d28);
            double d32 = d3;
            double d33 = d4;
            int i = 0;
            double d34 = dAtan2;
            while (i < iCeil) {
                double d35 = d34 + d30;
                double dSin4 = Math.sin(d35);
                double dCos4 = Math.cos(d35);
                int i2 = iCeil;
                double d36 = (((d5 * dCos2) * dCos4) + d22) - (d26 * dSin4);
                double d37 = (d29 * dSin4) + (d5 * dSin2 * dCos4) + d23;
                double d38 = (d25 * dSin4) - (d26 * dCos4);
                double d39 = (dCos4 * d29) + (dSin4 * d28);
                double d40 = d35 - d34;
                double dTan = Math.tan(d40 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d40)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d27 * dSqrt2) + d32), (float) ((d31 * dSqrt2) + d33), (float) (d36 - (dSqrt2 * d38)), (float) (d37 - (dSqrt2 * d39)), (float) d36, (float) d37);
                i++;
                d33 = d37;
                dCos2 = dCos2;
                d28 = d28;
                d34 = d35;
                d31 = d39;
                d32 = d36;
                iCeil = i2;
                d27 = d38;
                d30 = d30;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r10v8, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r9v4, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r9v7, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r9v8, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r9v9, resolved type: boolean */
        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated
        /* JADX INFO: renamed from: b */
        public static void m1925b(a[] aVarArr, Path path) {
            int i;
            int i2;
            a aVar;
            int i3;
            char c;
            float f;
            float f2;
            float f3;
            float f4;
            a aVar2;
            boolean z;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            Path path2 = path;
            float[] fArr = new float[6];
            int length = aVarArr.length;
            char c2 = 'm';
            int i4 = 0;
            char c3 = 'm';
            int i5 = 0;
            while (i5 < length) {
                a aVar3 = aVarArr[i5];
                char c4 = aVar3.f3282a;
                float f13 = fArr[i4];
                float f14 = fArr[1];
                float f15 = fArr[2];
                float f16 = fArr[3];
                float f17 = fArr[4];
                float f18 = fArr[5];
                switch (c4) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path2.close();
                        path2.moveTo(f17, f18);
                        f13 = f17;
                        f15 = f13;
                        f14 = f18;
                        f16 = f14;
                    default:
                        i = 2;
                        break;
                }
                float f19 = f14;
                float f20 = f17;
                float f21 = f18;
                float f22 = f13;
                int i6 = i4;
                while (true) {
                    float[] fArr2 = aVar3.f3283b;
                    if (i6 < fArr2.length) {
                        int i7 = i4;
                        if (c4 == 'A') {
                            i2 = i6;
                            aVar = aVar3;
                            float f23 = f22;
                            float f24 = f19;
                            i3 = i5;
                            c = c4;
                            int i8 = i2 + 5;
                            int i9 = i2 + 6;
                            m1924a(path, f23, f24, fArr2[i8], fArr2[i9], fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f ? 1 : i7, fArr2[i2 + 4] != 0.0f ? 1 : i7);
                            f15 = fArr2[i8];
                            f = fArr2[i9];
                            f16 = f;
                            f2 = f15;
                        } else if (c4 == 'C') {
                            i2 = i6;
                            i3 = i5;
                            aVar = aVar3;
                            c = c4;
                            int i10 = i2 + 2;
                            int i11 = i2 + 3;
                            int i12 = i2 + 4;
                            int i13 = i2 + 5;
                            path2.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                            float f25 = fArr2[i12];
                            float f26 = fArr2[i13];
                            f15 = fArr2[i10];
                            f16 = fArr2[i11];
                            f = f26;
                            f2 = f25;
                        } else if (c4 != 'H') {
                            if (c4 == 'Q') {
                                i2 = i6;
                                i3 = i5;
                                aVar = aVar3;
                                c = c4;
                                int i14 = i2 + 1;
                                int i15 = i2 + 2;
                                int i16 = i2 + 3;
                                path2.quadTo(fArr2[i2], fArr2[i14], fArr2[i15], fArr2[i16]);
                                f3 = fArr2[i2];
                                float f27 = fArr2[i14];
                                f4 = fArr2[i15];
                                f16 = f27;
                                f = fArr2[i16];
                            } else if (c4 == 'V') {
                                i2 = i6;
                                i3 = i5;
                                aVar = aVar3;
                                f2 = f22;
                                c = c4;
                                path2.lineTo(f2, fArr2[i2]);
                                f = fArr2[i2];
                            } else if (c4 != 'a') {
                                if (c4 == 'c') {
                                    i2 = i6;
                                    int i17 = i2 + 2;
                                    int i18 = i2 + 3;
                                    int i19 = i2 + 4;
                                    int i20 = i2 + 5;
                                    path2.rCubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i20]);
                                    float f28 = fArr2[i17] + f22;
                                    float f29 = f19 + fArr2[i18];
                                    f22 += fArr2[i19];
                                    f19 += fArr2[i20];
                                    f15 = f28;
                                    f16 = f29;
                                } else if (c4 != 'h') {
                                    if (c4 != 'q') {
                                        if (c4 != 'v') {
                                            if (c4 == 'L') {
                                                i2 = i6;
                                                int i21 = i2 + 1;
                                                path2.lineTo(fArr2[i2], fArr2[i21]);
                                                f2 = fArr2[i2];
                                                f = fArr2[i21];
                                            } else if (c4 == 'M') {
                                                i2 = i6;
                                                f2 = fArr2[i2];
                                                f = fArr2[i2 + 1];
                                                if (i2 > 0) {
                                                    path2.lineTo(f2, f);
                                                } else {
                                                    path2.moveTo(f2, f);
                                                    f20 = f2;
                                                    f21 = f;
                                                }
                                            } else if (c4 == 'S') {
                                                i2 = i6;
                                                if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                    f22 = (f22 * 2.0f) - f15;
                                                    f19 = (f19 * 2.0f) - f16;
                                                }
                                                float f30 = f22;
                                                float f31 = f19;
                                                int i22 = i2 + 1;
                                                int i23 = i2 + 2;
                                                int i24 = i2 + 3;
                                                path2.cubicTo(f30, f31, fArr2[i2], fArr2[i22], fArr2[i23], fArr2[i24]);
                                                f3 = fArr2[i2];
                                                float f32 = fArr2[i22];
                                                f4 = fArr2[i23];
                                                f16 = f32;
                                                f = fArr2[i24];
                                                i3 = i5;
                                                aVar = aVar3;
                                                c = c4;
                                            } else if (c4 == 'T') {
                                                i2 = i6;
                                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                    f22 = (f22 * 2.0f) - f15;
                                                    f19 = (f19 * 2.0f) - f16;
                                                }
                                                float f33 = f19;
                                                float f34 = fArr2[i2];
                                                int i25 = i2 + 1;
                                                path2.quadTo(f22, f33, f34, fArr2[i25]);
                                                f16 = f33;
                                                f2 = fArr2[i2];
                                                f = fArr2[i25];
                                                i3 = i5;
                                                aVar = aVar3;
                                                f15 = f22;
                                                c = c4;
                                            } else if (c4 == 'l') {
                                                i2 = i6;
                                                int i26 = i2 + 1;
                                                path2.rLineTo(fArr2[i2], fArr2[i26]);
                                                f22 += fArr2[i2];
                                                f8 = fArr2[i26];
                                            } else if (c4 == c2) {
                                                i2 = i6;
                                                float f35 = fArr2[i2];
                                                f22 += f35;
                                                float f36 = fArr2[i2 + 1];
                                                f19 += f36;
                                                if (i2 > 0) {
                                                    path2.rLineTo(f35, f36);
                                                } else {
                                                    path2.rMoveTo(f35, f36);
                                                    aVar = aVar3;
                                                    f2 = f22;
                                                    f20 = f2;
                                                    f = f19;
                                                    f21 = f;
                                                    i3 = i5;
                                                    c = c4;
                                                }
                                            } else if (c4 == 's') {
                                                if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                    f9 = f19 - f16;
                                                    f10 = f22 - f15;
                                                } else {
                                                    f10 = 0.0f;
                                                    f9 = 0.0f;
                                                }
                                                int i27 = i6 + 1;
                                                int i28 = i6 + 2;
                                                int i29 = i6 + 3;
                                                i2 = i6;
                                                path2.rCubicTo(f10, f9, fArr2[i6], fArr2[i27], fArr2[i28], fArr2[i29]);
                                                f5 = fArr2[i2] + f22;
                                                f6 = f19 + fArr2[i27];
                                                f22 += fArr2[i28];
                                                f7 = fArr2[i29];
                                            } else if (c4 != 't') {
                                                i2 = i6;
                                            } else {
                                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                    f11 = f22 - f15;
                                                    f12 = f19 - f16;
                                                } else {
                                                    f12 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                int i30 = i6 + 1;
                                                path2.rQuadTo(f11, f12, fArr2[i6], fArr2[i30]);
                                                float f37 = f11 + f22;
                                                float f38 = f19 + f12;
                                                float f39 = f22 + fArr2[i6];
                                                f19 += fArr2[i30];
                                                f16 = f38;
                                                i2 = i6;
                                                aVar = aVar3;
                                                f2 = f39;
                                                f15 = f37;
                                                f = f19;
                                                i3 = i5;
                                                c = c4;
                                            }
                                            i3 = i5;
                                            aVar = aVar3;
                                            c = c4;
                                        } else {
                                            i2 = i6;
                                            path2.rLineTo(0.0f, fArr2[i2]);
                                            f8 = fArr2[i2];
                                        }
                                        f19 += f8;
                                    } else {
                                        i2 = i6;
                                        int i31 = i2 + 1;
                                        int i32 = i2 + 2;
                                        int i33 = i2 + 3;
                                        path2.rQuadTo(fArr2[i2], fArr2[i31], fArr2[i32], fArr2[i33]);
                                        f5 = fArr2[i2] + f22;
                                        f6 = f19 + fArr2[i31];
                                        f22 += fArr2[i32];
                                        f7 = fArr2[i33];
                                    }
                                    f19 += f7;
                                    f15 = f5;
                                    f16 = f6;
                                } else {
                                    i2 = i6;
                                    path2.rLineTo(fArr2[i2], 0.0f);
                                    f22 += fArr2[i2];
                                }
                                aVar = aVar3;
                                f2 = f22;
                                f = f19;
                                i3 = i5;
                                c = c4;
                            } else {
                                i2 = i6;
                                int i34 = i2 + 5;
                                float f40 = fArr2[i34] + f22;
                                int i35 = i2 + 6;
                                float f41 = fArr2[i35] + f19;
                                float f42 = fArr2[i2];
                                float f43 = fArr2[i2 + 1];
                                float f44 = fArr2[i2 + 2];
                                if (fArr2[i2 + 3] != 0.0f) {
                                    aVar2 = aVar3;
                                    z = 1;
                                } else {
                                    aVar2 = aVar3;
                                    z = i7;
                                }
                                aVar = aVar2;
                                float f45 = f22;
                                c = c4;
                                float f46 = f19;
                                i3 = i5;
                                m1924a(path, f45, f46, f40, f41, f42, f43, f44, z, fArr2[i2 + 4] != 0.0f ? 1 : i7);
                                f2 = f45 + fArr2[i34];
                                f = f46 + fArr2[i35];
                                f15 = f2;
                                f16 = f;
                            }
                            f15 = f3;
                            f2 = f4;
                        } else {
                            i2 = i6;
                            aVar = aVar3;
                            c = c4;
                            f = f19;
                            i3 = i5;
                            path2.lineTo(fArr2[i2], f);
                            f2 = fArr2[i2];
                        }
                        c4 = c;
                        aVar3 = aVar;
                        i5 = i3;
                        i4 = i7;
                        c2 = 'm';
                        f22 = f2;
                        f19 = f;
                        c3 = c4;
                        i6 = i2 + i;
                        path2 = path;
                    }
                }
                int i36 = i4;
                fArr[i36] = f22;
                fArr[1] = f19;
                fArr[2] = f15;
                fArr[3] = f16;
                fArr[4] = f20;
                fArr[5] = f21;
                c3 = aVar3.f3282a;
                i5++;
                path2 = path;
                i4 = i36;
                c2 = 'm';
            }
        }

        public a(a aVar) {
            this.f3282a = aVar.f3282a;
            float[] fArr = aVar.f3283b;
            this.f3283b = C0824sc.m1921a(fArr, fArr.length);
        }
    }
}
