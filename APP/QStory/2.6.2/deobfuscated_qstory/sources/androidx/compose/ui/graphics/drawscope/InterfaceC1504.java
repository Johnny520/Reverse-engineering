package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.app.C0108;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.C1610;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.unit.LayoutDirection;
import p000.AbstractC6087;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1504 extends InterfaceC7895 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    static /* synthetic */ void m2686(InterfaceC1504 interfaceC1504, long j, long j2, float f, C1509 c1509, int i) {
        if ((i & 4) != 0) {
            j2 = m2687(interfaceC1504.mo2695(), 0L);
        }
        interfaceC1504.mo2699(j, 0L, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? C1510.f4294 : c1509, (i & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    static long m2687(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    static /* synthetic */ void m2688(InterfaceC1504 interfaceC1504, C1614 c1614, AbstractC1598 abstractC1598, float f, C1509 c1509, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        AbstractC1505 abstractC1505 = c1509;
        if ((i & 8) != 0) {
            abstractC1505 = C1510.f4294;
        }
        interfaceC1504.mo2693(c1614, abstractC1598, f2, abstractC1505, (i & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    static void m2689(InterfaceC1504 interfaceC1504, C1610 c1610, long j, long j2, float f, C1607 c1607, int i, int i2) {
        interfaceC1504.mo2694(c1610, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, c1607, (i2 & 512) != 0 ? 1 : i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    static void m2690(C1758 c1758, AbstractC1598 abstractC1598, long j, long j2, long j3, AbstractC1505 abstractC1505, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        c1758.m3297(abstractC1598, j4, (i & 4) != 0 ? m2687(c1758.f5175.mo2695(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? C1510.f4294 : abstractC1505);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    static void m2691(C1758 c1758, AbstractC1598 abstractC1598, long j, long j2, float f, AbstractC1505 abstractC1505, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = m2687(c1758.f5175.mo2695(), j3);
        }
        c1758.m3298(abstractC1598, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? C1510.f4294 : abstractC1505);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    static /* synthetic */ void m2692(InterfaceC1504 interfaceC1504, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = interfaceC1504.mo2698();
        }
        interfaceC1504.mo2700(f, j, j2);
    }

    LayoutDirection getLayoutDirection();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    void mo2693(C1614 c1614, AbstractC1598 abstractC1598, float f, AbstractC1505 abstractC1505, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    void mo2694(C1610 c1610, long j, long j2, long j3, float f, C1607 c1607, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    default long mo2695() {
        return mo2696().m367();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    C0108 mo2696();

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    void mo2697(long j, float f, float f2, long j2, long j3, AbstractC1505 abstractC1505);

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    default long mo2698() {
        return AbstractC6087.m11406(mo2696().m367());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    void mo2699(long j, long j2, long j3, float f, AbstractC1505 abstractC1505, int i);

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    void mo2700(float f, long j, long j2);
}
