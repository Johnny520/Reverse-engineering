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
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", l = {374, 375, 375}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$mapIndexed$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5199 $this_mapIndexed;
    final /* synthetic */ InterfaceC6551 $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$mapIndexed$1(InterfaceC5199 interfaceC5199, InterfaceC6551 interfaceC6551, InterfaceC4357<? super ChannelsKt__DeprecatedKt$mapIndexed$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_mapIndexed = interfaceC5199;
        this.$transform = interfaceC6551;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.$this_mapIndexed, this.$transform, interfaceC4357);
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009f -> B:13:0x0047). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r0 = (kotlinx.coroutines.channels.InterfaceC5196) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r11.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L33
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1f
            int r2 = r11.I$0
            java.lang.Object r7 = r11.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r7 = (kotlinx.coroutines.channels.InterfaceC5212) r7
            kotlin.AbstractC5185.m10210(r12)
            r12 = r7
            goto L47
        L1f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r11)
            return r6
        L25:
            int r2 = r11.I$0
            java.lang.Object r7 = r11.L$3
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r7 = (kotlinx.coroutines.channels.InterfaceC5196) r7
            java.lang.Object r8 = r11.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r8 = (kotlinx.coroutines.channels.InterfaceC5212) r8
            kotlin.AbstractC5185.m10210(r12)
            goto L88
        L33:
            int r2 = r11.I$0
            java.lang.Object r7 = r11.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r7 = (kotlinx.coroutines.channels.InterfaceC5212) r7
            kotlin.AbstractC5185.m10210(r12)
            goto L5b
        L3d:
            kotlin.AbstractC5185.m10210(r12)
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r12 = r11.$this_mapIndexed
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r12 = r12.iterator()
            r2 = 0
        L47:
            r11.L$0 = r0
            r11.L$1 = r12
            r11.L$2 = r6
            r11.I$0 = r2
            r11.label = r5
            r7 = r12
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r7 = (kotlinx.coroutines.channels.C5191) r7
            java.lang.Object r12 = r7.m10264(r11)
            if (r12 != r1) goto L5b
            goto L9e
        L5b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto La1
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r7 = (kotlinx.coroutines.channels.C5191) r7
            java.lang.Object r12 = r7.m10262()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r8 = r11.$transform
            int r9 = r2 + 1
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r2)
            r11.L$0 = r0
            r11.L$1 = r7
            r11.L$2 = r6
            r11.L$3 = r0
            r11.I$0 = r9
            r11.label = r4
            java.lang.Object r12 = r8.invoke(r10, r12, r11)
            if (r12 != r1) goto L85
            goto L9e
        L85:
            r8 = r7
            r2 = r9
            r7 = r0
        L88:
            r11.L$0 = r0
            r11.L$1 = r8
            r11.L$2 = r6
            r11.L$3 = r6
            r11.I$0 = r2
            r11.label = r3
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰 r7 = (kotlinx.coroutines.channels.AbstractC5211) r7
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r7 = r7.f14798
            java.lang.Object r12 = r7.mo8433(r12, r11)
            if (r12 != r1) goto L9f
        L9e:
            return r1
        L9f:
            r12 = r8
            goto L47
        La1:
            kotlin.飘花落叶言子楪兰苏哲世 r11 = kotlin.C5176.f14739
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
