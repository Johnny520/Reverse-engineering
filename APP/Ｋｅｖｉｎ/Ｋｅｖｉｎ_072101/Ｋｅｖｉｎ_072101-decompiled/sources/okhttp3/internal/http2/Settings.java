package okhttp3.internal.http2;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0011\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0000J\u0019\u0010\t\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\u001a\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m115d2 = {"Lokhttp3/internal/http2/Settings;", "", "()V", "headerTableSize", "", "getHeaderTableSize", "()I", "initialWindowSize", "getInitialWindowSize", "set", "values", "", "clear", "", "get", "id", "getEnablePush", "", "defaultValue", "getMaxConcurrentStreams", "getMaxFrameSize", "getMaxHeaderListSize", "isSet", "merge", "other", "value", "size", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class Settings {
    public static final int COUNT = 10;
    public static final okhttp3.internal.http2.Settings.Companion Companion = null;
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values;

    /* JADX INFO: compiled from: Settings.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m115d2 = {"Lokhttp3/internal/http2/Settings$Companion;", "", "()V", "COUNT", "", "DEFAULT_INITIAL_WINDOW_SIZE", "ENABLE_PUSH", "HEADER_TABLE_SIZE", "INITIAL_WINDOW_SIZE", "MAX_CONCURRENT_STREAMS", "MAX_FRAME_SIZE", "MAX_HEADER_LIST_SIZE", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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
    }

    static {
            okhttp3.internal.http2.Settings$Companion r0 = new okhttp3.internal.http2.Settings$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Settings.Companion = r0
            return
    }

    public Settings() {
            r1 = this;
            r1.<init>()
            r0 = 10
            int[] r0 = new int[r0]
            r1.values = r0
            return
    }

    public final void clear() {
            r7 = this;
            r0 = 0
            r7.set = r0
            int[] r1 = r7.values
            r5 = 6
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            kotlin.collections.ArraysKt.fill$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final int get(int r2) {
            r1 = this;
            int[] r0 = r1.values
            r0 = r0[r2]
            return r0
    }

    public final boolean getEnablePush(boolean r4) {
            r3 = this;
            r0 = 4
            int r1 = r3.set
            r1 = r1 & r0
            if (r1 == 0) goto L11
            int[] r1 = r3.values
            r2 = 2
            r1 = r1[r2]
            r2 = 1
            if (r1 != r2) goto Lf
            goto L12
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = r4
        L12:
            return r2
    }

    public final int getHeaderTableSize() {
            r3 = this;
            r0 = 2
            int r1 = r3.set
            r1 = r1 & r0
            if (r1 == 0) goto Lc
            int[] r1 = r3.values
            r2 = 1
            r1 = r1[r2]
            goto Ld
        Lc:
            r1 = -1
        Ld:
            return r1
    }

    public final int getInitialWindowSize() {
            r3 = this;
            r0 = 128(0x80, float:1.8E-43)
            int r1 = r3.set
            r1 = r1 & r0
            if (r1 == 0) goto Ld
            int[] r1 = r3.values
            r2 = 7
            r1 = r1[r2]
            goto L10
        Ld:
            r1 = 65535(0xffff, float:9.1834E-41)
        L10:
            return r1
    }

    public final int getMaxConcurrentStreams() {
            r3 = this;
            r0 = 16
            int r1 = r3.set
            r1 = r1 & r0
            if (r1 == 0) goto Ld
            int[] r1 = r3.values
            r2 = 4
            r1 = r1[r2]
            goto L10
        Ld:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L10:
            return r1
    }

    public final int getMaxFrameSize(int r4) {
            r3 = this;
            r0 = 32
            int r1 = r3.set
            r1 = r1 & r0
            if (r1 == 0) goto Ld
            int[] r1 = r3.values
            r2 = 5
            r1 = r1[r2]
            goto Le
        Ld:
            r1 = r4
        Le:
            return r1
    }

    public final int getMaxHeaderListSize(int r4) {
            r3 = this;
            r0 = 64
            int r1 = r3.set
            r1 = r1 & r0
            if (r1 == 0) goto Ld
            int[] r1 = r3.values
            r2 = 6
            r1 = r1[r2]
            goto Le
        Ld:
            r1 = r4
        Le:
            return r1
    }

    public final boolean isSet(int r4) {
            r3 = this;
            r0 = 1
            int r1 = r0 << r4
            int r2 = r3.set
            r2 = r2 & r1
            if (r2 == 0) goto L9
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final void merge(okhttp3.internal.http2.Settings r3) {
            r2 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
        L6:
            r1 = 10
            if (r0 >= r1) goto L1a
            boolean r1 = r3.isSet(r0)
            if (r1 == 0) goto L17
            int r1 = r3.get(r0)
            r2.set(r0, r1)
        L17:
            int r0 = r0 + 1
            goto L6
        L1a:
            return
    }

    public final okhttp3.internal.http2.Settings set(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto L14
            int[] r0 = r2.values
            int r0 = r0.length
            if (r3 < r0) goto L8
            goto L14
        L8:
            r0 = 1
            int r0 = r0 << r3
            int r1 = r2.set
            r1 = r1 | r0
            r2.set = r1
            int[] r1 = r2.values
            r1[r3] = r4
            return r2
        L14:
            return r2
    }

    public final int size() {
            r1 = this;
            int r0 = r1.set
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }
}
