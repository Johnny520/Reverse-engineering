package androidx.compose.foundation.gestures;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;)V"}, k = 3, mv = {2, 1, 0})
final class ScrollExtensionsKt$scrollBy$4 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Ref$LongRef $consumed;
    final /* synthetic */ long $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$4(Ref$LongRef ref$LongRef, long j, InterfaceC4357<? super ScrollExtensionsKt$scrollBy$4> interfaceC4357) {
        super(2, interfaceC4357);
        this.$consumed = ref$LongRef;
        this.$value = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ScrollExtensionsKt$scrollBy$4 scrollExtensionsKt$scrollBy$4 = new ScrollExtensionsKt$scrollBy$4(this.$consumed, this.$value, interfaceC4357);
        scrollExtensionsKt$scrollBy$4.L$0 = obj;
        return scrollExtensionsKt$scrollBy$4;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC0549 interfaceC0549, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ScrollExtensionsKt$scrollBy$4) create(interfaceC0549, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC0549 interfaceC0549 = (InterfaceC0549) this.L$0;
        Ref$LongRef ref$LongRef = this.$consumed;
        long j = this.$value;
        ((AbstractC0506) interfaceC0549).getClass();
        ref$LongRef.element = j;
        return C5176.f14739;
    }
}
