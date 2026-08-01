package androidx.compose.foundation.gestures;

import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", m556f = "AnchoredDraggable.kt", m557l = {412}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"T", "Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class AnchoredDraggableNode$drag$2 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7383 $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC1360 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$drag$2(InterfaceC7383 interfaceC7383, AbstractC1360 abstractC1360, InterfaceC5189<? super AnchoredDraggableNode$drag$2> interfaceC5189) {
        super(3, interfaceC5189);
        this.$forEachDelta = interfaceC7383;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(AbstractC1360 abstractC1360, InterfaceC1364 interfaceC1364, C1321 c1321) {
        long j = c1321.f1792;
        throw null;
    }

    private static final C8158 invokeSuspend$lambda$0$0(AbstractC1360 abstractC1360, InterfaceC1364 interfaceC1364, C8158 c8158) {
        throw null;
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
            if (this.L$0 != null) {
                C3775.m6954();
                return null;
            }
            InterfaceC7383 interfaceC7383 = this.$forEachDelta;
            C1361 c1361 = new C1361(0);
            this.label = 1;
            if (interfaceC7383.invoke(c1361, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }

    public final Object invoke(InterfaceC1364 interfaceC1364, InterfaceC1302 interfaceC1302, InterfaceC5189<? super C6008> interfaceC5189) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.$forEachDelta, null, interfaceC5189);
        anchoredDraggableNode$drag$2.L$0 = interfaceC1364;
        return anchoredDraggableNode$drag$2.invokeSuspend(C6008.f15084);
    }
}
