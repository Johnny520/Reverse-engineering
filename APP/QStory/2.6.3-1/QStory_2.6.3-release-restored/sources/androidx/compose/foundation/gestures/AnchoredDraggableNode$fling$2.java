package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", m556f = "AnchoredDraggable.kt", m557l = {473}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"T", "Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class AnchoredDraggableNode$fling$2 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ Ref$FloatRef $leftoverVelocity;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC1360 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$2(AbstractC1360 abstractC1360, Ref$FloatRef ref$FloatRef, float f, InterfaceC5189<? super AnchoredDraggableNode$fling$2> interfaceC5189) {
        super(3, interfaceC5189);
        this.$leftoverVelocity = ref$FloatRef;
        this.$velocity = f;
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            C3775.m6954();
            return null;
        }
        if (obj2 == null) {
            return invoke((InterfaceC1364) null, (InterfaceC1302) null, (InterfaceC5189<? super C6008>) obj3);
        }
        C3775.m6954();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw AbstractC0900.m719(this.L$0);
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.L$0;
        AbstractC6017.m10769(obj);
        ref$FloatRef.element = ((Number) obj).floatValue();
        return C6008.f15084;
    }

    public final Object invoke(InterfaceC1364 interfaceC1364, InterfaceC1302 interfaceC1302, InterfaceC5189<? super C6008> interfaceC5189) {
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(null, this.$leftoverVelocity, this.$velocity, interfaceC5189);
        anchoredDraggableNode$fling$2.L$0 = interfaceC1364;
        return anchoredDraggableNode$fling$2.invokeSuspend(C6008.f15084);
    }
}
