package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONWriterUTF8 extends com.alibaba.fastjson2.JSONWriter {
    protected byte[] bytes;
    final com.alibaba.fastjson2.JSONFactory.CacheItem cacheItem;

    public JSONWriterUTF8(com.alibaba.fastjson2.JSONWriter.Context r4) {
            r3 = this;
            r0 = 0
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r2 = 0
            r3.<init>(r4, r2, r0, r1)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            int r4 = java.lang.System.identityHashCode(r4)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r0 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r1 = r0.length
            int r1 = r1 + (-1)
            r4 = r4 & r1
            r4 = r0[r4]
            r3.cacheItem = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r0 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            java.lang.Object r4 = r0.getAndSet(r4, r2)
            byte[] r4 = (byte[]) r4
            if (r4 != 0) goto L27
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]
        L27:
            r3.bytes = r4
            return
    }

    private byte[] grow(int r1) {
            r0 = this;
            r0.grow0(r1)
            byte[] r1 = r0.bytes
            return r1
    }

    private void grow0(int r3) {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r0.length
            int r3 = r2.newCapacity(r3, r1)
            byte[] r3 = java.util.Arrays.copyOf(r0, r3)
            r2.bytes = r3
            return
    }

    private int indent(byte[] r4, int r5) {
            r3 = this;
            r0 = 10
            r4[r5] = r0
            r0 = 1
            int r5 = r5 + r0
            byte r1 = r3.pretty
            int r2 = r3.level
            int r2 = r2 * r1
            int r2 = r2 + r5
            if (r1 != r0) goto L11
            r0 = 9
            goto L13
        L11:
            r0 = 32
        L13:
            java.util.Arrays.fill(r4, r5, r2, r0)
            return r2
    }

    private void writeQuote() {
            r3 = this;
            int r0 = r3.off
            byte[] r1 = r3.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
        Lc:
            byte[] r0 = r3.bytes
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            char r2 = r3.quote
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r0.length
            r2 = 1048576(0x100000, float:1.469368E-39)
            if (r1 <= r2) goto L8
            return
        L8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r1 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r2 = r3.cacheItem
            r1.lazySet(r2, r0)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void endArray() {
            r5 = this;
            int r0 = r5.level
            int r0 = r0 + (-1)
            r5.level = r0
            int r1 = r5.off
            int r2 = r1 + 1
            byte r3 = r5.pretty
            r4 = 0
            if (r3 != 0) goto L11
            r3 = r4
            goto L14
        L11:
            int r3 = r3 * r0
            int r3 = r3 + 1
        L14:
            int r2 = r2 + r3
            byte[] r0 = r5.bytes
            int r3 = r0.length
            if (r2 <= r3) goto L1e
            byte[] r0 = r5.grow(r2)
        L1e:
            byte r2 = r5.pretty
            if (r2 == 0) goto L26
            int r1 = r5.indent(r0, r1)
        L26:
            r2 = 93
            r0[r1] = r2
            int r1 = r1 + 1
            r5.off = r1
            r5.startObject = r4
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void endObject() {
            r5 = this;
            int r0 = r5.level
            int r0 = r0 + (-1)
            r5.level = r0
            int r1 = r5.off
            int r2 = r1 + 1
            byte r3 = r5.pretty
            r4 = 0
            if (r3 != 0) goto L11
            r3 = r4
            goto L14
        L11:
            int r3 = r3 * r0
            int r3 = r3 + 1
        L14:
            int r2 = r2 + r3
            byte[] r0 = r5.bytes
            int r3 = r0.length
            if (r2 <= r3) goto L1e
            byte[] r0 = r5.grow(r2)
        L1e:
            byte r2 = r5.pretty
            if (r2 == 0) goto L26
            int r1 = r5.indent(r0, r1)
        L26:
            r2 = 125(0x7d, float:1.75E-43)
            r0[r1] = r2
            int r1 = r1 + 1
            r5.off = r1
            r5.startObject = r4
            return
    }

    public void ensureCapacity(int r2) {
            r1 = this;
            byte[] r0 = r1.bytes
            int r0 = r0.length
            if (r2 <= r0) goto L8
            r1.grow0(r2)
        L8:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public int flushTo(java.io.OutputStream r4) {
            r3 = this;
            int r0 = r3.off
            if (r0 <= 0) goto Lc
            byte[] r1 = r3.bytes
            r2 = 0
            r4.write(r1, r2, r0)
            r3.off = r2
        Lc:
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public int flushTo(java.io.OutputStream r5, java.nio.charset.Charset r6) {
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L38
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            if (r6 == r1) goto L38
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            if (r6 != r1) goto Lc
            goto L38
        Lc:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            if (r6 != r1) goto L26
            r1 = r0
        L11:
            byte[] r2 = r4.bytes
            int r3 = r2.length
            if (r1 >= r3) goto L1e
            r2 = r2[r1]
            if (r2 >= 0) goto L1b
            goto L26
        L1b:
            int r1 = r1 + 1
            goto L11
        L1e:
            int r6 = r4.off
            r5.write(r2, r0, r6)
            r4.off = r0
            return r6
        L26:
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r4.bytes
            int r3 = r4.off
            r1.<init>(r2, r0, r3)
            byte[] r6 = r1.getBytes(r6)
            r5.write(r6)
            int r5 = r6.length
            return r5
        L38:
            int r6 = r4.off
            byte[] r1 = r4.bytes
            r5.write(r1, r0, r6)
            r4.off = r0
            return r6
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] getBytes() {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.off
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] getBytes(java.nio.charset.Charset r2) {
            r1 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            if (r2 != r0) goto Ld
            byte[] r2 = r1.bytes
            int r0 = r1.off
            byte[] r2 = java.util.Arrays.copyOf(r2, r0)
            return r2
        Ld:
            java.lang.String r0 = r1.toString()
            byte[] r2 = r0.getBytes(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public int size() {
            r1 = this;
            int r0 = r1.off
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void startArray() {
            r4 = this;
            int r0 = r4.level
            int r0 = r0 + 1
            r4.level = r0
            com.alibaba.fastjson2.JSONWriter$Context r1 = r4.context
            int r1 = r1.maxLevel
            if (r0 <= r1) goto Lf
            r4.overflowLevel()
        Lf:
            int r0 = r4.off
            int r1 = r0 + 3
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r4.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L22
            byte[] r1 = r4.grow(r2)
        L22:
            int r2 = r0 + 1
            r3 = 91
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L30
            int r2 = r4.indent(r1, r2)
        L30:
            r4.off = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void startObject() {
            r4 = this;
            int r0 = r4.level
            r1 = 1
            int r0 = r0 + r1
            r4.level = r0
            com.alibaba.fastjson2.JSONWriter$Context r2 = r4.context
            int r2 = r2.maxLevel
            if (r0 <= r2) goto Lf
            r4.overflowLevel()
        Lf:
            r4.startObject = r1
            int r0 = r4.off
            int r1 = r0 + 3
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r4.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L24
            byte[] r1 = r4.grow(r2)
        L24:
            int r2 = r0 + 1
            r3 = 123(0x7b, float:1.72E-43)
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L32
            int r2 = r4.indent(r1, r2)
        L32:
            r4.off = r2
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r5.bytes
            int r2 = r5.off
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r4 = 0
            r0.<init>(r1, r4, r2, r3)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void write(com.alibaba.fastjson2.JSONObject r14) {
            r13 = this;
            byte r0 = r13.pretty
            if (r0 == 0) goto L8
            super.write(r14)
            return
        L8:
            if (r14 != 0) goto Le
            r13.writeNull()
            return
        Le:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r13.context
            long r2 = r0.features
            long r4 = com.alibaba.fastjson2.JSONWriter.NONE_DIRECT_FEATURES
            long r2 = r2 & r4
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L2d
            java.lang.Class r2 = r14.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r0.getObjectWriter(r2)
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r13
            r2 = r14
            r0.write(r1, r2, r3, r4, r5)
            return
        L2d:
            int r0 = r13.off
            byte[] r2 = r13.bytes
            int r2 = r2.length
            r9 = 1
            if (r0 != r2) goto L39
            int r0 = r0 + r9
            r13.grow(r0)
        L39:
            byte[] r0 = r13.bytes
            int r2 = r13.off
            int r3 = r2 + 1
            r13.off = r3
            r3 = 123(0x7b, float:1.72E-43)
            r0[r2] = r3
            java.util.Set r0 = r14.entrySet()
            java.util.Iterator r10 = r0.iterator()
            r0 = r9
        L4e:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L118
            java.lang.Object r2 = r10.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r3 = r2
            java.lang.Object r2 = r3.getValue()
            if (r2 != 0) goto L6f
            com.alibaba.fastjson2.JSONWriter$Context r4 = r13.context
            long r4 = r4.features
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.WriteMapNullValue
            long r11 = r6.mask
            long r4 = r4 & r11
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L6f
            goto L4e
        L6f:
            if (r0 != 0) goto L89
            int r0 = r13.off
            byte[] r4 = r13.bytes
            int r4 = r4.length
            if (r0 != r4) goto L7d
            int r0 = r0 + 1
            r13.ensureCapacity(r0)
        L7d:
            byte[] r0 = r13.bytes
            int r4 = r13.off
            int r5 = r4 + 1
            r13.off = r5
            r5 = 44
            r0[r4] = r5
        L89:
            java.lang.Object r0 = r3.getKey()
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L97
            java.lang.String r0 = (java.lang.String) r0
            r13.writeString(r0)
            goto L9a
        L97:
            r13.writeAny(r0)
        L9a:
            int r0 = r13.off
            byte[] r3 = r13.bytes
            int r3 = r3.length
            if (r0 != r3) goto La6
            int r0 = r0 + 1
            r13.ensureCapacity(r0)
        La6:
            byte[] r0 = r13.bytes
            int r3 = r13.off
            int r4 = r3 + 1
            r13.off = r4
            r4 = 58
            r0[r3] = r4
            if (r2 != 0) goto Lb8
            r13.writeNull()
            goto L115
        Lb8:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r0 != r3) goto Lc6
            java.lang.String r2 = (java.lang.String) r2
            r13.writeString(r2)
            goto L115
        Lc6:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r0 != r3) goto Ld0
            java.lang.Integer r2 = (java.lang.Integer) r2
            r13.writeInt32(r2)
            goto L115
        Ld0:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r0 != r3) goto Lda
            java.lang.Long r2 = (java.lang.Long) r2
            r13.writeInt64(r2)
            goto L115
        Lda:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r0 != r3) goto Le8
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            r13.writeBool(r0)
            goto L115
        Le8:
            java.lang.Class<java.math.BigDecimal> r3 = java.math.BigDecimal.class
            if (r0 != r3) goto Lf3
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            r0 = 0
            r13.writeDecimal(r2, r7, r0)
            goto L115
        Lf3:
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r3 = com.alibaba.fastjson2.JSONArray.class
            if (r0 != r3) goto Lfd
            com.alibaba.fastjson2.JSONArray r2 = (com.alibaba.fastjson2.JSONArray) r2
            r13.write(r2)
            goto L115
        Lfd:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r3 = com.alibaba.fastjson2.JSONObject.class
            if (r0 != r3) goto L107
            com.alibaba.fastjson2.JSONObject r2 = (com.alibaba.fastjson2.JSONObject) r2
            r13.write(r2)
            goto L115
        L107:
            com.alibaba.fastjson2.JSONWriter$Context r3 = r13.context
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r3.getObjectWriter(r0, r0)
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r13
            r0.write(r1, r2, r3, r4, r5)
        L115:
            r0 = 0
            goto L4e
        L118:
            int r0 = r13.off
            byte[] r2 = r13.bytes
            int r2 = r2.length
            if (r0 != r2) goto L123
            int r0 = r0 + r9
            r13.grow(r0)
        L123:
            byte[] r0 = r13.bytes
            int r2 = r13.off
            int r3 = r2 + 1
            r13.off = r3
            r3 = 125(0x7d, float:1.75E-43)
            r0[r2] = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void write(java.util.List r14) {
            r13 = this;
            if (r14 != 0) goto L6
            r13.writeArrayNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r2 = r0.mask
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat
            long r4 = r0.mask
            long r2 = r2 | r4
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray
            long r4 = r0.mask
            long r2 = r2 | r4
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteDefaultValue
            long r4 = r0.mask
            long r2 = r2 | r4
            com.alibaba.fastjson2.JSONWriter$Context r0 = r13.context
            long r4 = r0.features
            long r2 = r2 & r4
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L36
            java.lang.Class r2 = r14.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r0.getObjectWriter(r2)
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r13
            r2 = r14
            r0.write(r1, r2, r3, r4, r5)
            return
        L36:
            int r0 = r13.off
            byte[] r2 = r13.bytes
            int r2 = r2.length
            r9 = 1
            if (r0 != r2) goto L42
            int r0 = r0 + r9
            r13.ensureCapacity(r0)
        L42:
            byte[] r0 = r13.bytes
            int r2 = r13.off
            int r3 = r2 + 1
            r13.off = r3
            r3 = 91
            r0[r2] = r3
            int r10 = r14.size()
            r11 = 0
            r0 = r9
            r12 = r11
        L55:
            if (r12 >= r10) goto Ldd
            if (r0 != 0) goto L71
            int r0 = r13.off
            byte[] r2 = r13.bytes
            int r2 = r2.length
            if (r0 != r2) goto L65
            int r0 = r0 + 1
            r13.ensureCapacity(r0)
        L65:
            byte[] r0 = r13.bytes
            int r2 = r13.off
            int r3 = r2 + 1
            r13.off = r3
            r3 = 44
            r0[r2] = r3
        L71:
            java.lang.Object r2 = r14.get(r12)
            if (r2 != 0) goto L7b
            r13.writeNull()
            goto Ld8
        L7b:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r0 != r3) goto L89
            java.lang.String r2 = (java.lang.String) r2
            r13.writeString(r2)
            goto Ld8
        L89:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r0 != r3) goto L93
            java.lang.Integer r2 = (java.lang.Integer) r2
            r13.writeInt32(r2)
            goto Ld8
        L93:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r0 != r3) goto L9d
            java.lang.Long r2 = (java.lang.Long) r2
            r13.writeInt64(r2)
            goto Ld8
        L9d:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r0 != r3) goto Lab
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            r13.writeBool(r0)
            goto Ld8
        Lab:
            java.lang.Class<java.math.BigDecimal> r3 = java.math.BigDecimal.class
            if (r0 != r3) goto Lb6
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            r0 = 0
            r13.writeDecimal(r2, r7, r0)
            goto Ld8
        Lb6:
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r3 = com.alibaba.fastjson2.JSONArray.class
            if (r0 != r3) goto Lc0
            com.alibaba.fastjson2.JSONArray r2 = (com.alibaba.fastjson2.JSONArray) r2
            r13.write(r2)
            goto Ld8
        Lc0:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r3 = com.alibaba.fastjson2.JSONObject.class
            if (r0 != r3) goto Lca
            com.alibaba.fastjson2.JSONObject r2 = (com.alibaba.fastjson2.JSONObject) r2
            r13.write(r2)
            goto Ld8
        Lca:
            com.alibaba.fastjson2.JSONWriter$Context r3 = r13.context
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r3.getObjectWriter(r0, r0)
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r13
            r0.write(r1, r2, r3, r4, r5)
        Ld8:
            int r12 = r12 + 1
            r0 = r11
            goto L55
        Ldd:
            int r0 = r13.off
            byte[] r2 = r13.bytes
            int r2 = r2.length
            if (r0 != r2) goto Le8
            int r0 = r0 + r9
            r13.ensureCapacity(r0)
        Le8:
            byte[] r0 = r13.bytes
            int r2 = r13.off
            int r3 = r2 + 1
            r13.off = r3
            r3 = 93
            r0[r2] = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void write0(char r3) {
            r2 = this;
            int r0 = r2.off
            byte[] r1 = r2.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r1 = r0 + 1
            r2.ensureCapacity(r1)
        Lc:
            byte[] r1 = r2.bytes
            byte r3 = (byte) r3
            r1[r0] = r3
            int r0 = r0 + 1
            r2.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBase64(byte[] r11) {
            r10 = this;
            int r0 = r11.length
            int r0 = r0 + (-1)
            int r0 = r0 / 3
            int r0 = r0 + 1
            r1 = 2
            int r0 = r0 << r1
            int r2 = r10.off
            int r0 = r0 + r2
            int r0 = r0 + r1
            r10.ensureCapacity(r0)
            byte[] r0 = r10.bytes
            int r3 = r2 + 1
            char r4 = r10.quote
            byte r4 = (byte) r4
            r0[r2] = r4
            int r2 = r11.length
            int r2 = r2 / 3
            int r2 = r2 * 3
            r4 = 0
            r5 = r4
        L20:
            if (r5 >= r2) goto L67
            int r6 = r5 + 1
            r7 = r11[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            int r8 = r5 + 2
            r6 = r11[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r6 = r6 | r7
            int r5 = r5 + 3
            r7 = r11[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            char[] r7 = com.alibaba.fastjson2.JSONFactory.CA
            int r8 = r6 >>> 18
            r8 = r8 & 63
            char r8 = r7[r8]
            byte r8 = (byte) r8
            r0[r3] = r8
            int r8 = r3 + 1
            int r9 = r6 >>> 12
            r9 = r9 & 63
            char r9 = r7[r9]
            byte r9 = (byte) r9
            r0[r8] = r9
            int r8 = r3 + 2
            int r9 = r6 >>> 6
            r9 = r9 & 63
            char r9 = r7[r9]
            byte r9 = (byte) r9
            r0[r8] = r9
            int r8 = r3 + 3
            r6 = r6 & 63
            char r6 = r7[r6]
            byte r6 = (byte) r6
            r0[r8] = r6
            int r3 = r3 + 4
            goto L20
        L67:
            int r5 = r11.length
            int r5 = r5 - r2
            if (r5 <= 0) goto La7
            r2 = r11[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 10
            if (r5 != r1) goto L7c
            int r4 = r11.length
            int r4 = r4 + (-1)
            r11 = r11[r4]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r4 = r11 << 2
        L7c:
            r11 = r2 | r4
            char[] r2 = com.alibaba.fastjson2.JSONFactory.CA
            int r4 = r11 >> 12
            char r4 = r2[r4]
            byte r4 = (byte) r4
            r0[r3] = r4
            int r4 = r3 + 1
            int r6 = r11 >>> 6
            r6 = r6 & 63
            char r6 = r2[r6]
            byte r6 = (byte) r6
            r0[r4] = r6
            int r4 = r3 + 2
            r6 = 61
            if (r5 != r1) goto L9e
            r11 = r11 & 63
            char r11 = r2[r11]
            byte r11 = (byte) r11
            goto L9f
        L9e:
            r11 = r6
        L9f:
            r0[r4] = r11
            int r11 = r3 + 3
            r0[r11] = r6
            int r3 = r3 + 4
        La7:
            char r11 = r10.quote
            byte r11 = (byte) r11
            r0[r3] = r11
            int r3 = r3 + 1
            r10.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBigInt(java.math.BigInteger r4, long r5) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.writeNumberNull()
            return
        L6:
            r0 = 10
            java.lang.String r0 = r4.toString(r0)
            com.alibaba.fastjson2.JSONWriter$Context r1 = r3.context
            long r1 = r1.features
            long r5 = r5 | r1
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r1 = r1.mask
            long r5 = r5 & r1
            r1 = 0
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L30
            java.math.BigInteger r5 = com.alibaba.fastjson2.JSONFactory.LOW_BIGINT
            int r5 = r4.compareTo(r5)
            if (r5 < 0) goto L2c
            java.math.BigInteger r5 = com.alibaba.fastjson2.JSONFactory.HIGH_BIGINT
            int r4 = r4.compareTo(r5)
            if (r4 <= 0) goto L30
        L2c:
            r3.writeString(r0)
            return
        L30:
            int r4 = r0.length()
            int r5 = r3.off
            int r5 = r5 + r4
            byte[] r6 = r3.bytes
            int r6 = r6.length
            if (r5 < r6) goto L3f
            r3.ensureCapacity(r5)
        L3f:
            byte[] r5 = r3.bytes
            int r6 = r3.off
            r1 = 0
            r0.getBytes(r1, r4, r5, r6)
            int r5 = r3.off
            int r5 = r5 + r4
            r3.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeChar(char r9) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 8
            byte[] r2 = r8.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r8.ensureCapacity(r1)
        Lc:
            byte[] r1 = r8.bytes
            int r2 = r0 + 1
            char r3 = r8.quote
            byte r4 = (byte) r3
            r1[r0] = r4
            r4 = 127(0x7f, float:1.78E-43)
            if (r9 > r4) goto Lda
            r4 = 92
            if (r9 == r4) goto Ld2
            r5 = 49
            r6 = 117(0x75, float:1.64E-43)
            r7 = 48
            switch(r9) {
                case 0: goto Lb9;
                case 1: goto Lb9;
                case 2: goto Lb9;
                case 3: goto Lb9;
                case 4: goto Lb9;
                case 5: goto Lb9;
                case 6: goto Lb9;
                case 7: goto Lb9;
                case 8: goto Laf;
                case 9: goto La6;
                case 10: goto L9d;
                case 11: goto L83;
                case 12: goto L7a;
                case 13: goto L71;
                case 14: goto L83;
                case 15: goto L83;
                case 16: goto L57;
                case 17: goto L57;
                case 18: goto L57;
                case 19: goto L57;
                case 20: goto L57;
                case 21: goto L57;
                case 22: goto L57;
                case 23: goto L57;
                case 24: goto L57;
                case 25: goto L57;
                case 26: goto L3a;
                case 27: goto L3a;
                case 28: goto L3a;
                case 29: goto L3a;
                case 30: goto L3a;
                case 31: goto L3a;
                default: goto L26;
            }
        L26:
            if (r9 != r3) goto L33
            r1[r2] = r4
            int r9 = r0 + 2
            byte r2 = (byte) r3
            r1[r9] = r2
        L2f:
            int r0 = r0 + 3
            goto L123
        L33:
            int r0 = r0 + 2
            byte r9 = (byte) r9
            r1[r2] = r9
            goto L123
        L3a:
            r1[r2] = r4
            int r2 = r0 + 2
            r1[r2] = r6
            int r2 = r0 + 3
            r1[r2] = r7
            int r2 = r0 + 4
            r1[r2] = r7
            int r2 = r0 + 5
            r1[r2] = r5
            int r2 = r0 + 6
            int r9 = r9 + 71
            byte r9 = (byte) r9
            r1[r2] = r9
        L53:
            int r0 = r0 + 7
            goto L123
        L57:
            r1[r2] = r4
            int r2 = r0 + 2
            r1[r2] = r6
            int r2 = r0 + 3
            r1[r2] = r7
            int r2 = r0 + 4
            r1[r2] = r7
            int r2 = r0 + 5
            r1[r2] = r5
            int r2 = r0 + 6
            int r9 = r9 + 32
            byte r9 = (byte) r9
            r1[r2] = r9
            goto L53
        L71:
            r1[r2] = r4
            int r9 = r0 + 2
            r2 = 114(0x72, float:1.6E-43)
            r1[r9] = r2
            goto L2f
        L7a:
            r1[r2] = r4
            int r9 = r0 + 2
            r2 = 102(0x66, float:1.43E-43)
            r1[r9] = r2
            goto L2f
        L83:
            r1[r2] = r4
            int r2 = r0 + 2
            r1[r2] = r6
            int r2 = r0 + 3
            r1[r2] = r7
            int r2 = r0 + 4
            r1[r2] = r7
            int r2 = r0 + 5
            r1[r2] = r7
            int r2 = r0 + 6
            int r9 = r9 + 87
            byte r9 = (byte) r9
            r1[r2] = r9
            goto L53
        L9d:
            r1[r2] = r4
            int r9 = r0 + 2
            r2 = 110(0x6e, float:1.54E-43)
            r1[r9] = r2
            goto L2f
        La6:
            r1[r2] = r4
            int r9 = r0 + 2
            r2 = 116(0x74, float:1.63E-43)
            r1[r9] = r2
            goto L2f
        Laf:
            r1[r2] = r4
            int r9 = r0 + 2
            r2 = 98
            r1[r9] = r2
            goto L2f
        Lb9:
            r1[r2] = r4
            int r2 = r0 + 2
            r1[r2] = r6
            int r2 = r0 + 3
            r1[r2] = r7
            int r2 = r0 + 4
            r1[r2] = r7
            int r2 = r0 + 5
            r1[r2] = r7
            int r2 = r0 + 6
            int r9 = r9 + r7
            byte r9 = (byte) r9
            r1[r2] = r9
            goto L53
        Ld2:
            r1[r2] = r4
            int r9 = r0 + 2
            r1[r9] = r4
            goto L2f
        Lda:
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r9 < r4) goto Leb
            r4 = 57344(0xe000, float:8.0356E-41)
            if (r9 < r4) goto Le5
            goto Leb
        Le5:
            java.lang.String r0 = "illegal char "
            ah.a.g(r9, r0)
            return
        Leb:
            r4 = 2047(0x7ff, float:2.868E-42)
            if (r9 <= r4) goto L10f
            int r4 = r9 >> 12
            r4 = r4 & 15
            r4 = r4 | 224(0xe0, float:3.14E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r0 + 2
            int r4 = r9 >> 6
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.8E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r0 + 3
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.8E-43)
            byte r9 = (byte) r9
            r1[r2] = r9
            int r0 = r0 + 4
            goto L123
        L10f:
            int r4 = r9 >> 6
            r4 = r4 & 31
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r0 + 2
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.8E-43)
            byte r9 = (byte) r9
            r1[r2] = r9
            goto L2f
        L123:
            byte r9 = (byte) r3
            r1[r0] = r9
            int r0 = r0 + 1
            r8.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeColon() {
            r3 = this;
            int r0 = r3.off
            byte[] r1 = r3.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r1 = r0 + 1
            r3.ensureCapacity(r1)
        Lc:
            byte[] r1 = r3.bytes
            r2 = 58
            r1[r0] = r2
            int r0 = r0 + 1
            r3.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeComma() {
            r4 = this;
            r0 = 0
            r4.startObject = r0
            int r0 = r4.off
            int r1 = r0 + 2
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r4.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L16
            byte[] r1 = r4.grow(r2)
        L16:
            int r2 = r0 + 1
            r3 = 44
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L24
            int r2 = r4.indent(r1, r2)
        L24:
            r4.off = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTime14(int r8, int r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            int r0 = r7.off
            int r1 = r0 + 16
            byte[] r2 = r7.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r7.ensureCapacity(r1)
        Lc:
            byte[] r2 = r7.bytes
            char r3 = r7.quote
            byte r4 = (byte) r3
            r2[r0] = r4
            if (r8 < 0) goto L8a
            r4 = 9999(0x270f, float:1.4012E-41)
            if (r8 > r4) goto L8a
            int r4 = r8 / 1000
            int[] r5 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            int r6 = r4 * 1000
            int r8 = r8 - r6
            r8 = r5[r8]
            int r6 = r0 + 1
            int r4 = r4 + 48
            byte r4 = (byte) r4
            r2[r6] = r4
            int r4 = r0 + 2
            int r6 = r8 >> 16
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r0 + 3
            int r6 = r8 >> 8
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r0 + 4
            byte r8 = (byte) r8
            r2[r4] = r8
            r8 = r5[r9]
            int r9 = r0 + 5
            int r4 = r8 >> 8
            byte r4 = (byte) r4
            r2[r9] = r4
            int r9 = r0 + 6
            byte r8 = (byte) r8
            r2[r9] = r8
            r8 = r5[r10]
            int r9 = r0 + 7
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            r2[r9] = r10
            int r9 = r0 + 8
            byte r8 = (byte) r8
            r2[r9] = r8
            r8 = r5[r11]
            int r9 = r0 + 9
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            r2[r9] = r10
            int r9 = r0 + 10
            byte r8 = (byte) r8
            r2[r9] = r8
            r8 = r5[r12]
            int r9 = r0 + 11
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            r2[r9] = r10
            int r9 = r0 + 12
            byte r8 = (byte) r8
            r2[r9] = r8
            r8 = r5[r13]
            int r9 = r0 + 13
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            r2[r9] = r10
            int r9 = r0 + 14
            byte r8 = (byte) r8
            r2[r9] = r8
            int r0 = r0 + 15
            byte r8 = (byte) r3
            r2[r0] = r8
            r7.off = r1
            return
        L8a:
            java.lang.String r9 = "Only 4 digits numbers are supported. Provided: "
            java.lang.String r8 = eh.a.l(r8, r9)
            j8.o.t(r8)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTime19(int r8, int r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            int r0 = r7.off
            int r1 = r0 + 21
            byte[] r2 = r7.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r7.ensureCapacity(r1)
        Lc:
            byte[] r2 = r7.bytes
            char r3 = r7.quote
            byte r4 = (byte) r3
            r2[r0] = r4
            if (r8 < 0) goto La4
            r4 = 9999(0x270f, float:1.4012E-41)
            if (r8 > r4) goto La4
            int r4 = r8 / 1000
            int[] r5 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            int r6 = r4 * 1000
            int r8 = r8 - r6
            r8 = r5[r8]
            int r6 = r0 + 1
            int r4 = r4 + 48
            byte r4 = (byte) r4
            r2[r6] = r4
            int r4 = r0 + 2
            int r6 = r8 >> 16
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r0 + 3
            int r6 = r8 >> 8
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r0 + 4
            byte r8 = (byte) r8
            r2[r4] = r8
            int r8 = r0 + 5
            r4 = 45
            r2[r8] = r4
            r8 = r5[r9]
            int r9 = r0 + 6
            int r6 = r8 >> 8
            byte r6 = (byte) r6
            r2[r9] = r6
            int r9 = r0 + 7
            byte r8 = (byte) r8
            r2[r9] = r8
            int r8 = r0 + 8
            r2[r8] = r4
            r8 = r5[r10]
            int r9 = r0 + 9
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            r2[r9] = r10
            int r9 = r0 + 10
            byte r8 = (byte) r8
            r2[r9] = r8
            int r8 = r0 + 11
            r9 = 32
            r2[r8] = r9
            r8 = r5[r11]
            int r9 = r0 + 12
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            r2[r9] = r10
            int r9 = r0 + 13
            byte r8 = (byte) r8
            r2[r9] = r8
            int r8 = r0 + 14
            r9 = 58
            r2[r8] = r9
            r8 = r5[r12]
            int r10 = r0 + 15
            int r11 = r8 >> 8
            byte r11 = (byte) r11
            r2[r10] = r11
            int r10 = r0 + 16
            byte r8 = (byte) r8
            r2[r10] = r8
            int r8 = r0 + 17
            r2[r8] = r9
            r8 = r5[r13]
            int r9 = r0 + 18
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            r2[r9] = r10
            int r9 = r0 + 19
            byte r8 = (byte) r8
            r2[r9] = r8
            int r0 = r0 + 20
            byte r8 = (byte) r3
            r2[r0] = r8
            r7.off = r1
            return
        La4:
            java.lang.String r9 = "Only 4 digits numbers are supported. Provided: "
            java.lang.String r8 = eh.a.l(r8, r9)
            j8.o.t(r8)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTimeISO8601(int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, boolean r15) {
            r6 = this;
            r0 = 1
            if (r15 == 0) goto L9
            if (r14 != 0) goto L7
            r1 = r0
            goto La
        L7:
            r1 = 6
            goto La
        L9:
            r1 = 0
        La:
            int r2 = r6.off
            int r2 = r2 + 25
            int r2 = r2 + r1
            byte[] r1 = r6.bytes
            int r1 = r1.length
            if (r2 < r1) goto L17
            r6.ensureCapacity(r2)
        L17:
            byte[] r1 = r6.bytes
            int r2 = r6.off
            char r3 = r6.quote
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + r0
            int r7 = com.alibaba.fastjson2.util.IOUtils.writeInt32(r1, r2, r7)
            r2 = 45
            r1[r7] = r2
            int[] r3 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            r8 = r3[r8]
            int r4 = r7 + 1
            int r5 = r8 >> 8
            byte r5 = (byte) r5
            r1[r4] = r5
            int r4 = r7 + 2
            byte r8 = (byte) r8
            r1[r4] = r8
            int r8 = r7 + 3
            r1[r8] = r2
            r8 = r3[r9]
            int r9 = r7 + 4
            int r4 = r8 >> 8
            byte r4 = (byte) r4
            r1[r9] = r4
            int r9 = r7 + 5
            byte r8 = (byte) r8
            r1[r9] = r8
            int r8 = r7 + 6
            if (r15 == 0) goto L52
            r9 = 84
            goto L54
        L52:
            r9 = 32
        L54:
            byte r9 = (byte) r9
            r1[r8] = r9
            r8 = r3[r10]
            int r9 = r7 + 7
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            r1[r9] = r10
            int r9 = r7 + 8
            byte r8 = (byte) r8
            r1[r9] = r8
            int r8 = r7 + 9
            r9 = 58
            r1[r8] = r9
            r8 = r3[r11]
            int r10 = r7 + 10
            int r11 = r8 >> 8
            byte r11 = (byte) r11
            r1[r10] = r11
            int r10 = r7 + 11
            byte r8 = (byte) r8
            r1[r10] = r8
            int r8 = r7 + 12
            r1[r8] = r9
            r8 = r3[r12]
            int r10 = r7 + 13
            int r11 = r8 >> 8
            byte r11 = (byte) r11
            r1[r10] = r11
            int r10 = r7 + 14
            byte r8 = (byte) r8
            r1[r10] = r8
            int r8 = r7 + 15
            if (r13 <= 0) goto Ld1
            int r10 = r7 + 16
            r11 = 46
            r1[r8] = r11
            int r8 = r13 / 10
            int r11 = r8 / 10
            int r12 = r8 * 10
            int r12 = r13 - r12
            if (r12 == 0) goto Lb5
            r8 = r3[r13]
            int r11 = r8 >> 16
            byte r11 = (byte) r11
            r1[r10] = r11
            int r10 = r7 + 17
            int r11 = r8 >> 8
            byte r11 = (byte) r11
            r1[r10] = r11
            int r10 = r7 + 18
            byte r8 = (byte) r8
            r1[r10] = r8
            int r8 = r7 + 19
            goto Ld1
        Lb5:
            int r12 = r11 * 10
            int r12 = r8 - r12
            if (r12 == 0) goto Lca
            r8 = r3[r8]
            int r11 = r8 >> 8
            byte r11 = (byte) r11
            r1[r10] = r11
            int r10 = r7 + 17
            byte r8 = (byte) r8
            r1[r10] = r8
            int r8 = r7 + 18
            goto Ld1
        Lca:
            int r8 = r7 + 17
            int r11 = r11 + 48
            byte r7 = (byte) r11
            r1[r10] = r7
        Ld1:
            if (r15 == 0) goto L113
            int r7 = r14 / 3600
            if (r14 != 0) goto Ldf
            int r7 = r8 + 1
            r9 = 90
            r1[r8] = r9
            r8 = r7
            goto L113
        Ldf:
            int r10 = java.lang.Math.abs(r7)
            if (r7 < 0) goto Le7
            r2 = 43
        Le7:
            r1[r8] = r2
            r10 = r3[r10]
            int r11 = r8 + 1
            int r12 = r10 >> 8
            byte r12 = (byte) r12
            r1[r11] = r12
            int r11 = r8 + 2
            byte r10 = (byte) r10
            r1[r11] = r10
            int r10 = r8 + 3
            r1[r10] = r9
            int r7 = r7 * 3600
            int r14 = r14 - r7
            int r14 = r14 / 60
            if (r14 >= 0) goto L103
            int r14 = -r14
        L103:
            r7 = r3[r14]
            int r9 = r8 + 4
            int r10 = r7 >> 8
            byte r10 = (byte) r10
            r1[r9] = r10
            int r9 = r8 + 5
            byte r7 = (byte) r7
            r1[r9] = r7
            int r8 = r8 + 6
        L113:
            char r7 = r6.quote
            byte r7 = (byte) r7
            r1[r8] = r7
            int r8 = r8 + r0
            r6.off = r8
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateYYYMMDD10(int r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 13
            byte[] r2 = r4.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r4.ensureCapacity(r1)
        Lc:
            byte[] r1 = r4.bytes
            int r2 = r0 + 1
            char r3 = r4.quote
            byte r3 = (byte) r3
            r1[r0] = r3
            int r5 = com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r1, r2, r5, r6, r7)
            char r6 = r4.quote
            byte r6 = (byte) r6
            r1[r5] = r6
            int r5 = r5 + 1
            r4.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateYYYMMDD8(int r8, int r9, int r10) {
            r7 = this;
            int r0 = r7.off
            int r1 = r0 + 10
            byte[] r2 = r7.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r7.ensureCapacity(r1)
        Lc:
            byte[] r2 = r7.bytes
            char r3 = r7.quote
            byte r4 = (byte) r3
            r2[r0] = r4
            if (r8 < 0) goto L60
            r4 = 9999(0x270f, float:1.4012E-41)
            if (r8 > r4) goto L60
            int r4 = r8 / 1000
            int[] r5 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            int r6 = r4 * 1000
            int r8 = r8 - r6
            r8 = r5[r8]
            int r6 = r0 + 1
            int r4 = r4 + 48
            byte r4 = (byte) r4
            r2[r6] = r4
            int r4 = r0 + 2
            int r6 = r8 >> 16
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r0 + 3
            int r6 = r8 >> 8
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r0 + 4
            byte r8 = (byte) r8
            r2[r4] = r8
            r8 = r5[r9]
            int r9 = r0 + 5
            int r4 = r8 >> 8
            byte r4 = (byte) r4
            r2[r9] = r4
            int r9 = r0 + 6
            byte r8 = (byte) r8
            r2[r9] = r8
            r8 = r5[r10]
            int r9 = r0 + 7
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            r2[r9] = r10
            int r9 = r0 + 8
            byte r8 = (byte) r8
            r2[r9] = r8
            int r0 = r0 + 9
            byte r8 = (byte) r3
            r2[r0] = r8
            r7.off = r1
            return
        L60:
            java.lang.String r9 = "Only 4 digits numbers are supported. Provided: "
            java.lang.String r8 = eh.a.l(r8, r9)
            j8.o.t(r8)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDecimal(java.math.BigDecimal r9, long r10, java.text.DecimalFormat r12) {
            r8 = this;
            if (r9 != 0) goto L6
            r8.writeDecimalNull()
            return
        L6:
            if (r12 == 0) goto L10
            java.lang.String r9 = r12.format(r9)
            r8.writeRaw(r9)
            return
        L10:
            com.alibaba.fastjson2.JSONWriter$Context r12 = r8.context
            long r0 = r12.features
            long r10 = r10 | r0
            int r12 = r9.precision()
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r0 = r0.mask
            long r0 = r0 & r10
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L26
            goto L43
        L26:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r4 = r0.mask
            long r4 = r4 & r10
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L45
            r0 = 16
            if (r12 < r0) goto L45
            java.math.BigDecimal r0 = com.alibaba.fastjson2.JSONFactory.LOW
            int r0 = r9.compareTo(r0)
            if (r0 < 0) goto L43
            java.math.BigDecimal r0 = com.alibaba.fastjson2.JSONFactory.HIGH
            int r0 = r9.compareTo(r0)
            if (r0 <= 0) goto L45
        L43:
            r0 = 1
            goto L46
        L45:
            r0 = r1
        L46:
            int r4 = r8.off
            int r12 = r12 + r4
            int r5 = r9.scale()
            int r5 = java.lang.Math.abs(r5)
            int r5 = r5 + r12
            int r5 = r5 + 7
            byte[] r12 = r8.bytes
            int r12 = r12.length
            if (r5 < r12) goto L5c
            r8.ensureCapacity(r5)
        L5c:
            byte[] r12 = r8.bytes
            r5 = 34
            if (r0 == 0) goto L67
            int r6 = r4 + 1
            r12[r4] = r5
            r4 = r6
        L67:
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.WriteBigDecimalAsPlain
            long r6 = r6.mask
            long r10 = r10 & r6
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 == 0) goto L75
            java.lang.String r9 = r9.toPlainString()
            goto L79
        L75:
            java.lang.String r9 = r9.toString()
        L79:
            int r10 = r9.length()
            r9.getBytes(r1, r10, r12, r4)
            int r9 = r9.length()
            int r9 = r9 + r4
            if (r0 == 0) goto L8c
            int r10 = r9 + 1
            r12[r9] = r5
            r9 = r10
        L8c:
            r8.off = r9
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double r7) {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = 0
        L13:
            int r2 = r6.off
            int r3 = r2 + 26
            byte[] r4 = r6.bytes
            int r4 = r4.length
            if (r3 < r4) goto L1f
            r6.ensureCapacity(r3)
        L1f:
            byte[] r3 = r6.bytes
            r4 = 34
            if (r0 == 0) goto L2a
            int r5 = r2 + 1
            r3[r2] = r4
            r2 = r5
        L2a:
            int r7 = com.alibaba.fastjson2.util.DoubleToDecimal.toString(r7, r3, r2, r1)
            int r7 = r7 + r2
            if (r0 == 0) goto L36
            int r8 = r7 + 1
            r3[r7] = r4
            r7 = r8
        L36:
            r6.off = r7
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double[] r9) {
            r8 = this;
            if (r9 != 0) goto L6
            r8.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r8.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            int r3 = r8.off
            int r4 = r9.length
            r5 = 27
            int r4 = p.a.g(r4, r5, r3, r2)
            byte[] r5 = r8.bytes
            int r5 = r5.length
            if (r4 < r5) goto L2b
            r8.ensureCapacity(r4)
        L2b:
            byte[] r4 = r8.bytes
            int r5 = r3 + 1
            r6 = 91
            r4[r3] = r6
        L33:
            int r3 = r9.length
            if (r1 >= r3) goto L5a
            if (r1 == 0) goto L3f
            int r3 = r5 + 1
            r6 = 44
            r4[r5] = r6
            r5 = r3
        L3f:
            r3 = 34
            if (r0 == 0) goto L48
            int r6 = r5 + 1
            r4[r5] = r3
            r5 = r6
        L48:
            r6 = r9[r1]
            int r6 = com.alibaba.fastjson2.util.DoubleToDecimal.toString(r6, r4, r5, r2)
            int r6 = r6 + r5
            if (r0 == 0) goto L56
            int r5 = r6 + 1
            r4[r6] = r3
            goto L57
        L56:
            r5 = r6
        L57:
            int r1 = r1 + 1
            goto L33
        L5a:
            r9 = 93
            r4[r5] = r9
            int r5 = r5 + r2
            r8.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float r7) {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = 0
        L13:
            int r2 = r6.off
            int r3 = r2 + 17
            byte[] r4 = r6.bytes
            int r4 = r4.length
            if (r3 < r4) goto L1f
            r6.ensureCapacity(r3)
        L1f:
            r3 = 34
            if (r0 == 0) goto L2a
            byte[] r4 = r6.bytes
            int r5 = r2 + 1
            r4[r2] = r3
            r2 = r5
        L2a:
            byte[] r4 = r6.bytes
            int r7 = com.alibaba.fastjson2.util.DoubleToDecimal.toString(r7, r4, r2, r1)
            int r7 = r7 + r2
            if (r0 == 0) goto L3a
            byte[] r0 = r6.bytes
            int r1 = r7 + 1
            r0[r7] = r3
            r7 = r1
        L3a:
            r6.off = r7
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float[] r8) {
            r7 = this;
            if (r8 != 0) goto L6
            r7.writeArrayNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r7.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            int r3 = r7.off
            int r4 = r8.length
            if (r0 == 0) goto L22
            r5 = 16
            goto L24
        L22:
            r5 = 18
        L24:
            int r4 = p.a.g(r4, r5, r3, r2)
            byte[] r5 = r7.bytes
            int r5 = r5.length
            if (r4 < r5) goto L30
            r7.ensureCapacity(r4)
        L30:
            byte[] r4 = r7.bytes
            int r5 = r3 + 1
            r6 = 91
            r4[r3] = r6
        L38:
            int r3 = r8.length
            if (r1 >= r3) goto L5f
            if (r1 == 0) goto L44
            int r3 = r5 + 1
            r6 = 44
            r4[r5] = r6
            r5 = r3
        L44:
            r3 = 34
            if (r0 == 0) goto L4d
            int r6 = r5 + 1
            r4[r5] = r3
            r5 = r6
        L4d:
            r6 = r8[r1]
            int r6 = com.alibaba.fastjson2.util.DoubleToDecimal.toString(r6, r4, r5, r2)
            int r6 = r6 + r5
            if (r0 == 0) goto L5b
            int r5 = r6 + 1
            r4[r6] = r3
            goto L5c
        L5b:
            r5 = r6
        L5c:
            int r1 = r1 + 1
            goto L38
        L5f:
            r8 = 93
            r4[r5] = r8
            int r5 = r5 + r2
            r7.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeHex(byte[] r11) {
            r10 = this;
            if (r11 != 0) goto L6
            r10.writeNull()
            return
        L6:
            int r0 = r11.length
            int r0 = r0 * 2
            int r0 = r0 + 3
            int r1 = r10.off
            int r0 = r0 + r1
            int r0 = r0 + 2
            r10.ensureCapacity(r0)
            byte[] r0 = r10.bytes
            r2 = 120(0x78, float:1.68E-43)
            r0[r1] = r2
            int r2 = r1 + 1
            r3 = 39
            r0[r2] = r3
            int r1 = r1 + 2
            r2 = 0
        L22:
            int r4 = r11.length
            if (r2 >= r4) goto L4a
            r4 = r11[r2]
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r5 >> 4
            r4 = r4 & 15
            r6 = 55
            r7 = 48
            r8 = 10
            if (r5 >= r8) goto L37
            r9 = r7
            goto L38
        L37:
            r9 = r6
        L38:
            int r5 = r5 + r9
            byte r5 = (byte) r5
            r0[r1] = r5
            int r5 = r1 + 1
            if (r4 >= r8) goto L41
            r6 = r7
        L41:
            int r4 = r4 + r6
            byte r4 = (byte) r4
            r0[r5] = r4
            int r1 = r1 + 2
            int r2 = r2 + 1
            goto L22
        L4a:
            r0[r1] = r3
            int r1 = r1 + 1
            r10.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt16(short r6) {
            r5 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r5.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r5.off
            int r2 = r1 + 7
            byte[] r3 = r5.bytes
            int r3 = r3.length
            if (r2 < r3) goto L1e
            r5.ensureCapacity(r2)
        L1e:
            byte[] r2 = r5.bytes
            if (r0 == 0) goto L2a
            int r3 = r1 + 1
            char r4 = r5.quote
            byte r4 = (byte) r4
            r2[r1] = r4
            r1 = r3
        L2a:
            int r6 = com.alibaba.fastjson2.util.IOUtils.writeInt32(r2, r1, r6)
            if (r0 == 0) goto L38
            int r0 = r6 + 1
            char r1 = r5.quote
            byte r1 = (byte) r1
            r2[r6] = r1
            r6 = r0
        L38:
            r5.off = r6
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt32(int r6) {
            r5 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r5.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r5.off
            int r2 = r1 + 13
            byte[] r3 = r5.bytes
            int r3 = r3.length
            if (r2 < r3) goto L1e
            r5.ensureCapacity(r2)
        L1e:
            byte[] r2 = r5.bytes
            if (r0 == 0) goto L2a
            int r3 = r1 + 1
            char r4 = r5.quote
            byte r4 = (byte) r4
            r2[r1] = r4
            r1 = r3
        L2a:
            int r6 = com.alibaba.fastjson2.util.IOUtils.writeInt32(r2, r1, r6)
            if (r0 == 0) goto L38
            int r0 = r6 + 1
            char r1 = r5.quote
            byte r1 = (byte) r1
            r2[r6] = r1
            r6 = r0
        L38:
            r5.off = r6
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt32(int[] r8) {
            r7 = this;
            if (r8 != 0) goto L6
            r7.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r7.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            int r3 = r7.off
            int r4 = r8.length
            r5 = 13
            r6 = 2
            int r4 = p.a.g(r4, r5, r3, r6)
            byte[] r5 = r7.bytes
            int r5 = r5.length
            if (r4 < r5) goto L2c
            r7.ensureCapacity(r4)
        L2c:
            byte[] r4 = r7.bytes
            int r5 = r3 + 1
            r6 = 91
            r4[r3] = r6
        L34:
            int r3 = r8.length
            if (r1 >= r3) goto L5e
            if (r1 == 0) goto L40
            int r3 = r5 + 1
            r6 = 44
            r4[r5] = r6
            r5 = r3
        L40:
            if (r0 == 0) goto L4a
            int r3 = r5 + 1
            char r6 = r7.quote
            byte r6 = (byte) r6
            r4[r5] = r6
            r5 = r3
        L4a:
            r3 = r8[r1]
            int r3 = com.alibaba.fastjson2.util.IOUtils.writeInt32(r4, r5, r3)
            if (r0 == 0) goto L5a
            int r5 = r3 + 1
            char r6 = r7.quote
            byte r6 = (byte) r6
            r4[r3] = r6
            goto L5b
        L5a:
            r5 = r3
        L5b:
            int r1 = r1 + 1
            goto L34
        L5e:
            r8 = 93
            r4[r5] = r8
            int r5 = r5 + r2
            r7.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt64(long r10) {
            r9 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r9.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteLongAsString
            long r4 = r4.mask
            long r2 = r2 | r4
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L32
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r2 = r2.mask
            long r2 = r2 & r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L30
            r2 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 > 0) goto L32
            r2 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 >= 0) goto L30
            goto L32
        L30:
            r2 = 0
            goto L33
        L32:
            r2 = 1
        L33:
            int r3 = r9.off
            int r6 = r3 + 23
            byte[] r7 = r9.bytes
            int r7 = r7.length
            if (r6 < r7) goto L3f
            r9.ensureCapacity(r6)
        L3f:
            byte[] r6 = r9.bytes
            if (r2 == 0) goto L4b
            int r7 = r3 + 1
            char r8 = r9.quote
            byte r8 = (byte) r8
            r6[r3] = r8
            r3 = r7
        L4b:
            int r3 = com.alibaba.fastjson2.util.IOUtils.writeInt64(r6, r3, r10)
            if (r2 == 0) goto L5a
            int r10 = r3 + 1
            char r11 = r9.quote
            byte r11 = (byte) r11
            r6[r3] = r11
        L58:
            r3 = r10
            goto L81
        L5a:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r7 = r2.mask
            long r7 = r7 & r0
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 == 0) goto L81
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteNumberClassName
            long r7 = r2.mask
            long r0 = r0 & r7
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L81
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L81
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L81
            int r10 = r3 + 1
            r11 = 76
            r6[r3] = r11
            goto L58
        L81:
            r9.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt64(long[] r13) {
            r12 = this;
            if (r13 != 0) goto L6
            r12.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r12.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r6 = 1
            if (r2 == 0) goto L19
            r2 = r6
            goto L1a
        L19:
            r2 = r3
        L1a:
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r7 = r7.mask
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.WriteLongAsString
            long r9 = r9.mask
            long r7 = r7 | r9
            long r0 = r0 & r7
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L2a
            r0 = r6
            goto L2b
        L2a:
            r0 = r3
        L2b:
            int r1 = r12.off
            int r4 = r1 + 2
            int r5 = r13.length
            int r5 = r5 * 23
            int r5 = r5 + r4
            byte[] r4 = r12.bytes
            int r4 = r4.length
            if (r5 < r4) goto L3b
            r12.ensureCapacity(r5)
        L3b:
            byte[] r4 = r12.bytes
            int r5 = r1 + 1
            r7 = 91
            r4[r1] = r7
            r1 = r3
        L44:
            int r7 = r13.length
            if (r1 >= r7) goto L87
            if (r1 == 0) goto L50
            int r7 = r5 + 1
            r8 = 44
            r4[r5] = r8
            r5 = r7
        L50:
            r7 = r13[r1]
            if (r0 != 0) goto L6b
            if (r2 == 0) goto L69
            r9 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 > 0) goto L69
            r9 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L69
            goto L6b
        L69:
            r9 = r3
            goto L6c
        L6b:
            r9 = r6
        L6c:
            if (r9 == 0) goto L76
            int r10 = r5 + 1
            char r11 = r12.quote
            byte r11 = (byte) r11
            r4[r5] = r11
            r5 = r10
        L76:
            int r5 = com.alibaba.fastjson2.util.IOUtils.writeInt64(r4, r5, r7)
            if (r9 == 0) goto L84
            int r7 = r5 + 1
            char r8 = r12.quote
            byte r8 = (byte) r8
            r4[r5] = r8
            r5 = r7
        L84:
            int r1 = r1 + 1
            goto L44
        L87:
            r13 = 93
            r4[r5] = r13
            int r5 = r5 + r6
            r12.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt8(byte r6) {
            r5 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r5.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r5.off
            int r2 = r1 + 5
            byte[] r3 = r5.bytes
            int r3 = r3.length
            if (r2 < r3) goto L1e
            r5.ensureCapacity(r2)
        L1e:
            byte[] r2 = r5.bytes
            if (r0 == 0) goto L2a
            int r3 = r1 + 1
            char r4 = r5.quote
            byte r4 = (byte) r4
            r2[r1] = r4
            r1 = r3
        L2a:
            int r6 = com.alibaba.fastjson2.util.IOUtils.writeInt32(r2, r1, r6)
            if (r0 == 0) goto L38
            int r0 = r6 + 1
            char r1 = r5.quote
            byte r1 = (byte) r1
            r2[r6] = r1
            r6 = r0
        L38:
            r5.off = r6
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalDate(java.time.LocalDate r5) {
            r4 = this;
            if (r5 != 0) goto L6
            r4.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            java.lang.String r1 = r0.dateFormat
            if (r1 == 0) goto L13
            boolean r0 = r4.writeLocalDateWithFormat(r5, r0)
            if (r0 == 0) goto L13
            return
        L13:
            int r0 = r4.off
            int r1 = r0 + 18
            byte[] r2 = r4.bytes
            int r2 = r2.length
            if (r1 < r2) goto L1f
            r4.ensureCapacity(r1)
        L1f:
            byte[] r1 = r4.bytes
            int r2 = r0 + 1
            char r3 = r4.quote
            byte r3 = (byte) r3
            r1[r0] = r3
            int r0 = r5.getYear()
            int r3 = r5.getMonthValue()
            int r5 = r5.getDayOfMonth()
            int r5 = com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r1, r2, r0, r3, r5)
            char r0 = r4.quote
            byte r0 = (byte) r0
            r1[r5] = r0
            int r5 = r5 + 1
            r4.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalDateTime(java.time.LocalDateTime r6) {
            r5 = this;
            int r0 = r5.off
            int r1 = r0 + 38
            byte[] r2 = r5.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r5.ensureCapacity(r1)
        Lc:
            byte[] r1 = r5.bytes
            int r2 = r0 + 1
            char r3 = r5.quote
            byte r3 = (byte) r3
            r1[r0] = r3
            java.time.LocalDate r0 = r6.toLocalDate()
            int r3 = r0.getYear()
            int r4 = r0.getMonthValue()
            int r0 = r0.getDayOfMonth()
            int r0 = com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r1, r2, r3, r4, r0)
            int r2 = r0 + 1
            r3 = 32
            r1[r0] = r3
            java.time.LocalTime r6 = r6.toLocalTime()
            int r6 = com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r1, r2, r6)
            char r0 = r5.quote
            byte r0 = (byte) r0
            r1[r6] = r0
            int r6 = r6 + 1
            r5.off = r6
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeLocalTime(java.time.LocalTime r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 20
            byte[] r2 = r4.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r4.ensureCapacity(r1)
        Lc:
            byte[] r1 = r4.bytes
            int r2 = r0 + 1
            char r3 = r4.quote
            byte r3 = (byte) r3
            r1[r0] = r3
            int r5 = com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r1, r2, r5)
            char r0 = r4.quote
            byte r0 = (byte) r0
            r1[r5] = r0
            int r5 = r5 + 1
            r4.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName10Raw(long r13, long r15) {
            r12 = this;
            int r0 = r12.off
            int r1 = r0 + 18
            byte r2 = r12.pretty
            int r3 = r12.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r12.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r12.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r12.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r12.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r12.pretty
            if (r0 == 0) goto L2b
            int r0 = r12.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r10 = (long) r0
            long r4 = r8 + r10
            r6 = r13
            r2.putLong(r3, r4, r6)
            long r8 = r8 + r10
            r13 = 8
            long r4 = r8 + r13
            r6 = r15
            r2.putLong(r3, r4, r6)
            int r0 = r0 + 13
            r12.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName11Raw(long r13, long r15) {
            r12 = this;
            int r0 = r12.off
            int r1 = r0 + 18
            byte r2 = r12.pretty
            int r3 = r12.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r12.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r12.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r12.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r12.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r12.pretty
            if (r0 == 0) goto L2b
            int r0 = r12.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r10 = (long) r0
            long r4 = r8 + r10
            r6 = r13
            r2.putLong(r3, r4, r6)
            long r8 = r8 + r10
            r13 = 8
            long r4 = r8 + r13
            r6 = r15
            r2.putLong(r3, r4, r6)
            int r0 = r0 + 14
            r12.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName12Raw(long r13, long r15) {
            r12 = this;
            int r0 = r12.off
            int r1 = r0 + 18
            byte r2 = r12.pretty
            int r3 = r12.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r12.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r12.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r12.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r12.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r12.pretty
            if (r0 == 0) goto L2b
            int r0 = r12.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r10 = (long) r0
            long r4 = r8 + r10
            r6 = r13
            r2.putLong(r3, r4, r6)
            long r8 = r8 + r10
            r13 = 8
            long r4 = r8 + r13
            r6 = r15
            r2.putLong(r3, r4, r6)
            int r0 = r0 + 15
            r12.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName13Raw(long r13, long r15) {
            r12 = this;
            int r0 = r12.off
            int r1 = r0 + 18
            byte r2 = r12.pretty
            int r3 = r12.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r12.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r12.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r12.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r12.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r12.pretty
            if (r0 == 0) goto L2b
            int r0 = r12.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r10 = (long) r0
            long r4 = r8 + r10
            r6 = r13
            r2.putLong(r3, r4, r6)
            long r8 = r8 + r10
            r13 = 8
            long r4 = r8 + r13
            r6 = r15
            r2.putLong(r3, r4, r6)
            int r0 = r0 + 16
            r12.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName14Raw(long r13, long r15) {
            r12 = this;
            int r0 = r12.off
            int r1 = r0 + 19
            byte r2 = r12.pretty
            int r3 = r12.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r12.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r12.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r12.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r12.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r12.pretty
            if (r0 == 0) goto L2b
            int r0 = r12.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r10 = (long) r0
            long r4 = r8 + r10
            r6 = r13
            r2.putLong(r3, r4, r6)
            long r8 = r8 + r10
            r13 = 8
            long r4 = r8 + r13
            r6 = r15
            r2.putLong(r3, r4, r6)
            int r13 = r0 + 16
            r14 = 58
            r3[r13] = r14
            int r0 = r0 + 17
            r12.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName15Raw(long r13, long r15) {
            r12 = this;
            int r0 = r12.off
            int r1 = r0 + 20
            byte r2 = r12.pretty
            int r3 = r12.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r12.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r12.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r12.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r12.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r12.pretty
            if (r0 == 0) goto L2b
            int r0 = r12.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r10 = (long) r0
            long r4 = r8 + r10
            r6 = r13
            r2.putLong(r3, r4, r6)
            long r8 = r8 + r10
            r13 = 8
            long r4 = r8 + r13
            r6 = r15
            r2.putLong(r3, r4, r6)
            int r13 = r0 + 16
            char r14 = r12.quote
            byte r14 = (byte) r14
            r3[r13] = r14
            int r13 = r0 + 17
            r14 = 58
            r3[r13] = r14
            int r0 = r0 + 18
            r12.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName16Raw(long r13, long r15) {
            r12 = this;
            int r0 = r12.off
            int r1 = r0 + 21
            byte r2 = r12.pretty
            int r3 = r12.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r12.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r12.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r12.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r12.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r12.pretty
            if (r0 == 0) goto L2b
            int r0 = r12.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            int r1 = r0 + 1
            char r2 = r12.quote
            byte r2 = (byte) r2
            r3[r0] = r2
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r10 = (long) r1
            long r4 = r8 + r10
            r6 = r13
            r2.putLong(r3, r4, r6)
            long r8 = r8 + r10
            r13 = 8
            long r4 = r8 + r13
            r6 = r15
            r2.putLong(r3, r4, r6)
            int r13 = r0 + 18
            char r14 = r12.quote
            byte r14 = (byte) r14
            r3[r13] = r14
            int r0 = r0 + 19
            r13 = 58
            r3[r0] = r13
            r12.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName2Raw(long r9) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 10
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r8.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r8.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r8.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r8.pretty
            if (r0 == 0) goto L2b
            int r0 = r8.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r0
            long r4 = r4 + r6
            r6 = r9
            r2.putLong(r3, r4, r6)
            int r0 = r0 + 5
            r8.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName3Raw(long r9) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 10
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r8.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r8.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r8.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r8.pretty
            if (r0 == 0) goto L2b
            int r0 = r8.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r0
            long r4 = r4 + r6
            r6 = r9
            r2.putLong(r3, r4, r6)
            int r0 = r0 + 6
            r8.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName4Raw(long r9) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 10
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r8.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r8.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r8.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r8.pretty
            if (r0 == 0) goto L2b
            int r0 = r8.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r0
            long r4 = r4 + r6
            r6 = r9
            r2.putLong(r3, r4, r6)
            int r0 = r0 + 7
            r8.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName5Raw(long r9) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 10
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r8.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r8.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r8.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r8.pretty
            if (r0 == 0) goto L2b
            int r0 = r8.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r0
            long r4 = r4 + r6
            r6 = r9
            r2.putLong(r3, r4, r6)
            int r0 = r0 + 8
            r8.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName6Raw(long r9) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 11
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r8.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r8.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r8.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r8.pretty
            if (r0 == 0) goto L2b
            int r0 = r8.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r0
            long r4 = r4 + r6
            r6 = r9
            r2.putLong(r3, r4, r6)
            int r9 = r0 + 8
            r10 = 58
            r3[r9] = r10
            int r0 = r0 + 9
            r8.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName7Raw(long r9) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 12
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r8.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r8.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r8.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r8.pretty
            if (r0 == 0) goto L2b
            int r0 = r8.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r0
            long r4 = r4 + r6
            r6 = r9
            r2.putLong(r3, r4, r6)
            int r9 = r0 + 8
            char r10 = r8.quote
            byte r10 = (byte) r10
            r3[r9] = r10
            int r9 = r0 + 9
            r10 = 58
            r3[r9] = r10
            int r0 = r0 + 10
            r8.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName8Raw(long r9) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 13
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r8.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r8.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r8.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r8.pretty
            if (r0 == 0) goto L2b
            int r0 = r8.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            char r1 = r8.quote
            byte r1 = (byte) r1
            r3[r0] = r1
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r0
            long r4 = r4 + r6
            r6 = 1
            long r4 = r4 + r6
            r6 = r9
            r2.putLong(r3, r4, r6)
            int r9 = r0 + 9
            char r10 = r8.quote
            byte r10 = (byte) r10
            r3[r9] = r10
            int r9 = r0 + 10
            r10 = 58
            r3[r9] = r10
            int r0 = r0 + 11
            r8.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName9Raw(long r13, int r15) {
            r12 = this;
            int r0 = r12.off
            int r1 = r0 + 14
            byte r2 = r12.pretty
            int r3 = r12.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r12.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L13
            byte[] r1 = r12.grow(r2)
        L13:
            r3 = r1
            boolean r1 = r12.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r12.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r2 = 44
            r3[r0] = r2
            byte r0 = r12.pretty
            if (r0 == 0) goto L2b
            int r0 = r12.indent(r3, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r10 = (long) r0
            long r4 = r8 + r10
            r6 = r13
            r2.putLong(r3, r4, r6)
            long r8 = r8 + r10
            r13 = 8
            long r8 = r8 + r13
            r2.putInt(r3, r8, r15)
            int r0 = r0 + 12
            r12.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(byte[] r6) {
            r5 = this;
            int r0 = r5.off
            int r1 = r6.length
            int r1 = r1 + r0
            int r1 = r1 + 2
            byte r2 = r5.pretty
            int r3 = r5.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            byte[] r1 = r5.bytes
            int r3 = r1.length
            if (r2 <= r3) goto L15
            byte[] r1 = r5.grow(r2)
        L15:
            boolean r2 = r5.startObject
            r3 = 0
            if (r2 == 0) goto L1d
            r5.startObject = r3
            goto L2d
        L1d:
            int r2 = r0 + 1
            r4 = 44
            r1[r0] = r4
            byte r0 = r5.pretty
            if (r0 == 0) goto L2c
            int r0 = r5.indent(r1, r2)
            goto L2d
        L2c:
            r0 = r2
        L2d:
            int r2 = r6.length
            java.lang.System.arraycopy(r6, r3, r1, r0, r2)
            int r6 = r6.length
            int r0 = r0 + r6
            r5.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.off
            int r0 = r0 + r5
            int r0 = r0 + 2
            int r1 = r2.indent
            int r0 = r0 + r1
            byte[] r1 = r2.bytes
            int r1 = r1.length
            if (r0 < r1) goto L10
            r2.ensureCapacity(r0)
        L10:
            boolean r0 = r2.startObject
            if (r0 == 0) goto L18
            r0 = 0
            r2.startObject = r0
            goto L1b
        L18:
            r2.writeComma()
        L1b:
            byte[] r0 = r2.bytes
            int r1 = r2.off
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            int r3 = r2.off
            int r3 = r3 + r5
            r2.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(char[] r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "UnsupportedOperation"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(char[] r1, int r2, int r3) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperation"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeOffsetDateTime(java.time.OffsetDateTime r7) {
            r6 = this;
            if (r7 != 0) goto L6
            r6.writeNull()
            return
        L6:
            java.time.ZoneOffset r0 = r7.getOffset()
            int r1 = r6.off
            int r1 = r1 + 45
            byte[] r2 = r6.bytes
            int r2 = r2.length
            if (r1 < r2) goto L16
            r6.ensureCapacity(r1)
        L16:
            byte[] r1 = r6.bytes
            int r2 = r6.off
            int r3 = r2 + 1
            char r4 = r6.quote
            byte r4 = (byte) r4
            r1[r2] = r4
            java.time.LocalDateTime r7 = r7.toLocalDateTime()
            java.time.LocalDate r2 = r7.toLocalDate()
            int r4 = r2.getYear()
            int r5 = r2.getMonthValue()
            int r2 = r2.getDayOfMonth()
            int r2 = com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r1, r3, r4, r5, r2)
            int r3 = r2 + 1
            r4 = 84
            r1[r2] = r4
            java.time.LocalTime r7 = r7.toLocalTime()
            int r7 = com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r1, r3, r7)
            int r2 = r0.getTotalSeconds()
            if (r2 != 0) goto L54
            int r0 = r7 + 1
            r2 = 90
            r1[r7] = r2
            goto L65
        L54:
            java.lang.String r0 = r0.getId()
            r2 = 0
            int r3 = r0.length()
            r0.getBytes(r2, r3, r1, r7)
            int r0 = r0.length()
            int r0 = r0 + r7
        L65:
            char r7 = r6.quote
            byte r7 = (byte) r7
            r1[r0] = r7
            int r0 = r0 + 1
            r6.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeOffsetTime(java.time.OffsetTime r6) {
            r5 = this;
            if (r6 != 0) goto L6
            r5.writeNull()
            return
        L6:
            java.time.ZoneOffset r0 = r6.getOffset()
            int r1 = r5.off
            int r1 = r1 + 45
            byte[] r2 = r5.bytes
            int r2 = r2.length
            if (r1 < r2) goto L16
            r5.ensureCapacity(r1)
        L16:
            byte[] r1 = r5.bytes
            int r2 = r5.off
            int r3 = r2 + 1
            char r4 = r5.quote
            byte r4 = (byte) r4
            r1[r2] = r4
            java.time.LocalTime r6 = r6.toLocalTime()
            int r6 = com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r1, r3, r6)
            int r2 = r0.getTotalSeconds()
            if (r2 != 0) goto L36
            int r0 = r6 + 1
            r2 = 90
            r1[r6] = r2
            goto L47
        L36:
            java.lang.String r0 = r0.getId()
            r2 = 0
            int r3 = r0.length()
            r0.getBytes(r2, r3, r1, r6)
            int r0 = r0.length()
            int r0 = r0 + r6
        L47:
            char r6 = r5.quote
            byte r6 = (byte) r6
            r1[r0] = r6
            int r0 = r0 + 1
            r5.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(char r4) {
            r3 = this;
            r0 = 128(0x80, float:1.8E-43)
            if (r4 > r0) goto L1c
            int r0 = r3.off
            byte[] r1 = r3.bytes
            int r1 = r1.length
            if (r0 != r1) goto L10
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
        L10:
            byte[] r0 = r3.bytes
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            byte r4 = (byte) r4
            r0[r1] = r4
            return
        L1c:
            java.lang.String r0 = "not support "
            ah.a.g(r4, r0)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(char r4, char r5) {
            r3 = this;
            java.lang.String r0 = "not support "
            r1 = 128(0x80, float:1.8E-43)
            if (r4 > r1) goto L27
            if (r5 > r1) goto L23
            int r0 = r3.off
            int r1 = r0 + 1
            byte[] r2 = r3.bytes
            int r2 = r2.length
            if (r1 < r2) goto L16
            int r2 = r0 + 2
            r3.ensureCapacity(r2)
        L16:
            byte[] r2 = r3.bytes
            byte r4 = (byte) r4
            r2[r0] = r4
            byte r4 = (byte) r5
            r2[r1] = r4
            int r0 = r0 + 2
            r3.off = r0
            return
        L23:
            ah.a.g(r5, r0)
            return
        L27:
            ah.a.g(r4, r0)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(java.lang.String r7) {
            r6 = this;
            char[] r7 = r7.toCharArray()
            int r0 = r6.off
            int r1 = r7.length
            int r1 = r1 * 3
            int r1 = r1 + r0
            byte[] r2 = r6.bytes
            int r2 = r2.length
            if (r1 < r2) goto L12
            r6.ensureCapacity(r1)
        L12:
            byte[] r1 = r6.bytes
            r2 = 0
        L15:
            int r3 = r7.length
            if (r2 >= r3) goto L5c
            char r3 = r7[r2]
            r4 = 1
            if (r3 < r4) goto L28
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 > r4) goto L28
            int r4 = r0 + 1
            byte r3 = (byte) r3
            r1[r0] = r3
        L26:
            r0 = r4
            goto L59
        L28:
            r4 = 2047(0x7ff, float:2.868E-42)
            if (r3 <= r4) goto L43
            int r4 = r3 >> 12
            r4 = r4 & 15
            r4 = r4 | 224(0xe0, float:3.14E-43)
            byte r4 = (byte) r4
            r1[r0] = r4
            int r4 = r0 + 1
            int r5 = r3 >> 6
            r5 = r5 & 63
            r5 = r5 | 128(0x80, float:1.8E-43)
            byte r5 = (byte) r5
            r1[r4] = r5
            int r0 = r0 + 2
            goto L4f
        L43:
            int r4 = r0 + 1
            int r5 = r3 >> 6
            r5 = r5 & 31
            r5 = r5 | 192(0xc0, float:2.69E-43)
            byte r5 = (byte) r5
            r1[r0] = r5
            r0 = r4
        L4f:
            int r4 = r0 + 1
            r3 = r3 & 63
            r3 = r3 | 128(0x80, float:1.8E-43)
            byte r3 = (byte) r3
            r1[r0] = r3
            goto L26
        L59:
            int r2 = r2 + 1
            goto L15
        L5c:
            r6.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(byte[] r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r5.length
            int r0 = r0 + r1
            byte[] r1 = r4.bytes
            int r1 = r1.length
            if (r0 < r1) goto Lc
            r4.ensureCapacity(r0)
        Lc:
            byte[] r0 = r4.bytes
            int r1 = r4.off
            int r2 = r5.length
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r0, r1, r2)
            int r0 = r4.off
            int r5 = r5.length
            int r0 = r0 + r5
            r4.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeReference(java.lang.String r7) {
            r6 = this;
            r6.lastReference = r7
            int r0 = r6.off
            byte[] r1 = r6.bytes
            int r2 = r0 + 8
            int r3 = r1.length
            if (r2 <= r3) goto Lf
            byte[] r1 = r6.grow(r2)
        Lf:
            r3 = 123(0x7b, float:1.72E-43)
            r1[r0] = r3
            int r3 = r0 + 1
            r4 = 34
            r1[r3] = r4
            int r3 = r0 + 2
            r5 = 36
            r1[r3] = r5
            int r3 = r0 + 3
            r5 = 114(0x72, float:1.6E-43)
            r1[r3] = r5
            int r3 = r0 + 4
            r5 = 101(0x65, float:1.42E-43)
            r1[r3] = r5
            int r3 = r0 + 5
            r5 = 102(0x66, float:1.43E-43)
            r1[r3] = r5
            int r3 = r0 + 6
            r1[r3] = r4
            int r0 = r0 + 7
            r3 = 58
            r1[r0] = r3
            r6.off = r2
            r6.writeString(r7)
            int r7 = r6.off
            byte[] r0 = r6.bytes
            int r1 = r0.length
            if (r7 != r1) goto L4d
            int r0 = r7 + 1
            byte[] r0 = r6.grow(r0)
        L4d:
            r1 = 125(0x7d, float:1.75E-43)
            r0[r7] = r1
            int r7 = r7 + 1
            r6.off = r7
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(byte r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L17
            r4.writeQuote()
        L17:
            r4.writeInt8(r5)
            if (r0 == 0) goto L1f
            r4.writeQuote()
        L1f:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(int r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L17
            r4.writeQuote()
        L17:
            r4.writeInt32(r5)
            if (r0 == 0) goto L1f
            r4.writeQuote()
        L1f:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(long r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L17
            r4.writeQuote()
        L17:
            r4.writeInt64(r5)
            if (r0 == 0) goto L1f
            r4.writeQuote()
        L1f:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(java.lang.String r13) {
            r12 = this;
            if (r13 != 0) goto L6
            r12.writeStringNull()
            return
        L6:
            char[] r1 = r13.toCharArray()
            com.alibaba.fastjson2.JSONWriter$Context r13 = r12.context
            long r2 = r13.features
            com.alibaba.fastjson2.JSONWriter$Feature r13 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r4 = r13.mask
            long r4 = r4 & r2
            r6 = 0
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r0 = 0
            r4 = 1
            r8 = r2
            if (r13 == 0) goto L1e
            r3 = r4
            goto L1f
        L1e:
            r3 = r0
        L1f:
            com.alibaba.fastjson2.JSONWriter$Feature r13 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r10 = r13.mask
            long r8 = r8 & r10
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 == 0) goto L2a
            r13 = r4
            goto L2c
        L2a:
            r13 = r4
            r4 = r0
        L2c:
            int r2 = r12.off
            int r5 = r1.length
            r6 = 2
            r7 = 3
            int r5 = p.a.g(r5, r7, r2, r6)
            if (r4 != 0) goto L39
            if (r3 == 0) goto L3c
        L39:
            int r6 = r1.length
            int r6 = r6 * r7
            int r5 = r5 + r6
        L3c:
            byte[] r6 = r12.bytes
            int r6 = r6.length
            if (r5 < r6) goto L44
            r12.ensureCapacity(r5)
        L44:
            byte[] r5 = r12.bytes
            int r6 = r2 + 1
            char r7 = r12.quote
            byte r7 = (byte) r7
            r5[r2] = r7
        L4d:
            int r2 = r1.length
            if (r0 >= r2) goto L7e
            char r2 = r1[r0]
            char r7 = r12.quote
            if (r2 == r7) goto L7e
            r7 = 92
            if (r2 == r7) goto L7e
            r7 = 32
            if (r2 < r7) goto L7e
            r7 = 127(0x7f, float:1.78E-43)
            if (r2 > r7) goto L7e
            if (r3 == 0) goto L75
            r7 = 60
            if (r2 == r7) goto L7e
            r7 = 62
            if (r2 == r7) goto L7e
            r7 = 40
            if (r2 == r7) goto L7e
            r7 = 41
            if (r2 != r7) goto L75
            goto L7e
        L75:
            int r7 = r6 + 1
            byte r2 = (byte) r2
            r5[r6] = r2
            int r0 = r0 + 1
            r6 = r7
            goto L4d
        L7e:
            int r2 = r1.length
            if (r0 != r2) goto L8a
            char r0 = r12.quote
            byte r0 = (byte) r0
            r5[r6] = r0
            int r6 = r6 + r13
            r12.off = r6
            return
        L8a:
            r12.off = r6
            int r13 = r1.length
            if (r0 >= r13) goto L96
            int r2 = r1.length
            r5 = r0
            r0 = r12
            r0.writeStringEscapedRest(r1, r2, r3, r4, r5)
            goto L97
        L96:
            r0 = r12
        L97:
            byte[] r13 = r0.bytes
            int r1 = r0.off
            int r2 = r1 + 1
            r0.off = r2
            char r2 = r0.quote
            byte r2 = (byte) r2
            r13[r1] = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(java.util.List<java.lang.String> r6) {
            r5 = this;
            byte r0 = r5.pretty
            if (r0 == 0) goto L8
            super.writeString(r6)
            return
        L8:
            int r0 = r5.off
            byte[] r1 = r5.bytes
            int r1 = r1.length
            if (r0 != r1) goto L14
            int r0 = r0 + 1
            r5.grow(r0)
        L14:
            byte[] r0 = r5.bytes
            int r1 = r5.off
            int r2 = r1 + 1
            r5.off = r2
            r2 = 91
            r0[r1] = r2
            int r0 = r6.size()
            r1 = 0
        L25:
            if (r1 >= r0) goto L4d
            if (r1 == 0) goto L41
            int r2 = r5.off
            byte[] r3 = r5.bytes
            int r3 = r3.length
            if (r2 != r3) goto L35
            int r2 = r2 + 1
            r5.ensureCapacity(r2)
        L35:
            byte[] r2 = r5.bytes
            int r3 = r5.off
            int r4 = r3 + 1
            r5.off = r4
            r4 = 44
            r2[r3] = r4
        L41:
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r5.writeString(r2)
            int r1 = r1 + 1
            goto L25
        L4d:
            int r6 = r5.off
            byte[] r0 = r5.bytes
            int r0 = r0.length
            if (r6 != r0) goto L59
            int r6 = r6 + 1
            r5.ensureCapacity(r6)
        L59:
            byte[] r6 = r5.bytes
            int r0 = r5.off
            int r1 = r0 + 1
            r5.off = r1
            r1 = 93
            r6[r0] = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(short r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L17
            r4.writeQuote()
        L17:
            r4.writeInt16(r5)
            if (r0 == 0) goto L1f
            r4.writeQuote()
        L1f:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(boolean r5) {
            r4 = this;
            char r0 = r4.quote
            byte r0 = (byte) r0
            byte[] r1 = r4.bytes
            int r2 = r4.off
            int r3 = r2 + 1
            r4.off = r3
            r1[r2] = r0
            r4.writeBool(r5)
            byte[] r5 = r4.bytes
            int r1 = r4.off
            int r2 = r1 + 1
            r4.off = r2
            r5[r1] = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] r14) {
            r13 = this;
            if (r14 != 0) goto L6
            r13.writeStringNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r13.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r6 = 1
            if (r2 == 0) goto L19
            r10 = r6
            goto L1a
        L19:
            r10 = r3
        L1a:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r7 = r2.mask
            long r0 = r0 & r7
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L25
            r11 = r6
            goto L26
        L25:
            r11 = r3
        L26:
            int r0 = r13.off
            int r1 = r14.length
            r2 = 3
            r4 = 2
            int r1 = p.a.g(r1, r2, r0, r4)
            if (r11 != 0) goto L33
            if (r10 == 0) goto L36
        L33:
            int r5 = r14.length
            int r5 = r5 * r2
            int r1 = r1 + r5
        L36:
            byte[] r2 = r13.bytes
            int r2 = r2.length
            if (r1 < r2) goto L3e
            r13.ensureCapacity(r1)
        L3e:
            byte[] r1 = r13.bytes
            int r2 = r0 + 1
            char r5 = r13.quote
            byte r5 = (byte) r5
            r1[r0] = r5
            r12 = r3
        L48:
            int r0 = r14.length
            if (r12 >= r0) goto L79
            char r0 = r14[r12]
            char r3 = r13.quote
            if (r0 == r3) goto L79
            r3 = 92
            if (r0 == r3) goto L79
            r3 = 32
            if (r0 < r3) goto L79
            r3 = 127(0x7f, float:1.78E-43)
            if (r0 > r3) goto L79
            if (r10 == 0) goto L70
            r3 = 60
            if (r0 == r3) goto L79
            r3 = 62
            if (r0 == r3) goto L79
            r3 = 40
            if (r0 == r3) goto L79
            r3 = 41
            if (r0 != r3) goto L70
            goto L79
        L70:
            int r3 = r2 + 1
            byte r0 = (byte) r0
            r1[r2] = r0
            int r12 = r12 + 1
            r2 = r3
            goto L48
        L79:
            r13.off = r2
            int r0 = r14.length
            int r0 = r0 - r12
            int r0 = r0 * 6
            int r0 = r0 + r2
            int r0 = r0 + r4
            byte[] r1 = r13.bytes
            int r1 = r1.length
            if (r0 < r1) goto L89
            r13.ensureCapacity(r0)
        L89:
            int r0 = r14.length
            if (r12 >= r0) goto L93
            int r9 = r14.length
            r7 = r13
            r8 = r14
            r7.writeStringEscapedRest(r8, r9, r10, r11, r12)
            goto L94
        L93:
            r7 = r13
        L94:
            byte[] r14 = r7.bytes
            int r0 = r7.off
            int r1 = r0 + 1
            r7.off = r1
            char r1 = r7.quote
            byte r1 = (byte) r1
            r14[r0] = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] r11, int r12, int r13) {
            r10 = this;
            if (r11 != 0) goto L1b
            com.alibaba.fastjson2.JSONWriter$Feature r11 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r11 = r11.mask
            com.alibaba.fastjson2.JSONWriter$Feature r13 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty
            long r0 = r13.mask
            long r11 = r11 | r0
            boolean r11 = r10.isEnabled(r11)
            if (r11 == 0) goto L17
            java.lang.String r11 = ""
            r10.writeString(r11)
            return
        L17:
            r10.writeNull()
            return
        L1b:
            int r2 = r12 + r13
            com.alibaba.fastjson2.JSONWriter$Context r0 = r10.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r3 = r3.mask
            long r3 = r3 & r0
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            r7 = 1
            if (r3 == 0) goto L30
            r3 = r7
            goto L31
        L30:
            r3 = r4
        L31:
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r8 = r8.mask
            long r0 = r0 & r8
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L3b
            r4 = r7
        L3b:
            int r0 = r10.off
            int r13 = r13 * 3
            int r1 = r0 + r13
            int r1 = r1 + 2
            if (r4 != 0) goto L47
            if (r3 == 0) goto L48
        L47:
            int r1 = r1 + r13
        L48:
            byte[] r13 = r10.bytes
            int r13 = r13.length
            if (r1 < r13) goto L50
            r10.ensureCapacity(r1)
        L50:
            byte[] r13 = r10.bytes
            int r1 = r0 + 1
            char r5 = r10.quote
            byte r5 = (byte) r5
            r13[r0] = r5
            r5 = r12
        L5a:
            if (r5 >= r2) goto L8a
            char r12 = r11[r5]
            char r0 = r10.quote
            if (r12 == r0) goto L8a
            r0 = 92
            if (r12 == r0) goto L8a
            r0 = 32
            if (r12 < r0) goto L8a
            r0 = 127(0x7f, float:1.78E-43)
            if (r12 > r0) goto L8a
            if (r3 == 0) goto L81
            r0 = 60
            if (r12 == r0) goto L8a
            r0 = 62
            if (r12 == r0) goto L8a
            r0 = 40
            if (r12 == r0) goto L8a
            r0 = 41
            if (r12 != r0) goto L81
            goto L8a
        L81:
            int r0 = r1 + 1
            byte r12 = (byte) r12
            r13[r1] = r12
            int r5 = r5 + 1
            r1 = r0
            goto L5a
        L8a:
            r10.off = r1
            int r12 = r2 - r5
            int r12 = r12 * 6
            int r12 = r12 + r1
            int r12 = r12 + 2
            byte[] r13 = r10.bytes
            int r13 = r13.length
            if (r12 < r13) goto L9b
            r10.ensureCapacity(r12)
        L9b:
            r0 = r10
            if (r5 >= r2) goto La2
            r1 = r11
            r0.writeStringEscapedRest(r1, r2, r3, r4, r5)
        La2:
            byte[] r11 = r0.bytes
            int r12 = r0.off
            int r13 = r12 + 1
            r0.off = r13
            char r13 = r0.quote
            byte r13 = (byte) r13
            r11[r12] = r13
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] r17, int r18, int r19, boolean r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            com.alibaba.fastjson2.JSONWriter$Context r2 = r0.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r4 = r4.mask
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            if (r2 == 0) goto L16
            r2 = r3
            goto L17
        L16:
            r2 = 0
        L17:
            int r4 = r0.off
            int r5 = r1.length
            r6 = 3
            r7 = 2
            int r4 = p.a.g(r5, r6, r4, r7)
            if (r2 == 0) goto L25
            int r5 = r19 * 3
            int r4 = r4 + r5
        L25:
            byte[] r5 = r0.bytes
            int r5 = r5.length
            if (r4 < r5) goto L2d
            r0.ensureCapacity(r4)
        L2d:
            byte[] r4 = r0.bytes
            int r5 = r0.off
            if (r20 == 0) goto L3b
            int r6 = r5 + 1
            char r8 = r0.quote
            byte r8 = (byte) r8
            r4[r5] = r8
            r5 = r6
        L3b:
            int r6 = r18 + r19
            r8 = r5
            r5 = r18
        L40:
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 92
            if (r5 >= r6) goto L5e
            char r11 = r1[r5]
            char r12 = r0.quote
            if (r11 == r12) goto L5e
            if (r11 == r10) goto L5e
            r12 = 32
            if (r11 < r12) goto L5e
            if (r11 <= r9) goto L55
            goto L5e
        L55:
            int r9 = r8 + 1
            byte r10 = (byte) r11
            r4[r8] = r10
            int r5 = r5 + 1
            r8 = r9
            goto L40
        L5e:
            if (r5 != r6) goto L6d
            if (r20 == 0) goto L6a
            int r1 = r8 + 1
            char r2 = r0.quote
            byte r2 = (byte) r2
            r4[r8] = r2
            r8 = r1
        L6a:
            r0.off = r8
            return
        L6d:
            if (r5 >= r6) goto L209
            char r11 = r1[r5]
            r12 = 117(0x75, float:1.64E-43)
            if (r11 > r9) goto L138
            if (r11 == r10) goto L130
            r13 = 49
            r14 = 48
            switch(r11) {
                case 0: goto L115;
                case 1: goto L115;
                case 2: goto L115;
                case 3: goto L115;
                case 4: goto L115;
                case 5: goto L115;
                case 6: goto L115;
                case 7: goto L115;
                case 8: goto L10b;
                case 9: goto L101;
                case 10: goto Lf8;
                case 11: goto Lde;
                case 12: goto Ld5;
                case 13: goto Lcc;
                case 14: goto Lde;
                case 15: goto Lde;
                case 16: goto Lb2;
                case 17: goto Lb2;
                case 18: goto Lb2;
                case 19: goto Lb2;
                case 20: goto Lb2;
                case 21: goto Lb2;
                case 22: goto Lb2;
                case 23: goto Lb2;
                case 24: goto Lb2;
                case 25: goto Lb2;
                case 26: goto L95;
                case 27: goto L95;
                case 28: goto L95;
                case 29: goto L95;
                case 30: goto L95;
                case 31: goto L95;
                default: goto L7e;
            }
        L7e:
            char r12 = r0.quote
            if (r11 != r12) goto L8d
            r4[r8] = r10
            int r11 = r8 + 1
            byte r12 = (byte) r12
            r4[r11] = r12
        L89:
            int r8 = r8 + 2
            goto L206
        L8d:
            int r12 = r8 + 1
            byte r11 = (byte) r11
            r4[r8] = r11
            r8 = r12
            goto L206
        L95:
            r4[r8] = r10
            int r15 = r8 + 1
            r4[r15] = r12
            int r12 = r8 + 2
            r4[r12] = r14
            int r12 = r8 + 3
            r4[r12] = r14
            int r12 = r8 + 4
            r4[r12] = r13
            int r12 = r8 + 5
            int r11 = r11 + 71
            byte r11 = (byte) r11
            r4[r12] = r11
        Lae:
            int r8 = r8 + 6
            goto L206
        Lb2:
            r4[r8] = r10
            int r15 = r8 + 1
            r4[r15] = r12
            int r12 = r8 + 2
            r4[r12] = r14
            int r12 = r8 + 3
            r4[r12] = r14
            int r12 = r8 + 4
            r4[r12] = r13
            int r12 = r8 + 5
            int r11 = r11 + 32
            byte r11 = (byte) r11
            r4[r12] = r11
            goto Lae
        Lcc:
            r4[r8] = r10
            int r11 = r8 + 1
            r12 = 114(0x72, float:1.6E-43)
            r4[r11] = r12
            goto L89
        Ld5:
            r4[r8] = r10
            int r11 = r8 + 1
            r12 = 102(0x66, float:1.43E-43)
            r4[r11] = r12
            goto L89
        Lde:
            r4[r8] = r10
            int r13 = r8 + 1
            r4[r13] = r12
            int r12 = r8 + 2
            r4[r12] = r14
            int r12 = r8 + 3
            r4[r12] = r14
            int r12 = r8 + 4
            r4[r12] = r14
            int r12 = r8 + 5
            int r11 = r11 + 87
            byte r11 = (byte) r11
            r4[r12] = r11
            goto Lae
        Lf8:
            r4[r8] = r10
            int r11 = r8 + 1
            r12 = 110(0x6e, float:1.54E-43)
            r4[r11] = r12
            goto L89
        L101:
            r4[r8] = r10
            int r11 = r8 + 1
            r12 = 116(0x74, float:1.63E-43)
            r4[r11] = r12
            goto L89
        L10b:
            r4[r8] = r10
            int r11 = r8 + 1
            r12 = 98
            r4[r11] = r12
            goto L89
        L115:
            r4[r8] = r10
            int r13 = r8 + 1
            r4[r13] = r12
            int r12 = r8 + 2
            r4[r12] = r14
            int r12 = r8 + 3
            r4[r12] = r14
            int r12 = r8 + 4
            r4[r12] = r14
            int r12 = r8 + 5
            int r11 = r11 + 48
            byte r11 = (byte) r11
            r4[r12] = r11
            goto Lae
        L130:
            r4[r8] = r10
            int r11 = r8 + 1
            r4[r11] = r10
            goto L89
        L138:
            if (r2 == 0) goto L16e
            r4[r8] = r10
            int r13 = r8 + 1
            r4[r13] = r12
            int r12 = r8 + 2
            char[] r13 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r14 = r11 >>> 12
            r14 = r14 & 15
            char r14 = r13[r14]
            byte r14 = (byte) r14
            r4[r12] = r14
            int r12 = r8 + 3
            int r14 = r11 >>> 8
            r14 = r14 & 15
            char r14 = r13[r14]
            byte r14 = (byte) r14
            r4[r12] = r14
            int r12 = r8 + 4
            int r14 = r11 >>> 4
            r14 = r14 & 15
            char r14 = r13[r14]
            byte r14 = (byte) r14
            r4[r12] = r14
            int r12 = r8 + 5
            r11 = r11 & 15
            char r11 = r13[r11]
            byte r11 = (byte) r11
            r4[r12] = r11
            goto Lae
        L16e:
            r12 = 55296(0xd800, float:7.7486E-41)
            r13 = 63
            if (r11 < r12) goto L1cf
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r11 >= r12) goto L1cf
            r14 = 56320(0xdc00, float:7.8921E-41)
            if (r11 >= r14) goto L1ca
            int r15 = r1.length
            int r15 = r15 - r5
            if (r15 >= r7) goto L185
            r11 = -1
            goto L194
        L185:
            int r15 = r5 + 1
            char r15 = r1[r15]
            if (r15 < r14) goto L1c5
            if (r15 >= r12) goto L1c5
            int r11 = r11 << 10
            int r11 = r11 + r15
            r12 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r11 = r11 + r12
        L194:
            if (r11 >= 0) goto L19b
            int r11 = r8 + 1
            r4[r8] = r13
            goto L1c3
        L19b:
            int r12 = r11 >> 18
            r12 = r12 | 240(0xf0, float:3.36E-43)
            byte r12 = (byte) r12
            r4[r8] = r12
            int r12 = r8 + 1
            int r14 = r11 >> 12
            r14 = r14 & r13
            r14 = r14 | 128(0x80, float:1.8E-43)
            byte r14 = (byte) r14
            r4[r12] = r14
            int r12 = r8 + 2
            int r14 = r11 >> 6
            r13 = r13 & r14
            r13 = r13 | 128(0x80, float:1.8E-43)
            byte r13 = (byte) r13
            r4[r12] = r13
            int r12 = r8 + 3
            r11 = r11 & 63
            r11 = r11 | 128(0x80, float:1.8E-43)
            byte r11 = (byte) r11
            r4[r12] = r11
            int r11 = r8 + 4
            int r5 = r5 + 1
        L1c3:
            r8 = r11
            goto L206
        L1c5:
            int r11 = r8 + 1
            r4[r8] = r13
            goto L1c3
        L1ca:
            int r11 = r8 + 1
            r4[r8] = r13
            goto L1c3
        L1cf:
            r12 = 2047(0x7ff, float:2.868E-42)
            if (r11 <= r12) goto L1f2
            int r12 = r11 >> 12
            r12 = r12 & 15
            r12 = r12 | 224(0xe0, float:3.14E-43)
            byte r12 = (byte) r12
            r4[r8] = r12
            int r12 = r8 + 1
            int r14 = r11 >> 6
            r13 = r13 & r14
            r13 = r13 | 128(0x80, float:1.8E-43)
            byte r13 = (byte) r13
            r4[r12] = r13
            int r12 = r8 + 2
            r11 = r11 & 63
            r11 = r11 | 128(0x80, float:1.8E-43)
            byte r11 = (byte) r11
            r4[r12] = r11
            int r8 = r8 + 3
            goto L206
        L1f2:
            int r12 = r11 >> 6
            r12 = r12 & 31
            r12 = r12 | 192(0xc0, float:2.69E-43)
            byte r12 = (byte) r12
            r4[r8] = r12
            int r12 = r8 + 1
            r11 = r11 & 63
            r11 = r11 | 128(0x80, float:1.8E-43)
            byte r11 = (byte) r11
            r4[r12] = r11
            goto L89
        L206:
            int r5 = r5 + r3
            goto L6d
        L209:
            if (r20 == 0) goto L213
            int r1 = r8 + 1
            char r2 = r0.quote
            byte r2 = (byte) r2
            r4[r8] = r2
            r8 = r1
        L213:
            r0.off = r8
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(java.lang.String[] r6) {
            r5 = this;
            if (r6 != 0) goto L6
            r5.writeArrayNull()
            return
        L6:
            r5.startArray()
            r0 = 0
        La:
            int r1 = r6.length
            if (r0 >= r1) goto L35
            if (r0 == 0) goto L12
            r5.writeComma()
        L12:
            r1 = r6[r0]
            if (r1 != 0) goto L2f
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r1 = r1.mask
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty
            long r3 = r3.mask
            long r1 = r1 | r3
            boolean r1 = r5.isEnabled(r1)
            if (r1 == 0) goto L2b
            java.lang.String r1 = ""
            r5.writeString(r1)
            goto L32
        L2b:
            r5.writeNull()
            goto L32
        L2f:
            r5.writeString(r1)
        L32:
            int r0 = r0 + 1
            goto La
        L35:
            r5.endArray()
            return
    }

    public void writeStringEscaped(byte[] r12) {
            r11 = this;
            int r0 = r11.off
            int r1 = r12.length
            r2 = 2
            r3 = 6
            int r0 = p.a.g(r1, r3, r0, r2)
            byte[] r1 = r11.bytes
            int r1 = r1.length
            if (r0 < r1) goto L11
            r11.ensureCapacity(r0)
        L11:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r11.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r4 = r2.mask
            long r0 = r0 & r4
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L24
            r0 = r2
            goto L25
        L24:
            r0 = r1
        L25:
            byte[] r4 = r11.bytes
            int r5 = r11.off
            int r6 = r5 + 1
            char r7 = r11.quote
            byte r7 = (byte) r7
            r4[r5] = r7
        L30:
            int r5 = r12.length
            if (r1 >= r5) goto L152
            r5 = r12[r1]
            r7 = 40
            r8 = 117(0x75, float:1.64E-43)
            r9 = 48
            r10 = 92
            if (r5 == r7) goto L120
            r7 = 41
            if (r5 == r7) goto L120
            r7 = 60
            if (r5 == r7) goto L120
            r7 = 62
            if (r5 == r7) goto L120
            if (r5 == r10) goto L118
            r7 = 49
            switch(r5) {
                case 0: goto Lfd;
                case 1: goto Lfd;
                case 2: goto Lfd;
                case 3: goto Lfd;
                case 4: goto Lfd;
                case 5: goto Lfd;
                case 6: goto Lfd;
                case 7: goto Lfd;
                case 8: goto Lf3;
                case 9: goto Le9;
                case 10: goto Ldf;
                case 11: goto Lc5;
                case 12: goto Lbc;
                case 13: goto Lb3;
                case 14: goto Lc5;
                case 15: goto Lc5;
                case 16: goto L99;
                case 17: goto L99;
                case 18: goto L99;
                case 19: goto L99;
                case 20: goto L99;
                case 21: goto L99;
                case 22: goto L99;
                case 23: goto L99;
                case 24: goto L99;
                case 25: goto L99;
                case 26: goto L7c;
                case 27: goto L7c;
                case 28: goto L7c;
                case 29: goto L7c;
                case 30: goto L7c;
                case 31: goto L7c;
                default: goto L52;
            }
        L52:
            char r7 = r11.quote
            if (r5 != r7) goto L61
            r4[r6] = r10
            int r5 = r6 + 1
            byte r7 = (byte) r7
            r4[r5] = r7
        L5d:
            int r6 = r6 + 2
            goto L14e
        L61:
            if (r5 >= 0) goto L75
            r7 = r5 & 255(0xff, float:3.57E-43)
            int r7 = r7 >> r3
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r4[r6] = r7
            int r7 = r6 + 1
            r5 = r5 & 63
            r5 = r5 | 128(0x80, float:1.8E-43)
            byte r5 = (byte) r5
            r4[r7] = r5
            goto L5d
        L75:
            int r7 = r6 + 1
            r4[r6] = r5
        L79:
            r6 = r7
            goto L14e
        L7c:
            r4[r6] = r10
            int r10 = r6 + 1
            r4[r10] = r8
            int r8 = r6 + 2
            r4[r8] = r9
            int r8 = r6 + 3
            r4[r8] = r9
            int r8 = r6 + 4
            r4[r8] = r7
            int r7 = r6 + 5
            int r5 = r5 + 71
            byte r5 = (byte) r5
            r4[r7] = r5
        L95:
            int r6 = r6 + 6
            goto L14e
        L99:
            r4[r6] = r10
            int r10 = r6 + 1
            r4[r10] = r8
            int r8 = r6 + 2
            r4[r8] = r9
            int r8 = r6 + 3
            r4[r8] = r9
            int r8 = r6 + 4
            r4[r8] = r7
            int r7 = r6 + 5
            int r5 = r5 + 32
            byte r5 = (byte) r5
            r4[r7] = r5
            goto L95
        Lb3:
            r4[r6] = r10
            int r5 = r6 + 1
            r7 = 114(0x72, float:1.6E-43)
            r4[r5] = r7
            goto L5d
        Lbc:
            r4[r6] = r10
            int r5 = r6 + 1
            r7 = 102(0x66, float:1.43E-43)
            r4[r5] = r7
            goto L5d
        Lc5:
            r4[r6] = r10
            int r7 = r6 + 1
            r4[r7] = r8
            int r7 = r6 + 2
            r4[r7] = r9
            int r7 = r6 + 3
            r4[r7] = r9
            int r7 = r6 + 4
            r4[r7] = r9
            int r7 = r6 + 5
            int r5 = r5 + 87
            byte r5 = (byte) r5
            r4[r7] = r5
            goto L95
        Ldf:
            r4[r6] = r10
            int r5 = r6 + 1
            r7 = 110(0x6e, float:1.54E-43)
            r4[r5] = r7
            goto L5d
        Le9:
            r4[r6] = r10
            int r5 = r6 + 1
            r7 = 116(0x74, float:1.63E-43)
            r4[r5] = r7
            goto L5d
        Lf3:
            r4[r6] = r10
            int r5 = r6 + 1
            r7 = 98
            r4[r5] = r7
            goto L5d
        Lfd:
            r4[r6] = r10
            int r7 = r6 + 1
            r4[r7] = r8
            int r7 = r6 + 2
            r4[r7] = r9
            int r7 = r6 + 3
            r4[r7] = r9
            int r7 = r6 + 4
            r4[r7] = r9
            int r7 = r6 + 5
            int r5 = r5 + 48
            byte r5 = (byte) r5
            r4[r7] = r5
            goto L95
        L118:
            r4[r6] = r10
            int r5 = r6 + 1
            r4[r5] = r10
            goto L5d
        L120:
            if (r0 == 0) goto L148
            r4[r6] = r10
            int r7 = r6 + 1
            r4[r7] = r8
            int r7 = r6 + 2
            r4[r7] = r9
            int r7 = r6 + 3
            r4[r7] = r9
            int r7 = r6 + 4
            char[] r8 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r9 = r5 >>> 4
            r9 = r9 & 15
            char r9 = r8[r9]
            byte r9 = (byte) r9
            r4[r7] = r9
            int r7 = r6 + 5
            r5 = r5 & 15
            char r5 = r8[r5]
            byte r5 = (byte) r5
            r4[r7] = r5
            goto L95
        L148:
            int r7 = r6 + 1
            r4[r6] = r5
            goto L79
        L14e:
            int r1 = r1 + 1
            goto L30
        L152:
            char r12 = r11.quote
            byte r12 = (byte) r12
            r4[r6] = r12
            int r6 = r6 + r2
            r11.off = r6
            return
    }

    public final void writeStringEscapedRest(char[] r9, int r10, boolean r11, boolean r12, int r13) {
            r8 = this;
            int r0 = r9.length
            int r0 = r0 - r13
            int r1 = r8.off
            r2 = 6
            r3 = 2
            int r0 = p.a.g(r0, r2, r1, r3)
            byte[] r1 = r8.bytes
            int r1 = r1.length
            if (r0 < r1) goto L12
            r8.ensureCapacity(r0)
        L12:
            byte[] r0 = r8.bytes
            int r1 = r8.off
        L16:
            if (r13 >= r10) goto L1f6
            char r2 = r9[r13]
            r4 = 127(0x7f, float:1.78E-43)
            r5 = 117(0x75, float:1.64E-43)
            r6 = 92
            if (r2 > r4) goto L124
            r4 = 40
            r7 = 48
            if (r2 == r4) goto Lf5
            r4 = 41
            if (r2 == r4) goto Lf5
            r4 = 60
            if (r2 == r4) goto Lf5
            r4 = 62
            if (r2 == r4) goto Lf5
            if (r2 == r6) goto Led
            r4 = 49
            switch(r2) {
                case 0: goto Ld2;
                case 1: goto Ld2;
                case 2: goto Ld2;
                case 3: goto Ld2;
                case 4: goto Ld2;
                case 5: goto Ld2;
                case 6: goto Ld2;
                case 7: goto Ld2;
                case 8: goto Lc8;
                case 9: goto Lbe;
                case 10: goto Lb5;
                case 11: goto L9b;
                case 12: goto L92;
                case 13: goto L89;
                case 14: goto L9b;
                case 15: goto L9b;
                case 16: goto L6f;
                case 17: goto L6f;
                case 18: goto L6f;
                case 19: goto L6f;
                case 20: goto L6f;
                case 21: goto L6f;
                case 22: goto L6f;
                case 23: goto L6f;
                case 24: goto L6f;
                case 25: goto L6f;
                case 26: goto L52;
                case 27: goto L52;
                case 28: goto L52;
                case 29: goto L52;
                case 30: goto L52;
                case 31: goto L52;
                default: goto L3b;
            }
        L3b:
            char r4 = r8.quote
            if (r2 != r4) goto L4a
            r0[r1] = r6
            int r2 = r1 + 1
            byte r4 = (byte) r4
            r0[r2] = r4
        L46:
            int r1 = r1 + 2
            goto L1f2
        L4a:
            int r4 = r1 + 1
            byte r2 = (byte) r2
            r0[r1] = r2
        L4f:
            r1 = r4
            goto L1f2
        L52:
            r0[r1] = r6
            int r6 = r1 + 1
            r0[r6] = r5
            int r5 = r1 + 2
            r0[r5] = r7
            int r5 = r1 + 3
            r0[r5] = r7
            int r5 = r1 + 4
            r0[r5] = r4
            int r4 = r1 + 5
            int r2 = r2 + 71
            byte r2 = (byte) r2
            r0[r4] = r2
        L6b:
            int r1 = r1 + 6
            goto L1f2
        L6f:
            r0[r1] = r6
            int r6 = r1 + 1
            r0[r6] = r5
            int r5 = r1 + 2
            r0[r5] = r7
            int r5 = r1 + 3
            r0[r5] = r7
            int r5 = r1 + 4
            r0[r5] = r4
            int r4 = r1 + 5
            int r2 = r2 + 32
            byte r2 = (byte) r2
            r0[r4] = r2
            goto L6b
        L89:
            r0[r1] = r6
            int r2 = r1 + 1
            r4 = 114(0x72, float:1.6E-43)
            r0[r2] = r4
            goto L46
        L92:
            r0[r1] = r6
            int r2 = r1 + 1
            r4 = 102(0x66, float:1.43E-43)
            r0[r2] = r4
            goto L46
        L9b:
            r0[r1] = r6
            int r4 = r1 + 1
            r0[r4] = r5
            int r4 = r1 + 2
            r0[r4] = r7
            int r4 = r1 + 3
            r0[r4] = r7
            int r4 = r1 + 4
            r0[r4] = r7
            int r4 = r1 + 5
            int r2 = r2 + 87
            byte r2 = (byte) r2
            r0[r4] = r2
            goto L6b
        Lb5:
            r0[r1] = r6
            int r2 = r1 + 1
            r4 = 110(0x6e, float:1.54E-43)
            r0[r2] = r4
            goto L46
        Lbe:
            r0[r1] = r6
            int r2 = r1 + 1
            r4 = 116(0x74, float:1.63E-43)
            r0[r2] = r4
            goto L46
        Lc8:
            r0[r1] = r6
            int r2 = r1 + 1
            r4 = 98
            r0[r2] = r4
            goto L46
        Ld2:
            r0[r1] = r6
            int r4 = r1 + 1
            r0[r4] = r5
            int r4 = r1 + 2
            r0[r4] = r7
            int r4 = r1 + 3
            r0[r4] = r7
            int r4 = r1 + 4
            r0[r4] = r7
            int r4 = r1 + 5
            int r2 = r2 + 48
            byte r2 = (byte) r2
            r0[r4] = r2
            goto L6b
        Led:
            r0[r1] = r6
            int r2 = r1 + 1
            r0[r2] = r6
            goto L46
        Lf5:
            if (r11 == 0) goto L11d
            r0[r1] = r6
            int r4 = r1 + 1
            r0[r4] = r5
            int r4 = r1 + 2
            r0[r4] = r7
            int r4 = r1 + 3
            r0[r4] = r7
            int r4 = r1 + 4
            char[] r5 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r6 = r2 >>> 4
            r6 = r6 & 15
            char r6 = r5[r6]
            byte r6 = (byte) r6
            r0[r4] = r6
            int r4 = r1 + 5
            r2 = r2 & 15
            char r2 = r5[r2]
            byte r2 = (byte) r2
            r0[r4] = r2
            goto L6b
        L11d:
            int r4 = r1 + 1
            byte r2 = (byte) r2
            r0[r1] = r2
            goto L4f
        L124:
            if (r12 == 0) goto L15a
            r0[r1] = r6
            int r4 = r1 + 1
            r0[r4] = r5
            int r4 = r1 + 2
            char[] r5 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r6 = r2 >>> 12
            r6 = r6 & 15
            char r6 = r5[r6]
            byte r6 = (byte) r6
            r0[r4] = r6
            int r4 = r1 + 3
            int r6 = r2 >>> 8
            r6 = r6 & 15
            char r6 = r5[r6]
            byte r6 = (byte) r6
            r0[r4] = r6
            int r4 = r1 + 4
            int r6 = r2 >>> 4
            r6 = r6 & 15
            char r6 = r5[r6]
            byte r6 = (byte) r6
            r0[r4] = r6
            int r4 = r1 + 5
            r2 = r2 & 15
            char r2 = r5[r2]
            byte r2 = (byte) r2
            r0[r4] = r2
            goto L6b
        L15a:
            r4 = 55296(0xd800, float:7.7486E-41)
            r5 = 63
            if (r2 < r4) goto L1bb
            r4 = 57344(0xe000, float:8.0356E-41)
            if (r2 >= r4) goto L1bb
            r6 = 56320(0xdc00, float:7.8921E-41)
            if (r2 >= r6) goto L1b6
            int r7 = r9.length
            int r7 = r7 - r13
            if (r7 >= r3) goto L171
            r2 = -1
            goto L180
        L171:
            int r7 = r13 + 1
            char r7 = r9[r7]
            if (r7 < r6) goto L1b1
            if (r7 >= r4) goto L1b1
            int r2 = r2 << 10
            int r2 = r2 + r7
            r4 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r2 = r2 + r4
        L180:
            if (r2 >= 0) goto L187
            int r2 = r1 + 1
            r0[r1] = r5
            goto L1af
        L187:
            int r4 = r2 >> 18
            r4 = r4 | 240(0xf0, float:3.36E-43)
            byte r4 = (byte) r4
            r0[r1] = r4
            int r4 = r1 + 1
            int r6 = r2 >> 12
            r6 = r6 & r5
            r6 = r6 | 128(0x80, float:1.8E-43)
            byte r6 = (byte) r6
            r0[r4] = r6
            int r4 = r1 + 2
            int r6 = r2 >> 6
            r5 = r5 & r6
            r5 = r5 | 128(0x80, float:1.8E-43)
            byte r5 = (byte) r5
            r0[r4] = r5
            int r4 = r1 + 3
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r0[r4] = r2
            int r2 = r1 + 4
            int r13 = r13 + 1
        L1af:
            r1 = r2
            goto L1f2
        L1b1:
            int r2 = r1 + 1
            r0[r1] = r5
            goto L1af
        L1b6:
            int r2 = r1 + 1
            r0[r1] = r5
            goto L1af
        L1bb:
            r4 = 2047(0x7ff, float:2.868E-42)
            if (r2 <= r4) goto L1de
            int r4 = r2 >> 12
            r4 = r4 & 15
            r4 = r4 | 224(0xe0, float:3.14E-43)
            byte r4 = (byte) r4
            r0[r1] = r4
            int r4 = r1 + 1
            int r6 = r2 >> 6
            r5 = r5 & r6
            r5 = r5 | 128(0x80, float:1.8E-43)
            byte r5 = (byte) r5
            r0[r4] = r5
            int r4 = r1 + 2
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r0[r4] = r2
            int r1 = r1 + 3
            goto L1f2
        L1de:
            int r4 = r2 >> 6
            r4 = r4 & 31
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r0[r1] = r4
            int r4 = r1 + 1
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r0[r4] = r2
            goto L46
        L1f2:
            int r13 = r13 + 1
            goto L16
        L1f6:
            r8.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringLatin1(byte[] r8) {
            r7 = this;
            if (r8 != 0) goto L6
            r7.writeStringNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r7.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            char r3 = r7.quote
            byte r3 = (byte) r3
            r4 = r1
        L1e:
            int r5 = r8.length
            if (r4 >= r5) goto L45
            r5 = r8[r4]
            if (r5 == r3) goto L43
            r6 = 92
            if (r5 == r6) goto L43
            r6 = 32
            if (r5 < r6) goto L43
            if (r0 == 0) goto L40
            r6 = 60
            if (r5 == r6) goto L43
            r6 = 62
            if (r5 == r6) goto L43
            r6 = 40
            if (r5 == r6) goto L43
            r6 = 41
            if (r5 != r6) goto L40
            goto L43
        L40:
            int r4 = r4 + 1
            goto L1e
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r1
        L46:
            int r4 = r7.off
            if (r0 != 0) goto L69
            int r0 = r8.length
            int r0 = r0 + r4
            int r0 = r0 + 2
            byte[] r5 = r7.bytes
            int r5 = r5.length
            if (r0 < r5) goto L56
            r7.ensureCapacity(r0)
        L56:
            byte[] r0 = r7.bytes
            r0[r4] = r3
            int r5 = r4 + 1
            int r6 = r8.length
            java.lang.System.arraycopy(r8, r1, r0, r5, r6)
            int r8 = r8.length
            int r8 = r8 + r2
            int r8 = r8 + r4
            r0[r8] = r3
            int r8 = r8 + r2
            r7.off = r8
            return
        L69:
            r7.writeStringEscaped(r8)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringUTF16(byte[] r15) {
            r14 = this;
            if (r15 != 0) goto L6
            r14.writeStringNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r14.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r6 = 1
            if (r2 == 0) goto L19
            r2 = r6
            goto L1a
        L19:
            r2 = r3
        L1a:
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r7 = r7.mask
            long r0 = r0 & r7
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L25
            r0 = r6
            goto L26
        L25:
            r0 = r3
        L26:
            int r1 = r14.off
            int r4 = r15.length
            r5 = 4
            r7 = 2
            int r4 = p.a.g(r4, r5, r1, r7)
            if (r2 == 0) goto L34
            int r5 = r15.length
            int r5 = r5 * r7
            int r4 = r4 + r5
        L34:
            byte[] r5 = r14.bytes
            int r5 = r5.length
            if (r4 < r5) goto L3c
            r14.ensureCapacity(r4)
        L3c:
            byte[] r4 = r14.bytes
            int r5 = r1 + 1
            char r8 = r14.quote
            byte r8 = (byte) r8
            r4[r1] = r8
        L45:
            int r1 = r15.length
            if (r3 >= r1) goto L237
            int r1 = r3 + 1
            r8 = r15[r3]
            int r9 = r3 + 2
            r1 = r15[r1]
            r10 = 117(0x75, float:1.64E-43)
            r11 = 92
            if (r1 != 0) goto L155
            if (r8 < 0) goto L155
            r1 = 40
            r3 = 48
            if (r8 == r1) goto L127
            r1 = 41
            if (r8 == r1) goto L127
            r1 = 60
            if (r8 == r1) goto L127
            r1 = 62
            if (r8 == r1) goto L127
            if (r8 == r11) goto L11f
            r1 = 49
            switch(r8) {
                case 0: goto L105;
                case 1: goto L105;
                case 2: goto L105;
                case 3: goto L105;
                case 4: goto L105;
                case 5: goto L105;
                case 6: goto L105;
                case 7: goto L105;
                case 8: goto Lfb;
                case 9: goto Lf2;
                case 10: goto Le9;
                case 11: goto Lcf;
                case 12: goto Lc6;
                case 13: goto Lbd;
                case 14: goto Lcf;
                case 15: goto Lcf;
                case 16: goto La3;
                case 17: goto La3;
                case 18: goto La3;
                case 19: goto La3;
                case 20: goto La3;
                case 21: goto La3;
                case 22: goto La3;
                case 23: goto La3;
                case 24: goto La3;
                case 25: goto La3;
                case 26: goto L86;
                case 27: goto L86;
                case 28: goto L86;
                case 29: goto L86;
                case 30: goto L86;
                case 31: goto L86;
                default: goto L71;
            }
        L71:
            char r1 = r14.quote
            if (r8 != r1) goto L80
            r4[r5] = r11
            int r3 = r5 + 1
            byte r1 = (byte) r1
            r4[r3] = r1
        L7c:
            int r5 = r5 + 2
            goto L212
        L80:
            int r1 = r5 + 1
            r4[r5] = r8
            goto L211
        L86:
            r4[r5] = r11
            int r11 = r5 + 1
            r4[r11] = r10
            int r10 = r5 + 2
            r4[r10] = r3
            int r10 = r5 + 3
            r4[r10] = r3
            int r3 = r5 + 4
            r4[r3] = r1
            int r1 = r5 + 5
            int r8 = r8 + 71
            byte r3 = (byte) r8
            r4[r1] = r3
        L9f:
            int r5 = r5 + 6
            goto L212
        La3:
            r4[r5] = r11
            int r11 = r5 + 1
            r4[r11] = r10
            int r10 = r5 + 2
            r4[r10] = r3
            int r10 = r5 + 3
            r4[r10] = r3
            int r3 = r5 + 4
            r4[r3] = r1
            int r1 = r5 + 5
            int r8 = r8 + 32
            byte r3 = (byte) r8
            r4[r1] = r3
            goto L9f
        Lbd:
            r4[r5] = r11
            int r1 = r5 + 1
            r3 = 114(0x72, float:1.6E-43)
            r4[r1] = r3
            goto L7c
        Lc6:
            r4[r5] = r11
            int r1 = r5 + 1
            r3 = 102(0x66, float:1.43E-43)
            r4[r1] = r3
            goto L7c
        Lcf:
            r4[r5] = r11
            int r1 = r5 + 1
            r4[r1] = r10
            int r1 = r5 + 2
            r4[r1] = r3
            int r1 = r5 + 3
            r4[r1] = r3
            int r1 = r5 + 4
            r4[r1] = r3
            int r1 = r5 + 5
            int r8 = r8 + 87
            byte r3 = (byte) r8
            r4[r1] = r3
            goto L9f
        Le9:
            r4[r5] = r11
            int r1 = r5 + 1
            r3 = 110(0x6e, float:1.54E-43)
            r4[r1] = r3
            goto L7c
        Lf2:
            r4[r5] = r11
            int r1 = r5 + 1
            r3 = 116(0x74, float:1.63E-43)
            r4[r1] = r3
            goto L7c
        Lfb:
            r4[r5] = r11
            int r1 = r5 + 1
            r3 = 98
            r4[r1] = r3
            goto L7c
        L105:
            r4[r5] = r11
            int r1 = r5 + 1
            r4[r1] = r10
            int r1 = r5 + 2
            r4[r1] = r3
            int r1 = r5 + 3
            r4[r1] = r3
            int r1 = r5 + 4
            r4[r1] = r3
            int r1 = r5 + 5
            int r8 = r8 + 48
            byte r3 = (byte) r8
            r4[r1] = r3
            goto L9f
        L11f:
            r4[r5] = r11
            int r1 = r5 + 1
            r4[r1] = r11
            goto L7c
        L127:
            if (r0 == 0) goto L14f
            r4[r5] = r11
            int r1 = r5 + 1
            r4[r1] = r10
            int r1 = r5 + 2
            r4[r1] = r3
            int r1 = r5 + 3
            r4[r1] = r3
            int r1 = r5 + 4
            char[] r3 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r10 = r8 >>> 4
            r10 = r10 & 15
            char r10 = r3[r10]
            byte r10 = (byte) r10
            r4[r1] = r10
            int r1 = r5 + 5
            r8 = r8 & 15
            char r3 = r3[r8]
            byte r3 = (byte) r3
            r4[r1] = r3
            goto L9f
        L14f:
            int r1 = r5 + 1
            r4[r5] = r8
            goto L211
        L155:
            r8 = r8 & 255(0xff, float:3.57E-43)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r8
            char r1 = (char) r1
            r8 = 2048(0x800, float:2.87E-42)
            if (r1 >= r8) goto L173
            int r3 = r1 >> 6
            r3 = r3 | 192(0xc0, float:2.69E-43)
            byte r3 = (byte) r3
            r4[r5] = r3
            int r3 = r5 + 1
            r1 = r1 & 63
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r4[r3] = r1
            goto L7c
        L173:
            if (r2 == 0) goto L1a9
            r4[r5] = r11
            int r3 = r5 + 1
            r4[r3] = r10
            int r3 = r5 + 2
            char[] r8 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r10 = r1 >>> 12
            r10 = r10 & 15
            char r10 = r8[r10]
            byte r10 = (byte) r10
            r4[r3] = r10
            int r3 = r5 + 3
            int r10 = r1 >>> 8
            r10 = r10 & 15
            char r10 = r8[r10]
            byte r10 = (byte) r10
            r4[r3] = r10
            int r3 = r5 + 4
            int r10 = r1 >>> 4
            r10 = r10 & 15
            char r10 = r8[r10]
            byte r10 = (byte) r10
            r4[r3] = r10
            int r3 = r5 + 5
            r1 = r1 & 15
            char r1 = r8[r1]
            byte r1 = (byte) r1
            r4[r3] = r1
            goto L9f
        L1a9:
            r8 = 55296(0xd800, float:7.7486E-41)
            r10 = 63
            if (r1 < r8) goto L21a
            r8 = 57344(0xe000, float:8.0356E-41)
            if (r1 >= r8) goto L21a
            int r11 = r3 + 1
            r12 = 56320(0xdc00, float:7.8921E-41)
            if (r1 >= r12) goto L215
            int r13 = r15.length
            int r13 = r13 - r11
            if (r13 >= r7) goto L1c2
            r1 = -1
            goto L1df
        L1c2:
            int r11 = r3 + 2
            r11 = r15[r11]
            int r13 = r3 + 3
            r13 = r15[r13]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 8
            r11 = r11 | r13
            char r11 = (char) r11
            if (r11 < r12) goto L20d
            if (r11 >= r8) goto L20d
            int r9 = r3 + 4
            int r1 = r1 << 10
            int r1 = r1 + r11
            r3 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r1 = r1 + r3
        L1df:
            if (r1 >= 0) goto L1e6
            int r1 = r5 + 1
            r4[r5] = r10
            goto L211
        L1e6:
            int r3 = r1 >> 18
            r3 = r3 | 240(0xf0, float:3.36E-43)
            byte r3 = (byte) r3
            r4[r5] = r3
            int r3 = r5 + 1
            int r8 = r1 >> 12
            r8 = r8 & r10
            r8 = r8 | 128(0x80, float:1.8E-43)
            byte r8 = (byte) r8
            r4[r3] = r8
            int r3 = r5 + 2
            int r8 = r1 >> 6
            r8 = r8 & r10
            r8 = r8 | 128(0x80, float:1.8E-43)
            byte r8 = (byte) r8
            r4[r3] = r8
            int r3 = r5 + 3
            r1 = r1 & 63
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r4[r3] = r1
            int r1 = r5 + 4
            goto L211
        L20d:
            int r1 = r5 + 1
            r4[r5] = r10
        L211:
            r5 = r1
        L212:
            r3 = r9
            goto L45
        L215:
            int r1 = r5 + 1
            r4[r5] = r10
            goto L211
        L21a:
            int r3 = r1 >> 12
            r3 = r3 | 224(0xe0, float:3.14E-43)
            byte r3 = (byte) r3
            r4[r5] = r3
            int r3 = r5 + 1
            int r8 = r1 >> 6
            r8 = r8 & r10
            r8 = r8 | 128(0x80, float:1.8E-43)
            byte r8 = (byte) r8
            r4[r3] = r8
            int r3 = r5 + 2
            r1 = r1 & 63
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r4[r3] = r1
            int r5 = r5 + 3
            goto L212
        L237:
            char r15 = r14.quote
            byte r15 = (byte) r15
            r4[r5] = r15
            int r5 = r5 + r6
            r14.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeTimeHHMMSS8(int r8, int r9, int r10) {
            r7 = this;
            int r0 = r7.off
            int r1 = r0 + 10
            byte[] r2 = r7.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r7.ensureCapacity(r1)
        Lc:
            byte[] r2 = r7.bytes
            char r3 = r7.quote
            byte r4 = (byte) r3
            r2[r0] = r4
            int[] r4 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            r8 = r4[r8]
            int r5 = r0 + 1
            int r6 = r8 >> 8
            byte r6 = (byte) r6
            r2[r5] = r6
            int r5 = r0 + 2
            byte r8 = (byte) r8
            r2[r5] = r8
            int r8 = r0 + 3
            r5 = 58
            r2[r8] = r5
            r8 = r4[r9]
            int r9 = r0 + 4
            int r6 = r8 >> 8
            byte r6 = (byte) r6
            r2[r9] = r6
            int r9 = r0 + 5
            byte r8 = (byte) r8
            r2[r9] = r8
            int r8 = r0 + 6
            r2[r8] = r5
            r8 = r4[r10]
            int r9 = r0 + 7
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            r2[r9] = r10
            int r9 = r0 + 8
            byte r8 = (byte) r8
            r2[r9] = r8
            int r0 = r0 + 9
            byte r8 = (byte) r3
            r2[r0] = r8
            r7.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeUUID(java.util.UUID r21) {
            r20 = this;
            r0 = r20
            if (r21 != 0) goto L8
            r0.writeNull()
            return
        L8:
            long r1 = r21.getMostSignificantBits()
            long r3 = r21.getLeastSignificantBits()
            int r5 = r0.off
            int r5 = r5 + 38
            byte[] r6 = r0.bytes
            int r6 = r6.length
            if (r5 < r6) goto L1c
            r0.ensureCapacity(r5)
        L1c:
            char[] r5 = com.alibaba.fastjson2.JSONFactory.UUID_LOOKUP
            byte[] r6 = r0.bytes
            int r7 = r0.off
            r8 = 34
            r6[r7] = r8
            r9 = 56
            long r10 = r1 >> r9
            int r10 = (int) r10
            r10 = r10 & 255(0xff, float:3.57E-43)
            char r10 = r5[r10]
            r11 = 48
            long r12 = r1 >> r11
            int r12 = (int) r12
            r12 = r12 & 255(0xff, float:3.57E-43)
            char r12 = r5[r12]
            r13 = 40
            long r14 = r1 >> r13
            int r14 = (int) r14
            r14 = r14 & 255(0xff, float:3.57E-43)
            char r14 = r5[r14]
            r15 = 32
            r21 = r8
            r16 = r9
            long r8 = r1 >> r15
            int r8 = (int) r8
            r8 = r8 & 255(0xff, float:3.57E-43)
            char r8 = r5[r8]
            int r1 = (int) r1
            int r2 = r1 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            char r2 = r5[r2]
            int r9 = r1 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            char r9 = r5[r9]
            r17 = r11
            int r11 = r1 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            char r11 = r5[r11]
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = r5[r1]
            r18 = r13
            r19 = r14
            long r13 = r3 >> r16
            int r13 = (int) r13
            r13 = r13 & 255(0xff, float:3.57E-43)
            char r13 = r5[r13]
            r14 = r5
            r16 = r6
            long r5 = r3 >> r17
            int r5 = (int) r5
            r5 = r5 & 255(0xff, float:3.57E-43)
            char r5 = r14[r5]
            r17 = r7
            long r6 = r3 >> r18
            int r6 = (int) r6
            r6 = r6 & 255(0xff, float:3.57E-43)
            char r6 = r14[r6]
            r7 = r14
            long r14 = r3 >> r15
            int r14 = (int) r14
            r14 = r14 & 255(0xff, float:3.57E-43)
            char r14 = r7[r14]
            int r3 = (int) r3
            int r4 = r3 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            char r4 = r7[r4]
            int r15 = r3 >> 16
            r15 = r15 & 255(0xff, float:3.57E-43)
            char r15 = r7[r15]
            r18 = r7
            int r7 = r3 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            char r7 = r18[r7]
            r3 = r3 & 255(0xff, float:3.57E-43)
            char r3 = r18[r3]
            int r18 = r17 + 1
            int r0 = r10 >> 8
            byte r0 = (byte) r0
            r16[r18] = r0
            int r0 = r17 + 2
            byte r10 = (byte) r10
            r16[r0] = r10
            int r0 = r17 + 3
            int r10 = r12 >> 8
            byte r10 = (byte) r10
            r16[r0] = r10
            int r0 = r17 + 4
            byte r10 = (byte) r12
            r16[r0] = r10
            int r0 = r17 + 5
            int r10 = r19 >> 8
            byte r10 = (byte) r10
            r16[r0] = r10
            int r0 = r17 + 6
            r10 = r19
            byte r10 = (byte) r10
            r16[r0] = r10
            int r0 = r17 + 7
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            r16[r0] = r10
            int r0 = r17 + 8
            byte r8 = (byte) r8
            r16[r0] = r8
            int r0 = r17 + 9
            r8 = 45
            r16[r0] = r8
            int r0 = r17 + 10
            int r10 = r2 >> 8
            byte r10 = (byte) r10
            r16[r0] = r10
            int r0 = r17 + 11
            byte r2 = (byte) r2
            r16[r0] = r2
            int r0 = r17 + 12
            int r2 = r9 >> 8
            byte r2 = (byte) r2
            r16[r0] = r2
            int r0 = r17 + 13
            byte r2 = (byte) r9
            r16[r0] = r2
            int r0 = r17 + 14
            r16[r0] = r8
            int r0 = r17 + 15
            int r2 = r11 >> 8
            byte r2 = (byte) r2
            r16[r0] = r2
            int r0 = r17 + 16
            byte r2 = (byte) r11
            r16[r0] = r2
            int r0 = r17 + 17
            int r2 = r1 >> 8
            byte r2 = (byte) r2
            r16[r0] = r2
            int r0 = r17 + 18
            byte r1 = (byte) r1
            r16[r0] = r1
            int r0 = r17 + 19
            r16[r0] = r8
            int r0 = r17 + 20
            int r1 = r13 >> 8
            byte r1 = (byte) r1
            r16[r0] = r1
            int r0 = r17 + 21
            byte r1 = (byte) r13
            r16[r0] = r1
            int r0 = r17 + 22
            int r1 = r5 >> 8
            byte r1 = (byte) r1
            r16[r0] = r1
            int r0 = r17 + 23
            byte r1 = (byte) r5
            r16[r0] = r1
            int r0 = r17 + 24
            r16[r0] = r8
            int r0 = r17 + 25
            int r1 = r6 >> 8
            byte r1 = (byte) r1
            r16[r0] = r1
            int r0 = r17 + 26
            byte r1 = (byte) r6
            r16[r0] = r1
            int r0 = r17 + 27
            int r1 = r14 >> 8
            byte r1 = (byte) r1
            r16[r0] = r1
            int r0 = r17 + 28
            byte r1 = (byte) r14
            r16[r0] = r1
            int r0 = r17 + 29
            int r1 = r4 >> 8
            byte r1 = (byte) r1
            r16[r0] = r1
            int r0 = r17 + 30
            byte r1 = (byte) r4
            r16[r0] = r1
            int r0 = r17 + 31
            int r1 = r15 >> 8
            byte r1 = (byte) r1
            r16[r0] = r1
            int r0 = r17 + 32
            byte r1 = (byte) r15
            r16[r0] = r1
            int r0 = r17 + 33
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            r16[r0] = r1
            int r0 = r17 + 34
            byte r1 = (byte) r7
            r16[r0] = r1
            int r7 = r17 + 35
            int r0 = r3 >> 8
            byte r0 = (byte) r0
            r16[r7] = r0
            int r7 = r17 + 36
            byte r0 = (byte) r3
            r16[r7] = r0
            int r7 = r17 + 37
            r16[r7] = r21
            int r7 = r17 + 38
            r0 = r20
            r0.off = r7
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeZonedDateTime(java.time.ZonedDateTime r14) {
            r13 = this;
            if (r14 != 0) goto L6
            r13.writeNull()
            return
        L6:
            java.time.ZoneId r0 = r14.getZone()
            java.lang.String r1 = r0.getId()
            int r2 = r1.length()
            java.time.ZoneOffset r3 = java.time.ZoneOffset.UTC
            r4 = 45
            r5 = 43
            java.lang.String r6 = "Z"
            r7 = 0
            r8 = 1
            if (r3 == r0) goto L40
            r0 = 3
            if (r2 > r0) goto L30
            java.lang.String r0 = "UTC"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L30
            goto L40
        L30:
            if (r2 == 0) goto L3c
            char r0 = r1.charAt(r7)
            if (r0 == r5) goto L3a
            if (r0 != r4) goto L3d
        L3a:
            r3 = r2
            goto L43
        L3c:
            r0 = r7
        L3d:
            int r3 = r2 + 2
            goto L43
        L40:
            r1 = r6
            r0 = r7
            r3 = r8
        L43:
            int r6 = r13.off
            int r9 = r6 + r3
            int r9 = r9 + 38
            byte[] r10 = r13.bytes
            int r10 = r10.length
            if (r9 < r10) goto L51
            r13.ensureCapacity(r9)
        L51:
            byte[] r9 = r13.bytes
            int r10 = r6 + 1
            char r11 = r13.quote
            byte r11 = (byte) r11
            r9[r6] = r11
            java.time.LocalDate r6 = r14.toLocalDate()
            int r11 = r6.getYear()
            int r12 = r6.getMonthValue()
            int r6 = r6.getDayOfMonth()
            int r6 = com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r9, r10, r11, r12, r6)
            int r10 = r6 + 1
            r11 = 84
            r9[r6] = r11
            java.time.LocalTime r14 = r14.toLocalTime()
            int r14 = com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r9, r10, r14)
            if (r3 != r8) goto L85
            int r0 = r14 + 1
            r1 = 90
            r9[r14] = r1
            goto La1
        L85:
            if (r0 == r5) goto L9c
            if (r0 != r4) goto L8a
            goto L9c
        L8a:
            int r0 = r14 + 1
            r3 = 91
            r9[r14] = r3
            r1.getBytes(r7, r2, r9, r0)
            int r0 = r0 + r2
            int r14 = r0 + 1
            r1 = 93
            r9[r0] = r1
            r0 = r14
            goto La1
        L9c:
            r1.getBytes(r7, r2, r9, r14)
            int r0 = r14 + r2
        La1:
            char r14 = r13.quote
            byte r14 = (byte) r14
            r9[r0] = r14
            int r0 = r0 + r8
            r13.off = r0
            return
    }
}
