package kotlinx.coroutines.channels;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", l = {351, 352, 352}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$flatMap$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5199 $this_flatMap;
    final /* synthetic */ InterfaceC6554 $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$flatMap$1(InterfaceC5199 interfaceC5199, InterfaceC6554 interfaceC6554, InterfaceC4357 interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_flatMap = interfaceC5199;
        this.$transform = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new ChannelsKt__DeprecatedKt$flatMap$1(this.$this_flatMap, this.$transform, interfaceC4357);
        channelsKt__DeprecatedKt$flatMap$1.L$0 = obj;
        return channelsKt__DeprecatedKt$flatMap$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357 interfaceC4357) {
        return ((ChannelsKt__DeprecatedKt$flatMap$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (kotlinx.coroutines.channels.AbstractC5205.m10283((kotlinx.coroutines.channels.InterfaceC5199) r9, r0, r8) != r1) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[PHI: r2 r9
  0x004e: PHI (r2v2 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r2v15 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r2v16 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:15:0x004b, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]
  0x004e: PHI (r9v6 java.lang.Object) = (r9v12 java.lang.Object), (r9v0 java.lang.Object) binds: [B:15:0x004b, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007b -> B:8:0x001b). Please report as a decompilation issue!!! */
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
            r6 = 0
            if (r2 == 0) goto L33
            if (r2 == r5) goto L2b
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1d
            java.lang.Object r2 = r8.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r2 = (kotlinx.coroutines.channels.InterfaceC5212) r2
            kotlin.AbstractC5185.m10210(r9)
        L1b:
            r9 = r2
            goto L3c
        L1d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            return r6
        L23:
            java.lang.Object r2 = r8.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r2 = (kotlinx.coroutines.channels.InterfaceC5212) r2
            kotlin.AbstractC5185.m10210(r9)
            goto L6d
        L2b:
            java.lang.Object r2 = r8.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r2 = (kotlinx.coroutines.channels.InterfaceC5212) r2
            kotlin.AbstractC5185.m10210(r9)
            goto L4e
        L33:
            kotlin.AbstractC5185.m10210(r9)
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r9 = r8.$this_flatMap
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r9 = r9.iterator()
        L3c:
            r8.L$0 = r0
            r8.L$1 = r9
            r8.L$2 = r6
            r8.label = r5
            r2 = r9
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r2 = (kotlinx.coroutines.channels.C5191) r2
            java.lang.Object r9 = r2.m10264(r8)
            if (r9 != r1) goto L4e
            goto L7d
        L4e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7e
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r2 = (kotlinx.coroutines.channels.C5191) r2
            java.lang.Object r9 = r2.m10262()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r7 = r8.$transform
            r8.L$0 = r0
            r8.L$1 = r2
            r8.L$2 = r6
            r8.label = r4
            java.lang.Object r9 = r7.invoke(r9, r8)
            if (r9 != r1) goto L6d
            goto L7d
        L6d:
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r9 = (kotlinx.coroutines.channels.InterfaceC5199) r9
            r8.L$0 = r0
            r8.L$1 = r2
            r8.L$2 = r6
            r8.label = r3
            java.lang.Object r9 = kotlinx.coroutines.channels.AbstractC5205.m10283(r9, r0, r8)
            if (r9 != r1) goto L1b
        L7d:
            return r1
        L7e:
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5176.f14739
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
