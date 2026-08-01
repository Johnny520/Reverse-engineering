package p222;

import androidx.compose.animation.C1272;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.C5703;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8739 extends C8741 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C8738[] f22238;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f22239;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C8738[] f22240;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C5703 f22241;

    @Override // p222.C8741
    public final String toString() {
        C5703 c5703 = this.f22241;
        String str = " goal -> (" + this.f22262 + ") : ";
        for (int i = 0; i < this.f22239; i++) {
            c5703.f14509 = this.f22238[i];
            str = str + c5703 + " ";
        }
        return str;
    }

    @Override // p222.C8741
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo13929() {
        return this.f22239 == 0;
    }

    @Override // p222.C8741
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8738 mo13930(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f22239; i2++) {
            C8738[] c8738Arr = this.f22238;
            C8738 c8738 = c8738Arr[i2];
            if (!zArr[c8738.f22235]) {
                C5703 c5703 = this.f22241;
                c5703.f14509 = c8738;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((C8738) c5703.f14509).f22231[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C8738 c87382 = c8738Arr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = c87382.f22231[i3];
                            float f3 = ((C8738) c5703.f14509).f22231[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f22238[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m13931(C8738 c8738) {
        int i = 0;
        while (i < this.f22239) {
            if (this.f22238[i] == c8738) {
                while (true) {
                    int i2 = this.f22239;
                    if (i >= i2 - 1) {
                        this.f22239 = i2 - 1;
                        c8738.f22237 = false;
                        return;
                    } else {
                        C8738[] c8738Arr = this.f22238;
                        int i3 = i + 1;
                        c8738Arr[i] = c8738Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p222.C8741
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo13932(C8740 c8740, C8741 c8741, boolean z) {
        C8738 c8738 = c8741.f22263;
        if (c8738 == null) {
            return;
        }
        float[] fArr = c8738.f22231;
        C8742 c8742 = c8741.f22260;
        int iM13962 = c8742.m13962();
        for (int i = 0; i < iM13962; i++) {
            C8738 c8738M13961 = c8742.m13961(i);
            float fM13960 = c8742.m13960(i);
            C5703 c5703 = this.f22241;
            c5703.f14509 = c8738M13961;
            if (c8738M13961.f22237) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C8738) c5703.f14509).f22231;
                    float f = (fArr[i2] * fM13960) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C8738) c5703.f14509).f22231[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((C8739) c5703.f14510).m13931((C8738) c5703.f14509);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM13960;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C8738) c5703.f14509).f22231[i3] = f3;
                    } else {
                        ((C8738) c5703.f14509).f22231[i3] = 0.0f;
                    }
                }
                m13933(c8738M13961);
            }
            this.f22262 = (c8741.f22262 * fM13960) + this.f22262;
        }
        m13931(c8738);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13933(C8738 c8738) {
        int i;
        C8738[] c8738Arr;
        int i2 = this.f22239 + 1;
        C8738[] c8738Arr2 = this.f22238;
        if (i2 > c8738Arr2.length) {
            C8738[] c8738Arr3 = (C8738[]) Arrays.copyOf(c8738Arr2, c8738Arr2.length * 2);
            this.f22238 = c8738Arr3;
            this.f22240 = (C8738[]) Arrays.copyOf(c8738Arr3, c8738Arr3.length * 2);
        }
        C8738[] c8738Arr4 = this.f22238;
        int i3 = this.f22239;
        c8738Arr4[i3] = c8738;
        int i4 = i3 + 1;
        this.f22239 = i4;
        if (i4 > 1 && c8738Arr4[i3].f22235 > c8738.f22235) {
            int i5 = 0;
            while (true) {
                i = this.f22239;
                c8738Arr = this.f22240;
                if (i5 >= i) {
                    break;
                }
                c8738Arr[i5] = this.f22238[i5];
                i5++;
            }
            Arrays.sort(c8738Arr, 0, i, new C1272(10));
            for (int i6 = 0; i6 < this.f22239; i6++) {
                this.f22238[i6] = this.f22240[i6];
            }
        }
        c8738.f22237 = true;
        c8738.m13928(this);
    }
}
