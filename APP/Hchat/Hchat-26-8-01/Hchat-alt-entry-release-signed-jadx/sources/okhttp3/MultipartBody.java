package okhttp3;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import p136j8.C2104o;
import p276sf.InterfaceC3954a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    public static final Companion Companion = new Companion(null);
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final ByteString boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MultipartBody(ByteString byteString, MediaType mediaType, List<Part> list) {
        byteString.getClass();
        mediaType.getClass();
        list.getClass();
        this.boundaryByteString = byteString;
        this.type = mediaType;
        this.parts = list;
        this.contentType = MediaType.Companion.get(mediaType + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: okio.Buffer */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: okio.Buffer */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: okio.Buffer */
    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(BufferedSink bufferedSink, boolean z9) throws EOFException {
        Buffer buffer;
        if (z9) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.parts.size();
        long j3 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Part part = this.parts.get(i9);
            Headers headers = part.headers();
            RequestBody requestBodyBody = part.body();
            bufferedSink.getClass();
            bufferedSink.write(DASHDASH);
            bufferedSink.write(this.boundaryByteString);
            bufferedSink.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    bufferedSink.writeUtf8(headers.name(i10)).write(COLONSPACE).writeUtf8(headers.value(i10)).write(CRLF);
                }
            }
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(mediaTypeContentType.toString()).write(CRLF);
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(CRLF);
            } else if (z9) {
                buffer.getClass();
                buffer.clear();
                return -1L;
            }
            byte[] bArr = CRLF;
            bufferedSink.write(bArr);
            if (z9) {
                j3 += jContentLength;
            } else {
                requestBodyBody.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        bufferedSink.getClass();
        byte[] bArr2 = DASHDASH;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.boundaryByteString);
        bufferedSink.write(bArr2);
        bufferedSink.write(CRLF);
        if (!z9) {
            return j3;
        }
        buffer.getClass();
        long size3 = buffer.size() + j3;
        buffer.clear();
        return size3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m11005deprecated_boundary() {
        return boundary();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m11006deprecated_parts() {
        return this.parts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m11007deprecated_size() {
        return size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final MediaType m11008deprecated_type() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String boundary() {
        return this.boundaryByteString.utf8();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.RequestBody
    public long contentLength() throws EOFException {
        long j3 = this.contentLength;
        if (j3 != -1) {
            return j3;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Part part(int i9) {
        return this.parts.get(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Part> parts() {
        return this.parts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return this.parts.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MediaType type() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws EOFException {
        bufferedSink.getClass();
        writeOrCountBytes(bufferedSink, false);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Part {
        public static final Companion Companion = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static final Part create(Headers headers, RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
        public final RequestBody m11009deprecated_body() {
            return this.body;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
        public final Headers m11010deprecated_headers() {
            return this.headers;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RequestBody body() {
            return this.body;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Headers headers() {
            return this.headers;
        }

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.MultipartBody.Part.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Part create(Headers headers, RequestBody requestBody) {
                requestBody.getClass();
                AbstractC1411g abstractC1411g = null;
                if ((headers != null ? headers.get("Content-Type") : null) != null) {
                    C2104o.m5294t("Unexpected header: Content-Type");
                    return null;
                }
                if ((headers != null ? headers.get("Content-Length") : null) == null) {
                    return new Part(headers, requestBody, abstractC1411g);
                }
                C2104o.m5294t("Unexpected header: Content-Length");
                return null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Part createFormData(String str, String str2, RequestBody requestBody) {
                str.getClass();
                requestBody.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb2, str);
                if (str2 != null) {
                    sb2.append("; filename=");
                    companion.appendQuotedString$okhttp(sb2, str2);
                }
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb2.toString()).build(), requestBody);
            }

            private Companion() {
            }

            public final Part create(RequestBody requestBody) {
                requestBody.getClass();
                return create(null, requestBody);
            }

            public final Part createFormData(String str, String str2) {
                str.getClass();
                str2.getClass();
                return createFormData(str, null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 okhttp3.Headers), (r2v0 okhttp3.RequestBody) A[MD:(okhttp3.Headers, okhttp3.RequestBody):void (m)] (LINE:9) call: okhttp3.MultipartBody.Part.<init>(okhttp3.Headers, okhttp3.RequestBody):void type: THIS */
        public /* synthetic */ Part(Headers headers, RequestBody requestBody, AbstractC1411g abstractC1411g) {
            this(headers, requestBody);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.MultipartBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void appendQuotedString$okhttp(StringBuilder sb2, String str) {
            sb2.getClass();
            str.getClass();
            sb2.append('\"');
            int length = str.length();
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = str.charAt(i9);
                if (cCharAt == '\n') {
                    sb2.append("%0A");
                } else if (cCharAt == '\r') {
                    sb2.append("%0D");
                } else if (cCharAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(cCharAt);
                }
            }
            sb2.append('\"');
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private final ByteString boundary;
        private final List<Part> parts;
        private MediaType type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder(String str) {
            str.getClass();
            this.boundary = ByteString.Companion.encodeUtf8(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addFormDataPart(String str, String str2) {
            str.getClass();
            str2.getClass();
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addPart(RequestBody requestBody) {
            requestBody.getClass();
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            C2104o.m5276A("Multipart body must have at least one part.");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setType(MediaType mediaType) {
            mediaType.getClass();
            if (AbstractC1416l.m3825a(mediaType.type(), "multipart")) {
                this.type = mediaType;
                return this;
            }
            C2104o.m5300z(mediaType, "multipart != ");
            return null;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            requestBody.getClass();
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        public final Builder addPart(Part part) {
            part.getClass();
            this.parts.add(part);
            return this;
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            str.getClass();
            requestBody.getClass();
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, int i9, AbstractC1411g abstractC1411g) {
            if ((i9 & 1) != 0) {
                str = UUID.randomUUID().toString();
                str.getClass();
            }
            this(str);
        }
    }
}
