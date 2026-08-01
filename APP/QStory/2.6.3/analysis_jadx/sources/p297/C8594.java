package p297;

import com.android.dx.io.Opcodes;
import p283.C8377;
import p283.C8382;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8594 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f24056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f24057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8590 f24058;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C8377[] f24059;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f24060;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8377[] f24055 = new C8377[256];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24054 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8382 f24053 = new C8382(4096);

    public C8594(C8590 c8590) {
        this.f24058 = c8590;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14224(C8377 c8377) {
        int i = this.f24056;
        C8377[] c8377Arr = this.f24055;
        if (i > (c8377Arr.length * 3) / 4) {
            int length = c8377Arr.length;
            int i2 = (length * 2) + 1;
            C8377[] c8377Arr2 = new C8377[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C8377 c83772 = this.f24055[i3];
                while (c83772 != null) {
                    int i4 = c83772.f23134 % i2;
                    C8377 c83773 = (C8377) c83772.f23136;
                    c83772.f23136 = c8377Arr2[i4];
                    c8377Arr2[i4] = c83772;
                    c83772 = c83773;
                }
            }
            this.f24055 = c8377Arr2;
        }
        this.f24056++;
        int i5 = c8377.f23134;
        C8377[] c8377Arr3 = this.f24055;
        int length2 = i5 % c8377Arr3.length;
        c8377.f23136 = c8377Arr3[length2];
        c8377Arr3[length2] = c8377;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m14225(C8377 c8377) {
        if (this.f24059 == null) {
            this.f24059 = new C8377[16];
        }
        int i = this.f24060;
        C8377[] c8377Arr = this.f24059;
        if (i == c8377Arr.length) {
            C8377[] c8377Arr2 = new C8377[c8377Arr.length * 2];
            System.arraycopy(c8377Arr, 0, c8377Arr2, 0, c8377Arr.length);
            this.f24059 = c8377Arr2;
        }
        C8377[] c8377Arr3 = this.f24059;
        int i2 = this.f24060;
        this.f24060 = i2 + 1;
        c8377Arr3[i2] = c8377;
        m14224(c8377);
        return c8377.f23133;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m14226(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        C8377[] c8377Arr = this.f24055;
        for (C8377 c8377 = c8377Arr[iHashCode % c8377Arr.length]; c8377 != null; c8377 = (C8377) c8377.f23136) {
            if (c8377.f23132 == 128 && c8377.f23134 == iHashCode && c8377.f23129.equals(str)) {
                return c8377.f23133;
            }
        }
        return m14225(new C8377(this.f24060, 128, null, null, str, 0L, iHashCode, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8377 m14227(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        C8377[] c8377Arr = this.f24055;
        for (C8377 c8377 = c8377Arr[iHashCode % c8377Arr.length]; c8377 != null; c8377 = (C8377) c8377.f23136) {
            if (c8377.f23132 == i && c8377.f23134 == iHashCode && c8377.f23129.equals(str)) {
                return c8377;
            }
        }
        this.f24053.m13936(i, m14228(str));
        int i2 = this.f24054;
        this.f24054 = i2 + 1;
        C8377 c83772 = new C8377(i2, i, null, null, str, 0L, iHashCode, 1);
        m14224(c83772);
        return c83772;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m14228(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        C8377[] c8377Arr = this.f24055;
        for (C8377 c8377 = c8377Arr[iHashCode % c8377Arr.length]; c8377 != null; c8377 = (C8377) c8377.f23136) {
            if (c8377.f23132 == 1 && c8377.f23134 == iHashCode && c8377.f23129.equals(str)) {
                return c8377.f23133;
            }
        }
        C8382 c8382 = this.f24053;
        c8382.m13934(1);
        int length = str.length();
        if (length > 65535) {
            C5925.m11310("UTF8 string too large");
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
                    C5925.m11310("UTF8 string too large");
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
                int i12 = this.f24054;
                this.f24054 = i12 + 1;
                m14224(new C8377(i12, 1, null, null, str, 0L, iHashCode, 1));
                return i12;
            }
            bArr[i2] = (byte) cCharAt;
            i3++;
            i2++;
        }
        c8382.f23199 = i2;
        int i122 = this.f24054;
        this.f24054 = i122 + 1;
        m14224(new C8377(i122, 1, null, null, str, 0L, iHashCode, 1));
        return i122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8377 m14229(int i, String str, String str2, String str3) {
        int i2;
        C8382 c8382;
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        C8377[] c8377Arr = this.f24055;
        for (C8377 c8377 = c8377Arr[iHashCode % c8377Arr.length]; c8377 != null; c8377 = (C8377) c8377.f23136) {
            if (c8377.f23132 == i && c8377.f23134 == iHashCode && c8377.f23131.equals(str) && c8377.f23130.equals(str2) && c8377.f23129.equals(str3)) {
                return c8377;
            }
        }
        int i3 = m14227(7, str).f23133;
        int iHashCode2 = ((str3.hashCode() * str2.hashCode()) + 12) & Integer.MAX_VALUE;
        C8377[] c8377Arr2 = this.f24055;
        C8377 c83772 = c8377Arr2[iHashCode2 % c8377Arr2.length];
        while (true) {
            C8382 c83822 = this.f24053;
            if (c83772 == null) {
                c83822.m13935(12, m14228(str2), m14228(str3));
                i2 = this.f24054;
                this.f24054 = i2 + 1;
                c8382 = c83822;
                m14224(new C8377(i2, 12, null, str2, str3, 0L, iHashCode2, 1));
                break;
            }
            if (c83772.f23132 == 12 && c83772.f23134 == iHashCode2 && c83772.f23130.equals(str2) && c83772.f23129.equals(str3)) {
                i2 = c83772.f23133;
                c8382 = c83822;
                break;
            }
            c83772 = (C8377) c83772.f23136;
        }
        c8382.m13935(i, i3, i2);
        int i4 = this.f24054;
        this.f24054 = i4 + 1;
        C8377 c83773 = new C8377(i4, i, str, str2, str3, 0L, iHashCode, 1);
        m14224(c83773);
        return c83773;
    }
}
