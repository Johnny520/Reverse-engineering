package io.ktor.server.engine;

import io.ktor.util.pipeline.AbstractC4194;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.BaseApplicationEngineKt$installDefaultTransformationChecker$1", f = "BaseApplicationEngine.kt", l = {112, 128}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, k = 3, mv = {2, 0, 0})
final class BaseApplicationEngineKt$installDefaultTransformationChecker$1 extends SuspendLambda implements InterfaceC6551 {
    private /* synthetic */ Object L$0;
    int label;

    public BaseApplicationEngineKt$installDefaultTransformationChecker$1(InterfaceC4357<? super BaseApplicationEngineKt$installDefaultTransformationChecker$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, C5176 c5176, InterfaceC4357<? super C5176> interfaceC4357) {
        BaseApplicationEngineKt$installDefaultTransformationChecker$1 baseApplicationEngineKt$installDefaultTransformationChecker$1 = new BaseApplicationEngineKt$installDefaultTransformationChecker$1(interfaceC4357);
        baseApplicationEngineKt$installDefaultTransformationChecker$1.L$0 = abstractC4194;
        return baseApplicationEngineKt$installDefaultTransformationChecker$1.invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r8.mo8462(r1, r6, r7) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.ktor.server.engine.BaseApplicationEngineKt$installDefaultTransformationChecker$1, kotlin.coroutines.飘花落叶言子楪世哲苏兰] */
    /* JADX WARN: Type inference failed for: r7v1, types: [io.ktor.server.engine.BaseApplicationEngineKt$installDefaultTransformationChecker$1, kotlin.coroutines.飘花落叶言子楪世哲苏兰] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v2, types: [io.ktor.server.application.飘花落叶言子楪世苏兰哲, io.ktor.server.application.飘花落叶言子楪哲苏世兰] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.AbstractC5185.m10210(r8)
            goto L56
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r2
        L17:
            java.lang.Object r1 = r7.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r1 = (io.ktor.util.pipeline.AbstractC4194) r1
            kotlin.AbstractC5185.m10210(r8)     // Catch: io.ktor.server.plugins.CannotTransformContentToTypeException -> L32
            goto L56
        L1f:
            kotlin.AbstractC5185.m10210(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r1 = (io.ktor.util.pipeline.AbstractC4194) r1
            r7.L$0 = r1     // Catch: io.ktor.server.plugins.CannotTransformContentToTypeException -> L32
            r7.label = r4     // Catch: io.ktor.server.plugins.CannotTransformContentToTypeException -> L32
            java.lang.Object r7 = r1.mo8566(r7)     // Catch: io.ktor.server.plugins.CannotTransformContentToTypeException -> L32
            if (r7 != r0) goto L56
            goto L55
        L32:
            java.lang.Object r8 = r1.f12664
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r8 = (io.ktor.server.application.InterfaceC4065) r8
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r1 = p236.C8097.f22350
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r4 = kotlin.jvm.internal.AbstractC4396.f12975
            java.lang.Class<飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰> r5 = p236.C8097.class
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r4 = r4.mo8917(r5)
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r5 = kotlin.jvm.internal.AbstractC4396.m8912(r5)     // Catch: java.lang.Throwable -> L45
            goto L46
        L45:
            r5 = r2
        L46:
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r6 = new 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰
            r6.<init>(r4, r5)
            r7.L$0 = r2
            r7.label = r3
            java.lang.Object r7 = r8.mo8462(r1, r6, r7)
            if (r7 != r0) goto L56
        L55:
            return r0
        L56:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.BaseApplicationEngineKt$installDefaultTransformationChecker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
