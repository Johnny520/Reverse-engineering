package kotlinx.coroutines.channels;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", l = {284, 285}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ int $n;
    final /* synthetic */ InterfaceC5199 $this_take;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$take$1(int i, InterfaceC5199 interfaceC5199, InterfaceC4357 interfaceC4357) {
        super(2, interfaceC4357);
        this.$n = i;
        this.$this_take = interfaceC5199;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.$n, this.$this_take, interfaceC4357);
        channelsKt__DeprecatedKt$take$1.L$0 = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357 interfaceC4357) {
        return ((ChannelsKt__DeprecatedKt$take$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC5211) r0).f14798.mo8433(r10, r9) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0073 -> B:24:0x0076). Please report as a decompilation issue!!! */
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
            if (r2 == 0) goto L2b
            if (r2 == r5) goto L21
            if (r2 != r4) goto L1b
            int r2 = r9.I$0
            java.lang.Object r6 = r9.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r6 = (kotlinx.coroutines.channels.InterfaceC5212) r6
            kotlin.AbstractC5185.m10210(r10)
            goto L76
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return r3
        L21:
            int r2 = r9.I$0
            java.lang.Object r6 = r9.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r6 = (kotlinx.coroutines.channels.InterfaceC5212) r6
            kotlin.AbstractC5185.m10210(r10)
            goto L52
        L2b:
            kotlin.AbstractC5185.m10210(r10)
            int r10 = r9.$n
            if (r10 != 0) goto L33
            goto L7d
        L33:
            if (r10 < 0) goto L80
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r2 = r9.$this_take
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r2 = r2.iterator()
        L3b:
            r9.L$0 = r0
            r9.L$1 = r2
            r9.L$2 = r3
            r9.I$0 = r10
            r9.label = r5
            r6 = r2
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r6 = (kotlinx.coroutines.channels.C5191) r6
            java.lang.Object r2 = r6.m10264(r9)
            if (r2 != r1) goto L4f
            goto L75
        L4f:
            r8 = r2
            r2 = r10
            r10 = r8
        L52:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7d
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r6 = (kotlinx.coroutines.channels.C5191) r6
            java.lang.Object r10 = r6.m10262()
            r9.L$0 = r0
            r9.L$1 = r6
            r9.L$2 = r3
            r9.I$0 = r2
            r9.label = r4
            r7 = r0
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰 r7 = (kotlinx.coroutines.channels.AbstractC5211) r7
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r7 = r7.f14798
            java.lang.Object r10 = r7.mo8433(r10, r9)
            if (r10 != r1) goto L76
        L75:
            return r1
        L76:
            int r10 = r2 + (-1)
            if (r10 != 0) goto L7b
            goto L7d
        L7b:
            r2 = r6
            goto L3b
        L7d:
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5176.f14739
            return r9
        L80:
            java.lang.String r9 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r9 = androidx.activity.AbstractC0053.m162(r10, r9, r0)
            top.suzhelan.qstory.hook.item.C5925.m11314(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
