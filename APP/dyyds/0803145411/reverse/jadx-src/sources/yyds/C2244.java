package yyds;

import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲁᛵᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2244 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1486 f11078;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0644 f11081;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f11077 = 0;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f11083 = 8;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int[] f11076 = new int[8];

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int[] f11082 = new int[8];

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public float[] f11079 = new float[8];

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f11074 = -1;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f11075 = -1;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f11080 = false;

    public C2244(C1486 c1486, C0644 c0644) {
        this.f11078 = c1486;
        this.f11081 = c0644;
    }

    public final String toString() {
        int i = this.f11074;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f11077; i2++) {
            StringBuilder sb = new StringBuilder(string.concat(" -> ") + this.f11079[i] + " : ");
            sb.append(((C0972[]) this.f11081.f3101)[this.f11076[i]]);
            string = sb.toString();
            i = this.f11082[i];
        }
        return string;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final float m4241(C0972 c0972, boolean z) {
        int i = this.f11074;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f11077) {
            if (this.f11076[i] == c0972.f4464) {
                int i4 = this.f11074;
                int[] iArr = this.f11082;
                if (i == i4) {
                    this.f11074 = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c0972.m2112(this.f11078);
                }
                c0972.f4455--;
                this.f11077--;
                this.f11076[i] = -1;
                if (this.f11080) {
                    this.f11075 = i;
                }
                return this.f11079[i];
            }
            i2++;
            i3 = i;
            i = this.f11082[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0972 m4242(int i) {
        int i2 = this.f11074;
        for (int i3 = 0; i2 != -1 && i3 < this.f11077; i3++) {
            if (i3 == i) {
                return ((C0972[]) this.f11081.f3101)[this.f11076[i2]];
            }
            i2 = this.f11082[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4243(C0972 c0972, float f, boolean z) {
        int[] iArr;
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f11074;
            C1486 c1486 = this.f11078;
            if (i == -1) {
                this.f11074 = 0;
                this.f11079[0] = f;
                this.f11076[0] = c0972.f4464;
                this.f11082[0] = -1;
                c0972.f4455++;
                c0972.m2111(c1486);
                this.f11077++;
                if (this.f11080) {
                    return;
                }
                int i2 = this.f11075 + 1;
                this.f11075 = i2;
                int[] iArr2 = this.f11076;
                if (i2 >= iArr2.length) {
                    this.f11080 = true;
                    this.f11075 = iArr2.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f11077; i4++) {
                int i5 = this.f11076[i];
                int i6 = c0972.f4464;
                if (i5 == i6) {
                    float[] fArr = this.f11079;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.f11074;
                        int[] iArr3 = this.f11082;
                        if (i == i7) {
                            this.f11074 = iArr3[i];
                        } else {
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            c0972.m2112(c1486);
                        }
                        if (this.f11080) {
                            this.f11075 = i;
                        }
                        c0972.f4455--;
                        this.f11077--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f11082[i];
            }
            int length = this.f11075;
            int i8 = length + 1;
            if (this.f11080) {
                int[] iArr4 = this.f11076;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i8;
            }
            int[] iArr5 = this.f11076;
            if (length >= iArr5.length && this.f11077 < iArr5.length) {
                int i9 = 0;
                while (true) {
                    iArr = this.f11076;
                    if (i9 >= iArr.length) {
                        iArr5 = iArr;
                        break;
                    } else {
                        if (iArr[i9] == -1) {
                            length = i9;
                            break;
                        }
                        i9++;
                    }
                }
            } else {
                iArr = iArr5;
            }
            if (length >= iArr.length) {
                length = iArr.length;
                int i10 = this.f11083 * 2;
                this.f11083 = i10;
                this.f11080 = false;
                this.f11075 = length - 1;
                this.f11079 = Arrays.copyOf(this.f11079, i10);
                this.f11076 = Arrays.copyOf(this.f11076, this.f11083);
                this.f11082 = Arrays.copyOf(this.f11082, this.f11083);
            }
            this.f11076[length] = c0972.f4464;
            this.f11079[length] = f;
            int[] iArr6 = this.f11082;
            if (i3 != -1) {
                iArr6[length] = iArr6[i3];
                iArr6[i3] = length;
            } else {
                iArr6[length] = this.f11074;
                this.f11074 = length;
            }
            c0972.f4455++;
            c0972.m2111(c1486);
            this.f11077++;
            if (!this.f11080) {
                this.f11075++;
            }
            int i11 = this.f11075;
            int[] iArr7 = this.f11076;
            if (i11 >= iArr7.length) {
                this.f11080 = true;
                this.f11075 = iArr7.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4244() {
        int i = this.f11074;
        for (int i2 = 0; i != -1 && i2 < this.f11077; i2++) {
            C0972 c0972 = ((C0972[]) this.f11081.f3101)[this.f11076[i]];
            if (c0972 != null) {
                c0972.m2112(this.f11078);
            }
            i = this.f11082[i];
        }
        this.f11074 = -1;
        this.f11075 = -1;
        this.f11080 = false;
        this.f11077 = 0;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m4245(C0972 c0972, float f) {
        int[] iArr;
        if (f == 0.0f) {
            m4241(c0972, true);
            return;
        }
        int i = this.f11074;
        C1486 c1486 = this.f11078;
        if (i == -1) {
            this.f11074 = 0;
            this.f11079[0] = f;
            this.f11076[0] = c0972.f4464;
            this.f11082[0] = -1;
            c0972.f4455++;
            c0972.m2111(c1486);
            this.f11077++;
            if (this.f11080) {
                return;
            }
            int i2 = this.f11075 + 1;
            this.f11075 = i2;
            int[] iArr2 = this.f11076;
            if (i2 >= iArr2.length) {
                this.f11080 = true;
                this.f11075 = iArr2.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f11077; i4++) {
            int i5 = this.f11076[i];
            int i6 = c0972.f4464;
            if (i5 == i6) {
                this.f11079[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f11082[i];
        }
        int length = this.f11075;
        int i7 = length + 1;
        if (this.f11080) {
            int[] iArr3 = this.f11076;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i7;
        }
        int[] iArr4 = this.f11076;
        if (length >= iArr4.length && this.f11077 < iArr4.length) {
            int i8 = 0;
            while (true) {
                iArr = this.f11076;
                if (i8 >= iArr.length) {
                    iArr4 = iArr;
                    break;
                } else {
                    if (iArr[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
        } else {
            iArr = iArr4;
        }
        if (length >= iArr.length) {
            length = iArr.length;
            int i9 = this.f11083 * 2;
            this.f11083 = i9;
            this.f11080 = false;
            this.f11075 = length - 1;
            this.f11079 = Arrays.copyOf(this.f11079, i9);
            this.f11076 = Arrays.copyOf(this.f11076, this.f11083);
            this.f11082 = Arrays.copyOf(this.f11082, this.f11083);
        }
        this.f11076[length] = c0972.f4464;
        this.f11079[length] = f;
        int[] iArr5 = this.f11082;
        if (i3 != -1) {
            iArr5[length] = iArr5[i3];
            iArr5[i3] = length;
        } else {
            iArr5[length] = this.f11074;
            this.f11074 = length;
        }
        c0972.f4455++;
        c0972.m2111(c1486);
        int i10 = this.f11077 + 1;
        this.f11077 = i10;
        if (!this.f11080) {
            this.f11075++;
        }
        int[] iArr6 = this.f11076;
        if (i10 >= iArr6.length) {
            this.f11080 = true;
        }
        if (this.f11075 >= iArr6.length) {
            this.f11080 = true;
            this.f11075 = iArr6.length - 1;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final float m4246(C0972 c0972) {
        int i = this.f11074;
        for (int i2 = 0; i != -1 && i2 < this.f11077; i2++) {
            if (this.f11076[i] == c0972.f4464) {
                return this.f11079[i];
            }
            i = this.f11082[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final float m4247(int i) {
        int i2 = this.f11074;
        for (int i3 = 0; i2 != -1 && i3 < this.f11077; i3++) {
            if (i3 == i) {
                return this.f11079[i2];
            }
            i2 = this.f11082[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int m4248() {
        return this.f11077;
    }
}
