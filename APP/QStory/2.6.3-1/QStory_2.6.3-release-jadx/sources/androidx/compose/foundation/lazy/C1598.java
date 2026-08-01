package androidx.compose.foundation.lazy;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p001ui.layout.InterfaceC2492;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5176;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7387;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1598 implements InterfaceC2492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f2545;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2492 f2546;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f2547;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f2548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2549;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1590 f2550;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int f2551;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f2552;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f2553;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Orientation f2554;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f2555;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC6233 f2556;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f2557;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final List f2558;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int f2559;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC8725 f2560;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f2561;

    public C1598(C1590 c1590, int i, boolean z, float f, InterfaceC2492 interfaceC2492, float f2, boolean z2, InterfaceC6233 interfaceC6233, InterfaceC8725 interfaceC8725, long j, List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6) {
        this.f2550 = c1590;
        this.f2549 = i;
        this.f2548 = z;
        this.f2547 = f;
        this.f2546 = interfaceC2492;
        this.f2545 = f2;
        this.f2557 = z2;
        this.f2556 = interfaceC6233;
        this.f2560 = interfaceC8725;
        this.f2561 = j;
        this.f2558 = list;
        this.f2559 = i2;
        this.f2552 = i3;
        this.f2551 = i4;
        this.f2554 = orientation;
        this.f2555 = i5;
        this.f2553 = i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1598 m2125(int i, boolean z) {
        C1590 c1590;
        if (this.f2557) {
            return null;
        }
        List list = this.f2558;
        if (list.isEmpty() || (c1590 = this.f2550) == null) {
            return null;
        }
        int i2 = c1590.f2515;
        int i3 = this.f2549 - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        C1590 c15902 = (C1590) AbstractC5176.m9379(list);
        C1590 c15903 = (C1590) AbstractC5176.m9367(list);
        if (c15902.f2508 || c15903.f2508) {
            return null;
        }
        int i4 = c15902.f2517;
        int i5 = this.f2552;
        int i6 = this.f2559;
        if (i < 0) {
            if (Math.min((i4 + c15902.f2515) - i6, (c15903.f2517 + c15903.f2515) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - c15903.f2517) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1590 c15904 = (C1590) list.get(i7);
            c15904.getClass();
            int[] iArr = c15904.f2511;
            if (!c15904.f2508) {
                c15904.f2517 += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) != 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = c15904.f2506.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        AbstractC0900.m697(c15904.f2516.f2357.m1317(c15904.f2513));
                    }
                }
            }
        }
        return new C1598(this.f2550, i3, this.f2548 || i > 0, i, this.f2546, this.f2545, this.f2557, this.f2556, this.f2560, this.f2561, this.f2558, this.f2559, this.f2552, this.f2551, this.f2554, this.f2555, this.f2553);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7387 mo2030() {
        return this.f2546.mo2030();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2031() {
        this.f2546.mo2031();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo2032() {
        return this.f2546.mo2032();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo2033() {
        return this.f2546.mo2033();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo2034() {
        return this.f2546.mo2034();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long m2126() {
        InterfaceC2492 interfaceC2492 = this.f2546;
        return (((long) interfaceC2492.mo2033()) << 32) | (((long) interfaceC2492.mo2034()) & 4294967295L);
    }
}
