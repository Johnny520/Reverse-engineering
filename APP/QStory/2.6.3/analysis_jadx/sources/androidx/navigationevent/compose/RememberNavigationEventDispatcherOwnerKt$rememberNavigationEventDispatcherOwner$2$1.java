package androidx.navigationevent.compose;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p144.C7550;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.navigationevent.compose.RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1", f = "RememberNavigationEventDispatcherOwner.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C7550 $localDispatcher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1(C7550 c7550, boolean z, InterfaceC4357<? super RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$localDispatcher = c7550;
        this.$enabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1(this.$localDispatcher, this.$enabled, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C7550 c7550 = this.$localDispatcher;
        boolean z = this.$enabled;
        c7550.getClass();
        if (c7550.f20437 != z) {
            c7550.f20437 = z;
            c7550.f20436.m12789();
        }
        return C5176.f14739;
    }
}
