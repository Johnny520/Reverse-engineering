package androidx.compose.foundation.lazy.layout;

import androidx.collection.AbstractC0273;
import androidx.collection.C0246;
import androidx.compose.foundation.lazy.C0762;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1715;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0691 implements InterfaceC1653 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C0246 f1935;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1715 f1936;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0762 f1937;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0711 f1938;

    public C0691(C0711 c0711, InterfaceC1715 interfaceC1715) {
        this.f1938 = c0711;
        this.f1936 = interfaceC1715;
        this.f1937 = (C0762) c0711.f2005.invoke();
        AbstractC0273.m836();
        this.f1935 = new C0246();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    public final LayoutDirection getLayoutDirection() {
        return this.f1936.getLayoutDirection();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1332(float f) {
        return this.f1936.mo1332(f);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1333(int i) {
        return this.f1936.mo1333(i);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1334(float f) {
        return this.f1936.mo1334(f);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1335(long j) {
        return this.f1936.mo1335(j);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f1936.mo1256();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1339(long j) {
        return this.f1936.mo1339(j);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1340(float f) {
        return this.f1936.mo1340(f);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1341(long j) {
        return this.f1936.mo1341(j);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1342(long j) {
        return this.f1936.mo1342(j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final InterfaceC1657 mo1495(int i, int i2, Map map, InterfaceC6558 interfaceC6558) {
        return this.f1936.mo1495(i, i2, map, interfaceC6558);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1343(float f) {
        return this.f1936.mo1343(f);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final InterfaceC1657 mo1496(int i, int i2, Map map, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        return this.f1936.mo1496(i, i2, map, interfaceC6558, interfaceC65582);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f1936.mo1257();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final boolean mo1497() {
        return this.f1936.mo1497();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1344(float f) {
        return this.f1936.mo1344(f);
    }
}
