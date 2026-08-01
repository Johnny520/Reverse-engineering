package p283;

import androidx.activity.AbstractC0053;
import com.android.dx.io.Opcodes;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8384 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f23218;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f23219;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f23220;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C8377[] f23221;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f23222;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8377[] f23217 = new C8377[256];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f23216 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8382 f23215 = new C8382();

    public C8384(C8381 c8381) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8377 m13944(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        for (C8377 c8377M13952 = m13952(iHashCode); c8377M13952 != null; c8377M13952 = (C8377) c8377M13952.f23136) {
            if (c8377M13952.f23132 == i && c8377M13952.f23134 == iHashCode && c8377M13952.f23129.equals(str)) {
                return c8377M13952;
            }
        }
        this.f23215.m13936(i, m13945(str));
        int i2 = this.f23216;
        this.f23216 = i2 + 1;
        C8377 c8377 = new C8377(i2, i, str, iHashCode);
        m13953(c8377);
        return c8377;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m13945(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C8377 c8377M13952 = m13952(iHashCode); c8377M13952 != null; c8377M13952 = (C8377) c8377M13952.f23136) {
            if (c8377M13952.f23132 == 1 && c8377M13952.f23134 == iHashCode && c8377M13952.f23129.equals(str)) {
                return c8377M13952.f23133;
            }
        }
        C8382 c8382 = this.f23215;
        c8382.m13934(1);
        int length = str.length();
        if (length > 65535) {
            C5925.m11306();
            return 0;
        }
        int i = c8382.f23199;
        int i2 = i + 2;
        if (i2 + length > c8382.f23200.length) {
            c8382.m13938(length + 2);
        }
        byte[] bArr = c8382.f23200;
        bArr[i] = (byte) (length >>> 8);
        bArr[i + 1] = (byte) length;
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 1 || cCharAt > 127) {
                c8382.f23199 = i2;
                int length2 = str.length();
                int i4 = i3;
                int i5 = i4;
                while (i4 < length2) {
                    char cCharAt2 = str.charAt(i4);
                    i5 = (cCharAt2 < 1 || cCharAt2 > 127) ? cCharAt2 <= 2047 ? i5 + 2 : i5 + 3 : i5 + 1;
                    i4++;
                }
                if (i5 > 65535) {
                    C5925.m11306();
                    return 0;
                }
                int i6 = c8382.f23199;
                int i7 = i6 - i3;
                int i8 = i7 - 2;
                if (i8 >= 0) {
                    byte[] bArr2 = c8382.f23200;
                    bArr2[i8] = (byte) (i5 >>> 8);
                    bArr2[i7 - 1] = (byte) i5;
                }
                if ((i6 + i5) - i3 > c8382.f23200.length) {
                    c8382.m13938(i5 - i3);
                }
                int i9 = c8382.f23199;
                while (i3 < length2) {
                    char cCharAt3 = str.charAt(i3);
                    if (cCharAt3 < 1 || cCharAt3 > 127) {
                        byte[] bArr3 = c8382.f23200;
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
                        c8382.f23200[i9] = (byte) cCharAt3;
                        i9++;
                    }
                    i3++;
                }
                c8382.f23199 = i9;
                int i12 = this.f23216;
                this.f23216 = i12 + 1;
                m13953(new C8377(i12, 1, str, iHashCode));
                return i12;
            }
            bArr[i2] = (byte) cCharAt;
            i3++;
            i2++;
        }
        c8382.f23199 = i2;
        int i122 = this.f23216;
        this.f23216 = i122 + 1;
        m13953(new C8377(i122, 1, str, iHashCode));
        return i122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8377 m13946(int i, String str, String str2, String str3) {
        C8382 c8382;
        int i2;
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        for (C8377 c8377M13952 = m13952(iHashCode); c8377M13952 != null; c8377M13952 = (C8377) c8377M13952.f23136) {
            if (c8377M13952.f23132 == i && c8377M13952.f23134 == iHashCode && c8377M13952.f23131.equals(str) && c8377M13952.f23130.equals(str2) && c8377M13952.f23129.equals(str3)) {
                return c8377M13952;
            }
        }
        int i3 = m13944(7, str).f23133;
        int iHashCode2 = Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode()) + 12);
        C8377 c8377M139522 = m13952(iHashCode2);
        while (true) {
            c8382 = this.f23215;
            if (c8377M139522 == null) {
                c8382.m13935(12, m13945(str2), m13945(str3));
                int i4 = this.f23216;
                this.f23216 = i4 + 1;
                m13953(new C8377(i4, iHashCode2, str2, str3));
                i2 = i4;
                break;
            }
            if (c8377M139522.f23132 == 12 && c8377M139522.f23134 == iHashCode2 && c8377M139522.f23130.equals(str2) && c8377M139522.f23129.equals(str3)) {
                i2 = c8377M139522.f23133;
                break;
            }
            c8377M139522 = (C8377) c8377M139522.f23136;
        }
        c8382.m13935(i, i3, i2);
        int i5 = this.f23216;
        this.f23216 = i5 + 1;
        C8377 c8377 = new C8377(i5, i, str, str2, str3, 0L, iHashCode, 0);
        m13953(c8377);
        return c8377;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8377 m13947(int i, long j) {
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        int i4 = (i + i2 + i3) & Integer.MAX_VALUE;
        for (C8377 c8377M13952 = m13952(i4); c8377M13952 != null; c8377M13952 = (C8377) c8377M13952.f23136) {
            if (c8377M13952.f23132 == i && c8377M13952.f23134 == i4 && c8377M13952.f23128 == j) {
                return c8377M13952;
            }
        }
        int i5 = this.f23216;
        C8382 c8382 = this.f23215;
        c8382.m13934(i);
        int i6 = c8382.f23199;
        int i7 = i6 + 8;
        if (i7 > c8382.f23200.length) {
            c8382.m13938(8);
        }
        byte[] bArr = c8382.f23200;
        bArr[i6] = (byte) (i3 >>> 24);
        bArr[i6 + 1] = (byte) (i3 >>> 16);
        bArr[i6 + 2] = (byte) (i3 >>> 8);
        bArr[i6 + 3] = (byte) i3;
        bArr[i6 + 4] = (byte) (i2 >>> 24);
        bArr[i6 + 5] = (byte) (i2 >>> 16);
        bArr[i6 + 6] = (byte) (i2 >>> 8);
        bArr[i6 + 7] = (byte) i2;
        c8382.f23199 = i7;
        this.f23216 += 2;
        C8377 c8377 = new C8377(i5, i, j, i4);
        m13953(c8377);
        return c8377;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8377 m13948(int i, int i2) {
        int i3 = (i + i2) & Integer.MAX_VALUE;
        for (C8377 c8377M13952 = m13952(i3); c8377M13952 != null; c8377M13952 = (C8377) c8377M13952.f23136) {
            if (c8377M13952.f23132 == i && c8377M13952.f23134 == i3 && c8377M13952.f23128 == i2) {
                return c8377M13952;
            }
        }
        C8382 c8382 = this.f23215;
        c8382.m13934(i);
        c8382.m13940(i2);
        int i4 = this.f23216;
        this.f23216 = i4 + 1;
        C8377 c8377 = new C8377(i4, i, i2, i3);
        m13953(c8377);
        return c8377;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8377 m13949(Object obj) {
        if (obj instanceof Integer) {
            return m13948(3, ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m13948(3, ((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m13948(3, ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m13948(3, ((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m13948(3, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m13948(4, Float.floatToRawIntBits(((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return m13947(5, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m13947(6, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        }
        if (obj instanceof String) {
            return m13944(8, (String) obj);
        }
        if (!(obj instanceof C8383)) {
            C5925.m11310(AbstractC0053.m153(obj, "value "));
            return null;
        }
        C8383 c8383 = (C8383) obj;
        int i = c8383.f23214;
        if (i == 12) {
            i = 10;
        }
        return i == 10 ? m13944(7, c8383.f23213.substring(c8383.f23212, c8383.f23211)) : i == 11 ? m13944(16, c8383.m13943()) : m13944(7, c8383.m13943());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m13950(C8377 c8377) {
        if (this.f23221 == null) {
            this.f23221 = new C8377[16];
        }
        int i = this.f23222;
        C8377[] c8377Arr = this.f23221;
        if (i == c8377Arr.length) {
            C8377[] c8377Arr2 = new C8377[c8377Arr.length * 2];
            System.arraycopy(c8377Arr, 0, c8377Arr2, 0, c8377Arr.length);
            this.f23221 = c8377Arr2;
        }
        C8377[] c8377Arr3 = this.f23221;
        int i2 = this.f23222;
        this.f23222 = i2 + 1;
        c8377Arr3[i2] = c8377;
        m13953(c8377);
        return c8377.f23133;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m13951(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        for (C8377 c8377M13952 = m13952(iHashCode); c8377M13952 != null; c8377M13952 = (C8377) c8377M13952.f23136) {
            if (c8377M13952.f23132 == 128 && c8377M13952.f23134 == iHashCode && c8377M13952.f23129.equals(str)) {
                return c8377M13952.f23133;
            }
        }
        return m13950(new C8377(this.f23222, 128, str, iHashCode));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8377 m13952(int i) {
        C8377[] c8377Arr = this.f23217;
        return c8377Arr[i % c8377Arr.length];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13953(C8377 c8377) {
        int i = this.f23218;
        C8377[] c8377Arr = this.f23217;
        if (i > (c8377Arr.length * 3) / 4) {
            int length = c8377Arr.length;
            int i2 = (length * 2) + 1;
            C8377[] c8377Arr2 = new C8377[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C8377 c83772 = this.f23217[i3];
                while (c83772 != null) {
                    int i4 = c83772.f23134 % i2;
                    C8377 c83773 = (C8377) c83772.f23136;
                    c83772.f23136 = c8377Arr2[i4];
                    c8377Arr2[i4] = c83772;
                    c83772 = c83773;
                }
            }
            this.f23217 = c8377Arr2;
        }
        this.f23218++;
        int i5 = c8377.f23134;
        C8377[] c8377Arr3 = this.f23217;
        int length2 = i5 % c8377Arr3.length;
        c8377.f23136 = c8377Arr3[length2];
        c8377Arr3[length2] = c8377;
    }
}
