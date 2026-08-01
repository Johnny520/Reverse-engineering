package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.unit.LayoutDirection;
import java.util.Map;
import p068.InterfaceC7387;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2525 implements InterfaceC2488, InterfaceC2534 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LayoutDirection f5299;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2534 f5300;

    public C2525(InterfaceC2534 interfaceC2534, LayoutDirection layoutDirection) {
        this.f5300 = interfaceC2534;
        this.f5299 = layoutDirection;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2534
    public final LayoutDirection getLayoutDirection() {
        return this.f5299;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1892(float f) {
        return this.f5300.mo1892(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1893(int i) {
        return this.f5300.mo1893(i);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1894(float f) {
        return this.f5300.mo1894(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1895(long j) {
        return this.f5300.mo1895(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f5300.mo1816();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1899(long j) {
        return this.f5300.mo1899(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1900(float f) {
        return this.f5300.mo1900(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1901(long j) {
        return this.f5300.mo1901(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1902(long j) {
        return this.f5300.mo1902(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1903(float f) {
        return this.f5300.mo1903(f);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2488
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final InterfaceC2492 mo2056(int i, int i2, Map map, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC8765.m13982("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C2526(i, i2, map, interfaceC7387);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f5300.mo1817();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2534
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo2057() {
        return this.f5300.mo2057();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1904(float f) {
        return this.f5300.mo1904(f);
    }
}
