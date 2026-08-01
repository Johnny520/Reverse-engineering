package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0053;
import androidx.compose.animation.core.InterfaceC0334;
import androidx.compose.animation.core.InterfaceC0349;
import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6551;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1425, 1443, 1467}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;", "anchors", "latestTarget", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class AnchoredDraggableKt$animateToWithDecay$2 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC0334 $decayAnimationSpec;
    final /* synthetic */ Ref$FloatRef $remainingVelocity;
    final /* synthetic */ InterfaceC0349 $snapAnimationSpec;
    final /* synthetic */ AbstractC0537 $this_animateToWithDecay;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateToWithDecay$2(AbstractC0537 abstractC0537, float f, InterfaceC0349 interfaceC0349, Ref$FloatRef ref$FloatRef, InterfaceC0334 interfaceC0334, InterfaceC4356<? super AnchoredDraggableKt$animateToWithDecay$2> interfaceC4356) {
        super(4, interfaceC4356);
        this.$velocity = f;
        this.$snapAnimationSpec = interfaceC0349;
        this.$remainingVelocity = ref$FloatRef;
        this.$decayAnimationSpec = interfaceC0334;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.C5175 invokeSuspend$lambda$2(float r3, kotlin.jvm.internal.Ref$FloatRef r4, androidx.compose.foundation.gestures.InterfaceC0523 r5, kotlin.jvm.internal.Ref$FloatRef r6, androidx.compose.animation.core.C0345 r7) {
        /*
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r0 = r7.f1183
            r1 = r0
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r1 = (androidx.compose.runtime.AbstractC1347) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L19
            float r1 = r4.element
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L30
        L19:
            r1 = r0
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r1 = (androidx.compose.runtime.AbstractC1347) r1
            java.lang.Object r2 = r1.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L81
            float r2 = r4.element
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L81
        L30:
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r0 = (androidx.compose.runtime.AbstractC1347) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r1 = 0
            int r2 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r2 != 0) goto L43
            r3 = r1
            goto L52
        L43:
            int r2 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r2 <= 0) goto L4c
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L51
            goto L52
        L4c:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L51
            goto L52
        L51:
            r3 = r0
        L52:
            java.lang.Object r0 = r7.m1044()
            java.lang.Number r0 = (java.lang.Number) r0
            r0.floatValue()
            r5.m1305()
            java.lang.Object r5 = r7.m1044()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L6f
            goto L79
        L6f:
            java.lang.Object r5 = r7.m1044()
            java.lang.Number r5 = (java.lang.Number) r5
            float r1 = r5.floatValue()
        L79:
            r6.element = r1
            r4.element = r3
            r7.m1045()
            goto Lae
        L81:
            java.lang.Object r3 = r1.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            r3.floatValue()
            java.lang.Object r3 = r7.m1044()
            java.lang.Number r3 = (java.lang.Number) r3
            r3.floatValue()
            r5.m1305()
            java.lang.Object r3 = r7.m1044()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r6.element = r3
            java.lang.Object r3 = r1.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r4.element = r3
        Lae:
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5175.f14739
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2.invokeSuspend$lambda$2(float, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.foundation.gestures.飘花落叶言子楪世苏哲兰, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.animation.core.飘花落叶言子楪苏世兰哲):kotlin.飘花落叶言子楪兰苏哲世");
    }

    public final Object invoke(InterfaceC0523 interfaceC0523, InterfaceC0461 interfaceC0461, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(null, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, interfaceC4356);
        anchoredDraggableKt$animateToWithDecay$2.L$0 = interfaceC0523;
        anchoredDraggableKt$animateToWithDecay$2.L$1 = interfaceC0461;
        anchoredDraggableKt$animateToWithDecay$2.L$2 = obj;
        return anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (this.L$0 == null) {
                throw AbstractC0053.m158(this.L$1);
            }
            C2941.m6336();
            return null;
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            this.$remainingVelocity.element = 0.0f;
        } else if (i == 2) {
            AbstractC5184.m10206(obj);
        } else {
            if (i != 3) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            this.$remainingVelocity.element = 0.0f;
        }
        return C5175.f14739;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj != null) {
            C2941.m6336();
            return null;
        }
        if (obj2 == null) {
            return invoke((InterfaceC0523) null, (InterfaceC0461) null, obj3, (InterfaceC4356<? super C5175>) obj4);
        }
        C2941.m6336();
        return null;
    }
}
