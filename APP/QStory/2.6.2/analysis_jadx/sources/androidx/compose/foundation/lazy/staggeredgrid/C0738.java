package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.appcompat.app.C0113;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0740;
import androidx.compose.ui.layout.InterfaceC1657;
import com.alibaba.fastjson2.C2941;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.C5350;
import p052.InterfaceC6557;
import p205.C7894;
import p305.C8631;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0738 implements InterfaceC1657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8631 f2088;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f2089;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0740 f2090;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f2091;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f2092;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int[] f2093;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C7894 f2094;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0113 f2095;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Orientation f2096 = Orientation.Horizontal;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f2097;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5350 f2098;

    public C0738(int[] iArr, int[] iArr2, float f, C0740 c0740, boolean z, C8631 c8631, C0113 c0113, C7894 c7894, List list, C5350 c5350) {
        this.f2093 = iArr;
        this.f2092 = iArr2;
        this.f2091 = f;
        this.f2090 = c0740;
        this.f2089 = z;
        this.f2088 = c8631;
        this.f2095 = c0113;
        this.f2094 = c7894;
        this.f2097 = list;
        this.f2098 = c5350;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0738 m1535(int i) {
        List list = this.f2097;
        if (!list.isEmpty()) {
            int[] iArr = this.f2093;
            if (iArr.length != 0) {
                int[] iArr2 = this.f2092;
                if (iArr2.length != 0) {
                    if (list.size() <= 0) {
                        if (list.size() > 0) {
                            list.get(0).getClass();
                            C2941.m6336();
                            return null;
                        }
                        int length = iArr2.length;
                        int[] iArr3 = new int[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            iArr3[i2] = iArr2[i2] - i;
                        }
                        return new C0738(iArr, iArr3, i, this.f2090, this.f2089 || i > 0, this.f2088, this.f2095, this.f2094, this.f2097, this.f2098);
                    }
                    list.get(0).getClass();
                    C2941.m6336();
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6557 mo1460() {
        return null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo1462() {
        return this.f2090.f2100;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1463() {
        return 0;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1464() {
        return 0;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1461() {
    }
}
