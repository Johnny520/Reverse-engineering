package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.InterfaceC0580;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
@InterfaceC6862(c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$handlePressInteraction$2$1$delayJob$1", f = "Pressable.kt", l = {396, 398}, m = "invokeSuspend", v = 2)
public final class AbstractPressableNode$handlePressInteraction$2$1$delayJob$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ long $offset;
    int I$0;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC6063 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractPressableNode$handlePressInteraction$2$1$delayJob$1(AbstractC6063 abstractC6063, long j, InterfaceC0580 interfaceC0580, InterfaceC4357<? super AbstractPressableNode$handlePressInteraction$2$1$delayJob$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC6063;
        this.$offset = j;
        this.$interactionSource = interfaceC0580;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new AbstractPressableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AbstractPressableNode$handlePressInteraction$2$1$delayJob$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C0575 c0575;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            this.this$0.getClass();
        } else {
            if (i != 1) {
                if (i != 2) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0575 = (C0575) this.L$0;
                AbstractC5185.m10210(obj);
                this.this$0.f16574 = c0575;
                return C5176.f14739;
            }
            AbstractC5185.m10210(obj);
        }
        C0575 c05752 = new C0575(this.$offset);
        InterfaceC0580 interfaceC0580 = this.$interactionSource;
        this.L$0 = c05752;
        this.label = 2;
        if (((C0573) interfaceC0580).m1354(c05752, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        c0575 = c05752;
        this.this$0.f16574 = c0575;
        return C5176.f14739;
    }
}
