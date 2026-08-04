package yyds;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲁᛶᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2263 extends C2534 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final transient int[] f11164;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final transient byte[][] f11165;

    public C2263(byte[][] bArr, int[] iArr) {
        super(C2534.f12475.f12477);
        this.f11165 = bArr;
        this.f11164 = iArr;
    }

    @Override // yyds.C2534
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2534)) {
            return false;
        }
        C2534 c2534 = (C2534) obj;
        return c2534.mo4261() == mo4261() && mo4262(c2534, mo4261());
    }

    @Override // yyds.C2534
    public final int hashCode() {
        int i = this.f12478;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f11165;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f11164;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f12478 = i3;
        return i3;
    }

    @Override // yyds.C2534
    public final String toString() {
        return new C2534(m4257()).toString();
    }

    @Override // yyds.C2534
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final String mo4256(Charset charset) {
        return new String(m4257(), charset);
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final byte[] m4257() {
        byte[] bArr = new byte[mo4261()];
        byte[][] bArr2 = this.f11165;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f11164;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC2070.m3938(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // yyds.C2534
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C2534 mo4258(int i, int i2) {
        if (i < 0) {
            C1693.m3439("beginIndex=", i, " < 0");
            return null;
        }
        if (i2 > mo4261()) {
            throw new IllegalArgumentException(("endIndex=" + i2 + " > length(" + mo4261() + ')').toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            C0188.m806(AbstractC0897.m1987(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == mo4261()) {
            return this;
        }
        if (i == i2) {
            return C2534.f12475;
        }
        int iM987 = AbstractC0319.m987(this, i);
        int iM9872 = AbstractC0319.m987(this, i2 - 1);
        int i4 = iM9872 + 1;
        byte[][] bArr = this.f11165;
        AbstractC0476.m1329(i4, bArr.length);
        byte[][] bArr2 = (byte[][]) Arrays.copyOfRange(bArr, iM987, i4);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f11164;
        if (iM987 <= iM9872) {
            int i5 = iM987;
            int i6 = 0;
            while (true) {
                iArr[i6] = Math.min(iArr2[i5] - i, i3);
                int i7 = i6 + 1;
                iArr[i6 + bArr2.length] = iArr2[bArr.length + i5];
                if (i5 == iM9872) {
                    break;
                }
                i5++;
                i6 = i7;
            }
        }
        int i8 = iM987 != 0 ? iArr2[iM987 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i8) + iArr[length];
        return new C2263(bArr2, iArr);
    }

    @Override // yyds.C2534
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final byte mo4259(int i) {
        byte[][] bArr = this.f11165;
        int length = bArr.length - 1;
        int[] iArr = this.f11164;
        AbstractC2217.m4201(iArr[length], i, 1L);
        int iM987 = AbstractC0319.m987(this, i);
        return bArr[iM987][(i - (iM987 == 0 ? 0 : iArr[iM987 - 1])) + iArr[bArr.length + iM987]];
    }

    @Override // yyds.C2534
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String mo4260() {
        throw null;
    }

    @Override // yyds.C2534
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int mo4261() {
        return this.f11164[this.f11165.length - 1];
    }

    @Override // yyds.C2534
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean mo4262(C2534 c2534, int i) {
        if (mo4261() - i >= 0) {
            int iM987 = AbstractC0319.m987(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.f11164;
                int i4 = iM987 == 0 ? 0 : iArr[iM987 - 1];
                int i5 = iArr[iM987] - i4;
                byte[][] bArr = this.f11165;
                int i6 = iArr[bArr.length + iM987];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (c2534.mo4266(i3, (i2 - i4) + i6, iMin, bArr[iM987])) {
                    i3 += iMin;
                    i2 += iMin;
                    iM987++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // yyds.C2534
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void mo4263(C1507 c1507, int i) {
        int iM987 = AbstractC0319.m987(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f11164;
            int i3 = iM987 == 0 ? 0 : iArr[iM987 - 1];
            int i4 = iArr[iM987] - i3;
            byte[][] bArr = this.f11165;
            int i5 = iArr[bArr.length + iM987];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            C0502 c0502 = new C0502(bArr[iM987], i6, i6 + iMin, true);
            C0502 c05022 = c1507.f7086;
            if (c05022 == null) {
                c0502.f2445 = c0502;
                c0502.f2447 = c0502;
                c1507.f7086 = c0502;
            } else {
                c05022.f2445.m1351(c0502);
            }
            i2 += iMin;
            iM987++;
        }
        c1507.f7087 += (long) i;
    }

    @Override // yyds.C2534
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C2534 mo4264() {
        return new C2534(m4257()).mo4264();
    }

    @Override // yyds.C2534
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String mo4265() {
        byte[] bArrM4257 = m4257();
        char[] cArr = new char[bArrM4257.length * 2];
        int i = 0;
        for (byte b : bArrM4257) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC0181.f1027;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // yyds.C2534
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean mo4266(int i, int i2, int i3, byte[] bArr) {
        if (i >= 0 && i <= mo4261() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iM987 = AbstractC0319.m987(this, i);
            while (i < i4) {
                int[] iArr = this.f11164;
                int i5 = iM987 == 0 ? 0 : iArr[iM987 - 1];
                int i6 = iArr[iM987] - i5;
                byte[][] bArr2 = this.f11165;
                int i7 = iArr[bArr2.length + iM987];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iM987];
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iM987++;
            }
            return true;
        }
        return false;
    }

    @Override // yyds.C2534
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final byte[] mo4267() {
        return m4257();
    }
}
