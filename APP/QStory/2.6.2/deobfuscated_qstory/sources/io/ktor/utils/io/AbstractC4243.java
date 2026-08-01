package io.ktor.utils.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.io.AbstractC5477;
import kotlinx.io.C5476;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4243 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final Object m8667(InterfaceC4246 interfaceC4246, ByteBuffer byteBuffer, ContinuationImpl continuationImpl) throws Throwable {
        C4248 c4248 = (C4248) interfaceC4246;
        C5476 c5476M8712 = c4248.m8712();
        c5476M8712.getClass();
        byteBuffer.getClass();
        AbstractC5477.m10621(c5476M8712, byteBuffer);
        Object objM8710 = c4248.m8710(continuationImpl);
        return objM8710 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8710 : C5175.f14739;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m8668(io.ktor.utils.io.InterfaceC4251 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            kotlin.AbstractC5184.m10206(r5)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L2e:
            kotlin.AbstractC5184.m10206(r5)
            r0.label = r3
            java.lang.Object r5 = m8689(r4, r0)
            if (r5 != r1) goto L3a
            return r1
        L3a:
            kotlinx.io.飘花落叶言子楪世苏哲兰 r5 = (kotlinx.io.C5476) r5
            long r0 = r5.f15142
            int r4 = (int) r0
            byte[] r4 = kotlinx.io.AbstractC5477.m10628(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8668(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (m8691(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8669(io.ktor.utils.io.InterfaceC4251 r6, p094.C7204 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.AbstractC5184.m10206(r8)
            goto L68
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L31:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰 r7 = (p094.C7204) r7
            java.lang.Object r6 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r6 = (io.ktor.utils.io.InterfaceC4251) r6
            kotlin.AbstractC5184.m10206(r8)
            goto L51
        L3e:
            kotlin.AbstractC5184.m10206(r8)
            byte[] r8 = r7.f19227
            int r8 = r8.length
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Comparable r8 = m8694(r6, r8, r0)
            if (r8 != r1) goto L51
            goto L67
        L51:
            boolean r8 = kotlin.jvm.internal.AbstractC4394.m8917(r8, r7)
            if (r8 == 0) goto L6b
            byte[] r7 = r7.f19227
            int r7 = r7.length
            long r7 = (long) r7
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r6 = m8691(r6, r7, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L6b:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8669(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, 飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C4229 m8670(InterfaceC5400 interfaceC5400, InterfaceC4359 interfaceC4359, C4248 c4248, InterfaceC6553 interfaceC6553) {
        interfaceC4359.getClass();
        C5416 c5416M10473 = AbstractC5398.m10473(interfaceC5400, interfaceC4359, null, new ByteReadChannelOperationsKt$reader$job$1(interfaceC6553, c4248, null), 2);
        c5416M10473.mo10554(new C4252(c4248, 1));
        return new C4229(c4248, c5416M10473);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8671(io.ktor.utils.io.InterfaceC4246 r5, byte[] r6, kotlin.jvm.internal.Ref$IntRef r7, kotlin.jvm.internal.Ref$LongRef r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L32
            java.lang.Object r5 = r0.L$1
            r8 = r5
            kotlin.jvm.internal.Ref$LongRef r8 = (kotlin.jvm.internal.Ref$LongRef) r8
            java.lang.Object r5 = r0.L$0
            r7 = r5
            kotlin.jvm.internal.Ref$IntRef r7 = (kotlin.jvm.internal.Ref$IntRef) r7
            kotlin.AbstractC5184.m10206(r9)
            goto L4b
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            r5 = 0
            return r5
        L39:
            kotlin.AbstractC5184.m10206(r9)
            int r9 = r7.element
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r5 = io.ktor.utils.io.AbstractC4245.m8699(r5, r6, r3, r9, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            long r5 = r8.element
            int r9 = r7.element
            long r0 = (long) r9
            long r5 = r5 + r0
            r8.element = r5
            r7.element = r3
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8671(io.ktor.utils.io.飘花落叶言子楪哲苏世兰, byte[], kotlin.jvm.internal.Ref$IntRef, kotlin.jvm.internal.Ref$LongRef, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x017e, code lost:
    
        if (m8671(r14, r11, r12, r10, r2) == r3) goto L79;
     */
    /* JADX WARN: Path cross not found for [B:43:0x015e, B:54:0x0195], limit reached: 90 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0268  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01be -> B:61:0x01c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01ea -> B:66:0x01ed). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8672(io.ktor.utils.io.InterfaceC4251 r21, p094.C7204 r22, io.ktor.utils.io.InterfaceC4246 r23, long r24, boolean r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8672(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, 飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰, io.ktor.utils.io.飘花落叶言子楪哲苏世兰, long, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r1.mo8652(r7, r13) == r2) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00db -> B:44:0x00df). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8673(io.ktor.utils.io.InterfaceC4251 r17, io.ktor.utils.io.InterfaceC4246 r18, long r19, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8673(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, io.ktor.utils.io.飘花落叶言子楪哲苏世兰, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r8.mo8652(1, r0) != r1) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #2 {all -> 0x00aa, blocks: (B:27:0x006b, B:29:0x0071), top: B:59:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [io.ktor.utils.io.飘花落叶言子楪苏世兰哲, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009f -> B:20:0x0050). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8674(io.ktor.utils.io.InterfaceC4251 r12, io.ktor.utils.io.C4248 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8674(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, io.ktor.utils.io.飘花落叶言子楪苏世兰哲, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r8.mo8652(1, r0) != r1) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #3 {all -> 0x00aa, blocks: (B:27:0x006b, B:29:0x0071, B:42:0x00ac, B:50:0x00ca), top: B:64:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[Catch: all -> 0x00aa, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00aa, blocks: (B:27:0x006b, B:29:0x0071, B:42:0x00ac, B:50:0x00ca), top: B:64:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [io.ktor.utils.io.飘花落叶言子楪苏世兰哲, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009f -> B:20:0x0050). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8675(io.ktor.utils.io.InterfaceC4251 r12, io.ktor.utils.io.InterfaceC4246 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8675(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, io.ktor.utils.io.飘花落叶言子楪哲苏世兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m8676(InterfaceC4246 interfaceC4246) {
        interfaceC4246.getClass();
        AbstractC4245.m8701(new ByteWriteChannelKt$close$1(interfaceC4246));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m8677(InterfaceC4251 interfaceC4251) {
        interfaceC4251.getClass();
        interfaceC4251.mo8655(new IOException("Channel was cancelled"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10468(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006f -> B:13:0x002f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8678(io.ktor.utils.io.InterfaceC4251 r6, int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.io.EOFException {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L33
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r7 = (io.ktor.utils.io.InterfaceC4251) r7
            kotlin.AbstractC5184.m10206(r8)
        L2f:
            r5 = r7
            r7 = r6
            r6 = r5
            goto L47
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            r6 = 0
            return r6
        L3a:
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r7 = (io.ktor.utils.io.InterfaceC4251) r7
            kotlin.AbstractC5184.m10206(r8)
            goto L5d
        L44:
            kotlin.AbstractC5184.m10206(r8)
        L47:
            int r8 = m8693(r6)
            if (r8 >= r7) goto L75
            r0.L$0 = r6
            r0.I$0 = r7
            r0.label = r4
            java.lang.Object r8 = r6.mo8652(r7, r0)
            if (r8 != r1) goto L5a
            goto L71
        L5a:
            r5 = r7
            r7 = r6
            r6 = r5
        L5d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L72
            r0.L$0 = r7
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.AbstractC5398.m10468(r0)
            if (r8 != r1) goto L2f
        L71:
            return r1
        L72:
            r5 = r7
            r7 = r6
            r6 = r5
        L75:
            int r6 = m8693(r6)
            if (r6 < r7) goto L7e
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        L7e:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r7 = "Not enough data available"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8678(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8679(io.ktor.utils.io.InterfaceC4251 r8, long r9, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L34
            long r8 = r0.J$0
            java.lang.Object r10 = r0.L$1
            kotlinx.io.飘花落叶言子楪苏哲兰世 r10 = (kotlinx.io.InterfaceC5483) r10
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r2 = (io.ktor.utils.io.InterfaceC4251) r2
            kotlin.AbstractC5184.m10206(r11)
            r11 = r10
            r9 = r8
            r8 = r2
            goto L43
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            r8 = 0
            return r8
        L3b:
            kotlin.AbstractC5184.m10206(r11)
            kotlinx.io.飘花落叶言子楪世苏哲兰 r11 = new kotlinx.io.飘花落叶言子楪世苏哲兰
            r11.<init>()
        L43:
            boolean r2 = r8.mo8651()
            if (r2 != 0) goto L8b
            r4 = 0
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 <= 0) goto L8b
            kotlinx.io.飘花落叶言子楪苏兰世哲 r2 = r8.mo8653()
            long r6 = p058.AbstractC6854.m12051(r2)
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 < 0) goto L73
            kotlinx.io.飘花落叶言子楪苏兰世哲 r2 = r8.mo8653()
            long r4 = p058.AbstractC6854.m12051(r2)
            long r4 = r9 - r4
            kotlinx.io.飘花落叶言子楪苏兰世哲 r9 = r8.mo8653()
            long r9 = r9.mo10597(r11)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            goto L7a
        L73:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r2 = r8.mo8653()
            r2.mo10596(r11, r9)
        L7a:
            r0.L$0 = r8
            r0.L$1 = r11
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r9 = r8.mo8652(r3, r0)
            if (r9 != r1) goto L89
            return r1
        L89:
            r9 = r4
            goto L43
        L8b:
            kotlinx.io.飘花落叶言子楪世苏哲兰 r11 = (kotlinx.io.C5476) r11
            r11.getClass()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8679(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:24:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:23:0x0065). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8680(io.ktor.utils.io.InterfaceC4251 r11, int r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            int r11 = r0.I$0
            java.lang.Object r12 = r0.L$1
            kotlinx.io.飘花落叶言子楪世苏哲兰 r12 = (kotlinx.io.C5476) r12
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r2 = (io.ktor.utils.io.InterfaceC4251) r2
            kotlin.AbstractC5184.m10206(r13)
            goto L65
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            r11 = 0
            return r11
        L38:
            kotlin.AbstractC5184.m10206(r13)
            kotlinx.io.飘花落叶言子楪世苏哲兰 r13 = new kotlinx.io.飘花落叶言子楪世苏哲兰
            r13.<init>()
            r10 = r13
            r13 = r12
            r12 = r10
        L43:
            long r4 = r12.f15142
            long r6 = (long) r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L97
            kotlinx.io.飘花落叶言子楪苏兰世哲 r2 = r11.mo8653()
            boolean r2 = r2.mo10601()
            if (r2 == 0) goto L67
            r0.L$0 = r11
            r0.L$1 = r12
            r0.I$0 = r13
            r0.label = r3
            java.lang.Object r2 = r11.mo8652(r3, r0)
            if (r2 != r1) goto L63
            return r1
        L63:
            r2 = r11
            r11 = r13
        L65:
            r13 = r11
            r11 = r2
        L67:
            boolean r2 = r11.mo8651()
            if (r2 != 0) goto L97
            kotlinx.io.飘花落叶言子楪苏兰世哲 r2 = r11.mo8653()
            long r4 = p058.AbstractC6854.m12051(r2)
            long r6 = (long) r13
            long r8 = r12.f15142
            long r8 = r6 - r8
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L89
            kotlinx.io.飘花落叶言子楪苏兰世哲 r2 = r11.mo8653()
            long r4 = r12.f15142
            long r6 = r6 - r4
            r2.mo10596(r12, r6)
            goto L43
        L89:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r2 = r11.mo8653()
            long r4 = r2.mo10597(r12)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            goto L43
        L97:
            long r0 = r12.f15142
            long r2 = (long) r13
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 < 0) goto L9f
            return r12
        L9f:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r13 = androidx.activity.AbstractC0053.m148(r13, r0, r1)
            long r0 = r12.f15142
            r13.append(r0)
            java.lang.String r12 = " available"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8680(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8681(io.ktor.utils.io.InterfaceC4251 r6, int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.io.IOException {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.L$0
            java.lang.StringBuilder r6 = (java.lang.StringBuilder) r6
            kotlin.AbstractC5184.m10206(r8)
            goto L48
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L32:
            kotlin.AbstractC5184.m10206(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r6 = m8682(r6, r8, r7, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r8
            r8 = r6
            r6 = r5
        L48:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L51
            return r3
        L51:
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8681(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r24.mo8652(1, r2) == r3) goto L76;
     */
    /* JADX WARN: Path cross not found for [B:37:0x00cf, B:47:0x0110], limit reached: 98 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ae -> B:35:0x00b2). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8682(io.ktor.utils.io.InterfaceC4251 r24, java.lang.Appendable r25, int r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8682(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, java.lang.Appendable, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlinx.io.飘花落叶言子楪世苏哲兰] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8683(io.ktor.utils.io.InterfaceC4251 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            kotlinx.io.飘花落叶言子楪苏哲兰世 r4 = (kotlinx.io.InterfaceC5483) r4
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r2 = (io.ktor.utils.io.InterfaceC4251) r2
            kotlin.AbstractC5184.m10206(r5)
            r5 = r4
            r4 = r2
            goto L40
        L31:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L38:
            kotlin.AbstractC5184.m10206(r5)
            kotlinx.io.飘花落叶言子楪世苏哲兰 r5 = new kotlinx.io.飘花落叶言子楪世苏哲兰
            r5.<init>()
        L40:
            boolean r2 = r4.mo8651()
            if (r2 != 0) goto L5c
            kotlinx.io.飘花落叶言子楪苏兰世哲 r2 = r4.mo8653()
            kotlinx.io.飘花落叶言子楪世苏哲兰 r5 = (kotlinx.io.C5476) r5
            r5.m10609(r2)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r2 = r4.mo8652(r3, r0)
            if (r2 != r1) goto L40
            return r1
        L5c:
            java.lang.Throwable r4 = r4.mo8654()
            if (r4 != 0) goto L68
            kotlinx.io.飘花落叶言子楪世苏哲兰 r5 = (kotlinx.io.C5476) r5
            r5.getClass()
            return r5
        L68:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8683(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8684(io.ktor.utils.io.InterfaceC4251 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r4 = (io.ktor.utils.io.InterfaceC4251) r4
            kotlin.AbstractC5184.m10206(r5)
            goto L41
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC5184.m10206(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 2
            java.lang.Object r5 = m8678(r4, r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r4 = r4.mo8653()
            short r4 = r4.readShort()
            java.lang.Short r5 = new java.lang.Short
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8684(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8685(io.ktor.utils.io.InterfaceC4251 r7, byte[] r8, int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = -1
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 != r5) goto L39
            int r9 = r0.I$1
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$1
            byte[] r8 = (byte[]) r8
            java.lang.Object r0 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r0 = (io.ktor.utils.io.InterfaceC4251) r0
            kotlin.AbstractC5184.m10206(r10)
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r0
            goto L6d
        L39:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            r7 = 0
            return r7
        L40:
            kotlin.AbstractC5184.m10206(r10)
            boolean r10 = r7.mo8651()
            if (r10 == 0) goto L4f
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r4)
            return r7
        L4f:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r10 = r7.mo8653()
            boolean r10 = r10.mo10601()
            if (r10 == 0) goto L71
            r0.L$0 = r7
            r0.L$1 = r8
            r0.I$0 = r3
            r0.I$1 = r9
            r0.label = r5
            java.lang.Object r10 = r7.mo8652(r5, r0)
            if (r10 != r1) goto L6a
            return r1
        L6a:
            r10 = r9
            r9 = r8
            r8 = r3
        L6d:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L73
        L71:
            r10 = r9
            r9 = r3
        L73:
            boolean r0 = r7.mo8651()
            if (r0 == 0) goto L7f
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r4)
            return r7
        L7f:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r7 = r7.mo8653()
            r7.getClass()
            r8.getClass()
            int r10 = r10 + r9
            int r7 = r7.mo10603(r9, r8, r10)
            if (r7 != r4) goto L91
            goto L92
        L91:
            r3 = r7
        L92:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8685(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, byte[], int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8686(io.ktor.utils.io.InterfaceC4251 r5, java.nio.ByteBuffer r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1 r0 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1 r0 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L31
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r5 = (io.ktor.utils.io.InterfaceC4251) r5
            kotlin.AbstractC5184.m10206(r7)
            goto L5e
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            r5 = 0
            return r5
        L38:
            kotlin.AbstractC5184.m10206(r7)
            boolean r7 = r5.mo8651()
            if (r7 == 0) goto L47
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            return r5
        L47:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r7 = r5.mo8653()
            boolean r7 = r7.mo10601()
            if (r7 == 0) goto L5e
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.mo8652(r4, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            boolean r7 = r5.mo8651()
            if (r7 == 0) goto L6a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            return r5
        L6a:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r5 = r5.mo8653()
            int r5 = kotlinx.io.AbstractC5477.m10623(r5, r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8686(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8687(io.ktor.utils.io.InterfaceC4251 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r4 = (io.ktor.utils.io.InterfaceC4251) r4
            kotlin.AbstractC5184.m10206(r5)
            goto L41
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC5184.m10206(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 4
            java.lang.Object r5 = m8678(r4, r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r4 = r4.mo8653()
            int r4 = r4.readInt()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8687(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8688(io.ktor.utils.io.InterfaceC4251 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r4 = (io.ktor.utils.io.InterfaceC4251) r4
            kotlin.AbstractC5184.m10206(r5)
            goto L42
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC5184.m10206(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 8
            java.lang.Object r5 = m8678(r4, r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r4 = r4.mo8653()
            long r4 = r4.readLong()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8688(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8689(io.ktor.utils.io.InterfaceC4251 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            kotlinx.io.飘花落叶言子楪世苏哲兰 r4 = (kotlinx.io.C5476) r4
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r2 = (io.ktor.utils.io.InterfaceC4251) r2
            kotlin.AbstractC5184.m10206(r5)
            r5 = r4
            r4 = r2
            goto L40
        L31:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L38:
            kotlin.AbstractC5184.m10206(r5)
            kotlinx.io.飘花落叶言子楪世苏哲兰 r5 = new kotlinx.io.飘花落叶言子楪世苏哲兰
            r5.<init>()
        L40:
            boolean r2 = r4.mo8651()
            if (r2 != 0) goto L5a
            kotlinx.io.飘花落叶言子楪苏兰世哲 r2 = r4.mo8653()
            r5.m10609(r2)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r2 = r4.mo8652(r3, r0)
            if (r2 != r1) goto L40
            return r1
        L5a:
            java.lang.Throwable r4 = r4.mo8654()
            if (r4 != 0) goto L61
            return r5
        L61:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8689(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8690(io.ktor.utils.io.InterfaceC4251 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r4 = (io.ktor.utils.io.InterfaceC4251) r4
            kotlin.AbstractC5184.m10206(r5)
            goto L4a
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC5184.m10206(r5)
            kotlinx.io.飘花落叶言子楪苏兰世哲 r5 = r4.mo8653()
            boolean r5 = r5.mo10601()
            if (r5 == 0) goto L4a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.mo8652(r3, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r5 = r4.mo8653()
            boolean r5 = r5.mo10601()
            if (r5 != 0) goto L61
            kotlinx.io.飘花落叶言子楪苏兰世哲 r4 = r4.mo8653()
            byte r4 = r4.readByte()
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            return r4
        L61:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r5 = "Not enough data available"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8690(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004a -> B:26:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005b -> B:25:0x005e). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8691(io.ktor.utils.io.InterfaceC4251 r10, long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.io.EOFException {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            long r10 = r0.J$1
            long r4 = r0.J$0
            java.lang.Object r12 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r12 = (io.ktor.utils.io.InterfaceC4251) r12
            kotlin.AbstractC5184.m10206(r13)
            goto L5e
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r10)
            r10 = 0
            return r10
        L36:
            kotlin.AbstractC5184.m10206(r13)
            r4 = r11
        L3a:
            r6 = 0
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 <= 0) goto L76
            boolean r13 = r10.mo8651()
            if (r13 != 0) goto L76
            int r13 = m8693(r10)
            if (r13 != 0) goto L61
            r0.L$0 = r10
            r0.J$0 = r4
            r0.J$1 = r11
            r0.label = r3
            java.lang.Object r13 = r10.mo8652(r3, r0)
            if (r13 != r1) goto L5b
            return r1
        L5b:
            r8 = r11
            r12 = r10
            r10 = r8
        L5e:
            r8 = r10
            r10 = r12
            r11 = r8
        L61:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r13 = r10.mo8653()
            long r6 = p058.AbstractC6854.m12051(r13)
            long r6 = java.lang.Math.min(r11, r6)
            kotlinx.io.飘花落叶言子楪苏兰世哲 r13 = r10.mo8653()
            p058.AbstractC6854.m12052(r13, r6)
            long r11 = r11 - r6
            goto L3a
        L76:
            long r4 = r4 - r11
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8691(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[PHI: r2 r3 r7 r9
  0x0069: PHI (r2v2 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) = (r2v1 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世), (r2v3 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) binds: [B:23:0x005e, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r3v3 kotlin.jvm.internal.Ref$LongRef) = (r3v1 kotlin.jvm.internal.Ref$LongRef), (r3v4 kotlin.jvm.internal.Ref$LongRef) binds: [B:23:0x005e, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r7v8 io.ktor.utils.io.飘花落叶言子楪苏兰哲世) = (r7v0 io.ktor.utils.io.飘花落叶言子楪苏兰哲世), (r7v10 io.ktor.utils.io.飘花落叶言子楪苏兰哲世) binds: [B:23:0x005e, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r9v2 long) = (r9v0 long), (r9v3 long) binds: [B:23:0x005e, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007b -> B:45:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0099 -> B:35:0x009d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8692(io.ktor.utils.io.InterfaceC4251 r7, final java.nio.channels.FileChannel r8, final long r9, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8692(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, java.nio.channels.FileChannel, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int m8693(InterfaceC4251 interfaceC4251) {
        interfaceC4251.getClass();
        return (int) interfaceC4251.mo8653().mo10600().f15142;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable m8694(io.ktor.utils.io.InterfaceC4251 r5, int r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            int r6 = r0.I$0
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r5 = (io.ktor.utils.io.InterfaceC4251) r5
            kotlin.AbstractC5184.m10206(r7)
            goto L4b
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r4
        L34:
            kotlin.AbstractC5184.m10206(r7)
            boolean r7 = r5.mo8651()
            if (r7 == 0) goto L3e
            goto L53
        L3e:
            r0.L$0 = r5
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.mo8652(r6, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L54
        L53:
            return r4
        L54:
            kotlinx.io.飘花落叶言子楪苏兰世哲 r5 = r5.mo8653()
            kotlinx.io.飘花落叶言子楪世兰哲苏 r5 = r5.peek()
            byte[] r5 = kotlinx.io.AbstractC5477.m10628(r5, r6)
            飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰 r6 = new 飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8694(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8695(io.ktor.utils.io.InterfaceC4251 r4, long r5, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.io.EOFException {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            long r5 = r0.J$0
            kotlin.AbstractC5184.m10206(r7)
            goto L3e
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L30:
            kotlin.AbstractC5184.m10206(r7)
            r0.J$0 = r5
            r0.label = r3
            java.lang.Object r7 = m8691(r4, r5, r0)
            if (r7 != r1) goto L3e
            return r1
        L3e:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 < 0) goto L4b
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5175.f14739
            return r4
        L4b:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to discard "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = " bytes"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8695(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8696(io.ktor.utils.io.InterfaceC4246 r3, kotlin.coroutines.jvm.internal.ContinuationImpl r4) {
        /*
            r3.getClass()
            r0 = r3
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r0 = (io.ktor.utils.io.C4248) r0
            java.lang.Throwable r1 = r0.mo8654()
            if (r1 != 0) goto L36
            boolean r1 = r3 instanceof io.ktor.utils.io.C4248
            if (r1 == 0) goto L13
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r3 = (io.ktor.utils.io.C4248) r3
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 == 0) goto L1c
            boolean r3 = r3.f12761
            r1 = 1
            if (r3 != r1) goto L1c
            goto L2a
        L1c:
            kotlinx.io.飘花落叶言子楪世苏哲兰 r3 = r0.m8712()
            r3.getClass()
            long r1 = r3.f15142
            int r3 = (int) r1
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r3 < r1) goto L33
        L2a:
            java.lang.Object r3 = r0.m8710(r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r3 != r4) goto L33
            return r3
        L33:
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5175.f14739
            return r3
        L36:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.AbstractC4243.m8696(io.ktor.utils.io.飘花落叶言子楪哲苏世兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
