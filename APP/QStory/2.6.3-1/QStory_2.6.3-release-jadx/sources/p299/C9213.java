package p299;

import androidx.activity.AbstractC0900;
import com.android.p002dx.p005io.Opcodes;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f23563;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f23564;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f23565;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C9206[] f23566;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f23567;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C9206[] f23562 = new C9206[256];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f23561 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C9211 f23560 = new C9211();

    public C9213(C9210 c9210) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C9206 m14503(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        for (C9206 c9206M14511 = m14511(iHashCode); c9206M14511 != null; c9206M14511 = (C9206) c9206M14511.f23481) {
            if (c9206M14511.f23477 == i && c9206M14511.f23479 == iHashCode && c9206M14511.f23474.equals(str)) {
                return c9206M14511;
            }
        }
        this.f23560.m14495(i, m14504(str));
        int i2 = this.f23561;
        this.f23561 = i2 + 1;
        C9206 c9206 = new C9206(i2, i, str, iHashCode);
        m14512(c9206);
        return c9206;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m14504(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C9206 c9206M14511 = m14511(iHashCode); c9206M14511 != null; c9206M14511 = (C9206) c9206M14511.f23481) {
            if (c9206M14511.f23477 == 1 && c9206M14511.f23479 == iHashCode && c9206M14511.f23474.equals(str)) {
                return c9206M14511.f23478;
            }
        }
        C9211 c9211 = this.f23560;
        c9211.m14493(1);
        int length = str.length();
        if (length > 65535) {
            C6755.m11865();
            return 0;
        }
        int i = c9211.f23544;
        int i2 = i + 2;
        if (i2 + length > c9211.f23545.length) {
            c9211.m14497(length + 2);
        }
        byte[] bArr = c9211.f23545;
        bArr[i] = (byte) (length >>> 8);
        bArr[i + 1] = (byte) length;
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 1 || cCharAt > 127) {
                c9211.f23544 = i2;
                int length2 = str.length();
                int i4 = i3;
                int i5 = i4;
                while (i4 < length2) {
                    char cCharAt2 = str.charAt(i4);
                    i5 = (cCharAt2 < 1 || cCharAt2 > 127) ? cCharAt2 <= 2047 ? i5 + 2 : i5 + 3 : i5 + 1;
                    i4++;
                }
                if (i5 > 65535) {
                    C6755.m11865();
                    return 0;
                }
                int i6 = c9211.f23544;
                int i7 = i6 - i3;
                int i8 = i7 - 2;
                if (i8 >= 0) {
                    byte[] bArr2 = c9211.f23545;
                    bArr2[i8] = (byte) (i5 >>> 8);
                    bArr2[i7 - 1] = (byte) i5;
                }
                if ((i6 + i5) - i3 > c9211.f23545.length) {
                    c9211.m14497(i5 - i3);
                }
                int i9 = c9211.f23544;
                while (i3 < length2) {
                    char cCharAt3 = str.charAt(i3);
                    if (cCharAt3 < 1 || cCharAt3 > 127) {
                        byte[] bArr3 = c9211.f23545;
                        if (cCharAt3 <= 2047) {
                            int i10 = i9 + 1;
                            bArr3[i9] = (byte) (((cCharAt3 >> 6) & 31) | 192);
                            i9 += 2;
                            bArr3[i10] = (byte) ((cCharAt3 & '?') | 128);
                        } else {
                            bArr3[i9] = (byte) (((cCharAt3 >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                            int i11 = i9 + 2;
                            bArr3[i9 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i9 += 3;
                            bArr3[i11] = (byte) ((cCharAt3 & '?') | 128);
                        }
                    } else {
                        c9211.f23545[i9] = (byte) cCharAt3;
                        i9++;
                    }
                    i3++;
                }
                c9211.f23544 = i9;
                int i12 = this.f23561;
                this.f23561 = i12 + 1;
                m14512(new C9206(i12, 1, str, iHashCode));
                return i12;
            }
            bArr[i2] = (byte) cCharAt;
            i3++;
            i2++;
        }
        c9211.f23544 = i2;
        int i122 = this.f23561;
        this.f23561 = i122 + 1;
        m14512(new C9206(i122, 1, str, iHashCode));
        return i122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9206 m14505(int i, String str, String str2, String str3) {
        C9211 c9211;
        int i2;
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        for (C9206 c9206M14511 = m14511(iHashCode); c9206M14511 != null; c9206M14511 = (C9206) c9206M14511.f23481) {
            if (c9206M14511.f23477 == i && c9206M14511.f23479 == iHashCode && c9206M14511.f23476.equals(str) && c9206M14511.f23475.equals(str2) && c9206M14511.f23474.equals(str3)) {
                return c9206M14511;
            }
        }
        int i3 = m14503(7, str).f23478;
        int iHashCode2 = Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode()) + 12);
        C9206 c9206M145112 = m14511(iHashCode2);
        while (true) {
            c9211 = this.f23560;
            if (c9206M145112 == null) {
                c9211.m14494(12, m14504(str2), m14504(str3));
                int i4 = this.f23561;
                this.f23561 = i4 + 1;
                m14512(new C9206(i4, iHashCode2, str2, str3));
                i2 = i4;
                break;
            }
            if (c9206M145112.f23477 == 12 && c9206M145112.f23479 == iHashCode2 && c9206M145112.f23475.equals(str2) && c9206M145112.f23474.equals(str3)) {
                i2 = c9206M145112.f23478;
                break;
            }
            c9206M145112 = (C9206) c9206M145112.f23481;
        }
        c9211.m14494(i, i3, i2);
        int i5 = this.f23561;
        this.f23561 = i5 + 1;
        C9206 c9206 = new C9206(i5, i, str, str2, str3, 0L, iHashCode, 0);
        m14512(c9206);
        return c9206;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9206 m14506(int i, long j) {
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        int i4 = (i + i2 + i3) & Integer.MAX_VALUE;
        for (C9206 c9206M14511 = m14511(i4); c9206M14511 != null; c9206M14511 = (C9206) c9206M14511.f23481) {
            if (c9206M14511.f23477 == i && c9206M14511.f23479 == i4 && c9206M14511.f23473 == j) {
                return c9206M14511;
            }
        }
        int i5 = this.f23561;
        C9211 c9211 = this.f23560;
        c9211.m14493(i);
        int i6 = c9211.f23544;
        int i7 = i6 + 8;
        if (i7 > c9211.f23545.length) {
            c9211.m14497(8);
        }
        byte[] bArr = c9211.f23545;
        bArr[i6] = (byte) (i3 >>> 24);
        bArr[i6 + 1] = (byte) (i3 >>> 16);
        bArr[i6 + 2] = (byte) (i3 >>> 8);
        bArr[i6 + 3] = (byte) i3;
        bArr[i6 + 4] = (byte) (i2 >>> 24);
        bArr[i6 + 5] = (byte) (i2 >>> 16);
        bArr[i6 + 6] = (byte) (i2 >>> 8);
        bArr[i6 + 7] = (byte) i2;
        c9211.f23544 = i7;
        this.f23561 += 2;
        C9206 c9206 = new C9206(i5, i, j, i4);
        m14512(c9206);
        return c9206;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9206 m14507(int i, int i2) {
        int i3 = (i + i2) & Integer.MAX_VALUE;
        for (C9206 c9206M14511 = m14511(i3); c9206M14511 != null; c9206M14511 = (C9206) c9206M14511.f23481) {
            if (c9206M14511.f23477 == i && c9206M14511.f23479 == i3 && c9206M14511.f23473 == i2) {
                return c9206M14511;
            }
        }
        C9211 c9211 = this.f23560;
        c9211.m14493(i);
        c9211.m14499(i2);
        int i4 = this.f23561;
        this.f23561 = i4 + 1;
        C9206 c9206 = new C9206(i4, i, i2, i3);
        m14512(c9206);
        return c9206;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9206 m14508(Object obj) {
        if (obj instanceof Integer) {
            return m14507(3, ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m14507(3, ((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m14507(3, ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m14507(3, ((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m14507(3, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m14507(4, Float.floatToRawIntBits(((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return m14506(5, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m14506(6, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        }
        if (obj instanceof String) {
            return m14503(8, (String) obj);
        }
        if (!(obj instanceof C9212)) {
            C6755.m11869(AbstractC0900.m713(obj, "value "));
            return null;
        }
        C9212 c9212 = (C9212) obj;
        int i = c9212.f23559;
        if (i == 12) {
            i = 10;
        }
        return i == 10 ? m14503(7, c9212.f23558.substring(c9212.f23557, c9212.f23556)) : i == 11 ? m14503(16, c9212.m14502()) : m14503(7, c9212.m14502());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m14509(C9206 c9206) {
        if (this.f23566 == null) {
            this.f23566 = new C9206[16];
        }
        int i = this.f23567;
        C9206[] c9206Arr = this.f23566;
        if (i == c9206Arr.length) {
            C9206[] c9206Arr2 = new C9206[c9206Arr.length * 2];
            System.arraycopy(c9206Arr, 0, c9206Arr2, 0, c9206Arr.length);
            this.f23566 = c9206Arr2;
        }
        C9206[] c9206Arr3 = this.f23566;
        int i2 = this.f23567;
        this.f23567 = i2 + 1;
        c9206Arr3[i2] = c9206;
        m14512(c9206);
        return c9206.f23478;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m14510(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        for (C9206 c9206M14511 = m14511(iHashCode); c9206M14511 != null; c9206M14511 = (C9206) c9206M14511.f23481) {
            if (c9206M14511.f23477 == 128 && c9206M14511.f23479 == iHashCode && c9206M14511.f23474.equals(str)) {
                return c9206M14511.f23478;
            }
        }
        return m14509(new C9206(this.f23567, 128, str, iHashCode));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C9206 m14511(int i) {
        C9206[] c9206Arr = this.f23562;
        return c9206Arr[i % c9206Arr.length];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14512(C9206 c9206) {
        int i = this.f23563;
        C9206[] c9206Arr = this.f23562;
        if (i > (c9206Arr.length * 3) / 4) {
            int length = c9206Arr.length;
            int i2 = (length * 2) + 1;
            C9206[] c9206Arr2 = new C9206[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C9206 c92062 = this.f23562[i3];
                while (c92062 != null) {
                    int i4 = c92062.f23479 % i2;
                    C9206 c92063 = (C9206) c92062.f23481;
                    c92062.f23481 = c9206Arr2[i4];
                    c9206Arr2[i4] = c92062;
                    c92062 = c92063;
                }
            }
            this.f23562 = c9206Arr2;
        }
        this.f23563++;
        int i5 = c9206.f23479;
        C9206[] c9206Arr3 = this.f23562;
        int length2 = i5 % c9206Arr3.length;
        c9206.f23481 = c9206Arr3[length2];
        c9206Arr3[length2] = c9206;
    }
}
