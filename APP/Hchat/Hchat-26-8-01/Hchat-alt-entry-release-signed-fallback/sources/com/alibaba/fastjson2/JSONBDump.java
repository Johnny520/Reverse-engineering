package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONBDump {
    static java.nio.charset.Charset GB18030;
    final byte[] bytes;
    final com.alibaba.fastjson2.JSONWriter jsonWriter;
    java.lang.String lastReference;
    int offset;
    final boolean raw;
    int strBegin;
    int strlen;
    byte strtype;
    final com.alibaba.fastjson2.SymbolTable symbolTable;
    final java.util.Map<java.lang.Integer, java.lang.String> symbols;
    byte type;

    public JSONBDump(byte[] r2, com.alibaba.fastjson2.SymbolTable r3, boolean r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.symbols = r0
            r1.bytes = r2
            r1.raw = r4
            r1.symbolTable = r3
            com.alibaba.fastjson2.JSONWriter r2 = com.alibaba.fastjson2.JSONWriter.ofPretty()
            r1.jsonWriter = r2
            r1.dumpAny()
            return
    }

    public JSONBDump(byte[] r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.symbols = r0
            r1.bytes = r2
            r1.raw = r3
            com.alibaba.fastjson2.JSONWriter r2 = com.alibaba.fastjson2.JSONWriter.ofPretty()
            r1.jsonWriter = r2
            r2 = 0
            r1.symbolTable = r2
            r1.dumpAny()
            return
    }

    private void dumpAny() {
            r20 = this;
            r0 = r20
            int r1 = r0.offset
            byte[] r2 = r0.bytes
            int r3 = r2.length
            if (r1 < r3) goto La
            return
        La:
            int r3 = r1 + 1
            r0.offset = r3
            r4 = r2[r1]
            r0.type = r4
            r5 = -90
            r6 = 0
            if (r4 == r5) goto L5d4
            r7 = 72
            r9 = 16
            r10 = 8
            if (r4 == r7) goto L5ad
            r11 = -88
            if (r4 == r11) goto L571
            r11 = -87
            if (r4 == r11) goto L54f
            r11 = 0
            r12 = 1
            java.lang.String r13 = "#"
            switch(r4) {
                case -112: goto L544;
                case -111: goto L52c;
                case -110: goto L477;
                case -109: goto L473;
                default: goto L2e;
            }
        L2e:
            r5 = 63
            r14 = 47
            r15 = -16
            r16 = 56
            r17 = 24
            r8 = 48
            r18 = 255(0xff, double:1.26E-321)
            switch(r4) {
                case -85: goto L421;
                case -84: goto L5af;
                case -83: goto L5af;
                case -82: goto L413;
                case -81: goto L40d;
                case -80: goto L407;
                case -79: goto L401;
                case -78: goto L3f9;
                case -77: goto L3f1;
                case -76: goto L3e6;
                case -75: goto L390;
                case -74: goto L385;
                case -73: goto L35c;
                case -72: goto L34c;
                case -71: goto L290;
                case -70: goto L286;
                case -69: goto L269;
                case -68: goto L252;
                case -67: goto L246;
                case -66: goto L421;
                case -65: goto L220;
                default: goto L3f;
            }
        L3f:
            switch(r4) {
                case 122: goto L206;
                case 123: goto L1ec;
                case 124: goto L1d2;
                case 125: goto L1b8;
                case 126: goto L192;
                case 127: goto L137;
                default: goto L42;
            }
        L42:
            if (r4 < r15) goto L4c
            if (r4 > r14) goto L4c
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeInt32(r4)
            return
        L4c:
            r6 = -40
            if (r4 < r6) goto L5d
            r6 = -17
            if (r4 > r6) goto L5d
            int r4 = r4 + 32
            long r1 = (long) r4
            com.alibaba.fastjson2.JSONWriter r3 = r0.jsonWriter
            r3.writeInt64(r1)
            return
        L5d:
            if (r4 < r8) goto L73
            if (r4 > r5) goto L73
            int r4 = r4 + (-56)
            int r4 = r4 << r10
            int r1 = r1 + 2
            r0.offset = r1
            r1 = r2[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r1
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeInt32(r4)
            return
        L73:
            r5 = 64
            if (r4 < r5) goto L97
            r5 = 71
            if (r4 > r5) goto L97
            int r4 = r4 + (-68)
            int r4 = r4 << r9
            int r5 = r1 + 2
            r0.offset = r5
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r10
            int r4 = r4 + r3
            int r1 = r1 + 3
            r0.offset = r1
            r1 = r2[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r1
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeInt32(r4)
            return
        L97:
            r5 = -56
            if (r4 < r5) goto Lb1
            r5 = -41
            if (r4 > r5) goto Lb1
            int r4 = r4 + 48
            int r4 = r4 << r10
            int r1 = r1 + 2
            r0.offset = r1
            r1 = r2[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r1
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeInt32(r4)
            return
        Lb1:
            r5 = -64
            if (r4 < r5) goto Ld6
            r5 = -57
            if (r4 > r5) goto Ld6
            int r4 = r4 + 60
            int r4 = r4 << r9
            int r5 = r1 + 2
            r0.offset = r5
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r10
            int r4 = r4 + r3
            int r1 = r1 + 3
            r0.offset = r1
            r1 = r2[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r1
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            long r2 = (long) r4
            r1.writeInt64(r2)
            return
        Ld6:
            r1 = -108(0xffffffffffffff94, float:NaN)
            if (r4 < r1) goto Le2
            r1 = -92
            if (r4 > r1) goto Le2
            r0.dumpArray()
            return
        Le2:
            r1 = 73
            if (r4 < r1) goto L127
            r1 = 121(0x79, float:1.7E-43)
            if (r4 > r1) goto L127
            r1 = 121(0x79, float:1.7E-43)
            if (r4 != r1) goto Lf3
            int r1 = r0.readLength()
            goto Lf5
        Lf3:
            int r1 = r4 + (-73)
        Lf5:
            r0.strlen = r1
            if (r1 >= 0) goto L10f
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            java.lang.String r2 = "{\"$symbol\":"
            r1.writeRaw(r2)
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            int r2 = r0.strlen
            r1.writeInt32(r2)
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            java.lang.String r2 = "}"
            r1.writeRaw(r2)
            return
        L10f:
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r0.bytes
            int r4 = r0.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2.<init>(r3, r4, r1, r5)
            int r1 = r0.offset
            int r3 = r0.strlen
            int r1 = r1 + r3
            r0.offset = r1
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeString(r2)
            return
        L127:
            byte r1 = r0.type
            java.lang.String r1 = com.alibaba.fastjson2.JSONB.typeName(r1)
            java.lang.String r2 = ", offset "
            int r3 = r0.offset
            java.lang.String r4 = "not support type : "
            ah.a.f(r3, r1, r2, r4)
            return
        L137:
            boolean r1 = r0.isInt()
            if (r1 == 0) goto L161
            int r1 = r0.readInt32Value()
            boolean r2 = r0.raw
            if (r2 == 0) goto L157
            com.alibaba.fastjson2.JSONWriter r2 = r0.jsonWriter
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r13)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.writeString(r1)
            return
        L157:
            java.lang.String r1 = r0.getString(r1)
            com.alibaba.fastjson2.JSONWriter r2 = r0.jsonWriter
            r2.writeString(r1)
            return
        L161:
            java.lang.String r1 = r0.readString()
            int r2 = r0.readInt32Value()
            java.util.Map<java.lang.Integer, java.lang.String> r3 = r0.symbols
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.put(r4, r1)
            boolean r3 = r0.raw
            com.alibaba.fastjson2.JSONWriter r4 = r0.jsonWriter
            if (r3 == 0) goto L18e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r13)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r4.writeString(r1)
            return
        L18e:
            r4.writeString(r1)
            return
        L192:
            java.nio.charset.Charset r1 = com.alibaba.fastjson2.JSONBDump.GB18030
            if (r1 != 0) goto L19e
            java.lang.String r1 = "GB18030"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            com.alibaba.fastjson2.JSONBDump.GB18030 = r1
        L19e:
            int r1 = r0.readLength()
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r0.bytes
            int r4 = r0.offset
            java.nio.charset.Charset r5 = com.alibaba.fastjson2.JSONBDump.GB18030
            r2.<init>(r3, r4, r1, r5)
            int r3 = r0.offset
            int r3 = r3 + r1
            r0.offset = r3
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeString(r2)
            return
        L1b8:
            int r1 = r0.readLength()
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r0.bytes
            int r4 = r0.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_16BE
            r2.<init>(r3, r4, r1, r5)
            int r3 = r0.offset
            int r3 = r3 + r1
            r0.offset = r3
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeString(r2)
            return
        L1d2:
            int r1 = r0.readLength()
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r0.bytes
            int r4 = r0.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_16LE
            r2.<init>(r3, r4, r1, r5)
            int r3 = r0.offset
            int r3 = r3 + r1
            r0.offset = r3
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeString(r2)
            return
        L1ec:
            int r1 = r0.readLength()
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r0.bytes
            int r4 = r0.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_16
            r2.<init>(r3, r4, r1, r5)
            int r3 = r0.offset
            int r3 = r3 + r1
            r0.offset = r3
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeString(r2)
            return
        L206:
            int r1 = r0.readLength()
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r0.bytes
            int r4 = r0.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r3, r4, r1, r5)
            int r3 = r0.offset
            int r3 = r3 + r1
            r0.offset = r3
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeString(r2)
            return
        L220:
            int r4 = r1 + 4
            r4 = r2[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r1 + 3
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r10
            int r4 = r4 + r5
            int r5 = r1 + 2
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r9
            int r4 = r4 + r5
            r2 = r2[r3]
            int r2 = r2 << 24
            int r4 = r4 + r2
            int r1 = r1 + 5
            r0.offset = r1
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            long r2 = (long) r4
            r1.writeInt64(r2)
            return
        L246:
            com.alibaba.fastjson2.JSONWriter r4 = r0.jsonWriter
            int r1 = r1 + 2
            r0.offset = r1
            r1 = r2[r3]
            r4.writeInt8(r1)
            return
        L252:
            com.alibaba.fastjson2.JSONWriter r4 = r0.jsonWriter
            int r5 = r1 + 2
            r0.offset = r5
            r3 = r2[r3]
            int r3 = r3 << r10
            int r1 = r1 + 3
            r0.offset = r1
            r1 = r2[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r1
            short r1 = (short) r3
            r4.writeInt16(r1)
            return
        L269:
            int r1 = r0.readInt32Value()
            byte[] r2 = new byte[r1]
            byte[] r3 = r0.bytes
            int r4 = r0.offset
            java.lang.System.arraycopy(r3, r4, r2, r11, r1)
            int r3 = r0.offset
            int r3 = r3 + r1
            r0.offset = r3
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            r1.writeBigInt(r3)
            return
        L286:
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            long r2 = r0.readInt64Value()
            r1.writeInt64(r2)
            return
        L290:
            int r1 = r0.readInt32Value()
            byte[] r2 = r0.bytes
            int r3 = r0.offset
            int r4 = r3 + 1
            r0.offset = r4
            r12 = r2[r3]
            r13 = -70
            if (r12 == r13) goto L32e
            r13 = -66
            if (r12 == r13) goto L311
            if (r12 == r7) goto L307
            if (r12 < r15) goto L2b3
            if (r12 > r14) goto L2b3
            long r2 = (long) r12
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            goto L336
        L2b3:
            if (r12 < r8) goto L2ca
            if (r12 > r5) goto L2ca
            int r12 = r12 + (-56)
            int r5 = r12 << 8
            int r3 = r3 + 2
            r0.offset = r3
            r2 = r2[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r2
            long r2 = (long) r5
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            goto L336
        L2ca:
            r5 = 64
            if (r12 < r5) goto L2ef
            r5 = 71
            if (r12 > r5) goto L2ef
            int r12 = r12 + (-68)
            int r5 = r12 << 16
            int r7 = r3 + 2
            r0.offset = r7
            r4 = r2[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r10
            int r5 = r5 + r4
            int r3 = r3 + 3
            r0.offset = r3
            r2 = r2[r7]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r2
            long r2 = (long) r5
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            goto L336
        L2ef:
            int r2 = r0.readInt32Value()
            byte[] r3 = new byte[r2]
            byte[] r4 = r0.bytes
            int r5 = r0.offset
            java.lang.System.arraycopy(r4, r5, r3, r11, r2)
            int r4 = r0.offset
            int r4 = r4 + r2
            r0.offset = r4
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r3)
            goto L336
        L307:
            int r2 = r0.readInt32Value()
            long r2 = (long) r2
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            goto L336
        L311:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r7 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r4 = (long) r4
            long r7 = r7 + r4
            long r2 = r3.getLong(r2, r7)
            boolean r4 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r4 == 0) goto L320
            goto L324
        L320:
            long r2 = java.lang.Long.reverseBytes(r2)
        L324:
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            int r3 = r0.offset
            int r3 = r3 + r10
            r0.offset = r3
            goto L336
        L32e:
            long r2 = r0.readInt64Value()
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
        L336:
            if (r1 != 0) goto L33e
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r2)
            goto L344
        L33e:
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r2, r1)
            r1 = r3
        L344:
            com.alibaba.fastjson2.JSONWriter r2 = r0.jsonWriter
            r3 = 0
            r2.writeDecimal(r1, r3, r6)
            return
        L34c:
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            long r2 = r0.readInt64Value()
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r2)
            r3 = 0
            r1.writeDecimal(r2, r3, r6)
            return
        L35c:
            int r4 = r1 + 4
            r4 = r2[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r1 + 3
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r10
            int r4 = r4 + r5
            int r5 = r1 + 2
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r9
            int r4 = r4 + r5
            r2 = r2[r3]
            int r2 = r2 << 24
            int r4 = r4 + r2
            int r1 = r1 + 5
            r0.offset = r1
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            float r2 = java.lang.Float.intBitsToFloat(r4)
            r1.writeFloat(r2)
            return
        L385:
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            int r2 = r0.readInt32Value()
            float r2 = (float) r2
            r1.writeFloat(r2)
            return
        L390:
            int r4 = r1 + 8
            r4 = r2[r4]
            long r4 = (long) r4
            long r4 = r4 & r18
            int r6 = r1 + 7
            r6 = r2[r6]
            long r6 = (long) r6
            long r6 = r6 & r18
            long r6 = r6 << r10
            long r4 = r4 + r6
            int r6 = r1 + 6
            r6 = r2[r6]
            long r6 = (long) r6
            long r6 = r6 & r18
            long r6 = r6 << r9
            long r4 = r4 + r6
            int r6 = r1 + 5
            r6 = r2[r6]
            long r6 = (long) r6
            long r6 = r6 & r18
            long r6 = r6 << r17
            long r4 = r4 + r6
            int r6 = r1 + 4
            r6 = r2[r6]
            long r6 = (long) r6
            long r6 = r6 & r18
            r9 = 32
            long r6 = r6 << r9
            long r4 = r4 + r6
            int r6 = r1 + 3
            r6 = r2[r6]
            long r6 = (long) r6
            long r6 = r6 & r18
            r9 = 40
            long r6 = r6 << r9
            long r4 = r4 + r6
            int r6 = r1 + 2
            r6 = r2[r6]
            long r6 = (long) r6
            long r6 = r6 & r18
            long r6 = r6 << r8
            long r4 = r4 + r6
            r2 = r2[r3]
            long r2 = (long) r2
            long r2 = r2 << r16
            long r4 = r4 + r2
            int r1 = r1 + 9
            r0.offset = r1
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            double r2 = java.lang.Double.longBitsToDouble(r4)
            r1.writeDouble(r2)
            return
        L3e6:
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            long r2 = r0.readInt64Value()
            double r2 = (double) r2
            r1.writeDouble(r2)
            return
        L3f1:
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r1.writeDouble(r2)
            return
        L3f9:
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r2 = 0
            r1.writeDouble(r2)
            return
        L401:
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeBool(r12)
            return
        L407:
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeBool(r11)
            return
        L40d:
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeNull()
            return
        L413:
            long r1 = r0.readInt64Value()
            int r3 = r0.readInt32Value()
            com.alibaba.fastjson2.JSONWriter r4 = r0.jsonWriter
            r4.writeInstant(r1, r3)
            return
        L421:
            int r4 = r1 + 8
            r4 = r2[r4]
            long r4 = (long) r4
            long r4 = r4 & r18
            int r6 = r1 + 7
            r6 = r2[r6]
            long r6 = (long) r6
            long r6 = r6 & r18
            long r6 = r6 << r10
            long r4 = r4 + r6
            int r6 = r1 + 6
            r6 = r2[r6]
            long r6 = (long) r6
            long r6 = r6 & r18
            long r6 = r6 << r9
            long r4 = r4 + r6
            int r6 = r1 + 5
            r6 = r2[r6]
            long r6 = (long) r6
            long r6 = r6 & r18
            long r6 = r6 << r17
            long r4 = r4 + r6
            int r6 = r1 + 4
            r6 = r2[r6]
            long r6 = (long) r6
            long r6 = r6 & r18
            r9 = 32
            long r6 = r6 << r9
            long r4 = r4 + r6
            int r6 = r1 + 3
            r6 = r2[r6]
            long r6 = (long) r6
            long r6 = r6 & r18
            r9 = 40
            long r6 = r6 << r9
            long r4 = r4 + r6
            int r6 = r1 + 2
            r6 = r2[r6]
            long r6 = (long) r6
            long r6 = r6 & r18
            long r6 = r6 << r8
            long r4 = r4 + r6
            r2 = r2[r3]
            long r2 = (long) r2
            long r2 = r2 << r16
            long r4 = r4 + r2
            int r1 = r1 + 9
            r0.offset = r1
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeInt64(r4)
            return
        L473:
            r0.dumpReference()
            return
        L477:
            boolean r1 = r0.isInt()
            if (r1 == 0) goto L482
            int r1 = r0.readInt32Value()
            goto L493
        L482:
            java.lang.String r6 = r0.readString()
            int r1 = r0.readInt32Value()
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r0.symbols
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r6)
        L493:
            boolean r2 = r0.raw
            if (r2 != 0) goto L4ae
            byte[] r2 = r0.bytes
            int r3 = r0.offset
            r2 = r2[r3]
            if (r2 != r5) goto L4ae
            if (r6 != 0) goto L4a5
            java.lang.String r6 = r0.getString(r1)
        L4a5:
            int r1 = r0.offset
            int r1 = r1 + r12
            r0.offset = r1
            r0.dumpObject(r6)
            return
        L4ae:
            com.alibaba.fastjson2.JSONWriter r2 = r0.jsonWriter
            r2.startObject()
            com.alibaba.fastjson2.JSONWriter r2 = r0.jsonWriter
            java.lang.String r3 = "@type"
            r2.writeName(r3)
            com.alibaba.fastjson2.JSONWriter r2 = r0.jsonWriter
            r2.writeColon()
            if (r6 != 0) goto L4f8
            if (r1 >= 0) goto L4e6
            boolean r2 = r0.raw
            if (r2 == 0) goto L4d9
            com.alibaba.fastjson2.JSONWriter r2 = r0.jsonWriter
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r13)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.writeString(r1)
            goto L517
        L4d9:
            com.alibaba.fastjson2.SymbolTable r2 = r0.symbolTable
            int r1 = -r1
            java.lang.String r1 = r2.getName(r1)
            com.alibaba.fastjson2.JSONWriter r2 = r0.jsonWriter
            r2.writeString(r1)
            goto L517
        L4e6:
            com.alibaba.fastjson2.JSONWriter r2 = r0.jsonWriter
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r13)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.writeString(r1)
            goto L517
        L4f8:
            boolean r2 = r0.raw
            com.alibaba.fastjson2.JSONWriter r3 = r0.jsonWriter
            if (r2 == 0) goto L514
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r13)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r3.writeString(r1)
            goto L517
        L514:
            r3.writeString(r6)
        L517:
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            java.lang.String r2 = "@value"
            r1.writeName(r2)
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeColon()
            r0.dumpAny()
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.endObject()
            return
        L52c:
            int r1 = r0.readInt32Value()
            byte[] r2 = new byte[r1]
            byte[] r3 = r0.bytes
            int r4 = r0.offset
            java.lang.System.arraycopy(r3, r4, r2, r11, r1)
            int r3 = r0.offset
            int r3 = r3 + r1
            r0.offset = r3
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeBinary(r2)
            return
        L544:
            int r1 = r0.readInt32Value()
            com.alibaba.fastjson2.JSONWriter r2 = r0.jsonWriter
            char r1 = (char) r1
            r2.writeChar(r1)
            return
        L54f:
            int r4 = r1 + 2
            r0.offset = r4
            r3 = r2[r3]
            int r3 = r3 << r10
            int r5 = r1 + 3
            r0.offset = r5
            r4 = r2[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r4
            int r4 = r1 + 4
            r0.offset = r4
            r5 = r2[r5]
            int r1 = r1 + 5
            r0.offset = r1
            r1 = r2[r4]
            com.alibaba.fastjson2.JSONWriter r2 = r0.jsonWriter
            r2.writeDateYYYMMDD10(r3, r5, r1)
            return
        L571:
            int r4 = r1 + 2
            r0.offset = r4
            r3 = r2[r3]
            int r3 = r3 << r10
            int r5 = r1 + 3
            r0.offset = r5
            r4 = r2[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r11 = r3 + r4
            int r3 = r1 + 4
            r0.offset = r3
            r12 = r2[r5]
            int r4 = r1 + 5
            r0.offset = r4
            r13 = r2[r3]
            int r3 = r1 + 6
            r0.offset = r3
            r14 = r2[r4]
            int r4 = r1 + 7
            r0.offset = r4
            r15 = r2[r3]
            int r1 = r1 + r10
            r0.offset = r1
            r16 = r2[r4]
            int r17 = r0.readInt32Value()
            java.time.LocalDateTime r1 = java.time.LocalDateTime.of(r11, r12, r13, r14, r15, r16, r17)
            com.alibaba.fastjson2.JSONWriter r2 = r0.jsonWriter
            r2.writeLocalDateTime(r1)
            return
        L5ad:
            r17 = 24
        L5af:
            int r4 = r1 + 4
            r4 = r2[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r1 + 3
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r10
            int r4 = r4 + r5
            int r5 = r1 + 2
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r9
            int r4 = r4 + r5
            r2 = r2[r3]
            int r2 = r2 << 24
            int r4 = r4 + r2
            int r1 = r1 + 5
            r0.offset = r1
            com.alibaba.fastjson2.JSONWriter r1 = r0.jsonWriter
            r1.writeInt32(r4)
            return
        L5d4:
            r0.dumpObject(r6)
            return
    }

    private void dumpArray() {
            r3 = this;
            byte r0 = r3.type
            r1 = -92
            if (r0 != r1) goto Lb
            int r0 = r3.readLength()
            goto Ld
        Lb:
            int r0 = r0 + 108
        Ld:
            if (r0 != 0) goto L17
            com.alibaba.fastjson2.JSONWriter r0 = r3.jsonWriter
            java.lang.String r1 = "[]"
            r0.writeRaw(r1)
            return
        L17:
            r1 = 1
            if (r0 != r1) goto L48
            byte[] r1 = r3.bytes
            int r2 = r3.offset
            r1 = r1[r2]
            r3.type = r1
            boolean r1 = r3.isInt()
            if (r1 != 0) goto L36
            byte r1 = r3.type
            r2 = -81
            if (r1 == r2) goto L36
            r2 = 73
            if (r1 < r2) goto L48
            r2 = 120(0x78, float:1.68E-43)
            if (r1 > r2) goto L48
        L36:
            com.alibaba.fastjson2.JSONWriter r0 = r3.jsonWriter
            java.lang.String r1 = "["
            r0.writeRaw(r1)
            r3.dumpAny()
            com.alibaba.fastjson2.JSONWriter r0 = r3.jsonWriter
            java.lang.String r1 = "]"
            r0.writeRaw(r1)
            return
        L48:
            com.alibaba.fastjson2.JSONWriter r1 = r3.jsonWriter
            r1.startArray()
            r1 = 0
        L4e:
            if (r1 >= r0) goto L67
            if (r1 == 0) goto L57
            com.alibaba.fastjson2.JSONWriter r2 = r3.jsonWriter
            r2.writeComma()
        L57:
            boolean r2 = r3.isReference()
            if (r2 == 0) goto L61
            r3.dumpReference()
            goto L64
        L61:
            r3.dumpAny()
        L64:
            int r1 = r1 + 1
            goto L4e
        L67:
            com.alibaba.fastjson2.JSONWriter r0 = r3.jsonWriter
            r0.endArray()
            return
    }

    private void dumpObject(java.lang.String r7) {
            r6 = this;
            r0 = -91
            if (r7 == 0) goto L1b
            com.alibaba.fastjson2.JSONWriter r1 = r6.jsonWriter
            r1.startObject()
            com.alibaba.fastjson2.JSONWriter r1 = r6.jsonWriter
            java.lang.String r2 = "@type"
            r1.writeName(r2)
            com.alibaba.fastjson2.JSONWriter r1 = r6.jsonWriter
            r1.writeColon()
            com.alibaba.fastjson2.JSONWriter r1 = r6.jsonWriter
            r1.writeString(r7)
            goto L34
        L1b:
            byte[] r7 = r6.bytes
            int r1 = r6.offset
            r7 = r7[r1]
            com.alibaba.fastjson2.JSONWriter r1 = r6.jsonWriter
            if (r7 != r0) goto L31
            java.lang.String r7 = "{}"
            r1.writeRaw(r7)
            int r7 = r6.offset
            int r7 = r7 + 1
            r6.offset = r7
            return
        L31:
            r1.startObject()
        L34:
            r7 = 0
        L35:
            byte[] r1 = r6.bytes
            int r2 = r6.offset
            r1 = r1[r2]
            r3 = -109(0xffffffffffffff93, float:NaN)
            if (r1 == r3) goto L10b
            if (r1 == r0) goto L101
            r3 = 127(0x7f, float:1.78E-43)
            if (r1 == r3) goto L8c
            boolean r2 = r6.isString()
            if (r2 == 0) goto L56
            com.alibaba.fastjson2.JSONWriter r1 = r6.jsonWriter
            java.lang.String r2 = r6.readString()
            r1.writeName(r2)
            goto L10e
        L56:
            r2 = -16
            if (r1 < r2) goto L69
            r2 = 72
            if (r1 > r2) goto L69
            com.alibaba.fastjson2.JSONWriter r1 = r6.jsonWriter
            int r2 = r6.readInt32Value()
            r1.writeName(r2)
            goto L10e
        L69:
            r2 = -40
            if (r1 < r2) goto L71
            r2 = -17
            if (r1 <= r2) goto L75
        L71:
            r2 = -66
            if (r1 != r2) goto L80
        L75:
            com.alibaba.fastjson2.JSONWriter r1 = r6.jsonWriter
            long r2 = r6.readInt64Value()
            r1.writeName(r2)
            goto L10e
        L80:
            if (r7 == 0) goto L87
            com.alibaba.fastjson2.JSONWriter r1 = r6.jsonWriter
            r1.writeComma()
        L87:
            r6.dumpAny()
            goto L10e
        L8c:
            int r2 = r2 + 1
            r6.offset = r2
            boolean r1 = r6.isInt()
            java.lang.String r2 = "#"
            if (r1 == 0) goto Ld0
            int r1 = r6.readInt32Value()
            boolean r3 = r6.raw
            if (r3 == 0) goto Lb2
            com.alibaba.fastjson2.JSONWriter r3 = r6.jsonWriter
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.writeName(r1)
            goto L10e
        Lb2:
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r6.symbols
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Lc6
            com.alibaba.fastjson2.JSONWriter r1 = r6.jsonWriter
            r1.writeName(r2)
            goto L10e
        Lc6:
            java.lang.String r7 = "symbol not found "
            java.lang.String r7 = eh.a.l(r1, r7)
            ah.a.w(r7)
            return
        Ld0:
            java.lang.String r1 = r6.readString()
            int r3 = r6.readInt32Value()
            java.util.Map<java.lang.Integer, java.lang.String> r4 = r6.symbols
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4.put(r5, r1)
            boolean r4 = r6.raw
            com.alibaba.fastjson2.JSONWriter r5 = r6.jsonWriter
            if (r4 == 0) goto Lfd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r5.writeName(r1)
            goto L10e
        Lfd:
            r5.writeName(r1)
            goto L10e
        L101:
            int r2 = r2 + 1
            r6.offset = r2
            com.alibaba.fastjson2.JSONWriter r7 = r6.jsonWriter
            r7.endObject()
            return
        L10b:
            r6.dumpReference()
        L10e:
            int r7 = r7 + 1
            com.alibaba.fastjson2.JSONWriter r1 = r6.jsonWriter
            r1.writeColon()
            boolean r1 = r6.isReference()
            if (r1 == 0) goto L120
            r6.dumpReference()
            goto L35
        L120:
            r6.dumpAny()
            goto L35
    }

    private void dumpReference() {
            r2 = this;
            com.alibaba.fastjson2.JSONWriter r0 = r2.jsonWriter
            java.lang.String r1 = "{\"$ref\":"
            r0.writeRaw(r1)
            java.lang.String r0 = r2.readReference()
            com.alibaba.fastjson2.JSONWriter r1 = r2.jsonWriter
            r1.writeString(r0)
            java.lang.String r1 = "#-1"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1a
            r2.lastReference = r0
        L1a:
            com.alibaba.fastjson2.JSONWriter r0 = r2.jsonWriter
            java.lang.String r1 = "}"
            r0.writeRaw(r1)
            return
    }

    public java.lang.String getString(int r3) {
            r2 = this;
            if (r3 >= 0) goto La
            com.alibaba.fastjson2.SymbolTable r0 = r2.symbolTable
            int r1 = -r3
            java.lang.String r0 = r0.getName(r1)
            goto L16
        La:
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r2.symbols
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
        L16:
            if (r0 == 0) goto L19
            return r0
        L19:
            java.lang.String r0 = "symbol not found : "
            java.lang.String r3 = eh.a.l(r3, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public boolean isInt() {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.offset
            r0 = r0[r1]
            r1 = -70
            if (r0 < r1) goto Le
            r1 = 72
            if (r0 <= r1) goto L1d
        Le:
            r1 = -83
            if (r0 == r1) goto L1d
            r1 = -84
            if (r0 == r1) goto L1d
            r1 = -85
            if (r0 != r1) goto L1b
            goto L1d
        L1b:
            r0 = 0
            return r0
        L1d:
            r0 = 1
            return r0
    }

    public boolean isReference() {
            r3 = this;
            int r0 = r3.offset
            byte[] r1 = r3.bytes
            int r2 = r1.length
            if (r0 >= r2) goto Lf
            r0 = r1[r0]
            r1 = -109(0xffffffffffffff93, float:NaN)
            if (r0 != r1) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public boolean isString() {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.offset
            r0 = r0[r1]
            r1 = 73
            if (r0 < r1) goto L10
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 > r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public int readInt32Value() {
            r5 = this;
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            int r2 = r1 + 1
            r5.offset = r2
            r3 = r0[r1]
            r4 = -16
            if (r3 < r4) goto L13
            r4 = 47
            if (r3 > r4) goto L13
            return r3
        L13:
            r4 = 48
            if (r3 < r4) goto L29
            r4 = 63
            if (r3 > r4) goto L29
            int r3 = r3 + (-56)
            int r3 = r3 << 8
            int r1 = r1 + 2
            r5.offset = r1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            return r3
        L29:
            r4 = 64
            if (r3 < r4) goto L4a
            r4 = 71
            if (r3 > r4) goto L4a
            int r3 = r3 + (-68)
            int r3 = r3 << 16
            int r4 = r1 + 2
            r5.offset = r4
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r3 = r3 + r2
            int r1 = r1 + 3
            r5.offset = r1
            r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            return r3
        L4a:
            r4 = -84
            if (r3 == r4) goto L67
            r4 = -83
            if (r3 == r4) goto L67
            r4 = 72
            if (r3 != r4) goto L57
            goto L67
        L57:
            java.lang.String r0 = com.alibaba.fastjson2.JSONB.typeName(r3)
            int r1 = r5.offset
            byte[] r2 = r5.bytes
            int r2 = r2.length
            java.lang.String r3 = "readInt32Value not support "
            ah.a.l(r3, r1, r2, r0)
            r0 = 0
            return r0
        L67:
            int r3 = r1 + 4
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r1 + 3
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            int r3 = r3 + r4
            int r4 = r1 + 2
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            int r3 = r3 + r4
            r0 = r0[r2]
            int r0 = r0 << 24
            int r3 = r3 + r0
            int r1 = r1 + 5
            r5.offset = r1
            return r3
    }

    public long readInt64Value() {
            r16 = this;
            r0 = r16
            byte[] r1 = r0.bytes
            int r2 = r0.offset
            int r3 = r2 + 1
            r0.offset = r3
            r4 = r1[r2]
            r5 = -16
            if (r4 < r5) goto L16
            r5 = 47
            if (r4 > r5) goto L16
            long r1 = (long) r4
            return r1
        L16:
            r5 = 56
            r6 = 48
            r7 = 8
            if (r4 < r6) goto L2f
            r8 = 63
            if (r4 > r8) goto L2f
            int r4 = r4 - r5
            int r4 = r4 << r7
            int r2 = r2 + 2
            r0.offset = r2
            r1 = r1[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r1
            long r1 = (long) r4
            return r1
        L2f:
            r8 = 64
            r9 = 16
            if (r4 < r8) goto L51
            r8 = 71
            if (r4 > r8) goto L51
            int r4 = r4 + (-68)
            int r4 = r4 << r9
            int r5 = r2 + 2
            r0.offset = r5
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r7
            int r4 = r4 + r3
            int r2 = r2 + 3
            r0.offset = r2
            r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r1
            long r1 = (long) r4
            return r1
        L51:
            r8 = -40
            if (r4 < r8) goto L5f
            r10 = -17
            if (r4 > r10) goto L5f
            int r4 = r4 - r8
            long r1 = (long) r4
            r3 = -8
            long r1 = r1 + r3
            return r1
        L5f:
            r8 = -56
            if (r4 < r8) goto L75
            r8 = -41
            if (r4 > r8) goto L75
            int r4 = r4 + 48
            int r4 = r4 << r7
            int r2 = r2 + 2
            r0.offset = r2
            r1 = r1[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r1
            long r1 = (long) r4
            return r1
        L75:
            r8 = -64
            if (r4 < r8) goto L95
            r8 = -57
            if (r4 > r8) goto L95
            int r4 = r4 + 60
            int r4 = r4 << r9
            int r5 = r2 + 2
            r0.offset = r5
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r7
            int r4 = r4 + r3
            int r2 = r2 + 3
            r0.offset = r2
            r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r1
            long r1 = (long) r4
            return r1
        L95:
            r8 = -85
            r10 = 24
            if (r4 == r8) goto Leb
            r8 = 72
            if (r4 == r8) goto Lcb
            switch(r4) {
                case -68: goto Lbb;
                case -67: goto Lb3;
                case -66: goto Leb;
                case -65: goto Lcb;
                default: goto La2;
            }
        La2:
            java.lang.String r1 = com.alibaba.fastjson2.JSONB.typeName(r4)
            int r2 = r0.offset
            byte[] r3 = r0.bytes
            int r3 = r3.length
            java.lang.String r4 = "readInt64Value not support "
            ah.a.l(r4, r2, r3, r1)
            r1 = 0
            return r1
        Lb3:
            int r2 = r2 + 2
            r0.offset = r2
            r1 = r1[r3]
            long r1 = (long) r1
            return r1
        Lbb:
            int r4 = r2 + 2
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r1 = r1[r3]
            int r1 = r1 << r7
            int r4 = r4 + r1
            int r2 = r2 + 3
            r0.offset = r2
            long r1 = (long) r4
            return r1
        Lcb:
            int r4 = r2 + 4
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r2 + 3
            r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r7
            int r4 = r4 + r5
            int r5 = r2 + 2
            r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r9
            int r4 = r4 + r5
            r1 = r1[r3]
            int r1 = r1 << r10
            int r4 = r4 + r1
            int r2 = r2 + 5
            r0.offset = r2
            long r1 = (long) r4
            return r1
        Leb:
            int r4 = r2 + 8
            r4 = r1[r4]
            long r11 = (long) r4
            r13 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r13
            int r4 = r2 + 7
            r4 = r1[r4]
            r8 = r5
            r15 = r6
            long r5 = (long) r4
            long r4 = r5 & r13
            long r4 = r4 << r7
            long r11 = r11 + r4
            int r4 = r2 + 6
            r4 = r1[r4]
            long r4 = (long) r4
            long r4 = r4 & r13
            long r4 = r4 << r9
            long r11 = r11 + r4
            int r4 = r2 + 5
            r4 = r1[r4]
            long r4 = (long) r4
            long r4 = r4 & r13
            long r4 = r4 << r10
            long r11 = r11 + r4
            int r4 = r2 + 4
            r4 = r1[r4]
            long r4 = (long) r4
            long r4 = r4 & r13
            r6 = 32
            long r4 = r4 << r6
            long r11 = r11 + r4
            int r4 = r2 + 3
            r4 = r1[r4]
            long r4 = (long) r4
            long r4 = r4 & r13
            r6 = 40
            long r4 = r4 << r6
            long r11 = r11 + r4
            int r4 = r2 + 2
            r4 = r1[r4]
            long r4 = (long) r4
            long r4 = r4 & r13
            long r4 = r4 << r15
            long r11 = r11 + r4
            r1 = r1[r3]
            long r3 = (long) r1
            long r3 = r3 << r8
            long r11 = r11 + r3
            int r2 = r2 + 9
            r0.offset = r2
            return r11
    }

    public int readLength() {
            r5 = this;
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            int r2 = r1 + 1
            r5.offset = r2
            r3 = r0[r1]
            r4 = -16
            if (r3 < r4) goto L13
            r4 = 47
            if (r3 > r4) goto L13
            return r3
        L13:
            r4 = 64
            if (r3 < r4) goto L34
            r4 = 71
            if (r3 > r4) goto L34
            int r3 = r3 + (-68)
            int r3 = r3 << 16
            int r4 = r1 + 2
            r5.offset = r4
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r3 = r3 + r2
            int r1 = r1 + 3
            r5.offset = r1
            r0 = r0[r4]
        L30:
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            return r3
        L34:
            r4 = 48
            if (r3 < r4) goto L47
            r4 = 63
            if (r3 > r4) goto L47
            int r3 = r3 + (-56)
            int r3 = r3 << 8
            int r1 = r1 + 2
            r5.offset = r1
            r0 = r0[r2]
            goto L30
        L47:
            r4 = 72
            if (r3 != r4) goto L73
            int r3 = r1 + 2
            r5.offset = r3
            r2 = r0[r2]
            int r2 = r2 << 24
            int r4 = r1 + 3
            r5.offset = r4
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            int r2 = r2 + r3
            int r3 = r1 + 4
            r5.offset = r3
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            int r2 = r2 + r4
            int r1 = r1 + 5
            r5.offset = r1
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r0
            return r2
        L73:
            java.lang.String r0 = "not support length type : "
            java.lang.String r0 = eh.a.l(r3, r0)
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    public java.lang.String readReference() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            r0 = r0[r1]
            r2 = -109(0xffffffffffffff93, float:NaN)
            if (r0 == r2) goto Lc
            r0 = 0
            return r0
        Lc:
            int r1 = r1 + 1
            r3.offset = r1
            boolean r0 = r3.isString()
            if (r0 == 0) goto L1b
            java.lang.String r0 = r3.readString()
            return r0
        L1b:
            byte r0 = r3.type
            java.lang.String r0 = com.alibaba.fastjson2.JSONB.typeName(r0)
            java.lang.String r1 = "reference not support input "
            ah.a.i(r0, r1)
            r0 = 0
            return r0
    }

    public java.lang.String readString() {
            r5 = this;
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            int r2 = r1 + 1
            r5.offset = r2
            r0 = r0[r1]
            r5.strtype = r0
            r1 = -81
            if (r0 != r1) goto L12
            r0 = 0
            return r0
        L12:
            r5.strBegin = r2
            r1 = 73
            if (r0 < r1) goto L2f
            r2 = 121(0x79, float:1.7E-43)
            if (r0 > r2) goto L2f
            if (r0 != r2) goto L29
            int r0 = r5.readLength()
            r5.strlen = r0
            int r0 = r5.offset
            r5.strBegin = r0
            goto L2c
        L29:
            int r0 = r0 - r1
            r5.strlen = r0
        L2c:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            goto L72
        L2f:
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 != r1) goto L40
            int r0 = r5.readLength()
            r5.strlen = r0
            int r0 = r5.offset
            r5.strBegin = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            goto L72
        L40:
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L51
            int r0 = r5.readLength()
            r5.strlen = r0
            int r0 = r5.offset
            r5.strBegin = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            goto L72
        L51:
            r1 = 124(0x7c, float:1.74E-43)
            if (r0 != r1) goto L62
            int r0 = r5.readLength()
            r5.strlen = r0
            int r0 = r5.offset
            r5.strBegin = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            goto L72
        L62:
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 != r1) goto L8f
            int r0 = r5.readLength()
            r5.strlen = r0
            int r0 = r5.offset
            r5.strBegin = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
        L72:
            int r1 = r5.strlen
            if (r1 >= 0) goto L7e
            com.alibaba.fastjson2.SymbolTable r0 = r5.symbolTable
            int r1 = -r1
            java.lang.String r0 = r0.getName(r1)
            return r0
        L7e:
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r5.bytes
            int r4 = r5.offset
            r2.<init>(r3, r4, r1, r0)
            int r0 = r5.offset
            int r1 = r5.strlen
            int r0 = r0 + r1
            r5.offset = r0
            return r2
        L8f:
            byte r0 = r5.strtype
            java.lang.String r0 = com.alibaba.fastjson2.JSONB.typeName(r0)
            int r1 = r5.offset
            byte[] r2 = r5.bytes
            int r2 = r2.length
            java.lang.String r3 = "readString not support type "
            ah.a.l(r3, r1, r2, r0)
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            com.alibaba.fastjson2.JSONWriter r0 = r1.jsonWriter
            java.lang.String r0 = r0.toString()
            return r0
    }
}
