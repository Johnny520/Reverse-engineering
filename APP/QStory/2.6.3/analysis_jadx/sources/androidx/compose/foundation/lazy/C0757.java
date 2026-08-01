package androidx.compose.foundation.lazy;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.InterfaceC1657;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4344;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6558;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0757 implements InterfaceC1657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f2200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1657 f2201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f2202;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f2203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2204;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0749 f2205;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int f2206;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f2207;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f2208;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Orientation f2209;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f2210;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC5401 f2211;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f2212;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final List f2213;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int f2214;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC7896 f2215;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f2216;

    public C0757(C0749 c0749, int i, boolean z, float f, InterfaceC1657 interfaceC1657, float f2, boolean z2, InterfaceC5401 interfaceC5401, InterfaceC7896 interfaceC7896, long j, List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6) {
        this.f2205 = c0749;
        this.f2204 = i;
        this.f2203 = z;
        this.f2202 = f;
        this.f2201 = interfaceC1657;
        this.f2200 = f2;
        this.f2212 = z2;
        this.f2211 = interfaceC5401;
        this.f2215 = interfaceC7896;
        this.f2216 = j;
        this.f2213 = list;
        this.f2214 = i2;
        this.f2207 = i3;
        this.f2206 = i4;
        this.f2209 = orientation;
        this.f2210 = i5;
        this.f2208 = i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0757 m1565(int i, boolean z) {
        C0749 c0749;
        if (this.f2212) {
            return null;
        }
        List list = this.f2213;
        if (list.isEmpty() || (c0749 = this.f2205) == null) {
            return null;
        }
        int i2 = c0749.f2170;
        int i3 = this.f2204 - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        C0749 c07492 = (C0749) AbstractC4344.m8820(list);
        C0749 c07493 = (C0749) AbstractC4344.m8808(list);
        if (c07492.f2163 || c07493.f2163) {
            return null;
        }
        int i4 = c07492.f2172;
        int i5 = this.f2207;
        int i6 = this.f2214;
        if (i < 0) {
            if (Math.min((i4 + c07492.f2170) - i6, (c07493.f2172 + c07493.f2170) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - c07493.f2172) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0749 c07494 = (C0749) list.get(i7);
            c07494.getClass();
            int[] iArr = c07494.f2166;
            if (!c07494.f2163) {
                c07494.f2172 += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) != 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = c07494.f2161.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        AbstractC0053.m137(c07494.f2171.f2012.m757(c07494.f2168));
                    }
                }
            }
        }
        return new C0757(this.f2205, i3, this.f2203 || i > 0, i, this.f2201, this.f2200, this.f2212, this.f2211, this.f2215, this.f2216, this.f2213, this.f2214, this.f2207, this.f2206, this.f2209, this.f2210, this.f2208);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6558 mo1470() {
        return this.f2201.mo1470();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1471() {
        this.f2201.mo1471();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo1472() {
        return this.f2201.mo1472();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1473() {
        return this.f2201.mo1473();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1474() {
        return this.f2201.mo1474();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long m1566() {
        InterfaceC1657 interfaceC1657 = this.f2201;
        return (((long) interfaceC1657.mo1473()) << 32) | (((long) interfaceC1657.mo1474()) & 4294967295L);
    }
}
