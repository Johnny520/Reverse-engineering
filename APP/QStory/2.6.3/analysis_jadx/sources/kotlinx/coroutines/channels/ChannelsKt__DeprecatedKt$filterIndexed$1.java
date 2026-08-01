package kotlinx.coroutines.channels;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", l = {241, 242, 242}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6551 $predicate;
    final /* synthetic */ InterfaceC5199 $this_filterIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filterIndexed$1(InterfaceC5199 interfaceC5199, InterfaceC6551 interfaceC6551, InterfaceC4357 interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_filterIndexed = interfaceC5199;
        this.$predicate = interfaceC6551;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1 = new ChannelsKt__DeprecatedKt$filterIndexed$1(this.$this_filterIndexed, this.$predicate, interfaceC4357);
        channelsKt__DeprecatedKt$filterIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterIndexed$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357 interfaceC4357) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC5211) r0).f14798.mo8433(r8, r12) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[PHI: r2 r7 r13
  0x005c: PHI (r2v3 int) = (r2v6 int), (r2v8 int) binds: [B:14:0x0059, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r7v1 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r7v15 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r7v16 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:14:0x0059, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r13v10 java.lang.Object) = (r13v16 java.lang.Object), (r13v0 java.lang.Object) binds: [B:14:0x0059, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008d -> B:27:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a2 -> B:27:0x00a5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r0 = (kotlinx.coroutines.channels.InterfaceC5196) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r12.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L34
            if (r2 == r5) goto L25
            if (r2 != r4) goto L1f
            int r2 = r12.I$0
            java.lang.Object r7 = r12.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r7 = (kotlinx.coroutines.channels.InterfaceC5212) r7
            kotlin.AbstractC5185.m10210(r13)
            goto La5
        L1f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r12)
            return r3
        L25:
            int r2 = r12.I$0
            java.lang.Object r7 = r12.L$2
            java.lang.Object r8 = r12.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r8 = (kotlinx.coroutines.channels.InterfaceC5212) r8
            kotlin.AbstractC5185.m10210(r13)
            r11 = r8
            r8 = r7
            r7 = r11
            goto L87
        L34:
            int r2 = r12.I$0
            java.lang.Object r7 = r12.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r7 = (kotlinx.coroutines.channels.InterfaceC5212) r7
            kotlin.AbstractC5185.m10210(r13)
            goto L5c
        L3e:
            kotlin.AbstractC5185.m10210(r13)
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r13 = r12.$this_filterIndexed
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r13 = r13.iterator()
            r2 = 0
        L48:
            r12.L$0 = r0
            r12.L$1 = r13
            r12.L$2 = r3
            r12.I$0 = r2
            r12.label = r6
            r7 = r13
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r7 = (kotlinx.coroutines.channels.C5191) r7
            java.lang.Object r13 = r7.m10264(r12)
            if (r13 != r1) goto L5c
            goto La4
        L5c:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto La7
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r7 = (kotlinx.coroutines.channels.C5191) r7
            java.lang.Object r13 = r7.m10262()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r8 = r12.$predicate
            int r9 = r2 + 1
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r2)
            r12.L$0 = r0
            r12.L$1 = r7
            r12.L$2 = r13
            r12.I$0 = r9
            r12.label = r5
            java.lang.Object r2 = r8.invoke(r10, r13, r12)
            if (r2 != r1) goto L84
            goto La4
        L84:
            r8 = r13
            r13 = r2
            r2 = r9
        L87:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto La5
            r12.L$0 = r0
            r12.L$1 = r7
            r12.L$2 = r3
            r12.I$0 = r2
            r12.label = r4
            r13 = r0
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰 r13 = (kotlinx.coroutines.channels.AbstractC5211) r13
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r13 = r13.f14798
            java.lang.Object r13 = r13.mo8433(r8, r12)
            if (r13 != r1) goto La5
        La4:
            return r1
        La5:
            r13 = r7
            goto L48
        La7:
            kotlin.飘花落叶言子楪兰苏哲世 r12 = kotlin.C5176.f14739
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
