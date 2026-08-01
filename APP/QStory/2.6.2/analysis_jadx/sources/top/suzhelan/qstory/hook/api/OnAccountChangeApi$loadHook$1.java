package top.suzhelan.qstory.hook.api;

import com.bumptech.glide.AbstractC3056;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import lin.xposed.hook.util.qq.QQEnvTool;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.qstory.hook.api.OnAccountChangeApi$loadHook$1", f = "OnAccountChangeApi.kt", l = {33}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class OnAccountChangeApi$loadHook$1 extends SuspendLambda implements InterfaceC6553 {
    int label;
    final /* synthetic */ C5810 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnAccountChangeApi$loadHook$1(C5810 c5810, InterfaceC4356<? super OnAccountChangeApi$loadHook$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c5810;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new OnAccountChangeApi$loadHook$1(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((OnAccountChangeApi$loadHook$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            C5919.m11250(AbstractC3056.m6668(-3937693499584152999L));
            return null;
        }
        AbstractC5184.m10206(obj);
        do {
            C5810 c5810 = this.this$0;
            if (c5810.f15933 != null) {
                return C5175.f14739;
            }
            c5810.f15933 = QQEnvTool.getCurrentUin();
            this.label = 1;
        } while (AbstractC5398.m10495(1000L, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
