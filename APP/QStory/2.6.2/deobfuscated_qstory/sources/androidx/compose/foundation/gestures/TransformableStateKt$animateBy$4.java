package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0345;
import androidx.compose.animation.core.C0350;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1395;
import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$4", f = "TransformableState.kt", l = {413}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;)V"}, k = 3, mv = {2, 1, 0})
final class TransformableStateKt$animateBy$4 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC0475 $animationSpec;
    final /* synthetic */ long $centroid;
    final /* synthetic */ Ref$ObjectRef<C0536> $previousState;
    final /* synthetic */ C0536 $targetState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateBy$4(Ref$ObjectRef<C0536> ref$ObjectRef, C0536 c0536, AbstractC0475 abstractC0475, long j, InterfaceC4356<? super TransformableStateKt$animateBy$4> interfaceC4356) {
        super(2, interfaceC4356);
        this.$previousState = ref$ObjectRef;
        this.$targetState = c0536;
        this.$centroid = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    public static final C5175 invokeSuspend$lambda$0(Ref$ObjectRef ref$ObjectRef, InterfaceC0493 interfaceC0493, long j, C0345 c0345) {
        if (((C0536) ref$ObjectRef.element).f1561 != 0.0f) {
            float f = ((C0536) ((AbstractC1347) c0345.f1183).getValue()).f1561;
            float f2 = ((C0536) ref$ObjectRef.element).f1561;
        }
        InterfaceC1395 interfaceC1395 = c0345.f1183;
        float f3 = ((C0536) ((AbstractC1347) interfaceC1395).getValue()).f1559;
        float f4 = ((C0536) ref$ObjectRef.element).f1559;
        AbstractC1347 abstractC1347 = (AbstractC1347) interfaceC1395;
        C7328.m12499(((C0536) abstractC1347.getValue()).f1560, ((C0536) ref$ObjectRef.element).f1560);
        interfaceC0493.m1243();
        ref$ObjectRef.element = abstractC1347.getValue();
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        TransformableStateKt$animateBy$4 transformableStateKt$animateBy$4 = new TransformableStateKt$animateBy$4(this.$previousState, this.$targetState, null, this.$centroid, interfaceC4356);
        transformableStateKt$animateBy$4.L$0 = obj;
        return transformableStateKt$animateBy$4;
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (obj == null) {
            return invoke((InterfaceC0493) null, (InterfaceC4356<? super C5175>) obj2);
        }
        C2941.m6336();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (this.L$0 != null) {
                C2941.m6336();
                return null;
            }
            C0350 c0350M1009 = AbstractC0330.m1009(C0540.f1565, this.$previousState.element, AbstractC0521.f1531);
            C0536 c0536 = this.$targetState;
            C0491 c0491 = new C0491(this.$previousState, this.$centroid, 0);
            this.label = 1;
            if (AbstractC0330.m1024(c0350M1009, c0536, null, false, c0491, this, 4) == coroutineSingletons) {
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

    public final Object invoke(InterfaceC0493 interfaceC0493, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TransformableStateKt$animateBy$4) create(interfaceC0493, interfaceC4356)).invokeSuspend(C5175.f14739);
    }
}
