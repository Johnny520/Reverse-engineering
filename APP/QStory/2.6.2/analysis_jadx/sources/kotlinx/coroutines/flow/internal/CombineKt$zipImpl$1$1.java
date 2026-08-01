package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5438;
import kotlinx.coroutines.channels.InterfaceC5198;
import kotlinx.coroutines.flow.InterfaceC5317;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {123}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 2, 0})
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5318 $flow;
    final /* synthetic */ InterfaceC5318 $flow2;
    final /* synthetic */ InterfaceC5317 $this_unsafeFlow;
    final /* synthetic */ InterfaceC6550 $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 2, 0})
    @InterfaceC6861(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {124}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ InterfaceC5438 $collectJob;
        final /* synthetic */ InterfaceC5318 $flow;
        final /* synthetic */ InterfaceC4359 $scopeContext;
        final /* synthetic */ InterfaceC5198 $second;
        final /* synthetic */ InterfaceC5317 $this_unsafeFlow;
        final /* synthetic */ InterfaceC6550 $transform;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC5318 interfaceC5318, InterfaceC4359 interfaceC4359, Object obj, InterfaceC5198 interfaceC5198, InterfaceC5317 interfaceC5317, InterfaceC6550 interfaceC6550, InterfaceC5438 interfaceC5438, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.$flow = interfaceC5318;
            this.$scopeContext = interfaceC4359;
            this.$cnt = obj;
            this.$second = interfaceC5198;
            this.$this_unsafeFlow = interfaceC5317;
            this.$transform = interfaceC6550;
            this.$collectJob = interfaceC5438;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(C5175 c5175, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(c5175, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                InterfaceC5318 interfaceC5318 = this.$flow;
                C5233 c5233 = new C5233(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob);
                this.label = 1;
                if (interfaceC5318.mo8463(c5233, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
            }
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(InterfaceC5318 interfaceC5318, InterfaceC5318 interfaceC53182, InterfaceC5317 interfaceC5317, InterfaceC6550 interfaceC6550, InterfaceC4356<? super CombineKt$zipImpl$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$flow2 = interfaceC5318;
        this.$flow = interfaceC53182;
        this.$this_unsafeFlow = interfaceC5317;
        this.$transform = interfaceC6550;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$flow2, this.$flow, this.$this_unsafeFlow, this.$transform, interfaceC4356);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CombineKt$zipImpl$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d A[Catch: all -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0023, blocks: (B:6:0x001f, B:32:0x0095, B:36:0x009d), top: B:41:0x000e }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = (kotlinx.coroutines.InterfaceC5400) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.label
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5175.f14739
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L2f
            if (r3 != r5) goto L29
            java.lang.Object r1 = r0.L$3
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = (kotlin.coroutines.InterfaceC4359) r1
            java.lang.Object r1 = r0.L$2
            kotlinx.coroutines.飘花落叶言子楪哲兰苏世 r1 = (kotlinx.coroutines.InterfaceC5438) r1
            java.lang.Object r0 = r0.L$1
            r2 = r0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r2 = (kotlinx.coroutines.channels.InterfaceC5198) r2
            kotlin.AbstractC5184.m10206(r19)     // Catch: java.lang.Throwable -> L23 kotlinx.coroutines.flow.internal.AbortFlowException -> L26
            goto L84
        L23:
            r0 = move-exception
            goto L9e
        L26:
            r0 = move-exception
            goto L95
        L29:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r0)
            return r6
        L2f:
            kotlin.AbstractC5184.m10206(r19)
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r3 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r7 = r0.$flow2
            r3.<init>(r7, r6)
            r7 = 3
            r8 = 0
            kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世 r13 = kotlinx.coroutines.channels.AbstractC5204.m10273(r1, r6, r8, r3, r7)
            kotlinx.coroutines.飘花落叶言子苏世哲楪兰 r3 = kotlinx.coroutines.AbstractC5398.m10484()
            androidx.compose.foundation.text.飘花落叶言子苏楪兰哲世 r7 = new androidx.compose.foundation.text.飘花落叶言子苏楪兰哲世
            r8 = 20
            r7.<init>(r3, r8)
            r13.mo8442(r7)
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r11 = r1.mo2420()     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            java.lang.Object r12 = kotlinx.coroutines.internal.AbstractC5352.m10365(r11)     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = r1.mo2420()     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = r1.plus(r3)     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r9 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r10 = r0.$flow     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r14 = r0.$this_unsafeFlow     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r15 = r0.$transform     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            r17 = 0
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L91
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            r0.L$1 = r13     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            r0.L$2 = r3     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            r0.L$3 = r6     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            r0.L$4 = r6     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            r0.label = r5     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            java.lang.Object r5 = kotlinx.coroutines.internal.AbstractC5352.m10365(r1)     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            java.lang.Object r0 = kotlinx.coroutines.flow.internal.AbstractC5218.m10294(r1, r4, r5, r9, r0)     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            if (r0 != r2) goto L83
            return r2
        L83:
            r2 = r13
        L84:
            r2.mo10252(r6)
            return r4
        L88:
            r2 = r13
            goto L9e
        L8a:
            r1 = r3
            r2 = r13
            goto L95
        L8d:
            r0 = move-exception
            goto L88
        L8f:
            r0 = move-exception
            goto L8a
        L91:
            r0 = move-exception
            r3 = r16
            goto L8a
        L95:
            java.lang.Object r3 = r0.owner     // Catch: java.lang.Throwable -> L23
            if (r3 != r1) goto L9d
            r2.mo10252(r6)
            return r4
        L9d:
            throw r0     // Catch: java.lang.Throwable -> L23
        L9e:
            r2.mo10252(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
