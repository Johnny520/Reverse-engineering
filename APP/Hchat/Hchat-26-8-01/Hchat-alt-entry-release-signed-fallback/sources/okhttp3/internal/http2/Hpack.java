package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
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

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Reader {
        public okhttp3.internal.http2.Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final java.util.List<okhttp3.internal.http2.Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final okio.BufferedSource source;

        public Reader(okio.Source r7, int r8) {
                r6 = this;
                r7.getClass()
                r4 = 4
                r5 = 0
                r3 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public Reader(okio.Source r1, int r2, int r3) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.headerTableSizeSetting = r2
                r0.maxDynamicTableByteCount = r3
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r0.headerList = r2
                okio.BufferedSource r1 = okio.Okio.buffer(r1)
                r0.source = r1
                r1 = 8
                okhttp3.internal.http2.Header[] r1 = new okhttp3.internal.http2.Header[r1]
                r0.dynamicTable = r1
                int r1 = r1.length
                int r1 = r1 + (-1)
                r0.nextHeaderIndex = r1
                return
        }

        public /* synthetic */ Reader(okio.Source r1, int r2, int r3, int r4, gg.g r5) {
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
                if (r0 >= r1) goto L10
                if (r0 != 0) goto Lc
                r2.clearDynamicTable()
                return
            Lc:
                int r1 = r1 - r0
                r2.evictToRecoverBytes(r1)
            L10:
                return
        }

        private final void clearDynamicTable() {
                r2 = this;
                okhttp3.internal.http2.Header[] r0 = r2.dynamicTable
                r1 = 0
                tf.l.x0(r1, r0)
                okhttp3.internal.http2.Header[] r0 = r2.dynamicTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                r2.nextHeaderIndex = r0
                r0 = 0
                r2.headerCount = r0
                r2.dynamicTableByteCount = r0
                return
        }

        private final int dynamicTableIndex(int r2) {
                r1 = this;
                int r0 = r1.nextHeaderIndex
                int r0 = r0 + 1
                int r0 = r0 + r2
                return r0
        }

        private final int evictToRecoverBytes(int r5) {
                r4 = this;
                r0 = 0
                if (r5 <= 0) goto L39
                okhttp3.internal.http2.Header[] r1 = r4.dynamicTable
                int r1 = r1.length
                int r1 = r1 + (-1)
            L8:
                int r2 = r4.nextHeaderIndex
                if (r1 < r2) goto L28
                if (r5 <= 0) goto L28
                okhttp3.internal.http2.Header[] r2 = r4.dynamicTable
                r2 = r2[r1]
                r2.getClass()
                int r2 = r2.hpackSize
                int r5 = r5 - r2
                int r3 = r4.dynamicTableByteCount
                int r3 = r3 - r2
                r4.dynamicTableByteCount = r3
                int r2 = r4.headerCount
                int r2 = r2 + (-1)
                r4.headerCount = r2
                int r0 = r0 + 1
                int r1 = r1 + (-1)
                goto L8
            L28:
                okhttp3.internal.http2.Header[] r5 = r4.dynamicTable
                int r1 = r2 + 1
                int r2 = r2 + 1
                int r2 = r2 + r0
                int r3 = r4.headerCount
                java.lang.System.arraycopy(r5, r1, r5, r2, r3)
                int r5 = r4.nextHeaderIndex
                int r5 = r5 + r0
                r4.nextHeaderIndex = r5
            L39:
                return r0
        }

        private final okio.ByteString getName(int r4) {
                r3 = this;
                boolean r0 = r3.isStaticHeader(r4)
                if (r0 == 0) goto L11
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                r4 = r0[r4]
                okio.ByteString r4 = r4.name
                return r4
            L11:
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                int r0 = r0.length
                int r0 = r4 - r0
                int r0 = r3.dynamicTableIndex(r0)
                if (r0 < 0) goto L2d
                okhttp3.internal.http2.Header[] r1 = r3.dynamicTable
                int r2 = r1.length
                if (r0 >= r2) goto L2d
                r4 = r1[r0]
                r4.getClass()
                okio.ByteString r4 = r4.name
                return r4
            L2d:
                int r4 = r4 + 1
                java.lang.String r0 = "Header index too large "
                j8.o.u(r4, r0)
                r4 = 0
                return r4
        }

        private final void insertIntoDynamicTable(int r6, okhttp3.internal.http2.Header r7) {
                r5 = this;
                java.util.List<okhttp3.internal.http2.Header> r0 = r5.headerList
                r0.add(r7)
                int r0 = r7.hpackSize
                r1 = -1
                if (r6 == r1) goto L18
                okhttp3.internal.http2.Header[] r2 = r5.dynamicTable
                int r3 = r5.dynamicTableIndex(r6)
                r2 = r2[r3]
                r2.getClass()
                int r2 = r2.hpackSize
                int r0 = r0 - r2
            L18:
                int r2 = r5.maxDynamicTableByteCount
                if (r0 <= r2) goto L20
                r5.clearDynamicTable()
                return
            L20:
                int r3 = r5.dynamicTableByteCount
                int r3 = r3 + r0
                int r3 = r3 - r2
                int r2 = r5.evictToRecoverBytes(r3)
                if (r6 != r1) goto L58
                int r6 = r5.headerCount
                int r6 = r6 + 1
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                int r2 = r1.length
                if (r6 <= r2) goto L47
                int r6 = r1.length
                int r6 = r6 * 2
                okhttp3.internal.http2.Header[] r6 = new okhttp3.internal.http2.Header[r6]
                int r2 = r1.length
                int r3 = r1.length
                r4 = 0
                java.lang.System.arraycopy(r1, r4, r6, r2, r3)
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                int r1 = r1.length
                int r1 = r1 + (-1)
                r5.nextHeaderIndex = r1
                r5.dynamicTable = r6
            L47:
                int r6 = r5.nextHeaderIndex
                int r1 = r6 + (-1)
                r5.nextHeaderIndex = r1
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                r1[r6] = r7
                int r6 = r5.headerCount
                int r6 = r6 + 1
                r5.headerCount = r6
                goto L62
            L58:
                int r1 = r5.dynamicTableIndex(r6)
                int r1 = r1 + r2
                int r1 = r1 + r6
                okhttp3.internal.http2.Header[] r6 = r5.dynamicTable
                r6[r1] = r7
            L62:
                int r6 = r5.dynamicTableByteCount
                int r6 = r6 + r0
                r5.dynamicTableByteCount = r6
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
                return r1
            Le:
                r3 = 0
                return r3
        }

        private final int readByte() {
                r2 = this;
                okio.BufferedSource r0 = r2.source
                byte r0 = r0.readByte()
                r1 = 255(0xff, float:3.57E-43)
                int r0 = okhttp3.internal.Util.and(r0, r1)
                return r0
        }

        private final void readIndexedHeader(int r4) {
                r3 = this;
                boolean r0 = r3.isStaticHeader(r4)
                if (r0 == 0) goto L14
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                r4 = r0[r4]
                java.util.List<okhttp3.internal.http2.Header> r0 = r3.headerList
                r0.add(r4)
                return
            L14:
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                int r0 = r0.length
                int r0 = r4 - r0
                int r0 = r3.dynamicTableIndex(r0)
                if (r0 < 0) goto L33
                okhttp3.internal.http2.Header[] r1 = r3.dynamicTable
                int r2 = r1.length
                if (r0 >= r2) goto L33
                java.util.List<okhttp3.internal.http2.Header> r4 = r3.headerList
                r0 = r1[r0]
                r0.getClass()
                r4.add(r0)
                return
            L33:
                int r4 = r4 + 1
                java.lang.String r0 = "Header index too large "
                j8.o.u(r4, r0)
                return
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int r3) {
                r2 = this;
                okio.ByteString r3 = r2.getName(r3)
                okio.ByteString r0 = r2.readByteString()
                okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
                r1.<init>(r3, r0)
                r3 = -1
                r2.insertIntoDynamicTable(r3, r1)
                return
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
                r3 = this;
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okio.ByteString r1 = r3.readByteString()
                okio.ByteString r0 = r0.checkLowercase(r1)
                okio.ByteString r1 = r3.readByteString()
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                r2.<init>(r0, r1)
                r0 = -1
                r3.insertIntoDynamicTable(r0, r2)
                return
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int r4) {
                r3 = this;
                okio.ByteString r4 = r3.getName(r4)
                okio.ByteString r0 = r3.readByteString()
                java.util.List<okhttp3.internal.http2.Header> r1 = r3.headerList
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                r2.<init>(r4, r0)
                r1.add(r2)
                return
        }

        private final void readLiteralHeaderWithoutIndexingNewName() {
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
                java.util.List r0 = tf.m.P1(r0)
                java.util.List<okhttp3.internal.http2.Header> r1 = r2.headerList
                r1.clear()
                return r0
        }

        public final int maxDynamicTableByteCount() {
                r1 = this;
                int r0 = r1.maxDynamicTableByteCount
                return r0
        }

        public final okio.ByteString readByteString() {
                r5 = this;
                int r0 = r5.readByte()
                r1 = r0 & 128(0x80, float:1.8E-43)
                r2 = 128(0x80, float:1.8E-43)
                if (r1 != r2) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                r2 = 127(0x7f, float:1.78E-43)
                int r0 = r5.readInt(r0, r2)
                long r2 = (long) r0
                if (r1 == 0) goto L27
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                okhttp3.internal.http2.Huffman r1 = okhttp3.internal.http2.Huffman.INSTANCE
                okio.BufferedSource r4 = r5.source
                r1.decode(r4, r2, r0)
                okio.ByteString r0 = r0.readByteString()
                return r0
            L27:
                okio.BufferedSource r0 = r5.source
                okio.ByteString r0 = r0.readByteString(r2)
                return r0
        }

        public final void readHeaders() {
                r3 = this;
            L0:
                okio.BufferedSource r0 = r3.source
                boolean r0 = r0.exhausted()
                if (r0 != 0) goto L7c
                okio.BufferedSource r0 = r3.source
                byte r0 = r0.readByte()
                r1 = 255(0xff, float:3.57E-43)
                int r0 = okhttp3.internal.Util.and(r0, r1)
                r1 = 128(0x80, float:1.8E-43)
                if (r0 == r1) goto L77
                r2 = r0 & 128(0x80, float:1.8E-43)
                if (r2 != r1) goto L28
                r1 = 127(0x7f, float:1.78E-43)
                int r0 = r3.readInt(r0, r1)
                int r0 = r0 + (-1)
                r3.readIndexedHeader(r0)
                goto L0
            L28:
                r1 = 64
                if (r0 != r1) goto L30
                r3.readLiteralHeaderWithIncrementalIndexingNewName()
                goto L0
            L30:
                r2 = r0 & 64
                if (r2 != r1) goto L40
                r1 = 63
                int r0 = r3.readInt(r0, r1)
                int r0 = r0 + (-1)
                r3.readLiteralHeaderWithIncrementalIndexingIndexedName(r0)
                goto L0
            L40:
                r1 = r0 & 32
                r2 = 32
                if (r1 != r2) goto L60
                r1 = 31
                int r0 = r3.readInt(r0, r1)
                r3.maxDynamicTableByteCount = r0
                if (r0 < 0) goto L58
                int r1 = r3.headerTableSizeSetting
                if (r0 > r1) goto L58
                r3.adjustDynamicTableByteCount()
                goto L0
            L58:
                java.lang.String r0 = "Invalid dynamic table size update "
                int r1 = r3.maxDynamicTableByteCount
                j8.o.u(r1, r0)
                return
            L60:
                r1 = 16
                if (r0 == r1) goto L73
                if (r0 != 0) goto L67
                goto L73
            L67:
                r1 = 15
                int r0 = r3.readInt(r0, r1)
                int r0 = r0 + (-1)
                r3.readLiteralHeaderWithoutIndexingIndexedName(r0)
                goto L0
            L73:
                r3.readLiteralHeaderWithoutIndexingNewName()
                goto L0
            L77:
                java.lang.String r0 = "index == 0"
                j8.o.y(r0)
            L7c:
                return
        }

        public final int readInt(int r3, int r4) {
                r2 = this;
                r3 = r3 & r4
                if (r3 >= r4) goto L4
                return r3
            L4:
                r3 = 0
            L5:
                int r0 = r2.readByte()
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L14
                r0 = r0 & 127(0x7f, float:1.78E-43)
                int r0 = r0 << r3
                int r4 = r4 + r0
                int r3 = r3 + 7
                goto L5
            L14:
                int r3 = r0 << r3
                int r4 = r4 + r3
                return r4
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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

        public Writer(int r7, okio.Buffer r8) {
                r6 = this;
                r8.getClass()
                r4 = 2
                r5 = 0
                r2 = 0
                r0 = r6
                r1 = r7
                r3 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public Writer(int r1, boolean r2, okio.Buffer r3) {
                r0 = this;
                r3.getClass()
                r0.<init>()
                r0.headerTableSizeSetting = r1
                r0.useCompression = r2
                r0.out = r3
                r2 = 2147483647(0x7fffffff, float:NaN)
                r0.smallestHeaderTableSizeSetting = r2
                r0.maxDynamicTableByteCount = r1
                r1 = 8
                okhttp3.internal.http2.Header[] r1 = new okhttp3.internal.http2.Header[r1]
                r0.dynamicTable = r1
                int r1 = r1.length
                int r1 = r1 + (-1)
                r0.nextHeaderIndex = r1
                return
        }

        public /* synthetic */ Writer(int r1, boolean r2, okio.Buffer r3, int r4, gg.g r5) {
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

        public Writer(okio.Buffer r7) {
                r6 = this;
                r7.getClass()
                r4 = 3
                r5 = 0
                r1 = 0
                r2 = 0
                r0 = r6
                r3 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        private final void adjustDynamicTableByteCount() {
                r2 = this;
                int r0 = r2.maxDynamicTableByteCount
                int r1 = r2.dynamicTableByteCount
                if (r0 >= r1) goto L10
                if (r0 != 0) goto Lc
                r2.clearDynamicTable()
                return
            Lc:
                int r1 = r1 - r0
                r2.evictToRecoverBytes(r1)
            L10:
                return
        }

        private final void clearDynamicTable() {
                r2 = this;
                okhttp3.internal.http2.Header[] r0 = r2.dynamicTable
                r1 = 0
                tf.l.x0(r1, r0)
                okhttp3.internal.http2.Header[] r0 = r2.dynamicTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                r2.nextHeaderIndex = r0
                r0 = 0
                r2.headerCount = r0
                r2.dynamicTableByteCount = r0
                return
        }

        private final int evictToRecoverBytes(int r5) {
                r4 = this;
                r0 = 0
                if (r5 <= 0) goto L4f
                okhttp3.internal.http2.Header[] r1 = r4.dynamicTable
                int r1 = r1.length
                int r1 = r1 + (-1)
            L8:
                int r2 = r4.nextHeaderIndex
                if (r1 < r2) goto L31
                if (r5 <= 0) goto L31
                okhttp3.internal.http2.Header[] r2 = r4.dynamicTable
                r2 = r2[r1]
                r2.getClass()
                int r2 = r2.hpackSize
                int r5 = r5 - r2
                int r2 = r4.dynamicTableByteCount
                okhttp3.internal.http2.Header[] r3 = r4.dynamicTable
                r3 = r3[r1]
                r3.getClass()
                int r3 = r3.hpackSize
                int r2 = r2 - r3
                r4.dynamicTableByteCount = r2
                int r2 = r4.headerCount
                int r2 = r2 + (-1)
                r4.headerCount = r2
                int r0 = r0 + 1
                int r1 = r1 + (-1)
                goto L8
            L31:
                okhttp3.internal.http2.Header[] r5 = r4.dynamicTable
                int r1 = r2 + 1
                int r2 = r2 + 1
                int r2 = r2 + r0
                int r3 = r4.headerCount
                java.lang.System.arraycopy(r5, r1, r5, r2, r3)
                okhttp3.internal.http2.Header[] r5 = r4.dynamicTable
                int r1 = r4.nextHeaderIndex
                int r2 = r1 + 1
                int r1 = r1 + 1
                int r1 = r1 + r0
                r3 = 0
                java.util.Arrays.fill(r5, r2, r1, r3)
                int r5 = r4.nextHeaderIndex
                int r5 = r5 + r0
                r4.nextHeaderIndex = r5
            L4f:
                return r0
        }

        private final void insertIntoDynamicTable(okhttp3.internal.http2.Header r7) {
                r6 = this;
                int r0 = r7.hpackSize
                int r1 = r6.maxDynamicTableByteCount
                if (r0 <= r1) goto La
                r6.clearDynamicTable()
                return
            La:
                int r2 = r6.dynamicTableByteCount
                int r2 = r2 + r0
                int r2 = r2 - r1
                r6.evictToRecoverBytes(r2)
                int r1 = r6.headerCount
                int r1 = r1 + 1
                okhttp3.internal.http2.Header[] r2 = r6.dynamicTable
                int r3 = r2.length
                if (r1 <= r3) goto L2e
                int r1 = r2.length
                int r1 = r1 * 2
                okhttp3.internal.http2.Header[] r1 = new okhttp3.internal.http2.Header[r1]
                int r3 = r2.length
                int r4 = r2.length
                r5 = 0
                java.lang.System.arraycopy(r2, r5, r1, r3, r4)
                okhttp3.internal.http2.Header[] r2 = r6.dynamicTable
                int r2 = r2.length
                int r2 = r2 + (-1)
                r6.nextHeaderIndex = r2
                r6.dynamicTable = r1
            L2e:
                int r1 = r6.nextHeaderIndex
                int r2 = r1 + (-1)
                r6.nextHeaderIndex = r2
                okhttp3.internal.http2.Header[] r2 = r6.dynamicTable
                r2[r1] = r7
                int r7 = r6.headerCount
                int r7 = r7 + 1
                r6.headerCount = r7
                int r7 = r6.dynamicTableByteCount
                int r7 = r7 + r0
                r6.dynamicTableByteCount = r7
                return
        }

        public final void resizeHeaderTable(int r2) {
                r1 = this;
                r1.headerTableSizeSetting = r2
                r0 = 16384(0x4000, float:2.2959E-41)
                int r2 = java.lang.Math.min(r2, r0)
                int r0 = r1.maxDynamicTableByteCount
                if (r0 != r2) goto Ld
                return
            Ld:
                if (r2 >= r0) goto L17
                int r0 = r1.smallestHeaderTableSizeSetting
                int r0 = java.lang.Math.min(r0, r2)
                r1.smallestHeaderTableSizeSetting = r0
            L17:
                r0 = 1
                r1.emitDynamicTableSizeUpdate = r0
                r1.maxDynamicTableByteCount = r2
                r1.adjustDynamicTableByteCount()
                return
        }

        public final void writeByteString(okio.ByteString r5) {
                r4 = this;
                r5.getClass()
                boolean r0 = r4.useCompression
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == 0) goto L30
                okhttp3.internal.http2.Huffman r0 = okhttp3.internal.http2.Huffman.INSTANCE
                int r2 = r0.encodedLength(r5)
                int r3 = r5.size()
                if (r2 >= r3) goto L30
                okio.Buffer r2 = new okio.Buffer
                r2.<init>()
                r0.encode(r5, r2)
                okio.ByteString r5 = r2.readByteString()
                int r0 = r5.size()
                r2 = 128(0x80, float:1.8E-43)
                r4.writeInt(r0, r1, r2)
                okio.Buffer r0 = r4.out
                r0.write(r5)
                return
            L30:
                int r0 = r5.size()
                r2 = 0
                r4.writeInt(r0, r1, r2)
                okio.Buffer r0 = r4.out
                r0.write(r5)
                return
        }

        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r13) {
                r12 = this;
                r13.getClass()
                boolean r0 = r12.emitDynamicTableSizeUpdate
                r1 = 0
                if (r0 == 0) goto L21
                int r0 = r12.smallestHeaderTableSizeSetting
                int r2 = r12.maxDynamicTableByteCount
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L15
                r12.writeInt(r0, r4, r3)
            L15:
                r12.emitDynamicTableSizeUpdate = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r12.smallestHeaderTableSizeSetting = r0
                int r0 = r12.maxDynamicTableByteCount
                r12.writeInt(r0, r4, r3)
            L21:
                int r0 = r13.size()
                r2 = r1
            L26:
                if (r2 >= r0) goto L105
                java.lang.Object r3 = r13.get(r2)
                okhttp3.internal.http2.Header r3 = (okhttp3.internal.http2.Header) r3
                okio.ByteString r4 = r3.name
                okio.ByteString r4 = r4.toAsciiLowercase()
                okio.ByteString r5 = r3.value
                okhttp3.internal.http2.Hpack r6 = okhttp3.internal.http2.Hpack.INSTANCE
                java.util.Map r7 = r6.getNAME_TO_FIRST_INDEX()
                java.lang.Object r7 = r7.get(r4)
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = -1
                if (r7 == 0) goto L78
                int r7 = r7.intValue()
                int r9 = r7 + 1
                r10 = 2
                if (r10 > r9) goto L75
                r10 = 8
                if (r9 >= r10) goto L75
                okhttp3.internal.http2.Header[] r10 = r6.getSTATIC_HEADER_TABLE()
                r10 = r10[r7]
                okio.ByteString r10 = r10.value
                boolean r10 = gg.l.a(r10, r5)
                if (r10 == 0) goto L62
                r6 = r9
                goto L7a
            L62:
                okhttp3.internal.http2.Header[] r6 = r6.getSTATIC_HEADER_TABLE()
                r6 = r6[r9]
                okio.ByteString r6 = r6.value
                boolean r6 = gg.l.a(r6, r5)
                if (r6 == 0) goto L75
                int r7 = r7 + 2
                r6 = r9
                r9 = r7
                goto L7a
            L75:
                r6 = r9
                r9 = r8
                goto L7a
            L78:
                r6 = r8
                r9 = r6
            L7a:
                if (r9 != r8) goto Lc0
                int r7 = r12.nextHeaderIndex
                int r7 = r7 + 1
                okhttp3.internal.http2.Header[] r10 = r12.dynamicTable
                int r10 = r10.length
            L83:
                if (r7 >= r10) goto Lc0
                okhttp3.internal.http2.Header[] r11 = r12.dynamicTable
                r11 = r11[r7]
                r11.getClass()
                okio.ByteString r11 = r11.name
                boolean r11 = gg.l.a(r11, r4)
                if (r11 == 0) goto Lbd
                okhttp3.internal.http2.Header[] r11 = r12.dynamicTable
                r11 = r11[r7]
                r11.getClass()
                okio.ByteString r11 = r11.value
                boolean r11 = gg.l.a(r11, r5)
                if (r11 == 0) goto Laf
                int r9 = r12.nextHeaderIndex
                int r7 = r7 - r9
                okhttp3.internal.http2.Hpack r9 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r9 = r9.getSTATIC_HEADER_TABLE()
                int r9 = r9.length
                int r9 = r9 + r7
                goto Lc0
            Laf:
                if (r6 != r8) goto Lbd
                int r6 = r12.nextHeaderIndex
                int r6 = r7 - r6
                okhttp3.internal.http2.Hpack r11 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r11 = r11.getSTATIC_HEADER_TABLE()
                int r11 = r11.length
                int r6 = r6 + r11
            Lbd:
                int r7 = r7 + 1
                goto L83
            Lc0:
                if (r9 == r8) goto Lca
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.8E-43)
                r12.writeInt(r9, r3, r4)
                goto L101
            Lca:
                r7 = 64
                if (r6 != r8) goto Ldd
                okio.Buffer r6 = r12.out
                r6.writeByte(r7)
                r12.writeByteString(r4)
                r12.writeByteString(r5)
                r12.insertIntoDynamicTable(r3)
                goto L101
            Ldd:
                okio.ByteString r8 = okhttp3.internal.http2.Header.PSEUDO_PREFIX
                boolean r8 = r4.startsWith(r8)
                if (r8 == 0) goto Lf6
                okio.ByteString r8 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
                boolean r4 = gg.l.a(r8, r4)
                if (r4 != 0) goto Lf6
                r3 = 15
                r12.writeInt(r6, r3, r1)
                r12.writeByteString(r5)
                goto L101
            Lf6:
                r4 = 63
                r12.writeInt(r6, r4, r7)
                r12.writeByteString(r5)
                r12.insertIntoDynamicTable(r3)
            L101:
                int r2 = r2 + 1
                goto L26
            L105:
                return
        }

        public final void writeInt(int r2, int r3, int r4) {
                r1 = this;
                okio.Buffer r0 = r1.out
                if (r2 >= r3) goto L9
                r2 = r2 | r4
                r0.writeByte(r2)
                return
            L9:
                r4 = r4 | r3
                r0.writeByte(r4)
                int r2 = r2 - r3
            Le:
                okio.Buffer r3 = r1.out
                r4 = 128(0x80, float:1.8E-43)
                if (r2 < r4) goto L1d
                r0 = r2 & 127(0x7f, float:1.78E-43)
                r4 = r4 | r0
                r3.writeByte(r4)
                int r2 = r2 >>> 7
                goto Le
            L1d:
                r3.writeByte(r2)
                return
        }
    }

    static {
            okhttp3.internal.http2.Hpack r0 = new okhttp3.internal.http2.Hpack
            r0.<init>()
            okhttp3.internal.http2.Hpack.INSTANCE = r0
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
            java.lang.String r3 = ""
            r1.<init>(r2, r3)
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            okio.ByteString r4 = okhttp3.internal.http2.Header.TARGET_METHOD
            java.lang.String r5 = "GET"
            r2.<init>(r4, r5)
            okhttp3.internal.http2.Header r5 = new okhttp3.internal.http2.Header
            java.lang.String r6 = "POST"
            r5.<init>(r4, r6)
            okhttp3.internal.http2.Header r4 = new okhttp3.internal.http2.Header
            okio.ByteString r6 = okhttp3.internal.http2.Header.TARGET_PATH
            java.lang.String r7 = "/"
            r4.<init>(r6, r7)
            r7 = r5
            okhttp3.internal.http2.Header r5 = new okhttp3.internal.http2.Header
            java.lang.String r8 = "/index.html"
            r5.<init>(r6, r8)
            okhttp3.internal.http2.Header r6 = new okhttp3.internal.http2.Header
            okio.ByteString r8 = okhttp3.internal.http2.Header.TARGET_SCHEME
            java.lang.String r9 = "http"
            r6.<init>(r8, r9)
            r9 = r7
            okhttp3.internal.http2.Header r7 = new okhttp3.internal.http2.Header
            java.lang.String r10 = "https"
            r7.<init>(r8, r10)
            okhttp3.internal.http2.Header r8 = new okhttp3.internal.http2.Header
            okio.ByteString r10 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r11 = "200"
            r8.<init>(r10, r11)
            r11 = r9
            okhttp3.internal.http2.Header r9 = new okhttp3.internal.http2.Header
            java.lang.String r12 = "204"
            r9.<init>(r10, r12)
            okhttp3.internal.http2.Header r12 = new okhttp3.internal.http2.Header
            java.lang.String r13 = "206"
            r12.<init>(r10, r13)
            r13 = r11
            okhttp3.internal.http2.Header r11 = new okhttp3.internal.http2.Header
            java.lang.String r14 = "304"
            r11.<init>(r10, r14)
            r14 = r12
            okhttp3.internal.http2.Header r12 = new okhttp3.internal.http2.Header
            java.lang.String r15 = "400"
            r12.<init>(r10, r15)
            r15 = r13
            okhttp3.internal.http2.Header r13 = new okhttp3.internal.http2.Header
            r62 = r0
            java.lang.String r0 = "404"
            r13.<init>(r10, r0)
            r0 = r14
            okhttp3.internal.http2.Header r14 = new okhttp3.internal.http2.Header
            r16 = r0
            java.lang.String r0 = "500"
            r14.<init>(r10, r0)
            r0 = r15
            okhttp3.internal.http2.Header r15 = new okhttp3.internal.http2.Header
            java.lang.String r10 = "accept-charset"
            r15.<init>(r10, r3)
            okhttp3.internal.http2.Header r10 = new okhttp3.internal.http2.Header
            r17 = r0
            java.lang.String r0 = "accept-encoding"
            r18 = r1
            java.lang.String r1 = "gzip, deflate"
            r10.<init>(r0, r1)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            java.lang.String r1 = "accept-language"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r19 = r0
            java.lang.String r0 = "accept-ranges"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r20 = r1
            java.lang.String r1 = "accept"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r21 = r0
            java.lang.String r0 = "access-control-allow-origin"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r22 = r1
            java.lang.String r1 = "age"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r23 = r0
            java.lang.String r0 = "allow"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r24 = r1
            java.lang.String r1 = "authorization"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r25 = r0
            java.lang.String r0 = "cache-control"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r26 = r1
            java.lang.String r1 = "content-disposition"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r27 = r0
            java.lang.String r0 = "content-encoding"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r28 = r1
            java.lang.String r1 = "content-language"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r29 = r0
            java.lang.String r0 = "content-length"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r30 = r1
            java.lang.String r1 = "content-location"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r31 = r0
            java.lang.String r0 = "content-range"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r32 = r1
            java.lang.String r1 = "content-type"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r33 = r0
            java.lang.String r0 = "cookie"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r34 = r1
            java.lang.String r1 = "date"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r35 = r0
            java.lang.String r0 = "etag"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r36 = r1
            java.lang.String r1 = "expect"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r37 = r0
            java.lang.String r0 = "expires"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r38 = r1
            java.lang.String r1 = "from"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r39 = r0
            java.lang.String r0 = "host"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r40 = r1
            java.lang.String r1 = "if-match"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r41 = r0
            java.lang.String r0 = "if-modified-since"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r42 = r1
            java.lang.String r1 = "if-none-match"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r43 = r0
            java.lang.String r0 = "if-range"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r44 = r1
            java.lang.String r1 = "if-unmodified-since"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r45 = r0
            java.lang.String r0 = "last-modified"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r46 = r1
            java.lang.String r1 = "link"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r47 = r0
            java.lang.String r0 = "location"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r48 = r1
            java.lang.String r1 = "max-forwards"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r49 = r0
            java.lang.String r0 = "proxy-authenticate"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r50 = r1
            java.lang.String r1 = "proxy-authorization"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r51 = r0
            java.lang.String r0 = "range"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r52 = r1
            java.lang.String r1 = "referer"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r53 = r0
            java.lang.String r0 = "refresh"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r54 = r1
            java.lang.String r1 = "retry-after"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r55 = r0
            java.lang.String r0 = "server"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r56 = r1
            java.lang.String r1 = "set-cookie"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r57 = r0
            java.lang.String r0 = "strict-transport-security"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r58 = r1
            java.lang.String r1 = "transfer-encoding"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r59 = r0
            java.lang.String r0 = "user-agent"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r60 = r1
            java.lang.String r1 = "vary"
            r0.<init>(r1, r3)
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            r61 = r0
            java.lang.String r0 = "via"
            r1.<init>(r0, r3)
            okhttp3.internal.http2.Header r0 = new okhttp3.internal.http2.Header
            r63 = r1
            java.lang.String r1 = "www-authenticate"
            r0.<init>(r1, r3)
            r1 = r16
            r16 = r10
            r10 = r1
            r3 = r17
            r1 = r18
            r17 = r19
            r18 = r20
            r19 = r21
            r20 = r22
            r21 = r23
            r22 = r24
            r23 = r25
            r24 = r26
            r25 = r27
            r26 = r28
            r27 = r29
            r28 = r30
            r29 = r31
            r30 = r32
            r31 = r33
            r32 = r34
            r33 = r35
            r34 = r36
            r35 = r37
            r36 = r38
            r37 = r39
            r38 = r40
            r39 = r41
            r40 = r42
            r41 = r43
            r42 = r44
            r43 = r45
            r44 = r46
            r45 = r47
            r46 = r48
            r47 = r49
            r48 = r50
            r49 = r51
            r50 = r52
            r51 = r53
            r52 = r54
            r53 = r55
            r54 = r56
            r55 = r57
            r56 = r58
            r57 = r59
            r58 = r60
            r59 = r61
            r60 = r63
            r61 = r0
            okhttp3.internal.http2.Header[] r0 = new okhttp3.internal.http2.Header[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61}
            okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE = r0
            java.util.Map r0 = r62.nameToFirstIndex()
            okhttp3.internal.http2.Hpack.NAME_TO_FIRST_INDEX = r0
            return
    }

    private Hpack() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.Map<okio.ByteString, java.lang.Integer> nameToFirstIndex() {
            r5 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            okhttp3.internal.http2.Header[] r1 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            int r2 = r1.length
            r0.<init>(r2)
            int r1 = r1.length
            r2 = 0
        La:
            if (r2 >= r1) goto L26
            okhttp3.internal.http2.Header[] r3 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            r4 = r3[r2]
            okio.ByteString r4 = r4.name
            boolean r4 = r0.containsKey(r4)
            if (r4 != 0) goto L23
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3 = r3[r2]
            okio.ByteString r3 = r3.name
            r0.put(r3, r4)
        L23:
            int r2 = r2 + 1
            goto La
        L26:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            r0.getClass()
            return r0
    }

    public final okio.ByteString checkLowercase(okio.ByteString r5) {
            r4 = this;
            r5.getClass()
            int r0 = r5.size()
            r1 = 0
        L8:
            if (r1 >= r0) goto L25
            byte r2 = r5.getByte(r1)
            r3 = 65
            if (r3 > r2) goto L22
            r3 = 91
            if (r2 < r3) goto L17
            goto L22
        L17:
            java.lang.String r0 = "PROTOCOL_ERROR response malformed: mixed case name: "
            java.lang.String r5 = r5.utf8()
            okio.a.g(r5, r0)
            r5 = 0
            return r5
        L22:
            int r1 = r1 + 1
            goto L8
        L25:
            return r5
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
