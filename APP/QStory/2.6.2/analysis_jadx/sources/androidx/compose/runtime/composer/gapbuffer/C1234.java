package androidx.compose.runtime.composer.gapbuffer;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.AbstractC1392;
import androidx.compose.runtime.C1310;
import androidx.compose.runtime.C1369;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1234 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f3549;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f3550;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object[] f3551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f3552;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f3553;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1233 f3554;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f3555;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f3556;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f3557;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f3558;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f3559;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f3560;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f3561;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C1310 f3562;

    public C1234(C1233 c1233) {
        this.f3554 = c1233;
        this.f3553 = c1233.f3544;
        int i = c1233.f3543;
        this.f3552 = i;
        this.f3551 = c1233.f3547;
        this.f3550 = c1233.f3548;
        this.f3557 = i;
        this.f3561 = -1;
        this.f3562 = new C1310();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f3558);
        sb.append(", key=");
        sb.append(m2074());
        sb.append(", parent=");
        sb.append(this.f3561);
        sb.append(", end=");
        return AbstractC0053.m154(sb, this.f3557, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m2058() {
        int i = this.f3558;
        if (i < this.f3557) {
            return m2062(this.f3553, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2059() {
        if (this.f3559 == 0) {
            if (this.f3558 != this.f3557) {
                AbstractC1374.m2497("endGroup() not called at the end of a group");
            }
            int i = (this.f3561 * 5) + 2;
            int[] iArr = this.f3553;
            int i2 = iArr[i];
            this.f3561 = i2;
            int i3 = this.f3552;
            this.f3557 = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int iM2298 = this.f3562.m2298();
            if (iM2298 < 0) {
                this.f3560 = 0;
                this.f3556 = 0;
            } else {
                this.f3560 = iM2298;
                this.f3556 = i2 >= i3 + (-1) ? this.f3550 : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m2060(int i) {
        return (this.f3553[(i * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2061() {
        this.f3549 = true;
        if (this.f3554.f3545 <= 0) {
            AbstractC1374.m2497("Unexpected reader close()");
        }
        r0.f3545--;
        this.f3551 = new Object[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m2062(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.f3551[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return C1369.f3973;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1230 m2063(int i) {
        ArrayList arrayList = this.f3554.f3540;
        int iM2127 = AbstractC1238.m2127(arrayList, i, this.f3552);
        if (iM2127 >= 0) {
            return (C1230) arrayList.get(iM2127);
        }
        C1230 c1230 = new C1230(i);
        arrayList.add(-(iM2127 + 1), c1230);
        return c1230;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m2064() {
        if (!(this.f3559 == 0)) {
            AbstractC1374.m2497("Cannot skip the enclosing group while in an empty region");
        }
        this.f3558 = this.f3557;
        this.f3560 = 0;
        this.f3556 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int m2065() {
        if (this.f3559 != 0) {
            AbstractC1374.m2497("Cannot skip while in an empty region");
        }
        int i = this.f3558;
        int i2 = i * 5;
        int[] iArr = this.f3553;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.f3558 = iArr[i2 + 3] + i;
        return i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m2066() {
        if (this.f3559 <= 0) {
            int i = this.f3561;
            int i2 = this.f3558;
            int i3 = i2 * 5;
            int[] iArr = this.f3553;
            if (iArr[i3 + 2] != i) {
                AbstractC1392.m2528("Invalid slot table detected");
            }
            int i4 = this.f3560;
            int i5 = this.f3556;
            C1310 c1310 = this.f3562;
            if (i4 == 0 && i5 == 0) {
                c1310.m2297(-1);
            } else {
                c1310.m2297(i4);
            }
            this.f3561 = i2;
            this.f3557 = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.f3558 = i6;
            this.f3560 = AbstractC1238.m2130(iArr, i2);
            this.f3556 = i2 >= this.f3552 + (-1) ? this.f3550 : iArr[(i6 * 5) + 4];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Object m2067(int i) {
        int i2 = i * 5;
        int[] iArr = this.f3553;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.f3551[iArr[i2 + 4]] : C1369.f3973;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Object m2068() {
        int i;
        if (this.f3559 > 0 || (i = this.f3560) >= this.f3556) {
            this.f3555 = false;
            return C1369.f3973;
        }
        this.f3555 = true;
        Object[] objArr = this.f3551;
        this.f3560 = i + 1;
        return objArr[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m2069(int i) {
        return this.f3553[(i * 5) + 2];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m2070(int i) {
        if (this.f3559 != 0) {
            AbstractC1374.m2497("Cannot reposition while in an empty region");
        }
        this.f3558 = i;
        int[] iArr = this.f3553;
        int i2 = this.f3552;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.f3561) {
            this.f3561 = i3;
            if (i3 < 0) {
                this.f3557 = i2;
            } else {
                this.f3557 = iArr[(i3 * 5) + 3] + i3;
            }
            this.f3560 = 0;
            this.f3556 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m2071(int i) {
        return this.f3553[(i * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object m2072(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f3551[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object m2073(int i, int i2) {
        int[] iArr = this.f3553;
        int iM2130 = AbstractC1238.m2130(iArr, i);
        int i3 = i + 1;
        int i4 = iM2130 + i2;
        return i4 < (i3 < this.f3552 ? iArr[(i3 * 5) + 4] : this.f3550) ? this.f3551[i4] : C1369.f3973;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m2074() {
        int i = this.f3558;
        if (i >= this.f3557) {
            return 0;
        }
        return this.f3553[i * 5];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m2075(int i) {
        return (this.f3553[(i * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m2076(int i) {
        return (this.f3553[(i * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m2077(int i) {
        return this.f3553[i * 5];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m2078(int i) {
        return (this.f3553[(i * 5) + 1] & 134217728) != 0;
    }
}
