package yyds;

/* JADX INFO: renamed from: yyds.ᛳᲀᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0680 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final C0680 f3229 = new C0680();

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public short f3230;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public C0680 f3231;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public short f3232;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int[] f3233;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public short f3234;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public short f3235;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public short f3236;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C0680 f3237;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public C1607 f3238;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public C0435 f3239;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int[] f3240;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public short f3241;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f3242;

    public final String toString() {
        return AbstractC0897.m1989(System.identityHashCode(this), "L");
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m1583(byte[] bArr, C2548 c2548, int i) {
        this.f3234 = (short) (this.f3234 | 4);
        this.f3242 = i;
        int[] iArr = this.f3233;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.f3233;
            int i3 = iArr2[i2 - 1];
            int i4 = iArr2[i2];
            int i5 = i - i3;
            int i6 = 268435455 & i4;
            int i7 = i4 & (-268435456);
            if (i7 == 268435456) {
                if (i5 < -32768 || i5 > 32767) {
                    int i8 = bArr[i3] & 255;
                    if (i8 < 198) {
                        bArr[i3] = (byte) (i8 + 49);
                    } else {
                        bArr[i3] = (byte) (i8 + 20);
                    }
                    z = true;
                }
                bArr[i6] = (byte) (i5 >>> 8);
                bArr[i6 + 1] = (byte) i5;
            } else if (i7 == 536870912) {
                bArr[i6] = (byte) (i5 >>> 24);
                bArr[i6 + 1] = (byte) (i5 >>> 16);
                bArr[i6 + 2] = (byte) (i5 >>> 8);
                bArr[i6 + 3] = (byte) i5;
            } else {
                byte[] bArr2 = c2548.f12555;
                bArr2[i6] = (byte) (i >>> 8);
                bArr2[i6 + 1] = (byte) i;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1584(int i, int i2, int i3) {
        int[] iArr = this.f3233;
        if (iArr == null) {
            iArr = new int[6];
            this.f3233 = iArr;
        }
        int i4 = iArr[0];
        int i5 = i4 + 2;
        if (i5 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f3233 = iArr2;
            iArr = iArr2;
        }
        iArr[i4 + 1] = i;
        iArr[i5] = i2 | i3;
        iArr[0] = i5;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0680 m1585() {
        C0435 c0435 = this.f3239;
        return c0435 == null ? this : c0435.f2204;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0680 m1586(C0680 c0680) {
        for (C1607 c1607 = this.f3238; c1607 != null; c1607 = (C1607) c1607.f8180) {
            if ((this.f3234 & 16) == 0 || c1607 != ((C1607) this.f3238.f8180)) {
                C0680 c06802 = (C0680) c1607.f8179;
                if (c06802.f3231 == null) {
                    c06802.f3231 = c0680;
                    c0680 = c06802;
                }
            }
        }
        return c0680;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m1587(C2548 c2548, int i, boolean z) {
        if ((this.f3234 & 4) != 0) {
            int i2 = this.f3242;
            if (z) {
                c2548.m4585(i2 - i);
                return;
            } else {
                c2548.m4590(i2 - i);
                return;
            }
        }
        int i3 = c2548.f12556;
        if (z) {
            m1584(i, 536870912, i3);
            c2548.m4585(-1);
        } else {
            m1584(i, 268435456, i3);
            c2548.m4590(-1);
        }
    }
}
