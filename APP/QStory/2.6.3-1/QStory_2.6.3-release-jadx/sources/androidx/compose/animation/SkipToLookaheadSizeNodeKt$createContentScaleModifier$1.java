package androidx.compose.animation;

import androidx.compose.p001ui.graphics.C2408;
import androidx.compose.p001ui.graphics.InterfaceC2415;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class SkipToLookaheadSizeNodeKt$createContentScaleModifier$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7372 $isEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkipToLookaheadSizeNodeKt$createContentScaleModifier$1(InterfaceC7372 interfaceC7372) {
        super(1);
        this.$isEnabled = interfaceC7372;
    }

    public final void invoke(InterfaceC2415 interfaceC2415) {
        ((C2408) interfaceC2415).m3412(((Boolean) this.$isEnabled.invoke()).booleanValue());
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC2415) obj);
        return C6008.f15084;
    }
}
