package io.ktor.http.cio;

import io.ktor.utils.io.C4239;
import java.nio.ByteBuffer;
import kotlin.text.AbstractC5131;
import p058.AbstractC6854;
import p094.C7204;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7204 f12202;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7204 f12203;

    static {
        byte[] bArrM12056 = AbstractC6854.m12056("\r\n", AbstractC5131.f14688);
        f12203 = new C7204(bArrM12056, 0, bArrM12056.length);
        f12202 = new C7204(new byte[]{45, 45});
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8371(io.ktor.utils.io.InterfaceC4251 r5, java.nio.ByteBuffer r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.http.cio.MultipartKt$trySkipDelimiterSuspend$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.http.cio.MultipartKt$trySkipDelimiterSuspend$1 r0 = (io.ktor.http.cio.MultipartKt$trySkipDelimiterSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.MultipartKt$trySkipDelimiterSuspend$1 r0 = new io.ktor.http.cio.MultipartKt$trySkipDelimiterSuspend$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            java.lang.Object r5 = r0.L$0
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref$BooleanRef) r5
            kotlin.AbstractC5184.m10206(r7)
            goto L57
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L32:
            kotlin.AbstractC5184.m10206(r7)
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            r7.element = r4
            io.ktor.http.cio.MultipartKt$trySkipDelimiterSuspend$2 r2 = new io.ktor.http.cio.MultipartKt$trySkipDelimiterSuspend$2
            r2.<init>(r6, r7, r3)
            r0.L$0 = r7
            r0.label = r4
            io.ktor.utils.io.飘花落叶言子楪兰哲苏世 r6 = new io.ktor.utils.io.飘花落叶言子楪兰哲苏世
            r6.<init>(r5)
            java.lang.Object r5 = r2.invoke(r6, r0)
            if (r5 != r1) goto L51
            goto L53
        L51:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
        L53:
            if (r5 != r1) goto L56
            return r1
        L56:
            r5 = r7
        L57:
            boolean r5 = r5.element
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.AbstractC3968.m8371(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8372(io.ktor.utils.io.InterfaceC4251 r4, p094.C7204 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1 r0 = (io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1 r0 = new io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.L$0
            r5 = r4
            飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰 r5 = (p094.C7204) r5
            kotlin.AbstractC5184.m10206(r6)
            goto L41
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L33:
            kotlin.AbstractC5184.m10206(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = io.ktor.utils.io.AbstractC4243.m8669(r4, r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L4e
            byte[] r4 = r5.f19227
            int r4 = r4.length
            long r4 = (long) r4
            goto L50
        L4e:
            r4 = 0
        L50:
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.AbstractC3968.m8372(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, 飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m8373(C4239 c4239, ByteBuffer byteBuffer) throws Exception {
        int iPosition;
        int iMin;
        ByteBuffer byteBufferM8663 = c4239.m8663(0, 1);
        if (byteBufferM8663 != null) {
            int iPosition2 = byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            byte b = byteBuffer.get(iPosition2);
            int iLimit = byteBufferM8663.limit();
            loop0: for (int iPosition3 = byteBufferM8663.position(); iPosition3 < iLimit; iPosition3++) {
                if (byteBufferM8663.get(iPosition3) == b) {
                    for (int i = 1; i < iRemaining; i++) {
                        int i2 = iPosition3 + i;
                        if (i2 == iLimit) {
                            break loop0;
                        }
                        if (byteBufferM8663.get(i2) == byteBuffer.get(iPosition2 + i)) {
                        }
                    }
                    iPosition = iPosition3 - byteBufferM8663.position();
                    break loop0;
                }
            }
            iPosition = -1;
            if (iPosition != 0) {
                iMin = -1;
                break;
            }
            iMin = Math.min(byteBufferM8663.remaining() - iPosition, byteBuffer.remaining());
            int iRemaining2 = byteBuffer.remaining() - iMin;
            if (iRemaining2 <= 0) {
                iMin = byteBuffer.remaining();
            } else {
                ByteBuffer byteBufferM86632 = c4239.m8663(iPosition + iMin, iRemaining2);
                if (byteBufferM86632 != null) {
                    int iMin2 = Math.min(byteBufferM86632.remaining(), byteBuffer.remaining() - iMin);
                    if (iMin2 > 0) {
                        int iPosition4 = byteBufferM86632.position();
                        int iPosition5 = byteBuffer.position() + iMin;
                        for (int i3 = 0; i3 < iMin2; i3++) {
                            if (byteBufferM86632.get(iPosition4 + i3) == byteBuffer.get(iPosition5 + i3)) {
                            }
                        }
                        iMin = byteBuffer.remaining();
                    }
                    iMin = -1;
                    break;
                }
            }
        } else {
            iMin = 0;
        }
        if (iMin == -1) {
            C5919.m11246("Failed to skip delimiter: actual bytes differ from delimiter bytes");
            return 0;
        }
        if (iMin < byteBuffer.remaining()) {
            return iMin;
        }
        AbstractC6854.m12052(c4239.f12740.mo8653(), byteBuffer.remaining());
        return byteBuffer.remaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8374(io.ktor.utils.io.C4241 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1 r0 = (io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1 r0 = new io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            io.ktor.http.cio.internals.飘花落叶言子楪世哲苏兰 r5 = (io.ktor.http.cio.internals.C3952) r5
            kotlin.AbstractC5184.m10206(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4f
        L2b:
            r6 = move-exception
            goto L62
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            r5 = 0
            return r5
        L34:
            kotlin.AbstractC5184.m10206(r6)
            io.ktor.http.cio.internals.飘花落叶言子楪世哲苏兰 r6 = new io.ktor.http.cio.internals.飘花落叶言子楪世哲苏兰
            r6.<init>()
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L60
            r0.label = r3     // Catch: java.lang.Throwable -> L60
            io.ktor.http.cio.internals.飘花落叶言子楪苏世哲兰 r2 = new io.ktor.http.cio.internals.飘花落叶言子楪苏世哲兰     // Catch: java.lang.Throwable -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = io.ktor.http.cio.AbstractC3972.m8380(r5, r6, r2, r0)     // Catch: java.lang.Throwable -> L60
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r4 = r6
            r6 = r5
            r5 = r4
        L4f:
            io.ktor.http.cio.飘花落叶言子楪苏哲世兰 r6 = (io.ktor.http.cio.C3973) r6     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L54
            return r6
        L54:
            java.io.EOFException r6 = new java.io.EOFException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "Failed to parse multipart headers: unexpected end of stream"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            throw r6     // Catch: java.lang.Throwable -> L2b
        L5c:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L62
        L60:
            r5 = move-exception
            goto L5c
        L62:
            r5.m8347()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.AbstractC3968.m8374(io.ktor.utils.io.飘花落叶言子楪兰苏哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        if (((io.ktor.utils.io.C4248) r3).m8710(r6) != r7) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8375(p094.C7204 r22, io.ktor.utils.io.C4241 r23, io.ktor.utils.io.C4248 r24, io.ktor.http.cio.C3973 r25, long r26, kotlin.coroutines.jvm.internal.ContinuationImpl r28) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.AbstractC3968.m8375(飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰, io.ktor.utils.io.飘花落叶言子楪兰苏哲世, io.ktor.utils.io.飘花落叶言子楪苏世兰哲, io.ktor.http.cio.飘花落叶言子楪苏哲世兰, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
