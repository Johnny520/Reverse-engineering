package kotlinx.coroutines.flow;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {175, 177, 179, 180, 182}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;I)V"}, k = 3, mv = {2, 2, 0})
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements InterfaceC6551 {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5265 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(C5265 c5265, InterfaceC4357<? super StartedWhileSubscribed$command$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.this$0 = c5265;
    }

    public final Object invoke(InterfaceC5318 interfaceC5318, int i, InterfaceC4357<? super C5176> interfaceC4357) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, interfaceC4357);
        startedWhileSubscribed$command$1.L$0 = interfaceC5318;
        startedWhileSubscribed$command$1.I$0 = i;
        return startedWhileSubscribed$command$1.invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0.emit(r11, r10) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r0.emit(r11, r10) != r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r0 = (kotlinx.coroutines.flow.InterfaceC5318) r0
            int r1 = r10.I$0
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r10.label
            r4 = 0
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r3 == 0) goto L33
            if (r3 == r9) goto L2f
            if (r3 == r8) goto L2b
            if (r3 == r7) goto L27
            if (r3 == r6) goto L23
            if (r3 != r5) goto L1d
            goto L2f
        L1d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r10)
            return r4
        L23:
            kotlin.AbstractC5185.m10210(r11)
            goto L86
        L27:
            kotlin.AbstractC5185.m10210(r11)
            goto L6f
        L2b:
            kotlin.AbstractC5185.m10210(r11)
            goto L5b
        L2f:
            kotlin.AbstractC5185.m10210(r11)
            goto L95
        L33:
            kotlin.AbstractC5185.m10210(r11)
            if (r1 <= 0) goto L47
            kotlinx.coroutines.flow.SharingCommand r11 = kotlinx.coroutines.flow.SharingCommand.START
            r10.L$0 = r4
            r10.I$0 = r1
            r10.label = r9
            java.lang.Object r10 = r0.emit(r11, r10)
            if (r10 != r2) goto L95
            goto L94
        L47:
            kotlinx.coroutines.flow.飘花落叶言子兰世楪苏哲 r11 = r10.this$0
            r11.getClass()
            r10.L$0 = r0
            r10.I$0 = r1
            r10.label = r8
            r8 = 0
            java.lang.Object r11 = kotlinx.coroutines.AbstractC5399.m10499(r8, r10)
            if (r11 != r2) goto L5b
            goto L94
        L5b:
            kotlinx.coroutines.flow.飘花落叶言子兰世楪苏哲 r11 = r10.this$0
            r11.getClass()
            kotlinx.coroutines.flow.SharingCommand r11 = kotlinx.coroutines.flow.SharingCommand.STOP
            r10.L$0 = r0
            r10.I$0 = r1
            r10.label = r7
            java.lang.Object r11 = r0.emit(r11, r10)
            if (r11 != r2) goto L6f
            goto L94
        L6f:
            kotlinx.coroutines.flow.飘花落叶言子兰世楪苏哲 r11 = r10.this$0
            r11.getClass()
            r10.L$0 = r0
            r10.I$0 = r1
            r10.label = r6
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r11 = kotlinx.coroutines.AbstractC5399.m10499(r6, r10)
            if (r11 != r2) goto L86
            goto L94
        L86:
            kotlinx.coroutines.flow.SharingCommand r11 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
            r10.L$0 = r4
            r10.I$0 = r1
            r10.label = r5
            java.lang.Object r10 = r0.emit(r11, r10)
            if (r10 != r2) goto L95
        L94:
            return r2
        L95:
            kotlin.飘花落叶言子楪兰苏哲世 r10 = kotlin.C5176.f14739
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC5318) obj, ((Number) obj2).intValue(), (InterfaceC4357<? super C5176>) obj3);
    }
}
