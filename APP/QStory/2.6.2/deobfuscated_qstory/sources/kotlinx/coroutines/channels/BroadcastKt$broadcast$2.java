package kotlinx.coroutines.channels;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", l = {26, 27}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 2, 0})
final class BroadcastKt$broadcast$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5198 $channel;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastKt$broadcast$2(InterfaceC5198 interfaceC5198, InterfaceC4356<? super BroadcastKt$broadcast$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$channel = interfaceC5198;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        BroadcastKt$broadcast$2 broadcastKt$broadcast$2 = new BroadcastKt$broadcast$2(this.$channel, interfaceC4356);
        broadcastKt$broadcast$2.L$0 = obj;
        return broadcastKt$broadcast$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5195 interfaceC5195, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((BroadcastKt$broadcast$2) create(interfaceC5195, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC5210) r0).f14798.mo8443(r8, r7) == r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[PHI: r2 r8
  0x0043: PHI (r2v1 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r2v12 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r2v13 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:13:0x0040, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r8v3 java.lang.Object) = (r8v9 java.lang.Object), (r8v0 java.lang.Object) binds: [B:13:0x0040, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:7:0x0018). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r0 = (kotlinx.coroutines.channels.InterfaceC5195) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r7.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L28
            if (r2 == r5) goto L20
            if (r2 != r4) goto L1a
            java.lang.Object r2 = r7.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r2 = (kotlinx.coroutines.channels.InterfaceC5211) r2
            kotlin.AbstractC5184.m10206(r8)
        L18:
            r8 = r2
            goto L31
        L1a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r3
        L20:
            java.lang.Object r2 = r7.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r2 = (kotlinx.coroutines.channels.InterfaceC5211) r2
            kotlin.AbstractC5184.m10206(r8)
            goto L43
        L28:
            kotlin.AbstractC5184.m10206(r8)
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r8 = r7.$channel
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r8 = r8.iterator()
        L31:
            r7.L$0 = r0
            r7.L$1 = r8
            r7.L$2 = r3
            r7.label = r5
            r2 = r8
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r2 = (kotlinx.coroutines.channels.C5190) r2
            java.lang.Object r8 = r2.m10260(r7)
            if (r8 != r1) goto L43
            goto L64
        L43:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L65
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r2 = (kotlinx.coroutines.channels.C5190) r2
            java.lang.Object r8 = r2.m10258()
            r7.L$0 = r0
            r7.L$1 = r2
            r7.L$2 = r3
            r7.label = r4
            r6 = r0
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰 r6 = (kotlinx.coroutines.channels.AbstractC5210) r6
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r6 = r6.f14798
            java.lang.Object r8 = r6.mo8443(r8, r7)
            if (r8 != r1) goto L18
        L64:
            return r1
        L65:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt$broadcast$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
