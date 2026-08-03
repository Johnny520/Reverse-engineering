package okhttp3;

import gg.AbstractC1411g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p025bc.AbstractC0255e;
import p085fg.InterfaceC1231l;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p218og.AbstractC3137a;
import p276sf.C3967n;
import p276sf.InterfaceC3954a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final BufferedSource source;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public BomAwareReader(BufferedSource bufferedSource, Charset charset) {
            bufferedSource.getClass();
            charset.getClass();
            this.source = bufferedSource;
            this.charset = charset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C3967n c3967n;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                c3967n = C3967n.f12976a;
            } else {
                c3967n = null;
            }
            if (c3967n == null) {
                this.source.close();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.Reader
        public int read(char[] cArr, int i9, int i10) throws IOException {
            cArr.getClass();
            if (this.closed) {
                C2104o.m5299y("Stream closed");
                return 0;
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i9, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Charset charset() {
        Charset charset;
        MediaType mediaTypeContentType = contentType();
        return (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(AbstractC3137a.f10177a)) == null) ? AbstractC3137a.f10177a : charset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final <T> T consumeSource(InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength <= 2147483647L) {
            BufferedSource bufferedSourceSource = source();
            try {
                T t9 = (T) interfaceC1231l.invoke(bufferedSourceSource);
                AbstractC2043a.m5035i(bufferedSourceSource, null);
                int iIntValue = ((Number) interfaceC1231l2.invoke(t9)).intValue();
                if (jContentLength == -1 || jContentLength == iIntValue) {
                    return t9;
                }
                C2104o.m5278c(iIntValue, jContentLength);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC2043a.m5035i(bufferedSourceSource, th2);
                    throw th3;
                }
            }
        } else {
            C2104o.m5299y(AbstractC0255e.m1018g(jContentLength, "Cannot buffer entire body for content length: "));
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InputStream byteStream() {
        return source().inputStream();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final ByteString byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            C2104o.m5299y(AbstractC0255e.m1018g(jContentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        BufferedSource bufferedSourceSource = source();
        try {
            ByteString byteString = bufferedSourceSource.readByteString();
            AbstractC2043a.m5035i(bufferedSourceSource, null);
            int size = byteString.size();
            if (jContentLength == -1 || jContentLength == size) {
                return byteString;
            }
            C2104o.m5278c(size, jContentLength);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2043a.m5035i(bufferedSourceSource, th2);
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            C2104o.m5299y(AbstractC0255e.m1018g(jContentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        BufferedSource bufferedSourceSource = source();
        try {
            byte[] byteArray = bufferedSourceSource.readByteArray();
            AbstractC2043a.m5035i(bufferedSourceSource, null);
            int length = byteArray.length;
            if (jContentLength == -1 || jContentLength == length) {
                return byteArray;
            }
            C2104o.m5278c(length, jContentLength);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2043a.m5035i(bufferedSourceSource, th2);
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final String string() {
        BufferedSource bufferedSourceSource = source();
        try {
            String string = bufferedSourceSource.readString(Util.readBomAsCharset(bufferedSourceSource, charset()));
            AbstractC2043a.m5035i(bufferedSourceSource, null);
            return string;
        } finally {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.ResponseBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ ResponseBody create$default(Companion companion, BufferedSource bufferedSource, MediaType mediaType, long j3, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                mediaType = null;
            }
            if ((i9 & 2) != 0) {
                j3 = -1;
            }
            return companion.create(bufferedSource, mediaType, j3);
        }

        /* JADX DEBUG: Class process forced to load method for inline: okhttp3.MediaType.charset$default(okhttp3.MediaType, java.nio.charset.Charset, int, java.lang.Object):java.nio.charset.Charset */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ResponseBody create(String str, MediaType mediaType) {
            str.getClass();
            Charset charset = AbstractC3137a.f10177a;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            Buffer bufferWriteString = new Buffer().writeString(str, charset);
            return create(bufferWriteString, mediaType, bufferWriteString.size());
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            bArr.getClass();
            return create(new Buffer().write(bArr), mediaType, bArr.length);
        }

        public final ResponseBody create(ByteString byteString, MediaType mediaType) {
            byteString.getClass();
            return create(new Buffer().write(byteString), mediaType, byteString.size());
        }

        public final ResponseBody create(final BufferedSource bufferedSource, final MediaType mediaType, final long j3) {
            bufferedSource.getClass();
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j3;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return mediaType;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.ResponseBody
                public BufferedSource source() {
                    return bufferedSource;
                }
            };
        }

        @InterfaceC3954a
        public final ResponseBody create(MediaType mediaType, String str) {
            str.getClass();
            return create(str, mediaType);
        }

        @InterfaceC3954a
        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            bArr.getClass();
            return create(bArr, mediaType);
        }

        @InterfaceC3954a
        public final ResponseBody create(MediaType mediaType, ByteString byteString) {
            byteString.getClass();
            return create(byteString, mediaType);
        }

        @InterfaceC3954a
        public final ResponseBody create(MediaType mediaType, long j3, BufferedSource bufferedSource) {
            bufferedSource.getClass();
            return create(bufferedSource, mediaType, j3);
        }
    }

    @InterfaceC3954a
    public static final ResponseBody create(MediaType mediaType, long j3, BufferedSource bufferedSource) {
        return Companion.create(mediaType, j3, bufferedSource);
    }

    @InterfaceC3954a
    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    @InterfaceC3954a
    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    @InterfaceC3954a
    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(BufferedSource bufferedSource, MediaType mediaType, long j3) {
        return Companion.create(bufferedSource, mediaType, j3);
    }

    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
