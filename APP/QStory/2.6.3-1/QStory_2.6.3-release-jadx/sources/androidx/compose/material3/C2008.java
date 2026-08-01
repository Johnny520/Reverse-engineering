package androidx.compose.material3;

import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1177;
import androidx.compose.foundation.gestures.C1326;
import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.runtime.AbstractC2182;
import kotlin.collections.AbstractC5171;
import kotlinx.coroutines.AbstractC6231;
import p134.AbstractC8187;
import p221.AbstractC8726;
import p221.AbstractC8736;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2008 extends AbstractC2961 implements InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public float f3719;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC1420 f3720;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public float f3721;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1177 f3722;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1177 f3723;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f3724;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C1145 f3725;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f3726;

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        AbstractC6231.m11036(m4427(), null, null, new ThumbNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        float fMo1904 = interfaceC2488.mo1904(this.f3724 ? AbstractC8187.f20024 : ((interfaceC2490.mo3617(C8727.m13896(j)) != 0 && interfaceC2490.mo3618(C8727.m13897(j)) != 0) || this.f3726) ? AbstractC2039.f3806 : AbstractC2039.f3805);
        C1177 c1177 = this.f3722;
        int iFloatValue = (int) (c1177 != null ? ((Number) c1177.m1593()).floatValue() : fMo1904);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            AbstractC8736.m13919("width and height must be >= 0");
        }
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(AbstractC8726.m13885(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fMo19042 = interfaceC2488.mo1904((AbstractC2039.f3803 - interfaceC2488.mo1892(fMo1904)) / 2.0f);
        float fMo19043 = interfaceC2488.mo1904((AbstractC2039.f3804 - AbstractC2039.f3806) - AbstractC2039.f3802);
        boolean z = this.f3724;
        if (z && this.f3726) {
            fMo19042 = fMo19043 - interfaceC2488.mo1904(AbstractC8187.f20020);
        } else if (z && !this.f3726) {
            fMo19042 = interfaceC2488.mo1904(AbstractC8187.f20020);
        } else if (this.f3726) {
            fMo19042 = fMo19043;
        }
        C1177 c11772 = this.f3722;
        Float f = c11772 != null ? (Float) ((AbstractC2182) c11772.f1470).getValue() : null;
        if (f == null || f.floatValue() != fMo1904) {
            AbstractC6231.m11036(m4427(), null, null, new ThumbNode$measure$1(this, fMo1904, null), 3);
        }
        C1177 c11773 = this.f3723;
        Float f2 = c11773 != null ? (Float) ((AbstractC2182) c11773.f1470).getValue() : null;
        if (f2 == null || f2.floatValue() != fMo19042) {
            AbstractC6231.m11036(m4427(), null, null, new ThumbNode$measure$2(this, fMo19042, null), 3);
        }
        if (Float.isNaN(this.f3719) && Float.isNaN(this.f3721)) {
            this.f3719 = fMo1904;
            this.f3721 = fMo19042;
        }
        return interfaceC2488.mo2055(iFloatValue, iFloatValue, AbstractC5171.m9335(), new C1326(abstractC2559Mo3615, this, fMo19042));
    }
}
