package androidx.compose.runtime.composer.gapbuffer;

import androidx.activity.AbstractC0900;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.AbstractC2227;
import androidx.compose.runtime.C2145;
import androidx.compose.runtime.C2204;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2069 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f3895;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f3896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object[] f3897;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f3898;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f3899;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f3900;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f3901;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f3902;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f3903;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f3904;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f3905;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f3906;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f3907;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C2145 f3908;

    public C2069(C2068 c2068) {
        this.f3900 = c2068;
        this.f3899 = c2068.f3890;
        int i = c2068.f3889;
        this.f3898 = i;
        this.f3897 = c2068.f3893;
        this.f3896 = c2068.f3894;
        this.f3903 = i;
        this.f3907 = -1;
        this.f3908 = new C2145();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f3904);
        sb.append(", key=");
        sb.append(m2644());
        sb.append(", parent=");
        sb.append(this.f3907);
        sb.append(", end=");
        return AbstractC0900.m716(sb, this.f3903, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m2628() {
        int i = this.f3904;
        if (i < this.f3903) {
            return m2632(this.f3899, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2629() {
        if (this.f3905 == 0) {
            if (this.f3904 != this.f3903) {
                AbstractC2209.m3067("endGroup() not called at the end of a group");
            }
            int i = (this.f3907 * 5) + 2;
            int[] iArr = this.f3899;
            int i2 = iArr[i];
            this.f3907 = i2;
            int i3 = this.f3898;
            this.f3903 = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int iM2868 = this.f3908.m2868();
            if (iM2868 < 0) {
                this.f3906 = 0;
                this.f3902 = 0;
            } else {
                this.f3906 = iM2868;
                this.f3902 = i2 >= i3 + (-1) ? this.f3896 : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m2630(int i) {
        return (this.f3899[(i * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2631() {
        this.f3895 = true;
        if (this.f3900.f3891 <= 0) {
            AbstractC2209.m3067("Unexpected reader close()");
        }
        r0.f3891--;
        this.f3897 = new Object[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m2632(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.f3897[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return C2204.f4319;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2065 m2633(int i) {
        ArrayList arrayList = this.f3900.f3886;
        int iM2697 = AbstractC2073.m2697(arrayList, i, this.f3898);
        if (iM2697 >= 0) {
            return (C2065) arrayList.get(iM2697);
        }
        C2065 c2065 = new C2065(i);
        arrayList.add(-(iM2697 + 1), c2065);
        return c2065;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m2634() {
        if (!(this.f3905 == 0)) {
            AbstractC2209.m3067("Cannot skip the enclosing group while in an empty region");
        }
        this.f3904 = this.f3903;
        this.f3906 = 0;
        this.f3902 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int m2635() {
        if (this.f3905 != 0) {
            AbstractC2209.m3067("Cannot skip while in an empty region");
        }
        int i = this.f3904;
        int i2 = i * 5;
        int[] iArr = this.f3899;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.f3904 = iArr[i2 + 3] + i;
        return i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m2636() {
        if (this.f3905 <= 0) {
            int i = this.f3907;
            int i2 = this.f3904;
            int i3 = i2 * 5;
            int[] iArr = this.f3899;
            if (iArr[i3 + 2] != i) {
                AbstractC2227.m3098("Invalid slot table detected");
            }
            int i4 = this.f3906;
            int i5 = this.f3902;
            C2145 c2145 = this.f3908;
            if (i4 == 0 && i5 == 0) {
                c2145.m2867(-1);
            } else {
                c2145.m2867(i4);
            }
            this.f3907 = i2;
            this.f3903 = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.f3904 = i6;
            this.f3906 = AbstractC2073.m2700(iArr, i2);
            this.f3902 = i2 >= this.f3898 + (-1) ? this.f3896 : iArr[(i6 * 5) + 4];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Object m2637(int i) {
        int i2 = i * 5;
        int[] iArr = this.f3899;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.f3897[iArr[i2 + 4]] : C2204.f4319;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Object m2638() {
        int i;
        if (this.f3905 > 0 || (i = this.f3906) >= this.f3902) {
            this.f3901 = false;
            return C2204.f4319;
        }
        this.f3901 = true;
        Object[] objArr = this.f3897;
        this.f3906 = i + 1;
        return objArr[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m2639(int i) {
        return this.f3899[(i * 5) + 2];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m2640(int i) {
        if (this.f3905 != 0) {
            AbstractC2209.m3067("Cannot reposition while in an empty region");
        }
        this.f3904 = i;
        int[] iArr = this.f3899;
        int i2 = this.f3898;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.f3907) {
            this.f3907 = i3;
            if (i3 < 0) {
                this.f3903 = i2;
            } else {
                this.f3903 = iArr[(i3 * 5) + 3] + i3;
            }
            this.f3906 = 0;
            this.f3902 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m2641(int i) {
        return this.f3899[(i * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object m2642(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f3897[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object m2643(int i, int i2) {
        int[] iArr = this.f3899;
        int iM2700 = AbstractC2073.m2700(iArr, i);
        int i3 = i + 1;
        int i4 = iM2700 + i2;
        return i4 < (i3 < this.f3898 ? iArr[(i3 * 5) + 4] : this.f3896) ? this.f3897[i4] : C2204.f4319;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m2644() {
        int i = this.f3904;
        if (i >= this.f3903) {
            return 0;
        }
        return this.f3899[i * 5];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m2645(int i) {
        return (this.f3899[(i * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m2646(int i) {
        return (this.f3899[(i * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m2647(int i) {
        return this.f3899[i * 5];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m2648(int i) {
        return (this.f3899[(i * 5) + 1] & 134217728) != 0;
    }
}
