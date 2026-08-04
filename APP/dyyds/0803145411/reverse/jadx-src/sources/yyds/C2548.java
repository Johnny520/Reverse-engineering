package yyds;

/* JADX INFO: renamed from: yyds.ᲇᲇᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2548 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f12554;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public byte[] f12555;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f12556;

    public C2548() {
        this.f12554 = 0;
        this.f12555 = new byte[64];
    }

    public String toString() {
        switch (this.f12554) {
            case 1:
                byte[] bArr = this.f12555;
                int i = this.f12556;
                byte b = bArr[i];
                StringBuilder sb = new StringBuilder(b * 2);
                for (int i2 = 0; i2 < b; i2++) {
                    int i3 = i2 * 2;
                    byte b2 = bArr[i3 + i + 1];
                    if (b2 == 0) {
                        sb.append('[');
                    } else if (b2 == 1) {
                        sb.append('.');
                    } else if (b2 == 2) {
                        sb.append('*');
                    } else {
                        if (b2 != 3) {
                            throw new AssertionError();
                        }
                        sb.append((int) bArr[i3 + i + 2]);
                        sb.append(';');
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public void m4584(byte[] bArr, int i, int i2) {
        if (this.f12556 + i2 > this.f12555.length) {
            m4588(i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.f12555, this.f12556, i2);
        }
        this.f12556 += i2;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public void m4585(int i) {
        int i2 = this.f12556;
        int i3 = i2 + 4;
        if (i3 > this.f12555.length) {
            m4588(4);
        }
        byte[] bArr = this.f12555;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        this.f12556 = i3;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public void m4586(int i, int i2) {
        int i3 = this.f12556;
        int i4 = i3 + 3;
        if (i4 > this.f12555.length) {
            m4588(3);
        }
        byte[] bArr = this.f12555;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) i2;
        this.f12556 = i4;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m4587(String str, int i, int i2) {
        int length = str.length();
        int i3 = i;
        int i4 = i3;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            i4 = (cCharAt < 1 || cCharAt > 127) ? cCharAt <= 2047 ? i4 + 2 : i4 + 3 : i4 + 1;
            i3++;
        }
        if (i4 > i2) {
            C0188.m798("UTF8 string too large");
            return;
        }
        int i5 = this.f12556;
        int i6 = i5 - i;
        int i7 = i6 - 2;
        if (i7 >= 0) {
            byte[] bArr = this.f12555;
            bArr[i7] = (byte) (i4 >>> 8);
            bArr[i6 - 1] = (byte) i4;
        }
        if ((i5 + i4) - i > this.f12555.length) {
            m4588(i4 - i);
        }
        int i8 = this.f12556;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 1 || cCharAt2 > 127) {
                byte[] bArr2 = this.f12555;
                if (cCharAt2 <= 2047) {
                    int i9 = i8 + 1;
                    bArr2[i8] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                    i8 += 2;
                    bArr2[i9] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    bArr2[i8] = (byte) (((cCharAt2 >> '\f') & 15) | 224);
                    int i10 = i8 + 2;
                    bArr2[i8 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                    i8 += 3;
                    bArr2[i10] = (byte) ((cCharAt2 & '?') | 128);
                }
            } else {
                this.f12555[i8] = (byte) cCharAt2;
                i8++;
            }
            i++;
        }
        this.f12556 = i8;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m4588(int i) {
        int i2 = this.f12556;
        byte[] bArr = this.f12555;
        if (i2 > bArr.length) {
            throw new AssertionError("Internal error");
        }
        int length = bArr.length * 2;
        int i3 = i + i2;
        if (length <= i3) {
            length = i3;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f12555 = bArr2;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public void m4589(int i) {
        int i2 = this.f12556;
        int i3 = i2 + 1;
        if (i3 > this.f12555.length) {
            m4588(1);
        }
        this.f12555[i2] = (byte) i;
        this.f12556 = i3;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public void m4590(int i) {
        int i2 = this.f12556;
        int i3 = i2 + 2;
        if (i3 > this.f12555.length) {
            m4588(2);
        }
        byte[] bArr = this.f12555;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        this.f12556 = i3;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m4591(int i, int i2) {
        int i3 = this.f12556;
        int i4 = i3 + 2;
        if (i4 > this.f12555.length) {
            m4588(2);
        }
        byte[] bArr = this.f12555;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) i2;
        this.f12556 = i4;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public void m4592(int i, int i2, int i3) {
        int i4 = this.f12556;
        int i5 = i4 + 5;
        if (i5 > this.f12555.length) {
            m4588(5);
        }
        byte[] bArr = this.f12555;
        bArr[i4] = (byte) i;
        bArr[i4 + 1] = (byte) (i2 >>> 8);
        bArr[i4 + 2] = (byte) i2;
        bArr[i4 + 3] = (byte) (i3 >>> 8);
        bArr[i4 + 4] = (byte) i3;
        this.f12556 = i5;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void m4593(int i, int i2) {
        int i3 = this.f12556;
        int i4 = i3 + 4;
        if (i4 > this.f12555.length) {
            m4588(4);
        }
        byte[] bArr = this.f12555;
        bArr[i3] = 15;
        bArr[i3 + 1] = (byte) i;
        bArr[i3 + 2] = (byte) (i2 >>> 8);
        bArr[i3 + 3] = (byte) i2;
        this.f12556 = i4;
    }

    public C2548(int i, byte[] bArr) {
        this.f12554 = 1;
        this.f12555 = bArr;
        this.f12556 = i;
    }
}
