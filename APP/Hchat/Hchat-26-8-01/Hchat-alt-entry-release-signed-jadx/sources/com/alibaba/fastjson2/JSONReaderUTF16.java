package com.alibaba.fastjson2;

import bsh.ParserConstants;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.NameCacheEntry;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okhttp3.internal.p221ws.WebSocketProtocol;
import okio.internal.Buffer;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONReaderUTF16 extends JSONReader {
    static final long CHAR_MASK;
    private int cacheIndex;
    protected final char[] chars;
    protected final int end;
    private Closeable input;
    protected final int length;
    private int nameBegin;
    private int nameEnd;
    private int nameLength;
    private int referenceBegin;
    protected final int start;
    protected final String str;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        CHAR_MASK = JDKUtils.BIG_ENDIAN ? 71777214294589695L : -71777214294589696L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSONReaderUTF16(JSONReader.Context context, InputStream inputStream) {
        super(context, false);
        int i9 = 0;
        this.cacheIndex = -1;
        this.input = inputStream;
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        andSet = andSet == null ? new byte[context.bufferSize] : andSet;
        int i10 = 0;
        while (true) {
            try {
                try {
                    int i11 = inputStream.read(andSet, i10, andSet.length - i10);
                    if (i11 == -1) {
                        break;
                    }
                    i10 += i11;
                    if (i10 == andSet.length) {
                        andSet = Arrays.copyOf(andSet, andSet.length + context.bufferSize);
                    }
                } catch (IOException e6) {
                    throw new JSONException("read error", e6);
                }
            } catch (Throwable th2) {
                JSONFactory.BYTES_UPDATER.lazySet(cacheItem, andSet);
                throw th2;
            }
        }
        if (i10 % 2 == 1) {
            throw new JSONException("illegal input utf16 bytes, length " + i10);
        }
        int i12 = i10 / 2;
        char[] cArr = new char[i12];
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            cArr[i14] = (char) (((andSet[i13] & 255) << 8) | (andSet[i13 + 1] & 255));
            i13 += 2;
            i14++;
        }
        JSONFactory.BYTES_UPDATER.lazySet(cacheItem, andSet);
        this.str = null;
        this.chars = cArr;
        this.offset = 0;
        this.length = i12;
        this.start = 0;
        this.end = i12;
        if (i12 == 0) {
            this.f1929ch = (char) 26;
            return;
        }
        char c10 = cArr[0];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            i9++;
            if (i9 >= i12) {
                this.f1929ch = (char) 26;
                return;
            }
            c10 = cArr[i9];
        }
        this.f1929ch = c10;
        this.offset++;
        if (c10 == 65534 || c10 == 65279) {
            next();
        }
        if (this.f1929ch == '/') {
            skipComment();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getInt(char[] cArr, int i9) {
        long j3 = JDKUtils.UNSAFE.getLong(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + ((long) (i9 << 1)));
        if ((CHAR_MASK & j3) != 0) {
            return 0;
        }
        if (JDKUtils.BIG_ENDIAN) {
            j3 >>= 8;
        }
        return (int) (((j3 & 71776119061217280L) >> 24) | ((16711680 & j3) >> 8) | (255 & j3) | ((1095216660480L & j3) >> 16));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long getLong(char[] cArr, int i9) {
        long j3 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + ((long) (i9 << 1));
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = unsafe.getLong(cArr, j3);
        long j5 = unsafe.getLong(cArr, j3 + 8);
        if (((j4 | j5) & CHAR_MASK) != 0) {
            return 0L;
        }
        if (JDKUtils.BIG_ENDIAN) {
            j4 >>= 8;
            j5 >>= 8;
        }
        return ((j5 & 71776119061217280L) << 8) | ((j4 & 71776119061217280L) >> 24) | (j4 & 255) | ((j4 & 16711680) >> 8) | ((j4 & 1095216660480L) >> 16) | ((255 & j5) << 32) | ((j5 & 16711680) << 24) | ((j5 & 1095216660480L) << 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isReference0(char[] cArr, int i9, int i10, char c10) {
        int i11;
        int i12;
        char c11;
        int i13 = i9 + 6;
        char c12 = cArr[i13];
        while (c12 <= ' ' && ((1 << c12) & 4294981377L) != 0) {
            i13++;
            if (i13 >= i10) {
                return false;
            }
            c12 = cArr[i13];
        }
        if (c12 == ':' && (i11 = i13 + 1) < i10) {
            char c13 = cArr[i11];
            while (c13 <= ' ' && ((1 << c13) & 4294981377L) != 0) {
                i11++;
                if (i11 >= i10) {
                    return false;
                }
                c13 = cArr[i11];
            }
            if (c13 == c10 && ((i12 = i11 + 1) >= i10 || (c11 = cArr[i12]) == '$' || c11 == '.' || c11 == '@')) {
                this.referenceBegin = i11;
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x006e -> B:24:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void skipString() {
        int i9;
        char c10;
        boolean z9;
        int i10;
        char cChar1;
        char c11 = this.f1929ch;
        int i11 = this.offset;
        char[] cArr = this.chars;
        int i12 = i11 + 1;
        char c12 = cArr[i11];
        while (true) {
            if (c12 != '\\') {
                int i13 = this.end;
                if (c12 != c11) {
                    if (i12 >= i13) {
                        break;
                    }
                    i10 = i12 + 1;
                    cChar1 = cArr[i12];
                } else if (i12 < i13) {
                    i9 = i12 + 1;
                    c10 = cArr[i12];
                }
            } else {
                if (i12 >= this.end) {
                    C0086a.m464w(info("illegal string, end"));
                    return;
                }
                i10 = i12 + 1;
                char c13 = cArr[i12];
                if (c13 == '\\' || c13 == '\"') {
                    i12 += 2;
                    c12 = cArr[i10];
                } else if (c13 == 'u') {
                    int i14 = i12 + 5;
                    i12 += 6;
                    c12 = cArr[i14];
                } else {
                    cChar1 = char1(c13);
                }
            }
            char c14 = cChar1;
            i12 = i10;
            c12 = c14;
        }
        c10 = 26;
        if (c10 > ' ' && ((1 << c10) & 4294981377L) != 0) {
            i9 = i12 + 1;
            c10 = cArr[i12];
            i12 = i9;
            if (c10 > ' ') {
            }
            if (c10 != ',') {
            }
            this.comma = z9;
            if (z9) {
            }
            this.f1929ch = c10;
            this.offset = i12;
        }
        z9 = c10 != ',';
        this.comma = z9;
        if (z9) {
            if (i12 >= this.end) {
                this.f1929ch = (char) 26;
                this.offset = i12;
                return;
            }
            c10 = cArr[i12];
            while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
                i12++;
                if (i12 >= this.end) {
                    this.f1929ch = (char) 26;
                    this.offset = i12;
                    return;
                }
                c10 = cArr[i12];
            }
            i12++;
        }
        this.f1929ch = c10;
        this.offset = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i9 = this.cacheIndex;
        if (i9 != -1) {
            char[] cArr = this.chars;
            if (cArr.length < 1048576) {
                JSONFactory.CHARS_UPDATER.lazySet(JSONFactory.CACHE_ITEMS[i9], cArr);
            }
        }
        Closeable closeable = this.input;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String getFieldName() {
        /*
            r9 = this;
            boolean r0 = r9.nameEscape
            if (r0 != 0) goto L1e
            java.lang.String r0 = r9.str
            if (r0 == 0) goto L11
            int r1 = r9.nameBegin
            int r2 = r9.nameEnd
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
        L11:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r9.chars
            int r2 = r9.nameBegin
            int r3 = r9.nameEnd
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L1e:
            int r0 = r9.nameLength
            char[] r0 = new char[r0]
            char[] r1 = r9.chars
            int r2 = r9.nameBegin
            r3 = 0
        L27:
            int r4 = r9.nameEnd
            if (r2 >= r4) goto L88
            char r4 = r1[r2]
            r5 = 34
            r6 = 92
            if (r4 != r6) goto L7e
            int r4 = r2 + 1
            char r7 = r1[r4]
            if (r7 == r5) goto L7b
            r5 = 58
            if (r7 == r5) goto L7b
            r5 = 64
            if (r7 == r5) goto L7b
            if (r7 == r6) goto L7b
            r5 = 117(0x75, float:1.64E-43)
            if (r7 == r5) goto L66
            r5 = 120(0x78, float:1.68E-43)
            if (r7 == r5) goto L59
            switch(r7) {
                case 42: goto L7b;
                case 43: goto L7b;
                case 44: goto L7b;
                case 45: goto L7b;
                case 46: goto L7b;
                case 47: goto L7b;
                default: goto L4e;
            }
        L4e:
            switch(r7) {
                case 60: goto L7b;
                case 61: goto L7b;
                case 62: goto L7b;
                default: goto L51;
            }
        L51:
            char r2 = r9.char1(r7)
            r8 = r4
            r4 = r2
            r2 = r8
            goto L81
        L59:
            int r4 = r2 + 2
            char r4 = r1[r4]
            int r2 = r2 + 3
            char r5 = r1[r2]
            char r4 = com.alibaba.fastjson2.JSONReader.char2(r4, r5)
            goto L81
        L66:
            int r4 = r2 + 2
            char r4 = r1[r4]
            int r5 = r2 + 3
            char r5 = r1[r5]
            int r6 = r2 + 4
            char r6 = r1[r6]
            int r2 = r2 + 5
            char r7 = r1[r2]
            char r4 = com.alibaba.fastjson2.JSONReader.char4(r4, r5, r6, r7)
            goto L81
        L7b:
            r2 = r4
            r4 = r7
            goto L81
        L7e:
            if (r4 != r5) goto L81
            goto L88
        L81:
            r0[r3] = r4
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L27
        L88:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.getFieldName():java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long getNameHashCodeLCase() {
        char c10;
        char c11;
        long j3;
        long j4;
        int i9 = this.nameBegin;
        char[] cArr = this.chars;
        char c12 = '\'';
        char c13 = '\"';
        char c14 = (i9 <= 0 || cArr[i9 + (-1)] != '\'') ? '\"' : '\'';
        int i10 = 0;
        long j5 = 0;
        while (i9 < this.end) {
            char cChar4 = cArr[i9];
            if (cChar4 != '\\') {
                if (cChar4 == c14) {
                }
                if (j5 != 0) {
                    return j5;
                }
                long j10 = Fnv.MAGIC_HASH_CODE;
                while (i9 < this.end) {
                    char cChar42 = cArr[i9];
                    if (cChar42 == '\\') {
                        int i11 = i9 + 1;
                        char c15 = cArr[i11];
                        if (c15 == 'u') {
                            char c16 = cArr[i9 + 2];
                            char c17 = cArr[i9 + 3];
                            char c18 = cArr[i9 + 4];
                            i9 += 5;
                            cChar42 = JSONReader.char4(c16, c17, c18, cArr[i9]);
                        } else if (c15 != 'x') {
                            cChar42 = char1(c15);
                            i9 = i11;
                        } else {
                            char c19 = cArr[i9 + 2];
                            i9 += 3;
                            cChar42 = JSONReader.char2(c19, cArr[i9]);
                        }
                    } else if (cChar42 == c14) {
                        return j10;
                    }
                    i9++;
                    if ((cChar42 != '_' && cChar42 != '-' && cChar42 != ' ') || (c10 = cArr[i9]) == c13 || c10 == c12 || c10 == cChar42) {
                        if (cChar42 >= 'A' && cChar42 <= 'Z') {
                            cChar42 = (char) (cChar42 + ' ');
                        }
                        j10 = Fnv.MAGIC_PRIME * (((long) cChar42) ^ j10);
                        c12 = '\'';
                        c13 = '\"';
                    }
                }
                return j10;
            }
            int i12 = i9 + 1;
            char c20 = cArr[i12];
            if (c20 == 'u') {
                char c21 = cArr[i9 + 2];
                char c22 = cArr[i9 + 3];
                char c23 = cArr[i9 + 4];
                i9 += 5;
                cChar4 = JSONReader.char4(c21, c22, c23, cArr[i9]);
            } else if (c20 != 'x') {
                cChar4 = char1(c20);
                i9 = i12;
            } else {
                char c24 = cArr[i9 + 2];
                i9 += 3;
                cChar4 = JSONReader.char2(c24, cArr[i9]);
            }
            if (cChar4 > 255 || i10 >= 8 || (i10 == 0 && cChar4 == 0)) {
                i9 = this.nameBegin;
                j5 = 0;
                if (j5 != 0) {
                }
            } else {
                if ((cChar4 != '_' && cChar4 != '-' && cChar4 != ' ') || (c11 = cArr[i9 + 1]) == '\"' || c11 == '\'' || c11 == cChar4) {
                    if (cChar4 >= 'A' && cChar4 <= 'Z') {
                        cChar4 = (char) (cChar4 + ' ');
                    }
                    switch (i10) {
                        case 0:
                            j5 = (byte) cChar4;
                            break;
                        case 1:
                            j3 = ((byte) cChar4) << 8;
                            j4 = 255;
                            j5 = (j5 & j4) + j3;
                            break;
                        case 2:
                            j3 = ((byte) cChar4) << JSONB.Constants.BC_INT32_NUM_16;
                            j4 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                            j5 = (j5 & j4) + j3;
                            break;
                        case 3:
                            j3 = ((byte) cChar4) << 24;
                            j4 = 16777215;
                            j5 = (j5 & j4) + j3;
                            break;
                        case 4:
                            j3 = ((long) ((byte) cChar4)) << 32;
                            j4 = 4294967295L;
                            j5 = (j5 & j4) + j3;
                            break;
                        case 5:
                            j3 = ((long) ((byte) cChar4)) << 40;
                            j4 = 1099511627775L;
                            j5 = (j5 & j4) + j3;
                            break;
                        case 6:
                            j3 = ((long) ((byte) cChar4)) << 48;
                            j4 = 281474976710655L;
                            j5 = (j5 & j4) + j3;
                            break;
                        case 7:
                            j3 = ((long) ((byte) cChar4)) << 56;
                            j4 = 72057594037927935L;
                            j5 = (j5 & j4) + j3;
                            break;
                    }
                    i10++;
                }
                i9++;
            }
        }
        if (j5 != 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final int getRawInt() {
        int i9 = this.offset;
        int i10 = i9 + 3;
        char[] cArr = this.chars;
        if (i10 < cArr.length) {
            return getInt(cArr, i9 - 1);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final long getRawLong() {
        int i9 = this.offset;
        int i10 = i9 + 7;
        char[] cArr = this.chars;
        if (i10 < cArr.length) {
            return getLong(cArr, i9 - 1);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public String getString() {
        String str = this.stringValue;
        if (str != null) {
            return str;
        }
        int i9 = this.nameEnd;
        int i10 = this.nameBegin;
        int i11 = i9 - i10;
        if (!this.nameEscape) {
            return new String(this.chars, i10, i11);
        }
        char[] cArr = new char[this.nameLength];
        int i12 = 0;
        while (true) {
            char[] cArr2 = this.chars;
            char cChar4 = cArr2[i10];
            if (cChar4 == '\\') {
                int i13 = i10 + 1;
                char c10 = cArr2[i13];
                if (c10 == '\"' || c10 == '\\') {
                    i10 = i13;
                    cChar4 = c10;
                } else if (c10 == 'u') {
                    char c11 = cArr2[i10 + 2];
                    char c12 = cArr2[i10 + 3];
                    char c13 = cArr2[i10 + 4];
                    i10 += 5;
                    cChar4 = JSONReader.char4(c11, c12, c13, cArr2[i10]);
                } else if (c10 != 'x') {
                    cChar4 = char1(c10);
                    i10 = i13;
                } else {
                    char c14 = cArr2[i10 + 2];
                    i10 += 3;
                    cChar4 = JSONReader.char2(c14, cArr2[i10]);
                }
            } else if (cChar4 == '\"') {
                String str2 = new String(cArr);
                this.stringValue = str2;
                return str2;
            }
            cArr[i12] = cChar4;
            i10++;
            i12++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public int getStringLength() {
        int i9;
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("date only support string input");
            return 0;
        }
        int i10 = this.offset;
        char[] cArr = this.chars;
        int i11 = i10 + 8;
        if (i11 >= this.end || i11 >= cArr.length || cArr[i10] == c10 || cArr[i10 + 1] == c10 || cArr[i10 + 2] == c10 || cArr[i10 + 3] == c10 || cArr[i10 + 4] == c10 || cArr[i10 + 5] == c10 || cArr[i10 + 6] == c10 || cArr[i10 + 7] == c10) {
            i9 = 0;
        } else {
            i9 = 8;
            i10 = i11;
        }
        while (i10 < this.end && cArr[i10] != c10) {
            i10++;
            i9++;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public String info(String str) {
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (!(i10 < this.offset) || !(i10 < this.end)) {
                break;
            }
            if (this.chars[i10] == '\n') {
                i9++;
                i11 = 1;
            }
            i10++;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            sb2.append(str);
            sb2.append(", ");
        }
        sb2.append("offset ");
        sb2.append(this.offset);
        sb2.append(", character ");
        sb2.append(this.f1929ch);
        sb2.append(", line ");
        sb2.append(i9);
        sb2.append(", column ");
        sb2.append(i11);
        sb2.append(", fastjson-version 2.0.60");
        sb2.append(i9 <= 1 ? ' ' : '\n');
        char[] cArr = this.chars;
        int i12 = this.start;
        int i13 = this.length;
        if (i13 >= 65535) {
            i13 = 65535;
        }
        sb2.append(cArr, i12, i13);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isArray() {
        return this.f1929ch == '[';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isNull() {
        int i9;
        return this.f1929ch == 'n' && (i9 = this.offset) < this.end && this.chars[i9] == 'u';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean isReference() {
        int i9;
        int i10;
        if ((this.context.features & 8589934592L) != 0) {
            return false;
        }
        char[] cArr = this.chars;
        if (this.f1929ch != '{' || (i9 = this.offset) == (i10 = this.end)) {
            return false;
        }
        char c10 = cArr[i9];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            i9++;
            if (i9 >= i10) {
                return false;
            }
            c10 = cArr[i9];
        }
        if (i9 + 6 < i10 && cArr[i9 + 1] == '$' && cArr[i9 + 2] == 'r' && cArr[i9 + 3] == 'e' && cArr[i9 + 4] == 'f' && cArr[i9 + 5] == c10) {
            return isReference0(cArr, i9, i10, c10);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0026 -> B:5:0x000b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x0013
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public void next() {
        /*
            r9 = this;
            int r0 = r9.offset
            char[] r1 = r9.chars
            int r2 = r9.end
            r3 = 26
            if (r0 < r2) goto Ld
            r2 = r0
        Lb:
            r0 = r3
            goto L11
        Ld:
            int r2 = r0 + 1
            char r0 = r1[r0]
        L11:
            r4 = 32
            if (r0 > r4) goto L31
            r4 = 1
            long r4 = r4 << r0
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            int r0 = r9.end
            if (r2 != r0) goto L29
            goto Lb
        L29:
            int r0 = r2 + 1
            char r2 = r1[r2]
            r8 = r2
            r2 = r0
            r0 = r8
            goto L11
        L31:
            r9.offset = r2
            r9.f1929ch = r0
            r1 = 47
            if (r0 != r1) goto L3c
            r9.skipComment()
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.next():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0031 -> B:9:0x0015). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x0026
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfArrayEnd() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.f1929ch
            r2 = 93
            if (r1 == r2) goto La
            r1 = 0
            return r1
        La:
            int r1 = r0.offset
            char[] r2 = r0.chars
            int r3 = r0.end
            r4 = 26
            if (r1 != r3) goto L17
            r3 = r1
        L15:
            r1 = r4
            goto L1b
        L17:
            int r3 = r1 + 1
            char r1 = r2[r1]
        L1b:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            if (r1 > r11) goto L3e
            long r12 = r9 << r1
            long r12 = r12 & r7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L3e
            int r1 = r0.end
            if (r3 != r1) goto L34
            goto L15
        L34:
            int r1 = r3 + 1
            char r3 = r2[r3]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L1b
        L3e:
            r12 = 44
            r13 = 1
            if (r1 != r12) goto L69
            r0.comma = r13
            int r1 = r0.end
            if (r3 != r1) goto L4c
            r1 = r3
            r3 = r4
            goto L50
        L4c:
            int r1 = r3 + 1
            char r3 = r2[r3]
        L50:
            r16 = r3
            r3 = r1
            r1 = r16
        L55:
            if (r1 > r11) goto L69
            long r14 = r9 << r1
            long r14 = r14 & r7
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 == 0) goto L69
            int r1 = r0.end
            if (r3 != r1) goto L64
            r1 = r4
            goto L55
        L64:
            int r1 = r3 + 1
            char r3 = r2[r3]
            goto L50
        L69:
            r0.f1929ch = r1
            r0.offset = r3
            r2 = 47
            if (r1 != r2) goto L74
            r0.skipComment()
        L74:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfArrayEnd():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002e -> B:9:0x0013). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x001b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfArrayStart() {
        /*
            r9 = this;
            char r0 = r9.f1929ch
            r1 = 91
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            char[] r0 = r9.chars
            int r1 = r9.offset
            int r2 = r9.end
            r3 = 26
            if (r1 != r2) goto L15
            r2 = r1
        L13:
            r1 = r3
            goto L19
        L15:
            int r2 = r1 + 1
            char r1 = r0[r1]
        L19:
            r4 = 32
            if (r1 > r4) goto L39
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L39
            int r1 = r9.end
            if (r2 != r1) goto L31
            goto L13
        L31:
            int r1 = r2 + 1
            char r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L19
        L39:
            r9.f1929ch = r1
            r9.offset = r2
            r0 = 47
            if (r1 != r0) goto L44
            r9.skipComment()
        L44:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfArrayStart():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x004a -> B:18:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:20:0x003f
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfComma() {
        /*
            r14 = this;
            char[] r0 = r14.chars
            int r1 = r14.offset
            char r2 = r14.f1929ch
        L6:
            r3 = 0
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            if (r2 > r9) goto L2a
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L2a
            int r2 = r14.end
            if (r1 != r2) goto L22
            r2 = r10
            goto L6
        L22:
            int r2 = r1 + 1
            char r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L6
        L2a:
            r11 = 44
            if (r2 == r11) goto L34
            r14.offset = r1
            r14.f1929ch = r2
            r0 = 0
            return r0
        L34:
            int r2 = r14.end
            if (r1 != r2) goto L3b
            r2 = r1
        L39:
            r1 = r10
            goto L3f
        L3b:
            int r2 = r1 + 1
            char r1 = r0[r1]
        L3f:
            if (r1 > r9) goto L55
            long r11 = r7 << r1
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L55
            int r1 = r14.end
            if (r2 != r1) goto L4d
            goto L39
        L4d:
            int r1 = r2 + 1
            char r2 = r0[r2]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L3f
        L55:
            r14.offset = r2
            r14.f1929ch = r1
            r0 = 47
            if (r1 != r0) goto L60
            r14.skipComment()
        L60:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfComma():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0062 -> B:23:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:26:0x004f
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfInfinity() {
        /*
            r10 = this;
            char[] r0 = r10.chars
            int r1 = r10.offset
            char r2 = r10.f1929ch
            r3 = 73
            if (r2 != r3) goto L73
            int r2 = r1 + 6
            int r3 = r10.end
            if (r2 >= r3) goto L73
            char r4 = r0[r1]
            r5 = 110(0x6e, float:1.54E-43)
            if (r4 != r5) goto L73
            int r4 = r1 + 1
            char r4 = r0[r4]
            r6 = 102(0x66, float:1.43E-43)
            if (r4 != r6) goto L73
            int r4 = r1 + 2
            char r4 = r0[r4]
            r6 = 105(0x69, float:1.47E-43)
            if (r4 != r6) goto L73
            int r4 = r1 + 3
            char r4 = r0[r4]
            if (r4 != r5) goto L73
            int r4 = r1 + 4
            char r4 = r0[r4]
            if (r4 != r6) goto L73
            int r4 = r1 + 5
            char r4 = r0[r4]
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L73
            char r2 = r0[r2]
            r4 = 121(0x79, float:1.7E-43)
            if (r2 != r4) goto L73
            int r2 = r1 + 7
            r4 = 26
            if (r2 != r3) goto L49
            r1 = r2
        L47:
            r2 = r4
            goto L4d
        L49:
            int r1 = r1 + 8
            char r2 = r0[r2]
        L4d:
            r3 = 32
            if (r2 > r3) goto L6d
            r5 = 1
            long r5 = r5 << r2
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L6d
            int r2 = r10.end
            if (r1 != r2) goto L65
            goto L47
        L65:
            int r2 = r1 + 1
            char r1 = r0[r1]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L4d
        L6d:
            r10.offset = r1
            r10.f1929ch = r2
            r0 = 1
            return r0
        L73:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfInfinity():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0044 -> B:17:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:19:0x0039
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatch(char r15) {
        /*
            r14 = this;
            char[] r0 = r14.chars
            int r1 = r14.offset
            char r2 = r14.f1929ch
        L6:
            r3 = 0
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            if (r2 > r9) goto L2a
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L2a
            int r2 = r14.end
            if (r1 != r2) goto L22
            r2 = r10
            goto L6
        L22:
            int r2 = r1 + 1
            char r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L6
        L2a:
            if (r2 == r15) goto L2e
            r15 = 0
            return r15
        L2e:
            int r15 = r14.end
            if (r1 != r15) goto L35
            r15 = r1
        L33:
            r1 = r10
            goto L39
        L35:
            int r15 = r1 + 1
            char r1 = r0[r1]
        L39:
            if (r1 > r9) goto L4f
            long r11 = r7 << r1
            long r11 = r11 & r5
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 == 0) goto L4f
            int r1 = r14.end
            if (r15 != r1) goto L47
            goto L33
        L47:
            int r1 = r15 + 1
            char r15 = r0[r15]
            r13 = r1
            r1 = r15
            r15 = r13
            goto L39
        L4f:
            r14.offset = r15
            r14.f1929ch = r1
            r15 = 47
            if (r1 != r15) goto L5a
            r14.skipComment()
        L5a:
            r15 = 1
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfMatch(char):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x004d -> B:20:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:23:0x003a
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char r6, char r7, char r8, char r9, char r10, char r11) {
        /*
            r5 = this;
            char r0 = r5.f1929ch
            r1 = 0
            if (r0 == r6) goto L6
            return r1
        L6:
            char[] r6 = r5.chars
            int r0 = r5.offset
            int r2 = r0 + 5
            int r3 = r5.end
            if (r2 > r3) goto L7e
            char r4 = r6[r0]
            if (r4 != r7) goto L7e
            int r7 = r0 + 1
            char r7 = r6[r7]
            if (r7 != r8) goto L7e
            int r7 = r0 + 2
            char r7 = r6[r7]
            if (r7 != r9) goto L7e
            int r7 = r0 + 3
            char r7 = r6[r7]
            if (r7 != r10) goto L7e
            int r7 = r0 + 4
            char r7 = r6[r7]
            if (r7 == r11) goto L2d
            goto L7e
        L2d:
            r7 = 26
            if (r2 != r3) goto L33
        L31:
            r8 = r7
            goto L38
        L33:
            int r0 = r0 + 6
            char r8 = r6[r2]
            r2 = r0
        L38:
            r9 = 32
            if (r8 > r9) goto L57
            r9 = 1
            long r9 = r9 << r8
            r3 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r3
            r3 = 0
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 == 0) goto L57
            int r8 = r5.end
            if (r2 != r8) goto L50
            goto L31
        L50:
            int r8 = r2 + 1
            char r9 = r6[r2]
            r2 = r8
            r8 = r9
            goto L38
        L57:
            int r6 = r5.offset
            int r6 = r6 + 6
            if (r2 != r6) goto L78
            if (r8 == r7) goto L78
            r6 = 40
            if (r8 == r6) goto L78
            r6 = 91
            if (r8 == r6) goto L78
            r6 = 93
            if (r8 == r6) goto L78
            r6 = 41
            if (r8 == r6) goto L78
            r6 = 58
            if (r8 == r6) goto L78
            r6 = 44
            if (r8 == r6) goto L78
            return r1
        L78:
            r5.offset = r2
            r5.f1929ch = r8
            r6 = 1
            return r6
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfMatchIdent(char, char, char, char, char, char):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match10(long j3) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 12;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || cArr[i9 + 11] != ':') {
            return false;
        }
        int i11 = i9 + 13;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match11(long j3) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 13;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || cArr[i9 + 11] != '\"' || cArr[i9 + 12] != ':') {
            return false;
        }
        int i11 = i9 + 14;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match12(long j3, byte b10) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 14;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || cArr[i9 + 11] != b10 || cArr[i9 + 12] != '\"' || cArr[i9 + 13] != ':') {
            return false;
        }
        int i11 = i9 + 15;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match13(long j3, int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 15;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getInt(cArr, i10 + 11) != i9) {
            return false;
        }
        int i12 = i10 + 16;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match14(long j3, int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 16;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getInt(cArr, i10 + 11) != i9 || cArr[i10 + 15] != ':') {
            return false;
        }
        int i12 = i10 + 17;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match15(long j3, int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 17;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getInt(cArr, i10 + 11) != i9 || cArr[i10 + 15] != '\"' || cArr[i10 + 16] != ':') {
            return false;
        }
        int i12 = i10 + 18;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match16(long j3, int i9, byte b10) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 18;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getInt(cArr, i10 + 11) != i9 || cArr[i10 + 15] != b10 || cArr[i10 + 16] != '\"' || cArr[i10 + 17] != ':') {
            return false;
        }
        int i12 = i10 + 19;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match17(long j3, long j4) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 19;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4) {
            return false;
        }
        int i11 = i9 + 20;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match18(long j3, long j4) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 20;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || cArr[i9 + 19] != ':') {
            return false;
        }
        int i11 = i9 + 21;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match19(long j3, long j4) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 21;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || cArr[i9 + 19] != '\"' || cArr[i9 + 20] != ':') {
            return false;
        }
        int i11 = i9 + 22;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match2() {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 4;
        if (i10 >= this.end || cArr[i9 + 3] != ':') {
            return false;
        }
        int i11 = i9 + 5;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            c10 = cArr[i11];
            i11++;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match20(long j3, long j4, byte b10) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 22;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || cArr[i9 + 19] != b10 || cArr[i9 + 20] != '\"' || cArr[i9 + 21] != ':') {
            return false;
        }
        int i11 = i9 + 23;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match21(long j3, long j4, int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 23;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getLong(cArr, i10 + 11) != j4 || getInt(cArr, i10 + 19) != i9) {
            return false;
        }
        int i12 = i10 + 24;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match22(long j3, long j4, int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 24;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getLong(cArr, i10 + 11) != j4 || getInt(cArr, i10 + 19) != i9 || cArr[i10 + 23] != ':') {
            return false;
        }
        int i12 = i10 + 25;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match23(long j3, long j4, int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 25;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getLong(cArr, i10 + 11) != j4 || getInt(cArr, i10 + 19) != i9 || cArr[i10 + 23] != '\"' || cArr[i10 + 24] != ':') {
            return false;
        }
        int i12 = i10 + 26;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match24(long j3, long j4, int i9, byte b10) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 26;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getLong(cArr, i10 + 11) != j4 || getInt(cArr, i10 + 19) != i9 || cArr[i10 + 23] != b10 || cArr[i10 + 24] != '\"' || cArr[i10 + 25] != ':') {
            return false;
        }
        int i12 = i10 + 27;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match25(long j3, long j4, long j5) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 27;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || getLong(cArr, i9 + 19) != j5) {
            return false;
        }
        int i11 = i9 + 28;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match26(long j3, long j4, long j5) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 28;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || getLong(cArr, i9 + 19) != j5 || cArr[i9 + 27] != ':') {
            return false;
        }
        int i11 = i9 + 29;
        char c10 = this.chars[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            c10 = this.chars[i11];
            i11++;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match27(long j3, long j4, long j5) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 29;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || getLong(cArr, i9 + 19) != j5 || cArr[i9 + 27] != '\"' || cArr[i9 + 28] != ':') {
            return false;
        }
        int i11 = i9 + 30;
        char c10 = this.chars[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            c10 = this.chars[i11];
            i11++;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match28(long j3, long j4, long j5, byte b10) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 30;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || getLong(cArr, i9 + 19) != j5 || cArr[i9 + 27] != b10 || cArr[i9 + 28] != '\"' || cArr[i9 + 29] != ':') {
            return false;
        }
        int i11 = i9 + 31;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match29(long j3, long j4, long j5, int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 31;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getLong(cArr, i10 + 11) != j4 || getLong(cArr, i10 + 19) != j5 || getInt(cArr, i10 + 27) != i9) {
            return false;
        }
        int i12 = i10 + 32;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match3() {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 5;
        if (i10 >= this.end || cArr[i9 + 3] != '\"' || cArr[i9 + 4] != ':') {
            return false;
        }
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            i10++;
            c10 = cArr[i10];
        }
        this.offset = i10 + 1;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match30(long j3, long j4, long j5, int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 32;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getLong(cArr, i10 + 11) != j4 || getLong(cArr, i10 + 19) != j5 || getInt(cArr, i10 + 27) != i9 || cArr[i10 + 31] != ':') {
            return false;
        }
        int i12 = i10 + 33;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match31(long j3, long j4, long j5, int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 33;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getLong(cArr, i10 + 11) != j4 || getLong(cArr, i10 + 19) != j5 || getInt(cArr, i10 + 27) != i9 || cArr[i10 + 31] != '\"' || cArr[i10 + 32] != ':') {
            return false;
        }
        int i12 = i10 + 34;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match32(long j3, long j4, long j5, int i9, byte b10) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 34;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getLong(cArr, i10 + 11) != j4 || getLong(cArr, i10 + 19) != j5 || getInt(cArr, i10 + 27) != i9 || cArr[i10 + 31] != b10 || cArr[i10 + 32] != '\"' || cArr[i10 + 33] != ':') {
            return false;
        }
        int i12 = i10 + 35;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match33(long j3, long j4, long j5, long j10) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 35;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || getLong(cArr, i9 + 19) != j5 || getLong(cArr, i9 + 27) != j10) {
            return false;
        }
        int i11 = i9 + 36;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match34(long j3, long j4, long j5, long j10) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 36;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || getLong(cArr, i9 + 19) != j5 || getLong(cArr, i9 + 27) != j10 || cArr[i9 + 35] != ':') {
            return false;
        }
        int i11 = i9 + 37;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match35(long j3, long j4, long j5, long j10) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 37;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || getLong(cArr, i9 + 19) != j5 || getLong(cArr, i9 + 27) != j10 || cArr[i9 + 35] != '\"' || cArr[i9 + 36] != ':') {
            return false;
        }
        int i11 = i9 + 38;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match36(long j3, long j4, long j5, long j10, byte b10) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 38;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || getLong(cArr, i9 + 19) != j5 || getLong(cArr, i9 + 27) != j10 || cArr[i9 + 35] != b10 || cArr[i9 + 36] != '\"' || cArr[i9 + 37] != ':') {
            return false;
        }
        int i11 = i9 + 39;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match37(long j3, long j4, long j5, long j10, int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 39;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getLong(cArr, i10 + 11) != j4 || getLong(cArr, i10 + 19) != j5 || getLong(cArr, i10 + 27) != j10 || getInt(cArr, i10 + 35) != i9) {
            return false;
        }
        int i12 = i10 + 40;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match38(long j3, long j4, long j5, long j10, int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 40;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getLong(cArr, i10 + 11) != j4 || getLong(cArr, i10 + 19) != j5 || getLong(cArr, i10 + 27) != j10 || getInt(cArr, i10 + 35) != i9 || cArr[i10 + 39] != ':') {
            return false;
        }
        int i12 = i10 + 41;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match39(long j3, long j4, long j5, long j10, int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 41;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getLong(cArr, i10 + 11) != j4 || getLong(cArr, i10 + 19) != j5 || getLong(cArr, i10 + 27) != j10 || getInt(cArr, i10 + 35) != i9 || cArr[i10 + 39] != '\"' || cArr[i10 + 40] != ':') {
            return false;
        }
        int i12 = i10 + 42;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match4(byte b10) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 6;
        if (i10 >= this.end || cArr[i9 + 3] != b10 || cArr[i9 + 4] != '\"' || cArr[i9 + 5] != ':') {
            return false;
        }
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            i10++;
            c10 = cArr[i10];
        }
        this.offset = i10 + 1;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match40(long j3, long j4, long j5, long j10, int i9, byte b10) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 42;
        if (i11 >= this.end || getLong(cArr, i10 + 3) != j3 || getLong(cArr, i10 + 11) != j4 || getLong(cArr, i10 + 19) != j5 || getLong(cArr, i10 + 27) != j10 || getInt(cArr, i10 + 35) != i9 || cArr[i10 + 39] != b10 || cArr[i10 + 40] != '\"' || cArr[i10 + 41] != ':') {
            return false;
        }
        int i12 = i10 + 43;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match41(long j3, long j4, long j5, long j10, long j11) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 43;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || getLong(cArr, i9 + 19) != j5 || getLong(cArr, i9 + 27) != j10 || getLong(cArr, i9 + 35) != j11) {
            return false;
        }
        int i11 = i9 + 44;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match42(long j3, long j4, long j5, long j10, long j11) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 44;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || getLong(cArr, i9 + 19) != j5 || getLong(cArr, i9 + 27) != j10 || getLong(cArr, i9 + 35) != j11 || cArr[i9 + 43] != ':') {
            return false;
        }
        int i11 = i9 + 45;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match43(long j3, long j4, long j5, long j10, long j11) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 45;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || getLong(cArr, i9 + 11) != j4 || getLong(cArr, i9 + 19) != j5 || getLong(cArr, i9 + 27) != j10 || getLong(cArr, i9 + 35) != j11 || cArr[i9 + 43] != '\"' || cArr[i9 + 44] != ':') {
            return false;
        }
        int i11 = i9 + 46;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match5(int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 7;
        if (i11 >= this.end || getInt(cArr, i10 + 3) != i9) {
            return false;
        }
        int i12 = i10 + 8;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            int i13 = i12 + 1;
            char c11 = cArr[i12];
            i12 = i13;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match6(int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 8;
        if (i11 >= this.end || getInt(cArr, i10 + 3) != i9 || cArr[i10 + 7] != ':') {
            return false;
        }
        int i12 = i10 + 9;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            int i13 = i12 + 1;
            char c11 = cArr[i12];
            i12 = i13;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match7(int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 9;
        if (i11 >= this.end || getInt(cArr, i10 + 3) != i9 || cArr[i10 + 7] != '\"' || cArr[i10 + 8] != ':') {
            return false;
        }
        int i12 = i10 + 10;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            int i13 = i12 + 1;
            char c11 = cArr[i12];
            i12 = i13;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match8(int i9, byte b10) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 10;
        if (i11 >= this.end || getInt(cArr, i10 + 3) != i9 || cArr[i10 + 7] != b10 || cArr[i10 + 8] != '\"' || cArr[i10 + 9] != ':') {
            return false;
        }
        int i12 = i10 + 11;
        char c10 = cArr[i11];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i12];
            i12++;
            c10 = c11;
        }
        this.offset = i12;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match9(long j3) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 11;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3) {
            return false;
        }
        int i11 = i9 + 12;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            char c11 = cArr[i11];
            i11++;
            c10 = c11;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match0() {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 7;
        if (i10 == this.end) {
            this.f1929ch = (char) 26;
            return false;
        }
        int i11 = i9 + 8;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            c10 = cArr[i11];
            i11++;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match1() {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 8;
        if (i10 >= this.end || cArr[i9 + 7] != ':') {
            return false;
        }
        int i11 = i9 + 9;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            c10 = cArr[i11];
            i11++;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match2() {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 9;
        if (i10 >= this.end || cArr[i9 + 7] != '\"' || cArr[i9 + 8] != ':') {
            return false;
        }
        int i11 = i9 + 10;
        char c10 = cArr[i10];
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            c10 = cArr[i11];
            i11++;
        }
        this.offset = i11;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfNull() {
        if (this.f1929ch != 'n') {
            return false;
        }
        int i9 = this.offset;
        if (i9 + 2 >= this.end || this.chars[i9] != 'u') {
            return false;
        }
        readNull();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:54:0x0092) to fix multi-entry loop: BACK_EDGE: B:60:0x00a6 -> B:54:0x0092 */
    /* JADX DEBUG: Duplicate block (B:56:0x0098) to fix multi-entry loop: BACK_EDGE: B:56:0x0098 -> B:57:0x009d */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x007a -> B:39:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:42:0x0071
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfNullOrEmptyString() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.f1929ch
            int r2 = r0.end
            int r3 = r0.offset
            char[] r4 = r0.chars
            r5 = 117(0x75, float:1.64E-43)
            r6 = 0
            r7 = 108(0x6c, float:1.51E-43)
            r8 = 1
            r9 = 110(0x6e, float:1.54E-43)
            if (r1 != r9) goto L29
            int r10 = r3 + 2
            if (r10 >= r2) goto L29
            char r11 = r4[r3]
            if (r11 != r5) goto L29
            int r11 = r3 + 1
            char r11 = r4[r11]
            if (r11 != r7) goto L29
            char r10 = r4[r10]
            if (r10 != r7) goto L29
            int r3 = r3 + 3
            goto L5b
        L29:
            r10 = 34
            if (r1 == r10) goto L33
            r10 = 39
            if (r1 != r10) goto L32
            goto L33
        L32:
            return r6
        L33:
            if (r3 >= r2) goto L3b
            char r10 = r4[r3]
            if (r10 != r1) goto L3b
            int r3 = r3 + r8
            goto L5b
        L3b:
            int r10 = r3 + 4
            if (r10 >= r2) goto Lb3
            char r11 = r4[r3]
            if (r11 != r9) goto Lb3
            int r9 = r3 + 1
            char r9 = r4[r9]
            if (r9 != r5) goto Lb3
            int r5 = r3 + 2
            char r5 = r4[r5]
            if (r5 != r7) goto Lb3
            int r5 = r3 + 3
            char r5 = r4[r5]
            if (r5 != r7) goto Lb3
            char r5 = r4[r10]
            if (r5 != r1) goto Lb3
            int r3 = r3 + 5
        L5b:
            r1 = 26
            if (r3 != r2) goto L62
            r5 = r3
        L60:
            r3 = r1
            goto L66
        L62:
            int r5 = r3 + 1
            char r3 = r4[r3]
        L66:
            r9 = 0
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r7 = 32
            if (r3 > r7) goto L87
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r15 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r15 == 0) goto L87
            if (r5 != r2) goto L7d
            goto L60
        L7d:
            int r3 = r5 + 1
            char r5 = r4[r5]
            r17 = r5
            r5 = r3
            r3 = r17
            goto L66
        L87:
            r15 = 44
            if (r3 != r15) goto L8c
            r6 = r8
        L8c:
            r0.comma = r6
            if (r6 == 0) goto L9d
            if (r5 != r2) goto L94
        L92:
            r3 = r1
            goto L9d
        L94:
            int r3 = r5 + 1
            char r5 = r4[r5]
        L98:
            r17 = r5
            r5 = r3
            r3 = r17
        L9d:
            if (r3 > r7) goto Lae
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r6 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r6 == 0) goto Lae
            if (r5 != r2) goto La9
            goto L92
        La9:
            int r3 = r5 + 1
            char r5 = r4[r5]
            goto L98
        Lae:
            r0.offset = r5
            r0.f1929ch = r3
            return r8
        Lb3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfNullOrEmptyString():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0031 -> B:9:0x0015). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x0026
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectEnd() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.f1929ch
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto La
            r1 = 0
            return r1
        La:
            int r1 = r0.offset
            char[] r2 = r0.chars
            int r3 = r0.end
            r4 = 26
            if (r1 != r3) goto L17
            r3 = r1
        L15:
            r1 = r4
            goto L1b
        L17:
            int r3 = r1 + 1
            char r1 = r2[r1]
        L1b:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            if (r1 > r11) goto L3e
            long r12 = r9 << r1
            long r12 = r12 & r7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L3e
            int r1 = r0.end
            if (r3 != r1) goto L34
            goto L15
        L34:
            int r1 = r3 + 1
            char r3 = r2[r3]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L1b
        L3e:
            r12 = 44
            r13 = 1
            if (r1 != r12) goto L69
            r0.comma = r13
            int r1 = r0.end
            if (r3 != r1) goto L4c
            r1 = r3
            r3 = r4
            goto L50
        L4c:
            int r1 = r3 + 1
            char r3 = r2[r3]
        L50:
            r16 = r3
            r3 = r1
            r1 = r16
        L55:
            if (r1 > r11) goto L69
            long r14 = r9 << r1
            long r14 = r14 & r7
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 == 0) goto L69
            int r1 = r0.end
            if (r3 != r1) goto L64
            r1 = r4
            goto L55
        L64:
            int r1 = r3 + 1
            char r3 = r2[r3]
            goto L50
        L69:
            r0.f1929ch = r1
            r0.offset = r3
            r2 = 47
            if (r1 != r2) goto L74
            r0.skipComment()
        L74:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfObjectEnd():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002e -> B:9:0x0013). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x001b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectStart() {
        /*
            r9 = this;
            char r0 = r9.f1929ch
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            char[] r0 = r9.chars
            int r1 = r9.offset
            int r2 = r9.end
            r3 = 26
            if (r1 != r2) goto L15
            r2 = r1
        L13:
            r1 = r3
            goto L19
        L15:
            int r2 = r1 + 1
            char r1 = r0[r1]
        L19:
            r4 = 32
            if (r1 > r4) goto L39
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L39
            int r1 = r9.end
            if (r2 != r1) goto L31
            goto L13
        L31:
            int r1 = r2 + 1
            char r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L19
        L39:
            r9.f1929ch = r1
            r9.offset = r2
            r0 = 47
            if (r1 != r0) goto L44
            r9.skipComment()
        L44:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfObjectStart():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x003e -> B:13:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:16:0x002b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfSet() {
        /*
            r10 = this;
            char[] r0 = r10.chars
            int r1 = r10.offset
            char r2 = r10.f1929ch
            r3 = 83
            if (r2 != r3) goto L4f
            int r2 = r1 + 1
            int r3 = r10.end
            if (r2 >= r3) goto L4f
            char r4 = r0[r1]
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L4f
            char r2 = r0[r2]
            r4 = 116(0x74, float:1.63E-43)
            if (r2 != r4) goto L4f
            int r2 = r1 + 2
            r4 = 26
            if (r2 != r3) goto L25
            r1 = r2
        L23:
            r2 = r4
            goto L29
        L25:
            int r1 = r1 + 3
            char r2 = r0[r2]
        L29:
            r3 = 32
            if (r2 > r3) goto L49
            r5 = 1
            long r5 = r5 << r2
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L49
            int r2 = r10.end
            if (r1 != r2) goto L41
            goto L23
        L41:
            int r2 = r1 + 1
            char r1 = r0[r1]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L29
        L49:
            r10.offset = r1
            r10.f1929ch = r2
            r0 = 1
            return r0
        L4f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfSet():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match10(long j3) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 11;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3) {
            return false;
        }
        char c10 = cArr[i10];
        if (c10 != ',' && c10 != '}' && c10 != ']') {
            return false;
        }
        if (c10 == ',') {
            this.comma = true;
            i10 = i9 + 12;
            c10 = i10 == this.end ? (char) 26 : cArr[i10];
        }
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            i10++;
            c10 = cArr[i10];
        }
        this.offset = i10 + 1;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match11(long j3) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 12;
        if (i10 >= this.end || getLong(cArr, i9 + 3) != j3 || cArr[i9 + 11] != '\"') {
            return false;
        }
        char c10 = cArr[i10];
        if (c10 != ',' && c10 != '}' && c10 != ']') {
            return false;
        }
        if (c10 == ',') {
            this.comma = true;
            i10 = i9 + 13;
            c10 = i10 == this.end ? (char) 26 : cArr[i10];
        }
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            i10++;
            c10 = cArr[i10];
        }
        this.offset = i10 + 1;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match2() {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 3;
        int i11 = this.end;
        if (i10 >= i11) {
            return false;
        }
        char c10 = cArr[i10];
        if (c10 != ',' && c10 != '}' && c10 != ']') {
            return false;
        }
        if (c10 == ',') {
            this.comma = true;
            i10 = i9 + 4;
            c10 = i10 == i11 ? (char) 26 : cArr[i10];
        }
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            i10++;
            c10 = cArr[i10];
        }
        this.offset = i10 + 1;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match3() {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 4;
        int i11 = this.end;
        if (i10 >= i11 || cArr[i9 + 3] != '\"') {
            return false;
        }
        char c10 = cArr[i10];
        if (c10 != ',' && c10 != '}' && c10 != ']') {
            return false;
        }
        if (c10 == ',') {
            this.comma = true;
            i10 = i9 + 5;
            c10 = i10 == i11 ? (char) 26 : cArr[i10];
        }
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            i10++;
            c10 = cArr[i10];
        }
        this.offset = i10 + 1;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match4(byte b10) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 5;
        int i11 = this.end;
        boolean z9 = false;
        if (i10 >= i11) {
            return false;
        }
        if (cArr[i9 + 3] == b10 && cArr[i9 + 4] == '\"') {
            char c10 = cArr[i10];
            if (c10 != ',' && c10 != '}' && c10 != ']') {
                return false;
            }
            z9 = true;
            if (c10 == ',') {
                this.comma = true;
                i10 = i9 + 6;
                c10 = i10 == i11 ? (char) 26 : cArr[i10];
            }
            while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
                i10++;
                c10 = cArr[i10];
            }
            this.offset = i10 + 1;
            this.f1929ch = c10;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match5(byte b10, byte b11) {
        char[] cArr = this.chars;
        int i9 = this.offset;
        int i10 = i9 + 6;
        int i11 = this.end;
        boolean z9 = false;
        if (i10 >= i11) {
            return false;
        }
        if (cArr[i9 + 3] == b10 && cArr[i9 + 4] == b11 && cArr[i9 + 5] == '\"') {
            char c10 = cArr[i10];
            if (c10 != ',' && c10 != '}' && c10 != ']') {
                return false;
            }
            z9 = true;
            if (c10 == ',') {
                this.comma = true;
                i10 = i9 + 7;
                c10 = i10 == i11 ? (char) 26 : cArr[i10];
            }
            while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
                i10++;
                c10 = cArr[i10];
            }
            this.offset = i10 + 1;
            this.f1929ch = c10;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match6(int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 7;
        if (i11 >= this.end || getInt(cArr, i10 + 3) != i9) {
            return false;
        }
        char c10 = cArr[i11];
        if (c10 != ',' && c10 != '}' && c10 != ']') {
            return false;
        }
        if (c10 == ',') {
            this.comma = true;
            i11 = i10 + 8;
            c10 = i11 == this.end ? (char) 26 : cArr[i11];
        }
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            i11++;
            c10 = cArr[i11];
        }
        this.offset = i11 + 1;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match7(int i9) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 8;
        boolean z9 = false;
        if (i11 >= this.end) {
            return false;
        }
        if (getInt(cArr, i10 + 3) == i9 && cArr[i10 + 7] == '\"') {
            char c10 = cArr[i11];
            if (c10 != ',' && c10 != '}' && c10 != ']') {
                return false;
            }
            z9 = true;
            if (c10 == ',') {
                this.comma = true;
                i11 = i10 + 9;
                c10 = i11 == this.end ? (char) 26 : cArr[i11];
            }
            while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
                i11++;
                c10 = cArr[i11];
            }
            this.offset = i11 + 1;
            this.f1929ch = c10;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match8(int i9, byte b10) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 9;
        if (i11 >= this.end || getInt(cArr, i10 + 3) != i9 || cArr[i10 + 7] != b10 || cArr[i10 + 8] != '\"') {
            return false;
        }
        char c10 = cArr[i11];
        if (c10 != ',' && c10 != '}' && c10 != ']') {
            return false;
        }
        if (c10 == ',') {
            this.comma = true;
            i11 = i10 + 10;
            c10 = i11 == this.end ? (char) 26 : cArr[i11];
        }
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            i11++;
            c10 = cArr[i11];
        }
        this.offset = i11 + 1;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match9(int i9, byte b10, byte b11) {
        char[] cArr = this.chars;
        int i10 = this.offset;
        int i11 = i10 + 10;
        if (i11 >= this.end || getInt(cArr, i10 + 3) != i9 || cArr[i10 + 7] != b10 || cArr[i10 + 8] != b11 || cArr[i10 + 9] != '\"') {
            return false;
        }
        char c10 = cArr[i11];
        if (c10 != ',' && c10 != '}' && c10 != ']') {
            return false;
        }
        if (c10 == ',') {
            this.comma = true;
            i11 = i10 + 11;
            c10 = i11 == this.end ? (char) 26 : cArr[i11];
        }
        while (c10 <= ' ' && ((1 << c10) & 4294981377L) != 0) {
            i11++;
            c10 = cArr[i11];
        }
        this.offset = i11 + 1;
        this.f1929ch = c10;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0026 -> B:5:0x000b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x0013
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final void nextWithoutComment() {
        /*
            r9 = this;
            int r0 = r9.offset
            char[] r1 = r9.chars
            int r2 = r9.end
            r3 = 26
            if (r0 < r2) goto Ld
            r2 = r0
        Lb:
            r0 = r3
            goto L11
        Ld:
            int r2 = r0 + 1
            char r0 = r1[r0]
        L11:
            r4 = 32
            if (r0 > r4) goto L31
            r4 = 1
            long r4 = r4 << r0
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            int r0 = r9.end
            if (r2 != r0) goto L29
            goto Lb
        L29:
            int r0 = r2 + 1
            char r2 = r1[r2]
            r8 = r2
            r2 = r0
            r0 = r8
            goto L11
        L31:
            r9.offset = r2
            r9.f1929ch = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextWithoutComment():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:205:0x02a8) to fix multi-entry loop: BACK_EDGE: B:205:0x02a8 -> B:207:0x02ad */
    /* JADX DEBUG: Duplicate block (B:232:0x02f8) to fix multi-entry loop: BACK_EDGE: B:232:0x02f8 -> B:224:0x02e1 */
    /* JADX WARN: Path cross not found for [B:201:0x029d, B:251:?], limit reached: 255 */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f A[LOOP:0: B:26:0x0058->B:41:0x008f, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x02c3 -> B:203:0x02a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:208:0x02b6
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.math.BigDecimal readBigDecimal() {
        /*
            r28 = this;
            r1 = r28
            char[] r0 = r1.chars
            char r2 = r1.f1929ch
            int r3 = r1.offset
            r4 = 34
            r5 = 2
            r7 = 0
            r8 = 0
            if (r2 == r4) goto L17
            r4 = 39
            if (r2 != r4) goto L14
            goto L17
        L14:
            r4 = r3
            r3 = r7
            goto L32
        L17:
            int r4 = r3 + 1
            char r9 = r0[r3]
            if (r9 != r2) goto L30
            int r2 = r1.end
            if (r4 != r2) goto L24
            r6 = 26
            goto L28
        L24:
            int r3 = r3 + r5
            char r6 = r0[r4]
            r4 = r3
        L28:
            r1.f1929ch = r6
            r1.offset = r4
            r1.nextIfComma()
            return r8
        L30:
            r3 = r2
            r2 = r9
        L32:
            r9 = 43
            r10 = 45
            r11 = 1
            if (r2 != r10) goto L45
            r1.negative = r11
            int r2 = r4 + 1
            char r12 = r0[r4]
        L3f:
            r27 = r12
            r12 = r2
            r2 = r27
            goto L4f
        L45:
            r1.negative = r7
            if (r2 != r9) goto L4e
            int r2 = r4 + 1
            char r12 = r0[r4]
            goto L3f
        L4e:
            r12 = r4
        L4f:
            r1.valueType = r11
            r13 = 0
            r15 = r7
            r18 = r15
            r16 = r13
        L58:
            r19 = 31
            r6 = 57
            r20 = 10
            r22 = r8
            r8 = 48
            if (r2 < r8) goto L9c
            if (r2 > r6) goto L9c
            if (r15 != 0) goto L7a
            long r23 = r16 * r20
            long r25 = r16 | r20
            long r25 = r25 >>> r19
            int r18 = (r25 > r13 ? 1 : (r25 == r13 ? 0 : -1))
            if (r18 == 0) goto L7d
            long r25 = r23 / r20
            int r18 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r18 != 0) goto L79
            goto L7d
        L79:
            r15 = r11
        L7a:
            r25 = r13
            goto L84
        L7d:
            int r2 = r2 + (-48)
            r25 = r13
            long r13 = (long) r2
            long r16 = r23 + r13
        L84:
            int r2 = r1.end
            if (r12 != r2) goto L8f
            int r12 = r12 + 1
            r18 = r11
            r2 = 26
            goto L9e
        L8f:
            int r2 = r12 + 1
            char r6 = r0[r12]
            r12 = r2
            r2 = r6
            r18 = r11
            r8 = r22
            r13 = r25
            goto L58
        L9c:
            r25 = r13
        L9e:
            int r13 = (r16 > r25 ? 1 : (r16 == r25 ? 0 : -1))
            if (r13 >= 0) goto La3
            r15 = r11
        La3:
            r1.scale = r7
            r13 = 46
            if (r2 != r13) goto Lf2
            r1.valueType = r5
            int r2 = r12 + 1
            char r12 = r0[r12]
            r27 = r12
            r12 = r2
            r2 = r27
        Lb4:
            if (r2 < r8) goto Lf2
            if (r2 > r6) goto Lf2
            short r13 = r1.scale
            int r13 = r13 + r11
            short r13 = (short) r13
            r1.scale = r13
            if (r15 != 0) goto Ld9
            long r13 = r16 * r20
            long r23 = r16 | r20
            long r23 = r23 >>> r19
            int r18 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r18 == 0) goto Ld3
            long r23 = r13 / r20
            int r18 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r18 != 0) goto Ld1
            goto Ld3
        Ld1:
            r15 = r11
            goto Ld9
        Ld3:
            int r2 = r2 + (-48)
            long r5 = (long) r2
            long r13 = r13 + r5
            r16 = r13
        Ld9:
            int r2 = r1.end
            if (r12 != r2) goto Le6
            int r12 = r12 + 1
            r18 = r11
            r5 = r16
            r2 = 26
            goto Lf4
        Le6:
            int r2 = r12 + 1
            char r5 = r0[r12]
            r12 = r2
            r2 = r5
            r18 = r11
            r5 = 2
            r6 = 57
            goto Lb4
        Lf2:
            r5 = r16
        Lf4:
            r13 = 101(0x65, float:1.42E-43)
            if (r2 == r13) goto Lff
            r14 = 69
            if (r2 != r14) goto Lfd
            goto Lff
        Lfd:
            r9 = r7
            goto L152
        Lff:
            int r2 = r12 + 1
            char r14 = r0[r12]
            if (r14 != r10) goto L107
            r10 = r11
            goto L108
        L107:
            r10 = r7
        L108:
            if (r10 != 0) goto L10f
            if (r14 != r9) goto L10d
            goto L10f
        L10d:
            r9 = r7
            goto L115
        L10f:
            int r12 = r12 + 2
            char r14 = r0[r2]
            r9 = r7
            r2 = r12
        L115:
            if (r14 < r8) goto L147
            r12 = 57
            if (r14 > r12) goto L147
            int r14 = r14 + (-48)
            int r9 = r9 * 10
            int r9 = r9 + r14
            r14 = 2047(0x7ff, float:2.868E-42)
            if (r9 > r14) goto L13c
            int r14 = r1.end
            if (r2 != r14) goto L130
            int r2 = r2 + 1
            r12 = r2
            r18 = r11
            r2 = 26
            goto L149
        L130:
            int r14 = r2 + 1
            char r2 = r0[r2]
            r18 = r14
            r14 = r2
            r2 = r18
            r18 = r11
            goto L115
        L13c:
            java.lang.String r0 = "too large exp value : "
            java.lang.String r0 = p068eh.AbstractC0921a.m2249l(r9, r0)
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        L147:
            r12 = r2
            r2 = r14
        L149:
            if (r10 == 0) goto L14c
            int r9 = -r9
        L14c:
            short r8 = (short) r9
            r1.exponent = r8
            r8 = 2
            r1.valueType = r8
        L152:
            if (r12 != r4) goto L238
            r8 = 110(0x6e, float:1.54E-43)
            r10 = 117(0x75, float:1.64E-43)
            r14 = 108(0x6c, float:1.51E-43)
            if (r2 != r8) goto L1a1
            int r8 = r12 + 1
            char r7 = r0[r12]
            if (r7 != r10) goto L19d
            int r7 = r12 + 2
            char r8 = r0[r8]
            if (r8 != r14) goto L19f
            int r8 = r12 + 3
            char r7 = r0[r7]
            if (r7 != r14) goto L19d
            com.alibaba.fastjson2.JSONReader$Context r2 = r1.context
            long r13 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            r19 = r12
            long r11 = r2.mask
            long r10 = r13 & r11
            int r2 = (r10 > r25 ? 1 : (r10 == r25 ? 0 : -1))
            if (r2 != 0) goto L192
            r2 = 1
            r1.wasNull = r2
            int r2 = r1.end
            if (r8 != r2) goto L188
            r2 = 26
            goto L18a
        L188:
            char r2 = r0[r8]
        L18a:
            int r12 = r19 + 4
        L18c:
            r7 = 0
            r8 = 1
            r18 = 1
            goto L23b
        L192:
            java.lang.String r0 = "long value not support input null"
            java.lang.String r0 = r1.info(r0)
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        L19d:
            r12 = r8
            goto L1a3
        L19f:
            r12 = r7
            goto L1a3
        L1a1:
            r19 = r12
        L1a3:
            r7 = 116(0x74, float:1.63E-43)
            if (r2 != r7) goto L1ce
            int r7 = r12 + 3
            int r8 = r1.end
            if (r7 > r8) goto L1ce
            char r11 = r0[r12]
            r14 = 114(0x72, float:1.6E-43)
            if (r11 != r14) goto L1ce
            int r11 = r12 + 1
            char r11 = r0[r11]
            if (r11 != r10) goto L1ce
            int r10 = r12 + 2
            char r10 = r0[r10]
            if (r10 != r13) goto L1ce
            java.math.BigDecimal r2 = java.math.BigDecimal.ONE
            if (r7 != r8) goto L1c6
            r7 = 26
            goto L1c8
        L1c6:
            char r7 = r0[r7]
        L1c8:
            int r12 = r12 + 4
        L1ca:
            r22 = r2
            r2 = r7
            goto L18c
        L1ce:
            r7 = 102(0x66, float:1.43E-43)
            if (r2 != r7) goto L200
            int r7 = r12 + 4
            int r8 = r1.end
            if (r7 > r8) goto L200
            char r10 = r0[r12]
            r11 = 97
            if (r10 != r11) goto L200
            int r10 = r12 + 1
            char r10 = r0[r10]
            r11 = 108(0x6c, float:1.51E-43)
            if (r10 != r11) goto L200
            int r10 = r12 + 2
            char r10 = r0[r10]
            r11 = 115(0x73, float:1.61E-43)
            if (r10 != r11) goto L200
            int r10 = r12 + 3
            char r10 = r0[r10]
            if (r10 != r13) goto L200
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            if (r7 != r8) goto L1fb
            r7 = 26
            goto L1fd
        L1fb:
            char r7 = r0[r7]
        L1fd:
            int r12 = r12 + 5
            goto L1ca
        L200:
            r7 = 123(0x7b, float:1.72E-43)
            if (r2 != r7) goto L218
            if (r3 != 0) goto L218
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
            r2 = r25
            r1.readObject(r0, r2)
            r7 = 0
            r1.wasNull = r7
            java.math.BigDecimal r0 = r1.decimal(r0)
            return r0
        L218:
            r7 = 0
            r8 = 91
            if (r2 != r8) goto L236
            if (r3 != 0) goto L236
            java.util.List r0 = r1.readArray()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22d
            r2 = 1
            r1.wasNull = r2
            return r22
        L22d:
            java.lang.String r0 = r1.info()
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        L236:
            r8 = r7
            goto L23b
        L238:
            r19 = r12
            goto L236
        L23b:
            int r10 = r12 - r4
            if (r3 == 0) goto L265
            if (r2 == r3) goto L258
            java.lang.String r0 = r1.readString()
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)     // Catch: java.lang.NumberFormatException -> L24a
            return r0
        L24a:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r2 = r1.info(r2)
            p012ah.C0086a.m465x(r2, r0)
            r0 = 0
            return r0
        L258:
            int r2 = r1.end
            if (r12 < r2) goto L25f
            r2 = 26
            goto L265
        L25f:
            int r2 = r12 + 1
            char r3 = r0[r12]
            r12 = r2
            r2 = r3
        L265:
            if (r8 != 0) goto L2ab
            if (r9 != 0) goto L27d
            if (r15 != 0) goto L27d
            r25 = 0
            int r3 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r3 == 0) goto L27d
            boolean r3 = r1.negative
            if (r3 == 0) goto L276
            long r5 = -r5
        L276:
            short r3 = r1.scale
            java.math.BigDecimal r22 = java.math.BigDecimal.valueOf(r5, r3)
            r8 = 1
        L27d:
            r17 = 1
            if (r8 != 0) goto L289
            int r4 = r4 + (-1)
            java.math.BigDecimal r3 = com.alibaba.fastjson2.util.TypeUtils.parseBigDecimal(r0, r4, r10)
            r22 = r3
        L289:
            r3 = 76
            if (r2 == r3) goto L29d
            r3 = 70
            if (r2 == r3) goto L29d
            r3 = 68
            if (r2 == r3) goto L29d
            r3 = 66
            if (r2 == r3) goto L29d
            r3 = 83
            if (r2 != r3) goto L2ad
        L29d:
            int r2 = r1.end
            if (r12 < r2) goto L2a4
        L2a1:
            r2 = 26
            goto L2ad
        L2a4:
            int r2 = r12 + 1
            char r3 = r0[r12]
        L2a8:
            r12 = r2
            r2 = r3
            goto L2ad
        L2ab:
            r17 = 1
        L2ad:
            r3 = 4294981377(0x100003701, double:2.122002748E-314)
            r5 = 1
            r8 = 32
            if (r2 > r8) goto L2cb
            long r9 = r5 << r2
            long r9 = r9 & r3
            r25 = 0
            int r9 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r9 == 0) goto L2cb
            int r2 = r1.end
            if (r12 != r2) goto L2c6
            goto L2a1
        L2c6:
            int r2 = r12 + 1
            char r3 = r0[r12]
            goto L2a8
        L2cb:
            r9 = 44
            if (r2 != r9) goto L2d1
            r7 = r17
        L2d1:
            r1.comma = r7
            if (r7 == 0) goto L2fa
            int r2 = r1.end
            if (r12 != r2) goto L2dc
            r7 = 26
            goto L2e1
        L2dc:
            int r2 = r12 + 1
            char r7 = r0[r12]
            goto L2f8
        L2e1:
            r2 = r7
        L2e2:
            if (r2 > r8) goto L2fa
            long r9 = r5 << r2
            long r9 = r9 & r3
            r25 = 0
            int r7 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r7 == 0) goto L2fa
            int r2 = r1.end
            if (r12 != r2) goto L2f4
            r2 = 26
            goto L2e2
        L2f4:
            int r2 = r12 + 1
            char r7 = r0[r12]
        L2f8:
            r12 = r2
            goto L2e1
        L2fa:
            if (r18 == 0) goto L301
            r1.f1929ch = r2
            r1.offset = r12
            return r22
        L301:
            java.lang.String r0 = "illegal input error"
            java.lang.String r0 = r1.info(r0)
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.readBigDecimal():java.math.BigDecimal");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:90:0x0103) to fix multi-entry loop: BACK_EDGE: B:90:0x0103 -> B:91:0x0104 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00e3 -> B:71:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x010f -> B:88:0x00fd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:74:0x00d8
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean readBoolValue() {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r0.wasNull = r1
            char[] r2 = r0.chars
            int r3 = r0.offset
            char r4 = r0.f1929ch
            r5 = 116(0x74, float:1.63E-43)
            r6 = 101(0x65, float:1.42E-43)
            r7 = 117(0x75, float:1.64E-43)
            r8 = 0
            r10 = 1
            if (r4 != r5) goto L30
            int r5 = r3 + 2
            int r11 = r2.length
            if (r5 >= r11) goto L30
            char r11 = r2[r3]
            r12 = 114(0x72, float:1.6E-43)
            if (r11 != r12) goto L30
            int r11 = r3 + 1
            char r11 = r2[r11]
            if (r11 != r7) goto L30
            char r5 = r2[r5]
            if (r5 != r6) goto L30
            int r3 = r3 + 3
        L2d:
            r4 = r10
            goto Lc2
        L30:
            r5 = 102(0x66, float:1.43E-43)
            r11 = 108(0x6c, float:1.51E-43)
            if (r4 != r5) goto L58
            int r5 = r3 + 3
            int r12 = r2.length
            if (r5 >= r12) goto L58
            char r12 = r2[r3]
            r13 = 97
            if (r12 != r13) goto L58
            int r12 = r3 + 1
            char r12 = r2[r12]
            if (r12 != r11) goto L58
            int r12 = r3 + 2
            char r12 = r2[r12]
            r13 = 115(0x73, float:1.61E-43)
            if (r12 != r13) goto L58
            char r5 = r2[r5]
            if (r5 != r6) goto L58
            int r3 = r3 + 4
        L55:
            r4 = r1
            goto Lc2
        L58:
            r5 = 45
            if (r4 == r5) goto L154
            r5 = 48
            if (r4 < r5) goto L66
            r6 = 57
            if (r4 > r6) goto L66
            goto L154
        L66:
            r6 = 110(0x6e, float:1.54E-43)
            if (r4 != r6) goto L9a
            int r6 = r3 + 2
            int r12 = r2.length
            if (r6 >= r12) goto L9a
            char r12 = r2[r3]
            if (r12 != r7) goto L9a
            int r7 = r3 + 1
            char r7 = r2[r7]
            if (r7 != r11) goto L9a
            char r6 = r2[r6]
            if (r6 != r11) goto L9a
            com.alibaba.fastjson2.JSONReader$Context r4 = r0.context
            long r4 = r4.features
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            long r6 = r6.mask
            long r4 = r4 & r6
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L8f
            r0.wasNull = r10
            int r3 = r3 + 3
            goto L55
        L8f:
            java.lang.String r1 = "boolean value not support input null"
            java.lang.String r1 = r0.info(r1)
            p012ah.C0086a.m464w(r1)
        L98:
            r1 = 0
            return r1
        L9a:
            r6 = 34
            if (r4 != r6) goto L14d
            int r4 = r3 + 1
            int r7 = r2.length
            java.lang.String r11 = "can not convert to boolean : "
            if (r4 >= r7) goto L11c
            char r4 = r2[r4]
            if (r4 != r6) goto L11c
            char r4 = r2[r3]
            int r3 = r3 + 2
            if (r4 == r5) goto L55
            r5 = 78
            if (r4 != r5) goto Lb4
            goto L55
        Lb4:
            r5 = 49
            if (r4 == r5) goto L2d
            r5 = 89
            if (r4 != r5) goto Lbe
            goto L2d
        Lbe:
            p012ah.C0086a.m448g(r4, r11)
            goto L98
        Lc2:
            int r5 = r0.end
            r6 = 26
            if (r3 != r5) goto Lcb
            r5 = r3
        Lc9:
            r3 = r6
            goto Lcf
        Lcb:
            int r5 = r3 + 1
            char r3 = r2[r3]
        Lcf:
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r7 = 32
            if (r3 > r7) goto Lf0
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r15 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r15 == 0) goto Lf0
            int r3 = r0.end
            if (r5 != r3) goto Le6
            goto Lc9
        Le6:
            int r3 = r5 + 1
            char r5 = r2[r5]
            r17 = r5
            r5 = r3
            r3 = r17
            goto Lcf
        Lf0:
            r15 = 44
            if (r3 != r15) goto Lf5
            r1 = r10
        Lf5:
            r0.comma = r1
            if (r1 == 0) goto L117
            int r1 = r0.end
            if (r5 != r1) goto Lff
        Lfd:
            r3 = r6
            goto L104
        Lff:
            int r1 = r5 + 1
            char r3 = r2[r5]
        L103:
            r5 = r1
        L104:
            if (r3 > r7) goto L117
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r1 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r1 == 0) goto L117
            int r1 = r0.end
            if (r5 != r1) goto L112
            goto Lfd
        L112:
            int r1 = r5 + 1
            char r3 = r2[r5]
            goto L103
        L117:
            r0.offset = r5
            r0.f1929ch = r3
            return r4
        L11c:
            java.lang.String r2 = r0.readString()
            java.lang.String r3 = "true"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L129
            return r10
        L129:
            java.lang.String r3 = "false"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L132
            return r1
        L132:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L14a
            java.lang.String r3 = "null"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L141
            goto L14a
        L141:
            java.lang.String r1 = r11.concat(r2)
            p012ah.C0086a.m464w(r1)
            goto L98
        L14a:
            r0.wasNull = r10
            return r1
        L14d:
            java.lang.String r1 = "syntax error : "
            p012ah.C0086a.m448g(r4, r1)
            goto L98
        L154:
            r0.readNumber()
            byte r2 = r0.valueType
            if (r2 != r10) goto L18a
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.NonZeroNumberCastToBooleanAsTrue
            long r4 = r4.mask
            long r2 = r2 & r4
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            int r3 = r0.mag0
            if (r2 == 0) goto L17b
            if (r3 != 0) goto L17a
            int r2 = r0.mag1
            if (r2 != 0) goto L17a
            int r2 = r0.mag2
            if (r2 != 0) goto L17a
            int r2 = r0.mag3
            if (r2 == 0) goto L179
            goto L17a
        L179:
            return r1
        L17a:
            return r10
        L17b:
            if (r3 != 0) goto L18a
            int r2 = r0.mag1
            if (r2 != 0) goto L18a
            int r2 = r0.mag2
            if (r2 != 0) goto L18a
            int r2 = r0.mag3
            if (r2 != r10) goto L18a
            return r10
        L18a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.readBoolValue():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:35:0x007c) to fix multi-entry loop: BACK_EDGE: B:35:0x007c -> B:26:0x0059 */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x021c, code lost:
    
        r1 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0059, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0214  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double readDoubleValue() {
        int i9;
        char c10;
        long j3;
        long j4;
        long j5;
        int i10;
        double d10;
        long j10;
        char c11;
        char c12;
        int i11;
        char[] cArr;
        char c13;
        double d11;
        boolean z9;
        int i12;
        double d12;
        boolean z10;
        int i13;
        char c14;
        int i14;
        char c15;
        char c16;
        int iDigit2;
        int iDigit22;
        int i15;
        char c17;
        char[] cArr2 = this.chars;
        char c18 = this.f1929ch;
        int i16 = this.offset;
        int i17 = this.end;
        if (c18 != '\"' && c18 != '\'') {
            i9 = i16;
            c10 = c18;
            c18 = 0;
        } else if (i16 == i17) {
            i9 = i16;
            c10 = 26;
        } else {
            i9 = i16 + 1;
            c10 = cArr2[i16];
        }
        if (c18 == 0 || c10 != c18) {
            j3 = 1;
            if (c10 < '0' || c10 > '9') {
                j4 = 0;
                if (c10 == '-' || c10 == '+') {
                    j5 = 0;
                }
                j5 = 1;
            } else {
                j4 = 0;
                j5 = '0' - c10;
            }
            while (true) {
                i10 = -1;
                if (j5 > j4) {
                    d10 = 0.0d;
                    break;
                }
                d10 = 0.0d;
                if (i9 + 1 >= i17 || (iDigit22 = IOUtils.digit2(cArr2, i9)) == -1) {
                    break;
                }
                if (-92233720368547758L <= j5) {
                    j5 = (j5 * 100) - ((long) iDigit22);
                    i9 += 2;
                } else {
                    j5 = 1;
                }
            }
            if (j5 > j4 || i9 >= i17) {
                j10 = 48;
                c11 = c10;
            } else {
                j10 = 48;
                c11 = cArr2[i9];
                if (c11 >= '0' && c11 <= '9') {
                    if (Buffer.OVERFLOW_ZONE <= j5) {
                        j5 = ((j5 * 10) + 48) - ((long) c11);
                        i9++;
                    } else {
                        j5 = 1;
                    }
                }
            }
            if (j5 > j4 || i9 >= i17 || cArr2[i9] != '.') {
                c12 = c11;
                i11 = 0;
            } else {
                i9++;
                i11 = 0;
                while (j5 <= j4 && i9 + 1 < i17 && (iDigit2 = IOUtils.digit2(cArr2, i9)) != i10) {
                    if (-92233720368547758L <= j5) {
                        j5 = (j5 * 100) - ((long) iDigit2);
                        i9 += 2;
                        i11 += 2;
                        c11 = c11;
                        i10 = -1;
                    } else {
                        j5 = 1;
                    }
                }
                char c19 = c11;
                if (j5 > j4 || i9 >= i17) {
                    c12 = c19;
                } else {
                    c12 = cArr2[i9];
                    if (c12 >= '0' && c12 <= '9') {
                        if (Buffer.OVERFLOW_ZONE <= j5) {
                            j5 = ((j5 * 10) + j10) - ((long) c12);
                            i9++;
                            i11++;
                        } else {
                            j5 = 1;
                        }
                    }
                }
            }
            if (j5 <= j4) {
                if (i9 == i17) {
                    c12 = 26;
                } else {
                    c12 = cArr2[i9];
                    i9++;
                }
            }
            if (j5 <= j4) {
                if (c12 == 'e' || c12 == 'E') {
                    if (i9 == i17) {
                        i14 = i9;
                        c15 = 26;
                    } else {
                        i14 = i9 + 1;
                        c15 = cArr2[i9];
                    }
                    boolean z11 = c15 == '-';
                    if (z11 || c15 == '+') {
                        if (i14 == i17) {
                            c15 = 26;
                        } else {
                            int i18 = i14 + 1;
                            char c20 = cArr2[i14];
                            i14 = i18;
                            c15 = c20;
                        }
                    } else if (c15 == ',') {
                        throw numberError();
                    }
                    if (c15 < '0' || c15 > '9') {
                        c12 = c15;
                        j5 = 1;
                    } else {
                        int i19 = c15 - '0';
                        while (i14 < i17) {
                            char c21 = cArr2[i14];
                            if (c21 < '0' || c21 > '9') {
                                break;
                            }
                            i19 = (i19 * 10) + (c21 - '0');
                            if (i19 > 2047) {
                                C0086a.m464w(AbstractC0921a.m2249l(i19, "too large exp value : "));
                                return 0.0d;
                            }
                            i14++;
                        }
                        if (z11) {
                            i19 = -i19;
                        }
                        i11 -= i19;
                        if (i14 == i17) {
                            c16 = 26;
                        } else {
                            c16 = cArr2[i14];
                            i14++;
                        }
                        c12 = c16;
                    }
                    i9 = i14;
                } else if (c12 == 'L' || c12 == 'F' || c12 == 'D' || c12 == 'B' || c12 == 'S') {
                    if (i9 == i17) {
                        c12 = 26;
                    } else {
                        c12 = cArr2[i9];
                        i9++;
                    }
                }
            }
            if (j5 <= j4 && c18 != 0) {
                if (c12 == c18) {
                    if (i9 == i17) {
                        i13 = i9;
                        c14 = 26;
                    } else {
                        i13 = i9 + 1;
                        c14 = cArr2[i9];
                    }
                    c12 = c14;
                    i9 = i13;
                } else {
                    j5 = 1;
                }
            }
            int i20 = (j5 > j4 ? 1 : (j5 == j4 ? 0 : -1));
            if (i20 <= 0) {
                if (i11 == 0) {
                    d12 = j5;
                    cArr = cArr2;
                    i12 = i20;
                } else {
                    double d13 = j5;
                    cArr = cArr2;
                    i12 = i20;
                    if (((long) d13) == j5) {
                        if (i11 > 0) {
                            double[] dArr = JSONFactory.DOUBLE_10_POW;
                            if (i11 < dArr.length) {
                                d12 = d13 / dArr[i11];
                            } else if (i11 < 0) {
                                double[] dArr2 = JSONFactory.DOUBLE_10_POW;
                                if (i11 > (-dArr2.length)) {
                                    d12 = d13 * dArr2[-i11];
                                }
                            }
                        }
                    }
                    d12 = d10;
                    z10 = false;
                    if (z10) {
                        if (i11 <= -128 || i11 >= 128) {
                            c13 = c12;
                            j5 = 1;
                            z9 = false;
                            d11 = d12;
                        } else {
                            double dDoubleValue = TypeUtils.doubleValue(c10 == '-' ? -1 : 1, Math.abs(j5), i11);
                            c13 = c12;
                            z9 = false;
                            d11 = dDoubleValue;
                        }
                    } else if (c10 != '-') {
                        c13 = c12;
                        z9 = false;
                        d11 = d12;
                    } else {
                        c13 = c12;
                        z9 = false;
                        d11 = d12;
                    }
                }
                z10 = true;
                if (z10) {
                }
            } else {
                cArr = cArr2;
                c13 = c12;
                d11 = d10;
                z9 = false;
            }
        } else {
            if (i9 == i17) {
                c13 = 26;
            } else {
                c13 = cArr2[i9];
                i9++;
            }
            cArr = cArr2;
            j5 = 0;
            z9 = true;
            d11 = 0.0d;
            j3 = 1;
            j4 = 0;
        }
        if (j5 > j4) {
            readNumber0();
            return getDoubleValue();
        }
        while (c13 <= ' ' && ((j3 << c13) & 4294981377L) != j4) {
            if (i9 == i17) {
                c13 = 26;
            } else {
                char c22 = cArr[i9];
                i9++;
                c13 = c22;
            }
        }
        boolean z12 = c13 == ',';
        this.comma = z12;
        if (z12) {
            if (i9 == i17) {
                i15 = i9;
                c17 = 26;
            } else {
                i15 = i9 + 1;
                c17 = cArr[i9];
            }
            loop1: while (true) {
                char c23 = c17;
                i9 = i15;
                c13 = c23;
                while (c13 <= ' ' && ((j3 << c13) & 4294981377L) != j4) {
                    if (i9 == i17) {
                        c13 = 26;
                    }
                }
                i15 = i9 + 1;
                c17 = cArr[i9];
            }
        }
        this.wasNull = z9;
        this.f1929ch = c13;
        this.offset = i9;
        return d11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x00d3. Please report as an issue. */
    @Override // com.alibaba.fastjson2.JSONReader
    public String readFieldName() {
        int i9;
        char[] cArr;
        int i10;
        char c10;
        long j3;
        long j4;
        long j5;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        JSONReaderUTF16 jSONReaderUTF16;
        char[] cArr2;
        int i11;
        int i12;
        String str;
        char c11 = this.f1929ch;
        if (c11 == '\'' && (this.context.features & JSONReader.Feature.DisableSingleQuote.mask) != 0) {
            throw notSupportName();
        }
        if (c11 != '\"' && c11 != '\'') {
            if ((this.context.features & JSONReader.Feature.AllowUnQuotedFieldNames.mask) == 0 || !JSONReader.isFirstIdentifier(c11)) {
                return null;
            }
            return readFieldNameUnquote();
        }
        char[] cArr3 = this.chars;
        this.nameEscape = false;
        int i13 = this.offset;
        this.nameBegin = i13;
        int i14 = this.end;
        int i15 = 0;
        int i16 = i13;
        while (true) {
            if (i16 >= i14) {
                break;
            }
            char c12 = cArr3[i16];
            if (c12 == '\\') {
                this.nameEscape = true;
                int i17 = i16 + 1;
                char c13 = cArr3[i17];
                if (c13 == 'u') {
                    i17 = i16 + 5;
                } else if (c13 == 'x') {
                    i17 = i16 + 3;
                }
                i16 = i17 + 1;
            } else if (c12 == c11) {
                this.nameLength = i15;
                this.nameEnd = i16;
                int i18 = i16 + 1;
                char c14 = i18 < i14 ? cArr3[i18] : (char) 26;
                while (c14 <= ' ' && ((1 << c14) & 4294981377L) != 0) {
                    i18++;
                    c14 = cArr3[i18];
                }
                if (c14 != ':') {
                    C0086a.m464w(AbstractC0921a.m2249l(i18, "syntax error : "));
                    return null;
                }
                i16 = i18 + 1;
                char c15 = i16 == i14 ? (char) 26 : cArr3[i16];
                while (c15 <= ' ' && ((1 << c15) & 4294981377L) != 0) {
                    i16++;
                    c15 = cArr3[i16];
                }
                this.offset = i16 + 1;
                this.f1929ch = c15;
            } else {
                i16++;
            }
            i15++;
        }
        int i19 = this.nameEnd;
        if (i19 < i13) {
            C0086a.m464w(AbstractC0921a.m2249l(i16, "syntax error : "));
            return null;
        }
        if (this.nameEscape) {
            return getFieldName();
        }
        switch (this.nameLength) {
            case 1:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c16 = cArr[i10];
                if ((c16 & 255) == c16) {
                    j4 = c16;
                    j5 = j4;
                    j10 = j3;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 2:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c17 = cArr[i10];
                char c18 = cArr[i10 + 1];
                if ((c17 & 255) == c17 && (c18 & 255) == c18) {
                    j4 = (c18 << '\b') + c17;
                    j5 = j4;
                    j10 = j3;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 3:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c19 = cArr[i10];
                char c20 = cArr[i10 + 1];
                char c21 = cArr[i10 + 2];
                if ((c19 & 255) == c19 && (c20 & 255) == c20 && (c21 & 255) == c21) {
                    j4 = (c21 << 16) + (c20 << '\b') + c19;
                    j5 = j4;
                    j10 = j3;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 4:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c22 = cArr[i10];
                char c23 = cArr[i10 + 1];
                char c24 = cArr[i10 + 2];
                char c25 = cArr[i10 + 3];
                if ((c22 & 255) == c22 && (c23 & 255) == c23 && (c24 & 255) == c24 && (c25 & 255) == c25) {
                    j4 = (c25 << 24) + (c24 << 16) + (c23 << '\b') + c22;
                    j5 = j4;
                    j10 = j3;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 5:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c26 = cArr[i10];
                char c27 = cArr[i10 + 1];
                char c28 = cArr[i10 + 2];
                char c29 = cArr[i10 + 3];
                char c30 = cArr[i10 + 4];
                if ((c26 & 255) == c26 && (c27 & 255) == c27 && (c28 & 255) == c28 && (c29 & 255) == c29 && (c30 & 255) == c30) {
                    j4 = (((long) c30) << 32) + (((long) c29) << 24) + (((long) c28) << 16) + (((long) c27) << 8) + ((long) c26);
                    j5 = j4;
                    j10 = j3;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 6:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c31 = cArr[i10];
                char c32 = cArr[i10 + 1];
                char c33 = cArr[i10 + 2];
                char c34 = cArr[i10 + 3];
                char c35 = cArr[i10 + 4];
                char c36 = cArr[i10 + 5];
                if ((c31 & 255) == c31 && (c32 & 255) == c32 && (c33 & 255) == c33 && (c34 & 255) == c34 && (c35 & 255) == c35 && (c36 & 255) == c36) {
                    j4 = (((long) c36) << 40) + (((long) c35) << 32) + (((long) c34) << 24) + (((long) c33) << 16) + (((long) c32) << 8) + ((long) c31);
                    j5 = j4;
                    j10 = j3;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 7:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c37 = cArr[i10];
                char c38 = cArr[i10 + 1];
                char c39 = cArr[i10 + 2];
                char c40 = cArr[i10 + 3];
                char c41 = cArr[i10 + 4];
                char c42 = cArr[i10 + 5];
                char c43 = cArr[i10 + 6];
                if ((c37 & 255) == c37 && (c38 & 255) == c38 && (c39 & 255) == c39 && (c40 & 255) == c40 && (c41 & 255) == c41 && (c42 & 255) == c42 && (c43 & 255) == c43) {
                    j4 = (((long) c43) << 48) + (((long) c42) << 40) + (((long) c41) << 32) + (((long) c40) << 24) + (((long) c39) << 16) + (((long) c38) << 8) + ((long) c37);
                    j5 = j4;
                    j10 = j3;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 8:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c44 = cArr[i10];
                char c45 = cArr[i10 + 1];
                char c46 = cArr[i10 + 2];
                char c47 = cArr[i10 + 3];
                char c48 = cArr[i10 + 4];
                char c49 = cArr[i10 + 5];
                char c50 = cArr[i10 + 6];
                char c51 = cArr[i10 + 7];
                if ((c44 & 255) == c44 && (c45 & 255) == c45 && (c46 & 255) == c46 && (c47 & 255) == c47 && (c48 & 255) == c48 && (c49 & 255) == c49 && (c50 & 255) == c50 && (c51 & 255) == c51) {
                    j4 = (((long) c51) << 56) + (((long) c50) << 48) + (((long) c49) << 40) + (((long) c48) << 32) + (((long) c47) << 24) + (((long) c46) << 16) + (((long) c45) << 8) + ((long) c44);
                    j5 = j4;
                    j10 = j3;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 9:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c52 = cArr[i10];
                char c53 = cArr[i10 + 1];
                char c54 = cArr[i10 + 2];
                char c55 = cArr[i10 + 3];
                char c56 = cArr[i10 + 4];
                char c57 = cArr[i10 + 5];
                char c58 = cArr[i10 + 6];
                char c59 = cArr[i10 + 7];
                char c60 = cArr[i10 + 8];
                if ((c52 & 255) == c52 && (c53 & 255) == c53 && (c54 & 255) == c54 && (c55 & 255) == c55 && (c56 & 255) == c56 && (c57 & 255) == c57 && (c58 & 255) == c58 && (c59 & 255) == c59 && (c60 & 255) == c60) {
                    j11 = c52;
                    j12 = (((long) c60) << 56) + (((long) c59) << 48) + (((long) c58) << 40) + (((long) c57) << 32) + (((long) c56) << 24) + (((long) c55) << 16) + (((long) c54) << 8) + ((long) c53);
                    j10 = j12;
                    j5 = j11;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 10:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c61 = cArr[i10];
                char c62 = cArr[i10 + 1];
                char c63 = cArr[i10 + 2];
                char c64 = cArr[i10 + 3];
                char c65 = cArr[i10 + 4];
                char c66 = cArr[i10 + 5];
                char c67 = cArr[i10 + 6];
                char c68 = cArr[i10 + 7];
                char c69 = cArr[i10 + 8];
                char c70 = cArr[i10 + 9];
                if ((c61 & 255) == c61 && (c62 & 255) == c62 && (c63 & 255) == c63 && (c64 & 255) == c64 && (c65 & 255) == c65 && (c66 & 255) == c66 && (c67 & 255) == c67 && (c68 & 255) == c68 && (c69 & 255) == c69 && (c70 & 255) == c70) {
                    j11 = (c62 << '\b') + c61;
                    j12 = (((long) c70) << 56) + (((long) c69) << 48) + (((long) c68) << 40) + (((long) c67) << 32) + (((long) c66) << 24) + (((long) c65) << 16) + (((long) c64) << 8) + ((long) c63);
                    j10 = j12;
                    j5 = j11;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 11:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c71 = cArr[i10];
                char c72 = cArr[i10 + 1];
                char c73 = cArr[i10 + 2];
                char c74 = cArr[i10 + 3];
                char c75 = cArr[i10 + 4];
                char c76 = cArr[i10 + 5];
                char c77 = cArr[i10 + 6];
                char c78 = cArr[i10 + 7];
                char c79 = cArr[i10 + 8];
                char c80 = cArr[i10 + 9];
                char c81 = cArr[i10 + 10];
                if ((c71 & 255) == c71 && (c72 & 255) == c72 && (c73 & 255) == c73 && (c74 & 255) == c74 && (c75 & 255) == c75 && (c76 & 255) == c76 && (c77 & 255) == c77 && (c78 & 255) == c78 && (c79 & 255) == c79 && (c80 & 255) == c80 && (c81 & 255) == c81) {
                    j13 = (c73 << 16) + (c72 << '\b') + c71;
                    j14 = (((long) c81) << 56) + (((long) c80) << 48) + (((long) c79) << 40) + (((long) c78) << 32) + (((long) c77) << 24) + (((long) c76) << 16) + (((long) c75) << 8) + ((long) c74);
                    j10 = j14;
                    j5 = j13;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 12:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c82 = cArr[i10];
                char c83 = cArr[i10 + 1];
                char c84 = cArr[i10 + 2];
                char c85 = cArr[i10 + 3];
                char c86 = cArr[i10 + 4];
                char c87 = cArr[i10 + 5];
                char c88 = cArr[i10 + 6];
                char c89 = cArr[i10 + 7];
                char c90 = cArr[i10 + 8];
                char c91 = cArr[i10 + 9];
                char c92 = cArr[i10 + 10];
                char c93 = cArr[i10 + 11];
                if ((c82 & 255) == c82 && (c83 & 255) == c83 && (c84 & 255) == c84 && (c85 & 255) == c85 && (c86 & 255) == c86 && (c87 & 255) == c87 && (c88 & 255) == c88 && (c89 & 255) == c89 && (c90 & 255) == c90 && (c91 & 255) == c91 && (c92 & 255) == c92 && (c93 & 255) == c93) {
                    j13 = (c85 << 24) + (c84 << 16) + (c83 << '\b') + c82;
                    j15 = (((long) c93) << 56) + (((long) c92) << 48) + (((long) c91) << 40) + (((long) c90) << 32) + (((long) c89) << 24) + (((long) c88) << 16) + (((long) c87) << 8);
                    j16 = c86;
                    j14 = j15 + j16;
                    j10 = j14;
                    j5 = j13;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 13:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c94 = cArr[i10];
                char c95 = cArr[i10 + 1];
                char c96 = cArr[i10 + 2];
                char c97 = cArr[i10 + 3];
                char c98 = cArr[i10 + 4];
                char c99 = cArr[i10 + 5];
                char c100 = cArr[i10 + 6];
                char c101 = cArr[i10 + 7];
                char c102 = cArr[i10 + 8];
                char c103 = cArr[i10 + 9];
                char c104 = cArr[i10 + 10];
                char c105 = cArr[i10 + 11];
                char c106 = cArr[i10 + 12];
                if ((c94 & 255) == c94 && (c95 & 255) == c95 && (c96 & 255) == c96 && (c97 & 255) == c97 && (c98 & 255) == c98 && (c99 & 255) == c99 && (c100 & 255) == c100 && (c101 & 255) == c101 && (c102 & 255) == c102 && (c103 & 255) == c103 && (c104 & 255) == c104 && (c105 & 255) == c105 && (c106 & 255) == c106) {
                    j13 = ((long) c94) + (((long) c98) << 32) + (((long) c97) << 24) + (((long) c96) << 16) + (((long) c95) << 8);
                    j15 = (((long) c106) << 56) + (((long) c105) << 48) + (((long) c104) << 40) + (((long) c103) << 32) + (((long) c102) << 24) + (((long) c101) << 16) + (((long) c100) << 8);
                    j16 = c99;
                    j14 = j15 + j16;
                    j10 = j14;
                    j5 = j13;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 14:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c107 = cArr[i10];
                char c108 = cArr[i10 + 1];
                char c109 = cArr[i10 + 2];
                char c110 = cArr[i10 + 3];
                char c111 = cArr[i10 + 4];
                char c112 = cArr[i10 + 5];
                char c113 = cArr[i10 + 6];
                char c114 = cArr[i10 + 7];
                char c115 = cArr[i10 + 8];
                char c116 = cArr[i10 + 9];
                char c117 = cArr[i10 + 10];
                char c118 = cArr[i10 + 11];
                char c119 = cArr[i10 + 12];
                char c120 = cArr[i10 + 13];
                if ((c107 & 255) == c107 && (c108 & 255) == c108 && (c109 & 255) == c109 && (c110 & 255) == c110 && (c111 & 255) == c111 && (c112 & 255) == c112 && (c113 & 255) == c113 && (c114 & 255) == c114 && (c115 & 255) == c115 && (c116 & 255) == c116 && (c117 & 255) == c117 && (c118 & 255) == c118 && (c119 & 255) == c119 && (c120 & 255) == c120) {
                    j13 = ((long) c107) + (((long) c112) << 40) + (((long) c111) << 32) + (((long) c110) << 24) + (((long) c109) << 16) + (((long) c108) << 8);
                    j15 = (((long) c120) << 56) + (((long) c119) << 48) + (((long) c118) << 40) + (((long) c117) << 32) + (((long) c116) << 24) + (((long) c115) << 16) + (((long) c114) << 8);
                    j16 = c113;
                    j14 = j15 + j16;
                    j10 = j14;
                    j5 = j13;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 15:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                char c121 = cArr[i10];
                char c122 = cArr[i10 + 1];
                char c123 = cArr[i10 + 2];
                char c124 = cArr[i10 + 3];
                char c125 = cArr[i10 + 4];
                char c126 = cArr[i10 + 5];
                char c127 = cArr[i10 + 6];
                char c128 = cArr[i10 + 7];
                char c129 = cArr[i10 + 8];
                char c130 = cArr[i10 + 9];
                char c131 = cArr[i10 + 10];
                char c132 = cArr[i10 + 11];
                char c133 = cArr[i10 + 12];
                char c134 = cArr[i10 + 13];
                char c135 = cArr[i10 + 14];
                if ((c121 & 255) == c121 && (c122 & 255) == c122 && (c123 & 255) == c123 && (c124 & 255) == c124 && (c125 & 255) == c125 && (c126 & 255) == c126 && (c127 & 255) == c127 && (c128 & 255) == c128 && (c129 & 255) == c129 && (c130 & 255) == c130 && (c131 & 255) == c131 && (c132 & 255) == c132 && (c133 & 255) == c133 && (c134 & 255) == c134 && (c135 & 255) == c135) {
                    j13 = ((long) c121) + (((long) c127) << 48) + (((long) c126) << 40) + (((long) c125) << 32) + (((long) c124) << 24) + (((long) c123) << 16) + (((long) c122) << 8);
                    j15 = (((long) c135) << 56) + (((long) c134) << 48) + (((long) c133) << 40) + (((long) c132) << 32) + (((long) c131) << 24) + (((long) c130) << 16) + (((long) c129) << 8);
                    j16 = c128;
                    j14 = j15 + j16;
                    j10 = j14;
                    j5 = j13;
                }
                j5 = j3;
                j10 = j5;
                break;
            case 16:
                char c136 = cArr3[i13];
                char c137 = cArr3[i13 + 1];
                char c138 = cArr3[i13 + 2];
                j3 = -1;
                char c139 = cArr3[i13 + 3];
                char c140 = cArr3[i13 + 4];
                char c141 = cArr3[i13 + 5];
                c10 = ' ';
                char c142 = cArr3[i13 + 6];
                char c143 = cArr3[i13 + 7];
                char c144 = cArr3[i13 + 8];
                char c145 = cArr3[i13 + 9];
                char c146 = cArr3[i13 + 10];
                char c147 = cArr3[i13 + 11];
                cArr = cArr3;
                char c148 = cArr[i13 + 12];
                i9 = i19;
                char c149 = cArr[i13 + 13];
                i10 = i13;
                char c150 = cArr[i13 + 14];
                char c151 = cArr[i10 + 15];
                if ((c136 & 255) == c136 && (c137 & 255) == c137 && (c138 & 255) == c138 && (c139 & 255) == c139 && (c140 & 255) == c140 && (c141 & 255) == c141 && (c142 & 255) == c142 && (c143 & 255) == c143 && (c144 & 255) == c144 && (c145 & 255) == c145 && (c146 & 255) == c146 && (c147 & 255) == c147 && (c148 & 255) == c148 && (c149 & 255) == c149 && (c150 & 255) == c150 && (c151 & 255) == c151) {
                    j11 = (((long) c143) << 56) + (((long) c142) << 48) + (((long) c141) << 40) + (((long) c140) << 32) + (((long) c139) << 24) + (((long) c138) << 16) + (((long) c137) << 8) + ((long) c136);
                    j12 = (((long) c151) << 56) + (((long) c150) << 48) + (((long) c149) << 40) + (((long) c148) << 32) + (((long) c147) << 24) + (((long) c146) << 16) + (((long) c145) << 8) + ((long) c144);
                    j10 = j12;
                    j5 = j11;
                }
                j5 = j3;
                j10 = j5;
                break;
            default:
                i9 = i19;
                cArr = cArr3;
                i10 = i13;
                c10 = ' ';
                j3 = -1;
                j5 = j3;
                j10 = j5;
                break;
        }
        if (j5 == j3) {
            jSONReaderUTF16 = this;
            cArr2 = cArr;
            i11 = i9;
            i12 = i10;
        } else if (j10 != j3) {
            long j17 = j5 ^ j10;
            JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr = JSONFactory.NAME_CACHE2;
            int length = ((int) (j17 ^ (j17 >>> c10))) & (nameCacheEntry2Arr.length - 1);
            JSONFactory.NameCacheEntry2 nameCacheEntry2 = nameCacheEntry2Arr[length];
            if (nameCacheEntry2 == null) {
                String str2 = this.str;
                if (str2 != null) {
                    str = str2.substring(i10, i9);
                } else {
                    int i20 = i10;
                    str = new String(cArr, i20, i9 - i20);
                }
                String str3 = str;
                nameCacheEntry2Arr[length] = new JSONFactory.NameCacheEntry2(str3, j5, j10);
                return str3;
            }
            jSONReaderUTF16 = this;
            cArr2 = cArr;
            i11 = i9;
            i12 = i10;
            if (nameCacheEntry2.value0 == j5 && nameCacheEntry2.value1 == j10) {
                return nameCacheEntry2.name;
            }
        } else {
            jSONReaderUTF16 = this;
            cArr2 = cArr;
            i11 = i9;
            i12 = i10;
            NameCacheEntry[] nameCacheEntryArr = JSONFactory.NAME_CACHE;
            int length2 = ((int) ((j5 >>> c10) ^ j5)) & (nameCacheEntryArr.length - 1);
            NameCacheEntry nameCacheEntry = nameCacheEntryArr[length2];
            if (nameCacheEntry == null) {
                String str4 = jSONReaderUTF16.str;
                String strSubstring = str4 != null ? str4.substring(i12, i11) : new String(cArr2, i12, i11 - i12);
                nameCacheEntryArr[length2] = new NameCacheEntry(strSubstring, j5);
                return strSubstring;
            }
            if (nameCacheEntry.value == j5) {
                return nameCacheEntry.name;
            }
        }
        String str5 = jSONReaderUTF16.str;
        return str5 != null ? str5.substring(i12, i11) : new String(cArr2, i12, i11 - i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x041c  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readFieldNameHashCode() {
        char[] cArr;
        int i9;
        int i10;
        char c10;
        char c11;
        char c12;
        char c13;
        int i11;
        long j3;
        int i12;
        int i13;
        char c14;
        char c15;
        int i14;
        char c16;
        char c17;
        int i15;
        char cChar4;
        char cChar1;
        long j4;
        long j5;
        char c18;
        char[] cArr2 = this.chars;
        char c19 = this.f1929ch;
        if (c19 == '/') {
            skipComment();
            c19 = this.f1929ch;
        }
        if (c19 == '\'' && (this.context.features & JSONReader.Feature.DisableSingleQuote.mask) != 0) {
            throw notSupportName();
        }
        if (c19 != '\"' && c19 != '\'') {
            if ((this.context.features & JSONReader.Feature.AllowUnQuotedFieldNames.mask) != 0 && JSONReader.isFirstIdentifier(c19)) {
                return readFieldNameHashCodeUnquote();
            }
            if (c19 == '}' || isNull()) {
                return -1L;
            }
            C0086a.m464w(info((c19 != '[' || this.nameBegin <= 0) ? "illegal fieldName input" + c19 : "illegal fieldName input " + c19 + ", previous fieldName " + getFieldName()));
            return 0L;
        }
        this.stringValue = null;
        this.nameEscape = false;
        int i16 = this.offset;
        this.nameBegin = i16;
        int i17 = this.end;
        int i18 = i16 + 9;
        if (i18 < i17) {
            c10 = '8';
            char c20 = cArr2[i16];
            c11 = '0';
            int i19 = i16 + 1;
            c12 = '(';
            char c21 = cArr2[i19];
            int i20 = i16 + 2;
            char c22 = cArr2[i20];
            c13 = ' ';
            int i21 = i16 + 3;
            char c23 = cArr2[i21];
            int i22 = i16 + 4;
            char c24 = cArr2[i22];
            int i23 = i16 + 5;
            cArr = cArr2;
            char c25 = cArr[i23];
            i9 = i16;
            i11 = i9 + 6;
            char c26 = cArr[i11];
            i10 = i17;
            int i24 = i9 + 7;
            char c27 = cArr[i24];
            int i25 = i9 + 8;
            char c28 = cArr[i25];
            if (c20 != c19) {
                if (c21 != c19 || c20 == 0) {
                    c18 = c28;
                } else {
                    c18 = c28;
                    if (c20 != '\\' && c20 <= 255) {
                        j3 = (byte) c20;
                        this.nameLength = 1;
                        this.nameEnd = i19;
                        i11 = i20;
                    }
                }
                if (c22 == c19 && c20 != 0 && c20 != '\\' && c21 != '\\' && c20 <= 255 && c21 <= 255) {
                    j3 = (((byte) c21) << 8) + c20;
                    this.nameLength = 2;
                    this.nameEnd = i20;
                    i11 = i21;
                } else if (c23 == c19 && c20 != 0 && c20 != '\\' && c21 != '\\' && c22 != '\\' && c20 <= 255 && c21 <= 255 && c22 <= 255) {
                    long j10 = (((byte) c22) << JSONB.Constants.BC_INT32_NUM_16) + (c21 << '\b') + c20;
                    this.nameLength = 3;
                    this.nameEnd = i21;
                    i11 = i22;
                    j3 = j10;
                } else if (c24 == c19 && c20 != 0 && c20 != '\\' && c21 != '\\' && c22 != '\\' && c23 != '\\' && c20 <= 255 && c21 <= 255 && c22 <= 255 && c23 <= 255) {
                    this.nameLength = 4;
                    this.nameEnd = i22;
                    j3 = (((byte) c23) << 24) + (c22 << 16) + (c21 << '\b') + c20;
                    i11 = i23;
                } else if (c25 == c19 && c20 != 0 && c20 != '\\' && c21 != '\\' && c22 != '\\' && c23 != '\\' && c24 != '\\' && c20 <= 255 && c21 <= 255 && c22 <= 255 && c23 <= 255 && c24 <= 255) {
                    j3 = (((long) ((byte) c24)) << 32) + (((long) c23) << 24) + (((long) c22) << 16) + (((long) c21) << 8) + ((long) c20);
                    this.nameLength = 5;
                    this.nameEnd = i23;
                } else if (c26 == c19 && c20 != 0 && c20 != '\\' && c21 != '\\' && c22 != '\\' && c23 != '\\' && c24 != '\\' && c25 != '\\' && c20 <= 255 && c21 <= 255 && c22 <= 255 && c23 <= 255 && c24 <= 255 && c25 <= 255) {
                    j3 = ((long) c20) + (((long) ((byte) c25)) << 40) + (((long) c24) << 32) + (((long) c23) << 24) + (((long) c22) << 16) + (((long) c21) << 8);
                    this.nameLength = 6;
                    this.nameEnd = i11;
                    i11 = i24;
                } else if (c27 == c19 && c20 != 0 && c20 != '\\' && c21 != '\\' && c22 != '\\' && c23 != '\\' && c24 != '\\' && c25 != '\\' && c26 != '\\' && c20 <= 255 && c21 <= 255 && c22 <= 255 && c23 <= 255 && c24 <= 255 && c25 <= 255 && c26 <= 255) {
                    j3 = ((long) c20) + (((long) ((byte) c26)) << 48) + (((long) c25) << 40) + (((long) c24) << 32) + (((long) c23) << 24) + (((long) c22) << 16) + (((long) c21) << 8);
                    this.nameLength = 7;
                    this.nameEnd = i24;
                    i11 = i25;
                } else if (c18 == c19 && c20 != 0 && c20 != '\\' && c21 != '\\' && c22 != '\\' && c23 != '\\' && c24 != '\\' && c25 != '\\' && c26 != '\\' && c27 != '\\' && c20 <= 255 && c21 <= 255 && c22 <= 255 && c23 <= 255 && c24 <= 255 && c25 <= 255 && c26 <= 255 && c27 <= 255) {
                    j3 = ((long) c20) + (((long) ((byte) c27)) << 56) + (((long) c26) << 48) + (((long) c25) << 40) + (((long) c24) << 32) + (((long) c23) << 24) + (((long) c22) << 16) + (((long) c21) << 8);
                    this.nameLength = 8;
                    this.nameEnd = i25;
                    i11 = i18;
                }
            }
            if (j3 != 0) {
                i12 = i10;
                int i26 = 0;
                while (true) {
                    if (i11 < i12) {
                        char cChar42 = cArr[i11];
                        if (cChar42 != c19) {
                            if (cChar42 == '\\') {
                                this.nameEscape = true;
                                int i27 = i11 + 1;
                                char c29 = cArr[i27];
                                if (c29 == 'u') {
                                    char c30 = cArr[i11 + 2];
                                    char c31 = cArr[i11 + 3];
                                    char c32 = cArr[i11 + 4];
                                    i11 += 5;
                                    cChar42 = JSONReader.char4(c30, c31, c32, cArr[i11]);
                                } else if (c29 != 'x') {
                                    cChar42 = char1(c29);
                                    i11 = i27;
                                } else {
                                    char c33 = cArr[i11 + 2];
                                    i11 += 3;
                                    cChar42 = JSONReader.char2(c33, cArr[i11]);
                                }
                            }
                            if (cChar42 <= 255 && i26 < 8 && (i26 != 0 || cChar42 != 0)) {
                                switch (i26) {
                                    case 0:
                                        j3 = (byte) cChar42;
                                        break;
                                    case 1:
                                        j3 = ((long) (((byte) cChar42) << 8)) + (j3 & 255);
                                        break;
                                    case 2:
                                        j4 = ((byte) cChar42) << JSONB.Constants.BC_INT32_NUM_16;
                                        j5 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                        j3 = j4 + (j3 & j5);
                                        break;
                                    case 3:
                                        j4 = ((byte) cChar42) << 24;
                                        j5 = 16777215;
                                        j3 = j4 + (j3 & j5);
                                        break;
                                    case 4:
                                        j4 = ((long) ((byte) cChar42)) << c13;
                                        j5 = 4294967295L;
                                        j3 = j4 + (j3 & j5);
                                        break;
                                    case 5:
                                        j4 = ((long) ((byte) cChar42)) << c12;
                                        j5 = 1099511627775L;
                                        j3 = j4 + (j3 & j5);
                                        break;
                                    case 6:
                                        j4 = ((long) ((byte) cChar42)) << c11;
                                        j5 = 281474976710655L;
                                        j3 = j4 + (j3 & j5);
                                        break;
                                    case 7:
                                        j4 = ((long) ((byte) cChar42)) << c10;
                                        j5 = 72057594037927935L;
                                        j3 = j4 + (j3 & j5);
                                        break;
                                }
                                i11++;
                                i26++;
                            }
                        } else if (i26 == 0) {
                            i11 = this.nameBegin;
                        } else {
                            this.nameLength = i26;
                            this.nameEnd = i11;
                            i11++;
                        }
                    }
                }
                i11 = this.nameBegin;
                j3 = 0;
            } else {
                i12 = i10;
            }
            if (j3 == 0) {
                j3 = Fnv.MAGIC_HASH_CODE;
                int i28 = i11;
                int i29 = 0;
                while (true) {
                    char c34 = cArr[i28];
                    if (c34 == '\\') {
                        this.nameEscape = true;
                        int i30 = i28 + 1;
                        char c35 = cArr[i30];
                        if (c35 == 'u') {
                            char c36 = cArr[i28 + 2];
                            char c37 = cArr[i28 + 3];
                            char c38 = cArr[i28 + 4];
                            i15 = i28 + 5;
                            cChar4 = JSONReader.char4(c36, c37, c38, cArr[i15]);
                        } else if (c35 != 'x') {
                            cChar1 = char1(c35);
                            j3 = (j3 ^ ((long) cChar1)) * Fnv.MAGIC_PRIME;
                            i28 = i30 + 1;
                            c17 = c13;
                        } else {
                            char c39 = cArr[i28 + 2];
                            i15 = i28 + 3;
                            cChar4 = JSONReader.char2(c39, cArr[i15]);
                        }
                        char c40 = cChar4;
                        i30 = i15;
                        cChar1 = c40;
                        j3 = (j3 ^ ((long) cChar1)) * Fnv.MAGIC_PRIME;
                        i28 = i30 + 1;
                        c17 = c13;
                    } else if (c34 == c19) {
                        this.nameLength = i29;
                        this.nameEnd = i28;
                        i11 = i28 + 1;
                    } else {
                        c17 = c13;
                        i28++;
                        j3 = (j3 ^ ((long) c34)) * Fnv.MAGIC_PRIME;
                    }
                    i29++;
                    c13 = c17;
                }
            }
            if (i11 != i12) {
                i13 = i11;
                c14 = 26;
            } else {
                i13 = i11 + 1;
                c14 = cArr[i11];
            }
            for (c15 = c13; c14 <= c15 && ((1 << c14) & 4294981377L) != 0; c15 = ' ') {
                if (i13 != i12) {
                    c14 = 26;
                } else {
                    c14 = cArr[i13];
                    i13++;
                }
            }
            if (c14 == ':') {
                C0086a.m464w(info("expect ':', but " + c14));
                return 0L;
            }
            if (i13 == i12) {
                i14 = i13;
                c16 = 26;
            } else {
                i14 = i13 + 1;
                c16 = cArr[i13];
            }
            while (c16 <= ' ' && ((1 << c16) & 4294981377L) != 0) {
                if (i14 == i12) {
                    c16 = 26;
                } else {
                    int i31 = i14 + 1;
                    char c41 = cArr[i14];
                    i14 = i31;
                    c16 = c41;
                }
            }
            this.offset = i14;
            this.f1929ch = c16;
            return j3;
        }
        cArr = cArr2;
        i9 = i16;
        i10 = i17;
        c10 = '8';
        c11 = '0';
        c12 = '(';
        c13 = ' ';
        j3 = 0;
        i11 = i9;
        if (j3 != 0) {
        }
        if (j3 == 0) {
        }
        if (i11 != i12) {
        }
        while (c14 <= c15) {
            if (i13 != i12) {
            }
        }
        if (c14 == ':') {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0113, code lost:
    
        r26.nameLength = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0115, code lost:
    
        if (r8 != 26) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0117, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0119, code lost:
    
        r5 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011b, code lost:
    
        r26.nameEnd = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011f, code lost:
    
        if (r8 > ' ') goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0127, code lost:
    
        if (((1 << r8) & 4294981377L) == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0129, code lost:
    
        if (r2 != r3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012b, code lost:
    
        r5 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012d, code lost:
    
        r5 = r4[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0137, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013e  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readFieldNameHashCodeUnquote() {
        int i9;
        char c10;
        int i10;
        char c11;
        long j3;
        long j4;
        this.nameEscape = false;
        int i11 = this.offset;
        int i12 = this.end;
        char[] cArr = this.chars;
        char c12 = this.f1929ch;
        this.nameBegin = i11 - 1;
        int i13 = 0;
        char cChar4 = c12;
        long j5 = 0;
        while (true) {
            boolean z9 = true;
            if (i11 <= i12) {
                if (cChar4 != '\f' && cChar4 != '\r' && cChar4 != 26 && cChar4 != ':' && cChar4 != '[' && cChar4 != ']' && cChar4 != '{' && cChar4 != '}' && cChar4 != ' ' && cChar4 != '!') {
                    switch (cChar4) {
                        case '\b':
                        case '\t':
                        case '\n':
                            break;
                        default:
                            switch (cChar4) {
                                case '(':
                                case ')':
                                case '*':
                                case '+':
                                case ',':
                                case ParserConstants.PROTECTED /* 45 */:
                                case '.':
                                case '/':
                                    break;
                                default:
                                    switch (cChar4) {
                                        case ParserConstants.WHEN /* 60 */:
                                        case ParserConstants.WHILE /* 61 */:
                                        case ParserConstants.INTEGER_LITERAL /* 62 */:
                                            break;
                                        default:
                                            if (cChar4 == '\\') {
                                                this.nameEscape = true;
                                                int i14 = i11 + 1;
                                                char c13 = cArr[i11];
                                                if (c13 == '\"' || c13 == ':' || c13 == '@' || c13 == '\\') {
                                                    i11 = i14;
                                                    cChar4 = c13;
                                                } else if (c13 == 'u') {
                                                    cChar4 = JSONReader.char4(cArr[i14], cArr[i11 + 2], cArr[i11 + 3], cArr[i11 + 4]);
                                                    i11 += 5;
                                                } else if (c13 == 'x') {
                                                    cChar4 = JSONReader.char2(cArr[i14], cArr[i11 + 2]);
                                                    i11 += 3;
                                                } else if (c13 != '*' && c13 != '+') {
                                                    switch (c13) {
                                                        default:
                                                            switch (c13) {
                                                                case ParserConstants.WHEN /* 60 */:
                                                                case ParserConstants.WHILE /* 61 */:
                                                                case ParserConstants.INTEGER_LITERAL /* 62 */:
                                                                    break;
                                                                default:
                                                                    cChar4 = char1(c13);
                                                                    i11 = i14;
                                                                    break;
                                                            }
                                                        case ParserConstants.PROTECTED /* 45 */:
                                                        case '.':
                                                        case '/':
                                                            break;
                                                    }
                                                }
                                            }
                                            if (cChar4 <= 255 && i13 < 8 && (i13 != 0 || cChar4 != 0)) {
                                                byte b10 = (byte) cChar4;
                                                switch (i13) {
                                                    case 0:
                                                        j5 = b10;
                                                        break;
                                                    case 1:
                                                        j3 = b10 << 8;
                                                        j4 = 255;
                                                        j5 = (j5 & j4) + j3;
                                                        break;
                                                    case 2:
                                                        j3 = b10 << JSONB.Constants.BC_INT32_NUM_16;
                                                        j4 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                                        j5 = (j5 & j4) + j3;
                                                        break;
                                                    case 3:
                                                        j3 = b10 << 24;
                                                        j4 = 16777215;
                                                        j5 = (j5 & j4) + j3;
                                                        break;
                                                    case 4:
                                                        j3 = ((long) b10) << 32;
                                                        j4 = 4294967295L;
                                                        j5 = (j5 & j4) + j3;
                                                        break;
                                                    case 5:
                                                        j3 = ((long) b10) << 40;
                                                        j4 = 1099511627775L;
                                                        j5 = (j5 & j4) + j3;
                                                        break;
                                                    case 6:
                                                        j3 = ((long) b10) << 48;
                                                        j4 = 281474976710655L;
                                                        j5 = (j5 & j4) + j3;
                                                        break;
                                                    case 7:
                                                        j3 = ((long) b10) << 56;
                                                        j4 = 72057594037927935L;
                                                        j5 = (j5 & j4) + j3;
                                                        break;
                                                }
                                                if (i11 == i12) {
                                                    cChar4 = 26;
                                                } else {
                                                    cChar4 = cArr[i11];
                                                    i11++;
                                                }
                                                i13++;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (j5 == 0) {
                        j5 = -3750763034362895579L;
                        char c14 = c12;
                        int i15 = i11;
                        int i16 = 0;
                        while (true) {
                            if (c14 == '\\') {
                                this.nameEscape = z9;
                                int i17 = i15 + 1;
                                char cChar42 = cArr[i15];
                                if (cChar42 != '\"' && cChar42 != ':') {
                                    if (cChar42 != '@' && cChar42 != '\\') {
                                        if (cChar42 != 'u') {
                                            if (cChar42 != 'x') {
                                                if (cChar42 != '*' && cChar42 != '+') {
                                                    switch (cChar42) {
                                                        case ParserConstants.PROTECTED /* 45 */:
                                                        case '.':
                                                        case '/':
                                                            break;
                                                        default:
                                                            switch (cChar42) {
                                                                case ParserConstants.WHEN /* 60 */:
                                                                case ParserConstants.WHILE /* 61 */:
                                                                case ParserConstants.INTEGER_LITERAL /* 62 */:
                                                                    break;
                                                                default:
                                                                    cChar42 = char1(cChar42);
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            } else {
                                                cChar42 = JSONReader.char2(cArr[i17], cArr[i15 + 2]);
                                                i17 = i15 + 3;
                                            }
                                        } else {
                                            cChar42 = JSONReader.char4(cArr[i17], cArr[i15 + 2], cArr[i15 + 3], cArr[i15 + 4]);
                                            i17 = i15 + 5;
                                        }
                                    }
                                }
                                long j10 = (j5 ^ ((long) cChar42)) * Fnv.MAGIC_PRIME;
                                if (i17 == i12) {
                                    i15 = i17;
                                    c14 = 26;
                                } else {
                                    i15 = i17 + 1;
                                    c14 = cArr[i17];
                                }
                                j5 = j10;
                            } else if (c14 != '\f' && c14 != '\r' && c14 != 26 && c14 != ':' && c14 != '[' && c14 != ']' && c14 != '{' && c14 != '}' && c14 != ' ' && c14 != '!') {
                                switch (c14) {
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                        break;
                                    default:
                                        switch (c14) {
                                            case '(':
                                            case ')':
                                            case '*':
                                            case '+':
                                            case ',':
                                            case ParserConstants.PROTECTED /* 45 */:
                                            case '.':
                                            case '/':
                                                break;
                                            default:
                                                switch (c14) {
                                                    case ParserConstants.WHEN /* 60 */:
                                                    case ParserConstants.WHILE /* 61 */:
                                                    case ParserConstants.INTEGER_LITERAL /* 62 */:
                                                        break;
                                                    default:
                                                        long j11 = (((long) c14) ^ j5) * Fnv.MAGIC_PRIME;
                                                        if (i15 == i12) {
                                                            i10 = i15;
                                                            c11 = 26;
                                                        } else {
                                                            i10 = i15 + 1;
                                                            c11 = cArr[i15];
                                                        }
                                                        c14 = c11;
                                                        i15 = i10;
                                                        j5 = j11;
                                                        continue;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            }
                            i16++;
                            z9 = true;
                        }
                        this.nameLength = i16;
                        this.nameEnd = c14 == 26 ? i15 : i15 - 1;
                        i11 = i15;
                        c12 = c14;
                        while (c12 <= ' ' && ((1 << c12) & 4294981377L) != 0) {
                            if (i11 == i12) {
                                c12 = 26;
                            } else {
                                c12 = cArr[i11];
                                i11++;
                            }
                        }
                    }
                    if (c12 == ':') {
                        if (i11 == i12) {
                            i9 = i11;
                            c10 = 26;
                        } else {
                            i9 = i11 + 1;
                            c10 = cArr[i11];
                        }
                        c12 = c10;
                        while (true) {
                            i11 = i9;
                            while (c12 <= ' ' && ((1 << c12) & 4294981377L) != 0) {
                                if (i11 == i12) {
                                    c12 = 26;
                                }
                            }
                            i9 = i11 + 1;
                            c12 = cArr[i11];
                        }
                    }
                    this.offset = i11;
                    this.f1929ch = c12;
                    return j5;
                }
            }
        }
        i11 = this.nameBegin + 1;
        j5 = 0;
        if (j5 == 0) {
        }
        if (c12 == ':') {
        }
        this.offset = i11;
        this.f1929ch = c12;
        return j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:35:0x007a) to fix multi-entry loop: BACK_EDGE: B:35:0x007a -> B:26:0x0057 */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0057, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01f9  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float readFloatValue() {
        int i9;
        char c10;
        long j3;
        long j4;
        long j5;
        int i10;
        float f3;
        char c11;
        int i11;
        char c12;
        float fFloatValue;
        boolean z9;
        float f10;
        boolean z10;
        int i12;
        char c13;
        int i13;
        char c14;
        char c15;
        int iDigit2;
        int iDigit22;
        int i14;
        char c16;
        char[] cArr = this.chars;
        char c17 = this.f1929ch;
        int i15 = this.offset;
        int i16 = this.end;
        if (c17 != '\"' && c17 != '\'') {
            i9 = i15;
            c10 = c17;
            c17 = 0;
        } else if (i15 == i16) {
            i9 = i15;
            c10 = 26;
        } else {
            i9 = i15 + 1;
            c10 = cArr[i15];
        }
        if (c17 == 0 || c10 != c17) {
            j3 = 1;
            if (c10 < '0' || c10 > '9') {
                j4 = 0;
                if (c10 == '-' || c10 == '+') {
                    j5 = 0;
                }
                j5 = 1;
            } else {
                j4 = 0;
                j5 = '0' - c10;
            }
            while (true) {
                i10 = -1;
                if (j5 > j4) {
                    f3 = 0.0f;
                    break;
                }
                f3 = 0.0f;
                if (i9 + 1 >= i16 || (iDigit22 = IOUtils.digit2(cArr, i9)) == -1) {
                    break;
                }
                if (-92233720368547758L <= j5) {
                    j5 = (j5 * 100) - ((long) iDigit22);
                    i9 += 2;
                } else {
                    j5 = 1;
                }
            }
            if (j5 > j4 || i9 >= i16) {
                c11 = c10;
            } else {
                c11 = cArr[i9];
                if (c11 >= '0' && c11 <= '9') {
                    if (Buffer.OVERFLOW_ZONE <= j5) {
                        j5 = ((j5 * 10) + 48) - ((long) c11);
                        i9++;
                    } else {
                        j5 = 1;
                    }
                }
            }
            if (j5 > j4 || i9 >= i16 || cArr[i9] != '.') {
                i11 = 0;
            } else {
                i9++;
                i11 = 0;
                while (j5 <= j4 && i9 + 1 < i16 && (iDigit2 = IOUtils.digit2(cArr, i9)) != i10) {
                    if (-92233720368547758L <= j5) {
                        j5 = (j5 * 100) - ((long) iDigit2);
                        i9 += 2;
                        i11 += 2;
                        i10 = -1;
                    } else {
                        j5 = 1;
                    }
                }
                if (j5 <= j4 && i9 < i16 && (c11 = cArr[i9]) >= '0' && c11 <= '9') {
                    if (Buffer.OVERFLOW_ZONE <= j5) {
                        j5 = ((j5 * 10) + 48) - ((long) c11);
                        i9++;
                        i11++;
                    } else {
                        j5 = 1;
                    }
                }
            }
            if (j5 <= j4) {
                if (i9 == i16) {
                    c11 = 26;
                } else {
                    c11 = cArr[i9];
                    i9++;
                }
            }
            if (j5 <= j4) {
                if (c11 == 'e' || c11 == 'E') {
                    if (i9 == i16) {
                        i13 = i9;
                        c14 = 26;
                    } else {
                        i13 = i9 + 1;
                        c14 = cArr[i9];
                    }
                    boolean z11 = c14 == '-';
                    if (z11 || c14 == '+') {
                        if (i13 == i16) {
                            c14 = 26;
                        } else {
                            int i17 = i13 + 1;
                            char c18 = cArr[i13];
                            i13 = i17;
                            c14 = c18;
                        }
                    } else if (c14 == ',') {
                        throw numberError();
                    }
                    if (c14 < '0' || c14 > '9') {
                        c11 = c14;
                        i9 = i13;
                        j5 = 1;
                    } else {
                        int i18 = c14 - '0';
                        while (i13 < i16) {
                            char c19 = cArr[i13];
                            if (c19 < '0' || c19 > '9') {
                                break;
                            }
                            i18 = (i18 * 10) + (c19 - '0');
                            if (i18 > 2047) {
                                C0086a.m464w(AbstractC0921a.m2249l(i18, "too large exp value : "));
                                return 0.0f;
                            }
                            i13++;
                        }
                        if (z11) {
                            i18 = -i18;
                        }
                        i11 -= i18;
                        if (i13 == i16) {
                            i9 = i13;
                            c15 = 26;
                        } else {
                            i9 = i13 + 1;
                            c15 = cArr[i13];
                        }
                        c11 = c15;
                    }
                } else if (c11 == 'L' || c11 == 'F' || c11 == 'D' || c11 == 'B' || c11 == 'S') {
                    if (i9 == i16) {
                        c11 = 26;
                    } else {
                        c11 = cArr[i9];
                        i9++;
                    }
                }
            }
            if (j5 <= j4 && c17 != 0) {
                if (c11 == c17) {
                    if (i9 == i16) {
                        i12 = i9;
                        c13 = 26;
                    } else {
                        i12 = i9 + 1;
                        c13 = cArr[i9];
                    }
                    c11 = c13;
                    i9 = i12;
                } else {
                    j5 = 1;
                }
            }
            if (j5 <= j4) {
                if (i11 == 0) {
                    f10 = j5;
                } else {
                    float f11 = j5;
                    if (((long) f11) == j5) {
                        if (i11 > 0) {
                            float[] fArr = JSONFactory.FLOAT_10_POW;
                            if (i11 < fArr.length) {
                                f10 = f11 / fArr[i11];
                            } else if (i11 < 0) {
                                float[] fArr2 = JSONFactory.FLOAT_10_POW;
                                if (i11 > (-fArr2.length)) {
                                    f10 = f11 * fArr2[-i11];
                                }
                            }
                        }
                    }
                    f10 = f3;
                    z10 = false;
                    if (!z10) {
                        fFloatValue = (c10 == '-' ? j5 != j4 : f10 == f3) ? f10 : -f10;
                    } else if (i11 <= -128 || i11 >= 128) {
                        fFloatValue = f10;
                        c12 = c11;
                        j5 = 1;
                    } else {
                        fFloatValue = TypeUtils.floatValue(c10 == '-' ? -1 : 1, Math.abs(j5), i11);
                    }
                    c12 = c11;
                }
                z10 = true;
                if (!z10) {
                }
                c12 = c11;
            } else {
                c12 = c11;
                fFloatValue = f3;
            }
            z9 = false;
        } else {
            if (i9 == i16) {
                c12 = 26;
            } else {
                c12 = cArr[i9];
                i9++;
            }
            j5 = 0;
            z9 = true;
            fFloatValue = 0.0f;
            j3 = 1;
            j4 = 0;
        }
        if (j5 > j4) {
            readNumber0();
            return getFloatValue();
        }
        while (c12 <= ' ' && ((j3 << c12) & 4294981377L) != j4) {
            if (i9 == i16) {
                c12 = 26;
            } else {
                c12 = cArr[i9];
                i9++;
            }
        }
        boolean z12 = c12 == ',';
        this.comma = z12;
        if (z12) {
            if (i9 == i16) {
                i14 = i9;
                c16 = 26;
            } else {
                i14 = i9 + 1;
                c16 = cArr[i9];
            }
            loop1: while (true) {
                char c20 = c16;
                i9 = i14;
                c12 = c20;
                while (c12 <= ' ' && ((j3 << c12) & 4294981377L) != j4) {
                    if (i9 == i16) {
                        c12 = 26;
                    }
                }
                i14 = i9 + 1;
                c16 = cArr[i9];
            }
        }
        this.wasNull = z9;
        this.f1929ch = c12;
        this.offset = i9;
        return fFloatValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Path cross not found for [B:22:0x003c, B:23:0x003e], limit reached: 100 */
    /* JADX WARN: Path cross not found for [B:23:0x003e, B:22:0x003c], limit reached: 100 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0048 -> B:18:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00d3 -> B:67:0x00c2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] readHex() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.f1929ch
            int r2 = r0.offset
            char[] r3 = r0.chars
            r4 = 120(0x78, float:1.68E-43)
            r5 = 26
            if (r1 != r4) goto L1d
            int r1 = r0.end
            if (r2 != r1) goto L14
            r1 = r5
            goto L1d
        L14:
            int r1 = r2 + 1
            char r2 = r3[r2]
            r17 = r2
            r2 = r1
            r1 = r17
        L1d:
            r4 = 39
            if (r1 == r4) goto L2b
            r4 = 34
            if (r1 != r4) goto L26
            goto L2b
        L26:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r2, r1)
            throw r1
        L2b:
            int r4 = r0.end
            if (r2 != r4) goto L32
            r4 = r2
        L30:
            r6 = r5
            goto L36
        L32:
            int r4 = r2 + 1
            char r6 = r3[r2]
        L36:
            r7 = 57
            r8 = 48
            if (r6 < r8) goto L3e
            if (r6 <= r7) goto L46
        L3e:
            r9 = 65
            if (r6 < r9) goto L55
            r9 = 70
            if (r6 > r9) goto L55
        L46:
            int r6 = r0.end
            if (r4 != r6) goto L4b
            goto L30
        L4b:
            int r6 = r4 + 1
            char r4 = r3[r4]
            r17 = r6
            r6 = r4
            r4 = r17
            goto L36
        L55:
            if (r6 != r1) goto Lf6
            int r1 = r0.end
            if (r4 != r1) goto L5e
            r1 = r4
            r4 = r5
            goto L62
        L5e:
            int r1 = r4 + 1
            char r4 = r3[r4]
        L62:
            int r6 = r1 - r2
            int r9 = r6 + (-2)
            r10 = 1
            if (r4 != r5) goto L6b
            int r9 = r6 + (-1)
        L6b:
            int r6 = r9 % 2
            if (r6 != 0) goto Lf1
            int r9 = r9 / 2
            byte[] r6 = new byte[r9]
            r11 = 0
        L74:
            if (r11 >= r9) goto L93
            int r12 = r11 * 2
            int r12 = r12 + r2
            char r13 = r3[r12]
            int r12 = r12 + r10
            char r12 = r3[r12]
            r14 = 55
            if (r13 > r7) goto L84
            r15 = r8
            goto L85
        L84:
            r15 = r14
        L85:
            int r13 = r13 - r15
            if (r12 > r7) goto L89
            r14 = r8
        L89:
            int r12 = r12 - r14
            int r13 = r13 << 4
            r12 = r12 | r13
            byte r12 = (byte) r12
            r6[r11] = r12
            int r11 = r11 + 1
            goto L74
        L93:
            r7 = 0
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r2 = 32
            if (r4 > r2) goto Lb4
            long r15 = r13 << r4
            long r15 = r15 & r11
            int r9 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r9 == 0) goto Lb4
            int r2 = r0.end
            if (r1 != r2) goto Lad
            r4 = r5
            goto L93
        Lad:
            int r2 = r1 + 1
            char r1 = r3[r1]
            r4 = r1
            r1 = r2
            goto L93
        Lb4:
            r9 = 44
            if (r4 != r9) goto Lec
            int r9 = r0.end
            if (r1 < r9) goto Lbd
            goto Lec
        Lbd:
            r0.comma = r10
            if (r1 != r9) goto Lc4
            r4 = r1
        Lc2:
            r1 = r5
            goto Lc8
        Lc4:
            int r4 = r1 + 1
            char r1 = r3[r1]
        Lc8:
            if (r1 > r2) goto Le0
            long r9 = r13 << r1
            long r9 = r9 & r11
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto Le0
            int r1 = r0.end
            if (r4 != r1) goto Ld6
            goto Lc2
        Ld6:
            int r1 = r4 + 1
            char r4 = r3[r4]
            r17 = r4
            r4 = r1
            r1 = r17
            goto Lc8
        Le0:
            r0.offset = r4
            r0.f1929ch = r1
            r2 = 47
            if (r1 != r2) goto Leb
            r0.skipComment()
        Leb:
            return r6
        Lec:
            r0.offset = r1
            r0.f1929ch = r4
            return r6
        Lf1:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r1, r4)
            throw r1
        Lf6:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r4, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.readHex():byte[]");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean readIfNull() {
        int i9;
        char c10;
        char[] cArr = this.chars;
        int i10 = this.offset;
        if (this.f1929ch != 'n' || cArr[i10] != 'u' || cArr[i10 + 1] != 'l' || cArr[i10 + 2] != 'l') {
            return false;
        }
        int i11 = i10 + 3;
        char c11 = i11 == this.end ? (char) 26 : cArr[i11];
        int i12 = i10 + 4;
        while (c11 <= ' ' && ((1 << c11) & 4294981377L) != 0) {
            if (i12 == this.end) {
                c11 = 26;
            } else {
                c11 = cArr[i12];
                i12++;
            }
        }
        boolean z9 = c11 == ',';
        this.comma = z9;
        if (z9) {
            if (i12 == this.end) {
                i9 = i12;
                c10 = 26;
            } else {
                i9 = i12 + 1;
                c10 = cArr[i12];
            }
            loop1: while (true) {
                int i13 = i9;
                c11 = c10;
                i12 = i13;
                while (c11 <= ' ' && ((1 << c11) & 4294981377L) != 0) {
                    if (i12 == this.end) {
                        c11 = 26;
                    }
                }
                i9 = i12 + 1;
                c10 = cArr[i12];
            }
        }
        this.f1929ch = c11;
        this.offset = i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:100:0x0100) to fix multi-entry loop: BACK_EDGE: B:100:0x0100 -> B:93:0x00ed */
    /* JADX DEBUG: Duplicate block (B:76:0x00bb) to fix multi-entry loop: BACK_EDGE: B:76:0x00bb -> B:77:0x00bc */
    /* JADX WARN: Path cross not found for [B:73:0x00b3, B:117:?], limit reached: 119 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00d1 -> B:74:0x00b5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x00c7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public int readInt32Value() {
        /*
            r21 = this;
            r0 = r21
            char r1 = r0.f1929ch
            int r2 = r0.offset
            int r3 = r0.end
            char[] r4 = r0.chars
            r5 = 34
            if (r1 == r5) goto L16
            r5 = 39
            if (r1 != r5) goto L13
            goto L16
        L13:
            r5 = r2
            r2 = 0
            goto L1f
        L16:
            int r5 = r2 + 1
            char r2 = r4[r2]
            r20 = r2
            r2 = r1
            r1 = r20
        L1f:
            r7 = 57
            r8 = 45
            r9 = 48
            r10 = 1
            if (r1 < r9) goto L2d
            if (r1 > r7) goto L2d
            int r11 = 48 - r1
            goto L37
        L2d:
            if (r1 == r8) goto L36
            r11 = 43
            if (r1 != r11) goto L34
            goto L36
        L34:
            r11 = r10
            goto L37
        L36:
            r11 = 0
        L37:
            int r12 = r5 + 1
            if (r12 >= r3) goto L58
            int r13 = com.alibaba.fastjson2.util.IOUtils.digit2(r4, r5)
            r14 = -1
            if (r13 == r14) goto L58
            r14 = -21474836(0xfffffffffeb851ec, float:-1.2250166E38)
            if (r14 > r11) goto L49
            r14 = r10
            goto L4a
        L49:
            r14 = 0
        L4a:
            if (r11 > 0) goto L4e
            r15 = r10
            goto L4f
        L4e:
            r15 = 0
        L4f:
            r14 = r14 & r15
            if (r14 == 0) goto L58
            int r11 = r11 * 100
            int r11 = r11 - r13
            int r5 = r5 + 2
            goto L37
        L58:
            if (r5 >= r3) goto L75
            char r13 = r4[r5]
            if (r13 < r9) goto L75
            if (r13 > r7) goto L75
            r7 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            if (r7 > r11) goto L67
            r7 = r10
            goto L68
        L67:
            r7 = 0
        L68:
            if (r11 > 0) goto L6c
            r14 = r10
            goto L6d
        L6c:
            r14 = 0
        L6d:
            r7 = r7 & r14
            if (r7 == 0) goto L75
            int r11 = r11 * 10
            int r11 = r11 + r9
            int r11 = r11 - r13
            r5 = r12
        L75:
            r7 = 26
            if (r5 != r3) goto L7c
            r9 = r5
            r5 = r7
            goto L80
        L7c:
            int r9 = r5 + 1
            char r5 = r4[r5]
        L80:
            if (r11 > 0) goto L10c
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 < r11) goto L88
            if (r1 != r8) goto L10c
        L88:
            boolean[] r12 = com.alibaba.fastjson2.JSONReader.INT_VALUE_END
            r13 = r5 & 255(0xff, float:3.57E-43)
            boolean r12 = r12[r13]
            if (r12 == 0) goto L10c
            if (r2 == 0) goto L94
            if (r5 != r2) goto L10c
        L94:
            if (r2 == 0) goto L9f
            if (r9 != r3) goto L9a
            r5 = r7
            goto L9f
        L9a:
            int r2 = r9 + 1
            char r5 = r4[r9]
            r9 = r2
        L9f:
            r2 = 76
            if (r5 == r2) goto Lb3
            r2 = 70
            if (r5 == r2) goto Lb3
            r2 = 68
            if (r5 == r2) goto Lb3
            r2 = 66
            if (r5 == r2) goto Lb3
            r2 = 83
            if (r5 != r2) goto Lbc
        Lb3:
            if (r9 != r3) goto Lb7
        Lb5:
            r5 = r7
            goto Lbc
        Lb7:
            int r2 = r9 + 1
            char r5 = r4[r9]
        Lbb:
            r9 = r2
        Lbc:
            r12 = 0
            r14 = 4294981377(0x100003701, double:2.122002748E-314)
            r16 = 1
            r2 = 32
            if (r5 > r2) goto Ld9
            long r18 = r16 << r5
            long r18 = r18 & r14
            int r18 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r18 == 0) goto Ld9
            if (r9 != r3) goto Ld4
            goto Lb5
        Ld4:
            int r2 = r9 + 1
            char r5 = r4[r9]
            goto Lbb
        Ld9:
            r6 = 44
            if (r5 != r6) goto Ldf
            r6 = r10
            goto Le0
        Ldf:
            r6 = 0
        Le0:
            r0.comma = r6
            if (r6 == 0) goto L102
            if (r9 != r3) goto Le8
            r6 = r7
            goto Led
        Le8:
            int r5 = r9 + 1
            char r6 = r4[r9]
            goto L100
        Led:
            r5 = r6
        Lee:
            if (r5 > r2) goto L102
            long r18 = r16 << r5
            long r18 = r18 & r14
            int r6 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r6 == 0) goto L102
            if (r9 != r3) goto Lfc
            r5 = r7
            goto Lee
        Lfc:
            int r5 = r9 + 1
            char r6 = r4[r9]
        L100:
            r9 = r5
            goto Led
        L102:
            char r2 = (char) r5
            r0.f1929ch = r2
            r0.offset = r9
            if (r1 != r8) goto L10a
            return r11
        L10a:
            int r1 = -r11
            return r1
        L10c:
            int r1 = r0.readInt32ValueOverflow()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.readInt32Value():int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:79:0x00e1) to fix multi-entry loop: BACK_EDGE: B:79:0x00e1 -> B:80:0x00e2 */
    /* JADX WARN: Path cross not found for [B:76:0x00d9, B:118:?], limit reached: 120 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x00f3 -> B:77:0x00db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:81:0x00e9
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readInt64Value() {
        /*
            r23 = this;
            r0 = r23
            char r1 = r0.f1929ch
            int r2 = r0.offset
            int r3 = r0.end
            char[] r4 = r0.chars
            r5 = 34
            if (r1 == r5) goto L16
            r5 = 39
            if (r1 != r5) goto L13
            goto L16
        L13:
            r5 = r2
            r2 = 0
            goto L1f
        L16:
            int r5 = r2 + 1
            char r2 = r4[r2]
            r22 = r2
            r2 = r1
            r1 = r22
        L1f:
            r7 = 57
            r10 = 45
            r11 = 48
            r12 = 0
            if (r1 < r11) goto L2f
            if (r1 > r7) goto L2f
            int r14 = 48 - r1
            long r14 = (long) r14
            goto L3a
        L2f:
            if (r1 == r10) goto L39
            r14 = 43
            if (r1 != r14) goto L36
            goto L39
        L36:
            r14 = 1
            goto L3a
        L39:
            r14 = r12
        L3a:
            int r6 = r5 + 1
            r17 = 1
            r18 = 1
            if (r6 >= r3) goto L6c
            int r8 = com.alibaba.fastjson2.util.IOUtils.digit2(r4, r5)
            r9 = -1
            if (r8 == r9) goto L6c
            r20 = -92233720368547758(0xfeb851eb851eb852, double:-2.605908932677002E302)
            int r9 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r9 > 0) goto L55
            r9 = r17
            goto L56
        L55:
            r9 = 0
        L56:
            int r20 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r20 > 0) goto L5d
            r20 = r17
            goto L5f
        L5d:
            r20 = 0
        L5f:
            r9 = r9 & r20
            if (r9 == 0) goto L6c
            r20 = 100
            long r14 = r14 * r20
            long r8 = (long) r8
            long r14 = r14 - r8
            int r5 = r5 + 2
            goto L3a
        L6c:
            if (r5 >= r3) goto L97
            char r8 = r4[r5]
            if (r8 < r11) goto L97
            if (r8 > r7) goto L97
            r20 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r7 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r7 > 0) goto L80
            r7 = r17
            goto L81
        L80:
            r7 = 0
        L81:
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 > 0) goto L88
            r9 = r17
            goto L89
        L88:
            r9 = 0
        L89:
            r7 = r7 & r9
            if (r7 == 0) goto L97
            r20 = 10
            long r14 = r14 * r20
            r20 = 48
            long r14 = r14 + r20
            long r7 = (long) r8
            long r14 = r14 - r7
            r5 = r6
        L97:
            r6 = 26
            if (r5 != r3) goto L9e
            r7 = r5
            r5 = r6
            goto La2
        L9e:
            int r7 = r5 + 1
            char r5 = r4[r5]
        La2:
            int r8 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r8 > 0) goto L132
            r8 = -9223372036854775808
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 < 0) goto Lae
            if (r1 != r10) goto L132
        Lae:
            boolean[] r8 = com.alibaba.fastjson2.JSONReader.INT_VALUE_END
            r9 = r5 & 255(0xff, float:3.57E-43)
            boolean r8 = r8[r9]
            if (r8 == 0) goto L132
            if (r2 == 0) goto Lba
            if (r5 != r2) goto L132
        Lba:
            if (r2 == 0) goto Lc5
            if (r7 != r3) goto Lc0
            r5 = r6
            goto Lc5
        Lc0:
            int r2 = r7 + 1
            char r5 = r4[r7]
            r7 = r2
        Lc5:
            r2 = 76
            if (r5 == r2) goto Ld9
            r2 = 70
            if (r5 == r2) goto Ld9
            r2 = 68
            if (r5 == r2) goto Ld9
            r2 = 66
            if (r5 == r2) goto Ld9
            r2 = 83
            if (r5 != r2) goto Le2
        Ld9:
            if (r7 != r3) goto Ldd
        Ldb:
            r5 = r6
            goto Le2
        Ldd:
            int r2 = r7 + 1
            char r5 = r4[r7]
        Le1:
            r7 = r2
        Le2:
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r2 = 32
            if (r5 > r2) goto Lfb
            long r20 = r18 << r5
            long r20 = r20 & r8
            int r11 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r11 == 0) goto Lfb
            if (r7 != r3) goto Lf6
            goto Ldb
        Lf6:
            int r2 = r7 + 1
            char r5 = r4[r7]
            goto Le1
        Lfb:
            r11 = 44
            if (r5 != r11) goto L102
            r11 = r17
            goto L103
        L102:
            r11 = 0
        L103:
            r0.comma = r11
            if (r11 == 0) goto L128
            if (r7 != r3) goto L10c
            r5 = r7
            r7 = r6
            goto L110
        L10c:
            int r5 = r7 + 1
            char r7 = r4[r7]
        L110:
            r22 = r7
            r7 = r5
            r5 = r22
        L115:
            if (r5 > r2) goto L128
            long r16 = r18 << r5
            long r16 = r16 & r8
            int r11 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r11 == 0) goto L128
            if (r7 != r3) goto L123
            r5 = r6
            goto L115
        L123:
            int r5 = r7 + 1
            char r7 = r4[r7]
            goto L110
        L128:
            char r2 = (char) r5
            r0.f1929ch = r2
            r0.offset = r7
            if (r1 != r10) goto L130
            return r14
        L130:
            long r1 = -r14
            return r1
        L132:
            long r1 = r0.readInt64ValueOverflow()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.readInt64Value():long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate() {
        boolean z9;
        LocalDate localDateOf;
        char[] cArr = this.chars;
        char c10 = this.f1929ch;
        if (c10 == '\"' || c10 == '\'') {
            JSONReader.Context context = this.context;
            if (context.dateFormat == null || context.formatyyyyMMddhhmmss19 || context.formatyyyyMMddhhmmssT19 || context.formatyyyyMMdd8 || context.formatISO8601) {
                int i9 = this.offset;
                int i10 = i9 + 10;
                if (i10 < cArr.length && i10 < this.end && cArr[i9 + 4] == '-' && cArr[i9 + 7] == '-' && cArr[i9 + 10] == c10) {
                    char c11 = cArr[i9];
                    char c12 = cArr[i9 + 1];
                    char c13 = cArr[i9 + 2];
                    char c14 = cArr[i9 + 3];
                    char c15 = cArr[i9 + 5];
                    char c16 = cArr[i9 + 6];
                    char c17 = cArr[i9 + 8];
                    char c18 = cArr[i9 + 9];
                    if (c11 < '0' || c11 > '9' || c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9' || c14 < '0' || c14 > '9') {
                        return super.readLocalDate();
                    }
                    int iM6853z = (c14 - '0') + AbstractC3199a.m6853z(c13, 48, 10, AbstractC3199a.m6853z(c12, 48, 100, (c11 - '0') * 1000));
                    if (c15 < '0' || c15 > '9' || c16 < '0' || c16 > '9') {
                        return super.readLocalDate();
                    }
                    int i11 = (c16 - '0') + ((c15 - '0') * 10);
                    if (c17 < '0' || c17 > '9' || c18 < '0' || c18 > '9') {
                        return super.readLocalDate();
                    }
                    int i12 = (c18 - '0') + ((c17 - '0') * 10);
                    if (iM6853z == 0 && i11 == 0 && i12 == 0) {
                        localDateOf = null;
                    } else {
                        try {
                            localDateOf = LocalDate.of(iM6853z, i11, i12);
                        } catch (DateTimeException e6) {
                            C0086a.m465x(info("read date error"), e6);
                            return null;
                        }
                    }
                    this.offset += 11;
                    next();
                    z9 = this.f1929ch == ',';
                    this.comma = z9;
                    if (z9) {
                        next();
                    }
                    return localDateOf;
                }
                int iMin = Math.min(i9 + 17, this.end);
                int i13 = -1;
                while (i9 < iMin) {
                    if (cArr[i9] == c10) {
                        i13 = i9;
                    }
                    i9++;
                }
                if (i13 != -1) {
                    int i14 = this.offset;
                    if (i13 - i14 > 10 && cArr[i13 - 6] == '-' && cArr[i13 - 3] == '-') {
                        LocalDate localDateOf2 = LocalDate.of(TypeUtils.parseInt(cArr, i14, (i13 - i14) - 6), TypeUtils.parseInt(cArr, i13 - 5, 2), TypeUtils.parseInt(cArr, i13 - 2, 2));
                        this.offset = i13 + 1;
                        next();
                        z9 = this.f1929ch == ',';
                        this.comma = z9;
                        if (z9) {
                            next();
                        }
                        return localDateOf2;
                    }
                }
            }
        }
        return super.readLocalDate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate10() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDate10 = DateUtils.parseLocalDate10(this.chars, this.offset);
            if (localDate10 == null) {
                return null;
            }
            this.offset += 11;
            next();
            boolean z9 = this.f1929ch == ',';
            this.comma = z9;
            if (z9) {
                next();
            }
            return localDate10;
        } catch (DateTimeException e6) {
            C0086a.m465x(info("read date error"), e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate11() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localDate only support string input");
            return null;
        }
        LocalDate localDate11 = DateUtils.parseLocalDate11(this.chars, this.offset);
        if (localDate11 == null) {
            return null;
        }
        this.offset += 12;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localDate11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate8() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDate8 = DateUtils.parseLocalDate8(this.chars, this.offset);
            this.offset += 9;
            next();
            boolean z9 = this.f1929ch == ',';
            this.comma = z9;
            if (z9) {
                next();
            }
            return localDate8;
        } catch (DateTimeException e6) {
            C0086a.m465x(info("read date error"), e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDate readLocalDate9() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDate9 = DateUtils.parseLocalDate9(this.chars, this.offset);
            this.offset += 10;
            next();
            boolean z9 = this.f1929ch == ',';
            this.comma = z9;
            if (z9) {
                next();
            }
            return localDate9;
        } catch (DateTimeException e6) {
            C0086a.m465x(info("read date error"), e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime12() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime12 = DateUtils.parseLocalDateTime12(this.chars, this.offset);
        if (localDateTime12 == null) {
            return null;
        }
        this.offset += 13;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localDateTime12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime14() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime14 = DateUtils.parseLocalDateTime14(this.chars, this.offset);
        if (localDateTime14 == null) {
            return null;
        }
        this.offset += 15;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localDateTime14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime16() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime16 = DateUtils.parseLocalDateTime16(this.chars, this.offset);
        if (localDateTime16 == null) {
            return null;
        }
        this.offset += 17;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localDateTime16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime17() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime17 = DateUtils.parseLocalDateTime17(this.chars, this.offset);
        if (localDateTime17 == null) {
            return null;
        }
        this.offset += 18;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localDateTime17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime18() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime18 = DateUtils.parseLocalDateTime18(this.chars, this.offset);
        this.offset += 19;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localDateTime18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime19() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime19 = DateUtils.parseLocalDateTime19(this.chars, this.offset);
        if (localDateTime19 == null) {
            return null;
        }
        this.offset += 20;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localDateTime19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTime20() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime20 = DateUtils.parseLocalDateTime20(this.chars, this.offset);
        if (localDateTime20 == null) {
            return null;
        }
        this.offset += 21;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localDateTime20;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalDateTime readLocalDateTimeX(int i9) {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeX = DateUtils.parseLocalDateTimeX(this.chars, this.offset, i9);
        if (localDateTimeX == null) {
            return null;
        }
        this.offset = i9 + 1 + this.offset;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localDateTimeX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime10() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime10 = DateUtils.parseLocalTime10(this.chars, this.offset);
        if (localTime10 == null) {
            return null;
        }
        this.offset += 11;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localTime10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime11() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime11 = DateUtils.parseLocalTime11(this.chars, this.offset);
        if (localTime11 == null) {
            return null;
        }
        this.offset += 12;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localTime11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime12() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime12 = DateUtils.parseLocalTime12(this.chars, this.offset);
        if (localTime12 == null) {
            return null;
        }
        this.offset += 13;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localTime12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime15() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime15 = DateUtils.parseLocalTime15(this.chars, this.offset);
        if (localTime15 == null) {
            return null;
        }
        this.offset += 16;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localTime15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime18() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime18 = DateUtils.parseLocalTime18(this.chars, this.offset);
        if (localTime18 == null) {
            return null;
        }
        this.offset += 19;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localTime18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime5() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime5 = DateUtils.parseLocalTime5(this.chars, this.offset);
        if (localTime5 == null) {
            return null;
        }
        this.offset += 6;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localTime5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime8() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime8 = DateUtils.parseLocalTime8(this.chars, this.offset);
        if (localTime8 == null) {
            return null;
        }
        this.offset += 9;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localTime8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public LocalTime readLocalTime9() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime8 = DateUtils.parseLocalTime8(this.chars, this.offset);
        if (localTime8 == null) {
            return null;
        }
        this.offset += 10;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return localTime8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readMillis19() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("date only support string input");
            return 0L;
        }
        int i9 = this.offset;
        if (i9 + 18 >= this.end) {
            this.wasNull = true;
            return 0L;
        }
        long millis19 = DateUtils.parseMillis19(this.chars, i9, this.context.zoneId);
        char[] cArr = this.chars;
        int i10 = this.offset;
        if (cArr[i10 + 19] != c10) {
            C0086a.m464w(info("illegal date input"));
            return 0L;
        }
        this.offset = i10 + 20;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return millis19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0037 -> B:9:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x002c
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final double readNaN() {
        /*
            r14 = this;
            char[] r0 = r14.chars
            int r1 = r14.offset
            char r2 = r0[r1]
            r3 = 97
            if (r2 != r3) goto L77
            int r2 = r1 + 1
            char r2 = r0[r2]
            r3 = 78
            if (r2 != r3) goto L77
            int r2 = r1 + 2
            int r3 = r14.end
            r4 = 26
            if (r2 != r3) goto L1d
            r1 = r2
        L1b:
            r2 = r4
            goto L21
        L1d:
            int r1 = r1 + 3
            char r2 = r0[r2]
        L21:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r3 = 32
            if (r2 > r3) goto L42
            long r11 = r9 << r2
            long r11 = r11 & r7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 == 0) goto L42
            int r2 = r14.end
            if (r1 < r2) goto L3a
            goto L1b
        L3a:
            int r2 = r1 + 1
            char r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L21
        L42:
            r11 = 44
            if (r2 != r11) goto L48
            r11 = 1
            goto L49
        L48:
            r11 = 0
        L49:
            r14.comma = r11
            if (r11 == 0) goto L6f
            int r2 = r14.end
            if (r1 < r2) goto L54
            r2 = r1
            r1 = r4
            goto L58
        L54:
            int r2 = r1 + 1
            char r1 = r0[r1]
        L58:
            r13 = r2
            r2 = r1
            r1 = r13
        L5b:
            if (r2 > r3) goto L6f
            long r11 = r9 << r2
            long r11 = r11 & r7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 == 0) goto L6f
            int r2 = r14.end
            if (r1 < r2) goto L6a
            r2 = r4
            goto L5b
        L6a:
            int r2 = r1 + 1
            char r1 = r0[r1]
            goto L58
        L6f:
            char r0 = (char) r2
            r14.f1929ch = r0
            r14.offset = r1
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L77:
            java.lang.String r0 = "json syntax error, not NaN "
            java.lang.String r0 = p068eh.AbstractC0921a.m2249l(r1, r0)
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.readNaN():double");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public void readNull() {
        int i9;
        char c10;
        char[] cArr = this.chars;
        int i10 = this.offset;
        if (cArr[i10] != 'u' || cArr[i10 + 1] != 'l' || cArr[i10 + 2] != 'l') {
            C0086a.m464w(AbstractC0921a.m2249l(i10, "json syntax error, not match null, offset "));
            return;
        }
        int i11 = i10 + 3;
        char c11 = i11 == this.end ? (char) 26 : cArr[i11];
        int i12 = i10 + 4;
        while (c11 <= ' ' && ((1 << c11) & 4294981377L) != 0) {
            if (i12 == this.end) {
                c11 = 26;
            } else {
                c11 = cArr[i12];
                i12++;
            }
        }
        boolean z9 = c11 == ',';
        this.comma = z9;
        if (z9) {
            if (i12 == this.end) {
                i9 = i12;
                c10 = 26;
            } else {
                i9 = i12 + 1;
                c10 = cArr[i12];
            }
            loop1: while (true) {
                int i13 = i9;
                c11 = c10;
                i12 = i13;
                while (c11 <= ' ' && ((1 << c11) & 4294981377L) != 0) {
                    if (i12 == this.end) {
                        c11 = 26;
                    }
                }
                i9 = i12 + 1;
                c10 = cArr[i12];
            }
        }
        this.f1929ch = c11;
        this.offset = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:30:0x005e) to fix multi-entry loop: BACK_EDGE: B:30:0x005e -> B:25:0x0051 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x009f -> B:44:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:46:0x0094
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public java.util.Date readNullOrNewDate() {
        /*
            r19 = this;
            r0 = r19
            char[] r1 = r0.chars
            int r2 = r0.offset
            int r3 = r2 + 2
            int r4 = r0.end
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            r12 = 26
            if (r3 >= r4) goto L3a
            char r13 = r1[r2]
            r14 = 117(0x75, float:1.64E-43)
            if (r13 != r14) goto L3a
            int r13 = r2 + 1
            char r13 = r1[r13]
            r14 = 108(0x6c, float:1.51E-43)
            if (r13 != r14) goto L3a
            char r13 = r1[r3]
            if (r13 != r14) goto L3a
            int r3 = r2 + 3
            if (r3 != r4) goto L31
            r3 = r12
            goto L33
        L31:
            char r3 = r1[r3]
        L33:
            int r2 = r2 + 4
            r4 = 0
            r16 = r5
            goto Lf1
        L3a:
            int r13 = r2 + 1
            if (r13 >= r4) goto L157
            char r14 = r1[r2]
            r15 = 101(0x65, float:1.42E-43)
            if (r14 != r15) goto L157
            char r13 = r1[r13]
            r14 = 119(0x77, float:1.67E-43)
            if (r13 != r14) goto L157
            int r2 = r2 + 3
            if (r2 != r4) goto L4f
            goto L5e
        L4f:
            char r3 = r1[r3]
        L51:
            if (r3 > r11) goto L6a
            long r13 = r9 << r3
            long r13 = r13 & r7
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 == 0) goto L6a
            int r3 = r0.end
            if (r2 < r3) goto L60
        L5e:
            r3 = r12
            goto L51
        L60:
            int r3 = r2 + 1
            char r2 = r1[r2]
            r18 = r3
            r3 = r2
            r2 = r18
            goto L51
        L6a:
            int r4 = r2 + 4
            int r13 = r0.end
            java.lang.String r14 = "json syntax error, not match new Date"
            if (r4 >= r13) goto L14f
            r16 = r5
            r5 = 68
            if (r3 != r5) goto L14f
            char r3 = r1[r2]
            r5 = 97
            if (r3 != r5) goto L14f
            int r3 = r2 + 1
            char r3 = r1[r3]
            r5 = 116(0x74, float:1.63E-43)
            if (r3 != r5) goto L14f
            int r3 = r2 + 2
            char r3 = r1[r3]
            if (r3 != r15) goto L14f
            int r2 = r2 + 3
            if (r2 != r13) goto L92
        L90:
            r2 = r12
            goto L94
        L92:
            char r2 = r1[r2]
        L94:
            if (r2 > r11) goto La9
            long r5 = r9 << r2
            long r5 = r5 & r7
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 == 0) goto La9
            int r2 = r0.end
            if (r4 != r2) goto La2
            goto L90
        La2:
            int r2 = r4 + 1
            char r3 = r1[r4]
            r4 = r2
            r2 = r3
            goto L94
        La9:
            r3 = 40
            if (r2 != r3) goto L147
            int r2 = r0.end
            if (r4 >= r2) goto L147
            int r2 = r4 + 1
            char r3 = r1[r4]
        Lb5:
            if (r3 > r11) goto Lce
            long r4 = r9 << r3
            long r4 = r4 & r7
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto Lce
            int r3 = r0.end
            if (r2 != r3) goto Lc4
            r3 = r12
            goto Lb5
        Lc4:
            int r3 = r2 + 1
            char r2 = r1[r2]
            r18 = r3
            r3 = r2
            r2 = r18
            goto Lb5
        Lce:
            r0.f1929ch = r3
            r0.offset = r2
            long r2 = r0.readInt64Value()
            char r4 = r0.f1929ch
            int r5 = r0.offset
            r6 = 41
            if (r4 != r6) goto L13e
            int r4 = r0.end
            if (r5 != r4) goto Le5
            r4 = r5
            r5 = r12
            goto Le9
        Le5:
            int r4 = r5 + 1
            char r5 = r1[r5]
        Le9:
            java.util.Date r6 = new java.util.Date
            r6.<init>(r2)
            r2 = r4
            r3 = r5
            r4 = r6
        Lf1:
            if (r3 > r11) goto L10a
            long r5 = r9 << r3
            long r5 = r5 & r7
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L10a
            int r3 = r0.end
            if (r2 != r3) goto L100
            r3 = r12
            goto Lf1
        L100:
            int r3 = r2 + 1
            char r2 = r1[r2]
            r18 = r3
            r3 = r2
            r2 = r18
            goto Lf1
        L10a:
            r5 = 44
            if (r3 != r5) goto L110
            r5 = 1
            goto L111
        L110:
            r5 = 0
        L111:
            r0.comma = r5
            if (r5 == 0) goto L139
            int r3 = r0.end
            if (r2 != r3) goto L11c
            r3 = r2
            r2 = r12
            goto L120
        L11c:
            int r3 = r2 + 1
            char r2 = r1[r2]
        L120:
            r18 = r3
            r3 = r2
            r2 = r18
        L125:
            if (r3 > r11) goto L139
            long r5 = r9 << r3
            long r5 = r5 & r7
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L139
            int r3 = r0.end
            if (r2 != r3) goto L134
            r3 = r12
            goto L125
        L134:
            int r3 = r2 + 1
            char r2 = r1[r2]
            goto L120
        L139:
            r0.f1929ch = r3
            r0.offset = r2
            return r4
        L13e:
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r5, r14)
            p012ah.C0086a.m464w(r1)
        L145:
            r1 = 0
            return r1
        L147:
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r4, r14)
            p012ah.C0086a.m464w(r1)
            goto L145
        L14f:
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r2, r14)
            p012ah.C0086a.m464w(r1)
            goto L145
        L157:
            java.lang.String r1 = "json syntax error, not match null or new Date"
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r2, r1)
            p012ah.C0086a.m464w(r1)
            goto L145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.readNullOrNewDate():java.util.Date");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:228:0x0315) to fix multi-entry loop: BACK_EDGE: B:228:0x0315 -> B:200:0x02ca */
    /* JADX DEBUG: Duplicate block (B:230:0x031c) to fix multi-entry loop: BACK_EDGE: B:230:0x031c -> B:200:0x02ca */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:14:0x0048
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public void readNumber0() {
        /*
            r28 = this;
            r0 = r28
            r1 = 0
            r0.wasNull = r1
            r0.mag0 = r1
            r0.mag1 = r1
            r0.mag2 = r1
            r0.mag3 = r1
            r0.negative = r1
            r0.exponent = r1
            r0.scale = r1
            int r2 = r0.offset
            char[] r3 = r0.chars
            char r4 = r0.f1929ch
            int r5 = r0.end
            r6 = 34
            r7 = 5
            r10 = 4294981377(0x100003701, double:2.122002748E-314)
            r12 = 1
            r14 = 32
            r15 = 2
            r16 = 26
            r17 = 0
            r8 = 1
            if (r4 == r6) goto L39
            r6 = 39
            if (r4 != r6) goto L34
            goto L39
        L34:
            r6 = r1
            r9 = r2
        L36:
            r19 = r10
            goto L72
        L39:
            int r6 = r2 + 1
            char r9 = r3[r2]
            if (r9 != r4) goto L6b
            if (r6 != r5) goto L44
        L41:
            r1 = r16
            goto L48
        L44:
            int r2 = r2 + r15
            char r1 = r3[r6]
            r6 = r2
        L48:
            if (r1 > r14) goto L5c
            long r19 = r12 << r1
            long r19 = r19 & r10
            int r2 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r2 == 0) goto L5c
            if (r6 != r5) goto L55
            goto L41
        L55:
            int r1 = r6 + 1
            char r2 = r3[r6]
            r6 = r1
            r1 = r2
            goto L48
        L5c:
            r0.f1929ch = r1
            r0.offset = r6
            boolean r1 = r0.nextIfComma()
            r0.comma = r1
            r0.wasNull = r8
            r0.valueType = r7
            return
        L6b:
            r19 = r6
            r6 = r4
            r4 = r9
            r9 = r19
            goto L36
        L72:
            r10 = 43
            r11 = 45
            r21 = r12
            java.lang.String r12 = "illegal input"
            if (r4 != r11) goto L8d
            if (r9 == r5) goto L85
            r0.negative = r8
            int r4 = r9 + 1
            char r13 = r3[r9]
            goto La9
        L85:
            java.lang.String r1 = r0.info(r12)
            p012ah.C0086a.m464w(r1)
            return
        L8d:
            if (r4 != r10) goto La3
            if (r9 == r5) goto L9b
            int r4 = r9 + 1
            char r13 = r3[r9]
            r27 = r13
            r13 = r4
            r4 = r27
            goto La4
        L9b:
            java.lang.String r1 = r0.info(r12)
            p012ah.C0086a.m464w(r1)
            return
        La3:
            r13 = r9
        La4:
            r27 = r13
            r13 = r4
            r4 = r27
        La9:
            r0.valueType = r8
            r23 = r1
            r24 = r23
        Laf:
            r14 = 57
            r25 = 10
            r1 = 48
            r7 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            if (r13 < r1) goto Lea
            if (r13 > r14) goto Lea
            if (r23 != 0) goto Ld3
            int r13 = r13 + (-48)
            r26 = r8
            int r8 = r0.mag3
            int r8 = r8 * 10
            r0.mag3 = r8
            if (r8 >= r7) goto Lcd
        Lca:
            r23 = r26
            goto Ld5
        Lcd:
            int r8 = r8 - r13
            r0.mag3 = r8
            if (r8 >= r7) goto Ld5
            goto Lca
        Ld3:
            r26 = r8
        Ld5:
            if (r4 != r5) goto Lde
            int r4 = r4 + 1
            r13 = r16
            r24 = r26
            goto Lec
        Lde:
            int r1 = r4 + 1
            char r13 = r3[r4]
            r4 = r1
            r8 = r26
            r24 = r8
            r1 = 0
            r7 = 5
            goto Laf
        Lea:
            r26 = r8
        Lec:
            r8 = 46
            if (r13 != r8) goto L132
            r0.valueType = r15
            if (r4 == r5) goto L12a
            int r8 = r4 + 1
            char r4 = r3[r4]
            r13 = r4
        Lf9:
            r4 = r8
            if (r13 < r1) goto L132
            if (r13 > r14) goto L132
            if (r23 != 0) goto L113
            int r13 = r13 + (-48)
            int r8 = r0.mag3
            int r8 = r8 * 10
            r0.mag3 = r8
            if (r8 >= r7) goto L10d
        L10a:
            r23 = r26
            goto L113
        L10d:
            int r8 = r8 - r13
            r0.mag3 = r8
            if (r8 >= r7) goto L113
            goto L10a
        L113:
            short r8 = r0.scale
            int r8 = r8 + 1
            short r8 = (short) r8
            r0.scale = r8
            if (r4 != r5) goto L123
            int r4 = r4 + 1
            r13 = r16
            r24 = r26
            goto L132
        L123:
            int r8 = r4 + 1
            char r13 = r3[r4]
            r24 = r26
            goto Lf9
        L12a:
            java.lang.String r1 = r0.info(r12)
            p012ah.C0086a.m464w(r1)
            return
        L132:
            if (r23 == 0) goto L164
            boolean r7 = r0.negative
            if (r7 == 0) goto L13a
            r8 = r9
            goto L13c
        L13a:
            int r8 = r9 + (-1)
        L13c:
            short r12 = r0.scale
            if (r12 <= 0) goto L144
            int r12 = r4 + (-2)
        L142:
            int r12 = r12 - r8
            goto L147
        L144:
            int r12 = r4 + (-1)
            goto L142
        L147:
            r15 = 38
            if (r12 <= r15) goto L15e
            r12 = 8
            r0.valueType = r12
            if (r7 == 0) goto L153
            int r8 = r8 + (-1)
        L153:
            java.lang.String r7 = new java.lang.String
            int r12 = r4 + (-1)
            int r12 = r12 - r8
            r7.<init>(r3, r8, r12)
            r0.stringValue = r7
            goto L169
        L15e:
            int r7 = r4 + (-1)
            r0.bigInt(r3, r8, r7)
            goto L169
        L164:
            int r7 = r0.mag3
            int r7 = -r7
            r0.mag3 = r7
        L169:
            r7 = 101(0x65, float:1.42E-43)
            if (r13 == r7) goto L171
            r8 = 69
            if (r13 != r8) goto L1b9
        L171:
            int r8 = r4 + 1
            char r12 = r3[r4]
            if (r12 != r11) goto L17f
            int r4 = r4 + 2
            char r12 = r3[r8]
            r8 = r26
        L17d:
            r10 = 0
            goto L189
        L17f:
            if (r12 != r10) goto L187
            int r4 = r4 + 2
            char r12 = r3[r8]
        L185:
            r8 = 0
            goto L17d
        L187:
            r4 = r8
            goto L185
        L189:
            if (r12 < r1) goto L1af
            if (r12 > r14) goto L1af
            int r12 = r12 + (-48)
            int r10 = r10 * 10
            int r10 = r10 + r12
            r11 = 2047(0x7ff, float:2.868E-42)
            if (r10 > r11) goto L1a5
            if (r4 != r5) goto L19d
            r13 = r16
            r24 = r26
            goto L1b0
        L19d:
            int r11 = r4 + 1
            char r12 = r3[r4]
            r4 = r11
            r24 = r26
            goto L189
        L1a5:
            java.lang.String r1 = "too large exp value : "
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r10, r1)
            p012ah.C0086a.m464w(r1)
            return
        L1af:
            r13 = r12
        L1b0:
            if (r8 == 0) goto L1b3
            int r10 = -r10
        L1b3:
            short r1 = (short) r10
            r0.exponent = r1
            r1 = 2
            r0.valueType = r1
        L1b9:
            if (r4 != r9) goto L298
            r1 = 110(0x6e, float:1.54E-43)
            r8 = 117(0x75, float:1.64E-43)
            r10 = 108(0x6c, float:1.51E-43)
            if (r13 != r1) goto L1f1
            char r1 = r3[r4]
            if (r1 != r8) goto L1ed
            int r1 = r4 + 1
            char r1 = r3[r1]
            if (r1 != r10) goto L1ed
            int r1 = r4 + 2
            char r1 = r3[r1]
            if (r1 != r10) goto L1ed
            int r1 = r4 + 3
            r7 = r26
            r0.wasNull = r7
            r7 = 5
            r0.valueType = r7
            if (r1 != r5) goto L1e2
            r4 = r1
            r13 = r16
            goto L1e7
        L1e2:
            int r4 = r4 + 4
            char r1 = r3[r1]
            r13 = r1
        L1e7:
            r7 = 0
            r8 = 1
            r24 = 1
            goto L29b
        L1ed:
            r7 = 0
            r8 = 1
            goto L29b
        L1f1:
            r1 = 116(0x74, float:1.63E-43)
            r11 = 4
            if (r13 != r1) goto L21f
            char r1 = r3[r4]
            r12 = 114(0x72, float:1.6E-43)
            if (r1 != r12) goto L21f
            int r1 = r4 + 1
            char r1 = r3[r1]
            if (r1 != r8) goto L21f
            int r1 = r4 + 2
            char r1 = r3[r1]
            if (r1 != r7) goto L21f
            int r1 = r4 + 3
            r8 = 1
            r0.boolValue = r8
            r0.valueType = r11
            if (r1 != r5) goto L215
            r4 = r1
            r13 = r16
            goto L21a
        L215:
            int r4 = r4 + 4
            char r1 = r3[r1]
            r13 = r1
        L21a:
            r24 = r8
        L21c:
            r7 = 0
            goto L29b
        L21f:
            r8 = 1
            r1 = 102(0x66, float:1.43E-43)
            r12 = 97
            if (r13 != r1) goto L253
            char r1 = r3[r4]
            if (r1 != r12) goto L253
            int r1 = r4 + 1
            char r1 = r3[r1]
            if (r1 != r10) goto L253
            int r1 = r4 + 2
            char r1 = r3[r1]
            r10 = 115(0x73, float:1.61E-43)
            if (r1 != r10) goto L253
            int r1 = r4 + 3
            char r1 = r3[r1]
            if (r1 != r7) goto L253
            int r1 = r4 + 4
            r7 = 0
            r0.boolValue = r7
            r0.valueType = r11
            if (r1 != r5) goto L24b
        L247:
            r4 = r1
            r13 = r16
            goto L250
        L24b:
            int r4 = r4 + 5
            char r1 = r3[r1]
        L24f:
            r13 = r1
        L250:
            r24 = r8
            goto L29b
        L253:
            r7 = 0
            r1 = 78
            if (r13 != r1) goto L270
            char r10 = r3[r4]
            if (r10 != r12) goto L270
            int r10 = r4 + 1
            char r10 = r3[r10]
            if (r10 != r1) goto L270
            int r1 = r4 + 2
            r10 = 14
            r0.valueType = r10
            if (r1 != r5) goto L26b
            goto L247
        L26b:
            int r4 = r4 + 3
            char r1 = r3[r1]
            goto L24f
        L270:
            r1 = 123(0x7b, float:1.72E-43)
            if (r13 != r1) goto L284
            if (r6 != 0) goto L284
            r0.offset = r4
            r0.f1929ch = r13
            java.util.Map r1 = r0.readObject()
            r0.complex = r1
            r1 = 6
            r0.valueType = r1
            return
        L284:
            r1 = 91
            if (r13 != r1) goto L29b
            if (r6 != 0) goto L29b
            r0.offset = r4
            r0.f1929ch = r13
            java.util.List r1 = r0.readArray()
            r0.complex = r1
            r1 = 7
            r0.valueType = r1
            return
        L298:
            r8 = r26
            goto L21c
        L29b:
            if (r6 == 0) goto L2b5
            if (r13 == r6) goto L2aa
            r0.offset = r2
            r0.f1929ch = r6
            r0.readString0()
            r1 = 3
            r0.valueType = r1
            return
        L2aa:
            if (r4 != r5) goto L2af
            r13 = r16
            goto L2b5
        L2af:
            int r1 = r4 + 1
            char r2 = r3[r4]
            r4 = r1
            r13 = r2
        L2b5:
            r1 = 76
            if (r13 == r1) goto L2cd
            r1 = 70
            if (r13 == r1) goto L2cd
            r1 = 68
            if (r13 == r1) goto L2cd
            r1 = 66
            if (r13 == r1) goto L2cd
            r1 = 83
            if (r13 != r1) goto L2ca
            goto L2cd
        L2ca:
            r1 = 32
            goto L31f
        L2cd:
            r1 = 66
            if (r13 == r1) goto L308
            r1 = 68
            if (r13 == r1) goto L303
            r1 = 70
            if (r13 == r1) goto L2fe
            r1 = 76
            if (r13 == r1) goto L2ee
            r1 = 83
            if (r13 == r1) goto L2e2
            goto L313
        L2e2:
            if (r23 != 0) goto L313
            byte r1 = r0.valueType
            r2 = 2
            if (r1 == r2) goto L313
            r1 = r25
            r0.valueType = r1
            goto L313
        L2ee:
            r2 = 2
            int r1 = r4 - r9
            r6 = 19
            if (r1 >= r6) goto L313
            byte r1 = r0.valueType
            if (r1 == r2) goto L313
            r1 = 11
            r0.valueType = r1
            goto L313
        L2fe:
            r1 = 12
            r0.valueType = r1
            goto L313
        L303:
            r1 = 13
            r0.valueType = r1
            goto L313
        L308:
            if (r23 != 0) goto L313
            byte r1 = r0.valueType
            r2 = 2
            if (r1 == r2) goto L313
            r1 = 9
            r0.valueType = r1
        L313:
            if (r4 != r5) goto L318
        L315:
            r13 = r16
            goto L2ca
        L318:
            int r1 = r4 + 1
            char r2 = r3[r4]
        L31c:
            r4 = r1
            r13 = r2
            goto L2ca
        L31f:
            if (r13 > r1) goto L331
            long r1 = r21 << r13
            long r1 = r1 & r19
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 == 0) goto L331
            if (r4 != r5) goto L32c
            goto L315
        L32c:
            int r1 = r4 + 1
            char r2 = r3[r4]
            goto L31c
        L331:
            r1 = 44
            if (r13 != r1) goto L337
            r1 = r8
            goto L338
        L337:
            r1 = r7
        L338:
            r0.comma = r1
            if (r1 == 0) goto L35f
            if (r4 != r5) goto L341
            r2 = r16
            goto L346
        L341:
            int r1 = r4 + 1
            char r2 = r3[r4]
            r4 = r1
        L346:
            r13 = r2
            r1 = 32
        L349:
            if (r13 > r1) goto L35f
            long r6 = r21 << r13
            long r6 = r6 & r19
            int r2 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r2 == 0) goto L35f
            if (r4 != r5) goto L358
            r13 = r16
            goto L349
        L358:
            int r2 = r4 + 1
            char r4 = r3[r4]
            r13 = r4
            r4 = r2
            goto L349
        L35f:
            if (r24 == 0) goto L366
            r0.offset = r4
            r0.f1929ch = r13
            return
        L366:
            java.lang.String r1 = "illegal input error"
            java.lang.String r1 = r0.info(r1)
            p012ah.C0086a.m464w(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.readNumber0():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:57:0x00e4) to fix multi-entry loop: BACK_EDGE: B:57:0x00e4 -> B:58:0x00e5 */
    /* JADX DEBUG: Duplicate block (B:74:0x0115) to fix multi-entry loop: BACK_EDGE: B:74:0x0115 -> B:75:0x0116 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x00f8 -> B:55:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0120 -> B:72:0x010f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:59:0x00ee
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.OffsetDateTime readOffsetDateTime() {
        /*
            r28 = this;
            r0 = r28
            char[] r1 = r0.chars
            int r2 = r0.offset
            int r3 = r0.end
            char r4 = r0.f1929ch
            r5 = 0
            r6 = 34
            if (r4 == r6) goto L18
            r7 = 39
            if (r4 != r7) goto L14
            goto L18
        L14:
            r18 = r5
            goto L135
        L18:
            com.alibaba.fastjson2.JSONReader$Context r7 = r0.context
            boolean r7 = r7.formatComplex
            if (r7 != 0) goto L14
            int r7 = r2 + 19
            int r8 = r1.length
            if (r7 >= r8) goto L14
            if (r7 >= r3) goto L14
            int r8 = r2 + 4
            char r8 = r1[r8]
            r9 = 45
            if (r8 != r9) goto L14
            int r8 = r2 + 7
            char r8 = r1[r8]
            if (r8 != r9) goto L14
            int r8 = r2 + 10
            char r8 = r1[r8]
            r9 = 32
            if (r8 == r9) goto L3f
            r10 = 84
            if (r8 != r10) goto L14
        L3f:
            int r8 = r2 + 13
            char r8 = r1[r8]
            r10 = 58
            if (r8 != r10) goto L14
            int r8 = r2 + 16
            char r8 = r1[r8]
            if (r8 != r10) goto L14
            int r11 = com.alibaba.fastjson2.util.IOUtils.digit4(r1, r2)
            int r8 = r2 + 5
            int r12 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r8)
            int r8 = r2 + 8
            int r13 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r8)
            int r8 = r2 + 11
            int r14 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r8)
            int r8 = r2 + 14
            int r15 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r8)
            int r8 = r2 + 17
            int r16 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r8)
            r8 = r11 | r12
            r8 = r8 | r13
            r8 = r8 | r15
            r8 = r8 | r16
            if (r8 >= 0) goto L83
            java.time.ZonedDateTime r1 = r0.readZonedDateTime()
            if (r1 != 0) goto L7e
            return r5
        L7e:
            java.time.OffsetDateTime r1 = r1.toOffsetDateTime()
            return r1
        L83:
            int r8 = r2 + 20
            char r7 = r1[r7]
            r10 = 46
            r17 = 0
            if (r7 != r10) goto L92
            int r2 = r2 + 21
            char r7 = r1[r8]
            r8 = r2
        L92:
            r18 = r5
            r2 = r17
            r10 = r2
        L97:
            r5 = 48
            if (r7 < r5) goto Lae
            r5 = 57
            if (r7 > r5) goto Lae
            int r2 = r2 * 10
            int r5 = r7 + (-48)
            int r2 = r2 + r5
            int r10 = r10 + 1
            if (r8 >= r3) goto Lae
            int r5 = r8 + 1
            char r7 = r1[r8]
            r8 = r5
            goto L97
        Lae:
            if (r10 == 0) goto Lb4
            int r2 = com.alibaba.fastjson2.util.DateUtils.nanos(r2, r10)
        Lb4:
            java.time.ZoneOffset r5 = java.time.ZoneOffset.UTC
            r10 = 90
            r19 = 1
            if (r7 != r10) goto Lc2
            int r6 = r8 + 1
            char r7 = r1[r8]
            r8 = r6
            goto Ld8
        Lc2:
            if (r7 == r4) goto Ld8
            int r6 = com.alibaba.fastjson2.util.IOUtils.indexOfChar(r1, r6, r8, r3)
            r10 = -1
            if (r6 == r10) goto Ld8
            int r5 = r8 + (-1)
            int r7 = r6 - r8
            int r7 = r7 + 1
            java.time.ZoneOffset r5 = com.alibaba.fastjson2.util.DateUtils.zoneOffset(r1, r5, r7)
            int r8 = r6 + 1
            r7 = r4
        Ld8:
            if (r7 != r4) goto L135
            r4 = 26
            if (r8 < r3) goto Le0
        Lde:
            r7 = r4
            goto Le5
        Le0:
            int r6 = r8 + 1
            char r7 = r1[r8]
        Le4:
            r8 = r6
        Le5:
            r20 = 0
            r22 = 4294981377(0x100003701, double:2.122002748E-314)
            r24 = 1
            if (r7 > r9) goto L100
            long r26 = r24 << r7
            long r26 = r26 & r22
            int r6 = (r26 > r20 ? 1 : (r26 == r20 ? 0 : -1))
            if (r6 == 0) goto L100
            if (r8 != r3) goto Lfb
            goto Lde
        Lfb:
            int r6 = r8 + 1
            char r7 = r1[r8]
            goto Le4
        L100:
            r6 = 44
            if (r7 != r6) goto L107
            r6 = r19
            goto L109
        L107:
            r6 = r17
        L109:
            r0.comma = r6
            if (r6 == 0) goto L128
            if (r8 != r3) goto L111
        L10f:
            r7 = r4
            goto L116
        L111:
            int r6 = r8 + 1
            char r7 = r1[r8]
        L115:
            r8 = r6
        L116:
            if (r7 > r9) goto L128
            long r17 = r24 << r7
            long r17 = r17 & r22
            int r6 = (r17 > r20 ? 1 : (r17 == r20 ? 0 : -1))
            if (r6 == 0) goto L128
            if (r8 != r3) goto L123
            goto L10f
        L123:
            int r6 = r8 + 1
            char r7 = r1[r8]
            goto L115
        L128:
            r0.offset = r8
            r0.f1929ch = r7
            r17 = r2
            r18 = r5
            java.time.OffsetDateTime r1 = java.time.OffsetDateTime.of(r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        L135:
            java.time.ZonedDateTime r1 = r0.readZonedDateTime()
            if (r1 != 0) goto L13c
            return r18
        L13c:
            java.time.OffsetDateTime r1 = r1.toOffsetDateTime()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.readOffsetDateTime():java.time.OffsetDateTime");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        r7 = 0;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OffsetTime readOffsetTime() {
        int i9;
        int i10;
        char[] cArr = this.chars;
        int i11 = this.offset;
        JSONReader.Context context = this.context;
        char c10 = this.f1929ch;
        if ((c10 != '\"' && c10 != '\'') || context.dateFormat != null || (i9 = i11 + 8) >= cArr.length || i9 >= this.end || cArr[i11 + 2] != ':' || cArr[i11 + 5] != ':') {
            C0086a.m464w(info("illegal offsetTime"));
            return null;
        }
        char c11 = cArr[i11];
        char c12 = cArr[i11 + 1];
        char c13 = cArr[i11 + 3];
        char c14 = cArr[i11 + 4];
        char c15 = cArr[i11 + 6];
        char c16 = cArr[i11 + 7];
        if (c11 < '0' || c11 > '9' || c12 < '0' || c12 > '9') {
            C0086a.m464w(info("illegal offsetTime"));
            return null;
        }
        int i12 = (c12 - '0') + ((c11 - '0') * 10);
        if (c13 < '0' || c13 > '9' || c14 < '0' || c14 > '9') {
            C0086a.m464w(info("illegal offsetTime"));
            return null;
        }
        int i13 = (c14 - '0') + ((c13 - '0') * 10);
        if (c15 < '0' || c15 > '9' || c16 < '0' || c16 > '9') {
            C0086a.m464w(info("illegal offsetTime"));
            return null;
        }
        int i14 = (c16 - '0') + ((c15 - '0') * 10);
        int i15 = i11 + 25;
        int i16 = i9;
        int i17 = -1;
        while (true) {
            if (i16 >= i15 || i16 >= this.end || i16 >= cArr.length) {
                break;
            }
            char c17 = cArr[i16];
            if (i17 == -1 && (c17 == 'Z' || c17 == '+' || c17 == '-')) {
                i17 = (i16 - i9) - 1;
            }
            if (c17 == c10) {
                i10 = i16 - i11;
                break;
            }
            i16++;
        }
        int i18 = (i10 - 9) - i17;
        OffsetTime offsetTimeOf = OffsetTime.of(LocalTime.of(i12, i13, i14, i17 <= 0 ? 0 : DateUtils.readNanos(cArr, i17, i11 + 9)), i18 <= 1 ? ZoneOffset.UTC : ZoneOffset.of(new String(cArr, i11 + 9 + i17, i18)));
        this.offset = i10 + 2 + this.offset;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return offsetTimeOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0043 -> B:14:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:17:0x0038
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String readPattern() {
        /*
            r15 = this;
            char r0 = r15.f1929ch
            r1 = 47
            if (r0 != r1) goto L80
            char[] r0 = r15.chars
            int r2 = r15.offset
            r3 = r2
        Lb:
            int r4 = r15.end
            if (r3 >= r4) goto L17
            char r4 = r0[r3]
            if (r4 != r1) goto L14
            goto L17
        L14:
            int r3 = r3 + 1
            goto Lb
        L17:
            java.lang.String r1 = new java.lang.String
            int r4 = r3 - r2
            r1.<init>(r0, r2, r4)
            int r2 = r3 + 1
            int r4 = r15.end
            r5 = 26
            if (r2 != r4) goto L29
            r3 = r2
        L27:
            r2 = r5
            goto L2d
        L29:
            int r3 = r3 + 2
            char r2 = r0[r2]
        L2d:
            r6 = 0
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r4 = 32
            if (r2 > r4) goto L4e
            long r12 = r10 << r2
            long r12 = r12 & r8
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 == 0) goto L4e
            int r2 = r15.end
            if (r3 != r2) goto L46
            goto L27
        L46:
            int r2 = r3 + 1
            char r3 = r0[r3]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L2d
        L4e:
            r12 = 44
            if (r2 != r12) goto L54
            r12 = 1
            goto L55
        L54:
            r12 = 0
        L55:
            r15.comma = r12
            if (r12 == 0) goto L7b
            int r2 = r15.end
            if (r3 != r2) goto L60
            r2 = r3
            r3 = r5
            goto L64
        L60:
            int r2 = r3 + 1
            char r3 = r0[r3]
        L64:
            r14 = r3
            r3 = r2
            r2 = r14
        L67:
            if (r2 > r4) goto L7b
            long r12 = r10 << r2
            long r12 = r12 & r8
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 == 0) goto L7b
            int r2 = r15.end
            if (r3 != r2) goto L76
            r2 = r5
            goto L67
        L76:
            int r2 = r3 + 1
            char r3 = r0[r3]
            goto L64
        L7b:
            r15.offset = r3
            r15.f1929ch = r2
            return r1
        L80:
            java.lang.String r0 = "illegal pattern"
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.readPattern():java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0058 -> B:20:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:22:0x004d
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String readReference() {
        /*
            r15 = this;
            int r0 = r15.referenceBegin
            int r1 = r15.end
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            char[] r1 = r15.chars
            int r2 = r0 + 1
            r15.offset = r2
            char r0 = r1[r0]
            r15.f1929ch = r0
            java.lang.String r0 = r15.readString()
            char r2 = r15.f1929ch
            int r3 = r15.offset
        L1a:
            r4 = 0
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            r8 = 1
            r10 = 32
            r11 = 26
            if (r2 > r10) goto L3e
            long r12 = r8 << r2
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L3e
            int r2 = r15.end
            if (r3 != r2) goto L36
            r2 = r11
            goto L1a
        L36:
            int r2 = r3 + 1
            char r3 = r1[r3]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L1a
        L3e:
            r12 = 125(0x7d, float:1.75E-43)
            if (r2 != r12) goto L95
            int r2 = r15.end
            if (r3 != r2) goto L49
            r2 = r3
        L47:
            r3 = r11
            goto L4d
        L49:
            int r2 = r3 + 1
            char r3 = r1[r3]
        L4d:
            if (r3 > r10) goto L63
            long r12 = r8 << r3
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L63
            int r3 = r15.end
            if (r2 != r3) goto L5b
            goto L47
        L5b:
            int r3 = r2 + 1
            char r2 = r1[r2]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L4d
        L63:
            r12 = 44
            if (r3 != r12) goto L69
            r12 = 1
            goto L6a
        L69:
            r12 = 0
        L6a:
            r15.comma = r12
            if (r12 == 0) goto L90
            int r3 = r15.end
            if (r2 != r3) goto L75
            r3 = r2
            r2 = r11
            goto L79
        L75:
            int r3 = r2 + 1
            char r2 = r1[r2]
        L79:
            r14 = r3
            r3 = r2
            r2 = r14
        L7c:
            if (r3 > r10) goto L90
            long r12 = r8 << r3
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L90
            int r3 = r15.end
            if (r2 != r3) goto L8b
            r3 = r11
            goto L7c
        L8b:
            int r3 = r2 + 1
            char r2 = r1[r2]
            goto L79
        L90:
            r15.f1929ch = r3
            r15.offset = r2
            return r0
        L95:
            java.lang.String r1 = "illegal reference : "
            java.lang.String r0 = r1.concat(r0)
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.readReference():java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x013e, code lost:
    
        r9 = r5;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String readString() {
        String strSubstring;
        char cChar1;
        char[] cArr = this.chars;
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            return readStringNotMatch();
        }
        int i9 = this.offset;
        int i10 = i9;
        int i11 = 0;
        boolean z9 = false;
        while (i10 < this.end) {
            char c11 = cArr[i10];
            if (c11 == '\\') {
                int i12 = i10 + 1;
                char c12 = cArr[i12];
                if (c12 == 'u') {
                    i12 = i10 + 5;
                } else if (c12 == 'x') {
                    i12 = i10 + 3;
                }
                i10 = i12 + 1;
                z9 = true;
            } else {
                if (c11 == c10) {
                    if (z9) {
                        char[] cArr2 = new char[i11];
                        int i13 = 0;
                        while (true) {
                            char cChar2 = cArr[i9];
                            if (cChar2 == '\\') {
                                int i14 = i9 + 1;
                                char c13 = cArr[i14];
                                if (c13 == '\"' || c13 == '\\') {
                                    i9 = i14;
                                    cChar2 = c13;
                                } else {
                                    if (c13 == 'b') {
                                        cChar1 = '\b';
                                    } else if (c13 == 'f') {
                                        cChar1 = '\f';
                                    } else if (c13 == 'n') {
                                        cChar1 = '\n';
                                    } else if (c13 == 'r') {
                                        cChar1 = '\r';
                                    } else if (c13 == 'x') {
                                        char c14 = cArr[i9 + 2];
                                        i9 += 3;
                                        cChar2 = JSONReader.char2(c14, cArr[i9]);
                                    } else if (c13 == 't') {
                                        cChar1 = '\t';
                                    } else if (c13 != 'u') {
                                        cChar1 = char1(c13);
                                    } else {
                                        char c15 = cArr[i9 + 2];
                                        char c16 = cArr[i9 + 3];
                                        char c17 = cArr[i9 + 4];
                                        i9 += 5;
                                        cChar2 = JSONReader.char4(c15, c16, c17, cArr[i9]);
                                    }
                                    cChar2 = cChar1;
                                    i9 = i14;
                                }
                            } else if (cChar2 == c10) {
                                break;
                            }
                            cArr2[i13] = cChar2;
                            i9++;
                            i13++;
                        }
                        strSubstring = new String(cArr2);
                        i10 = i9;
                    } else {
                        String str = this.str;
                        int i15 = this.offset;
                        strSubstring = str != null ? str.substring(i15, i10) : new String(cArr, i15, i10 - i15);
                    }
                    if ((this.context.features & JSONReader.Feature.TrimString.mask) != 0) {
                        strSubstring = strSubstring.trim();
                    }
                    if (strSubstring.isEmpty() && (this.context.features & JSONReader.Feature.EmptyStringAsNull.mask) != 0) {
                        strSubstring = null;
                    }
                    int i16 = i10 + 1;
                    char c18 = 26;
                    if (i16 != this.end) {
                        int i17 = i10 + 2;
                        char c19 = cArr[i16];
                        while (c19 <= ' ' && ((1 << c19) & 4294981377L) != 0) {
                            if (i17 == this.end) {
                                i16 = i17;
                            } else {
                                char c20 = cArr[i17];
                                i17++;
                                c19 = c20;
                            }
                        }
                        boolean z10 = c19 == ',';
                        this.comma = z10;
                        if (!z10) {
                            c18 = c19;
                        } else if (i17 != this.end) {
                            int i18 = i17 + 1;
                            char c21 = cArr[i17];
                            while (true) {
                                i17 = i18;
                                if (c21 > ' ' || ((1 << c21) & 4294981377L) == 0) {
                                    break;
                                }
                                if (i17 == this.end) {
                                    break;
                                }
                                i18 = i17 + 1;
                                c21 = cArr[i17];
                            }
                        }
                        this.f1929ch = c18;
                        this.offset = i17;
                        return strSubstring;
                    }
                    this.f1929ch = (char) 26;
                    this.comma = false;
                    this.offset = i16;
                    return strSubstring;
                }
                i10++;
            }
            i11++;
        }
        C0086a.m464w(info("invalid escape character EOI"));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void readString0() {
        char[] cArr;
        String str;
        char c10 = this.f1929ch;
        int i9 = this.offset;
        this.valueEscape = false;
        int i10 = i9;
        int i11 = 0;
        while (true) {
            cArr = this.chars;
            char c11 = cArr[i10];
            if (c11 == '\\') {
                this.valueEscape = true;
                int i12 = i10 + 1;
                char c12 = cArr[i12];
                if (c12 == 'u') {
                    i12 = i10 + 5;
                } else if (c12 == 'x') {
                    i12 = i10 + 3;
                }
                i10 = i12 + 1;
            } else if (c11 == c10) {
                break;
            } else {
                i10++;
            }
            i11++;
        }
        if (this.valueEscape) {
            char[] cArr2 = new char[i11];
            int i13 = 0;
            while (true) {
                char[] cArr3 = this.chars;
                char cChar4 = cArr3[i9];
                if (cChar4 == '\\') {
                    int i14 = i9 + 1;
                    char c13 = cArr3[i14];
                    if (c13 == '\"' || c13 == '\\') {
                        i9 = i14;
                        cChar4 = c13;
                    } else if (c13 == 'u') {
                        char c14 = cArr3[i9 + 2];
                        char c15 = cArr3[i9 + 3];
                        char c16 = cArr3[i9 + 4];
                        i9 += 5;
                        cChar4 = JSONReader.char4(c14, c15, c16, cArr3[i9]);
                    } else if (c13 != 'x') {
                        cChar4 = char1(c13);
                        i9 = i14;
                    } else {
                        char c17 = cArr3[i9 + 2];
                        i9 += 3;
                        cChar4 = JSONReader.char2(c17, cArr3[i9]);
                    }
                } else if (cChar4 == '\"') {
                    break;
                }
                cArr2[i13] = cChar4;
                i9++;
                i13++;
            }
            str = new String(cArr2);
            i10 = i9;
        } else {
            int i15 = this.offset;
            str = new String(cArr, i15, i10 - i15);
        }
        int i16 = i10 + 1;
        char c18 = i16 == this.end ? (char) 26 : this.chars[i16];
        while (c18 <= ' ' && ((1 << c18) & 4294981377L) != 0) {
            i16++;
            c18 = this.chars[i16];
        }
        boolean z9 = c18 == ',';
        this.comma = z9;
        if (z9) {
            char[] cArr4 = this.chars;
            this.offset = i16 + 2;
            this.f1929ch = cArr4[i16 + 1];
            while (true) {
                char c19 = this.f1929ch;
                if (c19 > ' ' || ((1 << c19) & 4294981377L) == 0) {
                    break;
                }
                int i17 = this.offset;
                if (i17 >= this.end) {
                    this.f1929ch = (char) 26;
                } else {
                    char[] cArr5 = this.chars;
                    this.offset = i17 + 1;
                    this.f1929ch = cArr5[i17];
                }
            }
        } else {
            this.offset = i16 + 1;
            this.f1929ch = c18;
        }
        this.stringValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0113 -> B:61:0x00fb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:63:0x0101
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public java.util.UUID readUUID() {
        /*
            r19 = this;
            r0 = r19
            char r1 = r0.f1929ch
            r2 = 110(0x6e, float:1.54E-43)
            r3 = 0
            if (r1 != r2) goto Ld
            r0.readNull()
            return r3
        Ld:
            r2 = 34
            if (r1 == r2) goto L21
            r2 = 39
            if (r1 != r2) goto L16
            goto L21
        L16:
            java.lang.String r1 = "syntax error, can not read uuid"
            java.lang.String r1 = r0.info(r1)
            p012ah.C0086a.m464w(r1)
            r1 = 0
            return r1
        L21:
            char[] r2 = r0.chars
            int r4 = r0.offset
            int r5 = r4 + 36
            int r6 = r2.length
            r7 = 32
            r8 = 0
            r9 = 0
            r11 = 4
            if (r5 >= r6) goto Lc0
            char r5 = r2[r5]
            if (r5 != r1) goto Lc0
            int r5 = r4 + 8
            char r5 = r2[r5]
            r6 = 45
            if (r5 != r6) goto Lc0
            int r5 = r4 + 13
            char r5 = r2[r5]
            if (r5 != r6) goto Lc0
            int r5 = r4 + 18
            char r5 = r2[r5]
            if (r5 != r6) goto Lc0
            int r5 = r4 + 23
            char r5 = r2[r5]
            if (r5 != r6) goto Lc0
            r1 = r8
            r5 = r9
        L50:
            r3 = 8
            if (r1 >= r3) goto L64
            long r5 = r5 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r12 = r4 + r1
            char r12 = r2[r12]
            int r12 = r12 + (-48)
            r3 = r3[r12]
            long r12 = (long) r3
            long r5 = r5 + r12
            int r1 = r1 + 1
            goto L50
        L64:
            r1 = 9
        L66:
            r3 = 13
            if (r1 >= r3) goto L7a
            long r5 = r5 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r12 = r4 + r1
            char r12 = r2[r12]
            int r12 = r12 + (-48)
            r3 = r3[r12]
            long r12 = (long) r3
            long r5 = r5 + r12
            int r1 = r1 + 1
            goto L66
        L7a:
            r1 = 14
        L7c:
            r3 = 18
            if (r1 >= r3) goto L90
            long r5 = r5 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r12 = r4 + r1
            char r12 = r2[r12]
            int r12 = r12 + (-48)
            r3 = r3[r12]
            long r12 = (long) r3
            long r5 = r5 + r12
            int r1 = r1 + 1
            goto L7c
        L90:
            r1 = 19
            r12 = r9
        L93:
            r3 = 23
            if (r1 >= r3) goto La7
            long r12 = r12 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r14 = r4 + r1
            char r14 = r2[r14]
            int r14 = r14 + (-48)
            r3 = r3[r14]
            long r14 = (long) r3
            long r12 = r12 + r14
            int r1 = r1 + 1
            goto L93
        La7:
            r1 = 24
        La9:
            r3 = 36
            if (r1 >= r3) goto Lbd
            long r12 = r12 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r14 = r4 + r1
            char r14 = r2[r14]
            int r14 = r14 + (-48)
            r3 = r3[r14]
            long r14 = (long) r3
            long r12 = r12 + r14
            int r1 = r1 + 1
            goto La9
        Lbd:
            int r4 = r4 + 37
            goto Lf4
        Lc0:
            int r5 = r4 + 32
            int r6 = r2.length
            if (r5 >= r6) goto L137
            char r5 = r2[r5]
            if (r5 != r1) goto L137
            r1 = r8
            r5 = r9
        Lcb:
            r3 = 16
            if (r1 >= r3) goto Ldf
            long r5 = r5 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r12 = r4 + r1
            char r12 = r2[r12]
            int r12 = r12 + (-48)
            r3 = r3[r12]
            long r12 = (long) r3
            long r5 = r5 + r12
            int r1 = r1 + 1
            goto Lcb
        Ldf:
            r12 = r9
        Le0:
            if (r3 >= r7) goto Lf2
            long r12 = r12 << r11
            byte[] r1 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r14 = r4 + r3
            char r14 = r2[r14]
            int r14 = r14 + (-48)
            r1 = r1[r14]
            long r14 = (long) r1
            long r12 = r12 + r14
            int r3 = r3 + 1
            goto Le0
        Lf2:
            int r4 = r4 + 33
        Lf4:
            int r1 = r0.end
            r3 = 26
            if (r4 != r1) goto Lfd
            r1 = r4
        Lfb:
            r4 = r3
            goto L101
        Lfd:
            int r1 = r4 + 1
            char r4 = r2[r4]
        L101:
            if (r4 > r7) goto L120
            r14 = 1
            long r14 = r14 << r4
            r16 = 4294981377(0x100003701, double:2.122002748E-314)
            long r14 = r14 & r16
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 == 0) goto L120
            int r4 = r0.end
            if (r1 != r4) goto L116
            goto Lfb
        L116:
            int r4 = r1 + 1
            char r1 = r2[r1]
            r18 = r4
            r4 = r1
            r1 = r18
            goto L101
        L120:
            r0.offset = r1
            r1 = 44
            if (r4 != r1) goto L127
            r8 = 1
        L127:
            r0.comma = r8
            if (r8 == 0) goto L12f
            r0.next()
            goto L131
        L12f:
            r0.f1929ch = r4
        L131:
            java.util.UUID r1 = new java.util.UUID
            r1.<init>(r5, r12)
            return r1
        L137:
            java.lang.String r1 = r0.readString()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L142
            return r3
        L142:
            java.util.UUID r1 = java.util.UUID.fromString(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.readUUID():java.util.UUID");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r19 = ' ';
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readValueHashCode() {
        char c10;
        boolean z9;
        char c11;
        char cChar4;
        char c12;
        boolean z10;
        long j3;
        long j4;
        char c13 = this.f1929ch;
        if (c13 != '\"' && c13 != '\'') {
            return -1L;
        }
        char[] cArr = this.chars;
        this.nameEscape = false;
        int i9 = this.offset;
        this.nameBegin = i9;
        int i10 = this.end;
        int i11 = 0;
        long j5 = 0;
        while (true) {
            boolean z11 = true;
            if (i9 < i10) {
                char cChar42 = cArr[i9];
                if (cChar42 != c13) {
                    if (cChar42 == '\\') {
                        this.nameEscape = true;
                        int i12 = i9 + 1;
                        char c14 = cArr[i12];
                        if (c14 != 'u') {
                            if (c14 != 'x') {
                                cChar42 = char1(c14);
                                i9 = i12;
                            } else {
                                char c15 = cArr[i9 + 2];
                                i9 += 3;
                                cChar42 = JSONReader.char2(c15, cArr[i9]);
                            }
                            c10 = ' ';
                            if (cChar42 <= 255 && i11 < 8 && (i11 != 0 || cChar42 != 0)) {
                                switch (i11) {
                                    case 0:
                                        j5 = (byte) cChar42;
                                        continue;
                                        i9++;
                                        i11++;
                                        break;
                                    case 1:
                                        j3 = ((byte) cChar42) << 8;
                                        j4 = 255;
                                        break;
                                    case 2:
                                        j3 = ((byte) cChar42) << JSONB.Constants.BC_INT32_NUM_16;
                                        j4 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                        break;
                                    case 3:
                                        j3 = ((byte) cChar42) << 24;
                                        j4 = 16777215;
                                        break;
                                    case 4:
                                        j3 = ((long) ((byte) cChar42)) << c10;
                                        j4 = 4294967295L;
                                        break;
                                    case 5:
                                        j3 = ((long) ((byte) cChar42)) << 40;
                                        j4 = 1099511627775L;
                                        break;
                                    case 6:
                                        j3 = ((long) ((byte) cChar42)) << 48;
                                        j4 = 281474976710655L;
                                        break;
                                    case 7:
                                        j3 = ((long) ((byte) cChar42)) << 56;
                                        j4 = 72057594037927935L;
                                        break;
                                    default:
                                        i9++;
                                        i11++;
                                        break;
                                }
                                j5 = (j5 & j4) + j3;
                                i9++;
                                i11++;
                            }
                        } else {
                            char c16 = cArr[i9 + 2];
                            char c17 = cArr[i9 + 3];
                            c10 = ' ';
                            char c18 = cArr[i9 + 4];
                            i9 += 5;
                            cChar42 = JSONReader.char4(c16, c17, c18, cArr[i9]);
                            if (cChar42 <= 255) {
                            }
                        }
                    } else {
                        c10 = ' ';
                        if (cChar42 <= 255) {
                        }
                    }
                    if (j5 == 0) {
                        z9 = true;
                    } else {
                        j5 = -3750763034362895579L;
                        int i13 = 0;
                        while (true) {
                            char c19 = cArr[i9];
                            if (c19 == '\\') {
                                this.nameEscape = z11;
                                int i14 = i9 + 1;
                                char c20 = cArr[i14];
                                if (c20 != 'u') {
                                    if (c20 != 'x') {
                                        cChar4 = char1(c20);
                                    } else {
                                        char c21 = cArr[i9 + 2];
                                        int i15 = i9 + 3;
                                        cChar4 = JSONReader.char2(c21, cArr[i15]);
                                        i14 = i15;
                                    }
                                    z9 = z11;
                                } else {
                                    char c22 = cArr[i9 + 2];
                                    char c23 = cArr[i9 + 3];
                                    char c24 = cArr[i9 + 4];
                                    int i16 = i9 + 5;
                                    z9 = z11;
                                    cChar4 = JSONReader.char4(c22, c23, c24, cArr[i16]);
                                    i14 = i16;
                                }
                                j5 = (((long) cChar4) ^ j5) * Fnv.MAGIC_PRIME;
                                c11 = c10;
                                i9 = i14 + 1;
                            } else {
                                z9 = z11;
                                if (c19 == '\"') {
                                    this.nameLength = i13;
                                    this.nameEnd = i9;
                                    this.stringValue = null;
                                    i9++;
                                } else {
                                    c11 = c10;
                                    j5 = (((long) c19) ^ j5) * Fnv.MAGIC_PRIME;
                                    i9++;
                                }
                            }
                            i13++;
                            c10 = c11;
                            z11 = z9;
                        }
                    }
                    c12 = i9 != i10 ? (char) 26 : cArr[i9];
                    while (c12 <= c10 && ((1 << c12) & 4294981377L) != 0) {
                        i9++;
                        c12 = cArr[i9];
                        c10 = ' ';
                    }
                    z10 = c12 != ',' ? z9 : false;
                    this.comma = z10;
                    if (z10) {
                        i9++;
                        char c25 = i9 != i10 ? cArr[i9] : (char) 26;
                        while (c25 <= ' ' && ((1 << c25) & 4294981377L) != 0) {
                            i9++;
                            c25 = cArr[i9];
                        }
                        c12 = c25;
                    }
                    this.offset = i9 + 1;
                    this.f1929ch = c12;
                    return j5;
                }
                if (i11 == 0) {
                    i9 = this.nameBegin;
                    j5 = 0;
                } else {
                    this.nameLength = i11;
                    this.nameEnd = i9;
                    i9++;
                }
            }
        }
        i9 = this.nameBegin;
        j5 = 0;
        if (j5 == 0) {
        }
        if (i9 != i10) {
        }
        while (c12 <= c10) {
            i9++;
            c12 = cArr[i9];
            c10 = ' ';
        }
        if (c12 != ',') {
        }
        this.comma = z10;
        if (z10) {
        }
        this.offset = i9 + 1;
        this.f1929ch = c12;
        return j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ZonedDateTime readZonedDateTimeX(int i9) {
        ZonedDateTime zonedDateTimeOf;
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("date only support string input");
            return null;
        }
        if (i9 < 19) {
            return null;
        }
        if (i9 == 30) {
            char[] cArr = this.chars;
            int i10 = this.offset;
            if (cArr[i10 + 29] == 'Z') {
                zonedDateTimeOf = ZonedDateTime.of(DateUtils.parseLocalDateTime29(cArr, i10), ZoneOffset.UTC);
            } else if (i9 == 29) {
                char[] cArr2 = this.chars;
                int i11 = this.offset;
                if (cArr2[i11 + 28] == 'Z') {
                    zonedDateTimeOf = ZonedDateTime.of(DateUtils.parseLocalDateTime28(cArr2, i11), ZoneOffset.UTC);
                } else if (i9 == 28) {
                    char[] cArr3 = this.chars;
                    int i12 = this.offset;
                    if (cArr3[i12 + 27] == 'Z') {
                        zonedDateTimeOf = ZonedDateTime.of(DateUtils.parseLocalDateTime27(cArr3, i12), ZoneOffset.UTC);
                    } else if (i9 == 27) {
                        char[] cArr4 = this.chars;
                        int i13 = this.offset;
                        zonedDateTimeOf = cArr4[i13 + 26] == 'Z' ? ZonedDateTime.of(DateUtils.parseLocalDateTime26(cArr4, i13), ZoneOffset.UTC) : DateUtils.parseZonedDateTime(this.chars, this.offset, i9, this.context.zoneId);
                    }
                }
            }
        }
        if (zonedDateTimeOf == null) {
            return null;
        }
        this.offset = i9 + 1 + this.offset;
        next();
        boolean z9 = this.f1929ch == ',';
        this.comma = z9;
        if (z9) {
            next();
        }
        return zonedDateTimeOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public void skipComment() {
        boolean z9;
        boolean z10;
        char c10;
        int i9 = this.offset;
        int i10 = i9 + 1;
        if (i10 >= this.end) {
            C0086a.m464w(info());
            return;
        }
        char[] cArr = this.chars;
        char c11 = cArr[i9];
        if (c11 == '*') {
            z9 = true;
        } else {
            if (c11 != '/') {
                C0086a.m464w(info("parse comment error"));
                return;
            }
            z9 = false;
        }
        int i11 = i9 + 2;
        char c12 = cArr[i10];
        while (true) {
            if (z9) {
                if (c12 == '*' && i11 <= this.end && cArr[i11] == '/') {
                    i11++;
                }
            } else {
                z10 = c12 == '\n';
            }
            int i12 = this.end;
            c10 = 26;
            if (z10) {
                if (i11 < i12) {
                    char c13 = cArr[i11];
                    while (c13 <= ' ' && ((1 << c13) & 4294981377L) != 0) {
                        i11++;
                        if (i11 >= this.end) {
                            break;
                        } else {
                            c13 = cArr[i11];
                        }
                    }
                    c10 = c13;
                    i11++;
                }
            } else {
                if (i11 >= i12) {
                    break;
                }
                c12 = cArr[i11];
                i11++;
            }
        }
        this.f1929ch = c10;
        this.offset = i11;
        if (c10 == '/') {
            skipComment();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0078 -> B:32:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x009c -> B:47:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:35:0x006d
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean skipName() {
        /*
            r15 = this;
            char r0 = r15.f1929ch
            r1 = 0
            r3 = 39
            if (r0 != r3) goto L1b
            com.alibaba.fastjson2.JSONReader$Context r4 = r15.context
            long r4 = r4.features
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.DisableSingleQuote
            long r6 = r6.mask
            long r4 = r4 & r6
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L16
            goto L1b
        L16:
            com.alibaba.fastjson2.JSONException r0 = r15.notSupportName()
            throw r0
        L1b:
            r4 = 34
            r5 = 1
            if (r0 == r4) goto L38
            if (r0 == r3) goto L38
            com.alibaba.fastjson2.JSONReader$Context r0 = r15.context
            long r3 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.AllowUnQuotedFieldNames
            long r6 = r0.mask
            long r3 = r3 & r6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L33
            r15.readFieldNameHashCodeUnquote()
            return r5
        L33:
            com.alibaba.fastjson2.JSONException r0 = r15.notSupportName()
            throw r0
        L38:
            int r3 = r15.offset
            char[] r4 = r15.chars
        L3c:
            int r6 = r3 + 1
            char r7 = r4[r3]
            r8 = 92
            if (r7 != r8) goto L55
            char r3 = r4[r6]
            r7 = 117(0x75, float:1.64E-43)
            if (r3 != r7) goto L4c
            r3 = 5
            goto L53
        L4c:
            r7 = 120(0x78, float:1.68E-43)
            if (r3 != r7) goto L52
            r3 = 3
            goto L53
        L52:
            r3 = r5
        L53:
            int r3 = r3 + r6
            goto L3c
        L55:
            if (r7 != r0) goto Lb1
            int r0 = r15.end
            r7 = 26
            if (r6 != r0) goto L5f
        L5d:
            r0 = r7
            goto L64
        L5f:
            int r3 = r3 + 2
            char r0 = r4[r6]
            r6 = r3
        L64:
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r3 = 32
            if (r0 > r3) goto L82
            long r12 = r10 << r0
            long r12 = r12 & r8
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 == 0) goto L82
            int r0 = r15.end
            if (r6 != r0) goto L7b
            goto L5d
        L7b:
            int r0 = r6 + 1
            char r3 = r4[r6]
            r6 = r0
            r0 = r3
            goto L64
        L82:
            r12 = 58
            if (r0 != r12) goto Lac
            int r0 = r15.end
            if (r6 != r0) goto L8d
            r0 = r6
        L8b:
            r6 = r7
            goto L91
        L8d:
            int r0 = r6 + 1
            char r6 = r4[r6]
        L91:
            if (r6 > r3) goto La7
            long r12 = r10 << r6
            long r12 = r12 & r8
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 == 0) goto La7
            int r6 = r15.end
            if (r0 != r6) goto L9f
            goto L8b
        L9f:
            int r6 = r0 + 1
            char r0 = r4[r0]
            r14 = r6
            r6 = r0
            r0 = r14
            goto L91
        La7:
            r15.offset = r0
            r15.f1929ch = r6
            return r5
        Lac:
            com.alibaba.fastjson2.JSONException r0 = com.alibaba.fastjson2.JSONReader.syntaxError(r0)
            throw r0
        Lb1:
            r3 = r6
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.skipName():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:181:0x020b) to fix multi-entry loop: BACK_EDGE: B:181:0x020b -> B:182:0x0210 */
    /* JADX WARN: Path cross not found for [B:99:0x0132, B:12:0x002f], limit reached: 237 */
    /* JADX WARN: Path cross not found for [B:99:0x0132, B:4:0x001b], limit reached: 237 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00c1 -> B:182:0x0210). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:183:0x0212
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public void skipValue() {
        /*
            r20 = this;
            r0 = r20
            char[] r1 = r0.chars
            char r2 = r0.f1929ch
            int r3 = r0.offset
            r4 = 125(0x7d, float:1.75E-43)
            r5 = 93
            r6 = 101(0x65, float:1.42E-43)
            r9 = 83
            r10 = 46
            r11 = 45
            r12 = 0
            r15 = 43
            r16 = 0
            if (r2 == r15) goto L132
            r7 = 102(0x66, float:1.43E-43)
            r8 = 108(0x6c, float:1.51E-43)
            if (r2 == r7) goto Lff
            r7 = 110(0x6e, float:1.54E-43)
            r13 = 117(0x75, float:1.64E-43)
            if (r2 == r7) goto Ld5
            r7 = 116(0x74, float:1.63E-43)
            if (r2 == r7) goto La6
            if (r2 == r11) goto L132
            if (r2 == r10) goto L132
            switch(r2) {
                case 48: goto L132;
                case 49: goto L132;
                case 50: goto L132;
                case 51: goto L132;
                case 52: goto L132;
                case 53: goto L132;
                case 54: goto L132;
                case 55: goto L132;
                case 56: goto L132;
                case 57: goto L132;
                default: goto L32;
            }
        L32:
            r6 = 34
            r7 = 39
            if (r2 == r6) goto L88
            if (r2 != r7) goto L3b
            goto L88
        L3b:
            r6 = 91
            if (r2 != r6) goto L5f
            r0.next()
            r2 = r12
        L43:
            char r3 = r0.f1929ch
            if (r3 != r5) goto L4b
            r0.next()
            goto La0
        L4b:
            if (r2 == 0) goto L57
            boolean r3 = r0.comma
            if (r3 == 0) goto L52
            goto L57
        L52:
            com.alibaba.fastjson2.JSONException r1 = r0.valueError()
            throw r1
        L57:
            r0.comma = r12
            r0.skipValue()
            int r2 = r2 + 1
            goto L43
        L5f:
            r6 = 123(0x7b, float:1.72E-43)
            if (r2 != r6) goto L77
            r0.next()
        L66:
            char r2 = r0.f1929ch
            if (r2 != r4) goto L70
            r0.comma = r12
            r0.next()
            goto La0
        L70:
            r0.skipName()
            r0.skipValue()
            goto L66
        L77:
            if (r2 != r9) goto L83
            boolean r6 = r0.nextIfSet()
            if (r6 == 0) goto L83
            r0.skipValue()
            goto La0
        L83:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        L88:
            if (r2 != r7) goto L9d
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.DisableSingleQuote
            long r6 = r6.mask
            long r2 = r2 & r6
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 != 0) goto L98
            goto L9d
        L98:
            com.alibaba.fastjson2.JSONException r1 = r0.notSupportName()
            throw r1
        L9d:
            r0.skipString()
        La0:
            char r2 = r0.f1929ch
            int r3 = r0.offset
            goto L210
        La6:
            int r7 = r3 + 3
            int r8 = r0.end
            if (r7 > r8) goto Ld0
            char r9 = r1[r3]
            r10 = 114(0x72, float:1.6E-43)
            if (r9 != r10) goto Lcb
            int r9 = r3 + 1
            char r9 = r1[r9]
            if (r9 != r13) goto Lcb
            int r9 = r3 + 2
            char r9 = r1[r9]
            if (r9 != r6) goto Lcb
            if (r7 != r8) goto Lc5
        Lc0:
            r3 = r7
        Lc1:
            r2 = 26
            goto L210
        Lc5:
            int r3 = r3 + 4
            char r2 = r1[r7]
            goto L210
        Lcb:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        Ld0:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        Ld5:
            int r6 = r3 + 3
            int r7 = r0.end
            if (r6 > r7) goto Lfa
            char r9 = r1[r3]
            if (r9 != r13) goto Lf5
            int r9 = r3 + 1
            char r9 = r1[r9]
            if (r9 != r8) goto Lf5
            int r9 = r3 + 2
            char r9 = r1[r9]
            if (r9 != r8) goto Lf5
            if (r6 != r7) goto Lef
            r3 = r6
            goto Lc1
        Lef:
            int r3 = r3 + 4
            char r2 = r1[r6]
            goto L210
        Lf5:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        Lfa:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        Lff:
            int r7 = r3 + 4
            int r9 = r0.end
            if (r7 > r9) goto L12d
            char r10 = r1[r3]
            r11 = 97
            if (r10 != r11) goto L128
            int r10 = r3 + 1
            char r10 = r1[r10]
            if (r10 != r8) goto L128
            int r8 = r3 + 2
            char r8 = r1[r8]
            r10 = 115(0x73, float:1.61E-43)
            if (r8 != r10) goto L128
            int r8 = r3 + 3
            char r8 = r1[r8]
            if (r8 != r6) goto L128
            if (r7 != r9) goto L122
            goto Lc0
        L122:
            int r3 = r3 + 5
            char r2 = r1[r7]
            goto L210
        L128:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        L12d:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        L132:
            if (r2 == r11) goto L136
            if (r2 != r15) goto L143
        L136:
            int r7 = r0.end
            if (r3 >= r7) goto L288
            int r2 = r3 + 1
            char r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L143:
            if (r2 != r10) goto L147
            r7 = 1
            goto L148
        L147:
            r7 = r12
        L148:
            r8 = 57
            r13 = 48
            if (r7 != 0) goto L168
            if (r2 < r13) goto L168
            if (r2 > r8) goto L168
        L152:
            int r2 = r0.end
            if (r3 != r2) goto L159
            r2 = 26
            goto L162
        L159:
            int r2 = r3 + 1
            char r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L162:
            if (r2 < r13) goto L166
            if (r2 <= r8) goto L152
        L166:
            r7 = 1
            goto L169
        L168:
            r7 = r12
        L169:
            r12 = 68
            r5 = 70
            r4 = 76
            if (r7 == 0) goto L186
            if (r2 == r4) goto L17d
            if (r2 == r5) goto L17d
            if (r2 == r12) goto L17d
            r14 = 66
            if (r2 == r14) goto L17d
            if (r2 != r9) goto L186
        L17d:
            int r2 = r3 + 1
            char r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L186:
            if (r2 != r10) goto L1b2
            int r2 = r0.end
            if (r3 != r2) goto L18f
            r2 = 26
            goto L198
        L18f:
            int r2 = r3 + 1
            char r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L198:
            if (r2 < r13) goto L1b0
            if (r2 > r8) goto L1b0
        L19c:
            int r2 = r0.end
            if (r3 != r2) goto L1a3
            r2 = 26
            goto L1ac
        L1a3:
            int r2 = r3 + 1
            char r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L1ac:
            if (r2 < r13) goto L1b0
            if (r2 <= r8) goto L19c
        L1b0:
            r10 = 1
            goto L1b3
        L1b2:
            r10 = 0
        L1b3:
            if (r7 != 0) goto L1bd
            if (r10 == 0) goto L1b8
            goto L1bd
        L1b8:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.numberError(r3, r2)
            throw r1
        L1bd:
            if (r2 == r6) goto L1c3
            r6 = 69
            if (r2 != r6) goto L1f5
        L1c3:
            int r2 = r3 + 1
            char r6 = r1[r3]
            if (r6 == r15) goto L1cf
            if (r6 != r11) goto L1cc
            goto L1cf
        L1cc:
            r18 = 0
            goto L1da
        L1cf:
            int r7 = r0.end
            if (r2 >= r7) goto L283
            int r3 = r3 + 2
            char r6 = r1[r2]
            r2 = r3
            r18 = 1
        L1da:
            if (r6 < r13) goto L1f1
            if (r6 > r8) goto L1f1
        L1de:
            int r3 = r0.end
            if (r2 != r3) goto L1e6
            r3 = r2
            r2 = 26
            goto L1ea
        L1e6:
            int r3 = r2 + 1
            char r2 = r1[r2]
        L1ea:
            if (r2 < r13) goto L1f5
            if (r2 <= r8) goto L1ef
            goto L1f5
        L1ef:
            r2 = r3
            goto L1de
        L1f1:
            if (r18 != 0) goto L27e
            r3 = r2
            r2 = r6
        L1f5:
            if (r2 == r4) goto L201
            if (r2 == r5) goto L201
            if (r2 == r12) goto L201
            r4 = 66
            if (r2 == r4) goto L201
            if (r2 != r9) goto L210
        L201:
            int r2 = r0.end
            if (r3 != r2) goto L207
        L205:
            goto Lc1
        L207:
            int r2 = r3 + 1
            char r3 = r1[r3]
        L20b:
            r19 = r3
            r3 = r2
            r2 = r19
        L210:
            r4 = 32
            if (r2 > r4) goto L22b
            r4 = 1
            long r4 = r4 << r2
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L22b
            int r2 = r0.end
            if (r3 != r2) goto L226
            goto L205
        L226:
            int r2 = r3 + 1
            char r3 = r1[r3]
            goto L20b
        L22b:
            r4 = 44
            if (r2 != r4) goto L260
            r4 = 1
            r0.comma = r4
            int r2 = r0.end
            if (r3 != r2) goto L23a
            r2 = r3
            r3 = 26
            goto L23e
        L23a:
            int r2 = r3 + 1
            char r3 = r1[r3]
        L23e:
            r19 = r3
            r3 = r2
            r2 = r19
        L243:
            r4 = 32
            if (r2 > r4) goto L260
            r4 = 1
            long r4 = r4 << r2
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L260
            int r2 = r0.end
            if (r3 != r2) goto L25b
            r2 = 26
            goto L243
        L25b:
            int r2 = r3 + 1
            char r3 = r1[r3]
            goto L23e
        L260:
            boolean r1 = r0.comma
            if (r1 != 0) goto L278
            r1 = 26
            if (r2 == r1) goto L278
            r4 = 125(0x7d, float:1.75E-43)
            if (r2 == r4) goto L278
            r4 = 93
            if (r2 == r4) goto L278
            if (r2 != r1) goto L273
            goto L278
        L273:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        L278:
            char r1 = (char) r2
            r0.f1929ch = r1
            r0.offset = r3
            return
        L27e:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.numberError(r2, r6)
            throw r1
        L283:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.numberError(r2, r6)
            throw r1
        L288:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.numberError(r3, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.skipValue():void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0041 -> B:16:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:19:0x002e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char r8, char r9, char r10, char r11) {
        /*
            r7 = this;
            char r0 = r7.f1929ch
            r1 = 0
            if (r0 == r8) goto L6
            return r1
        L6:
            char[] r8 = r7.chars
            int r0 = r7.offset
            int r2 = r0 + 3
            int r3 = r7.end
            if (r2 > r3) goto L72
            char r4 = r8[r0]
            if (r4 != r9) goto L72
            int r9 = r0 + 1
            char r9 = r8[r9]
            if (r9 != r10) goto L72
            int r9 = r0 + 2
            char r9 = r8[r9]
            if (r9 == r11) goto L21
            goto L72
        L21:
            r9 = 26
            if (r2 != r3) goto L27
        L25:
            r10 = r9
            goto L2c
        L27:
            int r0 = r0 + 4
            char r10 = r8[r2]
            r2 = r0
        L2c:
            r11 = 32
            if (r10 > r11) goto L4b
            r3 = 1
            long r3 = r3 << r10
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 == 0) goto L4b
            int r10 = r7.end
            if (r2 != r10) goto L44
            goto L25
        L44:
            int r10 = r2 + 1
            char r11 = r8[r2]
            r2 = r10
            r10 = r11
            goto L2c
        L4b:
            int r8 = r7.offset
            int r8 = r8 + 4
            if (r2 != r8) goto L6c
            if (r10 == r9) goto L6c
            r8 = 40
            if (r10 == r8) goto L6c
            r8 = 91
            if (r10 == r8) goto L6c
            r8 = 93
            if (r10 == r8) goto L6c
            r8 = 41
            if (r10 == r8) goto L6c
            r8 = 58
            if (r10 == r8) goto L6c
            r8 = 44
            if (r10 == r8) goto L6c
            return r1
        L6c:
            r7.offset = r2
            r7.f1929ch = r10
            r8 = 1
            return r8
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfMatchIdent(char, char, char, char):boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0047 -> B:18:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:21:0x0034
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char r6, char r7, char r8, char r9, char r10) {
        /*
            r5 = this;
            char r0 = r5.f1929ch
            r1 = 0
            if (r0 == r6) goto L6
            return r1
        L6:
            char[] r6 = r5.chars
            int r0 = r5.offset
            int r2 = r0 + 4
            int r3 = r5.end
            if (r2 > r3) goto L78
            char r4 = r6[r0]
            if (r4 != r7) goto L78
            int r7 = r0 + 1
            char r7 = r6[r7]
            if (r7 != r8) goto L78
            int r7 = r0 + 2
            char r7 = r6[r7]
            if (r7 != r9) goto L78
            int r7 = r0 + 3
            char r7 = r6[r7]
            if (r7 == r10) goto L27
            goto L78
        L27:
            r7 = 26
            if (r2 != r3) goto L2d
        L2b:
            r8 = r7
            goto L32
        L2d:
            int r0 = r0 + 5
            char r8 = r6[r2]
            r2 = r0
        L32:
            r9 = 32
            if (r8 > r9) goto L51
            r9 = 1
            long r9 = r9 << r8
            r3 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r3
            r3 = 0
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 == 0) goto L51
            int r8 = r5.end
            if (r2 != r8) goto L4a
            goto L2b
        L4a:
            int r8 = r2 + 1
            char r9 = r6[r2]
            r2 = r8
            r8 = r9
            goto L32
        L51:
            int r6 = r5.offset
            int r6 = r6 + 5
            if (r2 != r6) goto L72
            if (r8 == r7) goto L72
            r6 = 40
            if (r8 == r6) goto L72
            r6 = 91
            if (r8 == r6) goto L72
            r6 = 93
            if (r8 == r6) goto L72
            r6 = 41
            if (r8 == r6) goto L72
            r6 = 58
            if (r8 == r6) goto L72
            r6 = 44
            if (r8 == r6) goto L72
            return r1
        L72:
            r5.offset = r2
            r5.f1929ch = r8
            r6 = 1
            return r6
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfMatchIdent(char, char, char, char, char):boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003b -> B:14:0x001f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:17:0x0028
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char r8, char r9, char r10) {
        /*
            r7 = this;
            char r0 = r7.f1929ch
            r1 = 0
            if (r0 == r8) goto L6
            return r1
        L6:
            char[] r8 = r7.chars
            int r0 = r7.offset
            int r2 = r0 + 2
            int r3 = r7.end
            if (r2 > r3) goto L6c
            char r4 = r8[r0]
            if (r4 != r9) goto L6c
            int r9 = r0 + 1
            char r9 = r8[r9]
            if (r9 == r10) goto L1b
            goto L6c
        L1b:
            r9 = 26
            if (r2 != r3) goto L21
        L1f:
            r10 = r9
            goto L26
        L21:
            int r0 = r0 + 3
            char r10 = r8[r2]
            r2 = r0
        L26:
            r0 = 32
            if (r10 > r0) goto L45
            r3 = 1
            long r3 = r3 << r10
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L45
            int r10 = r7.end
            if (r2 != r10) goto L3e
            goto L1f
        L3e:
            int r10 = r2 + 1
            char r0 = r8[r2]
            r2 = r10
            r10 = r0
            goto L26
        L45:
            int r8 = r7.offset
            int r8 = r8 + 3
            if (r2 != r8) goto L66
            if (r10 == r9) goto L66
            r8 = 40
            if (r10 == r8) goto L66
            r8 = 91
            if (r10 == r8) goto L66
            r8 = 93
            if (r10 == r8) goto L66
            r8 = 41
            if (r10 == r8) goto L66
            r8 = 58
            if (r10 == r8) goto L66
            r8 = 44
            if (r10 == r8) goto L66
            return r1
        L66:
            r7.offset = r2
            r7.f1929ch = r10
            r8 = 1
            return r8
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF16.nextIfMatchIdent(char, char, char):boolean");
    }

    public JSONReaderUTF16(JSONReader.Context context, Reader reader) {
        char c10;
        super(context, false);
        this.cacheIndex = -1;
        this.input = reader;
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        int length = iIdentityHashCode & (cacheItemArr.length - 1);
        this.cacheIndex = length;
        char[] andSet = JSONFactory.CHARS_UPDATER.getAndSet(cacheItemArr[length], null);
        andSet = andSet == null ? new char[8192] : andSet;
        int i9 = 0;
        while (true) {
            try {
                int i10 = reader.read(andSet, i9, andSet.length - i9);
                if (i10 == -1) {
                    break;
                }
                i9 += i10;
                if (i9 == andSet.length) {
                    int length2 = andSet.length;
                    andSet = Arrays.copyOf(andSet, length2 + (length2 >> 1));
                }
            } catch (IOException e6) {
                C0086a.m465x("read error", e6);
                throw null;
            }
        }
        this.str = null;
        this.chars = andSet;
        this.offset = 0;
        this.length = i9;
        this.start = 0;
        this.end = i9;
        if (i9 <= 0) {
            this.f1929ch = (char) 26;
            return;
        }
        this.f1929ch = andSet[0];
        while (true) {
            c10 = this.f1929ch;
            if (c10 > ' ' || ((1 << c10) & 4294981377L) == 0) {
                break;
            }
            int i11 = this.offset + 1;
            this.offset = i11;
            if (i11 >= this.length) {
                this.f1929ch = (char) 26;
                return;
            }
            this.f1929ch = andSet[i11];
        }
        this.offset++;
        if (c10 == 65534 || c10 == 65279) {
            next();
        }
        while (this.f1929ch == '/') {
            skipComment();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        r5.offset++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r7 == 65534) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r7 != 65279) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r5.f1929ch != '/') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        skipComment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONReaderUTF16(JSONReader.Context context, String str, int i9, int i10) {
        super(context, false);
        this.cacheIndex = -1;
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        int length = iIdentityHashCode & (cacheItemArr.length - 1);
        this.cacheIndex = length;
        JSONFactory.CacheItem cacheItem = cacheItemArr[length];
        AtomicReferenceFieldUpdater<JSONFactory.CacheItem, char[]> atomicReferenceFieldUpdater = JSONFactory.CHARS_UPDATER;
        char[] andSet = atomicReferenceFieldUpdater.getAndSet(cacheItem, null);
        if (andSet == null || andSet.length < i10) {
            if (andSet != null) {
                atomicReferenceFieldUpdater.lazySet(cacheItem, andSet);
            }
            andSet = new char[Math.max(i10, 8192)];
        }
        str.getChars(i9, i9 + i10, andSet, 0);
        this.str = i9 != 0 ? null : str;
        this.chars = andSet;
        this.offset = 0;
        this.length = i10;
        this.start = 0;
        this.end = i10;
        if (i10 <= 0) {
            this.f1929ch = (char) 26;
            return;
        }
        this.f1929ch = andSet[0];
        while (true) {
            char c10 = this.f1929ch;
            if (c10 > ' ' || ((1 << c10) & 4294981377L) == 0) {
                break;
            }
            int i11 = this.offset + 1;
            this.offset = i11;
            if (i11 >= this.length) {
                this.f1929ch = (char) 26;
                return;
            }
            this.f1929ch = andSet[i11];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        r4.offset++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r5 == 65534) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r5 != 65279) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r4.f1929ch != '/') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        skipComment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONReaderUTF16(JSONReader.Context context, String str, char[] cArr, int i9, int i10) {
        super(context, false);
        this.cacheIndex = -1;
        this.str = str;
        this.chars = cArr;
        this.offset = i9;
        this.length = i10;
        this.start = i9;
        int i11 = i9 + i10;
        this.end = i11;
        if (i9 >= i11) {
            this.f1929ch = (char) 26;
            return;
        }
        this.f1929ch = cArr[i9];
        while (true) {
            char c10 = this.f1929ch;
            if (c10 > ' ' || ((1 << c10) & 4294981377L) == 0) {
                break;
            }
            int i12 = this.offset + 1;
            this.offset = i12;
            if (i12 >= i10) {
                this.f1929ch = (char) 26;
                return;
            }
            this.f1929ch = cArr[i12];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r9 = r8.f1929ch;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r9 > ' ') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (((1 << r9) & 4294981377L) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        r9 = r8.offset + 1;
        r8.offset = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r9 < r12) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        r8.f1929ch = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        r8.f1929ch = r8.chars[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        r8.offset++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r9 == 65534) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r9 != 65279) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r8.f1929ch != '/') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        skipComment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONReaderUTF16(JSONReader.Context context, byte[] bArr, int i9, int i10) {
        super(context, false);
        int i11 = 0;
        this.cacheIndex = -1;
        this.str = null;
        this.chars = new char[i10 / 2];
        int i12 = i9 + i10;
        int i13 = i9;
        while (i13 < i12) {
            this.chars[i11] = (char) (((bArr[i13] & 255) << 8) | (bArr[i13 + 1] & 255));
            i13 += 2;
            i11++;
        }
        this.start = i9;
        this.length = i11;
        this.end = i11;
        int i14 = this.offset;
        if (i14 >= i11) {
            this.f1929ch = (char) 26;
            return;
        }
        this.f1929ch = this.chars[i14];
        while (true) {
            char c10 = this.f1929ch;
            if (c10 > ' ' || ((1 << c10) & 4294981377L) == 0) {
                break;
            }
            int i15 = this.offset + 1;
            this.offset = i15;
            if (i15 >= i10) {
                this.f1929ch = (char) 26;
                return;
            }
            this.f1929ch = this.chars[i15];
        }
    }
}
