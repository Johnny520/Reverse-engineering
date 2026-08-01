package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.appcompat.app.C0113;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0740;
import androidx.compose.ui.layout.InterfaceC1657;
import com.alibaba.fastjson2.C2942;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.C5351;
import p052.InterfaceC6558;
import p205.C7895;
import p305.C8623;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0738 implements InterfaceC1657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8623 f2089;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f2090;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0740 f2091;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f2092;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f2093;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int[] f2094;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C7895 f2095;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0113 f2096;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Orientation f2097 = Orientation.Horizontal;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f2098;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5351 f2099;

    public C0738(int[] iArr, int[] iArr2, float f, C0740 c0740, boolean z, C8623 c8623, C0113 c0113, C7895 c7895, List list, C5351 c5351) {
        this.f2094 = iArr;
        this.f2093 = iArr2;
        this.f2092 = f;
        this.f2091 = c0740;
        this.f2090 = z;
        this.f2089 = c8623;
        this.f2096 = c0113;
        this.f2095 = c7895;
        this.f2098 = list;
        this.f2099 = c5351;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0738 m1545(int i) {
        List list = this.f2098;
        if (!list.isEmpty()) {
            int[] iArr = this.f2094;
            if (iArr.length != 0) {
                int[] iArr2 = this.f2093;
                if (iArr2.length != 0) {
                    if (list.size() <= 0) {
                        if (list.size() > 0) {
                            list.get(0).getClass();
                            C2942.m6394();
                            return null;
                        }
                        int length = iArr2.length;
                        int[] iArr3 = new int[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            iArr3[i2] = iArr2[i2] - i;
                        }
                        return new C0738(iArr, iArr3, i, this.f2091, this.f2090 || i > 0, this.f2089, this.f2096, this.f2095, this.f2098, this.f2099);
                    }
                    list.get(0).getClass();
                    C2942.m6394();
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6558 mo1470() {
        return null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo1472() {
        return this.f2091.f2101;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1473() {
        return 0;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1474() {
        return 0;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1471() {
    }
}
