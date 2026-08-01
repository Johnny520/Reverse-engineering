package p222;

import androidx.activity.AbstractC0900;
import java.util.Arrays;
import p209.C8657;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8742 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8657 f22267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8741 f22268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f22269 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f22266 = 8;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int[] f22265 = new int[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int[] f22264 = new int[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float[] f22271 = new float[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f22270 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f22272 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f22273 = false;

    public C8742(C8741 c8741, C8657 c8657) {
        this.f22268 = c8741;
        this.f22267 = c8657;
    }

    public final String toString() {
        int i = this.f22270;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f22269; i2++) {
            StringBuilder sbM700 = AbstractC0900.m700(string.concat(" -> "));
            sbM700.append(this.f22271[i]);
            sbM700.append(" : ");
            StringBuilder sbM7002 = AbstractC0900.m700(sbM700.toString());
            sbM7002.append(((C8738[]) this.f22267.f21712)[this.f22265[i]]);
            string = sbM7002.toString();
            i = this.f22264[i];
        }
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float m13960(int i) {
        int i2 = this.f22270;
        for (int i3 = 0; i2 != -1 && i3 < this.f22269; i3++) {
            if (i3 == i) {
                return this.f22271[i2];
            }
            i2 = this.f22264[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8738 m13961(int i) {
        int i2 = this.f22270;
        for (int i3 = 0; i2 != -1 && i3 < this.f22269; i3++) {
            if (i3 == i) {
                return ((C8738[]) this.f22267.f21712)[this.f22265[i2]];
            }
            i2 = this.f22264[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m13962() {
        return this.f22269;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float m13963(C8738 c8738) {
        int i = this.f22270;
        for (int i2 = 0; i != -1 && i2 < this.f22269; i2++) {
            if (this.f22265[i] == c8738.f22235) {
                return this.f22271[i];
            }
            i = this.f22264[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13964() {
        int i = this.f22270;
        for (int i2 = 0; i != -1 && i2 < this.f22269; i2++) {
            C8738 c8738 = ((C8738[]) this.f22267.f21712)[this.f22265[i]];
            if (c8738 != null) {
                c8738.m13927(this.f22268);
            }
            i = this.f22264[i];
        }
        this.f22270 = -1;
        this.f22272 = -1;
        this.f22273 = false;
        this.f22269 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13965(C8738 c8738, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f22270;
            C8741 c8741 = this.f22268;
            if (i == -1) {
                this.f22270 = 0;
                this.f22271[0] = f;
                this.f22265[0] = c8738.f22235;
                this.f22264[0] = -1;
                c8738.f22226++;
                c8738.m13928(c8741);
                this.f22269++;
                if (this.f22273) {
                    return;
                }
                int i2 = this.f22272 + 1;
                this.f22272 = i2;
                int[] iArr = this.f22265;
                if (i2 >= iArr.length) {
                    this.f22273 = true;
                    this.f22272 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f22269; i4++) {
                int i5 = this.f22265[i];
                int i6 = c8738.f22235;
                if (i5 == i6) {
                    float[] fArr = this.f22271;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.f22270;
                        int[] iArr2 = this.f22264;
                        if (i == i7) {
                            this.f22270 = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c8738.m13927(c8741);
                        }
                        if (this.f22273) {
                            this.f22272 = i;
                        }
                        c8738.f22226--;
                        this.f22269--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f22264[i];
            }
            int length = this.f22272;
            int i8 = length + 1;
            if (this.f22273) {
                int[] iArr3 = this.f22265;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f22265;
            if (length >= iArr4.length && this.f22269 < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f22265;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f22265;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f22266 * 2;
                this.f22266 = i10;
                this.f22273 = false;
                this.f22272 = length - 1;
                this.f22271 = Arrays.copyOf(this.f22271, i10);
                this.f22265 = Arrays.copyOf(this.f22265, this.f22266);
                this.f22264 = Arrays.copyOf(this.f22264, this.f22266);
            }
            this.f22265[length] = c8738.f22235;
            this.f22271[length] = f;
            int[] iArr7 = this.f22264;
            if (i3 != -1) {
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                iArr7[length] = this.f22270;
                this.f22270 = length;
            }
            c8738.f22226++;
            c8738.m13928(c8741);
            this.f22269++;
            if (!this.f22273) {
                this.f22272++;
            }
            int i11 = this.f22272;
            int[] iArr8 = this.f22265;
            if (i11 >= iArr8.length) {
                this.f22273 = true;
                this.f22272 = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float m13966(C8738 c8738, boolean z) {
        int i = this.f22270;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f22269) {
            if (this.f22265[i] == c8738.f22235) {
                int i4 = this.f22270;
                int[] iArr = this.f22264;
                if (i == i4) {
                    this.f22270 = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c8738.m13927(this.f22268);
                }
                c8738.f22226--;
                this.f22269--;
                this.f22265[i] = -1;
                if (this.f22273) {
                    this.f22272 = i;
                }
                return this.f22271[i];
            }
            i2++;
            i3 = i;
            i = this.f22264[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13967(C8738 c8738, float f) {
        if (f == 0.0f) {
            m13966(c8738, true);
            return;
        }
        int i = this.f22270;
        C8741 c8741 = this.f22268;
        if (i == -1) {
            this.f22270 = 0;
            this.f22271[0] = f;
            this.f22265[0] = c8738.f22235;
            this.f22264[0] = -1;
            c8738.f22226++;
            c8738.m13928(c8741);
            this.f22269++;
            if (this.f22273) {
                return;
            }
            int i2 = this.f22272 + 1;
            this.f22272 = i2;
            int[] iArr = this.f22265;
            if (i2 >= iArr.length) {
                this.f22273 = true;
                this.f22272 = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f22269; i4++) {
            int i5 = this.f22265[i];
            int i6 = c8738.f22235;
            if (i5 == i6) {
                this.f22271[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f22264[i];
        }
        int length = this.f22272;
        int i7 = length + 1;
        if (this.f22273) {
            int[] iArr2 = this.f22265;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f22265;
        if (length >= iArr3.length && this.f22269 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f22265;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f22265;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f22266 * 2;
            this.f22266 = i9;
            this.f22273 = false;
            this.f22272 = length - 1;
            this.f22271 = Arrays.copyOf(this.f22271, i9);
            this.f22265 = Arrays.copyOf(this.f22265, this.f22266);
            this.f22264 = Arrays.copyOf(this.f22264, this.f22266);
        }
        this.f22265[length] = c8738.f22235;
        this.f22271[length] = f;
        int[] iArr6 = this.f22264;
        if (i3 != -1) {
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            iArr6[length] = this.f22270;
            this.f22270 = length;
        }
        c8738.f22226++;
        c8738.m13928(c8741);
        int i10 = this.f22269 + 1;
        this.f22269 = i10;
        if (!this.f22273) {
            this.f22272++;
        }
        int[] iArr7 = this.f22265;
        if (i10 >= iArr7.length) {
            this.f22273 = true;
        }
        if (this.f22272 >= iArr7.length) {
            this.f22273 = true;
            this.f22272 = iArr7.length - 1;
        }
    }
}
