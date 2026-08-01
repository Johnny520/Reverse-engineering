package p283;

import androidx.activity.AbstractC0053;
import com.android.dx.io.Opcodes;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f23219;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f23220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f23221;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C8376[] f23222;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f23223;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8376[] f23218 = new C8376[256];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f23217 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8381 f23216 = new C8381();

    public C8383(C8380 c8380) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8376 m13927(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        for (C8376 c8376M13935 = m13935(iHashCode); c8376M13935 != null; c8376M13935 = (C8376) c8376M13935.f23137) {
            if (c8376M13935.f23133 == i && c8376M13935.f23135 == iHashCode && c8376M13935.f23130.equals(str)) {
                return c8376M13935;
            }
        }
        this.f23216.m13919(i, m13928(str));
        int i2 = this.f23217;
        this.f23217 = i2 + 1;
        C8376 c8376 = new C8376(i2, i, str, iHashCode);
        m13936(c8376);
        return c8376;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m13928(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C8376 c8376M13935 = m13935(iHashCode); c8376M13935 != null; c8376M13935 = (C8376) c8376M13935.f23137) {
            if (c8376M13935.f23133 == 1 && c8376M13935.f23135 == iHashCode && c8376M13935.f23130.equals(str)) {
                return c8376M13935.f23134;
            }
        }
        C8381 c8381 = this.f23216;
        c8381.m13917(1);
        int length = str.length();
        if (length > 65535) {
            C5919.m11245();
            return 0;
        }
        int i = c8381.f23200;
        int i2 = i + 2;
        if (i2 + length > c8381.f23201.length) {
            c8381.m13921(length + 2);
        }
        byte[] bArr = c8381.f23201;
        bArr[i] = (byte) (length >>> 8);
        bArr[i + 1] = (byte) length;
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 1 || cCharAt > 127) {
                c8381.f23200 = i2;
                int length2 = str.length();
                int i4 = i3;
                int i5 = i4;
                while (i4 < length2) {
                    char cCharAt2 = str.charAt(i4);
                    i5 = (cCharAt2 < 1 || cCharAt2 > 127) ? cCharAt2 <= 2047 ? i5 + 2 : i5 + 3 : i5 + 1;
                    i4++;
                }
                if (i5 > 65535) {
                    C5919.m11245();
                    return 0;
                }
                int i6 = c8381.f23200;
                int i7 = i6 - i3;
                int i8 = i7 - 2;
                if (i8 >= 0) {
                    byte[] bArr2 = c8381.f23201;
                    bArr2[i8] = (byte) (i5 >>> 8);
                    bArr2[i7 - 1] = (byte) i5;
                }
                if ((i6 + i5) - i3 > c8381.f23201.length) {
                    c8381.m13921(i5 - i3);
                }
                int i9 = c8381.f23200;
                while (i3 < length2) {
                    char cCharAt3 = str.charAt(i3);
                    if (cCharAt3 < 1 || cCharAt3 > 127) {
                        byte[] bArr3 = c8381.f23201;
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
                        c8381.f23201[i9] = (byte) cCharAt3;
                        i9++;
                    }
                    i3++;
                }
                c8381.f23200 = i9;
                int i12 = this.f23217;
                this.f23217 = i12 + 1;
                m13936(new C8376(i12, 1, str, iHashCode));
                return i12;
            }
            bArr[i2] = (byte) cCharAt;
            i3++;
            i2++;
        }
        c8381.f23200 = i2;
        int i122 = this.f23217;
        this.f23217 = i122 + 1;
        m13936(new C8376(i122, 1, str, iHashCode));
        return i122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8376 m13929(int i, String str, String str2, String str3) {
        C8381 c8381;
        int i2;
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        for (C8376 c8376M13935 = m13935(iHashCode); c8376M13935 != null; c8376M13935 = (C8376) c8376M13935.f23137) {
            if (c8376M13935.f23133 == i && c8376M13935.f23135 == iHashCode && c8376M13935.f23132.equals(str) && c8376M13935.f23131.equals(str2) && c8376M13935.f23130.equals(str3)) {
                return c8376M13935;
            }
        }
        int i3 = m13927(7, str).f23134;
        int iHashCode2 = Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode()) + 12);
        C8376 c8376M139352 = m13935(iHashCode2);
        while (true) {
            c8381 = this.f23216;
            if (c8376M139352 == null) {
                c8381.m13918(12, m13928(str2), m13928(str3));
                int i4 = this.f23217;
                this.f23217 = i4 + 1;
                m13936(new C8376(i4, iHashCode2, str2, str3));
                i2 = i4;
                break;
            }
            if (c8376M139352.f23133 == 12 && c8376M139352.f23135 == iHashCode2 && c8376M139352.f23131.equals(str2) && c8376M139352.f23130.equals(str3)) {
                i2 = c8376M139352.f23134;
                break;
            }
            c8376M139352 = (C8376) c8376M139352.f23137;
        }
        c8381.m13918(i, i3, i2);
        int i5 = this.f23217;
        this.f23217 = i5 + 1;
        C8376 c8376 = new C8376(i5, i, str, str2, str3, 0L, iHashCode, 0);
        m13936(c8376);
        return c8376;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8376 m13930(int i, long j) {
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        int i4 = (i + i2 + i3) & Integer.MAX_VALUE;
        for (C8376 c8376M13935 = m13935(i4); c8376M13935 != null; c8376M13935 = (C8376) c8376M13935.f23137) {
            if (c8376M13935.f23133 == i && c8376M13935.f23135 == i4 && c8376M13935.f23129 == j) {
                return c8376M13935;
            }
        }
        int i5 = this.f23217;
        C8381 c8381 = this.f23216;
        c8381.m13917(i);
        int i6 = c8381.f23200;
        int i7 = i6 + 8;
        if (i7 > c8381.f23201.length) {
            c8381.m13921(8);
        }
        byte[] bArr = c8381.f23201;
        bArr[i6] = (byte) (i3 >>> 24);
        bArr[i6 + 1] = (byte) (i3 >>> 16);
        bArr[i6 + 2] = (byte) (i3 >>> 8);
        bArr[i6 + 3] = (byte) i3;
        bArr[i6 + 4] = (byte) (i2 >>> 24);
        bArr[i6 + 5] = (byte) (i2 >>> 16);
        bArr[i6 + 6] = (byte) (i2 >>> 8);
        bArr[i6 + 7] = (byte) i2;
        c8381.f23200 = i7;
        this.f23217 += 2;
        C8376 c8376 = new C8376(i5, i, j, i4);
        m13936(c8376);
        return c8376;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8376 m13931(int i, int i2) {
        int i3 = (i + i2) & Integer.MAX_VALUE;
        for (C8376 c8376M13935 = m13935(i3); c8376M13935 != null; c8376M13935 = (C8376) c8376M13935.f23137) {
            if (c8376M13935.f23133 == i && c8376M13935.f23135 == i3 && c8376M13935.f23129 == i2) {
                return c8376M13935;
            }
        }
        C8381 c8381 = this.f23216;
        c8381.m13917(i);
        c8381.m13923(i2);
        int i4 = this.f23217;
        this.f23217 = i4 + 1;
        C8376 c8376 = new C8376(i4, i, i2, i3);
        m13936(c8376);
        return c8376;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8376 m13932(Object obj) {
        if (obj instanceof Integer) {
            return m13931(3, ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m13931(3, ((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m13931(3, ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m13931(3, ((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m13931(3, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m13931(4, Float.floatToRawIntBits(((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return m13930(5, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m13930(6, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        }
        if (obj instanceof String) {
            return m13927(8, (String) obj);
        }
        if (!(obj instanceof C8382)) {
            C5919.m11249(AbstractC0053.m153(obj, "value "));
            return null;
        }
        C8382 c8382 = (C8382) obj;
        int i = c8382.f23215;
        if (i == 12) {
            i = 10;
        }
        return i == 10 ? m13927(7, c8382.f23214.substring(c8382.f23213, c8382.f23212)) : i == 11 ? m13927(16, c8382.m13926()) : m13927(7, c8382.m13926());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m13933(C8376 c8376) {
        if (this.f23222 == null) {
            this.f23222 = new C8376[16];
        }
        int i = this.f23223;
        C8376[] c8376Arr = this.f23222;
        if (i == c8376Arr.length) {
            C8376[] c8376Arr2 = new C8376[c8376Arr.length * 2];
            System.arraycopy(c8376Arr, 0, c8376Arr2, 0, c8376Arr.length);
            this.f23222 = c8376Arr2;
        }
        C8376[] c8376Arr3 = this.f23222;
        int i2 = this.f23223;
        this.f23223 = i2 + 1;
        c8376Arr3[i2] = c8376;
        m13936(c8376);
        return c8376.f23134;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m13934(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        for (C8376 c8376M13935 = m13935(iHashCode); c8376M13935 != null; c8376M13935 = (C8376) c8376M13935.f23137) {
            if (c8376M13935.f23133 == 128 && c8376M13935.f23135 == iHashCode && c8376M13935.f23130.equals(str)) {
                return c8376M13935.f23134;
            }
        }
        return m13933(new C8376(this.f23223, 128, str, iHashCode));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8376 m13935(int i) {
        C8376[] c8376Arr = this.f23218;
        return c8376Arr[i % c8376Arr.length];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13936(C8376 c8376) {
        int i = this.f23219;
        C8376[] c8376Arr = this.f23218;
        if (i > (c8376Arr.length * 3) / 4) {
            int length = c8376Arr.length;
            int i2 = (length * 2) + 1;
            C8376[] c8376Arr2 = new C8376[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C8376 c83762 = this.f23218[i3];
                while (c83762 != null) {
                    int i4 = c83762.f23135 % i2;
                    C8376 c83763 = (C8376) c83762.f23137;
                    c83762.f23137 = c8376Arr2[i4];
                    c8376Arr2[i4] = c83762;
                    c83762 = c83763;
                }
            }
            this.f23218 = c8376Arr2;
        }
        this.f23219++;
        int i5 = c8376.f23135;
        C8376[] c8376Arr3 = this.f23218;
        int length2 = i5 % c8376Arr3.length;
        c8376.f23137 = c8376Arr3[length2];
        c8376Arr3[length2] = c8376;
    }
}
