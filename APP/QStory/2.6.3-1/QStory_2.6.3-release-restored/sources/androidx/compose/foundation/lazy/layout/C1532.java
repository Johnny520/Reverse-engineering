package androidx.compose.foundation.lazy.layout;

import androidx.collection.AbstractC1120;
import androidx.collection.C1093;
import androidx.compose.foundation.lazy.C1603;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2550;
import androidx.compose.p001ui.unit.LayoutDirection;
import java.util.Map;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1532 implements InterfaceC2488 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1093 f2280;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2550 f2281;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1603 f2282;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1552 f2283;

    public C1532(C1552 c1552, InterfaceC2550 interfaceC2550) {
        this.f2283 = c1552;
        this.f2281 = interfaceC2550;
        this.f2282 = (C1603) c1552.f2350.invoke();
        AbstractC1120.m1396();
        this.f2280 = new C1093();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2534
    public final LayoutDirection getLayoutDirection() {
        return this.f2281.getLayoutDirection();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1892(float f) {
        return this.f2281.mo1892(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1893(int i) {
        return this.f2281.mo1893(i);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1894(float f) {
        return this.f2281.mo1894(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1895(long j) {
        return this.f2281.mo1895(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f2281.mo1816();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1899(long j) {
        return this.f2281.mo1899(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1900(float f) {
        return this.f2281.mo1900(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1901(long j) {
        return this.f2281.mo1901(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1902(long j) {
        return this.f2281.mo1902(j);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2488
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final InterfaceC2492 mo2055(int i, int i2, Map map, InterfaceC7387 interfaceC7387) {
        return this.f2281.mo2055(i, i2, map, interfaceC7387);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1903(float f) {
        return this.f2281.mo1903(f);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2488
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final InterfaceC2492 mo2056(int i, int i2, Map map, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        return this.f2281.mo2056(i, i2, map, interfaceC7387, interfaceC73872);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f2281.mo1817();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2534
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final boolean mo2057() {
        return this.f2281.mo2057();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1904(float f) {
        return this.f2281.mo1904(f);
    }
}
