package androidx.compose.animation;

import androidx.compose.animation.core.C0364;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1388;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C5284;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {746}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/飘花落叶言子苏哲世楪兰;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/runtime/飘花落叶言子苏哲世楪兰;)V"}, k = 3, mv = {2, 1, 0})
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C0364 $childTransition;
    final /* synthetic */ InterfaceC1333 $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(C0364 c0364, InterfaceC1333 interfaceC1333, InterfaceC4357<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$childTransition = c0364;
        this.$shouldDisposeBlockUpdated$delegate = interfaceC1333;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, interfaceC4357);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.L$0 = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1388 interfaceC1388, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1) create(interfaceC1388, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC1388 interfaceC1388 = (InterfaceC1388) this.L$0;
            final C0364 c0364 = this.$childTransition;
            C5284 c5284M2470 = AbstractC1367.m2470(new InterfaceC6543() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                {
                    super(0);
                }

                @Override // p052.InterfaceC6543
                public final Boolean invoke() {
                    C0364 c03642 = c0364;
                    Object objM1066 = c03642.m1066();
                    EnterExitState enterExitState = EnterExitState.PostExit;
                    return Boolean.valueOf(objM1066 == enterExitState && ((AbstractC1347) c03642.f1241).getValue() == enterExitState);
                }
            });
            C0412 c0412 = new C0412(interfaceC1388, this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, 0);
            this.label = 1;
            if (c5284M2470.mo8453(c0412, this) == coroutineSingletons) {
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
