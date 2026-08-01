package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1179;
import androidx.compose.animation.core.C1188;
import androidx.compose.animation.core.C1193;
import androidx.compose.animation.core.C1219;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", m556f = "WindowInsetsConnection.android.kt", m557l = {345}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class WindowInsetsNestedScrollConnection$fling$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ Ref$FloatRef $endVelocity;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $hidden;
    final /* synthetic */ int $shown;
    final /* synthetic */ AbstractC1458 $spec;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractWindowInsetsAnimationControlListenerC1465 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", m556f = "WindowInsetsConnection.android.kt", m557l = {329}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00521 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ Ref$FloatRef $endVelocity;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $hidden;
        final /* synthetic */ int $shown;
        final /* synthetic */ AbstractC1458 $spec;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ AbstractWindowInsetsAnimationControlListenerC1465 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00521(int i, float f, AbstractC1458 abstractC1458, int i2, int i3, AbstractWindowInsetsAnimationControlListenerC1465 abstractWindowInsetsAnimationControlListenerC1465, Ref$FloatRef ref$FloatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, InterfaceC5189<? super C00521> interfaceC5189) {
            super(2, interfaceC5189);
            this.$current = i;
            this.$flingAmount = f;
            this.$spec = abstractC1458;
            this.$hidden = i2;
            this.$shown = i3;
            this.$endVelocity = ref$FloatRef;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C6008 invokeSuspend$lambda$0(int i, int i2, AbstractWindowInsetsAnimationControlListenerC1465 abstractWindowInsetsAnimationControlListenerC1465, Ref$FloatRef ref$FloatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, float f, float f2) {
            float f3 = i;
            if (f <= i2 && f3 <= f) {
                throw null;
            }
            ref$FloatRef.element = f2;
            windowInsetsAnimationController.finish(z);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C00521(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, null, this.$endVelocity, this.$animationController, this.$targetShown, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00521) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C6008 c6008 = C6008.f15084;
            if (i != 0) {
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    return c6008;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            float f = this.$current;
            float f2 = this.$flingAmount;
            C1463 c1463 = new C1463(this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown);
            this.label = 1;
            Object objM1568 = AbstractC1176.m1568(AbstractC1176.m1571(f, f2, 28), new C1188(new C1179(null), AbstractC1176.f1468, Float.valueOf(f), new C1193(f2)), Long.MIN_VALUE, new C1219(c1463, 0), this);
            if (objM1568 != coroutineSingletons) {
                objM1568 = c6008;
            }
            return objM1568 == coroutineSingletons ? coroutineSingletons : c6008;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$2(AbstractWindowInsetsAnimationControlListenerC1465 abstractWindowInsetsAnimationControlListenerC1465, int i, float f, AbstractC1458 abstractC1458, int i2, int i3, Ref$FloatRef ref$FloatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, InterfaceC5189<? super WindowInsetsNestedScrollConnection$fling$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$current = i;
        this.$flingAmount = f;
        this.$spec = abstractC1458;
        this.$hidden = i2;
        this.$shown = i3;
        this.$endVelocity = ref$FloatRef;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(null, this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown, interfaceC5189);
        windowInsetsNestedScrollConnection$fling$2.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC6231.m11036((InterfaceC6233) this.L$0, null, null, new C00521(this.$current, this.$flingAmount, null, this.$hidden, this.$shown, null, this.$endVelocity, this.$animationController, this.$targetShown, null), 3);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        throw null;
    }
}
