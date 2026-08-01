package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0076;
import androidx.compose.animation.core.C0350;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p107.C7311;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollingLogic.kt", l = {228, 241, 261}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Ref$ObjectRef<C0350> $animationState;
    final /* synthetic */ float $speed;
    final /* synthetic */ Ref$ObjectRef<C0559> $targetScrollDelta;
    final /* synthetic */ Ref$FloatRef $targetValue;
    final /* synthetic */ C0502 $this_dispatchMouseWheelScroll;
    final /* synthetic */ float $threshold;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C0554 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(Ref$FloatRef ref$FloatRef, Ref$ObjectRef<C0350> ref$ObjectRef, Ref$ObjectRef<C0559> ref$ObjectRef2, float f, C0554 c0554, float f2, C0502 c0502, InterfaceC4356<? super MouseWheelScrollingLogic$dispatchMouseWheelScroll$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.$targetValue = ref$FloatRef;
        this.$animationState = ref$ObjectRef;
        this.$targetScrollDelta = ref$ObjectRef2;
        this.$threshold = f;
        this.this$0 = c0554;
        this.$speed = f2;
        this.$this_dispatchMouseWheelScroll = c0502;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏哲楪兰世] */
    public static final boolean invokeSuspend$lambda$0(C0554 c0554, Ref$ObjectRef ref$ObjectRef, Ref$FloatRef ref$FloatRef, C0502 c0502, Ref$BooleanRef ref$BooleanRef, float f) {
        C0559 c0559M1337 = C0554.m1337(c0554.f1594);
        if (c0559M1337 != null) {
            C0076 c0076 = c0554.f1600;
            long j = c0559M1337.f1608;
            long j2 = c0559M1337.f1609;
            ((C7311) c0076.f227).m12481(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((C7311) c0076.f228).m12481(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            ?? M1342 = ((C0559) ref$ObjectRef.element).m1342(c0559M1337);
            ref$ObjectRef.element = M1342;
            ref$FloatRef.element = c0502.m1260(c0502.m1253(M1342.f1609));
            ref$BooleanRef.element = !AbstractC0521.m1287(r9 - f);
        }
        return c0559M1337 != null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, interfaceC4356);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) create(interfaceC0557, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        r0 = java.lang.Math.signum(r0) * r7.$threshold;
        r7.this$0.m1339(r6, r0);
        r2 = r7.$animationState;
        r3 = r2.element;
        r2.element = androidx.compose.animation.core.AbstractC0330.m1017(r3, ((java.lang.Number) ((androidx.compose.runtime.AbstractC1347) r3.f1199).getValue()).floatValue() + r0, 0.0f, 30);
        r0 = p053.AbstractC6560.m12006(java.lang.Math.abs(r7.$targetValue.element - ((java.lang.Number) ((androidx.compose.runtime.AbstractC1347) r7.$animationState.element.f1199).getValue()).floatValue()) / r7.$speed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ec, code lost:
    
        if (r0 <= 100) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ee, code lost:
    
        r0 = 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ef, code lost:
    
        r14 = r7.this$0;
        r2 = r7.$animationState.element;
        r3 = r7.$targetValue;
        r4 = r3.element;
        r18 = r1;
        r13 = new androidx.compose.foundation.gestures.C0555(r14, r7.$targetScrollDelta, r3, r7.$this_dispatchMouseWheelScroll, r18);
        r13 = r18;
        r7.L$0 = r6;
        r7.L$1 = r13;
        r7.L$2 = null;
        r7.I$0 = r0;
        r7.label = r11;
        r14.getClass();
        r3 = new kotlin.jvm.internal.Ref$FloatRef();
        r3.element = ((java.lang.Number) ((androidx.compose.runtime.AbstractC1347) r2.f1199).getValue()).floatValue();
        r15 = r0;
        r0 = androidx.compose.animation.core.AbstractC0330.m1027(r2, new java.lang.Float(r4), androidx.compose.animation.core.AbstractC0330.m1012(r0, r11, androidx.compose.animation.core.AbstractC0336.f1141), true, new androidx.compose.foundation.gestures.C0533(r3, r14, r6, r13), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014b, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x014e, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0150, code lost:
    
        if (r0 != r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0154, code lost:
    
        r14 = r6;
        r0 = r15;
     */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x017d -> B:36:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x018b -> B:13:0x0063). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
