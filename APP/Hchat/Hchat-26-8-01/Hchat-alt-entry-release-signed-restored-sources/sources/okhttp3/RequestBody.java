package okhttp3;

import gg.AbstractC1411g;
import java.io.File;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p129ig.AbstractC2043a;
import p218og.AbstractC3137a;
import p276sf.InterfaceC3954a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isDuplex() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.RequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i9, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                mediaType = null;
            }
            if ((i11 & 2) != 0) {
                i9 = 0;
            }
            if ((i11 & 4) != 0) {
                i10 = bArr.length;
            }
            return companion.create(bArr, mediaType, i9, i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final RequestBody create(String str, MediaType mediaType) {
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
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            return create(bytes, mediaType, 0, bytes.length);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i9, int i10, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                i9 = 0;
            }
            if ((i11 & 8) != 0) {
                i10 = bArr.length;
            }
            return companion.create(mediaType, bArr, i9, i10);
        }

        @InterfaceC3954a
        public final RequestBody create(MediaType mediaType, byte[] bArr, int i9) {
            bArr.getClass();
            return create$default(this, mediaType, bArr, i9, 0, 8, (Object) null);
        }

        public final RequestBody create(byte[] bArr) {
            bArr.getClass();
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            bArr.getClass();
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i9) {
            bArr.getClass();
            return create$default(this, bArr, mediaType, i9, 0, 4, (Object) null);
        }

        @InterfaceC3954a
        public final RequestBody create(MediaType mediaType, byte[] bArr) {
            bArr.getClass();
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        public final RequestBody create(final ByteString byteString, final MediaType mediaType) {
            byteString.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return byteString.size();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink bufferedSink) {
                    bufferedSink.getClass();
                    bufferedSink.write(byteString);
                }
            };
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i9, final int i10) {
            bArr.getClass();
            Util.checkOffsetAndCount(bArr.length, i9, i10);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i10;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink bufferedSink) {
                    bufferedSink.getClass();
                    bufferedSink.write(bArr, i9, i10);
                }
            };
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            file.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink bufferedSink) {
                    bufferedSink.getClass();
                    Source source = Okio.source(file);
                    try {
                        bufferedSink.writeAll(source);
                        AbstractC2043a.m5035i(source, null);
                    } finally {
                    }
                }
            };
        }

        @InterfaceC3954a
        public final RequestBody create(MediaType mediaType, String str) {
            str.getClass();
            return create(str, mediaType);
        }

        @InterfaceC3954a
        public final RequestBody create(MediaType mediaType, ByteString byteString) {
            byteString.getClass();
            return create(byteString, mediaType);
        }

        @InterfaceC3954a
        public final RequestBody create(MediaType mediaType, byte[] bArr, int i9, int i10) {
            bArr.getClass();
            return create(bArr, mediaType, i9, i10);
        }

        @InterfaceC3954a
        public final RequestBody create(MediaType mediaType, File file) {
            file.getClass();
            return create(file, mediaType);
        }
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @InterfaceC3954a
    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    @InterfaceC3954a
    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    @InterfaceC3954a
    public static final RequestBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    @InterfaceC3954a
    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @InterfaceC3954a
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i9) {
        return Companion.create(mediaType, bArr, i9);
    }

    @InterfaceC3954a
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i9, int i10) {
        return Companion.create(mediaType, bArr, i9, i10);
    }

    public static final RequestBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i9) {
        return Companion.create(bArr, mediaType, i9);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i9, int i10) {
        return Companion.create(bArr, mediaType, i9, i10);
    }
}
