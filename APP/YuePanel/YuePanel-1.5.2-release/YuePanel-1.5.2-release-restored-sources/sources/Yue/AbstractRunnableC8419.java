package Yue;

import java.io.IOException;
import java.lang.Thread;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Yue.ۥۢۥۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC8419 extends AbstractC3020 implements Runnable {

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f25193 = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final InterfaceC5866 f25194;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final Collection<InterfaceC8409> f25195;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final InetSocketAddress f25196;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public ServerSocketChannel f25197;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public Selector f25198;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public List<AbstractC4514> f25199;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public Thread f25200;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final AtomicBoolean f25201;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public List<C1525> f25202;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public List<C8414> f25203;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public BlockingQueue<ByteBuffer> f25204;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int f25205;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final AtomicInteger f25206;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public InterfaceC8421 f25207;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public int f25208;

    /* JADX INFO: renamed from: Yue.ۥۢۥۢ۟$ۥ */
    public class C1525 extends Thread {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final /* synthetic */ boolean f25209 = false;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public BlockingQueue<C8414> f25210 = new LinkedBlockingQueue();

        /* JADX INFO: renamed from: Yue.ۥۢۥۢ۟$ۥ$ۥ, reason: contains not printable characters */
        public class C8420 implements Thread.UncaughtExceptionHandler {

            /* JADX INFO: renamed from: ۥ */
            public final /* synthetic */ AbstractRunnableC8419 f3482;

            public C8420(AbstractRunnableC8419 abstractRunnableC8419) {
                this.f3482 = abstractRunnableC8419;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                AbstractRunnableC8419.this.f25194.mo14142("Uncaught exception in thread {}: {}", thread.getName(), th);
            }
        }

        public C1525() {
            setName("WebSocketWorker-" + getId());
            setUncaughtExceptionHandler(new C8420(AbstractRunnableC8419.this));
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C8414 c8414Take;
            Throwable th;
            Throwable e;
            while (true) {
                try {
                    try {
                        c8414Take = this.f25210.take();
                        try {
                            m4398(c8414Take, c8414Take.f25137.poll());
                        } catch (LinkageError e2) {
                            e = e2;
                            AbstractRunnableC8419.this.f25194.mo14152("Got fatal error in worker thread {}", getName());
                            AbstractRunnableC8419.this.m28153(c8414Take, new Exception(e));
                            return;
                        } catch (ThreadDeath e3) {
                            e = e3;
                            AbstractRunnableC8419.this.f25194.mo14152("Got fatal error in worker thread {}", getName());
                            AbstractRunnableC8419.this.m28153(c8414Take, new Exception(e));
                            return;
                        } catch (VirtualMachineError e4) {
                            e = e4;
                            AbstractRunnableC8419.this.f25194.mo14152("Got fatal error in worker thread {}", getName());
                            AbstractRunnableC8419.this.m28153(c8414Take, new Exception(e));
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractRunnableC8419.this.f25194.mo14142("Uncaught exception in thread {}: {}", getName(), th);
                            if (c8414Take != null) {
                                AbstractRunnableC8419.this.mo28054(c8414Take, new Exception(th));
                                c8414Take.close();
                                return;
                            }
                            return;
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                } catch (LinkageError e5) {
                    e = e5;
                    Throwable th3 = e;
                    c8414Take = null;
                    e = th3;
                    AbstractRunnableC8419.this.f25194.mo14152("Got fatal error in worker thread {}", getName());
                    AbstractRunnableC8419.this.m28153(c8414Take, new Exception(e));
                    return;
                } catch (ThreadDeath e6) {
                    e = e6;
                    Throwable th32 = e;
                    c8414Take = null;
                    e = th32;
                    AbstractRunnableC8419.this.f25194.mo14152("Got fatal error in worker thread {}", getName());
                    AbstractRunnableC8419.this.m28153(c8414Take, new Exception(e));
                    return;
                } catch (VirtualMachineError e7) {
                    e = e7;
                    Throwable th322 = e;
                    c8414Take = null;
                    e = th322;
                    AbstractRunnableC8419.this.f25194.mo14152("Got fatal error in worker thread {}", getName());
                    AbstractRunnableC8419.this.m28153(c8414Take, new Exception(e));
                    return;
                } catch (Throwable th4) {
                    c8414Take = null;
                    th = th4;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m4398(C8414 c8414, ByteBuffer byteBuffer) throws InterruptedException {
            try {
                try {
                    c8414.m28094(byteBuffer);
                } catch (Exception e) {
                    AbstractRunnableC8419.this.f25194.error("Error while reading from remote connection", e);
                }
            } finally {
                AbstractRunnableC8419.this.m28164(byteBuffer);
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4399(C8414 c8414) throws InterruptedException {
            this.f25210.put(c8414);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractRunnableC8419() {
        this(new InetSocketAddress(80), f25193, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        SelectionKey selectionKey;
        SelectionKey next;
        if (m28141() && m28144()) {
            int i = 0;
            int i2 = 5;
            while (!this.f25200.isInterrupted() && i2 != 0) {
                try {
                    try {
                        try {
                            try {
                                if (this.f25201.get()) {
                                    i = 5;
                                }
                                if (this.f25198.select(i) == 0 && this.f25201.get()) {
                                    i2--;
                                }
                                Iterator<SelectionKey> it = this.f25198.selectedKeys().iterator();
                                selectionKey = null;
                                while (it.hasNext()) {
                                    try {
                                        next = it.next();
                                    } catch (C8538 e) {
                                        e = e;
                                    } catch (IOException e2) {
                                        e = e2;
                                    }
                                    try {
                                        if (next.isValid()) {
                                            if (next.isAcceptable()) {
                                                m28138(next, it);
                                            } else if ((!next.isReadable() || m28142(next, it)) && next.isWritable()) {
                                                m28145(next);
                                            }
                                        }
                                        selectionKey = next;
                                    } catch (C8538 e3) {
                                        e = e3;
                                        selectionKey = next;
                                        m28154(selectionKey, e.m4524(), e.m4525());
                                    } catch (IOException e4) {
                                        e = e4;
                                        selectionKey = next;
                                        m28154(selectionKey, null, e);
                                    }
                                }
                                m28139();
                            } catch (C8538 e5) {
                                e = e5;
                                selectionKey = null;
                            } catch (IOException e6) {
                                e = e6;
                                selectionKey = null;
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        } catch (CancelledKeyException unused2) {
                        } catch (ClosedByInterruptException unused3) {
                            m28143();
                            return;
                        }
                    } catch (RuntimeException e7) {
                        m28153(null, e7);
                    }
                } catch (Throwable th) {
                    m28143();
                    throw th;
                }
            }
            m28143();
        }
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public final void mo28045(InterfaceC8409 interfaceC8409, ByteBuffer byteBuffer) {
        m28161(interfaceC8409, byteBuffer);
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo28046(InterfaceC8409 interfaceC8409, int i, String str) {
        m28156(interfaceC8409, i, str);
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public final void mo28047(InterfaceC8409 interfaceC8409, int i, String str, boolean z) {
        this.f25198.wakeup();
        try {
            if (m28167(interfaceC8409)) {
                m28155(interfaceC8409, i, str, z);
            }
            try {
                m28166(interfaceC8409);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            try {
                m28166(interfaceC8409);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public final void mo28048(InterfaceC8409 interfaceC8409) {
        C8414 c8414 = (C8414) interfaceC8409;
        try {
            c8414.m28102().interestOps(5);
        } catch (CancelledKeyException unused) {
            c8414.f25136.clear();
        }
        this.f25198.wakeup();
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo28049(InterfaceC8409 interfaceC8409, int i, String str, boolean z) {
        m28157(interfaceC8409, i, str, z);
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public InetSocketAddress mo28050(InterfaceC8409 interfaceC8409) {
        return (InetSocketAddress) m28151(interfaceC8409).getRemoteSocketAddress();
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public InetSocketAddress mo28051(InterfaceC8409 interfaceC8409) {
        return (InetSocketAddress) m28151(interfaceC8409).getLocalSocketAddress();
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public final void mo28052(InterfaceC8409 interfaceC8409, InterfaceC5248 interfaceC5248) {
        if (m28129(interfaceC8409)) {
            m28162(interfaceC8409, (InterfaceC3842) interfaceC5248);
        }
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public final void mo28053(InterfaceC8409 interfaceC8409, String str) {
        m28160(interfaceC8409, str);
    }

    @Override // Yue.InterfaceC8415
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public final void mo28054(InterfaceC8409 interfaceC8409, Exception exc) {
        m28159(interfaceC8409, exc);
    }

    @Override // Yue.AbstractC3020
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public Collection<InterfaceC8409> mo5914() {
        Collection<InterfaceC8409> collectionUnmodifiableCollection;
        synchronized (this.f25195) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(new ArrayList(this.f25195));
        }
        return collectionUnmodifiableCollection;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public boolean m28129(InterfaceC8409 interfaceC8409) {
        boolean zAdd;
        if (this.f25201.get()) {
            interfaceC8409.mo28016(1001);
            return true;
        }
        synchronized (this.f25195) {
            zAdd = this.f25195.add(interfaceC8409);
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public void m28130(InterfaceC8409 interfaceC8409) throws InterruptedException {
        if (this.f25206.get() >= (this.f25202.size() * 2) + 1) {
            return;
        }
        this.f25206.incrementAndGet();
        this.f25204.put(m28137());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public void m28131(String str) {
        m28132(str, this.f25195);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void m28132(String str, Collection<InterfaceC8409> collection) {
        if (str == null || collection == null) {
            throw new IllegalArgumentException();
        }
        m28140(str, collection);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public void m28133(ByteBuffer byteBuffer) {
        m28134(byteBuffer, this.f25195);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m28134(ByteBuffer byteBuffer, Collection<InterfaceC8409> collection) {
        if (byteBuffer == null || collection == null) {
            throw new IllegalArgumentException();
        }
        m28140(byteBuffer, collection);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public void m28135(byte[] bArr) {
        m28136(bArr, this.f25195);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public void m28136(byte[] bArr, Collection<InterfaceC8409> collection) {
        if (bArr == null || collection == null) {
            throw new IllegalArgumentException();
        }
        m28134(ByteBuffer.wrap(bArr), collection);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public ByteBuffer m28137() {
        return ByteBuffer.allocate(16384);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public final void m28138(SelectionKey selectionKey, Iterator<SelectionKey> it) throws InterruptedException, IOException {
        if (!m28158(selectionKey)) {
            selectionKey.cancel();
            return;
        }
        SocketChannel socketChannelAccept = this.f25197.accept();
        if (socketChannelAccept == null) {
            return;
        }
        socketChannelAccept.configureBlocking(false);
        Socket socket = socketChannelAccept.socket();
        socket.setTcpNoDelay(m5916());
        socket.setKeepAlive(true);
        C8414 c8414Mo1315 = this.f25207.mo1315((AbstractC8410) this, this.f25199);
        c8414Mo1315.m28108(socketChannelAccept.register(this.f25198, 1, c8414Mo1315));
        try {
            c8414Mo1315.m28107(this.f25207.mo12319(socketChannelAccept, c8414Mo1315.m28102()));
            it.remove();
            m28130(c8414Mo1315);
        } catch (IOException e) {
            if (c8414Mo1315.m28102() != null) {
                c8414Mo1315.m28102().cancel();
            }
            m28154(c8414Mo1315.m28102(), null, e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final void m28139() throws InterruptedException, IOException {
        while (!this.f25203.isEmpty()) {
            C8414 c8414Remove = this.f25203.remove(0);
            InterfaceC8533 interfaceC8533 = (InterfaceC8533) c8414Remove.m28100();
            ByteBuffer byteBufferM28174 = m28174();
            try {
                if (C7492.m23444(byteBufferM28174, c8414Remove, interfaceC8533)) {
                    this.f25203.add(c8414Remove);
                }
                if (byteBufferM28174.hasRemaining()) {
                    c8414Remove.f25137.put(byteBufferM28174);
                    m28165(c8414Remove);
                } else {
                    m28164(byteBufferM28174);
                }
            } catch (IOException e) {
                m28164(byteBufferM28174);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public final void m28140(Object obj, Collection<InterfaceC8409> collection) {
        ArrayList<InterfaceC8409> arrayList;
        String str = obj instanceof String ? (String) obj : null;
        ByteBuffer byteBuffer = obj instanceof ByteBuffer ? (ByteBuffer) obj : null;
        if (str == null && byteBuffer == null) {
            return;
        }
        HashMap map = new HashMap();
        synchronized (collection) {
            arrayList = new ArrayList(collection);
        }
        for (InterfaceC8409 interfaceC8409 : arrayList) {
            if (interfaceC8409 != null) {
                AbstractC4514 abstractC4514Mo28018 = interfaceC8409.mo28018();
                m28146(abstractC4514Mo28018, map, str, byteBuffer);
                try {
                    interfaceC8409.mo28021(map.get(abstractC4514Mo28018));
                } catch (C8425 unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final boolean m28141() {
        synchronized (this) {
            try {
                if (this.f25200 == null) {
                    this.f25200 = Thread.currentThread();
                    return !this.f25201.get();
                }
                throw new IllegalStateException(getClass().getName() + " can only be started once.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public final boolean m28142(SelectionKey selectionKey, Iterator<SelectionKey> it) throws InterruptedException, C8538 {
        C8414 c8414 = (C8414) selectionKey.attachment();
        ByteBuffer byteBufferM28174 = m28174();
        if (c8414.m28100() == null) {
            selectionKey.cancel();
            m28154(selectionKey, c8414, new IOException());
            return false;
        }
        try {
            if (!C7492.m3686(byteBufferM28174, c8414, c8414.m28100())) {
                m28164(byteBufferM28174);
                return true;
            }
            if (!byteBufferM28174.hasRemaining()) {
                m28164(byteBufferM28174);
                return true;
            }
            c8414.f25137.put(byteBufferM28174);
            m28165(c8414);
            it.remove();
            if (!(c8414.m28100() instanceof InterfaceC8533) || !((InterfaceC8533) c8414.m28100()).mo5927()) {
                return true;
            }
            this.f25203.add(c8414);
            return true;
        } catch (IOException e) {
            m28164(byteBufferM28174);
            throw new C8538(c8414, e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final void m28143() {
        m5922();
        List<C1525> list = this.f25202;
        if (list != null) {
            Iterator<C1525> it = list.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        Selector selector = this.f25198;
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                this.f25194.error("IOException during selector.close", e);
                m28159(null, e);
            }
        }
        ServerSocketChannel serverSocketChannel = this.f25197;
        if (serverSocketChannel != null) {
            try {
                serverSocketChannel.close();
            } catch (IOException e2) {
                this.f25194.error("IOException during server.close", e2);
                m28159(null, e2);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public final boolean m28144() {
        this.f25200.setName("WebSocketSelector-" + this.f25200.getId());
        try {
            ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
            this.f25197 = serverSocketChannelOpen;
            serverSocketChannelOpen.configureBlocking(false);
            ServerSocket serverSocketSocket = this.f25197.socket();
            serverSocketSocket.setReceiveBufferSize(16384);
            serverSocketSocket.setReuseAddress(m5915());
            serverSocketSocket.bind(this.f25196, m28149());
            Selector selectorOpen = Selector.open();
            this.f25198 = selectorOpen;
            ServerSocketChannel serverSocketChannel = this.f25197;
            serverSocketChannel.register(selectorOpen, serverSocketChannel.validOps());
            m5921();
            Iterator<C1525> it = this.f25202.iterator();
            while (it.hasNext()) {
                it.next().start();
            }
            m28163();
            return true;
        } catch (IOException e) {
            m28153(null, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public final void m28145(SelectionKey selectionKey) throws C8538 {
        C8414 c8414 = (C8414) selectionKey.attachment();
        try {
            if (C7492.m3685(c8414, c8414.m28100()) && selectionKey.isValid()) {
                selectionKey.interestOps(1);
            }
        } catch (IOException e) {
            throw new C8538(c8414, e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public final void m28146(AbstractC4514 abstractC4514, Map<AbstractC4514, List<InterfaceC5114>> map, String str, ByteBuffer byteBuffer) {
        if (map.containsKey(abstractC4514)) {
            return;
        }
        List<InterfaceC5114> listMo13172 = str != null ? abstractC4514.mo13172(str, false) : null;
        if (byteBuffer != null) {
            listMo13172 = abstractC4514.mo13173(byteBuffer, false);
        }
        if (listMo13172 != null) {
            map.put(abstractC4514, listMo13172);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public InetSocketAddress m28147() {
        return this.f25196;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public List<AbstractC4514> m28148() {
        return Collections.unmodifiableList(this.f25199);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public int m28149() {
        return this.f25208;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public int m28150() {
        ServerSocketChannel serverSocketChannel;
        int port = m28147().getPort();
        return (port != 0 || (serverSocketChannel = this.f25197) == null) ? port : serverSocketChannel.socket().getLocalPort();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public final Socket m28151(InterfaceC8409 interfaceC8409) {
        return ((SocketChannel) ((C8414) interfaceC8409).m28102().channel()).socket();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public final InterfaceC8413 m28152() {
        return this.f25207;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public final void m28153(InterfaceC8409 interfaceC8409, Exception exc) {
        String str;
        this.f25194.error("Shutdown due to fatal error", exc);
        m28159(interfaceC8409, exc);
        if (exc.getCause() != null) {
            str = " caused by " + exc.getCause().getClass().getName();
        } else {
            str = "";
        }
        try {
            m28173(0, "Got error on server side: " + exc.getClass().getName() + str);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f25194.error("Interrupt during stop", exc);
            m28159(null, e);
        }
        List<C1525> list = this.f25202;
        if (list != null) {
            Iterator<C1525> it = list.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        Thread thread = this.f25200;
        if (thread != null) {
            thread.interrupt();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public final void m28154(SelectionKey selectionKey, InterfaceC8409 interfaceC8409, IOException iOException) {
        SelectableChannel selectableChannelChannel;
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        if (interfaceC8409 != null) {
            interfaceC8409.mo28030(1006, iOException.getMessage());
        } else {
            if (selectionKey == null || (selectableChannelChannel = selectionKey.channel()) == null || !selectableChannelChannel.isOpen()) {
                return;
            }
            try {
                selectableChannelChannel.close();
            } catch (IOException unused) {
            }
            this.f25194.mo14156("Connection closed because of exception", iOException);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public abstract void m28155(InterfaceC8409 interfaceC8409, int i, String str, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public void m28156(InterfaceC8409 interfaceC8409, int i, String str) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public void m28157(InterfaceC8409 interfaceC8409, int i, String str, boolean z) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public boolean m28158(SelectionKey selectionKey) {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public abstract void m28159(InterfaceC8409 interfaceC8409, Exception exc);

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public abstract void m28160(InterfaceC8409 interfaceC8409, String str);

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public void m28161(InterfaceC8409 interfaceC8409, ByteBuffer byteBuffer) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public abstract void m28162(InterfaceC8409 interfaceC8409, InterfaceC3842 interfaceC3842);

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public abstract void m28163();

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final void m28164(ByteBuffer byteBuffer) throws InterruptedException {
        if (this.f25204.size() > this.f25206.intValue()) {
            return;
        }
        this.f25204.put(byteBuffer);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public void m28165(C8414 c8414) throws InterruptedException {
        if (c8414.m28104() == null) {
            List<C1525> list = this.f25202;
            c8414.m28109(list.get(this.f25205 % list.size()));
            this.f25205++;
        }
        c8414.m28104().m4399(c8414);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public void m28166(InterfaceC8409 interfaceC8409) throws InterruptedException {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public boolean m28167(InterfaceC8409 interfaceC8409) {
        boolean zRemove;
        synchronized (this.f25195) {
            try {
                if (this.f25195.contains(interfaceC8409)) {
                    zRemove = this.f25195.remove(interfaceC8409);
                } else {
                    this.f25194.mo14133("Removing connection which is not in the connections collection! Possible no handshake received! {}", interfaceC8409);
                    zRemove = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f25201.get() && this.f25195.isEmpty()) {
            this.f25200.interrupt();
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public void m28168(int i) {
        this.f25208 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public final void m28169(InterfaceC8421 interfaceC8421) {
        InterfaceC8421 interfaceC84212 = this.f25207;
        if (interfaceC84212 != null) {
            interfaceC84212.close();
        }
        this.f25207 = interfaceC8421;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public void m28170() {
        if (this.f25200 == null) {
            new Thread(this).start();
            return;
        }
        throw new IllegalStateException(getClass().getName() + " can only be started once.");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public void m28171() throws InterruptedException {
        m28172(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public void m28172(int i) throws InterruptedException {
        m28173(i, "");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public void m28173(int i, String str) throws InterruptedException {
        ArrayList arrayList;
        Selector selector;
        if (this.f25201.compareAndSet(false, true)) {
            synchronized (this.f25195) {
                arrayList = new ArrayList(this.f25195);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC8409) it.next()).mo28011(1001, str);
            }
            this.f25207.close();
            synchronized (this) {
                try {
                    if (this.f25200 != null && (selector = this.f25198) != null) {
                        selector.wakeup();
                        this.f25200.join(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public final ByteBuffer m28174() throws InterruptedException {
        return this.f25204.take();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractRunnableC8419(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, f25193, null);
    }

    public AbstractRunnableC8419(InetSocketAddress inetSocketAddress, int i) {
        this(inetSocketAddress, i, null);
    }

    public AbstractRunnableC8419(InetSocketAddress inetSocketAddress, List<AbstractC4514> list) {
        this(inetSocketAddress, f25193, list);
    }

    public AbstractRunnableC8419(InetSocketAddress inetSocketAddress, int i, List<AbstractC4514> list) {
        this(inetSocketAddress, i, list, new HashSet());
    }

    public AbstractRunnableC8419(InetSocketAddress inetSocketAddress, int i, List<AbstractC4514> list, Collection<InterfaceC8409> collection) {
        this.f25194 = C5867.m18162(AbstractRunnableC8419.class);
        this.f25201 = new AtomicBoolean(false);
        this.f25205 = 0;
        this.f25206 = new AtomicInteger(0);
        this.f25207 = new C4359();
        this.f25208 = -1;
        if (inetSocketAddress != null && i >= 1 && collection != null) {
            if (list == null) {
                this.f25199 = Collections.emptyList();
            } else {
                this.f25199 = list;
            }
            this.f25196 = inetSocketAddress;
            this.f25195 = collection;
            m5920(false);
            m5919(false);
            this.f25203 = new LinkedList();
            this.f25202 = new ArrayList(i);
            this.f25204 = new LinkedBlockingQueue();
            for (int i2 = 0; i2 < i; i2++) {
                this.f25202.add(new C1525());
            }
            return;
        }
        throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
    }
}
