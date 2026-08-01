package androidx.compose.foundation.gestures;

import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", m556f = "Draggable.kt", m557l = {323}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子世兰苏楪哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子世兰苏楪哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class DraggableNode$drag$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC1402 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$drag$2(InterfaceC7383 interfaceC7383, AbstractC1402 abstractC1402, InterfaceC5189<? super DraggableNode$drag$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$forEachDelta = interfaceC7383;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(InterfaceC1307 interfaceC1307, AbstractC1402 abstractC1402, C1321 c1321) {
        long j = c1321.f1792;
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.$forEachDelta, null, interfaceC5189);
        draggableNode$drag$2.L$0 = obj;
        return draggableNode$drag$2;
    }

    @Override // p068.InterfaceC7383
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (obj == null) {
            return invoke((InterfaceC1307) null, (InterfaceC5189<? super C6008>) obj2);
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
            C1361 c1361 = new C1361(2);
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

    public final Object invoke(InterfaceC1307 interfaceC1307, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DraggableNode$drag$2) create(interfaceC1307, interfaceC5189)).invokeSuspend(C6008.f15084);
    }
}
