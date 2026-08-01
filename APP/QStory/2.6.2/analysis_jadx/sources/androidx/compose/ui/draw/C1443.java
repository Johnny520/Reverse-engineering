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
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import p052.InterfaceC6557;
import p112.C7325;
import p205.AbstractC7896;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1443 extends AbstractC2128 implements InterfaceC1773, InterfaceC1781 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public AbstractC1528 f4132;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1607 f4133;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f4134;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C1730 f4135;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC2118 f4136;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f4137;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public static boolean m2565(long j) {
        return !C7325.m12488(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public static boolean m2566(long j) {
        return !C7325.m12488(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f4132 + ", sizeToIntrinsics=" + this.f4137 + ", alignment=" + this.f4136 + ", alpha=" + this.f4134 + ", colorFilter=" + this.f4133 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final long m2567(long j) {
        boolean z = false;
        boolean z2 = C7897.m13305(j) && C7897.m13306(j);
        if (C7897.m13303(j) && C7897.m13304(j)) {
            z = true;
        }
        if ((!m2568() && z2) || z) {
            return C7897.m13308(C7897.m13309(j), 0, C7897.m13310(j), 0, 10, j);
        }
        long jMo2798 = this.f4132.mo2798();
        int iRound = m2565(jMo2798) ? Math.round(Float.intBitsToFloat((int) (jMo2798 >> 32))) : C7897.m13313(j);
        int iRound2 = m2566(jMo2798) ? Math.round(Float.intBitsToFloat((int) (jMo2798 & 4294967295L))) : C7897.m13312(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC7896.m13292(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC7896.m13299(iRound, j))) << 32);
        if (m2568()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!m2565(this.f4132.mo2798()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f4132.mo2798() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m2566(this.f4132.mo2798()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f4132.mo2798() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : AbstractC1670.m3098(jFloatToRawIntBits2, this.f4135.m3132(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return C7897.m13308(AbstractC7896.m13299(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, AbstractC7896.m13292(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10, j);
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final boolean m2568() {
        return this.f4137 && this.f4132.mo2798() != 9205357640488583168L;
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1073(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (!m2568()) {
            return interfaceC1698.mo3047(i);
        }
        long jM2567 = m2567(AbstractC7896.m13296(0, i, 0, 0, 13));
        return Math.max(C7897.m13312(jM2567), interfaceC1698.mo3047(i));
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1074(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (!m2568()) {
            return interfaceC1698.mo3048(i);
        }
        long jM2567 = m2567(AbstractC7896.m13296(0, 0, 0, i, 7));
        return Math.max(C7897.m13313(jM2567), interfaceC1698.mo3048(i));
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1075(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (!m2568()) {
            return interfaceC1698.mo3044(i);
        }
        long jM2567 = m2567(AbstractC7896.m13296(0, i, 0, 0, 13));
        return Math.max(C7897.m13312(jM2567), interfaceC1698.mo3044(i));
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1076(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        if (!m2568()) {
            return interfaceC1698.mo3049(i);
        }
        long jM2567 = m2567(AbstractC7896.m13296(0, 0, 0, i, 7));
        return Math.max(C7897.m13313(jM2567), interfaceC1698.mo3049(i));
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(m2567(j));
        return interfaceC1653.mo1485(abstractC1724Mo3045.f4998, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5175.f14739;
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                AbstractC1708.m3122(abstractC1708, abstractC1724Mo3045, 0, 0);
            }
        });
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1127(InterfaceC1506 interfaceC1506) {
        long jMo2798 = this.f4132.mo2798();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m2565(jMo2798) ? Float.intBitsToFloat((int) (jMo2798 >> 32)) : Float.intBitsToFloat((int) (((C1758) interfaceC1506).f5175.mo2695() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(m2566(jMo2798) ? Float.intBitsToFloat((int) (jMo2798 & 4294967295L)) : Float.intBitsToFloat((int) (((C1758) interfaceC1506).f5175.mo2695() & 4294967295L)))) & 4294967295L);
        C1758 c1758 = (C1758) interfaceC1506;
        C1507 c1507 = c1758.f5175;
        long jM3098 = (Float.intBitsToFloat((int) (c1507.mo2695() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c1507.mo2695() & 4294967295L)) == 0.0f) ? 0L : AbstractC1670.m3098(jFloatToRawIntBits, this.f4135.m3132(jFloatToRawIntBits, c1507.mo2695()));
        long jMo3849 = this.f4136.mo3849((((long) Math.round(Float.intBitsToFloat((int) (jM3098 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM3098 & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (c1507.mo2695() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (c1507.mo2695() & 4294967295L)))) & 4294967295L), c1758.getLayoutDirection());
        float f = (int) (jMo3849 >> 32);
        float f2 = (int) (jMo3849 & 4294967295L);
        ((C0113) c1507.f4283.f319).m430(f, f2);
        try {
            this.f4132.m2799((C1758) interfaceC1506, jM3098, this.f4134, this.f4133);
            ((C0113) c1507.f4283.f319).m430(-f, -f2);
            c1758.m3301();
        } catch (Throwable th) {
            ((C0113) c1507.f4283.f319).m430(-f, -f2);
            throw th;
        }
    }
}
