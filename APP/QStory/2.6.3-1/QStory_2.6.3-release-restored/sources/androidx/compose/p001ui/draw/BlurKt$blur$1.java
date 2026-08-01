package androidx.compose.p001ui.draw;

import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2408;
import androidx.compose.p001ui.graphics.C2441;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.graphics.InterfaceC2415;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class BlurKt$blur$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ boolean $clip;
    final /* synthetic */ InterfaceC2404 $edgeTreatment;
    final /* synthetic */ float $radiusX;
    final /* synthetic */ float $radiusY;
    final /* synthetic */ int $tileMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurKt$blur$1(float f, float f2, int i, InterfaceC2404 interfaceC2404, boolean z) {
        super(1);
        this.$radiusX = f;
        this.$radiusY = f2;
        this.$tileMode = i;
        this.$edgeTreatment = interfaceC2404;
        this.$clip = z;
    }

    public final void invoke(InterfaceC2415 interfaceC2415) {
        C2408 c2408 = (C2408) interfaceC2415;
        float fMo1816 = c2408.f4988.mo1816() * this.$radiusX;
        float fMo18162 = c2408.f4988.mo1816() * this.$radiusY;
        c2408.m3424((fMo1816 <= 0.0f || fMo18162 <= 0.0f) ? null : new C2441(fMo1816, fMo18162, this.$tileMode));
        InterfaceC2404 interfaceC2404 = this.$edgeTreatment;
        if (interfaceC2404 == null) {
            interfaceC2404 = AbstractC2416.f5007;
        }
        c2408.m3422(interfaceC2404);
        c2408.m3412(this.$clip);
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC2415) obj);
        return C6008.f15084;
    }
}
