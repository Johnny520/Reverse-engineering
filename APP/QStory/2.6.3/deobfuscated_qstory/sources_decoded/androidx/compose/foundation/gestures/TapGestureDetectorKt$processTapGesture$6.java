package androidx.compose.foundation.gestures;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$6", f = "TapGestureDetector.kt", l = {184, 185}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TapGestureDetectorKt$processTapGesture$6 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5452 $cancelOrReleaseJob;
    final /* synthetic */ C0553 $pressScope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$processTapGesture$6(InterfaceC5452 interfaceC5452, C0553 c0553, InterfaceC4357<? super TapGestureDetectorKt$processTapGesture$6> interfaceC4357) {
        super(2, interfaceC4357);
        this.$cancelOrReleaseJob = interfaceC5452;
        this.$pressScope = c0553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new TapGestureDetectorKt$processTapGesture$6(this.$cancelOrReleaseJob, this.$pressScope, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TapGestureDetectorKt$processTapGesture$6) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r5.m1336(r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            kotlin.AbstractC5185.m10210(r5)
            goto L34
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            r4 = 0
            return r4
        L17:
            kotlin.AbstractC5185.m10210(r5)
            goto L29
        L1b:
            kotlin.AbstractC5185.m10210(r5)
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r5 = r4.$cancelOrReleaseJob
            r4.label = r3
            java.lang.Object r5 = r5.mo10564(r4)
            if (r5 != r0) goto L29
            goto L33
        L29:
            androidx.compose.foundation.gestures.飘花落叶言子苏兰楪哲世 r5 = r4.$pressScope
            r4.label = r2
            java.lang.Object r4 = r5.m1336(r4)
            if (r4 != r0) goto L34
        L33:
            return r0
        L34:
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
