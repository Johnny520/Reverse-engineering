package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C1418;
import androidx.compose.foundation.interaction.InterfaceC1421;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", m556f = "Clickable.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class AbstractClickableNode$onPointerEvent$1 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ AbstractC1892 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onPointerEvent$1(AbstractC1892 abstractC1892, InterfaceC5189<? super AbstractClickableNode$onPointerEvent$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC1892;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new AbstractClickableNode$onPointerEvent$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AbstractClickableNode$onPointerEvent$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        AbstractC1892 abstractC1892 = this.this$0;
        if (abstractC1892.f3463 == null) {
            C1418 c1418 = new C1418();
            InterfaceC1421 interfaceC1421 = abstractC1892.f3474;
            if (interfaceC1421 != null) {
                AbstractC6231.m11036(abstractC1892.m4427(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(interfaceC1421, c1418, null), 3);
            }
            abstractC1892.f3463 = c1418;
        }
        return C6008.f15084;
    }
}
