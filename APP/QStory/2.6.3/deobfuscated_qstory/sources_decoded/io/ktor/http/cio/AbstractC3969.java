package io.ktor.http.cio;

import io.ktor.utils.io.C4240;
import java.nio.ByteBuffer;
import kotlin.text.AbstractC5132;
import p058.AbstractC6855;
import p094.C7205;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7205 f12206;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7205 f12207;

    static {
        byte[] bArrM12084 = AbstractC6855.m12084("\r\n", AbstractC5132.f14688);
        f12207 = new C7205(bArrM12084, 0, bArrM12084.length);
        f12206 = new C7205(new byte[]{45, 45});
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8361(io.ktor.utils.io.InterfaceC4252 r5, java.nio.ByteBuffer r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
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
            kotlin.AbstractC5185.m10210(r7)
            goto L57
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r3
        L32:
            kotlin.AbstractC5185.m10210(r7)
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
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
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
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.AbstractC3969.m8361(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8362(io.ktor.utils.io.InterfaceC4252 r4, p094.C7205 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
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
            飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰 r5 = (p094.C7205) r5
            kotlin.AbstractC5185.m10210(r6)
            goto L41
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            r4 = 0
            return r4
        L33:
            kotlin.AbstractC5185.m10210(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = io.ktor.utils.io.AbstractC4244.m8659(r4, r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L4e
            byte[] r4 = r5.f19222
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
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.AbstractC3969.m8362(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, 飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m8363(C4240 c4240, ByteBuffer byteBuffer) throws Exception {
        int iPosition;
        int iMin;
        ByteBuffer byteBufferM8653 = c4240.m8653(0, 1);
        if (byteBufferM8653 != null) {
            int iPosition2 = byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            byte b = byteBuffer.get(iPosition2);
            int iLimit = byteBufferM8653.limit();
            loop0: for (int iPosition3 = byteBufferM8653.position(); iPosition3 < iLimit; iPosition3++) {
                if (byteBufferM8653.get(iPosition3) == b) {
                    for (int i = 1; i < iRemaining; i++) {
                        int i2 = iPosition3 + i;
                        if (i2 == iLimit) {
                            break loop0;
                        }
                        if (byteBufferM8653.get(i2) == byteBuffer.get(iPosition2 + i)) {
                        }
                    }
                    iPosition = iPosition3 - byteBufferM8653.position();
                    break loop0;
                }
            }
            iPosition = -1;
            if (iPosition != 0) {
                iMin = -1;
                break;
            }
            iMin = Math.min(byteBufferM8653.remaining() - iPosition, byteBuffer.remaining());
            int iRemaining2 = byteBuffer.remaining() - iMin;
            if (iRemaining2 <= 0) {
                iMin = byteBuffer.remaining();
            } else {
                ByteBuffer byteBufferM86532 = c4240.m8653(iPosition + iMin, iRemaining2);
                if (byteBufferM86532 != null) {
                    int iMin2 = Math.min(byteBufferM86532.remaining(), byteBuffer.remaining() - iMin);
                    if (iMin2 > 0) {
                        int iPosition4 = byteBufferM86532.position();
                        int iPosition5 = byteBuffer.position() + iMin;
                        for (int i3 = 0; i3 < iMin2; i3++) {
                            if (byteBufferM86532.get(iPosition4 + i3) == byteBuffer.get(iPosition5 + i3)) {
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
            C5925.m11307("Failed to skip delimiter: actual bytes differ from delimiter bytes");
            return 0;
        }
        if (iMin < byteBuffer.remaining()) {
            return iMin;
        }
        AbstractC6855.m12080(c4240.f12744.mo8643(), byteBuffer.remaining());
        return byteBuffer.remaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8364(io.ktor.utils.io.C4242 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
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
            io.ktor.http.cio.internals.飘花落叶言子楪世哲苏兰 r5 = (io.ktor.http.cio.internals.C3953) r5
            kotlin.AbstractC5185.m10210(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4f
        L2b:
            r6 = move-exception
            goto L62
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            r5 = 0
            return r5
        L34:
            kotlin.AbstractC5185.m10210(r6)
            io.ktor.http.cio.internals.飘花落叶言子楪世哲苏兰 r6 = new io.ktor.http.cio.internals.飘花落叶言子楪世哲苏兰
            r6.<init>()
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L60
            r0.label = r3     // Catch: java.lang.Throwable -> L60
            io.ktor.http.cio.internals.飘花落叶言子楪苏世哲兰 r2 = new io.ktor.http.cio.internals.飘花落叶言子楪苏世哲兰     // Catch: java.lang.Throwable -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = io.ktor.http.cio.AbstractC3973.m8370(r5, r6, r2, r0)     // Catch: java.lang.Throwable -> L60
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r4 = r6
            r6 = r5
            r5 = r4
        L4f:
            io.ktor.http.cio.飘花落叶言子楪苏哲世兰 r6 = (io.ktor.http.cio.C3974) r6     // Catch: java.lang.Throwable -> L2b
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
            r5.m8337()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.AbstractC3969.m8364(io.ktor.utils.io.飘花落叶言子楪兰苏哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        if (((io.ktor.utils.io.C4249) r3).m8700(r6) != r7) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8365(p094.C7205 r22, io.ktor.utils.io.C4242 r23, io.ktor.utils.io.C4249 r24, io.ktor.http.cio.C3974 r25, long r26, kotlin.coroutines.jvm.internal.ContinuationImpl r28) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.AbstractC3969.m8365(飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰, io.ktor.utils.io.飘花落叶言子楪兰苏哲世, io.ktor.utils.io.飘花落叶言子楪苏世兰哲, io.ktor.http.cio.飘花落叶言子楪苏哲世兰, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
