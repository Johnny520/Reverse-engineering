package okhttp3;

/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, m115d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class CacheControl {
    public static final okhttp3.CacheControl.Companion Companion = null;
    public static final okhttp3.CacheControl FORCE_CACHE = null;
    public static final okhttp3.CacheControl FORCE_NETWORK = null;
    private java.lang.String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    /* JADX INFO: compiled from: CacheControl.kt */
    @kotlin.Metadata(m114d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m115d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds;
        private int maxStaleSeconds;
        private int minFreshSeconds;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.maxAgeSeconds = r0
                r1.maxStaleSeconds = r0
                r1.minFreshSeconds = r0
                return
        }

        private final int clampToInt(long r3) {
                r2 = this;
                r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 <= 0) goto Lc
                r0 = 2147483647(0x7fffffff, float:NaN)
                goto Ld
            Lc:
                int r0 = (int) r3
            Ld:
                return r0
        }

        public final okhttp3.CacheControl build() {
                r17 = this;
                r0 = r17
                okhttp3.CacheControl r16 = new okhttp3.CacheControl
                boolean r2 = r0.noCache
                boolean r3 = r0.noStore
                int r4 = r0.maxAgeSeconds
                int r9 = r0.maxStaleSeconds
                int r10 = r0.minFreshSeconds
                boolean r11 = r0.onlyIfCached
                boolean r12 = r0.noTransform
                boolean r13 = r0.immutable
                r5 = -1
                r6 = 0
                r7 = 0
                r8 = 0
                r14 = 0
                r15 = 0
                r1 = r16
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r16
        }

        public final okhttp3.CacheControl.Builder immutable() {
                r3 = this;
                r0 = r3
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r1 = 0
                r2 = 1
                r0.immutable = r2
                r0 = r3
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                return r0
        }

        public final okhttp3.CacheControl.Builder maxAge(int r6, java.util.concurrent.TimeUnit r7) {
                r5 = this;
                java.lang.String r0 = "timeUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r0 = r5
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r1 = 0
                if (r6 < 0) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = 0
            Le:
                if (r2 == 0) goto L20
                long r2 = (long) r6
                long r2 = r7.toSeconds(r2)
                int r4 = r0.clampToInt(r2)
                r0.maxAgeSeconds = r4
                r0 = r5
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                return r0
            L20:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "maxAge < 0: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        public final okhttp3.CacheControl.Builder maxStale(int r6, java.util.concurrent.TimeUnit r7) {
                r5 = this;
                java.lang.String r0 = "timeUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r0 = r5
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r1 = 0
                if (r6 < 0) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = 0
            Le:
                if (r2 == 0) goto L20
                long r2 = (long) r6
                long r2 = r7.toSeconds(r2)
                int r4 = r0.clampToInt(r2)
                r0.maxStaleSeconds = r4
                r0 = r5
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                return r0
            L20:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "maxStale < 0: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        public final okhttp3.CacheControl.Builder minFresh(int r6, java.util.concurrent.TimeUnit r7) {
                r5 = this;
                java.lang.String r0 = "timeUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r0 = r5
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r1 = 0
                if (r6 < 0) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = 0
            Le:
                if (r2 == 0) goto L20
                long r2 = (long) r6
                long r2 = r7.toSeconds(r2)
                int r4 = r0.clampToInt(r2)
                r0.minFreshSeconds = r4
                r0 = r5
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                return r0
            L20:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "minFresh < 0: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        public final okhttp3.CacheControl.Builder noCache() {
                r3 = this;
                r0 = r3
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r1 = 0
                r2 = 1
                r0.noCache = r2
                r0 = r3
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                return r0
        }

        public final okhttp3.CacheControl.Builder noStore() {
                r3 = this;
                r0 = r3
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r1 = 0
                r2 = 1
                r0.noStore = r2
                r0 = r3
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                return r0
        }

        public final okhttp3.CacheControl.Builder noTransform() {
                r3 = this;
                r0 = r3
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r1 = 0
                r2 = 1
                r0.noTransform = r2
                r0 = r3
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                return r0
        }

        public final okhttp3.CacheControl.Builder onlyIfCached() {
                r3 = this;
                r0 = r3
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r1 = 0
                r2 = 1
                r0.onlyIfCached = r2
                r0 = r3
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: CacheControl.kt */
    @kotlin.Metadata(m114d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m115d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        private final int indexOfElement(java.lang.String r8, java.lang.String r9, int r10) {
                r7 = this;
                r0 = r10
                int r1 = r8.length()
            L5:
                if (r0 >= r1) goto L1b
                r2 = r9
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                char r3 = r8.charAt(r0)
                r4 = 2
                r5 = 0
                r6 = 0
                boolean r2 = kotlin.text.StringsKt.contains$default(r2, r3, r6, r4, r5)
                if (r2 == 0) goto L18
                return r0
            L18:
                int r0 = r0 + 1
                goto L5
            L1b:
                int r0 = r8.length()
                return r0
        }

        static /* synthetic */ int indexOfElement$default(okhttp3.CacheControl.Companion r0, java.lang.String r1, java.lang.String r2, int r3, int r4, java.lang.Object r5) {
                r4 = r4 & 2
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                int r0 = r0.indexOfElement(r1, r2, r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.CacheControl parse(okhttp3.Headers r37) {
                r36 = this;
                r0 = r36
                r1 = r37
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                r2 = 0
                r3 = 0
                r4 = -1
                r5 = -1
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = -1
                r10 = -1
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 1
                r15 = 0
                r16 = 0
                r17 = r2
                int r2 = r37.size()
                r35 = r16
                r16 = r13
                r13 = r35
            L25:
                if (r13 >= r2) goto L20d
                r18 = r2
                java.lang.String r2 = r1.name(r13)
                r33 = r12
                java.lang.String r12 = r1.value(r13)
                java.lang.String r1 = "Cache-Control"
                r34 = r11
                r11 = 1
                boolean r1 = kotlin.text.StringsKt.equals(r2, r1, r11)
                if (r1 == 0) goto L45
                if (r15 == 0) goto L43
                r14 = 0
                goto L4e
            L43:
                r15 = r12
                goto L4e
            L45:
                java.lang.String r1 = "Pragma"
                boolean r1 = kotlin.text.StringsKt.equals(r2, r1, r11)
                if (r1 == 0) goto L1ff
                r14 = 0
            L4e:
                r1 = 0
            L4f:
                int r11 = r12.length()
                if (r1 >= r11) goto L1f2
                r11 = r1
                r20 = r2
                java.lang.String r2 = "=,;"
                int r1 = r0.indexOfElement(r12, r2, r1)
                java.lang.String r2 = r12.substring(r11, r1)
                r21 = r3
                java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.CharSequence r2 = kotlin.text.StringsKt.trim(r2)
                java.lang.String r2 = r2.toString()
                r22 = 0
                r23 = r4
                int r4 = r12.length()
                if (r1 == r4) goto Ldd
                char r4 = r12.charAt(r1)
                r24 = r5
                r5 = 44
                if (r4 == r5) goto Ldf
                char r4 = r12.charAt(r1)
                r5 = 59
                if (r4 != r5) goto L90
                goto Ldf
            L90:
                int r1 = r1 + 1
                int r1 = okhttp3.internal.Util.indexOfNonWhitespace(r12, r1)
                int r4 = r12.length()
                if (r1 >= r4) goto Lc4
                char r4 = r12.charAt(r1)
                r5 = 34
                if (r4 != r5) goto Lc4
                int r1 = r1 + 1
                r4 = r1
                r25 = r12
                java.lang.CharSequence r25 = (java.lang.CharSequence) r25
                r29 = 4
                r30 = 0
                r26 = 34
                r28 = 0
                r27 = r1
                int r1 = kotlin.text.StringsKt.indexOf$default(r25, r26, r27, r28, r29, r30)
                java.lang.String r5 = r12.substring(r4, r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
                r3 = r5
                r4 = 1
                int r1 = r1 + r4
                goto Le2
            Lc4:
                r4 = r1
                java.lang.String r5 = ",;"
                int r1 = r0.indexOfElement(r12, r5, r1)
                java.lang.String r5 = r12.substring(r4, r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r5)
                java.lang.String r3 = r3.toString()
                goto Le2
            Ldd:
                r24 = r5
            Ldf:
                int r1 = r1 + 1
                r3 = 0
            Le2:
                java.lang.String r4 = "no-cache"
                r5 = 1
                boolean r4 = kotlin.text.StringsKt.equals(r4, r2, r5)
                if (r4 == 0) goto Lf9
                r17 = 1
                r11 = r5
                r2 = r20
                r3 = r21
                r4 = r23
                r5 = r24
                goto L4f
            Lf9:
                java.lang.String r4 = "no-store"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r2, r5)
                if (r4 == 0) goto L10c
                r4 = 1
                r3 = r4
                r11 = r5
                r2 = r20
                r4 = r23
                r5 = r24
                goto L4f
            L10c:
                java.lang.String r4 = "max-age"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r2, r5)
                r5 = -1
                if (r4 == 0) goto L122
                int r4 = okhttp3.internal.Util.toNonNegativeInt(r3, r5)
                r2 = r20
                r3 = r21
                r5 = r24
                r11 = 1
                goto L4f
            L122:
                java.lang.String r4 = "s-maxage"
                r5 = 1
                boolean r4 = kotlin.text.StringsKt.equals(r4, r2, r5)
                if (r4 == 0) goto L13a
                r4 = -1
                int r4 = okhttp3.internal.Util.toNonNegativeInt(r3, r4)
                r11 = r5
                r2 = r20
                r3 = r21
                r5 = r4
                r4 = r23
                goto L4f
            L13a:
                java.lang.String r4 = "private"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r2, r5)
                if (r4 == 0) goto L14e
                r6 = 1
                r11 = r5
                r2 = r20
                r3 = r21
                r4 = r23
                r5 = r24
                goto L4f
            L14e:
                java.lang.String r4 = "public"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r2, r5)
                if (r4 == 0) goto L162
                r7 = 1
                r11 = r5
                r2 = r20
                r3 = r21
                r4 = r23
                r5 = r24
                goto L4f
            L162:
                java.lang.String r4 = "must-revalidate"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r2, r5)
                if (r4 == 0) goto L176
                r8 = 1
                r11 = r5
                r2 = r20
                r3 = r21
                r4 = r23
                r5 = r24
                goto L4f
            L176:
                java.lang.String r4 = "max-stale"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r2, r5)
                if (r4 == 0) goto L190
                r4 = 2147483647(0x7fffffff, float:NaN)
                int r9 = okhttp3.internal.Util.toNonNegativeInt(r3, r4)
                r11 = r5
                r2 = r20
                r3 = r21
                r4 = r23
                r5 = r24
                goto L4f
            L190:
                java.lang.String r4 = "min-fresh"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r2, r5)
                if (r4 == 0) goto L1a8
                r4 = -1
                int r10 = okhttp3.internal.Util.toNonNegativeInt(r3, r4)
                r11 = r5
                r2 = r20
                r3 = r21
                r4 = r23
                r5 = r24
                goto L4f
            L1a8:
                java.lang.String r4 = "only-if-cached"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r2, r5)
                if (r4 == 0) goto L1bd
                r34 = 1
                r11 = r5
                r2 = r20
                r3 = r21
                r4 = r23
                r5 = r24
                goto L4f
            L1bd:
                java.lang.String r4 = "no-transform"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r2, r5)
                if (r4 == 0) goto L1d2
                r33 = 1
                r11 = r5
                r2 = r20
                r3 = r21
                r4 = r23
                r5 = r24
                goto L4f
            L1d2:
                java.lang.String r4 = "immutable"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r2, r5)
                if (r4 == 0) goto L1e7
                r16 = 1
                r11 = r5
                r2 = r20
                r3 = r21
                r4 = r23
                r5 = r24
                goto L4f
            L1e7:
                r11 = r5
                r2 = r20
                r3 = r21
                r4 = r23
                r5 = r24
                goto L4f
            L1f2:
                r20 = r2
                r21 = r3
                r23 = r4
                r24 = r5
                r12 = r33
                r11 = r34
                goto L205
            L1ff:
                r20 = r2
                r12 = r33
                r11 = r34
            L205:
                int r13 = r13 + 1
                r1 = r37
                r2 = r18
                goto L25
            L20d:
                r34 = r11
                r33 = r12
                if (r14 != 0) goto L214
                r15 = 0
            L214:
                okhttp3.CacheControl r1 = new okhttp3.CacheControl
                r32 = 0
                r18 = r1
                r19 = r17
                r20 = r3
                r21 = r4
                r22 = r5
                r23 = r6
                r24 = r7
                r25 = r8
                r26 = r9
                r27 = r10
                r28 = r34
                r29 = r33
                r30 = r16
                r31 = r15
                r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
                return r1
        }
    }

    static {
            okhttp3.CacheControl$Companion r0 = new okhttp3.CacheControl$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.CacheControl.Companion = r0
            okhttp3.CacheControl$Builder r0 = new okhttp3.CacheControl$Builder
            r0.<init>()
            okhttp3.CacheControl$Builder r0 = r0.noCache()
            okhttp3.CacheControl r0 = r0.build()
            okhttp3.CacheControl.FORCE_NETWORK = r0
            okhttp3.CacheControl$Builder r0 = new okhttp3.CacheControl$Builder
            r0.<init>()
            okhttp3.CacheControl$Builder r0 = r0.onlyIfCached()
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.CacheControl$Builder r0 = r0.maxStale(r1, r2)
            okhttp3.CacheControl r0 = r0.build()
            okhttp3.CacheControl.FORCE_CACHE = r0
            return
    }

    private CacheControl(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, java.lang.String r13) {
            r0 = this;
            r0.<init>()
            r0.noCache = r1
            r0.noStore = r2
            r0.maxAgeSeconds = r3
            r0.sMaxAgeSeconds = r4
            r0.isPrivate = r5
            r0.isPublic = r6
            r0.mustRevalidate = r7
            r0.maxStaleSeconds = r8
            r0.minFreshSeconds = r9
            r0.onlyIfCached = r10
            r0.noTransform = r11
            r0.immutable = r12
            r0.headerValue = r13
            return
    }

    public /* synthetic */ CacheControl(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, java.lang.String r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.CacheControl parse(okhttp3.Headers r1) {
            okhttp3.CacheControl$Companion r0 = okhttp3.CacheControl.Companion
            okhttp3.CacheControl r0 = r0.parse(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "immutable", imports = {}))
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m10245deprecated_immutable() {
            r1 = this;
            boolean r0 = r1.immutable
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m10246deprecated_maxAgeSeconds() {
            r1 = this;
            int r0 = r1.maxAgeSeconds
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m10247deprecated_maxStaleSeconds() {
            r1 = this;
            int r0 = r1.maxStaleSeconds
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "minFreshSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m10248deprecated_minFreshSeconds() {
            r1 = this;
            int r0 = r1.minFreshSeconds
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "mustRevalidate", imports = {}))
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m10249deprecated_mustRevalidate() {
            r1 = this;
            boolean r0 = r1.mustRevalidate
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noCache", imports = {}))
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m10250deprecated_noCache() {
            r1 = this;
            boolean r0 = r1.noCache
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noStore", imports = {}))
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m10251deprecated_noStore() {
            r1 = this;
            boolean r0 = r1.noStore
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noTransform", imports = {}))
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m10252deprecated_noTransform() {
            r1 = this;
            boolean r0 = r1.noTransform
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "onlyIfCached", imports = {}))
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m10253deprecated_onlyIfCached() {
            r1 = this;
            boolean r0 = r1.onlyIfCached
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m10254deprecated_sMaxAgeSeconds() {
            r1 = this;
            int r0 = r1.sMaxAgeSeconds
            return r0
    }

    public final boolean immutable() {
            r1 = this;
            boolean r0 = r1.immutable
            return r0
    }

    public final boolean isPrivate() {
            r1 = this;
            boolean r0 = r1.isPrivate
            return r0
    }

    public final boolean isPublic() {
            r1 = this;
            boolean r0 = r1.isPublic
            return r0
    }

    public final int maxAgeSeconds() {
            r1 = this;
            int r0 = r1.maxAgeSeconds
            return r0
    }

    public final int maxStaleSeconds() {
            r1 = this;
            int r0 = r1.maxStaleSeconds
            return r0
    }

    public final int minFreshSeconds() {
            r1 = this;
            int r0 = r1.minFreshSeconds
            return r0
    }

    public final boolean mustRevalidate() {
            r1 = this;
            boolean r0 = r1.mustRevalidate
            return r0
    }

    public final boolean noCache() {
            r1 = this;
            boolean r0 = r1.noCache
            return r0
    }

    public final boolean noStore() {
            r1 = this;
            boolean r0 = r1.noStore
            return r0
    }

    public final boolean noTransform() {
            r1 = this;
            boolean r0 = r1.noTransform
            return r0
    }

    public final boolean onlyIfCached() {
            r1 = this;
            boolean r0 = r1.onlyIfCached
            return r0
    }

    public final int sMaxAgeSeconds() {
            r1 = this;
            int r0 = r1.sMaxAgeSeconds
            return r0
    }

    public java.lang.String toString() {
            r8 = this;
            java.lang.String r0 = r8.headerValue
            if (r0 != 0) goto Lcd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r1
            r3 = 0
            boolean r4 = r8.noCache
            if (r4 == 0) goto L14
            java.lang.String r4 = "no-cache, "
            r2.append(r4)
        L14:
            boolean r4 = r8.noStore
            if (r4 == 0) goto L1d
            java.lang.String r4 = "no-store, "
            r2.append(r4)
        L1d:
            int r4 = r8.maxAgeSeconds
            java.lang.String r5 = ", "
            r6 = -1
            if (r4 == r6) goto L33
            java.lang.String r4 = "max-age="
            java.lang.StringBuilder r4 = r2.append(r4)
            int r7 = r8.maxAgeSeconds
            java.lang.StringBuilder r4 = r4.append(r7)
            r4.append(r5)
        L33:
            int r4 = r8.sMaxAgeSeconds
            if (r4 == r6) goto L46
            java.lang.String r4 = "s-maxage="
            java.lang.StringBuilder r4 = r2.append(r4)
            int r7 = r8.sMaxAgeSeconds
            java.lang.StringBuilder r4 = r4.append(r7)
            r4.append(r5)
        L46:
            boolean r4 = r8.isPrivate
            if (r4 == 0) goto L4f
            java.lang.String r4 = "private, "
            r2.append(r4)
        L4f:
            boolean r4 = r8.isPublic
            if (r4 == 0) goto L58
            java.lang.String r4 = "public, "
            r2.append(r4)
        L58:
            boolean r4 = r8.mustRevalidate
            if (r4 == 0) goto L61
            java.lang.String r4 = "must-revalidate, "
            r2.append(r4)
        L61:
            int r4 = r8.maxStaleSeconds
            if (r4 == r6) goto L74
            java.lang.String r4 = "max-stale="
            java.lang.StringBuilder r4 = r2.append(r4)
            int r7 = r8.maxStaleSeconds
            java.lang.StringBuilder r4 = r4.append(r7)
            r4.append(r5)
        L74:
            int r4 = r8.minFreshSeconds
            if (r4 == r6) goto L87
            java.lang.String r4 = "min-fresh="
            java.lang.StringBuilder r4 = r2.append(r4)
            int r6 = r8.minFreshSeconds
            java.lang.StringBuilder r4 = r4.append(r6)
            r4.append(r5)
        L87:
            boolean r4 = r8.onlyIfCached
            if (r4 == 0) goto L90
            java.lang.String r4 = "only-if-cached, "
            r2.append(r4)
        L90:
            boolean r4 = r8.noTransform
            if (r4 == 0) goto L99
            java.lang.String r4 = "no-transform, "
            r2.append(r4)
        L99:
            boolean r4 = r8.immutable
            if (r4 == 0) goto La2
            java.lang.String r4 = "immutable, "
            r2.append(r4)
        La2:
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 != 0) goto Lad
            r4 = 1
            goto Lae
        Lad:
            r4 = 0
        Lae:
            if (r4 == 0) goto Lb3
            java.lang.String r1 = ""
            return r1
        Lb3:
            int r4 = r2.length()
            int r4 = r4 + (-2)
            int r5 = r2.length()
            r2.delete(r4, r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0 = r1
            r8.headerValue = r0
        Lcd:
            return r0
    }
}
