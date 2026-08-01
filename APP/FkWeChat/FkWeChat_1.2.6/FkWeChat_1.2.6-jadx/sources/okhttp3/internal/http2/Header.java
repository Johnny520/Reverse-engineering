package okhttp3.internal.http2;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p376zd.C10003m;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m16758d2 = {"Lokhttp3/internal/http2/Header;", _UrlKt.FRAGMENT_ENCODE_SET, "Lzd/m;", "name", "value", "<init>", "(Lzd/m;Lzd/m;)V", _UrlKt.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;)V", "(Lzd/m;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "()Lzd/m;", "component2", "copy", "(Lzd/m;Lzd/m;)Lokhttp3/internal/http2/Header;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "Lzd/m;", "hpackSize", "I", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class Header {
    public static final C10003m PSEUDO_PREFIX;
    public static final C10003m RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C10003m TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C10003m TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C10003m TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C10003m TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final C10003m name;
    public final C10003m value;

    static {
        C10003m.a aVar = C10003m.f33582t;
        PSEUDO_PREFIX = aVar.m38794d(":");
        RESPONSE_STATUS = aVar.m38794d(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = aVar.m38794d(TARGET_METHOD_UTF8);
        TARGET_PATH = aVar.m38794d(TARGET_PATH_UTF8);
        TARGET_SCHEME = aVar.m38794d(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = aVar.m38794d(TARGET_AUTHORITY_UTF8);
    }

    public Header(C10003m c10003m, C10003m c10003m2) {
        c10003m.getClass();
        c10003m2.getClass();
        this.name = c10003m;
        this.value = c10003m2;
        this.hpackSize = c10003m.m38765G() + 32 + c10003m2.m38765G();
    }

    public static /* synthetic */ Header copy$default(Header header, C10003m c10003m, C10003m c10003m2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c10003m = header.name;
        }
        if ((i10 & 2) != 0) {
            c10003m2 = header.value;
        }
        return header.copy(c10003m, c10003m2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C10003m getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C10003m getValue() {
        return this.value;
    }

    public final Header copy(C10003m name, C10003m value) {
        name.getClass();
        value.getClass();
        return new Header(name, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return AbstractC1061t.m3842c(this.name, header.name) && AbstractC1061t.m3842c(this.value, header.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return this.name.m38770M() + ": " + this.value.m38770M();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(String str, String str2) {
        str.getClass();
        str2.getClass();
        C10003m.a aVar = C10003m.f33582t;
        this(aVar.m38794d(str), aVar.m38794d(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(C10003m c10003m, String str) {
        this(c10003m, C10003m.f33582t.m38794d(str));
        c10003m.getClass();
        str.getClass();
    }
}
