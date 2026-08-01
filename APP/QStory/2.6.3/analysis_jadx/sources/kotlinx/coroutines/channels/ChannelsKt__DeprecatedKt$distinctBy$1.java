package kotlinx.coroutines.channels;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", l = {417, 418, 420}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$distinctBy$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $selector;
    final /* synthetic */ InterfaceC5199 $this_distinctBy;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$distinctBy$1(InterfaceC5199 interfaceC5199, InterfaceC6554 interfaceC6554, InterfaceC4357<? super ChannelsKt__DeprecatedKt$distinctBy$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_distinctBy = interfaceC5199;
        this.$selector = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1 = new ChannelsKt__DeprecatedKt$distinctBy$1(this.$this_distinctBy, this.$selector, interfaceC4357);
        channelsKt__DeprecatedKt$distinctBy$1.L$0 = obj;
        return channelsKt__DeprecatedKt$distinctBy$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ChannelsKt__DeprecatedKt$distinctBy$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[PHI: r2 r7 r12
  0x006a: PHI (r2v5 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r2v20 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r2v21 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:14:0x0067, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r7v4 java.util.HashSet) = (r7v6 java.util.HashSet), (r7v10 java.util.HashSet) binds: [B:14:0x0067, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r12v3 java.lang.Object) = (r12v8 java.lang.Object), (r12v0 java.lang.Object) binds: [B:14:0x0067, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0093 -> B:29:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ad -> B:28:0x00af). Please report as a decompilation issue!!! */
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
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L29
            if (r2 != r3) goto L23
            java.lang.Object r2 = r11.L$4
            java.lang.Object r7 = r11.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r7 = (kotlinx.coroutines.channels.InterfaceC5212) r7
            java.lang.Object r8 = r11.L$1
            java.util.HashSet r8 = (java.util.HashSet) r8
            kotlin.AbstractC5185.m10210(r12)
            goto Laf
        L23:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r11)
            return r6
        L29:
            java.lang.Object r2 = r11.L$3
            java.lang.Object r7 = r11.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r7 = (kotlinx.coroutines.channels.InterfaceC5212) r7
            java.lang.Object r8 = r11.L$1
            java.util.HashSet r8 = (java.util.HashSet) r8
            kotlin.AbstractC5185.m10210(r12)
            r10 = r7
            r7 = r2
            r2 = r10
            goto L8f
        L3a:
            java.lang.Object r2 = r11.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r2 = (kotlinx.coroutines.channels.InterfaceC5212) r2
            java.lang.Object r7 = r11.L$1
            java.util.HashSet r7 = (java.util.HashSet) r7
            kotlin.AbstractC5185.m10210(r12)
            goto L6a
        L46:
            kotlin.AbstractC5185.m10210(r12)
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r2 = r11.$this_distinctBy
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r2 = r2.iterator()
            r7 = r12
        L55:
            r11.L$0 = r0
            r11.L$1 = r7
            r11.L$2 = r2
            r11.L$3 = r6
            r11.L$4 = r6
            r11.label = r5
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r2 = (kotlinx.coroutines.channels.C5191) r2
            java.lang.Object r12 = r2.m10264(r11)
            if (r12 != r1) goto L6a
            goto Lac
        L6a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lb5
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r2 = (kotlinx.coroutines.channels.C5191) r2
            java.lang.Object r12 = r2.m10262()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r8 = r11.$selector
            r11.L$0 = r0
            r11.L$1 = r7
            r11.L$2 = r2
            r11.L$3 = r12
            r11.label = r4
            java.lang.Object r8 = r8.invoke(r12, r11)
            if (r8 != r1) goto L8b
            goto Lac
        L8b:
            r10 = r7
            r7 = r12
            r12 = r8
            r8 = r10
        L8f:
            boolean r9 = r8.contains(r12)
            if (r9 != 0) goto Lb3
            r11.L$0 = r0
            r11.L$1 = r8
            r11.L$2 = r2
            r11.L$3 = r6
            r11.L$4 = r12
            r11.label = r3
            r9 = r0
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰 r9 = (kotlinx.coroutines.channels.AbstractC5211) r9
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r9 = r9.f14798
            java.lang.Object r7 = r9.mo8433(r7, r11)
            if (r7 != r1) goto Lad
        Lac:
            return r1
        Lad:
            r7 = r2
            r2 = r12
        Laf:
            r8.add(r2)
            r2 = r7
        Lb3:
            r7 = r8
            goto L55
        Lb5:
            kotlin.飘花落叶言子楪兰苏哲世 r11 = kotlin.C5176.f14739
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
