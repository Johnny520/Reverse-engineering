package okhttp3;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p172l8.InterfaceC4691e;
import p376zd.C9995i;
import p376zd.InterfaceC9997j;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0002#\"B%\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\u0012\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011¨\u0006$"}, m16758d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "encodedNames", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Lzd/j;", "sink", _UrlKt.FRAGMENT_ENCODE_SET, "countBytes", _UrlKt.FRAGMENT_ENCODE_SET, "writeOrCountBytes", "(Lzd/j;Z)J", _UrlKt.FRAGMENT_ENCODE_SET, "-deprecated_size", "()I", "size", "index", "encodedName", "(I)Ljava/lang/String;", "name", "encodedValue", "value", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "contentLength", "()J", "Ll8/i0;", "writeTo", "(Lzd/j;)V", "Ljava/util/List;", "Companion", "Builder", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class FormBody extends RequestBody {
    private final List<String> encodedNames;
    private final List<String> encodedValues;
    private static final MediaType CONTENT_TYPE = MediaType.INSTANCE.get("application/x-www-form-urlencoded");

    public FormBody(List<String> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.encodedNames = _UtilJvmKt.toImmutableList(list);
        this.encodedValues = _UtilJvmKt.toImmutableList(list2);
    }

    private final long writeOrCountBytes(InterfaceC9997j sink, boolean countBytes) throws EOFException {
        C9995i c9995iMo38699b;
        if (countBytes) {
            c9995iMo38699b = new C9995i();
        } else {
            sink.getClass();
            c9995iMo38699b = sink.mo38699b();
        }
        int size = this.encodedNames.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                c9995iMo38699b.writeByte(38);
            }
            c9995iMo38699b.mo38698a0(this.encodedNames.get(i10));
            c9995iMo38699b.writeByte(61);
            c9995iMo38699b.mo38698a0(this.encodedValues.get(i10));
        }
        if (!countBytes) {
            return 0L;
        }
        long size2 = c9995iMo38699b.size();
        c9995iMo38699b.m38701c();
        return size2;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m38914deprecated_size() {
        return size();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int index) {
        return this.encodedNames.get(index);
    }

    public final String encodedValue(int index) {
        return this.encodedValues.get(index);
    }

    public final String name(int index) {
        return _UrlKt.percentDecode$default(encodedName(index), 0, 0, true, 3, null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int index) {
        return _UrlKt.percentDecode$default(encodedValue(index), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC9997j sink) throws EOFException {
        sink.getClass();
        writeOrCountBytes(sink, false);
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m16758d2 = {"Lokhttp3/FormBody$Builder;", _UrlKt.FRAGMENT_ENCODE_SET, "charset", "Ljava/nio/charset/Charset;", "<init>", "(Ljava/nio/charset/Charset;)V", "names", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "values", "add", "name", "value", "addEncoded", "build", "Lokhttp3/FormBody;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public final Builder add(String name, String value) {
            name.getClass();
            value.getClass();
            this.names.add(_UrlKt.canonicalizeWithCharset$default(name, 0, 0, _UrlKt.FORM_ENCODE_SET, false, false, false, false, this.charset, 91, null));
            this.values.add(_UrlKt.canonicalizeWithCharset$default(value, 0, 0, _UrlKt.FORM_ENCODE_SET, false, false, false, false, this.charset, 91, null));
            return this;
        }

        public final Builder addEncoded(String name, String value) {
            name.getClass();
            value.getClass();
            this.names.add(_UrlKt.canonicalizeWithCharset$default(name, 0, 0, _UrlKt.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(_UrlKt.canonicalizeWithCharset$default(value, 0, 0, _UrlKt.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Builder(Charset charset, int i10, AbstractC1043k abstractC1043k) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }
}
