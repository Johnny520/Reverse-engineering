package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0357;
import androidx.compose.animation.core.InterfaceC0349;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$4", f = "ScrollExtensions.kt", l = {63}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;)V"}, k = 3, mv = {2, 1, 0})
final class ScrollExtensionsKt$animateScrollBy$4 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0349 $animationSpec;
    final /* synthetic */ Ref$LongRef $previousValue;
    final /* synthetic */ long $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$4(long j, InterfaceC0349 interfaceC0349, Ref$LongRef ref$LongRef, InterfaceC4357<? super ScrollExtensionsKt$animateScrollBy$4> interfaceC4357) {
        super(2, interfaceC4357);
        this.$value = j;
        this.$animationSpec = interfaceC0349;
        this.$previousValue = ref$LongRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, InterfaceC0549 interfaceC0549, C7329 c7329, C7329 c73292) {
        long j = ref$LongRef.element;
        long jM12526 = C7329.m12526(c7329.f19541, j);
        ((AbstractC0506) interfaceC0549).getClass();
        ref$LongRef.element = C7329.m12525(j, jM12526);
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ScrollExtensionsKt$animateScrollBy$4 scrollExtensionsKt$animateScrollBy$4 = new ScrollExtensionsKt$animateScrollBy$4(this.$value, this.$animationSpec, this.$previousValue, interfaceC4357);
        scrollExtensionsKt$animateScrollBy$4.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$4;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC0549 interfaceC0549, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ScrollExtensionsKt$animateScrollBy$4) create(interfaceC0549, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC0549 interfaceC0549 = (InterfaceC0549) this.L$0;
            C0357 c0357 = AbstractC0330.f1116;
            C7329 c7329 = new C7329(0L);
            C7329 c73292 = new C7329(this.$value);
            InterfaceC0349 interfaceC0349 = this.$animationSpec;
            C0550 c0550 = new C0550(this.$previousValue, interfaceC0549);
            this.label = 1;
            if (AbstractC0330.m1007(c0357, c7329, c73292, null, interfaceC0349, c0550, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
