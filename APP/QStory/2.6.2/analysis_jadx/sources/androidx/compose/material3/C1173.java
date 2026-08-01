package androidx.compose.material3;

import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.C0331;
import androidx.compose.foundation.gestures.C0485;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4338;
import kotlinx.coroutines.AbstractC5398;
import p118.AbstractC7357;
import p205.AbstractC7896;
import p205.AbstractC7906;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1173 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public float f3373;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC0579 f3374;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public float f3375;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C0331 f3376;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C0331 f3377;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f3378;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C0299 f3379;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f3380;

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        AbstractC5398.m10473(m3857(), null, null, new ThumbNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        float fMo1334 = interfaceC1653.mo1334(this.f3378 ? AbstractC7357.f19684 : ((interfaceC1655.mo3047(C7897.m13309(j)) != 0 && interfaceC1655.mo3048(C7897.m13310(j)) != 0) || this.f3380) ? AbstractC1204.f3460 : AbstractC1204.f3459);
        C0331 c0331 = this.f3376;
        int iFloatValue = (int) (c0331 != null ? ((Number) c0331.m1032()).floatValue() : fMo1334);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            AbstractC7906.m13332("width and height must be >= 0");
        }
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(AbstractC7896.m13298(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fMo13342 = interfaceC1653.mo1334((AbstractC1204.f3457 - interfaceC1653.mo1322(fMo1334)) / 2.0f);
        float fMo13343 = interfaceC1653.mo1334((AbstractC1204.f3458 - AbstractC1204.f3460) - AbstractC1204.f3456);
        boolean z = this.f3378;
        if (z && this.f3380) {
            fMo13342 = fMo13343 - interfaceC1653.mo1334(AbstractC7357.f19680);
        } else if (z && !this.f3380) {
            fMo13342 = interfaceC1653.mo1334(AbstractC7357.f19680);
        } else if (this.f3380) {
            fMo13342 = fMo13343;
        }
        C0331 c03312 = this.f3376;
        Float f = c03312 != null ? (Float) ((AbstractC1347) c03312.f1125).getValue() : null;
        if (f == null || f.floatValue() != fMo1334) {
            AbstractC5398.m10473(m3857(), null, null, new ThumbNode$measure$1(this, fMo1334, null), 3);
        }
        C0331 c03313 = this.f3377;
        Float f2 = c03313 != null ? (Float) ((AbstractC1347) c03313.f1125).getValue() : null;
        if (f2 == null || f2.floatValue() != fMo13342) {
            AbstractC5398.m10473(m3857(), null, null, new ThumbNode$measure$2(this, fMo13342, null), 3);
        }
        if (Float.isNaN(this.f3373) && Float.isNaN(this.f3375)) {
            this.f3373 = fMo1334;
            this.f3375 = fMo13342;
        }
        return interfaceC1653.mo1485(iFloatValue, iFloatValue, AbstractC4338.m8781(), new C0485(abstractC1724Mo3045, this, fMo13342));
    }
}
