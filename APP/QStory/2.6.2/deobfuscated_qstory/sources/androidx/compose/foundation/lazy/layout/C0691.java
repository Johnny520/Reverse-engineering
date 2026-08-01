package androidx.compose.foundation.lazy.layout;

import androidx.collection.AbstractC0273;
import androidx.collection.C0246;
import androidx.compose.foundation.lazy.C0762;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1715;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0691 implements InterfaceC1653 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C0246 f1934;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1715 f1935;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0762 f1936;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0711 f1937;

    public C0691(C0711 c0711, InterfaceC1715 interfaceC1715) {
        this.f1937 = c0711;
        this.f1935 = interfaceC1715;
        this.f1936 = (C0762) c0711.f2004.invoke();
        AbstractC0273.m835();
        this.f1934 = new C0246();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    public final LayoutDirection getLayoutDirection() {
        return this.f1935.getLayoutDirection();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1322(float f) {
        return this.f1935.mo1322(f);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1323(int i) {
        return this.f1935.mo1323(i);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1324(float f) {
        return this.f1935.mo1324(f);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1325(long j) {
        return this.f1935.mo1325(j);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        return this.f1935.mo1246();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1329(long j) {
        return this.f1935.mo1329(j);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1330(float f) {
        return this.f1935.mo1330(f);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1331(long j) {
        return this.f1935.mo1331(j);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1332(long j) {
        return this.f1935.mo1332(j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final InterfaceC1657 mo1485(int i, int i2, Map map, InterfaceC6557 interfaceC6557) {
        return this.f1935.mo1485(i, i2, map, interfaceC6557);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1333(float f) {
        return this.f1935.mo1333(f);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final InterfaceC1657 mo1486(int i, int i2, Map map, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        return this.f1935.mo1486(i, i2, map, interfaceC6557, interfaceC65572);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        return this.f1935.mo1247();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final boolean mo1487() {
        return this.f1935.mo1487();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1334(float f) {
        return this.f1935.mo1334(f);
    }
}
