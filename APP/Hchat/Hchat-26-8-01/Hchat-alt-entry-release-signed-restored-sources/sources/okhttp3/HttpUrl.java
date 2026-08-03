package okhttp3;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p172lg.C2562b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p219oh.AbstractC3165h;
import p259r9.AbstractC3754e0;
import p276sf.InterfaceC3954a;
import tf.AbstractC4167n;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HttpUrl(String str, String str2, String str3, String str4, int i9, List<String> list, List<String> list2, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        str6.getClass();
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i9;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = AbstractC1416l.m3825a(str, "https");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m10978deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m10979deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m10980deprecated_encodedPath() {
        return encodedPath();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m10981deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m10982deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m10983deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m10984deprecated_fragment() {
        return this.fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name */
    public final String m10985deprecated_host() {
        return this.host;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name */
    public final String m10986deprecated_password() {
        return this.password;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m10987deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m10988deprecated_pathSize() {
        return pathSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name */
    public final int m10989deprecated_port() {
        return this.port;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final String m10990deprecated_query() {
        return query();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m10991deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m10992deprecated_querySize() {
        return querySize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m10993deprecated_scheme() {
        return this.scheme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m10994deprecated_uri() {
        return uri();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final URL m10995deprecated_url() {
        return url();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name */
    public final String m10996deprecated_username() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(AbstractC3149m.m6718q0(this.url, '#', 0, 6) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        return this.url.substring(AbstractC3149m.m6718q0(this.url, ':', this.scheme.length() + 3, 4) + 1, AbstractC3149m.m6718q0(this.url, '@', 0, 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String encodedPath() {
        int iM6718q0 = AbstractC3149m.m6718q0(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        return this.url.substring(iM6718q0, Util.delimiterOffset(str, "?#", iM6718q0, str.length()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> encodedPathSegments() {
        int iM6718q0 = AbstractC3149m.m6718q0(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iM6718q0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iM6718q0 < iDelimiterOffset) {
            int i9 = iM6718q0 + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i9, iDelimiterOffset);
            arrayList.add(this.url.substring(i9, iDelimiterOffset2));
            iM6718q0 = iDelimiterOffset2;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iM6718q0 = AbstractC3149m.m6718q0(this.url, '?', 0, 6) + 1;
        String str = this.url;
        return this.url.substring(iM6718q0, Util.delimiterOffset(str, '#', iM6718q0, str.length()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && AbstractC1416l.m3825a(((HttpUrl) obj).url, this.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String fragment() {
        return this.fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.url.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String host() {
        return this.host;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isHttps() {
        return this.isHttps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String password() {
        return this.password;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int pathSize() {
        return this.pathSegments.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int port() {
        return this.port;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String queryParameter(String str) {
        str.getClass();
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, list.size()), 2);
        int i9 = c2562bM7902n0.f8312g;
        int i10 = c2562bM7902n0.f8313h;
        int i11 = c2562bM7902n0.f8314i;
        if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
            return null;
        }
        while (!str.equals(this.queryNamesAndValues.get(i9))) {
            if (i9 == i10) {
                return null;
            }
            i9 += i11;
        }
        return this.queryNamesAndValues.get(i9 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String queryParameterName(int i9) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i9 * 2);
        str.getClass();
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return C4175v.f13712g;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, this.queryNamesAndValues.size()), 2);
        int i9 = c2562bM7902n0.f8312g;
        int i10 = c2562bM7902n0.f8313h;
        int i11 = c2562bM7902n0.f8314i;
        if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
            while (true) {
                String str = this.queryNamesAndValues.get(i9);
                str.getClass();
                linkedHashSet.add(str);
                if (i9 == i10) {
                    break;
                }
                i9 += i11;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String queryParameterValue(int i9) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i9 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> queryParameterValues(String str) {
        str.getClass();
        if (this.queryNamesAndValues == null) {
            return C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList();
        C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, this.queryNamesAndValues.size()), 2);
        int i9 = c2562bM7902n0.f8312g;
        int i10 = c2562bM7902n0.f8313h;
        int i11 = c2562bM7902n0.f8314i;
        if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
            while (true) {
                if (str.equals(this.queryNamesAndValues.get(i9))) {
                    arrayList.add(this.queryNamesAndValues.get(i9 + 1));
                }
                if (i9 == i10) {
                    break;
                }
                i9 += i11;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        builderNewBuilder.getClass();
        return builderNewBuilder.username(FRAGMENT_ENCODE_SET).password(FRAGMENT_ENCODE_SET).build().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HttpUrl resolve(String str) {
        str.getClass();
        Builder builderNewBuilder = newBuilder(str);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String scheme() {
        return this.scheme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e6) {
            try {
                Pattern patternCompile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile.getClass();
                string.getClass();
                String strReplaceAll = patternCompile.matcher(string).replaceAll(FRAGMENT_ENCODE_SET);
                strReplaceAll.getClass();
                URI uriCreate = URI.create(strReplaceAll);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e6) {
            throw new RuntimeException(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String username() {
        return this.username;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = HttpUrl.FRAGMENT_ENCODE_SET;
        private String encodedPassword = HttpUrl.FRAGMENT_ENCODE_SET;
        private int port = -1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add(HttpUrl.FRAGMENT_ENCODE_SET);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final Builder addPathSegments(String str, boolean z9) {
            boolean z10;
            Builder builder;
            String str2;
            boolean z11;
            int i9 = 0;
            while (true) {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i9, str.length());
                if (iDelimiterOffset < str.length()) {
                    z10 = true;
                    str2 = str;
                    z11 = z9;
                    builder = this;
                } else {
                    z10 = false;
                    builder = this;
                    str2 = str;
                    z11 = z9;
                }
                builder.push(str2, i9, iDelimiterOffset, z10, z11);
                i9 = iDelimiterOffset + 1;
                if (i9 > str2.length()) {
                    return builder;
                }
                str = str2;
                z9 = z11;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final int effectivePort() {
            int i9 = this.port;
            if (i9 != -1) {
                return i9;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            str.getClass();
            return companion.defaultPort(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final boolean isDot(String str) {
            return AbstractC1416l.m3825a(str, ".") || AbstractC3156t.m6734X(str, "%2e");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final boolean isDotDot(String str) {
            return AbstractC1416l.m3825a(str, "..") || AbstractC3156t.m6734X(str, "%2e.") || AbstractC3156t.m6734X(str, ".%2e") || AbstractC3156t.m6734X(str, "%2e%2e");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            } else {
                this.encodedPathSegments.set(r0.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void push(String str, int i9, int i10, boolean z9, boolean z10) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i9, i10, HttpUrl.PATH_SEGMENT_ENCODE_SET, z10, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            int length = this.encodedPathSegments.get(r14.size() - 1).length();
            List<String> list = this.encodedPathSegments;
            if (length == 0) {
                list.set(list.size() - 1, strCanonicalize$okhttp$default);
            } else {
                list.add(strCanonicalize$okhttp$default);
            }
            if (z9) {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            int size = list.size() - 2;
            int iM6749A = AbstractC3165h.m6749A(size, 0, -2);
            if (iM6749A > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                list2.getClass();
                if (AbstractC1416l.m3825a(str, list2.get(size))) {
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
                if (size == iM6749A) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void resolvePath(String str, int i9, int i10) {
            if (i9 == i10) {
                return;
            }
            char cCharAt = str.charAt(i9);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
                i9++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
            }
            int i11 = i9;
            while (i11 < i10) {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i11, i10);
                boolean z9 = iDelimiterOffset < i10;
                String str2 = str;
                push(str2, i11, iDelimiterOffset, z9, true);
                if (z9) {
                    i11 = iDelimiterOffset + 1;
                    str = str2;
                } else {
                    str = str2;
                    i11 = iDelimiterOffset;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addEncodedPathSegment(String str) {
            str.getClass();
            push(str, 0, str.length(), false, true);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addEncodedPathSegments(String str) {
            str.getClass();
            return addPathSegments(str, true);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addEncodedQueryParameter(String str, String str2) {
            str.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            list2.getClass();
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addPathSegment(String str) {
            str.getClass();
            push(str, 0, str.length(), false, false);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder addQueryParameter(String str, String str2) {
            str.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            list2.getClass();
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                C2104o.m5276A("scheme == null");
                return null;
            }
            Companion companion = HttpUrl.Companion;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                C2104o.m5276A("host == null");
                return null;
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, null, Opcodes.PUTSTATIC, null) : null;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder encodedPassword(String str) {
            str.getClass();
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder encodedPath(String str) {
            str.getClass();
            if (AbstractC3156t.m6740d0(str, "/", false)) {
                resolvePath(str, 0, str.length());
                return this;
            }
            C2104o.m5291q("unexpected encodedPath: ".concat(str));
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder encodedQuery(String str) {
            Companion companion;
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) == null) ? null : companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder encodedUsername(String str) {
            str.getClass();
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, true, null, Opcodes.NEW, null) : null;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getHost$okhttp() {
            return this.host;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getPort$okhttp() {
            return this.port;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getScheme$okhttp() {
            return this.scheme;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder host(String str) {
            str.getClass();
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            C2104o.m5294t("unexpected host: ".concat(str));
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int iDelimiterOffset;
            boolean z9;
            int i9;
            int i10;
            char c10;
            int i11;
            String str2 = str;
            str2.getClass();
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str2, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str2, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(str2, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            boolean z10 = true;
            byte b10 = -1;
            if (iSchemeDelimiterOffset != -1) {
                if (AbstractC3156t.m6739c0(str2, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!AbstractC3156t.m6739c0(str2, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, iSchemeDelimiterOffset) + '\'');
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    C2104o.m5294t("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str2.length() > 6 ? AbstractC3149m.m6701P0(6, str2).concat("...") : str2));
                    return null;
                }
                this.scheme = httpUrl.scheme();
            }
            int iSlashCount = companion.slashCount(str2, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b11 = 63;
            byte b12 = 35;
            if (iSlashCount >= 2 || httpUrl == null || !AbstractC1416l.m3825a(httpUrl.scheme(), this.scheme)) {
                int i12 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(str2, "@/\\?#", i12, iIndexOfLastNonAsciiWhitespace$default);
                    byte bCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? str2.charAt(iDelimiterOffset) : b10;
                    if (bCharAt == b10 || bCharAt == b12 || bCharAt == 47 || bCharAt == 92 || bCharAt == b11) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z11) {
                            z9 = z10;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            str2 = str;
                            i9 = iDelimiterOffset;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, i12, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(str2, ':', i12, iDelimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            z9 = z10;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str2, i12, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z12) {
                                strCanonicalize$okhttp$default = this.encodedUsername + "%40" + strCanonicalize$okhttp$default;
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                i10 = iDelimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, iDelimiterOffset2 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z9;
                            } else {
                                i10 = iDelimiterOffset;
                            }
                            str2 = str;
                            i9 = i10;
                            z12 = z9;
                        }
                        i12 = i9 + 1;
                        z10 = z9;
                        b11 = 63;
                        b12 = 35;
                        b10 = -1;
                    }
                }
                Companion companion3 = Companion;
                int iPortColonOffset = companion3.portColonOffset(str2, i12, iDelimiterOffset);
                int i13 = iPortColonOffset + 1;
                if (i13 < iDelimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str2, i12, iPortColonOffset, false, 4, null));
                    int port = companion3.parsePort(str2, i13, iDelimiterOffset);
                    this.port = port;
                    if (port == -1) {
                        C2104o.m5292r(str2.substring(i13, iDelimiterOffset), "Invalid URL port: \"");
                        return null;
                    }
                } else {
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str2, i12, iPortColonOffset, false, 4, null));
                    String str3 = this.scheme;
                    str3.getClass();
                    this.port = companion4.defaultPort(str3);
                }
                if (this.host == null) {
                    C2104o.m5292r(str2.substring(i12, iPortColonOffset), "Invalid URL host: \"");
                    return null;
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || str2.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
            }
            int iDelimiterOffset3 = Util.delimiterOffset(str2, "?#", iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            resolvePath(str2, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 >= iIndexOfLastNonAsciiWhitespace$default || str2.charAt(iDelimiterOffset3) != '?') {
                c10 = '#';
                i11 = iDelimiterOffset3;
            } else {
                c10 = '#';
                int iDelimiterOffset4 = Util.delimiterOffset(str2, '#', iDelimiterOffset3, iIndexOfLastNonAsciiWhitespace$default);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str2, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                i11 = iDelimiterOffset4;
            }
            if (i11 < iIndexOfLastNonAsciiWhitespace$default && str2.charAt(i11) == c10) {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, i11 + 1, iIndexOfLastNonAsciiWhitespace$default, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, null, Opcodes.ARETURN, null);
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder password(String str) {
            str.getClass();
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder port(int i9) {
            if (1 > i9 || i9 >= 65536) {
                C2104o.m5291q(AbstractC0921a.m2249l(i9, "unexpected port: "));
                return null;
            }
            this.port = i9;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder query(String str) {
            Companion companion;
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) == null) ? null : companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? AbstractC2091b.m5161h("[\"<>^`{|}]", str, HttpUrl.FRAGMENT_ENCODE_SET) : null;
            int size = this.encodedPathSegments.size();
            for (int i9 = 0; i9 < size; i9++) {
                List<String> list = this.encodedPathSegments;
                list.set(i9, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i9), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    String str2 = list2.get(i10);
                    list2.set(i10, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, Opcodes.MONITOREXIT, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, Opcodes.IF_ICMPGT, null) : null;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder removeAllEncodedQueryParameters(String str) {
            str.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder removeAllQueryParameters(String str) {
            str.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder removePathSegment(int i9) {
            this.encodedPathSegments.remove(i9);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder scheme(String str) {
            str.getClass();
            if (str.equalsIgnoreCase("http")) {
                this.scheme = "http";
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.scheme = "https";
                return this;
            }
            C2104o.m5294t("unexpected scheme: ".concat(str));
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setEncodedPassword$okhttp(String str) {
            str.getClass();
            this.encodedPassword = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setEncodedPathSegment(int i9, String str) {
            str.getClass();
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i9, strCanonicalize$okhttp$default);
            if (!isDot(strCanonicalize$okhttp$default) && !isDotDot(strCanonicalize$okhttp$default)) {
                return this;
            }
            C2104o.m5291q("unexpected path segment: ".concat(str));
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setEncodedQueryParameter(String str, String str2) {
            str.getClass();
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setEncodedUsername$okhttp(String str) {
            str.getClass();
            this.encodedUsername = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setPathSegment(int i9, String str) {
            str.getClass();
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                C2104o.m5291q("unexpected path segment: ".concat(str));
                return null;
            }
            this.encodedPathSegments.set(i9, strCanonicalize$okhttp$default);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setPort$okhttp(int i9) {
            this.port = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder setQueryParameter(String str, String str2) {
            str.getClass();
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb2.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.encodedPassword);
                }
                sb2.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (AbstractC3149m.m6710i0(str2, ':')) {
                    sb2.append('[');
                    sb2.append(this.host);
                    sb2.append(']');
                } else {
                    sb2.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int iEffectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || iEffectivePort != HttpUrl.Companion.defaultPort(str3)) {
                    sb2.append(':');
                    sb2.append(iEffectivePort);
                }
            }
            Companion companion = HttpUrl.Companion;
            companion.toPathString$okhttp(this.encodedPathSegments, sb2);
            if (this.encodedQueryNamesAndValues != null) {
                sb2.append('?');
                List<String> list = this.encodedQueryNamesAndValues;
                list.getClass();
                companion.toQueryString$okhttp(list, sb2);
            }
            if (this.encodedFragment != null) {
                sb2.append('#');
                sb2.append(this.encodedFragment);
            }
            return sb2.toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder username(String str) {
            str.getClass();
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.HttpUrl.Builder.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i9, int i10) {
                int i11;
                try {
                    i11 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i9, i10, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > i11 || i11 >= 65536) {
                    return -1;
                }
                return i11;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i9, int i10) {
                while (i9 < i10) {
                    char cCharAt = str.charAt(i9);
                    if (cCharAt == '[') {
                        do {
                            i9++;
                            if (i9 < i10) {
                            }
                        } while (str.charAt(i9) != ']');
                    } else if (cCharAt == ':') {
                        return i9;
                    }
                    i9++;
                }
                return i10;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i9, int i10) {
                if (i10 - i9 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i9);
                if ((AbstractC1416l.m3827c(cCharAt, 97) >= 0 && AbstractC1416l.m3827c(cCharAt, 122) <= 0) || (AbstractC1416l.m3827c(cCharAt, 65) >= 0 && AbstractC1416l.m3827c(cCharAt, 90) <= 0)) {
                    while (true) {
                        i9++;
                        if (i9 >= i10) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i9);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i9;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i9, int i10) {
                int i11 = 0;
                while (i9 < i10) {
                    char cCharAt = str.charAt(i9);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i11++;
                    i9++;
                }
                return i11;
            }

            private Companion() {
            }
        }

        public final Builder addPathSegments(String str) {
            str.getClass();
            return addPathSegments(str, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.HttpUrl.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i9, int i10, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i9 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 8) != 0) {
                z9 = false;
            }
            if ((i11 & 16) != 0) {
                z10 = false;
            }
            if ((i11 & 32) != 0) {
                z11 = false;
            }
            if ((i11 & 64) != 0) {
                z12 = false;
            }
            if ((i11 & 128) != 0) {
                charset = null;
            }
            return companion.canonicalize$okhttp(str, i9, i10, str2, z9, z10, z11, z12, charset);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final boolean isPercentEncoded(String str, int i9, int i10) {
            int i11 = i9 + 2;
            return i11 < i10 && str.charAt(i9) == '%' && Util.parseHexDigit(str.charAt(i9 + 1)) != -1 && Util.parseHexDigit(str.charAt(i11)) != -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i9, int i10, boolean z9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i9 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 4) != 0) {
                z9 = false;
            }
            return companion.percentDecode$okhttp(str, i9, i10, z9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void writeCanonicalized(Buffer buffer, String str, int i9, int i10, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) throws EOFException {
            Buffer buffer2 = null;
            while (i9 < i10) {
                int iCodePointAt = str.codePointAt(i9);
                if (!z9 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z11) {
                        buffer.writeUtf8(z9 ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || AbstractC3149m.m6710i0(str2, (char) iCodePointAt) || (iCodePointAt == 37 && (!z9 || (z10 && !isPercentEncoded(str, i9, i10)))))) {
                        if (buffer2 == null) {
                            buffer2 = new Buffer();
                        }
                        if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                            buffer2.writeUtf8CodePoint(iCodePointAt);
                        } else {
                            buffer2.writeString(str, i9, Character.charCount(iCodePointAt) + i9, charset);
                        }
                        while (!buffer2.exhausted()) {
                            byte b10 = buffer2.readByte();
                            buffer.writeByte(37);
                            buffer.writeByte((int) HttpUrl.HEX_DIGITS[((b10 & 255) >> 4) & 15]);
                            buffer.writeByte((int) HttpUrl.HEX_DIGITS[b10 & 15]);
                        }
                    } else {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                    }
                }
                i9 += Character.charCount(iCodePointAt);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void writePercentDecoded(Buffer buffer, String str, int i9, int i10, boolean z9) {
            int i11;
            while (i9 < i10) {
                int iCodePointAt = str.codePointAt(i9);
                if (iCodePointAt == 37 && (i11 = i9 + 2) < i10) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i9 + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i11));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i9 += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((hexDigit << 4) + hexDigit2);
                        i9 = Character.charCount(iCodePointAt) + i11;
                    }
                } else if (iCodePointAt == 43 && z9) {
                    buffer.writeByte(32);
                    i9++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i9 += Character.charCount(iCodePointAt);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m10997deprecated_get(String str) {
            str.getClass();
            return get(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m11000deprecated_parse(String str) {
            str.getClass();
            return parse(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String canonicalize$okhttp(String str, int i9, int i10, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) throws EOFException {
            str.getClass();
            str2.getClass();
            int iCharCount = i9;
            while (iCharCount < i10) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || AbstractC3149m.m6710i0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z9 || (z10 && !isPercentEncoded(str, iCharCount, i10)))) || (iCodePointAt == 43 && z11)))) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i9, iCharCount);
                    writeCanonicalized(buffer, str, iCharCount, i10, str2, z9, z10, z11, z12, charset);
                    return buffer.readUtf8();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            return str.substring(i9, i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int defaultPort(String str) {
            str.getClass();
            if (str.equals("http")) {
                return 80;
            }
            return str.equals("https") ? 443 : -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final HttpUrl get(String str) {
            str.getClass();
            return new Builder().parse$okhttp(null, str).build();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final HttpUrl parse(String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String percentDecode$okhttp(String str, int i9, int i10, boolean z9) {
            str.getClass();
            for (int i11 = i9; i11 < i10; i11++) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '%' || (cCharAt == '+' && z9)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i9, i11);
                    writePercentDecoded(buffer, str, i11, i10, z9);
                    return buffer.readUtf8();
                }
            }
            return str.substring(i9, i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void toPathString$okhttp(List<String> list, StringBuilder sb2) {
            list.getClass();
            sb2.getClass();
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                sb2.append('/');
                sb2.append(list.get(i9));
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            str.getClass();
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            while (i9 <= str.length()) {
                int iM6718q0 = AbstractC3149m.m6718q0(str, '&', i9, 4);
                if (iM6718q0 == -1) {
                    iM6718q0 = str.length();
                }
                int iM6718q02 = AbstractC3149m.m6718q0(str, '=', i9, 4);
                if (iM6718q02 == -1 || iM6718q02 > iM6718q0) {
                    arrayList.add(str.substring(i9, iM6718q0));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i9, iM6718q02));
                    arrayList.add(str.substring(iM6718q02 + 1, iM6718q0));
                }
                i9 = iM6718q0 + 1;
            }
            return arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void toQueryString$okhttp(List<String> list, StringBuilder sb2) {
            list.getClass();
            sb2.getClass();
            C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, list.size()), 2);
            int i9 = c2562bM7902n0.f8312g;
            int i10 = c2562bM7902n0.f8313h;
            int i11 = c2562bM7902n0.f8314i;
            if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
                return;
            }
            while (true) {
                String str = list.get(i9);
                String str2 = list.get(i9 + 1);
                if (i9 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i9 == i10) {
                    return;
                } else {
                    i9 += i11;
                }
            }
        }

        private Companion() {
        }

        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m10999deprecated_get(URL url) {
            url.getClass();
            return get(url);
        }

        @InterfaceC3954a
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m10998deprecated_get(URI uri) {
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
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public final Builder newBuilder(String str) {
        str.getClass();
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
