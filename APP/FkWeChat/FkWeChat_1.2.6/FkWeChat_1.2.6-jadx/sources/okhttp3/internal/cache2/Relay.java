package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.C4700i0;
import p376zd.C10003m;
import p376zd.C10010p0;
import p376zd.C10023w;
import p376zd.C10026x0;
import p376zd.C9987e;
import p376zd.C9995i;
import p376zd.InterfaceC10024w0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 E2\u00020\u0001:\u0002FEB5\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010!R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b'\u0010$R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0017\u0010;\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0011\u0010D\u001a\u0002048F¢\u0006\u0006\u001a\u0004\bD\u00108¨\u0006G"}, m16758d2 = {"Lokhttp3/internal/cache2/Relay;", "Lokhttp3/internal/concurrent/Lockable;", "Ljava/io/RandomAccessFile;", "file", "Lzd/w0;", "upstream", _UrlKt.FRAGMENT_ENCODE_SET, "upstreamPos", "Lzd/m;", "metadata", "bufferMaxSize", "<init>", "(Ljava/io/RandomAccessFile;Lzd/w0;JLzd/m;J)V", "prefix", "upstreamSize", "metadataSize", "Ll8/i0;", "writeHeader", "(Lzd/m;JJ)V", "writeMetadata", "(J)V", "commit", "()Lzd/m;", "newSource", "()Lzd/w0;", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "Lzd/w0;", "getUpstream", "setUpstream", "(Lzd/w0;)V", "J", "getUpstreamPos", "()J", "setUpstreamPos", "Lzd/m;", "getBufferMaxSize", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "Lzd/i;", "upstreamBuffer", "Lzd/i;", "getUpstreamBuffer", "()Lzd/i;", _UrlKt.FRAGMENT_ENCODE_SET, "complete", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "buffer", "getBuffer", _UrlKt.FRAGMENT_ENCODE_SET, "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "isClosed", "Companion", "RelaySource", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class Relay implements Lockable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final C10003m PREFIX_CLEAN;
    public static final C10003m PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final C9995i buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final C10003m metadata;
    private int sourceCount;
    private InterfaceC10024w0 upstream;
    private final C9995i upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m16758d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lzd/w0;", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "Lzd/i;", "sink", _UrlKt.FRAGMENT_ENCODE_SET, "byteCount", "read", "(Lzd/i;J)J", "Lzd/x0;", "timeout", "()Lzd/x0;", "Ll8/i0;", "close", "()V", "Lzd/x0;", "Lokhttp3/internal/cache2/FileOperator;", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "J", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public final class RelaySource implements InterfaceC10024w0 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final C10026x0 timeout = new C10026x0();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            file.getClass();
            FileChannel channel = file.getChannel();
            channel.getClass();
            this.fileOperator = new FileOperator(channel);
        }

        @Override // p376zd.InterfaceC10024w0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                try {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile(null);
                        randomAccessFile = file;
                    }
                    C4700i0 c4700i0 = C4700i0.f13910a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (randomAccessFile != null) {
                _UtilCommonKt.closeQuietly(randomAccessFile);
            }
        }

        @Override // p376zd.InterfaceC10024w0
        public long read(C9995i sink, long byteCount) throws IOException {
            char c10;
            sink.getClass();
            if (this.fileOperator == null) {
                C10010p0.m38820a("Check failed.");
                return 0L;
            }
            Relay relay = Relay.this;
            synchronized (relay) {
                while (true) {
                    try {
                        if (this.sourcePos != relay.getUpstreamPos()) {
                            long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().size();
                            if (this.sourcePos >= upstreamPos) {
                                long jMin = Math.min(byteCount, relay.getUpstreamPos() - this.sourcePos);
                                relay.getBuffer().m38712j(sink, this.sourcePos - upstreamPos, jMin);
                                this.sourcePos += jMin;
                                return jMin;
                            }
                            c10 = 2;
                        } else if (!relay.getComplete()) {
                            if (relay.getUpstreamReader() == null) {
                                relay.setUpstreamReader(Thread.currentThread());
                                c10 = 1;
                                break;
                            }
                            this.timeout.waitUntilNotified(relay);
                        } else {
                            return -1L;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Relay relay2 = Relay.this;
                if (c10 == 2) {
                    long jMin2 = Math.min(byteCount, relay2.getUpstreamPos() - this.sourcePos);
                    FileOperator fileOperator = this.fileOperator;
                    fileOperator.getClass();
                    fileOperator.read(this.sourcePos + 32, sink, jMin2);
                    this.sourcePos += jMin2;
                    return jMin2;
                }
                try {
                    InterfaceC10024w0 upstream = relay2.getUpstream();
                    upstream.getClass();
                    long j10 = upstream.read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                    if (j10 == -1) {
                        Relay relay3 = Relay.this;
                        relay3.commit(relay3.getUpstreamPos());
                        Relay relay4 = Relay.this;
                        synchronized (relay4) {
                            relay4.setUpstreamReader(null);
                            relay4.notifyAll();
                            C4700i0 c4700i0 = C4700i0.f13910a;
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j10, byteCount);
                    Relay.this.getUpstreamBuffer().m38712j(sink, 0L, jMin3);
                    this.sourcePos += jMin3;
                    FileOperator fileOperator2 = this.fileOperator;
                    fileOperator2.getClass();
                    fileOperator2.write(Relay.this.getUpstreamPos() + 32, Relay.this.getUpstreamBuffer().clone(), j10);
                    Relay relay5 = Relay.this;
                    synchronized (relay5) {
                        try {
                            relay5.getBuffer().write(relay5.getUpstreamBuffer(), j10);
                            if (relay5.getBuffer().size() > relay5.getBufferMaxSize()) {
                                relay5.getBuffer().skip(relay5.getBuffer().size() - relay5.getBufferMaxSize());
                            }
                            relay5.setUpstreamPos(relay5.getUpstreamPos() + j10);
                            C4700i0 c4700i02 = C4700i0.f13910a;
                        } finally {
                        }
                    }
                    Relay relay6 = Relay.this;
                    synchronized (relay6) {
                        relay6.setUpstreamReader(null);
                        relay6.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th2) {
                    Relay relay7 = Relay.this;
                    synchronized (relay7) {
                        relay7.setUpstreamReader(null);
                        relay7.notifyAll();
                        C4700i0 c4700i03 = C4700i0.f13910a;
                        throw th2;
                    }
                }
            }
        }

        @Override // p376zd.InterfaceC10024w0
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public C10026x0 getTimeout() {
            return this.timeout;
        }
    }

    static {
        C10003m.a aVar = C10003m.f33582t;
        PREFIX_CLEAN = aVar.m38794d("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.m38794d("OkHttp DIRTY :(\n");
    }

    private Relay(RandomAccessFile randomAccessFile, InterfaceC10024w0 interfaceC10024w0, long j10, C10003m c10003m, long j11) {
        this.file = randomAccessFile;
        this.upstream = interfaceC10024w0;
        this.upstreamPos = j10;
        this.metadata = c10003m;
        this.bufferMaxSize = j11;
        this.upstreamBuffer = new C9995i();
        this.complete = this.upstream == null;
        this.buffer = new C9995i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(C10003m prefix, long upstreamSize, long metadataSize) throws IOException {
        C9995i c9995i = new C9995i();
        c9995i.mo38736y0(prefix);
        c9995i.m38731v0(upstreamSize);
        c9995i.m38731v0(metadataSize);
        if (c9995i.size() != 32) {
            C9987e.m38645a("Failed requirement.");
            return;
        }
        RandomAccessFile randomAccessFile = this.file;
        randomAccessFile.getClass();
        FileChannel channel = randomAccessFile.getChannel();
        channel.getClass();
        new FileOperator(channel).write(0L, c9995i, 32L);
    }

    private final void writeMetadata(long upstreamSize) throws IOException {
        C9995i c9995i = new C9995i();
        c9995i.mo38736y0(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        randomAccessFile.getClass();
        FileChannel channel = randomAccessFile.getChannel();
        channel.getClass();
        new FileOperator(channel).write(32 + upstreamSize, c9995i, this.metadata.m38765G());
    }

    public final void commit(long upstreamSize) throws IOException {
        writeMetadata(upstreamSize);
        RandomAccessFile randomAccessFile = this.file;
        randomAccessFile.getClass();
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, upstreamSize, this.metadata.m38765G());
        RandomAccessFile randomAccessFile2 = this.file;
        randomAccessFile2.getClass();
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
        InterfaceC10024w0 interfaceC10024w0 = this.upstream;
        if (interfaceC10024w0 != null) {
            _UtilCommonKt.closeQuietly(interfaceC10024w0);
        }
        this.upstream = null;
    }

    public final C9995i getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final InterfaceC10024w0 getUpstream() {
        return this.upstream;
    }

    public final C9995i getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    /* JADX INFO: renamed from: metadata, reason: from getter */
    public final C10003m getMetadata() {
        return this.metadata;
    }

    public final InterfaceC10024w0 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z10) {
        this.complete = z10;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i10) {
        this.sourceCount = i10;
    }

    public final void setUpstream(InterfaceC10024w0 interfaceC10024w0) {
        this.upstream = interfaceC10024w0;
    }

    public final void setUpstreamPos(long j10) {
        this.upstreamPos = j10;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m16758d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Ljava/io/File;", "file", "Lzd/w0;", "upstream", "Lzd/m;", "metadata", _UrlKt.FRAGMENT_ENCODE_SET, "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "(Ljava/io/File;Lzd/w0;Lzd/m;J)Lokhttp3/internal/cache2/Relay;", "read", "(Ljava/io/File;)Lokhttp3/internal/cache2/Relay;", _UrlKt.FRAGMENT_ENCODE_SET, "SOURCE_UPSTREAM", "I", "SOURCE_FILE", "PREFIX_CLEAN", "Lzd/m;", "PREFIX_DIRTY", "FILE_HEADER_SIZE", "J", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final Relay edit(File file, InterfaceC10024w0 upstream, C10003m metadata, long bufferMaxSize) throws IOException {
            file.getClass();
            upstream.getClass();
            metadata.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            file.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            channel.getClass();
            FileOperator fileOperator = new FileOperator(channel);
            C9995i c9995i = new C9995i();
            fileOperator.read(0L, c9995i, 32L);
            if (!AbstractC1061t.m3842c(c9995i.mo38729u(r11.m38765G()), Relay.PREFIX_CLEAN)) {
                C10023w.m38841a("unreadable cache file");
                return null;
            }
            long j10 = c9995i.readLong();
            long j11 = c9995i.readLong();
            C9995i c9995i2 = new C9995i();
            fileOperator.read(32 + j10, c9995i2, j11);
            return new Relay(randomAccessFile, null, j10, c9995i2.mo38717l0(), 0L, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, InterfaceC10024w0 interfaceC10024w0, long j10, C10003m c10003m, long j11, AbstractC1043k abstractC1043k) {
        this(randomAccessFile, interfaceC10024w0, j10, c10003m, j11);
    }
}
