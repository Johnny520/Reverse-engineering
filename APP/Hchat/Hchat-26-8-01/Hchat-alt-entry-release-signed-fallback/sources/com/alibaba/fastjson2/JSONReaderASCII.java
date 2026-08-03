package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONReaderASCII extends com.alibaba.fastjson2.JSONReaderUTF8 {
    final java.lang.String str;

    public JSONReaderASCII(com.alibaba.fastjson2.JSONReader.Context r1, java.io.InputStream r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.nameAscii = r1
            r1 = 0
            r0.str = r1
            return
    }

    public JSONReaderASCII(com.alibaba.fastjson2.JSONReader.Context r1, java.lang.String r2, byte[] r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            r1.str = r2
            r2 = 1
            r1.nameAscii = r2
            return
    }

    public static long getLong(byte[] r7, int r8) {
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 == 0) goto L10
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            int r1 = sun.misc.Unsafe.ARRAY_BYTE_BASE_OFFSET
            long r1 = (long) r1
            long r3 = (long) r8
            long r1 = r1 + r3
            long r7 = r0.getLong(r7, r1)
            return r7
        L10:
            int r0 = r8 + 7
            r0 = r7[r0]
            long r0 = (long) r0
            r2 = 56
            long r0 = r0 << r2
            int r2 = r8 + 6
            r2 = r7[r2]
            long r2 = (long) r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            r6 = 48
            long r2 = r2 << r6
            long r0 = r0 + r2
            int r2 = r8 + 5
            r2 = r7[r2]
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 40
            long r2 = r2 << r6
            long r0 = r0 + r2
            int r2 = r8 + 4
            r2 = r7[r2]
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 32
            long r2 = r2 << r6
            long r0 = r0 + r2
            int r2 = r8 + 3
            r2 = r7[r2]
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 24
            long r2 = r2 << r6
            long r0 = r0 + r2
            int r2 = r8 + 2
            r2 = r7[r2]
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 16
            long r2 = r2 << r6
            long r0 = r0 + r2
            int r2 = r8 + 1
            r2 = r7[r2]
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 8
            long r2 = r2 << r6
            long r0 = r0 + r2
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r4
            long r0 = r0 + r7
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public java.lang.String getFieldName() {
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
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public long getNameHashCodeLCase() {
            r20 = this;
            r0 = r20
            byte[] r1 = r0.bytes
            int r2 = r0.nameBegin
            r3 = 39
            r4 = 34
            if (r2 <= 0) goto L14
            int r5 = r2 + (-1)
            r5 = r1[r5]
            if (r5 != r3) goto L14
            r5 = r3
            goto L15
        L14:
            r5 = r4
        L15:
            r8 = 0
            r9 = 0
        L18:
            int r11 = r0.end
            r14 = 45
            r15 = 95
            r16 = 0
            r6 = 120(0x78, float:1.68E-43)
            r7 = 117(0x75, float:1.64E-43)
            r12 = 92
            r13 = 32
            if (r2 >= r11) goto Le7
            r11 = r1[r2]
            if (r11 != r12) goto L62
            int r11 = r2 + 1
            r12 = r1[r11]
            if (r12 == r7) goto L4d
            if (r12 == r6) goto L40
            char r2 = r0.char1(r12)
            r19 = r11
            r11 = r2
            r2 = r19
            goto L66
        L40:
            int r11 = r2 + 2
            r11 = r1[r11]
            int r2 = r2 + 3
            r12 = r1[r2]
            char r11 = com.alibaba.fastjson2.JSONReader.char2(r11, r12)
            goto L66
        L4d:
            int r11 = r2 + 2
            r11 = r1[r11]
            int r12 = r2 + 3
            r12 = r1[r12]
            int r18 = r2 + 4
            r6 = r1[r18]
            int r2 = r2 + 5
            r7 = r1[r2]
            char r11 = com.alibaba.fastjson2.JSONReader.char4(r11, r12, r6, r7)
            goto L66
        L62:
            if (r11 != r5) goto L66
            goto Le7
        L66:
            r6 = 255(0xff, float:3.57E-43)
            if (r11 > r6) goto Le3
            if (r11 < 0) goto Le3
            r6 = 8
            if (r8 >= r6) goto Le3
            if (r8 != 0) goto L76
            if (r11 != 0) goto L76
            goto Le3
        L76:
            if (r11 == r15) goto L80
            if (r11 == r14) goto L80
            if (r11 != r13) goto L7d
            goto L80
        L7d:
            r7 = 65
            goto L8b
        L80:
            int r7 = r2 + 1
            r7 = r1[r7]
            if (r7 == r4) goto L7d
            if (r7 == r3) goto L7d
            if (r7 == r11) goto L7d
            goto Ldf
        L8b:
            if (r11 < r7) goto L94
            r7 = 90
            if (r11 > r7) goto L94
            int r11 = r11 + 32
            char r11 = (char) r11
        L94:
            switch(r8) {
                case 0: goto Ldb;
                case 1: goto Ld4;
                case 2: goto Lcc;
                case 3: goto Lc4;
                case 4: goto Lbb;
                case 5: goto Lb0;
                case 6: goto La5;
                case 7: goto L98;
                default: goto L97;
            }
        L97:
            goto Ldd
        L98:
            byte r6 = (byte) r11
            long r6 = (long) r6
            r11 = 56
            long r6 = r6 << r11
            r11 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        La2:
            long r9 = r9 & r11
            long r9 = r9 + r6
            goto Ldd
        La5:
            byte r6 = (byte) r11
            long r6 = (long) r6
            r11 = 48
            long r6 = r6 << r11
            r11 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto La2
        Lb0:
            byte r6 = (byte) r11
            long r6 = (long) r6
            r11 = 40
            long r6 = r6 << r11
            r11 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto La2
        Lbb:
            byte r6 = (byte) r11
            long r6 = (long) r6
            long r6 = r6 << r13
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto La2
        Lc4:
            byte r6 = (byte) r11
            int r6 = r6 << 24
            long r6 = (long) r6
            r11 = 16777215(0xffffff, double:8.2890456E-317)
            goto La2
        Lcc:
            byte r6 = (byte) r11
            int r6 = r6 << 16
            long r6 = (long) r6
            r11 = 65535(0xffff, double:3.23786E-319)
            goto La2
        Ld4:
            byte r7 = (byte) r11
            int r6 = r7 << 8
            long r6 = (long) r6
            r11 = 255(0xff, double:1.26E-321)
            goto La2
        Ldb:
            byte r6 = (byte) r11
            long r9 = (long) r6
        Ldd:
            int r8 = r8 + 1
        Ldf:
            int r2 = r2 + 1
            goto L18
        Le3:
            int r2 = r0.nameBegin
            r9 = r16
        Le7:
            int r6 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r6 == 0) goto Lec
            return r9
        Lec:
            r6 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        Lf1:
            int r8 = r0.end
            if (r2 >= r8) goto L169
            r8 = r1[r2]
            r9 = 92
            if (r8 != r9) goto L135
            int r8 = r2 + 1
            r10 = r1[r8]
            r11 = 117(0x75, float:1.64E-43)
            if (r10 == r11) goto L11e
            r12 = 120(0x78, float:1.68E-43)
            if (r10 == r12) goto L111
            char r2 = r0.char1(r10)
            r19 = r8
            r8 = r2
            r2 = r19
            goto L13a
        L111:
            int r8 = r2 + 2
            r8 = r1[r8]
            int r2 = r2 + 3
            r10 = r1[r2]
            char r8 = com.alibaba.fastjson2.JSONReader.char2(r8, r10)
            goto L13a
        L11e:
            r12 = 120(0x78, float:1.68E-43)
            int r8 = r2 + 2
            r8 = r1[r8]
            int r10 = r2 + 3
            r10 = r1[r10]
            int r16 = r2 + 4
            r9 = r1[r16]
            int r2 = r2 + 5
            r11 = r1[r2]
            char r8 = com.alibaba.fastjson2.JSONReader.char4(r8, r10, r9, r11)
            goto L13a
        L135:
            r12 = 120(0x78, float:1.68E-43)
            if (r8 != r5) goto L13a
            goto L169
        L13a:
            int r2 = r2 + 1
            if (r8 == r15) goto L146
            if (r8 == r14) goto L146
            if (r8 != r13) goto L143
            goto L146
        L143:
            r9 = 65
            goto L14f
        L146:
            r9 = r1[r2]
            if (r9 == r4) goto L143
            if (r9 == r3) goto L143
            if (r9 == r8) goto L143
            goto Lf1
        L14f:
            r10 = 90
            if (r8 < r9) goto L158
            if (r8 > r10) goto L158
            int r8 = r8 + 32
            char r8 = (char) r8
        L158:
            if (r8 >= 0) goto L15c
            r8 = r8 & 255(0xff, float:3.57E-43)
        L15c:
            long r3 = (long) r8
            long r3 = r3 ^ r6
            r6 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r6 = r6 * r3
            r3 = 39
            r4 = 34
            goto Lf1
        L169:
            return r6
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public void next() {
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
            if (r1 == 0) goto L38
            if (r1 <= 0) goto L29
            r4 = 32
            if (r1 > r4) goto L29
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L29
            goto L38
        L29:
            r9.offset = r2
            r0 = r1 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            r9.f1814ch = r0
            r0 = 47
            if (r1 != r0) goto L37
            r9.skipComment()
        L37:
            return
        L38:
            int r1 = r9.end
            if (r2 != r1) goto L3d
            goto Lb
        L3d:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L11
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public boolean nextIfNullOrEmptyString() {
            r18 = this;
            r0 = r18
            char r1 = r0.f1814ch
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
            r0.f1814ch = r1
            return r8
        Lba:
            return r6
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectStart() {
            r9 = this;
            char r0 = r9.f1814ch
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
            if (r1 == 0) goto L3f
            r4 = 32
            if (r1 > r4) goto L2f
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L2f
            goto L3f
        L2f:
            r0 = r1 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            r9.f1814ch = r0
            r9.offset = r2
            r0 = 47
            if (r1 != r0) goto L3d
            r9.skipComment()
        L3d:
            r0 = 1
            return r0
        L3f:
            int r1 = r9.end
            if (r2 != r1) goto L44
            goto L13
        L44:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L19
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public java.lang.String readFieldName() {
            r23 = this;
            r0 = r23
            char r1 = r0.f1814ch
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
            r5 = 0
            r0.nameEscape = r5
            int r6 = r0.offset
            r0.nameBegin = r6
            r8 = r5
            r7 = r6
        L4a:
            int r9 = r0.end
            r10 = 32
            r11 = 1
            if (r7 >= r9) goto Lcc
            r12 = r2[r7]
            r13 = 92
            if (r12 != r13) goto L6c
            r0.nameEscape = r11
            int r9 = r7 + 1
            r9 = r2[r9]
            r10 = 117(0x75, float:1.64E-43)
            if (r9 != r10) goto L63
            r9 = 6
            goto L6a
        L63:
            r10 = 120(0x78, float:1.68E-43)
            if (r9 != r10) goto L69
            r9 = 4
            goto L6a
        L69:
            r9 = 2
        L6a:
            int r7 = r7 + r9
            goto Lc8
        L6c:
            if (r12 != r1) goto Lc6
            r0.nameLength = r8
            r0.nameEnd = r7
            int r7 = r7 + 1
            if (r7 >= r9) goto L79
            r1 = r2[r7]
            goto L7b
        L79:
            r1 = 26
        L7b:
            if (r1 > r10) goto L8f
            r8 = 1
            long r8 = r8 << r1
            r12 = 4294981377(0x100003701, double:2.122002748E-314)
            long r8 = r8 & r12
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 == 0) goto L8f
            int r7 = r7 + 1
            r1 = r2[r7]
            goto L7b
        L8f:
            r8 = 58
            if (r1 != r8) goto Lbf
            int r7 = r7 + r11
            int r1 = r0.end
            if (r7 >= r1) goto Lb6
            r1 = r2[r7]
        L9a:
            if (r1 > r10) goto Lae
            r8 = 1
            long r8 = r8 << r1
            r12 = 4294981377(0x100003701, double:2.122002748E-314)
            long r8 = r8 & r12
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 == 0) goto Lae
            int r7 = r7 + 1
            r1 = r2[r7]
            goto L9a
        Lae:
            int r3 = r7 + 1
            r0.offset = r3
            char r1 = (char) r1
            r0.f1814ch = r1
            goto Lcc
        Lb6:
            r1 = 26
            r0.f1814ch = r1
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r7, r1)
            throw r1
        Lbf:
            char r1 = r0.f1814ch
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r7, r1)
            throw r1
        Lc6:
            int r7 = r7 + 1
        Lc8:
            int r8 = r8 + 1
            goto L4a
        Lcc:
            int r1 = r0.nameEnd
            if (r1 < r6) goto L5e2
            boolean r3 = r0.nameEscape
            if (r3 != 0) goto L5dd
            int r1 = r1 - r6
            r7 = 56
            r9 = 40
            r12 = 24
            r13 = 16
            r14 = 8
            r15 = 255(0xff, double:1.26E-321)
            switch(r1) {
                case 1: goto L558;
                case 2: goto L54a;
                case 3: goto L536;
                case 4: goto L515;
                case 5: goto L4ee;
                case 6: goto L4bd;
                case 7: goto L481;
                case 8: goto L433;
                case 9: goto L3e6;
                case 10: goto L393;
                case 11: goto L33a;
                case 12: goto L2db;
                case 13: goto L271;
                case 14: goto L1fa;
                case 15: goto L17a;
                case 16: goto Lee;
                default: goto Le4;
            }
        Le4:
            r21 = r10
            r14 = -1
            r16 = -1
            r18 = -1
            goto L561
        Lee:
            int r17 = r6 + 7
            r18 = -1
            r3 = r2[r17]
            long r3 = (long) r3
            long r3 = r3 << r7
            int r17 = r6 + 6
            r5 = r2[r17]
            r17 = r7
            r20 = 48
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r20
            long r3 = r3 + r7
            int r5 = r6 + 5
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r9
            long r3 = r3 + r7
            int r5 = r6 + 4
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r10
            long r3 = r3 + r7
            int r5 = r6 + 3
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r12
            long r3 = r3 + r7
            int r5 = r6 + 2
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r13
            long r3 = r3 + r7
            int r5 = r6 + 1
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r14
            long r3 = r3 + r7
            r5 = r2[r6]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r3 = r3 + r7
            int r5 = r6 + 15
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 << r17
            int r5 = r6 + 14
            r5 = r2[r5]
            r22 = r9
            r21 = r10
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r20
            long r7 = r7 + r9
            int r5 = r6 + 13
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r22
            long r7 = r7 + r9
            int r5 = r6 + 12
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r21
            long r7 = r7 + r9
            int r5 = r6 + 11
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r12
            long r7 = r7 + r9
            int r5 = r6 + 10
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r13
            long r7 = r7 + r9
            int r5 = r6 + 9
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r14
            long r7 = r7 + r9
            int r5 = r6 + 8
            r5 = r2[r5]
        L172:
            long r9 = (long) r5
            long r9 = r9 & r15
            long r7 = r7 + r9
            r14 = r3
            r16 = r7
            goto L561
        L17a:
            r17 = r7
            r22 = r9
            r21 = r10
            r18 = -1
            r20 = 48
            int r3 = r6 + 6
            r3 = r2[r3]
            long r3 = (long) r3
            long r3 = r3 << r20
            int r5 = r6 + 5
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r22
            long r3 = r3 + r7
            int r5 = r6 + 4
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r21
            long r3 = r3 + r7
            int r5 = r6 + 3
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r12
            long r3 = r3 + r7
            int r5 = r6 + 2
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r13
            long r3 = r3 + r7
            int r5 = r6 + 1
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r14
            long r3 = r3 + r7
            r5 = r2[r6]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r3 = r3 + r7
            int r5 = r6 + 14
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 << r17
            int r5 = r6 + 13
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r20
            long r7 = r7 + r9
            int r5 = r6 + 12
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r22
            long r7 = r7 + r9
            int r5 = r6 + 11
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r21
            long r7 = r7 + r9
            int r5 = r6 + 10
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r12
            long r7 = r7 + r9
            int r5 = r6 + 9
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r13
            long r7 = r7 + r9
            int r5 = r6 + 8
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r14
            long r7 = r7 + r9
            int r5 = r6 + 7
            r5 = r2[r5]
            goto L172
        L1fa:
            r17 = r7
            r22 = r9
            r21 = r10
            r18 = -1
            r20 = 48
            int r3 = r6 + 5
            r3 = r2[r3]
            long r3 = (long) r3
            long r3 = r3 << r22
            int r5 = r6 + 4
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r21
            long r3 = r3 + r7
            int r5 = r6 + 3
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r12
            long r3 = r3 + r7
            int r5 = r6 + 2
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r13
            long r3 = r3 + r7
            int r5 = r6 + 1
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r14
            long r3 = r3 + r7
            r5 = r2[r6]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r3 = r3 + r7
            int r5 = r6 + 13
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 << r17
            int r5 = r6 + 12
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r20
            long r7 = r7 + r9
            int r5 = r6 + 11
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r22
            long r7 = r7 + r9
            int r5 = r6 + 10
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r21
            long r7 = r7 + r9
            int r5 = r6 + 9
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r12
            long r7 = r7 + r9
            int r5 = r6 + 8
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r13
            long r7 = r7 + r9
            int r5 = r6 + 7
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r14
            long r7 = r7 + r9
            int r5 = r6 + 6
            r5 = r2[r5]
            goto L172
        L271:
            r17 = r7
            r22 = r9
            r21 = r10
            r18 = -1
            r20 = 48
            int r3 = r6 + 4
            r3 = r2[r3]
            long r3 = (long) r3
            long r3 = r3 << r21
            int r5 = r6 + 3
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 << r12
            long r3 = r3 + r7
            int r5 = r6 + 2
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 << r13
            long r3 = r3 + r7
            int r5 = r6 + 1
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 << r14
            long r3 = r3 + r7
            r5 = r2[r6]
            long r7 = (long) r5
            long r3 = r3 + r7
            int r5 = r6 + 12
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 << r17
            int r5 = r6 + 11
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r20
            long r7 = r7 + r9
            int r5 = r6 + 10
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r22
            long r7 = r7 + r9
            int r5 = r6 + 9
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r21
            long r7 = r7 + r9
            int r5 = r6 + 8
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r12
            long r7 = r7 + r9
            int r5 = r6 + 7
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r13
            long r7 = r7 + r9
            int r5 = r6 + 6
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r14
            long r7 = r7 + r9
            int r5 = r6 + 5
            r5 = r2[r5]
            goto L172
        L2db:
            r17 = r7
            r22 = r9
            r21 = r10
            r18 = -1
            r20 = 48
            int r3 = r6 + 3
            r3 = r2[r3]
            int r3 = r3 << r12
            int r4 = r6 + 2
            r4 = r2[r4]
            int r4 = r4 << r13
            int r3 = r3 + r4
            int r4 = r6 + 1
            r4 = r2[r4]
            int r4 = r4 << r14
            int r3 = r3 + r4
            r4 = r2[r6]
            int r3 = r3 + r4
            long r3 = (long) r3
            int r5 = r6 + 11
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 << r17
            int r5 = r6 + 10
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r20
            long r7 = r7 + r9
            int r5 = r6 + 9
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r22
            long r7 = r7 + r9
            int r5 = r6 + 8
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r21
            long r7 = r7 + r9
            int r5 = r6 + 7
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r12
            long r7 = r7 + r9
            int r5 = r6 + 6
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r13
            long r7 = r7 + r9
            int r5 = r6 + 5
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r14
            long r7 = r7 + r9
            int r5 = r6 + 4
            r5 = r2[r5]
            goto L172
        L33a:
            r17 = r7
            r22 = r9
            r21 = r10
            r18 = -1
            r20 = 48
            int r3 = r6 + 2
            r3 = r2[r3]
            int r3 = r3 << r13
            int r4 = r6 + 1
            r4 = r2[r4]
            int r4 = r4 << r14
            int r3 = r3 + r4
            r4 = r2[r6]
            int r3 = r3 + r4
            long r3 = (long) r3
            int r5 = r6 + 10
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 << r17
            int r5 = r6 + 9
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r20
            long r7 = r7 + r9
            int r5 = r6 + 8
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r22
            long r7 = r7 + r9
            int r5 = r6 + 7
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r21
            long r7 = r7 + r9
            int r5 = r6 + 6
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r12
            long r7 = r7 + r9
            int r5 = r6 + 5
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r13
            long r7 = r7 + r9
            int r5 = r6 + 4
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r14
            long r7 = r7 + r9
            int r5 = r6 + 3
            r5 = r2[r5]
            goto L172
        L393:
            r17 = r7
            r22 = r9
            r21 = r10
            r18 = -1
            r20 = 48
            int r3 = r6 + 1
            r3 = r2[r3]
            int r3 = r3 << r14
            r4 = r2[r6]
            int r3 = r3 + r4
            long r3 = (long) r3
            int r5 = r6 + 9
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 << r17
            int r5 = r6 + 8
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r20
            long r7 = r7 + r9
            int r5 = r6 + 7
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r22
            long r7 = r7 + r9
            int r5 = r6 + 6
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r21
            long r7 = r7 + r9
            int r5 = r6 + 5
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r12
            long r7 = r7 + r9
            int r5 = r6 + 4
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r13
            long r7 = r7 + r9
            int r5 = r6 + 3
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r14
            long r7 = r7 + r9
            int r5 = r6 + 2
            r5 = r2[r5]
            goto L172
        L3e6:
            r17 = r7
            r22 = r9
            r21 = r10
            r18 = -1
            r20 = 48
            r3 = r2[r6]
            long r3 = (long) r3
            int r5 = r6 + 8
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 << r17
            int r5 = r6 + 7
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r20
            long r7 = r7 + r9
            int r5 = r6 + 6
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r22
            long r7 = r7 + r9
            int r5 = r6 + 5
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r21
            long r7 = r7 + r9
            int r5 = r6 + 4
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r12
            long r7 = r7 + r9
            int r5 = r6 + 3
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r13
            long r7 = r7 + r9
            int r5 = r6 + 2
            r5 = r2[r5]
            long r9 = (long) r5
            long r9 = r9 & r15
            long r9 = r9 << r14
            long r7 = r7 + r9
            int r5 = r6 + 1
            r5 = r2[r5]
            goto L172
        L433:
            r17 = r7
            r22 = r9
            r21 = r10
            r18 = -1
            r20 = 48
            int r3 = r6 + 7
            r3 = r2[r3]
            long r3 = (long) r3
            long r3 = r3 << r17
            int r5 = r6 + 6
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r20
            long r3 = r3 + r7
            int r5 = r6 + 5
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r22
            long r3 = r3 + r7
            int r5 = r6 + 4
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r21
            long r3 = r3 + r7
            int r5 = r6 + 3
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r12
            long r3 = r3 + r7
            int r5 = r6 + 2
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r13
            long r3 = r3 + r7
            int r5 = r6 + 1
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r14
            long r3 = r3 + r7
            r5 = r2[r6]
        L479:
            long r7 = (long) r5
            long r7 = r7 & r15
            long r3 = r3 + r7
        L47c:
            r14 = r3
            r16 = r18
            goto L561
        L481:
            r22 = r9
            r21 = r10
            r18 = -1
            r20 = 48
            int r3 = r6 + 6
            r3 = r2[r3]
            long r3 = (long) r3
            long r3 = r3 << r20
            int r5 = r6 + 5
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r22
            long r3 = r3 + r7
            int r5 = r6 + 4
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r21
            long r3 = r3 + r7
            int r5 = r6 + 3
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r12
            long r3 = r3 + r7
            int r5 = r6 + 2
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r13
            long r3 = r3 + r7
            int r5 = r6 + 1
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r14
            long r3 = r3 + r7
            r5 = r2[r6]
            goto L479
        L4bd:
            r22 = r9
            r21 = r10
            r18 = -1
            int r3 = r6 + 5
            r3 = r2[r3]
            long r3 = (long) r3
            long r3 = r3 << r22
            int r5 = r6 + 4
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r21
            long r3 = r3 + r7
            int r5 = r6 + 3
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r12
            long r3 = r3 + r7
            int r5 = r6 + 2
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r13
            long r3 = r3 + r7
            int r5 = r6 + 1
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r14
            long r3 = r3 + r7
            r5 = r2[r6]
            goto L479
        L4ee:
            r21 = r10
            r18 = -1
            int r3 = r6 + 4
            r3 = r2[r3]
            long r3 = (long) r3
            long r3 = r3 << r21
            int r5 = r6 + 3
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r12
            long r3 = r3 + r7
            int r5 = r6 + 2
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r13
            long r3 = r3 + r7
            int r5 = r6 + 1
            r5 = r2[r5]
            long r7 = (long) r5
            long r7 = r7 & r15
            long r7 = r7 << r14
            long r3 = r3 + r7
            r5 = r2[r6]
            goto L479
        L515:
            r21 = r10
            r18 = -1
            int r3 = r6 + 3
            r3 = r2[r3]
            int r3 = r3 << r12
            int r4 = r6 + 2
            r4 = r2[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r13
            int r3 = r3 + r4
            int r4 = r6 + 1
            r4 = r2[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r14
            int r3 = r3 + r4
            r4 = r2[r6]
        L530:
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r4
        L533:
            long r3 = (long) r3
            goto L47c
        L536:
            r21 = r10
            r18 = -1
            int r3 = r6 + 2
            r3 = r2[r3]
            int r3 = r3 << r13
            int r4 = r6 + 1
            r4 = r2[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r14
            int r3 = r3 + r4
            r4 = r2[r6]
            goto L530
        L54a:
            r21 = r10
            r18 = -1
            int r3 = r6 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r14
            r4 = r2[r6]
            goto L530
        L558:
            r21 = r10
            r18 = -1
            r3 = r2[r6]
            r3 = r3 & 255(0xff, float:3.57E-43)
            goto L533
        L561:
            int r3 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r3 == 0) goto L5dd
            int r3 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r3 == 0) goto L5a7
            long r3 = r14 ^ r16
            long r7 = r3 >>> r21
            long r3 = r3 ^ r7
            int r3 = (int) r3
            com.alibaba.fastjson2.JSONFactory$NameCacheEntry2[] r4 = com.alibaba.fastjson2.JSONFactory.NAME_CACHE2
            int r5 = r4.length
            int r5 = r5 - r11
            r3 = r3 & r5
            r4 = r4[r3]
            if (r4 != 0) goto L598
            char[] r4 = new char[r1]
            r5 = 0
        L57b:
            if (r5 >= r1) goto L589
            int r7 = r6 + r5
            r7 = r2[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            char r7 = (char) r7
            r4[r5] = r7
            int r5 = r5 + 1
            goto L57b
        L589:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r4)
            com.alibaba.fastjson2.JSONFactory$NameCacheEntry2[] r1 = com.alibaba.fastjson2.JSONFactory.NAME_CACHE2
            com.alibaba.fastjson2.JSONFactory$NameCacheEntry2 r12 = new com.alibaba.fastjson2.JSONFactory$NameCacheEntry2
            r12.<init>(r13, r14, r16)
            r1[r3] = r12
            return r13
        L598:
            long r1 = r4.value0
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 != 0) goto L5dd
            long r1 = r4.value1
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 != 0) goto L5dd
            java.lang.String r1 = r4.name
            return r1
        L5a7:
            long r3 = r14 >>> r21
            long r3 = r3 ^ r14
            int r3 = (int) r3
            com.alibaba.fastjson2.util.NameCacheEntry[] r4 = com.alibaba.fastjson2.JSONFactory.NAME_CACHE
            int r5 = r4.length
            int r5 = r5 - r11
            r3 = r3 & r5
            r4 = r4[r3]
            if (r4 != 0) goto L5d4
            char[] r4 = new char[r1]
            r5 = 0
        L5b7:
            if (r5 >= r1) goto L5c5
            int r7 = r6 + r5
            r7 = r2[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            char r7 = (char) r7
            r4[r5] = r7
            int r5 = r5 + 1
            goto L5b7
        L5c5:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
            com.alibaba.fastjson2.util.NameCacheEntry[] r2 = com.alibaba.fastjson2.JSONFactory.NAME_CACHE
            com.alibaba.fastjson2.util.NameCacheEntry r4 = new com.alibaba.fastjson2.util.NameCacheEntry
            r4.<init>(r1, r14)
            r2[r3] = r4
            return r1
        L5d4:
            long r1 = r4.value
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 != 0) goto L5dd
            java.lang.String r1 = r4.name
            return r1
        L5dd:
            java.lang.String r1 = r0.getFieldName()
            return r1
        L5e2:
            char r1 = r0.f1814ch
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r7, r1)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCode() {
            r27 = this;
            r0 = r27
            byte[] r1 = r0.bytes
            char r2 = r0.f1814ch
            r3 = 47
            if (r2 != r3) goto Lf
            r0.skipComment()
            char r2 = r0.f1814ch
        Lf:
            r3 = 39
            r4 = 0
            if (r2 != r3) goto L28
            com.alibaba.fastjson2.JSONReader$Context r6 = r0.context
            long r6 = r6.features
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.DisableSingleQuote
            long r8 = r8.mask
            long r6 = r6 & r8
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto L23
            goto L28
        L23:
            com.alibaba.fastjson2.JSONException r1 = r0.notSupportName()
            throw r1
        L28:
            r6 = 34
            if (r2 == r6) goto L89
            if (r2 == r3) goto L89
            com.alibaba.fastjson2.JSONReader$Context r1 = r0.context
            long r6 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.AllowUnQuotedFieldNames
            long r8 = r1.mask
            long r6 = r6 & r8
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L46
            boolean r1 = com.alibaba.fastjson2.JSONReader.isFirstIdentifier(r2)
            if (r1 == 0) goto L46
            long r1 = r0.readFieldNameHashCodeUnquote()
            return r1
        L46:
            r1 = 125(0x7d, float:1.75E-43)
            if (r2 == r1) goto L86
            boolean r1 = r0.isNull()
            if (r1 == 0) goto L51
            goto L86
        L51:
            r1 = 91
            if (r2 != r1) goto L76
            int r1 = r0.nameBegin
            if (r1 <= 0) goto L76
            java.lang.String r1 = r0.getFieldName()
            if (r1 == 0) goto L76
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "illegal fieldName input "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", previous fieldName "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L7c
        L76:
            java.lang.String r1 = "illegal fieldName input"
            java.lang.String r1 = eh.a.l(r2, r1)
        L7c:
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
        L83:
            r1 = 0
            return r1
        L86:
            r1 = -1
            return r1
        L89:
            r3 = 0
            r0.stringValue = r3
            r3 = 0
            r0.nameEscape = r3
            int r6 = r0.offset
            r0.nameBegin = r6
            int r7 = r6 + 9
            int r8 = r0.end
            r13 = 16
            r14 = 255(0xff, float:3.57E-43)
            r15 = 8
            r16 = 255(0xff, double:1.26E-321)
            r3 = 1
            r18 = r4
            r4 = 92
            if (r7 >= r8) goto Laa
            r5 = r1[r6]
            if (r5 != r2) goto Lb6
        Laa:
            r23 = r13
            r20 = 48
            r21 = 40
            r22 = 24
            r24 = 32
            goto L216
        Lb6:
            int r8 = r6 + 1
            r20 = 48
            r9 = r1[r8]
            if (r9 != r2) goto Ld3
            if (r5 == 0) goto Ld3
            if (r5 == r4) goto Ld3
            r21 = 40
            r22 = 24
            long r10 = (long) r5
            r0.nameLength = r3
            r0.nameEnd = r8
            int r6 = r6 + 2
        Lcd:
            r23 = r13
        Lcf:
            r24 = 32
            goto L218
        Ld3:
            r21 = 40
            r22 = 24
            int r8 = r6 + 2
            r10 = r1[r8]
            if (r10 != r2) goto Lf0
            if (r9 == 0) goto Lf0
            if (r5 == r4) goto Lf0
            if (r9 == r4) goto Lf0
            int r7 = r9 << 8
            r5 = r5 & r14
            int r7 = r7 + r5
            long r10 = (long) r7
            r5 = 2
            r0.nameLength = r5
            r0.nameEnd = r8
            int r6 = r6 + 3
            goto Lcd
        Lf0:
            int r8 = r6 + 3
            r11 = r1[r8]
            if (r11 != r2) goto L10e
            if (r10 == 0) goto L10e
            if (r5 == r4) goto L10e
            if (r9 == r4) goto L10e
            if (r10 == r4) goto L10e
            int r7 = r10 << 16
            r9 = r9 & r14
            int r9 = r9 << r15
            int r7 = r7 + r9
            r5 = r5 & r14
            int r7 = r7 + r5
            long r10 = (long) r7
            r5 = 3
            r0.nameLength = r5
            r0.nameEnd = r8
            int r6 = r6 + 4
            goto Lcd
        L10e:
            int r8 = r6 + 4
            r23 = r13
            r13 = r1[r8]
            if (r13 != r2) goto L134
            if (r11 == 0) goto L134
            if (r5 == r4) goto L134
            if (r9 == r4) goto L134
            if (r10 == r4) goto L134
            if (r11 == r4) goto L134
            int r7 = r11 << 24
            r10 = r10 & r14
            int r10 = r10 << 16
            int r7 = r7 + r10
            r9 = r9 & r14
            int r9 = r9 << r15
            int r7 = r7 + r9
            r5 = r5 & r14
            int r7 = r7 + r5
            long r10 = (long) r7
            r5 = 4
            r0.nameLength = r5
            r0.nameEnd = r8
            int r6 = r6 + 5
            goto Lcf
        L134:
            int r8 = r6 + 5
            r24 = 32
            r12 = r1[r8]
            if (r12 != r2) goto L16d
            if (r13 == 0) goto L16d
            if (r5 == r4) goto L16d
            if (r9 == r4) goto L16d
            if (r10 == r4) goto L16d
            if (r11 == r4) goto L16d
            if (r13 == r4) goto L16d
            long r12 = (long) r13
            long r12 = r12 << r24
            r25 = r15
            long r14 = (long) r11
            long r14 = r14 & r16
            long r14 = r14 << r22
            long r12 = r12 + r14
            long r10 = (long) r10
            long r10 = r10 & r16
            long r10 = r10 << r23
            long r12 = r12 + r10
            long r9 = (long) r9
            long r9 = r9 & r16
            long r9 = r9 << r25
            long r12 = r12 + r9
            long r9 = (long) r5
            long r9 = r9 & r16
            long r10 = r12 + r9
            r5 = 5
            r0.nameLength = r5
            r0.nameEnd = r8
            int r6 = r6 + 6
            goto L218
        L16d:
            r25 = r15
            int r8 = r6 + 6
            r14 = r1[r8]
            if (r14 != r2) goto L1ac
            if (r12 == 0) goto L1ac
            if (r5 == r4) goto L1ac
            if (r9 == r4) goto L1ac
            if (r10 == r4) goto L1ac
            if (r11 == r4) goto L1ac
            if (r13 == r4) goto L1ac
            if (r12 == r4) goto L1ac
            long r14 = (long) r12
            long r14 = r14 << r21
            long r12 = (long) r13
            long r12 = r12 & r16
            long r12 = r12 << r24
            long r14 = r14 + r12
            long r11 = (long) r11
            long r11 = r11 & r16
            long r11 = r11 << r22
            long r14 = r14 + r11
            long r10 = (long) r10
            long r10 = r10 & r16
            long r10 = r10 << r23
            long r14 = r14 + r10
            long r9 = (long) r9
            long r9 = r9 & r16
            long r9 = r9 << r25
            long r14 = r14 + r9
            long r9 = (long) r5
            long r9 = r9 & r16
            long r10 = r14 + r9
            r5 = 6
            r0.nameLength = r5
            r0.nameEnd = r8
            int r6 = r6 + 7
            goto L218
        L1ac:
            int r8 = r6 + 7
            r15 = r1[r8]
            if (r15 != r2) goto L1f0
            if (r14 == 0) goto L1f0
            if (r5 == r4) goto L1f0
            if (r9 == r4) goto L1f0
            if (r10 == r4) goto L1f0
            if (r11 == r4) goto L1f0
            if (r13 == r4) goto L1f0
            if (r12 == r4) goto L1f0
            if (r14 == r4) goto L1f0
            long r14 = (long) r14
            long r14 = r14 << r20
            long r3 = (long) r12
            long r3 = r3 & r16
            long r3 = r3 << r21
            long r14 = r14 + r3
            long r3 = (long) r13
            long r3 = r3 & r16
            long r3 = r3 << r24
            long r14 = r14 + r3
            long r3 = (long) r11
            long r3 = r3 & r16
            long r3 = r3 << r22
            long r14 = r14 + r3
            long r3 = (long) r10
            long r3 = r3 & r16
            long r3 = r3 << r23
            long r14 = r14 + r3
            long r3 = (long) r9
            long r3 = r3 & r16
            long r3 = r3 << r25
            long r14 = r14 + r3
            long r3 = (long) r5
            long r3 = r3 & r16
            long r10 = r14 + r3
            r3 = 7
            r0.nameLength = r3
            r0.nameEnd = r8
            int r6 = r6 + 8
            goto L218
        L1f0:
            int r3 = r6 + 8
            r4 = r1[r3]
            if (r4 != r2) goto L216
            if (r15 == 0) goto L216
            r4 = 92
            if (r5 == r4) goto L216
            if (r9 == r4) goto L216
            if (r10 == r4) goto L216
            if (r11 == r4) goto L216
            if (r13 == r4) goto L216
            if (r12 == r4) goto L216
            if (r14 == r4) goto L216
            if (r15 == r4) goto L216
            long r10 = getLong(r1, r6)
            r4 = r25
            r0.nameLength = r4
            r0.nameEnd = r3
            r6 = r7
            goto L218
        L216:
            r10 = r18
        L218:
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            r4 = 120(0x78, float:1.68E-43)
            r5 = 117(0x75, float:1.64E-43)
            if (r3 != 0) goto L2dc
            r3 = 0
        L221:
            int r7 = r0.end
            if (r6 >= r7) goto L2dc
            r7 = r1[r6]
            if (r7 != r2) goto L237
            if (r3 != 0) goto L22f
            int r6 = r0.nameBegin
            goto L2dc
        L22f:
            r0.nameLength = r3
            r0.nameEnd = r6
            int r6 = r6 + 1
            goto L2dc
        L237:
            r8 = 92
            if (r7 != r8) goto L24d
            r8 = 1
            r0.nameEscape = r8
            int r7 = r6 + 1
            r8 = r1[r7]
            if (r8 == r5) goto L25d
            if (r8 == r4) goto L250
            char r6 = r0.char1(r8)
            r8 = r7
            r7 = r6
            r6 = r8
        L24d:
            r8 = 255(0xff, float:3.57E-43)
            goto L272
        L250:
            int r7 = r6 + 2
            r7 = r1[r7]
            int r6 = r6 + 3
            r8 = r1[r6]
            char r7 = com.alibaba.fastjson2.JSONReader.char2(r7, r8)
            goto L24d
        L25d:
            int r7 = r6 + 2
            r7 = r1[r7]
            int r8 = r6 + 3
            r8 = r1[r8]
            int r9 = r6 + 4
            r9 = r1[r9]
            int r6 = r6 + 5
            r12 = r1[r6]
            char r7 = com.alibaba.fastjson2.JSONReader.char4(r7, r8, r9, r12)
            goto L24d
        L272:
            if (r7 > r8) goto L2d8
            r8 = 8
            if (r3 >= r8) goto L2d8
            if (r3 != 0) goto L27d
            if (r7 != 0) goto L27d
            goto L2d8
        L27d:
            switch(r3) {
                case 0: goto L2cd;
                case 1: goto L2c2;
                case 2: goto L2ba;
                case 3: goto L2b2;
                case 4: goto L2a8;
                case 5: goto L29e;
                case 6: goto L294;
                case 7: goto L285;
                default: goto L280;
            }
        L280:
            r25 = 8
        L282:
            r26 = 1
            goto L2d2
        L285:
            byte r7 = (byte) r7
            long r7 = (long) r7
            r9 = 56
            long r7 = r7 << r9
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        L28f:
            long r9 = r10 & r12
            long r7 = r7 + r9
            r10 = r7
            goto L280
        L294:
            byte r7 = (byte) r7
            long r7 = (long) r7
            long r7 = r7 << r20
            r12 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto L28f
        L29e:
            byte r7 = (byte) r7
            long r7 = (long) r7
            long r7 = r7 << r21
            r12 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto L28f
        L2a8:
            byte r7 = (byte) r7
            long r7 = (long) r7
            long r7 = r7 << r24
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L28f
        L2b2:
            byte r7 = (byte) r7
            int r7 = r7 << 24
            long r7 = (long) r7
            r12 = 16777215(0xffffff, double:8.2890456E-317)
            goto L28f
        L2ba:
            byte r7 = (byte) r7
            int r7 = r7 << 16
            long r7 = (long) r7
            r12 = 65535(0xffff, double:3.23786E-319)
            goto L28f
        L2c2:
            byte r7 = (byte) r7
            r25 = 8
            int r7 = r7 << 8
            long r7 = (long) r7
            long r9 = r10 & r16
            long r7 = r7 + r9
        L2cb:
            r10 = r7
            goto L282
        L2cd:
            r25 = 8
            byte r7 = (byte) r7
            long r7 = (long) r7
            goto L2cb
        L2d2:
            int r6 = r6 + 1
            int r3 = r3 + 1
            goto L221
        L2d8:
            int r6 = r0.nameBegin
            r10 = r18
        L2dc:
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 == 0) goto L2e1
            goto L344
        L2e1:
            r7 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r10 = r7
            r3 = 0
        L2e8:
            r7 = r1[r6]
            r8 = 92
            if (r7 != r8) goto L33a
            r9 = 1
            r0.nameEscape = r9
            int r7 = r6 + 1
            r9 = r1[r7]
            if (r9 == r5) goto L312
            if (r9 == r4) goto L300
            char r6 = r0.char1(r9)
        L2fd:
            r26 = 1
            goto L327
        L300:
            int r7 = r6 + 2
            r7 = r1[r7]
            int r6 = r6 + 3
            r9 = r1[r6]
            char r7 = com.alibaba.fastjson2.JSONReader.char2(r7, r9)
        L30c:
            r26 = r7
            r7 = r6
            r6 = r26
            goto L2fd
        L312:
            int r7 = r6 + 2
            r7 = r1[r7]
            int r9 = r6 + 3
            r9 = r1[r9]
            int r12 = r6 + 4
            r12 = r1[r12]
            int r6 = r6 + 5
            r13 = r1[r6]
            char r7 = com.alibaba.fastjson2.JSONReader.char4(r7, r9, r12, r13)
            goto L30c
        L327:
            int r7 = r7 + 1
            long r12 = (long) r6
            long r9 = r10 ^ r12
            r11 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r9 = r9 * r11
            r6 = r7
            r10 = r9
            r9 = r24
            r12 = 255(0xff, float:3.57E-43)
            goto L3c5
        L33a:
            r26 = 1
            if (r7 != r2) goto L3b5
            r0.nameLength = r3
            r0.nameEnd = r6
            int r6 = r6 + 1
        L344:
            int r2 = r0.end
            r3 = 26
            if (r6 != r2) goto L34c
            r4 = r3
            goto L351
        L34c:
            int r2 = r6 + 1
            r4 = r1[r6]
            r6 = r2
        L351:
            r2 = r24
        L353:
            if (r4 > r2) goto L370
            r7 = 1
            long r7 = r7 << r4
            r12 = 4294981377(0x100003701, double:2.122002748E-314)
            long r7 = r7 & r12
            int r2 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r2 == 0) goto L370
            int r2 = r0.end
            if (r6 != r2) goto L368
            r4 = r3
            goto L36d
        L368:
            int r2 = r6 + 1
            r4 = r1[r6]
            r6 = r2
        L36d:
            r2 = 32
            goto L353
        L370:
            r2 = 58
            if (r4 != r2) goto L3a6
            int r2 = r0.end
            if (r6 != r2) goto L37a
            r4 = r3
            goto L37f
        L37a:
            int r2 = r6 + 1
            r4 = r1[r6]
            r6 = r2
        L37f:
            r9 = 32
        L381:
            if (r4 > r9) goto L39c
            r7 = 1
            long r7 = r7 << r4
            r12 = 4294981377(0x100003701, double:2.122002748E-314)
            long r7 = r7 & r12
            int r2 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r2 == 0) goto L39c
            int r2 = r0.end
            if (r6 != r2) goto L396
            r4 = r3
            goto L381
        L396:
            int r2 = r6 + 1
            r4 = r1[r6]
            r6 = r2
            goto L381
        L39c:
            r0.offset = r6
            r12 = 255(0xff, float:3.57E-43)
            r1 = r4 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.f1814ch = r1
            return r10
        L3a6:
            java.lang.String r1 = "expect ':', but "
            java.lang.String r1 = eh.a.l(r4, r1)
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
            goto L83
        L3b5:
            r9 = r24
            r12 = 255(0xff, float:3.57E-43)
            int r6 = r6 + 1
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r13 = (long) r7
            long r10 = r10 ^ r13
            r13 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r10 = r10 * r13
        L3c5:
            int r3 = r3 + 1
            r24 = r9
            goto L2e8
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public final long readFieldNameHashCodeUnquote() {
            r26 = this;
            r0 = r26
            r1 = 0
            r0.nameEscape = r1
            int r2 = r0.offset
            int r3 = r0.end
            byte[] r4 = r0.bytes
            char r5 = r0.f1814ch
            int r6 = r2 + (-1)
            r0.nameBegin = r6
            r9 = r1
            r8 = r5
            r10 = 0
        L15:
            r16 = 0
            r7 = 93
            r12 = 91
            r13 = 13
            r14 = 12
            r19 = 4294981377(0x100003701, double:2.122002748E-314)
            r21 = 1
            r15 = 58
            r1 = 26
            r6 = 1
            if (r2 > r3) goto L13b
            if (r8 == r14) goto L116
            if (r8 == r13) goto L116
            if (r8 == r1) goto L116
            if (r8 == r15) goto L116
            if (r8 == r12) goto L116
            if (r8 == r7) goto L116
            r7 = 123(0x7b, float:1.72E-43)
            if (r8 == r7) goto L116
            r7 = 125(0x7d, float:1.75E-43)
            if (r8 == r7) goto L116
            r7 = 32
            if (r8 == r7) goto L116
            r7 = 33
            if (r8 == r7) goto L116
            switch(r8) {
                case 8: goto L116;
                case 9: goto L116;
                case 10: goto L116;
                default: goto L4c;
            }
        L4c:
            switch(r8) {
                case 40: goto L116;
                case 41: goto L116;
                case 42: goto L116;
                case 43: goto L116;
                case 44: goto L116;
                case 45: goto L116;
                case 46: goto L116;
                case 47: goto L116;
                default: goto L4f;
            }
        L4f:
            switch(r8) {
                case 60: goto L116;
                case 61: goto L116;
                case 62: goto L116;
                default: goto L52;
            }
        L52:
            r7 = 92
            if (r8 != r7) goto L86
            r0.nameEscape = r6
            int r8 = r2 + 1
            r12 = r4[r2]
            char r12 = (char) r12
            r13 = 34
            if (r12 == r13) goto Lab
            if (r12 == r15) goto Lab
            r13 = 64
            if (r12 == r13) goto Lab
            if (r12 == r7) goto Lab
            r7 = 117(0x75, float:1.64E-43)
            if (r12 == r7) goto L96
            r7 = 120(0x78, float:1.68E-43)
            if (r12 == r7) goto L89
            r2 = 42
            if (r12 == r2) goto Lab
            r2 = 43
            if (r12 == r2) goto Lab
            switch(r12) {
                case 45: goto Lab;
                case 46: goto Lab;
                case 47: goto Lab;
                default: goto L7c;
            }
        L7c:
            switch(r12) {
                case 60: goto Lab;
                case 61: goto Lab;
                case 62: goto Lab;
                default: goto L7f;
            }
        L7f:
            char r2 = r0.char1(r12)
            r7 = r8
            r8 = r2
            r2 = r7
        L86:
            r7 = 255(0xff, float:3.57E-43)
            goto Lae
        L89:
            r7 = r4[r8]
            int r8 = r2 + 2
            r8 = r4[r8]
            char r8 = com.alibaba.fastjson2.JSONReader.char2(r7, r8)
            int r2 = r2 + 3
            goto L86
        L96:
            r7 = r4[r8]
            int r8 = r2 + 2
            r8 = r4[r8]
            int r12 = r2 + 3
            r12 = r4[r12]
            int r13 = r2 + 4
            r13 = r4[r13]
            char r8 = com.alibaba.fastjson2.JSONReader.char4(r7, r8, r12, r13)
            int r2 = r2 + 5
            goto L86
        Lab:
            r2 = r8
            r8 = r12
            goto L86
        Lae:
            if (r8 > r7) goto L110
            r7 = 8
            if (r9 >= r7) goto L110
            if (r9 != 0) goto Lb9
            if (r8 != 0) goto Lb9
            goto L110
        Lb9:
            byte r6 = (byte) r8
            switch(r9) {
                case 0: goto Lfd;
                case 1: goto Lf7;
                case 2: goto Lf0;
                case 3: goto Le9;
                case 4: goto Lde;
                case 5: goto Ld4;
                case 6: goto Lca;
                case 7: goto Lbe;
                default: goto Lbd;
            }
        Lbd:
            goto Lfe
        Lbe:
            long r6 = (long) r6
            r8 = 56
            long r6 = r6 << r8
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        Lc7:
            long r10 = r10 & r12
            long r10 = r10 + r6
            goto Lfe
        Lca:
            long r6 = (long) r6
            r8 = 48
            long r6 = r6 << r8
            r12 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto Lc7
        Ld4:
            long r6 = (long) r6
            r8 = 40
            long r6 = r6 << r8
            r12 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto Lc7
        Lde:
            long r6 = (long) r6
            r23 = 32
            long r6 = r6 << r23
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto Lc7
        Le9:
            int r6 = r6 << 24
            long r6 = (long) r6
            r12 = 16777215(0xffffff, double:8.2890456E-317)
            goto Lc7
        Lf0:
            int r6 = r6 << 16
            long r6 = (long) r6
            r12 = 65535(0xffff, double:3.23786E-319)
            goto Lc7
        Lf7:
            int r6 = r6 << 8
            long r6 = (long) r6
            r12 = 255(0xff, double:1.26E-321)
            goto Lc7
        Lfd:
            long r10 = (long) r6
        Lfe:
            if (r2 != r3) goto L102
            r8 = r1
            goto L10b
        L102:
            int r1 = r2 + 1
            r2 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r2 = r2 & r7
            r8 = r2
            r2 = r1
        L10b:
            int r9 = r9 + 1
            r1 = 0
            goto L15
        L110:
            int r2 = r0.nameBegin
            int r2 = r2 + r6
            r10 = r16
            goto L13c
        L116:
            r0.nameLength = r9
            if (r8 != r1) goto L11c
            r5 = r2
            goto L11e
        L11c:
            int r5 = r2 + (-1)
        L11e:
            r0.nameEnd = r5
            r7 = 32
            if (r8 > r7) goto L13b
            long r12 = r21 << r8
            long r12 = r12 & r19
            int r5 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r5 == 0) goto L13b
            if (r2 != r3) goto L130
            r5 = r1
            goto L13c
        L130:
            int r5 = r2 + 1
            r2 = r4[r2]
            char r2 = (char) r2
            r24 = r5
            r5 = r2
            r2 = r24
            goto L13c
        L13b:
            r5 = r8
        L13c:
            int r7 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r7 == 0) goto L142
            goto L232
        L142:
            r7 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r10 = r7
            r7 = r5
            r5 = r2
            r2 = 0
        L14b:
            r8 = 92
            if (r7 != r8) goto L1bb
            r0.nameEscape = r6
            int r7 = r5 + 1
            r9 = r4[r5]
            r13 = 34
            if (r9 == r13) goto L19e
            if (r9 == r15) goto L19e
            r12 = 64
            if (r9 == r12) goto L1a0
            if (r9 == r8) goto L1a0
            r6 = 117(0x75, float:1.64E-43)
            if (r9 == r6) goto L189
            r6 = 120(0x78, float:1.68E-43)
            if (r9 == r6) goto L17c
            r5 = 42
            if (r9 == r5) goto L1a0
            r5 = 43
            if (r9 == r5) goto L1a0
            switch(r9) {
                case 45: goto L1a0;
                case 46: goto L1a0;
                case 47: goto L1a0;
                default: goto L174;
            }
        L174:
            switch(r9) {
                case 60: goto L1a0;
                case 61: goto L1a0;
                case 62: goto L1a0;
                default: goto L177;
            }
        L177:
            char r9 = r0.char1(r9)
            goto L1a0
        L17c:
            r6 = r4[r7]
            int r7 = r5 + 2
            r7 = r4[r7]
            char r9 = com.alibaba.fastjson2.JSONReader.char2(r6, r7)
            int r7 = r5 + 3
            goto L1a0
        L189:
            r6 = r4[r7]
            int r7 = r5 + 2
            r7 = r4[r7]
            int r9 = r5 + 3
            r9 = r4[r9]
            int r18 = r5 + 4
            r8 = r4[r18]
            char r9 = com.alibaba.fastjson2.JSONReader.char4(r6, r7, r9, r8)
            int r7 = r5 + 5
            goto L1a0
        L19e:
            r12 = 64
        L1a0:
            long r5 = (long) r9
            long r5 = r5 ^ r10
            r8 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r5 = r5 * r8
            if (r7 != r3) goto L1ad
            r8 = r7
            r7 = r1
            goto L1b4
        L1ad:
            int r8 = r7 + 1
            r7 = r4[r7]
            r9 = 255(0xff, float:3.57E-43)
            r7 = r7 & r9
        L1b4:
            r10 = r5
            r5 = r8
            r8 = 91
            r9 = 93
            goto L204
        L1bb:
            r12 = 64
            r13 = 34
            if (r7 == r14) goto L209
            r6 = 13
            if (r7 == r6) goto L209
            if (r7 == r1) goto L209
            if (r7 == r15) goto L209
            r8 = 91
            if (r7 == r8) goto L209
            r9 = 93
            if (r7 == r9) goto L209
            r6 = 123(0x7b, float:1.72E-43)
            if (r7 == r6) goto L209
            r6 = 125(0x7d, float:1.75E-43)
            if (r7 == r6) goto L209
            r6 = 32
            if (r7 == r6) goto L209
            r6 = 33
            if (r7 == r6) goto L209
            switch(r7) {
                case 8: goto L209;
                case 9: goto L209;
                case 10: goto L209;
                default: goto L1e4;
            }
        L1e4:
            switch(r7) {
                case 40: goto L209;
                case 41: goto L209;
                case 42: goto L209;
                case 43: goto L209;
                case 44: goto L209;
                case 45: goto L209;
                case 46: goto L209;
                case 47: goto L209;
                default: goto L1e7;
            }
        L1e7:
            switch(r7) {
                case 60: goto L209;
                case 61: goto L209;
                case 62: goto L209;
                default: goto L1ea;
            }
        L1ea:
            long r6 = (long) r7
            long r6 = r6 ^ r10
            r10 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r6 = r6 * r10
            if (r5 != r3) goto L1f7
            r10 = r5
            r5 = r1
            goto L1fe
        L1f7:
            int r10 = r5 + 1
            r5 = r4[r5]
            r11 = 255(0xff, float:3.57E-43)
            r5 = r5 & r11
        L1fe:
            r24 = r6
            r7 = r5
            r5 = r10
            r10 = r24
        L204:
            int r2 = r2 + 1
            r6 = 1
            goto L14b
        L209:
            r0.nameLength = r2
            if (r7 != r1) goto L20f
            r2 = r5
            goto L211
        L20f:
            int r2 = r5 + (-1)
        L211:
            r0.nameEnd = r2
            r2 = r5
            r5 = r7
        L215:
            r7 = 32
            if (r5 > r7) goto L232
            long r6 = r21 << r5
            long r6 = r6 & r19
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r6 == 0) goto L232
            if (r2 != r3) goto L225
            r5 = r1
            goto L215
        L225:
            int r5 = r2 + 1
            r2 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r2 = r2 & r7
            r24 = r5
            r5 = r2
            r2 = r24
            goto L215
        L232:
            if (r5 != r15) goto L262
            if (r2 != r3) goto L239
            r5 = r2
            r2 = r1
            goto L240
        L239:
            int r5 = r2 + 1
            r2 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r2 = r2 & r7
        L240:
            r7 = r5
            r5 = r2
            r2 = r7
            r7 = 32
        L245:
            if (r5 > r7) goto L262
            long r8 = r21 << r5
            long r8 = r8 & r19
            int r6 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r6 == 0) goto L262
            if (r2 != r3) goto L255
            r5 = r1
            r9 = 255(0xff, float:3.57E-43)
            goto L245
        L255:
            int r5 = r2 + 1
            r2 = r4[r2]
            r9 = 255(0xff, float:3.57E-43)
            r2 = r2 & r9
            r24 = r5
            r5 = r2
            r2 = r24
            goto L245
        L262:
            r0.offset = r2
            char r1 = (char) r5
            r0.f1814ch = r1
            return r10
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public java.lang.String readString() {
            r20 = this;
            r0 = r20
            char r1 = r0.f1814ch
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
            r0.f1814ch = r1
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
            ah.a.w(r1)
            r1 = 0
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8
    public void readString0() {
            r12 = this;
            char r0 = r12.f1814ch
            int r1 = r12.offset
            r2 = 0
            r12.valueEscape = r2
            r3 = r2
        L8:
            byte[] r4 = r12.bytes
            int r5 = r12.offset
            r6 = r4[r5]
            r7 = 120(0x78, float:1.68E-43)
            r8 = 117(0x75, float:1.64E-43)
            r9 = 92
            r10 = 1
            if (r6 != r9) goto L34
            r12.valueEscape = r10
            int r6 = r5 + 1
            r12.offset = r6
            r4 = r4[r6]
            if (r4 == r8) goto L29
            if (r4 == r7) goto L24
            goto L2d
        L24:
            int r5 = r5 + 3
            r12.offset = r5
            goto L2d
        L29:
            int r5 = r5 + 5
            r12.offset = r5
        L2d:
            int r4 = r12.offset
            int r4 = r4 + r10
            r12.offset = r4
            goto Le9
        L34:
            if (r6 != r0) goto Le5
            boolean r0 = r12.valueEscape
            if (r0 == 0) goto L9f
            char[] r0 = new char[r3]
            r12.offset = r1
            r1 = r2
        L3f:
            byte[] r3 = r12.bytes
            int r4 = r12.offset
            r5 = r3[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            char r5 = (char) r5
            r6 = 34
            if (r5 != r9) goto L8e
            int r5 = r4 + 1
            r12.offset = r5
            r5 = r3[r5]
            char r5 = (char) r5
            if (r5 == r6) goto L96
            if (r5 == r9) goto L96
            if (r5 == r8) goto L71
            if (r5 == r7) goto L60
            char r5 = r12.char1(r5)
            goto L96
        L60:
            int r5 = r4 + 2
            r12.offset = r5
            r5 = r3[r5]
            int r4 = r4 + 3
            r12.offset = r4
            r3 = r3[r4]
            char r5 = com.alibaba.fastjson2.JSONReader.char2(r5, r3)
            goto L96
        L71:
            int r5 = r4 + 2
            r12.offset = r5
            r5 = r3[r5]
            int r6 = r4 + 3
            r12.offset = r6
            r6 = r3[r6]
            int r11 = r4 + 4
            r12.offset = r11
            r11 = r3[r11]
            int r4 = r4 + 5
            r12.offset = r4
            r3 = r3[r4]
            char r5 = com.alibaba.fastjson2.JSONReader.char4(r5, r6, r11, r3)
            goto L96
        L8e:
            if (r5 != r6) goto L96
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            goto La4
        L96:
            r0[r1] = r5
            int r3 = r12.offset
            int r3 = r3 + r10
            r12.offset = r3
            int r1 = r1 + r10
            goto L3f
        L9f:
            int r5 = r5 - r1
            java.lang.String r1 = r12.getLatin1String(r1, r5)
        La4:
            byte[] r0 = r12.bytes
            int r3 = r12.offset
            int r3 = r3 + r10
            r12.offset = r3
            r0 = r0[r3]
        Lad:
            r3 = 32
            if (r0 > r3) goto Lca
            r3 = 1
            long r3 = r3 << r0
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto Lca
            byte[] r0 = r12.bytes
            int r3 = r12.offset
            int r3 = r3 + r10
            r12.offset = r3
            r0 = r0[r3]
            goto Lad
        Lca:
            r3 = 44
            if (r0 != r3) goto Lcf
            r2 = r10
        Lcf:
            r12.comma = r2
            int r3 = r12.offset
            if (r2 == 0) goto Ldc
            int r3 = r3 + r10
            r12.offset = r3
            r12.next()
            goto Le2
        Ldc:
            int r3 = r3 + r10
            r12.offset = r3
            char r0 = (char) r0
            r12.f1814ch = r0
        Le2:
            r12.stringValue = r1
            return
        Le5:
            int r5 = r5 + 1
            r12.offset = r5
        Le9:
            int r3 = r3 + 1
            goto L8
    }

    @Override // com.alibaba.fastjson2.JSONReaderUTF8, com.alibaba.fastjson2.JSONReader
    public long readValueHashCode() {
            r24 = this;
            r0 = r24
            char r1 = r0.f1814ch
            r2 = 34
            if (r1 == r2) goto Lf
            r3 = 39
            if (r1 == r3) goto Lf
            r1 = -1
            return r1
        Lf:
            byte[] r3 = r0.bytes
            r4 = 1
            r0.nameAscii = r4
            r5 = 0
            r0.nameEscape = r5
            int r6 = r0.offset
            r0.nameBegin = r6
            r9 = r5
            r10 = 0
        L1e:
            int r12 = r0.end
            r13 = 255(0xff, float:3.57E-43)
            r14 = 120(0x78, float:1.68E-43)
            r15 = 117(0x75, float:1.64E-43)
            r5 = 92
            r16 = 0
            if (r6 >= r12) goto L36
            r8 = r3[r6]
            if (r8 != r1) goto L41
            if (r9 != 0) goto L3a
            int r6 = r0.nameBegin
            r10 = r16
        L36:
            r19 = 32
            goto Lf6
        L3a:
            r0.nameLength = r9
            r0.nameEnd = r6
            int r6 = r6 + 1
            goto L36
        L41:
            if (r8 != r5) goto L7d
            r0.nameEscape = r4
            int r8 = r6 + 1
            r12 = r3[r8]
            if (r12 == r15) goto L66
            if (r12 == r14) goto L59
            char r6 = r0.char1(r12)
            r19 = r8
            r8 = r6
            r6 = r19
        L56:
            r19 = 32
            goto L93
        L59:
            int r8 = r6 + 2
            r8 = r3[r8]
            int r6 = r6 + 3
            r12 = r3[r6]
            char r8 = com.alibaba.fastjson2.JSONReader.char2(r8, r12)
            goto L56
        L66:
            int r8 = r6 + 2
            r8 = r3[r8]
            int r12 = r6 + 3
            r12 = r3[r12]
            int r18 = r6 + 4
            r19 = 32
            r7 = r3[r18]
            int r6 = r6 + 5
            r2 = r3[r6]
            char r8 = com.alibaba.fastjson2.JSONReader.char4(r8, r12, r7, r2)
            goto L93
        L7d:
            r19 = 32
            r2 = -61
            if (r8 == r2) goto L87
            r2 = -62
            if (r8 != r2) goto L93
        L87:
            r2 = r8 & 31
            int r2 = r2 << 6
            int r6 = r6 + 1
            r7 = r3[r6]
            r7 = r7 & 63
            r2 = r2 | r7
            char r8 = (char) r2
        L93:
            if (r8 > r13) goto Lf2
            if (r8 < 0) goto Lf2
            r2 = 8
            if (r9 >= r2) goto Lf2
            if (r9 != 0) goto La0
            if (r8 != 0) goto La0
            goto Lf2
        La0:
            switch(r9) {
                case 0: goto Le8;
                case 1: goto Le1;
                case 2: goto Ld9;
                case 3: goto Ld1;
                case 4: goto Lc7;
                case 5: goto Lbc;
                case 6: goto Lb1;
                case 7: goto La4;
                default: goto La3;
            }
        La3:
            goto Lea
        La4:
            byte r2 = (byte) r8
            long r7 = (long) r2
            r2 = 56
            long r7 = r7 << r2
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        Lae:
            long r10 = r10 & r12
            long r10 = r10 + r7
            goto Lea
        Lb1:
            byte r2 = (byte) r8
            long r7 = (long) r2
            r2 = 48
            long r7 = r7 << r2
            r12 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto Lae
        Lbc:
            byte r2 = (byte) r8
            long r7 = (long) r2
            r2 = 40
            long r7 = r7 << r2
            r12 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto Lae
        Lc7:
            byte r2 = (byte) r8
            long r7 = (long) r2
            long r7 = r7 << r19
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto Lae
        Ld1:
            byte r2 = (byte) r8
            int r2 = r2 << 24
            long r7 = (long) r2
            r12 = 16777215(0xffffff, double:8.2890456E-317)
            goto Lae
        Ld9:
            byte r2 = (byte) r8
            int r2 = r2 << 16
            long r7 = (long) r2
            r12 = 65535(0xffff, double:3.23786E-319)
            goto Lae
        Le1:
            byte r5 = (byte) r8
            int r2 = r5 << 8
            long r7 = (long) r2
            r12 = 255(0xff, double:1.26E-321)
            goto Lae
        Le8:
            byte r2 = (byte) r8
            long r10 = (long) r2
        Lea:
            int r6 = r6 + r4
            int r9 = r9 + 1
            r2 = 34
            r5 = 0
            goto L1e
        Lf2:
            int r6 = r0.nameBegin
            r10 = r16
        Lf6:
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 == 0) goto Lfe
            r20 = r4
            goto L163
        Lfe:
            r1 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r10 = r1
            r1 = 0
        L105:
            r2 = r3[r6]
            r7 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            if (r2 != r5) goto L157
            r0.nameEscape = r4
            int r2 = r6 + 1
            r9 = r3[r2]
            if (r9 == r15) goto L131
            if (r9 == r14) goto L11f
            char r6 = r0.char1(r9)
        L11c:
            r20 = r4
            goto L14c
        L11f:
            int r2 = r6 + 2
            r2 = r3[r2]
            int r6 = r6 + 3
            r9 = r3[r6]
            char r2 = com.alibaba.fastjson2.JSONReader.char2(r2, r9)
            r20 = r6
            r6 = r2
            r2 = r20
            goto L11c
        L131:
            int r2 = r6 + 2
            r2 = r3[r2]
            int r9 = r6 + 3
            r9 = r3[r9]
            int r12 = r6 + 4
            r12 = r3[r12]
            int r6 = r6 + 5
            r20 = r4
            r4 = r3[r6]
            char r2 = com.alibaba.fastjson2.JSONReader.char4(r2, r9, r12, r4)
            r23 = r6
            r6 = r2
            r2 = r23
        L14c:
            int r2 = r2 + 1
            long r5 = (long) r6
            long r5 = r5 ^ r10
            long r5 = r5 * r7
            r10 = r5
            r9 = r19
            r6 = r2
            goto L1d0
        L157:
            r20 = r4
            r5 = 34
            if (r2 != r5) goto L1c8
            r0.nameLength = r1
            r0.nameEnd = r6
            int r6 = r6 + 1
        L163:
            int r1 = r0.end
            r2 = 26
            if (r6 != r1) goto L16b
            r4 = r2
            goto L170
        L16b:
            int r1 = r6 + 1
            r4 = r3[r6]
            r6 = r1
        L170:
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r14 = 1
            r1 = r19
            if (r4 > r1) goto L191
            long r21 = r14 << r4
            long r21 = r21 & r7
            int r1 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r1 == 0) goto L191
            int r1 = r0.end
            if (r6 != r1) goto L189
            r4 = r2
            goto L18e
        L189:
            int r1 = r6 + 1
            r4 = r3[r6]
            r6 = r1
        L18e:
            r19 = 32
            goto L170
        L191:
            r1 = 44
            if (r4 != r1) goto L198
            r1 = r20
            goto L199
        L198:
            r1 = 0
        L199:
            r0.comma = r1
            if (r1 == 0) goto L1c0
            int r1 = r0.end
            if (r6 != r1) goto L1a3
            r4 = r2
            goto L1a8
        L1a3:
            int r1 = r6 + 1
            r4 = r3[r6]
            r6 = r1
        L1a8:
            r9 = 32
        L1aa:
            if (r4 > r9) goto L1c0
            long r18 = r14 << r4
            long r18 = r18 & r7
            int r1 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r1 == 0) goto L1c0
            int r1 = r0.end
            if (r6 != r1) goto L1ba
            r4 = r2
            goto L1aa
        L1ba:
            int r1 = r6 + 1
            r4 = r3[r6]
            r6 = r1
            goto L1aa
        L1c0:
            r0.offset = r6
            r1 = r4 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.f1814ch = r1
            return r10
        L1c8:
            r9 = r19
            int r6 = r6 + 1
            long r4 = (long) r2
            long r4 = r4 ^ r10
            long r4 = r4 * r7
            r10 = r4
        L1d0:
            int r1 = r1 + 1
            r19 = r9
            r4 = r20
            r5 = 92
            goto L105
    }
}
