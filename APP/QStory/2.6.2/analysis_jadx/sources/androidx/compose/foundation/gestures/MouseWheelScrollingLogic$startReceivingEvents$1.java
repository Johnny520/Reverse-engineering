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
@InterfaceC6861(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingEvents$1", f = "MouseWheelScrollingLogic.kt", l = {109, 112}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class MouseWheelScrollingLogic$startReceivingEvents$1 extends SuspendLambda implements InterfaceC6553 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0554 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$startReceivingEvents$1(C0554 c0554, InterfaceC4356<? super MouseWheelScrollingLogic$startReceivingEvents$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        MouseWheelScrollingLogic$startReceivingEvents$1 mouseWheelScrollingLogic$startReceivingEvents$1 = new MouseWheelScrollingLogic$startReceivingEvents$1(this.this$0, interfaceC4356);
        mouseWheelScrollingLogic$startReceivingEvents$1.L$0 = obj;
        return mouseWheelScrollingLogic$startReceivingEvents$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MouseWheelScrollingLogic$startReceivingEvents$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (androidx.compose.foundation.gestures.C0554.m1336(r5, r6, r7, r8, r9, r10) != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x007c, blocks: (B:18:0x0031, B:21:0x003d, B:26:0x0050), top: B:45:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0077 -> B:45:0x0031). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1c
            java.lang.Object r1 = r12.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = (kotlinx.coroutines.InterfaceC5400) r1
            kotlin.AbstractC5184.m10206(r13)     // Catch: java.lang.Throwable -> L17
            r10 = r12
        L15:
            r13 = r1
            goto L77
        L17:
            r0 = move-exception
            r13 = r0
            r10 = r12
            goto L89
        L1c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r12)
            return r2
        L22:
            java.lang.Object r1 = r12.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = (kotlinx.coroutines.InterfaceC5400) r1
            kotlin.AbstractC5184.m10206(r13)     // Catch: java.lang.Throwable -> L17
            goto L50
        L2a:
            kotlin.AbstractC5184.m10206(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r13 = (kotlinx.coroutines.InterfaceC5400) r13
        L31:
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = r13.mo2420()     // Catch: java.lang.Throwable -> L7c
            boolean r1 = kotlinx.coroutines.AbstractC5398.m10490(r1)     // Catch: java.lang.Throwable -> L7c
            androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪 r5 = r12.this$0
            if (r1 == 0) goto L84
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r1 = r5.f1594     // Catch: java.lang.Throwable -> L7c
            r12.L$0 = r13     // Catch: java.lang.Throwable -> L7c
            r12.label = r4     // Catch: java.lang.Throwable -> L7c
            r1.getClass()     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r1 = kotlinx.coroutines.channels.C5189.m10218(r1, r12)     // Catch: java.lang.Throwable -> L7f
            if (r1 != r0) goto L4d
            goto L76
        L4d:
            r11 = r1
            r1 = r13
            r13 = r11
        L50:
            r7 = r13
            androidx.compose.foundation.gestures.飘花落叶言子苏哲楪兰世 r7 = (androidx.compose.foundation.gestures.C0559) r7     // Catch: java.lang.Throwable -> L7c
            androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪 r13 = r12.this$0     // Catch: java.lang.Throwable -> L7c
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪世哲苏兰 r13 = r13.f1602     // Catch: java.lang.Throwable -> L7c
            r5 = 1086324736(0x40c00000, float:6.0)
            float r8 = r13.mo1334(r5)     // Catch: java.lang.Throwable -> L7c
            androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪 r13 = r12.this$0     // Catch: java.lang.Throwable -> L7c
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪世哲苏兰 r13 = r13.f1602     // Catch: java.lang.Throwable -> L7c
            r5 = 1065353216(0x3f800000, float:1.0)
            float r9 = r13.mo1334(r5)     // Catch: java.lang.Throwable -> L7c
            androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪 r5 = r12.this$0     // Catch: java.lang.Throwable -> L7c
            androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏 r6 = r5.f1604     // Catch: java.lang.Throwable -> L7c
            r12.L$0 = r1     // Catch: java.lang.Throwable -> L7c
            r12.label = r3     // Catch: java.lang.Throwable -> L7c
            r10 = r12
            java.lang.Object r12 = androidx.compose.foundation.gestures.C0554.m1336(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L79
            if (r12 != r0) goto L15
        L76:
            return r0
        L77:
            r12 = r10
            goto L31
        L79:
            r0 = move-exception
        L7a:
            r13 = r0
            goto L89
        L7c:
            r0 = move-exception
            r10 = r12
            goto L7a
        L7f:
            r0 = move-exception
            r10 = r12
            r12 = r0
            r13 = r12
            goto L89
        L84:
            r5.f1593 = r2
            kotlin.飘花落叶言子楪兰苏哲世 r12 = kotlin.C5175.f14739
            return r12
        L89:
            androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪 r12 = r10.this$0
            r12.f1593 = r2
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
