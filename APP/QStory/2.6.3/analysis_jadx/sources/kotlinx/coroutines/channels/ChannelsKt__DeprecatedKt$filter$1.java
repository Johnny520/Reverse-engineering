package kotlinx.coroutines.channels;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", l = {228, 229, 229}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$filter$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $predicate;
    final /* synthetic */ InterfaceC5199 $this_filter;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filter$1(InterfaceC5199 interfaceC5199, InterfaceC6554 interfaceC6554, InterfaceC4357<? super ChannelsKt__DeprecatedKt$filter$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_filter = interfaceC5199;
        this.$predicate = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1 = new ChannelsKt__DeprecatedKt$filter$1(this.$this_filter, this.$predicate, interfaceC4357);
        channelsKt__DeprecatedKt$filter$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filter$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ChannelsKt__DeprecatedKt$filter$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC5211) r0).f14798.mo8433(r7, r9) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[PHI: r2 r10
  0x0053: PHI (r2v2 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r2v16 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r2v17 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:14:0x0050, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r10v10 java.lang.Object) = (r10v16 java.lang.Object), (r10v0 java.lang.Object) binds: [B:14:0x0050, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007b -> B:27:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008e -> B:27:0x0091). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r0 = (kotlinx.coroutines.channels.InterfaceC5196) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r9.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L38
            if (r2 == r6) goto L30
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1d
            java.lang.Object r2 = r9.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r2 = (kotlinx.coroutines.channels.InterfaceC5212) r2
            kotlin.AbstractC5185.m10210(r10)
            goto L91
        L1d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return r3
        L23:
            java.lang.Object r2 = r9.L$2
            java.lang.Object r7 = r9.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r7 = (kotlinx.coroutines.channels.InterfaceC5212) r7
            kotlin.AbstractC5185.m10210(r10)
            r8 = r7
            r7 = r2
            r2 = r8
            goto L75
        L30:
            java.lang.Object r2 = r9.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r2 = (kotlinx.coroutines.channels.InterfaceC5212) r2
            kotlin.AbstractC5185.m10210(r10)
            goto L53
        L38:
            kotlin.AbstractC5185.m10210(r10)
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r10 = r9.$this_filter
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r10 = r10.iterator()
        L41:
            r9.L$0 = r0
            r9.L$1 = r10
            r9.L$2 = r3
            r9.label = r6
            r2 = r10
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r2 = (kotlinx.coroutines.channels.C5191) r2
            java.lang.Object r10 = r2.m10264(r9)
            if (r10 != r1) goto L53
            goto L90
        L53:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L93
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r2 = (kotlinx.coroutines.channels.C5191) r2
            java.lang.Object r10 = r2.m10262()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r7 = r9.$predicate
            r9.L$0 = r0
            r9.L$1 = r2
            r9.L$2 = r10
            r9.label = r5
            java.lang.Object r7 = r7.invoke(r10, r9)
            if (r7 != r1) goto L72
            goto L90
        L72:
            r8 = r7
            r7 = r10
            r10 = r8
        L75:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L91
            r9.L$0 = r0
            r9.L$1 = r2
            r9.L$2 = r3
            r9.label = r4
            r10 = r0
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰 r10 = (kotlinx.coroutines.channels.AbstractC5211) r10
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r10 = r10.f14798
            java.lang.Object r10 = r10.mo8433(r7, r9)
            if (r10 != r1) goto L91
        L90:
            return r1
        L91:
            r10 = r2
            goto L41
        L93:
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5176.f14739
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
