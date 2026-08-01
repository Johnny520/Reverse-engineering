package okhttp3.internal.p218ws;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import p376zd.C10003m;
import p376zd.C10023w;
import p376zd.C9987e;
import p376zd.C9995i;
import p376zd.InterfaceC9997j;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010 R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, m16758d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", _UrlKt.FRAGMENT_ENCODE_SET, "isClient", "Lzd/j;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", _UrlKt.FRAGMENT_ENCODE_SET, "minimumDeflateSize", "<init>", "(ZLzd/j;Ljava/util/Random;ZZJ)V", _UrlKt.FRAGMENT_ENCODE_SET, "opcode", "Lzd/m;", "payload", "Ll8/i0;", "writeControlFrame", "(ILzd/m;)V", "writePing", "(Lzd/m;)V", "writePong", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", "close", "()V", "Z", "Lzd/j;", "getSink", "()Lzd/j;", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "J", "Lzd/i;", "messageBuffer", "Lzd/i;", "sinkBuffer", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", _UrlKt.FRAGMENT_ENCODE_SET, "maskKey", "[B", "Lzd/i$a;", "maskCursor", "Lzd/i$a;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final C9995i.a maskCursor;
    private final byte[] maskKey;
    private final C9995i messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final InterfaceC9997j sink;
    private final C9995i sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z10, InterfaceC9997j interfaceC9997j, Random random, boolean z11, boolean z12, long j10) {
        interfaceC9997j.getClass();
        random.getClass();
        this.isClient = z10;
        this.sink = interfaceC9997j;
        this.random = random;
        this.perMessageDeflate = z11;
        this.noContextTakeover = z12;
        this.minimumDeflateSize = j10;
        this.messageBuffer = new C9995i();
        this.sinkBuffer = interfaceC9997j.mo38699b();
        this.maskKey = z10 ? new byte[4] : null;
        this.maskCursor = z10 ? new C9995i.a() : null;
    }

    private final void writeControlFrame(int opcode, C10003m payload) throws IOException {
        if (this.writerClosed) {
            C10023w.m38841a("closed");
            return;
        }
        int iM38765G = payload.m38765G();
        if (iM38765G > 125) {
            C9987e.m38645a("Payload size must be less than or equal to 125");
            return;
        }
        this.sinkBuffer.writeByte(opcode | 128);
        boolean z10 = this.isClient;
        C9995i c9995i = this.sinkBuffer;
        if (z10) {
            c9995i.writeByte(iM38765G | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            bArr.getClass();
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (iM38765G > 0) {
                long size = this.sinkBuffer.size();
                this.sinkBuffer.mo38736y0(payload);
                C9995i c9995i2 = this.sinkBuffer;
                C9995i.a aVar = this.maskCursor;
                aVar.getClass();
                c9995i2.m38734x(aVar);
                this.maskCursor.m38742h(size);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            c9995i.writeByte(iM38765G);
            this.sinkBuffer.mo38736y0(payload);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            _UtilCommonKt.closeQuietly(messageDeflater);
        }
        _UtilCommonKt.closeQuietly(this.sink);
    }

    public final Random getRandom() {
        return this.random;
    }

    public final InterfaceC9997j getSink() {
        return this.sink;
    }

    public final void writeClose(int code, C10003m reason) {
        C10003m c10003mMo38717l0 = C10003m.f33583u;
        if (code != 0 || reason != null) {
            if (code != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            C9995i c9995i = new C9995i();
            c9995i.writeShort(code);
            if (reason != null) {
                c9995i.mo38736y0(reason);
            }
            c10003mMo38717l0 = c9995i.mo38717l0();
        }
        try {
            writeControlFrame(8, c10003mMo38717l0);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int formatOpcode, C10003m data) throws IllegalAccessException, IOException, InvocationTargetException {
        data.getClass();
        if (this.writerClosed) {
            C10023w.m38841a("closed");
            return;
        }
        this.messageBuffer.mo38736y0(data);
        int i10 = formatOpcode | 128;
        if (this.perMessageDeflate && data.m38765G() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i10 = formatOpcode | Opcodes.CHECKCAST;
        }
        long size = this.messageBuffer.size();
        this.sinkBuffer.writeByte(i10);
        int i11 = this.isClient ? 128 : 0;
        if (size <= 125) {
            this.sinkBuffer.writeByte(i11 | ((int) size));
        } else {
            C9995i c9995i = this.sinkBuffer;
            if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                c9995i.writeByte(i11 | 126);
                this.sinkBuffer.writeShort((int) size);
            } else {
                c9995i.writeByte(i11 | 127);
                this.sinkBuffer.m38731v0(size);
            }
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            bArr.getClass();
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                C9995i c9995i2 = this.messageBuffer;
                C9995i.a aVar = this.maskCursor;
                aVar.getClass();
                c9995i2.m38734x(aVar);
                this.maskCursor.m38742h(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, size);
        this.sink.flush();
    }

    public final void writePing(C10003m payload) throws IOException {
        payload.getClass();
        writeControlFrame(9, payload);
    }

    public final void writePong(C10003m payload) throws IOException {
        payload.getClass();
        writeControlFrame(10, payload);
    }
}
