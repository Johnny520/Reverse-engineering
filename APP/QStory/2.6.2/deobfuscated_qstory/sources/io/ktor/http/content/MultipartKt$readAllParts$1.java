package io.ktor.http.content;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.http.content.MultipartKt", f = "Multipart.kt", l = {130, 135}, m = "readAllParts")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class MultipartKt$readAllParts$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public MultipartKt$readAllParts$1(InterfaceC4356<? super MultipartKt$readAllParts$1> interfaceC4356) {
        super(interfaceC4356);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.result = r7
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r6.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L5c
            r4 = 2
            if (r0 == r3) goto L2a
            if (r0 != r4) goto L24
            java.lang.Object r0 = r6.L$1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r2 = r6.L$0
            io.ktor.http.content.飘花落叶言子楪世兰苏哲 r2 = (io.ktor.http.content.InterfaceC3976) r2
            kotlin.AbstractC5184.m10206(r7)
            r5 = r2
            r2 = r0
            r0 = r5
            goto L53
        L24:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r2
        L2a:
            java.lang.Object r0 = r6.L$0
            io.ktor.http.content.飘花落叶言子楪世兰苏哲 r0 = (io.ktor.http.content.InterfaceC3976) r0
            kotlin.AbstractC5184.m10206(r7)
            io.ktor.http.content.飘花落叶言子楪哲兰苏世 r7 = (io.ktor.http.content.AbstractC3988) r7
            if (r7 != 0) goto L38
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
            return r6
        L38:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r7)
        L40:
            r6.L$0 = r0
            r6.L$1 = r2
            r6.label = r4
            r7 = r0
            io.ktor.http.cio.飘花落叶言子楪世哲兰苏 r7 = (io.ktor.http.cio.C3958) r7
            java.lang.Object r0 = r7.m8359(r6)
            if (r0 != r1) goto L50
            return r1
        L50:
            r5 = r0
            r0 = r7
            r7 = r5
        L53:
            io.ktor.http.content.飘花落叶言子楪哲兰苏世 r7 = (io.ktor.http.content.AbstractC3988) r7
            if (r7 != 0) goto L58
            return r2
        L58:
            r2.add(r7)
            goto L40
        L5c:
            kotlin.AbstractC5184.m10206(r7)
            r6.L$0 = r2
            r6.label = r3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.MultipartKt$readAllParts$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
