package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.InterfaceC1421;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$handlePressInteraction$2$1$delayJob$1", m556f = "Pressable.kt", m557l = {396, 398}, m558m = "invokeSuspend", m559v = 2)
public final class AbstractPressableNode$handlePressInteraction$2$1$delayJob$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1421 $interactionSource;
    final /* synthetic */ long $offset;
    int I$0;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC6892 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractPressableNode$handlePressInteraction$2$1$delayJob$1(AbstractC6892 abstractC6892, long j, InterfaceC1421 interfaceC1421, InterfaceC5189<? super AbstractPressableNode$handlePressInteraction$2$1$delayJob$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC6892;
        this.$offset = j;
        this.$interactionSource = interfaceC1421;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new AbstractPressableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AbstractPressableNode$handlePressInteraction$2$1$delayJob$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1416 c1416;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.this$0.getClass();
        } else {
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c1416 = (C1416) this.L$0;
                AbstractC6017.m10769(obj);
                this.this$0.f16919 = c1416;
                return C6008.f15084;
            }
            AbstractC6017.m10769(obj);
        }
        C1416 c14162 = new C1416(this.$offset);
        InterfaceC1421 interfaceC1421 = this.$interactionSource;
        this.L$0 = c14162;
        this.label = 2;
        if (((C1414) interfaceC1421).m1914(c14162, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        c1416 = c14162;
        this.this$0.f16919 = c1416;
        return C6008.f15084;
    }
}
