package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1573;
import androidx.compose.ui.graphics.C1606;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.graphics.InterfaceC1580;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class BlurKt$blur$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ boolean $clip;
    final /* synthetic */ InterfaceC1569 $edgeTreatment;
    final /* synthetic */ float $radiusX;
    final /* synthetic */ float $radiusY;
    final /* synthetic */ int $tileMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurKt$blur$1(float f, float f2, int i, InterfaceC1569 interfaceC1569, boolean z) {
        super(1);
        this.$radiusX = f;
        this.$radiusY = f2;
        this.$tileMode = i;
        this.$edgeTreatment = interfaceC1569;
        this.$clip = z;
    }

    public final void invoke(InterfaceC1580 interfaceC1580) {
        C1573 c1573 = (C1573) interfaceC1580;
        float fMo1246 = c1573.f4642.mo1246() * this.$radiusX;
        float fMo12462 = c1573.f4642.mo1246() * this.$radiusY;
        c1573.m2854((fMo1246 <= 0.0f || fMo12462 <= 0.0f) ? null : new C1606(fMo1246, fMo12462, this.$tileMode));
        InterfaceC1569 interfaceC1569 = this.$edgeTreatment;
        if (interfaceC1569 == null) {
            interfaceC1569 = AbstractC1581.f4661;
        }
        c1573.m2852(interfaceC1569);
        c1573.m2842(this.$clip);
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1580) obj);
        return C5175.f14739;
    }
}
