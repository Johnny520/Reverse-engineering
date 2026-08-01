package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0345;
import androidx.compose.animation.core.C0350;
import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.runtime.AbstractC1347;
import com.alibaba.fastjson2.C2941;
import com.android.dx.io.Opcodes;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$4", f = "TransformableState.kt", l = {Opcodes.INVOKE_CUSTOM}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;)V"}, k = 3, mv = {2, 1, 0})
final class TransformableStateKt$animateZoomBy$4 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0349 $animationSpec;
    final /* synthetic */ long $centroid;
    final /* synthetic */ Ref$FloatRef $previous;
    final /* synthetic */ float $zoomFactor;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateZoomBy$4(Ref$FloatRef ref$FloatRef, float f, InterfaceC0349 interfaceC0349, long j, InterfaceC4356<? super TransformableStateKt$animateZoomBy$4> interfaceC4356) {
        super(2, interfaceC4356);
        this.$previous = ref$FloatRef;
        this.$zoomFactor = f;
        this.$animationSpec = interfaceC0349;
        this.$centroid = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(Ref$FloatRef ref$FloatRef, InterfaceC0493 interfaceC0493, long j, C0345 c0345) {
        if (ref$FloatRef.element != 0.0f) {
            ((Number) ((AbstractC1347) c0345.f1183).getValue()).floatValue();
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        TransformableStateKt$animateZoomBy$4 transformableStateKt$animateZoomBy$4 = new TransformableStateKt$animateZoomBy$4(this.$previous, this.$zoomFactor, this.$animationSpec, this.$centroid, interfaceC4356);
        transformableStateKt$animateZoomBy$4.L$0 = obj;
        return transformableStateKt$animateZoomBy$4;
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
        int i2 = 1;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (this.L$0 != null) {
                C2941.m6336();
                return null;
            }
            C0350 c0350M1010 = AbstractC0330.m1010(this.$previous.element, 0.0f, 30);
            Float f = new Float(this.$zoomFactor);
            InterfaceC0349 interfaceC0349 = this.$animationSpec;
            C0486 c0486 = new C0486(this.$previous, this.$centroid, i2);
            this.label = 1;
            if (AbstractC0330.m1024(c0350M1010, f, interfaceC0349, false, c0486, this, 4) == coroutineSingletons) {
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
        return ((TransformableStateKt$animateZoomBy$4) create(interfaceC0493, interfaceC4356)).invokeSuspend(C5175.f14739);
    }
}
