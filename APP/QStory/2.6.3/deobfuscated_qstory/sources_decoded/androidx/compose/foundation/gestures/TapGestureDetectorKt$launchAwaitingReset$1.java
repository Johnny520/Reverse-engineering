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
@InterfaceC6862(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {474, 475}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TapGestureDetectorKt$launchAwaitingReset$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $block;
    final /* synthetic */ InterfaceC5452 $resetJob;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$launchAwaitingReset$1(InterfaceC5452 interfaceC5452, InterfaceC6554 interfaceC6554, InterfaceC4357<? super TapGestureDetectorKt$launchAwaitingReset$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$resetJob = interfaceC5452;
        this.$block = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TapGestureDetectorKt$launchAwaitingReset$1 tapGestureDetectorKt$launchAwaitingReset$1 = new TapGestureDetectorKt$launchAwaitingReset$1(this.$resetJob, this.$block, interfaceC4357);
        tapGestureDetectorKt$launchAwaitingReset$1.L$0 = obj;
        return tapGestureDetectorKt$launchAwaitingReset$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TapGestureDetectorKt$launchAwaitingReset$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r6.invoke(r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.AbstractC5185.m10210(r6)
            goto L41
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r2
        L17:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = (kotlinx.coroutines.InterfaceC5401) r1
            kotlin.AbstractC5185.m10210(r6)
            goto L34
        L1f:
            kotlin.AbstractC5185.m10210(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = (kotlinx.coroutines.InterfaceC5401) r1
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r6 = r5.$resetJob
            r5.L$0 = r1
            r5.label = r4
            java.lang.Object r6 = r6.mo10564(r5)
            if (r6 != r0) goto L34
            goto L40
        L34:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r6 = r5.$block
            r5.L$0 = r2
            r5.label = r3
            java.lang.Object r5 = r6.invoke(r1, r5)
            if (r5 != r0) goto L41
        L40:
            return r0
        L41:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
