package okhttp3.internal.http2;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.C3193a;
import okio.Okio;
import okio.Source;
import p136j8.C2104o;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        Header header = new Header(Header.TARGET_AUTHORITY, HttpUrl.FRAGMENT_ENCODE_SET);
        ByteString byteString = Header.TARGET_METHOD;
        Header header2 = new Header(byteString, "GET");
        Header header3 = new Header(byteString, "POST");
        ByteString byteString2 = Header.TARGET_PATH;
        Header header4 = new Header(byteString2, "/");
        Header header5 = new Header(byteString2, "/index.html");
        ByteString byteString3 = Header.TARGET_SCHEME;
        Header header6 = new Header(byteString3, "http");
        Header header7 = new Header(byteString3, "https");
        ByteString byteString4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept-ranges", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept", HttpUrl.FRAGMENT_ENCODE_SET), new Header("access-control-allow-origin", HttpUrl.FRAGMENT_ENCODE_SET), new Header("age", HttpUrl.FRAGMENT_ENCODE_SET), new Header("allow", HttpUrl.FRAGMENT_ENCODE_SET), new Header("authorization", HttpUrl.FRAGMENT_ENCODE_SET), new Header("cache-control", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-disposition", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-encoding", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-language", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-length", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-location", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-type", HttpUrl.FRAGMENT_ENCODE_SET), new Header("cookie", HttpUrl.FRAGMENT_ENCODE_SET), new Header("date", HttpUrl.FRAGMENT_ENCODE_SET), new Header("etag", HttpUrl.FRAGMENT_ENCODE_SET), new Header("expect", HttpUrl.FRAGMENT_ENCODE_SET), new Header("expires", HttpUrl.FRAGMENT_ENCODE_SET), new Header("from", HttpUrl.FRAGMENT_ENCODE_SET), new Header("host", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-match", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-modified-since", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-none-match", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-unmodified-since", HttpUrl.FRAGMENT_ENCODE_SET), new Header("last-modified", HttpUrl.FRAGMENT_ENCODE_SET), new Header("link", HttpUrl.FRAGMENT_ENCODE_SET), new Header("location", HttpUrl.FRAGMENT_ENCODE_SET), new Header("max-forwards", HttpUrl.FRAGMENT_ENCODE_SET), new Header("proxy-authenticate", HttpUrl.FRAGMENT_ENCODE_SET), new Header("proxy-authorization", HttpUrl.FRAGMENT_ENCODE_SET), new Header("range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("referer", HttpUrl.FRAGMENT_ENCODE_SET), new Header("refresh", HttpUrl.FRAGMENT_ENCODE_SET), new Header("retry-after", HttpUrl.FRAGMENT_ENCODE_SET), new Header("server", HttpUrl.FRAGMENT_ENCODE_SET), new Header("set-cookie", HttpUrl.FRAGMENT_ENCODE_SET), new Header("strict-transport-security", HttpUrl.FRAGMENT_ENCODE_SET), new Header("transfer-encoding", HttpUrl.FRAGMENT_ENCODE_SET), new Header("user-agent", HttpUrl.FRAGMENT_ENCODE_SET), new Header("vary", HttpUrl.FRAGMENT_ENCODE_SET), new Header("via", HttpUrl.FRAGMENT_ENCODE_SET), new Header("www-authenticate", HttpUrl.FRAGMENT_ENCODE_SET)};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Hpack() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Map<ByteString, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i9].name)) {
                linkedHashMap.put(headerArr2[i9].name, Integer.valueOf(i9));
            }
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString checkLowercase(ByteString byteString) throws IOException {
        byteString.getClass();
        int size = byteString.size();
        for (int i9 = 0; i9 < size; i9++) {
            byte b10 = byteString.getByte(i9);
            if (65 <= b10 && b10 < 91) {
                C3193a.m6818g(byteString.utf8(), "PROTOCOL_ERROR response malformed: mixed case name: ");
                return null;
            }
        }
        return byteString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<ByteString, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Writer(int i9, boolean z9, Buffer buffer) {
            buffer.getClass();
            this.headerTableSizeSetting = i9;
            this.useCompression = z9;
            this.out = buffer;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i9;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r1.length - 1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void adjustDynamicTableByteCount() {
            int i9 = this.maxDynamicTableByteCount;
            int i10 = this.dynamicTableByteCount;
            if (i9 < i10) {
                if (i9 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i10 - i9);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            AbstractC4165l.m8387v0(0, headerArr.length, null, headerArr);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x0008 */
        private final int evictToRecoverBytes(int i9) {
            int i10;
            int i11 = 0;
            if (i9 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || i9 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    header.getClass();
                    i9 -= header.hpackSize;
                    int i12 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    header2.getClass();
                    this.dynamicTableByteCount = i12 - header2.hpackSize;
                    this.headerCount--;
                    i11++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i13 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i13 + 1, i13 + 1 + i11, (Object) null);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void insertIntoDynamicTable(Header header) {
            int i9 = header.hpackSize;
            int i10 = this.maxDynamicTableByteCount;
            if (i9 > i10) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i9) - i10);
            int i11 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i11 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i12 = this.nextHeaderIndex;
            this.nextHeaderIndex = i12 - 1;
            this.dynamicTable[i12] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void resizeHeaderTable(int i9) {
            this.headerTableSizeSetting = i9;
            int iMin = Math.min(i9, 16384);
            int i10 = this.maxDynamicTableByteCount;
            if (i10 == iMin) {
                return;
            }
            if (iMin < i10) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void writeByteString(ByteString byteString) {
            byteString.getClass();
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(byteString) < byteString.size()) {
                    Buffer buffer = new Buffer();
                    huffman.encode(byteString, buffer);
                    ByteString byteString2 = buffer.readByteString();
                    writeInt(byteString2.size(), 127, 128);
                    this.out.write(byteString2);
                    return;
                }
            }
            writeInt(byteString.size(), 127, 0);
            this.out.write(byteString);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void writeHeaders(List<Header> list) {
            int length;
            int length2;
            list.getClass();
            if (this.emitDynamicTableSizeUpdate) {
                int i9 = this.smallestHeaderTableSizeSetting;
                if (i9 < this.maxDynamicTableByteCount) {
                    writeInt(i9, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Header header = list.get(i10);
                ByteString asciiLowercase = header.name.toAsciiLowercase();
                ByteString byteString = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(asciiLowercase);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (AbstractC1416l.m3825a(hpack.getSTATIC_HEADER_TABLE()[iIntValue].value, byteString)) {
                        length = length2;
                    } else if (AbstractC1416l.m3825a(hpack.getSTATIC_HEADER_TABLE()[length2].value, byteString)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i11 = this.nextHeaderIndex + 1;
                    int length3 = this.dynamicTable.length;
                    while (true) {
                        if (i11 >= length3) {
                            break;
                        }
                        Header header2 = this.dynamicTable[i11];
                        header2.getClass();
                        if (AbstractC1416l.m3825a(header2.name, asciiLowercase)) {
                            Header header3 = this.dynamicTable[i11];
                            header3.getClass();
                            if (AbstractC1416l.m3825a(header3.value, byteString)) {
                                length2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i11 - this.nextHeaderIndex);
                                break;
                            } else if (length == -1) {
                                length = (i11 - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                        i11++;
                    }
                }
                if (length2 != -1) {
                    writeInt(length2, 127, 128);
                } else if (length == -1) {
                    this.out.writeByte(64);
                    writeByteString(asciiLowercase);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                } else if (!asciiLowercase.startsWith(Header.PSEUDO_PREFIX) || AbstractC1416l.m3825a(Header.TARGET_AUTHORITY, asciiLowercase)) {
                    writeInt(length, 63, 64);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                } else {
                    writeInt(length, 15, 0);
                    writeByteString(byteString);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void writeInt(int i9, int i10, int i11) {
            Buffer buffer = this.out;
            if (i9 < i10) {
                buffer.writeByte(i9 | i11);
                return;
            }
            buffer.writeByte(i11 | i10);
            int i12 = i9 - i10;
            while (true) {
                Buffer buffer2 = this.out;
                if (i12 < 128) {
                    buffer2.writeByte(i12);
                    return;
                } else {
                    buffer2.writeByte(128 | (i12 & 127));
                    i12 >>>= 7;
                }
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(Buffer buffer) {
            this(0, false, buffer, 3, null);
            buffer.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i9, Buffer buffer) {
            this(i9, false, buffer, 2, null);
            buffer.getClass();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (4096 int) : (r1v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (r3v0 okio.Buffer)
 A[MD:(int, boolean, okio.Buffer):void (m)] (LINE:34) call: okhttp3.internal.http2.Hpack.Writer.<init>(int, boolean, okio.Buffer):void type: THIS */
        public /* synthetic */ Writer(int i9, boolean z9, Buffer buffer, int i10, AbstractC1411g abstractC1411g) {
            this((i10 & 1) != 0 ? 4096 : i9, (i10 & 2) != 0 ? true : z9, buffer);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final BufferedSource source;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Reader(Source source, int i9, int i10) {
            source.getClass();
            this.headerTableSizeSetting = i9;
            this.maxDynamicTableByteCount = i10;
            this.headerList = new ArrayList();
            this.source = Okio.buffer(source);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r1.length - 1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void adjustDynamicTableByteCount() {
            int i9 = this.maxDynamicTableByteCount;
            int i10 = this.dynamicTableByteCount;
            if (i9 < i10) {
                if (i9 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i10 - i9);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            AbstractC4165l.m8387v0(0, headerArr.length, null, headerArr);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final int dynamicTableIndex(int i9) {
            return this.nextHeaderIndex + 1 + i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x0008 */
        private final int evictToRecoverBytes(int i9) {
            int i10;
            int i11 = 0;
            if (i9 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || i9 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    header.getClass();
                    int i12 = header.hpackSize;
                    i9 -= i12;
                    this.dynamicTableByteCount -= i12;
                    this.headerCount--;
                    i11++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.headerCount);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final ByteString getName(int i9) throws IOException {
            if (isStaticHeader(i9)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i9].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(i9 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    Header header = headerArr[iDynamicTableIndex];
                    header.getClass();
                    return header.name;
                }
            }
            C2104o.m5295u(i9 + 1, "Header index too large ");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void insertIntoDynamicTable(int i9, Header header) {
            this.headerList.add(header);
            int i10 = header.hpackSize;
            if (i9 != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i9)];
                header2.getClass();
                i10 -= header2.hpackSize;
            }
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i10) - i11);
            if (i9 == -1) {
                int i12 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i12 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i13 = this.nextHeaderIndex;
                this.nextHeaderIndex = i13 - 1;
                this.dynamicTable[i13] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[dynamicTableIndex(i9) + iEvictToRecoverBytes + i9] = header;
            }
            this.dynamicTableByteCount += i10;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final boolean isStaticHeader(int i9) {
            return i9 >= 0 && i9 <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final int readByte() {
            return Util.and(this.source.readByte(), 255);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void readIndexedHeader(int i9) throws IOException {
            if (isStaticHeader(i9)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i9]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i9 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[iDynamicTableIndex];
                    header.getClass();
                    list.add(header);
                    return;
                }
            }
            C2104o.m5295u(i9 + 1, "Header index too large ");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i9) {
            insertIntoDynamicTable(-1, new Header(getName(i9), readByteString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void readLiteralHeaderWithoutIndexingIndexedName(int i9) throws IOException {
            this.headerList.add(new Header(getName(i9), readByteString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<Header> getAndResetHeaderList() {
            List<Header> listM8407P1 = AbstractC4166m.m8407P1(this.headerList);
            this.headerList.clear();
            return listM8407P1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ByteString readByteString() {
            int i9 = readByte();
            boolean z9 = (i9 & 128) == 128;
            long j3 = readInt(i9, 127);
            if (!z9) {
                return this.source.readByteString(j3);
            }
            Buffer buffer = new Buffer();
            Huffman.INSTANCE.decode(this.source, j3, buffer);
            return buffer.readByteString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void readHeaders() throws IOException {
            while (!this.source.exhausted()) {
                int iAnd = Util.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    C2104o.m5299y("index == 0");
                    return;
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, 63) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i9 = readInt(iAnd, 31);
                    this.maxDynamicTableByteCount = i9;
                    if (i9 < 0 || i9 > this.headerTableSizeSetting) {
                        C2104o.m5295u(this.maxDynamicTableByteCount, "Invalid dynamic table size update ");
                        return;
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int readInt(int i9, int i10) {
            int i11 = i9 & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                int i13 = readByte();
                if ((i13 & 128) == 0) {
                    return i10 + (i13 << i12);
                }
                i10 += (i13 & 127) << i12;
                i12 += 7;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(Source source, int i9) {
            this(source, i9, 0, 4, null);
            source.getClass();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 okio.Source)
  (r2v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (r2v0 int) : (r3v0 int))
 A[MD:(okio.Source, int, int):void (m)] (LINE:37) call: okhttp3.internal.http2.Hpack.Reader.<init>(okio.Source, int, int):void type: THIS */
        public /* synthetic */ Reader(Source source, int i9, int i10, int i11, AbstractC1411g abstractC1411g) {
            this(source, i9, (i11 & 4) != 0 ? i9 : i10);
        }
    }
}
