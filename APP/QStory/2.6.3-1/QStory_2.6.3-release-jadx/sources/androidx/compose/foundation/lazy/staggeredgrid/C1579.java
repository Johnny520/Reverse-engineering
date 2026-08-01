package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.appcompat.app.C0960;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C1581;
import androidx.compose.p001ui.layout.InterfaceC2492;
import com.alibaba.fastjson2.C3775;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.C6183;
import p068.InterfaceC7387;
import p221.C8724;
import p321.C9452;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1579 implements InterfaceC2492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C9452 f2434;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f2435;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1581 f2436;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f2437;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f2438;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int[] f2439;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8724 f2440;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0960 f2441;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Orientation f2442 = Orientation.Horizontal;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f2443;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6183 f2444;

    public C1579(int[] iArr, int[] iArr2, float f, C1581 c1581, boolean z, C9452 c9452, C0960 c0960, C8724 c8724, List list, C6183 c6183) {
        this.f2439 = iArr;
        this.f2438 = iArr2;
        this.f2437 = f;
        this.f2436 = c1581;
        this.f2435 = z;
        this.f2434 = c9452;
        this.f2441 = c0960;
        this.f2440 = c8724;
        this.f2443 = list;
        this.f2444 = c6183;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1579 m2105(int i) {
        List list = this.f2443;
        if (!list.isEmpty()) {
            int[] iArr = this.f2439;
            if (iArr.length != 0) {
                int[] iArr2 = this.f2438;
                if (iArr2.length != 0) {
                    if (list.size() <= 0) {
                        if (list.size() > 0) {
                            list.get(0).getClass();
                            C3775.m6954();
                            return null;
                        }
                        int length = iArr2.length;
                        int[] iArr3 = new int[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            iArr3[i2] = iArr2[i2] - i;
                        }
                        return new C1579(iArr, iArr3, i, this.f2436, this.f2435 || i > 0, this.f2434, this.f2441, this.f2440, this.f2443, this.f2444);
                    }
                    list.get(0).getClass();
                    C3775.m6954();
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7387 mo2030() {
        return null;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo2032() {
        return this.f2436.f2446;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo2033() {
        return 0;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo2034() {
        return 0;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2031() {
    }
}
