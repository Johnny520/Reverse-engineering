package androidx.compose.foundation.gestures;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;)V"}, k = 3, mv = {2, 1, 0})
final class ScrollExtensionsKt$scrollBy$4 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Ref$LongRef $consumed;
    final /* synthetic */ long $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$4(Ref$LongRef ref$LongRef, long j, InterfaceC4356<? super ScrollExtensionsKt$scrollBy$4> interfaceC4356) {
        super(2, interfaceC4356);
        this.$consumed = ref$LongRef;
        this.$value = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ScrollExtensionsKt$scrollBy$4 scrollExtensionsKt$scrollBy$4 = new ScrollExtensionsKt$scrollBy$4(this.$consumed, this.$value, interfaceC4356);
        scrollExtensionsKt$scrollBy$4.L$0 = obj;
        return scrollExtensionsKt$scrollBy$4;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC0549 interfaceC0549, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ScrollExtensionsKt$scrollBy$4) create(interfaceC0549, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC0549 interfaceC0549 = (InterfaceC0549) this.L$0;
        Ref$LongRef ref$LongRef = this.$consumed;
        long j = this.$value;
        ((AbstractC0506) interfaceC0549).getClass();
        ref$LongRef.element = j;
        return C5175.f14739;
    }
}
