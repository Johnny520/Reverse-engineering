package androidx.compose.foundation.text;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.node.InterfaceC2626;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.font.AbstractC2827;
import androidx.compose.p001ui.text.font.C2803;
import androidx.compose.p001ui.text.font.C2821;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.C2824;
import androidx.compose.p001ui.text.font.C2828;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.window.area.AbstractC3400;
import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.C5043;
import kotlin.collections.AbstractC5171;
import p192.AbstractC8570;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1787 extends AbstractC2961 implements InterfaceC2618, InterfaceC2608, InterfaceC2626 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C2803 f3046;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C2865 f3047;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C2865 f3048;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f3049;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f3050;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f3051;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f3052;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f3053;

    @Override // androidx.compose.p001ui.node.InterfaceC2622
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void mo2433() {
        this.f3048 = AbstractC2882.m4332(this.f3047, AbstractC2620.m3906(this).f5445);
        this.f3051 = true;
        AbstractC2620.m3910(this);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final C2865 m2434() {
        C2865 c2865 = this.f3048;
        if (c2865 != null) {
            return c2865;
        }
        AbstractC8570.m13655("Resolved style is not set.");
        C5043.m9161();
        return null;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        this.f3048 = null;
        this.f3046 = null;
        this.f3051 = false;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        InterfaceC2830 interfaceC2830 = (InterfaceC2830) AbstractC2620.m3916(this, AbstractC2737.f5935);
        this.f3048 = AbstractC2882.m4332(this.f3047, AbstractC2620.m3906(this).f5445);
        AbstractC2827 abstractC2827 = m2434().f6329.f6398;
        C2822 c2822 = m2434().f6329.f6401;
        if (c2822 == null) {
            c2822 = C2822.f6221;
        }
        C2824 c2824 = m2434().f6329.f6400;
        int i = c2824 != null ? c2824.f6225 : 0;
        C2821 c2821 = m2434().f6329.f6399;
        this.f3046 = ((C2828) interfaceC2830).m4263(abstractC2827, c2822, i, c2821 != null ? c2821.f6215 : Opcodes.MAX_VALUE);
        AbstractC2620.m3904(this, new C1785(this, 0));
        this.f3051 = true;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2622, androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1856() {
        this.f3051 = true;
        AbstractC2620.m3910(this);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        if (this.f3051) {
            C2865 c2865M2434 = m2434();
            InterfaceC2830 interfaceC2830 = (InterfaceC2830) AbstractC2620.m3916(this, AbstractC2737.f5935);
            String str = AbstractC1834.f3261;
            int iM2476 = (int) (AbstractC1834.m2476(c2865M2434, interfaceC2488, interfaceC2830, str, 1) & 4294967295L);
            int iM24762 = ((int) (AbstractC1834.m2476(c2865M2434, interfaceC2488, interfaceC2830, AbstractC0900.m724('\n', str, str), 2) & 4294967295L)) - iM2476;
            int i = this.f3053;
            this.f3050 = i == 1 ? -1 : AbstractC0900.m703(i, 1, iM24762, iM2476);
            int i2 = this.f3052;
            this.f3049 = i2 == Integer.MAX_VALUE ? -1 : AbstractC0900.m703(i2, 1, iM24762, iM2476);
            this.f3051 = false;
        }
        int i3 = this.f3050;
        int iM5650 = i3 != -1 ? AbstractC3400.m5650(i3, C8727.m13899(j), C8727.m13897(j)) : C8727.m13899(j);
        int i4 = this.f3049;
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(C8727.m13895(0, 0, iM5650, i4 != -1 ? AbstractC3400.m5650(i4, C8727.m13899(j), C8727.m13897(j)) : C8727.m13897(j), 3, j));
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new C1784(abstractC2559Mo3615, 0));
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2626
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1687() {
        if (this.f3046 != null) {
            AbstractC2620.m3904(this, new C1785(this, 1));
        }
        this.f3051 = true;
        AbstractC2620.m3910(this);
    }
}
