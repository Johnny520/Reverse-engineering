package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C1416;
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
@InterfaceC7691(m555c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$3$1", m556f = "Clickable.kt", m557l = {2112, 2113}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class AbstractClickableNode$handlePressInteractionStart$3$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ boolean $indirectPointer;
    final /* synthetic */ InterfaceC1421 $interactionSource;
    final /* synthetic */ C1416 $press;
    int label;
    final /* synthetic */ AbstractC1892 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionStart$3$1(InterfaceC1421 interfaceC1421, C1416 c1416, boolean z, AbstractC1892 abstractC1892, InterfaceC5189<? super AbstractClickableNode$handlePressInteractionStart$3$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$interactionSource = interfaceC1421;
        this.$press = c1416;
        this.$indirectPointer = z;
        this.this$0 = abstractC1892;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new AbstractClickableNode$handlePressInteractionStart$3$1(this.$interactionSource, this.$press, this.$indirectPointer, this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AbstractClickableNode$handlePressInteractionStart$3$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (((androidx.compose.foundation.interaction.C1414) r7).m1914(r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            long j = AbstractC1870.f3374;
            this.label = 1;
            if (AbstractC6231.m11058(j, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            boolean z = this.$indirectPointer;
            AbstractC1892 abstractC1892 = this.this$0;
            if (z) {
                abstractC1892.f3459 = this.$press;
            } else {
                abstractC1892.f3460 = this.$press;
            }
            return C6008.f15084;
        }
        AbstractC6017.m10769(obj);
        InterfaceC1421 interfaceC1421 = this.$interactionSource;
        C1416 c1416 = this.$press;
        this.label = 2;
    }
}
