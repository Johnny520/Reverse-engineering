package okhttp3.internal;

/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000¸\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u001a\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017\u001a'\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0!\"\u00020\"¢\u0006\u0002\u0010#\u001a\u001a\u0010$\u001a\u00020\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0086\bø\u0001\u0000\u001a-\u0010'\u001a\b\u0012\u0004\u0012\u0002H)0(\"\u0004\b\u0000\u0010)2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u0002H)0!\"\u0002H)H\u0007¢\u0006\u0002\u0010+\u001a\u000e\u0010,\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0011\u001a1\u0010-\u001a\u0004\u0018\u0001H)\"\u0004\b\u0000\u0010)2\u0006\u0010.\u001a\u00020\"2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H)002\u0006\u00101\u001a\u00020\u0011¢\u0006\u0002\u00102\u001a\u0016\u00103\u001a\u0002042\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u000f\u001a\"\u00106\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0086\bø\u0001\u0000\u001a%\u00107\u001a\u00020\u001b\"\u0004\b\u0000\u00108*\b\u0012\u0004\u0012\u0002H8092\u0006\u0010:\u001a\u0002H8H\u0000¢\u0006\u0002\u0010;\u001a\u0015\u0010<\u001a\u00020\u0014*\u00020=2\u0006\u0010>\u001a\u00020\u0014H\u0086\u0004\u001a\u0015\u0010<\u001a\u00020\u0017*\u00020\u00142\u0006\u0010>\u001a\u00020\u0017H\u0086\u0004\u001a\u0015\u0010<\u001a\u00020\u0014*\u00020?2\u0006\u0010>\u001a\u00020\u0014H\u0086\u0004\u001a\n\u0010@\u001a\u00020A*\u00020B\u001a\r\u0010C\u001a\u00020\u001b*\u00020\"H\u0080\b\u001a\r\u0010D\u001a\u00020\u001b*\u00020\"H\u0080\b\u001a\n\u0010E\u001a\u00020\u000f*\u00020\u0011\u001a\u0012\u0010F\u001a\u00020\u000f*\u00020G2\u0006\u0010H\u001a\u00020G\u001a\n\u0010I\u001a\u00020\u001b*\u00020J\u001a\n\u0010I\u001a\u00020\u001b*\u00020K\u001a\n\u0010I\u001a\u00020\u001b*\u00020L\u001a#\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00110!*\b\u0012\u0004\u0012\u00020\u00110!2\u0006\u0010N\u001a\u00020\u0011¢\u0006\u0002\u0010O\u001a&\u0010P\u001a\u00020\u0014*\u00020\u00112\u0006\u0010Q\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020\u00142\b\b\u0002\u0010T\u001a\u00020\u0014\u001a&\u0010P\u001a\u00020\u0014*\u00020\u00112\u0006\u0010U\u001a\u00020\u00112\b\b\u0002\u0010S\u001a\u00020\u00142\b\b\u0002\u0010T\u001a\u00020\u0014\u001a\u001a\u0010V\u001a\u00020\u000f*\u00020W2\u0006\u0010X\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\u0019\u001a;\u0010Z\u001a\b\u0012\u0004\u0012\u0002H)0(\"\u0004\b\u0000\u0010)*\b\u0012\u0004\u0012\u0002H)0[2\u0017\u0010\\\u001a\u0013\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u00020\u000f0]¢\u0006\u0002\b^H\u0086\bø\u0001\u0000\u001a5\u0010_\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00110!2\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010!2\u000e\u0010`\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00110a¢\u0006\u0002\u0010b\u001a\n\u0010c\u001a\u00020\u0017*\u00020d\u001a+\u0010e\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00110!2\u0006\u0010N\u001a\u00020\u00112\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00110a¢\u0006\u0002\u0010f\u001a\n\u0010g\u001a\u00020\u0014*\u00020\u0011\u001a\u001e\u0010h\u001a\u00020\u0014*\u00020\u00112\b\b\u0002\u0010S\u001a\u00020\u00142\b\b\u0002\u0010T\u001a\u00020\u0014\u001a\u001e\u0010i\u001a\u00020\u0014*\u00020\u00112\b\b\u0002\u0010S\u001a\u00020\u00142\b\b\u0002\u0010T\u001a\u00020\u0014\u001a\u0014\u0010j\u001a\u00020\u0014*\u00020\u00112\b\b\u0002\u0010S\u001a\u00020\u0014\u001a9\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00110!*\b\u0012\u0004\u0012\u00020\u00110!2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00110!2\u000e\u0010`\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00110a¢\u0006\u0002\u0010l\u001a\u0012\u0010m\u001a\u00020\u000f*\u00020n2\u0006\u0010o\u001a\u00020p\u001a\u0012\u0010q\u001a\u00020\u000f*\u00020L2\u0006\u0010r\u001a\u00020s\u001a\r\u0010t\u001a\u00020\u001b*\u00020\"H\u0086\b\u001a\r\u0010u\u001a\u00020\u001b*\u00020\"H\u0086\b\u001a\n\u0010v\u001a\u00020\u0014*\u00020R\u001a\n\u0010w\u001a\u00020\u0011*\u00020L\u001a\u0012\u0010x\u001a\u00020y*\u00020s2\u0006\u0010z\u001a\u00020y\u001a\n\u0010{\u001a\u00020\u0014*\u00020s\u001a\u0012\u0010|\u001a\u00020\u0014*\u00020}2\u0006\u0010~\u001a\u00020=\u001a\u001a\u0010|\u001a\u00020\u000f*\u00020W2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\u0019\u001a\u0011\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010(*\u00020\u0003\u001a\u0012\u0010\u0081\u0001\u001a\u00020\u0003*\t\u0012\u0005\u0012\u00030\u0080\u00010(\u001a\u000b\u0010\u0082\u0001\u001a\u00020\u0011*\u00020\u0014\u001a\u000b\u0010\u0082\u0001\u001a\u00020\u0011*\u00020\u0017\u001a\u0016\u0010\u0083\u0001\u001a\u00020\u0011*\u00020G2\t\b\u0002\u0010\u0084\u0001\u001a\u00020\u000f\u001a\u001d\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u0002H)0(\"\u0004\b\u0000\u0010)*\b\u0012\u0004\u0012\u0002H)0(\u001a7\u0010\u0086\u0001\u001a\u0011\u0012\u0005\u0012\u0003H\u0088\u0001\u0012\u0005\u0012\u0003H\u0089\u00010\u0087\u0001\"\u0005\b\u0000\u0010\u0088\u0001\"\u0005\b\u0001\u0010\u0089\u0001*\u0011\u0012\u0005\u0012\u0003H\u0088\u0001\u0012\u0005\u0012\u0003H\u0089\u00010\u0087\u0001\u001a\u0014\u0010\u008a\u0001\u001a\u00020\u0017*\u00020\u00112\u0007\u0010\u008b\u0001\u001a\u00020\u0017\u001a\u0016\u0010\u008c\u0001\u001a\u00020\u0014*\u0004\u0018\u00010\u00112\u0007\u0010\u008b\u0001\u001a\u00020\u0014\u001a\u001f\u0010\u008d\u0001\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010S\u001a\u00020\u00142\b\b\u0002\u0010T\u001a\u00020\u0014\u001a\u000e\u0010\u008e\u0001\u001a\u00020\u001b*\u00020\"H\u0086\b\u001a'\u0010\u008f\u0001\u001a\u00030\u0090\u0001*\b0\u0091\u0001j\u0003`\u0092\u00012\u0013\u0010\u0093\u0001\u001a\u000e\u0012\n\u0012\b0\u0091\u0001j\u0003`\u0092\u00010(\u001a\u0015\u0010\u0094\u0001\u001a\u00020\u001b*\u00030\u0095\u00012\u0007\u0010\u0096\u0001\u001a\u00020\u0014\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u000e\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0010\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0097\u0001"}, m115d2 = {"EMPTY_BYTE_ARRAY", "", "EMPTY_HEADERS", "Lokhttp3/Headers;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "UNICODE_BOMS", "Lokio/Options;", "UTC", "Ljava/util/TimeZone;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "assertionsEnabled", "", "okHttpName", "", "userAgent", "checkDuration", "", "name", "duration", "", "unit", "Ljava/util/concurrent/TimeUnit;", "checkOffsetAndCount", "", "arrayLength", "offset", "count", "format", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "ignoreIoExceptions", "block", "Lkotlin/Function0;", "immutableListOf", "", "T", "elements", "([Ljava/lang/Object;)Ljava/util/List;", "isSensitiveHeader", "readFieldOrNull", "instance", "fieldType", "Ljava/lang/Class;", "fieldName", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "daemon", "threadName", "addIfAbsent", "E", "", "element", "(Ljava/util/List;Ljava/lang/Object;)V", "and", "", "mask", "", "asFactory", "Lokhttp3/EventListener$Factory;", "Lokhttp3/EventListener;", "assertThreadDoesntHoldLock", "assertThreadHoldsLock", "canParseAsIpAddress", "canReuseConnectionFor", "Lokhttp3/HttpUrl;", "other", "closeQuietly", "Ljava/io/Closeable;", "Ljava/net/ServerSocket;", "Ljava/net/Socket;", "concat", "value", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "delimiterOffset", "delimiter", "", "startIndex", "endIndex", "delimiters", "discard", "Lokio/Source;", "timeout", "timeUnit", "filterList", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "hasIntersection", "comparator", "Ljava/util/Comparator;", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "headersContentLength", "Lokhttp3/Response;", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "indexOfControlOrNonAscii", "indexOfFirstNonAsciiWhitespace", "indexOfLastNonAsciiWhitespace", "indexOfNonWhitespace", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "isCivilized", "Lokhttp3/internal/io/FileSystem;", "file", "Ljava/io/File;", "isHealthy", "source", "Lokio/BufferedSource;", "notify", "notifyAll", "parseHexDigit", "peerName", "readBomAsCharset", "Ljava/nio/charset/Charset;", "default", "readMedium", "skipAll", "Lokio/Buffer;", "b", "toHeaderList", "Lokhttp3/internal/http2/Header;", "toHeaders", "toHexString", "toHostHeader", "includeDefaultPort", "toImmutableList", "toImmutableMap", "", "K", "V", "toLongOrDefault", "defaultValue", "toNonNegativeInt", "trimSubstring", "wait", "withSuppressed", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "writeMedium", "Lokio/BufferedSink;", "medium", "okhttp"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final okhttp3.Headers EMPTY_HEADERS = null;
    public static final okhttp3.RequestBody EMPTY_REQUEST = null;
    public static final okhttp3.ResponseBody EMPTY_RESPONSE = null;
    private static final okio.Options UNICODE_BOMS = null;
    public static final java.util.TimeZone UTC = null;
    private static final kotlin.text.Regex VERIFY_AS_IP_ADDRESS = null;
    public static final boolean assertionsEnabled = false;
    public static final java.lang.String okHttpName = null;
    public static final java.lang.String userAgent = "okhttp/4.12.0";

    public static /* synthetic */ okhttp3.EventListener $r8$lambda$6bJzZULcdNB_k9pZZ3Jli9KIJPU(okhttp3.EventListener r0, okhttp3.Call r1) {
            okhttp3.EventListener r0 = asFactory$lambda$8(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.Thread $r8$lambda$Z7sFMQ7rKRN5UBTcwjGfDTXgpz8(java.lang.String r0, boolean r1, java.lang.Runnable r2) {
            java.lang.Thread r0 = threadFactory$lambda$1(r0, r1, r2)
            return r0
    }

    static {
            r0 = 0
            byte[] r1 = new byte[r0]
            okhttp3.internal.Util.EMPTY_BYTE_ARRAY = r1
            okhttp3.Headers$Companion r1 = okhttp3.Headers.Companion
            java.lang.String[] r2 = new java.lang.String[r0]
            okhttp3.Headers r1 = r1.m142of(r2)
            okhttp3.internal.Util.EMPTY_HEADERS = r1
            okhttp3.ResponseBody$Companion r1 = okhttp3.ResponseBody.Companion
            byte[] r2 = okhttp3.internal.Util.EMPTY_BYTE_ARRAY
            r3 = 0
            r4 = 1
            okhttp3.ResponseBody r1 = okhttp3.ResponseBody.Companion.create$default(r1, r2, r3, r4, r3)
            okhttp3.internal.Util.EMPTY_RESPONSE = r1
            okhttp3.RequestBody$Companion r5 = okhttp3.RequestBody.Companion
            byte[] r6 = okhttp3.internal.Util.EMPTY_BYTE_ARRAY
            r10 = 7
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            okhttp3.RequestBody r1 = okhttp3.RequestBody.Companion.create$default(r5, r6, r7, r8, r9, r10, r11)
            okhttp3.internal.Util.EMPTY_REQUEST = r1
            okio.Options$Companion r1 = okio.Options.Companion
            r2 = 5
            okio.ByteString[] r2 = new okio.ByteString[r2]
            okio.ByteString$Companion r3 = okio.ByteString.Companion
            java.lang.String r5 = "efbbbf"
            okio.ByteString r3 = r3.decodeHex(r5)
            r2[r0] = r3
            okio.ByteString$Companion r3 = okio.ByteString.Companion
            java.lang.String r5 = "feff"
            okio.ByteString r3 = r3.decodeHex(r5)
            r2[r4] = r3
            okio.ByteString$Companion r3 = okio.ByteString.Companion
            java.lang.String r4 = "fffe"
            okio.ByteString r3 = r3.decodeHex(r4)
            r4 = 2
            r2[r4] = r3
            okio.ByteString$Companion r3 = okio.ByteString.Companion
            java.lang.String r4 = "0000ffff"
            okio.ByteString r3 = r3.decodeHex(r4)
            r4 = 3
            r2[r4] = r3
            okio.ByteString$Companion r3 = okio.ByteString.Companion
            java.lang.String r4 = "ffff0000"
            okio.ByteString r3 = r3.decodeHex(r4)
            r4 = 4
            r2[r4] = r3
            okio.Options r1 = r1.m150of(r2)
            okhttp3.internal.Util.UNICODE_BOMS = r1
            java.lang.String r1 = "GMT"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okhttp3.internal.Util.UTC = r1
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r2 = "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"
            r1.<init>(r2)
            okhttp3.internal.Util.VERIFY_AS_IP_ADDRESS = r1
            java.lang.Class<okhttp3.OkHttpClient> r1 = okhttp3.OkHttpClient.class
            okhttp3.internal.Util.assertionsEnabled = r0
            java.lang.Class<okhttp3.OkHttpClient> r0 = okhttp3.OkHttpClient.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "OkHttpClient::class.java.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "okhttp3."
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = kotlin.text.StringsKt.removePrefix(r0, r1)
            java.lang.String r1 = "Client"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = kotlin.text.StringsKt.removeSuffix(r0, r1)
            okhttp3.internal.Util.okHttpName = r0
            return
    }

    public static final <E> void addIfAbsent(java.util.List<E> r1, E r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto Le
            r1.add(r2)
        Le:
            return
    }

    public static final int and(byte r1, int r2) {
            r0 = r1 & r2
            return r0
    }

    public static final int and(short r1, int r2) {
            r0 = r1 & r2
            return r0
    }

    public static final long and(int r2, long r3) {
            long r0 = (long) r2
            long r0 = r0 & r3
            return r0
    }

    public static final okhttp3.EventListener.Factory asFactory(okhttp3.EventListener r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okhttp3.internal.Util$$ExternalSyntheticLambda0 r0 = new okhttp3.internal.Util$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    private static final okhttp3.EventListener asFactory$lambda$8(okhttp3.EventListener r1, okhttp3.Call r2) {
            java.lang.String r0 = "$this_asFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return r1
    }

    public static final void assertThreadDoesntHoldLock(java.lang.Object r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            boolean r1 = okhttp3.internal.Util.assertionsEnabled
            if (r1 == 0) goto L3c
            boolean r1 = java.lang.Thread.holdsLock(r4)
            if (r1 != 0) goto L11
            goto L3c
        L11:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Thread "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " MUST NOT hold lock on "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3c:
            return
    }

    public static final void assertThreadHoldsLock(java.lang.Object r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            boolean r1 = okhttp3.internal.Util.assertionsEnabled
            if (r1 == 0) goto L3c
            boolean r1 = java.lang.Thread.holdsLock(r4)
            if (r1 == 0) goto L11
            goto L3c
        L11:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Thread "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " MUST hold lock on "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3c:
            return
    }

    public static final boolean canParseAsIpAddress(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.text.Regex r0 = okhttp3.internal.Util.VERIFY_AS_IP_ADDRESS
            r1 = r2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = r0.matches(r1)
            return r0
    }

    public static final boolean canReuseConnectionFor(okhttp3.HttpUrl r2, okhttp3.HttpUrl r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r2.host()
            java.lang.String r1 = r3.host()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L32
            int r0 = r2.port()
            int r1 = r3.port()
            if (r0 != r1) goto L32
            java.lang.String r0 = r2.scheme()
            java.lang.String r1 = r3.scheme()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            return r0
    }

    public static final int checkDuration(java.lang.String r9, long r10, java.util.concurrent.TimeUnit r12) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 < 0) goto Lf
            r2 = r3
            goto L10
        Lf:
            r2 = r4
        L10:
            if (r2 == 0) goto L81
            if (r12 == 0) goto L16
            r2 = r3
            goto L17
        L16:
            r2 = r4
        L17:
            if (r2 == 0) goto L73
            long r5 = r12.toMillis(r10)
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L26
            r2 = r3
            goto L27
        L26:
            r2 = r4
        L27:
            if (r2 == 0) goto L55
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L33
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L32
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L37
            int r0 = (int) r5
            return r0
        L37:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r2 = " too small."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L55:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r2 = " too large."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L73:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unit == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L81:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r2 = " < 0"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final void checkOffsetAndCount(long r4, long r6, long r8) {
            long r0 = r6 | r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L13
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r4 - r6
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public static final void closeQuietly(java.io.Closeable r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.close()     // Catch: java.lang.Exception -> La java.lang.RuntimeException -> Lc
            goto Lb
        La:
            r0 = move-exception
        Lb:
            return
        Lc:
            r0 = move-exception
            throw r0
    }

    public static final void closeQuietly(java.net.ServerSocket r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.close()     // Catch: java.lang.Exception -> La java.lang.RuntimeException -> Lc
            goto Lb
        La:
            r0 = move-exception
        Lb:
            return
        Lc:
            r0 = move-exception
            throw r0
    }

    public static final void closeQuietly(java.net.Socket r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r3.close()     // Catch: java.lang.Exception -> La java.lang.RuntimeException -> Lc java.lang.AssertionError -> L1b
            goto Lb
        La:
            r0 = move-exception
        Lb:
            return
        Lc:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "bio == null"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L1a
            return
        L1a:
            throw r0
        L1b:
            r0 = move-exception
            throw r0
    }

    public static final java.lang.String[] concat(java.lang.String[] r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.length
            int r0 = r0 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r1 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r1 = kotlin.collections.ArraysKt.getLastIndex(r0)
            r0[r1] = r3
            return r0
    }

    public static final int delimiterOffset(java.lang.String r2, char r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = r4
        L6:
            if (r0 >= r5) goto L12
            char r1 = r2.charAt(r0)
            if (r1 != r3) goto Lf
            return r0
        Lf:
            int r0 = r0 + 1
            goto L6
        L12:
            return r5
    }

    public static final int delimiterOffset(java.lang.String r6, java.lang.String r7, int r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "delimiters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r8
        Lb:
            if (r0 >= r9) goto L21
            r1 = r7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            char r2 = r6.charAt(r0)
            r3 = 2
            r4 = 0
            r5 = 0
            boolean r1 = kotlin.text.StringsKt.contains$default(r1, r2, r5, r3, r4)
            if (r1 == 0) goto L1e
            return r0
        L1e:
            int r0 = r0 + 1
            goto Lb
        L21:
            return r9
    }

    public static /* synthetic */ int delimiterOffset$default(java.lang.String r0, char r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r0.length()
        Ld:
            int r0 = delimiterOffset(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int delimiterOffset$default(java.lang.String r0, java.lang.String r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r0.length()
        Ld:
            int r0 = delimiterOffset(r0, r1, r2, r3)
            return r0
    }

    public static final boolean discard(okio.Source r2, int r3, java.util.concurrent.TimeUnit r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = skipAll(r2, r3, r4)     // Catch: java.io.IOException -> L10
            goto L13
        L10:
            r0 = move-exception
            r1 = 0
            r0 = r1
        L13:
            return r0
    }

    public static final <T> java.util.List<T> filterList(java.lang.Iterable<? extends T> r5, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Iterator r2 = r5.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r6.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L13
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L37
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1 = r4
            java.util.List r1 = (java.util.List) r1
        L37:
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)
            java.util.List r4 = kotlin.jvm.internal.TypeIntrinsics.asMutableList(r1)
            r4.add(r3)
            goto L13
        L44:
            return r1
    }

    public static final java.lang.String format(java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.StringCompanionObject r0 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.util.Locale r0 = java.util.Locale.US
            int r1 = r4.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r0 = java.lang.String.format(r0, r3, r1)
            java.lang.String r1 = "format(locale, format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final boolean hasIntersection(java.lang.String[] r8, java.lang.String[] r9, java.util.Comparator<? super java.lang.String> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r8.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L11
            r0 = r1
            goto L12
        L11:
            r0 = r2
        L12:
            if (r0 != 0) goto L40
            if (r9 == 0) goto L40
            int r0 = r9.length
            if (r0 != 0) goto L1b
            r0 = r1
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 == 0) goto L1f
            goto L40
        L1f:
            int r0 = r8.length
            r3 = r2
        L21:
            if (r3 >= r0) goto L3f
            r4 = r8[r3]
            java.util.Iterator r5 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r9)
        L29:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3c
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r10.compare(r4, r6)
            if (r7 != 0) goto L29
            return r1
        L3c:
            int r3 = r3 + 1
            goto L21
        L3f:
            return r2
        L40:
            return r2
    }

    public static final long headersContentLength(okhttp3.Response r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.Headers r0 = r3.headers()
            java.lang.String r1 = "Content-Length"
            java.lang.String r0 = r0.get(r1)
            r1 = -1
            if (r0 == 0) goto L17
            long r1 = toLongOrDefault(r0, r1)
        L17:
            return r1
    }

    public static final void ignoreIoExceptions(kotlin.jvm.functions.Function0<kotlin.Unit> r2) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r2.invoke()     // Catch: java.io.IOException -> Lb
            goto Lc
        Lb:
            r1 = move-exception
        Lc:
            return
    }

    @java.lang.SafeVarargs
    public static final <T> java.util.List<T> immutableListOf(T... r2) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object r0 = r2.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.String r1 = "unmodifiableList(listOf(*elements.clone()))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final int indexOf(java.lang.String[] r7, java.lang.String r8, java.util.Comparator<java.lang.String> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r7
            r1 = 0
            r2 = 0
            int r3 = r0.length
        L13:
            if (r2 >= r3) goto L27
            r4 = r0[r2]
            r5 = 0
            int r6 = r9.compare(r4, r8)
            if (r6 != 0) goto L20
            r6 = 1
            goto L21
        L20:
            r6 = 0
        L21:
            if (r6 == 0) goto L24
            goto L28
        L24:
            int r2 = r2 + 1
            goto L13
        L27:
            r2 = -1
        L28:
            return r2
    }

    public static final int indexOfControlOrNonAscii(java.lang.String r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r1 = r4.length()
        La:
            if (r0 >= r1) goto L25
            char r2 = r4.charAt(r0)
            r3 = 31
            int r3 = kotlin.jvm.internal.Intrinsics.compare(r2, r3)
            if (r3 <= 0) goto L24
            r3 = 127(0x7f, float:1.78E-43)
            int r3 = kotlin.jvm.internal.Intrinsics.compare(r2, r3)
            if (r3 < 0) goto L21
            goto L24
        L21:
            int r0 = r0 + 1
            goto La
        L24:
            return r0
        L25:
            r0 = -1
            return r0
    }

    public static final int indexOfFirstNonAsciiWhitespace(java.lang.String r5, int r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r6
        L6:
            if (r0 >= r7) goto L3d
            char r1 = r5.charAt(r0)
            r2 = 9
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L14
        L12:
            r2 = r4
            goto L1a
        L14:
            r2 = 10
            if (r1 != r2) goto L19
            goto L12
        L19:
            r2 = r3
        L1a:
            if (r2 == 0) goto L1e
        L1c:
            r2 = r4
            goto L24
        L1e:
            r2 = 12
            if (r1 != r2) goto L23
            goto L1c
        L23:
            r2 = r3
        L24:
            if (r2 == 0) goto L28
        L26:
            r2 = r4
            goto L2e
        L28:
            r2 = 13
            if (r1 != r2) goto L2d
            goto L26
        L2d:
            r2 = r3
        L2e:
            if (r2 == 0) goto L32
        L30:
            r3 = r4
            goto L37
        L32:
            r2 = 32
            if (r1 != r2) goto L37
            goto L30
        L37:
            if (r3 != 0) goto L3a
            return r0
        L3a:
            int r0 = r0 + 1
            goto L6
        L3d:
            return r7
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            int r0 = indexOfFirstNonAsciiWhitespace(r0, r1, r2)
            return r0
    }

    public static final int indexOfLastNonAsciiWhitespace(java.lang.String r5, int r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r7 + (-1)
            if (r6 > r0) goto L42
        L9:
            char r1 = r5.charAt(r0)
            r2 = 9
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L15
        L13:
            r2 = r4
            goto L1b
        L15:
            r2 = 10
            if (r1 != r2) goto L1a
            goto L13
        L1a:
            r2 = r3
        L1b:
            if (r2 == 0) goto L1f
        L1d:
            r2 = r4
            goto L25
        L1f:
            r2 = 12
            if (r1 != r2) goto L24
            goto L1d
        L24:
            r2 = r3
        L25:
            if (r2 == 0) goto L29
        L27:
            r2 = r4
            goto L2f
        L29:
            r2 = 13
            if (r1 != r2) goto L2e
            goto L27
        L2e:
            r2 = r3
        L2f:
            if (r2 == 0) goto L33
        L31:
            r3 = r4
            goto L38
        L33:
            r2 = 32
            if (r1 != r2) goto L38
            goto L31
        L38:
            if (r3 != 0) goto L3d
            int r1 = r0 + 1
            return r1
        L3d:
            if (r0 == r6) goto L42
            int r0 = r0 + (-1)
            goto L9
        L42:
            return r6
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            int r0 = indexOfLastNonAsciiWhitespace(r0, r1, r2)
            return r0
    }

    public static final int indexOfNonWhitespace(java.lang.String r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r5
            int r1 = r4.length()
        La:
            if (r0 >= r1) goto L1c
            char r2 = r4.charAt(r0)
            r3 = 32
            if (r2 == r3) goto L19
            r3 = 9
            if (r2 == r3) goto L19
            return r0
        L19:
            int r0 = r0 + 1
            goto La
        L1c:
            int r0 = r4.length()
            return r0
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(java.lang.String r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            int r0 = indexOfNonWhitespace(r0, r1)
            return r0
    }

    public static final java.lang.String[] intersect(java.lang.String[] r9, java.lang.String[] r10, java.util.Comparator<? super java.lang.String> r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            int r1 = r9.length
            r2 = 0
            r3 = r2
        L19:
            if (r3 >= r1) goto L33
            r4 = r9[r3]
            int r5 = r10.length
            r6 = r2
        L1f:
            if (r6 >= r5) goto L30
            r7 = r10[r6]
            int r8 = r11.compare(r4, r7)
            if (r8 != 0) goto L2d
            r0.add(r4)
            goto L30
        L2d:
            int r6 = r6 + 1
            goto L1f
        L30:
            int r3 = r3 + 1
            goto L19
        L33:
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            r3 = 0
            r4 = r1
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r4.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            return r1
    }

    public static final boolean isCivilized(okhttp3.internal.p003io.FileSystem r5, java.io.File r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.Sink r0 = r5.sink(r6)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            okio.Sink r1 = (okio.Sink) r1     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            r3 = 0
            r5.delete(r6)     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L2b
            kotlin.p001io.CloseableKt.closeFinally(r0, r3)
            r0 = 1
            return r0
        L1f:
            r4 = move-exception
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2b
            kotlin.p001io.CloseableKt.closeFinally(r0, r3)
            r5.delete(r6)
            r0 = 0
            return r0
        L2b:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L2d
        L2d:
            r2 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r0, r1)
            throw r2
    }

    public static final boolean isHealthy(java.net.Socket r3, okio.BufferedSource r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 1
            int r1 = r3.getSoTimeout()     // Catch: java.io.IOException -> L24 java.net.SocketTimeoutException -> L28
            r3.setSoTimeout(r0)     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r4.exhausted()     // Catch: java.lang.Throwable -> L1f
            r2 = r2 ^ r0
            r3.setSoTimeout(r1)     // Catch: java.io.IOException -> L24 java.net.SocketTimeoutException -> L28
            r0 = r2
            goto L2a
        L1f:
            r2 = move-exception
            r3.setSoTimeout(r1)     // Catch: java.io.IOException -> L24 java.net.SocketTimeoutException -> L28
            throw r2     // Catch: java.io.IOException -> L24 java.net.SocketTimeoutException -> L28
        L24:
            r0 = move-exception
            r1 = 0
            r0 = r1
            goto L2a
        L28:
            r1 = move-exception
        L2a:
            return r0
    }

    public static final boolean isSensitiveHeader(java.lang.String r2) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "Authorization"
            r1 = 1
            boolean r0 = kotlin.text.StringsKt.equals(r2, r0, r1)
            if (r0 != 0) goto L29
            java.lang.String r0 = "Cookie"
            boolean r0 = kotlin.text.StringsKt.equals(r2, r0, r1)
            if (r0 != 0) goto L29
            java.lang.String r0 = "Proxy-Authorization"
            boolean r0 = kotlin.text.StringsKt.equals(r2, r0, r1)
            if (r0 != 0) goto L29
            java.lang.String r0 = "Set-Cookie"
            boolean r0 = kotlin.text.StringsKt.equals(r2, r0, r1)
            if (r0 == 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
        L2a:
            return r1
    }

    public static final void notify(java.lang.Object r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            r1.notify()
            return
    }

    public static final void notifyAll(java.lang.Object r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            r1.notifyAll()
            return
    }

    public static final int parseHexDigit(char r3) {
            r0 = 48
            r1 = 1
            r2 = 0
            if (r0 > r3) goto Ld
            r0 = 58
            if (r3 >= r0) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L13
            int r0 = r3 + (-48)
            goto L37
        L13:
            r0 = 97
            if (r0 > r3) goto L1d
            r0 = 103(0x67, float:1.44E-43)
            if (r3 >= r0) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = r2
        L1e:
            if (r0 == 0) goto L25
            int r0 = r3 + (-97)
            int r0 = r0 + 10
            goto L37
        L25:
            r0 = 65
            if (r0 > r3) goto L2e
            r0 = 71
            if (r3 >= r0) goto L2e
            goto L2f
        L2e:
            r1 = r2
        L2f:
            if (r1 == 0) goto L36
            int r0 = r3 + (-65)
            int r0 = r0 + 10
            goto L37
        L36:
            r0 = -1
        L37:
            return r0
    }

    public static final java.lang.String peerName(java.net.Socket r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.net.SocketAddress r0 = r3.getRemoteSocketAddress()
            boolean r1 = r0 instanceof java.net.InetSocketAddress
            if (r1 == 0) goto L1a
            r1 = r0
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            java.lang.String r1 = r1.getHostName()
            java.lang.String r2 = "address.hostName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            goto L1e
        L1a:
            java.lang.String r1 = r0.toString()
        L1e:
            return r1
    }

    public static final java.nio.charset.Charset readBomAsCharset(okio.BufferedSource r2, java.nio.charset.Charset r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "default"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.Options r0 = okhttp3.internal.Util.UNICODE_BOMS
            int r0 = r2.select(r0)
            switch(r0) {
                case -1: goto L3f;
                case 0: goto L37;
                case 1: goto L2f;
                case 2: goto L27;
                case 3: goto L20;
                case 4: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L19:
            kotlin.text.Charsets r0 = kotlin.text.Charsets.INSTANCE
            java.nio.charset.Charset r0 = r0.UTF32_LE()
            goto L40
        L20:
            kotlin.text.Charsets r0 = kotlin.text.Charsets.INSTANCE
            java.nio.charset.Charset r0 = r0.UTF32_BE()
            goto L40
        L27:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            java.lang.String r1 = "UTF_16LE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L40
        L2f:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            java.lang.String r1 = "UTF_16BE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L40
        L37:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = "UTF_8"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L40
        L3f:
            r0 = r3
        L40:
            return r0
    }

    public static final <T> T readFieldOrNull(java.lang.Object r5, java.lang.Class<T> r6, java.lang.String r7) {
            java.lang.String r0 = "instance"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "fieldType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "fieldName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Class r0 = r5.getClass()
        L13:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r2 = 0
            if (r1 != 0) goto L41
        L1d:
            java.lang.reflect.Field r1 = r0.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L35
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L35
            java.lang.Object r3 = r1.get(r5)     // Catch: java.lang.NoSuchFieldException -> L35
            boolean r4 = r6.isInstance(r3)     // Catch: java.lang.NoSuchFieldException -> L35
            if (r4 != 0) goto L30
            goto L34
        L30:
            java.lang.Object r2 = r6.cast(r3)     // Catch: java.lang.NoSuchFieldException -> L35
        L34:
            return r2
        L35:
            r1 = move-exception
            java.lang.Class r1 = r0.getSuperclass()
            java.lang.String r2 = "c.superclass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0 = r1
            goto L13
        L41:
            java.lang.String r1 = "delegate"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r1)
            if (r3 != 0) goto L56
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Object r1 = readFieldOrNull(r5, r3, r1)
            if (r1 == 0) goto L56
            java.lang.Object r2 = readFieldOrNull(r1, r6, r7)
            return r2
        L56:
            return r2
    }

    public static final int readMedium(okio.BufferedSource r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte r0 = r3.readByte()
            r1 = 255(0xff, float:3.57E-43)
            int r0 = and(r0, r1)
            int r0 = r0 << 16
            byte r2 = r3.readByte()
            int r2 = and(r2, r1)
            int r2 = r2 << 8
            r0 = r0 | r2
            byte r2 = r3.readByte()
            int r1 = and(r2, r1)
            r0 = r0 | r1
            return r0
    }

    public static final int skipAll(okio.Buffer r3, byte r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
        L6:
            boolean r1 = r3.exhausted()
            if (r1 != 0) goto L1a
            r1 = 0
            byte r1 = r3.getByte(r1)
            if (r1 != r4) goto L1a
            int r0 = r0 + 1
            r3.readByte()
            goto L6
        L1a:
            return r0
    }

    public static final boolean skipAll(okio.Source r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            long r0 = java.lang.System.nanoTime()
            okio.Timeout r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            okio.Timeout r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            okio.Timeout r2 = r11.timeout()
            long r7 = (long) r12
            long r7 = r13.toNanos(r7)
            long r7 = java.lang.Math.min(r5, r7)
            long r7 = r7 + r0
            r2.deadlineNanoTime(r7)
            okio.Buffer r2 = new okio.Buffer     // Catch: java.lang.Throwable -> L68 java.io.InterruptedIOException -> L7f
            r2.<init>()     // Catch: java.lang.Throwable -> L68 java.io.InterruptedIOException -> L7f
        L40:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r2, r7)     // Catch: java.lang.Throwable -> L68 java.io.InterruptedIOException -> L7f
            r9 = -1
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L50
            r2.clear()     // Catch: java.lang.Throwable -> L68 java.io.InterruptedIOException -> L7f
            goto L40
        L50:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L5d
            okio.Timeout r2 = r11.timeout()
            r2.clearDeadline()
            goto L66
        L5d:
            okio.Timeout r2 = r11.timeout()
            long r3 = r0 + r5
            r2.deadlineNanoTime(r3)
        L66:
            r2 = 1
            goto L97
        L68:
            r2 = move-exception
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L75
            okio.Timeout r3 = r11.timeout()
            r3.clearDeadline()
            goto L7e
        L75:
            okio.Timeout r3 = r11.timeout()
            long r7 = r0 + r5
            r3.deadlineNanoTime(r7)
        L7e:
            throw r2
        L7f:
            r2 = move-exception
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L8d
            okio.Timeout r2 = r11.timeout()
            r2.clearDeadline()
            goto L96
        L8d:
            okio.Timeout r2 = r11.timeout()
            long r3 = r0 + r5
            r2.deadlineNanoTime(r3)
        L96:
            r2 = 0
        L97:
            return r2
    }

    public static final java.util.concurrent.ThreadFactory threadFactory(java.lang.String r1, boolean r2) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okhttp3.internal.Util$$ExternalSyntheticLambda1 r0 = new okhttp3.internal.Util$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }

    private static final java.lang.Thread threadFactory$lambda$1(java.lang.String r3, boolean r4, java.lang.Runnable r5) {
            java.lang.String r0 = "$name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r5, r3)
            r1 = r0
            r2 = 0
            r1.setDaemon(r4)
            return r0
    }

    public static final void threadName(java.lang.String r5, kotlin.jvm.functions.Function0<kotlin.Unit> r6) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r2 = r1.getName()
            r1.setName(r5)
            r3 = 1
            r6.invoke()     // Catch: java.lang.Throwable -> L26
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r1.setName(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return
        L26:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r1.setName(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r4
    }

    public static final java.util.List<okhttp3.internal.http2.Header> toHeaderList(okhttp3.Headers r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            int r1 = r12.size()
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
        L24:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L44
            r6 = r5
            kotlin.collections.IntIterator r6 = (kotlin.collections.IntIterator) r6
            int r6 = r6.nextInt()
            r7 = r6
            r8 = 0
            okhttp3.internal.http2.Header r9 = new okhttp3.internal.http2.Header
            java.lang.String r10 = r12.name(r7)
            java.lang.String r11 = r12.value(r7)
            r9.<init>(r10, r11)
            r2.add(r9)
            goto L24
        L44:
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public static final okhttp3.Headers toHeaders(java.util.List<okhttp3.internal.http2.Header> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            okhttp3.internal.http2.Header r2 = (okhttp3.internal.http2.Header) r2
            okio.ByteString r3 = r2.component1()
            okio.ByteString r2 = r2.component2()
            java.lang.String r4 = r3.utf8()
            java.lang.String r5 = r2.utf8()
            r0.addLenient$okhttp(r4, r5)
            goto Le
        L2e:
            okhttp3.Headers r1 = r0.build()
            return r1
    }

    public static final java.lang.String toHexString(int r2) {
            java.lang.String r0 = java.lang.Integer.toHexString(r2)
            java.lang.String r1 = "toHexString(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final java.lang.String toHexString(long r2) {
            java.lang.String r0 = java.lang.Long.toHexString(r2)
            java.lang.String r1 = "toHexString(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final java.lang.String toHostHeader(okhttp3.HttpUrl r5, boolean r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = r5.host()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = ":"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 2
            r3 = 0
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r4, r2, r3)
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r5.host()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L3a
        L36:
            java.lang.String r0 = r5.host()
        L3a:
            if (r6 != 0) goto L50
            int r1 = r5.port()
            okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
            java.lang.String r3 = r5.scheme()
            int r2 = r2.defaultPort(r3)
            if (r1 == r2) goto L4e
            goto L50
        L4e:
            r1 = r0
            goto L6b
        L50:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            r2 = 58
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r5.port()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L6b:
            return r1
    }

    public static /* synthetic */ java.lang.String toHostHeader$default(okhttp3.HttpUrl r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r0 = toHostHeader(r0, r1)
            return r0
    }

    public static final <T> java.util.List<T> toImmutableList(java.util.List<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.String r1 = "unmodifiableList(toMutableList())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final <K, V> java.util.Map<K, V> toImmutableMap(java.util.Map<K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L10
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            goto L20
        L10:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r2)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            java.lang.String r1 = "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L20:
            return r0
    }

    public static final long toLongOrDefault(java.lang.String r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            r0 = r3
        Ld:
            return r0
    }

    public static final int toNonNegativeInt(java.lang.String r4, int r5) {
            if (r4 == 0) goto L1f
            long r0 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L1d
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L13
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L1c
        L13:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1b
            r2 = 0
            goto L1c
        L1b:
            int r2 = (int) r0
        L1c:
            return r2
        L1d:
            r0 = move-exception
            return r5
        L1f:
            return r5
    }

    public static final java.lang.String trimSubstring(java.lang.String r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = indexOfFirstNonAsciiWhitespace(r4, r5, r6)
            int r1 = indexOfLastNonAsciiWhitespace(r4, r0, r6)
            java.lang.String r2 = r4.substring(r0, r1)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public static /* synthetic */ java.lang.String trimSubstring$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            java.lang.String r0 = trimSubstring(r0, r1, r2)
            return r0
    }

    public static final void wait(java.lang.Object r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            r1.wait()
            return
    }

    public static final java.lang.Throwable withSuppressed(java.lang.Exception r6, java.util.List<? extends java.lang.Exception> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "suppressed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            r1 = 0
            java.util.Iterator r2 = r7.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.next()
            java.lang.Exception r3 = (java.lang.Exception) r3
            r4 = r0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r5 = r3
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            kotlin.ExceptionsKt.addSuppressed(r4, r5)
            goto L10
        L26:
            r0 = r6
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    public static final void writeMedium(okio.BufferedSink r1, int r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r2 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.writeByte(r0)
            int r0 = r2 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.writeByte(r0)
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1.writeByte(r0)
            return
    }
}
