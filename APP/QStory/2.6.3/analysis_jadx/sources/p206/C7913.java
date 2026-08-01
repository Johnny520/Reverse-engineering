package p206;

import androidx.activity.AbstractC0053;
import java.util.Arrays;
import p193.C7828;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7913 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7828 f21922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7912 f21923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21924 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f21921 = 8;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int[] f21920 = new int[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int[] f21919 = new int[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float[] f21926 = new float[8];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f21925 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21927 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f21928 = false;

    public C7913(C7912 c7912, C7828 c7828) {
        this.f21923 = c7912;
        this.f21922 = c7828;
    }

    public final String toString() {
        int i = this.f21925;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f21924; i2++) {
            StringBuilder sbM140 = AbstractC0053.m140(string.concat(" -> "));
            sbM140.append(this.f21926[i]);
            sbM140.append(" : ");
            StringBuilder sbM1402 = AbstractC0053.m140(sbM140.toString());
            sbM1402.append(((C7909[]) this.f21922.f21367)[this.f21920[i]]);
            string = sbM1402.toString();
            i = this.f21919[i];
        }
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float m13401(int i) {
        int i2 = this.f21925;
        for (int i3 = 0; i2 != -1 && i3 < this.f21924; i3++) {
            if (i3 == i) {
                return this.f21926[i2];
            }
            i2 = this.f21919[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7909 m13402(int i) {
        int i2 = this.f21925;
        for (int i3 = 0; i2 != -1 && i3 < this.f21924; i3++) {
            if (i3 == i) {
                return ((C7909[]) this.f21922.f21367)[this.f21920[i2]];
            }
            i2 = this.f21919[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m13403() {
        return this.f21924;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float m13404(C7909 c7909) {
        int i = this.f21925;
        for (int i2 = 0; i != -1 && i2 < this.f21924; i2++) {
            if (this.f21920[i] == c7909.f21890) {
                return this.f21926[i];
            }
            i = this.f21919[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13405() {
        int i = this.f21925;
        for (int i2 = 0; i != -1 && i2 < this.f21924; i2++) {
            C7909 c7909 = ((C7909[]) this.f21922.f21367)[this.f21920[i]];
            if (c7909 != null) {
                c7909.m13368(this.f21923);
            }
            i = this.f21919[i];
        }
        this.f21925 = -1;
        this.f21927 = -1;
        this.f21928 = false;
        this.f21924 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13406(C7909 c7909, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f21925;
            C7912 c7912 = this.f21923;
            if (i == -1) {
                this.f21925 = 0;
                this.f21926[0] = f;
                this.f21920[0] = c7909.f21890;
                this.f21919[0] = -1;
                c7909.f21881++;
                c7909.m13369(c7912);
                this.f21924++;
                if (this.f21928) {
                    return;
                }
                int i2 = this.f21927 + 1;
                this.f21927 = i2;
                int[] iArr = this.f21920;
                if (i2 >= iArr.length) {
                    this.f21928 = true;
                    this.f21927 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f21924; i4++) {
                int i5 = this.f21920[i];
                int i6 = c7909.f21890;
                if (i5 == i6) {
                    float[] fArr = this.f21926;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.f21925;
                        int[] iArr2 = this.f21919;
                        if (i == i7) {
                            this.f21925 = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c7909.m13368(c7912);
                        }
                        if (this.f21928) {
                            this.f21927 = i;
                        }
                        c7909.f21881--;
                        this.f21924--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f21919[i];
            }
            int length = this.f21927;
            int i8 = length + 1;
            if (this.f21928) {
                int[] iArr3 = this.f21920;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f21920;
            if (length >= iArr4.length && this.f21924 < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f21920;
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
            int[] iArr6 = this.f21920;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f21921 * 2;
                this.f21921 = i10;
                this.f21928 = false;
                this.f21927 = length - 1;
                this.f21926 = Arrays.copyOf(this.f21926, i10);
                this.f21920 = Arrays.copyOf(this.f21920, this.f21921);
                this.f21919 = Arrays.copyOf(this.f21919, this.f21921);
            }
            this.f21920[length] = c7909.f21890;
            this.f21926[length] = f;
            int[] iArr7 = this.f21919;
            if (i3 != -1) {
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                iArr7[length] = this.f21925;
                this.f21925 = length;
            }
            c7909.f21881++;
            c7909.m13369(c7912);
            this.f21924++;
            if (!this.f21928) {
                this.f21927++;
            }
            int i11 = this.f21927;
            int[] iArr8 = this.f21920;
            if (i11 >= iArr8.length) {
                this.f21928 = true;
                this.f21927 = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float m13407(C7909 c7909, boolean z) {
        int i = this.f21925;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f21924) {
            if (this.f21920[i] == c7909.f21890) {
                int i4 = this.f21925;
                int[] iArr = this.f21919;
                if (i == i4) {
                    this.f21925 = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c7909.m13368(this.f21923);
                }
                c7909.f21881--;
                this.f21924--;
                this.f21920[i] = -1;
                if (this.f21928) {
                    this.f21927 = i;
                }
                return this.f21926[i];
            }
            i2++;
            i3 = i;
            i = this.f21919[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13408(C7909 c7909, float f) {
        if (f == 0.0f) {
            m13407(c7909, true);
            return;
        }
        int i = this.f21925;
        C7912 c7912 = this.f21923;
        if (i == -1) {
            this.f21925 = 0;
            this.f21926[0] = f;
            this.f21920[0] = c7909.f21890;
            this.f21919[0] = -1;
            c7909.f21881++;
            c7909.m13369(c7912);
            this.f21924++;
            if (this.f21928) {
                return;
            }
            int i2 = this.f21927 + 1;
            this.f21927 = i2;
            int[] iArr = this.f21920;
            if (i2 >= iArr.length) {
                this.f21928 = true;
                this.f21927 = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f21924; i4++) {
            int i5 = this.f21920[i];
            int i6 = c7909.f21890;
            if (i5 == i6) {
                this.f21926[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f21919[i];
        }
        int length = this.f21927;
        int i7 = length + 1;
        if (this.f21928) {
            int[] iArr2 = this.f21920;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f21920;
        if (length >= iArr3.length && this.f21924 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f21920;
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
        int[] iArr5 = this.f21920;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f21921 * 2;
            this.f21921 = i9;
            this.f21928 = false;
            this.f21927 = length - 1;
            this.f21926 = Arrays.copyOf(this.f21926, i9);
            this.f21920 = Arrays.copyOf(this.f21920, this.f21921);
            this.f21919 = Arrays.copyOf(this.f21919, this.f21921);
        }
        this.f21920[length] = c7909.f21890;
        this.f21926[length] = f;
        int[] iArr6 = this.f21919;
        if (i3 != -1) {
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            iArr6[length] = this.f21925;
            this.f21925 = length;
        }
        c7909.f21881++;
        c7909.m13369(c7912);
        int i10 = this.f21924 + 1;
        this.f21924 = i10;
        if (!this.f21928) {
            this.f21927++;
        }
        int[] iArr7 = this.f21920;
        if (i10 >= iArr7.length) {
            this.f21928 = true;
        }
        if (this.f21927 >= iArr7.length) {
            this.f21928 = true;
            this.f21927 = iArr7.length - 1;
        }
    }
}
