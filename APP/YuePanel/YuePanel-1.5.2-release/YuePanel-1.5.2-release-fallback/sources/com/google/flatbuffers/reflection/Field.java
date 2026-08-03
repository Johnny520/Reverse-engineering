package com.google.flatbuffers.reflection;

/* JADX INFO: loaded from: classes.dex */
public final class Field extends com.google.flatbuffers.Table {

    public static final class Vector extends com.google.flatbuffers.BaseVector {
        public Vector() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.flatbuffers.reflection.Field.Vector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
                r0 = this;
                r0.__reset(r1, r2, r3)
                return r0
        }

        public com.google.flatbuffers.reflection.Field get(int r2) {
                r1 = this;
                com.google.flatbuffers.reflection.Field r0 = new com.google.flatbuffers.reflection.Field
                r0.<init>()
                com.google.flatbuffers.reflection.Field r2 = r1.get(r0, r2)
                return r2
        }

        public com.google.flatbuffers.reflection.Field get(com.google.flatbuffers.reflection.Field r2, int r3) {
                r1 = this;
                int r3 = r1.__element(r3)
                java.nio.ByteBuffer r0 = r1.bb
                int r3 = com.google.flatbuffers.reflection.Field.access$000(r3, r0)
                java.nio.ByteBuffer r0 = r1.bb
                com.google.flatbuffers.reflection.Field r2 = r2.__assign(r3, r0)
                return r2
        }

        public com.google.flatbuffers.reflection.Field getByKey(com.google.flatbuffers.reflection.Field r3, java.lang.String r4) {
                r2 = this;
                int r0 = r2.__vector()
                java.nio.ByteBuffer r1 = r2.bb
                com.google.flatbuffers.reflection.Field r3 = com.google.flatbuffers.reflection.Field.__lookup_by_key(r3, r0, r4, r1)
                return r3
        }

