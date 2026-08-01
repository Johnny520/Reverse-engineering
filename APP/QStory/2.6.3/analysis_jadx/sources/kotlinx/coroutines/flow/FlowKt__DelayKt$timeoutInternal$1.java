package kotlinx.coroutines.flow;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {413}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "downStream", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, k = 3, mv = {2, 2, 0})
final class FlowKt__DelayKt$timeoutInternal$1 extends SuspendLambda implements InterfaceC6551 {

    /* JADX INFO: renamed from: $$v$c$kotlin-time-Duration$-timeout$0, reason: not valid java name */
    final /* synthetic */ long f14799$$v$c$kotlintimeDuration$timeout$0;
    final /* synthetic */ InterfaceC5319 $this_timeoutInternal;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1(long j, InterfaceC5319 interfaceC5319, InterfaceC4357<? super FlowKt__DelayKt$timeoutInternal$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.f14799$$v$c$kotlintimeDuration$timeout$0 = j;
        this.$this_timeoutInternal = interfaceC5319;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC5318 interfaceC5318, InterfaceC4357<? super C5176> interfaceC4357) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.f14799$$v$c$kotlintimeDuration$timeout$0, this.$this_timeoutInternal, interfaceC4357);
        flowKt__DelayKt$timeoutInternal$1.L$0 = interfaceC5401;
        flowKt__DelayKt$timeoutInternal$1.L$1 = interfaceC5318;
        return flowKt__DelayKt$timeoutInternal$1.invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008d -> B:20:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5401) r0
            java.lang.Object r1 = r12.L$1
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r1 = (kotlinx.coroutines.flow.InterfaceC5318) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r12.label
            r4 = 1
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L29
            if (r3 != r4) goto L23
            int r0 = r12.I$0
            long r7 = r12.J$0
            java.lang.Object r3 = r12.L$3
            kotlinx.coroutines.selects.飘花落叶言子楪世兰苏哲 r3 = (kotlinx.coroutines.selects.C5369) r3
            java.lang.Object r3 = r12.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r3 = (kotlinx.coroutines.channels.InterfaceC5199) r3
            kotlin.AbstractC5185.m10210(r13)
            goto L90
        L23:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r12)
            return r6
        L29:
            kotlin.AbstractC5185.m10210(r13)
            long r7 = r12.f14799$$v$c$kotlintimeDuration$timeout$0
            r9 = 0
            int r13 = kotlin.time.C5157.m10190(r7, r9)
            if (r13 <= 0) goto L9b
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r13 = r12.$this_timeoutInternal
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r13 = kotlinx.coroutines.flow.AbstractC5322.m10328(r13)
            boolean r3 = r13 instanceof kotlinx.coroutines.flow.internal.AbstractC5217
            if (r3 == 0) goto L44
            r3 = r13
            kotlinx.coroutines.flow.internal.飘花落叶言子楪世哲兰苏 r3 = (kotlinx.coroutines.flow.internal.AbstractC5217) r3
            goto L45
        L44:
            r3 = r6
        L45:
            if (r3 != 0) goto L4e
            kotlinx.coroutines.flow.internal.飘花落叶言子楪苏世哲兰 r3 = new kotlinx.coroutines.flow.internal.飘花落叶言子楪苏世哲兰
            r7 = 14
            r3.<init>(r13, r5, r6, r7)
        L4e:
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r13 = r3.m10295(r0)
            long r7 = r12.f14799$$v$c$kotlintimeDuration$timeout$0
            r3 = r13
            r0 = r5
        L56:
            kotlinx.coroutines.selects.飘花落叶言子楪世兰苏哲 r13 = new kotlinx.coroutines.selects.飘花落叶言子楪世兰苏哲
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r9 = r12.getContext()
            r13.<init>(r9)
            androidx.compose.animation.core.飘花落叶言子哲楪苏世兰 r9 = r3.mo10250()
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r10 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            r10.<init>(r1, r6)
            r13.m10421(r9, r10)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r9 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r9.<init>(r7, r6)
            long r10 = kotlinx.coroutines.AbstractC5399.m10481(r7)
            kotlinx.coroutines.selects.AbstractC5372.m10426(r13, r10, r9)
            r12.L$0 = r6
            r12.L$1 = r1
            r12.L$2 = r3
            r12.L$3 = r6
            r12.J$0 = r7
            r12.I$0 = r0
            r12.I$1 = r5
            r12.I$2 = r5
            r12.label = r4
            java.lang.Object r13 = r13.m10419(r12)
            if (r13 != r2) goto L90
            return r2
        L90:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L56
            kotlin.飘花落叶言子楪兰苏哲世 r12 = kotlin.C5176.f14739
            return r12
        L9b:
            kotlinx.coroutines.TimeoutCancellationException r12 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r13 = "Timed out immediately"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
