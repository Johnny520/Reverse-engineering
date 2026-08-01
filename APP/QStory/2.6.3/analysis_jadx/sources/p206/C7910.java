package p206;

import androidx.compose.animation.C0426;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.C4871;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7910 extends C7912 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7909[] f21893;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f21894;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C7909[] f21895;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C4871 f21896;

    @Override // p206.C7912
    public final String toString() {
        C4871 c4871 = this.f21896;
        String str = " goal -> (" + this.f21917 + ") : ";
        for (int i = 0; i < this.f21894; i++) {
            c4871.f14164 = this.f21893[i];
            str = str + c4871 + " ";
        }
        return str;
    }

    @Override // p206.C7912
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo13370() {
        return this.f21894 == 0;
    }

    @Override // p206.C7912
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7909 mo13371(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f21894; i2++) {
            C7909[] c7909Arr = this.f21893;
            C7909 c7909 = c7909Arr[i2];
            if (!zArr[c7909.f21890]) {
                C4871 c4871 = this.f21896;
                c4871.f14164 = c7909;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((C7909) c4871.f14164).f21886[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C7909 c79092 = c7909Arr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = c79092.f21886[i3];
                            float f3 = ((C7909) c4871.f14164).f21886[i3];
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
        return this.f21893[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m13372(C7909 c7909) {
        int i = 0;
        while (i < this.f21894) {
            if (this.f21893[i] == c7909) {
                while (true) {
                    int i2 = this.f21894;
                    if (i >= i2 - 1) {
                        this.f21894 = i2 - 1;
                        c7909.f21892 = false;
                        return;
                    } else {
                        C7909[] c7909Arr = this.f21893;
                        int i3 = i + 1;
                        c7909Arr[i] = c7909Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p206.C7912
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo13373(C7911 c7911, C7912 c7912, boolean z) {
        C7909 c7909 = c7912.f21918;
        if (c7909 == null) {
            return;
        }
        float[] fArr = c7909.f21886;
        C7913 c7913 = c7912.f21915;
        int iM13403 = c7913.m13403();
        for (int i = 0; i < iM13403; i++) {
            C7909 c7909M13402 = c7913.m13402(i);
            float fM13401 = c7913.m13401(i);
            C4871 c4871 = this.f21896;
            c4871.f14164 = c7909M13402;
            if (c7909M13402.f21892) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C7909) c4871.f14164).f21886;
                    float f = (fArr[i2] * fM13401) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C7909) c4871.f14164).f21886[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((C7910) c4871.f14165).m13372((C7909) c4871.f14164);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM13401;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C7909) c4871.f14164).f21886[i3] = f3;
                    } else {
                        ((C7909) c4871.f14164).f21886[i3] = 0.0f;
                    }
                }
                m13374(c7909M13402);
            }
            this.f21917 = (c7912.f21917 * fM13401) + this.f21917;
        }
        m13372(c7909);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13374(C7909 c7909) {
        int i;
        C7909[] c7909Arr;
        int i2 = this.f21894 + 1;
        C7909[] c7909Arr2 = this.f21893;
        if (i2 > c7909Arr2.length) {
            C7909[] c7909Arr3 = (C7909[]) Arrays.copyOf(c7909Arr2, c7909Arr2.length * 2);
            this.f21893 = c7909Arr3;
            this.f21895 = (C7909[]) Arrays.copyOf(c7909Arr3, c7909Arr3.length * 2);
        }
        C7909[] c7909Arr4 = this.f21893;
        int i3 = this.f21894;
        c7909Arr4[i3] = c7909;
        int i4 = i3 + 1;
        this.f21894 = i4;
        if (i4 > 1 && c7909Arr4[i3].f21890 > c7909.f21890) {
            int i5 = 0;
            while (true) {
                i = this.f21894;
                c7909Arr = this.f21895;
                if (i5 >= i) {
                    break;
                }
                c7909Arr[i5] = this.f21893[i5];
                i5++;
            }
            Arrays.sort(c7909Arr, 0, i, new C0426(10));
            for (int i6 = 0; i6 < this.f21894; i6++) {
                this.f21893[i6] = this.f21895[i6];
            }
        }
        c7909.f21892 = true;
        c7909.m13369(this);
    }
}
