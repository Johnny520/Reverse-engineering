package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
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

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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
                if (r0 <= 0) goto Lb
                r3 = 2147483647(0x7fffffff, float:NaN)
                return r3
            Lb:
                int r3 = (int) r3
                return r3
        }

        public final okhttp3.CacheControl build() {
                r15 = this;
                okhttp3.CacheControl r0 = new okhttp3.CacheControl
                boolean r1 = r15.noCache
                boolean r2 = r15.noStore
                int r3 = r15.maxAgeSeconds
                int r8 = r15.maxStaleSeconds
                int r9 = r15.minFreshSeconds
                boolean r10 = r15.onlyIfCached
                boolean r11 = r15.noTransform
                boolean r12 = r15.immutable
                r13 = 0
                r14 = 0
                r4 = -1
                r5 = 0
                r6 = 0
                r7 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return r0
        }

        public final okhttp3.CacheControl.Builder immutable() {
                r1 = this;
                r0 = 1
                r1.immutable = r0
                return r1
        }

        public final okhttp3.CacheControl.Builder maxAge(int r3, java.util.concurrent.TimeUnit r4) {
                r2 = this;
                r4.getClass()
                if (r3 < 0) goto L11
                long r0 = (long) r3
                long r3 = r4.toSeconds(r0)
                int r3 = r2.clampToInt(r3)
                r2.maxAgeSeconds = r3
                return r2
            L11:
                java.lang.String r4 = "maxAge < 0: "
                java.lang.String r3 = eh.a.l(r3, r4)
                j8.o.q(r3)
                r3 = 0
                return r3
        }

        public final okhttp3.CacheControl.Builder maxStale(int r3, java.util.concurrent.TimeUnit r4) {
                r2 = this;
                r4.getClass()
                if (r3 < 0) goto L11
                long r0 = (long) r3
                long r3 = r4.toSeconds(r0)
                int r3 = r2.clampToInt(r3)
                r2.maxStaleSeconds = r3
                return r2
            L11:
                java.lang.String r4 = "maxStale < 0: "
                java.lang.String r3 = eh.a.l(r3, r4)
                j8.o.q(r3)
                r3 = 0
                return r3
        }

        public final okhttp3.CacheControl.Builder minFresh(int r3, java.util.concurrent.TimeUnit r4) {
                r2 = this;
                r4.getClass()
                if (r3 < 0) goto L11
                long r0 = (long) r3
                long r3 = r4.toSeconds(r0)
                int r3 = r2.clampToInt(r3)
                r2.minFreshSeconds = r3
                return r2
            L11:
                java.lang.String r4 = "minFresh < 0: "
                java.lang.String r3 = eh.a.l(r3, r4)
                j8.o.q(r3)
                r3 = 0
                return r3
        }

        public final okhttp3.CacheControl.Builder noCache() {
                r1 = this;
                r0 = 1
                r1.noCache = r0
                return r1
        }

        public final okhttp3.CacheControl.Builder noStore() {
                r1 = this;
                r0 = 1
                r1.noStore = r0
                return r1
        }

        public final okhttp3.CacheControl.Builder noTransform() {
                r1 = this;
                r0 = 1
                r1.noTransform = r0
                return r1
        }

        public final okhttp3.CacheControl.Builder onlyIfCached() {
                r1 = this;
                r0 = 1
                r1.onlyIfCached = r0
                return r1
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private final int indexOfElement(java.lang.String r3, java.lang.String r4, int r5) {
                r2 = this;
                int r0 = r3.length()
            L4:
                if (r5 >= r0) goto L14
                char r1 = r3.charAt(r5)
                boolean r1 = og.m.i0(r4, r1)
                if (r1 == 0) goto L11
                return r5
            L11:
                int r5 = r5 + 1
                goto L4
            L14:
                int r3 = r3.length()
                return r3
        }

        public static /* synthetic */ int indexOfElement$default(okhttp3.CacheControl.Companion r0, java.lang.String r1, java.lang.String r2, int r3, int r4, java.lang.Object r5) {
                r4 = r4 & 2
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                int r0 = r0.indexOfElement(r1, r2, r3)
                return r0
        }

        public final okhttp3.CacheControl parse(okhttp3.Headers r25) {
                r24 = this;
                r0 = r24
                r1 = r25
                r1.getClass()
                int r2 = r1.size()
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L20:
                if (r7 >= r2) goto L169
                java.lang.String r3 = r1.name(r7)
                r23 = 1
                java.lang.String r5 = r1.value(r7)
                java.lang.String r6 = "Cache-Control"
                boolean r6 = og.t.X(r3, r6)
                if (r6 == 0) goto L3a
                if (r9 == 0) goto L38
            L36:
                r8 = 0
                goto L43
            L38:
                r9 = r5
                goto L43
            L3a:
                java.lang.String r6 = "Pragma"
                boolean r3 = og.t.X(r3, r6)
                if (r3 == 0) goto L162
                goto L36
            L43:
                r3 = 0
            L44:
                int r6 = r5.length()
                if (r3 >= r6) goto L162
                java.lang.String r6 = "=,;"
                int r6 = r0.indexOfElement(r5, r6, r3)
                java.lang.String r3 = r5.substring(r3, r6)
                java.lang.CharSequence r3 = og.m.R0(r3)
                java.lang.String r3 = r3.toString()
                int r4 = r5.length()
                if (r6 == r4) goto La8
                char r4 = r5.charAt(r6)
                r1 = 44
                if (r4 == r1) goto La8
                char r1 = r5.charAt(r6)
                r4 = 59
                if (r1 != r4) goto L73
                goto La8
            L73:
                int r6 = r6 + 1
                int r1 = okhttp3.internal.Util.indexOfNonWhitespace(r5, r6)
                int r4 = r5.length()
                if (r1 >= r4) goto L95
                char r4 = r5.charAt(r1)
                r6 = 34
                if (r4 != r6) goto L95
                int r1 = r1 + 1
                r4 = 4
                int r4 = og.m.q0(r5, r6, r1, r4)
                java.lang.String r1 = r5.substring(r1, r4)
                int r4 = r4 + 1
                goto Lac
            L95:
                java.lang.String r4 = ",;"
                int r4 = r0.indexOfElement(r5, r4, r1)
                java.lang.String r1 = r5.substring(r1, r4)
                java.lang.CharSequence r1 = og.m.R0(r1)
                java.lang.String r1 = r1.toString()
                goto Lac
            La8:
                int r6 = r6 + 1
                r4 = r6
                r1 = 0
            Lac:
                java.lang.String r6 = "no-cache"
                boolean r6 = r6.equalsIgnoreCase(r3)
                if (r6 == 0) goto Lba
                r1 = r25
                r3 = r4
                r10 = r23
                goto L44
            Lba:
                java.lang.String r6 = "no-store"
                boolean r6 = r6.equalsIgnoreCase(r3)
                if (r6 == 0) goto Lc9
                r1 = r25
                r3 = r4
                r11 = r23
                goto L44
            Lc9:
                java.lang.String r6 = "max-age"
                boolean r6 = r6.equalsIgnoreCase(r3)
                if (r6 == 0) goto Ldb
                r6 = -1
                int r12 = okhttp3.internal.Util.toNonNegativeInt(r1, r6)
            Ld6:
                r1 = r25
                r3 = r4
                goto L44
            Ldb:
                java.lang.String r6 = "s-maxage"
                boolean r6 = r6.equalsIgnoreCase(r3)
                if (r6 == 0) goto Le9
                r6 = -1
                int r13 = okhttp3.internal.Util.toNonNegativeInt(r1, r6)
                goto Ld6
            Le9:
                java.lang.String r6 = "private"
                boolean r6 = r6.equalsIgnoreCase(r3)
                if (r6 == 0) goto Lf8
                r1 = r25
                r3 = r4
                r14 = r23
                goto L44
            Lf8:
                java.lang.String r6 = "public"
                boolean r6 = r6.equalsIgnoreCase(r3)
                if (r6 == 0) goto L107
                r1 = r25
                r3 = r4
                r15 = r23
                goto L44
            L107:
                java.lang.String r6 = "must-revalidate"
                boolean r6 = r6.equalsIgnoreCase(r3)
                if (r6 == 0) goto L116
                r1 = r25
                r3 = r4
                r16 = r23
                goto L44
            L116:
                java.lang.String r6 = "max-stale"
                boolean r6 = r6.equalsIgnoreCase(r3)
                if (r6 == 0) goto L126
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r17 = okhttp3.internal.Util.toNonNegativeInt(r1, r3)
                goto Ld6
            L126:
                java.lang.String r6 = "min-fresh"
                boolean r6 = r6.equalsIgnoreCase(r3)
                if (r6 == 0) goto L134
                r6 = -1
                int r18 = okhttp3.internal.Util.toNonNegativeInt(r1, r6)
                goto Ld6
            L134:
                r6 = -1
                java.lang.String r1 = "only-if-cached"
                boolean r1 = r1.equalsIgnoreCase(r3)
                if (r1 == 0) goto L144
                r1 = r25
                r3 = r4
                r19 = r23
                goto L44
            L144:
                java.lang.String r1 = "no-transform"
                boolean r1 = r1.equalsIgnoreCase(r3)
                if (r1 == 0) goto L153
                r1 = r25
                r3 = r4
                r20 = r23
                goto L44
            L153:
                java.lang.String r1 = "immutable"
                boolean r1 = r1.equalsIgnoreCase(r3)
                if (r1 == 0) goto Ld6
                r1 = r25
                r3 = r4
                r21 = r23
                goto L44
            L162:
                r6 = -1
                int r7 = r7 + 1
                r1 = r25
                goto L20
            L169:
                if (r8 != 0) goto L16e
                r22 = 0
                goto L170
            L16e:
                r22 = r9
            L170:
                okhttp3.CacheControl r9 = new okhttp3.CacheControl
                r23 = 0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r9
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

    public /* synthetic */ CacheControl(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, java.lang.String r13, gg.g r14) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    public static final okhttp3.CacheControl parse(okhttp3.Headers r1) {
            okhttp3.CacheControl$Companion r0 = okhttp3.CacheControl.Companion
            okhttp3.CacheControl r1 = r0.parse(r1)
            return r1
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m29deprecated_immutable() {
            r1 = this;
            boolean r0 = r1.immutable
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m30deprecated_maxAgeSeconds() {
            r1 = this;
            int r0 = r1.maxAgeSeconds
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m31deprecated_maxStaleSeconds() {
            r1 = this;
            int r0 = r1.maxStaleSeconds
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m32deprecated_minFreshSeconds() {
            r1 = this;
            int r0 = r1.minFreshSeconds
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m33deprecated_mustRevalidate() {
            r1 = this;
            boolean r0 = r1.mustRevalidate
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m34deprecated_noCache() {
            r1 = this;
            boolean r0 = r1.noCache
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m35deprecated_noStore() {
            r1 = this;
            boolean r0 = r1.noStore
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m36deprecated_noTransform() {
            r1 = this;
            boolean r0 = r1.noTransform
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m37deprecated_onlyIfCached() {
            r1 = this;
            boolean r0 = r1.onlyIfCached
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m38deprecated_sMaxAgeSeconds() {
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
            r4 = this;
            java.lang.String r0 = r4.headerValue
            if (r0 != 0) goto Lb4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r4.noCache
            if (r1 == 0) goto L12
            java.lang.String r1 = "no-cache, "
            r0.append(r1)
        L12:
            boolean r1 = r4.noStore
            if (r1 == 0) goto L1b
            java.lang.String r1 = "no-store, "
            r0.append(r1)
        L1b:
            int r1 = r4.maxAgeSeconds
            java.lang.String r2 = ", "
            r3 = -1
            if (r1 == r3) goto L2f
            java.lang.String r1 = "max-age="
            r0.append(r1)
            int r1 = r4.maxAgeSeconds
            r0.append(r1)
            r0.append(r2)
        L2f:
            int r1 = r4.sMaxAgeSeconds
            if (r1 == r3) goto L40
            java.lang.String r1 = "s-maxage="
            r0.append(r1)
            int r1 = r4.sMaxAgeSeconds
            r0.append(r1)
            r0.append(r2)
        L40:
            boolean r1 = r4.isPrivate
            if (r1 == 0) goto L49
            java.lang.String r1 = "private, "
            r0.append(r1)
        L49:
            boolean r1 = r4.isPublic
            if (r1 == 0) goto L52
            java.lang.String r1 = "public, "
            r0.append(r1)
        L52:
            boolean r1 = r4.mustRevalidate
            if (r1 == 0) goto L5b
            java.lang.String r1 = "must-revalidate, "
            r0.append(r1)
        L5b:
            int r1 = r4.maxStaleSeconds
            if (r1 == r3) goto L6c
            java.lang.String r1 = "max-stale="
            r0.append(r1)
            int r1 = r4.maxStaleSeconds
            r0.append(r1)
            r0.append(r2)
        L6c:
            int r1 = r4.minFreshSeconds
            if (r1 == r3) goto L7d
            java.lang.String r1 = "min-fresh="
            r0.append(r1)
            int r1 = r4.minFreshSeconds
            r0.append(r1)
            r0.append(r2)
        L7d:
            boolean r1 = r4.onlyIfCached
            if (r1 == 0) goto L86
            java.lang.String r1 = "only-if-cached, "
            r0.append(r1)
        L86:
            boolean r1 = r4.noTransform
            if (r1 == 0) goto L8f
            java.lang.String r1 = "no-transform, "
            r0.append(r1)
        L8f:
            boolean r1 = r4.immutable
            if (r1 == 0) goto L98
            java.lang.String r1 = "immutable, "
            r0.append(r1)
        L98:
            int r1 = r0.length()
            if (r1 != 0) goto La1
            java.lang.String r0 = ""
            return r0
        La1:
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            r0.delete(r1, r2)
            java.lang.String r0 = r0.toString()
            r4.headerValue = r0
        Lb4:
            return r0
    }
}
