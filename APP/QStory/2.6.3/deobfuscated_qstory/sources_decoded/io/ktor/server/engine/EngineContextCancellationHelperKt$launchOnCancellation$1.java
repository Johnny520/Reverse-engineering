package io.ktor.server.engine;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5439;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.EngineContextCancellationHelperKt$launchOnCancellation$1", f = "EngineContextCancellationHelper.kt", l = {38, 44}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class EngineContextCancellationHelperKt$launchOnCancellation$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6558 $block;
    final /* synthetic */ InterfaceC5439 $deferred;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineContextCancellationHelperKt$launchOnCancellation$1(InterfaceC5439 interfaceC5439, InterfaceC6558 interfaceC6558, InterfaceC4357<? super EngineContextCancellationHelperKt$launchOnCancellation$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$deferred = interfaceC5439;
        this.$block = interfaceC6558;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new EngineContextCancellationHelperKt$launchOnCancellation$1(this.$deferred, this.$block, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((EngineContextCancellationHelperKt$launchOnCancellation$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (((kotlinx.coroutines.C5460) r5).mo10564(r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r5.invoke(r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            kotlin.AbstractC5185.m10210(r5)
            goto L48
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            r4 = 0
            return r4
        L17:
            int r1 = r4.I$0
            kotlin.AbstractC5185.m10210(r5)     // Catch: java.lang.Throwable -> L31
        L1c:
            r3 = r1
            goto L31
        L1e:
            kotlin.AbstractC5185.m10210(r5)
            kotlinx.coroutines.飘花落叶言子楪哲兰苏世 r5 = r4.$deferred     // Catch: java.lang.Throwable -> L31
            r1 = 0
            r4.I$0 = r1     // Catch: java.lang.Throwable -> L31
            r4.label = r3     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.飘花落叶言子苏哲世兰楪 r5 = (kotlinx.coroutines.C5460) r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.mo10564(r4)     // Catch: java.lang.Throwable -> L31
            if (r5 != r0) goto L1c
            goto L47
        L31:
            if (r3 != 0) goto L3d
            kotlinx.coroutines.飘花落叶言子楪哲兰苏世 r5 = r4.$deferred
            kotlinx.coroutines.飘花落叶言子苏哲世兰楪 r5 = (kotlinx.coroutines.C5460) r5
            boolean r5 = r5.isCancelled()
            if (r5 == 0) goto L48
        L3d:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r5 = r4.$block
            r4.label = r2
            java.lang.Object r4 = r5.invoke(r4)
            if (r4 != r0) goto L48
        L47:
            return r0
        L48:
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.EngineContextCancellationHelperKt$launchOnCancellation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
