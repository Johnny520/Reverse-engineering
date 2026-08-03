package com.alibaba.fastjson2;

import bsh.ParserConstants;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.NameCacheEntry;
import java.io.InputStream;
import okhttp3.internal.p221ws.WebSocketProtocol;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONReaderASCII extends JSONReaderUTF8 {
    final String str;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONReaderASCII(JSONReader.Context context, String str, byte[] bArr, int i9, int i10) {
        super(context, str, bArr, i9, i10);
        this.str = str;
        this.nameAscii = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long getLong(byte[] bArr, int i9) {
        return JDKUtils.BIG_ENDIAN ? JDKUtils.UNSAFE.getLong(bArr, ((long) Unsafe.ARRAY_BYTE_BASE_OFFSET) + ((long) i9)) : (((long) bArr[i9 + 7]) << 56) + ((((long) bArr[i9 + 6]) & 255) << 48) + ((((long) bArr[i9 + 5]) & 255) << 40) + ((((long) bArr[i9 + 4]) & 255) << 32) + ((((long) bArr[i9 + 3]) & 255) << 24) + ((((long) bArr[i9 + 2]) & 255) << 16) + ((((long) bArr[i9 + 1]) & 255) << 8) + (((long) bArr[i9]) & 255);
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
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public java.lang.String getFieldName() {
        /*
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.nameEnd
            int r2 = r10.nameBegin
            int r3 = r1 - r2
            boolean r4 = r10.nameEscape
            if (r4 != 0) goto L1a
            java.lang.String r0 = r10.str
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.substring(r2, r1)
            return r0
        L15:
            java.lang.String r0 = r10.getLatin1String(r2, r3)
            return r0
        L1a:
            char[] r1 = r10.charBuf
            if (r1 != 0) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r1 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r2 = r10.cacheItem
            r3 = 0
            java.lang.Object r1 = r1.getAndSet(r2, r3)
            char[] r1 = (char[]) r1
            r10.charBuf = r1
        L2b:
            if (r1 == 0) goto L32
            int r2 = r1.length
            int r3 = r10.nameLength
            if (r2 >= r3) goto L38
        L32:
            int r1 = r10.nameLength
            char[] r1 = new char[r1]
            r10.charBuf = r1
        L38:
            int r2 = r10.nameBegin
            r3 = 0
            r4 = r3
        L3c:
            int r5 = r10.nameEnd
            if (r2 >= r5) goto La1
            r5 = r0[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            char r5 = (char) r5
            r6 = 92
            if (r5 != r6) goto L95
            int r5 = r2 + 1
            r6 = r0[r5]
            char r6 = (char) r6
            r7 = 42
            if (r6 == r7) goto L92
            r7 = 43
            if (r6 == r7) goto L92
            r7 = 64
            if (r6 == r7) goto L92
            r7 = 117(0x75, float:1.64E-43)
            if (r6 == r7) goto L7d
            r7 = 120(0x78, float:1.68E-43)
            if (r6 == r7) goto L70
            switch(r6) {
                case 45: goto L92;
                case 46: goto L92;
                case 47: goto L92;
                default: goto L65;
            }
        L65:
            switch(r6) {
                case 60: goto L92;
                case 61: goto L92;
                case 62: goto L92;
                default: goto L68;
            }
        L68:
            char r2 = r10.char1(r6)
            r9 = r5
            r5 = r2
            r2 = r9
            goto L9a
        L70:
            int r5 = r2 + 2
            r5 = r0[r5]
            int r2 = r2 + 3
            r6 = r0[r2]
            char r5 = com.alibaba.fastjson2.JSONReader.char2(r5, r6)
            goto L9a
        L7d:
            int r5 = r2 + 2
            r5 = r0[r5]
            int r6 = r2 + 3
            r6 = r0[r6]
            int r7 = r2 + 4
            r7 = r0[r7]
            int r2 = r2 + 5
            r8 = r0[r2]
            char r5 = com.alibaba.fastjson2.JSONReader.char4(r5, r6, r7, r8)
            goto L9a
        L92:
            r2 = r5
            r5 = r6
            goto L9a
        L95:
            r6 = 34
            if (r5 != r6) goto L9a
            goto La1
        L9a:
            r1[r4] = r5
            int r2 = r2 + 1
            int r4 = r4 + 1
            goto L3c
        La1:
            java.lang.String r0 = new java.lang.String
            int r2 = r10.nameLength
            r0.<init>(r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.getFieldName():java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long getNameHashCodeLCase() {
        int i9;
        char c10;
        long j3;
        long j4;
        byte[] bArr = this.bytes;
        int i10 = this.nameBegin;
        char c11 = '\'';
        char c12 = '\"';
        char c13 = (i10 <= 0 || bArr[i10 + (-1)] != '\'') ? '\"' : '\'';
        int i11 = 0;
        long j5 = 0;
        while (i10 < this.end) {
            char cChar4 = bArr[i10];
            if (cChar4 != '\\') {
                if (cChar4 == c13) {
                }
                if (j5 != 0) {
                    return j5;
                }
                long j10 = Fnv.MAGIC_HASH_CODE;
                while (i10 < this.end) {
                    int iChar4 = bArr[i10];
                    if (iChar4 == 92) {
                        int i12 = i10 + 1;
                        int i13 = bArr[i12];
                        if (i13 == 117) {
                            int i14 = bArr[i10 + 2];
                            int i15 = bArr[i10 + 3];
                            int i16 = bArr[i10 + 4];
                            i10 += 5;
                            iChar4 = JSONReader.char4(i14, i15, i16, bArr[i10]);
                        } else if (i13 != 120) {
                            iChar4 = char1(i13);
                            i10 = i12;
                        } else {
                            int i17 = bArr[i10 + 2];
                            i10 += 3;
                            iChar4 = JSONReader.char2(i17, bArr[i10]);
                        }
                    } else if (iChar4 == c13) {
                        return j10;
                    }
                    i10++;
                    if ((iChar4 != 95 && iChar4 != 45 && iChar4 != 32) || (i9 = bArr[i10]) == c12 || i9 == c11 || i9 == iChar4) {
                        if (iChar4 >= 65 && iChar4 <= 90) {
                            iChar4 = (char) (iChar4 + 32);
                        }
                        if (iChar4 < 0) {
                            iChar4 = (iChar4 == true ? 1 : 0) & 255;
                        }
                        j10 = Fnv.MAGIC_PRIME * (((long) iChar4) ^ j10);
                        c11 = '\'';
                        c12 = '\"';
                    }
                }
                return j10;
            }
            int i18 = i10 + 1;
            int i19 = bArr[i18];
            if (i19 == 117) {
                int i20 = bArr[i10 + 2];
                int i21 = bArr[i10 + 3];
                int i22 = bArr[i10 + 4];
                i10 += 5;
                cChar4 = JSONReader.char4(i20, i21, i22, bArr[i10]);
            } else if (i19 != 120) {
                cChar4 = char1(i19);
                i10 = i18;
            } else {
                int i23 = bArr[i10 + 2];
                i10 += 3;
                cChar4 = JSONReader.char2(i23, bArr[i10]);
            }
            if (cChar4 > 255 || cChar4 < 0 || i11 >= 8 || (i11 == 0 && cChar4 == 0)) {
                i10 = this.nameBegin;
                j5 = 0;
                if (j5 != 0) {
                }
            } else {
                if ((cChar4 != '_' && cChar4 != '-' && cChar4 != ' ') || (c10 = bArr[i10 + 1]) == '\"' || c10 == '\'' || c10 == cChar4) {
                    if (cChar4 >= 'A' && cChar4 <= 'Z') {
                        cChar4 = (char) (cChar4 + ' ');
                    }
                    switch (i11) {
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
                    i11++;
                }
                i10++;
            }
        }
        if (j5 != 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[LOOP:0: B:7:0x0011->B:21:0x003d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x000b A[EDGE_INSN: B:22:0x000b->B:5:0x000b BREAK  A[LOOP:0: B:7:0x0011->B:21:0x003d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003a -> B:5:0x000b). Please report as a decompilation issue!!! */
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void next() {
        int i9;
        byte b10;
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        if (i10 >= this.end) {
            i9 = i10;
            b10 = 26;
            while (true) {
                if (b10 == 0 && (b10 <= 0 || b10 > 32 || ((1 << b10) & 4294981377L) == 0)) {
                    break;
                }
                if (i9 != this.end) {
                    break;
                }
                int i11 = i9 + 1;
                byte b11 = bArr[i9];
                i9 = i11;
                b10 = b11;
            }
            this.offset = i9;
            this.f1929ch = (char) (b10 & 255);
            if (b10 != 47) {
                skipComment();
                return;
            }
            return;
        }
        i9 = i10 + 1;
        b10 = bArr[i10];
        while (true) {
            if (b10 == 0) {
            }
            if (i9 != this.end) {
            }
            int i112 = i9 + 1;
            byte b112 = bArr[i9];
            i9 = i112;
            b10 = b112;
        }
        this.offset = i9;
        this.f1929ch = (char) (b10 & 255);
        if (b10 != 47) {
        }
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
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
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
            if (r10 >= r2) goto Lba
            r11 = r4[r3]
            if (r11 != r9) goto Lba
            int r9 = r3 + 1
            r9 = r4[r9]
            if (r9 != r5) goto Lba
            int r5 = r3 + 2
            r5 = r4[r5]
            if (r5 != r7) goto Lba
            int r5 = r3 + 3
            r5 = r4[r5]
            if (r5 != r7) goto Lba
            r5 = r4[r10]
            if (r5 != r1) goto Lba
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
            r0.offset = r5
            r1 = r3 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.f1929ch = r1
            return r8
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.nextIfNullOrEmptyString():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[LOOP:0: B:11:0x0019->B:25:0x0044, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0013 A[EDGE_INSN: B:26:0x0013->B:9:0x0013 BREAK  A[LOOP:0: B:11:0x0019->B:25:0x0044], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0041 -> B:9:0x0013). Please report as a decompilation issue!!! */
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean nextIfObjectStart() {
        int i9;
        byte b10;
        if (this.f1929ch != '{') {
            return false;
        }
        byte[] bArr = this.bytes;
        int i10 = this.offset;
        if (i10 == this.end) {
            i9 = i10;
            b10 = 26;
            while (true) {
                if (b10 == 0 && (b10 > 32 || ((1 << b10) & 4294981377L) == 0)) {
                    break;
                }
                if (i9 != this.end) {
                    break;
                }
                int i11 = i9 + 1;
                byte b11 = bArr[i9];
                i9 = i11;
                b10 = b11;
            }
            this.f1929ch = (char) (b10 & 255);
            this.offset = i9;
            if (b10 == 47) {
                return true;
            }
            skipComment();
            return true;
        }
        i9 = i10 + 1;
        b10 = bArr[i10];
        while (true) {
            if (b10 == 0) {
            }
            if (i9 != this.end) {
            }
            int i112 = i9 + 1;
            byte b112 = bArr[i9];
            i9 = i112;
            b10 = b112;
        }
        this.f1929ch = (char) (b10 & 255);
        this.offset = i9;
        if (b10 == 47) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public String readFieldName() {
        char c10;
        long j3;
        int i9;
        int i10;
        byte b10;
        long j4;
        long j5;
        byte b11;
        long j10;
        long j11;
        long j12;
        long j13;
        byte b12;
        byte b13 = this.f1929ch;
        if (b13 == 39 && (this.context.features & JSONReader.Feature.DisableSingleQuote.mask) != 0) {
            throw notSupportName();
        }
        if (b13 != 34 && b13 != 39) {
            if ((this.context.features & JSONReader.Feature.AllowUnQuotedFieldNames.mask) == 0 || !JSONReader.isFirstIdentifier(b13)) {
                return null;
            }
            return readFieldNameUnquote();
        }
        byte[] bArr = this.bytes;
        this.nameEscape = false;
        int i11 = this.offset;
        this.nameBegin = i11;
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = this.end;
            if (i13 >= i14) {
                break;
            }
            byte b14 = bArr[i13];
            if (b14 == 92) {
                this.nameEscape = true;
                byte b15 = bArr[i13 + 1];
                i13 += b15 == 117 ? 6 : b15 == 120 ? 4 : 2;
            } else if (b14 == b13) {
                this.nameLength = i12;
                this.nameEnd = i13;
                int i15 = i13 + 1;
                byte b16 = i15 < i14 ? bArr[i15] : (byte) 26;
                while (b16 <= 32 && ((1 << b16) & 4294981377L) != 0) {
                    i15++;
                    b16 = bArr[i15];
                }
                if (b16 != 58) {
                    throw JSONReader.syntaxError(i15, this.f1929ch);
                }
                i13 = i15 + 1;
                if (i13 >= this.end) {
                    this.f1929ch = (char) 26;
                    throw JSONReader.syntaxError(i13, 26);
                }
                byte b17 = bArr[i13];
                while (b17 <= 32 && ((1 << b17) & 4294981377L) != 0) {
                    i13++;
                    b17 = bArr[i13];
                }
                this.offset = i13 + 1;
                this.f1929ch = (char) b17;
            } else {
                i13++;
            }
            i12++;
        }
        int i16 = this.nameEnd;
        if (i16 < i11) {
            throw JSONReader.syntaxError(i13, this.f1929ch);
        }
        if (!this.nameEscape) {
            int i17 = i16 - i11;
            switch (i17) {
                case 1:
                    c10 = ' ';
                    j3 = -1;
                    i9 = bArr[i11] & 255;
                    j4 = i9;
                    j10 = j4;
                    j11 = j3;
                    break;
                case 2:
                    c10 = ' ';
                    j3 = -1;
                    i10 = (bArr[i11 + 1] & 255) << 8;
                    b10 = bArr[i11];
                    i9 = i10 + (b10 & 255);
                    j4 = i9;
                    j10 = j4;
                    j11 = j3;
                    break;
                case 3:
                    c10 = ' ';
                    j3 = -1;
                    i10 = (bArr[i11 + 2] << JSONB.Constants.BC_INT32_NUM_16) + ((bArr[i11 + 1] & 255) << 8);
                    b10 = bArr[i11];
                    i9 = i10 + (b10 & 255);
                    j4 = i9;
                    j10 = j4;
                    j11 = j3;
                    break;
                case 4:
                    c10 = ' ';
                    j3 = -1;
                    i10 = (bArr[i11 + 3] << 24) + ((bArr[i11 + 2] & 255) << 16) + ((bArr[i11 + 1] & 255) << 8);
                    b10 = bArr[i11];
                    i9 = i10 + (b10 & 255);
                    j4 = i9;
                    j10 = j4;
                    j11 = j3;
                    break;
                case 5:
                    c10 = ' ';
                    j3 = -1;
                    j5 = (((long) bArr[i11 + 4]) << 32) + ((((long) bArr[i11 + 3]) & 255) << 24) + ((((long) bArr[i11 + 2]) & 255) << 16) + ((((long) bArr[i11 + 1]) & 255) << 8);
                    b11 = bArr[i11];
                    j4 = j5 + (((long) b11) & 255);
                    j10 = j4;
                    j11 = j3;
                    break;
                case 6:
                    c10 = ' ';
                    j3 = -1;
                    j5 = (((long) bArr[i11 + 5]) << 40) + ((((long) bArr[i11 + 4]) & 255) << 32) + ((((long) bArr[i11 + 3]) & 255) << 24) + ((((long) bArr[i11 + 2]) & 255) << 16) + ((((long) bArr[i11 + 1]) & 255) << 8);
                    b11 = bArr[i11];
                    j4 = j5 + (((long) b11) & 255);
                    j10 = j4;
                    j11 = j3;
                    break;
                case 7:
                    c10 = ' ';
                    j3 = -1;
                    j5 = (((long) bArr[i11 + 6]) << 48) + ((((long) bArr[i11 + 5]) & 255) << 40) + ((((long) bArr[i11 + 4]) & 255) << 32) + ((((long) bArr[i11 + 3]) & 255) << 24) + ((((long) bArr[i11 + 2]) & 255) << 16) + ((((long) bArr[i11 + 1]) & 255) << 8);
                    b11 = bArr[i11];
                    j4 = j5 + (((long) b11) & 255);
                    j10 = j4;
                    j11 = j3;
                    break;
                case 8:
                    c10 = ' ';
                    j3 = -1;
                    j5 = (((long) bArr[i11 + 7]) << 56) + ((((long) bArr[i11 + 6]) & 255) << 48) + ((((long) bArr[i11 + 5]) & 255) << 40) + ((((long) bArr[i11 + 4]) & 255) << 32) + ((((long) bArr[i11 + 3]) & 255) << 24) + ((((long) bArr[i11 + 2]) & 255) << 16) + ((((long) bArr[i11 + 1]) & 255) << 8);
                    b11 = bArr[i11];
                    j4 = j5 + (((long) b11) & 255);
                    j10 = j4;
                    j11 = j3;
                    break;
                case 9:
                    c10 = ' ';
                    j3 = -1;
                    j12 = bArr[i11];
                    j13 = (((long) bArr[i11 + 8]) << 56) + ((((long) bArr[i11 + 7]) & 255) << 48) + ((((long) bArr[i11 + 6]) & 255) << 40) + ((((long) bArr[i11 + 5]) & 255) << 32) + ((((long) bArr[i11 + 4]) & 255) << 24) + ((((long) bArr[i11 + 3]) & 255) << 16) + ((((long) bArr[i11 + 2]) & 255) << 8);
                    b12 = bArr[i11 + 1];
                    j10 = j12;
                    j11 = j13 + (((long) b12) & 255);
                    break;
                case 10:
                    c10 = ' ';
                    j3 = -1;
                    j12 = (bArr[i11 + 1] << 8) + bArr[i11];
                    j13 = (((long) bArr[i11 + 9]) << 56) + ((((long) bArr[i11 + 8]) & 255) << 48) + ((((long) bArr[i11 + 7]) & 255) << 40) + ((((long) bArr[i11 + 6]) & 255) << 32) + ((((long) bArr[i11 + 5]) & 255) << 24) + ((((long) bArr[i11 + 4]) & 255) << 16) + ((((long) bArr[i11 + 3]) & 255) << 8);
                    b12 = bArr[i11 + 2];
                    j10 = j12;
                    j11 = j13 + (((long) b12) & 255);
                    break;
                case 11:
                    c10 = ' ';
                    j3 = -1;
                    j12 = (bArr[i11 + 2] << JSONB.Constants.BC_INT32_NUM_16) + (bArr[i11 + 1] << 8) + bArr[i11];
                    j13 = (((long) bArr[i11 + 10]) << 56) + ((((long) bArr[i11 + 9]) & 255) << 48) + ((((long) bArr[i11 + 8]) & 255) << 40) + ((((long) bArr[i11 + 7]) & 255) << 32) + ((((long) bArr[i11 + 6]) & 255) << 24) + ((((long) bArr[i11 + 5]) & 255) << 16) + ((((long) bArr[i11 + 4]) & 255) << 8);
                    b12 = bArr[i11 + 3];
                    j10 = j12;
                    j11 = j13 + (((long) b12) & 255);
                    break;
                case 12:
                    c10 = ' ';
                    j3 = -1;
                    j12 = (bArr[i11 + 3] << 24) + (bArr[i11 + 2] << JSONB.Constants.BC_INT32_NUM_16) + (bArr[i11 + 1] << 8) + bArr[i11];
                    j13 = (((long) bArr[i11 + 11]) << 56) + ((((long) bArr[i11 + 10]) & 255) << 48) + ((((long) bArr[i11 + 9]) & 255) << 40) + ((((long) bArr[i11 + 8]) & 255) << 32) + ((((long) bArr[i11 + 7]) & 255) << 24) + ((((long) bArr[i11 + 6]) & 255) << 16) + ((((long) bArr[i11 + 5]) & 255) << 8);
                    b12 = bArr[i11 + 4];
                    j10 = j12;
                    j11 = j13 + (((long) b12) & 255);
                    break;
                case 13:
                    c10 = ' ';
                    j3 = -1;
                    j12 = (((long) bArr[i11 + 4]) << 32) + (((long) bArr[i11 + 3]) << 24) + (((long) bArr[i11 + 2]) << 16) + (((long) bArr[i11 + 1]) << 8) + ((long) bArr[i11]);
                    j13 = (((long) bArr[i11 + 12]) << 56) + ((((long) bArr[i11 + 11]) & 255) << 48) + ((((long) bArr[i11 + 10]) & 255) << 40) + ((((long) bArr[i11 + 9]) & 255) << 32) + ((((long) bArr[i11 + 8]) & 255) << 24) + ((((long) bArr[i11 + 7]) & 255) << 16) + ((((long) bArr[i11 + 6]) & 255) << 8);
                    b12 = bArr[i11 + 5];
                    j10 = j12;
                    j11 = j13 + (((long) b12) & 255);
                    break;
                case 14:
                    c10 = ' ';
                    j3 = -1;
                    j12 = (((long) bArr[i11 + 5]) << 40) + ((((long) bArr[i11 + 4]) & 255) << 32) + ((((long) bArr[i11 + 3]) & 255) << 24) + ((((long) bArr[i11 + 2]) & 255) << 16) + ((((long) bArr[i11 + 1]) & 255) << 8) + (((long) bArr[i11]) & 255);
                    j13 = (((long) bArr[i11 + 13]) << 56) + ((((long) bArr[i11 + 12]) & 255) << 48) + ((((long) bArr[i11 + 11]) & 255) << 40) + ((((long) bArr[i11 + 10]) & 255) << 32) + ((((long) bArr[i11 + 9]) & 255) << 24) + ((((long) bArr[i11 + 8]) & 255) << 16) + ((((long) bArr[i11 + 7]) & 255) << 8);
                    b12 = bArr[i11 + 6];
                    j10 = j12;
                    j11 = j13 + (((long) b12) & 255);
                    break;
                case 15:
                    c10 = ' ';
                    j3 = -1;
                    j12 = (((long) bArr[i11 + 6]) << 48) + ((((long) bArr[i11 + 5]) & 255) << 40) + ((((long) bArr[i11 + 4]) & 255) << 32) + ((((long) bArr[i11 + 3]) & 255) << 24) + ((((long) bArr[i11 + 2]) & 255) << 16) + ((((long) bArr[i11 + 1]) & 255) << 8) + (((long) bArr[i11]) & 255);
                    j13 = (((long) bArr[i11 + 14]) << 56) + ((((long) bArr[i11 + 13]) & 255) << 48) + ((((long) bArr[i11 + 12]) & 255) << 40) + ((((long) bArr[i11 + 11]) & 255) << 32) + ((((long) bArr[i11 + 10]) & 255) << 24) + ((((long) bArr[i11 + 9]) & 255) << 16) + ((((long) bArr[i11 + 8]) & 255) << 8);
                    b12 = bArr[i11 + 7];
                    j10 = j12;
                    j11 = j13 + (((long) b12) & 255);
                    break;
                case 16:
                    j3 = -1;
                    j12 = (((long) bArr[i11 + 7]) << 56) + ((((long) bArr[i11 + 6]) & 255) << 48) + ((((long) bArr[i11 + 5]) & 255) << 40) + ((((long) bArr[i11 + 4]) & 255) << 32) + ((((long) bArr[i11 + 3]) & 255) << 24) + ((((long) bArr[i11 + 2]) & 255) << 16) + ((((long) bArr[i11 + 1]) & 255) << 8) + (((long) bArr[i11]) & 255);
                    c10 = ' ';
                    j13 = (((long) bArr[i11 + 15]) << 56) + ((((long) bArr[i11 + 14]) & 255) << 48) + ((((long) bArr[i11 + 13]) & 255) << 40) + ((((long) bArr[i11 + 12]) & 255) << 32) + ((((long) bArr[i11 + 11]) & 255) << 24) + ((((long) bArr[i11 + 10]) & 255) << 16) + ((((long) bArr[i11 + 9]) & 255) << 8);
                    b12 = bArr[i11 + 8];
                    j10 = j12;
                    j11 = j13 + (((long) b12) & 255);
                    break;
                default:
                    c10 = ' ';
                    j10 = -1;
                    j11 = -1;
                    j3 = -1;
                    break;
            }
            if (j10 != j3) {
                if (j11 != j3) {
                    long j14 = j10 ^ j11;
                    JSONFactory.NameCacheEntry2[] nameCacheEntry2Arr = JSONFactory.NAME_CACHE2;
                    int length = ((int) (j14 ^ (j14 >>> c10))) & (nameCacheEntry2Arr.length - 1);
                    JSONFactory.NameCacheEntry2 nameCacheEntry2 = nameCacheEntry2Arr[length];
                    if (nameCacheEntry2 == null) {
                        char[] cArr = new char[i17];
                        for (int i18 = 0; i18 < i17; i18++) {
                            cArr[i18] = (char) (bArr[i11 + i18] & 255);
                        }
                        String str = new String(cArr);
                        JSONFactory.NAME_CACHE2[length] = new JSONFactory.NameCacheEntry2(str, j10, j11);
                        return str;
                    }
                    if (nameCacheEntry2.value0 == j10 && nameCacheEntry2.value1 == j11) {
                        return nameCacheEntry2.name;
                    }
                } else {
                    NameCacheEntry[] nameCacheEntryArr = JSONFactory.NAME_CACHE;
                    int length2 = ((int) ((j10 >>> c10) ^ j10)) & (nameCacheEntryArr.length - 1);
                    NameCacheEntry nameCacheEntry = nameCacheEntryArr[length2];
                    if (nameCacheEntry == null) {
                        char[] cArr2 = new char[i17];
                        for (int i19 = 0; i19 < i17; i19++) {
                            cArr2[i19] = (char) (bArr[i11 + i19] & 255);
                        }
                        String str2 = new String(cArr2);
                        JSONFactory.NAME_CACHE[length2] = new NameCacheEntry(str2, j10);
                        return str2;
                    }
                    if (nameCacheEntry.value == j10) {
                        return nameCacheEntry.name;
                    }
                }
            }
        }
        return getFieldName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02d8, code lost:
    
        r6 = r27.nameBegin;
        r10 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a6  */
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readFieldNameHashCode() {
        char c10;
        char c11;
        byte b10;
        long j3;
        byte b11;
        byte b12;
        byte b13;
        byte b14;
        int i9;
        char cChar4;
        char cChar1;
        long j4;
        long j5;
        long j10;
        char c12;
        String fieldName;
        byte[] bArr = this.bytes;
        char c13 = this.f1929ch;
        if (c13 == '/') {
            skipComment();
            c13 = this.f1929ch;
        }
        if (c13 == '\'' && (this.context.features & JSONReader.Feature.DisableSingleQuote.mask) != 0) {
            throw notSupportName();
        }
        if (c13 != '\"' && c13 != '\'') {
            if ((this.context.features & JSONReader.Feature.AllowUnQuotedFieldNames.mask) != 0 && JSONReader.isFirstIdentifier(c13)) {
                return readFieldNameHashCodeUnquote();
            }
            if (c13 == '}' || isNull()) {
                return -1L;
            }
            C0086a.m464w(info((c13 != '[' || this.nameBegin <= 0 || (fieldName = getFieldName()) == null) ? AbstractC0921a.m2249l(c13, "illegal fieldName input") : "illegal fieldName input " + ((int) c13) + ", previous fieldName " + fieldName));
            return 0L;
        }
        this.stringValue = null;
        this.nameEscape = false;
        int i10 = this.offset;
        this.nameBegin = i10;
        int i11 = i10 + 9;
        if (i11 >= this.end || (c12 = bArr[i10]) == c13) {
            c10 = '0';
            c11 = '(';
            b10 = 32;
        } else {
            int i12 = i10 + 1;
            c10 = '0';
            char c14 = bArr[i12];
            if (c14 != c13 || c12 == 0 || c12 == '\\') {
                c11 = '(';
                int i13 = i10 + 2;
                char c15 = bArr[i13];
                if (c15 != c13 || c14 == 0 || c12 == '\\' || c14 == '\\') {
                    int i14 = i10 + 3;
                    char c16 = bArr[i14];
                    if (c16 != c13 || c15 == 0 || c12 == '\\' || c14 == '\\' || c15 == '\\') {
                        int i15 = i10 + 4;
                        char c17 = bArr[i15];
                        if (c17 != c13 || c16 == 0 || c12 == '\\' || c14 == '\\' || c15 == '\\' || c16 == '\\') {
                            int i16 = i10 + 5;
                            b10 = 32;
                            char c18 = bArr[i16];
                            if (c18 != c13 || c17 == 0 || c12 == '\\' || c14 == '\\' || c15 == '\\' || c16 == '\\' || c17 == '\\') {
                                int i17 = i10 + 6;
                                char c19 = bArr[i17];
                                if (c19 != c13 || c18 == 0 || c12 == '\\' || c14 == '\\' || c15 == '\\' || c16 == '\\' || c17 == '\\' || c18 == '\\') {
                                    int i18 = i10 + 7;
                                    char c20 = bArr[i18];
                                    if (c20 != c13 || c19 == 0 || c12 == '\\' || c14 == '\\' || c15 == '\\' || c16 == '\\' || c17 == '\\' || c18 == '\\' || c19 == '\\') {
                                        int i19 = i10 + 8;
                                        if (bArr[i19] == c13 && c20 != 0 && c12 != '\\' && c14 != '\\' && c15 != '\\' && c16 != '\\' && c17 != '\\' && c18 != '\\' && c19 != '\\' && c20 != '\\') {
                                            j3 = getLong(bArr, i10);
                                            this.nameLength = 8;
                                            this.nameEnd = i19;
                                            i10 = i11;
                                        }
                                    } else {
                                        j3 = (((long) c19) << 48) + ((((long) c18) & 255) << 40) + ((((long) c17) & 255) << 32) + ((((long) c16) & 255) << 24) + ((((long) c15) & 255) << 16) + ((((long) c14) & 255) << 8) + (((long) c12) & 255);
                                        this.nameLength = 7;
                                        this.nameEnd = i18;
                                        i10 += 8;
                                    }
                                } else {
                                    j3 = (((long) c18) << 40) + ((((long) c17) & 255) << 32) + ((((long) c16) & 255) << 24) + ((((long) c15) & 255) << 16) + ((((long) c14) & 255) << 8) + (((long) c12) & 255);
                                    this.nameLength = 6;
                                    this.nameEnd = i17;
                                    i10 += 7;
                                }
                            } else {
                                j3 = (((long) c17) << 32) + ((((long) c16) & 255) << 24) + ((((long) c15) & 255) << 16) + ((((long) c14) & 255) << 8) + (((long) c12) & 255);
                                this.nameLength = 5;
                                this.nameEnd = i16;
                                i10 += 6;
                            }
                            if (j3 == 0) {
                                int i20 = 0;
                                while (true) {
                                    if (i10 < this.end) {
                                        char cChar42 = bArr[i10];
                                        if (cChar42 != c13) {
                                            if (cChar42 == '\\') {
                                                this.nameEscape = true;
                                                int i21 = i10 + 1;
                                                int i22 = bArr[i21];
                                                if (i22 == 117) {
                                                    byte b15 = bArr[i10 + 2];
                                                    byte b16 = bArr[i10 + 3];
                                                    byte b17 = bArr[i10 + 4];
                                                    i10 += 5;
                                                    cChar42 = JSONReader.char4(b15, b16, b17, bArr[i10]);
                                                } else if (i22 != 120) {
                                                    cChar42 = char1(i22);
                                                    i10 = i21;
                                                } else {
                                                    byte b18 = bArr[i10 + 2];
                                                    i10 += 3;
                                                    cChar42 = JSONReader.char2(b18, bArr[i10]);
                                                }
                                            }
                                            if (cChar42 <= 255 && i20 < 8 && (i20 != 0 || cChar42 != 0)) {
                                                switch (i20) {
                                                    case 0:
                                                        j4 = (byte) cChar42;
                                                        j3 = j4;
                                                        break;
                                                    case 1:
                                                        j4 = ((long) (((byte) cChar42) << 8)) + (j3 & 255);
                                                        j3 = j4;
                                                        break;
                                                    case 2:
                                                        j5 = ((byte) cChar42) << JSONB.Constants.BC_INT32_NUM_16;
                                                        j10 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                                        j3 = j5 + (j3 & j10);
                                                        break;
                                                    case 3:
                                                        j5 = ((byte) cChar42) << 24;
                                                        j10 = 16777215;
                                                        j3 = j5 + (j3 & j10);
                                                        break;
                                                    case 4:
                                                        j5 = ((long) ((byte) cChar42)) << b10;
                                                        j10 = 4294967295L;
                                                        j3 = j5 + (j3 & j10);
                                                        break;
                                                    case 5:
                                                        j5 = ((long) ((byte) cChar42)) << c11;
                                                        j10 = 1099511627775L;
                                                        j3 = j5 + (j3 & j10);
                                                        break;
                                                    case 6:
                                                        j5 = ((long) ((byte) cChar42)) << c10;
                                                        j10 = 281474976710655L;
                                                        j3 = j5 + (j3 & j10);
                                                        break;
                                                    case 7:
                                                        j5 = ((long) ((byte) cChar42)) << 56;
                                                        j10 = 72057594037927935L;
                                                        j3 = j5 + (j3 & j10);
                                                        break;
                                                }
                                                i10++;
                                                i20++;
                                            }
                                        } else if (i20 == 0) {
                                            i10 = this.nameBegin;
                                        } else {
                                            this.nameLength = i20;
                                            this.nameEnd = i10;
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (j3 == 0) {
                                j3 = -3750763034362895579L;
                                int i23 = 0;
                                while (true) {
                                    char c21 = bArr[i10];
                                    if (c21 == '\\') {
                                        this.nameEscape = true;
                                        int i24 = i10 + 1;
                                        int i25 = bArr[i24];
                                        if (i25 == 117) {
                                            byte b19 = bArr[i10 + 2];
                                            byte b20 = bArr[i10 + 3];
                                            byte b21 = bArr[i10 + 4];
                                            i9 = i10 + 5;
                                            cChar4 = JSONReader.char4(b19, b20, b21, bArr[i9]);
                                        } else if (i25 != 120) {
                                            cChar1 = char1(i25);
                                            long j11 = (j3 ^ ((long) cChar1)) * Fnv.MAGIC_PRIME;
                                            i10 = i24 + 1;
                                            j3 = j11;
                                            b14 = b10;
                                        } else {
                                            byte b22 = bArr[i10 + 2];
                                            i9 = i10 + 3;
                                            cChar4 = JSONReader.char2(b22, bArr[i9]);
                                        }
                                        char c22 = cChar4;
                                        i24 = i9;
                                        cChar1 = c22;
                                        long j112 = (j3 ^ ((long) cChar1)) * Fnv.MAGIC_PRIME;
                                        i10 = i24 + 1;
                                        j3 = j112;
                                        b14 = b10;
                                    } else if (c21 == c13) {
                                        this.nameLength = i23;
                                        this.nameEnd = i10;
                                        i10++;
                                    } else {
                                        b14 = b10;
                                        i10++;
                                        j3 = (j3 ^ ((long) (c21 & 255))) * Fnv.MAGIC_PRIME;
                                    }
                                    i23++;
                                    b10 = b14;
                                }
                            }
                            if (i10 != this.end) {
                                b11 = 26;
                            } else {
                                b11 = bArr[i10];
                                i10++;
                            }
                            for (b12 = b10; b11 <= b12 && ((1 << b11) & 4294981377L) != 0; b12 = 32) {
                                if (i10 != this.end) {
                                    b11 = 26;
                                } else {
                                    b11 = bArr[i10];
                                    i10++;
                                }
                            }
                            if (b11 == 58) {
                                C0086a.m464w(info(AbstractC0921a.m2249l(b11, "expect ':', but ")));
                                return 0L;
                            }
                            if (i10 == this.end) {
                                b13 = 26;
                            } else {
                                b13 = bArr[i10];
                                i10++;
                            }
                            while (b13 <= 32 && ((1 << b13) & 4294981377L) != 0) {
                                if (i10 == this.end) {
                                    b13 = 26;
                                } else {
                                    b13 = bArr[i10];
                                    i10++;
                                }
                            }
                            this.offset = i10;
                            this.f1929ch = (char) (b13 & 255);
                            return j3;
                        }
                        j3 = (c16 << 24) + ((c15 & 255) << 16) + ((c14 & 255) << 8) + (c12 & 255);
                        this.nameLength = 4;
                        this.nameEnd = i15;
                        i10 += 5;
                        b10 = 32;
                        if (j3 == 0) {
                        }
                        if (j3 == 0) {
                        }
                        if (i10 != this.end) {
                        }
                        while (b11 <= b12) {
                            if (i10 != this.end) {
                            }
                        }
                        if (b11 == 58) {
                        }
                    } else {
                        j3 = (c15 << 16) + ((c14 & 255) << 8) + (c12 & 255);
                        this.nameLength = 3;
                        this.nameEnd = i14;
                        i10 += 4;
                    }
                } else {
                    j3 = (c14 << '\b') + (c12 & 255);
                    this.nameLength = 2;
                    this.nameEnd = i13;
                    i10 += 3;
                }
            } else {
                c11 = '(';
                j3 = c12;
                this.nameLength = 1;
                this.nameEnd = i12;
                i10 += 2;
            }
            b10 = 32;
            if (j3 == 0) {
            }
            if (j3 == 0) {
            }
            if (i10 != this.end) {
            }
            while (b11 <= b12) {
            }
            if (b11 == 58) {
            }
        }
        j3 = 0;
        if (j3 == 0) {
        }
        if (j3 == 0) {
        }
        if (i10 != this.end) {
        }
        while (b11 <= b12) {
        }
        if (b11 == 58) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0116, code lost:
    
        r26.nameLength = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
    
        if (r8 != 26) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011a, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011c, code lost:
    
        r5 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011e, code lost:
    
        r26.nameEnd = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0122, code lost:
    
        if (r8 > 32) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012a, code lost:
    
        if (((1 << r8) & 4294981377L) == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012c, code lost:
    
        if (r2 != r3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012e, code lost:
    
        r5 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0130, code lost:
    
        r5 = (char) r4[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013b, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0142  */
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long readFieldNameHashCodeUnquote() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j3;
        long j4;
        this.nameEscape = false;
        int i14 = this.offset;
        int i15 = this.end;
        byte[] bArr = this.bytes;
        int i16 = this.f1929ch;
        this.nameBegin = i14 - 1;
        int i17 = 0;
        int iChar4 = i16;
        long j5 = 0;
        while (true) {
            boolean z9 = true;
            if (i14 <= i15) {
                if (iChar4 != 12 && iChar4 != 13 && iChar4 != 26 && iChar4 != 58 && iChar4 != 91 && iChar4 != 93 && iChar4 != 123 && iChar4 != 125 && iChar4 != 32 && iChar4 != 33) {
                    switch (iChar4) {
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
                            switch (iChar4) {
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
                                    switch (iChar4) {
                                        case ParserConstants.WHEN /* 60 */:
                                        case ParserConstants.WHILE /* 61 */:
                                        case ParserConstants.INTEGER_LITERAL /* 62 */:
                                            break;
                                        default:
                                            if (iChar4 == 92) {
                                                this.nameEscape = true;
                                                int i18 = i14 + 1;
                                                int i19 = (char) bArr[i14];
                                                if (i19 == 34 || i19 == 58 || i19 == 64 || i19 == 92) {
                                                    i14 = i18;
                                                    iChar4 = i19;
                                                } else if (i19 == 117) {
                                                    iChar4 = JSONReader.char4(bArr[i18], bArr[i14 + 2], bArr[i14 + 3], bArr[i14 + 4]);
                                                    i14 += 5;
                                                } else if (i19 == 120) {
                                                    iChar4 = JSONReader.char2(bArr[i18], bArr[i14 + 2]);
                                                    i14 += 3;
                                                } else if (i19 != 42 && i19 != 43) {
                                                    switch (i19) {
                                                        default:
                                                            switch (i19) {
                                                                case ParserConstants.WHEN /* 60 */:
                                                                case ParserConstants.WHILE /* 61 */:
                                                                case ParserConstants.INTEGER_LITERAL /* 62 */:
                                                                    break;
                                                                default:
                                                                    iChar4 = char1(i19);
                                                                    i14 = i18;
                                                                    break;
                                                            }
                                                        case ParserConstants.PROTECTED /* 45 */:
                                                        case 46:
                                                        case 47:
                                                            break;
                                                    }
                                                }
                                            }
                                            if (iChar4 <= 255 && i17 < 8 && (i17 != 0 || iChar4 != 0)) {
                                                byte b10 = (byte) iChar4;
                                                switch (i17) {
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
                                                if (i14 == i15) {
                                                    iChar4 = 26;
                                                } else {
                                                    iChar4 = bArr[i14] & 255;
                                                    i14++;
                                                }
                                                i17++;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (j5 == 0) {
                        j5 = -3750763034362895579L;
                        int i20 = i16;
                        int i21 = i14;
                        int i22 = 0;
                        while (true) {
                            if (i20 == 92) {
                                this.nameEscape = z9;
                                int i23 = i21 + 1;
                                char cChar4 = bArr[i21];
                                if (cChar4 != '\"' && cChar4 != ':') {
                                    if (cChar4 != '@' && cChar4 != '\\') {
                                        if (cChar4 != 'u') {
                                            if (cChar4 != 'x') {
                                                if (cChar4 != '*' && cChar4 != '+') {
                                                    switch (cChar4) {
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
                                                                    cChar4 = char1(cChar4);
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            } else {
                                                cChar4 = JSONReader.char2(bArr[i23], bArr[i21 + 2]);
                                                i23 = i21 + 3;
                                            }
                                        } else {
                                            cChar4 = JSONReader.char4(bArr[i23], bArr[i21 + 2], bArr[i21 + 3], bArr[i21 + 4]);
                                            i23 = i21 + 5;
                                        }
                                    }
                                }
                                long j10 = (((long) cChar4) ^ j5) * Fnv.MAGIC_PRIME;
                                if (i23 == i15) {
                                    i13 = i23;
                                    i20 = 26;
                                } else {
                                    i13 = i23 + 1;
                                    i20 = bArr[i23] & 255;
                                }
                                j5 = j10;
                                i21 = i13;
                            } else if (i20 != 12 && i20 != 13 && i20 != 26 && i20 != 58 && i20 != 91 && i20 != 93 && i20 != 123 && i20 != 125 && i20 != 32 && i20 != 33) {
                                switch (i20) {
                                    case 8:
                                    case 9:
                                    case 10:
                                        break;
                                    default:
                                        switch (i20) {
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
                                                switch (i20) {
                                                    case ParserConstants.WHEN /* 60 */:
                                                    case ParserConstants.WHILE /* 61 */:
                                                    case ParserConstants.INTEGER_LITERAL /* 62 */:
                                                        break;
                                                    default:
                                                        long j11 = (((long) i20) ^ j5) * Fnv.MAGIC_PRIME;
                                                        if (i21 == i15) {
                                                            i11 = i21;
                                                            i12 = 26;
                                                        } else {
                                                            i11 = i21 + 1;
                                                            i12 = bArr[i21] & 255;
                                                        }
                                                        i20 = i12;
                                                        i21 = i11;
                                                        j5 = j11;
                                                        continue;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            }
                            i22++;
                            z9 = true;
                        }
                        this.nameLength = i22;
                        this.nameEnd = i20 == 26 ? i21 : i21 - 1;
                        i14 = i21;
                        i16 = i20;
                        while (i16 <= 32 && ((1 << i16) & 4294981377L) != 0) {
                            if (i14 == i15) {
                                i16 = 26;
                            } else {
                                i16 = bArr[i14] & 255;
                                i14++;
                            }
                        }
                    }
                    if (i16 == 58) {
                        if (i14 == i15) {
                            i9 = i14;
                            i10 = 26;
                        } else {
                            i9 = i14 + 1;
                            i10 = bArr[i14] & 255;
                        }
                        int i24 = i9;
                        i16 = i10;
                        i14 = i24;
                        while (i16 <= 32 && ((1 << i16) & 4294981377L) != 0) {
                            if (i14 == i15) {
                                i16 = 26;
                            } else {
                                i16 = bArr[i14] & 255;
                                i14++;
                            }
                        }
                    }
                    this.offset = i14;
                    this.f1929ch = (char) i16;
                    return j5;
                }
            }
        }
        i14 = this.nameBegin + 1;
        j5 = 0;
        if (j5 == 0) {
        }
        if (i16 == 58) {
        }
        this.offset = i14;
        this.f1929ch = (char) i16;
        return j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:119:0x01a2) to fix multi-entry loop: BACK_EDGE: B:119:0x01a2 -> B:120:0x01a3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x01b6 -> B:117:0x019c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:121:0x01ac
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
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public java.lang.String readString() {
        /*
            r20 = this;
            r0 = r20
            char r1 = r0.f1929ch
            byte r1 = (byte) r1
            r2 = 34
            if (r1 == r2) goto L13
            r3 = 39
            if (r1 != r3) goto Le
            goto L13
        Le:
            java.lang.String r1 = r0.readStringNotMatch()
            return r1
        L13:
            byte[] r3 = r0.bytes
            int r4 = r0.offset
            int r5 = r0.end
            int r6 = r5 - r4
            r6 = r6 & (-4)
            int r6 = r6 + r4
            r7 = 0
            r8 = r4
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
        L24:
            r13 = 92
            if (r8 >= r6) goto L4f
            r10 = r3[r8]
            int r11 = r8 + 1
            r11 = r3[r11]
            int r12 = r8 + 2
            r12 = r3[r12]
            int r15 = r8 + 3
            r15 = r3[r15]
            if (r10 == r13) goto L4f
            if (r11 == r13) goto L4f
            if (r12 == r13) goto L4f
            if (r15 != r13) goto L3f
            goto L4f
        L3f:
            if (r10 == r1) goto L4d
            if (r11 == r1) goto L4d
            if (r12 == r1) goto L4d
            if (r15 != r1) goto L48
            goto L4d
        L48:
            int r8 = r8 + 4
            int r9 = r9 + 4
            goto L24
        L4d:
            r6 = 1
            goto L50
        L4f:
            r6 = r7
        L50:
            r15 = 120(0x78, float:1.68E-43)
            r16 = 1
            r14 = 117(0x75, float:1.64E-43)
            r17 = 2
            if (r6 == 0) goto L71
            if (r10 != r1) goto L5d
            goto L6f
        L5d:
            if (r11 != r1) goto L64
            int r8 = r8 + 1
            int r9 = r9 + 1
            goto L6f
        L64:
            if (r12 != r1) goto L6b
            int r8 = r8 + 2
            int r9 = r9 + 2
            goto L6f
        L6b:
            int r8 = r8 + 3
            int r9 = r9 + 3
        L6f:
            r6 = r7
            goto L8d
        L71:
            r6 = r7
        L72:
            if (r8 >= r5) goto L1fd
            r10 = r3[r8]
            if (r10 != r13) goto L8b
            int r6 = r8 + 1
            r6 = r3[r6]
            if (r6 != r14) goto L80
            r6 = 6
            goto L86
        L80:
            if (r6 != r15) goto L84
            r6 = 4
            goto L86
        L84:
            r6 = r17
        L86:
            int r8 = r8 + r6
            r6 = r16
            goto L1f4
        L8b:
            if (r10 != r1) goto L1f2
        L8d:
            r10 = 0
            if (r6 == 0) goto L124
            char[] r6 = r0.charBuf
            if (r6 != 0) goto La0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r6 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r8 = r0.cacheItem
            java.lang.Object r6 = r6.getAndSet(r8, r10)
            char[] r6 = (char[]) r6
            r0.charBuf = r6
        La0:
            if (r6 == 0) goto La5
            int r8 = r6.length
            if (r8 >= r9) goto La9
        La5:
            char[] r6 = new char[r9]
            r0.charBuf = r6
        La9:
            r8 = r7
        Laa:
            r11 = r3[r4]
            r11 = r11 & 255(0xff, float:3.57E-43)
            char r11 = (char) r11
            if (r11 != r13) goto L110
            int r11 = r4 + 1
            r12 = r3[r11]
            char r12 = (char) r12
            if (r12 == r2) goto L10d
            if (r12 == r13) goto L10d
            r13 = 98
            if (r12 == r13) goto L10a
            r13 = 102(0x66, float:1.43E-43)
            if (r12 == r13) goto L107
            r13 = 110(0x6e, float:1.54E-43)
            if (r12 == r13) goto L104
            r13 = 114(0x72, float:1.6E-43)
            if (r12 == r13) goto L101
            if (r12 == r15) goto Lf4
            r13 = 116(0x74, float:1.63E-43)
            if (r12 == r13) goto Lf1
            if (r12 == r14) goto Ldc
            char r4 = r0.char1(r12)
        Ld6:
            r19 = r11
            r11 = r4
            r4 = r19
            goto L119
        Ldc:
            int r11 = r4 + 2
            r11 = r3[r11]
            int r12 = r4 + 3
            r12 = r3[r12]
            int r13 = r4 + 4
            r13 = r3[r13]
            int r4 = r4 + 5
            r14 = r3[r4]
            char r11 = com.alibaba.fastjson2.JSONReader.char4(r11, r12, r13, r14)
            goto L119
        Lf1:
            r4 = 9
            goto Ld6
        Lf4:
            int r11 = r4 + 2
            r11 = r3[r11]
            int r4 = r4 + 3
            r12 = r3[r4]
            char r11 = com.alibaba.fastjson2.JSONReader.char2(r11, r12)
            goto L119
        L101:
            r4 = 13
            goto Ld6
        L104:
            r4 = 10
            goto Ld6
        L107:
            r4 = 12
            goto Ld6
        L10a:
            r4 = 8
            goto Ld6
        L10d:
            r4 = r11
            r11 = r12
            goto L119
        L110:
            if (r11 != r1) goto L119
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6, r7, r9)
            r8 = r4
            goto L16b
        L119:
            r6[r8] = r11
            int r4 = r4 + 1
            int r8 = r8 + 1
            r13 = 92
            r14 = 117(0x75, float:1.64E-43)
            goto Laa
        L124:
            java.lang.String r1 = r0.str
            if (r1 == 0) goto L12d
            java.lang.String r1 = r1.substring(r4, r8)
            goto L16b
        L12d:
            int r1 = r0.offset
            int r4 = r8 - r1
            int r6 = com.alibaba.fastjson2.util.JDKUtils.ANDROID_SDK_INT
            if (r6 >= r2) goto L163
            char[] r2 = r0.charBuf
            if (r2 != 0) goto L145
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r2 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r6 = r0.cacheItem
            java.lang.Object r2 = r2.getAndSet(r6, r10)
            char[] r2 = (char[]) r2
            r0.charBuf = r2
        L145:
            if (r2 == 0) goto L14a
            int r6 = r2.length
            if (r6 >= r4) goto L14e
        L14a:
            char[] r2 = new char[r4]
            r0.charBuf = r2
        L14e:
            r6 = r7
        L14f:
            if (r6 >= r4) goto L15d
            int r9 = r1 + r6
            r9 = r3[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            char r9 = (char) r9
            r2[r6] = r9
            int r6 = r6 + 1
            goto L14f
        L15d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r7, r4)
            goto L16b
        L163:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2.<init>(r3, r1, r4, r6)
            r1 = r2
        L16b:
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r11 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r13 = r2.mask
            long r11 = r11 & r13
            r13 = 0
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 == 0) goto L17e
            java.lang.String r1 = r1.trim()
        L17e:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L194
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r11 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            r4 = r8
            long r7 = r2.mask
            long r6 = r11 & r7
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 == 0) goto L195
            goto L196
        L194:
            r4 = r8
        L195:
            r10 = r1
        L196:
            int r8 = r4 + 1
            r1 = 26
            if (r8 != r5) goto L19e
        L19c:
            r4 = r1
            goto L1a3
        L19e:
            int r2 = r4 + 2
            r4 = r3[r8]
        L1a2:
            r8 = r2
        L1a3:
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            r11 = 1
            r2 = 32
            if (r4 > r2) goto L1be
            long r17 = r11 << r4
            long r17 = r17 & r6
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 == 0) goto L1be
            if (r8 != r5) goto L1b9
            goto L19c
        L1b9:
            int r2 = r8 + 1
            r4 = r3[r8]
            goto L1a2
        L1be:
            r9 = 44
            if (r4 != r9) goto L1c5
            r9 = r16
            goto L1c6
        L1c5:
            r9 = 0
        L1c6:
            r0.comma = r9
            if (r9 == 0) goto L1ea
            if (r8 != r5) goto L1cf
            r4 = r8
            r8 = r1
            goto L1d3
        L1cf:
            int r4 = r8 + 1
            r8 = r3[r8]
        L1d3:
            r19 = r8
            r8 = r4
            r4 = r19
        L1d8:
            if (r4 > r2) goto L1ea
            long r15 = r11 << r4
            long r15 = r15 & r6
            int r9 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r9 == 0) goto L1ea
            if (r8 != r5) goto L1e5
            r4 = r1
            goto L1d8
        L1e5:
            int r4 = r8 + 1
            r8 = r3[r8]
            goto L1d3
        L1ea:
            r1 = r4 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.f1929ch = r1
            r0.offset = r8
            return r10
        L1f2:
            int r8 = r8 + 1
        L1f4:
            int r9 = r9 + 1
            r7 = 0
            r13 = 92
            r14 = 117(0x75, float:1.64E-43)
            goto L72
        L1fd:
            java.lang.String r1 = "invalid escape character EOI"
            p012ah.C0086a.m464w(r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReaderASCII.readString():java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReaderUTF8
    public void readString0() {
        int i9;
        String latin1String;
        byte b10 = this.f1929ch;
        int i10 = this.offset;
        this.valueEscape = false;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.bytes;
            i9 = this.offset;
            byte b11 = bArr[i9];
            if (b11 == 92) {
                this.valueEscape = true;
                int i12 = i9 + 1;
                this.offset = i12;
                byte b12 = bArr[i12];
                if (b12 == 117) {
                    this.offset = i9 + 5;
                } else if (b12 == 120) {
                    this.offset = i9 + 3;
                }
                this.offset++;
            } else if (b11 == b10) {
                break;
            } else {
                this.offset = i9 + 1;
            }
            i11++;
        }
        if (this.valueEscape) {
            char[] cArr = new char[i11];
            this.offset = i10;
            int i13 = 0;
            while (true) {
                byte[] bArr2 = this.bytes;
                int i14 = this.offset;
                char cChar4 = (char) (bArr2[i14] & 255);
                if (cChar4 == '\\') {
                    int i15 = i14 + 1;
                    this.offset = i15;
                    cChar4 = (char) bArr2[i15];
                    if (cChar4 != '\"' && cChar4 != '\\') {
                        if (cChar4 == 'u') {
                            int i16 = i14 + 2;
                            this.offset = i16;
                            byte b13 = bArr2[i16];
                            int i17 = i14 + 3;
                            this.offset = i17;
                            byte b14 = bArr2[i17];
                            int i18 = i14 + 4;
                            this.offset = i18;
                            byte b15 = bArr2[i18];
                            int i19 = i14 + 5;
                            this.offset = i19;
                            cChar4 = JSONReader.char4(b13, b14, b15, bArr2[i19]);
                        } else if (cChar4 != 'x') {
                            cChar4 = char1(cChar4);
                        } else {
                            int i20 = i14 + 2;
                            this.offset = i20;
                            byte b16 = bArr2[i20];
                            int i21 = i14 + 3;
                            this.offset = i21;
                            cChar4 = JSONReader.char2(b16, bArr2[i21]);
                        }
                    }
                } else if (cChar4 == '\"') {
                    break;
                }
                cArr[i13] = cChar4;
                this.offset++;
                i13++;
            }
            latin1String = new String(cArr);
        } else {
            latin1String = getLatin1String(i10, i9 - i10);
        }
        byte[] bArr3 = this.bytes;
        int i22 = this.offset + 1;
        this.offset = i22;
        byte b17 = bArr3[i22];
        while (b17 <= 32 && ((1 << b17) & 4294981377L) != 0) {
            byte[] bArr4 = this.bytes;
            int i23 = this.offset + 1;
            this.offset = i23;
            b17 = bArr4[i23];
        }
        boolean z9 = b17 == 44;
        this.comma = z9;
        int i24 = this.offset;
        if (z9) {
            this.offset = i24 + 1;
            next();
        } else {
            this.offset = i24 + 1;
            this.f1929ch = (char) b17;
        }
        this.stringValue = latin1String;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r19 = 32;
     */
    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readValueHashCode() {
        byte b10;
        byte b11;
        boolean z9;
        byte b12;
        char cChar4;
        byte b13;
        long j3;
        long j4;
        char c10 = this.f1929ch;
        if (c10 != '\"' && c10 != '\'') {
            return -1L;
        }
        byte[] bArr = this.bytes;
        boolean z10 = true;
        this.nameAscii = true;
        this.nameEscape = false;
        int i9 = this.offset;
        this.nameBegin = i9;
        int i10 = 0;
        long j5 = 0;
        while (true) {
            b10 = 92;
            if (i9 < this.end) {
                char cChar42 = bArr[i9];
                if (cChar42 != c10) {
                    if (cChar42 == '\\') {
                        this.nameEscape = true;
                        int i11 = i9 + 1;
                        int i12 = bArr[i11];
                        if (i12 != 117) {
                            if (i12 != 120) {
                                cChar42 = char1(i12);
                                i9 = i11;
                            } else {
                                byte b14 = bArr[i9 + 2];
                                i9 += 3;
                                cChar42 = JSONReader.char2(b14, bArr[i9]);
                            }
                            b11 = 32;
                        } else {
                            byte b15 = bArr[i9 + 2];
                            byte b16 = bArr[i9 + 3];
                            b11 = 32;
                            byte b17 = bArr[i9 + 4];
                            i9 += 5;
                            cChar42 = JSONReader.char4(b15, b16, b17, bArr[i9]);
                        }
                    } else {
                        b11 = 32;
                        if (cChar42 == 65475 || cChar42 == 65474) {
                            i9++;
                            cChar42 = (char) (((cChar42 & 31) << 6) | (bArr[i9] & 63));
                        }
                    }
                    if (cChar42 <= 255 && cChar42 >= 0 && i10 < 8 && (i10 != 0 || cChar42 != 0)) {
                        switch (i10) {
                            case 0:
                                j5 = (byte) cChar42;
                                continue;
                                i9++;
                                i10++;
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
                                j3 = ((long) ((byte) cChar42)) << b11;
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
                                i10++;
                                break;
                        }
                        j5 = (j5 & j4) + j3;
                        i9++;
                        i10++;
                    }
                } else if (i10 == 0) {
                    i9 = this.nameBegin;
                    j5 = 0;
                } else {
                    this.nameLength = i10;
                    this.nameEnd = i9;
                    i9++;
                }
            }
        }
        i9 = this.nameBegin;
        j5 = 0;
        if (j5 != 0) {
            z9 = true;
        } else {
            j5 = -3750763034362895579L;
            int i13 = 0;
            while (true) {
                byte b18 = bArr[i9];
                if (b18 == b10) {
                    this.nameEscape = z10;
                    int i14 = i9 + 1;
                    int i15 = bArr[i14];
                    if (i15 != 117) {
                        if (i15 != 120) {
                            cChar4 = char1(i15);
                        } else {
                            byte b19 = bArr[i9 + 2];
                            int i16 = i9 + 3;
                            cChar4 = JSONReader.char2(b19, bArr[i16]);
                            i14 = i16;
                        }
                        z9 = z10;
                    } else {
                        byte b20 = bArr[i9 + 2];
                        byte b21 = bArr[i9 + 3];
                        byte b22 = bArr[i9 + 4];
                        int i17 = i9 + 5;
                        z9 = z10;
                        cChar4 = JSONReader.char4(b20, b21, b22, bArr[i17]);
                        i14 = i17;
                    }
                    j5 = (((long) cChar4) ^ j5) * Fnv.MAGIC_PRIME;
                    b12 = b11;
                    i9 = i14 + 1;
                } else {
                    z9 = z10;
                    if (b18 == 34) {
                        this.nameLength = i13;
                        this.nameEnd = i9;
                        i9++;
                    } else {
                        b12 = b11;
                        i9++;
                        j5 = (((long) b18) ^ j5) * Fnv.MAGIC_PRIME;
                    }
                }
                i13++;
                b11 = b12;
                z10 = z9;
                b10 = 92;
            }
        }
        if (i9 == this.end) {
            b13 = 26;
        } else {
            b13 = bArr[i9];
            i9++;
        }
        while (b13 <= b11 && ((1 << b13) & 4294981377L) != 0) {
            if (i9 == this.end) {
                b13 = 26;
            } else {
                b13 = bArr[i9];
                i9++;
            }
            b11 = 32;
        }
        boolean z11 = b13 == 44 ? z9 : false;
        this.comma = z11;
        if (z11) {
            if (i9 == this.end) {
                b13 = 26;
            } else {
                b13 = bArr[i9];
                i9++;
            }
            while (b13 <= 32 && ((1 << b13) & 4294981377L) != 0) {
                if (i9 == this.end) {
                    b13 = 26;
                } else {
                    b13 = bArr[i9];
                    i9++;
                }
            }
        }
        this.offset = i9;
        this.f1929ch = (char) (b13 & 255);
        return j5;
    }

    public JSONReaderASCII(JSONReader.Context context, InputStream inputStream) {
        super(context, inputStream);
        this.nameAscii = true;
        this.str = null;
    }
}
