package p297;

import com.android.dx.io.Opcodes;
import p283.C8376;
import p283.C8381;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8602 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f24065;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f24066;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8598 f24067;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C8376[] f24068;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f24069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8376[] f24064 = new C8376[256];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24063 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8381 f24062 = new C8381(4096);

    public C8602(C8598 c8598) {
        this.f24067 = c8598;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14205(C8376 c8376) {
        int i = this.f24065;
        C8376[] c8376Arr = this.f24064;
        if (i > (c8376Arr.length * 3) / 4) {
            int length = c8376Arr.length;
            int i2 = (length * 2) + 1;
            C8376[] c8376Arr2 = new C8376[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C8376 c83762 = this.f24064[i3];
                while (c83762 != null) {
                    int i4 = c83762.f23135 % i2;
                    C8376 c83763 = (C8376) c83762.f23137;
                    c83762.f23137 = c8376Arr2[i4];
                    c8376Arr2[i4] = c83762;
                    c83762 = c83763;
                }
            }
            this.f24064 = c8376Arr2;
        }
        this.f24065++;
        int i5 = c8376.f23135;
        C8376[] c8376Arr3 = this.f24064;
        int length2 = i5 % c8376Arr3.length;
        c8376.f23137 = c8376Arr3[length2];
        c8376Arr3[length2] = c8376;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m14206(C8376 c8376) {
        if (this.f24068 == null) {
            this.f24068 = new C8376[16];
        }
        int i = this.f24069;
        C8376[] c8376Arr = this.f24068;
        if (i == c8376Arr.length) {
            C8376[] c8376Arr2 = new C8376[c8376Arr.length * 2];
            System.arraycopy(c8376Arr, 0, c8376Arr2, 0, c8376Arr.length);
            this.f24068 = c8376Arr2;
        }
        C8376[] c8376Arr3 = this.f24068;
        int i2 = this.f24069;
        this.f24069 = i2 + 1;
        c8376Arr3[i2] = c8376;
        m14205(c8376);
        return c8376.f23134;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m14207(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        C8376[] c8376Arr = this.f24064;
        for (C8376 c8376 = c8376Arr[iHashCode % c8376Arr.length]; c8376 != null; c8376 = (C8376) c8376.f23137) {
            if (c8376.f23133 == 128 && c8376.f23135 == iHashCode && c8376.f23130.equals(str)) {
                return c8376.f23134;
            }
        }
        return m14206(new C8376(this.f24069, 128, null, null, str, 0L, iHashCode, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8376 m14208(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        C8376[] c8376Arr = this.f24064;
        for (C8376 c8376 = c8376Arr[iHashCode % c8376Arr.length]; c8376 != null; c8376 = (C8376) c8376.f23137) {
            if (c8376.f23133 == i && c8376.f23135 == iHashCode && c8376.f23130.equals(str)) {
                return c8376;
            }
        }
        this.f24062.m13919(i, m14209(str));
        int i2 = this.f24063;
        this.f24063 = i2 + 1;
        C8376 c83762 = new C8376(i2, i, null, null, str, 0L, iHashCode, 1);
        m14205(c83762);
        return c83762;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m14209(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        C8376[] c8376Arr = this.f24064;
        for (C8376 c8376 = c8376Arr[iHashCode % c8376Arr.length]; c8376 != null; c8376 = (C8376) c8376.f23137) {
            if (c8376.f23133 == 1 && c8376.f23135 == iHashCode && c8376.f23130.equals(str)) {
                return c8376.f23134;
            }
        }
        C8381 c8381 = this.f24062;
        c8381.m13917(1);
        int length = str.length();
        if (length > 65535) {
            C5919.m11249("UTF8 string too large");
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
                    C5919.m11249("UTF8 string too large");
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
                int i12 = this.f24063;
                this.f24063 = i12 + 1;
                m14205(new C8376(i12, 1, null, null, str, 0L, iHashCode, 1));
                return i12;
            }
            bArr[i2] = (byte) cCharAt;
            i3++;
            i2++;
        }
        c8381.f23200 = i2;
        int i122 = this.f24063;
        this.f24063 = i122 + 1;
        m14205(new C8376(i122, 1, null, null, str, 0L, iHashCode, 1));
        return i122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8376 m14210(int i, String str, String str2, String str3) {
        int i2;
        C8381 c8381;
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        C8376[] c8376Arr = this.f24064;
        for (C8376 c8376 = c8376Arr[iHashCode % c8376Arr.length]; c8376 != null; c8376 = (C8376) c8376.f23137) {
            if (c8376.f23133 == i && c8376.f23135 == iHashCode && c8376.f23132.equals(str) && c8376.f23131.equals(str2) && c8376.f23130.equals(str3)) {
                return c8376;
            }
        }
        int i3 = m14208(7, str).f23134;
        int iHashCode2 = ((str3.hashCode() * str2.hashCode()) + 12) & Integer.MAX_VALUE;
        C8376[] c8376Arr2 = this.f24064;
        C8376 c83762 = c8376Arr2[iHashCode2 % c8376Arr2.length];
        while (true) {
            C8381 c83812 = this.f24062;
            if (c83762 == null) {
                c83812.m13918(12, m14209(str2), m14209(str3));
                i2 = this.f24063;
                this.f24063 = i2 + 1;
                c8381 = c83812;
                m14205(new C8376(i2, 12, null, str2, str3, 0L, iHashCode2, 1));
                break;
            }
            if (c83762.f23133 == 12 && c83762.f23135 == iHashCode2 && c83762.f23131.equals(str2) && c83762.f23130.equals(str3)) {
                i2 = c83762.f23134;
                c8381 = c83812;
                break;
            }
            c83762 = (C8376) c83762.f23137;
        }
        c8381.m13918(i, i3, i2);
        int i4 = this.f24063;
        this.f24063 = i4 + 1;
        C8376 c83763 = new C8376(i4, i, str, str2, str3, 0L, iHashCode, 1);
        m14205(c83763);
        return c83763;
    }
}
