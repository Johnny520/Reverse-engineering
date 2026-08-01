package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1177;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", m556f = "WindowInsetsConnection.android.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class WindowInsetsNestedScrollConnection$fling$3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $target;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractWindowInsetsAnimationControlListenerC1465 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", m556f = "WindowInsetsConnection.android.kt", m557l = {355}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00531 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $target;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ AbstractWindowInsetsAnimationControlListenerC1465 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00531(int i, int i2, float f, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, AbstractWindowInsetsAnimationControlListenerC1465 abstractWindowInsetsAnimationControlListenerC1465, InterfaceC5189<? super C00531> interfaceC5189) {
            super(2, interfaceC5189);
            this.$current = i;
            this.$target = i2;
            this.$flingAmount = f;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C6008 invokeSuspend$lambda$0(AbstractWindowInsetsAnimationControlListenerC1465 abstractWindowInsetsAnimationControlListenerC1465, C1177 c1177) {
            ((Number) c1177.m1593()).floatValue();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C00531(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, null, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00531) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C00531 c00531;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177M1572 = AbstractC1176.m1572(this.$current);
                Float f = new Float(this.$target);
                Float f2 = new Float(this.$flingAmount);
                C1462 c1462 = new C1462(0);
                this.label = 1;
                c00531 = this;
                if (C1177.m1589(c1177M1572, f, null, f2, c1462, c00531, 2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                c00531 = this;
            }
            c00531.$animationController.finish(c00531.$targetShown);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$3(AbstractWindowInsetsAnimationControlListenerC1465 abstractWindowInsetsAnimationControlListenerC1465, int i, int i2, float f, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, InterfaceC5189<? super WindowInsetsNestedScrollConnection$fling$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.$current = i;
        this.$target = i2;
        this.$flingAmount = f;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(null, this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, interfaceC5189);
        windowInsetsNestedScrollConnection$fling$3.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WindowInsetsNestedScrollConnection$fling$3) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        AbstractC6231.m11036((InterfaceC6233) this.L$0, null, null, new C00531(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, null, null), 3);
        throw null;
    }
}
