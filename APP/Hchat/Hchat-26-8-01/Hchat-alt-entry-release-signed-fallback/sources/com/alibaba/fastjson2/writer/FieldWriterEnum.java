package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterEnum extends com.alibaba.fastjson2.writer.FieldWriter {
    final java.lang.Enum[] enumConstants;
    final java.lang.Class enumType;
    final long[] hashCodes;
    final long[] hashCodesSymbolCache;
    final char[][] utf16ValueCache;
    final byte[][] utf8ValueCache;
    final char[][] valueNameCacheUTF16;
    final byte[][] valueNameCacheUTF8;

    public FieldWriterEnum(java.lang.String r1, int r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.reflect.Type r7, java.lang.Class<? extends java.lang.Enum> r8, java.lang.reflect.Field r9, java.lang.reflect.Method r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r1 = r0
            r1.enumType = r8
            java.lang.Object[] r2 = r8.getEnumConstants()
            java.lang.Enum[] r2 = (java.lang.Enum[]) r2
            r1.enumConstants = r2
            int r3 = r2.length
            long[] r3 = new long[r3]
            r1.hashCodes = r3
            int r2 = r2.length
            long[] r2 = new long[r2]
            r1.hashCodesSymbolCache = r2
            r2 = 0
        L19:
            java.lang.Enum[] r3 = r1.enumConstants
            int r4 = r3.length
            if (r2 >= r4) goto L2f
            long[] r4 = r1.hashCodes
            r3 = r3[r2]
            java.lang.String r3 = r3.name()
            long r5 = com.alibaba.fastjson2.util.Fnv.hashCode64(r3)
            r4[r2] = r5
            int r2 = r2 + 1
            goto L19
        L2f:
            int r2 = r3.length
            byte[][] r2 = new byte[r2][]
            r1.valueNameCacheUTF8 = r2
            int r2 = r3.length
            char[][] r2 = new char[r2][]
            r1.valueNameCacheUTF16 = r2
            int r2 = r3.length
            byte[][] r2 = new byte[r2][]
            r1.utf8ValueCache = r2
            int r2 = r3.length
            char[][] r2 = new char[r2][]
            r1.utf16ValueCache = r2
            return
    }

    private byte[] getBytes(int r4) {
            r3 = this;
            int r0 = com.alibaba.fastjson2.util.IOUtils.stringSize(r4)
            byte[] r1 = r3.nameWithColonUTF8
            int r2 = r1.length
            int r2 = r2 + r0
            byte[] r0 = java.util.Arrays.copyOf(r1, r2)
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            byte[] r1 = r3.nameWithColonUTF8
            int r1 = r1.length
            com.alibaba.fastjson2.util.IOUtils.writeInt32(r0, r1, r4)
            return r0
    }

    private char[] getChars(int r4) {
            r3 = this;
            int r0 = com.alibaba.fastjson2.util.IOUtils.stringSize(r4)
            char[] r1 = r3.nameWithColonUTF16
            int r2 = r1.length
            int r2 = r2 + r0
            char[] r0 = java.util.Arrays.copyOf(r1, r2)
            int r1 = r0.length
            char[] r0 = java.util.Arrays.copyOf(r0, r1)
            char[] r1 = r3.nameWithColonUTF16
            int r1 = r1.length
            com.alibaba.fastjson2.util.IOUtils.writeInt32(r0, r1, r4)
            return r0
    }

    private byte[] getNameBytes(int r8) {
            r7 = this;
            java.lang.Enum[] r0 = r7.enumConstants
            r8 = r0[r8]
            java.lang.String r8 = r8.name()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r8 = r8.getBytes(r0)
            byte[] r0 = r7.nameWithColonUTF8
            int r1 = r0.length
            int r2 = r8.length
            int r1 = r1 + r2
            int r1 = r1 + 2
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            byte[] r1 = r7.nameWithColonUTF8
            int r2 = r1.length
            r3 = 34
            r0[r2] = r3
            int r1 = r1.length
            int r1 = r1 + 1
            int r2 = r8.length
            r4 = 0
        L25:
            if (r4 >= r2) goto L31
            r5 = r8[r4]
            int r6 = r1 + 1
            r0[r1] = r5
            int r4 = r4 + 1
            r1 = r6
            goto L25
        L31:
            int r8 = r0.length
            int r8 = r8 + (-1)
            r0[r8] = r3
            return r0
    }

    private char[] getNameChars(int r6) {
            r5 = this;
            java.lang.Enum[] r0 = r5.enumConstants
            r6 = r0[r6]
            java.lang.String r6 = r6.name()
            char[] r0 = r5.nameWithColonUTF16
            int r1 = r0.length
            int r2 = r6.length()
            int r2 = r2 + r1
            int r2 = r2 + 2
            char[] r0 = java.util.Arrays.copyOf(r0, r2)
            char[] r1 = r5.nameWithColonUTF16
            int r1 = r1.length
            r2 = 34
            r0[r1] = r2
            int r1 = r6.length()
            char[] r3 = r5.nameWithColonUTF16
            int r3 = r3.length
            int r3 = r3 + 1
            r4 = 0
            r6.getChars(r4, r1, r0, r3)
            int r6 = r0.length
            int r6 = r6 + (-1)
            r0[r6] = r2
            return r0
    }

    private void writeJSONBToString(com.alibaba.fastjson2.JSONWriter r7, java.lang.Enum r8, com.alibaba.fastjson2.SymbolTable r9) {
            r6 = this;
            r0 = -1
            if (r9 == 0) goto L34
            int r1 = java.lang.System.identityHashCode(r9)
            long r2 = r6.nameSymbolCache
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 32
            if (r4 != 0) goto L1f
            long r2 = r6.hashCode
            int r9 = r9.getOrdinalByHashCode(r2)
            long r2 = (long) r9
            long r2 = r2 << r5
            long r4 = (long) r1
            long r1 = r2 | r4
            r6.nameSymbolCache = r1
            goto L35
        L1f:
            int r4 = (int) r2
            if (r4 != r1) goto L26
            long r1 = r2 >> r5
            int r9 = (int) r1
            goto L35
        L26:
            long r2 = r6.hashCode
            int r9 = r9.getOrdinalByHashCode(r2)
            long r2 = (long) r9
            long r2 = r2 << r5
            long r4 = (long) r1
            long r1 = r2 | r4
            r6.nameSymbolCache = r1
            goto L35
        L34:
            r9 = r0
        L35:
            if (r9 == r0) goto L3c
            int r9 = -r9
            r7.writeSymbol(r9)
            goto L43
        L3c:
            byte[] r9 = r6.nameJSONB
            long r0 = r6.hashCode
            r7.writeNameRaw(r9, r0)
        L43:
            java.lang.String r8 = r8.toString()
            r7.writeString(r8)
            return
    }

    private boolean writeSymbolNameOrdinal(com.alibaba.fastjson2.JSONWriter r12, int r13, com.alibaba.fastjson2.SymbolTable r14) {
            r11 = this;
            int r0 = java.lang.System.identityHashCode(r14)
            long[] r1 = r11.hashCodesSymbolCache
            r2 = r1[r13]
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 32
            if (r1 != 0) goto L21
            long[] r1 = r11.hashCodes
            r2 = r1[r13]
            int r1 = r14.getOrdinalByHashCode(r2)
            long[] r2 = r11.hashCodesSymbolCache
            long r7 = (long) r1
            long r7 = r7 << r6
            long r9 = (long) r0
            long r7 = r7 | r9
            r2[r13] = r7
            goto L38
        L21:
            int r1 = (int) r2
            if (r1 != r0) goto L28
            long r1 = r2 >> r6
            int r1 = (int) r1
            goto L38
        L28:
            long[] r1 = r11.hashCodes
            r2 = r1[r13]
            int r1 = r14.getOrdinalByHashCode(r2)
            long[] r2 = r11.hashCodesSymbolCache
            long r7 = (long) r1
            long r7 = r7 << r6
            long r9 = (long) r0
            long r7 = r7 | r9
            r2[r13] = r7
        L38:
            if (r1 < 0) goto L7c
            long r2 = r11.nameSymbolCache
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r4 = -1
            if (r13 != 0) goto L50
            long r2 = r11.hashCode
            int r13 = r14.getOrdinalByHashCode(r2)
            if (r13 == r4) goto L63
            long r2 = (long) r13
            long r2 = r2 << r6
            long r5 = (long) r0
            long r2 = r2 | r5
            r11.nameSymbolCache = r2
            goto L63
        L50:
            int r13 = (int) r2
            if (r13 != r0) goto L57
            long r13 = r2 >> r6
            int r13 = (int) r13
            goto L63
        L57:
            long r2 = r11.hashCode
            int r13 = r14.getOrdinalByHashCode(r2)
            long r2 = (long) r13
            long r2 = r2 << r6
            long r5 = (long) r0
            long r2 = r2 | r5
            r11.nameSymbolCache = r2
        L63:
            if (r13 == r4) goto L6a
            int r13 = -r13
            r12.writeSymbol(r13)
            goto L71
        L6a:
            byte[] r13 = r11.nameJSONB
            long r2 = r11.hashCode
            r12.writeNameRaw(r13, r2)
        L71:
            r13 = 121(0x79, float:1.7E-43)
            r12.writeRaw(r13)
            int r13 = -r1
            r12.writeInt32(r13)
            r12 = 1
            return r12
        L7c:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Object r7 = r5.getFieldValue(r7)
            java.lang.Enum r7 = (java.lang.Enum) r7
            r0 = 1
            if (r7 != 0) goto L24
            long r1 = r5.features
            long r3 = r6.getFeatures()
            long r1 = r1 | r3
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r3 = r7.mask
            long r1 = r1 & r3
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L22
            r5.writeFieldName(r6)
            r6.writeNull()
            return r0
        L22:
            r6 = 0
            return r6
        L24:
            boolean r1 = r6.jsonb
            if (r1 == 0) goto L2c
            r5.writeEnumJSONB(r6, r7)
            goto L2f
        L2c:
            r5.writeEnum(r6, r7)
        L2f:
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeEnum(com.alibaba.fastjson2.JSONWriter r11, java.lang.Enum r12) {
            r10 = this;
            long r0 = r10.features
            long r0 = r11.getFeatures(r0)
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingToString
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L90
            boolean r2 = r11.jsonb
            if (r2 == 0) goto L19
            r10.writeEnumJSONB(r11, r12)
            return
        L19:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.UnquoteFieldName
            long r2 = r2.mask
            long r2 = r2 & r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r6 = 1
            if (r2 == 0) goto L26
            r2 = r6
            goto L27
        L26:
            r2 = r3
        L27:
            boolean r7 = r11.utf8
            if (r7 != 0) goto L30
            boolean r8 = r11.utf16
            if (r8 == 0) goto L30
            r3 = r6
        L30:
            int r6 = r12.ordinal()
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingOrdinal
            long r8 = r8.mask
            long r0 = r0 & r8
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L6a
            if (r2 != 0) goto L63
            if (r7 == 0) goto L51
            byte[][] r12 = r10.utf8ValueCache
            r0 = r12[r6]
            if (r0 != 0) goto L4d
            byte[] r0 = r10.getBytes(r6)
            r12[r6] = r0
        L4d:
            r11.writeNameRaw(r0)
            return
        L51:
            if (r3 == 0) goto L63
            char[][] r12 = r10.utf16ValueCache
            r0 = r12[r6]
            if (r0 != 0) goto L5f
            char[] r0 = r10.getChars(r6)
            r12[r6] = r0
        L5f:
            r11.writeNameRaw(r0)
            return
        L63:
            r10.writeFieldName(r11)
            r11.writeInt32(r6)
            return
        L6a:
            if (r2 != 0) goto L90
            if (r7 == 0) goto L7e
            byte[][] r12 = r10.valueNameCacheUTF8
            r0 = r12[r6]
            if (r0 != 0) goto L7a
            byte[] r0 = r10.getNameBytes(r6)
            r12[r6] = r0
        L7a:
            r11.writeNameRaw(r0)
            return
        L7e:
            if (r3 == 0) goto L90
            char[][] r12 = r10.valueNameCacheUTF16
            r0 = r12[r6]
            if (r0 != 0) goto L8c
            char[] r0 = r10.getNameChars(r6)
            r12[r6] = r0
        L8c:
            r11.writeNameRaw(r0)
            return
        L90:
            r10.writeFieldName(r11)
            java.lang.String r12 = r12.toString()
            r11.writeString(r12)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeEnumJSONB(com.alibaba.fastjson2.JSONWriter r10, java.lang.Enum r11) {
            r9 = this;
            if (r11 != 0) goto L3
            goto L36
        L3:
            long r0 = r9.features
            long r0 = r10.getFeatures(r0)
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingToString
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumsUsingName
            long r4 = r4.mask
            long r4 = r4 | r2
            long r4 = r4 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            r8 = 1
            if (r4 != 0) goto L1d
            r4 = r8
            goto L1e
        L1d:
            r4 = r5
        L1e:
            long r0 = r0 & r2
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L24
            r5 = r8
        L24:
            int r0 = r11.ordinal()
            com.alibaba.fastjson2.SymbolTable r1 = r10.symbolTable
            if (r1 == 0) goto L37
            if (r4 == 0) goto L37
            if (r5 != 0) goto L37
            boolean r2 = r9.writeSymbolNameOrdinal(r10, r0, r1)
            if (r2 == 0) goto L37
        L36:
            return
        L37:
            if (r5 == 0) goto L3d
            r9.writeJSONBToString(r10, r11, r1)
            return
        L3d:
            if (r4 == 0) goto L84
            r11 = -1
            if (r1 == 0) goto L71
            int r2 = java.lang.System.identityHashCode(r1)
            long r3 = r9.nameSymbolCache
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            r6 = 32
            if (r5 != 0) goto L5c
            long r3 = r9.hashCode
            int r1 = r1.getOrdinalByHashCode(r3)
            long r3 = (long) r1
            long r3 = r3 << r6
            long r5 = (long) r2
            long r2 = r3 | r5
            r9.nameSymbolCache = r2
            goto L72
        L5c:
            int r5 = (int) r3
            if (r5 != r2) goto L63
            long r1 = r3 >> r6
            int r1 = (int) r1
            goto L72
        L63:
            long r3 = r9.hashCode
            int r1 = r1.getOrdinalByHashCode(r3)
            long r3 = (long) r1
            long r3 = r3 << r6
            long r5 = (long) r2
            long r2 = r3 | r5
            r9.nameSymbolCache = r2
            goto L72
        L71:
            r1 = r11
        L72:
            if (r1 == r11) goto L79
            int r11 = -r1
            r10.writeSymbol(r11)
            goto L80
        L79:
            byte[] r11 = r9.nameJSONB
            long r1 = r9.hashCode
            r10.writeNameRaw(r11, r1)
        L80:
            r10.writeInt32(r0)
            return
        L84:
            r9.writeFieldName(r10)
            java.lang.String r11 = r11.name()
            r10.writeString(r11)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeValue(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r2 = r0.getFieldValue(r2)
            java.lang.Enum r2 = (java.lang.Enum) r2
            r1.writeEnum(r2)
            return
    }
}
