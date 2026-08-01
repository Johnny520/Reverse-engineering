package androidx.compose.foundation.gestures;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p205.C7902;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {864, 867, 870}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;", "velocity", "<anonymous>", "(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;)L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;"}, k = 3, mv = {2, 1, 0})
final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements InterfaceC6554 {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ C0502 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(C0502 c0502, InterfaceC4357<? super ScrollingLogic$onScrollStopped$performFling$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0502;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, interfaceC4357);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = ((C7902) obj).f21871;
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // p052.InterfaceC6554
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1209invokesFctU(((C7902) obj).f21871, (InterfaceC4357) obj2);
    }

    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m1209invokesFctU(long j, InterfaceC4357<? super C7902> interfaceC4357) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(new C7902(j), interfaceC4357)).invokeSuspend(C5176.f14739);
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
            kotlin.AbstractC5185.m10210(r14)
            r7 = r2
            r3 = r0
            r0 = r14
            goto L7d
        L1b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r0)
            r0 = 0
            return r0
        L22:
            long r2 = r13.J$1
            long r7 = r13.J$0
            kotlin.AbstractC5185.m10210(r14)
            r0 = r14
            goto L61
        L2b:
            long r3 = r13.J$0
            kotlin.AbstractC5185.m10210(r14)
            r0 = r14
            goto L47
        L32:
            kotlin.AbstractC5185.m10210(r14)
            long r7 = r13.J$0
            androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏 r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏兰哲 r0 = r0.f1487
            r13.J$0 = r7
            r13.label = r3
            java.lang.Object r0 = r0.m2993(r7, r13)
            if (r0 != r6) goto L46
            goto L7c
        L46:
            r3 = r7
        L47:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r0 = (p205.C7902) r0
            long r7 = r0.f21871
            long r7 = p205.C7902.m13349(r3, r7)
            androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏 r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.m1267(r7, r13)
            if (r0 != r6) goto L5e
            goto L7c
        L5e:
            r11 = r7
            r7 = r3
            r2 = r11
        L61:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r0 = (p205.C7902) r0
            long r9 = r0.f21871
            androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏 r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏兰哲 r0 = r0.f1487
            long r2 = p205.C7902.m13349(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r5 = r13
            r1 = r2
            r3 = r9
            java.lang.Object r0 = r0.m2995(r1, r3, r5)
            if (r0 != r6) goto L7d
        L7c:
            return r6
        L7d:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r0 = (p205.C7902) r0
            long r0 = r0.f21871
            long r0 = p205.C7902.m13349(r3, r0)
            long r0 = p205.C7902.m13349(r7, r0)
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r2 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
