package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0357;
import androidx.compose.animation.core.InterfaceC0349;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$4", f = "ScrollExtensions.kt", l = {63}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;)V"}, k = 3, mv = {2, 1, 0})
final class ScrollExtensionsKt$animateScrollBy$4 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0349 $animationSpec;
    final /* synthetic */ Ref$LongRef $previousValue;
    final /* synthetic */ long $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$4(long j, InterfaceC0349 interfaceC0349, Ref$LongRef ref$LongRef, InterfaceC4356<? super ScrollExtensionsKt$animateScrollBy$4> interfaceC4356) {
        super(2, interfaceC4356);
        this.$value = j;
        this.$animationSpec = interfaceC0349;
        this.$previousValue = ref$LongRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, InterfaceC0549 interfaceC0549, C7328 c7328, C7328 c73282) {
        long j = ref$LongRef.element;
        long jM12499 = C7328.m12499(c7328.f19546, j);
        ((AbstractC0506) interfaceC0549).getClass();
        ref$LongRef.element = C7328.m12498(j, jM12499);
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ScrollExtensionsKt$animateScrollBy$4 scrollExtensionsKt$animateScrollBy$4 = new ScrollExtensionsKt$animateScrollBy$4(this.$value, this.$animationSpec, this.$previousValue, interfaceC4356);
        scrollExtensionsKt$animateScrollBy$4.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$4;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC0549 interfaceC0549, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ScrollExtensionsKt$animateScrollBy$4) create(interfaceC0549, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC0549 interfaceC0549 = (InterfaceC0549) this.L$0;
            C0357 c0357 = AbstractC0330.f1116;
            C7328 c7328 = new C7328(0L);
            C7328 c73282 = new C7328(this.$value);
            InterfaceC0349 interfaceC0349 = this.$animationSpec;
            C0550 c0550 = new C0550(this.$previousValue, interfaceC0549);
            this.label = 1;
            if (AbstractC0330.m1006(c0357, c7328, c73282, null, interfaceC0349, c0550, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
