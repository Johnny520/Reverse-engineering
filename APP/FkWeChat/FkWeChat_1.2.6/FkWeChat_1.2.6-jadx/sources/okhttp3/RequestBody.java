package okhttp3;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import okio.AbstractC5795a;
import okio.C5799e;
import p024b9.AbstractC1043k;
import p172l8.C4700i0;
import p172l8.C4711r;
import p172l8.InterfaceC4691e;
import p325w8.AbstractC9202b;
import p376zd.AbstractC9988e0;
import p376zd.C10003m;
import p376zd.C10027y;
import p376zd.InterfaceC10024w0;
import p376zd.InterfaceC9997j;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m16758d2 = {"Lokhttp3/RequestBody;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", _UrlKt.FRAGMENT_ENCODE_SET, "contentLength", "()J", "Lzd/j;", "sink", "Ll8/i0;", "writeTo", "(Lzd/j;)V", _UrlKt.FRAGMENT_ENCODE_SET, "isDuplex", "()Z", "isOneShot", "Lzd/m;", "sha256", "()Lzd/m;", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public abstract class RequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final RequestBody EMPTY;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.create$default(companion, C10003m.f33583u, (MediaType) null, 1, (Object) null);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return INSTANCE.create(file, mediaType);
    }

    public long contentLength() {
        return -1L;
    }

    /* JADX INFO: renamed from: contentType */
    public abstract MediaType get$contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public final C10003m sha256() throws IllegalAccessException, IOException, InvocationTargetException {
        C10027y c10027yM38848a = C10027y.f33641s.m38848a(AbstractC9988e0.m38646a());
        InterfaceC9997j interfaceC9997jM38647b = AbstractC9988e0.m38647b(c10027yM38848a);
        try {
            writeTo(interfaceC9997jM38647b);
            C4700i0 c4700i0 = C4700i0.f13910a;
            AbstractC9202b.m35830a(interfaceC9997jM38647b, null);
            return c10027yM38848a.m38847c();
        } finally {
        }
    }

    public abstract void writeTo(InterfaceC9997j sink);

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000eJ3\u0010\n\u001a\u00020\u0007*\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u0007*\u00020\u00142\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0015J'\u0010\u0016\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u001aJ!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u001dJ5\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\b\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m16758d2 = {"Lokhttp3/RequestBody$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/MediaType;", "contentType", "Lokhttp3/RequestBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "toRequestBody", "Lzd/m;", "(Lzd/m;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "Ljava/io/FileDescriptor;", "(Ljava/io/FileDescriptor;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "offset", "byteCount", "([BLokhttp3/MediaType;II)Lokhttp3/RequestBody;", "Ljava/io/File;", "(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "asRequestBody", "Lokio/e;", "Lokio/a;", "fileSystem", "(Lokio/e;Lokio/a;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;", "(Lokhttp3/MediaType;Lzd/m;)Lokhttp3/RequestBody;", "(Lokhttp3/MediaType;[BII)Lokhttp3/RequestBody;", "file", "(Lokhttp3/MediaType;Ljava/io/File;)Lokhttp3/RequestBody;", "EMPTY", "Lokhttp3/RequestBody;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return companion.create(bArr, mediaType, i10, i11);
        }

        public final RequestBody create(String str, MediaType mediaType) {
            str.getClass();
            C4711r c4711rChooseCharset = Internal.chooseCharset(mediaType);
            Charset charset = (Charset) c4711rChooseCharset.m18792a();
            MediaType mediaType2 = (MediaType) c4711rChooseCharset.m18793b();
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            return create(bytes, mediaType2, 0, bytes.length);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, C10003m c10003m, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(c10003m, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, FileDescriptor fileDescriptor, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(fileDescriptor, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, C5799e c5799e, AbstractC5795a abstractC5795a, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                mediaType = null;
            }
            return companion.create(c5799e, abstractC5795a, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return companion.create(mediaType, bArr, i10, i11);
        }

        @InterfaceC4691e
        public final RequestBody create(MediaType mediaType, byte[] bArr, int i10) {
            bArr.getClass();
            return create$default(this, mediaType, bArr, i10, 0, 8, (Object) null);
        }

        public final RequestBody create(byte[] bArr) {
            bArr.getClass();
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            bArr.getClass();
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i10) {
            bArr.getClass();
            return create$default(this, bArr, mediaType, i10, 0, 4, (Object) null);
        }

        @InterfaceC4691e
        public final RequestBody create(MediaType mediaType, byte[] bArr) {
            bArr.getClass();
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        public final RequestBody create(final C10003m c10003m, final MediaType mediaType) {
            c10003m.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return c10003m.m38765G();
                }

                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(InterfaceC9997j sink) {
                    sink.getClass();
                    sink.mo38736y0(c10003m);
                }
            };
        }

        public final RequestBody create(final FileDescriptor fileDescriptor, final MediaType mediaType) {
            fileDescriptor.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public boolean isOneShot() {
                    return true;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(InterfaceC9997j sink) throws IllegalAccessException, IOException, InvocationTargetException {
                    sink.getClass();
                    FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
                    try {
                        sink.mo38699b().mo38670A0(AbstractC9988e0.m38654i(fileInputStream));
                        AbstractC9202b.m35830a(fileInputStream, null);
                    } finally {
                    }
                }
            };
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i10, final int i11) {
            bArr.getClass();
            _UtilCommonKt.checkOffsetAndCount(bArr.length, i10, i11);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$3
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i11;
                }

                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(InterfaceC9997j sink) {
                    sink.getClass();
                    sink.write(bArr, i10, i11);
                }
            };
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            file.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(InterfaceC9997j sink) throws IllegalAccessException, IOException, InvocationTargetException {
                    sink.getClass();
                    InterfaceC10024w0 interfaceC10024w0M38653h = AbstractC9988e0.m38653h(file);
                    try {
                        sink.mo38670A0(interfaceC10024w0M38653h);
                        AbstractC9202b.m35830a(interfaceC10024w0M38653h, null);
                    } finally {
                    }
                }
            };
        }

        public final RequestBody create(final C5799e c5799e, final AbstractC5795a abstractC5795a, final MediaType mediaType) {
            c5799e.getClass();
            abstractC5795a.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    Long lM38817c = abstractC5795a.metadata(c5799e).m38817c();
                    if (lM38817c != null) {
                        return lM38817c.longValue();
                    }
                    return -1L;
                }

                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(InterfaceC9997j sink) throws IllegalAccessException, IOException, InvocationTargetException {
                    sink.getClass();
                    InterfaceC10024w0 interfaceC10024w0Source = abstractC5795a.source(c5799e);
                    try {
                        sink.mo38670A0(interfaceC10024w0Source);
                        AbstractC9202b.m35830a(interfaceC10024w0Source, null);
                    } finally {
                    }
                }
            };
        }

        @InterfaceC4691e
        public final RequestBody create(MediaType contentType, String content) {
            content.getClass();
            return create(content, contentType);
        }

        @InterfaceC4691e
        public final RequestBody create(MediaType contentType, C10003m content) {
            content.getClass();
            return create(content, contentType);
        }

        @InterfaceC4691e
        public final RequestBody create(MediaType contentType, byte[] content, int offset, int byteCount) {
            content.getClass();
            return create(content, contentType, offset, byteCount);
        }

        @InterfaceC4691e
        public final RequestBody create(MediaType contentType, File file) {
            file.getClass();
            return create(file, contentType);
        }
    }

    public static final RequestBody create(FileDescriptor fileDescriptor, MediaType mediaType) {
        return INSTANCE.create(fileDescriptor, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @InterfaceC4691e
    public static final RequestBody create(MediaType mediaType, File file) {
        return INSTANCE.create(mediaType, file);
    }

    @InterfaceC4691e
    public static final RequestBody create(MediaType mediaType, String str) {
        return INSTANCE.create(mediaType, str);
    }

    @InterfaceC4691e
    public static final RequestBody create(MediaType mediaType, C10003m c10003m) {
        return INSTANCE.create(mediaType, c10003m);
    }

    @InterfaceC4691e
    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @InterfaceC4691e
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i10) {
        return INSTANCE.create(mediaType, bArr, i10);
    }

    @InterfaceC4691e
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i10, int i11) {
        return INSTANCE.create(mediaType, bArr, i10, i11);
    }

    public static final RequestBody create(C5799e c5799e, AbstractC5795a abstractC5795a, MediaType mediaType) {
        return INSTANCE.create(c5799e, abstractC5795a, mediaType);
    }

    public static final RequestBody create(C10003m c10003m, MediaType mediaType) {
        return INSTANCE.create(c10003m, mediaType);
    }

    public static final RequestBody create(byte[] bArr) {
        return INSTANCE.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i10) {
        return INSTANCE.create(bArr, mediaType, i10);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i10, int i11) {
        return INSTANCE.create(bArr, mediaType, i10, i11);
    }
}
