package androidx.compose.foundation.lazy;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.InterfaceC1657;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4343;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6557;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0757 implements InterfaceC1657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f2199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1657 f2200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f2201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f2202;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0749 f2204;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int f2205;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f2206;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f2207;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Orientation f2208;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f2209;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC5400 f2210;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f2211;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final List f2212;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int f2213;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC7895 f2214;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f2215;

    public C0757(C0749 c0749, int i, boolean z, float f, InterfaceC1657 interfaceC1657, float f2, boolean z2, InterfaceC5400 interfaceC5400, InterfaceC7895 interfaceC7895, long j, List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6) {
        this.f2204 = c0749;
        this.f2203 = i;
        this.f2202 = z;
        this.f2201 = f;
        this.f2200 = interfaceC1657;
        this.f2199 = f2;
        this.f2211 = z2;
        this.f2210 = interfaceC5400;
        this.f2214 = interfaceC7895;
        this.f2215 = j;
        this.f2212 = list;
        this.f2213 = i2;
        this.f2206 = i3;
        this.f2205 = i4;
        this.f2208 = orientation;
        this.f2209 = i5;
        this.f2207 = i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0757 m1555(int i, boolean z) {
        C0749 c0749;
        if (this.f2211) {
            return null;
        }
        List list = this.f2212;
        if (list.isEmpty() || (c0749 = this.f2204) == null) {
            return null;
        }
        int i2 = c0749.f2169;
        int i3 = this.f2203 - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        C0749 c07492 = (C0749) AbstractC4343.m8827(list);
        C0749 c07493 = (C0749) AbstractC4343.m8811(list);
        if (c07492.f2162 || c07493.f2162) {
            return null;
        }
        int i4 = c07492.f2171;
        int i5 = this.f2206;
        int i6 = this.f2213;
        if (i < 0) {
            if (Math.min((i4 + c07492.f2169) - i6, (c07493.f2171 + c07493.f2169) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - c07493.f2171) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0749 c07494 = (C0749) list.get(i7);
            c07494.getClass();
            int[] iArr = c07494.f2165;
            if (!c07494.f2162) {
                c07494.f2171 += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) != 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = c07494.f2160.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        AbstractC0053.m137(c07494.f2170.f2011.m756(c07494.f2167));
                    }
                }
            }
        }
        return new C0757(this.f2204, i3, this.f2202 || i > 0, i, this.f2200, this.f2199, this.f2211, this.f2210, this.f2214, this.f2215, this.f2212, this.f2213, this.f2206, this.f2205, this.f2208, this.f2209, this.f2207);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6557 mo1460() {
        return this.f2200.mo1460();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1461() {
        this.f2200.mo1461();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo1462() {
        return this.f2200.mo1462();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1463() {
        return this.f2200.mo1463();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1464() {
        return this.f2200.mo1464();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long m1556() {
        InterfaceC1657 interfaceC1657 = this.f2200;
        return (((long) interfaceC1657.mo1463()) << 32) | (((long) interfaceC1657.mo1464()) & 4294967295L);
    }
}
