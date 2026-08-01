package androidx.compose.p001ui.input.pointer;

import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7380;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "invoke", "(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends Lambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7387 $onTouchEvent;
    final /* synthetic */ C2461 $requestDisallowInterceptTouchEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$2(InterfaceC7387 interfaceC7387, C2461 c2461) {
        super(3);
        this.$onTouchEvent = interfaceC7387;
        this.$requestDisallowInterceptTouchEvent = c2461;
    }

    public final InterfaceC2962 invoke(InterfaceC2962 interfaceC2962, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2952(374375707);
        Object objM2905 = c2159.m2905();
        if (objM2905 == C2204.f4319) {
            objM2905 = new C2475();
            c2159.m2946(objM2905);
        }
        C2475 c2475 = (C2475) objM2905;
        c2475.f5146 = this.$onTouchEvent;
        C2461 c2461 = this.$requestDisallowInterceptTouchEvent;
        C2461 c24612 = c2475.f5144;
        if (c24612 != null) {
            c24612.f5095 = null;
        }
        c2475.f5144 = c2461;
        if (c2461 != null) {
            c2461.f5095 = c2475;
        }
        c2159.m2937(false);
        return c2475;
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC2962) obj, (InterfaceC2208) obj2, ((Number) obj3).intValue());
    }
}
