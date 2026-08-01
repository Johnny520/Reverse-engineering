package io.ktor.network.sockets;

import com.materialkolor.dynamiccolor.C3807;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4010 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3807 f12273;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3807 f12274;

    static {
        int i = 14;
        f12274 = new C3807(i);
        f12273 = new C3807(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC4023 m8419(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return new C4029((InetSocketAddress) socketAddress);
        }
        if (socketAddress.getClass().getName().equals("java.net.UnixDomainSocketAddress")) {
            return new C4019(socketAddress);
        }
        C5925.m11311("Unknown socket address type");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8420(io.ktor.network.sockets.C4025 r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.network.sockets.SocketsKt$awaitClosed$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.network.sockets.SocketsKt$awaitClosed$1 r0 = (io.ktor.network.sockets.SocketsKt$awaitClosed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.sockets.SocketsKt$awaitClosed$1 r0 = new io.ktor.network.sockets.SocketsKt$awaitClosed$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.network.sockets.飘花落叶言子楪世哲兰苏 r4 = (io.ktor.network.sockets.InterfaceC4012) r4
            kotlin.AbstractC5185.m10210(r5)
            goto L42
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC5185.m10210(r5)
            kotlinx.coroutines.飘花落叶言子苏世哲楪兰 r5 = r4.f12286
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.mo10564(r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r5 = r4.mo8423()
            boolean r5 = r5.isCancelled()
            if (r5 != 0) goto L4f
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            return r4
        L4f:
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r4 = r4.mo8423()
            java.util.concurrent.CancellationException r4 = r4.mo10563()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.AbstractC4010.m8420(io.ktor.network.sockets.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8421(io.ktor.utils.io.InterfaceC4247 r9, java.nio.channels.ReadableByteChannel r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof io.ktor.network.sockets.CIOReaderKt$readFrom$1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.network.sockets.CIOReaderKt$readFrom$1 r0 = (io.ktor.network.sockets.CIOReaderKt$readFrom$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.sockets.CIOReaderKt$readFrom$1 r0 = new io.ktor.network.sockets.CIOReaderKt$readFrom$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2d
            java.lang.Object r9 = r0.L$0
            kotlin.jvm.internal.Ref$IntRef r9 = (kotlin.jvm.internal.Ref$IntRef) r9
            kotlin.AbstractC5185.m10210(r11)
            goto L9e
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return r3
        L33:
            kotlin.AbstractC5185.m10210(r11)
            kotlin.jvm.internal.Ref$IntRef r11 = new kotlin.jvm.internal.Ref$IntRef
            r11.<init>()
            r0.L$0 = r11
            r0.label = r4
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r9 = (io.ktor.utils.io.C4249) r9
            kotlinx.io.飘花落叶言子楪世苏哲兰 r2 = r9.m8702()
            r2.getClass()
            kotlinx.io.飘花落叶言子楪苏世兰哲 r5 = r2.m10612(r4)
            byte[] r6 = r5.f15150
            int r7 = r5.f15148
            int r8 = r6.length
            int r8 = r8 - r7
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6, r7, r8)
            r6.getClass()
            int r10 = r10.read(r6)
            r11.element = r10
            int r10 = r6.position()
            int r10 = r10 - r7
            if (r10 != r4) goto L72
            int r3 = r5.f15148
            int r3 = r3 + r10
            r5.f15148 = r3
            long r3 = r2.f15142
            long r5 = (long) r10
            long r3 = r3 + r5
            r2.f15142 = r3
            goto L91
        L72:
            if (r10 < 0) goto La6
            int r4 = r5.m10638()
            if (r10 > r4) goto La6
            if (r10 == 0) goto L88
            int r3 = r5.f15148
            int r3 = r3 + r10
            r5.f15148 = r3
            long r3 = r2.f15142
            long r5 = (long) r10
            long r3 = r3 + r5
            r2.f15142 = r3
            goto L91
        L88:
            boolean r10 = kotlinx.io.AbstractC5478.m10628(r5)
            if (r10 == 0) goto L91
            r2.m10609()
        L91:
            java.lang.Object r9 = r9.m8700(r0)
            if (r9 != r1) goto L98
            goto L9a
        L98:
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5176.f14739
        L9a:
            if (r9 != r1) goto L9d
            return r1
        L9d:
            r9 = r11
        L9e:
            int r9 = r9.element
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            return r10
        La6:
            java.lang.String r9 = "Invalid number of bytes written: "
            java.lang.String r11 = ". Should be in 0.."
            java.lang.StringBuilder r9 = androidx.activity.AbstractC0053.m150(r10, r9, r11)
            int r10 = r5.m10638()
            io.ktor.util.C4211.m8608(r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.AbstractC4010.m8421(io.ktor.utils.io.飘花落叶言子楪哲苏世兰, java.nio.channels.ReadableByteChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
