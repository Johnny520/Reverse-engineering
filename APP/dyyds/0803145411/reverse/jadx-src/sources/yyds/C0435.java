package yyds;

/* JADX INFO: renamed from: yyds.ᛲᲀᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0435 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f2201;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int[] f2202;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int[] f2203;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C0680 f2204;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int[] f2205;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public short f2206;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int[] f2207;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public short f2208;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int[] f2209;

    public C0435(C0680 c0680) {
        this.f2204 = c0680;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1210(C1450 c1450, int i, int[] iArr, int i2) {
        int iMin;
        int iM2958;
        long j;
        long j2;
        int i3;
        int i4 = i;
        int i5 = iArr[i2];
        if (i5 != i4) {
            if ((67108863 & i4) != 4194309) {
                if (i5 != 0) {
                    iArr[i2] = i4;
                    return true;
                }
                int i6 = i5 & (-67108864);
                int i7 = 4194304;
                if (i6 != 0 || (i5 & 62914560) == 8388608) {
                    if (i4 != 4194309) {
                        String strReplace = "java/lang/Object";
                        if ((i4 & (-4194304)) != ((-4194304) & i5)) {
                            int i8 = i4 & (-67108864);
                            if (i8 != 0 || (i4 & 62914560) == 8388608) {
                                if (i8 != 0 && (i4 & 62914560) != 8388608) {
                                    i8 -= 67108864;
                                }
                                if (i6 != 0 && (i5 & 62914560) != 8388608) {
                                    i6 -= 67108864;
                                }
                                iMin = Math.min(i8, i6) | 8388608;
                                iM2958 = c1450.m2958("java/lang/Object");
                                i7 = iMin | iM2958;
                            }
                        } else if ((i5 & 62914560) == 8388608) {
                            int i9 = (i4 & (-67108864)) | 8388608;
                            int i10 = i4 & 1048575;
                            int i11 = 1048575 & i5;
                            c1450.getClass();
                            if (i10 < i11) {
                                j = i10;
                                j2 = i11;
                            } else {
                                j = i11;
                                j2 = i10;
                            }
                            long j3 = j | (j2 << 32);
                            int i12 = (i10 + i11 + 131) & Integer.MAX_VALUE;
                            C0029 c0029M2949 = c1450.m2949(i12);
                            while (true) {
                                if (c0029M2949 == null) {
                                    C0029[] c0029Arr = c1450.f6876;
                                    String str = c0029Arr[i10].f11715;
                                    String str2 = c0029Arr[i11].f11715;
                                    ClassLoader classLoader = C1072.class.getClassLoader();
                                    try {
                                        Class<?> cls = Class.forName(str.replace('/', '.'), false, classLoader);
                                        try {
                                            Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, classLoader);
                                            if (cls.isAssignableFrom(cls2)) {
                                                strReplace = str;
                                            } else if (cls2.isAssignableFrom(cls)) {
                                                strReplace = str2;
                                            } else if (!cls.isInterface() && !cls2.isInterface()) {
                                                do {
                                                    cls = cls.getSuperclass();
                                                } while (!cls.isAssignableFrom(cls2));
                                                strReplace = cls.getName().replace('.', '/');
                                            }
                                            int iM29582 = c1450.m2958(strReplace);
                                            C0029 c0029 = new C0029(c1450.f6878, 131, j3, i12);
                                            c1450.m2955(c0029);
                                            c0029.f11718 = iM29582;
                                            i3 = iM29582;
                                        } catch (ClassNotFoundException e) {
                                            throw new TypeNotPresentException(str2, e);
                                        }
                                    } catch (ClassNotFoundException e2) {
                                        throw new TypeNotPresentException(str, e2);
                                    }
                                } else {
                                    if (c0029M2949.f11717 == 131 && c0029M2949.f11713 == i12 && c0029M2949.f11720 == j3) {
                                        i3 = c0029M2949.f11718;
                                        break;
                                    }
                                    c0029M2949 = c0029M2949.f11714;
                                }
                            }
                            i7 = i9 | i3;
                        } else {
                            iMin = ((i4 & (-67108864)) - 67108864) | 8388608;
                            iM2958 = c1450.m2958("java/lang/Object");
                            i7 = iMin | iM2958;
                        }
                    }
                } else if (i5 == 4194309) {
                    if ((i4 & (-67108864)) == 0 && (i4 & 62914560) != 8388608) {
                        i4 = 4194304;
                    }
                    i7 = i4;
                }
                if (i7 != i5) {
                    iArr[i2] = i7;
                    return true;
                }
            } else if (i5 != 4194309) {
                i4 = 4194309;
                if (i5 != 0) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m1211(C1450 c1450, Object obj) {
        int iM2959;
        int i;
        if (obj instanceof Integer) {
            iM2959 = ((Integer) obj).intValue();
            i = 4194304;
        } else {
            if (obj instanceof String) {
                String str = (String) obj;
                char c = str.charAt(0) == '[' ? '\t' : '\f';
                int length = str.length();
                return m1212(c1450, c == '\n' ? str.substring(0 - 1, length + 1) : c == '\f' ? AbstractC2104.m4014("L", str.substring(0, length), ";") : str.substring(0, length), 0);
            }
            C0680 c0680 = (C0680) obj;
            if ((c0680.f3234 & 4) != 0) {
                iM2959 = c1450.m2951(c0680.f3242, "");
                i = 12582912;
            } else {
                if (c1450.f6868 == null) {
                    c1450.f6868 = new C1607[16];
                    c1450.f6870 = new C1607[16];
                }
                int iIdentityHashCode = System.identityHashCode(c0680);
                C1607[] c1607Arr = c1450.f6868;
                C1607 c1607 = c1607Arr[iIdentityHashCode % c1607Arr.length];
                while (c1607 != null && ((C0680) c1607.f8179) != c0680) {
                    c1607 = (C1607) c1607.f8180;
                }
                if (c1607 == null) {
                    int i2 = c1450.f6877;
                    C1607[] c1607Arr2 = c1450.f6868;
                    if (i2 > (c1607Arr2.length * 3) / 4) {
                        int length2 = c1607Arr2.length;
                        int i3 = (length2 * 2) + 1;
                        C1607[] c1607Arr3 = new C1607[i3];
                        for (int i4 = length2 - 1; i4 >= 0; i4--) {
                            C1607 c16072 = c1450.f6868[i4];
                            while (c16072 != null) {
                                int iIdentityHashCode2 = System.identityHashCode((C0680) c16072.f8179) % i3;
                                C1607 c16073 = (C1607) c16072.f8180;
                                c16072.f8180 = c1607Arr3[iIdentityHashCode2];
                                c1607Arr3[iIdentityHashCode2] = c16072;
                                c16072 = c16073;
                            }
                        }
                        c1450.f6868 = c1607Arr3;
                    }
                    int i5 = c1450.f6877;
                    C1607[] c1607Arr4 = c1450.f6870;
                    if (i5 == c1607Arr4.length) {
                        C1607[] c1607Arr5 = new C1607[c1607Arr4.length * 2];
                        System.arraycopy(c1607Arr4, 0, c1607Arr5, 0, c1607Arr4.length);
                        c1450.f6870 = c1607Arr5;
                        c1607Arr4 = c1607Arr5;
                    }
                    int i6 = c1450.f6877;
                    C1607 c16074 = new C1607(i6, c0680);
                    C1607[] c1607Arr6 = c1450.f6868;
                    int length3 = iIdentityHashCode % c1607Arr6.length;
                    c16074.f8180 = c1607Arr6[length3];
                    c1607Arr6[length3] = c16074;
                    c1450.f6877 = i6 + 1;
                    c1607Arr4[i6] = c16074;
                    c1607 = c16074;
                }
                int i7 = c1607.f8178;
                int i8 = (130 + i7) & Integer.MAX_VALUE;
                C0029 c0029M2949 = c1450.m2949(i8);
                while (true) {
                    if (c0029M2949 == null) {
                        iM2959 = c1450.m2959(new C0029(c1450.f6878, 130, "", i7, i8));
                        break;
                    }
                    if (c0029M2949.f11717 == 130 && c0029M2949.f11713 == i8 && c0029M2949.f11720 == i7 && c0029M2949.f11715.equals("")) {
                        iM2959 = c0029M2949.f11716;
                        break;
                    }
                    c0029M2949 = c0029M2949.f11714;
                }
                i = 16777216;
            }
        }
        return iM2959 | i;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static int m1212(C1450 c1450, String str, int i) {
        int iM2958;
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return 4194306;
        }
        if (cCharAt == 'L') {
            return c1450.m2958(str.substring(i + 1, str.length() - 1)) | 8388608;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 4194308;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i2 = i + 1;
                        while (str.charAt(i2) == '[') {
                            i2++;
                        }
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 == 'F') {
                            iM2958 = 4194306;
                        } else if (cCharAt2 == 'L') {
                            iM2958 = c1450.m2958(str.substring(i2 + 1, str.length() - 1)) | 8388608;
                        } else if (cCharAt2 == 'S') {
                            iM2958 = 4194316;
                        } else if (cCharAt2 == 'Z') {
                            iM2958 = 4194313;
                        } else if (cCharAt2 == 'I') {
                            iM2958 = 4194305;
                        } else if (cCharAt2 != 'J') {
                            switch (cCharAt2) {
                                case 'B':
                                    iM2958 = 4194314;
                                    break;
                                case 'C':
                                    iM2958 = 4194315;
                                    break;
                                case 'D':
                                    iM2958 = 4194307;
                                    break;
                                default:
                                    C0188.m798("Invalid descriptor fragment: ".concat(str.substring(i2)));
                                    return 0;
                            }
                        } else {
                            iM2958 = 4194308;
                        }
                        return ((i2 - i) << 26) | iM2958;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 4194307;
                        default:
                            C0188.m798("Invalid descriptor: ".concat(str.substring(i)));
                            return 0;
                    }
                }
            }
        }
        return 4194305;
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void m1213(C1450 c1450, String str) {
        int i = 0;
        if (str.charAt(0) == '(') {
            int iMax = 1;
            while (str.charAt(iMax) != ')') {
                while (str.charAt(iMax) == '[') {
                    iMax++;
                }
                int i2 = iMax + 1;
                iMax = str.charAt(iMax) == 'L' ? Math.max(i2, str.indexOf(59, i2) + 1) : i2;
            }
            i = 1 + iMax;
        }
        int iM1212 = m1212(c1450, str, i);
        if (iM1212 != 0) {
            m1214(iM1212);
            if (iM1212 == 4194308 || iM1212 == 4194307) {
                m1214(4194304);
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m1214(int i) {
        int[] iArr = this.f2203;
        if (iArr == null) {
            iArr = new int[10];
            this.f2203 = iArr;
        }
        int length = iArr.length;
        short s = this.f2206;
        if (s >= length) {
            iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.f2203, 0, iArr, 0, length);
            this.f2203 = iArr;
        }
        short s2 = this.f2206;
        short s3 = (short) (s2 + 1);
        this.f2206 = s3;
        iArr[s2] = i;
        short s4 = (short) (this.f2208 + s3);
        C0680 c0680 = this.f2204;
        if (s4 > c0680.f3230) {
            c0680.f3230 = s4;
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean m1215(C1450 c1450, C0435 c0435, int i) {
        boolean zM1210;
        int i2;
        int length = this.f2205.length;
        int length2 = this.f2207.length;
        boolean zM12102 = true;
        if (c0435.f2205 == null) {
            c0435.f2205 = new int[length];
            zM1210 = true;
        } else {
            zM1210 = false;
        }
        int i3 = 0;
        while (i3 < length) {
            int[] iArr = this.f2209;
            int iM1224 = (iArr == null || i3 >= iArr.length || (i2 = iArr[i3]) == 0) ? this.f2205[i3] : m1216(i2, length2);
            if (this.f2202 != null) {
                iM1224 = m1224(c1450, iM1224);
            }
            zM1210 |= m1210(c1450, iM1224, c0435.f2205, i3);
            i3++;
        }
        if (i > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                zM1210 |= m1210(c1450, this.f2205[i4], c0435.f2205, i4);
            }
            int[] iArr2 = c0435.f2207;
            if (iArr2 == null) {
                iArr2 = new int[1];
                c0435.f2207 = iArr2;
            } else {
                zM12102 = zM1210;
            }
            return m1210(c1450, i, iArr2, 0) | zM12102;
        }
        int length3 = this.f2207.length + this.f2208;
        if (c0435.f2207 == null) {
            c0435.f2207 = new int[this.f2206 + length3];
        } else {
            zM12102 = zM1210;
        }
        for (int i5 = 0; i5 < length3; i5++) {
            int iM12242 = this.f2207[i5];
            if (this.f2202 != null) {
                iM12242 = m1224(c1450, iM12242);
            }
            zM12102 |= m1210(c1450, iM12242, c0435.f2207, i5);
        }
        for (int i6 = 0; i6 < this.f2206; i6++) {
            int iM1216 = m1216(this.f2203[i6], length2);
            if (this.f2202 != null) {
                iM1216 = m1224(c1450, iM1216);
            }
            zM12102 |= m1210(c1450, iM1216, c0435.f2207, length3 + i6);
        }
        return zM12102;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int m1216(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 20971520) {
            int i5 = i3 + this.f2205[i & 1048575];
            if ((i & 1048576) == 0 || !(i5 == 4194308 || i5 == 4194307)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != 25165824) {
            return i;
        }
        int i6 = i3 + this.f2207[i2 - (i & 1048575)];
        if ((i & 1048576) == 0 || !(i6 == 4194308 || i6 == 4194307)) {
            return i6;
        }
        return 4194304;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1217(C1399 c1399) {
        int[] iArr = this.f2205;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i2 >= iArr.length) {
                break;
            }
            int i6 = iArr[i2];
            if (i6 != 4194308 && i6 != 4194307) {
                i5 = 1;
            }
            i2 += i5;
            if (i6 == 4194304) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
        }
        int[] iArr2 = this.f2207;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 4194308 || i9 == 4194307) ? 2 : 1;
            i8++;
        }
        c1399.m2812(this.f2204.f3242, i3, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 4194308 || i13 == 4194307) ? 2 : 1;
            c1399.f6540[i10] = i13;
            i3 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 <= 0) {
                c1399.m2823();
                return;
            }
            int i15 = iArr2[i];
            i += (i15 == 4194308 || i15 == 4194307) ? 2 : 1;
            c1399.f6540[i10] = i15;
            i8 = i14;
            i10++;
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m1218(C1450 c1450, int i, String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.f2205 = iArr;
        this.f2207 = new int[0];
        if ((i & 8) == 0) {
            if ((i & 262144) == 0) {
                iArr[0] = c1450.m2958(c1450.f6879) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
            i3 = 1;
        } else {
            i3 = 0;
        }
        int iM2593 = C1308.m2593(str);
        C1308[] c1308Arr = new C1308[iM2593];
        int i4 = 0;
        int i5 = 1;
        while (str.charAt(i5) != ')') {
            int i6 = i5;
            while (str.charAt(i6) == '[') {
                i6++;
            }
            int iMax = i6 + 1;
            if (str.charAt(i6) == 'L') {
                iMax = Math.max(iMax, str.indexOf(59, iMax) + 1);
            }
            c1308Arr[i4] = C1308.m2590(str, i5, iMax);
            i4++;
            i5 = iMax;
        }
        for (int i7 = 0; i7 < iM2593; i7++) {
            int iM1212 = m1212(c1450, c1308Arr[i7].m2597(), 0);
            int[] iArr2 = this.f2205;
            int i8 = i3 + 1;
            iArr2[i3] = iM1212;
            if (iM1212 == 4194308 || iM1212 == 4194307) {
                i3 += 2;
                iArr2[i8] = 4194304;
            } else {
                i3 = i8;
            }
        }
        while (i3 < i2) {
            this.f2205[i3] = 4194304;
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0332  */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo726(int i, int i2, C0029 c0029, C1450 c1450) {
        switch (i) {
            case 0:
                return;
            case 1:
                m1214(4194309);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                m1214(4194305);
                return;
            case 9:
            case 10:
                m1214(4194308);
                m1214(4194304);
                return;
            case 11:
            case 12:
            case 13:
                m1214(4194306);
                return;
            case 14:
            case 15:
                m1214(4194307);
                m1214(4194304);
                return;
            case 18:
                int i3 = c0029.f11717;
                switch (i3) {
                    case 3:
                        m1214(4194305);
                        return;
                    case 4:
                        m1214(4194306);
                        return;
                    case 5:
                        m1214(4194308);
                        m1214(4194304);
                        return;
                    case 6:
                        m1214(4194307);
                        m1214(4194304);
                        return;
                    case 7:
                        m1214(c1450.m2958("java/lang/Class") | 8388608);
                        return;
                    case 8:
                        m1214(c1450.m2958("java/lang/String") | 8388608);
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                m1214(c1450.m2958("java/lang/invoke/MethodHandle") | 8388608);
                                return;
                            case 16:
                                m1214(c1450.m2958("java/lang/invoke/MethodType") | 8388608);
                                return;
                            case 17:
                                m1213(c1450, c0029.f11715);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i) {
                    case 21:
                        break;
                    case 22:
                        break;
                    case 23:
                        break;
                    case 24:
                        break;
                    case 25:
                        m1214(m1219(i2));
                        return;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                m1220(2);
                                m1214(4194305);
                                return;
                            case 47:
                                m1220(2);
                                m1214(4194308);
                                m1214(4194304);
                                return;
                            case 48:
                                m1220(2);
                                m1214(4194306);
                                return;
                            case 49:
                                m1220(2);
                                m1214(4194307);
                                m1214(4194304);
                                return;
                            case 50:
                                m1220(1);
                                int iM1222 = m1222();
                                if (iM1222 != 4194309) {
                                    iM1222 -= 67108864;
                                }
                                m1214(iM1222);
                                return;
                            case 54:
                            case 56:
                            case 58:
                                m1223(i2, m1222());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int iM1219 = m1219(i4);
                                    if (iM1219 == 4194308 || iM1219 == 4194307) {
                                        m1223(i4, 4194304);
                                        return;
                                    }
                                    int i5 = iM1219 & 62914560;
                                    if (i5 == 20971520 || i5 == 25165824) {
                                        m1223(i4, iM1219 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 55:
                            case 57:
                                m1220(1);
                                m1223(i2, m1222());
                                m1223(i2 + 1, 4194304);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int iM12192 = m1219(i6);
                                    if (iM12192 == 4194308 || iM12192 == 4194307) {
                                        m1223(i6, 4194304);
                                        return;
                                    }
                                    int i7 = iM12192 & 62914560;
                                    if (i7 == 20971520 || i7 == 25165824) {
                                        m1223(i6, iM12192 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case 79:
                                    case 81:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        m1220(3);
                                        return;
                                    case 80:
                                    case 82:
                                        m1220(4);
                                        return;
                                    case 87:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 170:
                                    case 171:
                                    case 172:
                                    case 174:
                                    case 176:
                                    case 191:
                                    case 194:
                                    case 195:
                                        break;
                                    case 88:
                                    case 159:
                                    case 160:
                                    case 161:
                                    case 162:
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 173:
                                    case 175:
                                        m1220(2);
                                        return;
                                    case 89:
                                        int iM12222 = m1222();
                                        m1214(iM12222);
                                        m1214(iM12222);
                                        return;
                                    case 90:
                                        int iM12223 = m1222();
                                        int iM12224 = m1222();
                                        m1214(iM12223);
                                        m1214(iM12224);
                                        m1214(iM12223);
                                        return;
                                    case 91:
                                        int iM12225 = m1222();
                                        int iM12226 = m1222();
                                        int iM12227 = m1222();
                                        m1214(iM12225);
                                        m1214(iM12227);
                                        m1214(iM12226);
                                        m1214(iM12225);
                                        return;
                                    case 92:
                                        int iM12228 = m1222();
                                        int iM12229 = m1222();
                                        m1214(iM12229);
                                        m1214(iM12228);
                                        m1214(iM12229);
                                        m1214(iM12228);
                                        return;
                                    case 93:
                                        int iM122210 = m1222();
                                        int iM122211 = m1222();
                                        int iM122212 = m1222();
                                        m1214(iM122211);
                                        m1214(iM122210);
                                        m1214(iM122212);
                                        m1214(iM122211);
                                        m1214(iM122210);
                                        return;
                                    case 94:
                                        int iM122213 = m1222();
                                        int iM122214 = m1222();
                                        int iM122215 = m1222();
                                        int iM122216 = m1222();
                                        m1214(iM122214);
                                        m1214(iM122213);
                                        m1214(iM122216);
                                        m1214(iM122215);
                                        m1214(iM122214);
                                        m1214(iM122213);
                                        return;
                                    case 95:
                                        int iM122217 = m1222();
                                        int iM122218 = m1222();
                                        m1214(iM122217);
                                        m1214(iM122218);
                                        return;
                                    case 96:
                                    case 100:
                                    case 104:
                                    case 108:
                                    case 112:
                                    case 120:
                                    case 122:
                                    case 124:
                                    case 126:
                                    case 128:
                                    case 130:
                                    case 136:
                                    case 142:
                                    case 149:
                                    case 150:
                                        break;
                                    case 97:
                                    case 101:
                                    case 105:
                                    case 109:
                                    case 113:
                                    case 127:
                                    case 129:
                                    case 131:
                                        m1220(4);
                                        m1214(4194308);
                                        m1214(4194304);
                                        return;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case 110:
                                    case 114:
                                    case 137:
                                    case 144:
                                        break;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case 111:
                                    case 115:
                                        m1220(4);
                                        m1214(4194307);
                                        m1214(4194304);
                                        return;
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 167:
                                    case 177:
                                        return;
                                    case 121:
                                    case 123:
                                    case 125:
                                        m1220(3);
                                        m1214(4194308);
                                        m1214(4194304);
                                        return;
                                    case 132:
                                        m1223(i2, 4194305);
                                        return;
                                    case 133:
                                    case 140:
                                        m1220(1);
                                        m1214(4194308);
                                        m1214(4194304);
                                        return;
                                    case 134:
                                        m1220(1);
                                        m1214(4194306);
                                        return;
                                    case 135:
                                    case 141:
                                        m1220(1);
                                        m1214(4194307);
                                        m1214(4194304);
                                        return;
                                    case 138:
                                        break;
                                    case 139:
                                    case 190:
                                    case 193:
                                        m1220(1);
                                        m1214(4194305);
                                        return;
                                    case 143:
                                        break;
                                    case 148:
                                    case 151:
                                    case 152:
                                        m1220(4);
                                        m1214(4194305);
                                        return;
                                    case 168:
                                    case 169:
                                        C0188.m798("JSR/RET are not supported with computeFrames option");
                                        return;
                                    case 178:
                                        m1213(c1450, c0029.f11715);
                                        return;
                                    case 179:
                                        m1221(c0029.f11715);
                                        return;
                                    case 180:
                                        m1220(1);
                                        m1213(c1450, c0029.f11715);
                                        return;
                                    case 181:
                                        m1221(c0029.f11715);
                                        m1222();
                                        return;
                                    case 182:
                                    case 183:
                                    case 184:
                                    case 185:
                                        m1221(c0029.f11715);
                                        if (i != 184) {
                                            int iM122219 = m1222();
                                            if (i == 183 && c0029.f11721.charAt(0) == '<') {
                                                int[] iArr = this.f2202;
                                                if (iArr == null) {
                                                    iArr = new int[2];
                                                    this.f2202 = iArr;
                                                }
                                                int length = iArr.length;
                                                int i8 = this.f2201;
                                                if (i8 >= length) {
                                                    iArr = new int[Math.max(i8 + 1, length * 2)];
                                                    System.arraycopy(this.f2202, 0, iArr, 0, length);
                                                    this.f2202 = iArr;
                                                }
                                                int i9 = this.f2201;
                                                this.f2201 = i9 + 1;
                                                iArr[i9] = iM122219;
                                            }
                                        }
                                        m1213(c1450, c0029.f11715);
                                        return;
                                    case 186:
                                        m1221(c0029.f11715);
                                        m1213(c1450, c0029.f11715);
                                        return;
                                    case 187:
                                        m1214(c1450.m2951(i2, c0029.f11715) | 12582912);
                                        return;
                                    case 188:
                                        m1222();
                                        switch (i2) {
                                            case 4:
                                                m1214(71303177);
                                                return;
                                            case 5:
                                                m1214(71303179);
                                                return;
                                            case 6:
                                                m1214(71303170);
                                                return;
                                            case 7:
                                                m1214(71303171);
                                                return;
                                            case 8:
                                                m1214(71303178);
                                                return;
                                            case 9:
                                                m1214(71303180);
                                                return;
                                            case 10:
                                                m1214(71303169);
                                                return;
                                            case 11:
                                                m1214(71303172);
                                                return;
                                            default:
                                                C1693.m3437();
                                                return;
                                        }
                                    case 189:
                                        String str = c0029.f11715;
                                        m1222();
                                        if (str.charAt(0) == '[') {
                                            m1213(c1450, "[".concat(str));
                                            return;
                                        } else {
                                            m1214(c1450.m2958(str) | 75497472);
                                            return;
                                        }
                                    case 192:
                                        String str2 = c0029.f11715;
                                        m1222();
                                        if (str2.charAt(0) == '[') {
                                            m1213(c1450, str2);
                                            return;
                                        } else {
                                            m1214(c1450.m2958(str2) | 8388608);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case 197:
                                                m1220(i2);
                                                m1213(c1450, c0029.f11715);
                                                return;
                                            case 198:
                                            case 199:
                                                break;
                                            default:
                                                C1693.m3437();
                                                return;
                                        }
                                        break;
                                }
                                m1220(1);
                                return;
                        }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int m1219(int i) {
        int[] iArr = this.f2209;
        if (iArr == null || i >= iArr.length) {
            return i | 20971520;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = 20971520 | i;
        iArr[i] = i3;
        return i3;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m1220(int i) {
        short s = this.f2206;
        if (s >= i) {
            this.f2206 = (short) (s - i);
        } else {
            this.f2208 = (short) (this.f2208 - (i - s));
            this.f2206 = (short) 0;
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m1221(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            m1220((C1308.m2595(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            m1220(2);
        } else {
            m1220(1);
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int m1222() {
        short s = this.f2206;
        if (s <= 0) {
            short s2 = (short) (this.f2208 - 1);
            this.f2208 = s2;
            return (-s2) | 25165824;
        }
        int[] iArr = this.f2203;
        short s3 = (short) (s - 1);
        this.f2206 = s3;
        return iArr[s3];
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m1223(int i, int i2) {
        int[] iArr = this.f2209;
        if (iArr == null) {
            iArr = new int[10];
            this.f2209 = iArr;
        }
        int length = iArr.length;
        if (i >= length) {
            iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f2209, 0, iArr, 0, length);
            this.f2209 = iArr;
        }
        iArr[i] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[LOOP:0: B:9:0x0011->B:25:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m1224(C1450 c1450, int i) {
        int i2;
        int i3;
        if (i == 4194310 || (i3 = (-4194304) & i) == 12582912 || i3 == 16777216) {
            for (int i4 = 0; i4 < this.f2201; i4++) {
                int i5 = this.f2202[i4];
                int i6 = (-67108864) & i5;
                int i7 = 62914560 & i5;
                int i8 = i5 & 1048575;
                if (i7 == 20971520) {
                    i2 = this.f2205[i8];
                } else {
                    if (i7 == 25165824) {
                        int[] iArr = this.f2207;
                        i2 = iArr[iArr.length - i8];
                    }
                    if (i != i5) {
                        return 8388608 | (i == 4194310 ? c1450.m2958(c1450.f6879) : c1450.m2958(c1450.f6876[i & 1048575].f11715));
                    }
                }
                i5 = i2 + i6;
                if (i != i5) {
                }
            }
        }
        return i;
    }
}
