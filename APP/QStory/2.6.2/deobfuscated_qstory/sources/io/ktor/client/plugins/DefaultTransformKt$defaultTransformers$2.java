package io.ktor.client.plugins;

import io.ktor.client.AbstractC3948;
import io.ktor.client.statement.C3944;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.InterfaceC5438;
import p052.InterfaceC6550;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", l = {68, 72, 72, 77, 77, 81, 88, 112, 117}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<destruct>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultTransformKt$defaultTransformers$2 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ AbstractC3948 $this_defaultTransformers;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    public DefaultTransformKt$defaultTransformers$2(AbstractC3948 abstractC3948, InterfaceC4356<? super DefaultTransformKt$defaultTransformers$2> interfaceC4356) {
        super(3, interfaceC4356);
    }

    private static final C5175 invokeSuspend$lambda$1$lambda$0(InterfaceC5438 interfaceC5438) {
        ((C5450) interfaceC5438).m10551();
        return C5175.f14739;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, C3944 c3944, InterfaceC4356<? super C5175> interfaceC4356) {
        DefaultTransformKt$defaultTransformers$2 defaultTransformKt$defaultTransformers$2 = new DefaultTransformKt$defaultTransformers$2(null, interfaceC4356);
        defaultTransformKt$defaultTransformers$2.L$0 = abstractC4193;
        defaultTransformKt$defaultTransformers$2.L$1 = c3944;
        return defaultTransformKt$defaultTransformers$2.invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
