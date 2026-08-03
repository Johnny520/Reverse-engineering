package com.alibaba.fastjson2;

import bsh.ParserConstants;
import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;
import okhttp3.internal.p221ws.WebSocketProtocol;
import okio.Utf8;
import okio.internal.Buffer;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class JSONReaderUTF8 extends JSONReader {
    static final int REF;
    protected byte[] byteBuf;
    protected final byte[] bytes;
    protected final JSONFactory.CacheItem cacheItem;
    protected char[] charBuf;
    protected final int end;

    /* JADX INFO: renamed from: in */
    protected final InputStream f1930in;
    protected final int length;
    protected boolean nameAscii;
    protected int nameBegin;
    protected int nameEnd;
    protected int nameLength;
    protected int referenceBegin;
    protected final int start;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        REF = JDKUtils.BIG_ENDIAN ? 611476838 : 1717924388;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0057 -> B:10:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:13:0x0044
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
    public JSONReaderUTF8(com.alibaba.fastjson2.JSONReader.Context r7, java.nio.ByteBuffer r8) {
        /*
            r6 = this;
            r0 = 0
            r6.<init>(r7, r0)
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            int r7 = java.lang.System.identityHashCode(r7)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r1 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            r7 = r7 & r2
            r7 = r1[r7]
            r6.cacheItem = r7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r1 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r2 = 0
            java.lang.Object r7 = r1.getAndSet(r7, r2)
            byte[] r7 = (byte[]) r7
            int r1 = r8.remaining()
            if (r7 == 0) goto L28
            int r4 = r7.length
            if (r4 >= r1) goto L2a
        L28:
            byte[] r7 = new byte[r1]
        L2a:
            r8.get(r7, r0, r1)
            r6.byteBuf = r7
            r6.bytes = r7
            r6.length = r1
            r6.f1930in = r2
            r6.start = r0
            r6.end = r1
            r8 = 26
            if (r1 > 0) goto L40
            r3 = r0
        L3e:
            r0 = r8
            goto L42
        L40:
            r0 = r7[r0]
        L42:
            r1 = 32
            if (r0 > r1) goto L61
            r1 = 1
            long r1 = r1 << r0
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r1 = r1 & r4
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L61
            int r0 = r6.end
            if (r3 != r0) goto L5a
            goto L3e
        L5a:
            int r0 = r3 + 1
            r1 = r7[r3]
            r3 = r0
            r0 = r1
            goto L42
        L61:
            if (r0 >= 0) goto L67
            r6.next()
            return
        L67:
            r6.offset = r3
            char r7 = (char) r0
            r6.f1929ch = r7
            r7 = 47
            if (r0 != r7) goto L73
            r6.skipComment()
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.<init>(com.alibaba.fastjson2.JSONReader$Context, java.nio.ByteBuffer):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void char2_utf8(byte[] bArr, int i9, int i10, char[] cArr, int i11) {
        if ((i10 >> 3) != -2) {
            C0086a.m464w(AbstractC0921a.m2249l(i9, "malformed input around byte "));
            return;
        }
        int i12 = bArr[i9 + 1];
        int i13 = bArr[i9 + 2];
        int i14 = bArr[i9 + 3];
        int i15 = (((i10 << 18) ^ (i12 << 12)) ^ (i13 << 6)) ^ (3678080 ^ i14);
        if ((i12 & Opcodes.CHECKCAST) != 128 || (i13 & Opcodes.CHECKCAST) != 128 || (i14 & Opcodes.CHECKCAST) != 128 || i15 < 65536 || i15 >= 1114112) {
            C0086a.m464w(AbstractC0921a.m2249l(i9, "malformed input around byte "));
        } else {
            cArr[i11] = (char) ((i15 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
            cArr[i11 + 1] = (char) ((i15 & 1023) + Utf8.LOG_SURROGATE_HEADER);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void char_utf8(int i9, int i10) {
        int i11;
        int iChar2_utf8;
        byte[] bArr = this.bytes;
        int i12 = i9 & 255;
        switch (i12 >> 4) {
            case 12:
            case 13:
                int i13 = i10 + 1;
                int iChar2_utf82 = char2_utf8(i12, bArr[i10], i13);
                i11 = i13;
                iChar2_utf8 = iChar2_utf82;
                break;
            case 14:
                iChar2_utf8 = char2_utf8(i12, bArr[i10], bArr[i10 + 1], i10);
                i11 = i10 + 2;
                break;
            default:
                if ((i9 >> 3) != -2) {
                    C0086a.m464w(AbstractC0921a.m2249l(i10, "malformed input around byte "));
                    return;
                }
                iChar2_utf8 = (((i9 << 18) ^ (bArr[i10] << 12)) ^ (bArr[i10 + 1] << 6)) ^ (bArr[i10 + 2] ^ 3678080);
                i11 = i10 + 3;
                break;
                break;
        }
        this.f1929ch = (char) iChar2_utf8;
        this.offset = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isReference0(byte[] bArr, int i9, int i10, int i11) {
        int i12;
        int i13;
        byte b10;
        int i14 = i9 + 6;
        byte b11 = bArr[i14];
        while (b11 >= 0 && b11 <= 32 && ((1 << b11) & 4294981377L) != 0) {
            i14++;
            if (i14 >= i10) {
                return false;
            }
            b11 = bArr[i14];
        }
        if (b11 == 58 && (i12 = i14 + 1) < i10) {
            int i15 = bArr[i12];
            while (i15 >= 0 && i15 <= 32 && ((1 << i15) & 4294981377L) != 0) {
                i12++;
                if (i12 >= i10) {
                    return false;
                }
                i15 = bArr[i12];
            }
            if (i15 == i11 && ((i13 = i12 + 1) >= i10 || (b10 = bArr[i13]) == 36 || b10 == 46 || b10 == 64)) {
                this.referenceBegin = i12;
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        JSONFactory.CacheItem cacheItem = this.cacheItem;
        byte[] bArr = this.byteBuf;
        if (bArr != null && bArr.length < 1048576) {
            JSONFactory.BYTES_UPDATER.lazySet(cacheItem, bArr);
        }
        char[] cArr = this.charBuf;
        if (cArr != null && cArr.length < 1048576) {
            JSONFactory.CHARS_UPDATER.lazySet(cacheItem, cArr);
        }
        InputStream inputStream = this.f1930in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6 A[FALL_THROUGH] */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getFieldName() {
        int i9;
        byte[] bArr = this.bytes;
        int i10 = this.nameEnd;
        int i11 = this.nameBegin;
        int i12 = i10 - i11;
        if (!this.nameEscape) {
            return this.nameAscii ? getLatin1String(i11, i12) : new String(bArr, i11, i12, StandardCharsets.UTF_8);
        }
        char[] andSet = this.charBuf;
        if (andSet == null) {
            andSet = JSONFactory.CHARS_UPDATER.getAndSet(this.cacheItem, null);
            this.charBuf = andSet;
        }
        if (andSet == null || andSet.length < i12) {
            andSet = new char[this.nameLength];
            this.charBuf = andSet;
        }
        int i13 = this.nameBegin;
        int i14 = 0;
        while (i13 < this.nameEnd) {
            byte bChar4 = bArr[i13];
            if (bChar4 < 0) {
                switch ((bChar4 & 255) >> 4) {
                    case 12:
                    case 13:
                        byte b10 = bArr[i13 + 1];
                        if ((b10 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                            C0086a.m464w(AbstractC0921a.m2249l(i13, "malformed input around byte "));
                            return null;
                        }
                        i9 = ((bChar4 & 31) << 6) | (b10 & 63);
                        i13 += 2;
                        break;
                        break;
                    case 14:
                        byte b11 = bArr[i13 + 1];
                        int i15 = i13 + 2;
                        byte b12 = bArr[i15];
                        if ((b11 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128 || (b12 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                            C0086a.m464w(AbstractC0921a.m2249l(i15, "malformed input around byte "));
                            return null;
                        }
                        i9 = ((bChar4 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                        i13 += 3;
                        break;
                        break;
                    default:
                        C0086a.m464w(AbstractC0921a.m2249l(i13, "malformed input around byte "));
                        return null;
                }
                andSet[i14] = (char) i9;
            } else {
                if (bChar4 == 92) {
                    int i16 = i13 + 1;
                    byte b13 = (char) bArr[i16];
                    if (b13 == 34 || b13 == 58 || b13 == 64 || b13 == 92) {
                        i13 = i16;
                        bChar4 = b13;
                    } else if (b13 == 117) {
                        byte b14 = bArr[i13 + 2];
                        byte b15 = bArr[i13 + 3];
                        byte b16 = bArr[i13 + 4];
                        i13 += 5;
                        bChar4 = JSONReader.char4(b14, b15, b16, bArr[i13]);
                    } else if (b13 == 120) {
                        byte b17 = bArr[i13 + 2];
                        i13 += 3;
                        bChar4 = JSONReader.char2(b17, bArr[i13]);
                    } else if (b13 != 42 && b13 != 43) {
                        switch (b13) {
                            default:
                                switch (b13) {
                                    case ParserConstants.WHEN /* 60 */:
                                    case ParserConstants.WHILE /* 61 */:
                                    case ParserConstants.INTEGER_LITERAL /* 62 */:
                                        break;
                                    default:
                                        bChar4 = char1(b13);
                                        i13 = i16;
                                        break;
                                }
                            case ParserConstants.PROTECTED /* 45 */:
                            case 46:
                            case 47:
                                break;
                        }
                    }
                } else if (bChar4 == 34) {
                    return new String(andSet, 0, this.nameLength);
                }
                andSet[i14] = (char) bChar4;
                i13++;
            }
            i14++;
        }
        return new String(andSet, 0, this.nameLength);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getLatin1String(int i9, int i10) {
        if (JDKUtils.ANDROID_SDK_INT >= 34) {
            return new String(this.bytes, i9, i10, StandardCharsets.ISO_8859_1);
        }
        char[] andSet = this.charBuf;
        if (andSet == null) {
            andSet = JSONFactory.CHARS_UPDATER.getAndSet(this.cacheItem, null);
            this.charBuf = andSet;
        }
        if (andSet == null || andSet.length < i10) {
            andSet = new char[i10];
            this.charBuf = andSet;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            andSet[i11] = (char) (this.bytes[i9 + i11] & 255);
        }
        return new String(andSet, 0, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long getNameHashCodeLCase() {
        long j3;
        int i9;
        int i10;
        char cChar1;
        int i11;
        int i12;
        long j4;
        long j5;
        int i13 = this.nameBegin;
        byte[] bArr = this.bytes;
        int i14 = (i13 <= 0 || bArr[i13 + (-1)] != '\'') ? '\"' : '\'';
        int i15 = 0;
        long j10 = 0;
        while (i13 < this.end) {
            int iChar4 = bArr[i13];
            if (iChar4 == 92) {
                int i16 = i13 + 1;
                int i17 = bArr[i16];
                if (i17 == 117) {
                    int i18 = bArr[i13 + 2];
                    int i19 = bArr[i13 + 3];
                    int i20 = bArr[i13 + 4];
                    i13 += 5;
                    iChar4 = JSONReader.char4(i18, i19, i20, bArr[i13]);
                } else if (i17 != 120) {
                    iChar4 = char1(i17);
                    i13 = i16;
                } else {
                    int i21 = bArr[i13 + 2];
                    i13 += 3;
                    iChar4 = JSONReader.char2(i21, bArr[i13]);
                }
            } else if (iChar4 == -61 || iChar4 == -62) {
                i13++;
                iChar4 = ((iChar4 & 31) << 6) | (bArr[i13] & '?');
            } else {
                if (iChar4 == i14) {
                }
                if (j10 != 0) {
                    return j10;
                }
                boolean z9 = this.nameAscii;
                long j11 = Fnv.MAGIC_PRIME;
                long j12 = Fnv.MAGIC_HASH_CODE;
                if (z9 && !this.nameEscape) {
                    for (int i22 = this.nameBegin; i22 < this.nameEnd; i22++) {
                        int i23 = bArr[i22];
                        if (i23 >= 65 && i23 <= 90) {
                            i23 += 32;
                        }
                        if ((i23 != 95 && i23 != 45 && i23 != 32) || (i11 = bArr[i22 + 1]) == 34 || i11 == 39 || i11 == i23) {
                            j12 = (j12 ^ ((long) i23)) * Fnv.MAGIC_PRIME;
                        }
                    }
                    return j12;
                }
                while (true) {
                    int i24 = bArr[i13];
                    if (i24 == 92) {
                        int i25 = i13 + 1;
                        int i26 = bArr[i25];
                        if (i26 != 117) {
                            if (i26 != 120) {
                                cChar1 = char1(i26);
                            } else {
                                int i27 = bArr[i13 + 2];
                                int i28 = i13 + 3;
                                char cChar2 = JSONReader.char2(i27, bArr[i28]);
                                i25 = i28;
                                cChar1 = cChar2;
                            }
                            j3 = j11;
                        } else {
                            int i29 = bArr[i13 + 2];
                            int i30 = bArr[i13 + 3];
                            int i31 = bArr[i13 + 4];
                            int i32 = i13 + 5;
                            j3 = j11;
                            char cChar4 = JSONReader.char4(i29, i30, i31, bArr[i32]);
                            i25 = i32;
                            cChar1 = cChar4;
                        }
                        i10 = i25 + 1;
                    } else {
                        j3 = j11;
                        if (i24 == i14) {
                            return j12;
                        }
                        if (i24 >= 0) {
                            if (i24 >= 65 && i24 <= 90) {
                                i24 += 32;
                            }
                            i9 = i13 + 1;
                        } else {
                            switch ((i24 & 255) >> 4) {
                                case 12:
                                case 13:
                                    i24 = ((i24 & 31) << 6) | (bArr[i13 + 1] & '?');
                                    i9 = i13 + 2;
                                    break;
                                case 14:
                                    i24 = ((i24 & 15) << 12) | ((bArr[i13 + 1] & '?') << 6) | (bArr[i13 + 2] & '?');
                                    i9 = i13 + 3;
                                    break;
                                default:
                                    C0086a.m464w(AbstractC0921a.m2249l(i13, "malformed input around byte "));
                                    return 0L;
                            }
                        }
                        int i33 = i24;
                        i10 = i9;
                        cChar1 = i33 == true ? 1 : 0;
                    }
                    if (cChar1 != '_' && cChar1 != '-' && cChar1 != ' ') {
                        j12 = (((long) cChar1) ^ j12) * j3;
                    }
                    i13 = i10;
                    j11 = j3;
                }
            }
            if (i15 >= 8 || iChar4 > 255 || iChar4 < 0 || (i15 == 0 && iChar4 == 0)) {
                i13 = this.nameBegin;
                j10 = 0;
                if (j10 != 0) {
                }
            } else {
                if ((iChar4 != 95 && iChar4 != 45 && iChar4 != 32) || (i12 = bArr[i13 + 1]) == 34 || i12 == 39 || i12 == iChar4) {
                    if (iChar4 >= 65 && iChar4 <= 90) {
                        iChar4 = (char) (iChar4 + 32);
                    }
                    switch (i15) {
                        case 0:
                            j10 = (byte) iChar4;
                            break;
                        case 1:
                            j4 = ((byte) iChar4) << 8;
                            j5 = 255;
                            j10 = (j10 & j5) + j4;
                            break;
                        case 2:
                            j4 = ((byte) iChar4) << JSONB.Constants.BC_INT32_NUM_16;
                            j5 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                            j10 = (j10 & j5) + j4;
                            break;
                        case 3:
                            j4 = ((byte) iChar4) << 24;
                            j5 = 16777215;
                            j10 = (j10 & j5) + j4;
                            break;
                        case 4:
                            j4 = ((long) ((byte) iChar4)) << 32;
                            j5 = 4294967295L;
                            j10 = (j10 & j5) + j4;
                            break;
                        case 5:
                            j4 = ((long) ((byte) iChar4)) << 40;
                            j5 = 1099511627775L;
                            j10 = (j10 & j5) + j4;
                            break;
                        case 6:
                            j4 = ((long) ((byte) iChar4)) << 48;
                            j5 = 281474976710655L;
                            j10 = (j10 & j5) + j4;
                            break;
                        case 7:
                            j4 = ((long) ((byte) iChar4)) << 56;
                            j5 = 72057594037927935L;
                            j10 = (j10 & j5) + j4;
                            break;
                    }
                    i15++;
                }
                i13++;
            }
        }
        if (j10 != 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final int getRawInt() {
        int i9 = this.offset;
        int i10 = i9 + 3;
        byte[] bArr = this.bytes;
        if (i10 < bArr.length) {
            return JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9)) - 1);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final long getRawLong() {
        int i9 = this.offset;
        int i10 = i9 + 8;
        byte[] bArr = this.bytes;
        if (i10 < bArr.length) {
            return JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9)) - 1);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        p012ah.C0086a.m464w(p068eh.AbstractC0921a.m2249l(r1, "malformed input around byte "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        p012ah.C0086a.m464w(p068eh.AbstractC0921a.m2249l(r6, "malformed input around byte "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        return null;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getString() {
        String str = this.stringValue;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.bytes;
        int i9 = this.nameBegin;
        int i10 = this.nameEnd - i9;
        if (!this.nameEscape) {
            return this.nameAscii ? getLatin1String(i9, i10) : new String(bArr, i9, i10, StandardCharsets.UTF_8);
        }
        char[] cArr = new char[this.nameLength];
        int i11 = 0;
        while (true) {
            byte bChar4 = bArr[i9];
            if (bChar4 < 0) {
                int i12 = bChar4 & 255;
                switch (i12 >> 4) {
                    case 12:
                    case 13:
                        byte b10 = bArr[i9 + 1];
                        if ((b10 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                            C0086a.m464w(AbstractC0921a.m2249l(i9, "malformed input around byte "));
                            return null;
                        }
                        i12 = (b10 & 63) | ((bChar4 & 31) << 6);
                        i9 += 2;
                        cArr[i11] = (char) i12;
                        break;
                        break;
                    case 14:
                        byte b11 = bArr[i9 + 1];
                        int i13 = i9 + 2;
                        byte b12 = bArr[i13];
                        if ((b11 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b12 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                            i12 = (b12 & 63) | ((bChar4 & 15) << 12) | ((b11 & 63) << 6);
                            i9 += 3;
                            cArr[i11] = (char) i12;
                        }
                        break;
                    default:
                        if ((bChar4 >> 3) != -2) {
                            i9++;
                            cArr[i11] = (char) i12;
                        } else {
                            byte b13 = bArr[i9 + 1];
                            byte b14 = bArr[i9 + 2];
                            byte b15 = bArr[i9 + 3];
                            i9 += 4;
                            int i14 = (((bChar4 << 18) ^ (b13 << 12)) ^ (b14 << 6)) ^ (3678080 ^ b15);
                            if ((b13 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b14 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b15 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && i14 >= 65536 && i14 < 1114112) {
                                int i15 = i11 + 1;
                                cArr[i11] = (char) ((i14 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                cArr[i15] = (char) ((i14 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                i11 = i15;
                            }
                        }
                        break;
                }
            } else {
                if (bChar4 == 92) {
                    int i16 = i9 + 1;
                    byte b16 = (char) bArr[i16];
                    if (b16 == 34 || b16 == 92) {
                        i9 = i16;
                        bChar4 = b16;
                    } else if (b16 == 117) {
                        byte b17 = bArr[i9 + 2];
                        byte b18 = bArr[i9 + 3];
                        byte b19 = bArr[i9 + 4];
                        i9 += 5;
                        bChar4 = JSONReader.char4(b17, b18, b19, bArr[i9]);
                    } else if (b16 != 120) {
                        bChar4 = char1(b16);
                        i9 = i16;
                    } else {
                        byte b20 = bArr[i9 + 2];
                        i9 += 3;
                        bChar4 = JSONReader.char2(b20, bArr[i9]);
                    }
                } else if (bChar4 == 34) {
                    String str2 = new String(cArr);
                    this.stringValue = str2;
                    return str2;
                }
                cArr[i11] = (char) bChar4;
                i9++;
            }
            i11++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final int getStringLength() {
        int i9;
        byte b10 = this.f1929ch;
        if (b10 != 34 && b10 != 39) {
            C0086a.m464w("date only support string input");
            return 0;
        }
        int i10 = this.offset;
        byte[] bArr = this.bytes;
        int i11 = i10 + 8;
        if (i11 >= this.end || i11 >= bArr.length || bArr[i10] == b10 || bArr[i10 + 1] == b10 || bArr[i10 + 2] == b10 || bArr[i10 + 3] == b10 || bArr[i10 + 4] == b10 || bArr[i10 + 5] == b10 || bArr[i10 + 6] == b10 || bArr[i10 + 7] == b10) {
            i9 = 0;
        } else {
            i9 = 8;
            i10 = i11;
        }
        while (i10 < this.end && bArr[i10] != b10) {
            i10++;
            i9++;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final String info(String str) {
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        while (true) {
            if (i9 >= this.offset || i9 >= this.end) {
                break;
            }
            if (this.bytes[i9] == 10) {
                i10++;
                i11 = 1;
            }
            i9++;
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
        sb2.append(i10);
        sb2.append(", column ");
        sb2.append(i11);
        sb2.append(", fastjson-version 2.0.60");
        sb2.append(i10 <= 1 ? ' ' : '\n');
        byte[] bArr = this.bytes;
        int i12 = this.start;
        int i13 = this.length;
        if (i13 >= 65535) {
            i13 = 65535;
        }
        sb2.append(new String(bArr, i12, i13));
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean isArray() {
        return this.f1929ch == '[';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean isNull() {
        int i9;
        return this.f1929ch == 'n' && (i9 = this.offset) < this.end && this.bytes[i9] == 117;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean isReference() {
        int i9;
        int i10;
        if ((this.context.features & 8589934592L) != 0) {
            return false;
        }
        byte[] bArr = this.bytes;
        if (this.f1929ch != '{' || (i9 = this.offset) == (i10 = this.end)) {
            return false;
        }
        byte b10 = bArr[i9];
        while (b10 <= 32 && ((1 << b10) & 4294981377L) != 0) {
            i9++;
            if (i9 >= i10) {
                return false;
            }
            b10 = bArr[i9];
        }
        if (i9 + 6 < i10 && bArr[i9 + 5] == b10 && JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9) + 1) == REF) {
            return isReference0(bArr, i9, i10, b10);
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
            r9.f1929ch = r0
            r0 = 47
            if (r1 != r0) goto L43
            r9.skipComment()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.next():void");
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
            r0.f1929ch = r2
            r0.offset = r1
            r1 = 47
            if (r3 != r1) goto L7b
            r0.skipComment()
        L7b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfArrayEnd():boolean");
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
            r9.f1929ch = r3
            r9.offset = r2
            r2 = 47
            if (r1 != r2) goto L4c
            r9.skipComment()
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfArrayStart():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public boolean nextIfComma() {
        /*
            r14 = this;
            byte[] r0 = r14.bytes
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
            r14.f1929ch = r0
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
            r14.f1929ch = r2
            r2 = 47
            if (r1 != r2) goto L69
            r14.skipComment()
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfComma():boolean");
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
    public final boolean nextIfInfinity() {
        /*
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            char r2 = r10.f1929ch
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
            r10.f1929ch = r0
            r0 = 1
            return r0
        L74:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfInfinity():boolean");
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
            byte[] r0 = r14.bytes
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
            r14.f1929ch = r15
            r15 = 47
            if (r1 != r15) goto L62
            r14.skipComment()
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatch(char):boolean");
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
    public final boolean nextIfMatchIdent(char r6, char r7, char r8, char r9, char r10, char r11) {
        /*
            r5 = this;
            char r0 = r5.f1929ch
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
            r5.f1929ch = r6
            r6 = 1
            return r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char, char, char, char, char):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match10(long j3) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 12;
        if (i10 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) - 9) != j3 || bArr[i9 + 11] != 58) {
            return false;
        }
        int i11 = i9 + 13;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            int i13 = bArr[i11] & 255;
            i11++;
            i12 = i13;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match11(long j3) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 13;
        if (i10 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) - 10) != j3 || bArr[i9 + 11] != 34 || bArr[i9 + 12] != 58) {
            return false;
        }
        int i11 = i9 + 14;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            int i13 = bArr[i11] & 255;
            i11++;
            i12 = i13;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match12(long j3, byte b10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 14;
        if (i10 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) - 11) != j3 || bArr[i9 + 11] != b10 || bArr[i9 + 12] != 34 || bArr[i9 + 13] != 58) {
            return false;
        }
        int i11 = i9 + 15;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            int i13 = bArr[i11] & 255;
            i11++;
            i12 = i13;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match13(long j3, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 15;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i11;
        if (unsafe.getLong(bArr, (j4 + j5) - 12) != j3 || unsafe.getInt(bArr, (j4 + j5) - 4) != i9) {
            return false;
        }
        int i12 = i10 + 16;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match14(long j3, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 16;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i11;
        if (unsafe.getLong(bArr, (j4 + j5) - 13) != j3 || unsafe.getInt(bArr, (j4 + j5) - 5) != i9 || bArr[i10 + 15] != 58) {
            return false;
        }
        int i12 = i10 + 17;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match15(long j3, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 17;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i11;
        if (unsafe.getLong(bArr, (j4 + j5) - 14) != j3 || unsafe.getInt(bArr, (j4 + j5) - 6) != i9 || bArr[i10 + 15] != 34 || bArr[i10 + 16] != 58) {
            return false;
        }
        int i12 = i10 + 18;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match16(long j3, int i9, byte b10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 18;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j4 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j5 = i11;
        if (unsafe.getLong(bArr, (j4 + j5) - 15) != j3 || unsafe.getInt(bArr, (j4 + j5) - 7) != i9 || bArr[i10 + 15] != b10 || bArr[i10 + 16] != 34 || bArr[i10 + 17] != 58) {
            return false;
        }
        int i12 = i10 + 19;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match17(long j3, long j4) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 19;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i10;
        if (unsafe.getLong(bArr, (j5 + j10) - 16) != j3 || unsafe.getLong(bArr, (j5 + j10) - 8) != j4) {
            return false;
        }
        int i11 = i9 + 20;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match18(long j3, long j4) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 20;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i10;
        if (unsafe.getLong(bArr, (j5 + j10) - 17) != j3 || unsafe.getLong(bArr, (j5 + j10) - 9) != j4 || bArr[i9 + 19] != 58) {
            return false;
        }
        int i11 = i9 + 21;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match19(long j3, long j4) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 21;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i10;
        if (unsafe.getLong(bArr, (j5 + j10) - 18) != j3 || unsafe.getLong(bArr, (j5 + j10) - 10) != j4 || bArr[i9 + 19] != 34 || bArr[i9 + 20] != 58) {
            return false;
        }
        int i11 = i9 + 22;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match2() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 4;
        if (i10 >= this.end || bArr[i9 + 3] != 58) {
            return false;
        }
        int i11 = i9 + 5;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match20(long j3, long j4, byte b10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 22;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i10;
        if (unsafe.getLong(bArr, (j5 + j10) - 19) != j3 || unsafe.getLong(bArr, (j5 + j10) - 11) != j4 || bArr[i9 + 19] != b10 || bArr[i9 + 20] != 34 || bArr[i9 + 21] != 58) {
            return false;
        }
        int i11 = i9 + 23;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match21(long j3, long j4, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 23;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i11;
        if (unsafe.getLong(bArr, (j5 + j10) - 20) != j3 || unsafe.getLong(bArr, (j5 + j10) - 12) != j4 || unsafe.getInt(bArr, (j5 + j10) - 4) != i9) {
            return false;
        }
        int i12 = i10 + 24;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match22(long j3, long j4, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 24;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i11;
        if (unsafe.getLong(bArr, (j5 + j10) - 21) != j3 || unsafe.getLong(bArr, (j5 + j10) - 13) != j4 || unsafe.getInt(bArr, (j5 + j10) - 5) != i9 || bArr[i10 + 23] != 58) {
            return false;
        }
        int i12 = i10 + 25;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match23(long j3, long j4, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 25;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i11;
        if (unsafe.getLong(bArr, (j5 + j10) - 22) != j3 || unsafe.getLong(bArr, (j5 + j10) - 14) != j4 || unsafe.getInt(bArr, (j5 + j10) - 6) != i9 || bArr[i10 + 23] != 34 || bArr[i10 + 24] != 58) {
            return false;
        }
        int i12 = i10 + 26;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match24(long j3, long j4, int i9, byte b10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 26;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j10 = i11;
        if (unsafe.getLong(bArr, (j5 + j10) - 23) != j3 || unsafe.getLong(bArr, (j5 + j10) - 15) != j4 || unsafe.getInt(bArr, (j5 + j10) - 7) != i9 || bArr[i10 + 23] != b10 || bArr[i10 + 24] != 34 || bArr[i10 + 25] != 58) {
            return false;
        }
        int i12 = i10 + 27;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match25(long j3, long j4, long j5) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 27;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j11 = i10;
        if (unsafe.getLong(bArr, (j10 + j11) - 24) != j3 || unsafe.getLong(bArr, (j10 + j11) - 16) != j4 || unsafe.getLong(bArr, (j10 + j11) - 8) != j5) {
            return false;
        }
        int i11 = i9 + 28;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match26(long j3, long j4, long j5) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 28;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j11 = i10;
        if (unsafe.getLong(bArr, (j10 + j11) - 25) != j3 || unsafe.getLong(bArr, (j10 + j11) - 17) != j4 || unsafe.getLong(bArr, (j10 + j11) - 9) != j5 || bArr[i9 + 27] != 58) {
            return false;
        }
        int i11 = i9 + 29;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match27(long j3, long j4, long j5) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 29;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j11 = i10;
        if (unsafe.getLong(bArr, (j10 + j11) - 26) != j3 || unsafe.getLong(bArr, (j10 + j11) - 18) != j4 || unsafe.getLong(bArr, (j10 + j11) - 10) != j5 || bArr[i9 + 27] != 34 || bArr[i9 + 28] != 58) {
            return false;
        }
        int i11 = i9 + 30;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match28(long j3, long j4, long j5, byte b10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 30;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j11 = i10;
        if (unsafe.getLong(bArr, (j10 + j11) - 27) != j3 || unsafe.getLong(bArr, (j10 + j11) - 19) != j4 || unsafe.getLong(bArr, (j10 + j11) - 11) != j5 || bArr[i9 + 27] != b10 || bArr[i9 + 28] != 34 || bArr[i9 + 29] != 58) {
            return false;
        }
        int i11 = i9 + 31;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match29(long j3, long j4, long j5, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 31;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j11 = i11;
        if (unsafe.getLong(bArr, (j10 + j11) - 28) != j3 || unsafe.getLong(bArr, (j10 + j11) - 20) != j4 || unsafe.getLong(bArr, (j10 + j11) - 12) != j5 || unsafe.getInt(bArr, (j10 + j11) - 4) != i9) {
            return false;
        }
        int i12 = i10 + 32;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match3() {
        int i9;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 5;
        if (i11 >= this.end || bArr[i10 + 3] != 34 || bArr[i10 + 4] != 58) {
            return false;
        }
        byte b10 = bArr[i11];
        while (true) {
            i9 = b10 & 255;
            if (i9 > 32 || ((1 << i9) & 4294981377L) == 0) {
                break;
            }
            i11++;
            b10 = bArr[i11];
        }
        this.offset = i11 + 1;
        this.f1929ch = (char) i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match30(long j3, long j4, long j5, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 32;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j11 = i11;
        if (unsafe.getLong(bArr, (j10 + j11) - 29) != j3 || unsafe.getLong(bArr, (j10 + j11) - 21) != j4 || unsafe.getLong(bArr, (j10 + j11) - 13) != j5 || unsafe.getInt(bArr, (j10 + j11) - 5) != i9 || bArr[i10 + 31] != 58) {
            return false;
        }
        int i12 = i10 + 33;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match31(long j3, long j4, long j5, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 33;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j11 = i11;
        if (unsafe.getLong(bArr, (j10 + j11) - 30) != j3 || unsafe.getLong(bArr, (j10 + j11) - 22) != j4 || unsafe.getLong(bArr, (j10 + j11) - 14) != j5 || unsafe.getInt(bArr, (j10 + j11) - 6) != i9 || bArr[i10 + 31] != 34 || bArr[i10 + 32] != 58) {
            return false;
        }
        int i12 = i10 + 34;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match32(long j3, long j4, long j5, int i9, byte b10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 34;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j11 = i11;
        if (unsafe.getLong(bArr, (j10 + j11) - 31) != j3 || unsafe.getLong(bArr, (j10 + j11) - 23) != j4 || unsafe.getLong(bArr, (j10 + j11) - 15) != j5 || unsafe.getInt(bArr, (j10 + j11) - 7) != i9 || bArr[i10 + 31] != b10 || bArr[i10 + 32] != 34 || bArr[i10 + 33] != 58) {
            return false;
        }
        int i12 = i10 + 35;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match33(long j3, long j4, long j5, long j10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 35;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j12 = i10;
        if (unsafe.getLong(bArr, (j11 + j12) - 32) != j3 || unsafe.getLong(bArr, (j11 + j12) - 24) != j4 || unsafe.getLong(bArr, (j11 + j12) - 16) != j5 || unsafe.getLong(bArr, (j11 + j12) - 8) != j10) {
            return false;
        }
        int i11 = i9 + 36;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match34(long j3, long j4, long j5, long j10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 36;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j12 = i10;
        if (unsafe.getLong(bArr, (j11 + j12) - 33) != j3 || unsafe.getLong(bArr, (j11 + j12) - 25) != j4 || unsafe.getLong(bArr, (j11 + j12) - 17) != j5 || unsafe.getLong(bArr, (j11 + j12) - 9) != j10 || bArr[i9 + 35] != 58) {
            return false;
        }
        int i11 = i9 + 37;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match35(long j3, long j4, long j5, long j10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 37;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j12 = i10;
        if (unsafe.getLong(bArr, (j11 + j12) - 34) != j3 || unsafe.getLong(bArr, (j11 + j12) - 26) != j4 || unsafe.getLong(bArr, (j11 + j12) - 18) != j5 || unsafe.getLong(bArr, (j11 + j12) - 10) != j10 || bArr[i9 + 35] != 34 || bArr[i9 + 36] != 58) {
            return false;
        }
        int i11 = i9 + 38;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match36(long j3, long j4, long j5, long j10, byte b10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 38;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j12 = i10;
        if (unsafe.getLong(bArr, (j11 + j12) - 35) != j3 || unsafe.getLong(bArr, (j11 + j12) - 27) != j4 || unsafe.getLong(bArr, (j11 + j12) - 19) != j5 || unsafe.getLong(bArr, (j11 + j12) - 11) != j10 || bArr[i9 + 35] != b10 || bArr[i9 + 36] != 34 || bArr[i9 + 37] != 58) {
            return false;
        }
        int i11 = i9 + 39;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match37(long j3, long j4, long j5, long j10, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 39;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j12 = i11;
        if (unsafe.getLong(bArr, (j11 + j12) - 36) != j3 || unsafe.getLong(bArr, (j11 + j12) - 28) != j4 || unsafe.getLong(bArr, (j11 + j12) - 20) != j5 || unsafe.getLong(bArr, (j11 + j12) - 12) != j10 || unsafe.getInt(bArr, (j11 + j12) - 4) != i9) {
            return false;
        }
        int i12 = i10 + 40;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match38(long j3, long j4, long j5, long j10, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 40;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j12 = i11;
        if (unsafe.getLong(bArr, (j11 + j12) - 37) != j3 || unsafe.getLong(bArr, (j11 + j12) - 29) != j4 || unsafe.getLong(bArr, (j11 + j12) - 21) != j5 || unsafe.getLong(bArr, (j11 + j12) - 13) != j10 || unsafe.getInt(bArr, (j11 + j12) - 5) != i9 || bArr[i10 + 39] != 58) {
            return false;
        }
        int i12 = i10 + 41;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match39(long j3, long j4, long j5, long j10, int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 41;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j12 = i11;
        if (unsafe.getLong(bArr, (j11 + j12) - 38) != j3 || unsafe.getLong(bArr, (j11 + j12) - 30) != j4 || unsafe.getLong(bArr, (j11 + j12) - 22) != j5 || unsafe.getLong(bArr, (j11 + j12) - 14) != j10 || unsafe.getInt(bArr, (j11 + j12) - 6) != i9 || bArr[i10 + 39] != 34 || bArr[i10 + 40] != 58) {
            return false;
        }
        int i12 = i10 + 42;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match4(byte b10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 6;
        if (i10 >= this.end || bArr[i9 + 3] != b10 || bArr[i9 + 4] != 34 || bArr[i9 + 5] != 58) {
            return false;
        }
        int i11 = i9 + 7;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            int i13 = i11 + 1;
            int i14 = bArr[i11] & 255;
            i11 = i13;
            i12 = i14;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match40(long j3, long j4, long j5, long j10, int i9, byte b10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 42;
        if (i11 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j12 = i11;
        if (unsafe.getLong(bArr, (j11 + j12) - 39) != j3 || unsafe.getLong(bArr, (j11 + j12) - 31) != j4 || unsafe.getLong(bArr, (j11 + j12) - 23) != j5 || unsafe.getLong(bArr, (j11 + j12) - 15) != j10 || unsafe.getInt(bArr, (j11 + j12) - 7) != i9 || bArr[i10 + 39] != b10 || bArr[i10 + 40] != 34 || bArr[i10 + 41] != 58) {
            return false;
        }
        int i12 = i10 + 43;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            i13 = bArr[i12] & 255;
            i12++;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match41(long j3, long j4, long j5, long j10, long j11) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 43;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j13 = i10;
        if (unsafe.getLong(bArr, (j12 + j13) - 40) != j3 || unsafe.getLong(bArr, (j12 + j13) - 32) != j4 || unsafe.getLong(bArr, (j12 + j13) - 24) != j5 || unsafe.getLong(bArr, (j12 + j13) - 16) != j10 || unsafe.getLong(bArr, (j12 + j13) - 8) != j11) {
            return false;
        }
        int i11 = i9 + 44;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match42(long j3, long j4, long j5, long j10, long j11) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 44;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j13 = i10;
        if (unsafe.getLong(bArr, (j12 + j13) - 41) != j3 || unsafe.getLong(bArr, (j12 + j13) - 33) != j4 || unsafe.getLong(bArr, (j12 + j13) - 25) != j5 || unsafe.getLong(bArr, (j12 + j13) - 17) != j10 || unsafe.getLong(bArr, (j12 + j13) - 9) != j11 || bArr[i9 + 43] != 58) {
            return false;
        }
        int i11 = i9 + 45;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match43(long j3, long j4, long j5, long j10, long j11) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 45;
        if (i10 >= this.end) {
            return false;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j12 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j13 = i10;
        if (unsafe.getLong(bArr, (j12 + j13) - 42) != j3 || unsafe.getLong(bArr, (j12 + j13) - 34) != j4 || unsafe.getLong(bArr, (j12 + j13) - 26) != j5 || unsafe.getLong(bArr, (j12 + j13) - 18) != j10 || unsafe.getLong(bArr, (j12 + j13) - 10) != j11 || bArr[i9 + 43] != 34 || bArr[i9 + 44] != 58) {
            return false;
        }
        int i11 = i9 + 46;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i12 = bArr[i11] & 255;
            i11++;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match5(int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 7;
        if (i11 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11)) - 4) != i9) {
            return false;
        }
        int i12 = i10 + 8;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            int i14 = i12 + 1;
            int i15 = bArr[i12] & 255;
            i12 = i14;
            i13 = i15;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match6(int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 8;
        if (i11 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11)) - 5) != i9 || bArr[i10 + 7] != 58) {
            return false;
        }
        int i12 = i10 + 9;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            int i14 = i12 + 1;
            int i15 = bArr[i12] & 255;
            i12 = i14;
            i13 = i15;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match7(int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 9;
        if (i11 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11)) - 6) != i9 || bArr[i10 + 7] != 34 || bArr[i10 + 8] != 58) {
            return false;
        }
        int i12 = i10 + 10;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            int i14 = i12 + 1;
            int i15 = bArr[i12] & 255;
            i12 = i14;
            i13 = i15;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match8(int i9, byte b10) {
        int i10 = this.offset;
        int i11 = i10 + 10;
        if (i11 >= this.end) {
            return false;
        }
        byte[] bArr = this.bytes;
        if (JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11)) - 7) != i9 || bArr[i10 + 7] != b10 || bArr[i10 + 8] != 34 || bArr[i10 + 9] != 58) {
            return false;
        }
        int i12 = i10 + 11;
        int i13 = bArr[i11] & 255;
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            int i14 = bArr[i12] & 255;
            i12++;
            i13 = i14;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match9(long j3) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 11;
        if (i10 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) - 8) != j3) {
            return false;
        }
        int i11 = i9 + 12;
        int i12 = bArr[i10] & 255;
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            int i13 = bArr[i11] & 255;
            i11++;
            i12 = i13;
        }
        this.offset = i11;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match0() {
        int i9;
        byte[] bArr = this.bytes;
        int i10 = this.offset + 7;
        if (i10 == this.end) {
            this.f1929ch = (char) 26;
            return false;
        }
        byte b10 = bArr[i10];
        while (true) {
            i9 = b10 & 255;
            if (i9 > 32 || ((1 << i9) & 4294981377L) == 0) {
                break;
            }
            i10++;
            b10 = bArr[i10];
        }
        this.offset = i10 + 1;
        this.f1929ch = (char) i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match1() {
        int i9;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 8;
        if (i11 >= this.end || bArr[i10 + 7] != 58) {
            return false;
        }
        byte b10 = bArr[i11];
        while (true) {
            i9 = b10 & 255;
            if (i9 > 32 || ((1 << i9) & 4294981377L) == 0) {
                break;
            }
            i11++;
            b10 = bArr[i11];
        }
        this.offset = i11 + 1;
        this.f1929ch = (char) i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match2() {
        int i9;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 9;
        if (i11 >= this.end || bArr[i10 + 7] != 34 || bArr[i10 + 8] != 58) {
            return false;
        }
        byte b10 = bArr[i11];
        while (true) {
            i9 = b10 & 255;
            if (i9 > 32 || ((1 << i9) & 4294981377L) == 0) {
                break;
            }
            i11++;
            b10 = bArr[i11];
        }
        this.offset = i11 + 1;
        this.f1929ch = (char) i9;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfNull() {
        if (this.f1929ch != 'n') {
            return false;
        }
        int i9 = this.offset;
        if (i9 + 2 >= this.end || this.bytes[i9] != 117) {
            return false;
        }
        readNull();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:55:0x0094) to fix multi-entry loop: BACK_EDGE: B:62:0x00aa -> B:55:0x0094 */
    /* JADX DEBUG: Duplicate block (B:57:0x009a) to fix multi-entry loop: BACK_EDGE: B:57:0x009a -> B:58:0x009f */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x007c -> B:39:0x0060). Please report as a decompilation issue!!! */
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
            byte[] r4 = r0.bytes
            r5 = 117(0x75, float:1.64E-43)
            r6 = 0
            r7 = 108(0x6c, float:1.51E-43)
            r8 = 1
            r9 = 110(0x6e, float:1.54E-43)
            if (r1 != r9) goto L29
            int r10 = r3 + 2
            if (r10 >= r2) goto L29
            r11 = r4[r3]
            if (r11 != r5) goto L29
            int r11 = r3 + 1
            r11 = r4[r11]
            if (r11 != r7) goto L29
            r10 = r4[r10]
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
            r10 = r4[r3]
            if (r10 != r1) goto L3b
            int r3 = r3 + r8
            goto L5b
        L3b:
            int r10 = r3 + 4
            if (r10 >= r2) goto Lbe
            r11 = r4[r3]
            if (r11 != r9) goto Lbe
            int r9 = r3 + 1
            r9 = r4[r9]
            if (r9 != r5) goto Lbe
            int r5 = r3 + 2
            r5 = r4[r5]
            if (r5 != r7) goto Lbe
            int r5 = r3 + 3
            r5 = r4[r5]
            if (r5 != r7) goto Lbe
            r5 = r4[r10]
            if (r5 != r1) goto Lbe
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
            r3 = r4[r3]
        L66:
            r9 = 0
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r7 = 32
            if (r3 < 0) goto L89
            if (r3 > r7) goto L89
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r15 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r15 == 0) goto L89
            if (r5 != r2) goto L7f
            goto L60
        L7f:
            int r3 = r5 + 1
            r5 = r4[r5]
            r17 = r5
            r5 = r3
            r3 = r17
            goto L66
        L89:
            r15 = 44
            if (r3 != r15) goto L8e
            r6 = r8
        L8e:
            r0.comma = r6
            if (r6 == 0) goto L9f
            if (r5 != r2) goto L96
        L94:
            r3 = r1
            goto L9f
        L96:
            int r3 = r5 + 1
            r5 = r4[r5]
        L9a:
            r17 = r5
            r5 = r3
            r3 = r17
        L9f:
            if (r3 < 0) goto Lb2
            if (r3 > r7) goto Lb2
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r6 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r6 == 0) goto Lb2
            if (r5 != r2) goto Lad
            goto L94
        Lad:
            int r3 = r5 + 1
            r5 = r4[r5]
            goto L9a
        Lb2:
            if (r3 >= 0) goto Lb8
            r0.char_utf8(r3, r5)
            return r8
        Lb8:
            r0.offset = r5
            char r1 = (char) r3
            r0.f1929ch = r1
            return r8
        Lbe:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfNullOrEmptyString():boolean");
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
            byte[] r2 = r0.bytes
            int r3 = r0.offset
            r4 = 125(0x7d, float:1.75E-43)
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
            r0.f1929ch = r2
            r0.offset = r1
            r1 = 47
            if (r3 != r1) goto L7b
            r0.skipComment()
        L7b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfObjectEnd():boolean");
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
            r9.f1929ch = r3
            r9.offset = r2
            r2 = 47
            if (r1 != r2) goto L4c
            r9.skipComment()
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfObjectStart():boolean");
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
    public final boolean nextIfSet() {
        /*
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            char r2 = r10.f1929ch
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
            r10.f1929ch = r0
            r0 = 1
            return r0
        L50:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfSet():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:26:0x0057) to fix multi-entry loop: BACK_EDGE: B:26:0x0057 -> B:21:0x0040 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match10(long j3) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 11;
        if (i10 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) - 8) != j3) {
            return false;
        }
        int i11 = bArr[i10] & 255;
        if (i11 != 44 && i11 != 125 && i11 != 93) {
            return false;
        }
        if (i11 == 44) {
            this.comma = true;
            i10 = i9 + 12;
            i11 = i10 == this.end ? 26 : bArr[i10] & 255;
        }
        while (i11 <= 32 && ((1 << i11) & 4294981377L) != 0) {
            i10++;
            i11 = bArr[i10] & 255;
        }
        this.offset = i10 + 1;
        this.f1929ch = (char) i11;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:28:0x005f) to fix multi-entry loop: BACK_EDGE: B:28:0x005f -> B:23:0x0048 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match11(long j3) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 12;
        if (i10 >= this.end || JDKUtils.UNSAFE.getLong(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) - 9) != j3 || bArr[i9 + 11] != 34) {
            return false;
        }
        int i11 = bArr[i10] & 255;
        if (i11 != 44 && i11 != 125 && i11 != 93) {
            return false;
        }
        if (i11 == 44) {
            this.comma = true;
            i10 = i9 + 13;
            i11 = i10 == this.end ? 26 : bArr[i10] & 255;
        }
        while (i11 <= 32 && ((1 << i11) & 4294981377L) != 0) {
            i10++;
            i11 = bArr[i10] & 255;
        }
        this.offset = i10 + 1;
        this.f1929ch = (char) i11;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:23:0x0046) to fix multi-entry loop: BACK_EDGE: B:23:0x0046 -> B:18:0x002f */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match2() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 3;
        int i11 = this.end;
        if (i10 >= i11) {
            return false;
        }
        int i12 = i9 + 4;
        int i13 = bArr[i10] & 255;
        if (i13 != 44 && i13 != 125 && i13 != 93) {
            return false;
        }
        if (i13 == 44) {
            this.comma = true;
            if (i12 == i11) {
                i13 = 26;
            } else {
                int i14 = i9 + 5;
                i13 = bArr[i12] & 255;
                i12 = i14;
            }
        }
        while (i13 <= 32 && ((1 << i13) & 4294981377L) != 0) {
            int i15 = i12 + 1;
            i13 = bArr[i12] & 255;
            i12 = i15;
        }
        this.offset = i12;
        this.f1929ch = (char) i13;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match3() {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 4;
        int i11 = this.end;
        if (i10 >= i11 || bArr[i9 + 3] != 34) {
            return false;
        }
        int i12 = bArr[i10] & 255;
        if (i12 != 44 && i12 != 125 && i12 != 93) {
            return false;
        }
        if (i12 == 44) {
            this.comma = true;
            i10 = i9 + 5;
            i12 = i10 == i11 ? 26 : bArr[i10] & 255;
        }
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i10++;
            i12 = bArr[i10] & 255;
        }
        this.offset = i10 + 1;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:28:0x0052) to fix multi-entry loop: BACK_EDGE: B:28:0x0052 -> B:23:0x003b */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match4(byte b10) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 5;
        int i11 = this.end;
        boolean z9 = false;
        if (i10 >= i11) {
            return false;
        }
        if (bArr[i9 + 3] == b10 && bArr[i9 + 4] == 34) {
            int i12 = bArr[i10] & 255;
            if (i12 != 44 && i12 != 125 && i12 != 93) {
                return false;
            }
            z9 = true;
            if (i12 == 44) {
                this.comma = true;
                i10 = i9 + 6;
                i12 = i10 == i11 ? 26 : bArr[i10] & 255;
            }
            while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
                i10++;
                i12 = bArr[i10] & 255;
            }
            this.offset = i10 + 1;
            this.f1929ch = (char) i12;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:30:0x0058) to fix multi-entry loop: BACK_EDGE: B:30:0x0058 -> B:25:0x0041 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match5(byte b10, byte b11) {
        byte[] bArr = this.bytes;
        int i9 = this.offset;
        int i10 = i9 + 6;
        int i11 = this.end;
        boolean z9 = false;
        if (i10 >= i11) {
            return false;
        }
        if (bArr[i9 + 3] == b10 && bArr[i9 + 4] == b11 && bArr[i9 + 5] == 34) {
            int i12 = bArr[i10] & 255;
            if (i12 != 44 && i12 != 125 && i12 != 93) {
                return false;
            }
            z9 = true;
            if (i12 == 44) {
                this.comma = true;
                i10 = i9 + 7;
                i12 = i10 == i11 ? 26 : bArr[i10] & 255;
            }
            while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
                i10++;
                i12 = bArr[i10] & 255;
            }
            this.offset = i10 + 1;
            this.f1929ch = (char) i12;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:26:0x0055) to fix multi-entry loop: BACK_EDGE: B:26:0x0055 -> B:21:0x003e */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match6(int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 7;
        if (i11 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11)) - 4) != i9) {
            return false;
        }
        int i12 = bArr[i11] & 255;
        if (i12 != 44 && i12 != 125 && i12 != 93) {
            return false;
        }
        if (i12 == 44) {
            this.comma = true;
            i11 = i10 + 8;
            i12 = i11 == this.end ? 26 : bArr[i11] & 255;
        }
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i11++;
            i12 = bArr[i11] & 255;
        }
        this.offset = i11 + 1;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:28:0x005d) to fix multi-entry loop: BACK_EDGE: B:28:0x005d -> B:23:0x0046 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match7(int i9) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 8;
        boolean z9 = false;
        if (i11 >= this.end) {
            return false;
        }
        if (JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11)) - 5) == i9 && bArr[i10 + 7] == 34) {
            int i12 = bArr[i11] & 255;
            if (i12 != 44 && i12 != 125 && i12 != 93) {
                return false;
            }
            z9 = true;
            if (i12 == 44) {
                this.comma = true;
                i11 = i10 + 9;
                i12 = i11 == this.end ? 26 : bArr[i11] & 255;
            }
            while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
                i11++;
                i12 = bArr[i11] & 255;
            }
            this.offset = i11 + 1;
            this.f1929ch = (char) i12;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:30:0x0063) to fix multi-entry loop: BACK_EDGE: B:30:0x0063 -> B:25:0x004c */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match8(int i9, byte b10) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 9;
        if (i11 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11)) - 6) != i9 || bArr[i10 + 7] != b10 || bArr[i10 + 8] != 34) {
            return false;
        }
        int i12 = bArr[i11] & 255;
        if (i12 != 44 && i12 != 125 && i12 != 93) {
            return false;
        }
        if (i12 == 44) {
            this.comma = true;
            i11 = i10 + 10;
            i12 = i11 == this.end ? 26 : bArr[i11] & 255;
        }
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i11++;
            i12 = bArr[i11] & 255;
        }
        this.offset = i11 + 1;
        this.f1929ch = (char) i12;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:32:0x0069) to fix multi-entry loop: BACK_EDGE: B:32:0x0069 -> B:27:0x0052 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match9(int i9, byte b10, byte b11) {
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        int i11 = i10 + 10;
        if (i11 >= this.end || JDKUtils.UNSAFE.getInt(bArr, (JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11)) - 7) != i9 || bArr[i10 + 7] != b10 || bArr[i10 + 8] != b11 || bArr[i10 + 9] != 34) {
            return false;
        }
        int i12 = bArr[i11] & 255;
        if (i12 != 44 && i12 != 125 && i12 != 93) {
            return false;
        }
        if (i12 == 44) {
            this.comma = true;
            i11 = i10 + 11;
            i12 = i11 == this.end ? 26 : bArr[i11] & 255;
        }
        while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
            i11++;
            i12 = bArr[i11] & 255;
        }
        this.offset = i11 + 1;
        this.f1929ch = (char) i12;
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
            r9.f1929ch = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextWithoutComment():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:205:0x02a9) to fix multi-entry loop: BACK_EDGE: B:205:0x02a9 -> B:207:0x02ae */
    /* JADX DEBUG: Duplicate block (B:232:0x02f9) to fix multi-entry loop: BACK_EDGE: B:232:0x02f9 -> B:224:0x02e2 */
    /* JADX WARN: Path cross not found for [B:201:0x029e, B:251:?], limit reached: 255 */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[LOOP:0: B:26:0x0059->B:41:0x0090, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x02c4 -> B:203:0x02a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:208:0x02b7
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
    public final java.math.BigDecimal readBigDecimal() {
        /*
            r28 = this;
            r1 = r28
            byte[] r0 = r1.bytes
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
            goto L33
        L17:
            int r4 = r3 + 1
            r9 = r0[r3]
            if (r9 != r2) goto L31
            int r2 = r1.end
            if (r4 != r2) goto L24
            r6 = 26
            goto L29
        L24:
            int r3 = r3 + r5
            r0 = r0[r4]
            char r6 = (char) r0
            r4 = r3
        L29:
            r1.f1929ch = r6
            r1.offset = r4
            r1.nextIfComma()
            return r8
        L31:
            r3 = r2
            r2 = r9
        L33:
            r9 = 43
            r10 = 45
            r11 = 1
            if (r2 != r10) goto L46
            r1.negative = r11
            int r2 = r4 + 1
            r12 = r0[r4]
        L40:
            r27 = r12
            r12 = r2
            r2 = r27
            goto L50
        L46:
            r1.negative = r7
            if (r2 != r9) goto L4f
            int r2 = r4 + 1
            r12 = r0[r4]
            goto L40
        L4f:
            r12 = r4
        L50:
            r1.valueType = r11
            r13 = 0
            r15 = r7
            r18 = r15
            r16 = r13
        L59:
            r19 = 31
            r6 = 57
            r20 = 10
            r22 = r8
            r8 = 48
            if (r2 < r8) goto L9d
            if (r2 > r6) goto L9d
            if (r15 != 0) goto L7b
            long r23 = r16 * r20
            long r25 = r16 | r20
            long r25 = r25 >>> r19
            int r18 = (r25 > r13 ? 1 : (r25 == r13 ? 0 : -1))
            if (r18 == 0) goto L7e
            long r25 = r23 / r20
            int r18 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r18 != 0) goto L7a
            goto L7e
        L7a:
            r15 = r11
        L7b:
            r25 = r13
            goto L85
        L7e:
            int r2 = r2 + (-48)
            r25 = r13
            long r13 = (long) r2
            long r16 = r23 + r13
        L85:
            int r2 = r1.end
            if (r12 != r2) goto L90
            int r12 = r12 + 1
            r18 = r11
            r2 = 26
            goto L9f
        L90:
            int r2 = r12 + 1
            r6 = r0[r12]
            r12 = r2
            r2 = r6
            r18 = r11
            r8 = r22
            r13 = r25
            goto L59
        L9d:
            r25 = r13
        L9f:
            int r13 = (r16 > r25 ? 1 : (r16 == r25 ? 0 : -1))
            if (r13 >= 0) goto La4
            r15 = r11
        La4:
            r1.scale = r7
            r13 = 46
            if (r2 != r13) goto Lf3
            r1.valueType = r5
            int r2 = r12 + 1
            r12 = r0[r12]
            r27 = r12
            r12 = r2
            r2 = r27
        Lb5:
            if (r2 < r8) goto Lf3
            if (r2 > r6) goto Lf3
            short r13 = r1.scale
            int r13 = r13 + r11
            short r13 = (short) r13
            r1.scale = r13
            if (r15 != 0) goto Lda
            long r13 = r16 * r20
            long r23 = r16 | r20
            long r23 = r23 >>> r19
            int r18 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r18 == 0) goto Ld4
            long r23 = r13 / r20
            int r18 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r18 != 0) goto Ld2
            goto Ld4
        Ld2:
            r15 = r11
            goto Lda
        Ld4:
            int r2 = r2 + (-48)
            long r5 = (long) r2
            long r13 = r13 + r5
            r16 = r13
        Lda:
            int r2 = r1.end
            if (r12 != r2) goto Le7
            int r12 = r12 + 1
            r18 = r11
            r5 = r16
            r2 = 26
            goto Lf5
        Le7:
            int r2 = r12 + 1
            r5 = r0[r12]
            r12 = r2
            r2 = r5
            r18 = r11
            r5 = 2
            r6 = 57
            goto Lb5
        Lf3:
            r5 = r16
        Lf5:
            r13 = 101(0x65, float:1.42E-43)
            if (r2 == r13) goto L100
            r14 = 69
            if (r2 != r14) goto Lfe
            goto L100
        Lfe:
            r9 = r7
            goto L153
        L100:
            int r2 = r12 + 1
            r14 = r0[r12]
            if (r14 != r10) goto L108
            r10 = r11
            goto L109
        L108:
            r10 = r7
        L109:
            if (r10 != 0) goto L110
            if (r14 != r9) goto L10e
            goto L110
        L10e:
            r9 = r7
            goto L116
        L110:
            int r12 = r12 + 2
            r14 = r0[r2]
            r9 = r7
            r2 = r12
        L116:
            if (r14 < r8) goto L148
            r12 = 57
            if (r14 > r12) goto L148
            int r14 = r14 + (-48)
            int r9 = r9 * 10
            int r9 = r9 + r14
            r14 = 2047(0x7ff, float:2.868E-42)
            if (r9 > r14) goto L13d
            int r14 = r1.end
            if (r2 != r14) goto L131
            int r2 = r2 + 1
            r12 = r2
            r18 = r11
            r2 = 26
            goto L14a
        L131:
            int r14 = r2 + 1
            r2 = r0[r2]
            r18 = r14
            r14 = r2
            r2 = r18
            r18 = r11
            goto L116
        L13d:
            java.lang.String r0 = "too large exp value : "
            java.lang.String r0 = p068eh.AbstractC0921a.m2249l(r9, r0)
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        L148:
            r12 = r2
            r2 = r14
        L14a:
            if (r10 == 0) goto L14d
            int r9 = -r9
        L14d:
            short r8 = (short) r9
            r1.exponent = r8
            r8 = 2
            r1.valueType = r8
        L153:
            if (r12 != r4) goto L239
            r8 = 110(0x6e, float:1.54E-43)
            r10 = 117(0x75, float:1.64E-43)
            r14 = 108(0x6c, float:1.51E-43)
            if (r2 != r8) goto L1a2
            int r8 = r12 + 1
            r7 = r0[r12]
            if (r7 != r10) goto L19e
            int r7 = r12 + 2
            r8 = r0[r8]
            if (r8 != r14) goto L1a0
            int r8 = r12 + 3
            r7 = r0[r7]
            if (r7 != r14) goto L19e
            com.alibaba.fastjson2.JSONReader$Context r2 = r1.context
            long r13 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            r19 = r12
            long r11 = r2.mask
            long r10 = r13 & r11
            int r2 = (r10 > r25 ? 1 : (r10 == r25 ? 0 : -1))
            if (r2 != 0) goto L193
            r2 = 1
            r1.wasNull = r2
            int r2 = r1.end
            if (r8 != r2) goto L189
            r2 = 26
            goto L18b
        L189:
            r2 = r0[r8]
        L18b:
            int r12 = r19 + 4
        L18d:
            r7 = 0
            r8 = 1
            r18 = 1
            goto L23c
        L193:
            java.lang.String r0 = "long value not support input null"
            java.lang.String r0 = r1.info(r0)
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        L19e:
            r12 = r8
            goto L1a4
        L1a0:
            r12 = r7
            goto L1a4
        L1a2:
            r19 = r12
        L1a4:
            r7 = 116(0x74, float:1.63E-43)
            if (r2 != r7) goto L1cf
            int r7 = r12 + 3
            int r8 = r1.end
            if (r7 > r8) goto L1cf
            r11 = r0[r12]
            r14 = 114(0x72, float:1.6E-43)
            if (r11 != r14) goto L1cf
            int r11 = r12 + 1
            r11 = r0[r11]
            if (r11 != r10) goto L1cf
            int r10 = r12 + 2
            r10 = r0[r10]
            if (r10 != r13) goto L1cf
            java.math.BigDecimal r2 = java.math.BigDecimal.ONE
            if (r7 != r8) goto L1c7
            r7 = 26
            goto L1c9
        L1c7:
            r7 = r0[r7]
        L1c9:
            int r12 = r12 + 4
        L1cb:
            r22 = r2
            r2 = r7
            goto L18d
        L1cf:
            r7 = 102(0x66, float:1.43E-43)
            if (r2 != r7) goto L201
            int r7 = r12 + 4
            int r8 = r1.end
            if (r7 > r8) goto L201
            r10 = r0[r12]
            r11 = 97
            if (r10 != r11) goto L201
            int r10 = r12 + 1
            r10 = r0[r10]
            r11 = 108(0x6c, float:1.51E-43)
            if (r10 != r11) goto L201
            int r10 = r12 + 2
            r10 = r0[r10]
            r11 = 115(0x73, float:1.61E-43)
            if (r10 != r11) goto L201
            int r10 = r12 + 3
            r10 = r0[r10]
            if (r10 != r13) goto L201
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            if (r7 != r8) goto L1fc
            r7 = 26
            goto L1fe
        L1fc:
            r7 = r0[r7]
        L1fe:
            int r12 = r12 + 5
            goto L1cb
        L201:
            r7 = 123(0x7b, float:1.72E-43)
            if (r2 != r7) goto L219
            if (r3 != 0) goto L219
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
            r2 = r25
            r1.readObject(r0, r2)
            r7 = 0
            r1.wasNull = r7
            java.math.BigDecimal r0 = r1.decimal(r0)
            return r0
        L219:
            r7 = 0
            r8 = 91
            if (r2 != r8) goto L237
            if (r3 != 0) goto L237
            java.util.List r0 = r1.readArray()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22e
            r2 = 1
            r1.wasNull = r2
            return r22
        L22e:
            java.lang.String r0 = r1.info()
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        L237:
            r8 = r7
            goto L23c
        L239:
            r19 = r12
            goto L237
        L23c:
            int r10 = r12 - r4
            if (r3 == 0) goto L266
            if (r2 == r3) goto L259
            java.lang.String r0 = r1.readString()
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)     // Catch: java.lang.NumberFormatException -> L24b
            return r0
        L24b:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r2 = r1.info(r2)
            p012ah.C0086a.m465x(r2, r0)
            r0 = 0
            return r0
        L259:
            int r2 = r1.end
            if (r12 < r2) goto L260
            r2 = 26
            goto L266
        L260:
            int r2 = r12 + 1
            r3 = r0[r12]
            r12 = r2
            r2 = r3
        L266:
            if (r8 != 0) goto L2ac
            if (r9 != 0) goto L27e
            if (r15 != 0) goto L27e
            r25 = 0
            int r3 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r3 == 0) goto L27e
            boolean r3 = r1.negative
            if (r3 == 0) goto L277
            long r5 = -r5
        L277:
            short r3 = r1.scale
            java.math.BigDecimal r22 = java.math.BigDecimal.valueOf(r5, r3)
            r8 = 1
        L27e:
            r17 = 1
            if (r8 != 0) goto L28a
            int r4 = r4 + (-1)
            java.math.BigDecimal r3 = com.alibaba.fastjson2.util.TypeUtils.parseBigDecimal(r0, r4, r10)
            r22 = r3
        L28a:
            r3 = 76
            if (r2 == r3) goto L29e
            r3 = 70
            if (r2 == r3) goto L29e
            r3 = 68
            if (r2 == r3) goto L29e
            r3 = 66
            if (r2 == r3) goto L29e
            r3 = 83
            if (r2 != r3) goto L2ae
        L29e:
            int r2 = r1.end
            if (r12 < r2) goto L2a5
        L2a2:
            r2 = 26
            goto L2ae
        L2a5:
            int r2 = r12 + 1
            r3 = r0[r12]
        L2a9:
            r12 = r2
            r2 = r3
            goto L2ae
        L2ac:
            r17 = 1
        L2ae:
            r3 = 4294981377(0x100003701, double:2.122002748E-314)
            r5 = 1
            r8 = 32
            if (r2 > r8) goto L2cc
            long r9 = r5 << r2
            long r9 = r9 & r3
            r25 = 0
            int r9 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r9 == 0) goto L2cc
            int r2 = r1.end
            if (r12 != r2) goto L2c7
            goto L2a2
        L2c7:
            int r2 = r12 + 1
            r3 = r0[r12]
            goto L2a9
        L2cc:
            r9 = 44
            if (r2 != r9) goto L2d2
            r7 = r17
        L2d2:
            r1.comma = r7
            if (r7 == 0) goto L2fb
            int r2 = r1.end
            if (r12 != r2) goto L2dd
            r7 = 26
            goto L2e2
        L2dd:
            int r2 = r12 + 1
            r7 = r0[r12]
            goto L2f9
        L2e2:
            r2 = r7
        L2e3:
            if (r2 > r8) goto L2fb
            long r9 = r5 << r2
            long r9 = r9 & r3
            r25 = 0
            int r7 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r7 == 0) goto L2fb
            int r2 = r1.end
            if (r12 != r2) goto L2f5
            r2 = 26
            goto L2e3
        L2f5:
            int r2 = r12 + 1
            r7 = r0[r12]
        L2f9:
            r12 = r2
            goto L2e2
        L2fb:
            if (r18 == 0) goto L303
            char r0 = (char) r2
            r1.f1929ch = r0
            r1.offset = r12
            return r22
        L303:
            java.lang.String r0 = "illegal input error"
            java.lang.String r0 = r1.info(r0)
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readBigDecimal():java.math.BigDecimal");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:90:0x0108) to fix multi-entry loop: BACK_EDGE: B:90:0x0108 -> B:91:0x0109 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00e8 -> B:71:0x00cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0114 -> B:88:0x0102). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:74:0x00dd
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
    public final boolean readBoolValue() {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r0.wasNull = r1
            byte[] r2 = r0.bytes
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
            r11 = r2[r3]
            r12 = 114(0x72, float:1.6E-43)
            if (r11 != r12) goto L30
            int r11 = r3 + 1
            r11 = r2[r11]
            if (r11 != r7) goto L30
            r5 = r2[r5]
            if (r5 != r6) goto L30
            int r3 = r3 + 3
        L2d:
            r4 = r10
            goto Lc6
        L30:
            r5 = 102(0x66, float:1.43E-43)
            r11 = 108(0x6c, float:1.51E-43)
            if (r4 != r5) goto L58
            int r5 = r3 + 3
            int r12 = r2.length
            if (r5 >= r12) goto L58
            r12 = r2[r3]
            r13 = 97
            if (r12 != r13) goto L58
            int r12 = r3 + 1
            r12 = r2[r12]
            if (r12 != r11) goto L58
            int r12 = r3 + 2
            r12 = r2[r12]
            r13 = 115(0x73, float:1.61E-43)
            if (r12 != r13) goto L58
            r5 = r2[r5]
            if (r5 != r6) goto L58
            int r3 = r3 + 4
        L55:
            r4 = r1
            goto Lc6
        L58:
            r5 = 45
            if (r4 == r5) goto L15e
            r5 = 48
            if (r4 < r5) goto L66
            r6 = 57
            if (r4 > r6) goto L66
            goto L15e
        L66:
            r6 = 110(0x6e, float:1.54E-43)
            if (r4 != r6) goto L9a
            int r6 = r3 + 2
            int r12 = r2.length
            if (r6 >= r12) goto L9a
            r12 = r2[r3]
            if (r12 != r7) goto L9a
            int r7 = r3 + 1
            r7 = r2[r7]
            if (r7 != r11) goto L9a
            r6 = r2[r6]
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
            if (r4 != r6) goto L153
            int r4 = r3 + 1
            int r7 = r2.length
            java.lang.String r11 = "can not convert to boolean : "
            if (r4 >= r7) goto L122
            r4 = r2[r4]
            if (r4 != r6) goto L122
            r4 = r2[r3]
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
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r4, r11)
            p012ah.C0086a.m464w(r1)
            goto L98
        Lc6:
            int r5 = r0.end
            r6 = 26
            if (r3 != r5) goto Lcf
            r5 = r3
        Lcd:
            r3 = r6
            goto Ld4
        Lcf:
            int r5 = r3 + 1
            r3 = r2[r3]
            char r3 = (char) r3
        Ld4:
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r7 = 32
            if (r3 > r7) goto Lf5
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r15 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r15 == 0) goto Lf5
            int r3 = r0.end
            if (r5 < r3) goto Leb
            goto Lcd
        Leb:
            int r3 = r5 + 1
            r5 = r2[r5]
            r17 = r5
            r5 = r3
            r3 = r17
            goto Ld4
        Lf5:
            r15 = 44
            if (r3 != r15) goto Lfa
            r1 = r10
        Lfa:
            r0.comma = r1
            if (r1 == 0) goto L11c
            int r1 = r0.end
            if (r5 < r1) goto L104
        L102:
            r3 = r6
            goto L109
        L104:
            int r1 = r5 + 1
            r3 = r2[r5]
        L108:
            r5 = r1
        L109:
            if (r3 > r7) goto L11c
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r1 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r1 == 0) goto L11c
            int r1 = r0.end
            if (r5 < r1) goto L117
            goto L102
        L117:
            int r1 = r5 + 1
            r3 = r2[r5]
            goto L108
        L11c:
            r0.offset = r5
            char r1 = (char) r3
            r0.f1929ch = r1
            return r4
        L122:
            java.lang.String r2 = r0.readString()
            java.lang.String r3 = "true"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L12f
            return r10
        L12f:
            java.lang.String r3 = "false"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L138
            return r1
        L138:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L150
            java.lang.String r3 = "null"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L147
            goto L150
        L147:
            java.lang.String r1 = r11.concat(r2)
            p012ah.C0086a.m464w(r1)
            goto L98
        L150:
            r0.wasNull = r10
            return r1
        L153:
            java.lang.String r1 = "syntax error : "
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r4, r1)
            p012ah.C0086a.m464w(r1)
            goto L98
        L15e:
            r0.readNumber()
            byte r2 = r0.valueType
            if (r2 != r10) goto L194
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.NonZeroNumberCastToBooleanAsTrue
            long r4 = r4.mask
            long r2 = r2 & r4
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            int r3 = r0.mag0
            if (r2 == 0) goto L185
            if (r3 != 0) goto L184
            int r2 = r0.mag1
            if (r2 != 0) goto L184
            int r2 = r0.mag2
            if (r2 != 0) goto L184
            int r2 = r0.mag3
            if (r2 == 0) goto L183
            goto L184
        L183:
            return r1
        L184:
            return r10
        L185:
            if (r3 != 0) goto L194
            int r2 = r0.mag1
            if (r2 != 0) goto L194
            int r2 = r0.mag2
            if (r2 != 0) goto L194
            int r2 = r0.mag3
            if (r2 != r10) goto L194
            return r10
        L194:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readBoolValue():boolean");
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
    public final double readDoubleValue() {
        int i9;
        byte b10;
        long j3;
        long j4;
        long j5;
        int i10;
        double d10;
        long j10;
        byte b11;
        byte b12;
        int i11;
        byte[] bArr;
        byte b13;
        double d11;
        boolean z9;
        int i12;
        double d12;
        boolean z10;
        int i13;
        byte b14;
        int i14;
        byte b15;
        byte b16;
        int iDigit2;
        int iDigit22;
        int i15;
        byte b17;
        byte[] bArr2 = this.bytes;
        byte b18 = this.f1929ch;
        int i16 = this.offset;
        int i17 = this.end;
        if (b18 != 34 && b18 != 39) {
            i9 = i16;
            b10 = b18;
            b18 = 0;
        } else if (i16 == i17) {
            i9 = i16;
            b10 = 26;
        } else {
            i9 = i16 + 1;
            b10 = bArr2[i16];
        }
        if (b18 == 0 || b10 != b18) {
            j3 = 1;
            if (b10 < 48 || b10 > 57) {
                j4 = 0;
                if (b10 == 45 || b10 == 43) {
                    j5 = 0;
                }
                j5 = 1;
            } else {
                j4 = 0;
                j5 = 48 - b10;
            }
            while (true) {
                i10 = -1;
                if (j5 > j4) {
                    d10 = 0.0d;
                    break;
                }
                d10 = 0.0d;
                if (i9 + 1 >= i17 || (iDigit22 = IOUtils.digit2(bArr2, i9)) == -1) {
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
                b11 = b10;
            } else {
                j10 = 48;
                b11 = bArr2[i9];
                if (b11 >= 48 && b11 <= 57) {
                    if (Buffer.OVERFLOW_ZONE <= j5) {
                        j5 = ((j5 * 10) + 48) - ((long) b11);
                        i9++;
                    } else {
                        j5 = 1;
                    }
                }
            }
            if (j5 > j4 || i9 >= i17 || bArr2[i9] != 46) {
                b12 = b11;
                i11 = 0;
            } else {
                i9++;
                i11 = 0;
                while (j5 <= j4 && i9 + 1 < i17 && (iDigit2 = IOUtils.digit2(bArr2, i9)) != i10) {
                    if (-92233720368547758L <= j5) {
                        j5 = (j5 * 100) - ((long) iDigit2);
                        i9 += 2;
                        i11 += 2;
                        b11 = b11;
                        i10 = -1;
                    } else {
                        j5 = 1;
                    }
                }
                byte b19 = b11;
                if (j5 > j4 || i9 >= i17) {
                    b12 = b19;
                } else {
                    b12 = bArr2[i9];
                    if (b12 >= 48 && b12 <= 57) {
                        if (Buffer.OVERFLOW_ZONE <= j5) {
                            j5 = ((j5 * 10) + j10) - ((long) b12);
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
                    b12 = 26;
                } else {
                    b12 = bArr2[i9];
                    i9++;
                }
            }
            if (j5 <= j4) {
                if (b12 == 101 || b12 == 69) {
                    if (i9 == i17) {
                        i14 = i9;
                        b15 = 26;
                    } else {
                        i14 = i9 + 1;
                        b15 = bArr2[i9];
                    }
                    boolean z11 = b15 == 45;
                    if (z11 || b15 == 43) {
                        if (i14 == i17) {
                            b15 = 26;
                        } else {
                            int i18 = i14 + 1;
                            byte b20 = bArr2[i14];
                            i14 = i18;
                            b15 = b20;
                        }
                    } else if (b15 == 44) {
                        throw numberError();
                    }
                    if (b15 < 48 || b15 > 57) {
                        b12 = b15;
                        j5 = 1;
                    } else {
                        int i19 = b15 + JSONB.Constants.BC_INT64_BYTE_ZERO;
                        while (i14 < i17) {
                            byte b21 = bArr2[i14];
                            if (b21 < 48 || b21 > 57) {
                                break;
                            }
                            i19 = (i19 * 10) + b21 + JSONB.Constants.BC_INT64_BYTE_ZERO;
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
                            b16 = 26;
                        } else {
                            b16 = bArr2[i14];
                            i14++;
                        }
                        b12 = b16;
                    }
                    i9 = i14;
                } else if (b12 == 76 || b12 == 70 || b12 == 68 || b12 == 66 || b12 == 83) {
                    if (i9 == i17) {
                        b12 = 26;
                    } else {
                        b12 = bArr2[i9];
                        i9++;
                    }
                }
            }
            if (j5 <= j4 && b18 != 0) {
                if (b12 == b18) {
                    if (i9 == i17) {
                        i13 = i9;
                        b14 = 26;
                    } else {
                        i13 = i9 + 1;
                        b14 = bArr2[i9];
                    }
                    b12 = b14;
                    i9 = i13;
                } else {
                    j5 = 1;
                }
            }
            int i20 = (j5 > j4 ? 1 : (j5 == j4 ? 0 : -1));
            if (i20 <= 0) {
                if (i11 == 0) {
                    d12 = j5;
                    bArr = bArr2;
                    i12 = i20;
                } else {
                    double d13 = j5;
                    bArr = bArr2;
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
                            b13 = b12;
                            j5 = 1;
                            z9 = false;
                            d11 = d12;
                        } else {
                            double dDoubleValue = TypeUtils.doubleValue(b10 == 45 ? -1 : 1, Math.abs(j5), i11);
                            b13 = b12;
                            z9 = false;
                            d11 = dDoubleValue;
                        }
                    } else if (b10 != 45) {
                        b13 = b12;
                        z9 = false;
                        d11 = d12;
                    } else {
                        b13 = b12;
                        z9 = false;
                        d11 = d12;
                    }
                }
                z10 = true;
                if (z10) {
                }
            } else {
                bArr = bArr2;
                b13 = b12;
                d11 = d10;
                z9 = false;
            }
        } else {
            if (i9 == i17) {
                b13 = 26;
            } else {
                b13 = bArr2[i9];
                i9++;
            }
            bArr = bArr2;
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
        while (b13 <= 32 && ((j3 << b13) & 4294981377L) != j4) {
            if (i9 == i17) {
                b13 = 26;
            } else {
                byte b22 = bArr[i9];
                i9++;
                b13 = b22;
            }
        }
        boolean z12 = b13 == 44;
        this.comma = z12;
        if (z12) {
            if (i9 == i17) {
                i15 = i9;
                b17 = 26;
            } else {
                i15 = i9 + 1;
                b17 = bArr[i9];
            }
            loop1: while (true) {
                byte b23 = b17;
                i9 = i15;
                b13 = b23;
                while (b13 <= 32 && ((j3 << b13) & 4294981377L) != j4) {
                    if (i9 == i17) {
                        b13 = 26;
                    }
                }
                i15 = i9 + 1;
                b17 = bArr[i9];
            }
        }
        this.wasNull = z9;
        this.f1929ch = (char) b13;
        this.offset = i9;
        return d11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:50:0x00a4) to fix multi-entry loop: BACK_EDGE: B:50:0x00a4 -> B:51:0x00a9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0091 -> B:38:0x007c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00b8 -> B:48:0x009e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:51:0x00a9
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
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
    public java.lang.String readFieldName() {
        /*
            r24 = this;
            r0 = r24
            char r1 = r0.f1929ch
            r2 = 39
            r3 = 0
            if (r1 != r2) goto L1d
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r5 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.DisableSingleQuote
            long r7 = r2.mask
            long r5 = r5 & r7
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L18
            goto L1d
        L18:
            com.alibaba.fastjson2.JSONException r1 = r0.notSupportName()
            throw r1
        L1d:
            r2 = 34
            if (r1 == r2) goto L3f
            r2 = 39
            if (r1 == r2) goto L3f
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r5 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.AllowUnQuotedFieldNames
            long r7 = r2.mask
            long r5 = r5 & r7
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L3d
            boolean r1 = com.alibaba.fastjson2.JSONReader.isFirstIdentifier(r1)
            if (r1 == 0) goto L3d
            java.lang.String r1 = r0.readFieldNameUnquote()
            return r1
        L3d:
            r1 = 0
            return r1
        L3f:
            byte[] r2 = r0.bytes
            r5 = 1
            r0.nameAscii = r5
            r6 = 0
            r0.nameEscape = r6
            int r7 = r0.offset
            r0.nameBegin = r7
            int r8 = r0.end
            r10 = r6
            r9 = r7
        L4f:
            r11 = 32
            if (r9 >= r8) goto Lf3
            r12 = r2[r9]
            r13 = 92
            r14 = 4
            r15 = 2
            if (r12 != r13) goto L70
            r0.nameEscape = r5
            int r11 = r9 + 1
            r11 = r2[r11]
            r12 = 117(0x75, float:1.64E-43)
            if (r11 != r12) goto L67
            r14 = 6
            goto L6d
        L67:
            r12 = 120(0x78, float:1.68E-43)
            if (r11 != r12) goto L6c
            goto L6d
        L6c:
            r14 = r15
        L6d:
            int r9 = r9 + r14
            goto Lef
        L70:
            if (r12 != r1) goto Lcc
            r0.nameLength = r10
            r0.nameEnd = r9
            int r9 = r9 + 1
            if (r9 >= r8) goto L7f
            r1 = r2[r9]
        L7c:
            r1 = r1 & 255(0xff, float:3.57E-43)
            goto L81
        L7f:
            r1 = 26
        L81:
            if (r1 > r11) goto L96
            r12 = 1
            long r12 = r12 << r1
            r16 = 4294981377(0x100003701, double:2.122002748E-314)
            long r12 = r12 & r16
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 == 0) goto L96
            int r9 = r9 + 1
            r1 = r2[r9]
            goto L7c
        L96:
            r10 = 58
            if (r1 != r10) goto Lc7
            int r1 = r9 + 1
            if (r1 != r8) goto La1
        L9e:
            r9 = 26
            goto La9
        La1:
            int r9 = r9 + r15
            r1 = r2[r1]
        La4:
            r23 = r9
            r9 = r1
            r1 = r23
        La9:
            if (r9 > r11) goto Lc0
            r12 = 1
            long r12 = r12 << r9
            r14 = 4294981377(0x100003701, double:2.122002748E-314)
            long r12 = r12 & r14
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 == 0) goto Lc0
            if (r1 != r8) goto Lbb
            goto L9e
        Lbb:
            int r9 = r1 + 1
            r1 = r2[r1]
            goto La4
        Lc0:
            r0.offset = r1
            char r3 = (char) r9
            r0.f1929ch = r3
            r9 = r1
            goto Lf3
        Lc7:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r9, r1)
            throw r1
        Lcc:
            if (r12 < 0) goto Ld1
            int r9 = r9 + 1
            goto Lef
        Ld1:
            boolean r11 = r0.nameAscii
            if (r11 == 0) goto Ld7
            r0.nameAscii = r6
        Ld7:
            r11 = r12 & 255(0xff, float:3.57E-43)
            int r11 = r11 >> r14
            switch(r11) {
                case 12: goto Led;
                case 13: goto Led;
                case 14: goto Lea;
                default: goto Ldd;
            }
        Ldd:
            int r11 = r12 >> 3
            r13 = -2
            if (r11 != r13) goto Le5
            int r9 = r9 + 4
            goto Lef
        Le5:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r9, r12)
            throw r1
        Lea:
            int r9 = r9 + 3
            goto Lef
        Led:
            int r9 = r9 + 2
        Lef:
            int r10 = r10 + 1
            goto L4f
        Lf3:
            int r1 = r0.nameEnd
            if (r1 < r7) goto L5ef
            int r1 = r1 - r7
            boolean r3 = r0.nameEscape
            if (r3 != 0) goto L5ea
            boolean r3 = r0.nameAscii
            if (r3 == 0) goto L5a5
            r12 = 40
            r13 = 24
            r14 = 16
            r15 = 8
            switch(r1) {
                case 1: goto L54a;
                case 2: goto L53e;
                case 3: goto L52c;
                case 4: goto L50e;
                case 5: goto L4e7;
                case 6: goto L4b7;
                case 7: goto L47d;
                case 8: goto L433;
                case 9: goto L3e9;
                case 10: goto L399;
                case 11: goto L343;
                case 12: goto L2e6;
                case 13: goto L27e;
                case 14: goto L20e;
                case 15: goto L197;
                case 16: goto L115;
                default: goto L10b;
            }
        L10b:
            r16 = r11
            r12 = -1
            r14 = -1
            r18 = -1
            goto L551
        L115:
            int r16 = r7 + 7
            r17 = 56
            r4 = r2[r16]
            r18 = -1
            long r8 = (long) r4
            long r8 = r8 << r17
            int r4 = r7 + 6
            r4 = r2[r4]
            r16 = r11
            r20 = 48
            long r10 = (long) r4
            long r10 = r10 << r20
            long r8 = r8 + r10
            int r4 = r7 + 5
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r12
            long r8 = r8 + r10
            int r4 = r7 + 4
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r16
            long r8 = r8 + r10
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r13
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            long r10 = (long) r4
            long r8 = r8 + r10
            int r4 = r7 + 15
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 14
            r4 = r2[r4]
            r21 = r12
            r22 = r13
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 13
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 12
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 11
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 10
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 9
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 8
            r4 = r2[r4]
        L191:
            long r12 = (long) r4
            long r10 = r10 + r12
            r12 = r8
            r14 = r10
            goto L551
        L197:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 6
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r20
            int r4 = r7 + 5
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r21
            long r8 = r8 + r10
            int r4 = r7 + 4
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r16
            long r8 = r8 + r10
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            long r10 = (long) r4
            long r8 = r8 + r10
            int r4 = r7 + 14
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 13
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 12
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 11
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 10
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 9
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 8
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 7
            r4 = r2[r4]
            goto L191
        L20e:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 5
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r21
            int r4 = r7 + 4
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r16
            long r8 = r8 + r10
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            long r10 = (long) r4
            long r8 = r8 + r10
            int r4 = r7 + 13
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 12
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 11
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 10
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 9
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 8
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 7
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 6
            r4 = r2[r4]
            goto L191
        L27e:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 4
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r16
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            long r10 = (long) r4
            long r8 = r8 + r10
            int r4 = r7 + 12
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 11
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 10
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 9
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 8
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 7
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 6
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 5
            r4 = r2[r4]
            goto L191
        L2e6:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 3
            r4 = r2[r4]
            int r4 = r4 << 24
            int r8 = r7 + 2
            r8 = r2[r8]
            int r8 = r8 << r14
            int r4 = r4 + r8
            int r8 = r7 + 1
            r8 = r2[r8]
            int r8 = r8 << r15
            int r4 = r4 + r8
            r8 = r2[r7]
            int r4 = r4 + r8
            long r8 = (long) r4
            int r4 = r7 + 11
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 10
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 9
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 8
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 7
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 6
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 5
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 4
            r4 = r2[r4]
            goto L191
        L343:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 2
            r4 = r2[r4]
            int r4 = r4 << r14
            int r8 = r7 + 1
            r8 = r2[r8]
            int r8 = r8 << r15
            int r4 = r4 + r8
            r8 = r2[r7]
            int r4 = r4 + r8
            long r8 = (long) r4
            int r4 = r7 + 10
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 9
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 8
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 7
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 6
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 5
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 4
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 3
            r4 = r2[r4]
            goto L191
        L399:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 1
            r4 = r2[r4]
            int r4 = r4 << r15
            r8 = r2[r7]
            int r4 = r4 + r8
            long r8 = (long) r4
            int r4 = r7 + 9
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 8
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 7
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 6
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 5
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 4
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 3
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 2
            r4 = r2[r4]
            goto L191
        L3e9:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            r4 = r2[r7]
            long r8 = (long) r4
            int r4 = r7 + 8
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 7
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 6
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 5
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 4
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 3
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 2
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 1
            r4 = r2[r4]
            goto L191
        L433:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 7
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r17
            int r4 = r7 + 6
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r20
            long r8 = r8 + r10
            int r4 = r7 + 5
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r21
            long r8 = r8 + r10
            int r4 = r7 + 4
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r16
            long r8 = r8 + r10
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
        L476:
            long r10 = (long) r4
            long r8 = r8 + r10
        L478:
            r12 = r8
            r14 = r18
            goto L551
        L47d:
            r16 = r11
            r21 = r12
            r22 = r13
            r18 = -1
            r20 = 48
            int r4 = r7 + 6
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r20
            int r4 = r7 + 5
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r21
            long r8 = r8 + r10
            int r4 = r7 + 4
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r16
            long r8 = r8 + r10
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            goto L476
        L4b7:
            r16 = r11
            r21 = r12
            r22 = r13
            r18 = -1
            int r4 = r7 + 5
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r21
            int r4 = r7 + 4
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r16
            long r8 = r8 + r10
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            goto L476
        L4e7:
            r16 = r11
            r22 = r13
            r18 = -1
            int r4 = r7 + 4
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r16
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            goto L476
        L50e:
            r16 = r11
            r22 = r13
            r18 = -1
            int r4 = r7 + 3
            r4 = r2[r4]
            int r4 = r4 << 24
            int r8 = r7 + 2
            r8 = r2[r8]
            int r8 = r8 << r14
            int r4 = r4 + r8
            int r8 = r7 + 1
            r8 = r2[r8]
            int r8 = r8 << r15
            int r4 = r4 + r8
            r8 = r2[r7]
        L528:
            int r4 = r4 + r8
        L529:
            long r8 = (long) r4
            goto L478
        L52c:
            r16 = r11
            r18 = -1
            int r4 = r7 + 2
            r4 = r2[r4]
            int r4 = r4 << r14
            int r8 = r7 + 1
            r8 = r2[r8]
            int r8 = r8 << r15
            int r4 = r4 + r8
            r8 = r2[r7]
            goto L528
        L53e:
            r16 = r11
            r18 = -1
            int r4 = r7 + 1
            r4 = r2[r4]
            int r4 = r4 << r15
            r8 = r2[r7]
            goto L528
        L54a:
            r16 = r11
            r18 = -1
            r4 = r2[r7]
            goto L529
        L551:
            int r4 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r4 == 0) goto L5a5
            int r4 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r4 == 0) goto L583
            long r8 = r12 ^ r14
            long r10 = r8 >>> r16
            long r8 = r8 ^ r10
            int r4 = (int) r8
            com.alibaba.fastjson2.JSONFactory$NameCacheEntry2[] r8 = com.alibaba.fastjson2.JSONFactory.NAME_CACHE2
            int r9 = r8.length
            int r9 = r9 - r5
            r4 = r4 & r9
            r5 = r8[r4]
            if (r5 != 0) goto L574
            java.lang.String r11 = r0.getLatin1String(r7, r1)
            com.alibaba.fastjson2.JSONFactory$NameCacheEntry2 r10 = new com.alibaba.fastjson2.JSONFactory$NameCacheEntry2
            r10.<init>(r11, r12, r14)
            r8[r4] = r10
            return r11
        L574:
            long r8 = r5.value0
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 != 0) goto L5a5
            long r8 = r5.value1
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 != 0) goto L5a5
            java.lang.String r1 = r5.name
            return r1
        L583:
            long r8 = r12 >>> r16
            long r8 = r8 ^ r12
            int r4 = (int) r8
            com.alibaba.fastjson2.util.NameCacheEntry[] r8 = com.alibaba.fastjson2.JSONFactory.NAME_CACHE
            int r9 = r8.length
            int r9 = r9 - r5
            r4 = r4 & r9
            r5 = r8[r4]
            if (r5 != 0) goto L59c
            java.lang.String r1 = r0.getLatin1String(r7, r1)
            com.alibaba.fastjson2.util.NameCacheEntry r2 = new com.alibaba.fastjson2.util.NameCacheEntry
            r2.<init>(r1, r12)
            r8[r4] = r2
            return r1
        L59c:
            long r8 = r5.value
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 != 0) goto L5a5
            java.lang.String r1 = r5.name
            return r1
        L5a5:
            if (r3 == 0) goto L5e2
            int r3 = com.alibaba.fastjson2.util.JDKUtils.ANDROID_SDK_INT
            r4 = 34
            if (r3 >= r4) goto L5da
            char[] r3 = r0.charBuf
            if (r3 != 0) goto L5be
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r3 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r4 = r0.cacheItem
            r5 = 0
            java.lang.Object r3 = r3.getAndSet(r4, r5)
            char[] r3 = (char[]) r3
            r0.charBuf = r3
        L5be:
            if (r3 == 0) goto L5c3
            int r4 = r3.length
            if (r4 >= r1) goto L5c7
        L5c3:
            char[] r3 = new char[r1]
            r0.charBuf = r3
        L5c7:
            r4 = r6
        L5c8:
            if (r4 >= r1) goto L5d4
            int r5 = r7 + r4
            r5 = r2[r5]
            char r5 = (char) r5
            r3[r4] = r5
            int r4 = r4 + 1
            goto L5c8
        L5d4:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3, r6, r1)
            return r2
        L5da:
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.ISO_8859_1
            r3.<init>(r2, r7, r1, r4)
            return r3
        L5e2:
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r3.<init>(r2, r7, r1, r4)
            return r3
        L5ea:
            java.lang.String r1 = r0.getFieldName()
            return r1
        L5ef:
            char r1 = r0.f1929ch
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r9, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readFieldName():java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03ea  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readFieldNameHashCode() {
        int i9;
        char c10;
        char c11;
        char c12;
        char c13;
        long j3;
        int i10;
        int i11;
        char c14;
        int i12;
        char c15;
        int i13;
        char cChar4;
        char cChar1;
        long j4;
        long j5;
        long j10;
        int i14;
        long j11;
        int i15;
        String fieldName;
        byte[] bArr = this.bytes;
        char c16 = this.f1929ch;
        if (c16 == '/') {
            skipComment();
            c16 = this.f1929ch;
        }
        if (c16 == '\'' && (this.context.features & JSONReader.Feature.DisableSingleQuote.mask) != 0) {
            throw notSupportName();
        }
        if (c16 != '\"' && c16 != '\'') {
            if ((this.context.features & JSONReader.Feature.AllowUnQuotedFieldNames.mask) != 0 && JSONReader.isFirstIdentifier(c16)) {
                return readFieldNameHashCodeUnquote();
            }
            if (c16 == '}' || isNull()) {
                return -1L;
            }
            C0086a.m464w(info((c16 != '[' || this.nameBegin <= 0 || (fieldName = getFieldName()) == null) ? AbstractC0921a.m2249l(c16, "illegal fieldName input") : "illegal fieldName input " + ((int) c16) + ", previous fieldName " + fieldName));
            return 0L;
        }
        this.nameAscii = true;
        this.nameEscape = false;
        int i16 = this.offset;
        this.nameBegin = i16;
        int i17 = this.end;
        int i18 = i16 + 9;
        if (i18 < i17) {
            char c17 = bArr[i16];
            if (c17 == c16) {
                i10 = i16;
                j3 = 0;
                c10 = '8';
                c11 = '0';
            } else {
                c10 = '8';
                int i19 = i16 + 1;
                c11 = '0';
                char c18 = bArr[i19];
                if (c18 != c16 || c17 == '\\' || c17 <= 0) {
                    i9 = i16;
                    int i20 = i9 + 2;
                    char c19 = bArr[i20];
                    if (c19 != c16 || c17 == '\\' || c18 == '\\' || c17 < 0 || c18 <= 0) {
                        int i21 = i9 + 3;
                        char c20 = bArr[i21];
                        if (c20 != c16 || c17 == '\\' || c18 == '\\' || c19 == '\\' || c17 < 0 || c18 < 0 || c19 <= 0) {
                            int i22 = i9 + 4;
                            c12 = '(';
                            char c21 = bArr[i22];
                            if (c21 != c16 || c17 == '\\' || c18 == '\\' || c19 == '\\' || c20 == '\\' || c17 < 0 || c18 < 0 || c19 < 0 || c20 <= 0) {
                                int i23 = i9 + 5;
                                c13 = ' ';
                                char c22 = bArr[i23];
                                if (c22 != c16 || c17 == '\\' || c18 == '\\' || c19 == '\\' || c20 == '\\' || c21 == '\\' || c17 < 0 || c18 < 0 || c19 < 0 || c20 < 0 || c21 <= 0) {
                                    int i24 = i9 + 6;
                                    char c23 = bArr[i24];
                                    if (c23 != c16 || c17 == '\\' || c18 == '\\' || c19 == '\\' || c20 == '\\' || c21 == '\\' || c22 == '\\' || c17 < 0 || c18 < 0 || c19 < 0 || c20 < 0 || c21 < 0 || c22 <= 0) {
                                        int i25 = i9 + 7;
                                        char c24 = bArr[i25];
                                        if (c24 != c16 || c17 == '\\' || c18 == '\\' || c19 == '\\' || c20 == '\\' || c21 == '\\' || c22 == '\\' || c23 == '\\' || c17 < 0 || c18 < 0 || c19 < 0 || c20 < 0 || c21 < 0 || c22 < 0 || c23 <= 0) {
                                            int i26 = i9 + 8;
                                            if (bArr[i26] == c16 && c17 != '\\' && c18 != '\\' && c19 != '\\' && c20 != '\\' && c21 != '\\' && c22 != '\\' && c23 != '\\' && c24 != '\\' && c17 >= 0 && c18 >= 0 && c19 >= 0 && c20 >= 0 && c21 >= 0 && c22 >= 0 && c23 >= 0 && c24 > 0) {
                                                this.nameLength = 8;
                                                this.nameEnd = i26;
                                                j3 = (((long) c24) << 56) + (((long) c23) << 48) + (((long) c22) << 40) + (((long) c21) << 32) + ((long) (c20 << 24)) + ((long) (c19 << 16)) + ((long) (c18 << '\b')) + ((long) c17);
                                                i10 = i18;
                                            }
                                        } else {
                                            j10 = (((long) c23) << 48) + (((long) c22) << 40) + (((long) c21) << 32) + ((long) (c20 << 24)) + ((long) (c19 << 16)) + ((long) (c18 << '\b')) + ((long) c17);
                                            this.nameLength = 7;
                                            this.nameEnd = i25;
                                            i14 = i9 + 8;
                                        }
                                    } else {
                                        j10 = ((long) c17) + (((long) c22) << 40) + (((long) c21) << 32) + ((long) (c20 << 24)) + ((long) (c19 << 16)) + ((long) (c18 << '\b'));
                                        this.nameLength = 6;
                                        this.nameEnd = i24;
                                        i14 = i9 + 7;
                                    }
                                    i10 = i14;
                                    j3 = j10;
                                } else {
                                    long j12 = ((long) c17) + (((long) c21) << 32) + ((long) (c20 << 24)) + ((long) (c19 << 16)) + ((long) (c18 << '\b'));
                                    this.nameLength = 5;
                                    this.nameEnd = i23;
                                    i10 = i9 + 6;
                                    j3 = j12;
                                }
                                if (j3 == 0) {
                                    int i27 = 0;
                                    while (true) {
                                        if (i10 < i17) {
                                            char cChar42 = bArr[i10];
                                            if (cChar42 != c16) {
                                                if (cChar42 == '\\') {
                                                    this.nameEscape = true;
                                                    int i28 = i10 + 1;
                                                    int i29 = bArr[i28];
                                                    if (i29 == 117) {
                                                        int i30 = bArr[i10 + 2];
                                                        int i31 = bArr[i10 + 3];
                                                        int i32 = bArr[i10 + 4];
                                                        i10 += 5;
                                                        cChar42 = JSONReader.char4(i30, i31, i32, bArr[i10]);
                                                    } else if (i29 != 120) {
                                                        cChar42 = char1(i29);
                                                        i10 = i28;
                                                    } else {
                                                        int i33 = bArr[i10 + 2];
                                                        i10 += 3;
                                                        cChar42 = JSONReader.char2(i33, bArr[i10]);
                                                    }
                                                    if (cChar42 > 255) {
                                                        this.nameAscii = false;
                                                    }
                                                } else {
                                                    if (cChar42 == 65475 || cChar42 == 65474) {
                                                        i10++;
                                                        cChar42 = (char) (((cChar42 & 31) << 6) | (bArr[i10] & '?'));
                                                        this.nameAscii = false;
                                                    }
                                                    if (cChar42 > 255 && cChar42 >= 0 && i27 < 8 && (i27 != 0 || cChar42 != 0)) {
                                                        switch (i27) {
                                                            case 0:
                                                                j3 = (byte) cChar42;
                                                                break;
                                                            case 1:
                                                                j4 = ((byte) cChar42) << 8;
                                                                j5 = 255;
                                                                j3 = j4 + (j3 & j5);
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
                                                        i10++;
                                                        i27++;
                                                    }
                                                }
                                                if (cChar42 > 255) {
                                                }
                                            } else if (i27 == 0) {
                                                i10 = this.nameBegin;
                                            } else {
                                                this.nameLength = i27;
                                                this.nameEnd = i10;
                                                i10++;
                                            }
                                        }
                                    }
                                    i10 = this.nameBegin;
                                    j3 = 0;
                                }
                                if (j3 == 0) {
                                    j3 = Fnv.MAGIC_HASH_CODE;
                                    int i34 = 0;
                                    while (true) {
                                        int iChar2_utf8 = bArr[i10];
                                        if (iChar2_utf8 == 92) {
                                            this.nameEscape = true;
                                            int i35 = i10 + 1;
                                            int i36 = bArr[i35];
                                            if (i36 == 117) {
                                                int i37 = bArr[i10 + 2];
                                                int i38 = bArr[i10 + 3];
                                                int i39 = bArr[i10 + 4];
                                                i13 = i10 + 5;
                                                cChar4 = JSONReader.char4(i37, i38, i39, bArr[i13]);
                                            } else if (i36 != 120) {
                                                cChar1 = char1(i36);
                                                j3 = (j3 ^ ((long) cChar1)) * Fnv.MAGIC_PRIME;
                                                c15 = c13;
                                                i10 = i35 + 1;
                                            } else {
                                                int i40 = bArr[i10 + 2];
                                                i13 = i10 + 3;
                                                cChar4 = JSONReader.char2(i40, bArr[i13]);
                                            }
                                            int i41 = i13;
                                            cChar1 = cChar4;
                                            i35 = i41;
                                            j3 = (j3 ^ ((long) cChar1)) * Fnv.MAGIC_PRIME;
                                            c15 = c13;
                                            i10 = i35 + 1;
                                        } else if (iChar2_utf8 == c16) {
                                            this.nameLength = i34;
                                            this.nameEnd = i10;
                                            i10++;
                                        } else {
                                            c15 = c13;
                                            if (iChar2_utf8 >= 0) {
                                                i10++;
                                            } else {
                                                int i42 = iChar2_utf8 & 255;
                                                switch (i42 >> 4) {
                                                    case 12:
                                                    case 13:
                                                        iChar2_utf8 = char2_utf8(i42, bArr[i10 + 1], i10);
                                                        i10 += 2;
                                                        this.nameAscii = false;
                                                        break;
                                                    case 14:
                                                        iChar2_utf8 = char2_utf8(i42, bArr[i10 + 1], bArr[i10 + 2], i10);
                                                        i10 += 3;
                                                        this.nameAscii = false;
                                                        break;
                                                    default:
                                                        C0086a.m464w(AbstractC0921a.m2249l(i10, "malformed input around byte "));
                                                        return 0L;
                                                }
                                            }
                                            j3 = (j3 ^ ((long) iChar2_utf8)) * Fnv.MAGIC_PRIME;
                                        }
                                        i34++;
                                        c13 = c15;
                                    }
                                }
                                if (i10 != i17) {
                                    i11 = 26;
                                } else {
                                    i11 = bArr[i10];
                                    i10++;
                                }
                                for (c14 = c13; i11 <= c14 && ((1 << i11) & 4294981377L) != 0; c14 = ' ') {
                                    if (i10 != i17) {
                                        i11 = 26;
                                    } else {
                                        i11 = bArr[i10];
                                        i10++;
                                    }
                                }
                                if (i11 == 58) {
                                    C0086a.m464w(info(AbstractC0921a.m2249l(i11, "expect ':', but ")));
                                    return 0L;
                                }
                                if (i10 == i17) {
                                    i12 = 26;
                                } else {
                                    i12 = bArr[i10];
                                    i10++;
                                }
                                while (i12 <= 32 && ((1 << i12) & 4294981377L) != 0) {
                                    if (i10 == i17) {
                                        i12 = 26;
                                    } else {
                                        i12 = bArr[i10];
                                        i10++;
                                    }
                                }
                                this.offset = i10;
                                this.f1929ch = (char) i12;
                                return j3;
                            }
                            long j13 = (c20 << 24) + (c19 << 16) + (c18 << '\b') + c17;
                            this.nameLength = 4;
                            this.nameEnd = i22;
                            i10 = i9 + 5;
                            j3 = j13;
                            c13 = ' ';
                            if (j3 == 0) {
                            }
                            if (j3 == 0) {
                            }
                            if (i10 != i17) {
                            }
                            while (i11 <= c14) {
                                if (i10 != i17) {
                                }
                            }
                            if (i11 == 58) {
                            }
                        } else {
                            j11 = (c19 << 16) + (c18 << '\b') + c17;
                            this.nameLength = 3;
                            this.nameEnd = i21;
                            i15 = i9 + 4;
                        }
                    } else {
                        j11 = (c18 << '\b') + c17;
                        this.nameLength = 2;
                        this.nameEnd = i20;
                        i15 = i9 + 3;
                    }
                    long j14 = j11;
                    i10 = i15;
                    j3 = j14;
                } else {
                    j3 = c17;
                    this.nameLength = 1;
                    this.nameEnd = i19;
                    i10 = i16 + 2;
                }
            }
            c12 = '(';
            c13 = ' ';
            if (j3 == 0) {
            }
            if (j3 == 0) {
            }
            if (i10 != i17) {
            }
            while (i11 <= c14) {
            }
            if (i11 == 58) {
            }
        } else {
            i9 = i16;
            c10 = '8';
            c11 = '0';
            c12 = '(';
            c13 = ' ';
        }
        j3 = 0;
        i10 = i9;
        if (j3 == 0) {
        }
        if (j3 == 0) {
        }
        if (i10 != i17) {
        }
        while (i11 <= c14) {
        }
        if (i11 == 58) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0183  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readFieldNameHashCodeUnquote() {
        int i9;
        char c10;
        int i10;
        byte b10;
        long j3;
        long j4;
        this.nameEscape = false;
        int i11 = this.offset;
        int i12 = this.end;
        byte[] bArr = this.bytes;
        int iChar2_utf8 = this.f1929ch;
        this.nameBegin = i11 - 1;
        int i13 = 0;
        int iChar2_utf82 = iChar2_utf8;
        long j5 = 0;
        while (i11 <= i12) {
            if (iChar2_utf82 != 12 && iChar2_utf82 != 13 && iChar2_utf82 != 26 && iChar2_utf82 != 58 && iChar2_utf82 != 91 && iChar2_utf82 != 93 && iChar2_utf82 != 123 && iChar2_utf82 != 125 && iChar2_utf82 != 32 && iChar2_utf82 != 33) {
                switch (iChar2_utf82) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        switch (iChar2_utf82) {
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case ParserConstants.PROTECTED /* 45 */:
                            case 46:
                            case 47:
                                break;
                            default:
                                switch (iChar2_utf82) {
                                    case ParserConstants.WHEN /* 60 */:
                                    case ParserConstants.WHILE /* 61 */:
                                    case ParserConstants.INTEGER_LITERAL /* 62 */:
                                        break;
                                    default:
                                        if (iChar2_utf82 == 92) {
                                            this.nameEscape = true;
                                            int i14 = i11 + 1;
                                            char c11 = (char) bArr[i11];
                                            if (c11 == '\"' || c11 == ':' || c11 == '@' || c11 == '\\') {
                                                i11 = i14;
                                                iChar2_utf82 = c11;
                                            } else if (c11 == 'u') {
                                                iChar2_utf82 = JSONReader.char4(bArr[i14], bArr[i11 + 2], bArr[i11 + 3], bArr[i11 + 4]);
                                                i11 += 5;
                                            } else if (c11 == 'x') {
                                                iChar2_utf82 = JSONReader.char2(bArr[i14], bArr[i11 + 2]);
                                                i11 += 3;
                                            } else if (c11 != '*' && c11 != '+') {
                                                switch (c11) {
                                                    default:
                                                        switch (c11) {
                                                            case ParserConstants.WHEN /* 60 */:
                                                            case ParserConstants.WHILE /* 61 */:
                                                            case ParserConstants.INTEGER_LITERAL /* 62 */:
                                                                break;
                                                            default:
                                                                i11 = i14;
                                                                iChar2_utf82 = char1(c11);
                                                                break;
                                                        }
                                                    case ParserConstants.PROTECTED /* 45 */:
                                                    case '.':
                                                    case '/':
                                                        break;
                                                }
                                            }
                                            if (j5 == 0) {
                                                j5 = -3750763034362895579L;
                                                int i15 = 0;
                                                while (true) {
                                                    if (iChar2_utf8 == 92) {
                                                        this.nameEscape = true;
                                                        int i16 = i11 + 1;
                                                        byte bChar4 = bArr[i11];
                                                        if (bChar4 != 34 && bChar4 != 58 && bChar4 != 64 && bChar4 != 92) {
                                                            if (bChar4 != 117) {
                                                                if (bChar4 != 120) {
                                                                    if (bChar4 != 42 && bChar4 != 43) {
                                                                        switch (bChar4) {
                                                                            case ParserConstants.PROTECTED /* 45 */:
                                                                            case 46:
                                                                            case 47:
                                                                                break;
                                                                            default:
                                                                                switch (bChar4) {
                                                                                    case ParserConstants.WHEN /* 60 */:
                                                                                    case ParserConstants.WHILE /* 61 */:
                                                                                    case ParserConstants.INTEGER_LITERAL /* 62 */:
                                                                                        break;
                                                                                    default:
                                                                                        bChar4 = char1(bChar4);
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    bChar4 = JSONReader.char2(bArr[i16], bArr[i11 + 2]);
                                                                    i16 = i11 + 3;
                                                                }
                                                            } else {
                                                                bChar4 = JSONReader.char4(bArr[i16], bArr[i11 + 2], bArr[i11 + 3], bArr[i11 + 4]);
                                                                i16 = i11 + 5;
                                                            }
                                                        }
                                                        long j10 = (((long) bChar4) ^ j5) * Fnv.MAGIC_PRIME;
                                                        if (i16 == i12) {
                                                            i11 = i16;
                                                            iChar2_utf8 = 26;
                                                        } else {
                                                            i11 = i16 + 1;
                                                            iChar2_utf8 = bArr[i16];
                                                        }
                                                        j5 = j10;
                                                    } else if (iChar2_utf8 != 12 && iChar2_utf8 != 13 && iChar2_utf8 != 26 && iChar2_utf8 != 58 && iChar2_utf8 != 91 && iChar2_utf8 != 93 && iChar2_utf8 != 123 && iChar2_utf8 != 125 && iChar2_utf8 != 32 && iChar2_utf8 != 33) {
                                                        switch (iChar2_utf8) {
                                                            case 8:
                                                            case 9:
                                                            case 10:
                                                                break;
                                                            default:
                                                                switch (iChar2_utf8) {
                                                                    case 40:
                                                                    case 41:
                                                                    case 42:
                                                                    case 43:
                                                                    case 44:
                                                                    case ParserConstants.PROTECTED /* 45 */:
                                                                    case 46:
                                                                    case 47:
                                                                        break;
                                                                    default:
                                                                        switch (iChar2_utf8) {
                                                                            case ParserConstants.WHEN /* 60 */:
                                                                            case ParserConstants.WHILE /* 61 */:
                                                                            case ParserConstants.INTEGER_LITERAL /* 62 */:
                                                                                break;
                                                                            default:
                                                                                if (iChar2_utf8 < 0) {
                                                                                    int i17 = iChar2_utf8 & 255;
                                                                                    switch (i17 >> 4) {
                                                                                        case 12:
                                                                                        case 13:
                                                                                            int i18 = i11 + 1;
                                                                                            int iChar2_utf83 = char2_utf8(i17, bArr[i11], i18);
                                                                                            this.nameAscii = false;
                                                                                            iChar2_utf8 = iChar2_utf83;
                                                                                            i11 = i18;
                                                                                            break;
                                                                                        case 14:
                                                                                            iChar2_utf8 = char2_utf8(i17, bArr[i11], bArr[i11 + 1], i11);
                                                                                            i11 += 2;
                                                                                            this.nameAscii = false;
                                                                                            break;
                                                                                        default:
                                                                                            if ((iChar2_utf8 >> 3) != -2) {
                                                                                                C0086a.m464w(AbstractC0921a.m2249l(i11, "malformed input around byte "));
                                                                                                return 0L;
                                                                                            }
                                                                                            iChar2_utf8 = (((iChar2_utf8 << 18) ^ (bArr[i11] << 12)) ^ (bArr[i11 + 1] << 6)) ^ (bArr[i11 + 2] ^ 3678080);
                                                                                            i11 += 3;
                                                                                            this.nameAscii = false;
                                                                                            break;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                long j11 = (iChar2_utf8 > 65535 ? ((j5 ^ ((long) ((iChar2_utf8 >>> 10) + Utf8.HIGH_SURROGATE_HEADER))) * Fnv.MAGIC_PRIME) ^ ((long) ((iChar2_utf8 & 1023) + Utf8.LOG_SURROGATE_HEADER)) : ((long) iChar2_utf8) ^ j5) * Fnv.MAGIC_PRIME;
                                                                                if (i11 == i12) {
                                                                                    i10 = i11;
                                                                                    b10 = 26;
                                                                                } else {
                                                                                    i10 = i11 + 1;
                                                                                    b10 = bArr[i11];
                                                                                }
                                                                                j5 = j11;
                                                                                iChar2_utf8 = b10;
                                                                                i11 = i10;
                                                                                continue;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    i15++;
                                                }
                                                this.nameLength = i15;
                                                this.nameEnd = iChar2_utf8 == 26 ? i11 : i11 - 1;
                                                while (iChar2_utf8 <= 32 && ((1 << iChar2_utf8) & 4294981377L) != 0) {
                                                    if (i11 == i12) {
                                                        iChar2_utf8 = 26;
                                                    } else {
                                                        iChar2_utf8 = bArr[i11];
                                                        i11++;
                                                    }
                                                }
                                            }
                                            if (iChar2_utf8 == 58) {
                                                if (i11 == i12) {
                                                    i9 = i11;
                                                    c10 = 26;
                                                } else {
                                                    i9 = i11 + 1;
                                                    c10 = (char) bArr[i11];
                                                }
                                                iChar2_utf8 = c10;
                                                while (true) {
                                                    i11 = i9;
                                                    while (iChar2_utf8 <= 32 && ((1 << iChar2_utf8) & 4294981377L) != 0) {
                                                        if (i11 == i12) {
                                                            iChar2_utf8 = 26;
                                                        }
                                                    }
                                                    i9 = i11 + 1;
                                                    iChar2_utf8 = bArr[i11];
                                                }
                                            }
                                            this.offset = i11;
                                            this.f1929ch = (char) iChar2_utf8;
                                            return j5;
                                        }
                                        if (iChar2_utf82 < 0) {
                                            int i19 = iChar2_utf82 & 255;
                                            switch (i19 >> 4) {
                                                case 12:
                                                case 13:
                                                    int i20 = i11 + 1;
                                                    iChar2_utf82 = char2_utf8(i19, bArr[i11], i20);
                                                    i11 = i20;
                                                    break;
                                                case 14:
                                                    iChar2_utf82 = char2_utf8(i19, bArr[i11], bArr[i11 + 1], i11);
                                                    i11 += 2;
                                                    break;
                                                default:
                                                    if ((iChar2_utf82 >> 3) != -2) {
                                                        C0086a.m464w(AbstractC0921a.m2249l(i11, "malformed input around byte "));
                                                        return 0L;
                                                    }
                                                    iChar2_utf82 = (((bArr[i11] << 12) ^ (iChar2_utf82 << 18)) ^ (bArr[i11 + 1] << 6)) ^ (3678080 ^ bArr[i11 + 2]);
                                                    break;
                                                    break;
                                            }
                                        }
                                        if (iChar2_utf82 > 255 || i13 >= 8 || (i13 == 0 && iChar2_utf82 == 0)) {
                                            i11 = this.nameBegin + 1;
                                            j5 = 0;
                                            if (j5 == 0) {
                                            }
                                            if (iChar2_utf8 == 58) {
                                            }
                                            this.offset = i11;
                                            this.f1929ch = (char) iChar2_utf8;
                                            return j5;
                                        }
                                        byte b11 = (byte) iChar2_utf82;
                                        switch (i13) {
                                            case 0:
                                                j5 = b11;
                                                break;
                                            case 1:
                                                j3 = b11 << 8;
                                                j4 = 255;
                                                j5 = (j5 & j4) + j3;
                                                break;
                                            case 2:
                                                j3 = b11 << JSONB.Constants.BC_INT32_NUM_16;
                                                j4 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                                j5 = (j5 & j4) + j3;
                                                break;
                                            case 3:
                                                j3 = b11 << 24;
                                                j4 = 16777215;
                                                j5 = (j5 & j4) + j3;
                                                break;
                                            case 4:
                                                j3 = ((long) b11) << 32;
                                                j4 = 4294967295L;
                                                j5 = (j5 & j4) + j3;
                                                break;
                                            case 5:
                                                j3 = ((long) b11) << 40;
                                                j4 = 1099511627775L;
                                                j5 = (j5 & j4) + j3;
                                                break;
                                            case 6:
                                                j3 = ((long) b11) << 48;
                                                j4 = 281474976710655L;
                                                j5 = (j5 & j4) + j3;
                                                break;
                                            case 7:
                                                j3 = ((long) b11) << 56;
                                                j4 = 72057594037927935L;
                                                j5 = (j5 & j4) + j3;
                                                break;
                                        }
                                        if (i11 == i12) {
                                            iChar2_utf82 = 26;
                                        } else {
                                            iChar2_utf82 = bArr[i11];
                                            i11++;
                                        }
                                        i13++;
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            this.nameLength = i13;
            this.nameEnd = iChar2_utf82 == 26 ? i11 : i11 - 1;
            if (iChar2_utf82 > 32 || ((1 << iChar2_utf82) & 4294981377L) == 0) {
                iChar2_utf8 = iChar2_utf82;
            } else if (i11 == i12) {
                iChar2_utf8 = 26;
            } else {
                iChar2_utf8 = (char) bArr[i11];
                i11++;
            }
            if (j5 == 0) {
            }
            if (iChar2_utf8 == 58) {
            }
            this.offset = i11;
            this.f1929ch = (char) iChar2_utf8;
            return j5;
        }
        iChar2_utf8 = iChar2_utf82;
        if (j5 == 0) {
        }
        if (iChar2_utf8 == 58) {
        }
        this.offset = i11;
        this.f1929ch = (char) iChar2_utf8;
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
    public final float readFloatValue() {
        int i9;
        byte b10;
        long j3;
        long j4;
        long j5;
        int i10;
        float f3;
        byte b11;
        int i11;
        byte b12;
        float fFloatValue;
        boolean z9;
        float f10;
        boolean z10;
        int i12;
        byte b13;
        int i13;
        byte b14;
        byte b15;
        int iDigit2;
        int iDigit22;
        int i14;
        byte b16;
        byte[] bArr = this.bytes;
        byte b17 = this.f1929ch;
        int i15 = this.offset;
        int i16 = this.end;
        if (b17 != 34 && b17 != 39) {
            i9 = i15;
            b10 = b17;
            b17 = 0;
        } else if (i15 == i16) {
            i9 = i15;
            b10 = 26;
        } else {
            i9 = i15 + 1;
            b10 = bArr[i15];
        }
        if (b17 == 0 || b10 != b17) {
            j3 = 1;
            if (b10 < 48 || b10 > 57) {
                j4 = 0;
                if (b10 == 45 || b10 == 43) {
                    j5 = 0;
                }
                j5 = 1;
            } else {
                j4 = 0;
                j5 = 48 - b10;
            }
            while (true) {
                i10 = -1;
                if (j5 > j4) {
                    f3 = 0.0f;
                    break;
                }
                f3 = 0.0f;
                if (i9 + 1 >= i16 || (iDigit22 = IOUtils.digit2(bArr, i9)) == -1) {
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
                b11 = b10;
            } else {
                b11 = bArr[i9];
                if (b11 >= 48 && b11 <= 57) {
                    if (Buffer.OVERFLOW_ZONE <= j5) {
                        j5 = ((j5 * 10) + 48) - ((long) b11);
                        i9++;
                    } else {
                        j5 = 1;
                    }
                }
            }
            if (j5 > j4 || i9 >= i16 || bArr[i9] != 46) {
                i11 = 0;
            } else {
                i9++;
                i11 = 0;
                while (j5 <= j4 && i9 + 1 < i16 && (iDigit2 = IOUtils.digit2(bArr, i9)) != i10) {
                    if (-92233720368547758L <= j5) {
                        j5 = (j5 * 100) - ((long) iDigit2);
                        i9 += 2;
                        i11 += 2;
                        i10 = -1;
                    } else {
                        j5 = 1;
                    }
                }
                if (j5 <= j4 && i9 < i16 && (b11 = bArr[i9]) >= 48 && b11 <= 57) {
                    if (Buffer.OVERFLOW_ZONE <= j5) {
                        j5 = ((j5 * 10) + 48) - ((long) b11);
                        i9++;
                        i11++;
                    } else {
                        j5 = 1;
                    }
                }
            }
            if (j5 <= j4) {
                if (i9 == i16) {
                    b11 = 26;
                } else {
                    b11 = bArr[i9];
                    i9++;
                }
            }
            if (j5 <= j4) {
                if (b11 == 101 || b11 == 69) {
                    if (i9 == i16) {
                        i13 = i9;
                        b14 = 26;
                    } else {
                        i13 = i9 + 1;
                        b14 = bArr[i9];
                    }
                    boolean z11 = b14 == 45;
                    if (z11 || b14 == 43) {
                        if (i13 == i16) {
                            b14 = 26;
                        } else {
                            int i17 = i13 + 1;
                            byte b18 = bArr[i13];
                            i13 = i17;
                            b14 = b18;
                        }
                    } else if (b14 == 44) {
                        throw numberError();
                    }
                    if (b14 < 48 || b14 > 57) {
                        b11 = b14;
                        i9 = i13;
                        j5 = 1;
                    } else {
                        int i18 = b14 + JSONB.Constants.BC_INT64_BYTE_ZERO;
                        while (i13 < i16) {
                            byte b19 = bArr[i13];
                            if (b19 < 48 || b19 > 57) {
                                break;
                            }
                            i18 = (i18 * 10) + b19 + JSONB.Constants.BC_INT64_BYTE_ZERO;
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
                            b15 = 26;
                        } else {
                            i9 = i13 + 1;
                            b15 = bArr[i13];
                        }
                        b11 = b15;
                    }
                } else if (b11 == 76 || b11 == 70 || b11 == 68 || b11 == 66 || b11 == 83) {
                    if (i9 == i16) {
                        b11 = 26;
                    } else {
                        b11 = bArr[i9];
                        i9++;
                    }
                }
            }
            if (j5 <= j4 && b17 != 0) {
                if (b11 == b17) {
                    if (i9 == i16) {
                        i12 = i9;
                        b13 = 26;
                    } else {
                        i12 = i9 + 1;
                        b13 = bArr[i9];
                    }
                    b11 = b13;
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
                        fFloatValue = (b10 == 45 ? j5 != j4 : f10 == f3) ? f10 : -f10;
                    } else if (i11 <= -128 || i11 >= 128) {
                        fFloatValue = f10;
                        b12 = b11;
                        j5 = 1;
                    } else {
                        fFloatValue = TypeUtils.floatValue(b10 == 45 ? -1 : 1, Math.abs(j5), i11);
                    }
                    b12 = b11;
                }
                z10 = true;
                if (!z10) {
                }
                b12 = b11;
            } else {
                b12 = b11;
                fFloatValue = f3;
            }
            z9 = false;
        } else {
            if (i9 == i16) {
                b12 = 26;
            } else {
                b12 = bArr[i9];
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
        while (b12 <= 32 && ((j3 << b12) & 4294981377L) != j4) {
            if (i9 == i16) {
                b12 = 26;
            } else {
                b12 = bArr[i9];
                i9++;
            }
        }
        boolean z12 = b12 == 44;
        this.comma = z12;
        if (z12) {
            if (i9 == i16) {
                i14 = i9;
                b16 = 26;
            } else {
                i14 = i9 + 1;
                b16 = bArr[i9];
            }
            loop1: while (true) {
                byte b20 = b16;
                i9 = i14;
                b12 = b20;
                while (b12 <= 32 && ((j3 << b12) & 4294981377L) != j4) {
                    if (i9 == i16) {
                        b12 = 26;
                    }
                }
                i14 = i9 + 1;
                b16 = bArr[i9];
            }
        }
        this.wasNull = z9;
        this.f1929ch = (char) b12;
        this.offset = i9;
        return fFloatValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Path cross not found for [B:23:0x0042, B:24:0x0044], limit reached: 100 */
    /* JADX WARN: Path cross not found for [B:24:0x0044, B:23:0x0042], limit reached: 100 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x004e -> B:19:0x0036). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x00d9 -> B:68:0x00c8). Please report as a decompilation issue!!! */
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
    public final byte[] readHex() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.offset
            byte[] r2 = r0.bytes
            char r3 = r0.f1929ch
            r4 = 120(0x78, float:1.68E-43)
            r5 = 26
            if (r3 != r4) goto L1d
            int r3 = r0.end
            if (r1 != r3) goto L14
            r3 = r5
            goto L1d
        L14:
            int r3 = r1 + 1
            r1 = r2[r1]
            r16 = r3
            r3 = r1
            r1 = r16
        L1d:
            r4 = 39
            java.lang.String r6 = "illegal state. "
            if (r3 == r4) goto L31
            r4 = 34
            if (r3 != r4) goto L28
            goto L31
        L28:
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r3, r6)
            p012ah.C0086a.m464w(r1)
        L2f:
            r1 = 0
            return r1
        L31:
            int r4 = r0.end
            if (r1 != r4) goto L38
            r4 = r1
        L36:
            r7 = r5
            goto L3c
        L38:
            int r4 = r1 + 1
            r7 = r2[r1]
        L3c:
            r8 = 57
            r9 = 48
            if (r7 < r9) goto L44
            if (r7 <= r8) goto L4c
        L44:
            r10 = 65
            if (r7 < r10) goto L5b
            r10 = 70
            if (r7 > r10) goto L5b
        L4c:
            int r7 = r0.end
            if (r4 != r7) goto L51
            goto L36
        L51:
            int r7 = r4 + 1
            r4 = r2[r4]
            r16 = r7
            r7 = r4
            r4 = r16
            goto L3c
        L5b:
            if (r7 != r3) goto L102
            int r3 = r0.end
            if (r4 != r3) goto L64
            r3 = r4
            r4 = r5
            goto L68
        L64:
            int r3 = r4 + 1
            r4 = r2[r4]
        L68:
            int r7 = r3 - r1
            int r10 = r7 + (-2)
            r11 = 1
            if (r4 != r5) goto L71
            int r10 = r7 + (-1)
        L71:
            int r7 = r10 % 2
            if (r7 != 0) goto Lf9
            int r10 = r10 / 2
            byte[] r6 = new byte[r10]
            r7 = 0
        L7a:
            if (r7 >= r10) goto L99
            int r12 = r7 * 2
            int r12 = r12 + r1
            r13 = r2[r12]
            int r12 = r12 + r11
            r12 = r2[r12]
            r14 = 55
            if (r13 > r8) goto L8a
            r15 = r9
            goto L8b
        L8a:
            r15 = r14
        L8b:
            int r13 = r13 - r15
            if (r12 > r8) goto L8f
            r14 = r9
        L8f:
            int r12 = r12 - r14
            int r13 = r13 << 4
            r12 = r12 | r13
            byte r12 = (byte) r12
            r6[r7] = r12
            int r7 = r7 + 1
            goto L7a
        L99:
            r7 = 0
            r9 = 4294981377(0x100003701, double:2.122002748E-314)
            r12 = 1
            r1 = 32
            if (r4 > r1) goto Lba
            long r14 = r12 << r4
            long r14 = r14 & r9
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 == 0) goto Lba
            int r1 = r0.end
            if (r3 != r1) goto Lb3
            r4 = r5
            goto L99
        Lb3:
            int r1 = r3 + 1
            r3 = r2[r3]
            r4 = r3
            r3 = r1
            goto L99
        Lba:
            r14 = 44
            if (r4 != r14) goto Lf3
            int r14 = r0.end
            if (r3 < r14) goto Lc3
            goto Lf3
        Lc3:
            r0.comma = r11
            if (r3 != r14) goto Lca
            r4 = r3
        Lc8:
            r3 = r5
            goto Lce
        Lca:
            int r4 = r3 + 1
            r3 = r2[r3]
        Lce:
            if (r3 > r1) goto Le6
            long r14 = r12 << r3
            long r14 = r14 & r9
            int r11 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r11 == 0) goto Le6
            int r3 = r0.end
            if (r4 != r3) goto Ldc
            goto Lc8
        Ldc:
            int r3 = r4 + 1
            r4 = r2[r4]
            r16 = r4
            r4 = r3
            r3 = r16
            goto Lce
        Le6:
            r0.offset = r4
            char r1 = (char) r3
            r0.f1929ch = r1
            r2 = 47
            if (r1 != r2) goto Lf2
            r0.skipComment()
        Lf2:
            return r6
        Lf3:
            r0.offset = r3
            char r1 = (char) r4
            r0.f1929ch = r1
            return r6
        Lf9:
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r10, r6)
            p012ah.C0086a.m464w(r1)
            goto L2f
        L102:
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r7, r6)
            p012ah.C0086a.m464w(r1)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readHex():byte[]");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean readIfNull() {
        int i9;
        byte b10;
        byte[] bArr = this.bytes;
        char c10 = this.f1929ch;
        int i10 = this.offset;
        if (c10 != 'n' || bArr[i10] != 117 || bArr[i10 + 1] != 108 || bArr[i10 + 2] != 108) {
            return false;
        }
        int i11 = i10 + 3;
        byte b11 = i11 == this.end ? (byte) 26 : (char) bArr[i11];
        int i12 = i10 + 4;
        while (b11 <= 32 && ((1 << b11) & 4294981377L) != 0) {
            if (i12 == this.end) {
                b11 = 26;
            } else {
                int i13 = i12 + 1;
                byte b12 = bArr[i12];
                i12 = i13;
                b11 = b12;
            }
        }
        boolean z9 = b11 == 44;
        this.comma = z9;
        if (z9) {
            if (i12 == this.end) {
                i9 = i12;
                b10 = 26;
            } else {
                i9 = i12 + 1;
                b10 = (char) bArr[i12];
            }
            loop1: while (true) {
                byte b13 = b10;
                i12 = i9;
                b11 = b13;
                while (b11 <= 32 && ((1 << b11) & 4294981377L) != 0) {
                    if (i12 == this.end) {
                        b11 = 26;
                    }
                }
                i9 = i12 + 1;
                b10 = bArr[i12];
            }
        }
        this.offset = i12;
        this.f1929ch = (char) b11;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:100:0x0101) to fix multi-entry loop: BACK_EDGE: B:100:0x0101 -> B:93:0x00ee */
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
    public final int readInt32Value() {
        /*
            r21 = this;
            r0 = r21
            char r1 = r0.f1929ch
            int r2 = r0.offset
            int r3 = r0.end
            byte[] r4 = r0.bytes
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
            r2 = r4[r2]
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
            r13 = r4[r5]
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
            r5 = r4[r5]
        L80:
            if (r11 > 0) goto L10d
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 < r11) goto L88
            if (r1 != r8) goto L10d
        L88:
            boolean[] r12 = com.alibaba.fastjson2.JSONReader.INT_VALUE_END
            r13 = r5 & 255(0xff, float:3.57E-43)
            boolean r12 = r12[r13]
            if (r12 == 0) goto L10d
            if (r2 == 0) goto L94
            if (r5 != r2) goto L10d
        L94:
            if (r2 == 0) goto L9f
            if (r9 != r3) goto L9a
            r5 = r7
            goto L9f
        L9a:
            int r2 = r9 + 1
            r5 = r4[r9]
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
            r5 = r4[r9]
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
            r5 = r4[r9]
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
            if (r6 == 0) goto L103
            if (r9 != r3) goto Le8
            r6 = r7
            goto Lee
        Le8:
            int r5 = r9 + 1
            r6 = r4[r9]
            char r6 = (char) r6
            goto L101
        Lee:
            r5 = r6
        Lef:
            if (r5 > r2) goto L103
            long r18 = r16 << r5
            long r18 = r18 & r14
            int r6 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r6 == 0) goto L103
            if (r9 != r3) goto Lfd
            r5 = r7
            goto Lef
        Lfd:
            int r5 = r9 + 1
            r6 = r4[r9]
        L101:
            r9 = r5
            goto Lee
        L103:
            char r2 = (char) r5
            r0.f1929ch = r2
            r0.offset = r9
            if (r1 != r8) goto L10b
            return r11
        L10b:
            int r1 = -r11
            return r1
        L10d:
            int r1 = r0.readInt32ValueOverflow()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readInt32Value():int");
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
    public final long readInt64Value() {
        /*
            r23 = this;
            r0 = r23
            char r1 = r0.f1929ch
            int r2 = r0.offset
            int r3 = r0.end
            byte[] r4 = r0.bytes
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
            r2 = r4[r2]
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
            r8 = r4[r5]
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
            r5 = r4[r5]
        La2:
            int r8 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r8 > 0) goto L133
            r8 = -9223372036854775808
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 < 0) goto Lae
            if (r1 != r10) goto L133
        Lae:
            boolean[] r8 = com.alibaba.fastjson2.JSONReader.INT_VALUE_END
            r9 = r5 & 255(0xff, float:3.57E-43)
            boolean r8 = r8[r9]
            if (r8 == 0) goto L133
            if (r2 == 0) goto Lba
            if (r5 != r2) goto L133
        Lba:
            if (r2 == 0) goto Lc5
            if (r7 != r3) goto Lc0
            r5 = r6
            goto Lc5
        Lc0:
            int r2 = r7 + 1
            r5 = r4[r7]
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
            r5 = r4[r7]
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
            r5 = r4[r7]
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
            if (r11 == 0) goto L129
            if (r7 != r3) goto L10c
            r5 = r7
            r7 = r6
            goto L111
        L10c:
            int r5 = r7 + 1
            r7 = r4[r7]
            char r7 = (char) r7
        L111:
            r22 = r7
            r7 = r5
            r5 = r22
        L116:
            if (r5 > r2) goto L129
            long r16 = r18 << r5
            long r16 = r16 & r8
            int r11 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r11 == 0) goto L129
            if (r7 != r3) goto L124
            r5 = r6
            goto L116
        L124:
            int r5 = r7 + 1
            r7 = r4[r7]
            goto L111
        L129:
            char r2 = (char) r5
            r0.f1929ch = r2
            r0.offset = r7
            if (r1 != r10) goto L131
            return r14
        L131:
            long r1 = -r14
            return r1
        L133:
            long r1 = r0.readInt64ValueOverflow()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readInt64Value():long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate() {
        boolean z9;
        int i9;
        LocalDate localDateOf;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        byte b10 = this.f1929ch;
        if (b10 == 34 || b10 == 39) {
            JSONReader.Context context = this.context;
            if (context.dateFormat == null || context.formatyyyyMMddhhmmss19 || context.formatyyyyMMddhhmmssT19 || context.formatyyyyMMdd8 || context.formatISO8601) {
                int i11 = i10 + 10;
                if (i11 < bArr.length && i11 < this.end && bArr[i10 + 4] == 45 && bArr[i10 + 7] == 45 && bArr[i11] == b10) {
                    byte b11 = bArr[i10];
                    byte b12 = bArr[i10 + 1];
                    byte b13 = bArr[i10 + 2];
                    byte b14 = bArr[i10 + 3];
                    byte b15 = bArr[i10 + 5];
                    byte b16 = bArr[i10 + 6];
                    byte b17 = bArr[i10 + 8];
                    byte b18 = bArr[i10 + 9];
                    z9 = true;
                    if (b11 >= 48 && b11 <= 57 && b12 >= 48 && b12 <= 57 && b13 >= 48 && b13 <= 57 && b14 >= 48 && b14 <= 57) {
                        int iM6853z = (b14 - JSONB.Constants.BC_INT32_BYTE_MIN) + AbstractC3199a.m6853z(b13, 48, 10, AbstractC3199a.m6853z(b12, 48, 100, (b11 - JSONB.Constants.BC_INT32_BYTE_MIN) * 1000));
                        if (b15 >= 48 && b15 <= 57 && b16 >= 48 && b16 <= 57) {
                            int i12 = (b16 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b15 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
                            if (b17 >= 48 && b17 <= 57 && b18 >= 48 && b18 <= 57) {
                                int i13 = (b18 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b17 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
                                if (iM6853z == 0 && i12 == 0 && i13 == 0) {
                                    localDateOf = null;
                                } else {
                                    try {
                                        localDateOf = LocalDate.of(iM6853z, i12, i13);
                                    } catch (DateTimeException e6) {
                                        C0086a.m465x(info("read date error"), e6);
                                        return null;
                                    }
                                }
                                this.offset = i10 + 11;
                                next();
                                boolean z10 = this.f1929ch == ',';
                                this.comma = z10;
                                if (z10) {
                                    next();
                                }
                                return localDateOf;
                            }
                        }
                    }
                } else {
                    z9 = true;
                }
                int iMin = Math.min(i10 + 17, this.end);
                int i14 = -1;
                for (int i15 = i10; i15 < iMin; i15++) {
                    if (bArr[i15] == b10) {
                        i14 = i15;
                    }
                }
                if (i14 != -1 && (i9 = i14 - i10) > 10 && bArr[i14 - 6] == 45 && bArr[i14 - 3] == 45) {
                    LocalDate localDateOf2 = LocalDate.of(TypeUtils.parseInt(bArr, i10, i9 - 6), TypeUtils.parseInt(bArr, i14 - 5, 2), TypeUtils.parseInt(bArr, i14 - 2, 2));
                    this.offset = i14 + 1;
                    next();
                    boolean z11 = this.f1929ch == ',' ? z9 : false;
                    this.comma = z11;
                    if (z11) {
                        next();
                    }
                    return localDateOf2;
                }
            }
        }
        return super.readLocalDate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    public final LocalDate readLocalDate10() {
        if (!isString()) {
            C0086a.m464w("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDate10 = DateUtils.parseLocalDate10(this.bytes, this.offset);
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
    public final LocalDate readLocalDate11() {
        if (!isString()) {
            C0086a.m464w("localDate only support string input");
            return null;
        }
        LocalDate localDate11 = DateUtils.parseLocalDate11(this.bytes, this.offset);
        if (localDate11 == null) {
            return null;
        }
        this.offset += 11;
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
    public final LocalDate readLocalDate8() {
        if (!isString()) {
            C0086a.m464w("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDate8 = DateUtils.parseLocalDate8(this.bytes, this.offset);
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
    public final LocalDate readLocalDate9() {
        if (!isString()) {
            C0086a.m464w("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDate9 = DateUtils.parseLocalDate9(this.bytes, this.offset);
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
    public final LocalDateTime readLocalDateTime12() {
        if (!isString()) {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime12 = DateUtils.parseLocalDateTime12(this.bytes, this.offset);
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
    public final LocalDateTime readLocalDateTime14() {
        if (!isString()) {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime14 = DateUtils.parseLocalDateTime14(this.bytes, this.offset);
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
    public final LocalDateTime readLocalDateTime16() {
        if (!isString()) {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime16 = DateUtils.parseLocalDateTime16(this.bytes, this.offset);
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
    public final LocalDateTime readLocalDateTime17() {
        if (!isString()) {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime17 = DateUtils.parseLocalDateTime17(this.bytes, this.offset);
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
    public final LocalDateTime readLocalDateTime18() {
        if (!isString()) {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime18 = DateUtils.parseLocalDateTime18(this.bytes, this.offset);
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
    public final LocalDateTime readLocalDateTime19() {
        if (!isString()) {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime19 = DateUtils.parseLocalDateTime19(this.bytes, this.offset);
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
    public final LocalDateTime readLocalDateTime20() {
        if (!isString()) {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTime20 = DateUtils.parseLocalDateTime20(this.bytes, this.offset);
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
    public final LocalDateTime readLocalDateTimeX(int i9) {
        if (!isString()) {
            C0086a.m464w("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeX = DateUtils.parseLocalDateTimeX(this.bytes, this.offset, i9);
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
    public final LocalTime readLocalTime10() {
        if (!isString()) {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime10 = DateUtils.parseLocalTime10(this.bytes, this.offset);
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
    public final LocalTime readLocalTime11() {
        if (!isString()) {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime11 = DateUtils.parseLocalTime11(this.bytes, this.offset);
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
    public final LocalTime readLocalTime12() {
        if (!isString()) {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime12 = DateUtils.parseLocalTime12(this.bytes, this.offset);
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
        if (!isString()) {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime15 = DateUtils.parseLocalTime15(this.bytes, this.offset);
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
    public final LocalTime readLocalTime18() {
        if (!isString()) {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime18 = DateUtils.parseLocalTime18(this.bytes, this.offset);
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
    public final LocalTime readLocalTime5() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime5 = DateUtils.parseLocalTime5(this.bytes, this.offset);
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
    public final LocalTime readLocalTime8() {
        if (!isString()) {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime8 = DateUtils.parseLocalTime8(this.bytes, this.offset);
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
    public final LocalTime readLocalTime9() {
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            C0086a.m464w("localTime only support string input");
            return null;
        }
        LocalTime localTime8 = DateUtils.parseLocalTime8(this.bytes, this.offset);
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
    public final long readMillis19() {
        byte b10 = this.f1929ch;
        if (b10 != 34 && b10 != 39) {
            C0086a.m464w("date only support string input");
            return 0L;
        }
        int i9 = this.offset;
        if (i9 + 18 >= this.end) {
            this.wasNull = true;
            return 0L;
        }
        long millis19 = DateUtils.parseMillis19(this.bytes, i9, this.context.zoneId);
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        if (bArr[i10 + 19] != b10) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readNaN():double");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            r14.f1929ch = r0
            r14.offset = r1
            return
        L7b:
            java.lang.String r0 = "json syntax error, not match null"
            java.lang.String r0 = p068eh.AbstractC0921a.m2249l(r1, r0)
            p012ah.C0086a.m464w(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readNull():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            r19 = this;
            r0 = r19
            byte[] r1 = r0.bytes
            int r2 = r0.offset
            int r3 = r2 + 2
            int r4 = r0.end
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            r12 = 26
            if (r3 >= r4) goto L3a
            r13 = r1[r2]
            r14 = 117(0x75, float:1.64E-43)
            if (r13 != r14) goto L3a
            int r13 = r2 + 1
            r13 = r1[r13]
            r14 = 108(0x6c, float:1.51E-43)
            if (r13 != r14) goto L3a
            r13 = r1[r3]
            if (r13 != r14) goto L3a
            int r3 = r2 + 3
            if (r3 != r4) goto L31
            r3 = r12
            goto L33
        L31:
            r3 = r1[r3]
        L33:
            int r2 = r2 + 4
            r4 = 0
            r16 = r5
            goto Lf2
        L3a:
            int r13 = r2 + 1
            if (r13 >= r4) goto L159
            r14 = r1[r2]
            r15 = 101(0x65, float:1.42E-43)
            if (r14 != r15) goto L159
            r13 = r1[r13]
            r14 = 119(0x77, float:1.67E-43)
            if (r13 != r14) goto L159
            int r2 = r2 + 3
            if (r2 != r4) goto L50
        L4e:
            r3 = r12
            goto L52
        L50:
            r3 = r1[r3]
        L52:
            if (r3 > r11) goto L6a
            long r13 = r9 << r3
            long r13 = r13 & r7
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 == 0) goto L6a
            int r3 = r0.end
            if (r2 != r3) goto L60
            goto L4e
        L60:
            int r3 = r2 + 1
            r2 = r1[r2]
            r18 = r3
            r3 = r2
            r2 = r18
            goto L52
        L6a:
            int r4 = r2 + 4
            int r13 = r0.end
            java.lang.String r14 = "json syntax error, not match new Date"
            if (r4 >= r13) goto L151
            r16 = r5
            r5 = 68
            if (r3 != r5) goto L151
            r3 = r1[r2]
            r5 = 97
            if (r3 != r5) goto L151
            int r3 = r2 + 1
            r3 = r1[r3]
            r5 = 116(0x74, float:1.63E-43)
            if (r3 != r5) goto L151
            int r3 = r2 + 2
            r3 = r1[r3]
            if (r3 != r15) goto L151
            int r2 = r2 + 3
            if (r2 != r13) goto L92
        L90:
            r2 = r12
            goto L94
        L92:
            r2 = r1[r2]
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
            r3 = r1[r4]
            r4 = r2
            r2 = r3
            goto L94
        La9:
            r3 = 40
            if (r2 != r3) goto L149
            int r2 = r0.end
            if (r4 >= r2) goto L149
            int r2 = r4 + 1
            r3 = r1[r4]
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
            r2 = r1[r2]
            r18 = r3
            r3 = r2
            r2 = r18
            goto Lb5
        Lce:
            char r3 = (char) r3
            r0.f1929ch = r3
            r0.offset = r2
            long r2 = r0.readInt64Value()
            char r4 = r0.f1929ch
            int r5 = r0.offset
            r6 = 41
            if (r4 != r6) goto L140
            int r4 = r0.end
            if (r5 < r4) goto Le6
            r4 = r5
            r5 = r12
            goto Lea
        Le6:
            int r4 = r5 + 1
            r5 = r1[r5]
        Lea:
            java.util.Date r6 = new java.util.Date
            r6.<init>(r2)
            r2 = r4
            r3 = r5
            r4 = r6
        Lf2:
            if (r3 > r11) goto L10b
            long r5 = r9 << r3
            long r5 = r5 & r7
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L10b
            int r3 = r0.end
            if (r2 != r3) goto L101
            r3 = r12
            goto Lf2
        L101:
            int r3 = r2 + 1
            r2 = r1[r2]
            r18 = r3
            r3 = r2
            r2 = r18
            goto Lf2
        L10b:
            r5 = 44
            if (r3 != r5) goto L111
            r5 = 1
            goto L112
        L111:
            r5 = 0
        L112:
            r0.comma = r5
            if (r5 == 0) goto L13a
            int r3 = r0.end
            if (r2 != r3) goto L11d
            r3 = r2
            r2 = r12
            goto L121
        L11d:
            int r3 = r2 + 1
            r2 = r1[r2]
        L121:
            r18 = r3
            r3 = r2
            r2 = r18
        L126:
            if (r3 > r11) goto L13a
            long r5 = r9 << r3
            long r5 = r5 & r7
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L13a
            int r3 = r0.end
            if (r2 != r3) goto L135
            r3 = r12
            goto L126
        L135:
            int r3 = r2 + 1
            r2 = r1[r2]
            goto L121
        L13a:
            r0.offset = r2
            char r1 = (char) r3
            r0.f1929ch = r1
            return r4
        L140:
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r5, r14)
            p012ah.C0086a.m464w(r1)
        L147:
            r1 = 0
            return r1
        L149:
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r4, r14)
            p012ah.C0086a.m464w(r1)
            goto L147
        L151:
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r2, r14)
            p012ah.C0086a.m464w(r1)
            goto L147
        L159:
            java.lang.String r1 = "json syntax error, not match null or new Date"
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r2, r1)
            p012ah.C0086a.m464w(r1)
            goto L147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readNullOrNewDate():java.util.Date");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:229:0x031c) to fix multi-entry loop: BACK_EDGE: B:229:0x031c -> B:201:0x02d1 */
    /* JADX DEBUG: Duplicate block (B:231:0x0323) to fix multi-entry loop: BACK_EDGE: B:231:0x0323 -> B:201:0x02d1 */
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
            byte[] r3 = r0.bytes
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
            goto L74
        L39:
            int r6 = r2 + 1
            r9 = r3[r2]
            char r9 = (char) r9
            if (r9 != r4) goto L6d
            if (r6 != r5) goto L45
        L42:
            r1 = r16
            goto L49
        L45:
            int r2 = r2 + r15
            r1 = r3[r6]
            r6 = r2
        L49:
            if (r1 > r14) goto L5d
            long r19 = r12 << r1
            long r19 = r19 & r10
            int r2 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r2 == 0) goto L5d
            if (r6 != r5) goto L56
            goto L42
        L56:
            int r1 = r6 + 1
            r2 = r3[r6]
            r6 = r1
            r1 = r2
            goto L49
        L5d:
            char r1 = (char) r1
            r0.f1929ch = r1
            r0.offset = r6
            boolean r1 = r0.nextIfComma()
            r0.comma = r1
            r0.wasNull = r8
            r0.valueType = r7
            return
        L6d:
            r19 = r6
            r6 = r4
            r4 = r9
            r9 = r19
            goto L36
        L74:
            r10 = 43
            r11 = 45
            r21 = r12
            java.lang.String r12 = "illegal input"
            if (r4 != r11) goto L8f
            if (r9 == r5) goto L87
            r0.negative = r8
            int r4 = r9 + 1
            r13 = r3[r9]
            goto Lab
        L87:
            java.lang.String r1 = r0.info(r12)
            p012ah.C0086a.m464w(r1)
            return
        L8f:
            if (r4 != r10) goto La5
            if (r9 == r5) goto L9d
            int r4 = r9 + 1
            r13 = r3[r9]
            r27 = r13
            r13 = r4
            r4 = r27
            goto La6
        L9d:
            java.lang.String r1 = r0.info(r12)
            p012ah.C0086a.m464w(r1)
            return
        La5:
            r13 = r9
        La6:
            r27 = r13
            r13 = r4
            r4 = r27
        Lab:
            r0.valueType = r8
            r23 = r1
            r24 = r23
        Lb1:
            r14 = 57
            r25 = 10
            r1 = 48
            r7 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            if (r13 < r1) goto Lec
            if (r13 > r14) goto Lec
            if (r23 != 0) goto Ld5
            int r13 = r13 + (-48)
            r26 = r8
            int r8 = r0.mag3
            int r8 = r8 * 10
            r0.mag3 = r8
            if (r8 >= r7) goto Lcf
        Lcc:
            r23 = r26
            goto Ld7
        Lcf:
            int r8 = r8 - r13
            r0.mag3 = r8
            if (r8 >= r7) goto Ld7
            goto Lcc
        Ld5:
            r26 = r8
        Ld7:
            if (r4 != r5) goto Le0
            int r4 = r4 + 1
            r13 = r16
            r24 = r26
            goto Lee
        Le0:
            int r1 = r4 + 1
            r13 = r3[r4]
            r4 = r1
            r8 = r26
            r24 = r8
            r1 = 0
            r7 = 5
            goto Lb1
        Lec:
            r26 = r8
        Lee:
            r8 = 46
            if (r13 != r8) goto L134
            r0.valueType = r15
            if (r4 == r5) goto L12c
            int r8 = r4 + 1
            r4 = r3[r4]
            r13 = r4
        Lfb:
            r4 = r8
            if (r13 < r1) goto L134
            if (r13 > r14) goto L134
            if (r23 != 0) goto L115
            int r13 = r13 + (-48)
            int r8 = r0.mag3
            int r8 = r8 * 10
            r0.mag3 = r8
            if (r8 >= r7) goto L10f
        L10c:
            r23 = r26
            goto L115
        L10f:
            int r8 = r8 - r13
            r0.mag3 = r8
            if (r8 >= r7) goto L115
            goto L10c
        L115:
            short r8 = r0.scale
            int r8 = r8 + 1
            short r8 = (short) r8
            r0.scale = r8
            if (r4 != r5) goto L125
            int r4 = r4 + 1
            r13 = r16
            r24 = r26
            goto L134
        L125:
            int r8 = r4 + 1
            r13 = r3[r4]
            r24 = r26
            goto Lfb
        L12c:
            java.lang.String r1 = r0.info(r12)
            p012ah.C0086a.m464w(r1)
            return
        L134:
            if (r23 == 0) goto L166
            boolean r7 = r0.negative
            if (r7 == 0) goto L13c
            r8 = r9
            goto L13e
        L13c:
            int r8 = r9 + (-1)
        L13e:
            short r12 = r0.scale
            if (r12 <= 0) goto L146
            int r12 = r4 + (-2)
        L144:
            int r12 = r12 - r8
            goto L149
        L146:
            int r12 = r4 + (-1)
            goto L144
        L149:
            r15 = 38
            if (r12 <= r15) goto L160
            r12 = 8
            r0.valueType = r12
            if (r7 == 0) goto L155
            int r8 = r8 + (-1)
        L155:
            java.lang.String r7 = new java.lang.String
            int r12 = r4 + (-1)
            int r12 = r12 - r8
            r7.<init>(r3, r8, r12)
            r0.stringValue = r7
            goto L16b
        L160:
            int r7 = r4 + (-1)
            r0.bigInt(r3, r8, r7)
            goto L16b
        L166:
            int r7 = r0.mag3
            int r7 = -r7
            r0.mag3 = r7
        L16b:
            r7 = 101(0x65, float:1.42E-43)
            if (r13 == r7) goto L173
            r8 = 69
            if (r13 != r8) goto L1bc
        L173:
            int r8 = r4 + 1
            r12 = r3[r4]
            if (r12 != r11) goto L181
            int r4 = r4 + 2
            r12 = r3[r8]
            r8 = r26
        L17f:
            r10 = 0
            goto L18c
        L181:
            if (r12 != r10) goto L18a
            int r4 = r4 + 2
            r8 = r3[r8]
            char r12 = (char) r8
        L188:
            r8 = 0
            goto L17f
        L18a:
            r4 = r8
            goto L188
        L18c:
            if (r12 < r1) goto L1b2
            if (r12 > r14) goto L1b2
            int r12 = r12 + (-48)
            int r10 = r10 * 10
            int r10 = r10 + r12
            r11 = 2047(0x7ff, float:2.868E-42)
            if (r10 > r11) goto L1a8
            if (r4 != r5) goto L1a0
            r13 = r16
            r24 = r26
            goto L1b3
        L1a0:
            int r11 = r4 + 1
            r12 = r3[r4]
            r4 = r11
            r24 = r26
            goto L18c
        L1a8:
            java.lang.String r1 = "too large exp value : "
            java.lang.String r1 = p068eh.AbstractC0921a.m2249l(r10, r1)
            p012ah.C0086a.m464w(r1)
            return
        L1b2:
            r13 = r12
        L1b3:
            if (r8 == 0) goto L1b6
            int r10 = -r10
        L1b6:
            short r1 = (short) r10
            r0.exponent = r1
            r1 = 2
            r0.valueType = r1
        L1bc:
            if (r4 != r9) goto L29e
            r1 = 110(0x6e, float:1.54E-43)
            r8 = 117(0x75, float:1.64E-43)
            r10 = 108(0x6c, float:1.51E-43)
            if (r13 != r1) goto L1f4
            r1 = r3[r4]
            if (r1 != r8) goto L1f0
            int r1 = r4 + 1
            r1 = r3[r1]
            if (r1 != r10) goto L1f0
            int r1 = r4 + 2
            r1 = r3[r1]
            if (r1 != r10) goto L1f0
            int r1 = r4 + 3
            r7 = r26
            r0.wasNull = r7
            r7 = 5
            r0.valueType = r7
            if (r1 != r5) goto L1e5
        L1e1:
            r4 = r1
            r13 = r16
            goto L1ea
        L1e5:
            int r4 = r4 + 4
            r1 = r3[r1]
        L1e9:
            r13 = r1
        L1ea:
            r7 = 0
        L1eb:
            r8 = 1
            r24 = 1
            goto L2a1
        L1f0:
            r7 = 0
            r8 = 1
            goto L2a1
        L1f4:
            r1 = 116(0x74, float:1.63E-43)
            r11 = 4
            if (r13 != r1) goto L21a
            r1 = r3[r4]
            r12 = 114(0x72, float:1.6E-43)
            if (r1 != r12) goto L21a
            int r1 = r4 + 1
            r1 = r3[r1]
            if (r1 != r8) goto L21a
            int r1 = r4 + 2
            r1 = r3[r1]
            if (r1 != r7) goto L21a
            int r1 = r4 + 3
            r7 = 1
            r0.boolValue = r7
            r0.valueType = r11
            if (r1 != r5) goto L215
            goto L1e1
        L215:
            int r4 = r4 + 4
            r1 = r3[r1]
            goto L1e9
        L21a:
            r1 = 102(0x66, float:1.43E-43)
            r8 = 97
            if (r13 != r1) goto L24d
            int r1 = r4 + 3
            if (r1 >= r5) goto L24d
            r12 = r3[r4]
            if (r12 != r8) goto L24d
            int r12 = r4 + 1
            r12 = r3[r12]
            if (r12 != r10) goto L24d
            int r10 = r4 + 2
            r10 = r3[r10]
            r12 = 115(0x73, float:1.61E-43)
            if (r10 != r12) goto L24d
            r1 = r3[r1]
            if (r1 != r7) goto L24d
            int r1 = r4 + 4
            r7 = 0
            r0.boolValue = r7
            r0.valueType = r11
            if (r1 != r5) goto L247
            r4 = r1
            r13 = r16
            goto L1eb
        L247:
            int r4 = r4 + 5
            r1 = r3[r1]
            r13 = r1
            goto L1eb
        L24d:
            r7 = 0
            r1 = 78
            if (r13 != r1) goto L273
            r10 = r3[r4]
            if (r10 != r8) goto L273
            int r8 = r4 + 1
            r8 = r3[r8]
            if (r8 != r1) goto L273
            int r1 = r4 + 2
            r8 = 1
            r0.boolValue = r8
            r10 = 14
            r0.valueType = r10
            if (r1 != r5) goto L26b
            r4 = r1
            r13 = r16
            goto L270
        L26b:
            int r4 = r4 + 3
            r1 = r3[r1]
            r13 = r1
        L270:
            r24 = r8
            goto L2a1
        L273:
            r8 = 1
            r1 = 123(0x7b, float:1.72E-43)
            if (r13 != r1) goto L289
            if (r6 != 0) goto L289
            r0.offset = r4
            char r1 = (char) r13
            r0.f1929ch = r1
            java.util.Map r1 = r0.readObject()
            r0.complex = r1
            r1 = 6
            r0.valueType = r1
            return
        L289:
            r1 = 91
            if (r13 != r1) goto L2a1
            if (r6 != 0) goto L2a1
            r0.offset = r4
            char r1 = (char) r13
            r0.f1929ch = r1
            java.util.List r1 = r0.readArray()
            r0.complex = r1
            r1 = 7
            r0.valueType = r1
            return
        L29e:
            r8 = r26
            r7 = 0
        L2a1:
            if (r6 == 0) goto L2bc
            if (r13 == r6) goto L2b1
            r0.offset = r2
            char r1 = (char) r6
            r0.f1929ch = r1
            r0.readString0()
            r1 = 3
            r0.valueType = r1
            return
        L2b1:
            if (r4 != r5) goto L2b6
            r13 = r16
            goto L2bc
        L2b6:
            int r1 = r4 + 1
            r2 = r3[r4]
            r4 = r1
            r13 = r2
        L2bc:
            r1 = 76
            if (r13 == r1) goto L2d4
            r1 = 70
            if (r13 == r1) goto L2d4
            r1 = 68
            if (r13 == r1) goto L2d4
            r1 = 66
            if (r13 == r1) goto L2d4
            r1 = 83
            if (r13 != r1) goto L2d1
            goto L2d4
        L2d1:
            r1 = 32
            goto L326
        L2d4:
            r1 = 66
            if (r13 == r1) goto L30f
            r1 = 68
            if (r13 == r1) goto L30a
            r1 = 70
            if (r13 == r1) goto L305
            r1 = 76
            if (r13 == r1) goto L2f5
            r1 = 83
            if (r13 == r1) goto L2e9
            goto L31a
        L2e9:
            if (r23 != 0) goto L31a
            byte r1 = r0.valueType
            r2 = 2
            if (r1 == r2) goto L31a
            r1 = r25
            r0.valueType = r1
            goto L31a
        L2f5:
            r2 = 2
            int r1 = r4 - r9
            r6 = 19
            if (r1 >= r6) goto L31a
            byte r1 = r0.valueType
            if (r1 == r2) goto L31a
            r1 = 11
            r0.valueType = r1
            goto L31a
        L305:
            r1 = 12
            r0.valueType = r1
            goto L31a
        L30a:
            r1 = 13
            r0.valueType = r1
            goto L31a
        L30f:
            if (r23 != 0) goto L31a
            byte r1 = r0.valueType
            r2 = 2
            if (r1 == r2) goto L31a
            r1 = 9
            r0.valueType = r1
        L31a:
            if (r4 != r5) goto L31f
        L31c:
            r13 = r16
            goto L2d1
        L31f:
            int r1 = r4 + 1
            r2 = r3[r4]
        L323:
            r4 = r1
            r13 = r2
            goto L2d1
        L326:
            if (r13 > r1) goto L338
            long r1 = r21 << r13
            long r1 = r1 & r19
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 == 0) goto L338
            if (r4 != r5) goto L333
            goto L31c
        L333:
            int r1 = r4 + 1
            r2 = r3[r4]
            goto L323
        L338:
            r1 = 44
            if (r13 != r1) goto L33e
            r1 = r8
            goto L33f
        L33e:
            r1 = r7
        L33f:
            r0.comma = r1
            if (r1 == 0) goto L366
            if (r4 != r5) goto L348
            r2 = r16
            goto L34d
        L348:
            int r1 = r4 + 1
            r2 = r3[r4]
            r4 = r1
        L34d:
            r13 = r2
            r1 = 32
        L350:
            if (r13 > r1) goto L366
            long r6 = r21 << r13
            long r6 = r6 & r19
            int r2 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r2 == 0) goto L366
            if (r4 != r5) goto L35f
            r13 = r16
            goto L350
        L35f:
            int r2 = r4 + 1
            r4 = r3[r4]
            r13 = r4
            r4 = r2
            goto L350
        L366:
            if (r24 == 0) goto L36e
            r0.offset = r4
            char r1 = (char) r13
            r0.f1929ch = r1
            return
        L36e:
            java.lang.String r1 = "illegal input error"
            java.lang.String r1 = r0.info(r1)
            p012ah.C0086a.m464w(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readNumber0():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:47:0x00b4) to fix multi-entry loop: BACK_EDGE: B:47:0x00b4 -> B:48:0x00b5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00ca -> B:45:0x00ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:49:0x00c0
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
    public final java.time.OffsetDateTime readOffsetDateTime() {
        /*
            r29 = this;
            r0 = r29
            byte[] r1 = r0.bytes
            int r2 = r0.offset
            int r3 = r0.end
            char r4 = r0.f1929ch
            r5 = 34
            if (r4 == r5) goto L12
            r6 = 39
            if (r4 != r6) goto L136
        L12:
            com.alibaba.fastjson2.JSONReader$Context r6 = r0.context
            boolean r6 = r6.formatComplex
            if (r6 != 0) goto L136
            int r6 = r2 + 19
            int r7 = r1.length
            if (r6 >= r7) goto L136
            if (r6 >= r3) goto L136
            int r7 = com.alibaba.fastjson2.util.DateUtils.m1772yy(r1, r2)
            r8 = -1
            if (r7 == r8) goto L136
            int r9 = r2 + 2
            long r9 = com.alibaba.fastjson2.util.DateUtils.ymd(r1, r9)
            r11 = -1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L136
            int r13 = r2 + 10
            r13 = r1[r13]
            r14 = 32
            if (r13 == r14) goto L3e
            r15 = 84
            if (r13 != r15) goto L136
        L3e:
            int r13 = r2 + 11
            r15 = r11
            long r11 = com.alibaba.fastjson2.util.DateUtils.hms(r1, r13)
            int r13 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r13 == 0) goto L136
            int r13 = r2 + 20
            r6 = r1[r6]
            r15 = 46
            r16 = 0
            if (r6 != r15) goto L58
            int r2 = r2 + 21
            r6 = r1[r13]
            r13 = r2
        L58:
            r2 = r16
            r15 = r2
        L5b:
            r14 = 48
            r17 = r14
            if (r6 < r14) goto L78
            r14 = 57
            if (r6 > r14) goto L78
            int r2 = r2 * 10
            int r14 = r6 + (-48)
            int r2 = r2 + r14
            int r15 = r15 + 1
            if (r13 >= r3) goto L78
            int r6 = r13 + 1
            r13 = r1[r13]
            r28 = r13
            r13 = r6
            r6 = r28
            goto L5b
        L78:
            if (r15 == 0) goto L7e
            int r2 = com.alibaba.fastjson2.util.DateUtils.nanos(r2, r15)
        L7e:
            r24 = r2
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            r14 = 90
            r15 = 1
            if (r6 != r14) goto L8f
            int r5 = r13 + 1
            r6 = r1[r13]
            r25 = r2
            r13 = r5
            goto La8
        L8f:
            if (r6 == r4) goto La6
            int r5 = com.alibaba.fastjson2.util.IOUtils.indexOfChar(r1, r5, r13, r3)
            if (r5 == r8) goto La6
            int r2 = r13 + (-1)
            int r6 = r5 - r13
            int r6 = r6 + r15
            java.time.ZoneOffset r2 = com.alibaba.fastjson2.util.DateUtils.zoneOffset(r1, r2, r6)
            int r13 = r5 + 1
            r25 = r2
            r6 = r4
            goto La8
        La6:
            r25 = r2
        La8:
            if (r6 != r4) goto L136
            r2 = 26
            if (r13 < r3) goto Lb0
        Lae:
            r5 = r2
            goto Lb5
        Lb0:
            int r4 = r13 + 1
            r5 = r1[r13]
        Lb4:
            r13 = r4
        Lb5:
            r18 = 0
            r20 = 4294981377(0x100003701, double:2.122002748E-314)
            r22 = 1
            r4 = 32
            if (r5 > r4) goto Ld2
            long r26 = r22 << r5
            long r26 = r26 & r20
            int r4 = (r26 > r18 ? 1 : (r26 == r18 ? 0 : -1))
            if (r4 == 0) goto Ld2
            if (r13 != r3) goto Lcd
            goto Lae
        Lcd:
            int r4 = r13 + 1
            r5 = r1[r13]
            goto Lb4
        Ld2:
            r4 = 44
            if (r5 != r4) goto Ld7
            goto Ld9
        Ld7:
            r15 = r16
        Ld9:
            r0.comma = r15
            if (r15 == 0) goto Lfe
            if (r13 != r3) goto Le1
            r5 = r2
            goto Le7
        Le1:
            int r4 = r13 + 1
            r5 = r1[r13]
            char r5 = (char) r5
            r13 = r4
        Le7:
            r4 = 32
        Le9:
            if (r5 > r4) goto Lfe
            long r14 = r22 << r5
            long r14 = r14 & r20
            int r6 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r6 == 0) goto Lfe
            if (r13 != r3) goto Lf7
            r5 = r2
            goto Le9
        Lf7:
            int r5 = r13 + 1
            r6 = r1[r13]
            r13 = r5
            r5 = r6
            goto Le9
        Lfe:
            if (r5 >= 0) goto L104
            r0.char_utf8(r5, r13)
            goto L109
        L104:
            r0.offset = r13
            char r1 = (char) r5
            r0.f1929ch = r1
        L109:
            int r1 = (int) r9
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r18 = r7 + r1
            r1 = 24
            long r2 = r9 >> r1
            int r2 = (int) r2
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r3 = r9 >> r17
            int r3 = (int) r3
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = (int) r11
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r5 = r11 >> r1
            int r1 = (int) r5
            r1 = r1 & 255(0xff, float:3.57E-43)
            long r5 = r11 >> r17
            int r5 = (int) r5
            r5 = r5 & 255(0xff, float:3.57E-43)
            r22 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r23 = r5
            java.time.OffsetDateTime r1 = java.time.OffsetDateTime.of(r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        L136:
            java.time.ZonedDateTime r1 = r0.readZonedDateTime()
            if (r1 != 0) goto L13e
            r1 = 0
            return r1
        L13e:
            java.time.OffsetDateTime r1 = r1.toOffsetDateTime()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readOffsetDateTime():java.time.OffsetDateTime");
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
        byte[] bArr = this.bytes;
        int i11 = this.offset;
        JSONReader.Context context = this.context;
        byte b10 = this.f1929ch;
        if ((b10 != 34 && b10 != 39) || context.dateFormat != null || (i9 = i11 + 8) >= bArr.length || i9 >= this.end || bArr[i11 + 2] != 58 || bArr[i11 + 5] != 58) {
            C0086a.m464w(info("illegal offsetTime"));
            return null;
        }
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        byte b13 = bArr[i11 + 3];
        byte b14 = bArr[i11 + 4];
        byte b15 = bArr[i11 + 6];
        byte b16 = bArr[i11 + 7];
        if (b11 < 48 || b11 > 57 || b12 < 48 || b12 > 57) {
            C0086a.m464w(info("illegal offsetTime"));
            return null;
        }
        int i12 = (b12 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b11 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
        if (b13 < 48 || b13 > 57 || b14 < 48 || b14 > 57) {
            C0086a.m464w(info("illegal offsetTime"));
            return null;
        }
        int i13 = (b14 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b13 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
        if (b15 < 48 || b15 > 57 || b16 < 48 || b16 > 57) {
            C0086a.m464w(info("illegal offsetTime"));
            return null;
        }
        int i14 = (b16 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b15 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
        int i15 = i11 + 25;
        int i16 = i9;
        int i17 = -1;
        while (true) {
            if (i16 >= i15 || i16 >= this.end || i16 >= bArr.length) {
                break;
            }
            byte b17 = bArr[i16];
            if (i17 == -1 && (b17 == 90 || b17 == 43 || b17 == 45)) {
                i17 = (i16 - i9) - 1;
            }
            if (b17 == b10) {
                i10 = i16 - i11;
                break;
            }
            i16++;
        }
        int i18 = (i10 - 9) - i17;
        OffsetTime offsetTimeOf = OffsetTime.of(LocalTime.of(i12, i13, i14, i17 <= 0 ? 0 : DateUtils.readNanos(bArr, i17, i11 + 9)), i18 <= 1 ? ZoneOffset.UTC : ZoneOffset.of(new String(bArr, i11 + 9 + i17, i18)));
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
            char r0 = r15.f1929ch
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
            r15.f1929ch = r0
            return r1
        L83:
            java.lang.String r0 = "illegal pattern"
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readPattern():java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            r15.f1929ch = r0
            java.lang.String r0 = r15.readString()
            char r2 = r15.f1929ch
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
            r15.f1929ch = r1
            r15.offset = r2
            return r0
        L97:
            java.lang.String r1 = "illegal reference : "
            java.lang.String r0 = p332wb.AbstractC4855en.m9263g(r1, r0)
            p012ah.C0086a.m464w(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readReference():java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:124:0x01e5) to fix multi-entry loop: BACK_EDGE: B:124:0x01e5 -> B:117:0x01d3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x01b6 -> B:100:0x019e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:103:0x01ad
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
            r21 = this;
            r0 = r21
            byte[] r1 = r0.bytes
            char r2 = r0.f1929ch
            r3 = 34
            if (r2 == r3) goto L14
            r4 = 39
            if (r2 != r4) goto Lf
            goto L14
        Lf:
            java.lang.String r1 = r0.readStringNotMatch()
            return r1
        L14:
            int r4 = r0.offset
            int r5 = r0.end
            r6 = 0
            r0.valueEscape = r6
            r7 = 1
            r8 = r4
            r9 = r6
            r10 = r7
        L1f:
            if (r8 >= r5) goto L20d
            r11 = r1[r8]
            r12 = 120(0x78, float:1.68E-43)
            r13 = 117(0x75, float:1.64E-43)
            r15 = 92
            r16 = 4
            r17 = 2
            if (r11 != r15) goto L45
            r0.valueEscape = r7
            int r11 = r8 + 1
            r11 = r1[r11]
            if (r11 != r13) goto L39
            r14 = 6
            goto L40
        L39:
            if (r11 != r12) goto L3e
            r14 = r16
            goto L40
        L3e:
            r14 = r17
        L40:
            int r8 = r8 + r14
            r18 = r7
            goto L207
        L45:
            if (r11 < 0) goto L1f2
            if (r11 != r2) goto L1ed
            boolean r11 = r0.valueEscape
            r18 = r7
            r7 = 0
            if (r11 == 0) goto L128
            char[] r8 = r0.charBuf
            if (r8 != 0) goto L60
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r8 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r10 = r0.cacheItem
            java.lang.Object r8 = r8.getAndSet(r10, r7)
            char[] r8 = (char[]) r8
            r0.charBuf = r8
        L60:
            if (r8 == 0) goto L68
            int r10 = r8.length
            if (r10 >= r9) goto L66
            goto L68
        L66:
            r11 = r8
            goto L6d
        L68:
            char[] r8 = new char[r9]
            r0.charBuf = r8
            goto L66
        L6d:
            r8 = r6
        L6e:
            r10 = r1[r4]
            r19 = 12
            if (r10 != r15) goto Ld3
            int r10 = r4 + 1
            r20 = 6
            r14 = r1[r10]
            if (r14 == r3) goto Lcc
            if (r14 == r15) goto Lcc
            r15 = 98
            if (r14 == r15) goto Lc9
            r15 = 102(0x66, float:1.43E-43)
            if (r14 == r15) goto L9a
            r15 = 110(0x6e, float:1.54E-43)
            if (r14 == r15) goto Lc6
            r15 = 114(0x72, float:1.6E-43)
            if (r14 == r15) goto Lc3
            if (r14 == r12) goto Lb6
            r15 = 116(0x74, float:1.63E-43)
            if (r14 == r15) goto Lb3
            if (r14 == r13) goto L9d
            char r19 = r0.char1(r14)
        L9a:
            r14 = r19
            goto Lcc
        L9d:
            int r10 = r4 + 2
            r10 = r1[r10]
            int r14 = r4 + 3
            r14 = r1[r14]
            int r15 = r4 + 4
            r15 = r1[r15]
            int r4 = r4 + 5
            r12 = r1[r4]
            char r19 = com.alibaba.fastjson2.JSONReader.char4(r10, r14, r15, r12)
        Lb1:
            r10 = r4
            goto L9a
        Lb3:
            r19 = 9
            goto L9a
        Lb6:
            int r10 = r4 + 2
            r10 = r1[r10]
            int r4 = r4 + 3
            r12 = r1[r4]
            char r19 = com.alibaba.fastjson2.JSONReader.char2(r10, r12)
            goto Lb1
        Lc3:
            r19 = 13
            goto L9a
        Lc6:
            r19 = 10
            goto L9a
        Lc9:
            r19 = 8
            goto L9a
        Lcc:
            char r4 = (char) r14
            r11[r8] = r4
            int r10 = r10 + 1
            r4 = r10
            goto L120
        Ld3:
            r20 = 6
            if (r10 != r2) goto Ldf
            java.lang.String r2 = new java.lang.String
            r2.<init>(r11, r6, r9)
            r8 = r4
            goto L16f
        Ldf:
            if (r10 < 0) goto Le7
            char r10 = (char) r10
            r11[r8] = r10
            int r4 = r4 + 1
            goto L120
        Le7:
            r12 = r10 & 255(0xff, float:3.57E-43)
            int r12 = r12 >> 4
            switch(r12) {
                case 12: goto L110;
                case 13: goto L110;
                case 14: goto Lf6;
                default: goto Lee;
            }
        Lee:
            char2_utf8(r1, r4, r10, r11, r8)
            int r4 = r4 + 4
            int r8 = r8 + 1
            goto L120
        Lf6:
            r10 = r10 & 15
            int r10 = r10 << 12
            int r12 = r4 + 1
            r12 = r1[r12]
            r12 = r12 & 63
            int r12 = r12 << 6
            r10 = r10 | r12
            int r12 = r4 + 2
            r12 = r1[r12]
            r12 = r12 & 63
            r10 = r10 | r12
            char r10 = (char) r10
            r11[r8] = r10
            int r4 = r4 + 3
            goto L120
        L110:
            int r12 = r4 + 1
            r12 = r1[r12]
            r10 = r10 & 31
            int r10 = r10 << 6
            r12 = r12 & 63
            r10 = r10 | r12
            char r10 = (char) r10
            r11[r8] = r10
            int r4 = r4 + 2
        L120:
            int r8 = r8 + 1
            r12 = 120(0x78, float:1.68E-43)
            r15 = 92
            goto L6e
        L128:
            if (r10 == 0) goto L166
            int r2 = r8 - r4
            int r9 = com.alibaba.fastjson2.util.JDKUtils.ANDROID_SDK_INT
            if (r9 >= r3) goto L15d
            char[] r3 = r0.charBuf
            if (r3 != 0) goto L140
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r3 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r9 = r0.cacheItem
            java.lang.Object r3 = r3.getAndSet(r9, r7)
            char[] r3 = (char[]) r3
            r0.charBuf = r3
        L140:
            if (r3 == 0) goto L145
            int r9 = r3.length
            if (r9 >= r2) goto L149
        L145:
            char[] r3 = new char[r2]
            r0.charBuf = r3
        L149:
            r9 = r6
        L14a:
            if (r9 >= r2) goto L156
            int r10 = r4 + r9
            r10 = r1[r10]
            char r10 = (char) r10
            r3[r9] = r10
            int r9 = r9 + 1
            goto L14a
        L156:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3, r6, r2)
            r2 = r4
            goto L16f
        L15d:
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.ISO_8859_1
            r3.<init>(r1, r4, r2, r9)
            r2 = r3
            goto L16f
        L166:
            java.lang.String r2 = new java.lang.String
            int r3 = r8 - r4
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r1, r4, r3, r9)
        L16f:
            com.alibaba.fastjson2.JSONReader$Context r3 = r0.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r9 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r9 = r9.mask
            long r3 = r3 & r9
            r9 = 0
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L182
            java.lang.String r2 = r2.trim()
        L182:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L196
            com.alibaba.fastjson2.JSONReader$Context r3 = r0.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            long r11 = r11.mask
            long r3 = r3 & r11
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L196
            goto L197
        L196:
            r7 = r2
        L197:
            int r2 = r8 + 1
            r3 = 26
            if (r2 != r5) goto L1a0
            r8 = r2
        L19e:
            r2 = r3
            goto L1a4
        L1a0:
            int r8 = r8 + 2
            r2 = r1[r2]
        L1a4:
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r4 = 32
            if (r2 > r4) goto L1c0
            long r15 = r13 << r2
            long r15 = r15 & r11
            int r15 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r15 == 0) goto L1c0
            if (r8 != r5) goto L1b9
            goto L19e
        L1b9:
            int r2 = r8 + 1
            r4 = r1[r8]
            r8 = r2
            r2 = r4
            goto L1a4
        L1c0:
            r15 = 44
            if (r2 != r15) goto L1c6
            r6 = r18
        L1c6:
            r0.comma = r6
            if (r6 == 0) goto L1e7
            if (r8 != r5) goto L1ce
            r6 = r3
            goto L1d3
        L1ce:
            int r2 = r8 + 1
            r6 = r1[r8]
            goto L1e5
        L1d3:
            r2 = r6
        L1d4:
            if (r2 > r4) goto L1e7
            long r15 = r13 << r2
            long r15 = r15 & r11
            int r6 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r6 == 0) goto L1e7
            if (r8 != r5) goto L1e1
            r2 = r3
            goto L1d4
        L1e1:
            int r2 = r8 + 1
            r6 = r1[r8]
        L1e5:
            r8 = r2
            goto L1d3
        L1e7:
            char r1 = (char) r2
            r0.f1929ch = r1
            r0.offset = r8
            return r7
        L1ed:
            r18 = r7
            int r8 = r8 + 1
            goto L207
        L1f2:
            r18 = r7
            r7 = r11 & 255(0xff, float:3.57E-43)
            int r7 = r7 >> 4
            switch(r7) {
                case 12: goto L204;
                case 13: goto L204;
                case 14: goto L201;
                default: goto L1fb;
            }
        L1fb:
            int r8 = r8 + 4
            int r9 = r9 + 1
        L1ff:
            r10 = r6
            goto L207
        L201:
            int r8 = r8 + 3
            goto L1ff
        L204:
            int r8 = r8 + 2
            goto L1ff
        L207:
            int r9 = r9 + 1
            r7 = r18
            goto L1f
        L20d:
            java.lang.String r1 = "invalid escape character EOI"
            p012ah.C0086a.m464w(r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readString():java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void readString0() {
        boolean z9;
        boolean z10;
        String latin1String;
        byte b10 = this.f1929ch;
        int i9 = this.offset;
        this.valueEscape = false;
        byte[] bArr = this.bytes;
        boolean z11 = true;
        int i10 = i9;
        int i11 = 0;
        boolean z12 = true;
        while (true) {
            byte b11 = bArr[i10];
            char c10 = 'x';
            if (b11 == 92) {
                this.valueEscape = z11;
                byte b12 = bArr[i10 + 1];
                i10 += b12 != 117 ? b12 == 120 ? 4 : 2 : 6;
                z9 = z11;
            } else if (b11 < 0) {
                z9 = z11;
                switch ((b11 & 255) >> 4) {
                    case 12:
                    case 13:
                        i10 += 2;
                        break;
                    case 14:
                        i10 += 3;
                        break;
                    default:
                        if ((b11 >> 3) != -2) {
                            C0086a.m464w(AbstractC0921a.m2249l(i10, "malformed input around byte "));
                            return;
                        } else {
                            i10 += 4;
                            i11++;
                        }
                        break;
                }
                z12 = false;
            } else {
                if (b11 == b10) {
                    if (this.valueEscape) {
                        char[] cArr = new char[i11];
                        int i12 = 0;
                        while (true) {
                            byte b13 = bArr[i9];
                            if (b13 != 92) {
                                z10 = z11;
                                if (b13 == 34) {
                                    latin1String = new String(cArr);
                                    i10 = i9;
                                } else if (b13 < 0) {
                                    switch ((b13 & 255) >> 4) {
                                        case 12:
                                        case 13:
                                            int i13 = i9 + 1;
                                            i9 += 2;
                                            cArr[i12] = (char) ((bArr[i13] & 63) | ((b13 & 31) << 6));
                                            break;
                                        case 14:
                                            int i14 = i9 + 2;
                                            byte b14 = bArr[i9 + 1];
                                            i9 += 3;
                                            cArr[i12] = (char) (((b14 & 63) << 6) | ((b13 & 15) << 12) | (bArr[i14] & 63));
                                            break;
                                        default:
                                            if ((b13 >> 3) != -2) {
                                                C0086a.m464w(AbstractC0921a.m2249l(i9, "malformed input around byte "));
                                                return;
                                            }
                                            byte b15 = bArr[i9 + 1];
                                            int i15 = i9 + 3;
                                            byte b16 = bArr[i9 + 2];
                                            i9 += 4;
                                            byte b17 = bArr[i15];
                                            int i16 = (((b13 << 18) ^ (b15 << 12)) ^ (b16 << 6)) ^ (b17 ^ 3678080);
                                            if ((b15 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b16 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b17 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && i16 >= 65536 && i16 < 1114112) {
                                                int i17 = i12 + 1;
                                                cArr[i12] = (char) ((i16 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                                cArr[i17] = (char) ((i16 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                                i12 = i17;
                                            }
                                            break;
                                            break;
                                    }
                                } else {
                                    cArr[i12] = (char) b13;
                                    i9++;
                                }
                            } else {
                                int i18 = i9 + 1;
                                char cChar4 = bArr[i18];
                                if (cChar4 == '\"' || cChar4 == '\\') {
                                    z10 = z11;
                                    cArr[i12] = cChar4;
                                    i9 = i18 + 1;
                                } else if (cChar4 != 'u') {
                                    if (cChar4 != c10) {
                                        cChar4 = char1(cChar4);
                                    } else {
                                        byte b18 = bArr[i9 + 2];
                                        int i19 = i9 + 3;
                                        cChar4 = JSONReader.char2(b18, bArr[i19]);
                                        i18 = i19;
                                    }
                                    z10 = z11;
                                    cArr[i12] = cChar4;
                                    i9 = i18 + 1;
                                } else {
                                    byte b19 = bArr[i9 + 2];
                                    byte b20 = bArr[i9 + 3];
                                    byte b21 = bArr[i9 + 4];
                                    int i20 = i9 + 5;
                                    z10 = z11;
                                    cChar4 = JSONReader.char4(b19, b20, b21, bArr[i20]);
                                    i18 = i20;
                                    cArr[i12] = cChar4;
                                    i9 = i18 + 1;
                                }
                            }
                            i12++;
                            z11 = z10;
                            c10 = 'x';
                        }
                        C0086a.m464w(AbstractC0921a.m2249l(i9, "malformed input around byte "));
                        return;
                    }
                    z10 = z11;
                    int i21 = this.offset;
                    latin1String = z12 ? getLatin1String(i21, i10 - i21) : new String(bArr, i21, i10 - i21, StandardCharsets.UTF_8);
                    int i22 = i10 + 1;
                    byte b22 = bArr[i22];
                    while (b22 <= 32 && ((1 << b22) & 4294981377L) != 0) {
                        i22++;
                        b22 = bArr[i22];
                    }
                    this.comma = b22 == 44 ? z10 : false;
                    this.offset = i22 + 1;
                    if (b22 == 44) {
                        next();
                    } else {
                        this.f1929ch = (char) b22;
                    }
                    this.stringValue = latin1String;
                    return;
                }
                z9 = z11;
                i10++;
            }
            i11++;
            z11 = z9;
        }
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
    public final java.util.UUID readUUID() {
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
            byte[] r2 = r0.bytes
            int r4 = r0.offset
            int r5 = r4 + 36
            int r6 = r2.length
            r7 = 32
            r8 = 0
            r9 = 0
            r11 = 4
            if (r5 >= r6) goto Lc0
            r5 = r2[r5]
            if (r5 != r1) goto Lc0
            int r5 = r4 + 8
            r5 = r2[r5]
            r6 = 45
            if (r5 != r6) goto Lc0
            int r5 = r4 + 13
            r5 = r2[r5]
            if (r5 != r6) goto Lc0
            int r5 = r4 + 18
            r5 = r2[r5]
            if (r5 != r6) goto Lc0
            int r5 = r4 + 23
            r5 = r2[r5]
            if (r5 != r6) goto Lc0
            r1 = r8
            r5 = r9
        L50:
            r3 = 8
            if (r1 >= r3) goto L64
            long r5 = r5 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r12 = r4 + r1
            r12 = r2[r12]
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
            r12 = r2[r12]
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
            r12 = r2[r12]
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
            r14 = r2[r14]
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
            r14 = r2[r14]
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
            if (r5 >= r6) goto L138
            r5 = r2[r5]
            if (r5 != r1) goto L138
            r1 = r8
            r5 = r9
        Lcb:
            r3 = 16
            if (r1 >= r3) goto Ldf
            long r5 = r5 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r12 = r4 + r1
            r12 = r2[r12]
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
            r14 = r2[r14]
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
            r4 = r2[r4]
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
            r1 = r2[r1]
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
            goto L132
        L12f:
            char r1 = (char) r4
            r0.f1929ch = r1
        L132:
            java.util.UUID r1 = new java.util.UUID
            r1.<init>(r5, r12)
            return r1
        L138:
            java.lang.String r1 = r0.readString()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L143
            return r3
        L143:
            java.util.UUID r1 = java.util.UUID.fromString(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.readUUID():java.util.UUID");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r20 = ' ';
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readValueHashCode() {
        char c10;
        boolean z9;
        long j3;
        long j4;
        char cChar4;
        int i9;
        long j5;
        long j10;
        char c11 = this.f1929ch;
        if (c11 != '\"' && c11 != '\'') {
            return -1L;
        }
        byte[] bArr = this.bytes;
        boolean z10 = true;
        this.nameAscii = true;
        this.nameEscape = false;
        int i10 = this.offset;
        this.nameBegin = i10;
        int i11 = this.end;
        int i12 = 0;
        long j11 = 0;
        while (true) {
            if (i10 < i11) {
                char cChar42 = bArr[i10];
                if (cChar42 != c11) {
                    if (cChar42 == '\\') {
                        this.nameEscape = true;
                        int i13 = i10 + 1;
                        int i14 = bArr[i13];
                        if (i14 == 117) {
                            int i15 = bArr[i10 + 2];
                            int i16 = bArr[i10 + 3];
                            c10 = ' ';
                            int i17 = bArr[i10 + 4];
                            i10 += 5;
                            cChar42 = JSONReader.char4(i15, i16, i17, bArr[i10]);
                        } else if (i14 != 120) {
                            i10 = i13;
                            c10 = ' ';
                            cChar42 = char1(i14);
                        } else {
                            int i18 = bArr[i10 + 2];
                            i10 += 3;
                            cChar42 = JSONReader.char2(i18, bArr[i10]);
                            c10 = ' ';
                        }
                    } else {
                        c10 = ' ';
                        if (cChar42 == 65475 || cChar42 == 65474) {
                            i10++;
                            cChar42 = (char) (((cChar42 & 31) << 6) | (bArr[i10] & '?'));
                        }
                    }
                    if (cChar42 <= 255 && cChar42 >= 0 && i12 < 8 && (i12 != 0 || cChar42 != 0)) {
                        switch (i12) {
                            case 0:
                                j11 = (byte) cChar42;
                                continue;
                                i10++;
                                i12++;
                                break;
                            case 1:
                                j5 = ((byte) cChar42) << 8;
                                j10 = 255;
                                break;
                            case 2:
                                j5 = ((byte) cChar42) << JSONB.Constants.BC_INT32_NUM_16;
                                j10 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                break;
                            case 3:
                                j5 = ((byte) cChar42) << 24;
                                j10 = 16777215;
                                break;
                            case 4:
                                j5 = ((long) ((byte) cChar42)) << c10;
                                j10 = 4294967295L;
                                break;
                            case 5:
                                j5 = ((long) ((byte) cChar42)) << 40;
                                j10 = 1099511627775L;
                                break;
                            case 6:
                                j5 = ((long) ((byte) cChar42)) << 48;
                                j10 = 281474976710655L;
                                break;
                            case 7:
                                j5 = ((long) ((byte) cChar42)) << 56;
                                j10 = 72057594037927935L;
                                break;
                            default:
                                i10++;
                                i12++;
                                break;
                        }
                        j11 = (j11 & j10) + j5;
                        i10++;
                        i12++;
                    }
                } else if (i12 == 0) {
                    i10 = this.nameBegin;
                    j11 = 0;
                } else {
                    this.nameLength = i12;
                    this.nameEnd = i10;
                    i10++;
                }
            }
        }
        i10 = this.nameBegin;
        j11 = 0;
        if (j11 == 0) {
            j11 = -3750763034362895579L;
            int i19 = 0;
            while (true) {
                int iChar2_utf8 = bArr[i10];
                if (iChar2_utf8 == 92) {
                    this.nameEscape = z10;
                    int i20 = i10 + 1;
                    int i21 = bArr[i20];
                    if (i21 != 117) {
                        if (i21 != 120) {
                            cChar4 = char1(i21);
                        } else {
                            int i22 = i10 + 3;
                            cChar4 = JSONReader.char2(bArr[i10 + 2], bArr[i22]);
                            i20 = i22;
                        }
                        z9 = z10;
                    } else {
                        int i23 = bArr[i10 + 2];
                        int i24 = bArr[i10 + 3];
                        int i25 = bArr[i10 + 4];
                        int i26 = i10 + 5;
                        z9 = z10;
                        cChar4 = JSONReader.char4(i23, i24, i25, bArr[i26]);
                        i20 = i26;
                    }
                    j4 = (((long) cChar4) ^ j11) * Fnv.MAGIC_PRIME;
                    i10 = i20 + 1;
                } else {
                    z9 = z10;
                    if (iChar2_utf8 == 34) {
                        this.nameLength = i19;
                        this.nameEnd = i10;
                        i10++;
                    } else {
                        if (iChar2_utf8 < 0) {
                            switch ((iChar2_utf8 & 255) >> 4) {
                                case 12:
                                case 13:
                                    j3 = 1099511628211L;
                                    iChar2_utf8 = char2_utf8(iChar2_utf8, bArr[i10 + 1], i10);
                                    i10 += 2;
                                    this.nameAscii = false;
                                    break;
                                case 14:
                                    j3 = 1099511628211L;
                                    iChar2_utf8 = char2_utf8(iChar2_utf8, bArr[i10 + 1], bArr[i10 + 2], i10);
                                    i10 += 3;
                                    this.nameAscii = false;
                                    break;
                                default:
                                    if ((iChar2_utf8 >> 3) != -2) {
                                        C0086a.m464w(AbstractC0921a.m2249l(i10, "malformed input around byte "));
                                        return 0L;
                                    }
                                    int i27 = bArr[i10 + 1];
                                    int i28 = i10 + 3;
                                    int i29 = bArr[i10 + 2];
                                    i10 += 4;
                                    char c12 = bArr[i28];
                                    int i30 = (((iChar2_utf8 << 18) ^ (i27 << 12)) ^ (i29 << 6)) ^ (8064 ^ c12);
                                    if ((i27 & Opcodes.CHECKCAST) == 128 && (i29 & Opcodes.CHECKCAST) == 128 && (c12 & 192) == 128 && i30 >= 65536 && i30 < 1114112) {
                                        j4 = (((((long) ((char) ((i30 >>> 10) + Utf8.HIGH_SURROGATE_HEADER))) ^ j11) * Fnv.MAGIC_PRIME) ^ ((long) ((char) ((i30 & 1023) + Utf8.LOG_SURROGATE_HEADER)))) * Fnv.MAGIC_PRIME;
                                        i19++;
                                    }
                                    break;
                                    break;
                            }
                        } else {
                            i10++;
                            j3 = 1099511628211L;
                        }
                        j11 = (((long) iChar2_utf8) ^ j11) * j3;
                        i19++;
                        z10 = z9;
                        c10 = ' ';
                    }
                }
                j11 = j4;
                i19++;
                z10 = z9;
                c10 = ' ';
            }
            C0086a.m464w(AbstractC0921a.m2249l(i10, "malformed input around byte "));
            return 0L;
        }
        z9 = true;
        if (i10 == i11) {
            i9 = 26;
        } else {
            i9 = bArr[i10];
            i10++;
        }
        while (i9 <= c10 && ((1 << i9) & 4294981377L) != 0) {
            if (i10 == i11) {
                i9 = 26;
            } else {
                i9 = bArr[i10];
                i10++;
            }
            c10 = ' ';
        }
        boolean z11 = i9 == 44 ? z9 : false;
        this.comma = z11;
        if (z11) {
            if (i10 == i11) {
                i9 = 26;
            } else {
                i9 = bArr[i10];
                i10++;
            }
            while (i9 <= 32 && ((1 << i9) & 4294981377L) != 0) {
                if (i10 == i11) {
                    i9 = 26;
                } else {
                    i9 = bArr[i10];
                    i10++;
                }
            }
        }
        this.offset = i10;
        this.f1929ch = (char) i9;
        return j11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ZonedDateTime readZonedDateTimeX(int i9) {
        ZonedDateTime zonedDateTimeOf;
        if (!isString()) {
            C0086a.m464w("date only support string input");
            return null;
        }
        if (i9 < 19) {
            return null;
        }
        if (i9 == 30) {
            byte[] bArr = this.bytes;
            int i10 = this.offset;
            if (bArr[i10 + 29] == 90) {
                zonedDateTimeOf = ZonedDateTime.of(DateUtils.parseLocalDateTime29(bArr, i10), ZoneOffset.UTC);
            } else if (i9 == 29) {
                byte[] bArr2 = this.bytes;
                int i11 = this.offset;
                if (bArr2[i11 + 28] == 90) {
                    zonedDateTimeOf = ZonedDateTime.of(DateUtils.parseLocalDateTime28(bArr2, i11), ZoneOffset.UTC);
                } else if (i9 == 28) {
                    byte[] bArr3 = this.bytes;
                    int i12 = this.offset;
                    if (bArr3[i12 + 27] == 90) {
                        zonedDateTimeOf = ZonedDateTime.of(DateUtils.parseLocalDateTime27(bArr3, i12), ZoneOffset.UTC);
                    } else if (i9 == 27) {
                        byte[] bArr4 = this.bytes;
                        int i13 = this.offset;
                        zonedDateTimeOf = bArr4[i13 + 26] == 90 ? ZonedDateTime.of(DateUtils.parseLocalDateTime26(bArr4, i13), ZoneOffset.UTC) : DateUtils.parseZonedDateTime(this.bytes, this.offset, i9, this.context.zoneId);
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
    public final void skipComment() {
        boolean z9;
        boolean z10;
        byte b10;
        int i9 = this.offset;
        int i10 = i9 + 1;
        if (i10 >= this.end) {
            C0086a.m464w(info());
            return;
        }
        byte[] bArr = this.bytes;
        byte b11 = bArr[i9];
        if (b11 == 42) {
            z9 = true;
        } else {
            if (b11 != 47) {
                C0086a.m464w(info("parse comment error"));
                return;
            }
            z9 = false;
        }
        int i11 = i9 + 2;
        byte b12 = bArr[i10];
        while (true) {
            if (z9) {
                if (b12 == 42 && i11 <= this.end && bArr[i11] == 47) {
                    i11++;
                }
            } else {
                z10 = b12 == 10;
            }
            int i12 = this.end;
            b10 = 26;
            if (z10) {
                if (i11 < i12) {
                    byte b13 = bArr[i11];
                    while (b13 <= 32 && ((1 << b13) & 4294981377L) != 0) {
                        i11++;
                        if (i11 >= this.end) {
                            break;
                        } else {
                            b13 = bArr[i11];
                        }
                    }
                    b10 = b13;
                    i11++;
                }
            } else {
                if (i11 >= i12) {
                    break;
                }
                b12 = bArr[i11];
                i11++;
            }
        }
        this.f1929ch = (char) b10;
        this.offset = i11;
        if (b10 == 47) {
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
    public final boolean skipName() {
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
            byte[] r4 = r15.bytes
        L3c:
            int r6 = r3 + 1
            r7 = r4[r3]
            r8 = 92
            if (r7 != r8) goto L55
            r3 = r4[r6]
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
            if (r7 != r0) goto Lb2
            int r0 = r15.end
            r7 = 26
            if (r6 != r0) goto L5f
        L5d:
            r0 = r7
            goto L64
        L5f:
            int r3 = r3 + 2
            r0 = r4[r6]
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
            r3 = r4[r6]
            r6 = r0
            r0 = r3
            goto L64
        L82:
            r12 = 58
            if (r0 != r12) goto Lad
            int r0 = r15.end
            if (r6 != r0) goto L8d
            r0 = r6
        L8b:
            r6 = r7
            goto L91
        L8d:
            int r0 = r6 + 1
            r6 = r4[r6]
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
            r0 = r4[r0]
            r14 = r6
            r6 = r0
            r0 = r14
            goto L91
        La7:
            r15.offset = r0
            char r0 = (char) r6
            r15.f1929ch = r0
            return r5
        Lad:
            com.alibaba.fastjson2.JSONException r0 = com.alibaba.fastjson2.JSONReader.syntaxError(r0)
            throw r0
        Lb2:
            r3 = r6
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.skipName():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Path cross not found for [B:182:0x020a, B:5:0x001b], limit reached: 253 */
    /* JADX WARN: Path cross not found for [B:96:0x0126, B:15:0x003b], limit reached: 253 */
    /* JADX WARN: Path cross not found for [B:96:0x0126, B:7:0x0029], limit reached: 253 */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x01f5 -> B:207:0x0252). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:211:0x0263 -> B:24:0x0051). Please report as a decompilation issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void skipValue() {
        long j3;
        int i9;
        int i10;
        byte b10;
        int i11;
        byte b11;
        boolean z9;
        boolean z10;
        boolean z11;
        int i12;
        byte[] bArr = this.bytes;
        byte b12 = this.f1929ch;
        int i13 = this.offset;
        int i14 = this.end;
        this.comma = false;
        if (b12 == 34 || b12 == 39) {
            j3 = 0;
            if (b12 == 39 && (this.context.features & JSONReader.Feature.DisableSingleQuote.mask) != 0) {
                throw notSupportName();
            }
            i9 = i13 + 1;
            byte b13 = bArr[i13];
            while (true) {
                if (b13 == 92) {
                    int i15 = i9 + 1;
                    byte b14 = bArr[i9];
                    if (b14 == 117) {
                        i15 = i9 + 5;
                    } else if (b14 == 120) {
                        i15 = i9 + 3;
                    } else if (b14 != 92 && b14 != 34) {
                        char1(b14);
                    }
                    i9 = i15 + 1;
                    b13 = bArr[i15];
                } else {
                    if (b13 == b12) {
                        break;
                    }
                    int i16 = i9 + 1;
                    byte b15 = bArr[i9];
                    i9 = i16;
                    b13 = b15;
                }
            }
            if (i9 != i14) {
                i10 = i9 + 1;
                b10 = bArr[i9];
                byte b16 = b10;
                i13 = i10;
                b12 = b16;
                if (b12 > 32 && ((1 << b12) & 4294981377L) != j3) {
                    if (i13 != i14) {
                        i10 = i13 + 1;
                        b10 = bArr[i13];
                        byte b162 = b10;
                        i13 = i10;
                        b12 = b162;
                        if (b12 > 32) {
                        }
                        if (b12 == 44) {
                        }
                        if (this.comma) {
                        }
                        this.f1929ch = (char) b12;
                        this.offset = i13;
                    }
                    b12 = 26;
                    if (b12 > 32) {
                    }
                    if (b12 == 44) {
                    }
                    if (this.comma) {
                    }
                    this.f1929ch = (char) b12;
                    this.offset = i13;
                }
                if (b12 == 44) {
                    this.comma = true;
                    if (i13 == i14) {
                        i11 = i13;
                        b11 = 26;
                    } else {
                        i11 = i13 + 1;
                        b11 = bArr[i13];
                    }
                    while (true) {
                        byte b17 = b11;
                        i13 = i11;
                        b12 = b17;
                        while (b12 <= 32 && ((1 << b12) & 4294981377L) != j3) {
                            if (i13 == i14) {
                                b12 = 26;
                            }
                        }
                        i11 = i13 + 1;
                        b11 = bArr[i13];
                    }
                }
                if (this.comma && b12 != 26 && b12 != 125 && b12 != 93 && b12 != 26) {
                    throw error(i13, b12);
                }
                this.f1929ch = (char) b12;
                this.offset = i13;
            }
            i13 = i9;
            b12 = 26;
            if (b12 > 32) {
            }
            if (b12 == 44) {
            }
            if (this.comma) {
            }
            this.f1929ch = (char) b12;
            this.offset = i13;
        }
        j3 = 0;
        if (b12 != 43) {
            if (b12 != 102) {
                if (b12 != 110) {
                    if (b12 != 116) {
                        if (b12 != 45 && b12 != 46) {
                            switch (b12) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                    break;
                                default:
                                    if (b12 == 91) {
                                        next();
                                        int i17 = 0;
                                        while (this.f1929ch != ']') {
                                            if (i17 != 0 && !this.comma) {
                                                throw valueError();
                                            }
                                            this.comma = false;
                                            skipValue();
                                            i17++;
                                        }
                                        this.comma = false;
                                        i12 = this.offset;
                                        if (i12 != i14) {
                                            i13 = i12 + 1;
                                            b12 = bArr[i12];
                                        }
                                        i13 = i12;
                                        b12 = 26;
                                    } else if (b12 != 123) {
                                        if (b12 != 83 || !nextIfSet()) {
                                            throw error(i13, b12);
                                        }
                                        skipValue();
                                        b12 = this.f1929ch;
                                        i13 = this.offset;
                                    } else {
                                        next();
                                        while (this.f1929ch != '}') {
                                            skipName();
                                            skipValue();
                                        }
                                        this.comma = false;
                                        i12 = this.offset;
                                        if (i12 != i14) {
                                            i13 = i12 + 1;
                                            b12 = bArr[i12];
                                        }
                                        i13 = i12;
                                        b12 = 26;
                                    }
                                    break;
                            }
                        }
                    } else {
                        i9 = i13 + 3;
                        if (i9 > i14) {
                            throw error(i13, b12);
                        }
                        if (bArr[i13] != 114 || bArr[i13 + 1] != 117 || bArr[i13 + 2] != 101) {
                            throw error(i13, b12);
                        }
                        if (i9 != i14) {
                            i13 += 4;
                            b12 = bArr[i9];
                        }
                        i13 = i9;
                        b12 = 26;
                    }
                } else {
                    i9 = i13 + 3;
                    if (i9 > i14) {
                        throw error(i13, b12);
                    }
                    if (bArr[i13] != 117 || bArr[i13 + 1] != 108 || bArr[i13 + 2] != 108) {
                        throw error(i13, b12);
                    }
                    if (i9 != i14) {
                        i13 += 4;
                        b12 = bArr[i9];
                    }
                    i13 = i9;
                    b12 = 26;
                }
            } else {
                i9 = i13 + 4;
                if (i9 > i14) {
                    throw error(i13, b12);
                }
                if (bArr[i13] != 97 || bArr[i13 + 1] != 108 || bArr[i13 + 2] != 115 || bArr[i13 + 3] != 101) {
                    throw error(i13, b12);
                }
                if (i9 != i14) {
                    i13 += 5;
                    b12 = bArr[i9];
                }
                i13 = i9;
                b12 = 26;
            }
            if (b12 > 32) {
            }
            if (b12 == 44) {
            }
            if (this.comma) {
            }
            this.f1929ch = (char) b12;
            this.offset = i13;
        }
        if (b12 == 45 || b12 == 43) {
            if (i13 >= i14) {
                throw JSONReader.numberError(i13, b12);
            }
            int i18 = i13 + 1;
            byte b18 = bArr[i13];
            i13 = i18;
            b12 = b18;
        }
        if ((b12 == 46) || b12 < 48 || b12 > 57) {
            z9 = false;
        } else {
            do {
                if (i13 == i14) {
                    b12 = 26;
                } else {
                    int i19 = i13 + 1;
                    byte b19 = bArr[i13];
                    i13 = i19;
                    b12 = b19;
                }
                if (b12 >= 48) {
                }
                z9 = true;
            } while (b12 <= 57);
            z9 = true;
        }
        if (z9 && (b12 == 76 || b12 == 70 || b12 == 68 || b12 == 66 || b12 == 83)) {
            int i20 = i13 + 1;
            byte b20 = bArr[i13];
            i13 = i20;
            b12 = b20;
        }
        if (b12 == 46) {
            if (i13 == i14) {
                b12 = 26;
            } else {
                int i21 = i13 + 1;
                byte b21 = bArr[i13];
                i13 = i21;
                b12 = b21;
            }
            if (b12 >= 48 && b12 <= 57) {
                do {
                    if (i13 == i14) {
                        b12 = 26;
                    } else {
                        int i22 = i13 + 1;
                        byte b22 = bArr[i13];
                        i13 = i22;
                        b12 = b22;
                    }
                    if (b12 >= 48) {
                    }
                } while (b12 <= 57);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z9 && !z10) {
            throw JSONReader.numberError(i13, b12);
        }
        if (b12 == 101 || b12 == 69) {
            int i23 = i13 + 1;
            byte b23 = bArr[i13];
            if (b23 == 43 || b23 == 45) {
                if (i23 >= i14) {
                    throw JSONReader.numberError(i23, b23);
                }
                b23 = bArr[i23];
                i23 = i13 + 2;
                z11 = true;
            } else {
                z11 = false;
            }
            if (b23 >= 48 && b23 <= 57) {
                while (true) {
                    if (i23 == i14) {
                        i13 = i23;
                        b12 = 26;
                    } else {
                        i13 = i23 + 1;
                        b12 = bArr[i23];
                    }
                    if (b12 >= 48 && b12 <= 57) {
                        i23 = i13;
                    }
                }
            } else {
                if (z11) {
                    throw JSONReader.numberError(i23, b23);
                }
                i13 = i23;
                b12 = b23;
            }
        }
        if (b12 == 76 || b12 == 70 || b12 == 68 || b12 == 66 || b12 == 83) {
            if (i13 != i14) {
                i10 = i13 + 1;
                b10 = bArr[i13];
                byte b1622 = b10;
                i13 = i10;
                b12 = b1622;
            }
            b12 = 26;
        }
        if (b12 > 32) {
        }
        if (b12 == 44) {
        }
        if (this.comma) {
        }
        this.f1929ch = (char) b12;
        this.offset = i13;
    }

    public static int char2_utf8(int i9, int i10, int i11, int i12) {
        if ((i10 & Opcodes.CHECKCAST) == 128 && (i11 & Opcodes.CHECKCAST) == 128) {
            return ((i9 & 15) << 12) | ((i10 & 63) << 6) | (i11 & 63);
        }
        C0086a.m464w(AbstractC0921a.m2249l(i12, "malformed input around byte "));
        return 0;
    }

    public static int char2_utf8(int i9, int i10, int i11) {
        if ((i10 & Opcodes.CHECKCAST) == 128) {
            return ((i9 & 31) << 6) | (i10 & 63);
        }
        C0086a.m464w(AbstractC0921a.m2249l(i11, "malformed input around byte "));
        return 0;
    }

    public JSONReaderUTF8(JSONReader.Context context, InputStream inputStream) {
        super(context, false);
        int iIdentityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem cacheItem = JSONFactory.CACHE_ITEMS[iIdentityHashCode & (r2.length - 1)];
        this.cacheItem = cacheItem;
        byte[] andSet = JSONFactory.BYTES_UPDATER.getAndSet(cacheItem, null);
        andSet = andSet == null ? new byte[context.bufferSize] : andSet;
        int i9 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(andSet, i9, andSet.length - i9);
                if (i10 == -1) {
                    break;
                }
                i9 += i10;
                if (i9 == andSet.length) {
                    andSet = Arrays.copyOf(andSet, andSet.length + context.bufferSize);
                }
            } catch (IOException e6) {
                C0086a.m465x("read error", e6);
                throw null;
            }
        }
        this.byteBuf = andSet;
        this.bytes = andSet;
        this.offset = 0;
        this.length = i9;
        this.f1930in = inputStream;
        this.start = 0;
        this.end = i9;
        next();
        if (this.f1929ch == '/') {
            skipComment();
        }
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
            char r0 = r7.f1929ch
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
            r7.f1929ch = r8
            r8 = 1
            return r8
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char, char, char):boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0042 -> B:5:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x002f
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
    public JSONReaderUTF8(com.alibaba.fastjson2.JSONReader.Context r6, java.lang.String r7, byte[] r8, int r9, int r10) {
        /*
            r5 = this;
            r7 = 0
            r5.<init>(r6, r7)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            int r6 = java.lang.System.identityHashCode(r6)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r7 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r0 = r7.length
            int r0 = r0 + (-1)
            r6 = r6 & r0
            r6 = r7[r6]
            r5.cacheItem = r6
            r5.bytes = r8
            r5.length = r10
            r6 = 0
            r5.f1930in = r6
            r5.start = r9
            int r10 = r10 + r9
            r5.end = r10
            r6 = 26
            if (r9 < r10) goto L29
            r7 = r9
        L27:
            r9 = r6
            goto L2d
        L29:
            int r7 = r9 + 1
            r9 = r8[r9]
        L2d:
            r10 = 32
            if (r9 > r10) goto L4d
            r0 = 1
            long r0 = r0 << r9
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            long r0 = r0 & r2
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r9 = r5.end
            if (r7 != r9) goto L45
            goto L27
        L45:
            int r9 = r7 + 1
            r7 = r8[r7]
            r4 = r9
            r9 = r7
            r7 = r4
            goto L2d
        L4d:
            if (r9 >= 0) goto L53
            r5.next()
            return
        L53:
            r5.offset = r7
            char r6 = (char) r9
            r5.f1929ch = r6
            r6 = 47
            if (r9 != r6) goto L5f
            r5.skipComment()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.<init>(com.alibaba.fastjson2.JSONReader$Context, java.lang.String, byte[], int, int):void");
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
            char r0 = r5.f1929ch
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
            r5.f1929ch = r6
            r6 = 1
            return r6
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char, char, char, char):boolean");
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
            char r0 = r7.f1929ch
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
            r7.f1929ch = r8
            r8 = 1
            return r8
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderUTF8.nextIfMatchIdent(char, char, char):boolean");
    }
}
