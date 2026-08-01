package io.ktor.http.cio;

import io.ktor.http.content.AbstractC3988;
import io.ktor.http.content.InterfaceC3976;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.C5203;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3958 implements InterfaceC3976, InterfaceC5400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public AbstractC3988 f12182;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5203 f12183;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4359 f12184;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3958(kotlin.coroutines.InterfaceC4359 r19, io.ktor.utils.io.InterfaceC4251 r20, java.lang.String r21, java.lang.Long r22, long r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.C3958.<init>(kotlin.coroutines.飘花落叶言子楪苏世兰哲, io.ktor.utils.io.飘花落叶言子楪苏兰哲世, java.lang.String, java.lang.Long, long):void");
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12184;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r7 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: ClosedReceiveChannelException -> 0x0064, PHI: r6 r7
  0x0052: PHI (r6v1 'this' io.ktor.http.cio.飘花落叶言子楪世哲兰苏) = (r6v2 'this' io.ktor.http.cio.飘花落叶言子楪世哲兰苏), (r6v5 'this' io.ktor.http.cio.飘花落叶言子楪世哲兰苏) binds: [B:22:0x004f, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r7v2 java.lang.Object) = (r7v7 java.lang.Object), (r7v1 java.lang.Object) binds: [B:22:0x004f, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {ClosedReceiveChannelException -> 0x0064, blocks: (B:13:0x002b, B:27:0x005f, B:21:0x0040, B:24:0x0052, B:18:0x0039), top: B:31:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005c -> B:27:0x005f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8358(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1 r0 = (io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1 r0 = new io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r6 = r0.L$0
            io.ktor.http.cio.飘花落叶言子楪世哲兰苏 r6 = (io.ktor.http.cio.C3958) r6
            kotlin.AbstractC5184.m10206(r7)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            goto L5f
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L35:
            java.lang.Object r6 = r0.L$0
            io.ktor.http.cio.飘花落叶言子楪世哲兰苏 r6 = (io.ktor.http.cio.C3958) r6
            kotlin.AbstractC5184.m10206(r7)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            goto L52
        L3d:
            kotlin.AbstractC5184.m10206(r7)
        L40:
            kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世 r7 = r6.f12183     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            r0.L$0 = r6     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            r0.label = r5     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r7 = r7.f14798     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            r7.getClass()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            java.lang.Object r7 = kotlinx.coroutines.channels.C5189.m10218(r7, r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            if (r7 != r1) goto L52
            goto L5e
        L52:
            io.ktor.http.cio.飘花落叶言子楪哲苏世兰 r7 = (io.ktor.http.cio.AbstractC3967) r7     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            r0.L$0 = r6     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            r0.label = r4     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            java.lang.Object r7 = r6.m8361(r7, r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            if (r7 != r1) goto L5f
        L5e:
            return r1
        L5f:
            io.ktor.http.content.飘花落叶言子楪哲兰苏世 r7 = (io.ktor.http.content.AbstractC3988) r7     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L64
            if (r7 == 0) goto L40
            return r7
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.C3958.m8358(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0069 -> B:29:0x006c). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8359(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.http.cio.CIOMultipartDataBase$readPart$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.http.cio.CIOMultipartDataBase$readPart$1 r0 = (io.ktor.http.cio.CIOMultipartDataBase$readPart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.CIOMultipartDataBase$readPart$1 r0 = new io.ktor.http.cio.CIOMultipartDataBase$readPart$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.AbstractC5184.m10206(r7)
            return r7
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L31:
            java.lang.Object r6 = r0.L$0
            io.ktor.http.cio.飘花落叶言子楪世哲兰苏 r6 = (io.ktor.http.cio.C3958) r6
            kotlin.AbstractC5184.m10206(r7)
            goto L6c
        L39:
            kotlin.AbstractC5184.m10206(r7)
            io.ktor.http.content.飘花落叶言子楪哲兰苏世 r7 = r6.f12182
            if (r7 == 0) goto L45
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r7 = r7.f12240
            r7.invoke()
        L45:
            kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世 r7 = r6.f12183
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r7 = r7.f14798
            java.lang.Object r7 = r7.mo10251()
            java.lang.Object r7 = kotlinx.coroutines.channels.C5201.m10268(r7)
            io.ktor.http.cio.飘花落叶言子楪哲苏世兰 r7 = (io.ktor.http.cio.AbstractC3967) r7
            if (r7 != 0) goto L61
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r6 = r6.m8358(r0)
            if (r6 != r1) goto L60
            goto L6b
        L60:
            return r6
        L61:
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.m8361(r7, r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            io.ktor.http.content.飘花落叶言子楪哲兰苏世 r7 = (io.ktor.http.content.AbstractC3988) r7
            if (r7 == 0) goto L45
            r6.f12182 = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.C3958.m8359(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [io.ktor.http.cio.飘花落叶言子楪世哲苏兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8360(final io.ktor.http.cio.C3963 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.C3958.m8360(io.ktor.http.cio.飘花落叶言子楪哲世兰苏, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8361(io.ktor.http.cio.AbstractC3967 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.http.cio.CIOMultipartDataBase$eventToData$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.http.cio.CIOMultipartDataBase$eventToData$1 r0 = (io.ktor.http.cio.CIOMultipartDataBase$eventToData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.CIOMultipartDataBase$eventToData$1 r0 = new io.ktor.http.cio.CIOMultipartDataBase$eventToData$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r5 = r0.L$0
            r6 = r5
            io.ktor.http.cio.飘花落叶言子楪哲苏世兰 r6 = (io.ktor.http.cio.AbstractC3967) r6
            kotlin.AbstractC5184.m10206(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4a
        L2d:
            r5 = move-exception
            goto L51
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L35:
            kotlin.AbstractC5184.m10206(r7)
            boolean r7 = r6 instanceof io.ktor.http.cio.C3963     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L4d
            r7 = r6
            io.ktor.http.cio.飘花落叶言子楪哲世兰苏 r7 = (io.ktor.http.cio.C3963) r7     // Catch: java.lang.Throwable -> L2d
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2d
            r0.label = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r7 = r5.m8360(r7, r0)     // Catch: java.lang.Throwable -> L2d
            if (r7 != r1) goto L4a
            return r1
        L4a:
            io.ktor.http.content.飘花落叶言子楪哲兰苏世 r7 = (io.ktor.http.content.AbstractC3988) r7     // Catch: java.lang.Throwable -> L2d
            return r7
        L4d:
            r6.mo8367()     // Catch: java.lang.Throwable -> L2d
            return r3
        L51:
            r6.mo8367()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.C3958.m8361(io.ktor.http.cio.飘花落叶言子楪哲苏世兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
