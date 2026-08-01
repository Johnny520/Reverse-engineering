package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0345;
import androidx.compose.animation.core.C0350;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1395;
import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$4", f = "TransformableState.kt", l = {413}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;)V"}, k = 3, mv = {2, 1, 0})
final class TransformableStateKt$animateBy$4 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC0475 $animationSpec;
    final /* synthetic */ long $centroid;
    final /* synthetic */ Ref$ObjectRef<C0536> $previousState;
    final /* synthetic */ C0536 $targetState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateBy$4(Ref$ObjectRef<C0536> ref$ObjectRef, C0536 c0536, AbstractC0475 abstractC0475, long j, InterfaceC4357<? super TransformableStateKt$animateBy$4> interfaceC4357) {
        super(2, interfaceC4357);
        this.$previousState = ref$ObjectRef;
        this.$targetState = c0536;
        this.$centroid = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    public static final C5176 invokeSuspend$lambda$0(Ref$ObjectRef ref$ObjectRef, InterfaceC0493 interfaceC0493, long j, C0345 c0345) {
        if (((C0536) ref$ObjectRef.element).f1562 != 0.0f) {
            float f = ((C0536) ((AbstractC1347) c0345.f1183).getValue()).f1562;
            float f2 = ((C0536) ref$ObjectRef.element).f1562;
        }
        InterfaceC1395 interfaceC1395 = c0345.f1183;
        float f3 = ((C0536) ((AbstractC1347) interfaceC1395).getValue()).f1560;
        float f4 = ((C0536) ref$ObjectRef.element).f1560;
        AbstractC1347 abstractC1347 = (AbstractC1347) interfaceC1395;
        C7329.m12526(((C0536) abstractC1347.getValue()).f1561, ((C0536) ref$ObjectRef.element).f1561);
        interfaceC0493.m1253();
        ref$ObjectRef.element = abstractC1347.getValue();
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TransformableStateKt$animateBy$4 transformableStateKt$animateBy$4 = new TransformableStateKt$animateBy$4(this.$previousState, this.$targetState, null, this.$centroid, interfaceC4357);
        transformableStateKt$animateBy$4.L$0 = obj;
        return transformableStateKt$animateBy$4;
    }

    @Override // p052.InterfaceC6554
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (obj == null) {
            return invoke((InterfaceC0493) null, (InterfaceC4357<? super C5176>) obj2);
        }
        C2942.m6394();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            if (this.L$0 != null) {
                C2942.m6394();
                return null;
            }
            C0350 c0350M1010 = AbstractC0330.m1010(C0540.f1566, this.$previousState.element, AbstractC0521.f1532);
            C0536 c0536 = this.$targetState;
            C0491 c0491 = new C0491(this.$previousState, this.$centroid, 0);
            this.label = 1;
            if (AbstractC0330.m1025(c0350M1010, c0536, null, false, c0491, this, 4) == coroutineSingletons) {
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

    public final Object invoke(InterfaceC0493 interfaceC0493, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TransformableStateKt$animateBy$4) create(interfaceC0493, interfaceC4357)).invokeSuspend(C5176.f14739);
    }
}
