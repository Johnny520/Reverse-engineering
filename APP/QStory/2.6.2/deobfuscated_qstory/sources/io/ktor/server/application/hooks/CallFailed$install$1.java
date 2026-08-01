package io.ktor.server.application.hooks;

import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.application.hooks.CallFailed$install$1", f = "CommonHooks.kt", l = {44, 48}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, k = 3, mv = {2, 0, 0})
final class CallFailed$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6550 $handler;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: io.ktor.server.application.hooks.CallFailed$install$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "io.ktor.server.application.hooks.CallFailed$install$1$1", f = "CommonHooks.kt", l = {45}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ AbstractC4193 $$this$intercept;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC4193 abstractC4193, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$$this$intercept = abstractC4193;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$$this$intercept, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                AbstractC4193 abstractC4193 = this.$$this$intercept;
                this.label = 1;
                if (abstractC4193.mo8576(this) == coroutineSingletons) {
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
    public CallFailed$install$1(InterfaceC6550 interfaceC6550, InterfaceC4356<? super CallFailed$install$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$handler = interfaceC6550;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, C5175 c5175, InterfaceC4356<? super C5175> interfaceC4356) {
        CallFailed$install$1 callFailed$install$1 = new CallFailed$install$1(this.$handler, interfaceC4356);
        callFailed$install$1.L$0 = abstractC4193;
        return callFailed$install$1.invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10503(r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L19
            java.lang.Object r0 = r6.L$1
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r6 = r6.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r6 = (io.ktor.util.pipeline.AbstractC4193) r6
            kotlin.AbstractC5184.m10206(r7)
            goto L59
        L19:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r2
        L1f:
            java.lang.Object r1 = r6.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r1 = (io.ktor.util.pipeline.AbstractC4193) r1
            kotlin.AbstractC5184.m10206(r7)     // Catch: java.lang.Throwable -> L27
            goto L67
        L27:
            r7 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
            goto L44
        L2c:
            kotlin.AbstractC5184.m10206(r7)
            java.lang.Object r7 = r6.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r7 = (io.ktor.util.pipeline.AbstractC4193) r7
            io.ktor.server.application.hooks.CallFailed$install$1$1 r1 = new io.ktor.server.application.hooks.CallFailed$install$1$1     // Catch: java.lang.Throwable -> L43
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L43
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L43
            r6.label = r4     // Catch: java.lang.Throwable -> L43
            java.lang.Object r6 = kotlinx.coroutines.AbstractC5398.m10503(r1, r6)     // Catch: java.lang.Throwable -> L43
            if (r6 != r0) goto L67
            goto L56
        L43:
            r1 = move-exception
        L44:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r2 = r6.$handler
            java.lang.Object r4 = r7.f12660
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r4 = (io.ktor.server.application.InterfaceC4064) r4
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r6 = r2.invoke(r4, r1, r6)
            if (r6 != r0) goto L57
        L56:
            return r0
        L57:
            r6 = r7
            r0 = r1
        L59:
            java.lang.Object r6 = r6.f12660
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r6 = (io.ktor.server.application.InterfaceC4064) r6
            io.ktor.server.response.飘花落叶言子楪世哲苏兰 r6 = r6.mo8471()
            boolean r6 = r6.mo395()
            if (r6 == 0) goto L6a
        L67:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        L6a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.application.hooks.CallFailed$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
