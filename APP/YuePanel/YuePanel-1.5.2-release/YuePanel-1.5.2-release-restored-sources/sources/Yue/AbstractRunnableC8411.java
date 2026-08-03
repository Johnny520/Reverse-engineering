package Yue;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: Yue.ۥۢۥۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC8411 extends AbstractC3020 implements Runnable, InterfaceC8409 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public URI f25109;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public C8414 f25110;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Socket f25111;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public SocketFactory f25112;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public OutputStream f25113;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public Proxy f25114;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public Thread f25115;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public Thread f25116;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public AbstractC4514 f25117;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public Map<String, String> f25118;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public CountDownLatch f25119;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public CountDownLatch f25120;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int f25121;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public InterfaceC4481 f25122;

    /* JADX INFO: renamed from: Yue.ۥۢۥۡۢ$ۥ */
    public class C1521 implements InterfaceC4481 {
        public C1521() {
        }

        @Override // Yue.InterfaceC4481
        /* JADX INFO: renamed from: ۥ */
        public InetAddress mo1405(URI uri) throws UnknownHostException {
            return InetAddress.getByName(uri.getHost());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۡۢ$ۥ۟ */
    public class RunnableC1522 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final AbstractRunnableC8411 f25123;

        public RunnableC1522(AbstractRunnableC8411 abstractRunnableC8411) {
            this.f25123 = abstractRunnableC8411;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            try {
                try {
                    m4389();
                } catch (IOException e) {
                    AbstractRunnableC8411.this.m28064(e);
                }
            } finally {
                m4388();
                AbstractRunnableC8411.this.f25115 = null;
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m4388() {
            try {
                if (AbstractRunnableC8411.this.f25111 != null) {
                    AbstractRunnableC8411.this.f25111.close();
                }
            } catch (IOException e) {
                AbstractRunnableC8411.this.mo28054(this.f25123, e);
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m4389() throws IOException {
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer byteBufferTake = AbstractRunnableC8411.this.f25110.f25136.take();
                    AbstractRunnableC8411.this.f25113.write(byteBufferTake.array(), 0, byteBufferTake.limit());
                    AbstractRunnableC8411.this.f25113.flush();
                } catch (InterruptedException unused) {
                    for (ByteBuffer byteBuffer : AbstractRunnableC8411.this.f25110.f25136) {
                        AbstractRunnableC8411.this.f25113.write(byteBuffer.array(), 0, byteBuffer.limit());
                        AbstractRunnableC8411.this.f25113.flush();
                    }
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractRunnableC8411(URI uri) {
        this(uri, new C4515());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    private int m28044() {
        int port = this.f25109.getPort();
        String scheme = this.f25109.getScheme();
        if ("wss".equals(scheme)) {
            return port == -1 ? C8414.f25132 : port;
        }
        if ("ws".equals(scheme)) {
            if (port == -1) {
                return 80;
            }
            return port;
        }
        throw new IllegalArgumentException("unknown scheme: " + scheme);
    }

    @Override // Yue.InterfaceC8409
    public void close() {
        if (this.f25115 != null) {
            this.f25110.mo28016(1000);
        }
    }

    @Override // Yue.InterfaceC8409
    public boolean isOpen() {
        return this.f25110.isOpen();
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        int i;
        try {
            boolean zM28069 = m28069();
            this.f25111.setTcpNoDelay(m5916());
            this.f25111.setReuseAddress(m5915());
            if (!this.f25111.isConnected()) {
                this.f25111.connect(this.f25122 == null ? InetSocketAddress.createUnresolved(this.f25109.getHost(), m28044()) : new InetSocketAddress(this.f25122.mo1405(this.f25109), m28044()), this.f25121);
            }
            if (zM28069 && "wss".equals(this.f25109.getScheme())) {
                m28079();
            }
            Socket socket = this.f25111;
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                m28068(sSLParameters);
                sSLSocket.setSSLParameters(sSLParameters);
            }
            InputStream inputStream = this.f25111.getInputStream();
            this.f25113 = this.f25111.getOutputStream();
            m28074();
            Thread thread = new Thread(new RunnableC1522(this));
            this.f25115 = thread;
            thread.start();
            byte[] bArr = new byte[16384];
            while (!mo28013() && !mo28022() && (i = inputStream.read(bArr)) != -1) {
                try {
                    this.f25110.m28094(ByteBuffer.wrap(bArr, 0, i));
                } catch (IOException e) {
                    m28064(e);
                } catch (RuntimeException e2) {
                    mo19836(e2);
                    this.f25110.mo28030(1006, e2.getMessage());
                }
            }
            this.f25110.m28097();
            this.f25116 = null;
        } catch (Exception e3) {
            mo28054(this.f25110, e3);
            this.f25110.mo28030(-1, e3.getMessage());
        } catch (InternalError e4) {
            if (!(e4.getCause() instanceof InvocationTargetException) || !(e4.getCause().getCause() instanceof IOException)) {
                throw e4;
            }
            IOException iOException = (IOException) e4.getCause().getCause();
            mo28054(this.f25110, iOException);
            this.f25110.mo28030(-1, iOException.getMessage());
        }
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ */
    public void mo4386(String str) {
        this.f25110.mo4386(str);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟ */
    public String mo4387() {
        return this.f25109.getPath();
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo28011(int i, String str) {
        this.f25110.mo28011(i, str);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo28012(byte[] bArr) {
        this.f25110.mo28012(bArr);
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void mo28045(InterfaceC8409 interfaceC8409, ByteBuffer byteBuffer) {
        m28067(byteBuffer);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo28013() {
        return this.f25110.mo28013();
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo28014(InterfaceC5114 interfaceC5114) {
        this.f25110.mo28014(interfaceC5114);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public EnumC7021 mo28015() {
        return this.f25110.mo28015();
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo28046(InterfaceC8409 interfaceC8409, int i, String str) {
        m28065(i, str);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo28016(int i) {
        this.f25110.mo28016(i);
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void mo28047(InterfaceC8409 interfaceC8409, int i, String str, boolean z) {
        m5922();
        Thread thread = this.f25115;
        if (thread != null) {
            thread.interrupt();
        }
        mo19835(i, str, z);
        this.f25119.countDown();
        this.f25120.countDown();
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void mo28048(InterfaceC8409 interfaceC8409) {
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo28049(InterfaceC8409 interfaceC8409, int i, String str, boolean z) {
        m28066(i, str, z);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo28017() {
        return this.f25111 instanceof SSLSocket;
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public InetSocketAddress mo28050(InterfaceC8409 interfaceC8409) {
        Socket socket = this.f25111;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public InetSocketAddress mo28051(InterfaceC8409 interfaceC8409) {
        Socket socket = this.f25111;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public AbstractC4514 mo28018() {
        return this.f25117;
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public InterfaceC5398 mo28019() {
        return this.f25110.mo28019();
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void mo28052(InterfaceC8409 interfaceC8409, InterfaceC5248 interfaceC5248) {
        m5921();
        mo19838((InterfaceC7374) interfaceC5248);
        this.f25119.countDown();
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public void mo28020() {
        this.f25110.mo28020();
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public void mo28021(Collection<InterfaceC5114> collection) {
        this.f25110.mo28021(collection);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public boolean mo28022() {
        return this.f25110.mo28022();
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void mo28053(InterfaceC8409 interfaceC8409, String str) {
        mo19837(str);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public void mo28023(ByteBuffer byteBuffer) {
        this.f25110.mo28023(byteBuffer);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public boolean mo28024() {
        return this.f25110.mo28024();
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo28025(EnumC6568 enumC6568, ByteBuffer byteBuffer, boolean z) {
        this.f25110.mo28025(enumC6568, byteBuffer, z);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public <T> void mo28026(T t) {
        this.f25110.mo28026(t);
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void mo28054(InterfaceC8409 interfaceC8409, Exception exc) {
        mo19836(exc);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo28027() {
        return this.f25110.mo28027();
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public <T> T mo28028() {
        return (T) this.f25110.mo28028();
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public InetSocketAddress mo28029() {
        return this.f25110.mo28029();
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public void mo28030(int i, String str) {
        this.f25110.mo28030(i, str);
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public SSLSession mo28031() {
        if (mo28017()) {
            return ((SSLSocket) this.f25111).getSession();
        }
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    @Override // Yue.InterfaceC8409
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public InetSocketAddress mo28032() {
        return this.f25110.mo28032();
    }

    @Override // Yue.AbstractC3020
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public Collection<InterfaceC8409> mo5914() {
        return Collections.singletonList(this.f25110);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public void m28055(String str, String str2) {
        if (this.f25118 == null) {
            this.f25118 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        }
        this.f25118.put(str, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void m28056() {
        this.f25118 = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public void m28057() throws InterruptedException {
        close();
        this.f25120.await();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m28058() {
        if (this.f25116 != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        Thread thread = new Thread(this);
        this.f25116 = thread;
        thread.setName("WebSocketConnectReadThread-" + this.f25116.getId());
        this.f25116.start();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public boolean m28059() throws InterruptedException {
        m28058();
        this.f25119.await();
        return this.f25110.isOpen();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public boolean m28060(long j, TimeUnit timeUnit) throws InterruptedException {
        m28058();
        return this.f25119.await(j, timeUnit) && this.f25110.isOpen();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public InterfaceC8409 m28061() {
        return this.f25110;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public Socket m28062() {
        return this.f25111;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public URI m28063() {
        return this.f25109;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final void m28064(IOException iOException) {
        if (iOException instanceof SSLException) {
            mo19836(iOException);
        }
        this.f25110.m28097();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public abstract void mo19835(int i, String str, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public void m28065(int i, String str) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public void m28066(int i, String str, boolean z) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ */
    public abstract void mo19836(Exception exc);

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ */
    public abstract void mo19837(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public void m28067(ByteBuffer byteBuffer) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ */
    public abstract void mo19838(InterfaceC7374 interfaceC7374);

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m28068(SSLParameters sSLParameters) {
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public final boolean m28069() throws IOException {
        if (this.f25114 != Proxy.NO_PROXY) {
            this.f25111 = new Socket(this.f25114);
            return true;
        }
        SocketFactory socketFactory = this.f25112;
        if (socketFactory != null) {
            this.f25111 = socketFactory.createSocket();
        } else {
            Socket socket = this.f25111;
            if (socket == null) {
                this.f25111 = new Socket(this.f25114);
                return true;
            }
            if (socket.isClosed()) {
                throw new IOException();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m28070() {
        m28073();
        m28058();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public boolean m28071() throws InterruptedException {
        m28073();
        return m28059();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public String m28072(String str) {
        Map<String, String> map = this.f25118;
        if (map == null) {
            return null;
        }
        return map.remove(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public final void m28073() {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread == this.f25115 || threadCurrentThread == this.f25116) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to ensure a successful cleanup.");
        }
        try {
            m28057();
            Thread thread = this.f25115;
            if (thread != null) {
                thread.interrupt();
                this.f25115 = null;
            }
            Thread thread2 = this.f25116;
            if (thread2 != null) {
                thread2.interrupt();
                this.f25116 = null;
            }
            this.f25117.mo13184();
            Socket socket = this.f25111;
            if (socket != null) {
                socket.close();
                this.f25111 = null;
            }
            this.f25119 = new CountDownLatch(1);
            this.f25120 = new CountDownLatch(1);
            this.f25110 = new C8414(this, this.f25117);
        } catch (Exception e) {
            mo19836(e);
            this.f25110.mo28030(1006, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public final void m28074() throws C5512 {
        String rawPath = this.f25109.getRawPath();
        String rawQuery = this.f25109.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int iM28044 = m28044();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25109.getHost());
        sb.append((iM28044 == 80 || iM28044 == 443) ? "" : ":" + iM28044);
        String string = sb.toString();
        C5245 c5245 = new C5245();
        c5245.mo10642(rawPath);
        c5245.put("Host", string);
        Map<String, String> map = this.f25118;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c5245.put(entry.getKey(), entry.getValue());
            }
        }
        this.f25110.m28110(c5245);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public void m28075(InterfaceC4481 interfaceC4481) {
        this.f25122 = interfaceC4481;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public void m28076(Proxy proxy) {
        if (proxy == null) {
            throw new IllegalArgumentException();
        }
        this.f25114 = proxy;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public void m28077(Socket socket) {
        if (this.f25111 != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.f25111 = socket;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public void m28078(SocketFactory socketFactory) {
        this.f25112 = socketFactory;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public final void m28079() throws NoSuchAlgorithmException, IOException, KeyManagementException {
        SSLSocketFactory socketFactory;
        SocketFactory socketFactory2 = this.f25112;
        if (socketFactory2 instanceof SSLSocketFactory) {
            socketFactory = (SSLSocketFactory) socketFactory2;
        } else {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, null, null);
            socketFactory = sSLContext.getSocketFactory();
        }
        this.f25111 = socketFactory.createSocket(this.f25111, this.f25109.getHost(), m28044(), true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractRunnableC8411(URI uri, AbstractC4514 abstractC4514) {
        this(uri, abstractC4514, null, 0);
    }

    public AbstractRunnableC8411(URI uri, Map<String, String> map) {
        this(uri, new C4515(), map);
    }

    public AbstractRunnableC8411(URI uri, AbstractC4514 abstractC4514, Map<String, String> map) {
        this(uri, abstractC4514, map, 0);
    }

    public AbstractRunnableC8411(URI uri, AbstractC4514 abstractC4514, Map<String, String> map, int i) {
        this.f25109 = null;
        this.f25110 = null;
        this.f25111 = null;
        this.f25112 = null;
        this.f25114 = Proxy.NO_PROXY;
        this.f25119 = new CountDownLatch(1);
        this.f25120 = new CountDownLatch(1);
        this.f25121 = 0;
        this.f25122 = null;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (abstractC4514 != null) {
            this.f25109 = uri;
            this.f25117 = abstractC4514;
            this.f25122 = new C1521();
            if (map != null) {
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                this.f25118 = treeMap;
                treeMap.putAll(map);
            }
            this.f25121 = i;
            m5920(false);
            m5919(false);
            this.f25110 = new C8414(this, abstractC4514);
            return;
        }
        throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    }
}
