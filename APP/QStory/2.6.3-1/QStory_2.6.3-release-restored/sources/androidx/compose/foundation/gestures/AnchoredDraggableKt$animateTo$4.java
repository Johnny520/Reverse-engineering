package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0900;
import androidx.compose.animation.core.InterfaceC1195;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7381;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", m556f = "AnchoredDraggable.kt", m557l = {1378}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, m151d2 = {"T", "Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;", "anchors", "latestTarget", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class AnchoredDraggableKt$animateTo$4 extends SuspendLambda implements InterfaceC7381 {
    final /* synthetic */ InterfaceC1195 $animationSpec;
    final /* synthetic */ AbstractC1378 $this_animateTo;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$4(AbstractC1378 abstractC1378, InterfaceC1195 interfaceC1195, InterfaceC5189<? super AnchoredDraggableKt$animateTo$4> interfaceC5189) {
        super(4, interfaceC5189);
        this.$animationSpec = interfaceC1195;
    }

    @Override // p068.InterfaceC7381
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj != null) {
            C3775.m6954();
            return null;
        }
        if (obj2 == null) {
            return invoke((InterfaceC1364) null, (InterfaceC1302) null, obj3, (InterfaceC5189<? super C6008>) obj4);
        }
        C3775.m6954();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        if (this.L$0 == null) {
            throw AbstractC0900.m719(this.L$1);
        }
        C3775.m6954();
        return null;
    }

    public final Object invoke(InterfaceC1364 interfaceC1364, InterfaceC1302 interfaceC1302, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new AnchoredDraggableKt$animateTo$4(null, this.$animationSpec, interfaceC5189);
        anchoredDraggableKt$animateTo$4.L$0 = interfaceC1364;
        anchoredDraggableKt$animateTo$4.L$1 = interfaceC1302;
        anchoredDraggableKt$animateTo$4.L$2 = obj;
        return anchoredDraggableKt$animateTo$4.invokeSuspend(C6008.f15084);
    }
}
