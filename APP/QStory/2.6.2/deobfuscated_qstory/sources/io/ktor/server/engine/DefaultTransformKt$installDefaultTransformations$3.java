package io.ktor.server.engine;

import io.ktor.util.pipeline.AbstractC4193;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$3", f = "DefaultTransform.kt", l = {87, 88}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultTransformKt$installDefaultTransformations$3 extends SuspendLambda implements InterfaceC6550 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DefaultTransformKt$installDefaultTransformations$3(InterfaceC4356<? super DefaultTransformKt$installDefaultTransformations$3> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        DefaultTransformKt$installDefaultTransformations$3 defaultTransformKt$installDefaultTransformations$3 = new DefaultTransformKt$installDefaultTransformations$3(interfaceC4356);
        defaultTransformKt$installDefaultTransformations$3.L$0 = abstractC4193;
        defaultTransformKt$installDefaultTransformations$3.L$1 = obj;
        return defaultTransformKt$installDefaultTransformations$3.invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            r11 = this;
            java.lang.String r0 = "Content-Type"
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r11.label
            r3 = 0
            r4 = 2
            r5 = 1
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            if (r2 == 0) goto L24
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            kotlin.AbstractC5184.m10206(r12)
            return r6
        L15:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            return r3
        L1b:
            java.lang.Object r0 = r11.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r0 = (io.ktor.util.pipeline.AbstractC4193) r0
            kotlin.AbstractC5184.m10206(r12)
            goto L8b
        L24:
            kotlin.AbstractC5184.m10206(r12)
            java.lang.Object r12 = r11.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r12 = (io.ktor.util.pipeline.AbstractC4193) r12
            java.lang.Object r2 = r11.L$1
            boolean r7 = r2 instanceof io.ktor.utils.io.InterfaceC4251
            if (r7 == 0) goto L34
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r2 = (io.ktor.utils.io.InterfaceC4251) r2
            goto L35
        L34:
            r2 = r3
        L35:
            if (r2 != 0) goto L38
            goto L98
        L38:
            java.lang.Object r7 = r12.f12660
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r7 = (io.ktor.server.application.InterfaceC4064) r7
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r7 = io.ktor.server.application.AbstractC4065.m8480(r7)
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r7 = r7.f18303
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r9 = kotlin.jvm.internal.AbstractC4395.f12971
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r8 = r9.mo8927(r8)
            boolean r7 = kotlin.jvm.internal.AbstractC4394.m8917(r7, r8)
            if (r7 != 0) goto L51
            goto L98
        L51:
            java.lang.Object r7 = r12.f12660
            r8 = r7
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r8 = (io.ktor.server.application.InterfaceC4064) r8
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r7 = (io.ktor.server.application.InterfaceC4064) r7     // Catch: io.ktor.http.BadContentTypeFormatException -> L99
            io.ktor.server.request.飘花落叶言子楪世兰苏哲 r7 = r7.mo8469()     // Catch: io.ktor.http.BadContentTypeFormatException -> L99
            r7.getClass()     // Catch: io.ktor.http.BadContentTypeFormatException -> L99
            java.lang.String[] r9 = p236.AbstractC8114.f22415     // Catch: io.ktor.http.BadContentTypeFormatException -> L99
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪兰世哲苏 r7 = r7.mo383()     // Catch: io.ktor.http.BadContentTypeFormatException -> L99
            java.lang.String r7 = r7.mo8366(r0)     // Catch: io.ktor.http.BadContentTypeFormatException -> L99
            if (r7 == 0) goto L73
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r9 = p236.C8124.f22426     // Catch: io.ktor.http.BadContentTypeFormatException -> L99
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r7 = p236.C8112.m13553(r7)     // Catch: io.ktor.http.BadContentTypeFormatException -> L99
            if (r7 != 0) goto L75
        L73:
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r7 = p236.C8124.f22426     // Catch: io.ktor.http.BadContentTypeFormatException -> L99
        L75:
            java.nio.charset.Charset r0 = kotlin.reflect.jvm.internal.AbstractC5061.m10050(r7)     // Catch: io.ktor.http.BadContentTypeFormatException -> L99
            if (r0 != 0) goto L7d
            java.nio.charset.Charset r0 = kotlin.text.AbstractC5131.f14688
        L7d:
            r11.L$0 = r12
            r11.label = r5
            java.lang.Object r0 = io.ktor.server.engine.AbstractC4110.m8523(r2, r0, r11)
            if (r0 != r1) goto L88
            goto L97
        L88:
            r10 = r0
            r0 = r12
            r12 = r10
        L8b:
            java.lang.String r12 = (java.lang.String) r12
            r11.L$0 = r3
            r11.label = r4
            java.lang.Object r11 = r0.mo8580(r12, r11)
            if (r11 != r1) goto L98
        L97:
            return r1
        L98:
            return r6
        L99:
            r11 = move-exception
            io.ktor.server.plugins.BadRequestException r12 = new io.ktor.server.plugins.BadRequestException
            io.ktor.server.request.飘花落叶言子楪世兰苏哲 r1 = r8.mo8469()
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪兰世哲苏 r1 = r1.mo383()
            java.lang.String[] r2 = p236.AbstractC8114.f22415
            java.lang.String r0 = r1.mo8366(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal Content-Type header format: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.<init>(r0, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
