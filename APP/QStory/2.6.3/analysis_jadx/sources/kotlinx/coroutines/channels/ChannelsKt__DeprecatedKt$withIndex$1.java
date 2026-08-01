package kotlinx.coroutines.channels;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", l = {400, 401}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/collections/飘花落叶言子楪兰苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$withIndex$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5199 $this_withIndex;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$withIndex$1(InterfaceC5199 interfaceC5199, InterfaceC4357 interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_withIndex = interfaceC5199;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new ChannelsKt__DeprecatedKt$withIndex$1(this.$this_withIndex, interfaceC4357);
        channelsKt__DeprecatedKt$withIndex$1.L$0 = obj;
        return channelsKt__DeprecatedKt$withIndex$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357 interfaceC4357) {
        return ((ChannelsKt__DeprecatedKt$withIndex$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[PHI: r2 r6 r10
  0x004a: PHI (r2v2 int) = (r2v4 int), (r2v6 int) binds: [B:13:0x0047, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r6v0 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r6v11 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r6v12 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:13:0x0047, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r10v3 java.lang.Object) = (r10v12 java.lang.Object), (r10v0 java.lang.Object) binds: [B:13:0x0047, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0075 -> B:7:0x001a). Please report as a decompilation issue!!! */
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
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2c
            if (r2 == r5) goto L22
            if (r2 != r4) goto L1c
            int r2 = r9.I$0
            java.lang.Object r6 = r9.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r6 = (kotlinx.coroutines.channels.InterfaceC5212) r6
            kotlin.AbstractC5185.m10210(r10)
        L1a:
            r10 = r6
            goto L36
        L1c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return r3
        L22:
            int r2 = r9.I$0
            java.lang.Object r6 = r9.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r6 = (kotlinx.coroutines.channels.InterfaceC5212) r6
            kotlin.AbstractC5185.m10210(r10)
            goto L4a
        L2c:
            kotlin.AbstractC5185.m10210(r10)
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r10 = r9.$this_withIndex
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r10 = r10.iterator()
            r2 = 0
        L36:
            r9.L$0 = r0
            r9.L$1 = r10
            r9.L$2 = r3
            r9.I$0 = r2
            r9.label = r5
            r6 = r10
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r6 = (kotlinx.coroutines.channels.C5191) r6
            java.lang.Object r10 = r6.m10264(r9)
            if (r10 != r1) goto L4a
            goto L74
        L4a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L77
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r6 = (kotlinx.coroutines.channels.C5191) r6
            java.lang.Object r10 = r6.m10262()
            kotlin.collections.飘花落叶言子楪兰苏哲世 r7 = new kotlin.collections.飘花落叶言子楪兰苏哲世
            int r8 = r2 + 1
            r7.<init>(r2, r10)
            r9.L$0 = r0
            r9.L$1 = r6
            r9.L$2 = r3
            r9.I$0 = r8
            r9.label = r4
            r10 = r0
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰 r10 = (kotlinx.coroutines.channels.AbstractC5211) r10
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r10 = r10.f14798
            java.lang.Object r10 = r10.mo8433(r7, r9)
            if (r10 != r1) goto L75
        L74:
            return r1
        L75:
            r2 = r8
            goto L1a
        L77:
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5176.f14739
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
