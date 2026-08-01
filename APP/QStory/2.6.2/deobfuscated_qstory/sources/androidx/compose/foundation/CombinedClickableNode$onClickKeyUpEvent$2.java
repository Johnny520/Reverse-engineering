package androidx.compose.foundation;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", l = {1628, 1632}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class CombinedClickableNode$onClickKeyUpEvent$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $keyCode;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ C1027 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$onClickKeyUpEvent$2(C1027 c1027, long j, InterfaceC4356<? super CombinedClickableNode$onClickKeyUpEvent$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c1027;
        this.$keyCode = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(this.this$0, this.$keyCode, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10495(r3 - r5, r9) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            kotlin.AbstractC5184.m10206(r10)
            goto L5a
        L10:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r9)
            r9 = 0
            return r9
        L17:
            long r3 = r9.J$1
            long r5 = r9.J$0
            kotlin.AbstractC5184.m10206(r10)
            goto L44
        L1f:
            kotlin.AbstractC5184.m10206(r10)
            androidx.compose.foundation.飘花落叶言子世楪兰哲苏 r10 = r9.this$0
            androidx.compose.runtime.飘花落叶言子哲兰世苏楪 r1 = androidx.compose.ui.platform.AbstractC1902.f5575
            java.lang.Object r10 = androidx.compose.ui.node.AbstractC1785.m3346(r10, r1)
            androidx.compose.ui.platform.飘花落叶言子哲兰苏世楪 r10 = (androidx.compose.ui.platform.InterfaceC1863) r10
            r10.getClass()
            long r4 = r10.mo3271()
            r6 = 40
            r9.J$0 = r6
            r9.J$1 = r4
            r9.label = r3
            java.lang.Object r10 = kotlinx.coroutines.AbstractC5398.m10495(r6, r9)
            if (r10 != r0) goto L42
            goto L59
        L42:
            r3 = r4
            r5 = r6
        L44:
            androidx.compose.foundation.飘花落叶言子世楪兰哲苏 r10 = r9.this$0
            androidx.collection.飘花落叶言子世苏哲楪兰 r10 = r10.f3006
            long r7 = r9.$keyCode
            java.lang.Object r10 = r10.m813(r7)
            androidx.compose.foundation.飘花落叶言子世楪哲兰苏 r10 = (androidx.compose.foundation.AbstractC1029) r10
            long r3 = r3 - r5
            r9.label = r2
            java.lang.Object r10 = kotlinx.coroutines.AbstractC5398.m10495(r3, r9)
            if (r10 != r0) goto L5a
        L59:
            return r0
        L5a:
            androidx.compose.foundation.飘花落叶言子世楪兰哲苏 r9 = r9.this$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r9 = r9.f3120
            r9.invoke()
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5175.f14739
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
