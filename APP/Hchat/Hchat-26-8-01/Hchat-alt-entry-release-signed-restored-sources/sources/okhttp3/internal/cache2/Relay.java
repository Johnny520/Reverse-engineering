package okhttp3.internal.cache2;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final ByteString PREFIX_CLEAN;
    public static final ByteString PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final Buffer buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final ByteString metadata;
    private int sourceCount;
    private Source upstream;
    private final Buffer upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class RelaySource implements Source {
        private FileOperator fileOperator;
        private long sourcePos;
        private final Timeout timeout = new Timeout();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            file.getClass();
            FileChannel channel = file.getChannel();
            channel.getClass();
            this.fileOperator = new FileOperator(channel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (relay.getSourceCount() == 0) {
                    RandomAccessFile file = relay.getFile();
                    relay.setFile(null);
                    randomAccessFile = file;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        @Override // okio.Source
        public long read(Buffer buffer, long j3) throws IOException {
            char c10;
            buffer.getClass();
            if (this.fileOperator == null) {
                C2104o.m5276A("Check failed.");
                return 0L;
            }
            Relay relay = Relay.this;
            synchronized (relay) {
                while (true) {
                    try {
                        if (this.sourcePos != relay.getUpstreamPos()) {
                            long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().size();
                            if (this.sourcePos >= upstreamPos) {
                                long jMin = Math.min(j3, relay.getUpstreamPos() - this.sourcePos);
                                relay.getBuffer().copyTo(buffer, this.sourcePos - upstreamPos, jMin);
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
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Relay relay2 = Relay.this;
                if (c10 == 2) {
                    long jMin2 = Math.min(j3, relay2.getUpstreamPos() - this.sourcePos);
                    FileOperator fileOperator = this.fileOperator;
                    fileOperator.getClass();
                    fileOperator.read(this.sourcePos + Relay.FILE_HEADER_SIZE, buffer, jMin2);
                    this.sourcePos += jMin2;
                    return jMin2;
                }
                try {
                    Source upstream = relay2.getUpstream();
                    upstream.getClass();
                    long j4 = upstream.read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                    if (j4 == -1) {
                        Relay relay3 = Relay.this;
                        relay3.commit(relay3.getUpstreamPos());
                        Relay relay4 = Relay.this;
                        synchronized (relay4) {
                            relay4.setUpstreamReader(null);
                            relay4.notifyAll();
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j4, j3);
                    Relay.this.getUpstreamBuffer().copyTo(buffer, 0L, jMin3);
                    this.sourcePos += jMin3;
                    FileOperator fileOperator2 = this.fileOperator;
                    fileOperator2.getClass();
                    fileOperator2.write(Relay.this.getUpstreamPos() + Relay.FILE_HEADER_SIZE, Relay.this.getUpstreamBuffer().clone(), j4);
                    Relay relay5 = Relay.this;
                    synchronized (relay5) {
                        try {
                            relay5.getBuffer().write(relay5.getUpstreamBuffer(), j4);
                            if (relay5.getBuffer().size() > relay5.getBufferMaxSize()) {
                                relay5.getBuffer().skip(relay5.getBuffer().size() - relay5.getBufferMaxSize());
                            }
                            relay5.setUpstreamPos(relay5.getUpstreamPos() + j4);
                        } finally {
                        }
                    }
                    Relay relay6 = Relay.this;
                    synchronized (relay6) {
                        relay6.setUpstreamReader(null);
                        relay6.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th3) {
                    Relay relay7 = Relay.this;
                    synchronized (relay7) {
                        relay7.setUpstreamReader(null);
                        relay7.notifyAll();
                        throw th3;
                    }
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ByteString.Companion companion = ByteString.Companion;
        PREFIX_CLEAN = companion.encodeUtf8("OkHttp cache v1\n");
        PREFIX_DIRTY = companion.encodeUtf8("OkHttp DIRTY :(\n");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Relay(RandomAccessFile randomAccessFile, Source source, long j3, ByteString byteString, long j4) {
        this.file = randomAccessFile;
        this.upstream = source;
        this.upstreamPos = j3;
        this.metadata = byteString;
        this.bufferMaxSize = j4;
        this.upstreamBuffer = new Buffer();
        this.complete = this.upstream == null;
        this.buffer = new Buffer();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(ByteString byteString, long j3, long j4) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(byteString);
        buffer.writeLong(j3);
        buffer.writeLong(j4);
        if (buffer.size() != FILE_HEADER_SIZE) {
            C2104o.m5294t("Failed requirement.");
            return;
        }
        RandomAccessFile randomAccessFile = this.file;
        randomAccessFile.getClass();
        FileChannel channel = randomAccessFile.getChannel();
        channel.getClass();
        new FileOperator(channel).write(0L, buffer, FILE_HEADER_SIZE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void writeMetadata(long j3) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        randomAccessFile.getClass();
        FileChannel channel = randomAccessFile.getChannel();
        channel.getClass();
        new FileOperator(channel).write(FILE_HEADER_SIZE + j3, buffer, this.metadata.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void commit(long j3) throws IOException {
        writeMetadata(j3);
        RandomAccessFile randomAccessFile = this.file;
        randomAccessFile.getClass();
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j3, this.metadata.size());
        RandomAccessFile randomAccessFile2 = this.file;
        randomAccessFile2.getClass();
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Source source = this.upstream;
        if (source != null) {
            Util.closeQuietly(source);
        }
        this.upstream = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Buffer getBuffer() {
        return this.buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getComplete() {
        return this.complete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RandomAccessFile getFile() {
        return this.file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getSourceCount() {
        return this.sourceCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Source getUpstream() {
        return this.upstream;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Buffer getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isClosed() {
        return this.file == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString metadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Source newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setComplete(boolean z9) {
        this.complete = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSourceCount(int i9) {
        this.sourceCount = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUpstream(Source source) {
        this.upstream = source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUpstreamPos(long j3) {
        this.upstreamPos = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.cache2.Relay.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Relay edit(File file, Source source, ByteString byteString, long j3) throws IOException {
            file.getClass();
            source.getClass();
            byteString.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, source, 0L, byteString, j3, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Relay read(File file) throws IOException {
            file.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            channel.getClass();
            FileOperator fileOperator = new FileOperator(channel);
            Buffer buffer = new Buffer();
            fileOperator.read(0L, buffer, Relay.FILE_HEADER_SIZE);
            if (!AbstractC1416l.m3825a(buffer.readByteString(r11.size()), Relay.PREFIX_CLEAN)) {
                C2104o.m5299y("unreadable cache file");
                return null;
            }
            long j3 = buffer.readLong();
            long j4 = buffer.readLong();
            Buffer buffer2 = new Buffer();
            fileOperator.read(Relay.FILE_HEADER_SIZE + j3, buffer2, j4);
            return new Relay(randomAccessFile, null, j3, buffer2.readByteString(), 0L, null);
        }

        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.io.RandomAccessFile), (r2v0 okio.Source), (r3v0 long), (r5v0 okio.ByteString), (r6v0 long) A[MD:(java.io.RandomAccessFile, okio.Source, long, okio.ByteString, long):void (m)] (LINE:38) call: okhttp3.internal.cache2.Relay.<init>(java.io.RandomAccessFile, okio.Source, long, okio.ByteString, long):void type: THIS */
    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, Source source, long j3, ByteString byteString, long j4, AbstractC1411g abstractC1411g) {
        this(randomAccessFile, source, j3, byteString, j4);
    }
}
