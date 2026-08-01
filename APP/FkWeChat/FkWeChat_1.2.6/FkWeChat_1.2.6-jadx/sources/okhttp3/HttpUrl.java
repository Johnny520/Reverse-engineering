package okhttp3;

import ae.C0307f;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p080f9.C2361h;
import p172l8.InterfaceC4691e;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p283t8.AbstractC8205c;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p299ub.AbstractC8625h0;
import p299ub.C8632n;
import p376zd.C10010p0;
import p376zd.C10030z0;
import p376zd.C9987e;
import p376zd.C9994h0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 K2\u00020\u0001:\u0002JKBc\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\rJ\r\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\b\u001aJ\u0010\u0010#\u001a\u0004\u0018\u00010\u00032\u0006\u0010$\u001a\u00020\u0003J\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010$\u001a\u00020\u0003J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\bJ\u0010\u0010+\u001a\u0004\u0018\u00010\u00032\u0006\u0010*\u001a\u00020\bJ\u0006\u0010-\u001a\u00020\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u00002\u0006\u0010/\u001a\u00020\u0003J\u0006\u00100\u001a\u000201J\u0010\u00100\u001a\u0004\u0018\u0001012\u0006\u0010/\u001a\u00020\u0003J\u0013\u00102\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00104\u001a\u00020\bH\u0016J\b\u00105\u001a\u00020\u0003H\u0016J\b\u00106\u001a\u0004\u0018\u00010\u0003J\r\u0010\r\u001a\u00020\u0017H\u0007¢\u0006\u0002\b7J\r\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0002\b8J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b9J\r\u0010\u001b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b:J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b;J\r\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0002\b<J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b=J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b?J\r\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0002\b@J\r\u0010\u001e\u001a\u00020\u0003H\u0007¢\u0006\u0002\bAJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\bBJ\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\bCJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bDJ\u000f\u0010!\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bEJ\r\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0002\bFJ\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0007¢\u0006\u0002\bGJ\u000f\u0010,\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bHJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bIR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001c\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u001d\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0012R\u0013\u0010 \u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0013\u0010!\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\"\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&8G¢\u0006\u0006\u001a\u0004\b%\u0010'R\u0013\u0010,\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b,\u0010\u0010¨\u0006L"}, m16758d2 = {"Lokhttp3/HttpUrl;", _UrlKt.FRAGMENT_ENCODE_SET, "scheme", _UrlKt.FRAGMENT_ENCODE_SET, "username", "password", "host", "port", _UrlKt.FRAGMENT_ENCODE_SET, "pathSegments", _UrlKt.FRAGMENT_ENCODE_SET, "queryNamesAndValues", "fragment", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "()I", "()Ljava/util/List;", "isHttps", _UrlKt.FRAGMENT_ENCODE_SET, "()Z", "toUrl", "Ljava/net/URL;", "toUri", "Ljava/net/URI;", "uri", "encodedUsername", "encodedPassword", "pathSize", "encodedPath", "encodedPathSegments", "encodedQuery", "query", "querySize", "queryParameter", "name", "queryParameterNames", _UrlKt.FRAGMENT_ENCODE_SET, "()Ljava/util/Set;", "queryParameterValues", "queryParameterName", "index", "queryParameterValue", "encodedFragment", "redact", "resolve", "link", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "equals", "other", "hashCode", "toString", "topPrivateDomain", "-deprecated_url", "-deprecated_uri", "-deprecated_scheme", "-deprecated_encodedUsername", "-deprecated_username", "-deprecated_encodedPassword", "-deprecated_password", "-deprecated_host", "-deprecated_port", "-deprecated_pathSize", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_pathSegments", "-deprecated_encodedQuery", "-deprecated_query", "-deprecated_querySize", "-deprecated_queryParameterNames", "-deprecated_encodedFragment", "-deprecated_fragment", "Builder", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class HttpUrl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fragment;
    private final String host;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    private HttpUrl(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i10;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
    }

    public static final int defaultPort(String str) {
        return INSTANCE.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return INSTANCE.get(str);
    }

    public static final HttpUrl parse(String str) {
        return INSTANCE.parse(str);
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m38925deprecated_encodedFragment() {
        return encodedFragment();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m38926deprecated_encodedPassword() {
        return encodedPassword();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m38927deprecated_encodedPath() {
        return encodedPath();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m38928deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m38929deprecated_encodedQuery() {
        return encodedQuery();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m38930deprecated_encodedUsername() {
        return encodedUsername();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m38934deprecated_pathSegments() {
        return this.pathSegments;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m38935deprecated_pathSize() {
        return pathSize();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final String m38937deprecated_query() {
        return query();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m38938deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m38939deprecated_querySize() {
        return querySize();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m38941deprecated_uri() {
        return uri();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final URL m38942deprecated_url() {
        return url();
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(AbstractC8621f0.m33150m0(this.url, '#', 0, false, 6, null) + 1);
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return this.url.substring(AbstractC8621f0.m33150m0(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1, AbstractC8621f0.m33150m0(this.url, '@', 0, false, 6, null));
    }

    public final String encodedPath() {
        int iM33150m0 = AbstractC8621f0.m33150m0(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        return this.url.substring(iM33150m0, _UtilCommonKt.delimiterOffset(str, "?#", iM33150m0, str.length()));
    }

    public final List<String> encodedPathSegments() {
        int iM33150m0 = AbstractC8621f0.m33150m0(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, "?#", iM33150m0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iM33150m0 < iDelimiterOffset) {
            int i10 = iM33150m0 + 1;
            int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(this.url, '/', i10, iDelimiterOffset);
            arrayList.add(this.url.substring(i10, iDelimiterOffset2));
            iM33150m0 = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iM33150m0 = AbstractC8621f0.m33150m0(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        return this.url.substring(iM33150m0, _UtilCommonKt.delimiterOffset(str, '#', iM33150m0, str.length()));
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, _UtilCommonKt.delimiterOffset(str, ":@", length, str.length()));
    }

    public boolean equals(Object other) {
        return (other instanceof HttpUrl) && AbstractC1061t.m3842c(((HttpUrl) other).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return AbstractC1061t.m3842c(this.scheme, "https");
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != INSTANCE.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        INSTANCE.toQueryString(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    public final String queryParameter(String name) {
        name.getClass();
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, list.size()), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            while (!AbstractC1061t.m3842c(name, this.queryNamesAndValues.get(iM8560o))) {
                if (iM8560o != iM8561p) {
                    iM8560o += iM8562q;
                }
            }
            return this.queryNamesAndValues.get(iM8560o + 1);
        }
        return null;
    }

    public final String queryParameterName(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(index * 2);
        str.getClass();
        return str;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return AbstractC5068b1.m20483e();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.queryNamesAndValues.size() / 2, 1.0f);
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, this.queryNamesAndValues.size()), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            while (true) {
                String str = this.queryNamesAndValues.get(iM8560o);
                str.getClass();
                linkedHashSet.add(str);
                if (iM8560o == iM8561p) {
                    break;
                }
                iM8560o += iM8562q;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    public final String queryParameterValue(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String name) {
        name.getClass();
        if (this.queryNamesAndValues == null) {
            return AbstractC5114x.m20800o();
        }
        ArrayList arrayList = new ArrayList(4);
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, this.queryNamesAndValues.size()), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            while (true) {
                if (AbstractC1061t.m3842c(name, this.queryNamesAndValues.get(iM8560o))) {
                    arrayList.add(this.queryNamesAndValues.get(iM8560o + 1));
                }
                if (iM8560o == iM8561p) {
                    break;
                }
                iM8560o += iM8562q;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        builderNewBuilder.getClass();
        return builderNewBuilder.username(_UrlKt.FRAGMENT_ENCODE_SET).password(_UrlKt.FRAGMENT_ENCODE_SET).build().getUrl();
    }

    public final HttpUrl resolve(String link) {
        link.getClass();
        Builder builderNewBuilder = newBuilder(link);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (_HostnamesCommonKt.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new C8632n("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m33219k(string, _UrlKt.FRAGMENT_ENCODE_SET));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                C5750e.m23251a(e10);
                return null;
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e10) {
            C5750e.m23251a(e10);
            return null;
        }
    }

    public final String username() {
        return this.username;
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0010*\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0010*\u00020\u0016H\u0007¢\u0006\u0004\b\u0011\u0010\u0017J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0010*\u00020\u0018H\u0007¢\u0006\u0004\b\u0011\u0010\u0019J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u0012J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u0017J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, m16758d2 = {"Lokhttp3/HttpUrl$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "Ll8/i0;", "toQueryString", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "scheme", _UrlKt.FRAGMENT_ENCODE_SET, "defaultPort", "(Ljava/lang/String;)I", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", "uri", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void toQueryString(List<String> list, StringBuilder sb2) {
            C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, list.size()), 2);
            int iM8560o = c2361hM8591r.m8560o();
            int iM8561p = c2361hM8591r.m8561p();
            int iM8562q = c2361hM8591r.m8562q();
            if ((iM8562q <= 0 || iM8560o > iM8561p) && (iM8562q >= 0 || iM8561p > iM8560o)) {
                return;
            }
            while (true) {
                String str = list.get(iM8560o);
                String str2 = list.get(iM8560o + 1);
                if (iM8560o > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (iM8560o == iM8561p) {
                    return;
                } else {
                    iM8560o += iM8562q;
                }
            }
        }

        @InterfaceC4691e
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m38944deprecated_get(String url) {
            url.getClass();
            return get(url);
        }

        @InterfaceC4691e
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m38947deprecated_parse(String url) {
            url.getClass();
            return parse(url);
        }

        public final int defaultPort(String scheme) {
            scheme.getClass();
            if (AbstractC1061t.m3842c(scheme, "http")) {
                return 80;
            }
            return AbstractC1061t.m3842c(scheme, "https") ? 443 : -1;
        }

        public final HttpUrl get(String str) {
            str.getClass();
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }

        @InterfaceC4691e
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m38946deprecated_get(URL url) {
            url.getClass();
            return get(url);
        }

        @InterfaceC4691e
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m38945deprecated_get(URI uri) {
            uri.getClass();
            return get(uri);
        }

        public final HttpUrl get(URL url) {
            url.getClass();
            String string = url.toString();
            string.getClass();
            return parse(string);
        }

        public final HttpUrl get(URI uri) {
            uri.getClass();
            String string = uri.toString();
            string.getClass();
            return parse(string);
        }
    }

    public static final HttpUrl get(URI uri) {
        return INSTANCE.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return INSTANCE.get(url);
    }

    public /* synthetic */ HttpUrl(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6, AbstractC1043k abstractC1043k) {
        this(str, str2, str3, str4, i10, list, list2, str5, str6);
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00040\u00112\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u0003J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\"J\u001b\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040$*\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b)\u0010(J'\u0010*\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010(J'\u0010+\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010(J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0004¢\u0006\u0004\b.\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0004\b/\u0010-J\u0015\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0004¢\u0006\u0004\b0\u0010-J\u0015\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0004¢\u0006\u0004\b1\u0010-J\u0015\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0004¢\u0006\u0004\b2\u0010-J\u0015\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u000e¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0004¢\u0006\u0004\b6\u0010-J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010-J\u0015\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0004¢\u0006\u0004\b8\u0010-J\u0015\u0010:\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0004¢\u0006\u0004\b:\u0010-J\u001d\u0010<\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u0004¢\u0006\u0004\b>\u0010=J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u000e¢\u0006\u0004\b?\u00104J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0004¢\u0006\u0004\b@\u0010-J\u0017\u0010A\u001a\u00020\u00002\b\u0010A\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bA\u0010-J\u0017\u0010B\u001a\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bB\u0010-J\u001f\u0010E\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00042\b\u0010D\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bE\u0010FJ\u001f\u0010I\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u00042\b\u0010H\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bI\u0010FJ\u001f\u0010J\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00042\b\u0010D\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bJ\u0010FJ\u001f\u0010K\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u00042\b\u0010H\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bK\u0010FJ\u0015\u0010L\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0004¢\u0006\u0004\bL\u0010-J\u0015\u0010M\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u0004¢\u0006\u0004\bM\u0010-J\u0017\u0010N\u001a\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bN\u0010-J\u0017\u0010O\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bO\u0010-J\u000f\u0010R\u001a\u00020\u0000H\u0000¢\u0006\u0004\bP\u0010QJ\r\u0010T\u001a\u00020S¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0004H\u0016¢\u0006\u0004\bV\u0010WJ!\u0010[\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u00010S2\u0006\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0004\bY\u0010ZR$\u0010,\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010\\\u001a\u0004\b]\u0010W\"\u0004\b^\u0010\rR\"\u0010/\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010\\\u001a\u0004\b_\u0010W\"\u0004\b`\u0010\rR\"\u00101\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010\\\u001a\u0004\ba\u0010W\"\u0004\bb\u0010\rR$\u00102\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010\\\u001a\u0004\bc\u0010W\"\u0004\bd\u0010\rR\"\u00103\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010e\u001a\u0004\bf\u0010\u0010\"\u0004\bg\u0010hR \u00109\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010i\u001a\u0004\bj\u0010kR,\u0010l\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010i\u001a\u0004\bm\u0010k\"\u0004\bn\u0010oR$\u0010O\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010\\\u001a\u0004\bp\u0010W\"\u0004\bq\u0010\r¨\u0006r"}, m16758d2 = {"Lokhttp3/HttpUrl$Builder;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "pathSegments", _UrlKt.FRAGMENT_ENCODE_SET, "alreadyEncoded", "addPathSegments", "(Ljava/lang/String;Z)Lokhttp3/HttpUrl$Builder;", "canonicalName", "Ll8/i0;", "removeAllCanonicalQueryParameters", "(Ljava/lang/String;)V", _UrlKt.FRAGMENT_ENCODE_SET, "effectivePort", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "toPathString", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "input", "startPos", "limit", "resolvePath", "(Ljava/lang/String;II)V", "pos", "addTrailingSlash", "push", "(Ljava/lang/String;IIZZ)V", "pop", "isDot", "(Ljava/lang/String;)Z", "isDotDot", _UrlKt.FRAGMENT_ENCODE_SET, "toQueryNamesAndValues", "(Ljava/lang/String;)Ljava/util/List;", "schemeDelimiterOffset", "(Ljava/lang/String;II)I", "slashCount", "portColonOffset", "parsePort", "scheme", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "username", "encodedUsername", "password", "encodedPassword", "host", "port", "(I)Lokhttp3/HttpUrl$Builder;", "pathSegment", "addPathSegment", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", "index", "setPathSegment", "(ILjava/lang/String;)Lokhttp3/HttpUrl$Builder;", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "name", "value", "addQueryParameter", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "()Lokhttp3/HttpUrl;", "toString", "()Ljava/lang/String;", "base", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "Ljava/lang/String;", "getScheme$okhttp", "setScheme$okhttp", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "getHost$okhttp", "setHost$okhttp", "I", "getPort$okhttp", "setPort$okhttp", "(I)V", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Builder {
        private String encodedFragment;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = _UrlKt.FRAGMENT_ENCODE_SET;
        private String encodedPassword = _UrlKt.FRAGMENT_ENCODE_SET;
        private int port = -1;
        private final List<String> encodedPathSegments = AbstractC5114x.m20806u(_UrlKt.FRAGMENT_ENCODE_SET);

        private final Builder addPathSegments(String pathSegments, boolean alreadyEncoded) {
            boolean z10;
            Builder builder;
            String str;
            boolean z11;
            int i10 = 0;
            while (true) {
                int iDelimiterOffset = _UtilCommonKt.delimiterOffset(pathSegments, "/\\", i10, pathSegments.length());
                if (iDelimiterOffset < pathSegments.length()) {
                    z10 = true;
                    str = pathSegments;
                    z11 = alreadyEncoded;
                    builder = this;
                } else {
                    z10 = false;
                    builder = this;
                    str = pathSegments;
                    z11 = alreadyEncoded;
                }
                builder.push(str, i10, iDelimiterOffset, z10, z11);
                i10 = iDelimiterOffset + 1;
                if (i10 > str.length()) {
                    return builder;
                }
                pathSegments = str;
                alreadyEncoded = z11;
            }
        }

        private final int effectivePort() {
            int i10 = this.port;
            if (i10 != -1) {
                return i10;
            }
            Companion companion = HttpUrl.INSTANCE;
            String str = this.scheme;
            str.getClass();
            return companion.defaultPort(str);
        }

        private final boolean isDot(String input) {
            return AbstractC1061t.m3842c(input, ".") || AbstractC8611a0.m33061F(input, "%2e", true);
        }

        private final boolean isDotDot(String input) {
            return AbstractC1061t.m3842c(input, "..") || AbstractC8611a0.m33061F(input, "%2e.", true) || AbstractC8611a0.m33061F(input, ".%2e", true) || AbstractC8611a0.m33061F(input, "%2e%2e", true);
        }

        private final int parsePort(String input, int pos, int limit) {
            int i10;
            try {
                i10 = Integer.parseInt(_UrlKt.canonicalize$default(input, pos, limit, _UrlKt.FRAGMENT_ENCODE_SET, false, false, false, false, Opcodes.ISHL, null));
            } catch (NumberFormatException unused) {
            }
            if (1 > i10 || i10 >= 65536) {
                return -1;
            }
            return i10;
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                this.encodedPathSegments.set(r0.size() - 1, _UrlKt.FRAGMENT_ENCODE_SET);
            }
        }

        private final int portColonOffset(String input, int pos, int limit) {
            while (pos < limit) {
                char cCharAt = input.charAt(pos);
                if (cCharAt == ':') {
                    return pos;
                }
                if (cCharAt == '[') {
                    do {
                        pos++;
                        if (pos < limit) {
                        }
                    } while (input.charAt(pos) != ']');
                }
                pos++;
            }
            return limit;
        }

        private final void push(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String strCanonicalize$default = _UrlKt.canonicalize$default(input, pos, limit, _UrlKt.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, Opcodes.IREM, null);
            if (isDot(strCanonicalize$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$default)) {
                pop();
                return;
            }
            int length = this.encodedPathSegments.get(r12.size() - 1).length();
            List<String> list = this.encodedPathSegments;
            if (length == 0) {
                list.set(list.size() - 1, strCanonicalize$default);
            } else {
                list.add(strCanonicalize$default);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add(_UrlKt.FRAGMENT_ENCODE_SET);
            }
        }

        private final void removeAllCanonicalQueryParameters(String canonicalName) {
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            int size = list.size() - 2;
            int iM31894c = AbstractC8205c.m31894c(size, 0, -2);
            if (iM31894c > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                list2.getClass();
                if (AbstractC1061t.m3842c(canonicalName, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    list3.getClass();
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    list4.getClass();
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    list5.getClass();
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == iM31894c) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        private final void resolvePath(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char cCharAt = input.charAt(startPos);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add(_UrlKt.FRAGMENT_ENCODE_SET);
                startPos++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, _UrlKt.FRAGMENT_ENCODE_SET);
            }
            int i10 = startPos;
            while (i10 < limit) {
                int iDelimiterOffset = _UtilCommonKt.delimiterOffset(input, "/\\", i10, limit);
                boolean z10 = iDelimiterOffset < limit;
                String str = input;
                push(str, i10, iDelimiterOffset, z10, true);
                if (z10) {
                    i10 = iDelimiterOffset + 1;
                    input = str;
                } else {
                    input = str;
                    i10 = iDelimiterOffset;
                }
            }
        }

        private final int schemeDelimiterOffset(String input, int pos, int limit) {
            if (limit - pos < 2) {
                return -1;
            }
            char cCharAt = input.charAt(pos);
            if ((AbstractC1061t.m3843d(cCharAt, 97) >= 0 && AbstractC1061t.m3843d(cCharAt, Opcodes.ISHR) <= 0) || (AbstractC1061t.m3843d(cCharAt, 65) >= 0 && AbstractC1061t.m3843d(cCharAt, 90) <= 0)) {
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        break;
                    }
                    char cCharAt2 = input.charAt(pos);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return pos;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private final int slashCount(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '/' && cCharAt != '\\') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        private final void toPathString(List<String> list, StringBuilder sb2) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append(list.get(i10));
            }
        }

        private final List<String> toQueryNamesAndValues(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iM33150m0 = AbstractC8621f0.m33150m0(str2, '&', i10, false, 4, null);
                if (iM33150m0 == -1) {
                    iM33150m0 = str2.length();
                }
                int iM33150m02 = AbstractC8621f0.m33150m0(str2, '=', i10, false, 4, null);
                if (iM33150m02 == -1 || iM33150m02 > iM33150m0) {
                    arrayList.add(str2.substring(i10, iM33150m0));
                    arrayList.add(null);
                } else {
                    arrayList.add(str2.substring(i10, iM33150m02));
                    arrayList.add(str2.substring(iM33150m02 + 1, iM33150m0));
                }
                i10 = iM33150m0 + 1;
                str = str2;
            }
            return arrayList;
        }

        public final Builder addEncodedPathSegment(String encodedPathSegment) {
            encodedPathSegment.getClass();
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String encodedPathSegments) {
            encodedPathSegments.getClass();
            return addPathSegments(encodedPathSegments, true);
        }

        public final Builder addEncodedQueryParameter(String encodedName, String encodedValue) {
            encodedName.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            list.add(_UrlKt.canonicalize$default(encodedName, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            list2.getClass();
            list2.add(encodedValue != null ? _UrlKt.canonicalize$default(encodedValue, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null) : null);
            return this;
        }

        public final Builder addPathSegment(String pathSegment) {
            pathSegment.getClass();
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final Builder addQueryParameter(String name, String value) {
            name.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            list.add(_UrlKt.canonicalize$default(name, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            list2.getClass();
            list2.add(value != null ? _UrlKt.canonicalize$default(value, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null) : null);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                C10010p0.m38820a("scheme == null");
                return null;
            }
            String strPercentDecode$default = _UrlKt.percentDecode$default(this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$default2 = _UrlKt.percentDecode$default(this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                C10010p0.m38820a("host == null");
                return null;
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(_UrlKt.percentDecode$default((String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(AbstractC5116y.m20814z(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? _UrlKt.percentDecode$default(str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$default, strPercentDecode$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? _UrlKt.percentDecode$default(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        public final Builder encodedFragment(String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? _UrlKt.canonicalize$default(encodedFragment, 0, 0, _UrlKt.FRAGMENT_ENCODE_SET, true, false, false, true, 51, null) : null;
            return this;
        }

        public final Builder encodedPassword(String encodedPassword) {
            encodedPassword.getClass();
            this.encodedPassword = _UrlKt.canonicalize$default(encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        public final Builder encodedPath(String encodedPath) {
            encodedPath.getClass();
            if (AbstractC8611a0.m33075T(encodedPath, "/", false, 2, null)) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            C9994h0.m38667a("unexpected encodedPath: ", encodedPath);
            return null;
        }

        public final Builder encodedQuery(String encodedQuery) {
            String strCanonicalize$default;
            this.encodedQueryNamesAndValues = (encodedQuery == null || (strCanonicalize$default = _UrlKt.canonicalize$default(encodedQuery, 0, 0, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 83, null)) == null) ? null : toQueryNamesAndValues(strCanonicalize$default);
            return this;
        }

        public final Builder encodedUsername(String encodedUsername) {
            encodedUsername.getClass();
            this.encodedUsername = _UrlKt.canonicalize$default(encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        public final Builder fragment(String fragment) {
            this.encodedFragment = fragment != null ? _UrlKt.canonicalize$default(fragment, 0, 0, _UrlKt.FRAGMENT_ENCODE_SET, false, false, false, true, 59, null) : null;
            return this;
        }

        /* JADX INFO: renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        /* JADX INFO: renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        /* JADX INFO: renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        /* JADX INFO: renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* JADX INFO: renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        /* JADX INFO: renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        public final Builder host(String host) {
            host.getClass();
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            C0307f.m923a("unexpected host: ", host);
            return null;
        }

        public final Builder parse$okhttp(HttpUrl base, String input) {
            int iDelimiterOffset;
            boolean z10;
            int i10;
            int i11;
            String str = input;
            str.getClass();
            int iIndexOfFirstNonAsciiWhitespace$default = _UtilCommonKt.indexOfFirstNonAsciiWhitespace$default(str, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = _UtilCommonKt.indexOfLastNonAsciiWhitespace$default(str, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            int iSchemeDelimiterOffset = schemeDelimiterOffset(str, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            boolean z11 = true;
            if (iSchemeDelimiterOffset != -1) {
                if (AbstractC8611a0.m33072Q(str, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!AbstractC8611a0.m33072Q(str, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, iSchemeDelimiterOffset) + '\'');
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (base == null) {
                    if (str.length() > 6) {
                        str = AbstractC8625h0.m33174B1(str, 6) + "...";
                    }
                    C9987e.m38645a("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str));
                    return null;
                }
                this.scheme = base.scheme();
            }
            int iSlashCount = slashCount(str, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            char c10 = '#';
            if (iSlashCount >= 2 || base == null || !AbstractC1061t.m3842c(base.scheme(), this.scheme)) {
                boolean z12 = false;
                boolean z13 = false;
                int i12 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                while (true) {
                    iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, "@/\\?#", i12, iIndexOfLastNonAsciiWhitespace$default);
                    byte bCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? str.charAt(iDelimiterOffset) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z12) {
                            z10 = z11;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            str = input;
                            i10 = iDelimiterOffset;
                            sb2.append(_UrlKt.canonicalize$default(str, i12, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, Opcodes.IREM, null));
                            this.encodedPassword = sb2.toString();
                        } else {
                            int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(str, ':', i12, iDelimiterOffset);
                            z10 = z11;
                            String strCanonicalize$default = _UrlKt.canonicalize$default(str, i12, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, Opcodes.IREM, null);
                            if (z13) {
                                strCanonicalize$default = this.encodedUsername + "%40" + strCanonicalize$default;
                            }
                            this.encodedUsername = strCanonicalize$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                i11 = iDelimiterOffset;
                                this.encodedPassword = _UrlKt.canonicalize$default(input, iDelimiterOffset2 + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, Opcodes.IREM, null);
                                z12 = z10;
                            } else {
                                i11 = iDelimiterOffset;
                            }
                            str = input;
                            i10 = i11;
                            z13 = z10;
                        }
                        i12 = i10 + 1;
                        z11 = z10;
                        c10 = '#';
                    }
                }
                int iPortColonOffset = portColonOffset(str, i12, iDelimiterOffset);
                int i13 = iPortColonOffset + 1;
                if (i13 < iDelimiterOffset) {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str, i12, iPortColonOffset, false, 4, null));
                    int port = parsePort(str, i13, iDelimiterOffset);
                    this.port = port;
                    if (port == -1) {
                        C5751f.m23252a("Invalid URL port: \"", str.substring(i13, iDelimiterOffset));
                        return null;
                    }
                } else {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str, i12, iPortColonOffset, false, 4, null));
                    Companion companion = HttpUrl.INSTANCE;
                    String str2 = this.scheme;
                    str2.getClass();
                    this.port = companion.defaultPort(str2);
                }
                if (this.host == null) {
                    C5751f.m23252a("Invalid URL host: \"", str.substring(i12, iPortColonOffset));
                    return null;
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || str.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
            }
            int iDelimiterOffset3 = _UtilCommonKt.delimiterOffset(str, "?#", iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            resolvePath(str, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 < iIndexOfLastNonAsciiWhitespace$default && str.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = _UtilCommonKt.delimiterOffset(str, '#', iDelimiterOffset3, iIndexOfLastNonAsciiWhitespace$default);
                this.encodedQueryNamesAndValues = toQueryNamesAndValues(_UrlKt.canonicalize$default(str, iDelimiterOffset3 + 1, iDelimiterOffset4, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 80, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < iIndexOfLastNonAsciiWhitespace$default && str.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = _UrlKt.canonicalize$default(str, iDelimiterOffset3 + 1, iIndexOfLastNonAsciiWhitespace$default, _UrlKt.FRAGMENT_ENCODE_SET, true, false, false, true, 48, null);
            }
            return this;
        }

        public final Builder password(String password) {
            password.getClass();
            this.encodedPassword = _UrlKt.canonicalize$default(password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, Opcodes.LSHR, null);
            return this;
        }

        public final Builder port(int port) {
            if (1 > port || port >= 65536) {
                C10030z0.m38853a("unexpected port: ", port);
                return null;
            }
            this.port = port;
            return this;
        }

        public final Builder query(String query) {
            String strCanonicalize$default;
            this.encodedQueryNamesAndValues = (query == null || (strCanonicalize$default = _UrlKt.canonicalize$default(query, 0, 0, _UrlKt.QUERY_ENCODE_SET, false, false, true, false, 91, null)) == null) ? null : toQueryNamesAndValues(strCanonicalize$default);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new C8632n("[\"<>^`{|}]").m33219k(str, _UrlKt.FRAGMENT_ENCODE_SET) : null;
            int size = this.encodedPathSegments.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<String> list = this.encodedPathSegments;
                list.set(i10, _UrlKt.canonicalize$default(list.get(i10), 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, 99, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = list2.get(i11);
                    list2.set(i11, str2 != null ? _UrlKt.canonicalize$default(str2, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, 67, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? _UrlKt.canonicalize$default(str3, 0, 0, _UrlKt.FRAGMENT_ENCODE_SET_URI, true, true, false, true, 35, null) : null;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String encodedName) {
            encodedName.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(_UrlKt.canonicalize$default(encodedName, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String name) {
            name.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(_UrlKt.canonicalize$default(name, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            return this;
        }

        public final Builder removePathSegment(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            return this;
        }

        public final Builder scheme(String scheme) {
            scheme.getClass();
            if (AbstractC8611a0.m33061F(scheme, "http", true)) {
                this.scheme = "http";
                return this;
            }
            if (AbstractC8611a0.m33061F(scheme, "https", true)) {
                this.scheme = "https";
                return this;
            }
            C0307f.m923a("unexpected scheme: ", scheme);
            return null;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            str.getClass();
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int index, String encodedPathSegment) {
            encodedPathSegment.getClass();
            String strCanonicalize$default = _UrlKt.canonicalize$default(encodedPathSegment, 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, true, false, false, false, 115, null);
            this.encodedPathSegments.set(index, strCanonicalize$default);
            if (!isDot(strCanonicalize$default) && !isDotDot(strCanonicalize$default)) {
                return this;
            }
            C9994h0.m38667a("unexpected path segment: ", encodedPathSegment);
            return null;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String encodedName, String encodedValue) {
            encodedName.getClass();
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            str.getClass();
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int index, String pathSegment) {
            pathSegment.getClass();
            String strCanonicalize$default = _UrlKt.canonicalize$default(pathSegment, 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, false, false, false, false, Opcodes.LSHR, null);
            if (isDot(strCanonicalize$default) || isDotDot(strCanonicalize$default)) {
                C9994h0.m38667a("unexpected path segment: ", pathSegment);
                return null;
            }
            this.encodedPathSegments.set(index, strCanonicalize$default);
            return this;
        }

        public final void setPort$okhttp(int i10) {
            this.port = i10;
        }

        public final Builder setQueryParameter(String name, String value) {
            name.getClass();
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L69
                r1.getClass()
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = p299ub.AbstractC8621f0.m33124Z(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L69:
                int r1 = r6.port
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.effectivePort()
                java.lang.String r3 = r6.scheme
                if (r3 == 0) goto L85
                okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.INSTANCE
                r3.getClass()
                int r3 = r4.defaultPort(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                java.util.List<java.lang.String> r1 = r6.encodedPathSegments
                r6.toPathString(r1, r0)
                java.util.List<java.lang.String> r1 = r6.encodedQueryNamesAndValues
                if (r1 == 0) goto La3
                r1 = 63
                r0.append(r1)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.INSTANCE
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                r2.getClass()
                okhttp3.HttpUrl.Companion.access$toQueryString(r1, r2, r0)
            La3:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String username) {
            username.getClass();
            this.encodedUsername = _UrlKt.canonicalize$default(username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, Opcodes.LSHR, null);
            return this;
        }

        public final Builder addPathSegments(String pathSegments) {
            pathSegments.getClass();
            return addPathSegments(pathSegments, false);
        }
    }

    public final Builder newBuilder(String link) {
        link.getClass();
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
