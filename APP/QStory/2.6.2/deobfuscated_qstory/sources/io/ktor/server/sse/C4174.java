package io.ktor.server.sse;

import io.ktor.server.routing.C4162;
import io.ktor.utils.io.InterfaceC4246;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.sync.C5379;

/* JADX INFO: renamed from: io.ktor.server.sse.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4174 implements InterfaceC4171 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4359 f12631;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5379 f12632;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4246 f12633;

    public C4174(InterfaceC4246 interfaceC4246, C4162 c4162, InterfaceC4359 interfaceC4359) {
        interfaceC4246.getClass();
        interfaceC4359.getClass();
        this.f12633 = interfaceC4246;
        this.f12631 = interfaceC4359;
        this.f12632 = new C5379();
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12631;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (((io.ktor.utils.io.C4248) r6).m8710(r0) == r8) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8549(io.ktor.utils.io.InterfaceC4246 r6, p245.C8152 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.server.sse.DefaultServerSSESession$writeSSE$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.sse.DefaultServerSSESession$writeSSE$1 r0 = (io.ktor.server.sse.DefaultServerSSESession$writeSSE$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.sse.DefaultServerSSESession$writeSSE$1 r0 = new io.ktor.server.sse.DefaultServerSSESession$writeSSE$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            kotlin.AbstractC5184.m10206(r5)
            goto L65
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r2
        L31:
            java.lang.Object r6 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = (io.ktor.utils.io.InterfaceC4246) r6
            kotlin.AbstractC5184.m10206(r5)
            goto L58
        L39:
            kotlin.AbstractC5184.m10206(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            java.lang.String r7 = "\r\n"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r5 = io.ktor.utils.io.AbstractC4245.m8703(r6, r5, r0)
            if (r5 != r8) goto L58
            goto L64
        L58:
            r0.L$0 = r2
            r0.label = r3
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r6 = (io.ktor.utils.io.C4248) r6
            java.lang.Object r5 = r6.m8710(r0)
            if (r5 != r8) goto L65
        L64:
            return r8
        L65:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.sse.C4174.m8549(io.ktor.utils.io.飘花落叶言子楪哲苏世兰, 飘花落叶言楪兰哲子苏世.飘花落叶言子楪世苏哲兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8550(kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof io.ktor.server.sse.DefaultServerSSESession$close$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.sse.DefaultServerSSESession$close$1 r0 = (io.ktor.server.sse.DefaultServerSSESession$close$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.sse.DefaultServerSSESession$close$1 r0 = new io.ktor.server.sse.DefaultServerSSESession$close$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.sync.飘花落叶言子楪世苏哲兰 r7 = (kotlinx.coroutines.sync.InterfaceC5382) r7
            kotlin.AbstractC5184.m10206(r8)     // Catch: java.lang.Throwable -> L2f
            goto L69
        L2f:
            r8 = move-exception
            goto L77
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r5
        L37:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.sync.飘花落叶言子楪世苏哲兰 r7 = (kotlinx.coroutines.sync.InterfaceC5382) r7
            java.lang.Object r2 = r0.L$0
            io.ktor.server.sse.飘花落叶言子楪世苏哲兰 r2 = (io.ktor.server.sse.C4174) r2
            kotlin.AbstractC5184.m10206(r8)
            r8 = r7
            r7 = r2
            goto L57
        L45:
            kotlin.AbstractC5184.m10206(r8)
            r0.L$0 = r7
            kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏 r8 = r7.f12632
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r2 = r8.m10423(r0)
            if (r2 != r1) goto L57
            goto L67
        L57:
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r7 = r7.f12633     // Catch: java.lang.Throwable -> L75
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L75
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L75
            r0.label = r3     // Catch: java.lang.Throwable -> L75
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r7 = (io.ktor.utils.io.C4248) r7     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = r7.m8714(r0)     // Catch: java.lang.Throwable -> L75
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            r7 = r8
        L69:
            kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏 r7 = (kotlinx.coroutines.sync.C5379) r7
            r7.m10428(r5)
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
            return r7
        L71:
            r6 = r8
            r8 = r7
            r7 = r6
            goto L77
        L75:
            r7 = move-exception
            goto L71
        L77:
            kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏 r7 = (kotlinx.coroutines.sync.C5379) r7
            r7.m10428(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.sse.C4174.m8550(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