        public com.google.flatbuffers.reflection.Field getByKey(java.lang.String r4) {
                r3 = this;
                int r0 = r3.__vector()
                java.nio.ByteBuffer r1 = r3.bb
                r2 = 0
                com.google.flatbuffers.reflection.Field r4 = com.google.flatbuffers.reflection.Field.__lookup_by_key(r2, r0, r4, r1)
                return r4
        }
    }

    public Field() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ValidateVersion() {
            com.google.flatbuffers.Constants.FLATBUFFERS_23_5_26()
            return
    }

    public static com.google.flatbuffers.reflection.Field __lookup_by_key(com.google.flatbuffers.reflection.Field r6, int r7, java.lang.String r8, java.nio.ByteBuffer r9) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r8 = r8.getBytes(r0)
            int r0 = r7 + (-4)
            int r0 = r9.getInt(r0)
            r1 = 0
        Ld:
            if (r0 == 0) goto L3e
            int r2 = r0 / 2
            int r3 = r1 + r2
            r4 = 4
            int r3 = r3 * r4
            int r3 = r3 + r7
            int r3 = com.google.flatbuffers.Table.__indirect(r3, r9)
            int r5 = r9.capacity()
            int r5 = r5 - r3
            int r4 = com.google.flatbuffers.Table.__offset(r4, r5, r9)
            int r4 = com.google.flatbuffers.Table.compareStrings(r4, r8, r9)
            if (r4 <= 0) goto L2b
            r0 = r2
            goto Ld
        L2b:
            if (r4 >= 0) goto L32
            int r2 = r2 + 1
            int r1 = r1 + r2
            int r0 = r0 - r2
            goto Ld
        L32:
            if (r6 != 0) goto L39
            com.google.flatbuffers.reflection.Field r6 = new com.google.flatbuffers.reflection.Field
            r6.<init>()
        L39:
            com.google.flatbuffers.reflection.Field r6 = r6.__assign(r3, r9)
            return r6
        L3e:
            r6 = 0
            return r6
    }

    public static /* synthetic */ int access$000(int r0, java.nio.ByteBuffer r1) {
            int r0 = com.google.flatbuffers.Table.__indirect(r0, r1)
            return r0
    }

    public static void addAttributes(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 9
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addDefaultInteger(com.google.flatbuffers.FlatBufferBuilder r6, long r7) {
            r1 = 4
            r4 = 0
            r0 = r6
            r2 = r7
            r0.addLong(r1, r2, r4)
            return
    }

    public static void addDefaultReal(com.google.flatbuffers.FlatBufferBuilder r6, double r7) {
            r1 = 5
            r4 = 0
            r0 = r6
            r2 = r7
            r0.addDouble(r1, r2, r4)
            return
    }

    public static void addDeprecated(com.google.flatbuffers.FlatBufferBuilder r2, boolean r3) {
            r0 = 6
            r1 = 0
            r2.addBoolean(r0, r3, r1)
            return
    }

    public static void addDocumentation(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 10
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addId(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            short r3 = (short) r3
            r0 = 0
            r1 = 2
            r2.addShort(r1, r3, r0)
            return
    }

    public static void addKey(com.google.flatbuffers.FlatBufferBuilder r2, boolean r3) {
            r0 = 8
            r1 = 0
            r2.addBoolean(r0, r3, r1)
            return
    }

    public static void addName(com.google.flatbuffers.FlatBufferBuilder r0, int r1) {
            r0.addOffset(r1)
            r1 = 0
            r0.slot(r1)
            return
    }

    public static void addOffset(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            short r3 = (short) r3
            r0 = 0
            r1 = 3
            r2.addShort(r1, r3, r0)
            return
    }

    public static void addOffset64(com.google.flatbuffers.FlatBufferBuilder r2, boolean r3) {
            r0 = 13
            r1 = 0
            r2.addBoolean(r0, r3, r1)
            return
    }

    public static void addOptional(com.google.flatbuffers.FlatBufferBuilder r2, boolean r3) {
            r0 = 11
            r1 = 0
            r2.addBoolean(r0, r3, r1)
            return
    }

    public static void addPadding(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            short r3 = (short) r3
            r0 = 0
            r1 = 12
            r2.addShort(r1, r3, r0)
            return
    }

    public static void addRequired(com.google.flatbuffers.FlatBufferBuilder r2, boolean r3) {
            r0 = 7
            r1 = 0
            r2.addBoolean(r0, r3, r1)
            return
    }

    public static void addType(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 1
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static int createAttributesVector(com.google.flatbuffers.FlatBufferBuilder r2, int[] r3) {
            int r0 = r3.length
            r1 = 4
            r2.startVector(r1, r0, r1)
            int r0 = r3.length
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L12
            r1 = r3[r0]
            r2.addOffset(r1)
            int r0 = r0 + (-1)
            goto L8
        L12:
            int r2 = r2.endVector()
            return r2
    }

    public static int createDocumentationVector(com.google.flatbuffers.FlatBufferBuilder r2, int[] r3) {
            int r0 = r3.length
            r1 = 4
            r2.startVector(r1, r0, r1)
            int r0 = r3.length
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L12
            r1 = r3[r0]
            r2.addOffset(r1)
            int r0 = r0 + (-1)
            goto L8
        L12:
            int r2 = r2.endVector()
            return r2
    }

    public static int createField(com.google.flatbuffers.FlatBufferBuilder r3, int r4, int r5, int r6, int r7, long r8, double r10, boolean r12, boolean r13, boolean r14, int r15, int r16, boolean r17, int r18, boolean r19) {
            r0 = r3
            r1 = 14
            r3.startTable(r1)
            r1 = r10
            addDefaultReal(r3, r10)
            r1 = r8
            addDefaultInteger(r3, r8)
            r1 = r16
            addDocumentation(r3, r1)
            r1 = r15
            addAttributes(r3, r15)
            r1 = r5
            addType(r3, r5)
            addName(r3, r4)
            r1 = r18
            addPadding(r3, r1)
            r1 = r7
            addOffset(r3, r7)
            r1 = r6
            addId(r3, r6)
            r1 = r19
            addOffset64(r3, r1)
            r1 = r17
            addOptional(r3, r1)
            r1 = r14
            addKey(r3, r14)
            r1 = r13
            addRequired(r3, r13)
            r1 = r12
            addDeprecated(r3, r12)
            int r0 = endField(r3)
            return r0
    }

    public static int endField(com.google.flatbuffers.FlatBufferBuilder r2) {
            int r0 = r2.endTable()
            r1 = 4
            r2.required(r0, r1)
            r1 = 6
            r2.required(r0, r1)
            return r0
    }

    public static com.google.flatbuffers.reflection.Field getRootAsField(java.nio.ByteBuffer r1) {
            com.google.flatbuffers.reflection.Field r0 = new com.google.flatbuffers.reflection.Field
            r0.<init>()
            com.google.flatbuffers.reflection.Field r1 = getRootAsField(r1, r0)
            return r1
    }

    public static com.google.flatbuffers.reflection.Field getRootAsField(java.nio.ByteBuffer r2, com.google.flatbuffers.reflection.Field r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r0 = r0 + r1
            com.google.flatbuffers.reflection.Field r2 = r3.__assign(r0, r2)
            return r2
    }

    public static void startAttributesVector(com.google.flatbuffers.FlatBufferBuilder r1, int r2) {
            r0 = 4
            r1.startVector(r0, r2, r0)
            return
    }

    public static void startDocumentationVector(com.google.flatbuffers.FlatBufferBuilder r1, int r2) {
            r0 = 4
            r1.startVector(r0, r2, r0)
            return
    }

    public static void startField(com.google.flatbuffers.FlatBufferBuilder r1) {
            r0 = 14
            r1.startTable(r0)
            return
    }

    public com.google.flatbuffers.reflection.Field __assign(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__init(r1, r2)
            return r0
    }

    public void __init(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__reset(r1, r2)
            return
    }

    public com.google.flatbuffers.reflection.KeyValue attributes(int r2) {
            r1 = this;
            com.google.flatbuffers.reflection.KeyValue r0 = new com.google.flatbuffers.reflection.KeyValue
            r0.<init>()
            com.google.flatbuffers.reflection.KeyValue r2 = r1.attributes(r0, r2)
            return r2
    }

    public com.google.flatbuffers.reflection.KeyValue attributes(com.google.flatbuffers.reflection.KeyValue r2, int r3) {
            r1 = this;
            r0 = 22
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L1a
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r0 = r0 + r3
            int r3 = r1.__indirect(r0)
            java.nio.ByteBuffer r0 = r1.bb
            com.google.flatbuffers.reflection.KeyValue r2 = r2.__assign(r3, r0)
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    public com.google.flatbuffers.reflection.KeyValue attributesByKey(com.google.flatbuffers.reflection.KeyValue r3, java.lang.String r4) {
            r2 = this;
            r0 = 22
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L13
            int r0 = r2.__vector(r0)
            java.nio.ByteBuffer r1 = r2.bb
            com.google.flatbuffers.reflection.KeyValue r3 = com.google.flatbuffers.reflection.KeyValue.__lookup_by_key(r3, r0, r4, r1)
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
    }

    public com.google.flatbuffers.reflection.KeyValue attributesByKey(java.lang.String r4) {
            r3 = this;
            r0 = 22
            int r0 = r3.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L13
            int r0 = r3.__vector(r0)
            java.nio.ByteBuffer r2 = r3.bb
            com.google.flatbuffers.reflection.KeyValue r1 = com.google.flatbuffers.reflection.KeyValue.__lookup_by_key(r1, r0, r4, r2)
        L13:
            return r1
    }

    public int attributesLength() {
            r1 = this;
            r0 = 22
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r0 = r1.__vector_len(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public com.google.flatbuffers.reflection.KeyValue.Vector attributesVector() {
            r1 = this;
            com.google.flatbuffers.reflection.KeyValue$Vector r0 = new com.google.flatbuffers.reflection.KeyValue$Vector
            r0.<init>()
            com.google.flatbuffers.reflection.KeyValue$Vector r0 = r1.attributesVector(r0)
            return r0
    }

    public com.google.flatbuffers.reflection.KeyValue.Vector attributesVector(com.google.flatbuffers.reflection.KeyValue.Vector r4) {
            r3 = this;
            r0 = 22
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L14
            int r0 = r3.__vector(r0)
            r1 = 4
            java.nio.ByteBuffer r2 = r3.bb
            com.google.flatbuffers.reflection.KeyValue$Vector r4 = r4.__assign(r0, r1, r2)
            goto L15
        L14:
            r4 = 0
        L15:
            return r4
    }

    public long defaultInteger() {
            r3 = this;
            r0 = 12
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            long r0 = r1.getLong(r0)
            goto L14
        L12:
            r0 = 0
        L14:
            return r0
    }

    public double defaultReal() {
            r3 = this;
            r0 = 14
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            double r0 = r1.getDouble(r0)
            goto L14
        L12:
            r0 = 0
        L14:
            return r0
    }

    public boolean deprecated() {
            r4 = this;
            r0 = 16
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r2 = r4.bb
            int r3 = r4.bb_pos
            int r0 = r0 + r3
            byte r0 = r2.get(r0)
            if (r0 == 0) goto L15
            r1 = 1
        L15:
            return r1
    }

    public java.lang.String documentation(int r2) {
            r1 = this;
            r0 = 24
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L14
            int r0 = r1.__vector(r0)
            int r2 = r2 * 4
            int r0 = r0 + r2
            java.lang.String r2 = r1.__string(r0)
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    public int documentationLength() {
            r1 = this;
            r0 = 24
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r0 = r1.__vector_len(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public com.google.flatbuffers.StringVector documentationVector() {
            r1 = this;
            com.google.flatbuffers.StringVector r0 = new com.google.flatbuffers.StringVector
            r0.<init>()
            com.google.flatbuffers.StringVector r0 = r1.documentationVector(r0)
            return r0
    }

    public com.google.flatbuffers.StringVector documentationVector(com.google.flatbuffers.StringVector r4) {
            r3 = this;
            r0 = 24
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L14
            int r0 = r3.__vector(r0)
            r1 = 4
            java.nio.ByteBuffer r2 = r3.bb
            com.google.flatbuffers.StringVector r4 = r4.__assign(r0, r1, r2)
            goto L15
        L14:
            r4 = 0
        L15:
            return r4
    }

    public int id() {
            r3 = this;
            r0 = 8
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            short r0 = r1.getShort(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public boolean key() {
            r4 = this;
            r0 = 20
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r2 = r4.bb
            int r3 = r4.bb_pos
            int r0 = r0 + r3
            byte r0 = r2.get(r0)
            if (r0 == 0) goto L15
            r1 = 1
        L15:
            return r1
    }

    @Override // com.google.flatbuffers.Table
    public int keysCompare(java.lang.Integer r2, java.lang.Integer r3, java.nio.ByteBuffer r4) {
            r1 = this;
            int r2 = r2.intValue()
            r0 = 4
            int r2 = com.google.flatbuffers.Table.__offset(r0, r2, r4)
            int r3 = r3.intValue()
            int r3 = com.google.flatbuffers.Table.__offset(r0, r3, r4)
            int r2 = com.google.flatbuffers.Table.compareStrings(r2, r3, r4)
            return r2
    }

    public java.lang.String name() {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Lf
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            java.lang.String r0 = r2.__string(r0)
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public java.nio.ByteBuffer nameAsByteBuffer() {
            r2 = this;
            r0 = 4
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            return r0
    }

    public java.nio.ByteBuffer nameInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 4
            r1 = 1
            java.nio.ByteBuffer r3 = r2.__vector_in_bytebuffer(r3, r0, r1)
            return r3
    }

    public int offset() {
            r3 = this;
            r0 = 10
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            short r0 = r1.getShort(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public boolean offset64() {
            r4 = this;
            r0 = 30
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r2 = r4.bb
            int r3 = r4.bb_pos
            int r0 = r0 + r3
            byte r0 = r2.get(r0)
            if (r0 == 0) goto L15
            r1 = 1
        L15:
            return r1
    }

    public boolean optional() {
            r4 = this;
            r0 = 26
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r2 = r4.bb
            int r3 = r4.bb_pos
            int r0 = r0 + r3
            byte r0 = r2.get(r0)
            if (r0 == 0) goto L15
            r1 = 1
        L15:
            return r1
    }

    public int padding() {
            r3 = this;
            r0 = 28
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            short r0 = r1.getShort(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public boolean required() {
            r4 = this;
            r0 = 18
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r2 = r4.bb
            int r3 = r4.bb_pos
            int r0 = r0 + r3
            byte r0 = r2.get(r0)
            if (r0 == 0) goto L15
            r1 = 1
        L15:
            return r1
    }

    public com.google.flatbuffers.reflection.Type type() {
            r1 = this;
            com.google.flatbuffers.reflection.Type r0 = new com.google.flatbuffers.reflection.Type
            r0.<init>()
            com.google.flatbuffers.reflection.Type r0 = r1.type(r0)
            return r0
    }

    public com.google.flatbuffers.reflection.Type type(com.google.flatbuffers.reflection.Type r3) {
            r2 = this;
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L15
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r1 = r2.bb
            com.google.flatbuffers.reflection.Type r3 = r3.__assign(r0, r1)
            goto L16
        L15:
            r3 = 0
        L16:
            return r3
    }
}
