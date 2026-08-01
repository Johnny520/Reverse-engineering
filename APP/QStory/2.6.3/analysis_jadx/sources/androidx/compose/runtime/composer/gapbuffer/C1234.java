package androidx.compose.runtime.composer.gapbuffer;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.AbstractC1392;
import androidx.compose.runtime.C1310;
import androidx.compose.runtime.C1369;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1234 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f3550;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f3551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object[] f3552;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f3553;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f3554;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1233 f3555;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f3556;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f3557;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f3558;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f3559;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f3560;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f3561;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f3562;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C1310 f3563;

    public C1234(C1233 c1233) {
        this.f3555 = c1233;
        this.f3554 = c1233.f3545;
        int i = c1233.f3544;
        this.f3553 = i;
        this.f3552 = c1233.f3548;
        this.f3551 = c1233.f3549;
        this.f3558 = i;
        this.f3562 = -1;
        this.f3563 = new C1310();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f3559);
        sb.append(", key=");
        sb.append(m2084());
        sb.append(", parent=");
        sb.append(this.f3562);
        sb.append(", end=");
        return AbstractC0053.m156(sb, this.f3558, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m2068() {
        int i = this.f3559;
        if (i < this.f3558) {
            return m2072(this.f3554, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2069() {
        if (this.f3560 == 0) {
            if (this.f3559 != this.f3558) {
                AbstractC1374.m2507("endGroup() not called at the end of a group");
            }
            int i = (this.f3562 * 5) + 2;
            int[] iArr = this.f3554;
            int i2 = iArr[i];
            this.f3562 = i2;
            int i3 = this.f3553;
            this.f3558 = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int iM2308 = this.f3563.m2308();
            if (iM2308 < 0) {
                this.f3561 = 0;
                this.f3557 = 0;
            } else {
                this.f3561 = iM2308;
                this.f3557 = i2 >= i3 + (-1) ? this.f3551 : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m2070(int i) {
        return (this.f3554[(i * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2071() {
        this.f3550 = true;
        if (this.f3555.f3546 <= 0) {
            AbstractC1374.m2507("Unexpected reader close()");
        }
        r0.f3546--;
        this.f3552 = new Object[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m2072(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.f3552[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return C1369.f3974;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1230 m2073(int i) {
        ArrayList arrayList = this.f3555.f3541;
        int iM2137 = AbstractC1238.m2137(arrayList, i, this.f3553);
        if (iM2137 >= 0) {
            return (C1230) arrayList.get(iM2137);
        }
        C1230 c1230 = new C1230(i);
        arrayList.add(-(iM2137 + 1), c1230);
        return c1230;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m2074() {
        if (!(this.f3560 == 0)) {
            AbstractC1374.m2507("Cannot skip the enclosing group while in an empty region");
        }
        this.f3559 = this.f3558;
        this.f3561 = 0;
        this.f3557 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int m2075() {
        if (this.f3560 != 0) {
            AbstractC1374.m2507("Cannot skip while in an empty region");
        }
        int i = this.f3559;
        int i2 = i * 5;
        int[] iArr = this.f3554;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.f3559 = iArr[i2 + 3] + i;
        return i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m2076() {
        if (this.f3560 <= 0) {
            int i = this.f3562;
            int i2 = this.f3559;
            int i3 = i2 * 5;
            int[] iArr = this.f3554;
            if (iArr[i3 + 2] != i) {
                AbstractC1392.m2538("Invalid slot table detected");
            }
            int i4 = this.f3561;
            int i5 = this.f3557;
            C1310 c1310 = this.f3563;
            if (i4 == 0 && i5 == 0) {
                c1310.m2307(-1);
            } else {
                c1310.m2307(i4);
            }
            this.f3562 = i2;
            this.f3558 = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.f3559 = i6;
            this.f3561 = AbstractC1238.m2140(iArr, i2);
            this.f3557 = i2 >= this.f3553 + (-1) ? this.f3551 : iArr[(i6 * 5) + 4];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Object m2077(int i) {
        int i2 = i * 5;
        int[] iArr = this.f3554;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.f3552[iArr[i2 + 4]] : C1369.f3974;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Object m2078() {
        int i;
        if (this.f3560 > 0 || (i = this.f3561) >= this.f3557) {
            this.f3556 = false;
            return C1369.f3974;
        }
        this.f3556 = true;
        Object[] objArr = this.f3552;
        this.f3561 = i + 1;
        return objArr[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m2079(int i) {
        return this.f3554[(i * 5) + 2];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m2080(int i) {
        if (this.f3560 != 0) {
            AbstractC1374.m2507("Cannot reposition while in an empty region");
        }
        this.f3559 = i;
        int[] iArr = this.f3554;
        int i2 = this.f3553;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.f3562) {
            this.f3562 = i3;
            if (i3 < 0) {
                this.f3558 = i2;
            } else {
                this.f3558 = iArr[(i3 * 5) + 3] + i3;
            }
            this.f3561 = 0;
            this.f3557 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m2081(int i) {
        return this.f3554[(i * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object m2082(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f3552[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object m2083(int i, int i2) {
        int[] iArr = this.f3554;
        int iM2140 = AbstractC1238.m2140(iArr, i);
        int i3 = i + 1;
        int i4 = iM2140 + i2;
        return i4 < (i3 < this.f3553 ? iArr[(i3 * 5) + 4] : this.f3551) ? this.f3552[i4] : C1369.f3974;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m2084() {
        int i = this.f3559;
        if (i >= this.f3558) {
            return 0;
        }
        return this.f3554[i * 5];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m2085(int i) {
        return (this.f3554[(i * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m2086(int i) {
        return (this.f3554[(i * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m2087(int i) {
        return this.f3554[i * 5];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m2088(int i) {
        return (this.f3554[(i * 5) + 1] & 134217728) != 0;
    }
}
