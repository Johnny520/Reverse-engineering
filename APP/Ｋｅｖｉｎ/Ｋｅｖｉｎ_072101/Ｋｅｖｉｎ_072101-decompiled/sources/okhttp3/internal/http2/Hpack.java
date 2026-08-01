package okhttp3.internal.http2;

/* JADX INFO: compiled from: Hpack.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m115d2 = {"Lokhttp3/internal/http2/Hpack;", "", "()V", "NAME_TO_FIRST_INDEX", "", "Lokio/ByteString;", "", "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "PREFIX_4_BITS", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "STATIC_HEADER_TABLE", "", "Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "checkLowercase", "name", "nameToFirstIndex", "Reader", "Writer", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class Hpack {
    public static final okhttp3.internal.http2.Hpack INSTANCE = null;
    private static final java.util.Map<okio.ByteString, java.lang.Integer> NAME_TO_FIRST_INDEX = null;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final okhttp3.internal.http2.Header[] STATIC_HEADER_TABLE = null;

    /* JADX INFO: compiled from: Hpack.kt */
    @kotlin.Metadata(m114d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010!\u001a\u00020\u0005H\u0002J\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u0013J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0016\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0005H\u0002J\b\u0010*\u001a\u00020\u0013H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010,\u001a\u00020\u0013H\u0002R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m115d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "source", "Lokio/Source;", "headerTableSizeSetting", "", "maxDynamicTableByteCount", "(Lokio/Source;II)V", "dynamicTable", "", "Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "headerCount", "headerList", "", "nextHeaderIndex", "Lokio/BufferedSource;", "adjustDynamicTableByteCount", "", "clearDynamicTable", "dynamicTableIndex", "index", "evictToRecoverBytes", "bytesToRecover", "getAndResetHeaderList", "", "getName", "Lokio/ByteString;", "insertIntoDynamicTable", "entry", "isStaticHeader", "", "readByte", "readByteString", "readHeaders", "readIndexedHeader", "readInt", "firstByte", "prefixMask", "readLiteralHeaderWithIncrementalIndexingIndexedName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingNewName", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Reader {
        public okhttp3.internal.http2.Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final java.util.List<okhttp3.internal.http2.Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final okio.BufferedSource source;

        public Reader(okio.Source r8, int r9) {
                r7 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r5 = 4
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r3 = r9
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        public Reader(okio.Source r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.headerTableSizeSetting = r3
                r1.maxDynamicTableByteCount = r4
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                r1.headerList = r0
                okio.BufferedSource r0 = okio.Okio.buffer(r2)
                r1.source = r0
                r0 = 8
                okhttp3.internal.http2.Header[] r0 = new okhttp3.internal.http2.Header[r0]
                r1.dynamicTable = r0
                okhttp3.internal.http2.Header[] r0 = r1.dynamicTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                r1.nextHeaderIndex = r0
                return
        }

        public /* synthetic */ Reader(okio.Source r1, int r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
                r0 = this;
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = r2
            L5:
                r0.<init>(r1, r2, r3)
                return
        }

        private final void adjustDynamicTableByteCount() {
                r2 = this;
                int r0 = r2.maxDynamicTableByteCount
                int r1 = r2.dynamicTableByteCount
                if (r0 >= r1) goto L16
                int r0 = r2.maxDynamicTableByteCount
                if (r0 != 0) goto Le
                r2.clearDynamicTable()
                goto L16
            Le:
                int r0 = r2.dynamicTableByteCount
                int r1 = r2.maxDynamicTableByteCount
                int r0 = r0 - r1
                r2.evictToRecoverBytes(r0)
            L16:
                return
        }

        private final void clearDynamicTable() {
                r6 = this;
                okhttp3.internal.http2.Header[] r0 = r6.dynamicTable
                r4 = 6
                r5 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                kotlin.collections.ArraysKt.fill$default(r0, r1, r2, r3, r4, r5)
                okhttp3.internal.http2.Header[] r0 = r6.dynamicTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                r6.nextHeaderIndex = r0
                r0 = 0
                r6.headerCount = r0
                r6.dynamicTableByteCount = r0
                return
        }

        private final int dynamicTableIndex(int r2) {
                r1 = this;
                int r0 = r1.nextHeaderIndex
                int r0 = r0 + 1
                int r0 = r0 + r2
                return r0
        }

        private final int evictToRecoverBytes(int r9) {
                r8 = this;
                r0 = r9
                r1 = 0
                if (r0 <= 0) goto L43
                okhttp3.internal.http2.Header[] r2 = r8.dynamicTable
                int r2 = r2.length
                int r2 = r2 + (-1)
            L9:
                int r3 = r8.nextHeaderIndex
                if (r2 < r3) goto L2c
                if (r0 <= 0) goto L2c
                okhttp3.internal.http2.Header[] r3 = r8.dynamicTable
                r3 = r3[r2]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r4 = r3.hpackSize
                int r0 = r0 - r4
                int r4 = r8.dynamicTableByteCount
                int r5 = r3.hpackSize
                int r4 = r4 - r5
                r8.dynamicTableByteCount = r4
                int r4 = r8.headerCount
                int r4 = r4 + (-1)
                r8.headerCount = r4
                int r1 = r1 + 1
                int r2 = r2 + (-1)
                goto L9
            L2c:
                okhttp3.internal.http2.Header[] r3 = r8.dynamicTable
                int r4 = r8.nextHeaderIndex
                int r4 = r4 + 1
                okhttp3.internal.http2.Header[] r5 = r8.dynamicTable
                int r6 = r8.nextHeaderIndex
                int r6 = r6 + 1
                int r6 = r6 + r1
                int r7 = r8.headerCount
                java.lang.System.arraycopy(r3, r4, r5, r6, r7)
                int r3 = r8.nextHeaderIndex
                int r3 = r3 + r1
                r8.nextHeaderIndex = r3
            L43:
                return r1
        }

        private final okio.ByteString getName(int r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r4.isStaticHeader(r5)
                if (r0 == 0) goto L11
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                r0 = r0[r5]
                okio.ByteString r0 = r0.name
                goto L2f
            L11:
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                int r0 = r0.length
                int r0 = r5 - r0
                int r0 = r4.dynamicTableIndex(r0)
                if (r0 < 0) goto L30
                okhttp3.internal.http2.Header[] r1 = r4.dynamicTable
                int r1 = r1.length
                if (r0 >= r1) goto L30
                okhttp3.internal.http2.Header[] r1 = r4.dynamicTable
                r1 = r1[r0]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                okio.ByteString r1 = r1.name
                r0 = r1
            L2f:
                return r0
            L30:
                java.io.IOException r1 = new java.io.IOException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Header index too large "
                java.lang.StringBuilder r2 = r2.append(r3)
                int r3 = r5 + 1
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        private final void insertIntoDynamicTable(int r10, okhttp3.internal.http2.Header r11) {
                r9 = this;
                r0 = r10
                java.util.List<okhttp3.internal.http2.Header> r1 = r9.headerList
                r1.add(r11)
                int r1 = r11.hpackSize
                r2 = -1
                if (r0 == r2) goto L19
                okhttp3.internal.http2.Header[] r3 = r9.dynamicTable
                int r4 = r9.dynamicTableIndex(r0)
                r3 = r3[r4]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r3 = r3.hpackSize
                int r1 = r1 - r3
            L19:
                int r3 = r9.maxDynamicTableByteCount
                if (r1 <= r3) goto L21
                r9.clearDynamicTable()
                return
            L21:
                int r3 = r9.dynamicTableByteCount
                int r3 = r3 + r1
                int r4 = r9.maxDynamicTableByteCount
                int r3 = r3 - r4
                int r4 = r9.evictToRecoverBytes(r3)
                if (r0 != r2) goto L64
                int r2 = r9.headerCount
                int r2 = r2 + 1
                okhttp3.internal.http2.Header[] r5 = r9.dynamicTable
                int r5 = r5.length
                if (r2 <= r5) goto L52
                okhttp3.internal.http2.Header[] r2 = r9.dynamicTable
                int r2 = r2.length
                int r2 = r2 * 2
                okhttp3.internal.http2.Header[] r2 = new okhttp3.internal.http2.Header[r2]
                okhttp3.internal.http2.Header[] r5 = r9.dynamicTable
                okhttp3.internal.http2.Header[] r6 = r9.dynamicTable
                int r6 = r6.length
                okhttp3.internal.http2.Header[] r7 = r9.dynamicTable
                int r7 = r7.length
                r8 = 0
                java.lang.System.arraycopy(r5, r8, r2, r6, r7)
                okhttp3.internal.http2.Header[] r5 = r9.dynamicTable
                int r5 = r5.length
                int r5 = r5 + (-1)
                r9.nextHeaderIndex = r5
                r9.dynamicTable = r2
            L52:
                int r2 = r9.nextHeaderIndex
                int r5 = r2 + (-1)
                r9.nextHeaderIndex = r5
                r0 = r2
                okhttp3.internal.http2.Header[] r2 = r9.dynamicTable
                r2[r0] = r11
                int r2 = r9.headerCount
                int r2 = r2 + 1
                r9.headerCount = r2
                goto L6e
            L64:
                int r2 = r9.dynamicTableIndex(r0)
                int r2 = r2 + r4
                int r0 = r0 + r2
                okhttp3.internal.http2.Header[] r2 = r9.dynamicTable
                r2[r0] = r11
            L6e:
                int r2 = r9.dynamicTableByteCount
                int r2 = r2 + r1
                r9.dynamicTableByteCount = r2
                return
        }

        private final boolean isStaticHeader(int r3) {
                r2 = this;
                if (r3 < 0) goto Le
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                int r0 = r0.length
                r1 = 1
                int r0 = r0 - r1
                if (r3 > r0) goto Le
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        private final int readByte() throws java.io.IOException {
                r2 = this;
                okio.BufferedSource r0 = r2.source
                byte r0 = r0.readByte()
                r1 = 255(0xff, float:3.57E-43)
                int r0 = okhttp3.internal.Util.and(r0, r1)
                return r0
        }

        private final void readIndexedHeader(int r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r4.isStaticHeader(r5)
                if (r0 == 0) goto L14
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                r0 = r0[r5]
                java.util.List<okhttp3.internal.http2.Header> r1 = r4.headerList
                r1.add(r0)
                goto L36
            L14:
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                int r0 = r0.length
                int r0 = r5 - r0
                int r0 = r4.dynamicTableIndex(r0)
                if (r0 < 0) goto L37
                okhttp3.internal.http2.Header[] r1 = r4.dynamicTable
                int r1 = r1.length
                if (r0 >= r1) goto L37
                java.util.List<okhttp3.internal.http2.Header> r1 = r4.headerList
                java.util.Collection r1 = (java.util.Collection) r1
                okhttp3.internal.http2.Header[] r2 = r4.dynamicTable
                r2 = r2[r0]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                r1.add(r2)
            L36:
                return
            L37:
                java.io.IOException r1 = new java.io.IOException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Header index too large "
                java.lang.StringBuilder r2 = r2.append(r3)
                int r3 = r5 + 1
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int r5) throws java.io.IOException {
                r4 = this;
                okio.ByteString r0 = r4.getName(r5)
                okio.ByteString r1 = r4.readByteString()
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                r2.<init>(r0, r1)
                r3 = -1
                r4.insertIntoDynamicTable(r3, r2)
                return
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws java.io.IOException {
                r4 = this;
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okio.ByteString r1 = r4.readByteString()
                okio.ByteString r0 = r0.checkLowercase(r1)
                okio.ByteString r1 = r4.readByteString()
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                r2.<init>(r0, r1)
                r3 = -1
                r4.insertIntoDynamicTable(r3, r2)
                return
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int r5) throws java.io.IOException {
                r4 = this;
                okio.ByteString r0 = r4.getName(r5)
                okio.ByteString r1 = r4.readByteString()
                java.util.List<okhttp3.internal.http2.Header> r2 = r4.headerList
                okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
                r3.<init>(r0, r1)
                r2.add(r3)
                return
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws java.io.IOException {
                r4 = this;
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okio.ByteString r1 = r4.readByteString()
                okio.ByteString r0 = r0.checkLowercase(r1)
                okio.ByteString r1 = r4.readByteString()
                java.util.List<okhttp3.internal.http2.Header> r2 = r4.headerList
                okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
                r3.<init>(r0, r1)
                r2.add(r3)
                return
        }

        public final java.util.List<okhttp3.internal.http2.Header> getAndResetHeaderList() {
                r2 = this;
                java.util.List<okhttp3.internal.http2.Header> r0 = r2.headerList
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
                java.util.List<okhttp3.internal.http2.Header> r1 = r2.headerList
                r1.clear()
                return r0
        }

        public final int maxDynamicTableByteCount() {
                r1 = this;
                int r0 = r1.maxDynamicTableByteCount
                return r0
        }

        public final okio.ByteString readByteString() throws java.io.IOException {
                r8 = this;
                int r0 = r8.readByte()
                r1 = r0 & 128(0x80, float:1.8E-43)
                r2 = 128(0x80, float:1.8E-43)
                if (r1 != r2) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                r2 = 127(0x7f, float:1.78E-43)
                int r2 = r8.readInt(r0, r2)
                long r2 = (long) r2
                if (r1 == 0) goto L2a
                okio.Buffer r4 = new okio.Buffer
                r4.<init>()
                okhttp3.internal.http2.Huffman r5 = okhttp3.internal.http2.Huffman.INSTANCE
                okio.BufferedSource r6 = r8.source
                r7 = r4
                okio.BufferedSink r7 = (okio.BufferedSink) r7
                r5.decode(r6, r2, r7)
                okio.ByteString r4 = r4.readByteString()
                goto L30
            L2a:
                okio.BufferedSource r4 = r8.source
                okio.ByteString r4 = r4.readByteString(r2)
            L30:
                return r4
        }

        public final void readHeaders() throws java.io.IOException {
                r4 = this;
            L1:
                okio.BufferedSource r0 = r4.source
                boolean r0 = r0.exhausted()
                if (r0 != 0) goto L9a
                okio.BufferedSource r0 = r4.source
                byte r0 = r0.readByte()
                r1 = 255(0xff, float:3.57E-43)
                int r0 = okhttp3.internal.Util.and(r0, r1)
                r1 = 128(0x80, float:1.8E-43)
                if (r0 == r1) goto L92
                r2 = r0 & 128(0x80, float:1.8E-43)
                if (r2 != r1) goto L2a
                r1 = 127(0x7f, float:1.78E-43)
                int r1 = r4.readInt(r0, r1)
                int r2 = r1 + (-1)
                r4.readIndexedHeader(r2)
                goto L1
            L2a:
                r1 = 64
                if (r0 != r1) goto L32
                r4.readLiteralHeaderWithIncrementalIndexingNewName()
                goto L1
            L32:
                r2 = r0 & 64
                if (r2 != r1) goto L42
                r1 = 63
                int r1 = r4.readInt(r0, r1)
                int r2 = r1 + (-1)
                r4.readLiteralHeaderWithIncrementalIndexingIndexedName(r2)
                goto L1
            L42:
                r1 = r0 & 32
                r2 = 32
                if (r1 != r2) goto L79
                r1 = 31
                int r1 = r4.readInt(r0, r1)
                r4.maxDynamicTableByteCount = r1
                int r1 = r4.maxDynamicTableByteCount
                if (r1 < 0) goto L5e
                int r1 = r4.maxDynamicTableByteCount
                int r2 = r4.headerTableSizeSetting
                if (r1 > r2) goto L5e
                r4.adjustDynamicTableByteCount()
                goto L1
            L5e:
                java.io.IOException r1 = new java.io.IOException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid dynamic table size update "
                java.lang.StringBuilder r2 = r2.append(r3)
                int r3 = r4.maxDynamicTableByteCount
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L79:
                r1 = 16
                if (r0 == r1) goto L8d
                if (r0 != 0) goto L80
                goto L8d
            L80:
                r1 = 15
                int r1 = r4.readInt(r0, r1)
                int r2 = r1 + (-1)
                r4.readLiteralHeaderWithoutIndexingIndexedName(r2)
                goto L1
            L8d:
                r4.readLiteralHeaderWithoutIndexingNewName()
                goto L1
            L92:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "index == 0"
                r1.<init>(r2)
                throw r1
            L9a:
                return
        }

        public final int readInt(int r6, int r7) throws java.io.IOException {
                r5 = this;
                r0 = r6 & r7
                if (r0 >= r7) goto L5
                return r0
            L5:
                r1 = r7
                r2 = 0
            L7:
                int r3 = r5.readByte()
                r4 = r3 & 128(0x80, float:1.8E-43)
                if (r4 == 0) goto L17
                r4 = r3 & 127(0x7f, float:1.78E-43)
                int r4 = r4 << r2
                int r1 = r1 + r4
                int r2 = r2 + 7
                goto L7
            L17:
                int r4 = r3 << r2
                int r1 = r1 + r4
                return r1
        }
    }

    /* JADX INFO: compiled from: Hpack.kt */
    @kotlin.Metadata(m114d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0 J\u001e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m115d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "headerTableSizeSetting", "", "useCompression", "", "out", "Lokio/Buffer;", "(IZLokio/Buffer;)V", "dynamicTable", "", "Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "emitDynamicTableSizeUpdate", "headerCount", "maxDynamicTableByteCount", "nextHeaderIndex", "smallestHeaderTableSizeSetting", "adjustDynamicTableByteCount", "", "clearDynamicTable", "evictToRecoverBytes", "bytesToRecover", "insertIntoDynamicTable", "entry", "resizeHeaderTable", "writeByteString", "data", "Lokio/ByteString;", "writeHeaders", "headerBlock", "", "writeInt", "value", "prefixMask", "bits", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Writer {
        public okhttp3.internal.http2.Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final okio.Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int r8, okio.Buffer r9) {
                r7 = this;
                java.lang.String r0 = "out"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r5 = 2
                r6 = 0
                r3 = 0
                r1 = r7
                r2 = r8
                r4 = r9
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        public Writer(int r2, boolean r3, okio.Buffer r4) {
                r1 = this;
                java.lang.String r0 = "out"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r1.<init>()
                r1.headerTableSizeSetting = r2
                r1.useCompression = r3
                r1.out = r4
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.smallestHeaderTableSizeSetting = r0
                int r0 = r1.headerTableSizeSetting
                r1.maxDynamicTableByteCount = r0
                r0 = 8
                okhttp3.internal.http2.Header[] r0 = new okhttp3.internal.http2.Header[r0]
                r1.dynamicTable = r0
                okhttp3.internal.http2.Header[] r0 = r1.dynamicTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                r1.nextHeaderIndex = r0
                return
        }

        public /* synthetic */ Writer(int r1, boolean r2, okio.Buffer r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
                r0 = this;
                r5 = r4 & 1
                if (r5 == 0) goto L6
                r1 = 4096(0x1000, float:5.74E-42)
            L6:
                r4 = r4 & 2
                if (r4 == 0) goto Lb
                r2 = 1
            Lb:
                r0.<init>(r1, r2, r3)
                return
        }

        public Writer(okio.Buffer r8) {
                r7 = this;
                java.lang.String r0 = "out"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r5 = 3
                r6 = 0
                r2 = 0
                r3 = 0
                r1 = r7
                r4 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        private final void adjustDynamicTableByteCount() {
                r2 = this;
                int r0 = r2.maxDynamicTableByteCount
                int r1 = r2.dynamicTableByteCount
                if (r0 >= r1) goto L16
                int r0 = r2.maxDynamicTableByteCount
                if (r0 != 0) goto Le
                r2.clearDynamicTable()
                goto L16
            Le:
                int r0 = r2.dynamicTableByteCount
                int r1 = r2.maxDynamicTableByteCount
                int r0 = r0 - r1
                r2.evictToRecoverBytes(r0)
            L16:
                return
        }

        private final void clearDynamicTable() {
                r6 = this;
                okhttp3.internal.http2.Header[] r0 = r6.dynamicTable
                r4 = 6
                r5 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                kotlin.collections.ArraysKt.fill$default(r0, r1, r2, r3, r4, r5)
                okhttp3.internal.http2.Header[] r0 = r6.dynamicTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                r6.nextHeaderIndex = r0
                r0 = 0
                r6.headerCount = r0
                r6.dynamicTableByteCount = r0
                return
        }

        private final int evictToRecoverBytes(int r9) {
                r8 = this;
                r0 = r9
                r1 = 0
                if (r0 <= 0) goto L58
                okhttp3.internal.http2.Header[] r2 = r8.dynamicTable
                int r2 = r2.length
                int r2 = r2 + (-1)
            L9:
                int r3 = r8.nextHeaderIndex
                if (r2 < r3) goto L32
                if (r0 <= 0) goto L32
                okhttp3.internal.http2.Header[] r3 = r8.dynamicTable
                r3 = r3[r2]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r3 = r3.hpackSize
                int r0 = r0 - r3
                int r3 = r8.dynamicTableByteCount
                okhttp3.internal.http2.Header[] r4 = r8.dynamicTable
                r4 = r4[r2]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                int r4 = r4.hpackSize
                int r3 = r3 - r4
                r8.dynamicTableByteCount = r3
                int r3 = r8.headerCount
                int r3 = r3 + (-1)
                r8.headerCount = r3
                int r1 = r1 + 1
                int r2 = r2 + (-1)
                goto L9
            L32:
                okhttp3.internal.http2.Header[] r3 = r8.dynamicTable
                int r4 = r8.nextHeaderIndex
                int r4 = r4 + 1
                okhttp3.internal.http2.Header[] r5 = r8.dynamicTable
                int r6 = r8.nextHeaderIndex
                int r6 = r6 + 1
                int r6 = r6 + r1
                int r7 = r8.headerCount
                java.lang.System.arraycopy(r3, r4, r5, r6, r7)
                okhttp3.internal.http2.Header[] r3 = r8.dynamicTable
                int r4 = r8.nextHeaderIndex
                int r4 = r4 + 1
                int r5 = r8.nextHeaderIndex
                int r5 = r5 + 1
                int r5 = r5 + r1
                r6 = 0
                java.util.Arrays.fill(r3, r4, r5, r6)
                int r3 = r8.nextHeaderIndex
                int r3 = r3 + r1
                r8.nextHeaderIndex = r3
            L58:
                return r1
        }

        private final void insertIntoDynamicTable(okhttp3.internal.http2.Header r8) {
                r7 = this;
                int r0 = r8.hpackSize
                int r1 = r7.maxDynamicTableByteCount
                if (r0 <= r1) goto La
                r7.clearDynamicTable()
                return
            La:
                int r1 = r7.dynamicTableByteCount
                int r1 = r1 + r0
                int r2 = r7.maxDynamicTableByteCount
                int r1 = r1 - r2
                r7.evictToRecoverBytes(r1)
                int r2 = r7.headerCount
                int r2 = r2 + 1
                okhttp3.internal.http2.Header[] r3 = r7.dynamicTable
                int r3 = r3.length
                if (r2 <= r3) goto L38
                okhttp3.internal.http2.Header[] r2 = r7.dynamicTable
                int r2 = r2.length
                int r2 = r2 * 2
                okhttp3.internal.http2.Header[] r2 = new okhttp3.internal.http2.Header[r2]
                okhttp3.internal.http2.Header[] r3 = r7.dynamicTable
                okhttp3.internal.http2.Header[] r4 = r7.dynamicTable
                int r4 = r4.length
                okhttp3.internal.http2.Header[] r5 = r7.dynamicTable
                int r5 = r5.length
                r6 = 0
                java.lang.System.arraycopy(r3, r6, r2, r4, r5)
                okhttp3.internal.http2.Header[] r3 = r7.dynamicTable
                int r3 = r3.length
                int r3 = r3 + (-1)
                r7.nextHeaderIndex = r3
                r7.dynamicTable = r2
            L38:
                int r2 = r7.nextHeaderIndex
                int r3 = r2 + (-1)
                r7.nextHeaderIndex = r3
                okhttp3.internal.http2.Header[] r3 = r7.dynamicTable
                r3[r2] = r8
                int r3 = r7.headerCount
                int r3 = r3 + 1
                r7.headerCount = r3
                int r3 = r7.dynamicTableByteCount
                int r3 = r3 + r0
                r7.dynamicTableByteCount = r3
                return
        }

        public final void resizeHeaderTable(int r3) {
                r2 = this;
                r2.headerTableSizeSetting = r3
                r0 = 16384(0x4000, float:2.2959E-41)
                int r0 = java.lang.Math.min(r3, r0)
                int r1 = r2.maxDynamicTableByteCount
                if (r1 != r0) goto Ld
                return
            Ld:
                int r1 = r2.maxDynamicTableByteCount
                if (r0 >= r1) goto L1a
            L12:
                int r1 = r2.smallestHeaderTableSizeSetting
                int r1 = java.lang.Math.min(r1, r0)
                r2.smallestHeaderTableSizeSetting = r1
            L1a:
                r1 = 1
                r2.emitDynamicTableSizeUpdate = r1
                r2.maxDynamicTableByteCount = r0
                r2.adjustDynamicTableByteCount()
                return
        }

        public final void writeByteString(okio.ByteString r6) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                boolean r0 = r5.useCompression
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == 0) goto L37
                okhttp3.internal.http2.Huffman r0 = okhttp3.internal.http2.Huffman.INSTANCE
                int r0 = r0.encodedLength(r6)
                int r2 = r6.size()
                if (r0 >= r2) goto L37
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                okhttp3.internal.http2.Huffman r2 = okhttp3.internal.http2.Huffman.INSTANCE
                r3 = r0
                okio.BufferedSink r3 = (okio.BufferedSink) r3
                r2.encode(r6, r3)
                okio.ByteString r2 = r0.readByteString()
                int r3 = r2.size()
                r4 = 128(0x80, float:1.8E-43)
                r5.writeInt(r3, r1, r4)
                okio.Buffer r1 = r5.out
                r1.write(r2)
                goto L44
            L37:
                int r0 = r6.size()
                r2 = 0
                r5.writeInt(r0, r1, r2)
                okio.Buffer r0 = r5.out
                r0.write(r6)
            L44:
                return
        }

        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r15) throws java.io.IOException {
                r14 = this;
                java.lang.String r0 = "headerBlock"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                boolean r0 = r14.emitDynamicTableSizeUpdate
                r1 = 0
                if (r0 == 0) goto L25
                int r0 = r14.smallestHeaderTableSizeSetting
                int r2 = r14.maxDynamicTableByteCount
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L19
                int r0 = r14.smallestHeaderTableSizeSetting
                r14.writeInt(r0, r4, r3)
            L19:
                r14.emitDynamicTableSizeUpdate = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r14.smallestHeaderTableSizeSetting = r0
                int r0 = r14.maxDynamicTableByteCount
                r14.writeInt(r0, r4, r3)
            L25:
                r0 = 0
                int r2 = r15.size()
            L2a:
                if (r0 >= r2) goto L112
                java.lang.Object r3 = r15.get(r0)
                okhttp3.internal.http2.Header r3 = (okhttp3.internal.http2.Header) r3
                okio.ByteString r4 = r3.name
                okio.ByteString r4 = r4.toAsciiLowercase()
                okio.ByteString r5 = r3.value
                r6 = -1
                r7 = -1
                okhttp3.internal.http2.Hpack r8 = okhttp3.internal.http2.Hpack.INSTANCE
                java.util.Map r8 = r8.getNAME_TO_FIRST_INDEX()
                java.lang.Object r8 = r8.get(r4)
                java.lang.Integer r8 = (java.lang.Integer) r8
                r9 = 1
                if (r8 == 0) goto L83
                int r10 = r8.intValue()
                int r7 = r10 + 1
                r10 = 2
                if (r10 > r7) goto L5a
                r10 = 8
                if (r7 >= r10) goto L5a
                r10 = r9
                goto L5b
            L5a:
                r10 = r1
            L5b:
                if (r10 == 0) goto L83
                okhttp3.internal.http2.Hpack r10 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r10 = r10.getSTATIC_HEADER_TABLE()
                int r11 = r7 + (-1)
                r10 = r10[r11]
                okio.ByteString r10 = r10.value
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r5)
                if (r10 == 0) goto L71
                r6 = r7
                goto L83
            L71:
                okhttp3.internal.http2.Hpack r10 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r10 = r10.getSTATIC_HEADER_TABLE()
                r10 = r10[r7]
                okio.ByteString r10 = r10.value
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r5)
                if (r10 == 0) goto L83
                int r6 = r7 + 1
            L83:
                r10 = -1
                if (r6 != r10) goto Lcc
                int r11 = r14.nextHeaderIndex
                int r11 = r11 + r9
                okhttp3.internal.http2.Header[] r9 = r14.dynamicTable
                int r9 = r9.length
            L8c:
                if (r11 >= r9) goto Lcc
                okhttp3.internal.http2.Header[] r12 = r14.dynamicTable
                r12 = r12[r11]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
                okio.ByteString r12 = r12.name
                boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r4)
                if (r12 == 0) goto Lc9
                okhttp3.internal.http2.Header[] r12 = r14.dynamicTable
                r12 = r12[r11]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
                okio.ByteString r12 = r12.value
                boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r5)
                if (r12 == 0) goto Lba
                int r9 = r14.nextHeaderIndex
                int r9 = r11 - r9
                okhttp3.internal.http2.Hpack r12 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r12 = r12.getSTATIC_HEADER_TABLE()
                int r12 = r12.length
                int r6 = r9 + r12
                goto Lcc
            Lba:
                if (r7 != r10) goto Lc9
                int r12 = r14.nextHeaderIndex
                int r12 = r11 - r12
                okhttp3.internal.http2.Hpack r13 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r13 = r13.getSTATIC_HEADER_TABLE()
                int r13 = r13.length
                int r12 = r12 + r13
                r7 = r12
            Lc9:
                int r11 = r11 + 1
                goto L8c
            Lcc:
                if (r6 == r10) goto Ld7
                r9 = 127(0x7f, float:1.78E-43)
                r10 = 128(0x80, float:1.8E-43)
                r14.writeInt(r6, r9, r10)
                goto L10e
            Ld7:
                r9 = 64
                if (r7 != r10) goto Lea
                okio.Buffer r10 = r14.out
                r10.writeByte(r9)
                r14.writeByteString(r4)
                r14.writeByteString(r5)
                r14.insertIntoDynamicTable(r3)
                goto L10e
            Lea:
                okio.ByteString r10 = okhttp3.internal.http2.Header.PSEUDO_PREFIX
                boolean r10 = r4.startsWith(r10)
                if (r10 == 0) goto L103
                okio.ByteString r10 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r4)
                if (r10 != 0) goto L103
                r9 = 15
                r14.writeInt(r7, r9, r1)
                r14.writeByteString(r5)
                goto L10e
            L103:
                r10 = 63
                r14.writeInt(r7, r10, r9)
                r14.writeByteString(r5)
                r14.insertIntoDynamicTable(r3)
            L10e:
                int r0 = r0 + 1
                goto L2a
            L112:
                return
        }

        public final void writeInt(int r5, int r6, int r7) {
                r4 = this;
                r0 = r5
                if (r0 >= r6) goto Lb
                okio.Buffer r1 = r4.out
                r2 = r7 | r0
                r1.writeByte(r2)
                return
            Lb:
                okio.Buffer r1 = r4.out
                r2 = r7 | r6
                r1.writeByte(r2)
                int r0 = r0 - r6
            L13:
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L23
                r1 = r0 & 127(0x7f, float:1.78E-43)
                okio.Buffer r2 = r4.out
                r3 = r1 | 128(0x80, float:1.8E-43)
                r2.writeByte(r3)
                int r0 = r0 >>> 7
                goto L13
            L23:
                okio.Buffer r1 = r4.out
                r1.writeByte(r0)
                return
        }
    }

    static {
            okhttp3.internal.http2.Hpack r0 = new okhttp3.internal.http2.Hpack
            r0.<init>()
            okhttp3.internal.http2.Hpack.INSTANCE = r0
            r0 = 61
            okhttp3.internal.http2.Header[] r0 = new okhttp3.internal.http2.Header[r0]
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
            java.lang.String r3 = ""
            r1.<init>(r2, r3)
            r2 = 0
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_METHOD
            java.lang.String r4 = "GET"
            r1.<init>(r2, r4)
            r2 = 1
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_METHOD
            java.lang.String r4 = "POST"
            r1.<init>(r2, r4)
            r2 = 2
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_PATH
            java.lang.String r4 = "/"
            r1.<init>(r2, r4)
            r2 = 3
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_PATH
            java.lang.String r4 = "/index.html"
            r1.<init>(r2, r4)
            r2 = 4
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_SCHEME
            java.lang.String r4 = "http"
            r1.<init>(r2, r4)
            r2 = 5
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_SCHEME
            java.lang.String r4 = "https"
            r1.<init>(r2, r4)
            r2 = 6
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "200"
            r1.<init>(r2, r4)
            r2 = 7
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "204"
            r1.<init>(r2, r4)
            r2 = 8
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "206"
            r1.<init>(r2, r4)
            r2 = 9
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "304"
            r1.<init>(r2, r4)
            r2 = 10
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "400"
            r1.<init>(r2, r4)
            r2 = 11
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "404"
            r1.<init>(r2, r4)
            r2 = 12
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "500"
            r1.<init>(r2, r4)
            r2 = 13
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "accept-charset"
            r1.<init>(r2, r3)
            r2 = 14
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "accept-encoding"
            java.lang.String r4 = "gzip, deflate"
            r1.<init>(r2, r4)
            r2 = 15
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "accept-language"
            r1.<init>(r2, r3)
            r2 = 16
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "accept-ranges"
            r1.<init>(r2, r3)
            r2 = 17
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "accept"
            r1.<init>(r2, r3)
            r2 = 18
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "access-control-allow-origin"
            r1.<init>(r2, r3)
            r2 = 19
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "age"
            r1.<init>(r2, r3)
            r2 = 20
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "allow"
            r1.<init>(r2, r3)
            r2 = 21
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "authorization"
            r1.<init>(r2, r3)
            r2 = 22
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "cache-control"
            r1.<init>(r2, r3)
            r2 = 23
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-disposition"
            r1.<init>(r2, r3)
            r2 = 24
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-encoding"
            r1.<init>(r2, r3)
            r2 = 25
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-language"
            r1.<init>(r2, r3)
            r2 = 26
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-length"
            r1.<init>(r2, r3)
            r2 = 27
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-location"
            r1.<init>(r2, r3)
            r2 = 28
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-range"
            r1.<init>(r2, r3)
            r2 = 29
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-type"
            r1.<init>(r2, r3)
            r2 = 30
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "cookie"
            r1.<init>(r2, r3)
            r2 = 31
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "date"
            r1.<init>(r2, r3)
            r2 = 32
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "etag"
            r1.<init>(r2, r3)
            r2 = 33
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "expect"
            r1.<init>(r2, r3)
            r2 = 34
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "expires"
            r1.<init>(r2, r3)
            r2 = 35
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "from"
            r1.<init>(r2, r3)
            r2 = 36
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "host"
            r1.<init>(r2, r3)
            r2 = 37
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "if-match"
            r1.<init>(r2, r3)
            r2 = 38
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "if-modified-since"
            r1.<init>(r2, r3)
            r2 = 39
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "if-none-match"
            r1.<init>(r2, r3)
            r2 = 40
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "if-range"
            r1.<init>(r2, r3)
            r2 = 41
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "if-unmodified-since"
            r1.<init>(r2, r3)
            r2 = 42
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "last-modified"
            r1.<init>(r2, r3)
            r2 = 43
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "link"
            r1.<init>(r2, r3)
            r2 = 44
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "location"
            r1.<init>(r2, r3)
            r2 = 45
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "max-forwards"
            r1.<init>(r2, r3)
            r2 = 46
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "proxy-authenticate"
            r1.<init>(r2, r3)
            r2 = 47
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "proxy-authorization"
            r1.<init>(r2, r3)
            r2 = 48
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "range"
            r1.<init>(r2, r3)
            r2 = 49
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "referer"
            r1.<init>(r2, r3)
            r2 = 50
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "refresh"
            r1.<init>(r2, r3)
            r2 = 51
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "retry-after"
            r1.<init>(r2, r3)
            r2 = 52
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "server"
            r1.<init>(r2, r3)
            r2 = 53
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "set-cookie"
            r1.<init>(r2, r3)
            r2 = 54
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "strict-transport-security"
            r1.<init>(r2, r3)
            r2 = 55
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "transfer-encoding"
            r1.<init>(r2, r3)
            r2 = 56
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "user-agent"
            r1.<init>(r2, r3)
            r2 = 57
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "vary"
            r1.<init>(r2, r3)
            r2 = 58
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "via"
            r1.<init>(r2, r3)
            r2 = 59
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "www-authenticate"
            r1.<init>(r2, r3)
            r2 = 60
            r0[r2] = r1
            okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE = r0
            okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
            java.util.Map r0 = r0.nameToFirstIndex()
            okhttp3.internal.http2.Hpack.NAME_TO_FIRST_INDEX = r0
            return
    }

    private Hpack() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.Map<okio.ByteString, java.lang.Integer> nameToFirstIndex() {
            r6 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            okhttp3.internal.http2.Header[] r1 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            int r1 = r1.length
            r0.<init>(r1)
            r1 = 0
            okhttp3.internal.http2.Header[] r2 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            int r2 = r2.length
        Lc:
            if (r1 >= r2) goto L2d
            okhttp3.internal.http2.Header[] r3 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            r3 = r3[r1]
            okio.ByteString r3 = r3.name
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L2a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r0
            java.util.Map r4 = (java.util.Map) r4
            okhttp3.internal.http2.Header[] r5 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            r5 = r5[r1]
            okio.ByteString r5 = r5.name
            r4.put(r5, r3)
        L2a:
            int r1 = r1 + 1
            goto Lc
        L2d:
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.lang.String r2 = "unmodifiableMap(result)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public final okio.ByteString checkLowercase(okio.ByteString r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r1 = r6.size()
        La:
            if (r0 >= r1) goto L3c
            byte r2 = r6.getByte(r0)
            r3 = 65
            r4 = 0
            if (r3 > r2) goto L1a
            r3 = 91
            if (r2 >= r3) goto L1a
            r4 = 1
        L1a:
            if (r4 != 0) goto L1f
            int r0 = r0 + 1
            goto La
        L1f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "PROTOCOL_ERROR response malformed: mixed case name: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r6.utf8()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3c:
            return r6
    }

    public final java.util.Map<okio.ByteString, java.lang.Integer> getNAME_TO_FIRST_INDEX() {
            r1 = this;
            java.util.Map<okio.ByteString, java.lang.Integer> r0 = okhttp3.internal.http2.Hpack.NAME_TO_FIRST_INDEX
            return r0
    }

    public final okhttp3.internal.http2.Header[] getSTATIC_HEADER_TABLE() {
            r1 = this;
            okhttp3.internal.http2.Header[] r0 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            return r0
    }
}
