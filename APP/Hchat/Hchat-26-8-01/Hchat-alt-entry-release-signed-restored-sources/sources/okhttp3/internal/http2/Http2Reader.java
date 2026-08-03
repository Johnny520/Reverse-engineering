package okhttp3.internal.http2;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.C3193a;
import okio.Source;
import okio.Timeout;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p172lg.C2562b;
import p222p.AbstractC3199a;
import p259r9.AbstractC3754e0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final BufferedSource source;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Handler {
        void ackSettings();

        void alternateService(int i9, String str, ByteString byteString, String str2, int i10, long j3);

        void data(boolean z9, int i9, BufferedSource bufferedSource, int i10);

        void goAway(int i9, ErrorCode errorCode, ByteString byteString);

        void headers(boolean z9, int i9, int i10, List<Header> list);

        void ping(boolean z9, int i9, int i10);

        void priority(int i9, int i10, int i11, boolean z9);

        void pushPromise(int i9, int i10, List<Header> list);

        void rstStream(int i9, ErrorCode errorCode);

        void settings(boolean z9, Settings settings);

        void windowUpdate(int i9, long j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        logger2.getClass();
        logger = logger2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Http2Reader(BufferedSource bufferedSource, boolean z9) {
        bufferedSource.getClass();
        this.source = bufferedSource;
        this.client = z9;
        ContinuationSource continuationSource = new ContinuationSource(bufferedSource);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readData(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i11 == 0) {
            C2104o.m5299y("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z9 = (i10 & 1) != 0;
        if ((i10 & 32) != 0) {
            C2104o.m5299y("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        int iAnd = (i10 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.data(z9, i11, this.source, Companion.lengthWithoutPadding(i9, i10, iAnd));
        this.source.skip(iAnd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readGoAway(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i9 < 8) {
            C2104o.m5299y(AbstractC0921a.m2249l(i9, "TYPE_GOAWAY length < 8: "));
            return;
        }
        if (i11 != 0) {
            C2104o.m5299y("TYPE_GOAWAY streamId != 0");
            return;
        }
        int i12 = this.source.readInt();
        int i13 = this.source.readInt();
        int i14 = i9 - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i13);
        if (errorCodeFromHttp2 == null) {
            C2104o.m5299y(AbstractC0921a.m2249l(i13, "TYPE_GOAWAY unexpected error code: "));
            return;
        }
        ByteString byteString = ByteString.EMPTY;
        if (i14 > 0) {
            byteString = this.source.readByteString(i14);
        }
        handler.goAway(i12, errorCodeFromHttp2, byteString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<Header> readHeaderBlock(int i9, int i10, int i11, int i12) throws IOException {
        this.continuation.setLeft(i9);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i10);
        this.continuation.setFlags(i11);
        this.continuation.setStreamId(i12);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readHeaders(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i11 == 0) {
            C2104o.m5299y("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z9 = (i10 & 1) != 0;
        int iAnd = (i10 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        if ((i10 & 32) != 0) {
            readPriority(handler, i11);
            i9 -= 5;
        }
        handler.headers(z9, i11, -1, readHeaderBlock(Companion.lengthWithoutPadding(i9, i10, iAnd), iAnd, i10, i11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readPing(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i9 != 8) {
            C2104o.m5299y(AbstractC0921a.m2249l(i9, "TYPE_PING length != 8: "));
        } else {
            if (i11 != 0) {
                C2104o.m5299y("TYPE_PING streamId != 0");
                return;
            }
            handler.ping((i10 & 1) != 0, this.source.readInt(), this.source.readInt());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readPriority(Handler handler, int i9) {
        int i10 = this.source.readInt();
        handler.priority(i9, i10 & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i10) != 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readPushPromise(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i11 == 0) {
            C2104o.m5299y("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        } else {
            int iAnd = (i10 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
            handler.pushPromise(i11, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i9 - 4, i10, iAnd), iAnd, i10, i11));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readRstStream(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i9 != 4) {
            C2104o.m5299y(AbstractC0921a.m2250m(i9, "TYPE_RST_STREAM length: ", " != 4"));
            return;
        }
        if (i11 == 0) {
            C2104o.m5299y("TYPE_RST_STREAM streamId == 0");
            return;
        }
        int i12 = this.source.readInt();
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i12);
        if (errorCodeFromHttp2 != null) {
            handler.rstStream(i11, errorCodeFromHttp2);
        } else {
            C2104o.m5299y(AbstractC0921a.m2249l(i12, "TYPE_RST_STREAM unexpected error code: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readSettings(Handler handler, int i9, int i10, int i11) throws IOException {
        int i12;
        if (i11 != 0) {
            C2104o.m5299y("TYPE_SETTINGS streamId != 0");
            return;
        }
        if ((i10 & 1) != 0) {
            if (i9 == 0) {
                handler.ackSettings();
                return;
            } else {
                C2104o.m5299y("FRAME_SIZE_ERROR ack frame should be empty!");
                return;
            }
        }
        if (i9 % 6 != 0) {
            C2104o.m5299y(AbstractC0921a.m2249l(i9, "TYPE_SETTINGS length % 6 != 0: "));
            return;
        }
        Settings settings = new Settings();
        C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, i9), 6);
        int i13 = c2562bM7902n0.f8312g;
        int i14 = c2562bM7902n0.f8313h;
        int i15 = c2562bM7902n0.f8314i;
        if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
            while (true) {
                int iAnd = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                i12 = this.source.readInt();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd != 4) {
                        if (iAnd == 5 && (i12 < 16384 || i12 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i12 < 0) {
                            C2104o.m5299y("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            return;
                        }
                        iAnd = 7;
                    }
                } else if (i12 != 0 && i12 != 1) {
                    C2104o.m5299y("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    return;
                }
                settings.set(iAnd, i12);
                if (i13 == i14) {
                    break;
                } else {
                    i13 += i15;
                }
            }
            C2104o.m5299y(AbstractC0921a.m2249l(i12, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
            return;
        }
        handler.settings(false, settings);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void readWindowUpdate(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i9 != 4) {
            C2104o.m5299y(AbstractC0921a.m2249l(i9, "TYPE_WINDOW_UPDATE length !=4: "));
            return;
        }
        long jAnd = Util.and(this.source.readInt(), 2147483647L);
        if (jAnd != 0) {
            handler.windowUpdate(i11, jAnd);
        } else {
            C2104o.m5299y("windowSizeIncrement was 0");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean nextFrame(boolean z9, Handler handler) throws IOException {
        handler.getClass();
        try {
            this.source.require(9L);
            int medium = Util.readMedium(this.source);
            if (medium > 16384) {
                C2104o.m5299y(AbstractC0921a.m2249l(medium, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int iAnd = Util.and(this.source.readByte(), 255);
            int iAnd2 = Util.and(this.source.readByte(), 255);
            int i9 = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, i9, medium, iAnd, iAnd2));
            }
            if (z9 && iAnd != 4) {
                C3193a.m6818g(Http2.INSTANCE.formattedType$okhttp(iAnd), "Expected a SETTINGS frame but was ");
                return false;
            }
            switch (iAnd) {
                case 0:
                    readData(handler, medium, iAnd2, i9);
                    return true;
                case 1:
                    readHeaders(handler, medium, iAnd2, i9);
                    return true;
                case 2:
                    readPriority(handler, medium, iAnd2, i9);
                    return true;
                case 3:
                    readRstStream(handler, medium, iAnd2, i9);
                    return true;
                case 4:
                    readSettings(handler, medium, iAnd2, i9);
                    return true;
                case 5:
                    readPushPromise(handler, medium, iAnd2, i9);
                    return true;
                case 6:
                    readPing(handler, medium, iAnd2, i9);
                    return true;
                case 7:
                    readGoAway(handler, medium, iAnd2, i9);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, iAnd2, i9);
                    return true;
                default:
                    this.source.skip(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void readConnectionPreface(Handler handler) throws IOException {
        handler.getClass();
        if (this.client) {
            if (nextFrame(true, handler)) {
                return;
            }
            C2104o.m5299y("Required SETTINGS preface not received");
            return;
        }
        BufferedSource bufferedSource = this.source;
        ByteString byteString = Http2.CONNECTION_PREFACE;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (AbstractC1416l.m3825a(byteString, byteString2)) {
            return;
        }
        C3193a.m6818g(byteString2.utf8(), "Expected a connection header but was ");
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.http2.Http2Reader.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int lengthWithoutPadding(int i9, int i10, int i11) throws IOException {
            if ((i10 & 8) != 0) {
                i9--;
            }
            if (i11 <= i9) {
                return i9 - i11;
            }
            C2104o.m5299y(AbstractC3199a.m6837j(i11, "PROTOCOL_ERROR padding ", " > remaining length ", i9));
            return 0;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class ContinuationSource implements Source {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final BufferedSource source;
        private int streamId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ContinuationSource(BufferedSource bufferedSource) {
            bufferedSource.getClass();
            this.source = bufferedSource;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void readContinuationHeader() throws IOException {
            int i9 = this.streamId;
            int medium = Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int i10 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i10;
            if (iAnd != 9) {
                C2104o.m5299y(AbstractC3199a.m6836i(iAnd, " != TYPE_CONTINUATION"));
            } else {
                if (i10 == i9) {
                    return;
                }
                C2104o.m5299y("TYPE_CONTINUATION streamId changed");
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getFlags() {
            return this.flags;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getLeft() {
            return this.left;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getLength() {
            return this.length;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getPadding() {
            return this.padding;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getStreamId() {
            return this.streamId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source
        public long read(Buffer buffer, long j3) throws IOException {
            buffer.getClass();
            while (true) {
                int i9 = this.left;
                BufferedSource bufferedSource = this.source;
                if (i9 != 0) {
                    long j4 = bufferedSource.read(buffer, Math.min(j3, i9));
                    if (j4 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j4;
                    return j4;
                }
                bufferedSource.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setFlags(int i9) {
            this.flags = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setLeft(int i9) {
            this.left = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setLength(int i9) {
            this.length = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setPadding(int i9) {
            this.padding = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setStreamId(int i9) {
            this.streamId = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Source
        public Timeout timeout() {
            return this.source.timeout();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    private final void readPriority(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i9 != 5) {
            C2104o.m5299y(AbstractC0921a.m2250m(i9, "TYPE_PRIORITY length: ", " != 5"));
        } else if (i11 != 0) {
            readPriority(handler, i11);
        } else {
            C2104o.m5299y("TYPE_PRIORITY streamId == 0");
        }
    }
}
