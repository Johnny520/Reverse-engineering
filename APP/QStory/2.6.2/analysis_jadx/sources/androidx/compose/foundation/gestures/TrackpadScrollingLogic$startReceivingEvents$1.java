package androidx.compose.foundation.gestures;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$startReceivingEvents$1", f = "TrackpadScrollingLogic.kt", l = {99, 99}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TrackpadScrollingLogic$startReceivingEvents$1 extends SuspendLambda implements InterfaceC6553 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C0504 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackpadScrollingLogic$startReceivingEvents$1(C0504 c0504, InterfaceC4356<? super TrackpadScrollingLogic$startReceivingEvents$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0504;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        TrackpadScrollingLogic$startReceivingEvents$1 trackpadScrollingLogic$startReceivingEvents$1 = new TrackpadScrollingLogic$startReceivingEvents$1(this.this$0, interfaceC4356);
        trackpadScrollingLogic$startReceivingEvents$1.L$0 = obj;
        return trackpadScrollingLogic$startReceivingEvents$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TrackpadScrollingLogic$startReceivingEvents$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006b -> B:17:0x0035). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L18
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = (kotlinx.coroutines.InterfaceC5400) r1
            kotlin.AbstractC5184.m10206(r9)     // Catch: java.lang.Throwable -> L16
            r9 = r1
            goto L35
        L16:
            r9 = move-exception
            goto L72
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r4
        L1e:
            java.lang.Object r1 = r8.L$2
            androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏 r1 = (androidx.compose.foundation.gestures.C0502) r1
            java.lang.Object r5 = r8.L$1
            androidx.compose.foundation.gestures.飘花落叶言子哲兰苏世楪 r5 = (androidx.compose.foundation.gestures.C0504) r5
            java.lang.Object r6 = r8.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r6 = (kotlinx.coroutines.InterfaceC5400) r6
            kotlin.AbstractC5184.m10206(r9)     // Catch: java.lang.Throwable -> L16
            goto L5a
        L2e:
            kotlin.AbstractC5184.m10206(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r9 = (kotlinx.coroutines.InterfaceC5400) r9
        L35:
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = r9.mo2420()     // Catch: java.lang.Throwable -> L16
            boolean r1 = kotlinx.coroutines.AbstractC5398.m10490(r1)     // Catch: java.lang.Throwable -> L16
            androidx.compose.foundation.gestures.飘花落叶言子哲兰苏世楪 r5 = r8.this$0
            if (r1 == 0) goto L6d
            androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏 r1 = r5.f1604     // Catch: java.lang.Throwable -> L16
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r6 = r5.f1500     // Catch: java.lang.Throwable -> L16
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L16
            r8.L$1 = r5     // Catch: java.lang.Throwable -> L16
            r8.L$2 = r1     // Catch: java.lang.Throwable -> L16
            r8.label = r3     // Catch: java.lang.Throwable -> L16
            r6.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r6 = kotlinx.coroutines.channels.C5189.m10218(r6, r8)     // Catch: java.lang.Throwable -> L16
            if (r6 != r0) goto L57
            goto L6a
        L57:
            r7 = r6
            r6 = r9
            r9 = r7
        L5a:
            androidx.compose.foundation.gestures.飘花落叶言子哲兰苏楪世 r9 = (androidx.compose.foundation.gestures.C0505) r9     // Catch: java.lang.Throwable -> L16
            r8.L$0 = r6     // Catch: java.lang.Throwable -> L16
            r8.L$1 = r4     // Catch: java.lang.Throwable -> L16
            r8.L$2 = r4     // Catch: java.lang.Throwable -> L16
            r8.label = r2     // Catch: java.lang.Throwable -> L16
            java.lang.Object r9 = androidx.compose.foundation.gestures.C0504.m1273(r5, r1, r9, r8)     // Catch: java.lang.Throwable -> L16
            if (r9 != r0) goto L6b
        L6a:
            return r0
        L6b:
            r9 = r6
            goto L35
        L6d:
            r5.f1501 = r4
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5175.f14739
            return r8
        L72:
            androidx.compose.foundation.gestures.飘花落叶言子哲兰苏世楪 r8 = r8.this$0
            r8.f1501 = r4
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TrackpadScrollingLogic$startReceivingEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
