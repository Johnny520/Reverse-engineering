package Yue;

import Yue.AbstractRunnableC8419;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: Yue.ۥۢۥۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8414 implements InterfaceC8409 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f25131 = 80;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f25132 = 443;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f25133 = 16384;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f25134 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final InterfaceC5866 f25135;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final BlockingQueue<ByteBuffer> f25136;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final BlockingQueue<ByteBuffer> f25137;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final InterfaceC8415 f25138;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public SelectionKey f25139;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public ByteChannel f25140;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public AbstractRunnableC8419.C1525 f25141;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f25142;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public volatile EnumC7021 f25143;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public List<AbstractC4514> f25144;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public AbstractC4514 f25145;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public EnumC7178 f25146;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public ByteBuffer f25147;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public InterfaceC3842 f25148;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public String f25149;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public Integer f25150;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public Boolean f25151;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public String f25152;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public long f25153;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final Object f25154;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public Object f25155;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8414(InterfaceC8415 interfaceC8415, List<AbstractC4514> list) {
        this(interfaceC8415, (AbstractC4514) null);
        this.f25146 = EnumC7178.SERVER;
        if (list != null && !list.isEmpty()) {
            this.f25144 = list;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f25144 = arrayList;
        arrayList.add(new C4515());
    }

    @Override // Yue.InterfaceC8409
    public void close() {
        mo28016(1000);
    }

    @Override // Yue.InterfaceC8409
    public boolean isOpen() {
        return this.f25143 == EnumC7021.OPEN;
    }

    public String toString() {
        return super.toString();
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ */
    public void mo4386(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        m28106(this.f25145.mo13172(str, this.f25146 == EnumC7178.CLIENT));
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟ */
    public String mo4387() {
        return this.f25152;
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo28011(int i, String str) {
        m28087(i, str, false);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo28012(byte[] bArr) {
        mo28023(ByteBuffer.wrap(bArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041 A[Catch: all -> 0x001f, ۥ۠ۥۧۤ -> 0x0033, TRY_LEAVE, TryCatch #1 {ۥ۠ۥۧۤ -> 0x0033, blocks: (B:19:0x002d, B:25:0x003b, B:27:0x0041, B:24:0x0036), top: B:45:0x002d, outer: #2 }] */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void m28087(int i, String str, boolean z) {
        EnumC7021 enumC7021 = this.f25143;
        EnumC7021 enumC70212 = EnumC7021.CLOSING;
        if (enumC7021 == enumC70212 || this.f25143 == EnumC7021.CLOSED) {
            return;
        }
        if (this.f25143 == EnumC7021.OPEN) {
            if (i == 1006) {
                this.f25143 = enumC70212;
                m28098(i, str, false);
                return;
            }
            if (this.f25145.mo13178() != EnumC3848.NONE) {
                if (!z) {
                    try {
                        try {
                            this.f25138.mo28046(this, i, str);
                        } catch (RuntimeException e) {
                            this.f25138.mo28054(this, e);
                        }
                        if (isOpen()) {
                            C3846 c3846 = new C3846();
                            c3846.m10651(str);
                            c3846.m10650(i);
                            c3846.mo10646();
                            mo28014(c3846);
                        }
                    } catch (C5509 e2) {
                        this.f25135.error("generated frame is invalid", e2);
                        this.f25138.mo28054(this, e2);
                        m28098(1006, "generated frame is invalid", false);
                    }
                } else if (isOpen()) {
                }
            }
            m28098(i, str, z);
        } else if (i == -3) {
            m28098(-3, str, true);
        } else if (i == 1002) {
            m28098(i, str, z);
        } else {
            m28098(-1, str, false);
        }
        this.f25143 = EnumC7021.CLOSING;
        this.f25147 = null;
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo28013() {
        return this.f25143 == EnumC7021.CLOSING;
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo28014(InterfaceC5114 interfaceC5114) {
        m28106(Collections.singletonList(interfaceC5114));
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public EnumC7021 mo28015() {
        return this.f25143;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m28088(C5509 c5509) {
        m28087(c5509.m2259(), c5509.getMessage(), false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m28089() {
        if (this.f25151 == null) {
            throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
        }
        m28090(this.f25150.intValue(), this.f25149, this.f25151.booleanValue());
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo28016(int i) {
        m28087(i, "", false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public synchronized void m28090(int i, String str, boolean z) {
        try {
            if (this.f25143 == EnumC7021.CLOSED) {
                return;
            }
            if (this.f25143 == EnumC7021.OPEN && i == 1006) {
                this.f25143 = EnumC7021.CLOSING;
            }
            SelectionKey selectionKey = this.f25139;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.f25140;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e) {
                    if (e.getMessage() == null || !e.getMessage().equals("Broken pipe")) {
                        this.f25135.error("Exception during channel.close()", e);
                        this.f25138.mo28054(this, e);
                    } else {
                        this.f25135.mo14156("Caught IOException: Broken pipe during closeConnection()", e);
                    }
                }
            }
            try {
                this.f25138.mo28047(this, i, str, z);
            } catch (RuntimeException e2) {
                this.f25138.mo28054(this, e2);
            }
            AbstractC4514 abstractC4514 = this.f25145;
            if (abstractC4514 != null) {
                abstractC4514.mo13184();
            }
            this.f25148 = null;
            this.f25143 = EnumC7021.CLOSED;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m28091(int i, boolean z) {
        m28090(i, "", z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m28092(RuntimeException runtimeException) {
        m28112(m28099(500));
        m28098(-1, runtimeException.getMessage(), false);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo28017() {
        return this.f25140 instanceof InterfaceC5405;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m28093(C5509 c5509) {
        m28112(m28099(404));
        m28098(c5509.m2259(), c5509.getMessage(), false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m28094(ByteBuffer byteBuffer) throws Throwable {
        this.f25135.mo14134("process({}): ({})", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
        if (this.f25143 != EnumC7021.NOT_YET_CONNECTED) {
            if (this.f25143 == EnumC7021.OPEN) {
                m28095(byteBuffer);
            }
        } else {
            if (!m28096(byteBuffer) || mo28013() || mo28022()) {
                return;
            }
            if (byteBuffer.hasRemaining()) {
                m28095(byteBuffer);
            } else if (this.f25147.hasRemaining()) {
                m28095(this.f25147);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m28095(ByteBuffer byteBuffer) throws Throwable {
        try {
            for (InterfaceC5114 interfaceC5114 : this.f25145.mo13186(byteBuffer)) {
                this.f25135.mo14133("matched frame: {}", interfaceC5114);
                this.f25145.mo13182(this, interfaceC5114);
            }
        } catch (C5697 e) {
            if (e.m2375() == Integer.MAX_VALUE) {
                this.f25135.error("Closing due to invalid size of frame", e);
                this.f25138.mo28054(this, e);
            }
            m28088(e);
        } catch (C5509 e2) {
            this.f25135.error("Closing due to invalid data in frame", e2);
            this.f25138.mo28054(this, e2);
            m28088(e2);
        } catch (LinkageError e3) {
            e = e3;
            this.f25135.error("Got fatal error during frame processing");
            throw e;
        } catch (ThreadDeath e4) {
            e = e4;
            this.f25135.error("Got fatal error during frame processing");
            throw e;
        } catch (VirtualMachineError e5) {
            e = e5;
            this.f25135.error("Got fatal error during frame processing");
            throw e;
        } catch (Error e6) {
            this.f25135.error("Closing web socket due to an error during frame processing");
            this.f25138.mo28054(this, new Exception(e6));
            mo28011(1011, "Got error " + e6.getClass().getName());
        }
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public AbstractC4514 mo28018() {
        return this.f25145;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m28096(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        EnumC7178 enumC7178;
        InterfaceC5248 interfaceC5248M13187;
        if (this.f25147.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.f25147.remaining() < byteBuffer.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f25147.capacity() + byteBuffer.remaining());
                this.f25147.flip();
                byteBufferAllocate.put(this.f25147);
                this.f25147 = byteBufferAllocate;
            }
            this.f25147.put(byteBuffer);
            this.f25147.flip();
            byteBuffer2 = this.f25147;
        }
        byteBuffer2.mark();
        try {
            try {
                enumC7178 = this.f25146;
            } catch (C5512 e) {
                this.f25135.mo14156("Closing due to invalid handshake", e);
                m28088(e);
            }
        } catch (C5426 e2) {
            if (this.f25147.capacity() == 0) {
                byteBuffer2.reset();
                int iM2198 = e2.m2198();
                if (iM2198 == 0) {
                    iM2198 = byteBuffer2.capacity() + 16;
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iM2198);
                this.f25147 = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            } else {
                ByteBuffer byteBuffer3 = this.f25147;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.f25147;
                byteBuffer4.limit(byteBuffer4.capacity());
            }
        }
        if (enumC7178 != EnumC7178.SERVER) {
            if (enumC7178 == EnumC7178.CLIENT) {
                this.f25145.m13185(enumC7178);
                InterfaceC5248 interfaceC5248M131872 = this.f25145.m13187(byteBuffer2);
                if (!(interfaceC5248M131872 instanceof InterfaceC7374)) {
                    this.f25135.mo14160("Closing due to protocol error: wrong http function");
                    m28098(1002, "wrong http function", false);
                    return false;
                }
                InterfaceC7374 interfaceC7374 = (InterfaceC7374) interfaceC5248M131872;
                if (this.f25145.mo1435(this.f25148, interfaceC7374) == EnumC5247.MATCHED) {
                    try {
                        this.f25138.mo28036(this, this.f25148, interfaceC7374);
                        m28105(interfaceC7374);
                        return true;
                    } catch (C5509 e3) {
                        this.f25135.mo14156("Closing due to invalid data exception. Possible handshake rejection", e3);
                        m28098(e3.m2259(), e3.getMessage(), false);
                        return false;
                    } catch (RuntimeException e4) {
                        this.f25135.error("Closing since client was never connected", e4);
                        this.f25138.mo28054(this, e4);
                        m28098(-1, e4.getMessage(), false);
                        return false;
                    }
                }
                this.f25135.mo14133("Closing due to protocol error: draft {} refuses handshake", this.f25145);
                mo28011(1002, "draft " + this.f25145 + " refuses handshake");
            }
            return false;
        }
        AbstractC4514 abstractC4514 = this.f25145;
        if (abstractC4514 != null) {
            InterfaceC5248 interfaceC5248M131873 = abstractC4514.m13187(byteBuffer2);
            if (!(interfaceC5248M131873 instanceof InterfaceC3842)) {
                this.f25135.mo14160("Closing due to protocol error: wrong http function");
                m28098(1002, "wrong http function", false);
                return false;
            }
            InterfaceC3842 interfaceC3842 = (InterfaceC3842) interfaceC5248M131873;
            if (this.f25145.mo1436(interfaceC3842) == EnumC5247.MATCHED) {
                m28105(interfaceC3842);
                return true;
            }
            this.f25135.mo14160("Closing due to protocol error: the handshake did finally not match");
            mo28011(1002, "the handshake did finally not match");
            return false;
        }
        Iterator<AbstractC4514> it = this.f25144.iterator();
        while (it.hasNext()) {
            AbstractC4514 abstractC4514Mo13170 = it.next().mo13170();
            try {
                abstractC4514Mo13170.m13185(this.f25146);
                byteBuffer2.reset();
                interfaceC5248M13187 = abstractC4514Mo13170.m13187(byteBuffer2);
            } catch (C5512 unused) {
            }
            if (!(interfaceC5248M13187 instanceof InterfaceC3842)) {
                this.f25135.mo14160("Closing due to wrong handshake");
                m28093(new C5509(1002, "wrong http function"));
                return false;
            }
            InterfaceC3842 interfaceC38422 = (InterfaceC3842) interfaceC5248M13187;
            if (abstractC4514Mo13170.mo1436(interfaceC38422) == EnumC5247.MATCHED) {
                this.f25152 = interfaceC38422.mo897();
                try {
                    m28113(abstractC4514Mo13170.m13174(abstractC4514Mo13170.mo13181(interfaceC38422, this.f25138.mo28037(this, abstractC4514Mo13170, interfaceC38422))));
                    this.f25145 = abstractC4514Mo13170;
                    m28105(interfaceC38422);
                    return true;
                } catch (C5509 e5) {
                    this.f25135.mo14156("Closing due to wrong handshake. Possible handshake rejection", e5);
                    m28093(e5);
                    return false;
                } catch (RuntimeException e6) {
                    this.f25135.error("Closing due to internal server error", e6);
                    this.f25138.mo28054(this, e6);
                    m28092(e6);
                    return false;
                }
            }
        }
        if (this.f25145 == null) {
            this.f25135.mo14160("Closing due to protocol error: no draft matches");
            m28093(new C5509(1002, "no draft matches"));
        }
        return false;
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public InterfaceC5398 mo28019() {
        AbstractC4514 abstractC4514 = this.f25145;
        if (abstractC4514 == null) {
            return null;
        }
        if (abstractC4514 instanceof C4515) {
            return ((C4515) abstractC4514).m13202();
        }
        throw new IllegalArgumentException("This draft does not support Sec-WebSocket-Protocol");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m28097() {
        if (this.f25143 == EnumC7021.NOT_YET_CONNECTED) {
            m28091(-1, true);
            return;
        }
        if (this.f25142) {
            m28090(this.f25150.intValue(), this.f25149, this.f25151.booleanValue());
            return;
        }
        if (this.f25145.mo13178() == EnumC3848.NONE) {
            m28091(1000, true);
            return;
        }
        if (this.f25145.mo13178() != EnumC3848.ONEWAY) {
            m28091(1006, true);
        } else if (this.f25146 == EnumC7178.SERVER) {
            m28091(1006, true);
        } else {
            m28091(1000, true);
        }
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public void mo28020() throws NullPointerException {
        C6666 c6666Mo28033 = this.f25138.mo28033(this);
        if (c6666Mo28033 == null) {
            throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
        }
        mo28014(c6666Mo28033);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public void mo28021(Collection<InterfaceC5114> collection) {
        m28106(collection);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public boolean mo28022() {
        return this.f25143 == EnumC7021.CLOSED;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public synchronized void m28098(int i, String str, boolean z) {
        if (this.f25142) {
            return;
        }
        this.f25150 = Integer.valueOf(i);
        this.f25149 = str;
        this.f25151 = Boolean.valueOf(z);
        this.f25142 = true;
        this.f25138.mo28048(this);
        try {
            this.f25138.mo28049(this, i, str, z);
        } catch (RuntimeException e) {
            this.f25135.error("Exception in onWebsocketClosing", e);
            this.f25138.mo28054(this, e);
        }
        AbstractC4514 abstractC4514 = this.f25145;
        if (abstractC4514 != null) {
            abstractC4514.mo13184();
        }
        this.f25148 = null;
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public void mo28023(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        m28106(this.f25145.mo13173(byteBuffer, this.f25146 == EnumC7178.CLIENT));
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public boolean mo28024() {
        return this.f25142;
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo28025(EnumC6568 enumC6568, ByteBuffer byteBuffer, boolean z) {
        m28106(this.f25145.m13169(enumC6568, byteBuffer, z));
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public <T> void mo28026(T t) {
        this.f25155 = t;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final ByteBuffer m28099(int i) {
        String str = i != 404 ? "500 Internal Server Error" : "404 WebSocket Upgrade Failure";
        return ByteBuffer.wrap(C3793.m838("HTTP/1.1 " + str + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo28027() {
        return !this.f25136.isEmpty();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public ByteChannel m28100() {
        return this.f25140;
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public <T> T mo28028() {
        return (T) this.f25155;
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public InetSocketAddress mo28029() {
        return this.f25138.mo28050(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public long m28101() {
        return this.f25153;
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public void mo28030(int i, String str) {
        m28090(i, str, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public SelectionKey m28102() {
        return this.f25139;
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public SSLSession mo28031() {
        if (mo28017()) {
            return ((InterfaceC5405) this.f25140).mo2178().getSession();
        }
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public InetSocketAddress mo28032() {
        return this.f25138.mo28051(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public InterfaceC8415 m28103() {
        return this.f25138;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public AbstractRunnableC8419.C1525 m28104() {
        return this.f25141;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final void m28105(InterfaceC5248 interfaceC5248) {
        this.f25135.mo14133("open using draft: {}", this.f25145);
        this.f25143 = EnumC7021.OPEN;
        m28111();
        try {
            this.f25138.mo28052(this, interfaceC5248);
        } catch (RuntimeException e) {
            this.f25138.mo28054(this, e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final void m28106(Collection<InterfaceC5114> collection) {
        if (!isOpen()) {
            throw new C8425();
        }
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5114 interfaceC5114 : collection) {
            this.f25135.mo14133("send frame: {}", interfaceC5114);
            arrayList.add(this.f25145.mo13171(interfaceC5114));
        }
        m28113(arrayList);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m28107(ByteChannel byteChannel) {
        this.f25140 = byteChannel;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m28108(SelectionKey selectionKey) {
        this.f25139 = selectionKey;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m28109(AbstractRunnableC8419.C1525 c1525) {
        this.f25141 = c1525;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m28110(InterfaceC3843 interfaceC3843) throws C5512 {
        this.f25148 = this.f25145.mo13180(interfaceC3843);
        this.f25152 = interfaceC3843.mo897();
        try {
            this.f25138.mo28034(this, this.f25148);
            m28113(this.f25145.m13174(this.f25148));
        } catch (C5509 unused) {
            throw new C5512("Handshake data rejected by client.");
        } catch (RuntimeException e) {
            this.f25135.error("Exception in startHandshake", e);
            this.f25138.mo28054(this, e);
            throw new C5512("rejected because of " + e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m28111() {
        this.f25153 = System.nanoTime();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m28112(ByteBuffer byteBuffer) {
        this.f25135.mo14134("write({}): {}", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
        this.f25136.add(byteBuffer);
        this.f25138.mo28048(this);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m28113(List<ByteBuffer> list) {
        synchronized (this.f25154) {
            try {
                Iterator<ByteBuffer> it = list.iterator();
                while (it.hasNext()) {
                    m28112(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C8414(InterfaceC8415 interfaceC8415, AbstractC4514 abstractC4514) {
        this.f25135 = C5867.m18162(C8414.class);
        this.f25142 = false;
        this.f25143 = EnumC7021.NOT_YET_CONNECTED;
        this.f25145 = null;
        this.f25147 = ByteBuffer.allocate(0);
        this.f25148 = null;
        this.f25149 = null;
        this.f25150 = null;
        this.f25151 = null;
        this.f25152 = null;
        this.f25153 = System.nanoTime();
        this.f25154 = new Object();
        if (interfaceC8415 != null && (abstractC4514 != null || this.f25146 != EnumC7178.SERVER)) {
            this.f25136 = new LinkedBlockingQueue();
            this.f25137 = new LinkedBlockingQueue();
            this.f25138 = interfaceC8415;
            this.f25146 = EnumC7178.CLIENT;
            if (abstractC4514 != null) {
                this.f25145 = abstractC4514.mo13170();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }
}
