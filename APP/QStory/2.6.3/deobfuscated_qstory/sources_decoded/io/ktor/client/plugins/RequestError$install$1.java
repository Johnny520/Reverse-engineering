package io.ktor.client.plugins;

import io.ktor.util.pipeline.AbstractC4194;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.RequestError$install$1", f = "HttpCallValidator.kt", l = {134, 136}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class RequestError$install$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6551 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestError$install$1(InterfaceC6551 interfaceC6551, InterfaceC4357<? super RequestError$install$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$handler = interfaceC6551;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        RequestError$install$1 requestError$install$1 = new RequestError$install$1(this.$handler, interfaceC4357);
        requestError$install$1.L$0 = abstractC4194;
        return requestError$install$1.invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r7 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏] */
    /* JADX WARN: Type inference failed for: r6v0, types: [io.ktor.client.plugins.RequestError$install$1, kotlin.coroutines.飘花落叶言子楪世哲苏兰] */
    /* JADX WARN: Type inference failed for: r6v1, types: [io.ktor.client.plugins.RequestError$install$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
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
            if (r1 == 0) goto L21
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.AbstractC5185.m10210(r7)
            goto L4c
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r2
        L17:
            java.lang.Object r1 = r6.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r1 = (io.ktor.util.pipeline.AbstractC4194) r1
            kotlin.AbstractC5185.m10210(r7)     // Catch: java.lang.Throwable -> L1f
            goto L50
        L1f:
            r7 = move-exception
            goto L34
        L21:
            kotlin.AbstractC5185.m10210(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r1 = (io.ktor.util.pipeline.AbstractC4194) r1
            r6.L$0 = r1     // Catch: java.lang.Throwable -> L1f
            r6.label = r4     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r6 = r1.mo8566(r6)     // Catch: java.lang.Throwable -> L1f
            if (r6 != r0) goto L50
            goto L4b
        L34:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r4 = r6.$handler
            java.lang.Object r1 = r1.f12664
            飘花落叶言楪兰世苏子哲.飘花落叶言子楪世苏兰哲 r1 = (p241.C8140) r1
            飘花落叶言苏楪子哲世兰.飘花落叶言子楪世苏兰哲 r5 = io.ktor.client.plugins.AbstractC3941.f12156
            io.ktor.client.plugins.飘花落叶言子楪苏哲世兰 r5 = new io.ktor.client.plugins.飘花落叶言子楪苏哲世兰
            r5.<init>(r1)
            r6.L$0 = r2
            r6.label = r3
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L4c
        L4b:
            return r0
        L4c:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 != 0) goto L53
        L50:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        L53:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.RequestError$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
