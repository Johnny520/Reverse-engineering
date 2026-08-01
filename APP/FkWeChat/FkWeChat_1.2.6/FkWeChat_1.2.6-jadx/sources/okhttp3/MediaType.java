package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.InterfaceC4691e;
import p283t8.AbstractC8205c;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p299ub.C8622g;
import p299ub.C8632n;
import p299ub.InterfaceC8626i;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0003J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0012J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001b"}, m16758d2 = {"Lokhttp3/MediaType;", _UrlKt.FRAGMENT_ENCODE_SET, "mediaType", _UrlKt.FRAGMENT_ENCODE_SET, "type", "subtype", "parameterNamesAndValues", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getMediaType$okhttp", "()Ljava/lang/String;", "[Ljava/lang/String;", "charset", "Ljava/nio/charset/Charset;", "defaultValue", "parameter", "name", "-deprecated_type", "-deprecated_subtype", "toString", "equals", _UrlKt.FRAGMENT_ENCODE_SET, "other", "hashCode", _UrlKt.FRAGMENT_ENCODE_SET, "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final C8632n TYPE_SUBTYPE = new C8632n("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final C8632n PARAMETER = new C8632n(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public MediaType(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        strArr.getClass();
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public static final MediaType get(String str) {
        return INSTANCE.get(str);
    }

    public static final MediaType parse(String str) {
        return INSTANCE.parse(str);
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_subtype, reason: not valid java name and from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final String getType() {
        return this.type;
    }

    public final Charset charset(Charset defaultValue) {
        String strParameter = parameter("charset");
        if (strParameter == null) {
            return defaultValue;
        }
        try {
            return Charset.forName(strParameter);
        } catch (IllegalArgumentException unused) {
            return defaultValue;
        }
    }

    public boolean equals(Object other) {
        return (other instanceof MediaType) && AbstractC1061t.m3842c(((MediaType) other).mediaType, this.mediaType);
    }

    /* JADX INFO: renamed from: getMediaType$okhttp, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String name) {
        name.getClass();
        int i10 = 0;
        int iM31894c = AbstractC8205c.m31894c(0, this.parameterNamesAndValues.length - 1, 2);
        if (iM31894c < 0) {
            return null;
        }
        while (!AbstractC8611a0.m33061F(this.parameterNamesAndValues[i10], name, true)) {
            if (i10 == iM31894c) {
                return null;
            }
            i10 += 2;
        }
        return this.parameterNamesAndValues[i10 + 1];
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m16758d2 = {"Lokhttp3/MediaType$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/MediaType;", "get", "(Ljava/lang/String;)Lokhttp3/MediaType;", "toMediaType", "parse", "toMediaTypeOrNull", "mediaType", "-deprecated_get", "-deprecated_parse", "TOKEN", "Ljava/lang/String;", "QUOTED", "Lub/n;", "TYPE_SUBTYPE", "Lub/n;", "PARAMETER", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        @InterfaceC4691e
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m38950deprecated_get(String mediaType) {
            mediaType.getClass();
            return get(mediaType);
        }

        @InterfaceC4691e
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m38951deprecated_parse(String mediaType) {
            mediaType.getClass();
            return parse(mediaType);
        }

        public final MediaType get(String str) {
            str.getClass();
            InterfaceC8626i interfaceC8626iM33215g = MediaType.TYPE_SUBTYPE.m33215g(str, 0);
            if (interfaceC8626iM33215g == null) {
                C5752g.m23253a("No subtype found for: \"", str, 34);
                return null;
            }
            String str2 = (String) interfaceC8626iM33215g.mo33182b().get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = ((String) interfaceC8626iM33215g.mo33182b().get(2)).toLowerCase(locale);
            lowerCase2.getClass();
            ArrayList arrayList = new ArrayList();
            int iM8561p = interfaceC8626iM33215g.mo33184d().m8561p();
            while (true) {
                int i10 = iM8561p + 1;
                if (i10 >= str.length()) {
                    return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                InterfaceC8626i interfaceC8626iM33215g2 = MediaType.PARAMETER.m33215g(str, i10);
                if (interfaceC8626iM33215g2 == null) {
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i10) + "\" for: \"" + str + '\"').toString());
                }
                C8622g c8622g = interfaceC8626iM33215g2.mo33183c().get(1);
                String strM33172a = c8622g != null ? c8622g.m33172a() : null;
                if (strM33172a == null) {
                    iM8561p = interfaceC8626iM33215g2.mo33184d().m8561p();
                } else {
                    C8622g c8622g2 = interfaceC8626iM33215g2.mo33183c().get(2);
                    String strM33172a2 = c8622g2 != null ? c8622g2.m33172a() : null;
                    if (strM33172a2 == null) {
                        C8622g c8622g3 = interfaceC8626iM33215g2.mo33183c().get(3);
                        c8622g3.getClass();
                        strM33172a2 = c8622g3.m33172a();
                    } else if (AbstractC8621f0.m33125Z0(strM33172a2, '\'', false, 2, null) && AbstractC8621f0.m33132d0(strM33172a2, '\'', false, 2, null) && strM33172a2.length() > 2) {
                        strM33172a2 = strM33172a2.substring(1, strM33172a2.length() - 1);
                    }
                    arrayList.add(strM33172a);
                    arrayList.add(strM33172a2);
                    iM8561p = interfaceC8626iM33215g2.mo33184d().m8561p();
                }
            }
        }

        public final MediaType parse(String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }
}
