package Yue;

import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: Yue.ۥۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7201 implements ByteChannel, InterfaceC8533, InterfaceC5405 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static ByteBuffer f21746 = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f21747 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public ExecutorService f21749;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public List<Future<?>> f21750;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public ByteBuffer f21751;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public ByteBuffer f21752;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public ByteBuffer f21753;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public SocketChannel f21754;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public SelectionKey f21755;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public SSLEngine f21756;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public SSLEngineResult f21757;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public SSLEngineResult f21758;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final InterfaceC5866 f21748 = C5867.m18162(C7201.class);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f21759 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public byte[] f21760 = null;

    public C7201(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.f21754 = socketChannel;
        this.f21756 = sSLEngine;
        this.f21749 = executorService;
        SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.f21758 = sSLEngineResult;
        this.f21757 = sSLEngineResult;
        this.f21750 = new ArrayList(3);
        if (selectionKey != null) {
            selectionKey.interestOps(selectionKey.interestOps() | 4);
            this.f21755 = selectionKey;
        }
        m22565(sSLEngine.getSession());
        this.f21754.write(m22577(f21746));
        m22570();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21756.closeOutbound();
        this.f21756.getSession().invalidate();
        try {
            if (this.f21754.isOpen()) {
                this.f21754.write(m22577(f21746));
            }
        } finally {
            this.f21754.close();
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f21754.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        m22575();
        while (byteBuffer.hasRemaining()) {
            if (!m22568()) {
                if (mo5923()) {
                    while (!m22568()) {
                        m22570();
                    }
                } else {
                    m22570();
                    if (!m22568()) {
                        return 0;
                    }
                }
            }
            int iM22571 = m22571(byteBuffer);
            if (iM22571 != 0) {
                return iM22571;
            }
            this.f21751.clear();
            if (this.f21753.hasRemaining()) {
                this.f21753.compact();
            } else {
                this.f21753.clear();
            }
            if ((mo5923() || this.f21757.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.f21754.read(this.f21753) == -1) {
                return -1;
            }
            this.f21753.flip();
            m22576();
            int iM22574 = m22574(this.f21751, byteBuffer);
            if (iM22574 != 0 || !mo5923()) {
                return iM22574;
            }
        }
        return 0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!m22568()) {
            m22570();
            return 0;
        }
        int iWrite = this.f21754.write(m22577(byteBuffer));
        if (this.f21758.getStatus() != SSLEngineResult.Status.CLOSED) {
            return iWrite;
        }
        throw new EOFException("Connection is closed");
    }

    @Override // Yue.InterfaceC5405
    /* JADX INFO: renamed from: ۥ۟ */
    public SSLEngine mo2178() {
        return this.f21756;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public SelectableChannel m22561(boolean z) throws IOException {
        return this.f21754.configureBlocking(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m22562(SocketAddress socketAddress) throws IOException {
        return this.f21754.connect(socketAddress);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m22563() {
        while (true) {
            Runnable delegatedTask = this.f21756.getDelegatedTask();
            if (delegatedTask == null) {
                return;
            } else {
                this.f21750.add(this.f21749.submit(delegatedTask));
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m22564(Future<?> future) {
        while (true) {
            try {
                try {
                    future.get();
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m22565(SSLSession sSLSession) {
        m22572();
        int packetBufferSize = sSLSession.getPacketBufferSize();
        int iMax = Math.max(sSLSession.getApplicationBufferSize(), packetBufferSize);
        ByteBuffer byteBuffer = this.f21751;
        if (byteBuffer == null) {
            this.f21751 = ByteBuffer.allocate(iMax);
            this.f21752 = ByteBuffer.allocate(packetBufferSize);
            this.f21753 = ByteBuffer.allocate(packetBufferSize);
        } else {
            if (byteBuffer.capacity() != iMax) {
                this.f21751 = ByteBuffer.allocate(iMax);
            }
            if (this.f21752.capacity() != packetBufferSize) {
                this.f21752 = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.f21753.capacity() != packetBufferSize) {
                this.f21753 = ByteBuffer.allocate(packetBufferSize);
            }
        }
        if (this.f21751.remaining() != 0 && this.f21748.mo14141()) {
            this.f21748.mo14160(new String(this.f21751.array(), this.f21751.position(), this.f21751.remaining()));
        }
        this.f21751.rewind();
        this.f21751.flip();
        if (this.f21753.remaining() != 0 && this.f21748.mo14141()) {
            this.f21748.mo14160(new String(this.f21753.array(), this.f21753.position(), this.f21753.remaining()));
        }
        this.f21753.rewind();
        this.f21753.flip();
        this.f21752.rewind();
        this.f21752.flip();
        this.f21759++;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m22566() throws IOException {
        return this.f21754.finishConnect();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m22567() {
        return this.f21754.isConnected();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final boolean m22568() {
        SSLEngineResult.HandshakeStatus handshakeStatus = this.f21756.getHandshakeStatus();
        return handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public boolean mo5923() {
        return this.f21754.isBlocking();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m22569() {
        return this.f21756.isInboundDone();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final synchronized void m22570() throws IOException {
        try {
            if (this.f21756.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
                return;
            }
            if (!this.f21750.isEmpty()) {
                Iterator<Future<?>> it = this.f21750.iterator();
                while (it.hasNext()) {
                    Future<?> next = it.next();
                    if (!next.isDone()) {
                        if (mo5923()) {
                            m22564(next);
                        }
                        return;
                    }
                    it.remove();
                }
            }
            if (this.f21756.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                if (!mo5923() || this.f21757.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                    this.f21753.compact();
                    if (this.f21754.read(this.f21753) == -1) {
                        throw new IOException("connection closed unexpectedly by peer");
                    }
                    this.f21753.flip();
                }
                this.f21751.compact();
                m22576();
                if (this.f21757.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    m22565(this.f21756.getSession());
                    return;
                }
            }
            m22563();
            if (this.f21750.isEmpty() || this.f21756.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                this.f21754.write(m22577(f21746));
                if (this.f21758.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    m22565(this.f21756.getSession());
                    return;
                }
            }
            this.f21759 = 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int m22571(ByteBuffer byteBuffer) throws SSLException {
        if (this.f21751.hasRemaining()) {
            return m22574(this.f21751, byteBuffer);
        }
        if (!this.f21751.hasRemaining()) {
            this.f21751.clear();
        }
        m22575();
        if (!this.f21753.hasRemaining()) {
            return 0;
        }
        m22576();
        int iM22574 = m22574(this.f21751, byteBuffer);
        if (this.f21757.getStatus() == SSLEngineResult.Status.CLOSED) {
            return -1;
        }
        if (iM22574 > 0) {
            return iM22574;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m22572() {
        ByteBuffer byteBuffer = this.f21753;
        if (byteBuffer == null || byteBuffer.remaining() <= 0) {
            return;
        }
        byte[] bArr = new byte[this.f21753.remaining()];
        this.f21760 = bArr;
        this.f21753.get(bArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Socket m22573() {
        return this.f21754.socket();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final int m22574(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iRemaining = byteBuffer.remaining();
        int iRemaining2 = byteBuffer2.remaining();
        if (iRemaining <= iRemaining2) {
            byteBuffer2.put(byteBuffer);
            return iRemaining;
        }
        int iMin = Math.min(iRemaining, iRemaining2);
        for (int i = 0; i < iMin; i++) {
            byteBuffer2.put(byteBuffer.get());
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m22575() {
        if (this.f21760 != null) {
            this.f21753.clear();
            this.f21753.put(this.f21760);
            this.f21753.flip();
            this.f21760 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final synchronized ByteBuffer m22576() throws SSLException {
        if (this.f21757.getStatus() == SSLEngineResult.Status.CLOSED && this.f21756.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            try {
                close();
            } catch (IOException unused) {
            }
        }
        while (true) {
            int iRemaining = this.f21751.remaining();
            SSLEngineResult sSLEngineResultUnwrap = this.f21756.unwrap(this.f21753, this.f21751);
            this.f21757 = sSLEngineResultUnwrap;
            if (sSLEngineResultUnwrap.getStatus() != SSLEngineResult.Status.OK || (iRemaining == this.f21751.remaining() && this.f21756.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_UNWRAP)) {
                break;
            }
        }
        this.f21751.flip();
        return this.f21751;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final synchronized ByteBuffer m22577(ByteBuffer byteBuffer) throws SSLException {
        this.f21752.compact();
        this.f21758 = this.f21756.wrap(byteBuffer, this.f21752);
        this.f21752.flip();
        return this.f21752;
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public void mo5924() throws IOException {
        write(this.f21752);
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ */
    public int mo5925(ByteBuffer byteBuffer) throws SSLException {
        return m22571(byteBuffer);
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟ */
    public boolean mo5926() {
        return this.f21752.hasRemaining() || !m22568();
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ */
    public boolean mo5927() {
        return (this.f21760 == null && !this.f21751.hasRemaining() && (!this.f21753.hasRemaining() || this.f21757.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW || this.f21757.getStatus() == SSLEngineResult.Status.CLOSED)) ? false : true;
    }
}
