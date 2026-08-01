package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0345;
import androidx.compose.animation.core.C0350;
import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.runtime.AbstractC1347;
import com.alibaba.fastjson2.C2942;
import com.android.dx.io.Opcodes;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$4", f = "TransformableState.kt", l = {Opcodes.INVOKE_CUSTOM}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;)V"}, k = 3, mv = {2, 1, 0})
final class TransformableStateKt$animateZoomBy$4 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0349 $animationSpec;
    final /* synthetic */ long $centroid;
    final /* synthetic */ Ref$FloatRef $previous;
    final /* synthetic */ float $zoomFactor;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateZoomBy$4(Ref$FloatRef ref$FloatRef, float f, InterfaceC0349 interfaceC0349, long j, InterfaceC4357<? super TransformableStateKt$animateZoomBy$4> interfaceC4357) {
        super(2, interfaceC4357);
        this.$previous = ref$FloatRef;
        this.$zoomFactor = f;
        this.$animationSpec = interfaceC0349;
        this.$centroid = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(Ref$FloatRef ref$FloatRef, InterfaceC0493 interfaceC0493, long j, C0345 c0345) {
        if (ref$FloatRef.element != 0.0f) {
            ((Number) ((AbstractC1347) c0345.f1183).getValue()).floatValue();
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TransformableStateKt$animateZoomBy$4 transformableStateKt$animateZoomBy$4 = new TransformableStateKt$animateZoomBy$4(this.$previous, this.$zoomFactor, this.$animationSpec, this.$centroid, interfaceC4357);
        transformableStateKt$animateZoomBy$4.L$0 = obj;
        return transformableStateKt$animateZoomBy$4;
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
        int i2 = 1;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            if (this.L$0 != null) {
                C2942.m6394();
                return null;
            }
            C0350 c0350M1011 = AbstractC0330.m1011(this.$previous.element, 0.0f, 30);
            Float f = new Float(this.$zoomFactor);
            InterfaceC0349 interfaceC0349 = this.$animationSpec;
            C0486 c0486 = new C0486(this.$previous, this.$centroid, i2);
            this.label = 1;
            if (AbstractC0330.m1025(c0350M1011, f, interfaceC0349, false, c0486, this, 4) == coroutineSingletons) {
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
        return ((TransformableStateKt$animateZoomBy$4) create(interfaceC0493, interfaceC4357)).invokeSuspend(C5176.f14739);
    }
}
