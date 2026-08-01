package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.InterfaceC0580;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
@InterfaceC6861(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {2239, 2242}, m = "invokeSuspend", v = 1)
public final class AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ long $offset;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC1054 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(AbstractC1054 abstractC1054, long j, InterfaceC0580 interfaceC0580, InterfaceC4356<? super AbstractClickableNode$handlePressInteraction$2$1$delayJob$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = abstractC1054;
        this.$offset = j;
        this.$interactionSource = interfaceC0580;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((AbstractClickableNode$handlePressInteraction$2$1$delayJob$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C0575 c0575;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (this.this$0.m1961(null)) {
                long j = AbstractC1032.f3028;
                this.label = 1;
                if (AbstractC5398.m10495(j, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0575 = (C0575) this.L$0;
                AbstractC5184.m10206(obj);
                this.this$0.f3114 = c0575;
                return C5175.f14739;
            }
            AbstractC5184.m10206(obj);
        }
        C0575 c05752 = new C0575(this.$offset);
        InterfaceC0580 interfaceC0580 = this.$interactionSource;
        this.L$0 = c05752;
        this.label = 2;
        if (((C0573) interfaceC0580).m1344(c05752, this) != coroutineSingletons) {
            c0575 = c05752;
            this.this$0.f3114 = c0575;
            return C5175.f14739;
        }
        return coroutineSingletons;
    }
}
