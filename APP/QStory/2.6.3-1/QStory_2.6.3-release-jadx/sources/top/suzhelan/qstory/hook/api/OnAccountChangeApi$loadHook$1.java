package top.suzhelan.qstory.hook.api;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.qstory.hook.api.OnAccountChangeApi$loadHook$1", m556f = "OnAccountChangeApi.kt", m557l = {33}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class OnAccountChangeApi$loadHook$1 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ C6641 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnAccountChangeApi$loadHook$1(C6641 c6641, InterfaceC5189<? super OnAccountChangeApi$loadHook$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c6641;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new OnAccountChangeApi$loadHook$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((OnAccountChangeApi$loadHook$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            C6755.m11870(AbstractC9234.m14531(1261));
            return null;
        }
        AbstractC6017.m10769(obj);
        do {
            C6641 c6641 = this.this$0;
            if (c6641.f16278 != null) {
                return C6008.f15084;
            }
            c6641.f16278 = QQEnvTool.getCurrentUin();
            this.label = 1;
        } while (AbstractC6231.m11058(1000L, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
