package androidx.compose.material3;

import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.InterfaceC1195;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", m556f = "SnackbarHost.kt", m557l = {409}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class SnackbarHostKt$animatedOpacity$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1177 $alpha;
    final /* synthetic */ InterfaceC1195 $animation;
    final /* synthetic */ InterfaceC7372 $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedOpacity$2$1(C1177 c1177, boolean z, InterfaceC1195 interfaceC1195, InterfaceC7372 interfaceC7372, InterfaceC5189<? super SnackbarHostKt$animatedOpacity$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$alpha = c1177;
        this.$visible = z;
        this.$animation = interfaceC1195;
        this.$onAnimationFinish = interfaceC7372;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new SnackbarHostKt$animatedOpacity$2$1(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SnackbarHostKt$animatedOpacity$2$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SnackbarHostKt$animatedOpacity$2$1 snackbarHostKt$animatedOpacity$2$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1177 c1177 = this.$alpha;
            Float f = new Float(this.$visible ? 1.0f : 0.0f);
            InterfaceC1195 interfaceC1195 = this.$animation;
            this.label = 1;
            snackbarHostKt$animatedOpacity$2$1 = this;
            if (C1177.m1589(c1177, f, interfaceC1195, null, null, snackbarHostKt$animatedOpacity$2$1, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            snackbarHostKt$animatedOpacity$2$1 = this;
        }
        snackbarHostKt$animatedOpacity$2$1.$onAnimationFinish.invoke();
        return C6008.f15084;
    }
}
