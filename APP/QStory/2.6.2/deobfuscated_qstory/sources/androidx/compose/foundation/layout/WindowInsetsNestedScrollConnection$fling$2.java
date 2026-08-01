package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0333;
import androidx.compose.animation.core.C0342;
import androidx.compose.animation.core.C0347;
import androidx.compose.animation.core.C0373;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", l = {345}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class WindowInsetsNestedScrollConnection$fling$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ Ref$FloatRef $endVelocity;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $hidden;
    final /* synthetic */ int $shown;
    final /* synthetic */ AbstractC0617 $spec;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractWindowInsetsAnimationControlListenerC0624 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", l = {329}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ Ref$FloatRef $endVelocity;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $hidden;
        final /* synthetic */ int $shown;
        final /* synthetic */ AbstractC0617 $spec;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ AbstractWindowInsetsAnimationControlListenerC0624 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, float f, AbstractC0617 abstractC0617, int i2, int i3, AbstractWindowInsetsAnimationControlListenerC0624 abstractWindowInsetsAnimationControlListenerC0624, Ref$FloatRef ref$FloatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$current = i;
            this.$flingAmount = f;
            this.$spec = abstractC0617;
            this.$hidden = i2;
            this.$shown = i3;
            this.$endVelocity = ref$FloatRef;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5175 invokeSuspend$lambda$0(int i, int i2, AbstractWindowInsetsAnimationControlListenerC0624 abstractWindowInsetsAnimationControlListenerC0624, Ref$FloatRef ref$FloatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, float f, float f2) {
            float f3 = i;
            if (f <= i2 && f3 <= f) {
                throw null;
            }
            ref$FloatRef.element = f2;
            windowInsetsAnimationController.finish(z);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, null, this.$endVelocity, this.$animationController, this.$targetShown, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C5175 c5175 = C5175.f14739;
            if (i != 0) {
                if (i == 1) {
                    AbstractC5184.m10206(obj);
                    return c5175;
                }
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            float f = this.$current;
            float f2 = this.$flingAmount;
            C0622 c0622 = new C0622(this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown);
            this.label = 1;
            Object objM1007 = AbstractC0330.m1007(AbstractC0330.m1010(f, f2, 28), new C0342(new C0333(null), AbstractC0330.f1123, Float.valueOf(f), new C0347(f2)), Long.MIN_VALUE, new C0373(c0622, 0), this);
            if (objM1007 != coroutineSingletons) {
                objM1007 = c5175;
            }
            return objM1007 == coroutineSingletons ? coroutineSingletons : c5175;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$2(AbstractWindowInsetsAnimationControlListenerC0624 abstractWindowInsetsAnimationControlListenerC0624, int i, float f, AbstractC0617 abstractC0617, int i2, int i3, Ref$FloatRef ref$FloatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, InterfaceC4356<? super WindowInsetsNestedScrollConnection$fling$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$current = i;
        this.$flingAmount = f;
        this.$spec = abstractC0617;
        this.$hidden = i2;
        this.$shown = i3;
        this.$endVelocity = ref$FloatRef;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(null, this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown, interfaceC4356);
        windowInsetsNestedScrollConnection$fling$2.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC5398.m10473((InterfaceC5400) this.L$0, null, null, new AnonymousClass1(this.$current, this.$flingAmount, null, this.$hidden, this.$shown, null, this.$endVelocity, this.$animationController, this.$targetShown, null), 3);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5184.m10206(obj);
        throw null;
    }
}
