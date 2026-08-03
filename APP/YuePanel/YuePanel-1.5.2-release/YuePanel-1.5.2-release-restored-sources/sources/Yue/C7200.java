package Yue;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: Yue.ۥۡۧۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7200 implements InterfaceC8533, ByteChannel, InterfaceC5405 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final InterfaceC5866 f21738 = C5867.m18162(C7200.class);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final SocketChannel f21739;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final SSLEngine f21740;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public ByteBuffer f21741;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public ByteBuffer f21742;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public ByteBuffer f21743;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public ByteBuffer f21744;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public ExecutorService f21745;

    /* JADX INFO: renamed from: Yue.ۥۡۧۡۨ$ۥ */
    public static /* synthetic */ class C1205 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f2735;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final /* synthetic */ int[] f2736;

        static {
            int[] iArr = new int[SSLEngineResult.HandshakeStatus.values().length];
            f2736 = iArr;
            try {
                iArr[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2736[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2736[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2736[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2736[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[SSLEngineResult.Status.values().length];
            f2735 = iArr2;
            try {
                iArr2[SSLEngineResult.Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2735[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2735[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2735[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C7200(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || this.f21745 == executorService) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.f21739 = socketChannel;
        this.f21740 = sSLEngine;
        this.f21745 = executorService;
        this.f21742 = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        this.f21744 = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        sSLEngine.beginHandshake();
        if (m22555()) {
            if (selectionKey != null) {
                selectionKey.interestOps(selectionKey.interestOps() | 4);
            }
        } else {
            try {
                socketChannel.close();
            } catch (IOException e) {
                this.f21738.error("Exception during the closing of the channel", e);
            }
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m22554();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f21739.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.f21743.hasRemaining()) {
            this.f21743.flip();
            return C3625.m680(this.f21743, byteBuffer);
        }
        this.f21744.compact();
        int i = this.f21739.read(this.f21744);
        if (i > 0 || this.f21744.hasRemaining()) {
            this.f21744.flip();
            if (this.f21744.hasRemaining()) {
                this.f21743.compact();
                try {
                    SSLEngineResult sSLEngineResultUnwrap = this.f21740.unwrap(this.f21744, this.f21743);
                    int i2 = C1205.f2735[sSLEngineResultUnwrap.getStatus().ordinal()];
                    if (i2 == 1) {
                        this.f21743.flip();
                        return C3625.m680(this.f21743, byteBuffer);
                    }
                    if (i2 == 2) {
                        this.f21743.flip();
                        return C3625.m680(this.f21743, byteBuffer);
                    }
                    if (i2 == 3) {
                        this.f21743 = m22556(this.f21743);
                        return read(byteBuffer);
                    }
                    if (i2 == 4) {
                        m22554();
                        byteBuffer.clear();
                        return -1;
                    }
                    throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultUnwrap.getStatus());
                } catch (SSLException e) {
                    this.f21738.error("SSLException during unwrap", e);
                    throw e;
                }
            }
        } else if (i < 0) {
            m22560();
        }
        C3625.m680(this.f21743, byteBuffer);
        return i;
    }

    @Override // java.nio.channels.WritableByteChannel
    public synchronized int write(ByteBuffer byteBuffer) throws IOException {
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            this.f21742.clear();
            SSLEngineResult sSLEngineResultWrap = this.f21740.wrap(byteBuffer, this.f21742);
            int i = C1205.f2735[sSLEngineResultWrap.getStatus().ordinal()];
            if (i == 1) {
                this.f21742.flip();
                while (this.f21742.hasRemaining()) {
                    iWrite += this.f21739.write(this.f21742);
                }
            } else {
                if (i == 2) {
                    throw new SSLException("Buffer underflow occurred after a wrap. I don't think we should ever get here.");
                }
                if (i != 3) {
                    if (i == 4) {
                        m22554();
                        return 0;
                    }
                    throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultWrap.getStatus());
                }
                this.f21742 = m22558(this.f21742);
            }
        }
        return iWrite;
    }

    @Override // Yue.InterfaceC5405
    /* JADX INFO: renamed from: ۥ۟ */
    public SSLEngine mo2178() {
        return this.f21740;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m22554() throws IOException {
        this.f21740.closeOutbound();
        try {
            m22555();
        } catch (IOException unused) {
        }
        this.f21739.close();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m22555() throws IOException {
        SSLEngineResult.HandshakeStatus handshakeStatus;
        int applicationBufferSize = this.f21740.getSession().getApplicationBufferSize();
        this.f21741 = ByteBuffer.allocate(applicationBufferSize);
        this.f21743 = ByteBuffer.allocate(applicationBufferSize);
        this.f21742.clear();
        this.f21744.clear();
        SSLEngineResult.HandshakeStatus handshakeStatus2 = this.f21740.getHandshakeStatus();
        boolean z = false;
        while (!z) {
            int i = C1205.f2736[handshakeStatus2.ordinal()];
            if (i == 1) {
                z = !this.f21744.hasRemaining();
                if (z) {
                    return true;
                }
                this.f21739.write(this.f21744);
            } else if (i != 2) {
                if (i == 3) {
                    this.f21742.clear();
                    try {
                        SSLEngineResult sSLEngineResultWrap = this.f21740.wrap(this.f21741, this.f21742);
                        handshakeStatus = sSLEngineResultWrap.getHandshakeStatus();
                        int i2 = C1205.f2735[sSLEngineResultWrap.getStatus().ordinal()];
                        if (i2 == 1) {
                            this.f21742.flip();
                            while (this.f21742.hasRemaining()) {
                                this.f21739.write(this.f21742);
                            }
                        } else {
                            if (i2 == 2) {
                                throw new SSLException("Buffer underflow occurred after a wrap. I don't think we should ever get here.");
                            }
                            if (i2 == 3) {
                                this.f21742 = m22558(this.f21742);
                            } else {
                                if (i2 != 4) {
                                    throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultWrap.getStatus());
                                }
                                try {
                                    this.f21742.flip();
                                    while (this.f21742.hasRemaining()) {
                                        this.f21739.write(this.f21742);
                                    }
                                    this.f21744.clear();
                                } catch (Exception unused) {
                                    handshakeStatus2 = this.f21740.getHandshakeStatus();
                                }
                            }
                        }
                        handshakeStatus2 = handshakeStatus;
                    } catch (SSLException unused2) {
                        this.f21740.closeOutbound();
                        handshakeStatus2 = this.f21740.getHandshakeStatus();
                    }
                } else if (i == 4) {
                    while (true) {
                        Runnable delegatedTask = this.f21740.getDelegatedTask();
                        if (delegatedTask == null) {
                            break;
                        }
                        this.f21745.execute(delegatedTask);
                    }
                    handshakeStatus2 = this.f21740.getHandshakeStatus();
                } else if (i != 5) {
                    throw new IllegalStateException("Invalid SSL status: " + handshakeStatus2);
                }
            } else if (this.f21739.read(this.f21744) >= 0) {
                this.f21744.flip();
                try {
                    SSLEngineResult sSLEngineResultUnwrap = this.f21740.unwrap(this.f21744, this.f21743);
                    this.f21744.compact();
                    handshakeStatus = sSLEngineResultUnwrap.getHandshakeStatus();
                    int i3 = C1205.f2735[sSLEngineResultUnwrap.getStatus().ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            this.f21744 = m22559(this.f21744);
                        } else if (i3 == 3) {
                            this.f21743 = m22556(this.f21743);
                        } else {
                            if (i3 != 4) {
                                throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultUnwrap.getStatus());
                            }
                            if (this.f21740.isOutboundDone()) {
                                return false;
                            }
                            this.f21740.closeOutbound();
                            handshakeStatus2 = this.f21740.getHandshakeStatus();
                        }
                    }
                    handshakeStatus2 = handshakeStatus;
                } catch (SSLException unused3) {
                    this.f21740.closeOutbound();
                    handshakeStatus2 = this.f21740.getHandshakeStatus();
                }
            } else {
                if (this.f21740.isInboundDone() && this.f21740.isOutboundDone()) {
                    return false;
                }
                try {
                    this.f21740.closeInbound();
                } catch (SSLException unused4) {
                }
                this.f21740.closeOutbound();
                handshakeStatus2 = this.f21740.getHandshakeStatus();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final ByteBuffer m22556(ByteBuffer byteBuffer) {
        return m22557(byteBuffer, this.f21740.getSession().getApplicationBufferSize());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final ByteBuffer m22557(ByteBuffer byteBuffer, int i) {
        return i > byteBuffer.capacity() ? ByteBuffer.allocate(i) : ByteBuffer.allocate(byteBuffer.capacity() * 2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final ByteBuffer m22558(ByteBuffer byteBuffer) {
        return m22557(byteBuffer, this.f21740.getSession().getPacketBufferSize());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final ByteBuffer m22559(ByteBuffer byteBuffer) {
        if (this.f21740.getSession().getPacketBufferSize() < byteBuffer.limit()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferM22558 = m22558(byteBuffer);
        byteBuffer.flip();
        byteBufferM22558.put(byteBuffer);
        return byteBufferM22558;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m22560() throws IOException {
        try {
            this.f21740.closeInbound();
        } catch (Exception unused) {
            this.f21738.error("This engine was forced to close inbound, without having received the proper SSL/TLS close notification message from the peer, due to end of stream.");
        }
        m22554();
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public boolean mo5923() {
        return this.f21739.isBlocking();
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public void mo5924() throws IOException {
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ */
    public int mo5925(ByteBuffer byteBuffer) throws IOException {
        return read(byteBuffer);
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟ */
    public boolean mo5926() {
        return false;
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ */
    public boolean mo5927() {
        return this.f21744.hasRemaining() || this.f21743.hasRemaining();
    }
}
