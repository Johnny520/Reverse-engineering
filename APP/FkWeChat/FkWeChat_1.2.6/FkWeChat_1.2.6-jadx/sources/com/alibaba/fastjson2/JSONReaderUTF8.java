package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ValueConsumer;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;
import okhttp3.internal.http2.Settings;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class JSONReaderUTF8 extends JSONReader {
    static final int ESCAPE_INDEX_NOT_SET = -2;
    protected static final byte[] INPUT_CODES;
    protected static final byte[] INPUT_CODES_SINGLE_QUOTE;
    static final byte INPUT_CODE_ASCII_ESCAPE = 1;
    static final byte INPUT_CODE_ASCII_NORMAL = 0;
    static final byte INPUT_CODE_ERROR = -1;
    static final byte INPUT_CODE_UTF8_2 = 2;
    static final byte INPUT_CODE_UTF8_3 = 3;
    static final byte INPUT_CODE_UTF8_4 = 4;
    static final int REF;
    protected final byte[] bytes;
    protected JSONFactory.CacheItem cacheItem;
    protected final int end;

    /* JADX INFO: renamed from: in */
    protected final InputStream f4542in;
    protected final int length;
    protected boolean nameAscii;
    protected int nameBegin;
    protected int nameEnd;
    protected int nameLength;
    protected int nextEscapeIndex;
    protected int referenceBegin;
    protected final int start;

    static {
        REF = JDKUtils.BIG_ENDIAN ? 611476838 : 1717924388;
        byte[] bArr = new byte[256];
        Arrays.fill(bArr, 0, 128, (byte) 0);
        bArr[34] = 1;
        bArr[92] = 1;
        for (int i10 = 128; i10 < 256; i10++) {
            bArr[i10] = (i10 & 224) == 192 ? INPUT_CODE_UTF8_2 : (i10 & 240) == 224 ? INPUT_CODE_UTF8_3 : (i10 & 248) == 240 ? INPUT_CODE_UTF8_4 : INPUT_CODE_ERROR;
        }
        INPUT_CODES = bArr;
        byte[] bArr2 = (byte[]) bArr.clone();
        bArr2[39] = 1;
        INPUT_CODES_SINGLE_QUOTE = bArr2;
    }

    public JSONReaderUTF8(JSONReader.Context context, InputStream inputStream) {
        super(context, false, true);
        this.nextEscapeIndex = ESCAPE_INDEX_NOT_SET;
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        this.cacheItem = cacheItem;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        int i10 = context.bufferSize;
        andSet = andSet == null ? new byte[i10] : andSet;
        int i11 = 0;
        while (true) {
            try {
                int i12 = inputStream.read(andSet, i11, andSet.length - i11);
                if (i12 == -1) {
                    break;
                }
                i11 += i12;
                if (i11 == andSet.length) {
                    andSet = Arrays.copyOf(andSet, andSet.length + i10);
                }
            } catch (IOException e10) {
                C1565a.m6255a("read error", e10);
                throw null;
            }
        }
        this.bytes = andSet;
        this.offset = 0;
        this.length = i11;
        this.f4542in = inputStream;
        this.start = 0;
        this.end = i11;
        next();
        if (this.f4541ch == '/') {
            skipComment();
        }
    }

    public static void char2_utf8(byte[] bArr, int i10, int i11, char[] cArr, int i12) {
        if ((i11 >> 3) != ESCAPE_INDEX_NOT_SET) {
            C1575f.m6263a("malformed input around byte ", i10);
            return;
        }
        int i13 = bArr[i10 + 1];
        int i14 = bArr[i10 + 2];
        int i15 = bArr[i10 + 3];
        int i16 = (((i11 << 18) ^ (i13 << 12)) ^ (i14 << 6)) ^ (3678080 ^ i15);
        if ((i13 & Opcodes.CHECKCAST) != 128 || (i14 & Opcodes.CHECKCAST) != 128 || (i15 & Opcodes.CHECKCAST) != 128 || i16 < 65536 || i16 >= 1114112) {
            C1575f.m6263a("malformed input around byte ", i10);
        } else {
            cArr[i12] = (char) ((i16 >>> 10) + 55232);
            cArr[i12 + 1] = (char) ((i16 & 1023) + 56320);
        }
    }

    private void char_utf8(int i10, int i11) {
        int i12;
        int iChar2_utf8;
        byte[] bArr = this.bytes;
        int i13 = i10 & 255;
        switch (i13 >> 4) {
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.FCONST_2 /* 13 */:
                int i14 = i11 + 1;
                int iChar2_utf82 = char2_utf8(i13, bArr[i11], i14);
                i12 = i14;
                iChar2_utf8 = iChar2_utf82;
                break;
            case Opcodes.DCONST_0 /* 14 */:
                iChar2_utf8 = char2_utf8(i13, bArr[i11], bArr[i11 + 1], i11);
                i12 = i11 + 2;
                break;
            default:
                if ((i10 >> 3) != ESCAPE_INDEX_NOT_SET) {
                    C1575f.m6263a("malformed input around byte ", i11);
                    return;
                }
                iChar2_utf8 = (((i10 << 18) ^ (bArr[i11] << 12)) ^ (bArr[i11 + 1] << 6)) ^ (bArr[i11 + 2] ^ 3678080);
                i12 = i11 + 3;
                break;
                break;
        }
        this.f4541ch = (char) iChar2_utf8;
        this.offset = i12;
    }

    public static boolean containsSlashOrQuote(long j10, long j11) {
        long j12 = j11 ^ j10;
        long j13 = j10 ^ 6655295901103053916L;
        return ((((~j13) & (j13 - 72340172838076673L)) | ((~j12) & (j12 - 72340172838076673L))) & (-9187201950435737472L)) != 0;
    }

    private static char[] ensureCapacity(char[] cArr, int i10) {
        return Arrays.copyOf(cArr, JSONReader.newCapacity(i10, cArr.length));
    }

    private static int indexOf(long j10, int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            if (((byte) j10) == i10) {
                return i11;
            }
            j10 >>>= 8;
        }
        return -1;
    }

    public static int indexOfSlash(JSONReaderUTF8 jSONReaderUTF8, byte[] bArr, int i10, int i11) {
        int i12 = jSONReaderUTF8.nextEscapeIndex;
        if (i12 != ESCAPE_INDEX_NOT_SET && (i12 == -1 || i12 >= i10)) {
            return i12;
        }
        int iIndexOfSlash = IOUtils.indexOfSlash(bArr, i10, i11);
        jSONReaderUTF8.nextEscapeIndex = iIndexOfSlash;
        return iIndexOfSlash;
    }

    private static boolean isDateTImeSpace(byte b10) {
        return b10 == 84 || b10 == 32;
    }

    private boolean isReference0(byte[] bArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        byte b10;
        int i15 = i10 + 6;
        byte b11 = bArr[i15];
        while (b11 >= 0 && b11 <= 32 && ((1 << b11) & 4294981377L) != 0) {
            i15++;
            if (i15 >= i11) {
                return false;
            }
            b11 = bArr[i15];
        }
        if (b11 == 58 && (i13 = i15 + 1) < i11) {
            int i16 = bArr[i13];
            while (i16 >= 0 && i16 <= 32 && ((1 << i16) & 4294981377L) != 0) {
                i13++;
                if (i13 >= i11) {
                    return false;
                }
                i16 = bArr[i13];
            }
            if (i16 == i12 && ((i14 = i13 + 1) >= i11 || (b10 = bArr[i14]) == 36 || b10 == 46 || b10 == 64)) {
                this.referenceBegin = i13;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: of */
    public static JSONReaderUTF8 m6246of(byte[] bArr, int i10, int i11, JSONReader.Context context) {
        boolean zIsASCII;
        MethodHandle methodHandle = JDKUtils.METHOD_HANDLE_HAS_NEGATIVE;
        if (methodHandle != null) {
            try {
                zIsASCII = !(boolean) methodHandle.invoke(bArr, i10, i11);
            } catch (Throwable unused) {
                zIsASCII = false;
            }
        } else {
            zIsASCII = IOUtils.isASCII(bArr, i10, i11);
        }
        return zIsASCII ? new JSONReaderASCII(context, null, bArr, i10, i11) : new JSONReaderUTF8(context, bArr, i10, i11);
    }

    public static long parse4Nibbles(byte[] bArr, int i10) {
        int iReverseBytes = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
        if (JDKUtils.BIG_ENDIAN) {
            iReverseBytes = Integer.reverseBytes(iReverseBytes);
        }
        byte[] bArr2 = JSONFactory.NIBBLES;
        return bArr2[(iReverseBytes >> 24) & 255] | (bArr2[iReverseBytes & 255] << 12) | (bArr2[(iReverseBytes >> 8) & 255] << 8) | (bArr2[(iReverseBytes >> 16) & 255] << INPUT_CODE_UTF8_4);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x00fa -> B:75:0x00df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0126 -> B:92:0x0114). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x00ef
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
    private boolean readBoolValue0() {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readBoolValue0():boolean");
    }

    private LocalDate readLocalDate0(int i10, byte[] bArr, char c10) {
        int i11;
        int iMin = Math.min(i10 + 17, this.end);
        int i12 = -1;
        for (int i13 = i10; i13 < iMin; i13++) {
            if (bArr[i13] == c10) {
                i12 = i13;
            }
        }
        if (i12 != -1 && (i11 = i12 - i10) > 10 && bArr[i12 - 6] == 45 && bArr[i12 - 3] == 45) {
            int i14 = TypeUtils.parseInt(bArr, i10, i11 - 6);
            int iDigit2 = IOUtils.digit2(bArr, i12 - 5);
            int iDigit22 = IOUtils.digit2(bArr, i12 + ESCAPE_INDEX_NOT_SET);
            localDateOf = (i14 == 0 && iDigit2 == 0 && iDigit22 == 0) ? null : LocalDate.of(i14, iDigit2, iDigit22);
            this.offset = i12 + 1;
            next();
            boolean z10 = this.f4541ch == ',';
            this.comma = z10;
            if (z10) {
                next();
            }
        }
        return localDateOf;
    }

    public static UUID readUUID32(byte[] bArr, int i10) {
        long j10 = parse4Nibbles(bArr, i10);
        long j11 = parse4Nibbles(bArr, i10 + 4);
        long j12 = parse4Nibbles(bArr, i10 + 8);
        long j13 = parse4Nibbles(bArr, i10 + 12);
        long j14 = parse4Nibbles(bArr, i10 + 16);
        long j15 = parse4Nibbles(bArr, i10 + 20);
        long j16 = parse4Nibbles(bArr, i10 + 24);
        long j17 = parse4Nibbles(bArr, i10 + 28);
        if ((j10 | j11 | j12 | j13 | j14 | j15 | j16 | j17) >= 0) {
            return new UUID((j10 << 48) | (j11 << 32) | (j12 << 16) | j13, (j15 << 32) | (j14 << 48) | (j16 << 16) | j17);
        }
        C1569c.m6258a("Invalid UUID string:  ".concat(new String(bArr, i10, 32, StandardCharsets.ISO_8859_1)));
        return null;
    }

    public static UUID readUUID36(byte[] bArr, int i10) {
        long j10 = parse4Nibbles(bArr, i10);
        long j11 = parse4Nibbles(bArr, i10 + 4);
        long j12 = parse4Nibbles(bArr, i10 + 9);
        long j13 = parse4Nibbles(bArr, i10 + 14);
        long j14 = parse4Nibbles(bArr, i10 + 19);
        long j15 = parse4Nibbles(bArr, i10 + 24);
        long j16 = parse4Nibbles(bArr, i10 + 28);
        long j17 = parse4Nibbles(bArr, i10 + 32);
        if ((j10 | j11 | j12 | j13 | j14 | j15 | j16 | j17) >= 0) {
            return new UUID((j10 << 48) | (j11 << 32) | (j12 << 16) | j13, (j14 << 48) | (j15 << 32) | (j16 << 16) | j17);
        }
        C1569c.m6258a("Invalid UUID string:  ".concat(new String(bArr, i10, 36, StandardCharsets.ISO_8859_1)));
        return null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x010c -> B:57:0x00f2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x0102
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
    private long readValueHashCode0() {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readValueHashCode0():long");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0031 -> B:8:0x0017). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:11:0x0028
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
    private static int skipArray(com.alibaba.fastjson2.JSONReaderUTF8 r18, byte[] r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            int r3 = next(r18, r19, r20, r21)
            r4 = 0
            r5 = r4
        Lc:
            char r6 = r0.f4541ch
            r7 = 93
            if (r6 != r7) goto L84
            r5 = 26
            if (r3 != r2) goto L19
            r6 = r3
        L17:
            r3 = r5
            goto L1d
        L19:
            int r6 = r3 + 1
            r3 = r1[r3]
        L1d:
            r8 = 0
            r10 = 4294981377(0x100003701, double:2.122002748E-314)
            r12 = 1
            r14 = 32
            if (r3 > r14) goto L3e
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r15 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r15 == 0) goto L3e
            if (r6 != r2) goto L34
            goto L17
        L34:
            int r3 = r6 + 1
            r6 = r1[r6]
            r17 = r6
            r6 = r3
            r3 = r17
            goto L1d
        L3e:
            r15 = 44
            if (r3 != r15) goto L60
            if (r6 != r2) goto L46
            r4 = r5
            goto L4b
        L46:
            int r3 = r6 + 1
            r4 = r1[r6]
            goto L5d
        L4b:
            r3 = r4
        L4c:
            if (r3 > r14) goto L5f
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r4 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r4 == 0) goto L5f
            if (r6 != r2) goto L59
            r3 = r5
            goto L4c
        L59:
            int r3 = r6 + 1
            r4 = r1[r6]
        L5d:
            r6 = r3
            goto L4b
        L5f:
            r4 = 1
        L60:
            r1 = 125(0x7d, float:1.75E-43)
            if (r4 != 0) goto L70
            if (r3 == r1) goto L70
            if (r3 == r7) goto L70
            if (r3 != r5) goto L6b
            goto L70
        L6b:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r6, r3)
            throw r0
        L70:
            if (r4 == 0) goto L7e
            if (r3 == r1) goto L79
            if (r3 == r7) goto L79
            if (r3 == r5) goto L79
            goto L7e
        L79:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r6, r3)
            throw r0
        L7e:
            r0.comma = r4
            char r1 = (char) r3
            r0.f4541ch = r1
            return r6
        L84:
            if (r5 == 0) goto L90
            boolean r6 = r0.comma
            if (r6 == 0) goto L8b
            goto L90
        L8b:
            com.alibaba.fastjson2.JSONException r0 = r0.valueError()
            throw r0
        L90:
            int r3 = skipValue(r0, r1, r3, r2)
            int r5 = r5 + 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipArray(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:9:0x0013). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x0024
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
    private static int skipFalse(com.alibaba.fastjson2.JSONReaderUTF8 r18, byte[] r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r21
            int r2 = r20 + 4
            if (r2 > r1) goto L82
            boolean r3 = com.alibaba.fastjson2.util.IOUtils.notALSE(r19, r20)
            if (r3 != 0) goto L82
            r3 = 26
            if (r2 != r1) goto L15
            r4 = r2
        L13:
            r2 = r3
            goto L19
        L15:
            int r4 = r20 + 5
            r2 = r19[r2]
        L19:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            if (r2 > r11) goto L3a
            long r12 = r9 << r2
            long r12 = r12 & r7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L3a
            if (r4 != r1) goto L30
            goto L13
        L30:
            int r2 = r4 + 1
            r4 = r19[r4]
            r17 = r4
            r4 = r2
            r2 = r17
            goto L19
        L3a:
            r12 = 44
            r13 = 93
            r14 = 125(0x7d, float:1.75E-43)
            if (r2 != r12) goto L6f
            if (r4 != r1) goto L47
            r2 = r4
            r4 = r3
            goto L4b
        L47:
            int r2 = r4 + 1
            r4 = r19[r4]
        L4b:
            r17 = r4
            r4 = r2
            r2 = r17
        L50:
            if (r2 > r11) goto L62
            long r15 = r9 << r2
            long r15 = r15 & r7
            int r12 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r12 == 0) goto L62
            if (r4 != r1) goto L5d
            r2 = r3
            goto L50
        L5d:
            int r2 = r4 + 1
            r4 = r19[r4]
            goto L4b
        L62:
            if (r2 == r14) goto L6a
            if (r2 == r13) goto L6a
            if (r2 == r3) goto L6a
            r1 = 1
            goto L7c
        L6a:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r4, r2)
            throw r0
        L6f:
            if (r2 == r14) goto L7b
            if (r2 == r13) goto L7b
            if (r2 != r3) goto L76
            goto L7b
        L76:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r4, r2)
            throw r0
        L7b:
            r1 = 0
        L7c:
            r0.comma = r1
            char r1 = (char) r2
            r0.f4541ch = r1
            return r4
        L82:
            com.alibaba.fastjson2.JSONException r0 = r0.error()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipFalse(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0049 -> B:15:0x0024). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x006a -> B:32:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:34:0x0061
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
    private static int skipName(com.alibaba.fastjson2.JSONReaderUTF8 r12, byte[] r13, int r14, int r15) {
        /*
            char r0 = r12.f4541ch
            boolean r1 = r12.checkNameBegin(r0)
            if (r1 == 0) goto Lb
            int r12 = r12.offset
            return r12
        Lb:
            int r1 = com.alibaba.fastjson2.util.IOUtils.indexOfQuote(r13, r0, r14, r15)
            r2 = -1
            if (r1 == r2) goto L7e
            int r14 = indexOfSlash(r12, r13, r14, r15)
            r3 = 26
            if (r14 == r2) goto L2b
            if (r14 <= r1) goto L1d
            goto L2b
        L1d:
            int r14 = skipStringEscaped(r12, r13, r14, r0)
            if (r14 != r15) goto L26
        L23:
            r0 = r14
        L24:
            r14 = r3
            goto L35
        L26:
            int r0 = r14 + 1
            r14 = r13[r14]
            goto L35
        L2b:
            int r14 = r1 + 1
            if (r14 != r15) goto L30
            goto L23
        L30:
            int r1 = r1 + 2
            r14 = r13[r14]
            r0 = r1
        L35:
            r1 = 0
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            r6 = 1
            r8 = 32
            if (r14 > r8) goto L54
            long r9 = r6 << r14
            long r9 = r9 & r4
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 == 0) goto L54
            if (r0 != r15) goto L4c
            goto L24
        L4c:
            int r14 = r0 + 1
            r0 = r13[r0]
            r11 = r0
            r0 = r14
            r14 = r11
            goto L35
        L54:
            r9 = 58
            if (r14 != r9) goto L79
            if (r0 != r15) goto L5d
            r14 = r0
        L5b:
            r0 = r3
            goto L61
        L5d:
            int r14 = r0 + 1
            r0 = r13[r0]
        L61:
            if (r0 > r8) goto L75
            long r9 = r6 << r0
            long r9 = r9 & r4
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 == 0) goto L75
            if (r14 != r15) goto L6d
            goto L5b
        L6d:
            int r0 = r14 + 1
            r14 = r13[r14]
            r11 = r0
            r0 = r14
            r14 = r11
            goto L61
        L75:
            char r13 = (char) r0
            r12.f4541ch = r13
            return r14
        L79:
            com.alibaba.fastjson2.JSONException r12 = com.alibaba.fastjson2.JSONReader.syntaxError(r14)
            throw r12
        L7e:
            java.lang.String r13 = "invalid escape character EOI"
            com.alibaba.fastjson2.JSONException r12 = r12.error(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipName(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:9:0x0017). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x0028
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
    private static int skipNull(com.alibaba.fastjson2.JSONReaderUTF8 r19, byte[] r20, int r21, int r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            int r3 = r21 + 3
            if (r3 > r2) goto L87
            int r4 = r21 + (-1)
            boolean r4 = com.alibaba.fastjson2.util.IOUtils.notNULL(r1, r4)
            if (r4 != 0) goto L87
            r4 = 26
            if (r3 != r2) goto L19
            r5 = r3
        L17:
            r3 = r4
            goto L1d
        L19:
            int r5 = r21 + 4
            r3 = r1[r3]
        L1d:
            r6 = 0
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r12 = 32
            if (r3 > r12) goto L3e
            long r13 = r10 << r3
            long r13 = r13 & r8
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 == 0) goto L3e
            if (r5 != r2) goto L34
            goto L17
        L34:
            int r3 = r5 + 1
            r5 = r1[r5]
            r18 = r5
            r5 = r3
            r3 = r18
            goto L1d
        L3e:
            r13 = 44
            r14 = 93
            r15 = 125(0x7d, float:1.75E-43)
            if (r3 != r13) goto L74
            if (r5 != r2) goto L4b
            r3 = r5
            r5 = r4
            goto L4f
        L4b:
            int r3 = r5 + 1
            r5 = r1[r5]
        L4f:
            r18 = r5
            r5 = r3
            r3 = r18
        L54:
            if (r3 > r12) goto L67
            long r16 = r10 << r3
            long r16 = r16 & r8
            int r13 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r13 == 0) goto L67
            if (r5 != r2) goto L62
            r3 = r4
            goto L54
        L62:
            int r3 = r5 + 1
            r5 = r1[r5]
            goto L4f
        L67:
            if (r3 == r15) goto L6f
            if (r3 == r14) goto L6f
            if (r3 == r4) goto L6f
            r1 = 1
            goto L81
        L6f:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r5, r3)
            throw r0
        L74:
            if (r3 == r15) goto L80
            if (r3 == r14) goto L80
            if (r3 != r4) goto L7b
            goto L80
        L7b:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r5, r3)
            throw r0
        L80:
            r1 = 0
        L81:
            r0.comma = r1
            char r1 = (char) r3
            r0.f4541ch = r1
            return r5
        L87:
            com.alibaba.fastjson2.JSONException r0 = r0.error()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipNull(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x00fa, code lost:
    
        r1 = 26;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int skipNumber(com.alibaba.fastjson2.JSONReaderUTF8 r19, byte[] r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipNumber(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int, boolean):int");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:7:0x0023). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x00c4 -> B:62:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:9:0x0029
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
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static int skipObject(com.alibaba.fastjson2.JSONReaderUTF8 r21, byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipObject(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    private static int skipSet(JSONReaderUTF8 jSONReaderUTF8, byte[] bArr, int i10, int i11) {
        if (nextIfSet(jSONReaderUTF8, bArr, i10, i11)) {
            return skipArray(jSONReaderUTF8, bArr, jSONReaderUTF8.offset, i11);
        }
        throw jSONReaderUTF8.error();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        r3 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r3 != r22) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        r4 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        r4 = r20[r3];
        r3 = r5 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        r18 = r4;
        r4 = r3;
        r3 = r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int skipString(com.alibaba.fastjson2.JSONReaderUTF8 r19, byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipString(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    private static int skipStringEscaped(JSONReaderUTF8 jSONReaderUTF8, byte[] bArr, int i10, int i11) {
        int i12 = i10 + 1;
        int i13 = 92;
        while (true) {
            if (i13 == 92) {
                int i14 = i12 + 1;
                byte b10 = bArr[i12];
                if (b10 == 117) {
                    i14 = i12 + 5;
                } else if (b10 == 120) {
                    i14 = i12 + 3;
                } else if (b10 != 92 && b10 != 34) {
                    jSONReaderUTF8.char1(b10);
                }
                i12 = i14 + 1;
                i13 = bArr[i14];
            } else {
                if (i13 == i11) {
                    return i12;
                }
                i13 = bArr[i12];
                i12++;
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:9:0x0017). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x0028
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
    private static int skipTrue(com.alibaba.fastjson2.JSONReaderUTF8 r19, byte[] r20, int r21, int r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            int r3 = r21 + 3
            if (r3 > r2) goto L87
            int r4 = r21 + (-1)
            boolean r4 = com.alibaba.fastjson2.util.IOUtils.notTRUE(r1, r4)
            if (r4 != 0) goto L87
            r4 = 26
            if (r3 != r2) goto L19
            r5 = r3
        L17:
            r3 = r4
            goto L1d
        L19:
            int r5 = r21 + 4
            r3 = r1[r3]
        L1d:
            r6 = 0
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r12 = 32
            if (r3 > r12) goto L3e
            long r13 = r10 << r3
            long r13 = r13 & r8
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 == 0) goto L3e
            if (r5 != r2) goto L34
            goto L17
        L34:
            int r3 = r5 + 1
            r5 = r1[r5]
            r18 = r5
            r5 = r3
            r3 = r18
            goto L1d
        L3e:
            r13 = 44
            r14 = 93
            r15 = 125(0x7d, float:1.75E-43)
            if (r3 != r13) goto L74
            if (r5 != r2) goto L4b
            r3 = r5
            r5 = r4
            goto L4f
        L4b:
            int r3 = r5 + 1
            r5 = r1[r5]
        L4f:
            r18 = r5
            r5 = r3
            r3 = r18
        L54:
            if (r3 > r12) goto L67
            long r16 = r10 << r3
            long r16 = r16 & r8
            int r13 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r13 == 0) goto L67
            if (r5 != r2) goto L62
            r3 = r4
            goto L54
        L62:
            int r3 = r5 + 1
            r5 = r1[r5]
            goto L4f
        L67:
            if (r3 == r15) goto L6f
            if (r3 == r14) goto L6f
            if (r3 == r4) goto L6f
            r1 = 1
            goto L81
        L6f:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r5, r3)
            throw r0
        L74:
            if (r3 == r15) goto L80
            if (r3 == r14) goto L80
            if (r3 != r4) goto L7b
            goto L80
        L7b:
            com.alibaba.fastjson2.JSONException r0 = r0.error(r5, r3)
            throw r0
        L80:
            r1 = 0
        L81:
            r0.comma = r1
            char r1 = (char) r3
            r0.f4541ch = r1
            return r5
        L87:
            com.alibaba.fastjson2.JSONException r0 = r0.error()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipTrue(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        JSONFactory.CacheItem cacheItem = this.cacheItem;
        if (cacheItem != null) {
            byte[] bArr = this.bytes;
            if (bArr.length < 8388608) {
                JSONFactory.BYTES_UPDATER.lazySet(cacheItem, bArr);
            }
        }
        InputStream inputStream = this.f4542in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136 A[FALL_THROUGH] */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getFieldName() {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.getFieldName():java.lang.String");
    }

    public final String getLatin1String(int i10, int i11) {
        if (JDKUtils.ANDROID_SDK_INT >= 34) {
            return new String(this.bytes, i10, i11, StandardCharsets.ISO_8859_1);
        }
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem cacheItem = JSONFactory.CACHE_ITEMS[iIdentityHashCode & (r1.length - 1)];
        char[] andSet = JSONFactory.CHARS_UPDATER.getAndSet(cacheItem, null);
        if (andSet == null || andSet.length < i11) {
            andSet = new char[i11];
        }
        for (int i12 = 0; i12 < i11; i12++) {
            andSet[i12] = (char) (this.bytes[i10 + i12] & INPUT_CODE_ERROR);
        }
        String str = new String(andSet, 0, i11);
        JSONFactory.CHARS_UPDATER.lazySet(cacheItem, andSet);
        return str;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long getNameHashCodeLCase() {
        char c10;
        char c11;
        int i10;
        int i11;
        int iChar1;
        int iHexDigit4;
        int i12;
        int i13;
        int i14;
        int i15 = this.nameBegin;
        int i16 = this.end;
        byte[] bArr = this.bytes;
        int i17 = (i15 <= 0 || bArr[i15 + (-1)] != '\'') ? '\"' : '\'';
        int i18 = 0;
        long j10 = 0;
        while (true) {
            c10 = '-';
            c11 = ' ';
            if (i15 >= i16) {
                break;
            }
            int iHexDigit42 = bArr[i15];
            if (iHexDigit42 != 92) {
                if (iHexDigit42 != -61 && iHexDigit42 != -62) {
                    if (iHexDigit42 != i17) {
                        break;
                        break;
                    }
                    break;
                }
                i15++;
                iHexDigit42 = ((iHexDigit42 & 31) << 6) | (bArr[i15] & '?');
            } else {
                int i19 = i15 + 1;
                int i20 = bArr[i19];
                if (i20 == 117) {
                    iHexDigit42 = IOUtils.hexDigit4(bArr, i15 + 2, i16);
                    i15 += 5;
                } else if (i20 != 120) {
                    iHexDigit42 = char1(i20);
                    i15 = i19;
                } else {
                    int i21 = bArr[i15 + 2];
                    i15 += 3;
                    iHexDigit42 = JSONReader.char2(i21, bArr[i15]);
                }
            }
            if (i18 >= 8 || iHexDigit42 > 255 || iHexDigit42 < 0 || (i18 == 0 && iHexDigit42 == 0)) {
                break;
            }
            if ((iHexDigit42 != 95 && iHexDigit42 != 45 && iHexDigit42 != 32) || (i14 = bArr[i15 + 1]) == 34 || i14 == 39 || i14 == iHexDigit42) {
                if (iHexDigit42 >= 65 && iHexDigit42 <= 90) {
                    iHexDigit42 = (char) (iHexDigit42 + 32);
                }
                j10 |= ((long) iHexDigit42) << (i18 << 3);
                i18++;
            }
            i15++;
        }
        i15 = this.nameBegin;
        j10 = 0;
        if (j10 != 0) {
            return j10;
        }
        boolean z10 = this.nameAscii;
        long j11 = Fnv.MAGIC_HASH_CODE;
        if (z10 && !this.nameEscape) {
            for (int i22 = this.nameBegin; i22 < this.nameEnd; i22++) {
                int i23 = bArr[i22];
                if (i23 >= 65 && i23 <= 90) {
                    i23 += 32;
                }
                if ((i23 == 95 || i23 == 45 || i23 == 32) && (i13 = bArr[i22 + 1]) != 34) {
                    if (i13 == 39 || i13 == i23) {
                    }
                }
                j11 = (j11 ^ ((long) i23)) * Fnv.MAGIC_PRIME;
            }
            return j11;
        }
        while (true) {
            int i24 = bArr[i15];
            if (i24 == 92) {
                int i25 = i15 + 1;
                int i26 = bArr[i25];
                if (i26 == 117) {
                    iHexDigit4 = IOUtils.hexDigit4(bArr, i15 + 2, i16);
                    i12 = i15 + 5;
                } else if (i26 != 120) {
                    iChar1 = char1(i26);
                    i11 = i25 + 1;
                } else {
                    int i27 = bArr[i15 + 2];
                    i12 = i15 + 3;
                    iHexDigit4 = JSONReader.char2(i27, bArr[i12]);
                }
                int i28 = iHexDigit4;
                i25 = i12;
                iChar1 = i28;
                i11 = i25 + 1;
            } else {
                if (i24 == i17) {
                    return j11;
                }
                if (i24 >= 0) {
                    if (i24 >= 65 && i24 <= 90) {
                        i24 += 32;
                    }
                    i10 = i15 + 1;
                } else {
                    switch ((i24 & 255) >> 4) {
                        case Opcodes.FCONST_1 /* 12 */:
                        case Opcodes.FCONST_2 /* 13 */:
                            i24 = ((i24 & 31) << 6) | (bArr[i15 + 1] & '?');
                            i10 = i15 + 2;
                            break;
                        case Opcodes.DCONST_0 /* 14 */:
                            i24 = ((i24 & 15) << 12) | ((bArr[i15 + 1] & '?') << 6) | (bArr[i15 + 2] & '?');
                            i10 = i15 + 3;
                            break;
                        default:
                            C1575f.m6263a("malformed input around byte ", i15);
                            return 0L;
                    }
                }
                int i29 = i24;
                i11 = i10;
                iChar1 = i29 == true ? 1 : 0;
            }
            if (iChar1 != 95 && iChar1 != c10 && iChar1 != c11) {
                j11 = (j11 ^ ((long) iChar1)) * Fnv.MAGIC_PRIME;
            }
            i15 = i11;
            c11 = ' ';
            c10 = '-';
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int getRawInt() {
        int i10 = this.offset;
        int i11 = i10 + 3;
        byte[] bArr = this.bytes;
        if (i11 < bArr.length) {
            return JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) - 1);
        }
        return 0;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final long getRawLong() {
        int i10 = this.offset;
        int i11 = i10 + 8;
        byte[] bArr = this.bytes;
        if (i11 < bArr.length) {
            return JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) - 1);
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        com.alibaba.fastjson2.C1575f.m6263a("malformed input around byte ", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
    
        com.alibaba.fastjson2.C1575f.m6263a("malformed input around byte ", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        return null;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString() {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.getString():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int getStringLength() {
        int i10;
        byte b10 = this.f4541ch;
        if (b10 != 34 && b10 != 39) {
            C1588i.m6279a("string length only support string input ", this.f4541ch);
            return 0;
        }
        int i11 = this.offset;
        byte[] bArr = this.bytes;
        int i12 = i11 + 8;
        if (i12 >= this.end || i12 >= bArr.length || bArr[i11] == b10 || bArr[i11 + 1] == b10 || bArr[i11 + 2] == b10 || bArr[i11 + 3] == b10 || bArr[i11 + 4] == b10 || bArr[i11 + 5] == b10 || bArr[i11 + 6] == b10 || bArr[i11 + 7] == b10) {
            i10 = 0;
        } else {
            i10 = 8;
            i11 = i12;
        }
        while (i11 < this.end && bArr[i11] != b10) {
            i11++;
            i10++;
        }
        return i10;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final String info(String str) {
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= this.offset || i11 >= this.end) {
                break;
            }
            if (this.bytes[i11] == 10) {
                i10++;
                i12 = 0;
            }
            i11++;
            i12++;
        }
        StringBuilder sb2 = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            sb2.append(str);
            sb2.append(", ");
        }
        sb2.append("offset ");
        sb2.append(this.offset);
        sb2.append(", character ");
        sb2.append(this.f4541ch);
        sb2.append(", line ");
        sb2.append(i10);
        sb2.append(", column ");
        sb2.append(i12);
        sb2.append(", fastjson-version 2.0.61");
        sb2.append(i10 <= 1 ? ' ' : '\n');
        sb2.append(new String(this.bytes, this.start, Math.min(this.length, Settings.DEFAULT_INITIAL_WINDOW_SIZE)));
        return sb2.toString();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean isNull() {
        int i10;
        return this.f4541ch == 'n' && (i10 = this.offset) < this.end && this.bytes[i10] == 117;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean isReference() {
        int i10;
        int i11;
        if ((this.context.features & 8589934592L) != 0) {
            return false;
        }
        byte[] bArr = this.bytes;
        if (this.f4541ch != '{' || (i10 = this.offset) == (i11 = this.end)) {
            return false;
        }
        byte b10 = bArr[i10];
        while (b10 <= 32 && ((1 << b10) & 4294981377L) != 0) {
            i10++;
            if (i10 >= i11) {
                return false;
            }
            b10 = bArr[i10];
        }
        if (i10 + 6 < i11 && bArr[i10 + 5] == b10 && JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10) + 1) == REF) {
            return isReference0(bArr, i10, i11, b10);
        }
        return false;
    }

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
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r9.end
            r3 = 26
            if (r1 < r2) goto Ld
            r2 = r1
        Lb:
            r1 = r3
            goto L11
        Ld:
            int r2 = r1 + 1
            r1 = r0[r1]
        L11:
            r4 = 32
            if (r1 > r4) goto L31
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            int r1 = r9.end
            if (r2 != r1) goto L29
            goto Lb
        L29:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L11
        L31:
            if (r1 >= 0) goto L37
            r9.char_utf8(r1, r2)
            return
        L37:
            r9.offset = r2
            char r0 = (char) r1
            r9.f4541ch = r0
            r0 = 47
            if (r1 != r0) goto L43
            r9.skipComment()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.next():void");
    }

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
    public final boolean nextIfArrayEnd() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.f4541ch
            byte[] r2 = r0.bytes
            int r3 = r0.offset
            r4 = 93
            if (r1 == r4) goto Le
            r1 = 0
            return r1
        Le:
            int r1 = r0.end
            r4 = 26
            if (r3 != r1) goto L17
            r1 = r3
        L15:
            r3 = r4
            goto L1b
        L17:
            int r1 = r3 + 1
            r3 = r2[r3]
        L1b:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            if (r3 > r11) goto L3e
            long r12 = r9 << r3
            long r12 = r12 & r7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L3e
            int r3 = r0.end
            if (r1 != r3) goto L34
            goto L15
        L34:
            int r3 = r1 + 1
            r1 = r2[r1]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L1b
        L3e:
            r12 = 44
            r13 = 1
            if (r3 != r12) goto L69
            r0.comma = r13
            int r3 = r0.end
            if (r1 != r3) goto L4c
            r3 = r1
            r1 = r4
            goto L50
        L4c:
            int r3 = r1 + 1
            r1 = r2[r1]
        L50:
            r16 = r3
            r3 = r1
            r1 = r16
        L55:
            if (r3 > r11) goto L69
            long r14 = r9 << r3
            long r14 = r14 & r7
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 == 0) goto L69
            int r3 = r0.end
            if (r1 != r3) goto L64
            r3 = r4
            goto L55
        L64:
            int r3 = r1 + 1
            r1 = r2[r1]
            goto L50
        L69:
            if (r3 >= 0) goto L6f
            r0.char_utf8(r3, r1)
            return r13
        L6f:
            char r2 = (char) r3
            r0.f4541ch = r2
            r0.offset = r1
            r1 = 47
            if (r3 != r1) goto L7b
            r0.skipComment()
        L7b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfArrayEnd():boolean");
    }

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
    public final boolean nextIfArrayStart() {
        /*
            r9 = this;
            char r0 = r9.f4541ch
            r1 = 91
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            byte[] r0 = r9.bytes
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
            r1 = r0[r1]
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
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L19
        L39:
            r0 = 1
            if (r1 >= 0) goto L40
            r9.char_utf8(r1, r2)
            return r0
        L40:
            char r3 = (char) r1
            r9.f4541ch = r3
            r9.offset = r2
            r2 = 47
            if (r1 != r2) goto L4c
            r9.skipComment()
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfArrayStart():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x004b -> B:18:0x003a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:20:0x0040
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
    public final boolean nextIfComma() {
        /*
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            char r2 = r14.f4541ch
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
            r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L6
        L2a:
            r11 = 44
            if (r2 == r11) goto L35
            r14.offset = r1
            char r0 = (char) r2
            r14.f4541ch = r0
            r0 = 0
            return r0
        L35:
            int r2 = r14.end
            if (r1 != r2) goto L3c
            r2 = r1
        L3a:
            r1 = r10
            goto L40
        L3c:
            int r2 = r1 + 1
            r1 = r0[r1]
        L40:
            if (r1 > r9) goto L56
            long r11 = r7 << r1
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L56
            int r1 = r14.end
            if (r2 != r1) goto L4e
            goto L3a
        L4e:
            int r1 = r2 + 1
            r2 = r0[r2]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L40
        L56:
            r0 = 1
            if (r1 >= 0) goto L5d
            r14.char_utf8(r1, r2)
            return r0
        L5d:
            r14.offset = r2
            char r2 = (char) r1
            r14.f4541ch = r2
            r2 = 47
            if (r1 != r2) goto L69
            r14.skipComment()
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfComma():boolean");
    }

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
    public final boolean nextIfInfinity() {
        /*
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            char r2 = r10.f4541ch
            r3 = 73
            if (r2 != r3) goto L74
            int r2 = r1 + 6
            int r3 = r10.end
            if (r2 >= r3) goto L74
            r4 = r0[r1]
            r5 = 110(0x6e, float:1.54E-43)
            if (r4 != r5) goto L74
            int r4 = r1 + 1
            r4 = r0[r4]
            r6 = 102(0x66, float:1.43E-43)
            if (r4 != r6) goto L74
            int r4 = r1 + 2
            r4 = r0[r4]
            r6 = 105(0x69, float:1.47E-43)
            if (r4 != r6) goto L74
            int r4 = r1 + 3
            r4 = r0[r4]
            if (r4 != r5) goto L74
            int r4 = r1 + 4
            r4 = r0[r4]
            if (r4 != r6) goto L74
            int r4 = r1 + 5
            r4 = r0[r4]
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L74
            r2 = r0[r2]
            r4 = 121(0x79, float:1.7E-43)
            if (r2 != r4) goto L74
            int r2 = r1 + 7
            r4 = 26
            if (r2 != r3) goto L49
            r1 = r2
        L47:
            r2 = r4
            goto L4d
        L49:
            int r1 = r1 + 8
            r2 = r0[r2]
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
            r1 = r0[r1]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L4d
        L6d:
            r10.offset = r1
            char r0 = (char) r2
            r10.f4541ch = r0
            r0 = 1
            return r0
        L74:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfInfinity():boolean");
    }

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
    public final boolean nextIfMatch(char r15) {
        /*
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            char r2 = r14.f4541ch
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
            r1 = r0[r1]
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
            r1 = r0[r1]
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
            r15 = r0[r15]
            r13 = r1
            r1 = r15
            r15 = r13
            goto L39
        L4f:
            r0 = 1
            if (r1 >= 0) goto L56
            r14.char_utf8(r1, r15)
            return r0
        L56:
            r14.offset = r15
            char r15 = (char) r1
            r14.f4541ch = r15
            r15 = 47
            if (r1 != r15) goto L62
            r14.skipComment()
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatch(char):boolean");
    }

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
    public final boolean nextIfMatchIdent(char r6, char r7, char r8, char r9, char r10, char r11) {
        /*
            r5 = this;
            char r0 = r5.f4541ch
            r1 = 0
            if (r0 == r6) goto L6
            return r1
        L6:
            byte[] r6 = r5.bytes
            int r0 = r5.offset
            int r2 = r0 + 5
            int r3 = r5.end
            if (r2 > r3) goto L7f
            r4 = r6[r0]
            if (r4 != r7) goto L7f
            int r7 = r0 + 1
            r7 = r6[r7]
            if (r7 != r8) goto L7f
            int r7 = r0 + 2
            r7 = r6[r7]
            if (r7 != r9) goto L7f
            int r7 = r0 + 3
            r7 = r6[r7]
            if (r7 != r10) goto L7f
            int r7 = r0 + 4
            r7 = r6[r7]
            if (r7 == r11) goto L2d
            goto L7f
        L2d:
            r7 = 26
            if (r2 != r3) goto L33
        L31:
            r8 = r7
            goto L38
        L33:
            int r0 = r0 + 6
            r8 = r6[r2]
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
            r9 = r6[r2]
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
            char r6 = (char) r8
            r5.f4541ch = r6
            r6 = 1
            return r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char, char, char, char, char):boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match10(long j10) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 12;
        if (i13 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i13)) - 9) != j10 || bArr[i12 + 11] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match11(long j10) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 13;
        if (i13 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i13)) - 10) != j10 || bArr[i12 + 11] != 34 || bArr[i12 + 12] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match12(long j10, byte b10) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 14;
        if (i13 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i13)) - 11) != j10 || bArr[i12 + 11] != b10 || bArr[i12 + 12] != 34 || bArr[i12 + 13] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match13(long j10, int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset + 15;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j12 = i13;
        if (unsafe.getLong(bArr, (j11 + j12) - 12) != j10 || unsafe.getInt(bArr, (j11 + j12) - 4) != i10) {
            return false;
        }
        while (true) {
            i11 = i13 + 1;
            i12 = bArr[i13] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i13 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match14(long j10, int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 16;
        if (i14 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j12 = i14;
        if (unsafe.getLong(bArr, (j11 + j12) - 13) != j10 || unsafe.getInt(bArr, (j11 + j12) - 5) != i10 || bArr[i13 + 15] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match15(long j10, int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 17;
        if (i14 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j12 = i14;
        if (unsafe.getLong(bArr, (j11 + j12) - 14) != j10 || unsafe.getInt(bArr, (j11 + j12) - 6) != i10 || bArr[i13 + 15] != 34 || bArr[i13 + 16] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match16(long j10, int i10, byte b10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 18;
        if (i14 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j12 = i14;
        if (unsafe.getLong(bArr, (j11 + j12) - 15) != j10 || unsafe.getInt(bArr, (j11 + j12) - 7) != i10 || bArr[i13 + 15] != b10 || bArr[i13 + 16] != 34 || bArr[i13 + 17] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match17(long j10, long j11) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset + 19;
        if (i12 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j13 = i12;
        if (unsafe.getLong(bArr, (j12 + j13) - 16) != j10 || unsafe.getLong(bArr, (j12 + j13) - 8) != j11) {
            return false;
        }
        while (true) {
            i10 = i12 + 1;
            i11 = bArr[i12] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i12 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match18(long j10, long j11) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 20;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j13 = i13;
        if (unsafe.getLong(bArr, (j12 + j13) - 17) != j10 || unsafe.getLong(bArr, (j12 + j13) - 9) != j11 || bArr[i12 + 19] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match19(long j10, long j11) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 21;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j13 = i13;
        if (unsafe.getLong(bArr, (j12 + j13) - 18) != j10 || unsafe.getLong(bArr, (j12 + j13) - 10) != j11 || bArr[i12 + 19] != 34 || bArr[i12 + 20] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match2() {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 4;
        if (i13 >= this.end || bArr[i12 + 3] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match20(long j10, long j11, byte b10) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 22;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j13 = i13;
        if (unsafe.getLong(bArr, (j12 + j13) - 19) != j10 || unsafe.getLong(bArr, (j12 + j13) - 11) != j11 || bArr[i12 + 19] != b10 || bArr[i12 + 20] != 34 || bArr[i12 + 21] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match21(long j10, long j11, int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset + 23;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j13 = i13;
        if (unsafe.getLong(bArr, (j12 + j13) - 20) != j10 || unsafe.getLong(bArr, (j12 + j13) - 12) != j11 || unsafe.getInt(bArr, (j12 + j13) - 4) != i10) {
            return false;
        }
        while (true) {
            i11 = i13 + 1;
            i12 = bArr[i13] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i13 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match22(long j10, long j11, int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 24;
        if (i14 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j13 = i14;
        if (unsafe.getLong(bArr, (j12 + j13) - 21) != j10 || unsafe.getLong(bArr, (j12 + j13) - 13) != j11 || unsafe.getInt(bArr, (j12 + j13) - 5) != i10 || bArr[i13 + 23] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match23(long j10, long j11, int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 25;
        if (i14 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j13 = i14;
        if (unsafe.getLong(bArr, (j12 + j13) - 22) != j10 || unsafe.getLong(bArr, (j12 + j13) - 14) != j11 || unsafe.getInt(bArr, (j12 + j13) - 6) != i10 || bArr[i13 + 23] != 34 || bArr[i13 + 24] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match24(long j10, long j11, int i10, byte b10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 26;
        if (i14 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j13 = i14;
        if (unsafe.getLong(bArr, (j12 + j13) - 23) != j10 || unsafe.getLong(bArr, (j12 + j13) - 15) != j11 || unsafe.getInt(bArr, (j12 + j13) - 7) != i10 || bArr[i13 + 23] != b10 || bArr[i13 + 24] != 34 || bArr[i13 + 25] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match25(long j10, long j11, long j12) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset + 27;
        if (i12 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j13 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j14 = i12;
        if (unsafe.getLong(bArr, (j13 + j14) - 24) != j10 || unsafe.getLong(bArr, (j13 + j14) - 16) != j11 || unsafe.getLong(bArr, (j13 + j14) - 8) != j12) {
            return false;
        }
        while (true) {
            i10 = i12 + 1;
            i11 = bArr[i12] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i12 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match26(long j10, long j11, long j12) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 28;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j13 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j14 = i13;
        if (unsafe.getLong(bArr, (j13 + j14) - 25) != j10 || unsafe.getLong(bArr, (j13 + j14) - 17) != j11 || unsafe.getLong(bArr, (j13 + j14) - 9) != j12 || bArr[i12 + 27] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match27(long j10, long j11, long j12) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 29;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j13 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j14 = i13;
        if (unsafe.getLong(bArr, (j13 + j14) - 26) != j10 || unsafe.getLong(bArr, (j13 + j14) - 18) != j11 || unsafe.getLong(bArr, (j13 + j14) - 10) != j12 || bArr[i12 + 27] != 34 || bArr[i12 + 28] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match28(long j10, long j11, long j12, byte b10) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 30;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j13 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j14 = i13;
        if (unsafe.getLong(bArr, (j13 + j14) - 27) != j10 || unsafe.getLong(bArr, (j13 + j14) - 19) != j11 || unsafe.getLong(bArr, (j13 + j14) - 11) != j12 || bArr[i12 + 27] != b10 || bArr[i12 + 28] != 34 || bArr[i12 + 29] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match29(long j10, long j11, long j12, int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset + 31;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j13 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j14 = i13;
        if (unsafe.getLong(bArr, (j13 + j14) - 28) != j10 || unsafe.getLong(bArr, (j13 + j14) - 20) != j11 || unsafe.getLong(bArr, (j13 + j14) - 12) != j12 || unsafe.getInt(bArr, (j13 + j14) - 4) != i10) {
            return false;
        }
        while (true) {
            i11 = i13 + 1;
            i12 = bArr[i13] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i13 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match3() {
        int i10;
        byte[] bArr = this.bytes;
        int i11 = this.offset;
        int i12 = i11 + 5;
        if (i12 >= this.end || bArr[i11 + 3] != 34 || bArr[i11 + 4] != 58) {
            return false;
        }
        while (true) {
            i10 = bArr[i12] & INPUT_CODE_ERROR;
            if (i10 > 32 || ((1 << i10) & 4294981377L) == 0) {
                break;
            }
            i12++;
        }
        this.offset = i12 + 1;
        this.f4541ch = (char) i10;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match30(long j10, long j11, long j12, int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 32;
        if (i14 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j13 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j14 = i14;
        if (unsafe.getLong(bArr, (j13 + j14) - 29) != j10 || unsafe.getLong(bArr, (j13 + j14) - 21) != j11 || unsafe.getLong(bArr, (j13 + j14) - 13) != j12 || unsafe.getInt(bArr, (j13 + j14) - 5) != i10 || bArr[i13 + 31] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match31(long j10, long j11, long j12, int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 33;
        if (i14 >= this.end || bArr[i13 + 31] != 34 || bArr[i13 + 32] != 58) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j13 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j14 = i14;
        if (unsafe.getLong(bArr, (j13 + j14) - 30) != j10 || unsafe.getLong(bArr, (j13 + j14) - 22) != j11 || unsafe.getLong(bArr, (j13 + j14) - 14) != j12 || unsafe.getInt(bArr, (j13 + j14) - 6) != i10) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match32(long j10, long j11, long j12, int i10, byte b10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 34;
        if (i14 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j13 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j14 = i14;
        if (unsafe.getLong(bArr, (j13 + j14) - 31) != j10 || unsafe.getLong(bArr, (j13 + j14) - 23) != j11 || unsafe.getLong(bArr, (j13 + j14) - 15) != j12 || unsafe.getInt(bArr, (j13 + j14) - 7) != i10 || bArr[i13 + 31] != b10 || bArr[i13 + 32] != 34 || bArr[i13 + 33] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match33(long j10, long j11, long j12, long j13) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset + 35;
        if (i12 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j14 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j15 = i12;
        if (unsafe.getLong(bArr, (j14 + j15) - 32) != j10 || unsafe.getLong(bArr, (j14 + j15) - 24) != j11 || unsafe.getLong(bArr, (j14 + j15) - 16) != j12 || unsafe.getLong(bArr, (j14 + j15) - 8) != j13) {
            return false;
        }
        while (true) {
            i10 = i12 + 1;
            i11 = bArr[i12] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i12 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match34(long j10, long j11, long j12, long j13) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 36;
        if (i13 >= this.end || bArr[i12 + 35] != 58) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j14 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j15 = i13;
        if (unsafe.getLong(bArr, (j14 + j15) - 33) != j10 || unsafe.getLong(bArr, (j14 + j15) - 25) != j11 || unsafe.getLong(bArr, (j14 + j15) - 17) != j12 || unsafe.getLong(bArr, (j14 + j15) - 9) != j13) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match35(long j10, long j11, long j12, long j13) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 37;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j14 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j15 = i13;
        if (unsafe.getLong(bArr, (j14 + j15) - 34) != j10 || unsafe.getLong(bArr, (j14 + j15) - 26) != j11 || unsafe.getLong(bArr, (j14 + j15) - 18) != j12 || unsafe.getLong(bArr, (j14 + j15) - 10) != j13 || bArr[i12 + 35] != 34 || bArr[i12 + 36] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match36(long j10, long j11, long j12, long j13, byte b10) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 38;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j14 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j15 = i13;
        if (unsafe.getLong(bArr, (j14 + j15) - 35) != j10 || unsafe.getLong(bArr, (j14 + j15) - 27) != j11 || unsafe.getLong(bArr, (j14 + j15) - 19) != j12 || unsafe.getLong(bArr, (j14 + j15) - 11) != j13 || bArr[i12 + 35] != b10 || bArr[i12 + 36] != 34 || bArr[i12 + 37] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match37(long j10, long j11, long j12, long j13, int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset + 39;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j14 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j15 = i13;
        if (unsafe.getLong(bArr, (j14 + j15) - 36) != j10 || unsafe.getLong(bArr, (j14 + j15) - 28) != j11 || unsafe.getLong(bArr, (j14 + j15) - 20) != j12 || unsafe.getLong(bArr, (j14 + j15) - 12) != j13 || unsafe.getInt(bArr, (j14 + j15) - 4) != i10) {
            return false;
        }
        while (true) {
            i11 = i13 + 1;
            i12 = bArr[i13] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i13 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match38(long j10, long j11, long j12, long j13, int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 40;
        if (i14 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j14 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j15 = i14;
        if (unsafe.getLong(bArr, (j14 + j15) - 37) != j10 || unsafe.getLong(bArr, (j14 + j15) - 29) != j11 || unsafe.getLong(bArr, (j14 + j15) - 21) != j12 || unsafe.getLong(bArr, (j14 + j15) - 13) != j13 || unsafe.getInt(bArr, (j14 + j15) - 5) != i10 || bArr[i13 + 39] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match39(long j10, long j11, long j12, long j13, int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 41;
        if (i14 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j14 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j15 = i14;
        if (unsafe.getLong(bArr, (j14 + j15) - 38) != j10 || unsafe.getLong(bArr, (j14 + j15) - 30) != j11 || unsafe.getLong(bArr, (j14 + j15) - 22) != j12 || unsafe.getLong(bArr, (j14 + j15) - 14) != j13 || unsafe.getInt(bArr, (j14 + j15) - 6) != i10 || bArr[i13 + 39] != 34 || bArr[i13 + 40] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match4(byte b10) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 6;
        if (i13 >= this.end || bArr[i12 + 3] != b10 || bArr[i12 + 4] != 34 || bArr[i12 + 5] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match40(long j10, long j11, long j12, long j13, int i10, byte b10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 42;
        if (i14 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j14 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j15 = i14;
        if (unsafe.getLong(bArr, (j14 + j15) - 39) != j10 || unsafe.getLong(bArr, (j14 + j15) - 31) != j11 || unsafe.getLong(bArr, (j14 + j15) - 23) != j12 || unsafe.getLong(bArr, (j14 + j15) - 15) != j13 || unsafe.getInt(bArr, (j14 + j15) - 7) != i10 || bArr[i13 + 39] != b10 || bArr[i13 + 40] != 34 || bArr[i13 + 41] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match41(long j10, long j11, long j12, long j13, long j14) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset + 43;
        if (i12 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j15 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j16 = i12;
        if (unsafe.getLong(bArr, (j15 + j16) - 40) != j10 || unsafe.getLong(bArr, (j15 + j16) - 32) != j11 || unsafe.getLong(bArr, (j15 + j16) - 24) != j12 || unsafe.getLong(bArr, (j15 + j16) - 16) != j13 || unsafe.getLong(bArr, (j15 + j16) - 8) != j14) {
            return false;
        }
        while (true) {
            i10 = i12 + 1;
            i11 = bArr[i12] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i12 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match42(long j10, long j11, long j12, long j13, long j14) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 44;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j15 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j16 = i13;
        if (unsafe.getLong(bArr, (j15 + j16) - 41) != j10 || unsafe.getLong(bArr, (j15 + j16) - 33) != j11 || unsafe.getLong(bArr, (j15 + j16) - 25) != j12 || unsafe.getLong(bArr, (j15 + j16) - 17) != j13 || unsafe.getLong(bArr, (j15 + j16) - 9) != j14 || bArr[i12 + 43] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match43(long j10, long j11, long j12, long j13, long j14) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = i12 + 45;
        if (i13 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j15 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j16 = i13;
        if (unsafe.getLong(bArr, (j15 + j16) - 42) != j10 || unsafe.getLong(bArr, (j15 + j16) - 34) != j11 || unsafe.getLong(bArr, (j15 + j16) - 26) != j12 || unsafe.getLong(bArr, (j15 + j16) - 18) != j13 || unsafe.getLong(bArr, (j15 + j16) - 10) != j14 || bArr[i12 + 43] != 34 || bArr[i12 + 44] != 58) {
            return false;
        }
        while (true) {
            i10 = i13 + 1;
            i11 = bArr[i13] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i13 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match5(int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset + 7;
        if (i13 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i13)) - 4) != i10) {
            return false;
        }
        while (true) {
            i11 = i13 + 1;
            i12 = bArr[i13] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i13 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match6(int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 8;
        if (i14 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i14)) - 5) != i10 || bArr[i13 + 7] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match7(int i10) {
        int i11;
        int i12;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = i13 + 9;
        if (i14 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i14)) - 6) != i10 || bArr[i13 + 7] != 34 || bArr[i13 + 8] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match8(int i10, byte b10) {
        int i11;
        int i12;
        int i13 = this.offset;
        int i14 = i13 + 10;
        byte[] bArr = this.bytes;
        if (i14 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i14)) - 7) != i10 || bArr[i13 + 7] != b10 || bArr[i13 + 8] != 34 || bArr[i13 + 9] != 58) {
            return false;
        }
        while (true) {
            i11 = i14 + 1;
            i12 = bArr[i14] & INPUT_CODE_ERROR;
            if (i12 > 32 || ((1 << i12) & 4294981377L) == 0) {
                break;
            }
            i14 = i11;
        }
        this.offset = i11;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match9(long j10) {
        int i10;
        int i11;
        byte[] bArr = this.bytes;
        int i12 = this.offset + 11;
        if (i12 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i12)) - 8) != j10) {
            return false;
        }
        while (true) {
            i10 = i12 + 1;
            i11 = bArr[i12] & INPUT_CODE_ERROR;
            if (i11 > 32 || ((1 << i11) & 4294981377L) == 0) {
                break;
            }
            i12 = i10;
        }
        this.offset = i10;
        this.f4541ch = (char) i11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match0() {
        int i10;
        byte[] bArr = this.bytes;
        int i11 = this.offset + 7;
        if (i11 == this.end) {
            this.f4541ch = (char) 26;
            return false;
        }
        while (true) {
            i10 = bArr[i11] & INPUT_CODE_ERROR;
            if (i10 > 32 || ((1 << i10) & 4294981377L) == 0) {
                break;
            }
            i11++;
        }
        this.offset = i11 + 1;
        this.f4541ch = (char) i10;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match1() {
        int i10;
        byte[] bArr = this.bytes;
        int i11 = this.offset;
        int i12 = i11 + 8;
        if (i12 >= this.end || bArr[i11 + 7] != 58) {
            return false;
        }
        while (true) {
            i10 = bArr[i12] & INPUT_CODE_ERROR;
            if (i10 > 32 || ((1 << i10) & 4294981377L) == 0) {
                break;
            }
            i12++;
        }
        this.offset = i12 + 1;
        this.f4541ch = (char) i10;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match2() {
        int i10;
        byte[] bArr = this.bytes;
        int i11 = this.offset;
        int i12 = i11 + 9;
        if (i12 >= this.end || bArr[i11 + 7] != 34 || bArr[i11 + 8] != 58) {
            return false;
        }
        while (true) {
            i10 = bArr[i12] & INPUT_CODE_ERROR;
            if (i10 > 32 || ((1 << i10) & 4294981377L) == 0) {
                break;
            }
            i12++;
        }
        this.offset = i12 + 1;
        this.f4541ch = (char) i10;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfNull() {
        int i10 = this.offset;
        if (this.f4541ch != 'n' || i10 + 2 >= this.end || this.bytes[i10] != 117) {
            return false;
        }
        readNull();
        return true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x006c -> B:33:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:36:0x0061
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
            char r1 = r0.f4541ch
            int r2 = r0.end
            int r3 = r0.offset
            byte[] r4 = r0.bytes
            r5 = 110(0x6e, float:1.54E-43)
            r6 = 0
            r7 = 1
            if (r1 != r5) goto L29
            int r5 = r3 + 2
            if (r5 >= r2) goto L29
            r8 = r4[r3]
            r9 = 117(0x75, float:1.64E-43)
            if (r8 != r9) goto L29
            int r8 = r3 + 1
            r8 = r4[r8]
            r9 = 108(0x6c, float:1.51E-43)
            if (r8 != r9) goto L29
            r5 = r4[r5]
            if (r5 != r9) goto L29
            int r3 = r3 + 3
            goto L4b
        L29:
            r5 = 34
            if (r1 == r5) goto L33
            r5 = 39
            if (r1 != r5) goto L32
            goto L33
        L32:
            return r6
        L33:
            if (r3 >= r2) goto L3b
            r5 = r4[r3]
            if (r5 != r1) goto L3b
            int r3 = r3 + r7
            goto L4b
        L3b:
            int r5 = r3 + 4
            if (r5 >= r2) goto Lae
            boolean r8 = com.alibaba.fastjson2.util.IOUtils.isNULL(r4, r3)
            if (r8 == 0) goto Lae
            r5 = r4[r5]
            if (r5 != r1) goto Lae
            int r3 = r3 + 5
        L4b:
            r1 = 26
            if (r3 != r2) goto L52
            r5 = r3
        L50:
            r3 = r1
            goto L56
        L52:
            int r5 = r3 + 1
            r3 = r4[r3]
        L56:
            r8 = 0
            r10 = 4294981377(0x100003701, double:2.122002748E-314)
            r12 = 1
            r14 = 32
            if (r3 < 0) goto L79
            if (r3 > r14) goto L79
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r15 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r15 == 0) goto L79
            if (r5 != r2) goto L6f
            goto L50
        L6f:
            int r3 = r5 + 1
            r5 = r4[r5]
            r17 = r5
            r5 = r3
            r3 = r17
            goto L56
        L79:
            r15 = 44
            if (r3 != r15) goto L7e
            r6 = r7
        L7e:
            r0.comma = r6
            if (r6 == 0) goto L8f
            if (r5 != r2) goto L86
        L84:
            r3 = r1
            goto L8f
        L86:
            int r3 = r5 + 1
            r5 = r4[r5]
        L8a:
            r17 = r5
            r5 = r3
            r3 = r17
        L8f:
            if (r3 < 0) goto La2
            if (r3 > r14) goto La2
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r6 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r6 == 0) goto La2
            if (r5 != r2) goto L9d
            goto L84
        L9d:
            int r3 = r5 + 1
            r5 = r4[r5]
            goto L8a
        La2:
            if (r3 >= 0) goto La8
            r0.char_utf8(r3, r5)
            return r7
        La8:
            r0.offset = r5
            char r1 = (char) r3
            r0.f4541ch = r1
            return r7
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfNullOrEmptyString():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002f -> B:9:0x0015). Please report as a decompilation issue!!! */
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
    public final boolean nextIfObjectEnd() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.f4541ch
            byte[] r2 = r0.bytes
            int r3 = r0.offset
            int r4 = r0.end
            r5 = 125(0x7d, float:1.75E-43)
            if (r1 == r5) goto L10
            r1 = 0
            return r1
        L10:
            r1 = 26
            if (r3 != r4) goto L17
            r5 = r3
        L15:
            r3 = r1
            goto L1b
        L17:
            int r5 = r3 + 1
            r3 = r2[r3]
        L1b:
            r6 = 0
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r12 = 32
            if (r3 > r12) goto L3c
            long r13 = r10 << r3
            long r13 = r13 & r8
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 == 0) goto L3c
            if (r5 != r4) goto L32
            goto L15
        L32:
            int r3 = r5 + 1
            r5 = r2[r5]
            r17 = r5
            r5 = r3
            r3 = r17
            goto L1b
        L3c:
            r13 = 44
            r14 = 1
            if (r3 != r13) goto L63
            r0.comma = r14
            if (r5 != r4) goto L48
            r3 = r5
            r5 = r1
            goto L4c
        L48:
            int r3 = r5 + 1
            r5 = r2[r5]
        L4c:
            r17 = r5
            r5 = r3
            r3 = r17
        L51:
            if (r3 > r12) goto L63
            long r15 = r10 << r3
            long r15 = r15 & r8
            int r13 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r13 == 0) goto L63
            if (r5 != r4) goto L5e
            r3 = r1
            goto L51
        L5e:
            int r3 = r5 + 1
            r5 = r2[r5]
            goto L4c
        L63:
            if (r3 >= 0) goto L69
            r0.char_utf8(r3, r5)
            return r14
        L69:
            char r1 = (char) r3
            r0.f4541ch = r1
            r0.offset = r5
            r1 = 47
            if (r3 != r1) goto L75
            r0.skipComment()
        L75:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfObjectEnd():boolean");
    }

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
            char r0 = r9.f4541ch
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            byte[] r0 = r9.bytes
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
            r1 = r0[r1]
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
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L19
        L39:
            r0 = 1
            if (r1 >= 0) goto L40
            r9.char_utf8(r1, r2)
            return r0
        L40:
            char r3 = (char) r1
            r9.f4541ch = r3
            r9.offset = r2
            r2 = 47
            if (r1 != r2) goto L4c
            r9.skipComment()
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfObjectStart():boolean");
    }

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
    public final boolean nextIfSet() {
        /*
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            char r2 = r10.f4541ch
            r3 = 83
            if (r2 != r3) goto L50
            int r2 = r1 + 1
            int r3 = r10.end
            if (r2 >= r3) goto L50
            r4 = r0[r1]
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L50
            r2 = r0[r2]
            r4 = 116(0x74, float:1.63E-43)
            if (r2 != r4) goto L50
            int r2 = r1 + 2
            r4 = 26
            if (r2 != r3) goto L25
            r1 = r2
        L23:
            r2 = r4
            goto L29
        L25:
            int r1 = r1 + 3
            r2 = r0[r2]
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
            r1 = r0[r1]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L29
        L49:
            r10.offset = r1
            char r0 = (char) r2
            r10.f4541ch = r0
            r0 = 1
            return r0
        L50:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfSet():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match10(long j10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 11;
        if (i11 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11)) - 8) != j10) {
            return false;
        }
        int i12 = bArr[i11] & INPUT_CODE_ERROR;
        if (i12 != 44 && i12 != 125 && i12 != 93) {
            return false;
        }
        if (i12 == 44) {
            this.comma = true;
            i11 = i10 + 12;
            i12 = i11 == this.end ? 26 : bArr[i11] & INPUT_CODE_ERROR;
        }
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i11++;
            i12 = bArr[i11] & INPUT_CODE_ERROR;
        }
        this.offset = i11 + 1;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match11(long j10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 12;
        if (i11 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11)) - 9) != j10 || bArr[i10 + 11] != 34) {
            return false;
        }
        int i12 = bArr[i11] & INPUT_CODE_ERROR;
        if (i12 != 44 && i12 != 125 && i12 != 93) {
            return false;
        }
        if (i12 == 44) {
            this.comma = true;
            i11 = i10 + 13;
            i12 = i11 == this.end ? 26 : bArr[i11] & INPUT_CODE_ERROR;
        }
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i11++;
            i12 = bArr[i11] & INPUT_CODE_ERROR;
        }
        this.offset = i11 + 1;
        this.f4541ch = (char) i12;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match2() {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 3;
        int i12 = this.end;
        if (i11 >= i12) {
            return false;
        }
        int i13 = i10 + 4;
        int i14 = bArr[i11] & INPUT_CODE_ERROR;
        if (i14 != 44 && i14 != 125 && i14 != 93) {
            return false;
        }
        if (i14 == 44) {
            this.comma = true;
            if (i13 == i12) {
                i14 = 26;
            } else {
                int i15 = i10 + 5;
                i14 = bArr[i13] & INPUT_CODE_ERROR;
                i13 = i15;
            }
        }
        while (i14 <= 32 && ((1 << i14) & 4294981377L) != 0) {
            int i16 = i13 + 1;
            i14 = bArr[i13] & INPUT_CODE_ERROR;
            i13 = i16;
        }
        this.offset = i13;
        this.f4541ch = (char) i14;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match3() {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 4;
        int i12 = this.end;
        if (i11 >= i12 || bArr[i10 + 3] != 34) {
            return false;
        }
        int i13 = bArr[i11] & INPUT_CODE_ERROR;
        if (i13 != 44 && i13 != 125 && i13 != 93) {
            return false;
        }
        if (i13 == 44) {
            this.comma = true;
            i11 = i10 + 5;
            i13 = i11 == i12 ? 26 : bArr[i11] & INPUT_CODE_ERROR;
        }
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i11++;
            i13 = bArr[i11] & INPUT_CODE_ERROR;
        }
        this.offset = i11 + 1;
        this.f4541ch = (char) i13;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match4(byte b10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 5;
        int i12 = this.end;
        boolean z10 = false;
        if (i11 >= i12) {
            return false;
        }
        if (bArr[i10 + 3] == b10 && bArr[i10 + 4] == 34) {
            int i13 = bArr[i11] & INPUT_CODE_ERROR;
            if (i13 != 44 && i13 != 125 && i13 != 93) {
                return false;
            }
            z10 = true;
            if (i13 == 44) {
                this.comma = true;
                i11 = i10 + 6;
                i13 = i11 == i12 ? 26 : bArr[i11] & INPUT_CODE_ERROR;
            }
            while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
                i11++;
                i13 = bArr[i11] & INPUT_CODE_ERROR;
            }
            this.offset = i11 + 1;
            this.f4541ch = (char) i13;
        }
        return z10;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match5(byte b10, byte b11) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 6;
        int i12 = this.end;
        boolean z10 = false;
        if (i11 >= i12) {
            return false;
        }
        if (bArr[i10 + 3] == b10 && bArr[i10 + 4] == b11 && bArr[i10 + 5] == 34) {
            int i13 = bArr[i11] & INPUT_CODE_ERROR;
            if (i13 != 44 && i13 != 125 && i13 != 93) {
                return false;
            }
            z10 = true;
            if (i13 == 44) {
                this.comma = true;
                i11 = i10 + 7;
                i13 = i11 == i12 ? 26 : bArr[i11] & INPUT_CODE_ERROR;
            }
            while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
                i11++;
                i13 = bArr[i11] & INPUT_CODE_ERROR;
            }
            this.offset = i11 + 1;
            this.f4541ch = (char) i13;
        }
        return z10;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match6(int i10) {
        byte[] bArr = this.bytes;
        int i11 = this.offset;
        int i12 = i11 + 7;
        if (i12 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i12)) - 4) != i10) {
            return false;
        }
        int i13 = bArr[i12] & INPUT_CODE_ERROR;
        if (i13 != 44 && i13 != 125 && i13 != 93) {
            return false;
        }
        if (i13 == 44) {
            this.comma = true;
            i12 = i11 + 8;
            i13 = i12 == this.end ? 26 : bArr[i12] & INPUT_CODE_ERROR;
        }
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i12++;
            i13 = bArr[i12] & INPUT_CODE_ERROR;
        }
        this.offset = i12 + 1;
        this.f4541ch = (char) i13;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match7(int i10) {
        byte[] bArr = this.bytes;
        int i11 = this.offset;
        int i12 = i11 + 8;
        boolean z10 = false;
        if (i12 >= this.end) {
            return false;
        }
        if (JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i12)) - 5) == i10 && bArr[i11 + 7] == 34) {
            int i13 = bArr[i12] & INPUT_CODE_ERROR;
            if (i13 != 44 && i13 != 125 && i13 != 93) {
                return false;
            }
            z10 = true;
            if (i13 == 44) {
                this.comma = true;
                i12 = i11 + 9;
                i13 = i12 == this.end ? 26 : bArr[i12] & INPUT_CODE_ERROR;
            }
            while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
                i12++;
                i13 = bArr[i12] & INPUT_CODE_ERROR;
            }
            this.offset = i12 + 1;
            this.f4541ch = (char) i13;
        }
        return z10;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match8(int i10, byte b10) {
        byte[] bArr = this.bytes;
        int i11 = this.offset;
        int i12 = i11 + 9;
        if (i12 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i12)) - 6) != i10 || bArr[i11 + 7] != b10 || bArr[i11 + 8] != 34) {
            return false;
        }
        int i13 = bArr[i12] & INPUT_CODE_ERROR;
        if (i13 != 44 && i13 != 125 && i13 != 93) {
            return false;
        }
        if (i13 == 44) {
            this.comma = true;
            i12 = i11 + 10;
            i13 = i12 == this.end ? 26 : bArr[i12] & INPUT_CODE_ERROR;
        }
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i12++;
            i13 = bArr[i12] & INPUT_CODE_ERROR;
        }
        this.offset = i12 + 1;
        this.f4541ch = (char) i13;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match9(int i10, byte b10, byte b11) {
        byte[] bArr = this.bytes;
        int i11 = this.offset;
        int i12 = i11 + 10;
        if (i12 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i12)) - 7) != i10 || bArr[i11 + 7] != b10 || bArr[i11 + 8] != b11 || bArr[i11 + 9] != 34) {
            return false;
        }
        int i13 = bArr[i12] & INPUT_CODE_ERROR;
        if (i13 != 44 && i13 != 125 && i13 != 93) {
            return false;
        }
        if (i13 == 44) {
            this.comma = true;
            i12 = i11 + 11;
            i13 = i12 == this.end ? 26 : bArr[i12] & INPUT_CODE_ERROR;
        }
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i12++;
            i13 = bArr[i12] & INPUT_CODE_ERROR;
        }
        this.offset = i12 + 1;
        this.f4541ch = (char) i13;
        return true;
    }

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
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r9.end
            r3 = 26
            if (r1 < r2) goto Ld
            r2 = r1
        Lb:
            r1 = r3
            goto L11
        Ld:
            int r2 = r1 + 1
            r1 = r0[r1]
        L11:
            r4 = 32
            if (r1 > r4) goto L31
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            int r1 = r9.end
            if (r2 != r1) goto L29
            goto Lb
        L29:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L11
        L31:
            if (r1 >= 0) goto L37
            r9.char_utf8(r1, r2)
            return
        L37:
            r9.offset = r2
            char r0 = (char) r1
            r9.f4541ch = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextWithoutComment():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final byte[] readBase64() {
        byte[] bArrDecode;
        int i10;
        byte b10;
        int i11;
        byte b11;
        int iIndexOfChar;
        int i12;
        int iIndexOfChar2;
        byte[] bArr = this.bytes;
        int i13 = this.offset;
        int i14 = this.end;
        int iIndexOfQuote = IOUtils.indexOfQuote(bArr, this.f4541ch, i13, i14);
        if (iIndexOfQuote == -1) {
            throw error("invalid escape character EOI");
        }
        if (indexOfSlash(this, bArr, i13, i14) != -1) {
            throw error("invalid base64 string");
        }
        if (iIndexOfQuote != i13) {
            if (IOUtils.regionMatches(bArr, i13, "data:image/") && (iIndexOfChar = IOUtils.indexOfChar(bArr, 59, 12, iIndexOfQuote)) != -1 && (iIndexOfChar2 = IOUtils.indexOfChar(bArr, 44, (i12 = iIndexOfChar + 1), iIndexOfQuote)) != -1 && IOUtils.regionMatches(bArr, i12, "base64")) {
                i13 = iIndexOfChar2 + 1;
            }
            bArrDecode = Base64.getDecoder().decode(Arrays.copyOfRange(bArr, i13, iIndexOfQuote));
        } else {
            bArrDecode = new byte[0];
        }
        int i15 = iIndexOfQuote + 1;
        if (i15 == i14) {
            i10 = i15;
            b10 = 26;
        } else {
            i10 = iIndexOfQuote + 2;
            b10 = (char) bArr[i15];
        }
        boolean z10 = b10 == 44;
        this.comma = z10;
        if (z10) {
            if (i10 == i14) {
                i11 = i10;
                b11 = 26;
            } else {
                i11 = i10 + 1;
                b11 = bArr[i10];
            }
            loop0: while (true) {
                int i16 = i11;
                b10 = b11;
                i10 = i16;
                while (b10 <= 32 && ((1 << b10) & 4294981377L) != 0) {
                    if (i10 == i14) {
                        b10 = 26;
                    }
                }
                i11 = i10 + 1;
                b11 = bArr[i10];
            }
        }
        this.f4541ch = (char) b10;
        this.offset = i10;
        return bArrDecode;
    }

    /* JADX WARN: Path cross not found for [B:190:0x0279, B:237:?], limit reached: 240 */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090 A[LOOP:0: B:25:0x005a->B:39:0x0090, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:199:0x029a -> B:191:0x027b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:196:0x028f
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.math.BigDecimal readBigDecimal() {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readBigDecimal():java.math.BigDecimal");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0072 -> B:33:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:36:0x0068
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean readBoolValue() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.end
            byte[] r2 = r0.bytes
            int r3 = r0.offset
            char r4 = r0.f4541ch
            r5 = 116(0x74, float:1.63E-43)
            r6 = 1
            r7 = 0
            if (r4 != r5) goto L2d
            int r5 = r3 + 2
            int r8 = r2.length
            if (r5 >= r8) goto L2d
            r8 = r2[r3]
            r9 = 114(0x72, float:1.6E-43)
            if (r8 != r9) goto L2d
            int r8 = r3 + 1
            r8 = r2[r8]
            r9 = 117(0x75, float:1.64E-43)
            if (r8 != r9) goto L2d
            r5 = r2[r5]
            r8 = 101(0x65, float:1.42E-43)
            if (r5 != r8) goto L2d
            int r3 = r3 + 3
        L2b:
            r4 = r6
            goto L52
        L2d:
            r5 = 102(0x66, float:1.43E-43)
            if (r4 != r5) goto L3f
            int r5 = r3 + 3
            if (r5 >= r1) goto L3f
            boolean r5 = com.alibaba.fastjson2.util.IOUtils.isALSE(r2, r3)
            if (r5 == 0) goto L3f
            int r3 = r3 + 4
        L3d:
            r4 = r7
            goto L52
        L3f:
            r5 = 49
            if (r4 == r5) goto L47
            r8 = 48
            if (r4 != r8) goto Lae
        L47:
            if (r3 >= r1) goto Lae
            boolean r8 = com.alibaba.fastjson2.util.IOUtils.isDigit(r4)
            if (r8 != 0) goto Lae
            if (r4 != r5) goto L3d
            goto L2b
        L52:
            if (r3 != r1) goto L58
            r8 = r3
        L55:
            r3 = 26
            goto L5d
        L58:
            int r8 = r3 + 1
            r3 = r2[r3]
            char r3 = (char) r3
        L5d:
            r9 = 0
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r15 = 32
            if (r3 > r15) goto L7f
            long r16 = r13 << r3
            long r16 = r16 & r11
            int r16 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r16 == 0) goto L7f
            if (r8 < r1) goto L75
            goto L55
        L75:
            int r3 = r8 + 1
            r8 = r2[r8]
            r18 = r8
            r8 = r3
            r3 = r18
            goto L5d
        L7f:
            r5 = 44
            if (r3 != r5) goto L84
            goto L85
        L84:
            r6 = r7
        L85:
            r0.comma = r6
            if (r6 == 0) goto La8
            if (r8 < r1) goto L8e
            r5 = 26
            goto L93
        L8e:
            int r3 = r8 + 1
            r5 = r2[r8]
            goto La6
        L93:
            r3 = r5
        L94:
            if (r3 > r15) goto La8
            long r5 = r13 << r3
            long r5 = r5 & r11
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 == 0) goto La8
            if (r8 < r1) goto La2
            r3 = 26
            goto L94
        La2:
            int r3 = r8 + 1
            r5 = r2[r8]
        La6:
            r8 = r3
            goto L93
        La8:
            r0.offset = r8
            char r1 = (char) r3
            r0.f4541ch = r1
            return r4
        Lae:
            boolean r1 = r0.readBoolValue0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readBoolValue():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0204, code lost:
    
        r14 = -r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fe  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double readDoubleValue() {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readDoubleValue():double");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0091 -> B:38:0x007c). Please report as a decompilation issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String readFieldName() {
        /*
            Method dump skipped, instruction units count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFieldName():java.lang.String");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x009a -> B:40:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00be -> B:53:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:43:0x0090
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
    public long readFieldNameHashCode(int r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFieldNameHashCode(int, int, int):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x024b, code lost:
    
        r3 = r28.nameBegin;
        r12 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readFieldNameHashCode0() {
        /*
            Method dump skipped, instruction units count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFieldNameHashCode0():long");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x009a -> B:40:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00be -> B:53:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:43:0x0090
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
    public long readFieldNameHashCodeE(int r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFieldNameHashCodeE(int, int, int):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0130  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readFieldNameHashCodeUnquote() {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFieldNameHashCodeUnquote():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0204, code lost:
    
        r14 = -r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fe  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float readFloatValue() {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFloatValue():float");
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] readHex() {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readHex():byte[]");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean readIfNull() {
        int i10;
        byte b10;
        byte[] bArr = this.bytes;
        char c10 = this.f4541ch;
        int i11 = this.offset;
        if (c10 != 'n' || bArr[i11] != 117 || bArr[i11 + 1] != 108 || bArr[i11 + 2] != 108) {
            return false;
        }
        int i12 = i11 + 3;
        byte b11 = i12 == this.end ? (byte) 26 : (char) bArr[i12];
        int i13 = i11 + 4;
        while (b11 <= 32 && ((1 << b11) & 4294981377L) != 0) {
            if (i13 == this.end) {
                b11 = 26;
            } else {
                int i14 = i13 + 1;
                byte b12 = bArr[i13];
                i13 = i14;
                b11 = b12;
            }
        }
        boolean z10 = b11 == 44;
        this.comma = z10;
        if (z10) {
            if (i13 == this.end) {
                i10 = i13;
                b10 = 26;
            } else {
                i10 = i13 + 1;
                b10 = (char) bArr[i13];
            }
            loop1: while (true) {
                byte b13 = b10;
                i13 = i10;
                b11 = b13;
                while (b11 <= 32 && ((1 << b11) & 4294981377L) != 0) {
                    if (i13 == this.end) {
                        b11 = 26;
                    }
                }
                i10 = i13 + 1;
                b10 = bArr[i13];
            }
        }
        this.offset = i13;
        this.f4541ch = (char) b11;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final Integer readInt32() {
        char c10 = this.f4541ch;
        if ((c10 == '\"' || c10 == '\'' || c10 == 'n') && nextIfNullOrEmptyString()) {
            return null;
        }
        return Integer.valueOf(readInt32Value());
    }

    /* JADX WARN: Path cross not found for [B:73:0x00b5, B:117:?], limit reached: 119 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00d3 -> B:74:0x00b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x00c9
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
    public final int readInt32Value() {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readInt32Value():int");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final Long readInt64() {
        char c10 = this.f4541ch;
        if ((c10 == '\"' || c10 == '\'' || c10 == 'n') && nextIfNullOrEmptyString()) {
            return null;
        }
        return Long.valueOf(readInt64Value());
    }

    /* JADX WARN: Path cross not found for [B:76:0x00d3, B:120:?], limit reached: 122 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x00ee -> B:77:0x00d5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:81:0x00e4
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
    public final long readInt64Value() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readInt64Value():long");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate() {
        LocalDate localDateLocalDateYMD;
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte[] bArr = this.bytes;
        int i12 = this.offset;
        int i13 = this.end;
        char c10 = this.f4541ch;
        if ((c10 == '\"' || c10 == '\'') && !this.context.formatComplex) {
            int i14 = i12 + 10;
            if (i14 < bArr.length && i14 < i13 && (localDateLocalDateYMD = DateUtils.localDateYMD(bArr, i12)) != null && bArr[i14] == c10) {
                int i15 = i12 + 11;
                if (i15 >= i13) {
                    i10 = i15;
                    b10 = 26;
                } else {
                    i10 = i12 + 12;
                    b10 = bArr[i15];
                }
                boolean z10 = b10 == 44;
                this.comma = z10;
                if (z10) {
                    if (i10 == i13) {
                        i11 = i10;
                        b11 = 26;
                    } else {
                        i11 = i10 + 1;
                        b11 = (char) bArr[i10];
                    }
                    loop0: while (true) {
                        int i16 = i11;
                        b10 = b11;
                        i10 = i16;
                        while (b10 <= 32 && ((1 << b10) & 4294981377L) != 0) {
                            if (i10 == i13) {
                                b10 = 26;
                            }
                        }
                        i11 = i10 + 1;
                        b11 = bArr[i10];
                    }
                }
                if (b10 < 0) {
                    char_utf8(b10, i10);
                    return localDateLocalDateYMD;
                }
                this.offset = i10;
                this.f4541ch = (char) b10;
                return localDateLocalDateYMD;
            }
            LocalDate localDate0 = readLocalDate0(i12, bArr, c10);
            if (localDate0 != null) {
                return localDate0;
            }
        }
        return super.readLocalDate();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate10() {
        if (!isString()) {
            C1569c.m6258a("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDate10 = DateUtils.parseLocalDate10(this.bytes, this.offset);
            if (localDate10 == null) {
                return null;
            }
            this.offset += 11;
            next();
            boolean z10 = this.f4541ch == ',';
            this.comma = z10;
            if (z10) {
                next();
            }
            return localDate10;
        } catch (DateTimeException e10) {
            C1565a.m6255a(info("read date error"), e10);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate11() {
        if (!isString()) {
            C1569c.m6258a("localDate only support string input");
            return null;
        }
        LocalDate localDate11 = DateUtils.parseLocalDate11(this.bytes, this.offset);
        if (localDate11 == null) {
            return null;
        }
        this.offset += 11;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localDate11;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate8() {
        if (!isString()) {
            C1569c.m6258a("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDate8 = DateUtils.parseLocalDate8(this.bytes, this.offset);
            this.offset += 9;
            next();
            boolean z10 = this.f4541ch == ',';
            this.comma = z10;
            if (z10) {
                next();
            }
            return localDate8;
        } catch (DateTimeException e10) {
            C1565a.m6255a(info("read date error"), e10);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate9() {
        if (!isString()) {
            C1569c.m6258a("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDate9 = DateUtils.parseLocalDate9(this.bytes, this.offset);
            this.offset += 10;
            next();
            boolean z10 = this.f4541ch == ',';
            this.comma = z10;
            if (z10) {
                next();
            }
            return localDate9;
        } catch (DateTimeException e10) {
            C1565a.m6255a(info("read date error"), e10);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime12() {
        if (!isString()) {
            C1569c.m6258a("date only support string input");
            return null;
        }
        LocalDateTime localDateTime12 = DateUtils.parseLocalDateTime12(this.bytes, this.offset);
        if (localDateTime12 == null) {
            return null;
        }
        this.offset += 13;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localDateTime12;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime14() {
        if (!isString()) {
            C1569c.m6258a("date only support string input");
            return null;
        }
        LocalDateTime localDateTime14 = DateUtils.parseLocalDateTime14(this.bytes, this.offset);
        if (localDateTime14 == null) {
            return null;
        }
        this.offset += 15;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localDateTime14;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime16() {
        if (!isString()) {
            C1569c.m6258a("date only support string input");
            return null;
        }
        LocalDateTime localDateTime16 = DateUtils.parseLocalDateTime16(this.bytes, this.offset);
        if (localDateTime16 == null) {
            return null;
        }
        this.offset += 17;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localDateTime16;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime17() {
        if (!isString()) {
            C1569c.m6258a("date only support string input");
            return null;
        }
        LocalDateTime localDateTime17 = DateUtils.parseLocalDateTime17(this.bytes, this.offset);
        if (localDateTime17 == null) {
            return null;
        }
        this.offset += 18;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localDateTime17;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime18() {
        if (!isString()) {
            C1569c.m6258a("date only support string input");
            return null;
        }
        LocalDateTime localDateTime18 = DateUtils.parseLocalDateTime18(this.bytes, this.offset);
        this.offset += 19;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localDateTime18;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime19() {
        if (!isString()) {
            C1569c.m6258a("date only support string input");
            return null;
        }
        LocalDateTime localDateTime19 = DateUtils.parseLocalDateTime19(this.bytes, this.offset);
        if (localDateTime19 == null) {
            return null;
        }
        this.offset += 20;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localDateTime19;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTime20() {
        if (!isString()) {
            C1569c.m6258a("date only support string input");
            return null;
        }
        LocalDateTime localDateTime20 = DateUtils.parseLocalDateTime20(this.bytes, this.offset);
        if (localDateTime20 == null) {
            return null;
        }
        this.offset += 21;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localDateTime20;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDateTime readLocalDateTimeX(int i10) {
        if (!isString()) {
            C1569c.m6258a("date only support string input");
            return null;
        }
        byte[] bArr = this.bytes;
        int i11 = this.offset;
        LocalDateTime localDateTime = bArr[(i11 + i10) - 1] == 90 ? DateUtils.parseZonedDateTime(bArr, i11, i10).toInstant().atZone(this.context.getZoneId()).toLocalDateTime() : DateUtils.parseLocalDateTimeX(bArr, i11, i10);
        if (localDateTime == 0) {
            return null;
        }
        this.offset += i10 + 1;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localDateTime;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime10() {
        if (!isString()) {
            C1569c.m6258a("localTime only support string input");
            return null;
        }
        LocalTime localTime10 = DateUtils.parseLocalTime10(this.bytes, this.offset);
        if (localTime10 == null) {
            return null;
        }
        this.offset += 11;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localTime10;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime11() {
        if (!isString()) {
            C1569c.m6258a("localTime only support string input");
            return null;
        }
        LocalTime localTime11 = DateUtils.parseLocalTime11(this.bytes, this.offset);
        if (localTime11 == null) {
            return null;
        }
        this.offset += 12;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localTime11;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime12() {
        if (!isString()) {
            C1569c.m6258a("localTime only support string input");
            return null;
        }
        LocalTime localTime12 = DateUtils.parseLocalTime12(this.bytes, this.offset);
        if (localTime12 == null) {
            return null;
        }
        this.offset += 13;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localTime12;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime15() {
        if (!isString()) {
            C1569c.m6258a("localTime only support string input");
            return null;
        }
        LocalTime localTime15 = DateUtils.parseLocalTime15(this.bytes, this.offset);
        if (localTime15 == null) {
            return null;
        }
        this.offset += 16;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localTime15;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime18() {
        if (!isString()) {
            C1569c.m6258a("localTime only support string input");
            return null;
        }
        LocalTime localTime18 = DateUtils.parseLocalTime18(this.bytes, this.offset);
        if (localTime18 == null) {
            return null;
        }
        this.offset += 19;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localTime18;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime5() {
        char c10 = this.f4541ch;
        if (c10 != '\"' && c10 != '\'') {
            C1569c.m6258a("localTime only support string input");
            return null;
        }
        LocalTime localTime5 = DateUtils.parseLocalTime5(this.bytes, this.offset);
        if (localTime5 == null) {
            return null;
        }
        this.offset += 6;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localTime5;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime6() {
        char c10 = this.f4541ch;
        if (c10 != '\"' && c10 != '\'') {
            C1569c.m6258a("localTime only support string input");
            return null;
        }
        LocalTime localTime6 = DateUtils.parseLocalTime6(this.bytes, this.offset);
        if (localTime6 == null) {
            return null;
        }
        this.offset += 7;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localTime6;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime7() {
        char c10 = this.f4541ch;
        if (c10 != '\"' && c10 != '\'') {
            C1569c.m6258a("localTime only support string input");
            return null;
        }
        LocalTime localTime7 = DateUtils.parseLocalTime7(this.bytes, this.offset);
        if (localTime7 == null) {
            return null;
        }
        this.offset += 8;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localTime7;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime8() {
        char c10 = this.f4541ch;
        if (c10 != '\"' && c10 != '\'') {
            C1569c.m6258a("localTime only support string input");
            return null;
        }
        LocalTime localTime8 = DateUtils.parseLocalTime8(this.bytes, this.offset);
        if (localTime8 == null) {
            return null;
        }
        this.offset += 9;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localTime8;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalTime readLocalTime9() {
        char c10 = this.f4541ch;
        if (c10 != '\"' && c10 != '\'') {
            C1569c.m6258a("localTime only support string input");
            return null;
        }
        LocalTime localTime8 = DateUtils.parseLocalTime8(this.bytes, this.offset);
        if (localTime8 == null) {
            return null;
        }
        this.offset += 10;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return localTime8;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final long readMillis19() {
        byte b10 = this.f4541ch;
        if (b10 != 34 && b10 != 39) {
            C1569c.m6258a("date only support string input");
            return 0L;
        }
        int i10 = this.offset;
        if (i10 + 18 >= this.end) {
            this.wasNull = true;
            return 0L;
        }
        long millis19 = DateUtils.parseMillis19(this.bytes, i10, this.context.zoneId);
        byte[] bArr = this.bytes;
        int i11 = this.offset;
        if (bArr[i11 + 19] != b10) {
            C1569c.m6258a(info("illegal date input"));
            return 0L;
        }
        this.offset = i11 + 20;
        next();
        boolean z10 = this.f4541ch == ',';
        this.comma = z10;
        if (z10) {
            next();
        }
        return millis19;
    }

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
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            r2 = r0[r1]
            r3 = 97
            if (r2 != r3) goto L77
            int r2 = r1 + 1
            r2 = r0[r2]
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
            r2 = r0[r2]
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
            r1 = r0[r1]
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
            r1 = r0[r1]
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
            r1 = r0[r1]
            goto L58
        L6f:
            char r0 = (char) r2
            r14.f4541ch = r0
            r14.offset = r1
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L77:
            java.lang.String r0 = "json syntax error, not NaN "
            com.alibaba.fastjson2.C1575f.m6263a(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readNaN():double");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003d -> B:11:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:14:0x0032
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
    public final void readNull() {
        /*
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            r2 = r0[r1]
            r3 = 117(0x75, float:1.64E-43)
            if (r2 != r3) goto L7b
            int r2 = r1 + 1
            r2 = r0[r2]
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 != r3) goto L7b
            int r2 = r1 + 2
            r2 = r0[r2]
            if (r2 != r3) goto L7b
            int r2 = r1 + 3
            int r3 = r14.end
            r4 = 26
            if (r2 != r3) goto L23
            r1 = r2
        L21:
            r2 = r4
            goto L27
        L23:
            int r1 = r1 + 4
            r2 = r0[r2]
        L27:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r3 = 32
            if (r2 > r3) goto L48
            long r11 = r9 << r2
            long r11 = r11 & r7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 == 0) goto L48
            int r2 = r14.end
            if (r1 < r2) goto L40
            goto L21
        L40:
            int r2 = r1 + 1
            r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L27
        L48:
            r11 = 44
            if (r2 != r11) goto L4e
            r11 = 1
            goto L4f
        L4e:
            r11 = 0
        L4f:
            r14.comma = r11
            if (r11 == 0) goto L75
            int r2 = r14.end
            if (r1 < r2) goto L5a
            r2 = r1
            r1 = r4
            goto L5e
        L5a:
            int r2 = r1 + 1
            r1 = r0[r1]
        L5e:
            r13 = r2
            r2 = r1
            r1 = r13
        L61:
            if (r2 > r3) goto L75
            long r11 = r9 << r2
            long r11 = r11 & r7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 == 0) goto L75
            int r2 = r14.end
            if (r1 < r2) goto L70
            r2 = r4
            goto L61
        L70:
            int r2 = r1 + 1
            r1 = r0[r1]
            goto L5e
        L75:
            char r0 = (char) r2
            r14.f4541ch = r0
            r14.offset = r1
            return
        L7b:
            java.lang.String r0 = "json syntax error, not match null"
            com.alibaba.fastjson2.C1575f.m6263a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readNull():void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x005d -> B:23:0x004e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x009f -> B:44:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:25:0x0052
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final java.util.Date readNullOrNewDate() {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readNullOrNewDate():java.util.Date");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x010d, code lost:
    
        if (r2 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010f, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0110, code lost:
    
        r21.exponent = (short) r7;
        r21.valueType = com.alibaba.fastjson2.JSONReaderUTF8.INPUT_CODE_UTF8_2;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void readNumber(com.alibaba.fastjson2.reader.ValueConsumer r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readNumber(com.alibaba.fastjson2.reader.ValueConsumer, boolean):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:12:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:14:0x0049
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
    public final void readNumber0() {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readNumber0():void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00b0 -> B:40:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:44:0x00a6
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
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.OffsetDateTime readOffsetDateTime() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readOffsetDateTime():java.time.OffsetDateTime");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        r8 = 0;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.time.OffsetTime readOffsetTime() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readOffsetTime():java.time.OffsetTime");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0045 -> B:14:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:17:0x003a
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
    public final java.lang.String readPattern() {
        /*
            r15 = this;
            char r0 = r15.f4541ch
            r1 = 47
            if (r0 != r1) goto L83
            byte[] r0 = r15.bytes
            int r2 = r15.offset
            r3 = r2
        Lb:
            int r4 = r15.end
            if (r3 >= r4) goto L17
            r4 = r0[r3]
            if (r4 != r1) goto L14
            goto L17
        L14:
            int r3 = r3 + 1
            goto Lb
        L17:
            java.lang.String r1 = new java.lang.String
            int r4 = r3 - r2
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r0, r2, r4, r5)
            int r2 = r3 + 1
            int r4 = r15.end
            r5 = 26
            if (r2 != r4) goto L2b
            r3 = r2
        L29:
            r2 = r5
            goto L2f
        L2b:
            int r3 = r3 + 2
            r2 = r0[r2]
        L2f:
            r6 = 0
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r4 = 32
            if (r2 > r4) goto L50
            long r12 = r10 << r2
            long r12 = r12 & r8
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 == 0) goto L50
            int r2 = r15.end
            if (r3 != r2) goto L48
            goto L29
        L48:
            int r2 = r3 + 1
            r3 = r0[r3]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L2f
        L50:
            r12 = 44
            if (r2 != r12) goto L56
            r12 = 1
            goto L57
        L56:
            r12 = 0
        L57:
            r15.comma = r12
            if (r12 == 0) goto L7d
            int r2 = r15.end
            if (r3 != r2) goto L62
            r2 = r3
            r3 = r5
            goto L66
        L62:
            int r2 = r3 + 1
            r3 = r0[r3]
        L66:
            r14 = r3
            r3 = r2
            r2 = r14
        L69:
            if (r2 > r4) goto L7d
            long r12 = r10 << r2
            long r12 = r12 & r8
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 == 0) goto L7d
            int r2 = r15.end
            if (r3 != r2) goto L78
            r2 = r5
            goto L69
        L78:
            int r2 = r3 + 1
            r3 = r0[r3]
            goto L66
        L7d:
            r15.offset = r3
            char r0 = (char) r2
            r15.f4541ch = r0
            return r1
        L83:
            java.lang.String r0 = "illegal pattern"
            com.alibaba.fastjson2.C1569c.m6258a(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readPattern():java.lang.String");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:20:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:22:0x004e
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
    public final java.lang.String readReference() {
        /*
            r15 = this;
            int r0 = r15.referenceBegin
            int r1 = r15.end
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            byte[] r1 = r15.bytes
            int r2 = r0 + 1
            r15.offset = r2
            r0 = r1[r0]
            char r0 = (char) r0
            r15.f4541ch = r0
            java.lang.String r0 = r15.readString()
            char r2 = r15.f4541ch
            int r3 = r15.offset
        L1b:
            r4 = 0
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            r8 = 1
            r10 = 32
            r11 = 26
            if (r2 > r10) goto L3f
            long r12 = r8 << r2
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L3f
            int r2 = r15.end
            if (r3 != r2) goto L37
            r2 = r11
            goto L1b
        L37:
            int r2 = r3 + 1
            r3 = r1[r3]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L1b
        L3f:
            r12 = 125(0x7d, float:1.75E-43)
            if (r2 != r12) goto L97
            int r2 = r15.end
            if (r3 != r2) goto L4a
            r2 = r3
        L48:
            r3 = r11
            goto L4e
        L4a:
            int r2 = r3 + 1
            r3 = r1[r3]
        L4e:
            if (r3 > r10) goto L64
            long r12 = r8 << r3
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L64
            int r3 = r15.end
            if (r2 != r3) goto L5c
            goto L48
        L5c:
            int r3 = r2 + 1
            r2 = r1[r2]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L4e
        L64:
            r12 = 44
            if (r3 != r12) goto L6a
            r12 = 1
            goto L6b
        L6a:
            r12 = 0
        L6b:
            r15.comma = r12
            if (r12 == 0) goto L91
            int r3 = r15.end
            if (r2 != r3) goto L76
            r3 = r2
            r2 = r11
            goto L7a
        L76:
            int r3 = r2 + 1
            r2 = r1[r2]
        L7a:
            r14 = r3
            r3 = r2
            r2 = r14
        L7d:
            if (r3 > r10) goto L91
            long r12 = r8 << r3
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L91
            int r3 = r15.end
            if (r2 != r3) goto L8c
            r3 = r11
            goto L7d
        L8c:
            int r3 = r2 + 1
            r2 = r1[r2]
            goto L7a
        L91:
            char r1 = (char) r3
            r15.f4541ch = r1
            r15.offset = r2
            return r0
        L97:
            java.lang.String r1 = "illegal reference : "
            java.lang.String r0 = r1.concat(r0)
            com.alibaba.fastjson2.C1569c.m6258a(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readReference():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x01e3 -> B:106:0x01ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0207 -> B:122:0x01f7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:110:0x01da
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
    public java.lang.String readString() {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readString():java.lang.String");
    }

    public void readString0() {
        boolean z10;
        String str;
        byte b10 = this.f4541ch;
        int i10 = this.offset;
        int i11 = this.end;
        this.valueEscape = false;
        byte[] bArr = this.bytes;
        boolean z11 = true;
        int i12 = i10;
        int i13 = 0;
        boolean z12 = true;
        while (true) {
            byte b11 = bArr[i12];
            int i14 = Opcodes.ISHL;
            int i15 = Opcodes.LNEG;
            if (b11 == 92) {
                this.valueEscape = z11;
                byte b12 = bArr[i12 + 1];
                i12 += b12 != 117 ? b12 == 120 ? 4 : 2 : 6;
                z10 = z11;
            } else {
                z10 = z11;
                if (b11 < 0) {
                    switch ((b11 & INPUT_CODE_ERROR) >> 4) {
                        case Opcodes.FCONST_1 /* 12 */:
                        case Opcodes.FCONST_2 /* 13 */:
                            i12 += 2;
                            break;
                        case Opcodes.DCONST_0 /* 14 */:
                            i12 += 3;
                            break;
                        default:
                            if ((b11 >> INPUT_CODE_UTF8_3) != ESCAPE_INDEX_NOT_SET) {
                                C1575f.m6263a("malformed input around byte ", i12);
                                return;
                            } else {
                                i12 += 4;
                                i13++;
                            }
                            break;
                    }
                    z12 = false;
                } else {
                    if (b11 == b10) {
                        if (this.valueEscape) {
                            char[] cArr = new char[i13];
                            int i16 = 0;
                            while (true) {
                                byte b13 = bArr[i10];
                                if (b13 == 92) {
                                    int i17 = i10 + 1;
                                    int iHexDigit4 = bArr[i17];
                                    if (iHexDigit4 != 34 && iHexDigit4 != 92) {
                                        if (iHexDigit4 == i15) {
                                            iHexDigit4 = IOUtils.hexDigit4(bArr, i10 + 2, i11);
                                            i17 = i10 + 5;
                                        } else if (iHexDigit4 != i14) {
                                            iHexDigit4 = char1(iHexDigit4);
                                        } else {
                                            byte b14 = bArr[i10 + 2];
                                            int i18 = i10 + 3;
                                            iHexDigit4 = JSONReader.char2(b14, bArr[i18]);
                                            i17 = i18;
                                        }
                                    }
                                    cArr[i16] = (char) iHexDigit4;
                                    i10 = i17 + 1;
                                } else if (b13 == 34) {
                                    str = new String(cArr);
                                    i12 = i10;
                                } else if (b13 < 0) {
                                    switch ((b13 & INPUT_CODE_ERROR) >> 4) {
                                        case Opcodes.FCONST_1 /* 12 */:
                                        case Opcodes.FCONST_2 /* 13 */:
                                            int i19 = i10 + 1;
                                            i10 += 2;
                                            cArr[i16] = (char) (((b13 & 31) << 6) | (bArr[i19] & JSONB.Constants.BC_INT32_BYTE_MAX));
                                            break;
                                        case Opcodes.DCONST_0 /* 14 */:
                                            int i20 = i10 + 2;
                                            byte b15 = bArr[i10 + 1];
                                            i10 += 3;
                                            cArr[i16] = (char) (((b13 & 15) << 12) | ((b15 & JSONB.Constants.BC_INT32_BYTE_MAX) << 6) | (bArr[i20] & JSONB.Constants.BC_INT32_BYTE_MAX));
                                            break;
                                        default:
                                            if ((b13 >> INPUT_CODE_UTF8_3) != ESCAPE_INDEX_NOT_SET) {
                                                C1575f.m6263a("malformed input around byte ", i10);
                                                return;
                                            }
                                            byte b16 = bArr[i10 + 1];
                                            int i21 = i10 + 3;
                                            byte b17 = bArr[i10 + 2];
                                            i10 += 4;
                                            byte b18 = bArr[i21];
                                            int i22 = (((b13 << 18) ^ (b16 << 12)) ^ (b17 << 6)) ^ (b18 ^ 3678080);
                                            if ((b16 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b17 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b18 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && i22 >= 65536 && i22 < 1114112) {
                                                int i23 = i16 + 1;
                                                cArr[i16] = (char) ((i22 >>> 10) + 55232);
                                                cArr[i23] = (char) ((i22 & 1023) + 56320);
                                                i16 = i23;
                                            }
                                            break;
                                            break;
                                    }
                                } else {
                                    cArr[i16] = (char) b13;
                                    i10++;
                                }
                                i16++;
                                i14 = Opcodes.ISHL;
                                i15 = Opcodes.LNEG;
                            }
                            C1575f.m6263a("malformed input around byte ", i10);
                            return;
                        }
                        int i24 = this.offset;
                        if (z12) {
                            int i25 = i12 - i24;
                            str = JDKUtils.ANDROID ? getLatin1String(i24, i25) : new String(bArr, i24, i25, StandardCharsets.ISO_8859_1);
                        } else {
                            str = new String(bArr, i24, i12 - i24, StandardCharsets.UTF_8);
                        }
                        int i26 = i12 + 1;
                        byte b19 = bArr[i26];
                        while (b19 <= 32 && ((1 << b19) & 4294981377L) != 0) {
                            i26++;
                            b19 = bArr[i26];
                        }
                        this.comma = b19 == 44 ? z10 : false;
                        this.offset = i26 + 1;
                        if (b19 == 44) {
                            next();
                        } else {
                            this.f4541ch = (char) b19;
                        }
                        this.stringValue = str;
                        return;
                    }
                    i12++;
                }
            }
            i13++;
            z11 = z10;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0076 -> B:34:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:37:0x0065
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
    public final java.util.UUID readUUID() {
        /*
            r11 = this;
            char r0 = r11.f4541ch
            int r1 = r11.end
            r2 = 110(0x6e, float:1.54E-43)
            r3 = 0
            if (r0 != r2) goto Ld
            r11.readNull()
            return r3
        Ld:
            r2 = 34
            if (r0 == r2) goto L1d
            r2 = 39
            if (r0 != r2) goto L16
            goto L1d
        L16:
            java.lang.String r0 = "syntax error, can not read uuid"
            com.alibaba.fastjson2.JSONException r0 = r11.error(r0)
            throw r0
        L1d:
            byte[] r2 = r11.bytes
            int r4 = r11.offset
            int r5 = r4 + 36
            if (r5 >= r1) goto L4a
            r5 = r2[r5]
            if (r5 != r0) goto L4a
            int r5 = r4 + 8
            r5 = r2[r5]
            r6 = 45
            if (r5 != r6) goto L4a
            int r5 = r4 + 13
            r5 = r2[r5]
            if (r5 != r6) goto L4a
            int r5 = r4 + 18
            r5 = r2[r5]
            if (r5 != r6) goto L4a
            int r5 = r4 + 23
            r5 = r2[r5]
            if (r5 != r6) goto L4a
            java.util.UUID r0 = readUUID36(r2, r4)
            int r4 = r4 + 37
            goto L58
        L4a:
            int r5 = r4 + 32
            if (r5 >= r1) goto L96
            r5 = r2[r5]
            if (r5 != r0) goto L96
            java.util.UUID r0 = readUUID32(r2, r4)
            int r4 = r4 + 33
        L58:
            r3 = 26
            if (r4 != r1) goto L5f
            r5 = r4
        L5d:
            r4 = r3
            goto L63
        L5f:
            int r5 = r4 + 1
            r4 = r2[r4]
        L63:
            r6 = 32
            if (r4 > r6) goto L81
            r6 = 1
            long r6 = r6 << r4
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            long r6 = r6 & r8
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L81
            if (r5 != r1) goto L79
            goto L5d
        L79:
            int r4 = r5 + 1
            r5 = r2[r5]
            r10 = r5
            r5 = r4
            r4 = r10
            goto L63
        L81:
            r11.offset = r5
            r1 = 44
            if (r4 != r1) goto L89
            r1 = 1
            goto L8a
        L89:
            r1 = 0
        L8a:
            r11.comma = r1
            if (r1 == 0) goto L92
            r11.next()
            return r0
        L92:
            char r1 = (char) r4
            r11.f4541ch = r1
            return r0
        L96:
            java.lang.String r0 = r11.readString()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La1
            return r3
        La1:
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readUUID():java.util.UUID");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x006c -> B:26:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:29:0x0062
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public long readValueHashCode() {
        /*
            r21 = this;
            r1 = r21
            byte[] r0 = r1.bytes
            char r2 = r1.f4541ch
            r3 = 47
            if (r2 != r3) goto Lf
            r1.skipComment()
            char r2 = r1.f4541ch
        Lf:
            r3 = 34
            if (r2 == r3) goto L1a
            r3 = 39
            if (r2 == r3) goto L1a
            r2 = -1
            return r2
        L1a:
            int r3 = r1.offset
            r1.nameBegin = r3
            int r4 = r1.end
            java.lang.invoke.MethodHandle r5 = com.alibaba.fastjson2.util.JDKUtils.INDEX_OF_CHAR_LATIN1
            if (r5 != 0) goto L29
            int r2 = com.alibaba.fastjson2.util.IOUtils.indexOfQuoteV(r0, r2, r3, r4)
            goto L2e
        L29:
            int r2 = (int) r5.invokeExact(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> Lba
        L2e:
            r5 = -1
            if (r2 == r5) goto Lb3
            int r6 = indexOfSlash(r1, r0, r3, r4)
            if (r6 == r5) goto L3f
            if (r6 <= r2) goto L3a
            goto L3f
        L3a:
            long r2 = r1.readValueHashCode0()
            return r2
        L3f:
            int r5 = r2 + 1
            int r6 = r2 - r3
            boolean r7 = com.alibaba.fastjson2.util.IOUtils.isASCII(r0, r3, r6)
            long r8 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0, r3, r6, r7)
            r1.nameEnd = r2
            if (r5 != r4) goto L53
            r2 = r5
        L50:
            r5 = 26
            goto L57
        L53:
            int r2 = r2 + 2
            r5 = r0[r5]
        L57:
            r10 = 0
            r12 = 4294981377(0x100003701, double:2.122002748E-314)
            r14 = 1
            r3 = 32
            if (r5 > r3) goto L76
            long r16 = r14 << r5
            long r16 = r16 & r12
            int r16 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r16 == 0) goto L76
            if (r2 != r4) goto L6f
            goto L50
        L6f:
            int r3 = r2 + 1
            r2 = r0[r2]
            r5 = r2
            r2 = r3
            goto L57
        L76:
            r16 = r10
            r10 = 44
            r11 = 0
            if (r5 != r10) goto L7f
            r10 = 1
            goto L80
        L7f:
            r10 = r11
        L80:
            r1.comma = r10
            if (r10 == 0) goto La7
            if (r2 != r4) goto L8a
            r5 = r2
            r2 = 26
            goto L8e
        L8a:
            int r5 = r2 + 1
            r2 = r0[r2]
        L8e:
            r20 = r5
            r5 = r2
            r2 = r20
        L93:
            if (r5 > r3) goto La7
            long r18 = r14 << r5
            long r18 = r18 & r12
            int r10 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r10 == 0) goto La7
            if (r2 != r4) goto La2
            r5 = 26
            goto L93
        La2:
            int r5 = r2 + 1
            r2 = r0[r2]
            goto L8e
        La7:
            r1.offset = r2
            char r0 = (char) r5
            r1.f4541ch = r0
            r1.nameAscii = r7
            r1.nameEscape = r11
            r1.nameLength = r6
            return r8
        Lb3:
            java.lang.String r0 = "invalid escape character EOI"
            com.alibaba.fastjson2.JSONException r0 = r1.error(r0)
            throw r0
        Lba:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.alibaba.fastjson2.C1569c.m6258a(r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readValueHashCode():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.time.ZonedDateTime readZonedDateTimeX(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.isString()
            if (r0 == 0) goto L9b
            r0 = 19
            r1 = 0
            if (r6 >= r0) goto Lc
            return r1
        Lc:
            r0 = 30
            r2 = 90
            if (r6 != r0) goto L27
            byte[] r0 = r5.bytes
            int r3 = r5.offset
            int r4 = r3 + 29
            r4 = r0[r4]
            if (r4 != r2) goto L27
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(r0, r3)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r2)
            goto L7e
        L27:
            r0 = 29
            if (r6 != r0) goto L40
            byte[] r0 = r5.bytes
            int r3 = r5.offset
            int r4 = r3 + 28
            r4 = r0[r4]
            if (r4 != r2) goto L40
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(r0, r3)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r2)
            goto L7e
        L40:
            r0 = 28
            if (r6 != r0) goto L59
            byte[] r0 = r5.bytes
            int r3 = r5.offset
            int r4 = r3 + 27
            r4 = r0[r4]
            if (r4 != r2) goto L59
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(r0, r3)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r2)
            goto L7e
        L59:
            r0 = 27
            if (r6 != r0) goto L72
            byte[] r0 = r5.bytes
            int r3 = r5.offset
            int r4 = r3 + 26
            r4 = r0[r4]
            if (r4 != r2) goto L72
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(r0, r3)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r2)
            goto L7e
        L72:
            byte[] r0 = r5.bytes
            int r2 = r5.offset
            com.alibaba.fastjson2.JSONReader$Context r3 = r5.context
            java.time.ZoneId r3 = r3.zoneId
            java.time.ZonedDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(r0, r2, r6, r3)
        L7e:
            if (r0 != 0) goto L81
            return r1
        L81:
            int r1 = r5.offset
            r2 = 1
            int r6 = r6 + r2
            int r1 = r1 + r6
            r5.offset = r1
            r5.next()
            char r6 = r5.f4541ch
            r1 = 44
            if (r6 != r1) goto L92
            goto L93
        L92:
            r2 = 0
        L93:
            r5.comma = r2
            if (r2 == 0) goto L9a
            r5.next()
        L9a:
            return r0
        L9b:
            java.lang.String r6 = "date only support string input"
            com.alibaba.fastjson2.C1569c.m6258a(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readZonedDateTimeX(int):java.time.ZonedDateTime");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final void skipComment() {
        boolean z10;
        boolean z11;
        byte b10;
        int i10 = this.offset;
        int i11 = i10 + 1;
        if (i11 >= this.end) {
            C1569c.m6258a(info());
            return;
        }
        byte[] bArr = this.bytes;
        byte b11 = bArr[i10];
        if (b11 == 42) {
            z10 = true;
        } else {
            if (b11 != 47) {
                C1569c.m6258a(info("parse comment error"));
                return;
            }
            z10 = false;
        }
        int i12 = i10 + 2;
        byte b12 = bArr[i11];
        while (true) {
            if (z10) {
                if (b12 == 42 && i12 <= this.end && bArr[i12] == 47) {
                    i12++;
                }
            } else {
                z11 = b12 == 10;
            }
            int i13 = this.end;
            b10 = 26;
            if (z11) {
                if (i12 < i13) {
                    byte b13 = bArr[i12];
                    while (b13 <= 32 && ((1 << b13) & 4294981377L) != 0) {
                        i12++;
                        if (i12 >= this.end) {
                            break;
                        } else {
                            b13 = bArr[i12];
                        }
                    }
                    b10 = b13;
                    i12++;
                }
            } else {
                if (i12 >= i13) {
                    break;
                }
                b12 = bArr[i12];
                i12++;
            }
        }
        this.f4541ch = (char) b10;
        this.offset = i12;
        if (b10 == 47) {
            skipComment();
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final void skipValue() {
        int i10 = this.offset;
        int i11 = this.end;
        byte[] bArr = this.bytes;
        char c10 = this.f4541ch;
        this.offset = (c10 == '\"' || c10 == '\'') ? skipString(this, bArr, i10, i11) : c10 != 'S' ? c10 != '[' ? c10 != 'f' ? c10 != 'n' ? c10 != 't' ? c10 != '{' ? skipNumber(this, bArr, i10, i11, false) : skipObject(this, bArr, i10, i11) : skipTrue(this, bArr, i10, i11) : skipNull(this, bArr, i10, i11) : skipFalse(this, bArr, i10, i11) : skipArray(this, bArr, i10, i11) : skipSet(this, bArr, i10, i11);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x001e -> B:5:0x0005). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x000d
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
    public static int next(com.alibaba.fastjson2.JSONReaderUTF8 r7, byte[] r8, int r9, int r10) {
        /*
            r0 = 26
            if (r9 != r10) goto L7
            r1 = r9
        L5:
            r9 = r0
            goto Lb
        L7:
            int r1 = r9 + 1
            r9 = r8[r9]
        Lb:
            r2 = 32
            if (r9 > r2) goto L29
            r2 = 1
            long r2 = r2 << r9
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L29
            if (r1 != r10) goto L21
            goto L5
        L21:
            int r9 = r1 + 1
            r1 = r8[r1]
            r6 = r1
            r1 = r9
            r9 = r6
            goto Lb
        L29:
            if (r9 >= 0) goto L31
            r7.char_utf8(r9, r1)
            int r7 = r7.offset
            return r7
        L31:
            char r8 = (char) r9
            r7.f4541ch = r8
            r8 = 47
            if (r9 != r8) goto L40
            r7.offset = r1
            r7.skipComment()
            int r7 = r7.offset
            return r7
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.next(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):int");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0030 -> B:11:0x0017). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:14:0x001f
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
    private static boolean nextIfSet(com.alibaba.fastjson2.JSONReaderUTF8 r7, byte[] r8, int r9, int r10) {
        /*
            int r0 = r9 + 1
            if (r0 >= r10) goto L42
            r1 = r8[r9]
            r2 = 101(0x65, float:1.42E-43)
            if (r1 != r2) goto L42
            r0 = r8[r0]
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto L42
            int r0 = r9 + 2
            r1 = 26
            if (r0 != r10) goto L19
            r9 = r0
        L17:
            r0 = r1
            goto L1d
        L19:
            int r9 = r9 + 3
            r0 = r8[r0]
        L1d:
            r2 = 32
            if (r0 > r2) goto L3b
            r2 = 1
            long r2 = r2 << r0
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L3b
            if (r9 != r10) goto L33
            goto L17
        L33:
            int r0 = r9 + 1
            r9 = r8[r9]
            r6 = r0
            r0 = r9
            r9 = r6
            goto L1d
        L3b:
            r7.offset = r9
            char r8 = (char) r0
            r7.f4541ch = r8
            r7 = 1
            return r7
        L42:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfSet(com.alibaba.fastjson2.JSONReaderUTF8, byte[], int, int):boolean");
    }

    public static int char2_utf8(int i10, int i11, int i12, int i13) {
        if ((i11 & Opcodes.CHECKCAST) == 128 && (i12 & Opcodes.CHECKCAST) == 128) {
            return ((i10 & 15) << 12) | ((i11 & 63) << 6) | (i12 & 63);
        }
        C1575f.m6263a("malformed input around byte ", i13);
        return 0;
    }

    private static int skipValue(JSONReaderUTF8 jSONReaderUTF8, byte[] bArr, int i10, int i11) {
        char c10 = jSONReaderUTF8.f4541ch;
        if (c10 == '\"' || c10 == '\'') {
            return skipString(jSONReaderUTF8, bArr, i10, i11);
        }
        if (c10 == 'S') {
            return skipSet(jSONReaderUTF8, bArr, i10, i11);
        }
        if (c10 == '[') {
            return skipArray(jSONReaderUTF8, bArr, i10, i11);
        }
        if (c10 == 'f') {
            return skipFalse(jSONReaderUTF8, bArr, i10, i11);
        }
        if (c10 == 'n') {
            return skipNull(jSONReaderUTF8, bArr, i10, i11);
        }
        if (c10 == 't') {
            return skipTrue(jSONReaderUTF8, bArr, i10, i11);
        }
        if (c10 != '{') {
            return skipNumber(jSONReaderUTF8, bArr, i10, i11, false);
        }
        return skipObject(jSONReaderUTF8, bArr, i10, i11);
    }

    public static int char2_utf8(int i10, int i11, int i12) {
        if ((i11 & Opcodes.CHECKCAST) == 128) {
            return ((i10 & 31) << 6) | (i11 & 63);
        }
        C1575f.m6263a("malformed input around byte ", i12);
        return 0;
    }

    public JSONReaderUTF8(JSONReader.Context context, ByteBuffer byteBuffer) {
        super(context, false, true);
        this.nextEscapeIndex = ESCAPE_INDEX_NOT_SET;
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.CACHE_ITEMS;
        JSONFactory.CacheItem cacheItem = cacheItemArr[iIdentityHashCode & (cacheItemArr.length - 1)];
        this.cacheItem = cacheItem;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        int iRemaining = byteBuffer.remaining();
        andSet = (andSet == null || andSet.length < iRemaining) ? new byte[iRemaining] : andSet;
        byteBuffer.get(andSet, 0, iRemaining);
        this.bytes = andSet;
        this.offset = 0;
        this.length = iRemaining;
        this.f4542in = null;
        this.start = 0;
        this.end = iRemaining;
        next();
        if (this.f4541ch == '/') {
            skipComment();
        }
    }

    public JSONReaderUTF8(JSONReader.Context context, byte[] bArr, int i10, int i11) {
        super(context, false, true);
        this.nextEscapeIndex = ESCAPE_INDEX_NOT_SET;
        this.bytes = bArr;
        this.offset = i10;
        this.length = i11;
        this.f4542in = null;
        this.start = i10;
        this.end = i10 + i11;
        this.cacheItem = null;
        next();
    }

    public final String info(String str, int i10) {
        return info(str).concat(Integer.toString(i10));
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
    public final boolean nextIfMatchIdent(char r8, char r9, char r10) {
        /*
            r7 = this;
            char r0 = r7.f4541ch
            r1 = 0
            if (r0 == r8) goto L6
            return r1
        L6:
            byte[] r8 = r7.bytes
            int r0 = r7.offset
            int r2 = r0 + 2
            int r3 = r7.end
            if (r2 > r3) goto L6d
            r4 = r8[r0]
            if (r4 != r9) goto L6d
            int r9 = r0 + 1
            r9 = r8[r9]
            if (r9 == r10) goto L1b
            goto L6d
        L1b:
            r9 = 26
            if (r2 != r3) goto L21
        L1f:
            r10 = r9
            goto L26
        L21:
            int r0 = r0 + 3
            r10 = r8[r2]
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
            r0 = r8[r2]
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
            char r8 = (char) r10
            r7.f4541ch = r8
            r8 = 1
            return r8
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char, char):boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean skipName() {
        this.offset = skipName(this, this.bytes, this.offset, this.end);
        return true;
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
    public final boolean nextIfMatchIdent(char r8, char r9, char r10, char r11) {
        /*
            r7 = this;
            char r0 = r7.f4541ch
            r1 = 0
            if (r0 == r8) goto L6
            return r1
        L6:
            byte[] r8 = r7.bytes
            int r0 = r7.offset
            int r2 = r0 + 3
            int r3 = r7.end
            if (r2 > r3) goto L73
            r4 = r8[r0]
            if (r4 != r9) goto L73
            int r9 = r0 + 1
            r9 = r8[r9]
            if (r9 != r10) goto L73
            int r9 = r0 + 2
            r9 = r8[r9]
            if (r9 == r11) goto L21
            goto L73
        L21:
            r9 = 26
            if (r2 != r3) goto L27
        L25:
            r10 = r9
            goto L2c
        L27:
            int r0 = r0 + 4
            r10 = r8[r2]
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
            r11 = r8[r2]
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
            char r8 = (char) r10
            r7.f4541ch = r8
            r8 = 1
            return r8
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char, char, char):boolean");
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
    public final boolean nextIfMatchIdent(char r6, char r7, char r8, char r9, char r10) {
        /*
            r5 = this;
            char r0 = r5.f4541ch
            r1 = 0
            if (r0 == r6) goto L6
            return r1
        L6:
            byte[] r6 = r5.bytes
            int r0 = r5.offset
            int r2 = r0 + 4
            int r3 = r5.end
            if (r2 > r3) goto L79
            r4 = r6[r0]
            if (r4 != r7) goto L79
            int r7 = r0 + 1
            r7 = r6[r7]
            if (r7 != r8) goto L79
            int r7 = r0 + 2
            r7 = r6[r7]
            if (r7 != r9) goto L79
            int r7 = r0 + 3
            r7 = r6[r7]
            if (r7 == r10) goto L27
            goto L79
        L27:
            r7 = 26
            if (r2 != r3) goto L2d
        L2b:
            r8 = r7
            goto L32
        L2d:
            int r0 = r0 + 5
            r8 = r6[r2]
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
            r9 = r6[r2]
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
            char r6 = (char) r8
            r5.f4541ch = r6
            r6 = 1
            return r6
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char, char, char, char):boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0035 -> B:13:0x001a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:16:0x0022
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
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfMatchIdent(char r9, char r10) {
        /*
            r8 = this;
            char r0 = r8.f4541ch
            r1 = 0
            if (r0 == r9) goto L6
            return r1
        L6:
            byte[] r9 = r8.bytes
            int r0 = r8.offset
            int r2 = r0 + 1
            int r3 = r8.end
            if (r2 > r3) goto L68
            r4 = r9[r0]
            if (r4 == r10) goto L15
            goto L68
        L15:
            r10 = 26
            if (r2 != r3) goto L1c
            r0 = r2
        L1a:
            r2 = r10
            goto L20
        L1c:
            int r0 = r0 + 2
            r2 = r9[r2]
        L20:
            r3 = 32
            if (r2 > r3) goto L40
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L40
            int r2 = r8.end
            if (r0 != r2) goto L38
            goto L1a
        L38:
            int r2 = r0 + 1
            r0 = r9[r0]
            r7 = r2
            r2 = r0
            r0 = r7
            goto L20
        L40:
            int r9 = r8.offset
            int r9 = r9 + 2
            if (r0 != r9) goto L61
            if (r2 == r10) goto L61
            r9 = 40
            if (r2 == r9) goto L61
            r9 = 91
            if (r2 == r9) goto L61
            r9 = 93
            if (r2 == r9) goto L61
            r9 = 41
            if (r2 == r9) goto L61
            r9 = 58
            if (r2 == r9) goto L61
            r9 = 44
            if (r2 == r9) goto L61
            return r1
        L61:
            r8.offset = r0
            char r9 = (char) r2
            r8.f4541ch = r9
            r9 = 1
            return r9
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char):boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0085 -> B:32:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00a9 -> B:45:0x0098). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:35:0x007b
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
    public long readFieldNameHashCode() {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFieldNameHashCode():long");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final void readString(ValueConsumer valueConsumer, boolean z10) {
        boolean z11;
        byte b10 = this.f4541ch;
        int i10 = this.offset;
        this.valueEscape = false;
        byte[] bArr = this.bytes;
        int i11 = i10;
        int i12 = 0;
        while (true) {
            byte b11 = bArr[i11];
            byte b12 = JSONB.Constants.BC_STR_ASCII_FIX_MAX;
            byte b13 = 117;
            byte b14 = 92;
            if (b11 == 92) {
                this.valueEscape = true;
                int i13 = i11 + 1;
                byte b15 = bArr[i13];
                if (b15 == 117) {
                    i13 = i11 + 5;
                } else if (b15 == 120) {
                    i13 = i11 + 3;
                }
                i11 = i13 + 1;
            } else if (b11 < 0) {
                switch ((b11 & INPUT_CODE_ERROR) >> 4) {
                    case Opcodes.FCONST_1 /* 12 */:
                    case Opcodes.FCONST_2 /* 13 */:
                        i11 += 2;
                        break;
                    case Opcodes.DCONST_0 /* 14 */:
                        i11 += 3;
                        break;
                    default:
                        if ((b11 >> INPUT_CODE_UTF8_3) != ESCAPE_INDEX_NOT_SET) {
                            C1575f.m6263a("malformed input around byte ", i11);
                            return;
                        } else {
                            i11 += 4;
                            i12++;
                        }
                        break;
                }
            } else {
                if (b11 == b10) {
                    if (this.valueEscape) {
                        int i14 = i11 - this.offset;
                        char[] cArr = new char[i12];
                        int i15 = this.end;
                        int i16 = 0;
                        z11 = true;
                        while (true) {
                            int iHexDigit4 = bArr[i10];
                            if (iHexDigit4 == b14) {
                                int i17 = i10 + 1;
                                byte b16 = bArr[i17];
                                if (b16 == 34 || b16 == b14) {
                                    i10 = i17;
                                    iHexDigit4 = b16;
                                } else if (b16 == b13) {
                                    iHexDigit4 = IOUtils.hexDigit4(bArr, i10 + 2, i15);
                                    i10 += 5;
                                } else if (b16 != b12) {
                                    iHexDigit4 = char1(b16);
                                    i10 = i17;
                                } else {
                                    byte b17 = bArr[i10 + 2];
                                    i10 += 3;
                                    iHexDigit4 = JSONReader.char2(b17, bArr[i10]);
                                }
                            } else if (iHexDigit4 == 34) {
                                if (z10) {
                                    JSONWriter jSONWriterM6247of = JSONWriter.m6247of();
                                    jSONWriterM6247of.writeString(cArr, 0, i12);
                                    byte[] bytes = jSONWriterM6247of.getBytes();
                                    valueConsumer.accept(bytes, 0, bytes.length);
                                } else {
                                    byte[] bArr2 = new byte[i14];
                                    valueConsumer.accept(bArr2, 0, IOUtils.encodeUTF8(cArr, 0, i12, bArr2, 0));
                                }
                                i11 = i10;
                            }
                            if (iHexDigit4 >= 0) {
                                cArr[i16] = (char) iHexDigit4;
                                i10++;
                            } else {
                                switch ((iHexDigit4 & 255) >> 4) {
                                    case Opcodes.FCONST_1 /* 12 */:
                                    case Opcodes.FCONST_2 /* 13 */:
                                        cArr[i16] = (char) (((iHexDigit4 & 31) << 6) | (bArr[i10 + 1] & JSONB.Constants.BC_INT32_BYTE_MAX));
                                        i10 += 2;
                                        break;
                                    case Opcodes.DCONST_0 /* 14 */:
                                        cArr[i16] = (char) (((iHexDigit4 & 15) << 12) | ((bArr[i10 + 1] & JSONB.Constants.BC_INT32_BYTE_MAX) << 6) | (bArr[i10 + 2] & JSONB.Constants.BC_INT32_BYTE_MAX));
                                        i10 += 3;
                                        break;
                                    default:
                                        if ((iHexDigit4 >> 3) == ESCAPE_INDEX_NOT_SET) {
                                            byte b18 = bArr[i10 + 1];
                                            byte b19 = bArr[i10 + 2];
                                            byte b20 = bArr[i10 + 3];
                                            i10 += 4;
                                            int i18 = (((iHexDigit4 << 18) ^ (b18 << 12)) ^ (b19 << 6)) ^ (b20 ^ 3678080);
                                            if ((b18 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b19 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b20 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && i18 >= 65536 && i18 < 1114112) {
                                                int i19 = i16 + 1;
                                                cArr[i16] = (char) ((i18 >>> 10) + 55232);
                                                cArr[i19] = (char) ((i18 & 1023) + 56320);
                                                i16 = i19;
                                            }
                                        } else {
                                            C1575f.m6263a("malformed input around byte ", i10);
                                            return;
                                        }
                                        break;
                                }
                            }
                            i16++;
                            b12 = JSONB.Constants.BC_STR_ASCII_FIX_MAX;
                            b13 = 117;
                            b14 = 92;
                        }
                        C1575f.m6263a("malformed input around byte ", i10);
                        return;
                    }
                    z11 = true;
                    int i20 = this.offset;
                    if (z10) {
                        i20--;
                    }
                    int i21 = i11 - this.offset;
                    if (z10) {
                        i21 += 2;
                    }
                    if (z10 && b10 == 39) {
                        byte[] bArr3 = new byte[i21];
                        System.arraycopy(bArr, this.offset - 1, bArr3, 0, i21);
                        bArr3[0] = 34;
                        bArr3[i21 - 1] = 34;
                        valueConsumer.accept(bArr3, 0, i21);
                    } else {
                        valueConsumer.accept(bArr, i20, i21);
                    }
                    int i22 = i11 + 1;
                    byte b21 = bArr[i22];
                    while (b21 <= 32 && ((1 << b21) & 4294981377L) != 0) {
                        i22++;
                        b21 = bArr[i22];
                    }
                    boolean z12 = b21 == 44 ? z11 : false;
                    this.comma = z12;
                    if (z12) {
                        this.offset = i22 + 1;
                        next();
                        return;
                    } else {
                        this.offset = i22 + 1;
                        this.f4541ch = (char) b21;
                        return;
                    }
                }
                i11++;
            }
            i12++;
        }
    }
}
