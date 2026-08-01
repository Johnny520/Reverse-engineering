package androidx.compose.foundation.gestures;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p205.C7901;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {864, 867, 870}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;", "velocity", "<anonymous>", "(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;)L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;"}, k = 3, mv = {2, 1, 0})
final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements InterfaceC6553 {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ C0502 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(C0502 c0502, InterfaceC4356<? super ScrollingLogic$onScrollStopped$performFling$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0502;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, interfaceC4356);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = ((C7901) obj).f21874;
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1199invokesFctU(((C7901) obj).f21874, (InterfaceC4356) obj2);
    }

    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m1199invokesFctU(long j, InterfaceC4356<? super C7901> interfaceC4356) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(new C7901(j), interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r0 != r6) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L22
            if (r0 != r1) goto L1b
            long r0 = r13.J$1
            long r2 = r13.J$0
            kotlin.AbstractC5184.m10206(r14)
            r7 = r2
            r3 = r0
            r0 = r14
            goto L7d
        L1b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r0)
            r0 = 0
            return r0
        L22:
            long r2 = r13.J$1
            long r7 = r13.J$0
            kotlin.AbstractC5184.m10206(r14)
            r0 = r14
            goto L61
        L2b:
            long r3 = r13.J$0
            kotlin.AbstractC5184.m10206(r14)
            r0 = r14
            goto L47
        L32:
            kotlin.AbstractC5184.m10206(r14)
            long r7 = r13.J$0
            androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏 r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏兰哲 r0 = r0.f1486
            r13.J$0 = r7
            r13.label = r3
            java.lang.Object r0 = r0.m2983(r7, r13)
            if (r0 != r6) goto L46
            goto L7c
        L46:
            r3 = r7
        L47:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r0 = (p205.C7901) r0
            long r7 = r0.f21874
            long r7 = p205.C7901.m13321(r3, r7)
            androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏 r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.m1257(r7, r13)
            if (r0 != r6) goto L5e
            goto L7c
        L5e:
            r11 = r7
            r7 = r3
            r2 = r11
        L61:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r0 = (p205.C7901) r0
            long r9 = r0.f21874
            androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏 r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏兰哲 r0 = r0.f1486
            long r2 = p205.C7901.m13321(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r5 = r13
            r1 = r2
            r3 = r9
            java.lang.Object r0 = r0.m2985(r1, r3, r5)
            if (r0 != r6) goto L7d
        L7c:
            return r6
        L7d:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r0 = (p205.C7901) r0
            long r0 = r0.f21874
            long r0 = p205.C7901.m13321(r3, r0)
            long r0 = p205.C7901.m13321(r7, r0)
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r2 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
