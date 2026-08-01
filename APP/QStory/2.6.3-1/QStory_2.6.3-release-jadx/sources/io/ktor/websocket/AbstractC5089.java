package io.ktor.websocket;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.C6309;
import p074.AbstractC7684;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5089 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m9269(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byteBuffer2.getClass();
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        int iRemaining = byteBufferSlice2.remaining();
        int iRemaining2 = byteBufferSlice.remaining();
        for (int i = 0; i < iRemaining2; i++) {
            byteBufferSlice.put(i, (byte) (byteBufferSlice.get(i) ^ byteBufferSlice2.get(i % iRemaining)));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5095 m9270(C5110 c5110) throws EOFException {
        byte[] bArr = c5110.f13181;
        if (bArr.length < 2) {
            return null;
        }
        C6309 c6309 = new C6309();
        AbstractC7684.m12642(c6309, bArr, 0, bArr.length);
        return new C5095(AbstractC7684.m12636(c6309, null, 3), c6309.readShort());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object m9271(InterfaceC5090 interfaceC5090, Throwable th, ContinuationImpl continuationImpl) {
        Object objM9273 = m9273(interfaceC5090, th instanceof CancellationException ? new C5095(CloseReason$Codes.NORMAL, "") : new C5095(CloseReason$Codes.INTERNAL_ERROR, th.toString()), continuationImpl);
        return objM9273 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM9273 : C6008.f15084;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r6.mo9107(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9273(InterfaceC5090 interfaceC5090, C5095 c5095, ContinuationImpl continuationImpl) {
        WebSocketSessionKt$close$1 webSocketSessionKt$close$1;
        if (continuationImpl instanceof WebSocketSessionKt$close$1) {
            webSocketSessionKt$close$1 = (WebSocketSessionKt$close$1) continuationImpl;
            int i = webSocketSessionKt$close$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketSessionKt$close$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketSessionKt$close$1 = new WebSocketSessionKt$close$1(continuationImpl);
            }
        }
        Object obj = webSocketSessionKt$close$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = webSocketSessionKt$close$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C5110 c5110 = new C5110(c5095);
            webSocketSessionKt$close$1.L$0 = interfaceC5090;
            webSocketSessionKt$close$1.label = 1;
            if (interfaceC5090.mo9105(c5110, webSocketSessionKt$close$1) == coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC5090 = (InterfaceC5090) webSocketSessionKt$close$1.L$0;
        AbstractC6017.m10769(obj);
        webSocketSessionKt$close$1.L$0 = null;
        webSocketSessionKt$close$1.label = 2;
    }
}
