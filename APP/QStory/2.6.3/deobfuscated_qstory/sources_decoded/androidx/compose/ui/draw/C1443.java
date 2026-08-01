package androidx.compose.ui.draw;

import androidx.appcompat.app.C0113;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.InterfaceC2118;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.graphics.painter.AbstractC1528;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.C1730;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1698;
import androidx.compose.ui.node.AbstractC1754;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.compose.ui.node.InterfaceC1781;
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import p052.InterfaceC6558;
import p112.C7326;
import p205.AbstractC7897;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1443 extends AbstractC2128 implements InterfaceC1773, InterfaceC1781 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public AbstractC1528 f4133;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1607 f4134;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f4135;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C1730 f4136;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC2118 f4137;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f4138;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public static boolean m2575(long j) {
        return !C7326.m12515(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public static boolean m2576(long j) {
        return !C7326.m12515(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f4133 + ", sizeToIntrinsics=" + this.f4138 + ", alignment=" + this.f4137 + ", alpha=" + this.f4135 + ", colorFilter=" + this.f4134 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final long m2577(long j) {
        boolean z = false;
        boolean z2 = C7898.m13333(j) && C7898.m13334(j);
        if (C7898.m13331(j) && C7898.m13332(j)) {
            z = true;
        }
        if ((!m2578() && z2) || z) {
            return C7898.m13336(C7898.m13337(j), 0, C7898.m13338(j), 0, 10, j);
        }
        long jMo2808 = this.f4133.mo2808();
        int iRound = m2575(jMo2808) ? Math.round(Float.intBitsToFloat((int) (jMo2808 >> 32))) : C7898.m13341(j);
        int iRound2 = m2576(jMo2808) ? Math.round(Float.intBitsToFloat((int) (jMo2808 & 4294967295L))) : C7898.m13340(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC7897.m13320(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC7897.m13327(iRound, j))) << 32);
        if (m2578()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!m2575(this.f4133.mo2808()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f4133.mo2808() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m2576(this.f4133.mo2808()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f4133.mo2808() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : AbstractC1670.m3108(jFloatToRawIntBits2, this.f4136.m3142(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return C7898.m13336(AbstractC7897.m13327(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, AbstractC7897.m13320(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10, j);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final boolean m2578() {
        return this.f4138 && this.f4133.mo2808() != 9205357640488583168L;
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1074(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (!m2578()) {
            return interfaceC1698.mo3057(i);
        }
        long jM2577 = m2577(AbstractC7897.m13324(0, i, 0, 0, 13));
        return Math.max(C7898.m13340(jM2577), interfaceC1698.mo3057(i));
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1075(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (!m2578()) {
            return interfaceC1698.mo3058(i);
        }
        long jM2577 = m2577(AbstractC7897.m13324(0, 0, 0, i, 7));
        return Math.max(C7898.m13341(jM2577), interfaceC1698.mo3058(i));
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1076(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (!m2578()) {
            return interfaceC1698.mo3054(i);
        }
        long jM2577 = m2577(AbstractC7897.m13324(0, i, 0, 0, 13));
        return Math.max(C7898.m13340(jM2577), interfaceC1698.mo3054(i));
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1077(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (!m2578()) {
            return interfaceC1698.mo3059(i);
        }
        long jM2577 = m2577(AbstractC7897.m13324(0, 0, 0, i, 7));
        return Math.max(C7898.m13341(jM2577), interfaceC1698.mo3059(i));
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(m2577(j));
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5176.f14739;
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                AbstractC1708.m3132(abstractC1708, abstractC1724Mo3055, 0, 0);
            }
        });
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1128(InterfaceC1506 interfaceC1506) {
        long jMo2808 = this.f4133.mo2808();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m2575(jMo2808) ? Float.intBitsToFloat((int) (jMo2808 >> 32)) : Float.intBitsToFloat((int) (((C1758) interfaceC1506).f5176.mo2705() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(m2576(jMo2808) ? Float.intBitsToFloat((int) (jMo2808 & 4294967295L)) : Float.intBitsToFloat((int) (((C1758) interfaceC1506).f5176.mo2705() & 4294967295L)))) & 4294967295L);
        C1758 c1758 = (C1758) interfaceC1506;
        C1507 c1507 = c1758.f5176;
        long jM3108 = (Float.intBitsToFloat((int) (c1507.mo2705() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c1507.mo2705() & 4294967295L)) == 0.0f) ? 0L : AbstractC1670.m3108(jFloatToRawIntBits, this.f4136.m3142(jFloatToRawIntBits, c1507.mo2705()));
        long jMo3859 = this.f4137.mo3859((((long) Math.round(Float.intBitsToFloat((int) (jM3108 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM3108 & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (c1507.mo2705() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (c1507.mo2705() & 4294967295L)))) & 4294967295L), c1758.getLayoutDirection());
        float f = (int) (jMo3859 >> 32);
        float f2 = (int) (jMo3859 & 4294967295L);
        ((C0113) c1507.f4284.f319).m431(f, f2);
        try {
            this.f4133.m2809((C1758) interfaceC1506, jM3108, this.f4135, this.f4134);
            ((C0113) c1507.f4284.f319).m431(-f, -f2);
            c1758.m3311();
        } catch (Throwable th) {
            ((C0113) c1507.f4284.f319).m431(-f, -f2);
            throw th;
        }
    }
}
