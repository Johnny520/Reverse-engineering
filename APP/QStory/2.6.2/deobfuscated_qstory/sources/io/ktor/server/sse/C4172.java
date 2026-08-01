package io.ktor.server.sse;

import io.ktor.http.content.AbstractC3994;
import io.ktor.server.routing.C4162;
import p052.InterfaceC6553;
import p236.AbstractC8105;
import p236.C8124;

/* JADX INFO: renamed from: io.ktor.server.sse.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4172 extends AbstractC3994 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8124 f12627;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6553 f12628;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4162 f12629;

    public C4172(C4162 c4162, InterfaceC6553 interfaceC6553) {
        interfaceC6553.getClass();
        this.f12629 = c4162;
        this.f12628 = interfaceC6553;
        this.f12627 = AbstractC8105.f22391;
    }

    public final String toString() {
        return "SSEServerContent";
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8124 mo8293() {
        return this.f12627;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (((io.ktor.server.sse.C4174) r9).m8550(r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.http.content.AbstractC3994
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8392(io.ktor.utils.io.InterfaceC4246 r10, kotlin.coroutines.InterfaceC4356 r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof io.ktor.server.sse.SSEServerContent$writeTo$1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.server.sse.SSEServerContent$writeTo$1 r0 = (io.ktor.server.sse.SSEServerContent$writeTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.sse.SSEServerContent$writeTo$1 r0 = new io.ktor.server.sse.SSEServerContent$writeTo$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L49
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L30
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r9)
            return r3
        L30:
            java.lang.Object r9 = r0.L$0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.AbstractC5184.m10206(r11)
            goto Lad
        L39:
            kotlin.AbstractC5184.m10206(r11)
            goto L96
        L3d:
            java.lang.Object r9 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref$ObjectRef) r9
            kotlin.AbstractC5184.m10206(r11)     // Catch: java.lang.Throwable -> L45
            goto L81
        L45:
            r10 = move-exception
            r11 = r9
            r9 = r10
            goto L9a
        L49:
            kotlin.AbstractC5184.m10206(r11)
            飘花落叶言苏楪子哲兰世.飘花落叶言子楪世苏兰哲 r11 = io.ktor.server.sse.AbstractC4173.f12630
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "Starting sse session for "
            r2.<init>(r7)
            io.ktor.server.routing.飘花落叶言子楪哲兰苏世 r7 = r9.f12629
            io.ktor.server.request.飘花落叶言子楪世哲苏兰 r7 = r7.mo8469()
            java.lang.String r7 = com.bumptech.glide.AbstractC3054.m6611(r7)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r11.trace(r2)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            io.ktor.server.sse.SSEServerContent$writeTo$2 r2 = new io.ktor.server.sse.SSEServerContent$writeTo$2     // Catch: java.lang.Throwable -> L99
            r2.<init>(r11, r10, r9, r3)     // Catch: java.lang.Throwable -> L99
            r0.L$0 = r11     // Catch: java.lang.Throwable -> L99
            r0.label = r6     // Catch: java.lang.Throwable -> L99
            java.lang.Object r9 = kotlinx.coroutines.AbstractC5398.m10503(r2, r0)     // Catch: java.lang.Throwable -> L99
            if (r9 != r1) goto L7e
            goto Lac
        L7e:
            r8 = r11
            r11 = r9
            r9 = r8
        L81:
            kotlin.飘花落叶言子楪兰苏哲世 r11 = (kotlin.C5175) r11     // Catch: java.lang.Throwable -> L45
            T r9 = r9.element
            io.ktor.server.sse.飘花落叶言子楪世哲兰苏 r9 = (io.ktor.server.sse.InterfaceC4171) r9
            if (r9 == 0) goto L96
            r0.L$0 = r3
            r0.label = r5
            io.ktor.server.sse.飘花落叶言子楪世苏哲兰 r9 = (io.ktor.server.sse.C4174) r9
            java.lang.Object r9 = r9.m8550(r0)
            if (r9 != r1) goto L96
            goto Lac
        L96:
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5175.f14739
            return r9
        L99:
            r9 = move-exception
        L9a:
            T r10 = r11.element
            io.ktor.server.sse.飘花落叶言子楪世哲兰苏 r10 = (io.ktor.server.sse.InterfaceC4171) r10
            if (r10 == 0) goto Lad
            r0.L$0 = r9
            r0.label = r4
            io.ktor.server.sse.飘花落叶言子楪世苏哲兰 r10 = (io.ktor.server.sse.C4174) r10
            java.lang.Object r10 = r10.m8550(r0)
            if (r10 != r1) goto Lad
        Lac:
            return r1
        Lad:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.sse.C4172.mo8392(io.ktor.utils.io.飘花落叶言子楪哲苏世兰, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }
}
