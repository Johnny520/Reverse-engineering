package androidx.compose.p001ui.draw;

import androidx.appcompat.app.C0960;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.graphics.painter.AbstractC2363;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.C2565;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2533;
import androidx.compose.p001ui.node.AbstractC2589;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.p001ui.node.InterfaceC2616;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p068.InterfaceC7387;
import p128.C8155;
import p221.AbstractC8726;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2278 extends AbstractC2961 implements InterfaceC2608, InterfaceC2616 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public AbstractC2363 f4478;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C2442 f4479;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f4480;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C2565 f4481;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC2951 f4482;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f4483;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public static boolean m3135(long j) {
        return !C8155.m13074(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public static boolean m3136(long j) {
        return !C8155.m13074(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f4478 + ", sizeToIntrinsics=" + this.f4483 + ", alignment=" + this.f4482 + ", alpha=" + this.f4480 + ", colorFilter=" + this.f4479 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final long m3137(long j) {
        boolean z = false;
        boolean z2 = C8727.m13892(j) && C8727.m13893(j);
        if (C8727.m13890(j) && C8727.m13891(j)) {
            z = true;
        }
        if ((!m3138() && z2) || z) {
            return C8727.m13895(C8727.m13896(j), 0, C8727.m13897(j), 0, 10, j);
        }
        long jMo3368 = this.f4478.mo3368();
        int iRound = m3135(jMo3368) ? Math.round(Float.intBitsToFloat((int) (jMo3368 >> 32))) : C8727.m13900(j);
        int iRound2 = m3136(jMo3368) ? Math.round(Float.intBitsToFloat((int) (jMo3368 & 4294967295L))) : C8727.m13899(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC8726.m13879(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC8726.m13886(iRound, j))) << 32);
        if (m3138()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!m3135(this.f4478.mo3368()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f4478.mo3368() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m3136(this.f4478.mo3368()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f4478.mo3368() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : AbstractC2505.m3668(jFloatToRawIntBits2, this.f4481.m3702(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return C8727.m13895(AbstractC8726.m13886(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, AbstractC8726.m13879(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10, j);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final boolean m3138() {
        return this.f4483 && this.f4478.mo3368() != 9205357640488583168L;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1634(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        if (!m3138()) {
            return interfaceC2533.mo3617(i);
        }
        long jM3137 = m3137(AbstractC8726.m13883(0, i, 0, 0, 13));
        return Math.max(C8727.m13899(jM3137), interfaceC2533.mo3617(i));
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1635(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        if (!m3138()) {
            return interfaceC2533.mo3618(i);
        }
        long jM3137 = m3137(AbstractC8726.m13883(0, 0, 0, i, 7));
        return Math.max(C8727.m13900(jM3137), interfaceC2533.mo3618(i));
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1636(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        if (!m3138()) {
            return interfaceC2533.mo3614(i);
        }
        long jM3137 = m3137(AbstractC8726.m13883(0, i, 0, 0, 13));
        return Math.max(C8727.m13899(jM3137), interfaceC2533.mo3614(i));
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1637(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        if (!m3138()) {
            return interfaceC2533.mo3619(i);
        }
        long jM3137 = m3137(AbstractC8726.m13883(0, 0, 0, i, 7));
        return Math.max(C8727.m13900(jM3137), interfaceC2533.mo3619(i));
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(m3137(j));
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                AbstractC2543.m3692(abstractC2543, abstractC2559Mo3615, 0, 0);
            }
        });
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1688(InterfaceC2341 interfaceC2341) {
        long jMo3368 = this.f4478.mo3368();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m3135(jMo3368) ? Float.intBitsToFloat((int) (jMo3368 >> 32)) : Float.intBitsToFloat((int) (((C2593) interfaceC2341).f5521.mo3265() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(m3136(jMo3368) ? Float.intBitsToFloat((int) (jMo3368 & 4294967295L)) : Float.intBitsToFloat((int) (((C2593) interfaceC2341).f5521.mo3265() & 4294967295L)))) & 4294967295L);
        C2593 c2593 = (C2593) interfaceC2341;
        C2342 c2342 = c2593.f5521;
        long jM3668 = (Float.intBitsToFloat((int) (c2342.mo3265() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c2342.mo3265() & 4294967295L)) == 0.0f) ? 0L : AbstractC2505.m3668(jFloatToRawIntBits, this.f4481.m3702(jFloatToRawIntBits, c2342.mo3265()));
        long jMo4419 = this.f4482.mo4419((((long) Math.round(Float.intBitsToFloat((int) (jM3668 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM3668 & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (c2342.mo3265() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (c2342.mo3265() & 4294967295L)))) & 4294967295L), c2593.getLayoutDirection());
        float f = (int) (jMo4419 >> 32);
        float f2 = (int) (jMo4419 & 4294967295L);
        ((C0960) c2342.f4629.f664).m991(f, f2);
        try {
            this.f4478.m3369((C2593) interfaceC2341, jM3668, this.f4480, this.f4479);
            ((C0960) c2342.f4629.f664).m991(-f, -f2);
            c2593.m3871();
        } catch (Throwable th) {
            ((C0960) c2342.f4629.f664).m991(-f, -f2);
            throw th;
        }
    }
}
