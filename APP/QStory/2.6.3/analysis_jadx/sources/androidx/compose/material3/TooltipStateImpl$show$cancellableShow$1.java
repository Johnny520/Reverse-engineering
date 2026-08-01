package androidx.compose.material3;

import androidx.window.area.AbstractC2567;
import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5444;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", l = {1655}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
final class TooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements InterfaceC6558 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC1164 this$0;

    public TooltipStateImpl$show$cancellableShow$1(AbstractC1164 abstractC1164, InterfaceC4357<? super TooltipStateImpl$show$cancellableShow$1> interfaceC4357) {
        super(1, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new TooltipStateImpl$show$cancellableShow$1(null, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TooltipStateImpl$show$cancellableShow$1) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            this.L$0 = null;
            this.label = 1;
            new C5444(1, AbstractC2567.m5064(this)).m10543();
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$0 == null) {
            AbstractC5185.m10210(obj);
            return C5176.f14739;
        }
        C2942.m6394();
        return null;
    }
}
