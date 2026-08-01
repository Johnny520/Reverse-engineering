package p206;

import androidx.compose.animation.C0426;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.C4870;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7909 extends C7911 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7908[] f21896;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f21897;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C7908[] f21898;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C4870 f21899;

    @Override // p206.C7911
    public final String toString() {
        C4870 c4870 = this.f21899;
        String str = " goal -> (" + this.f21920 + ") : ";
        for (int i = 0; i < this.f21897; i++) {
            c4870.f14160 = this.f21896[i];
            str = str + c4870 + " ";
        }
        return str;
    }

    @Override // p206.C7911
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo13342() {
        return this.f21897 == 0;
    }

    @Override // p206.C7911
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7908 mo13343(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f21897; i2++) {
            C7908[] c7908Arr = this.f21896;
            C7908 c7908 = c7908Arr[i2];
            if (!zArr[c7908.f21893]) {
                C4870 c4870 = this.f21899;
                c4870.f14160 = c7908;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((C7908) c4870.f14160).f21889[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C7908 c79082 = c7908Arr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = c79082.f21889[i3];
                            float f3 = ((C7908) c4870.f14160).f21889[i3];
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
        return this.f21896[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m13344(C7908 c7908) {
        int i = 0;
        while (i < this.f21897) {
            if (this.f21896[i] == c7908) {
                while (true) {
                    int i2 = this.f21897;
                    if (i >= i2 - 1) {
                        this.f21897 = i2 - 1;
                        c7908.f21895 = false;
                        return;
                    } else {
                        C7908[] c7908Arr = this.f21896;
                        int i3 = i + 1;
                        c7908Arr[i] = c7908Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p206.C7911
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo13345(C7910 c7910, C7911 c7911, boolean z) {
        C7908 c7908 = c7911.f21921;
        if (c7908 == null) {
            return;
        }
        float[] fArr = c7908.f21889;
        C7912 c7912 = c7911.f21918;
        int iM13375 = c7912.m13375();
        for (int i = 0; i < iM13375; i++) {
            C7908 c7908M13374 = c7912.m13374(i);
            float fM13373 = c7912.m13373(i);
            C4870 c4870 = this.f21899;
            c4870.f14160 = c7908M13374;
            if (c7908M13374.f21895) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C7908) c4870.f14160).f21889;
                    float f = (fArr[i2] * fM13373) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C7908) c4870.f14160).f21889[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((C7909) c4870.f14161).m13344((C7908) c4870.f14160);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM13373;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C7908) c4870.f14160).f21889[i3] = f3;
                    } else {
                        ((C7908) c4870.f14160).f21889[i3] = 0.0f;
                    }
                }
                m13346(c7908M13374);
            }
            this.f21920 = (c7911.f21920 * fM13373) + this.f21920;
        }
        m13344(c7908);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13346(C7908 c7908) {
        int i;
        C7908[] c7908Arr;
        int i2 = this.f21897 + 1;
        C7908[] c7908Arr2 = this.f21896;
        if (i2 > c7908Arr2.length) {
            C7908[] c7908Arr3 = (C7908[]) Arrays.copyOf(c7908Arr2, c7908Arr2.length * 2);
            this.f21896 = c7908Arr3;
            this.f21898 = (C7908[]) Arrays.copyOf(c7908Arr3, c7908Arr3.length * 2);
        }
        C7908[] c7908Arr4 = this.f21896;
        int i3 = this.f21897;
        c7908Arr4[i3] = c7908;
        int i4 = i3 + 1;
        this.f21897 = i4;
        if (i4 > 1 && c7908Arr4[i3].f21893 > c7908.f21893) {
            int i5 = 0;
            while (true) {
                i = this.f21897;
                c7908Arr = this.f21898;
                if (i5 >= i) {
                    break;
                }
                c7908Arr[i5] = this.f21896[i5];
                i5++;
            }
            Arrays.sort(c7908Arr, 0, i, new C0426(10));
            for (int i6 = 0; i6 < this.f21897; i6++) {
                this.f21896[i6] = this.f21898[i6];
            }
        }
        c7908.f21895 = true;
        c7908.m13341(this);
    }
}
