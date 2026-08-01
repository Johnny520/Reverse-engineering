package io.ktor.websocket;

import androidx.appcompat.widget.C0984;
import bsh.C3466;
import io.ktor.util.AbstractC5049;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5084;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import lin.xposed.hook.javaplugin.C6385;
import p073.InterfaceC7680;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5100 implements InterfaceC6233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5103 f13153;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public WebSocketReader$State f13154;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0984 f13155;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C6022 f13156;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5192 f13157;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f13158;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5084 f13159;

    public C5100(InterfaceC5084 interfaceC5084, InterfaceC5192 interfaceC5192, long j, InterfaceC7680 interfaceC7680) {
        interfaceC5084.getClass();
        interfaceC5192.getClass();
        this.f13159 = interfaceC5084;
        this.f13157 = interfaceC5192;
        this.f13158 = j;
        this.f13154 = WebSocketReader$State.HEADER;
        this.f13153 = new C5103();
        this.f13155 = new C0984((byte) 0, 5);
        this.f13156 = AbstractC6037.m10841(8, 6, null);
        AbstractC6231.m11037(this, new C6234("ws-reader"), CoroutineStart.ATOMIC, new WebSocketReader$readerJob$1(interfaceC7680, this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r7.m9281(r6, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:13:0x0034). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9280(C5100 c5100, ByteBuffer byteBuffer, ContinuationImpl continuationImpl) {
        WebSocketReader$readLoop$1 webSocketReader$readLoop$1;
        C5100 c51002;
        ByteBuffer byteBuffer2;
        c5100.getClass();
        if (continuationImpl instanceof WebSocketReader$readLoop$1) {
            webSocketReader$readLoop$1 = (WebSocketReader$readLoop$1) continuationImpl;
            int i = webSocketReader$readLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketReader$readLoop$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketReader$readLoop$1 = new WebSocketReader$readLoop$1(c5100, continuationImpl);
            }
        }
        Object objM9235 = webSocketReader$readLoop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = webSocketReader$readLoop$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM9235);
            byteBuffer.clear();
            if (c5100.f13154 != WebSocketReader$State.CLOSED) {
            }
            return C6008.f15084;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            byteBuffer2 = (ByteBuffer) webSocketReader$readLoop$1.L$1;
            c51002 = (C5100) webSocketReader$readLoop$1.L$0;
            AbstractC6017.m10769(objM9235);
            C5100 c51003 = c51002;
            byteBuffer = byteBuffer2;
            c5100 = c51003;
            byteBuffer.compact();
            if (c5100.f13154 != WebSocketReader$State.CLOSED) {
                InterfaceC5084 interfaceC5084 = c5100.f13159;
                webSocketReader$readLoop$1.L$0 = c5100;
                webSocketReader$readLoop$1.L$1 = byteBuffer;
                webSocketReader$readLoop$1.label = 1;
                objM9235 = AbstractC5076.m9235(interfaceC5084, byteBuffer, webSocketReader$readLoop$1);
                if (objM9235 != coroutineSingletons) {
                    ByteBuffer byteBuffer3 = byteBuffer;
                    c51002 = c5100;
                    byteBuffer2 = byteBuffer3;
                    if (((Number) objM9235).intValue() != -1) {
                        c51002.f13154 = WebSocketReader$State.CLOSED;
                    } else {
                        byteBuffer2.flip();
                        webSocketReader$readLoop$1.L$0 = c51002;
                        webSocketReader$readLoop$1.L$1 = byteBuffer2;
                        webSocketReader$readLoop$1.label = 2;
                    }
                }
                return coroutineSingletons;
            }
            return C6008.f15084;
        }
        byteBuffer2 = (ByteBuffer) webSocketReader$readLoop$1.L$1;
        c51002 = (C5100) webSocketReader$readLoop$1.L$0;
        AbstractC6017.m10769(objM9235);
        if (((Number) objM9235).intValue() != -1) {
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f13157;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x024b, code lost:
    
        return kotlin.C6008.f15084;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010a, code lost:
    
        if (r4.get() != io.ktor.websocket.FrameParser$State.BODY) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010c, code lost:
    
        r2.f13154 = io.ktor.websocket.WebSocketReader$State.BODY;
        r10 = r9.f13173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0117, code lost:
    
        if (r10 > 2147483647L) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        if (r10 > r2.f13158) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011f, code lost:
    
        r4 = (int) r10;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
    
        if (r8.f941 != 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0127, code lost:
    
        r8.f941 = r4;
        r9 = (java.nio.ByteBuffer) r8.f940;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012d, code lost:
    
        if (r9 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        if (r9.capacity() >= r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
    
        r8.f940 = java.nio.ByteBuffer.allocate(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013b, code lost:
    
        r4 = (java.nio.ByteBuffer) r8.f940;
        r4.getClass();
        r4.clear();
        r4 = r8.f941;
        r9 = (java.nio.ByteBuffer) r8.f940;
        r9.getClass();
        r8.f941 = r4 - io.ktor.util.AbstractC5049.m9197(r0, r9, r8.f941);
        r1.L$0 = r2;
        r1.L$1 = r0;
        r1.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0161, code lost:
    
        if (r2.m9282(r1) != r3) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        top.suzhelan.qstory.hook.item.C6755.m11870("remaining should be 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0169, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0171, code lost:
    
        throw new io.ktor.websocket.FrameTooBigException(r9.f13173);
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9281(ByteBuffer byteBuffer, ContinuationImpl continuationImpl) throws FrameTooBigException, ProtocolViolationException {
        WebSocketReader$parseLoop$1 webSocketReader$parseLoop$1;
        C5100 c5100;
        ByteBuffer byteBuffer2;
        long j;
        if (continuationImpl instanceof WebSocketReader$parseLoop$1) {
            webSocketReader$parseLoop$1 = (WebSocketReader$parseLoop$1) continuationImpl;
            int i = webSocketReader$parseLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketReader$parseLoop$1.label = i - Integer.MIN_VALUE;
                c5100 = this;
            } else {
                c5100 = this;
                webSocketReader$parseLoop$1 = new WebSocketReader$parseLoop$1(c5100, continuationImpl);
            }
        }
        Object obj = webSocketReader$parseLoop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = webSocketReader$parseLoop$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            byteBuffer2 = byteBuffer;
        } else {
            if (i2 != 1 && i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ByteBuffer byteBuffer3 = (ByteBuffer) webSocketReader$parseLoop$1.L$1;
            C5100 c51002 = (C5100) webSocketReader$parseLoop$1.L$0;
            AbstractC6017.m10769(obj);
            byteBuffer2 = byteBuffer3;
            c5100 = c51002;
        }
        while (true) {
            if (!byteBuffer2.hasRemaining()) {
                break;
            }
            WebSocketReader$State webSocketReader$State = c5100.f13154;
            C0984 c0984 = c5100.f13155;
            C5103 c5103 = c5100.f13153;
            int i3 = AbstractC5099.f13152[webSocketReader$State.ordinal()];
            if (i3 == 1) {
                c5103.getClass();
                AtomicReference atomicReference = c5103.f13168;
                if (!AbstractC5227.m9466(byteBuffer2.order(), ByteOrder.BIG_ENDIAN)) {
                    C6385.m11431(byteBuffer2.order(), "Buffer order should be BIG_ENDIAN but it is ");
                    return null;
                }
                while (true) {
                    Object obj2 = atomicReference.get();
                    obj2.getClass();
                    int i4 = AbstractC5104.f13174[((FrameParser$State) obj2).ordinal()];
                    int i5 = 8;
                    if (i4 != 1) {
                        if (i4 == 2) {
                            int iRemaining = byteBuffer2.remaining();
                            int i6 = c5103.f13172;
                            if (iRemaining < i6) {
                                break;
                            }
                            if (i6 == 2) {
                                j = ((long) byteBuffer2.getShort()) & 65535;
                            } else {
                                if (i6 != 8) {
                                    C3466.m5901();
                                    return null;
                                }
                                j = byteBuffer2.getLong();
                            }
                            c5103.f13173 = j;
                            atomicReference.set(c5103.f13163 ? FrameParser$State.MASK_KEY : FrameParser$State.BODY);
                        } else if (i4 != 3) {
                            if (i4 != 4) {
                                C5043.m9170();
                                return null;
                            }
                        } else {
                            if (byteBuffer2.remaining() < 4) {
                                break;
                            }
                            c5103.f13171 = Integer.valueOf(byteBuffer2.getInt());
                            atomicReference.set(FrameParser$State.BODY);
                        }
                    } else {
                        if (byteBuffer2.remaining() < 2) {
                            break;
                        }
                        byte b = byteBuffer2.get();
                        byte b2 = byteBuffer2.get();
                        c5103.f13167 = (b & 128) != 0;
                        c5103.f13166 = (b & 64) != 0;
                        c5103.f13165 = (b & 32) != 0;
                        c5103.f13164 = (b & 16) != 0;
                        int i7 = b & 15;
                        c5103.f13170 = i7;
                        if (i7 == 0 && c5103.f13169 == 0) {
                            throw new ProtocolViolationException("Can't continue finished frames");
                        }
                        int i8 = c5103.f13169;
                        if (i7 == 0) {
                            c5103.f13170 = i8;
                        } else if (i8 != 0 && !c5103.m9283().getControlFrame()) {
                            throw new ProtocolViolationException("Can't start new data frame before finishing previous one");
                        }
                        boolean controlFrame = c5103.m9283().getControlFrame();
                        boolean z = c5103.f13167;
                        if (!controlFrame) {
                            c5103.f13169 = z ? 0 : c5103.f13170;
                        } else if (!z) {
                            throw new ProtocolViolationException("control frames can't be fragmented");
                        }
                        c5103.f13163 = (b2 & 128) != 0;
                        int i9 = b2 & 127;
                        if (c5103.m9283().getControlFrame() && i9 > 125) {
                            throw new ProtocolViolationException("control frames can't be larger than 125 bytes");
                        }
                        if (i9 == 126) {
                            i5 = 2;
                        } else if (i9 != 127) {
                            i5 = 0;
                        }
                        c5103.f13172 = i5;
                        c5103.f13173 = i5 == 0 ? i9 : 0L;
                        if (i5 > 0) {
                            atomicReference.set(FrameParser$State.LENGTH);
                        } else if (c5103.f13163) {
                            atomicReference.set(FrameParser$State.MASK_KEY);
                        } else {
                            atomicReference.set(FrameParser$State.BODY);
                        }
                    }
                }
            } else if (i3 == 2) {
                int i10 = c0984.f941;
                ByteBuffer byteBuffer4 = (ByteBuffer) c0984.f940;
                byteBuffer4.getClass();
                c0984.f941 = i10 - AbstractC5049.m9197(byteBuffer2, byteBuffer4, c0984.f941);
                webSocketReader$parseLoop$1.L$0 = c5100;
                webSocketReader$parseLoop$1.L$1 = byteBuffer2;
                webSocketReader$parseLoop$1.label = 2;
                if (c5100.m9282(webSocketReader$parseLoop$1) == coroutineSingletons) {
                    break;
                }
            } else if (i3 != 3) {
                C5043.m9170();
                return null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9282(ContinuationImpl continuationImpl) {
        WebSocketReader$handleFrameIfProduced$1 webSocketReader$handleFrameIfProduced$1;
        Object c5091;
        Object c5110;
        if (continuationImpl instanceof WebSocketReader$handleFrameIfProduced$1) {
            webSocketReader$handleFrameIfProduced$1 = (WebSocketReader$handleFrameIfProduced$1) continuationImpl;
            int i = webSocketReader$handleFrameIfProduced$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketReader$handleFrameIfProduced$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketReader$handleFrameIfProduced$1 = new WebSocketReader$handleFrameIfProduced$1(this, continuationImpl);
            }
        }
        Object obj = webSocketReader$handleFrameIfProduced$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = webSocketReader$handleFrameIfProduced$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C0984 c0984 = this.f13155;
            if (c0984.f941 <= 0) {
                C5103 c5103 = this.f13153;
                this.f13154 = c5103.m9283() == FrameType.CLOSE ? WebSocketReader$State.CLOSED : WebSocketReader$State.HEADER;
                boolean z = c5103.f13167;
                FrameType frameTypeM9283 = c5103.m9283();
                Integer num = c5103.f13171;
                ByteBuffer byteBuffer = (ByteBuffer) c0984.f939;
                ByteBuffer byteBuffer2 = (ByteBuffer) c0984.f940;
                byteBuffer2.getClass();
                byteBuffer2.flip();
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                if (num != null) {
                    byteBuffer.clear();
                    byteBuffer.asIntBuffer().put(num.intValue());
                    byteBuffer.clear();
                    byteBufferSlice.getClass();
                    AbstractC5089.m9269(byteBufferSlice, byteBuffer);
                }
                c0984.f940 = null;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferSlice.asReadOnlyBuffer();
                byteBufferAsReadOnlyBuffer.getClass();
                byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.remaining()];
                byteBufferAsReadOnlyBuffer.get(bArr);
                boolean z2 = c5103.f13166;
                boolean z3 = c5103.f13165;
                boolean z4 = c5103.f13164;
                int i3 = AbstractC5109.f13177[frameTypeM9283.ordinal()];
                if (i3 == 1) {
                    c5091 = new C5091(z, FrameType.BINARY, bArr, z2, z3, z4);
                } else if (i3 != 2) {
                    if (i3 == 3) {
                        c5110 = new C5110(bArr);
                    } else if (i3 == 4) {
                        c5110 = new C5113(bArr);
                    } else {
                        if (i3 != 5) {
                            C5043.m9170();
                            return null;
                        }
                        c5110 = new C5114(bArr, C5108.f13176);
                    }
                    webSocketReader$handleFrameIfProduced$1.L$0 = this;
                    webSocketReader$handleFrameIfProduced$1.label = 1;
                    if (this.f13156.mo8992(c5110, webSocketReader$handleFrameIfProduced$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    c5091 = new C5111(z, FrameType.TEXT, bArr, z2, z3, z4);
                }
                c5110 = c5091;
                webSocketReader$handleFrameIfProduced$1.L$0 = this;
                webSocketReader$handleFrameIfProduced$1.label = 1;
                if (this.f13156.mo8992(c5110, webSocketReader$handleFrameIfProduced$1) == coroutineSingletons) {
                }
            }
            return C6008.f15084;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = (C5100) webSocketReader$handleFrameIfProduced$1.L$0;
        AbstractC6017.m10769(obj);
        C5103 c51032 = this.f13153;
        AtomicReference atomicReference = c51032.f13168;
        FrameParser$State frameParser$State = FrameParser$State.BODY;
        FrameParser$State frameParser$State2 = FrameParser$State.HEADER0;
        while (!atomicReference.compareAndSet(frameParser$State, frameParser$State2)) {
            if (atomicReference.get() != frameParser$State) {
                C5043.m9164(atomicReference.get(), "It should be state BODY but it is ");
                return null;
            }
        }
        c51032.f13170 = 0;
        c51032.f13173 = 0L;
        c51032.f13172 = 0;
        c51032.f13171 = null;
        return C6008.f15084;
    }
}
