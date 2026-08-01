package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.C1573;
import androidx.compose.ui.graphics.InterfaceC1580;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class ShadowGraphicsLayerElement$createBlock$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ C1442 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowGraphicsLayerElement$createBlock$1(C1442 c1442) {
        super(1);
        this.this$0 = c1442;
    }

    public final void invoke(InterfaceC1580 interfaceC1580) {
        this.this$0.getClass();
        C1573 c1573 = (C1573) interfaceC1580;
        c1573.m2859(c1573.f4643.mo1256() * 3.0f);
        c1573.m2862(this.this$0.f4132);
        c1573.m2852(this.this$0.clip);
        c1573.m2854(this.this$0.f4131);
        c1573.m2860(this.this$0.ambientColor);
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1580) obj);
        return C5176.f14739;
    }
}
