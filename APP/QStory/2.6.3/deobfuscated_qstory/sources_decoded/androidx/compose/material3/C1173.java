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
import kotlin.collections.AbstractC4339;
import kotlinx.coroutines.AbstractC5399;
import p118.AbstractC7358;
import p205.AbstractC7897;
import p205.AbstractC7907;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1173 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public float f3374;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC0579 f3375;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public float f3376;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C0331 f3377;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C0331 f3378;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f3379;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C0299 f3380;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f3381;

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return false;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        AbstractC5399.m10477(m3867(), null, null, new ThumbNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        float fMo1344 = interfaceC1653.mo1344(this.f3379 ? AbstractC7358.f19679 : ((interfaceC1655.mo3057(C7898.m13337(j)) != 0 && interfaceC1655.mo3058(C7898.m13338(j)) != 0) || this.f3381) ? AbstractC1204.f3461 : AbstractC1204.f3460);
        C0331 c0331 = this.f3377;
        int iFloatValue = (int) (c0331 != null ? ((Number) c0331.m1033()).floatValue() : fMo1344);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            AbstractC7907.m13360("width and height must be >= 0");
        }
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(AbstractC7897.m13326(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fMo13442 = interfaceC1653.mo1344((AbstractC1204.f3458 - interfaceC1653.mo1332(fMo1344)) / 2.0f);
        float fMo13443 = interfaceC1653.mo1344((AbstractC1204.f3459 - AbstractC1204.f3461) - AbstractC1204.f3457);
        boolean z = this.f3379;
        if (z && this.f3381) {
            fMo13442 = fMo13443 - interfaceC1653.mo1344(AbstractC7358.f19675);
        } else if (z && !this.f3381) {
            fMo13442 = interfaceC1653.mo1344(AbstractC7358.f19675);
        } else if (this.f3381) {
            fMo13442 = fMo13443;
        }
        C0331 c03312 = this.f3377;
        Float f = c03312 != null ? (Float) ((AbstractC1347) c03312.f1125).getValue() : null;
        if (f == null || f.floatValue() != fMo1344) {
            AbstractC5399.m10477(m3867(), null, null, new ThumbNode$measure$1(this, fMo1344, null), 3);
        }
        C0331 c03313 = this.f3378;
        Float f2 = c03313 != null ? (Float) ((AbstractC1347) c03313.f1125).getValue() : null;
        if (f2 == null || f2.floatValue() != fMo13442) {
            AbstractC5399.m10477(m3867(), null, null, new ThumbNode$measure$2(this, fMo13442, null), 3);
        }
        if (Float.isNaN(this.f3374) && Float.isNaN(this.f3376)) {
            this.f3374 = fMo1344;
            this.f3376 = fMo13442;
        }
        return interfaceC1653.mo1495(iFloatValue, iFloatValue, AbstractC4339.m8776(), new C0485(abstractC1724Mo3055, this, fMo13442));
    }
}
