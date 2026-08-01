package p313;

import com.android.p002dx.p005io.Opcodes;
import p299.C9206;
import p299.C9211;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9423 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f24401;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f24402;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9419 f24403;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C9206[] f24404;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f24405;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C9206[] f24400 = new C9206[256];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24399 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C9211 f24398 = new C9211(4096);

    public C9423(C9419 c9419) {
        this.f24403 = c9419;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14783(C9206 c9206) {
        int i = this.f24401;
        C9206[] c9206Arr = this.f24400;
        if (i > (c9206Arr.length * 3) / 4) {
            int length = c9206Arr.length;
            int i2 = (length * 2) + 1;
            C9206[] c9206Arr2 = new C9206[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C9206 c92062 = this.f24400[i3];
                while (c92062 != null) {
                    int i4 = c92062.f23479 % i2;
                    C9206 c92063 = (C9206) c92062.f23481;
                    c92062.f23481 = c9206Arr2[i4];
                    c9206Arr2[i4] = c92062;
                    c92062 = c92063;
                }
            }
            this.f24400 = c9206Arr2;
        }
        this.f24401++;
        int i5 = c9206.f23479;
        C9206[] c9206Arr3 = this.f24400;
        int length2 = i5 % c9206Arr3.length;
        c9206.f23481 = c9206Arr3[length2];
        c9206Arr3[length2] = c9206;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m14784(C9206 c9206) {
        if (this.f24404 == null) {
            this.f24404 = new C9206[16];
        }
        int i = this.f24405;
        C9206[] c9206Arr = this.f24404;
        if (i == c9206Arr.length) {
            C9206[] c9206Arr2 = new C9206[c9206Arr.length * 2];
            System.arraycopy(c9206Arr, 0, c9206Arr2, 0, c9206Arr.length);
            this.f24404 = c9206Arr2;
        }
        C9206[] c9206Arr3 = this.f24404;
        int i2 = this.f24405;
        this.f24405 = i2 + 1;
        c9206Arr3[i2] = c9206;
        m14783(c9206);
        return c9206.f23478;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m14785(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        C9206[] c9206Arr = this.f24400;
        for (C9206 c9206 = c9206Arr[iHashCode % c9206Arr.length]; c9206 != null; c9206 = (C9206) c9206.f23481) {
            if (c9206.f23477 == 128 && c9206.f23479 == iHashCode && c9206.f23474.equals(str)) {
                return c9206.f23478;
            }
        }
        return m14784(new C9206(this.f24405, 128, null, null, str, 0L, iHashCode, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9206 m14786(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        C9206[] c9206Arr = this.f24400;
        for (C9206 c9206 = c9206Arr[iHashCode % c9206Arr.length]; c9206 != null; c9206 = (C9206) c9206.f23481) {
            if (c9206.f23477 == i && c9206.f23479 == iHashCode && c9206.f23474.equals(str)) {
                return c9206;
            }
        }
        this.f24398.m14495(i, m14787(str));
        int i2 = this.f24399;
        this.f24399 = i2 + 1;
        C9206 c92062 = new C9206(i2, i, null, null, str, 0L, iHashCode, 1);
        m14783(c92062);
        return c92062;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m14787(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        C9206[] c9206Arr = this.f24400;
        for (C9206 c9206 = c9206Arr[iHashCode % c9206Arr.length]; c9206 != null; c9206 = (C9206) c9206.f23481) {
            if (c9206.f23477 == 1 && c9206.f23479 == iHashCode && c9206.f23474.equals(str)) {
                return c9206.f23478;
            }
        }
        C9211 c9211 = this.f24398;
        c9211.m14493(1);
        int length = str.length();
        if (length > 65535) {
            C6755.m11869("UTF8 string too large");
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
                    C6755.m11869("UTF8 string too large");
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
                int i12 = this.f24399;
                this.f24399 = i12 + 1;
                m14783(new C9206(i12, 1, null, null, str, 0L, iHashCode, 1));
                return i12;
            }
            bArr[i2] = (byte) cCharAt;
            i3++;
            i2++;
        }
        c9211.f23544 = i2;
        int i122 = this.f24399;
        this.f24399 = i122 + 1;
        m14783(new C9206(i122, 1, null, null, str, 0L, iHashCode, 1));
        return i122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9206 m14788(int i, String str, String str2, String str3) {
        int i2;
        C9211 c9211;
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        C9206[] c9206Arr = this.f24400;
        for (C9206 c9206 = c9206Arr[iHashCode % c9206Arr.length]; c9206 != null; c9206 = (C9206) c9206.f23481) {
            if (c9206.f23477 == i && c9206.f23479 == iHashCode && c9206.f23476.equals(str) && c9206.f23475.equals(str2) && c9206.f23474.equals(str3)) {
                return c9206;
            }
        }
        int i3 = m14786(7, str).f23478;
        int iHashCode2 = ((str3.hashCode() * str2.hashCode()) + 12) & Integer.MAX_VALUE;
        C9206[] c9206Arr2 = this.f24400;
        C9206 c92062 = c9206Arr2[iHashCode2 % c9206Arr2.length];
        while (true) {
            C9211 c92112 = this.f24398;
            if (c92062 == null) {
                c92112.m14494(12, m14787(str2), m14787(str3));
                i2 = this.f24399;
                this.f24399 = i2 + 1;
                c9211 = c92112;
                m14783(new C9206(i2, 12, null, str2, str3, 0L, iHashCode2, 1));
                break;
            }
            if (c92062.f23477 == 12 && c92062.f23479 == iHashCode2 && c92062.f23475.equals(str2) && c92062.f23474.equals(str3)) {
                i2 = c92062.f23478;
                c9211 = c92112;
                break;
            }
            c92062 = (C9206) c92062.f23481;
        }
        c9211.m14494(i, i3, i2);
        int i4 = this.f24399;
        this.f24399 = i4 + 1;
        C9206 c92063 = new C9206(i4, i, str, str2, str3, 0L, iHashCode, 1);
        m14783(c92063);
        return c92063;
    }
}
