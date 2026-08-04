package yyds;

/* JADX INFO: renamed from: yyds.ᛶᲇᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1450 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public C1607[] f6868;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f6869;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public C1607[] f6870;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C2548 f6871;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1072 f6873;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f6874;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C0029[] f6876;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f6877;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f6878;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public String f6879;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f6881;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C0029[] f6872 = new C0029[256];

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f6880 = 1;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2548 f6875 = new C2548();

    public C1450(C1072 c1072) {
        this.f6873 = c1072;
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final C0029 m2949(int i) {
        C0029[] c0029Arr = this.f6872;
        return c0029Arr[i % c0029Arr.length];
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int m2950(String str, String str2) {
        int iHashCode = ((str2.hashCode() * str.hashCode()) + 12) & Integer.MAX_VALUE;
        for (C0029 c0029M2949 = m2949(iHashCode); c0029M2949 != null; c0029M2949 = c0029M2949.f11714) {
            if (c0029M2949.f11717 == 12 && c0029M2949.f11713 == iHashCode && c0029M2949.f11721.equals(str) && c0029M2949.f11715.equals(str2)) {
                return c0029M2949.f11716;
            }
        }
        this.f6875.m4592(12, m2952(str), m2952(str2));
        int i = this.f6880;
        this.f6880 = i + 1;
        m2955(new C0029(i, iHashCode, str, str2));
        return i;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final int m2951(int i, String str) {
        int iHashCode = (str.hashCode() + 129 + i) & Integer.MAX_VALUE;
        for (C0029 c0029M2949 = m2949(iHashCode); c0029M2949 != null; c0029M2949 = c0029M2949.f11714) {
            if (c0029M2949.f11717 == 129 && c0029M2949.f11713 == iHashCode && c0029M2949.f11720 == i && c0029M2949.f11715.equals(str)) {
                return c0029M2949.f11716;
            }
        }
        return m2959(new C0029(this.f6878, 129, str, i, iHashCode));
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int m2952(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C0029 c0029M2949 = m2949(iHashCode); c0029M2949 != null; c0029M2949 = c0029M2949.f11714) {
            if (c0029M2949.f11717 == 1 && c0029M2949.f11713 == iHashCode && c0029M2949.f11715.equals(str)) {
                return c0029M2949.f11716;
            }
        }
        C2548 c2548 = this.f6875;
        c2548.m4589(1);
        int length = str.length();
        int i = 0;
        if (length > 65535) {
            C0188.m798("UTF8 string too large");
            return 0;
        }
        int i2 = c2548.f12556;
        int i3 = i2 + 2;
        if (i3 + length > c2548.f12555.length) {
            c2548.m4588(length + 2);
        }
        byte[] bArr = c2548.f12555;
        bArr[i2] = (byte) (length >>> 8);
        bArr[i2 + 1] = (byte) length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 1 || cCharAt > 127) {
                c2548.f12556 = i3;
                c2548.m4587(str, i, 65535);
                break;
            }
            bArr[i3] = (byte) cCharAt;
            i++;
            i3++;
        }
        c2548.f12556 = i3;
        int i4 = this.f6880;
        this.f6880 = i4 + 1;
        m2955(new C0029(i4, 1, iHashCode, str));
        return i4;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0029 m2953(int i, long j) {
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        int i4 = (i + i2 + i3) & Integer.MAX_VALUE;
        for (C0029 c0029M2949 = m2949(i4); c0029M2949 != null; c0029M2949 = c0029M2949.f11714) {
            if (c0029M2949.f11717 == i && c0029M2949.f11713 == i4 && c0029M2949.f11720 == j) {
                return c0029M2949;
            }
        }
        int i5 = this.f6880;
        C2548 c2548 = this.f6875;
        c2548.m4589(i);
        int i6 = c2548.f12556;
        int i7 = i6 + 8;
        if (i7 > c2548.f12555.length) {
            c2548.m4588(8);
        }
        byte[] bArr = c2548.f12555;
        bArr[i6] = (byte) (i3 >>> 24);
        bArr[i6 + 1] = (byte) (i3 >>> 16);
        bArr[i6 + 2] = (byte) (i3 >>> 8);
        bArr[i6 + 3] = (byte) i3;
        bArr[i6 + 4] = (byte) (i2 >>> 24);
        bArr[i6 + 5] = (byte) (i2 >>> 16);
        bArr[i6 + 6] = (byte) (i2 >>> 8);
        bArr[i6 + 7] = (byte) i2;
        c2548.f12556 = i7;
        this.f6880 += 2;
        C0029 c0029 = new C0029(i5, i, j, i4);
        m2955(c0029);
        return c0029;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0029 m2954(C2767 c2767, Object... objArr) {
        C2548 c2548 = this.f6871;
        if (c2548 == null) {
            c2548 = new C2548();
            this.f6871 = c2548;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = m2956(objArr[i]).f11716;
        }
        int i2 = c2548.f12556;
        c2548.m4590(m2957(c2767.f13502, c2767.f13503, c2767.f13504, c2767.f13505, c2767.f13501).f11716);
        c2548.m4590(length);
        for (int i3 = 0; i3 < length; i3++) {
            c2548.m4590(iArr[i3]);
        }
        int i4 = c2548.f12556 - i2;
        int iHashCode = c2767.hashCode();
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
        }
        int i5 = iHashCode & Integer.MAX_VALUE;
        byte[] bArr = this.f6871.f12555;
        for (C0029 c0029M2949 = m2949(i5); c0029M2949 != null; c0029M2949 = c0029M2949.f11714) {
            if (c0029M2949.f11717 == 64 && c0029M2949.f11713 == i5) {
                int i6 = (int) c0029M2949.f11720;
                for (int i7 = 0; i7 < i4; i7++) {
                    if (bArr[i2 + i7] != bArr[i6 + i7]) {
                        break;
                    }
                }
                this.f6871.f12556 = i2;
                return c0029M2949;
            }
        }
        int i8 = this.f6869;
        this.f6869 = i8 + 1;
        C0029 c0029 = new C0029(i8, 64, i2, i5);
        m2955(c0029);
        return c0029;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m2955(C0029 c0029) {
        int i = this.f6881;
        C0029[] c0029Arr = this.f6872;
        if (i > (c0029Arr.length * 3) / 4) {
            int length = c0029Arr.length;
            int i2 = (length * 2) + 1;
            C0029[] c0029Arr2 = new C0029[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C0029 c00292 = this.f6872[i3];
                while (c00292 != null) {
                    int i4 = c00292.f11713 % i2;
                    C0029 c00293 = c00292.f11714;
                    c00292.f11714 = c0029Arr2[i4];
                    c0029Arr2[i4] = c00292;
                    c00292 = c00293;
                }
            }
            this.f6872 = c0029Arr2;
            c0029Arr = c0029Arr2;
        }
        this.f6881++;
        int length2 = c0029.f11713 % c0029Arr.length;
        c0029.f11714 = c0029Arr[length2];
        c0029Arr[length2] = c0029;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0029 m2956(Object obj) {
        if (obj instanceof Integer) {
            return m2963(3, ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m2963(3, ((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m2963(3, ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m2963(3, ((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m2963(3, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m2963(4, Float.floatToRawIntBits(((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return m2953(5, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m2953(6, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        }
        if (obj instanceof String) {
            return m2960(8, (String) obj);
        }
        if (obj instanceof C1308) {
            C1308 c1308 = (C1308) obj;
            int i = c1308.f5986;
            if (i == 12) {
                i = 10;
            }
            return i == 10 ? m2960(7, c1308.f5987.substring(c1308.f5988, c1308.f5989)) : i == 11 ? m2960(16, c1308.m2597()) : m2960(7, c1308.m2597());
        }
        if (obj instanceof C2767) {
            C2767 c2767 = (C2767) obj;
            return m2957(c2767.f13502, c2767.f13503, c2767.f13504, c2767.f13505, c2767.f13501);
        }
        if (obj instanceof C0949) {
            C0949 c0949 = (C0949) obj;
            return m2961(17, m2954(c0949.f4414, c0949.f4415).f11716, c0949.f4412, c0949.f4413);
        }
        C0188.m795(obj, "value ");
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0029 m2957(int i, String str, String str2, String str3, boolean z) {
        int i2 = (i <= 4 || !z) ? i : i << 8;
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode() * i2) + 15) & Integer.MAX_VALUE;
        for (C0029 c0029M2949 = m2949(iHashCode); c0029M2949 != null; c0029M2949 = c0029M2949.f11714) {
            if (c0029M2949.f11717 == 15 && c0029M2949.f11713 == iHashCode && c0029M2949.f11720 == i2 && c0029M2949.f11719.equals(str) && c0029M2949.f11721.equals(str2) && c0029M2949.f11715.equals(str3)) {
                return c0029M2949;
            }
        }
        C2548 c2548 = this.f6875;
        if (i <= 4) {
            c2548.m4593(i, m2962(9, str, str2, str3).f11716);
        } else {
            c2548.m4593(i, m2962(z ? 11 : 10, str, str2, str3).f11716);
        }
        int i3 = this.f6880;
        this.f6880 = i3 + 1;
        C0029 c0029 = new C0029(i3, 15, str, str2, str3, i2, iHashCode);
        m2955(c0029);
        return c0029;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final int m2958(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        for (C0029 c0029M2949 = m2949(iHashCode); c0029M2949 != null; c0029M2949 = c0029M2949.f11714) {
            if (c0029M2949.f11717 == 128 && c0029M2949.f11713 == iHashCode && c0029M2949.f11715.equals(str)) {
                return c0029M2949.f11716;
            }
        }
        return m2959(new C0029(this.f6878, 128, iHashCode, str));
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final int m2959(C0029 c0029) {
        C0029[] c0029Arr = this.f6876;
        if (c0029Arr == null) {
            c0029Arr = new C0029[16];
            this.f6876 = c0029Arr;
        }
        if (this.f6878 == c0029Arr.length) {
            C0029[] c0029Arr2 = new C0029[c0029Arr.length * 2];
            System.arraycopy(c0029Arr, 0, c0029Arr2, 0, c0029Arr.length);
            this.f6876 = c0029Arr2;
            c0029Arr = c0029Arr2;
        }
        int i = this.f6878;
        this.f6878 = i + 1;
        c0029Arr[i] = c0029;
        m2955(c0029);
        return c0029.f11716;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C0029 m2960(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        for (C0029 c0029M2949 = m2949(iHashCode); c0029M2949 != null; c0029M2949 = c0029M2949.f11714) {
            if (c0029M2949.f11717 == i && c0029M2949.f11713 == iHashCode && c0029M2949.f11715.equals(str)) {
                return c0029M2949;
            }
        }
        this.f6875.m4586(i, m2952(str));
        int i2 = this.f6880;
        this.f6880 = i2 + 1;
        C0029 c0029 = new C0029(i2, i, iHashCode, str);
        m2955(c0029);
        return c0029;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0029 m2961(int i, int i2, String str, String str2) {
        int iHashCode = (((i2 + 1) * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        for (C0029 c0029M2949 = m2949(iHashCode); c0029M2949 != null; c0029M2949 = c0029M2949.f11714) {
            if (c0029M2949.f11717 == i && c0029M2949.f11713 == iHashCode && c0029M2949.f11720 == i2 && c0029M2949.f11721.equals(str) && c0029M2949.f11715.equals(str2)) {
                return c0029M2949;
            }
        }
        this.f6875.m4592(i, i2, m2950(str, str2));
        int i3 = this.f6880;
        this.f6880 = i3 + 1;
        C0029 c0029 = new C0029(i3, i, null, str, str2, i2, iHashCode);
        m2955(c0029);
        return c0029;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0029 m2962(int i, String str, String str2, String str3) {
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        for (C0029 c0029M2949 = m2949(iHashCode); c0029M2949 != null; c0029M2949 = c0029M2949.f11714) {
            if (c0029M2949.f11717 == i && c0029M2949.f11713 == iHashCode && c0029M2949.f11719.equals(str) && c0029M2949.f11721.equals(str2) && c0029M2949.f11715.equals(str3)) {
                return c0029M2949;
            }
        }
        this.f6875.m4592(i, m2960(7, str).f11716, m2950(str2, str3));
        int i2 = this.f6880;
        this.f6880 = i2 + 1;
        C0029 c0029 = new C0029(i2, i, str, str2, str3, 0L, iHashCode);
        m2955(c0029);
        return c0029;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0029 m2963(int i, int i2) {
        int i3 = (i + i2) & Integer.MAX_VALUE;
        for (C0029 c0029M2949 = m2949(i3); c0029M2949 != null; c0029M2949 = c0029M2949.f11714) {
            if (c0029M2949.f11717 == i && c0029M2949.f11713 == i3 && c0029M2949.f11720 == i2) {
                return c0029M2949;
            }
        }
        C2548 c2548 = this.f6875;
        c2548.m4589(i);
        c2548.m4585(i2);
        int i4 = this.f6880;
        this.f6880 = i4 + 1;
        C0029 c0029 = new C0029(i4, i, i2, i3);
        m2955(c0029);
        return c0029;
    }
}
