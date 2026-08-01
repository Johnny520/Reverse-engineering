package kotlinx.coroutines.flow;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC5196;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", l = {307, 309, 310}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 2, 0})
final class FlowKt__DelayKt$fixedPeriodTicker$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ long $delayMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$fixedPeriodTicker$1(long j, InterfaceC4357<? super FlowKt__DelayKt$fixedPeriodTicker$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$delayMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        FlowKt__DelayKt$fixedPeriodTicker$1 flowKt__DelayKt$fixedPeriodTicker$1 = new FlowKt__DelayKt$fixedPeriodTicker$1(this.$delayMillis, interfaceC4357);
        flowKt__DelayKt$fixedPeriodTicker$1.L$0 = obj;
        return flowKt__DelayKt$fixedPeriodTicker$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((FlowKt__DelayKt$fixedPeriodTicker$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0052 -> B:15:0x0033). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r0 = (kotlinx.coroutines.channels.InterfaceC5196) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L23
            if (r2 == r5) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            goto L1f
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            r8 = 0
            return r8
        L1b:
            kotlin.AbstractC5185.m10210(r9)
            goto L48
        L1f:
            kotlin.AbstractC5185.m10210(r9)
            goto L33
        L23:
            kotlin.AbstractC5185.m10210(r9)
            long r6 = r8.$delayMillis
            r8.L$0 = r0
            r8.label = r5
            java.lang.Object r9 = kotlinx.coroutines.AbstractC5399.m10499(r6, r8)
            if (r9 != r1) goto L33
            goto L54
        L33:
            r9 = r0
            kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世 r9 = (kotlinx.coroutines.channels.C5204) r9
            r9.getClass()
            r8.L$0 = r0
            r8.label = r4
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r9 = r9.f14798
            kotlin.飘花落叶言子楪兰苏哲世 r2 = kotlin.C5176.f14739
            java.lang.Object r9 = r9.mo8433(r2, r8)
            if (r9 != r1) goto L48
            goto L54
        L48:
            long r5 = r8.$delayMillis
            r8.L$0 = r0
            r8.label = r3
            java.lang.Object r9 = kotlinx.coroutines.AbstractC5399.m10499(r5, r8)
            if (r9 != r1) goto L33
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
