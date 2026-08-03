package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterBoolean extends com.alibaba.fastjson2.writer.FieldWriter {
    final char[] utf16Value0;
    final char[] utf16Value1;
    final char[] utf16ValueFalse;
    final char[] utf16ValueTrue;
    final byte[] utf8Value0;
    final byte[] utf8Value1;
    final byte[] utf8ValueFalse;
    final byte[] utf8ValueTrue;

    public FieldWriterBoolean(java.lang.String r5, int r6, long r7, java.lang.String r9, java.lang.String r10, java.lang.reflect.Type r11, java.lang.Class r12, java.lang.reflect.Field r13, java.lang.reflect.Method r14) {
            r4 = this;
            r4.<init>(r5, r6, r7, r9, r10, r11, r12, r13, r14)
            r5 = r4
            byte[] r6 = r5.nameWithColonUTF8
            int r7 = r6.length
            int r7 = r7 + 4
            byte[] r6 = java.util.Arrays.copyOf(r6, r7)
            byte[] r7 = r5.nameWithColonUTF8
            int r8 = r7.length
            r9 = 116(0x74, float:1.63E-43)
            r6[r8] = r9
            int r8 = r7.length
            int r8 = r8 + 1
            r10 = 114(0x72, float:1.6E-43)
            r6[r8] = r10
            int r8 = r7.length
            int r8 = r8 + 2
            r11 = 117(0x75, float:1.64E-43)
            r6[r8] = r11
            int r8 = r7.length
            int r8 = r8 + 3
            r12 = 101(0x65, float:1.42E-43)
            r6[r8] = r12
            r5.utf8ValueTrue = r6
            int r6 = r7.length
            int r6 = r6 + 5
            byte[] r6 = java.util.Arrays.copyOf(r7, r6)
            byte[] r7 = r5.nameWithColonUTF8
            int r8 = r7.length
            r13 = 102(0x66, float:1.43E-43)
            r6[r8] = r13
            int r8 = r7.length
            int r8 = r8 + 1
            r14 = 97
            r6[r8] = r14
            int r8 = r7.length
            int r8 = r8 + 2
            r0 = 108(0x6c, float:1.51E-43)
            r6[r8] = r0
            int r8 = r7.length
            int r8 = r8 + 3
            r1 = 115(0x73, float:1.61E-43)
            r6[r8] = r1
            int r8 = r7.length
            int r8 = r8 + 4
            r6[r8] = r12
            r5.utf8ValueFalse = r6
            int r6 = r7.length
            int r6 = r6 + 1
            byte[] r6 = java.util.Arrays.copyOf(r7, r6)
            byte[] r7 = r5.nameWithColonUTF8
            int r8 = r7.length
            r2 = 49
            r6[r8] = r2
            r5.utf8Value1 = r6
            int r6 = r7.length
            int r6 = r6 + 1
            byte[] r6 = java.util.Arrays.copyOf(r7, r6)
            byte[] r7 = r5.nameWithColonUTF8
            int r7 = r7.length
            r8 = 48
            r6[r7] = r8
            r5.utf8Value0 = r6
            char[] r6 = r5.nameWithColonUTF16
            int r7 = r6.length
            int r7 = r7 + 4
            char[] r6 = java.util.Arrays.copyOf(r6, r7)
            char[] r7 = r5.nameWithColonUTF16
            int r3 = r7.length
            r6[r3] = r9
            int r9 = r7.length
            int r9 = r9 + 1
            r6[r9] = r10
            int r9 = r7.length
            int r9 = r9 + 2
            r6[r9] = r11
            int r9 = r7.length
            int r9 = r9 + 3
            r6[r9] = r12
            r5.utf16ValueTrue = r6
            int r6 = r7.length
            int r6 = r6 + 5
            char[] r6 = java.util.Arrays.copyOf(r7, r6)
            char[] r7 = r5.nameWithColonUTF16
            int r9 = r7.length
            r6[r9] = r13
            int r9 = r7.length
            int r9 = r9 + 1
            r6[r9] = r14
            int r9 = r7.length
            int r9 = r9 + 2
            r6[r9] = r0
            int r9 = r7.length
            int r9 = r9 + 3
            r6[r9] = r1
            int r9 = r7.length
            int r9 = r9 + 4
            r6[r9] = r12
            r5.utf16ValueFalse = r6
            int r6 = r7.length
            int r6 = r6 + 1
            char[] r6 = java.util.Arrays.copyOf(r7, r6)
            char[] r7 = r5.nameWithColonUTF16
            int r9 = r7.length
            r6[r9] = r2
            r5.utf16Value1 = r6
            int r6 = r7.length
            int r6 = r6 + 1
            char[] r6 = java.util.Arrays.copyOf(r7, r6)
            char[] r7 = r5.nameWithColonUTF16
            int r7 = r7.length
            r6[r7] = r8
            r5.utf16Value0 = r6
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(com.alibaba.fastjson2.JSONWriter r1, java.lang.Class r2) {
            r0 = this;
            com.alibaba.fastjson2.writer.ObjectWriterImplBoolean r1 = com.alibaba.fastjson2.writer.ObjectWriterImplBoolean.INSTANCE
            return r1
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r11, java.lang.Object r12) {
            r10 = this;
            r0 = 0
            java.lang.Object r12 = r10.getFieldValue(r12)     // Catch: java.lang.RuntimeException -> L5d
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.RuntimeException -> L5d
            r1 = 1
            r2 = 0
            if (r12 != 0) goto L39
            long r4 = r10.features
            long r6 = r11.getFeatures()
            long r4 = r4 | r6
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r6 = r12.mask
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r8 = r12.mask
            long r6 = r6 | r8
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullBooleanAsFalse
            long r8 = r12.mask
            long r6 = r6 | r8
            long r6 = r6 & r4
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 != 0) goto L27
            return r0
        L27:
            r10.writeFieldName(r11)
            long r6 = r12.mask
            long r4 = r4 & r6
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 == 0) goto L35
            r11.writeBool(r0)
            goto L38
        L35:
            r11.writeBooleanNull()
        L38:
            return r1
        L39:
            java.lang.Class r4 = r10.fieldClass
            java.lang.Class r5 = java.lang.Boolean.TYPE
            if (r4 != r5) goto L55
            boolean r4 = r12.booleanValue()
            if (r4 != 0) goto L55
            long r4 = r10.features
            long r4 = r11.getFeatures(r4)
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteDefaultValue
            long r6 = r6.mask
            long r4 = r4 & r6
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L55
            return r0
        L55:
            boolean r12 = r12.booleanValue()
            r10.writeBool(r11, r12)
            return r1
        L5d:
            r12 = move-exception
            boolean r11 = r11.isIgnoreErrorGetter()
            if (r11 == 0) goto L65
            return r0
        L65:
            throw r12
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeBool(com.alibaba.fastjson2.JSONWriter r7, boolean r8) {
            r6 = this;
            long r0 = r6.features
            long r0 = r7.getFeatures(r0)
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1f
            r6.writeFieldName(r7)
            if (r8 == 0) goto L19
            java.lang.String r8 = "true"
            goto L1b
        L19:
            java.lang.String r8 = "false"
        L1b:
            r7.writeString(r8)
            return
        L1f:
            boolean r2 = r7.utf8
            if (r2 == 0) goto L3f
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteBooleanAsNumber
            long r2 = r2.mask
            long r0 = r0 & r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L34
            if (r8 == 0) goto L31
            byte[] r8 = r6.utf8Value1
            goto L3b
        L31:
            byte[] r8 = r6.utf8Value0
            goto L3b
        L34:
            if (r8 == 0) goto L39
            byte[] r8 = r6.utf8ValueTrue
            goto L3b
        L39:
            byte[] r8 = r6.utf8ValueFalse
        L3b:
            r7.writeNameRaw(r8)
            return
        L3f:
            boolean r2 = r7.utf16
            if (r2 == 0) goto L5f
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteBooleanAsNumber
            long r2 = r2.mask
            long r0 = r0 & r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L54
            if (r8 == 0) goto L51
            char[] r8 = r6.utf16Value1
            goto L5b
        L51:
            char[] r8 = r6.utf16Value0
            goto L5b
        L54:
            if (r8 == 0) goto L59
            char[] r8 = r6.utf16ValueTrue
            goto L5b
        L59:
            char[] r8 = r6.utf16ValueFalse
        L5b:
            r7.writeNameRaw(r8)
            return
        L5f:
            r6.writeFieldName(r7)
            r7.writeBool(r8)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r2 = r0.getFieldValue(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto Lc
            r1.writeNull()
            return
        Lc:
            boolean r2 = r2.booleanValue()
            r1.writeBool(r2)
            return
    }
}
