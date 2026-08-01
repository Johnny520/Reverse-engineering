package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6550;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "invoke", "(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends Lambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6557 $onTouchEvent;
    final /* synthetic */ C1626 $requestDisallowInterceptTouchEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$2(InterfaceC6557 interfaceC6557, C1626 c1626) {
        super(3);
        this.$onTouchEvent = interfaceC6557;
        this.$requestDisallowInterceptTouchEvent = c1626;
    }

    public final InterfaceC2129 invoke(InterfaceC2129 interfaceC2129, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2382(374375707);
        Object objM2335 = c1324.m2335();
        if (objM2335 == C1369.f3973) {
            objM2335 = new C1640();
            c1324.m2376(objM2335);
        }
        C1640 c1640 = (C1640) objM2335;
        c1640.f4800 = this.$onTouchEvent;
        C1626 c1626 = this.$requestDisallowInterceptTouchEvent;
        C1626 c16262 = c1640.f4798;
        if (c16262 != null) {
            c16262.f4749 = null;
        }
        c1640.f4798 = c1626;
        if (c1626 != null) {
            c1626.f4749 = c1640;
        }
        c1324.m2367(false);
        return c1640;
    }

    @Override // p052.InterfaceC6550
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC2129) obj, (InterfaceC1373) obj2, ((Number) obj3).intValue());
    }
}
