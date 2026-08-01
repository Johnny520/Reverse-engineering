package androidx.navigationevent.compose;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p160.C8379;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.navigationevent.compose.RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.navigationevent.compose.RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1", m556f = "RememberNavigationEventDispatcherOwner.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class C0231x841f60d6 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C8379 $localDispatcher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0231x841f60d6(C8379 c8379, boolean z, InterfaceC5189<? super C0231x841f60d6> interfaceC5189) {
        super(2, interfaceC5189);
        this.$localDispatcher = c8379;
        this.$enabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new C0231x841f60d6(this.$localDispatcher, this.$enabled, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((C0231x841f60d6) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C8379 c8379 = this.$localDispatcher;
        boolean z = this.$enabled;
        c8379.getClass();
        if (c8379.f20782 != z) {
            c8379.f20782 = z;
            c8379.f20781.m13348();
        }
        return C6008.f15084;
    }
}
