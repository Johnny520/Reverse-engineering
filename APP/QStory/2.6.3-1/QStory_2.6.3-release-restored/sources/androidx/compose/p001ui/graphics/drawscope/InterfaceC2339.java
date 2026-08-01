package androidx.compose.p001ui.graphics.drawscope;

import androidx.appcompat.app.C0955;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.C2445;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.unit.LayoutDirection;
import p221.InterfaceC8725;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2339 extends InterfaceC8725 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    static /* synthetic */ void m3256(InterfaceC2339 interfaceC2339, long j, long j2, float f, C2344 c2344, int i) {
        if ((i & 4) != 0) {
            j2 = m3257(interfaceC2339.mo3265(), 0L);
        }
        interfaceC2339.mo3269(j, 0L, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? C2345.f4640 : c2344, (i & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    static long m3257(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    static /* synthetic */ void m3258(InterfaceC2339 interfaceC2339, C2449 c2449, AbstractC2433 abstractC2433, float f, C2344 c2344, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        AbstractC2340 abstractC2340 = c2344;
        if ((i & 8) != 0) {
            abstractC2340 = C2345.f4640;
        }
        interfaceC2339.mo3263(c2449, abstractC2433, f2, abstractC2340, (i & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    static void m3259(InterfaceC2339 interfaceC2339, C2445 c2445, long j, long j2, float f, C2442 c2442, int i, int i2) {
        interfaceC2339.mo3264(c2445, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, c2442, (i2 & 512) != 0 ? 1 : i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    static void m3260(C2593 c2593, AbstractC2433 abstractC2433, long j, long j2, long j3, AbstractC2340 abstractC2340, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        c2593.m3867(abstractC2433, j4, (i & 4) != 0 ? m3257(c2593.f5521.mo3265(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? C2345.f4640 : abstractC2340);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    static void m3261(C2593 c2593, AbstractC2433 abstractC2433, long j, long j2, float f, AbstractC2340 abstractC2340, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = m3257(c2593.f5521.mo3265(), j3);
        }
        c2593.m3868(abstractC2433, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? C2345.f4640 : abstractC2340);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    static /* synthetic */ void m3262(InterfaceC2339 interfaceC2339, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = interfaceC2339.mo3268();
        }
        interfaceC2339.mo3270(f, j, j2);
    }

    LayoutDirection getLayoutDirection();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    void mo3263(C2449 c2449, AbstractC2433 abstractC2433, float f, AbstractC2340 abstractC2340, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    void mo3264(C2445 c2445, long j, long j2, long j3, float f, C2442 c2442, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    default long mo3265() {
        return mo3266().m928();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    C0955 mo3266();

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    void mo3267(long j, float f, float f2, long j2, long j3, AbstractC2340 abstractC2340);

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    default long mo3268() {
        return AbstractC9019.m14264(mo3266().m928());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    void mo3269(long j, long j2, long j3, float f, AbstractC2340 abstractC2340, int i);

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    void mo3270(float f, long j, long j2);
}
