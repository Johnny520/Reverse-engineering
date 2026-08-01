package androidx.compose.p001ui.draw;

import androidx.compose.p001ui.graphics.C2408;
import androidx.compose.p001ui.graphics.InterfaceC2415;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class ShadowGraphicsLayerElement$createBlock$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ C2277 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowGraphicsLayerElement$createBlock$1(C2277 c2277) {
        super(1);
        this.this$0 = c2277;
    }

    public final void invoke(InterfaceC2415 interfaceC2415) {
        this.this$0.getClass();
        C2408 c2408 = (C2408) interfaceC2415;
        c2408.m3419(c2408.f4988.mo1816() * 3.0f);
        c2408.m3422(this.this$0.f4477);
        c2408.m3412(this.this$0.clip);
        c2408.m3414(this.this$0.f4476);
        c2408.m3420(this.this$0.ambientColor);
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC2415) obj);
        return C6008.f15084;
    }
}
