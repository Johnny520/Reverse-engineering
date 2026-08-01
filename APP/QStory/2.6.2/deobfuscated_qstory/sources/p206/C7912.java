package p206;

import androidx.activity.AbstractC0053;
import java.util.Arrays;
import p193.C7827;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7912 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7827 f21925;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7911 f21926;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21927 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f21924 = 8;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int[] f21923 = new int[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int[] f21922 = new int[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float[] f21929 = new float[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f21928 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21930 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f21931 = false;

    public C7912(C7911 c7911, C7827 c7827) {
        this.f21926 = c7911;
        this.f21925 = c7827;
    }

    public final String toString() {
        int i = this.f21928;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f21927; i2++) {
            StringBuilder sbM149 = AbstractC0053.m149(string.concat(" -> "));
            sbM149.append(this.f21929[i]);
            sbM149.append(" : ");
            StringBuilder sbM1492 = AbstractC0053.m149(sbM149.toString());
            sbM1492.append(((C7908[]) this.f21925.f21370)[this.f21923[i]]);
            string = sbM1492.toString();
            i = this.f21922[i];
        }
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float m13373(int i) {
        int i2 = this.f21928;
        for (int i3 = 0; i2 != -1 && i3 < this.f21927; i3++) {
            if (i3 == i) {
                return this.f21929[i2];
            }
            i2 = this.f21922[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7908 m13374(int i) {
        int i2 = this.f21928;
        for (int i3 = 0; i2 != -1 && i3 < this.f21927; i3++) {
            if (i3 == i) {
                return ((C7908[]) this.f21925.f21370)[this.f21923[i2]];
            }
            i2 = this.f21922[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m13375() {
        return this.f21927;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float m13376(C7908 c7908) {
        int i = this.f21928;
        for (int i2 = 0; i != -1 && i2 < this.f21927; i2++) {
            if (this.f21923[i] == c7908.f21893) {
                return this.f21929[i];
            }
            i = this.f21922[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13377() {
        int i = this.f21928;
        for (int i2 = 0; i != -1 && i2 < this.f21927; i2++) {
            C7908 c7908 = ((C7908[]) this.f21925.f21370)[this.f21923[i]];
            if (c7908 != null) {
                c7908.m13340(this.f21926);
            }
            i = this.f21922[i];
        }
        this.f21928 = -1;
        this.f21930 = -1;
        this.f21931 = false;
        this.f21927 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13378(C7908 c7908, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f21928;
            C7911 c7911 = this.f21926;
            if (i == -1) {
                this.f21928 = 0;
                this.f21929[0] = f;
                this.f21923[0] = c7908.f21893;
                this.f21922[0] = -1;
                c7908.f21884++;
                c7908.m13341(c7911);
                this.f21927++;
                if (this.f21931) {
                    return;
                }
                int i2 = this.f21930 + 1;
                this.f21930 = i2;
                int[] iArr = this.f21923;
                if (i2 >= iArr.length) {
                    this.f21931 = true;
                    this.f21930 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f21927; i4++) {
                int i5 = this.f21923[i];
                int i6 = c7908.f21893;
                if (i5 == i6) {
                    float[] fArr = this.f21929;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.f21928;
                        int[] iArr2 = this.f21922;
                        if (i == i7) {
                            this.f21928 = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c7908.m13340(c7911);
                        }
                        if (this.f21931) {
                            this.f21930 = i;
                        }
                        c7908.f21884--;
                        this.f21927--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f21922[i];
            }
            int length = this.f21930;
            int i8 = length + 1;
            if (this.f21931) {
                int[] iArr3 = this.f21923;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f21923;
            if (length >= iArr4.length && this.f21927 < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f21923;
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
            int[] iArr6 = this.f21923;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f21924 * 2;
                this.f21924 = i10;
                this.f21931 = false;
                this.f21930 = length - 1;
                this.f21929 = Arrays.copyOf(this.f21929, i10);
                this.f21923 = Arrays.copyOf(this.f21923, this.f21924);
                this.f21922 = Arrays.copyOf(this.f21922, this.f21924);
            }
            this.f21923[length] = c7908.f21893;
            this.f21929[length] = f;
            int[] iArr7 = this.f21922;
            if (i3 != -1) {
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                iArr7[length] = this.f21928;
                this.f21928 = length;
            }
            c7908.f21884++;
            c7908.m13341(c7911);
            this.f21927++;
            if (!this.f21931) {
                this.f21930++;
            }
            int i11 = this.f21930;
            int[] iArr8 = this.f21923;
            if (i11 >= iArr8.length) {
                this.f21931 = true;
                this.f21930 = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float m13379(C7908 c7908, boolean z) {
        int i = this.f21928;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f21927) {
            if (this.f21923[i] == c7908.f21893) {
                int i4 = this.f21928;
                int[] iArr = this.f21922;
                if (i == i4) {
                    this.f21928 = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c7908.m13340(this.f21926);
                }
                c7908.f21884--;
                this.f21927--;
                this.f21923[i] = -1;
                if (this.f21931) {
                    this.f21930 = i;
                }
                return this.f21929[i];
            }
            i2++;
            i3 = i;
            i = this.f21922[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13380(C7908 c7908, float f) {
        if (f == 0.0f) {
            m13379(c7908, true);
            return;
        }
        int i = this.f21928;
        C7911 c7911 = this.f21926;
        if (i == -1) {
            this.f21928 = 0;
            this.f21929[0] = f;
            this.f21923[0] = c7908.f21893;
            this.f21922[0] = -1;
            c7908.f21884++;
            c7908.m13341(c7911);
            this.f21927++;
            if (this.f21931) {
                return;
            }
            int i2 = this.f21930 + 1;
            this.f21930 = i2;
            int[] iArr = this.f21923;
            if (i2 >= iArr.length) {
                this.f21931 = true;
                this.f21930 = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f21927; i4++) {
            int i5 = this.f21923[i];
            int i6 = c7908.f21893;
            if (i5 == i6) {
                this.f21929[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f21922[i];
        }
        int length = this.f21930;
        int i7 = length + 1;
        if (this.f21931) {
            int[] iArr2 = this.f21923;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f21923;
        if (length >= iArr3.length && this.f21927 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f21923;
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
        int[] iArr5 = this.f21923;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f21924 * 2;
            this.f21924 = i9;
            this.f21931 = false;
            this.f21930 = length - 1;
            this.f21929 = Arrays.copyOf(this.f21929, i9);
            this.f21923 = Arrays.copyOf(this.f21923, this.f21924);
            this.f21922 = Arrays.copyOf(this.f21922, this.f21924);
        }
        this.f21923[length] = c7908.f21893;
        this.f21929[length] = f;
        int[] iArr6 = this.f21922;
        if (i3 != -1) {
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            iArr6[length] = this.f21928;
            this.f21928 = length;
        }
        c7908.f21884++;
        c7908.m13341(c7911);
        int i10 = this.f21927 + 1;
        this.f21927 = i10;
        if (!this.f21931) {
            this.f21930++;
        }
        int[] iArr7 = this.f21923;
        if (i10 >= iArr7.length) {
            this.f21931 = true;
        }
        if (this.f21930 >= iArr7.length) {
            this.f21931 = true;
            this.f21930 = iArr7.length - 1;
        }
    }
}
