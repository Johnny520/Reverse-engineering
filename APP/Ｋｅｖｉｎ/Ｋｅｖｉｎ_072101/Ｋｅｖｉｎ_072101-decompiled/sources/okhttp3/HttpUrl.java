package okhttp3;

/* JADX INFO: compiled from: HttpUrl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, m115d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", "username", "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", "", "()Z", "pathSize", "()I", "query", "queryParameterNames", "", "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", "other", "-deprecated_fragment", "hashCode", "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "name", "queryParameterName", "index", "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", "resolve", "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", "uri", "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class HttpUrl {
    public static final okhttp3.HttpUrl.Companion Companion = null;
    public static final java.lang.String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final java.lang.String FRAGMENT_ENCODE_SET = "";
    public static final java.lang.String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = null;
    public static final java.lang.String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final java.lang.String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final java.lang.String QUERY_ENCODE_SET = " \"'<>#";
    public static final java.lang.String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final java.lang.String fragment;
    private final java.lang.String host;
    private final boolean isHttps;
    private final java.lang.String password;
    private final java.util.List<java.lang.String> pathSegments;
    private final int port;
    private final java.util.List<java.lang.String> queryNamesAndValues;
    private final java.lang.String scheme;
    private final java.lang.String url;
    private final java.lang.String username;

    /* JADX INFO: compiled from: HttpUrl.kt */
    @kotlin.Metadata(m114d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u0000 V2\u00020\u0001:\u0001VB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u001bH\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0004J\u0010\u00106\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u00107\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004J\u0010\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u0010\u0010:\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u001f\u0010;\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u0001032\u0006\u00109\u001a\u00020\u0004H\u0000¢\u0006\u0002\b=J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0004J\b\u0010?\u001a\u00020@H\u0002J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ0\u0010A\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020.2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010E\u001a\u00020\u00002\b\u0010E\u001a\u0004\u0018\u00010\u0004J\r\u0010F\u001a\u00020\u0000H\u0000¢\u0006\u0002\bGJ\u0010\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020\u0004H\u0002J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010K\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0004J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001bJ \u0010N\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001bH\u0002J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004J\u0016\u0010P\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0004J\u0018\u0010Q\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0016\u0010R\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0004J\u0018\u0010S\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\b\u0010T\u001a\u00020\u0004H\u0016J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b¨\u0006W"}, m115d2 = {"Lokhttp3/HttpUrl$Builder;", "", "()V", "encodedFragment", "", "getEncodedFragment$okhttp", "()Ljava/lang/String;", "setEncodedFragment$okhttp", "(Ljava/lang/String;)V", "encodedPassword", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "encodedPathSegments", "", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedUsername", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "host", "getHost$okhttp", "setHost$okhttp", "port", "", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "scheme", "getScheme$okhttp", "setScheme$okhttp", "addEncodedPathSegment", "encodedPathSegment", "addEncodedPathSegments", "addEncodedQueryParameter", "encodedName", "encodedValue", "addPathSegment", "pathSegment", "addPathSegments", "pathSegments", "alreadyEncoded", "", "addQueryParameter", "name", "value", "build", "Lokhttp3/HttpUrl;", "effectivePort", "encodedPath", "encodedQuery", "fragment", "isDot", "input", "isDotDot", "parse", "base", "parse$okhttp", "password", "pop", "", "push", "pos", "limit", "addTrailingSlash", "query", "reencodeForUri", "reencodeForUri$okhttp", "removeAllCanonicalQueryParameters", "canonicalName", "removeAllEncodedQueryParameters", "removeAllQueryParameters", "removePathSegment", "index", "resolvePath", "startPos", "setEncodedPathSegment", "setEncodedQueryParameter", "setPathSegment", "setQueryParameter", "toString", "username", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Builder {
        public static final okhttp3.HttpUrl.Builder.Companion Companion = null;
        public static final java.lang.String INVALID_HOST = "Invalid URL host";
        private java.lang.String encodedFragment;
        private java.lang.String encodedPassword;
        private final java.util.List<java.lang.String> encodedPathSegments;
        private java.util.List<java.lang.String> encodedQueryNamesAndValues;
        private java.lang.String encodedUsername;
        private java.lang.String host;
        private int port;
        private java.lang.String scheme;

        /* JADX INFO: compiled from: HttpUrl.kt */
        @kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, m115d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "()V", "INVALID_HOST", "", "parsePort", "", "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
        public static final class Companion {
            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static final /* synthetic */ int access$parsePort(okhttp3.HttpUrl.Builder.Companion r1, java.lang.String r2, int r3, int r4) {
                    int r0 = r1.parsePort(r2, r3, r4)
                    return r0
            }

            public static final /* synthetic */ int access$portColonOffset(okhttp3.HttpUrl.Builder.Companion r1, java.lang.String r2, int r3, int r4) {
                    int r0 = r1.portColonOffset(r2, r3, r4)
                    return r0
            }

            public static final /* synthetic */ int access$schemeDelimiterOffset(okhttp3.HttpUrl.Builder.Companion r1, java.lang.String r2, int r3, int r4) {
                    int r0 = r1.schemeDelimiterOffset(r2, r3, r4)
                    return r0
            }

            public static final /* synthetic */ int access$slashCount(okhttp3.HttpUrl.Builder.Companion r1, java.lang.String r2, int r3, int r4) {
                    int r0 = r1.slashCount(r2, r3, r4)
                    return r0
            }

            private final int parsePort(java.lang.String r15, int r16, int r17) {
                    r14 = this;
                    r1 = -1
                    okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion     // Catch: java.lang.NumberFormatException -> L28
                    java.lang.String r6 = ""
                    r12 = 248(0xf8, float:3.48E-43)
                    r13 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r3 = r15
                    r4 = r16
                    r5 = r17
                    java.lang.String r0 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.NumberFormatException -> L28
                    int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L28
                    r3 = 0
                    r4 = 1
                    if (r4 > r2) goto L24
                    r5 = 65536(0x10000, float:9.1835E-41)
                    if (r2 >= r5) goto L24
                    r3 = r4
                L24:
                    if (r3 == 0) goto L2a
                    r1 = r2
                    goto L2a
                L28:
                    r0 = move-exception
                L2a:
                    return r1
            }

            private final int portColonOffset(java.lang.String r4, int r5, int r6) {
                    r3 = this;
                    r0 = r5
                L1:
                    if (r0 >= r6) goto L20
                    char r1 = r4.charAt(r0)
                    r2 = 91
                    if (r1 != r2) goto L18
                Lb:
                    int r0 = r0 + 1
                    if (r0 >= r6) goto L1d
                    char r1 = r4.charAt(r0)
                    r2 = 93
                    if (r1 != r2) goto Lb
                    goto L1d
                L18:
                    r2 = 58
                    if (r1 != r2) goto L1d
                    return r0
                L1d:
                    int r0 = r0 + 1
                    goto L1
                L20:
                    return r6
            }

            private final int schemeDelimiterOffset(java.lang.String r11, int r12, int r13) {
                    r10 = this;
                    int r0 = r13 - r12
                    r1 = 2
                    r2 = -1
                    if (r0 >= r1) goto L7
                    return r2
                L7:
                    char r0 = r11.charAt(r12)
                    r1 = 97
                    int r3 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
                    r4 = 65
                    if (r3 < 0) goto L1d
                    r3 = 122(0x7a, float:1.71E-43)
                    int r3 = kotlin.jvm.internal.Intrinsics.compare(r0, r3)
                    if (r3 <= 0) goto L2d
                L1d:
                    int r3 = kotlin.jvm.internal.Intrinsics.compare(r0, r4)
                    if (r3 < 0) goto L83
                    r3 = 90
                    int r3 = kotlin.jvm.internal.Intrinsics.compare(r0, r3)
                    if (r3 <= 0) goto L2d
                    goto L83
                L2d:
                    int r3 = r12 + 1
                L2f:
                    if (r3 >= r13) goto L82
                    char r5 = r11.charAt(r3)
                    r6 = 0
                    r7 = 1
                    if (r1 > r5) goto L3f
                    r8 = 123(0x7b, float:1.72E-43)
                    if (r5 >= r8) goto L3f
                    r8 = r7
                    goto L40
                L3f:
                    r8 = r6
                L40:
                    if (r8 == 0) goto L44
                L42:
                    r8 = r7
                    goto L4c
                L44:
                    if (r4 > r5) goto L4b
                    r8 = 91
                    if (r5 >= r8) goto L4b
                    goto L42
                L4b:
                    r8 = r6
                L4c:
                    r9 = 58
                    if (r8 == 0) goto L52
                L50:
                    r8 = r7
                    goto L5a
                L52:
                    r8 = 48
                    if (r8 > r5) goto L59
                    if (r5 >= r9) goto L59
                    goto L50
                L59:
                    r8 = r6
                L5a:
                    if (r8 == 0) goto L5e
                L5c:
                    r8 = r7
                    goto L64
                L5e:
                    r8 = 43
                    if (r5 != r8) goto L63
                    goto L5c
                L63:
                    r8 = r6
                L64:
                    if (r8 == 0) goto L68
                L66:
                    r8 = r7
                    goto L6e
                L68:
                    r8 = 45
                    if (r5 != r8) goto L6d
                    goto L66
                L6d:
                    r8 = r6
                L6e:
                    if (r8 == 0) goto L72
                L70:
                    r6 = r7
                    goto L77
                L72:
                    r8 = 46
                    if (r5 != r8) goto L77
                    goto L70
                L77:
                    if (r6 != 0) goto L7f
                    if (r5 != r9) goto L7d
                    r2 = r3
                    goto L7e
                L7d:
                L7e:
                    return r2
                L7f:
                    int r3 = r3 + 1
                    goto L2f
                L82:
                    return r2
                L83:
                    return r2
            }

            private final int slashCount(java.lang.String r5, int r6, int r7) {
                    r4 = this;
                    r0 = 0
                    r1 = r6
                L2:
                    if (r1 >= r7) goto L17
                    char r2 = r5.charAt(r1)
                    r3 = 92
                    if (r2 == r3) goto L12
                    r3 = 47
                    if (r2 != r3) goto L11
                    goto L12
                L11:
                    goto L17
                L12:
                    int r0 = r0 + 1
                    int r1 = r1 + 1
                    goto L2
                L17:
                    return r0
            }
        }

        static {
                okhttp3.HttpUrl$Builder$Companion r0 = new okhttp3.HttpUrl$Builder$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.HttpUrl.Builder.Companion = r0
                return
        }

        public Builder() {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = ""
                r2.encodedUsername = r0
                r2.encodedPassword = r0
                r1 = -1
                r2.port = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r1 = (java.util.List) r1
                r2.encodedPathSegments = r1
                java.util.List<java.lang.String> r1 = r2.encodedPathSegments
                r1.add(r0)
                return
        }

        private final okhttp3.HttpUrl.Builder addPathSegments(java.lang.String r11, boolean r12) {
                r10 = this;
                r6 = r10
                okhttp3.HttpUrl$Builder r6 = (okhttp3.HttpUrl.Builder) r6
                r7 = 0
                r0 = 0
                r8 = r0
            L6:
                java.lang.String r0 = "/\\"
                int r1 = r11.length()
                int r9 = okhttp3.internal.Util.delimiterOffset(r11, r0, r8, r1)
                int r0 = r11.length()
                if (r9 >= r0) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                r4 = r0
                r0 = r6
                r1 = r11
                r2 = r8
                r3 = r9
                r5 = r12
                r0.push(r1, r2, r3, r4, r5)
                int r8 = r9 + 1
                int r0 = r11.length()
                if (r8 <= r0) goto L6
            L2b:
                r0 = r10
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        private final int effectivePort() {
                r2 = this;
                int r0 = r2.port
                r1 = -1
                if (r0 == r1) goto L8
                int r0 = r2.port
                goto L13
            L8:
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                java.lang.String r1 = r2.scheme
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                int r0 = r0.defaultPort(r1)
            L13:
                return r0
        }

        private final boolean isDot(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "."
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
                r1 = 1
                if (r0 != 0) goto L13
                java.lang.String r0 = "%2e"
                boolean r0 = kotlin.text.StringsKt.equals(r3, r0, r1)
                if (r0 == 0) goto L12
                goto L13
            L12:
                r1 = 0
            L13:
                return r1
        }

        private final boolean isDotDot(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = ".."
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
                r1 = 1
                if (r0 != 0) goto L24
                java.lang.String r0 = "%2e."
                boolean r0 = kotlin.text.StringsKt.equals(r3, r0, r1)
                if (r0 != 0) goto L24
                java.lang.String r0 = ".%2e"
                boolean r0 = kotlin.text.StringsKt.equals(r3, r0, r1)
                if (r0 != 0) goto L24
                java.lang.String r0 = "%2e%2e"
                boolean r0 = kotlin.text.StringsKt.equals(r3, r0, r1)
                if (r0 == 0) goto L22
                goto L24
            L22:
                r1 = 0
                goto L25
            L24:
            L25:
                return r1
        }

        private final void pop() {
                r5 = this;
                java.util.List<java.lang.String> r0 = r5.encodedPathSegments
                java.util.List<java.lang.String> r1 = r5.encodedPathSegments
                int r1 = r1.size()
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object r0 = r0.remove(r1)
                java.lang.String r0 = (java.lang.String) r0
                r1 = r0
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 != 0) goto L1b
                r1 = r2
                goto L1c
            L1b:
                r1 = 0
            L1c:
                java.lang.String r3 = ""
                if (r1 == 0) goto L37
                java.util.List<java.lang.String> r1 = r5.encodedPathSegments
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L37
                java.util.List<java.lang.String> r1 = r5.encodedPathSegments
                java.util.List<java.lang.String> r4 = r5.encodedPathSegments
                int r4 = r4.size()
                int r4 = r4 - r2
                r1.set(r4, r3)
                goto L3c
            L37:
                java.util.List<java.lang.String> r1 = r5.encodedPathSegments
                r1.add(r3)
            L3c:
                return
        }

        private final void push(java.lang.String r14, int r15, int r16, boolean r17, boolean r18) {
                r13 = this;
                r0 = r13
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r11 = 240(0xf0, float:3.36E-43)
                r12 = 0
                java.lang.String r5 = " \"<>^`{}|/\\?#"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r2 = r14
                r3 = r15
                r4 = r16
                r6 = r18
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r2 = r13.isDot(r1)
                if (r2 == 0) goto L21
                return
            L21:
                boolean r2 = r13.isDotDot(r1)
                if (r2 == 0) goto L2b
                r13.pop()
                return
            L2b:
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                java.util.List<java.lang.String> r3 = r0.encodedPathSegments
                int r3 = r3.size()
                r4 = 1
                int r3 = r3 - r4
                java.lang.Object r2 = r2.get(r3)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                int r2 = r2.length()
                if (r2 != 0) goto L43
                r2 = r4
                goto L44
            L43:
                r2 = 0
            L44:
                if (r2 == 0) goto L53
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                java.util.List<java.lang.String> r3 = r0.encodedPathSegments
                int r3 = r3.size()
                int r3 = r3 - r4
                r2.set(r3, r1)
                goto L58
            L53:
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                r2.add(r1)
            L58:
                if (r17 == 0) goto L61
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                java.lang.String r3 = ""
                r2.add(r3)
            L61:
                return
        }

        private final void removeAllCanonicalQueryParameters(java.lang.String r5) {
                r4 = this;
                java.util.List<java.lang.String> r0 = r4.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                int r0 = r0.size()
                int r0 = r0 + (-2)
                r1 = r0
                r2 = 0
                r3 = -2
                int r0 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(r0, r2, r3)
                if (r0 > r1) goto L49
            L14:
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                java.lang.Object r2 = r2.get(r1)
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
                if (r2 == 0) goto L44
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                int r3 = r1 + 1
                r2.remove(r3)
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                r2.remove(r1)
                java.util.List<java.lang.String> r2 = r4.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L44
                r0 = 0
                r4.encodedQueryNamesAndValues = r0
                return
            L44:
                if (r1 == r0) goto L49
                int r1 = r1 + (-2)
                goto L14
            L49:
                return
        }

        private final void resolvePath(java.lang.String r13, int r14, int r15) {
                r12 = this;
                r0 = r14
                if (r0 != r15) goto L4
                return
            L4:
                char r1 = r13.charAt(r0)
                r2 = 47
                java.lang.String r3 = ""
                r4 = 1
                if (r1 == r2) goto L21
                r2 = 92
                if (r1 != r2) goto L14
                goto L21
            L14:
                java.util.List<java.lang.String> r2 = r12.encodedPathSegments
                java.util.List<java.lang.String> r5 = r12.encodedPathSegments
                int r5 = r5.size()
                int r5 = r5 - r4
                r2.set(r5, r3)
                goto L2d
            L21:
                java.util.List<java.lang.String> r2 = r12.encodedPathSegments
                r2.clear()
                java.util.List<java.lang.String> r2 = r12.encodedPathSegments
                r2.add(r3)
                int r0 = r0 + 1
            L2d:
                r2 = r0
            L2e:
                if (r2 >= r15) goto L4b
                java.lang.String r3 = "/\\"
                int r3 = okhttp3.internal.Util.delimiterOffset(r13, r3, r2, r15)
                if (r3 >= r15) goto L3a
                r5 = r4
                goto L3b
            L3a:
                r5 = 0
            L3b:
                r11 = r5
                r10 = 1
                r5 = r12
                r6 = r13
                r7 = r2
                r8 = r3
                r9 = r11
                r5.push(r6, r7, r8, r9, r10)
                r2 = r3
                if (r11 == 0) goto L2e
                int r2 = r2 + 1
                goto L2e
            L4b:
                return
        }

        public final okhttp3.HttpUrl.Builder addEncodedPathSegment(java.lang.String r9) {
                r8 = this;
                java.lang.String r0 = "encodedPathSegment"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r0 = r8
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r7 = 0
                int r4 = r9.length()
                r3 = 0
                r5 = 0
                r6 = 1
                r1 = r0
                r2 = r9
                r1.push(r2, r3, r4, r5, r6)
                r0 = r8
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder addEncodedPathSegments(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "encodedPathSegments"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 1
                okhttp3.HttpUrl$Builder r0 = r1.addPathSegments(r2, r0)
                return r0
        }

        public final okhttp3.HttpUrl.Builder addEncodedQueryParameter(java.lang.String r28, java.lang.String r29) {
                r27 = this;
                java.lang.String r0 = "encodedName"
                r13 = r28
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                r0 = r27
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r14 = 0
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                if (r1 != 0) goto L19
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r1 = (java.util.List) r1
                r0.encodedQueryNamesAndValues = r1
            L19:
                java.util.List<java.lang.String> r15 = r0.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r11 = 211(0xd3, float:2.96E-43)
                r12 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"'<>#&="
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r2 = r28
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r15.add(r1)
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                if (r29 == 0) goto L61
                okhttp3.HttpUrl$Companion r15 = okhttp3.HttpUrl.Companion
                r25 = 211(0xd3, float:2.96E-43)
                r26 = 0
                r17 = 0
                r18 = 0
                java.lang.String r19 = " \"'<>#&="
                r20 = 1
                r21 = 0
                r22 = 1
                r23 = 0
                r24 = 0
                r16 = r29
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                goto L62
            L61:
                r2 = 0
            L62:
                r1.add(r2)
                r0 = r27
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder addPathSegment(java.lang.String r9) {
                r8 = this;
                java.lang.String r0 = "pathSegment"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r0 = r8
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r7 = 0
                int r4 = r9.length()
                r5 = 0
                r6 = 0
                r3 = 0
                r1 = r0
                r2 = r9
                r1.push(r2, r3, r4, r5, r6)
                r0 = r8
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder addPathSegments(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "pathSegments"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                okhttp3.HttpUrl$Builder r0 = r1.addPathSegments(r2, r0)
                return r0
        }

        public final okhttp3.HttpUrl.Builder addQueryParameter(java.lang.String r28, java.lang.String r29) {
                r27 = this;
                java.lang.String r0 = "name"
                r13 = r28
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                r0 = r27
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r14 = 0
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                if (r1 != 0) goto L19
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r1 = (java.util.List) r1
                r0.encodedQueryNamesAndValues = r1
            L19:
                java.util.List<java.lang.String> r15 = r0.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r11 = 219(0xdb, float:3.07E-43)
                r12 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r2 = r28
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r15.add(r1)
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                if (r29 == 0) goto L5f
                okhttp3.HttpUrl$Companion r15 = okhttp3.HttpUrl.Companion
                r25 = 219(0xdb, float:3.07E-43)
                r26 = 0
                r17 = 0
                r18 = 0
                java.lang.String r19 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r20 = 0
                r21 = 0
                r22 = 1
                r23 = 0
                r24 = 0
                r16 = r29
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                goto L60
            L5f:
                r2 = 0
            L60:
                r1.add(r2)
                r0 = r27
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl build() {
                r24 = this;
                r0 = r24
                java.lang.String r2 = r0.scheme
                if (r2 == 0) goto Ldc
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                java.lang.String r4 = r0.encodedUsername
                r8 = 7
                r9 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                java.lang.String r3 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r3, r4, r5, r6, r7, r8, r9)
                okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.Companion
                java.lang.String r5 = r0.encodedPassword
                r9 = 7
                r10 = 0
                r8 = 0
                java.lang.String r4 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r5 = r0.host
                if (r5 == 0) goto Ld4
                int r6 = r24.effectivePort()
                java.util.List<java.lang.String> r1 = r0.encodedPathSegments
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                r7 = 0
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r9)
                r8.<init>(r10)
                java.util.Collection r8 = (java.util.Collection) r8
                r10 = r1
                r11 = 0
                java.util.Iterator r12 = r10.iterator()
            L3e:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L64
                java.lang.Object r13 = r12.next()
                r21 = r13
                java.lang.String r21 = (java.lang.String) r21
                r22 = 0
                okhttp3.HttpUrl$Companion r14 = okhttp3.HttpUrl.Companion
                r19 = 7
                r20 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r15 = r21
                java.lang.String r14 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r14, r15, r16, r17, r18, r19, r20)
                r8.add(r14)
                goto L3e
            L64:
                java.util.List r8 = (java.util.List) r8
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                r7 = 0
                if (r1 == 0) goto Lb1
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                r10 = 0
                java.util.ArrayList r11 = new java.util.ArrayList
                int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r9)
                r11.<init>(r9)
                r9 = r11
                java.util.Collection r9 = (java.util.Collection) r9
                r11 = r1
                r12 = 0
                java.util.Iterator r13 = r11.iterator()
            L82:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto Lac
                java.lang.Object r14 = r13.next()
                r22 = r14
                java.lang.String r22 = (java.lang.String) r22
                r23 = 0
                if (r22 == 0) goto La7
                okhttp3.HttpUrl$Companion r15 = okhttp3.HttpUrl.Companion
                r20 = 3
                r21 = 0
                r17 = 0
                r18 = 0
                r19 = 1
                r16 = r22
                java.lang.String r15 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r15, r16, r17, r18, r19, r20, r21)
                goto La8
            La7:
                r15 = r7
            La8:
                r9.add(r15)
                goto L82
            Lac:
                java.util.List r9 = (java.util.List) r9
                goto Lb2
            Lb1:
                r9 = r7
            Lb2:
                java.lang.String r11 = r0.encodedFragment
                if (r11 == 0) goto Lc4
                okhttp3.HttpUrl$Companion r10 = okhttp3.HttpUrl.Companion
                r15 = 7
                r16 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                java.lang.String r1 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r10, r11, r12, r13, r14, r15, r16)
                r10 = r1
                goto Lc5
            Lc4:
                r10 = r7
            Lc5:
                java.lang.String r11 = r24.toString()
                okhttp3.HttpUrl r12 = new okhttp3.HttpUrl
                r1 = r12
                r7 = r8
                r8 = r9
                r9 = r10
                r10 = r11
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r12
            Ld4:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "host == null"
                r1.<init>(r2)
                throw r1
            Ldc:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "scheme == null"
                r1.<init>(r2)
                throw r1
        }

        public final okhttp3.HttpUrl.Builder encodedFragment(java.lang.String r15) {
                r14 = this;
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                if (r15 == 0) goto L1e
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                r12 = 179(0xb3, float:2.51E-43)
                r13 = 0
                r4 = 0
                r5 = 0
                java.lang.String r6 = ""
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 1
                r11 = 0
                r3 = r15
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L1f
            L1e:
                r2 = 0
            L1f:
                r0.encodedFragment = r2
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder encodedPassword(java.lang.String r15) {
                r14 = this;
                java.lang.String r0 = "encodedPassword"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                r12 = 243(0xf3, float:3.4E-43)
                r13 = 0
                r4 = 0
                r5 = 0
                java.lang.String r6 = " \"':;<=>@[]^`{}|/\\?#"
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r3 = r15
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r0.encodedPassword = r2
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder encodedPath(java.lang.String r7) {
                r6 = this;
                java.lang.String r0 = "encodedPath"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r0 = r6
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                r2 = 2
                r3 = 0
                java.lang.String r4 = "/"
                r5 = 0
                boolean r2 = kotlin.text.StringsKt.startsWith$default(r7, r4, r5, r2, r3)
                if (r2 == 0) goto L20
                int r2 = r7.length()
                r0.resolvePath(r7, r5, r2)
                r0 = r6
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
            L20:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "unexpected encodedPath: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        public final okhttp3.HttpUrl.Builder encodedQuery(java.lang.String r15) {
                r14 = this;
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                if (r15 == 0) goto L27
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                r12 = 211(0xd3, float:2.96E-43)
                r13 = 0
                r4 = 0
                r5 = 0
                java.lang.String r6 = " \"'<>#"
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r3 = r15
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r2 == 0) goto L27
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                java.util.List r2 = r3.toQueryNamesAndValues$okhttp(r2)
                goto L28
            L27:
                r2 = 0
            L28:
                r0.encodedQueryNamesAndValues = r2
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder encodedUsername(java.lang.String r15) {
                r14 = this;
                java.lang.String r0 = "encodedUsername"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                r12 = 243(0xf3, float:3.4E-43)
                r13 = 0
                r4 = 0
                r5 = 0
                java.lang.String r6 = " \"':;<=>@[]^`{}|/\\?#"
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r3 = r15
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r0.encodedUsername = r2
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder fragment(java.lang.String r15) {
                r14 = this;
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                if (r15 == 0) goto L1d
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                r12 = 187(0xbb, float:2.62E-43)
                r13 = 0
                r4 = 0
                r5 = 0
                java.lang.String r6 = ""
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 1
                r11 = 0
                r3 = r15
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L1e
            L1d:
                r2 = 0
            L1e:
                r0.encodedFragment = r2
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final java.lang.String getEncodedFragment$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.encodedFragment
                return r0
        }

        public final java.lang.String getEncodedPassword$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.encodedPassword
                return r0
        }

        public final java.util.List<java.lang.String> getEncodedPathSegments$okhttp() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.encodedPathSegments
                return r0
        }

        public final java.util.List<java.lang.String> getEncodedQueryNamesAndValues$okhttp() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.encodedQueryNamesAndValues
                return r0
        }

        public final java.lang.String getEncodedUsername$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.encodedUsername
                return r0
        }

        public final java.lang.String getHost$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.host
                return r0
        }

        public final int getPort$okhttp() {
                r1 = this;
                int r0 = r1.port
                return r0
        }

        public final java.lang.String getScheme$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.scheme
                return r0
        }

        public final okhttp3.HttpUrl.Builder host(java.lang.String r10) {
                r9 = this;
                java.lang.String r0 = "host"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                r0 = r9
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                r7 = 7
                r8 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r3 = r10
                java.lang.String r2 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r2, r3, r4, r5, r6, r7, r8)
                java.lang.String r2 = okhttp3.internal.HostnamesKt.toCanonicalHost(r2)
                if (r2 == 0) goto L22
                r0.host = r2
                r0 = r9
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
            L22:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "unexpected host: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r10)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final okhttp3.HttpUrl.Builder parse$okhttp(okhttp3.HttpUrl r32, java.lang.String r33) {
                r31 = this;
                r0 = r31
                r13 = r33
                java.lang.String r1 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
                r1 = 0
                r14 = 0
                r2 = 3
                r3 = 0
                int r1 = okhttp3.internal.Util.indexOfFirstNonAsciiWhitespace$default(r13, r14, r14, r2, r3)
                r2 = 2
                int r15 = okhttp3.internal.Util.indexOfLastNonAsciiWhitespace$default(r13, r1, r14, r2, r3)
                okhttp3.HttpUrl$Builder$Companion r3 = okhttp3.HttpUrl.Builder.Companion
                int r12 = okhttp3.HttpUrl.Builder.Companion.access$schemeDelimiterOffset(r3, r13, r1, r15)
                java.lang.String r11 = "this as java.lang.String…ing(startIndex, endIndex)"
                r10 = 1
                r9 = -1
                if (r12 == r9) goto L67
            L23:
                java.lang.String r3 = "https:"
                boolean r3 = kotlin.text.StringsKt.startsWith(r13, r3, r1, r10)
                if (r3 == 0) goto L32
                java.lang.String r3 = "https"
                r0.scheme = r3
                int r1 = r1 + 6
                goto L6f
            L32:
                java.lang.String r3 = "http:"
                boolean r3 = kotlin.text.StringsKt.startsWith(r13, r3, r1, r10)
                if (r3 == 0) goto L41
                java.lang.String r3 = "http"
                r0.scheme = r3
                int r1 = r1 + 5
                goto L6f
            L41:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = r13.substring(r14, r12)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r11)
                java.lang.StringBuilder r3 = r3.append(r4)
                r4 = 39
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L67:
                if (r32 == 0) goto L337
                java.lang.String r3 = r32.scheme()
                r0.scheme = r3
            L6f:
                r3 = 0
                r4 = 0
                okhttp3.HttpUrl$Builder$Companion r5 = okhttp3.HttpUrl.Builder.Companion
                int r8 = okhttp3.HttpUrl.Builder.Companion.access$slashCount(r5, r13, r1, r15)
                r7 = 35
                if (r8 >= r2) goto Lcd
                if (r32 == 0) goto Lcd
                java.lang.String r2 = r32.scheme()
                java.lang.String r5 = r0.scheme
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
                if (r2 != 0) goto L8a
                goto Lcd
            L8a:
                java.lang.String r2 = r32.encodedUsername()
                r0.encodedUsername = r2
                java.lang.String r2 = r32.encodedPassword()
                r0.encodedPassword = r2
                java.lang.String r2 = r32.host()
                r0.host = r2
                int r2 = r32.port()
                r0.port = r2
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                r2.clear()
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                java.util.List r5 = r32.encodedPathSegments()
                java.util.Collection r5 = (java.util.Collection) r5
                r2.addAll(r5)
                if (r1 == r15) goto Lba
                char r2 = r13.charAt(r1)
                if (r2 != r7) goto Lc1
            Lba:
                java.lang.String r2 = r32.encodedQuery()
                r0.encodedQuery(r2)
            Lc1:
                r16 = r3
                r17 = r4
                r22 = r8
                r19 = r12
                r24 = r15
                goto L28a
            Lcd:
                int r1 = r1 + r8
                r6 = r1
                r16 = r3
                r17 = r4
            Ld3:
                java.lang.String r1 = "@/\\?#"
                int r5 = okhttp3.internal.Util.delimiterOffset(r13, r1, r6, r15)
                if (r5 == r15) goto Le1
                char r1 = r13.charAt(r5)
                goto Le2
            Le1:
                r1 = r9
            Le2:
                r18 = r1
                switch(r18) {
                    case -1: goto L1e9;
                    case 35: goto L1e9;
                    case 47: goto L1e9;
                    case 63: goto L1e9;
                    case 64: goto Lf7;
                    case 92: goto L1e9;
                    default: goto Le7;
                }
            Le7:
                r3 = r7
                r22 = r8
                r2 = r9
                r23 = r10
                r19 = r12
                r14 = r15
                r15 = r5
                r8 = r6
                r15 = r14
                r8 = r22
                r14 = 0
                goto Ld3
            Lf7:
                java.lang.String r4 = "%40"
                if (r17 != 0) goto L193
                r1 = 58
                int r3 = okhttp3.internal.Util.delimiterOffset(r13, r1, r6, r5)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r19 = 240(0xf0, float:3.36E-43)
                r20 = 0
                java.lang.String r21 = " \"':;<=>@[]^`{}|/\\?#"
                r22 = 1
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r2 = r33
                r27 = r3
                r3 = r6
                r14 = r4
                r4 = r27
                r28 = r5
                r5 = r21
                r21 = r6
                r6 = r22
                r7 = r23
                r22 = r8
                r8 = r24
                r9 = r25
                r23 = r10
                r10 = r26
                r29 = r11
                r11 = r19
                r19 = r12
                r12 = r20
                java.lang.String r12 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r16 == 0) goto L159
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r0.encodedUsername
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r14)
                java.lang.StringBuilder r1 = r1.append(r12)
                java.lang.String r1 = r1.toString()
                goto L15a
            L159:
                r1 = r12
            L15a:
                r0.encodedUsername = r1
                r11 = r27
                r14 = r28
                if (r11 == r14) goto L188
                r17 = 1
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                int r3 = r11 + 1
                r20 = 240(0xf0, float:3.36E-43)
                r24 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r2 = r33
                r4 = r14
                r25 = r11
                r11 = r20
                r20 = r12
                r12 = r24
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.encodedPassword = r1
                goto L18c
            L188:
                r25 = r11
                r20 = r12
            L18c:
                r1 = 1
                r16 = r1
                r24 = r15
                r15 = r14
                goto L1d7
            L193:
                r14 = r4
                r21 = r6
                r22 = r8
                r23 = r10
                r29 = r11
                r19 = r12
                r12 = r5
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r0.encodedPassword
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r14 = r1.append(r14)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r11 = 240(0xf0, float:3.36E-43)
                r20 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r2 = r33
                r3 = r21
                r4 = r12
                r24 = r15
                r15 = r12
                r12 = r20
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.StringBuilder r1 = r14.append(r1)
                java.lang.String r1 = r1.toString()
                r0.encodedPassword = r1
            L1d7:
                int r6 = r15 + 1
                r12 = r19
                r8 = r22
                r10 = r23
                r15 = r24
                r11 = r29
                r7 = 35
                r9 = -1
                r14 = 0
                goto Ld3
            L1e9:
                r21 = r6
                r22 = r8
                r23 = r10
                r29 = r11
                r19 = r12
                r24 = r15
                r15 = r5
                okhttp3.HttpUrl$Builder$Companion r1 = okhttp3.HttpUrl.Builder.Companion
                r8 = r21
                int r9 = okhttp3.HttpUrl.Builder.Companion.access$portColonOffset(r1, r13, r8, r15)
                int r1 = r9 + 1
                r10 = 34
                if (r1 >= r15) goto L25c
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r6 = 4
                r7 = 0
                r5 = 0
                r2 = r33
                r3 = r8
                r4 = r9
                java.lang.String r1 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r1, r2, r3, r4, r5, r6, r7)
                java.lang.String r1 = okhttp3.internal.HostnamesKt.toCanonicalHost(r1)
                r0.host = r1
                okhttp3.HttpUrl$Builder$Companion r1 = okhttp3.HttpUrl.Builder.Companion
                int r2 = r9 + 1
                int r1 = okhttp3.HttpUrl.Builder.Companion.access$parsePort(r1, r13, r2, r15)
                r0.port = r1
                int r1 = r0.port
                r2 = -1
                if (r1 == r2) goto L229
                r1 = r23
                goto L22a
            L229:
                r1 = 0
            L22a:
                if (r1 == 0) goto L22f
                r11 = r29
                goto L27e
            L22f:
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid URL port: \""
                java.lang.StringBuilder r2 = r2.append(r3)
                int r3 = r9 + 1
                java.lang.String r3 = r13.substring(r3, r15)
                r11 = r29
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r11)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r10)
                java.lang.String r1 = r2.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L25c:
                r11 = r29
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r6 = 4
                r7 = 0
                r5 = 0
                r2 = r33
                r3 = r8
                r4 = r9
                java.lang.String r1 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(r1, r2, r3, r4, r5, r6, r7)
                java.lang.String r1 = okhttp3.internal.HostnamesKt.toCanonicalHost(r1)
                r0.host = r1
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.lang.String r2 = r0.scheme
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                int r1 = r1.defaultPort(r2)
                r0.port = r1
            L27e:
                java.lang.String r1 = r0.host
                if (r1 == 0) goto L285
                r14 = r23
                goto L286
            L285:
                r14 = 0
            L286:
                if (r14 == 0) goto L30e
                r1 = r15
            L28a:
                java.lang.String r2 = "?#"
                r14 = r24
                int r15 = okhttp3.internal.Util.delimiterOffset(r13, r2, r1, r14)
                r0.resolvePath(r13, r1, r15)
                r12 = r15
                if (r12 >= r14) goto L2db
                char r1 = r13.charAt(r12)
                r2 = 63
                if (r1 != r2) goto L2db
                r11 = 35
                int r18 = okhttp3.internal.Util.delimiterOffset(r13, r11, r12, r14)
                okhttp3.HttpUrl$Companion r10 = okhttp3.HttpUrl.Companion
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                int r3 = r12 + 1
                r20 = 208(0xd0, float:2.91E-43)
                r21 = 0
                java.lang.String r5 = " \"'<>#"
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r23 = 0
                r2 = r33
                r4 = r18
                r30 = r10
                r10 = r23
                r11 = r20
                r20 = r12
                r12 = r21
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r2 = r30
                java.util.List r1 = r2.toQueryNamesAndValues$okhttp(r1)
                r0.encodedQueryNamesAndValues = r1
                r12 = r18
                goto L2df
            L2db:
                r20 = r12
                r12 = r20
            L2df:
                if (r12 >= r14) goto L30b
                char r1 = r13.charAt(r12)
                r3 = 35
                if (r1 != r3) goto L30b
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                int r3 = r12 + 1
                r11 = 176(0xb0, float:2.47E-43)
                r18 = 0
                java.lang.String r5 = ""
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r2 = r33
                r4 = r14
                r20 = r12
                r12 = r18
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.encodedFragment = r1
                goto L30d
            L30b:
                r20 = r12
            L30d:
                return r0
            L30e:
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid URL host: \""
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = r13.substring(r8, r9)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r11)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r10)
                java.lang.String r1 = r2.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L337:
                r19 = r12
                r14 = r15
                int r2 = r33.length()
                r3 = 6
                if (r2 <= r3) goto L359
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = kotlin.text.StringsKt.take(r13, r3)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = "..."
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                goto L35a
            L359:
                r2 = r13
            L35a:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Expected URL scheme 'http' or 'https' but no scheme was found for "
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.StringBuilder r4 = r4.append(r2)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
        }

        public final okhttp3.HttpUrl.Builder password(java.lang.String r15) {
                r14 = this;
                java.lang.String r0 = "password"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                r12 = 251(0xfb, float:3.52E-43)
                r13 = 0
                r4 = 0
                r5 = 0
                java.lang.String r6 = " \"':;<=>@[]^`{}|/\\?#"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r3 = r15
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r0.encodedPassword = r2
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder port(int r6) {
                r5 = this;
                r0 = r5
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                r2 = 0
                r3 = 1
                if (r3 > r6) goto Ld
                r4 = 65536(0x10000, float:9.1835E-41)
                if (r6 >= r4) goto Ld
                r2 = r3
            Ld:
                if (r2 == 0) goto L16
                r0.port = r6
                r0 = r5
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
            L16:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "unexpected port: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        public final okhttp3.HttpUrl.Builder query(java.lang.String r15) {
                r14 = this;
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                if (r15 == 0) goto L26
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                r12 = 219(0xdb, float:3.07E-43)
                r13 = 0
                r4 = 0
                r5 = 0
                java.lang.String r6 = " \"'<>#"
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r3 = r15
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r2 == 0) goto L26
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                java.util.List r2 = r3.toQueryNamesAndValues$okhttp(r2)
                goto L27
            L26:
                r2 = 0
            L27:
                r0.encodedQueryNamesAndValues = r2
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder reencodeForUri$okhttp() {
                r19 = this;
                r0 = r19
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                java.lang.String r2 = r0.host
                r3 = 0
                if (r2 == 0) goto L1a
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                kotlin.text.Regex r4 = new kotlin.text.Regex
                java.lang.String r5 = "[\"<>^`{|}]"
                r4.<init>(r5)
                java.lang.String r5 = ""
                java.lang.String r2 = r4.replace(r2, r5)
                goto L1b
            L1a:
                r2 = r3
            L1b:
                r0.host = r2
                r2 = 0
                java.util.List<java.lang.String> r4 = r0.encodedPathSegments
                int r4 = r4.size()
            L24:
                if (r2 >= r4) goto L4c
                java.util.List<java.lang.String> r5 = r0.encodedPathSegments
                okhttp3.HttpUrl$Companion r6 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r7 = r0.encodedPathSegments
                java.lang.Object r7 = r7.get(r2)
                java.lang.String r7 = (java.lang.String) r7
                r16 = 227(0xe3, float:3.18E-43)
                r17 = 0
                r8 = 0
                r9 = 0
                java.lang.String r10 = "[]"
                r11 = 1
                r12 = 1
                r13 = 0
                r14 = 0
                r15 = 0
                java.lang.String r6 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r5.set(r2, r6)
                int r2 = r2 + 1
                goto L24
            L4c:
                java.util.List<java.lang.String> r2 = r0.encodedQueryNamesAndValues
                if (r2 == 0) goto L80
                r4 = 0
                int r5 = r2.size()
            L55:
                if (r4 >= r5) goto L80
                java.lang.Object r6 = r2.get(r4)
                r8 = r6
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L79
                okhttp3.HttpUrl$Companion r7 = okhttp3.HttpUrl.Companion
                r17 = 195(0xc3, float:2.73E-43)
                r18 = 0
                r9 = 0
                r10 = 0
                java.lang.String r11 = "\\^`{|}"
                r12 = 1
                r13 = 1
                r14 = 1
                r15 = 0
                r16 = 0
                java.lang.String r6 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                goto L7a
            L79:
                r6 = r3
            L7a:
                r2.set(r4, r6)
                int r4 = r4 + 1
                goto L55
            L80:
                java.lang.String r7 = r0.encodedFragment
                if (r7 == 0) goto L9c
                okhttp3.HttpUrl$Companion r6 = okhttp3.HttpUrl.Companion
                r16 = 163(0xa3, float:2.28E-43)
                r17 = 0
                r8 = 0
                r9 = 0
                java.lang.String r10 = " \"#<>\\^`{|}"
                r11 = 1
                r12 = 1
                r13 = 0
                r14 = 1
                r15 = 0
                java.lang.String r3 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            L9c:
                r0.encodedFragment = r3
                r0 = r19
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder removeAllEncodedQueryParameters(java.lang.String r16) {
                r15 = this;
                java.lang.String r0 = "encodedName"
                r13 = r16
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                r0 = r15
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r14 = 0
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                if (r1 != 0) goto L10
                return r0
            L10:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r11 = 211(0xd3, float:2.96E-43)
                r12 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"'<>#&="
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r2 = r16
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.removeAllCanonicalQueryParameters(r1)
                r0 = r15
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder removeAllQueryParameters(java.lang.String r16) {
                r15 = this;
                java.lang.String r0 = "name"
                r13 = r16
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                r0 = r15
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r14 = 0
                java.util.List<java.lang.String> r1 = r0.encodedQueryNamesAndValues
                if (r1 != 0) goto L10
                return r0
            L10:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                r11 = 219(0xdb, float:3.07E-43)
                r12 = 0
                r3 = 0
                r4 = 0
                java.lang.String r5 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r2 = r16
                java.lang.String r1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.removeAllCanonicalQueryParameters(r1)
                r0 = r15
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder removePathSegment(int r5) {
                r4 = this;
                r0 = r4
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                r2.remove(r5)
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L18
                java.util.List<java.lang.String> r2 = r0.encodedPathSegments
                java.lang.String r3 = ""
                r2.add(r3)
            L18:
                r0 = r4
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final okhttp3.HttpUrl.Builder scheme(java.lang.String r6) {
                r5 = this;
                java.lang.String r0 = "scheme"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r0 = r5
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                java.lang.String r2 = "http"
                r3 = 1
                boolean r4 = kotlin.text.StringsKt.equals(r6, r2, r3)
                if (r4 == 0) goto L16
                r0.scheme = r2
                goto L20
            L16:
                java.lang.String r2 = "https"
                boolean r3 = kotlin.text.StringsKt.equals(r6, r2, r3)
                if (r3 == 0) goto L25
                r0.scheme = r2
            L20:
                r0 = r5
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
            L25:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "unexpected scheme: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final void setEncodedFragment$okhttp(java.lang.String r1) {
                r0 = this;
                r0.encodedFragment = r1
                return
        }

        public final void setEncodedPassword$okhttp(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.encodedPassword = r2
                return
        }

        public final okhttp3.HttpUrl.Builder setEncodedPathSegment(int r16, java.lang.String r17) {
                r15 = this;
                r12 = r17
                java.lang.String r0 = "encodedPathSegment"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                r13 = r15
                okhttp3.HttpUrl$Builder r13 = (okhttp3.HttpUrl.Builder) r13
                r14 = 0
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 243(0xf3, float:3.4E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"<>^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r1 = r17
                java.lang.String r0 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.List<java.lang.String> r1 = r13.encodedPathSegments
                r2 = r16
                r1.set(r2, r0)
                boolean r1 = r13.isDot(r0)
                if (r1 != 0) goto L36
                boolean r1 = r13.isDotDot(r0)
                if (r1 != 0) goto L36
                r1 = 1
                goto L37
            L36:
                r1 = 0
            L37:
                if (r1 == 0) goto L3e
            L3a:
                r0 = r15
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
            L3e:
                r1 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "unexpected path segment: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r12)
                java.lang.String r1 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r3.<init>(r1)
                throw r3
        }

        public final void setEncodedQueryNamesAndValues$okhttp(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.encodedQueryNamesAndValues = r1
                return
        }

        public final okhttp3.HttpUrl.Builder setEncodedQueryParameter(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "encodedName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = r2
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                r0.removeAllEncodedQueryParameters(r3)
                r0.addEncodedQueryParameter(r3, r4)
                r0 = r2
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final void setEncodedUsername$okhttp(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.encodedUsername = r2
                return
        }

        public final void setHost$okhttp(java.lang.String r1) {
                r0 = this;
                r0.host = r1
                return
        }

        public final okhttp3.HttpUrl.Builder setPathSegment(int r16, java.lang.String r17) {
                r15 = this;
                r12 = r17
                java.lang.String r0 = "pathSegment"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                r13 = r15
                okhttp3.HttpUrl$Builder r13 = (okhttp3.HttpUrl.Builder) r13
                r14 = 0
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                r10 = 251(0xfb, float:3.52E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"<>^`{}|/\\?#"
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r1 = r17
                java.lang.String r0 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r1 = r13.isDot(r0)
                if (r1 != 0) goto L2d
                boolean r1 = r13.isDotDot(r0)
                if (r1 != 0) goto L2d
                r1 = 1
                goto L2e
            L2d:
                r1 = 0
            L2e:
                if (r1 == 0) goto L3c
                java.util.List<java.lang.String> r1 = r13.encodedPathSegments
                r2 = r16
                r1.set(r2, r0)
                r0 = r15
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
            L3c:
                r2 = r16
                r1 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "unexpected path segment: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r12)
                java.lang.String r1 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r3.<init>(r1)
                throw r3
        }

        public final void setPort$okhttp(int r1) {
                r0 = this;
                r0.port = r1
                return
        }

        public final okhttp3.HttpUrl.Builder setQueryParameter(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = r2
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                r0.removeAllQueryParameters(r3)
                r0.addQueryParameter(r3, r4)
                r0 = r2
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }

        public final void setScheme$okhttp(java.lang.String r1) {
                r0 = this;
                r0.scheme = r1
                return
        }

        public java.lang.String toString() {
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = r0
                r2 = 0
                java.lang.String r3 = r8.scheme
                if (r3 == 0) goto L16
                java.lang.String r3 = r8.scheme
                r1.append(r3)
                java.lang.String r3 = "://"
                r1.append(r3)
                goto L1b
            L16:
                java.lang.String r3 = "//"
                r1.append(r3)
            L1b:
                java.lang.String r3 = r8.encodedUsername
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                r4 = 1
                r5 = 0
                if (r3 <= 0) goto L29
                r3 = r4
                goto L2a
            L29:
                r3 = r5
            L2a:
                r6 = 58
                if (r3 != 0) goto L3d
                java.lang.String r3 = r8.encodedPassword
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 <= 0) goto L3a
                r3 = r4
                goto L3b
            L3a:
                r3 = r5
            L3b:
                if (r3 == 0) goto L5d
            L3d:
                java.lang.String r3 = r8.encodedUsername
                r1.append(r3)
                java.lang.String r3 = r8.encodedPassword
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 <= 0) goto L4d
                goto L4e
            L4d:
                r4 = r5
            L4e:
                if (r4 == 0) goto L58
                r1.append(r6)
                java.lang.String r3 = r8.encodedPassword
                r1.append(r3)
            L58:
                r3 = 64
                r1.append(r3)
            L5d:
                java.lang.String r3 = r8.host
                if (r3 == 0) goto L85
                java.lang.String r3 = r8.host
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r4 = 2
                r7 = 0
                boolean r3 = kotlin.text.StringsKt.contains$default(r3, r6, r5, r4, r7)
                if (r3 == 0) goto L80
                r3 = 91
                r1.append(r3)
                java.lang.String r3 = r8.host
                r1.append(r3)
                r3 = 93
                r1.append(r3)
                goto L85
            L80:
                java.lang.String r3 = r8.host
                r1.append(r3)
            L85:
                int r3 = r8.port
                r4 = -1
                if (r3 != r4) goto L8e
                java.lang.String r3 = r8.scheme
                if (r3 == 0) goto La9
            L8e:
                int r3 = r8.effectivePort()
                java.lang.String r4 = r8.scheme
                if (r4 == 0) goto La3
                okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.Companion
                java.lang.String r5 = r8.scheme
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                int r4 = r4.defaultPort(r5)
                if (r3 == r4) goto La9
            La3:
                r1.append(r6)
                r1.append(r3)
            La9:
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r4 = r8.encodedPathSegments
                r3.toPathString$okhttp(r4, r1)
                java.util.List<java.lang.String> r3 = r8.encodedQueryNamesAndValues
                if (r3 == 0) goto Lc3
                r3 = 63
                r1.append(r3)
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r4 = r8.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                r3.toQueryString$okhttp(r4, r1)
            Lc3:
                java.lang.String r3 = r8.encodedFragment
                if (r3 == 0) goto Ld1
                r3 = 35
                r1.append(r3)
                java.lang.String r3 = r8.encodedFragment
                r1.append(r3)
            Ld1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        public final okhttp3.HttpUrl.Builder username(java.lang.String r15) {
                r14 = this;
                java.lang.String r0 = "username"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                r1 = 0
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                r12 = 251(0xfb, float:3.52E-43)
                r13 = 0
                r4 = 0
                r5 = 0
                java.lang.String r6 = " \"':;<=>@[]^`{}|/\\?#"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r3 = r15
                java.lang.String r2 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r0.encodedUsername = r2
                r0 = r14
                okhttp3.HttpUrl$Builder r0 = (okhttp3.HttpUrl.Builder) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: HttpUrl.kt */
    @kotlin.Metadata(m114d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\b\u0018J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u001cJa\u0010\u001d\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0002\b(J\u001c\u0010)\u001a\u00020\"*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J/\u0010*\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\"H\u0000¢\u0006\u0002\b+J\u0011\u0010,\u001a\u00020\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0017H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u001aH\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u001bJ#\u0010.\u001a\u00020/*\b\u0012\u0004\u0012\u00020\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b4J\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000406*\u00020\u0004H\u0000¢\u0006\u0002\b7J%\u00108\u001a\u00020/*\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b9JV\u0010:\u001a\u00020/*\u00020;2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J,\u0010=\u001a\u00020/*\u00020;2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006?"}, m115d2 = {"Lokhttp3/HttpUrl$Companion;", "", "()V", "FORM_ENCODE_SET", "", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "HEX_DIGITS", "", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "defaultPort", "", "scheme", "get", "Lokhttp3/HttpUrl;", "uri", "Ljava/net/URI;", "-deprecated_get", "url", "Ljava/net/URL;", "parse", "-deprecated_parse", "canonicalize", "pos", "limit", "encodeSet", "alreadyEncoded", "", "strict", "plusIsSpace", "unicodeAllowed", "charset", "Ljava/nio/charset/Charset;", "canonicalize$okhttp", "isPercentEncoded", "percentDecode", "percentDecode$okhttp", "toHttpUrl", "toHttpUrlOrNull", "toPathString", "", "", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "toPathString$okhttp", "toQueryNamesAndValues", "", "toQueryNamesAndValues$okhttp", "toQueryString", "toQueryString$okhttp", "writeCanonicalized", "Lokio/Buffer;", "input", "writePercentDecoded", "encoded", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ java.lang.String canonicalize$okhttp$default(okhttp3.HttpUrl.Companion r13, java.lang.String r14, int r15, int r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, java.nio.charset.Charset r22, int r23, java.lang.Object r24) {
                r0 = r23
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L9
                r5 = r2
                goto La
            L9:
                r5 = r15
            La:
                r1 = r0 & 2
                if (r1 == 0) goto L14
                int r1 = r14.length()
                r6 = r1
                goto L16
            L14:
                r6 = r16
            L16:
                r1 = r0 & 8
                if (r1 == 0) goto L1c
                r8 = r2
                goto L1e
            L1c:
                r8 = r18
            L1e:
                r1 = r0 & 16
                if (r1 == 0) goto L24
                r9 = r2
                goto L26
            L24:
                r9 = r19
            L26:
                r1 = r0 & 32
                if (r1 == 0) goto L2c
                r10 = r2
                goto L2e
            L2c:
                r10 = r20
            L2e:
                r1 = r0 & 64
                if (r1 == 0) goto L34
                r11 = r2
                goto L36
            L34:
                r11 = r21
            L36:
                r0 = r0 & 128(0x80, float:1.8E-43)
                if (r0 == 0) goto L3d
                r0 = 0
                r12 = r0
                goto L3f
            L3d:
                r12 = r22
            L3f:
                r3 = r13
                r4 = r14
                r7 = r17
                java.lang.String r0 = r3.canonicalize$okhttp(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r0
        }

        private final boolean isPercentEncoded(java.lang.String r3, int r4, int r5) {
                r2 = this;
                int r0 = r4 + 2
                if (r0 >= r5) goto L27
                char r0 = r3.charAt(r4)
                r1 = 37
                if (r0 != r1) goto L27
                int r0 = r4 + 1
                char r0 = r3.charAt(r0)
                int r0 = okhttp3.internal.Util.parseHexDigit(r0)
                r1 = -1
                if (r0 == r1) goto L27
                int r0 = r4 + 2
                char r0 = r3.charAt(r0)
                int r0 = okhttp3.internal.Util.parseHexDigit(r0)
                if (r0 == r1) goto L27
                r0 = 1
                goto L28
            L27:
                r0 = 0
            L28:
                return r0
        }

        public static /* synthetic */ java.lang.String percentDecode$okhttp$default(okhttp3.HttpUrl.Companion r1, java.lang.String r2, int r3, int r4, boolean r5, int r6, java.lang.Object r7) {
                r7 = r6 & 1
                r0 = 0
                if (r7 == 0) goto L6
                r3 = r0
            L6:
                r7 = r6 & 2
                if (r7 == 0) goto Le
                int r4 = r2.length()
            Le:
                r6 = r6 & 4
                if (r6 == 0) goto L13
                r5 = r0
            L13:
                java.lang.String r1 = r1.percentDecode$okhttp(r2, r3, r4, r5)
                return r1
        }

        private final void writeCanonicalized(okio.Buffer r14, java.lang.String r15, int r16, int r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22, java.nio.charset.Charset r23) {
                r13 = this;
                r0 = r14
                r1 = r15
                r2 = r17
                r3 = r23
                r4 = 0
                r5 = 0
                r6 = r16
            La:
                if (r6 >= r2) goto Lc6
                int r5 = r15.codePointAt(r6)
                if (r19 == 0) goto L28
                r7 = 9
                if (r5 == r7) goto L25
                r7 = 10
                if (r5 == r7) goto L25
                r7 = 12
                if (r5 == r7) goto L22
                r7 = 13
                if (r5 != r7) goto L28
            L22:
                r7 = r13
                goto Lbf
            L25:
                r7 = r13
                goto Lbf
            L28:
                r7 = 43
                if (r5 != r7) goto L3b
                if (r21 == 0) goto L3b
                if (r19 == 0) goto L33
                java.lang.String r7 = "+"
                goto L35
            L33:
                java.lang.String r7 = "%2B"
            L35:
                r14.writeUtf8(r7)
                r7 = r13
                goto Lbf
            L3b:
                r7 = 32
                r8 = 37
                if (r5 < r7) goto L77
                r7 = 127(0x7f, float:1.78E-43)
                if (r5 == r7) goto L75
                r7 = 128(0x80, float:1.8E-43)
                if (r5 < r7) goto L4e
                if (r22 == 0) goto L4c
                goto L4e
            L4c:
                r7 = r13
                goto L78
            L4e:
                r7 = r18
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                char r9 = (char) r5
                r10 = 2
                r11 = 0
                r12 = 0
                boolean r7 = kotlin.text.StringsKt.contains$default(r7, r9, r12, r10, r11)
                if (r7 != 0) goto L73
                if (r5 != r8) goto L6e
                if (r19 == 0) goto L6c
                if (r20 == 0) goto L6a
                r7 = r13
                boolean r9 = r13.isPercentEncoded(r15, r6, r2)
                if (r9 != 0) goto L6f
                goto L78
            L6a:
                r7 = r13
                goto L6f
            L6c:
                r7 = r13
                goto L78
            L6e:
                r7 = r13
            L6f:
                r14.writeUtf8CodePoint(r5)
                goto Lbf
            L73:
                r7 = r13
                goto L78
            L75:
                r7 = r13
                goto L78
            L77:
                r7 = r13
            L78:
                if (r4 != 0) goto L80
                okio.Buffer r9 = new okio.Buffer
                r9.<init>()
                r4 = r9
            L80:
                if (r3 == 0) goto L94
                java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
                boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r9)
                if (r9 == 0) goto L8b
                goto L94
            L8b:
                int r9 = java.lang.Character.charCount(r5)
                int r9 = r9 + r6
                r4.writeString(r15, r6, r9, r3)
                goto L97
            L94:
                r4.writeUtf8CodePoint(r5)
            L97:
                boolean r9 = r4.exhausted()
                if (r9 != 0) goto Lbf
                byte r9 = r4.readByte()
                r9 = r9 & 255(0xff, float:3.57E-43)
                r14.writeByte(r8)
                char[] r10 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r11 = r9 >> 4
                r11 = r11 & 15
                char r10 = r10[r11]
                r14.writeByte(r10)
                char[] r10 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r11 = r9 & 15
                char r10 = r10[r11]
                r14.writeByte(r10)
                goto L97
            Lbf:
                int r8 = java.lang.Character.charCount(r5)
                int r6 = r6 + r8
                goto La
            Lc6:
                r7 = r13
                return
        }

        private final void writePercentDecoded(okio.Buffer r6, java.lang.String r7, int r8, int r9, boolean r10) {
                r5 = this;
                r0 = 0
                r1 = r8
            L2:
                if (r1 >= r9) goto L4f
                int r0 = r7.codePointAt(r1)
                r2 = 37
                if (r0 != r2) goto L38
                int r2 = r1 + 2
                if (r2 >= r9) goto L38
                int r2 = r1 + 1
                char r2 = r7.charAt(r2)
                int r2 = okhttp3.internal.Util.parseHexDigit(r2)
                int r3 = r1 + 2
                char r3 = r7.charAt(r3)
                int r3 = okhttp3.internal.Util.parseHexDigit(r3)
                r4 = -1
                if (r2 == r4) goto L46
                if (r3 == r4) goto L46
                int r4 = r2 << 4
                int r4 = r4 + r3
                r6.writeByte(r4)
                int r1 = r1 + 2
                int r4 = java.lang.Character.charCount(r0)
                int r1 = r1 + r4
                goto L2
            L38:
                r2 = 43
                if (r0 != r2) goto L46
                if (r10 == 0) goto L46
                r2 = 32
                r6.writeByte(r2)
                int r1 = r1 + 1
                goto L2
            L46:
                r6.writeUtf8CodePoint(r0)
                int r2 = java.lang.Character.charCount(r0)
                int r1 = r1 + r2
                goto L2
            L4f:
                return
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m10303deprecated_get(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.HttpUrl r0 = r1.get(r2)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m10304deprecated_get(java.net.URI r2) {
                r1 = this;
                java.lang.String r0 = "uri"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.HttpUrl r0 = r1.get(r2)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m10305deprecated_get(java.net.URL r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.HttpUrl r0 = r1.get(r2)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.HttpUrl m10306deprecated_parse(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.HttpUrl r0 = r1.parse(r2)
                return r0
        }

        public final java.lang.String canonicalize$okhttp(java.lang.String r18, int r19, int r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25, java.nio.charset.Charset r26) {
                r17 = this;
                r11 = r18
                r12 = r20
                r13 = r21
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "encodeSet"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                r0 = 0
                r1 = r19
                r14 = r1
            L14:
                if (r14 >= r12) goto L9b
                int r15 = r11.codePointAt(r14)
                r0 = 32
                if (r15 < r0) goto L66
                r0 = 127(0x7f, float:1.78E-43)
                if (r15 == r0) goto L63
                r0 = 128(0x80, float:1.8E-43)
                if (r15 < r0) goto L2c
                if (r25 == 0) goto L29
                goto L2c
            L29:
                r10 = r17
                goto L68
            L2c:
                r0 = r13
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                char r1 = (char) r15
                r2 = 2
                r3 = 0
                r4 = 0
                boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r4, r2, r3)
                if (r0 != 0) goto L60
                r0 = 37
                if (r15 != r0) goto L50
                if (r22 == 0) goto L4d
                if (r23 == 0) goto L4a
                r10 = r17
                boolean r0 = r10.isPercentEncoded(r11, r14, r12)
                if (r0 == 0) goto L68
                goto L52
            L4a:
                r10 = r17
                goto L52
            L4d:
                r10 = r17
                goto L68
            L50:
                r10 = r17
            L52:
                r0 = 43
                if (r15 != r0) goto L59
                if (r24 == 0) goto L59
                goto L68
            L59:
                int r0 = java.lang.Character.charCount(r15)
                int r14 = r14 + r0
                r0 = r15
                goto L14
            L60:
                r10 = r17
                goto L68
            L63:
                r10 = r17
                goto L68
            L66:
                r10 = r17
            L68:
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                r9 = r0
                r8 = r19
                r9.writeUtf8(r11, r8, r14)
                r0 = r17
                r1 = r9
                r2 = r18
                r3 = r14
                r4 = r20
                r5 = r21
                r6 = r22
                r7 = r23
                r8 = r24
                r16 = r9
                r9 = r25
                r10 = r26
                r0.writeCanonicalized(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r16.readUtf8()
                return r0
            L9b:
                java.lang.String r1 = r18.substring(r19, r20)
                java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final int defaultPort(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "scheme"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "http"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
                if (r0 == 0) goto L11
                r0 = 80
                goto L1d
            L11:
                java.lang.String r0 = "https"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
                if (r0 == 0) goto L1c
                r0 = 443(0x1bb, float:6.21E-43)
                goto L1d
            L1c:
                r0 = -1
            L1d:
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl get(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder
                r0.<init>()
                r1 = 0
                okhttp3.HttpUrl$Builder r0 = r0.parse$okhttp(r1, r3)
                okhttp3.HttpUrl r0 = r0.build()
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl get(java.net.URI r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = r3.toString()
                java.lang.String r1 = "toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                okhttp3.HttpUrl r0 = r2.parse(r0)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl get(java.net.URL r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = r3.toString()
                java.lang.String r1 = "toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                okhttp3.HttpUrl r0 = r2.parse(r0)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl parse(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.HttpUrl r0 = r2.get(r3)     // Catch: java.lang.IllegalArgumentException -> Lb
                goto Le
            Lb:
                r0 = move-exception
                r1 = 0
                r0 = r1
            Le:
                return r0
        }

        public final java.lang.String percentDecode$okhttp(java.lang.String r10, int r11, int r12, boolean r13) {
                r9 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                r0 = r11
            L6:
                if (r0 >= r12) goto L31
                char r7 = r10.charAt(r0)
                r1 = 37
                if (r7 == r1) goto L1a
                r1 = 43
                if (r7 != r1) goto L17
                if (r13 == 0) goto L17
                goto L1a
            L17:
                int r0 = r0 + 1
                goto L6
            L1a:
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r8 = r1
                r8.writeUtf8(r10, r11, r0)
                r1 = r9
                r2 = r8
                r3 = r10
                r4 = r0
                r5 = r12
                r6 = r13
                r1.writePercentDecoded(r2, r3, r4, r5, r6)
                java.lang.String r1 = r8.readUtf8()
                return r1
            L31:
                java.lang.String r0 = r10.substring(r11, r12)
                java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        public final void toPathString$okhttp(java.util.List<java.lang.String> r4, java.lang.StringBuilder r5) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "out"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 0
                int r1 = r4.size()
            Lf:
                if (r0 >= r1) goto L22
                r2 = 47
                r5.append(r2)
                java.lang.Object r2 = r4.get(r0)
                java.lang.String r2 = (java.lang.String) r2
                r5.append(r2)
                int r0 = r0 + 1
                goto Lf
            L22:
                return
        }

        public final java.util.List<java.lang.String> toQueryNamesAndValues$okhttp(java.lang.String r11) {
                r10 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                r1 = 0
            Ld:
                int r2 = r11.length()
                if (r1 > r2) goto L64
                r2 = r11
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r6 = 4
                r7 = 0
                r3 = 38
                r5 = 0
                r4 = r1
                int r2 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
                r8 = -1
                if (r2 != r8) goto L27
                int r2 = r11.length()
            L27:
                r9 = r2
                r2 = r11
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r6 = 4
                r7 = 0
                r3 = 61
                r5 = 0
                r4 = r1
                int r2 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
                java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
                if (r2 == r8) goto L53
                if (r2 <= r9) goto L3c
                goto L53
            L3c:
                java.lang.String r4 = r11.substring(r1, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
                r0.add(r4)
                int r4 = r2 + 1
                java.lang.String r4 = r11.substring(r4, r9)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
                r0.add(r4)
                goto L61
            L53:
                java.lang.String r4 = r11.substring(r1, r9)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
                r0.add(r4)
                r3 = 0
                r0.add(r3)
            L61:
                int r1 = r9 + 1
                goto Ld
            L64:
                return r0
        }

        public final void toQueryString$okhttp(java.util.List<java.lang.String> r7, java.lang.StringBuilder r8) {
                r6 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "out"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r0 = 0
                int r1 = r7.size()
                kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
                kotlin.ranges.IntProgression r0 = (kotlin.ranges.IntProgression) r0
                r1 = 2
                kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
                int r1 = r0.getFirst()
                int r2 = r0.getLast()
                int r0 = r0.getStep()
                if (r0 <= 0) goto L2a
                if (r1 <= r2) goto L2e
            L2a:
                if (r0 >= 0) goto L54
                if (r2 > r1) goto L54
            L2e:
                java.lang.Object r3 = r7.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                int r4 = r1 + 1
                java.lang.Object r4 = r7.get(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r1 <= 0) goto L43
                r5 = 38
                r8.append(r5)
            L43:
                r8.append(r3)
                if (r4 == 0) goto L50
                r5 = 61
                r8.append(r5)
                r8.append(r4)
            L50:
                if (r1 == r2) goto L54
                int r1 = r1 + r0
                goto L2e
            L54:
                return
        }
    }

    static {
            okhttp3.HttpUrl$Companion r0 = new okhttp3.HttpUrl$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.HttpUrl.Companion = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            okhttp3.HttpUrl.HEX_DIGITS = r0
            return
    }

    public HttpUrl(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, java.util.List<java.lang.String> r8, java.util.List<java.lang.String> r9, java.lang.String r10, java.lang.String r11) {
            r2 = this;
            java.lang.String r0 = "scheme"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "username"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "password"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "host"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "pathSegments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r2.<init>()
            r2.scheme = r3
            r2.username = r4
            r2.password = r5
            r2.host = r6
            r2.port = r7
            r2.pathSegments = r8
            r2.queryNamesAndValues = r9
            r2.fragment = r10
            r2.url = r11
            java.lang.String r0 = r2.scheme
            java.lang.String r1 = "https"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r2.isHttps = r0
            return
    }

    public static final /* synthetic */ char[] access$getHEX_DIGITS$cp() {
            char[] r0 = okhttp3.HttpUrl.HEX_DIGITS
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final int defaultPort(java.lang.String r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            int r0 = r0.defaultPort(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl get(java.lang.String r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r0 = r0.get(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl get(java.net.URI r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r0 = r0.get(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl get(java.net.URL r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r0 = r0.get(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl parse(java.lang.String r1) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r0 = r0.parse(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedFragment", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final java.lang.String m10284deprecated_encodedFragment() {
            r1 = this;
            java.lang.String r0 = r1.encodedFragment()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPassword", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final java.lang.String m10285deprecated_encodedPassword() {
            r1 = this;
            java.lang.String r0 = r1.encodedPassword()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPath", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final java.lang.String m10286deprecated_encodedPath() {
            r1 = this;
            java.lang.String r0 = r1.encodedPath()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPathSegments", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m10287deprecated_encodedPathSegments() {
            r1 = this;
            java.util.List r0 = r1.encodedPathSegments()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedQuery", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final java.lang.String m10288deprecated_encodedQuery() {
            r1 = this;
            java.lang.String r0 = r1.encodedQuery()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedUsername", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final java.lang.String m10289deprecated_encodedUsername() {
            r1 = this;
            java.lang.String r0 = r1.encodedUsername()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "fragment", imports = {}))
    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name */
    public final java.lang.String m10290deprecated_fragment() {
            r1 = this;
            java.lang.String r0 = r1.fragment
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "host", imports = {}))
    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name */
    public final java.lang.String m10291deprecated_host() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "password", imports = {}))
    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name */
    public final java.lang.String m10292deprecated_password() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pathSegments", imports = {}))
    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m10293deprecated_pathSegments() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pathSize", imports = {}))
    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m10294deprecated_pathSize() {
            r1 = this;
            int r0 = r1.pathSize()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "port", imports = {}))
    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name */
    public final int m10295deprecated_port() {
            r1 = this;
            int r0 = r1.port
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "query", imports = {}))
    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final java.lang.String m10296deprecated_query() {
            r1 = this;
            java.lang.String r0 = r1.query()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "queryParameterNames", imports = {}))
    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final java.util.Set<java.lang.String> m10297deprecated_queryParameterNames() {
            r1 = this;
            java.util.Set r0 = r1.queryParameterNames()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "querySize", imports = {}))
    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m10298deprecated_querySize() {
            r1 = this;
            int r0 = r1.querySize()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "scheme", imports = {}))
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final java.lang.String m10299deprecated_scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @kotlin.ReplaceWith(expression = "toUri()", imports = {}))
    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final java.net.URI m10300deprecated_uri() {
            r1 = this;
            java.net.URI r0 = r1.uri()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @kotlin.ReplaceWith(expression = "toUrl()", imports = {}))
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final java.net.URL m10301deprecated_url() {
            r1 = this;
            java.net.URL r0 = r1.url()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "username", imports = {}))
    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name */
    public final java.lang.String m10302deprecated_username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }

    public final java.lang.String encodedFragment() {
            r7 = this;
            java.lang.String r0 = r7.fragment
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r7.url
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5 = 6
            r6 = 0
            r2 = 35
            r3 = 0
            r4 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            java.lang.String r1 = r7.url
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public final java.lang.String encodedPassword() {
            r8 = this;
            java.lang.String r0 = r8.password
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            if (r0 != 0) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L13
            java.lang.String r0 = ""
            return r0
        L13:
            java.lang.String r0 = r8.url
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r0 = r8.scheme
            int r0 = r0.length()
            int r4 = r0 + 3
            r6 = 4
            r7 = 0
            r3 = 58
            r5 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
            int r0 = r0 + r1
            java.lang.String r1 = r8.url
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6 = 6
            r3 = 64
            r4 = 0
            int r1 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
            java.lang.String r2 = r8.url
            java.lang.String r2 = r2.substring(r0, r1)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public final java.lang.String encodedPath() {
            r7 = this;
            java.lang.String r0 = r7.url
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = r7.scheme
            int r0 = r0.length()
            int r3 = r0 + 3
            r5 = 4
            r6 = 0
            r2 = 47
            r4 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = r7.url
            java.lang.String r2 = r7.url
            int r2 = r2.length()
            java.lang.String r3 = "?#"
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r3, r0, r2)
            java.lang.String r2 = r7.url
            java.lang.String r2 = r2.substring(r0, r1)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public final java.util.List<java.lang.String> encodedPathSegments() {
            r7 = this;
            java.lang.String r0 = r7.url
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = r7.scheme
            int r0 = r0.length()
            int r3 = r0 + 3
            r5 = 4
            r6 = 0
            r2 = 47
            r4 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = r7.url
            java.lang.String r2 = r7.url
            int r2 = r2.length()
            java.lang.String r3 = "?#"
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r3, r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r3 = r0
        L2c:
            if (r3 >= r1) goto L48
            int r3 = r3 + 1
            java.lang.String r4 = r7.url
            r5 = 47
            int r4 = okhttp3.internal.Util.delimiterOffset(r4, r5, r3, r1)
            java.lang.String r5 = r7.url
            java.lang.String r5 = r5.substring(r3, r4)
            java.lang.String r6 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r2.add(r5)
            r3 = r4
            goto L2c
        L48:
            return r2
    }

    public final java.lang.String encodedQuery() {
            r7 = this;
            java.util.List<java.lang.String> r0 = r7.queryNamesAndValues
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r7.url
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5 = 6
            r6 = 0
            r2 = 63
            r3 = 0
            r4 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            java.lang.String r1 = r7.url
            java.lang.String r2 = r7.url
            int r2 = r2.length()
            r3 = 35
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r3, r0, r2)
            java.lang.String r2 = r7.url
            java.lang.String r2 = r2.substring(r0, r1)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public final java.lang.String encodedUsername() {
            r4 = this;
            java.lang.String r0 = r4.username
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L12
            java.lang.String r0 = ""
            return r0
        L12:
            java.lang.String r0 = r4.scheme
            int r0 = r0.length()
            int r0 = r0 + 3
            java.lang.String r1 = r4.url
            java.lang.String r2 = r4.url
            int r2 = r2.length()
            java.lang.String r3 = ":@"
            int r1 = okhttp3.internal.Util.delimiterOffset(r1, r3, r0, r2)
            java.lang.String r2 = r4.url
            java.lang.String r2 = r2.substring(r0, r1)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.HttpUrl
            if (r0 == 0) goto L13
            r0 = r3
            okhttp3.HttpUrl r0 = (okhttp3.HttpUrl) r0
            java.lang.String r0 = r0.url
            java.lang.String r1 = r2.url
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    public final java.lang.String fragment() {
            r1 = this;
            java.lang.String r0 = r1.fragment
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.url
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String host() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    public final boolean isHttps() {
            r1 = this;
            boolean r0 = r1.isHttps
            return r0
    }

    public final okhttp3.HttpUrl.Builder newBuilder() {
            r4 = this;
            okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder
            r0.<init>()
            java.lang.String r1 = r4.scheme
            r0.setScheme$okhttp(r1)
            java.lang.String r1 = r4.encodedUsername()
            r0.setEncodedUsername$okhttp(r1)
            java.lang.String r1 = r4.encodedPassword()
            r0.setEncodedPassword$okhttp(r1)
            java.lang.String r1 = r4.host
            r0.setHost$okhttp(r1)
            int r1 = r4.port
            okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
            java.lang.String r3 = r4.scheme
            int r2 = r2.defaultPort(r3)
            if (r1 == r2) goto L2c
            int r1 = r4.port
            goto L2d
        L2c:
            r1 = -1
        L2d:
            r0.setPort$okhttp(r1)
            java.util.List r1 = r0.getEncodedPathSegments$okhttp()
            r1.clear()
            java.util.List r1 = r0.getEncodedPathSegments$okhttp()
            java.util.List r2 = r4.encodedPathSegments()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            java.lang.String r1 = r4.encodedQuery()
            r0.encodedQuery(r1)
            java.lang.String r1 = r4.encodedFragment()
            r0.setEncodedFragment$okhttp(r1)
            return r0
    }

    public final okhttp3.HttpUrl.Builder newBuilder(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "link"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder     // Catch: java.lang.IllegalArgumentException -> L10
            r0.<init>()     // Catch: java.lang.IllegalArgumentException -> L10
            okhttp3.HttpUrl$Builder r0 = r0.parse$okhttp(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L10
            goto L13
        L10:
            r0 = move-exception
            r1 = 0
            r0 = r1
        L13:
            return r0
    }

    public final java.lang.String password() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    public final java.util.List<java.lang.String> pathSegments() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            return r0
    }

    public final int pathSize() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.pathSegments
            int r0 = r0.size()
            return r0
    }

    public final int port() {
            r1 = this;
            int r0 = r1.port
            return r0
    }

    public final java.lang.String query() {
            r3 = this;
            java.util.List<java.lang.String> r0 = r3.queryNamesAndValues
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
            java.util.List<java.lang.String> r2 = r3.queryNamesAndValues
            r1.toQueryString$okhttp(r2, r0)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public final java.lang.String queryParameter(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List<java.lang.String> r0 = r5.queryNamesAndValues
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.util.List<java.lang.String> r0 = r5.queryNamesAndValues
            int r0 = r0.size()
            r2 = 0
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r2, r0)
            kotlin.ranges.IntProgression r0 = (kotlin.ranges.IntProgression) r0
            r2 = 2
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r2)
            int r2 = r0.getFirst()
            int r3 = r0.getLast()
            int r0 = r0.getStep()
            if (r0 <= 0) goto L2d
            if (r2 <= r3) goto L31
        L2d:
            if (r0 >= 0) goto L4c
            if (r3 > r2) goto L4c
        L31:
            java.util.List<java.lang.String> r4 = r5.queryNamesAndValues
            java.lang.Object r4 = r4.get(r2)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
            if (r4 == 0) goto L48
            java.util.List<java.lang.String> r0 = r5.queryNamesAndValues
            int r1 = r2 + 1
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L48:
            if (r2 == r3) goto L4c
            int r2 = r2 + r0
            goto L31
        L4c:
            return r1
    }

    public final java.lang.String queryParameterName(int r3) {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.queryNamesAndValues
            if (r0 == 0) goto L12
            java.util.List<java.lang.String> r0 = r2.queryNamesAndValues
            int r1 = r3 * 2
            java.lang.Object r0 = r0.get(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public final java.util.Set<java.lang.String> queryParameterNames() {
            r5 = this;
            java.util.List<java.lang.String> r0 = r5.queryNamesAndValues
            if (r0 != 0) goto L9
            java.util.Set r0 = kotlin.collections.SetsKt.emptySet()
            return r0
        L9:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List<java.lang.String> r1 = r5.queryNamesAndValues
            int r1 = r1.size()
            r2 = 0
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.until(r2, r1)
            kotlin.ranges.IntProgression r1 = (kotlin.ranges.IntProgression) r1
            r2 = 2
            kotlin.ranges.IntProgression r1 = kotlin.ranges.RangesKt.step(r1, r2)
            int r2 = r1.getFirst()
            int r3 = r1.getLast()
            int r1 = r1.getStep()
            if (r1 <= 0) goto L30
            if (r2 <= r3) goto L34
        L30:
            if (r1 >= 0) goto L44
            if (r3 > r2) goto L44
        L34:
            java.util.List<java.lang.String> r4 = r5.queryNamesAndValues
            java.lang.Object r4 = r4.get(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0.add(r4)
            if (r2 == r3) goto L44
            int r2 = r2 + r1
            goto L34
        L44:
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            java.lang.String r2 = "unmodifiableSet(result)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public final java.lang.String queryParameterValue(int r3) {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.queryNamesAndValues
            if (r0 == 0) goto L11
            java.util.List<java.lang.String> r0 = r2.queryNamesAndValues
            int r1 = r3 * 2
            int r1 = r1 + 1
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L11:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public final java.util.List<java.lang.String> queryParameterValues(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.List<java.lang.String> r0 = r6.queryNamesAndValues
            if (r0 != 0) goto Le
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            java.util.List<java.lang.String> r1 = r6.queryNamesAndValues
            int r1 = r1.size()
            r2 = 0
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.until(r2, r1)
            kotlin.ranges.IntProgression r1 = (kotlin.ranges.IntProgression) r1
            r2 = 2
            kotlin.ranges.IntProgression r1 = kotlin.ranges.RangesKt.step(r1, r2)
            int r2 = r1.getFirst()
            int r3 = r1.getLast()
            int r1 = r1.getStep()
            if (r1 <= 0) goto L37
            if (r2 <= r3) goto L3b
        L37:
            if (r1 >= 0) goto L56
            if (r3 > r2) goto L56
        L3b:
            java.util.List<java.lang.String> r4 = r6.queryNamesAndValues
            java.lang.Object r4 = r4.get(r2)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r4)
            if (r4 == 0) goto L52
            java.util.List<java.lang.String> r4 = r6.queryNamesAndValues
            int r5 = r2 + 1
            java.lang.Object r4 = r4.get(r5)
            r0.add(r4)
        L52:
            if (r2 == r3) goto L56
            int r2 = r2 + r1
            goto L3b
        L56:
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            java.lang.String r2 = "unmodifiableList(result)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public final int querySize() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            if (r0 == 0) goto Ld
            java.util.List<java.lang.String> r0 = r1.queryNamesAndValues
            int r0 = r0.size()
            int r0 = r0 / 2
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public final java.lang.String redact() {
            r2 = this;
            java.lang.String r0 = "/..."
            okhttp3.HttpUrl$Builder r0 = r2.newBuilder(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r1 = ""
            okhttp3.HttpUrl$Builder r0 = r0.username(r1)
            okhttp3.HttpUrl$Builder r0 = r0.password(r1)
            okhttp3.HttpUrl r0 = r0.build()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final okhttp3.HttpUrl resolve(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "link"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.HttpUrl$Builder r0 = r1.newBuilder(r2)
            if (r0 == 0) goto L10
            okhttp3.HttpUrl r0 = r0.build()
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public final java.lang.String scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public final java.lang.String topPrivateDomain() {
            r2 = this;
            java.lang.String r0 = r2.host
            boolean r0 = okhttp3.internal.Util.canParseAsIpAddress(r0)
            if (r0 == 0) goto La
            r0 = 0
            goto L16
        La:
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = r0.get()
            java.lang.String r1 = r2.host
            java.lang.String r0 = r0.getEffectiveTldPlusOne(r1)
        L16:
            return r0
    }

    public final java.net.URI uri() {
            r5 = this;
            okhttp3.HttpUrl$Builder r0 = r5.newBuilder()
            okhttp3.HttpUrl$Builder r0 = r0.reencodeForUri$okhttp()
            java.lang.String r0 = r0.toString()
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> L13
            r1.<init>(r0)     // Catch: java.net.URISyntaxException -> L13
            goto L2f
        L13:
            r1 = move-exception
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch: java.lang.Exception -> L30
            kotlin.text.Regex r3 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L30
            java.lang.String r4 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"
            r3.<init>(r4)     // Catch: java.lang.Exception -> L30
            java.lang.String r4 = ""
            java.lang.String r2 = r3.replace(r2, r4)     // Catch: java.lang.Exception -> L30
            java.net.URI r3 = java.net.URI.create(r2)     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "{\n      // Unlikely edge…Unexpected!\n      }\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            r1 = r3
        L2f:
            return r1
        L30:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r4 = r1
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r3.<init>(r4)
            throw r3
    }

    public final java.net.URL url() {
            r3 = this;
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L9
            java.lang.String r1 = r3.url     // Catch: java.net.MalformedURLException -> L9
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.<init>(r2)
            throw r1
    }

    public final java.lang.String username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }
}
