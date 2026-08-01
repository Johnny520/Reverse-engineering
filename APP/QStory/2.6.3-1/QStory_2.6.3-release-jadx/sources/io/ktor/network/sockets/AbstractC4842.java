package io.ktor.network.sockets;

import androidx.activity.AbstractC0900;
import com.materialkolor.dynamiccolor.C4639;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.C6283;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import kotlinx.p010io.C6311;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4842 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4639 f12618;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4639 f12619;

    static {
        int i = 14;
        f12619 = new C4639(i);
        f12618 = new C4639(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC4855 m8978(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return new C4861((InetSocketAddress) socketAddress);
        }
        if (socketAddress.getClass().getName().equals("java.net.UnixDomainSocketAddress")) {
            return new C4851(socketAddress);
        }
        C6755.m11870("Unknown socket address type");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8979(C4857 c4857, ContinuationImpl continuationImpl) {
        SocketsKt$awaitClosed$1 socketsKt$awaitClosed$1;
        InterfaceC4844 interfaceC4844;
        if (continuationImpl instanceof SocketsKt$awaitClosed$1) {
            socketsKt$awaitClosed$1 = (SocketsKt$awaitClosed$1) continuationImpl;
            int i = socketsKt$awaitClosed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                socketsKt$awaitClosed$1.label = i - Integer.MIN_VALUE;
            } else {
                socketsKt$awaitClosed$1 = new SocketsKt$awaitClosed$1(continuationImpl);
            }
        }
        Object obj = socketsKt$awaitClosed$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = socketsKt$awaitClosed$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C6283 c6283 = c4857.f12631;
            socketsKt$awaitClosed$1.L$0 = c4857;
            socketsKt$awaitClosed$1.label = 1;
            interfaceC4844 = c4857;
            if (c6283.mo11123(socketsKt$awaitClosed$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC4844 interfaceC48442 = (InterfaceC4844) socketsKt$awaitClosed$1.L$0;
            AbstractC6017.m10769(obj);
            interfaceC4844 = interfaceC48442;
        }
        if (interfaceC4844.mo8982().isCancelled()) {
            throw interfaceC4844.mo8982().mo11122();
        }
        return C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8980(InterfaceC5079 interfaceC5079, ReadableByteChannel readableByteChannel, ContinuationImpl continuationImpl) throws Throwable {
        CIOReaderKt$readFrom$1 cIOReaderKt$readFrom$1;
        Ref$IntRef ref$IntRef;
        if (continuationImpl instanceof CIOReaderKt$readFrom$1) {
            cIOReaderKt$readFrom$1 = (CIOReaderKt$readFrom$1) continuationImpl;
            int i = cIOReaderKt$readFrom$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOReaderKt$readFrom$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOReaderKt$readFrom$1 = new CIOReaderKt$readFrom$1(continuationImpl);
            }
        }
        Object obj = cIOReaderKt$readFrom$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOReaderKt$readFrom$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            cIOReaderKt$readFrom$1.L$0 = ref$IntRef2;
            cIOReaderKt$readFrom$1.label = 1;
            C5081 c5081 = (C5081) interfaceC5079;
            C6309 c6309M9261 = c5081.m9261();
            c6309M9261.getClass();
            C6311 c6311M11171 = c6309M9261.m11171(1);
            byte[] bArr = c6311M11171.f15495;
            int i3 = c6311M11171.f15493;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i3, bArr.length - i3);
            byteBufferWrap.getClass();
            ref$IntRef2.element = readableByteChannel.read(byteBufferWrap);
            int iPosition = byteBufferWrap.position() - i3;
            if (iPosition == 1) {
                c6311M11171.f15493 += iPosition;
                c6309M9261.f15487 += (long) iPosition;
            } else {
                if (iPosition < 0 || iPosition > c6311M11171.m11197()) {
                    C5043.m9167(AbstractC0900.m710(iPosition, "Invalid number of bytes written: ", ". Should be in 0.."), c6311M11171.m11197());
                    return null;
                }
                if (iPosition != 0) {
                    c6311M11171.f15493 += iPosition;
                    c6309M9261.f15487 += (long) iPosition;
                } else if (AbstractC6310.m11187(c6311M11171)) {
                    c6309M9261.m11168();
                }
            }
            Object objM9259 = c5081.m9259(cIOReaderKt$readFrom$1);
            if (objM9259 != coroutineSingletons) {
                objM9259 = C6008.f15084;
            }
            if (objM9259 == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$IntRef = ref$IntRef2;
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$IntRef = (Ref$IntRef) cIOReaderKt$readFrom$1.L$0;
            AbstractC6017.m10769(obj);
        }
        return new Integer(ref$IntRef.element);
    }
}
