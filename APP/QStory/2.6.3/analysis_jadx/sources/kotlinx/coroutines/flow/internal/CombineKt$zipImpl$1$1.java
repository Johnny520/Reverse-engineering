package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5439;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.flow.InterfaceC5318;
import kotlinx.coroutines.flow.InterfaceC5319;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {123}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 2, 0})
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5319 $flow;
    final /* synthetic */ InterfaceC5319 $flow2;
    final /* synthetic */ InterfaceC5318 $this_unsafeFlow;
    final /* synthetic */ InterfaceC6551 $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 2, 0})
    @InterfaceC6862(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {124}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ InterfaceC5439 $collectJob;
        final /* synthetic */ InterfaceC5319 $flow;
        final /* synthetic */ InterfaceC4360 $scopeContext;
        final /* synthetic */ InterfaceC5199 $second;
        final /* synthetic */ InterfaceC5318 $this_unsafeFlow;
        final /* synthetic */ InterfaceC6551 $transform;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC5319 interfaceC5319, InterfaceC4360 interfaceC4360, Object obj, InterfaceC5199 interfaceC5199, InterfaceC5318 interfaceC5318, InterfaceC6551 interfaceC6551, InterfaceC5439 interfaceC5439, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$flow = interfaceC5319;
            this.$scopeContext = interfaceC4360;
            this.$cnt = obj;
            this.$second = interfaceC5199;
            this.$this_unsafeFlow = interfaceC5318;
            this.$transform = interfaceC6551;
            this.$collectJob = interfaceC5439;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass2(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(C5176 c5176, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(c5176, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                InterfaceC5319 interfaceC5319 = this.$flow;
                C5234 c5234 = new C5234(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob);
                this.label = 1;
                if (interfaceC5319.mo8453(c5234, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(InterfaceC5319 interfaceC5319, InterfaceC5319 interfaceC53192, InterfaceC5318 interfaceC5318, InterfaceC6551 interfaceC6551, InterfaceC4357<? super CombineKt$zipImpl$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$flow2 = interfaceC5319;
        this.$flow = interfaceC53192;
        this.$this_unsafeFlow = interfaceC5318;
        this.$transform = interfaceC6551;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$flow2, this.$flow, this.$this_unsafeFlow, this.$transform, interfaceC4357);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CombineKt$zipImpl$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
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
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = (kotlinx.coroutines.InterfaceC5401) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.label
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L2f
            if (r3 != r5) goto L29
            java.lang.Object r1 = r0.L$3
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = (kotlin.coroutines.InterfaceC4360) r1
            java.lang.Object r1 = r0.L$2
            kotlinx.coroutines.飘花落叶言子楪哲兰苏世 r1 = (kotlinx.coroutines.InterfaceC5439) r1
            java.lang.Object r0 = r0.L$1
            r2 = r0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r2 = (kotlinx.coroutines.channels.InterfaceC5199) r2
            kotlin.AbstractC5185.m10210(r19)     // Catch: java.lang.Throwable -> L23 kotlinx.coroutines.flow.internal.AbortFlowException -> L26
            goto L84
        L23:
            r0 = move-exception
            goto L9e
        L26:
            r0 = move-exception
            goto L95
        L29:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r0)
            return r6
        L2f:
            kotlin.AbstractC5185.m10210(r19)
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r3 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r7 = r0.$flow2
            r3.<init>(r7, r6)
            r7 = 3
            r8 = 0
            kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世 r13 = kotlinx.coroutines.channels.AbstractC5205.m10277(r1, r6, r8, r3, r7)
            kotlinx.coroutines.飘花落叶言子苏世哲楪兰 r3 = kotlinx.coroutines.AbstractC5399.m10488()
            androidx.compose.foundation.text.飘花落叶言子苏楪兰哲世 r7 = new androidx.compose.foundation.text.飘花落叶言子苏楪兰哲世
            r8 = 20
            r7.<init>(r3, r8)
            r13.mo8432(r7)
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r11 = r1.mo2430()     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            java.lang.Object r12 = kotlinx.coroutines.internal.AbstractC5353.m10369(r11)     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = r1.mo2430()     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
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
            java.lang.Object r5 = kotlinx.coroutines.internal.AbstractC5353.m10369(r1)     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            java.lang.Object r0 = kotlinx.coroutines.flow.internal.AbstractC5219.m10298(r1, r4, r5, r9, r0)     // Catch: java.lang.Throwable -> L8d kotlinx.coroutines.flow.internal.AbortFlowException -> L8f
            if (r0 != r2) goto L83
            return r2
        L83:
            r2 = r13
        L84:
            r2.mo10256(r6)
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
            r2.mo10256(r6)
            return r4
        L9d:
            throw r0     // Catch: java.lang.Throwable -> L23
        L9e:
            r2.mo10256(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
