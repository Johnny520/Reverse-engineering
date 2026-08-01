package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.gestures.InterfaceC1393;
import androidx.compose.foundation.interaction.InterfaceC1421;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$onPress$1", m556f = "Pressable.kt", m557l = {365}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class AbstractPressableNode$clickPointerInput$onPress$1 extends SuspendLambda implements InterfaceC7380 {
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC6892 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractPressableNode$clickPointerInput$onPress$1(AbstractC6892 abstractC6892, InterfaceC5189<? super AbstractPressableNode$clickPointerInput$onPress$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.this$0 = abstractC6892;
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11965invoked4ec7I((InterfaceC1393) obj, ((C8158) obj2).f19886, (InterfaceC5189) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11965invoked4ec7I(InterfaceC1393 interfaceC1393, long j, InterfaceC5189<? super C6008> interfaceC5189) {
        AbstractPressableNode$clickPointerInput$onPress$1 abstractPressableNode$clickPointerInput$onPress$1 = new AbstractPressableNode$clickPointerInput$onPress$1(this.this$0, interfaceC5189);
        abstractPressableNode$clickPointerInput$onPress$1.L$0 = interfaceC1393;
        abstractPressableNode$clickPointerInput$onPress$1.J$0 = j;
        return abstractPressableNode$clickPointerInput$onPress$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM11066;
        InterfaceC1393 interfaceC1393 = (InterfaceC1393) this.L$0;
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        AbstractC6892 abstractC6892 = this.this$0;
        if (abstractC6892.f16924) {
            this.L$0 = null;
            this.J$0 = j;
            this.label = 1;
            InterfaceC1421 interfaceC1421 = abstractC6892.f16926;
            if (interfaceC1421 == null || (objM11066 = AbstractC6231.m11066(new AbstractPressableNode$handlePressInteraction$2$1(interfaceC1393, j, interfaceC1421, abstractC6892, null), this)) != coroutineSingletons) {
                objM11066 = c6008;
            }
            if (objM11066 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c6008;
    }
}
