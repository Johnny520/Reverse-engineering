package yyds;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲁᲇᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2351 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f11530;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1507 f11532;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f11534;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f11535;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f11533 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f11537 = 4096;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C1843[] f11531 = new C1843[8];

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f11536 = 7;

    public C2351(C1507 c1507) {
        this.f11532 = c1507;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m4363(int i, int i2, int i3) {
        C1507 c1507 = this.f11532;
        if (i < i2) {
            c1507.m3036(i | i3);
            return;
        }
        c1507.m3036(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c1507.m3036(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c1507.m3036(i4);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4364(int i) {
        int i2;
        if (i > 0) {
            int length = this.f11531.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f11536;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f11531[length].f9272;
                i -= i4;
                this.f11530 -= i4;
                this.f11534--;
                i3++;
                length--;
            }
            C1843[] c1843Arr = this.f11531;
            int i5 = i2 + 1;
            System.arraycopy(c1843Arr, i5, c1843Arr, i5 + i3, this.f11534);
            C1843[] c1843Arr2 = this.f11531;
            int i6 = this.f11536 + 1;
            Arrays.fill(c1843Arr2, i6, i6 + i3, (Object) null);
            this.f11536 += i3;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4365(C1843 c1843) {
        int i = c1843.f9272;
        int i2 = this.f11537;
        if (i > i2) {
            C1843[] c1843Arr = this.f11531;
            Arrays.fill(c1843Arr, 0, c1843Arr.length, (Object) null);
            this.f11536 = this.f11531.length - 1;
            this.f11534 = 0;
            this.f11530 = 0;
            return;
        }
        m4364((this.f11530 + i) - i2);
        int i3 = this.f11534 + 1;
        C1843[] c1843Arr2 = this.f11531;
        if (i3 > c1843Arr2.length) {
            C1843[] c1843Arr3 = new C1843[c1843Arr2.length * 2];
            System.arraycopy(c1843Arr2, 0, c1843Arr3, c1843Arr2.length, c1843Arr2.length);
            this.f11536 = this.f11531.length - 1;
            this.f11531 = c1843Arr3;
            c1843Arr2 = c1843Arr3;
        }
        int i4 = this.f11536;
        this.f11536 = i4 - 1;
        c1843Arr2[i4] = c1843;
        this.f11534++;
        this.f11530 += i;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m4366(C2534 c2534) throws EOFException {
        int[] iArr = AbstractC1234.f5654;
        int iMo4261 = c2534.mo4261();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iMo4261; i++) {
            byte bMo4259 = c2534.mo4259(i);
            byte[] bArr = AbstractC1429.f6782;
            j2 += (long) AbstractC1234.f5655[bMo4259 & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iMo42612 = c2534.mo4261();
        C1507 c1507 = this.f11532;
        if (i2 >= iMo42612) {
            m4363(c2534.mo4261(), 127, 0);
            c1507.m3016(c2534);
            return;
        }
        C1507 c15072 = new C1507();
        int[] iArr2 = AbstractC1234.f5654;
        int iMo42613 = c2534.mo4261();
        int i3 = 0;
        for (int i4 = 0; i4 < iMo42613; i4++) {
            byte bMo42592 = c2534.mo4259(i4);
            byte[] bArr2 = AbstractC1429.f6782;
            int i5 = bMo42592 & 255;
            int i6 = AbstractC1234.f5654[i5];
            byte b = AbstractC1234.f5655[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                c15072.m3036((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            c15072.m3036((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        C2534 c2534M3037 = c15072.m3037(c15072.f7087);
        m4363(c2534M3037.mo4261(), 127, 128);
        c1507.m3016(c2534M3037);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4367(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f11535) {
            int i = this.f11533;
            if (i < this.f11537) {
                m4363(i, 31, 32);
            }
            this.f11535 = false;
            this.f11533 = Integer.MAX_VALUE;
            m4363(this.f11537, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1843 c1843 = (C1843) arrayList.get(i2);
            C2534 c2534Mo4264 = c1843.f9270.mo4264();
            C2534 c2534 = c1843.f9271;
            Integer num = (Integer) AbstractC1190.f5458.get(c2534Mo4264);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    C1843[] c1843Arr = AbstractC1190.f5457;
                    if (AbstractC1544.m3188(c1843Arr[iIntValue].f9271, c2534)) {
                        length = length2;
                    } else if (AbstractC1544.m3188(c1843Arr[length2].f9271, c2534)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int i3 = this.f11536 + 1;
                int length3 = this.f11531.length;
                while (true) {
                    if (i3 >= length3) {
                        break;
                    }
                    if (AbstractC1544.m3188(this.f11531[i3].f9270, c2534Mo4264)) {
                        if (AbstractC1544.m3188(this.f11531[i3].f9271, c2534)) {
                            length2 = AbstractC1190.f5457.length + (i3 - this.f11536);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f11536) + AbstractC1190.f5457.length;
                        }
                    }
                    i3++;
                }
            }
            if (length2 != -1) {
                m4363(length2, 127, 128);
            } else if (length == -1) {
                this.f11532.m3036(64);
                m4366(c2534Mo4264);
                m4366(c2534);
                m4365(c1843);
            } else {
                C2534 c25342 = C1843.f9269;
                c2534Mo4264.getClass();
                if (!c2534Mo4264.mo4262(c25342, c25342.mo4261()) || AbstractC1544.m3188(C1843.f9265, c2534Mo4264)) {
                    m4363(length, 63, 64);
                    m4366(c2534);
                    m4365(c1843);
                } else {
                    m4363(length, 15, 0);
                    m4366(c2534);
                }
            }
        }
    }
}
