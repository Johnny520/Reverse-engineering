package androidx.compose.foundation.text;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.C2881;
import androidx.compose.p001ui.text.font.AbstractC2827;
import androidx.compose.p001ui.text.font.C2803;
import androidx.compose.p001ui.text.font.C2821;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.C2824;
import androidx.compose.p001ui.text.font.C2828;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2230;
import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.C5043;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import p192.AbstractC8570;
import p221.AbstractC8726;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1837 extends AbstractC2961 implements InterfaceC2618, InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2865 f3276;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1835 f3277;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C2803 f3278;

    public C1837(C2865 c2865) {
        this.f3276 = c2865;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2622
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final void mo2433() {
        C1835 c1835 = this.f3277;
        if (c1835 != null) {
            C1835.m2477(c1835, AbstractC2620.m3906(this).f5445, null, null, 30);
        }
        AbstractC2620.m3910(this);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m2480(C2865 c2865, InterfaceC2830 interfaceC2830) {
        C2881 c2881 = c2865.f6329;
        AbstractC2827 abstractC2827 = c2881.f6398;
        C2822 c2822 = c2881.f6401;
        if (c2822 == null) {
            c2822 = C2822.f6221;
        }
        C2824 c2824 = c2881.f6400;
        int i = c2824 != null ? c2824.f6225 : 0;
        C2821 c2821 = c2881.f6399;
        this.f3278 = ((C2828) interfaceC2830).m4263(abstractC2827, c2822, i, c2821 != null ? c2821.f6215 : Opcodes.MAX_VALUE);
        AbstractC2620.m3910(this);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        this.f3278 = null;
        this.f3277 = null;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        C2865 c2865M4332 = AbstractC2882.m4332(this.f3276, AbstractC2620.m3906(this).f5445);
        InterfaceC2830 interfaceC2830 = (InterfaceC2830) AbstractC2620.m3916(this, AbstractC2737.f5935);
        m2480(c2865M4332, interfaceC2830);
        LayoutDirection layoutDirection = AbstractC2620.m3906(this).f5445;
        InterfaceC8725 interfaceC8725 = AbstractC2620.m3906(this).f5444;
        C2803 c2803 = this.f3278;
        if (c2803 != null) {
            this.f3277 = new C1835(layoutDirection, interfaceC8725, interfaceC2830, c2865M4332, c2803.f6197);
        } else {
            AbstractC8570.m13655("Font resolution state is not set.");
            C5043.m9161();
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2622, androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1856() {
        C1835 c1835 = this.f3277;
        if (c1835 != null) {
            C1835.m2477(c1835, null, AbstractC2620.m3906(this).f5444, null, 29);
        }
        AbstractC2620.m3910(this);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        C1835 c1835 = this.f3277;
        if (c1835 == null) {
            AbstractC8570.m13655("Min size state is not set.");
            C5043.m9161();
            return null;
        }
        InterfaceC2230 interfaceC2230 = c1835.f3262;
        C2803 c2803 = this.f3278;
        if (c2803 == null) {
            AbstractC8570.m13655("Font resolution state is not set.");
            C5043.m9161();
            return null;
        }
        Object obj = c2803.f6197;
        if (!AbstractC5227.m9466(obj, c1835.f3263)) {
            c1835.f3263 = obj;
            ((AbstractC2182) interfaceC2230).setValue(Boolean.TRUE);
        }
        if (((Boolean) ((AbstractC2182) interfaceC2230).getValue()).booleanValue()) {
            c1835.f3268 = AbstractC1834.m2476(c1835.f3264, c1835.f3266, c1835.f3265, AbstractC1834.f3261, 1);
            ((AbstractC2182) interfaceC2230).setValue(Boolean.FALSE);
        }
        long j2 = c1835.f3268;
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(AbstractC8726.m13880(j, AbstractC8726.m13883((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new C1784(abstractC2559Mo3615, 1));
    }
}
