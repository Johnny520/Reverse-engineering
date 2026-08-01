package com.google.flatbuffers.reflection;

/* JADX INFO: loaded from: classes2.dex */
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
                com.google.flatbuffers.reflection.Field r0 = r1.get(r0, r2)
                return r0
        }

        public com.google.flatbuffers.reflection.Field get(com.google.flatbuffers.reflection.Field r3, int r4) {
                r2 = this;
                int r0 = r2.__element(r4)
                java.nio.ByteBuffer r1 = r2.f44bb
                int r0 = com.google.flatbuffers.reflection.Field.access$000(r0, r1)
                java.nio.ByteBuffer r1 = r2.f44bb
                com.google.flatbuffers.reflection.Field r0 = r3.__assign(r0, r1)
                return r0
        }

        public com.google.flatbuffers.reflection.Field getByKey(com.google.flatbuffers.reflection.Field r3, java.lang.String r4) {
                r2 = this;
                int r0 = r2.__vector()
                java.nio.ByteBuffer r1 = r2.f44bb
                com.google.flatbuffers.reflection.Field r0 = com.google.flatbuffers.reflection.Field.__lookup_by_key(r3, r0, r4, r1)
                return r0
        }

        public com.google.flatbuffers.reflection.Field getByKey(java.lang.String r4) {
                r3 = this;
                int r0 = r3.__vector()
                java.nio.ByteBuffer r1 = r3.f44bb
                r2 = 0
                com.google.flatbuffers.reflection.Field r0 = com.google.flatbuffers.reflection.Field.__lookup_by_key(r2, r0, r4, r1)
                return r0
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

    public static com.google.flatbuffers.reflection.Field __lookup_by_key(com.google.flatbuffers.reflection.Field r7, int r8, java.lang.String r9, java.nio.ByteBuffer r10) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r9.getBytes(r0)
            int r1 = r8 + (-4)
            int r1 = r10.getInt(r1)
            r2 = 0
        Ld:
            if (r1 == 0) goto L40
            int r3 = r1 / 2
            int r4 = r2 + r3
            r5 = 4
            int r4 = r4 * r5
            int r4 = r4 + r8
            int r4 = __indirect(r4, r10)
            int r6 = r10.capacity()
            int r6 = r6 - r4
            int r5 = __offset(r5, r6, r10)
            int r5 = compareStrings(r5, r0, r10)
            if (r5 <= 0) goto L2b
            r1 = r3
            goto L31
        L2b:
            if (r5 >= 0) goto L32
            int r3 = r3 + 1
            int r2 = r2 + r3
            int r1 = r1 - r3
        L31:
            goto Ld
        L32:
            if (r7 != 0) goto L3a
            com.google.flatbuffers.reflection.Field r6 = new com.google.flatbuffers.reflection.Field
            r6.<init>()
            goto L3b
        L3a:
            r6 = r7
        L3b:
            com.google.flatbuffers.reflection.Field r6 = r6.__assign(r4, r10)
            return r6
        L40:
            r3 = 0
            return r3
    }

    static /* synthetic */ int access$000(int r1, java.nio.ByteBuffer r2) {
            int r0 = __indirect(r1, r2)
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

    public static void addId(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
            short r0 = (short) r4
            r1 = 0
            r2 = 2
            r3.addShort(r2, r0, r1)
            return
    }

    public static void addKey(com.google.flatbuffers.FlatBufferBuilder r2, boolean r3) {
            r0 = 8
            r1 = 0
            r2.addBoolean(r0, r3, r1)
            return
    }

    public static void addName(com.google.flatbuffers.FlatBufferBuilder r1, int r2) {
            r1.addOffset(r2)
            r0 = 0
            r1.slot(r0)
            return
    }

    public static void addOffset(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
            short r0 = (short) r4
            r1 = 0
            r2 = 3
            r3.addShort(r2, r0, r1)
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

    public static void addPadding(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
            short r0 = (short) r4
            r1 = 0
            r2 = 12
            r3.addShort(r2, r0, r1)
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
            r0 = 4
            int r1 = r3.length
            r2.startVector(r0, r1, r0)
            int r0 = r3.length
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L12
            r1 = r3[r0]
            r2.addOffset(r1)
            int r0 = r0 + (-1)
            goto L8
        L12:
            int r0 = r2.endVector()
            return r0
    }

    public static int createDocumentationVector(com.google.flatbuffers.FlatBufferBuilder r2, int[] r3) {
            r0 = 4
            int r1 = r3.length
            r2.startVector(r0, r1, r0)
            int r0 = r3.length
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L12
            r1 = r3[r0]
            r2.addOffset(r1)
            int r0 = r0 + (-1)
            goto L8
        L12:
            int r0 = r2.endVector()
            return r0
    }

    public static int createField(com.google.flatbuffers.FlatBufferBuilder r17, int r18, int r19, int r20, int r21, long r22, double r24, boolean r26, boolean r27, boolean r28, int r29, int r30, boolean r31, int r32, boolean r33) {
            r0 = r17
            r1 = 14
            r0.startTable(r1)
            r1 = r24
            addDefaultReal(r0, r1)
            r3 = r22
            addDefaultInteger(r0, r3)
            r5 = r30
            addDocumentation(r0, r5)
            r6 = r29
            addAttributes(r0, r6)
            r7 = r19
            addType(r0, r7)
            addName(r17, r18)
            r8 = r32
            addPadding(r0, r8)
            r9 = r21
            addOffset(r0, r9)
            r10 = r20
            addId(r0, r10)
            r11 = r33
            addOffset64(r0, r11)
            r12 = r31
            addOptional(r0, r12)
            r13 = r28
            addKey(r0, r13)
            r14 = r27
            addRequired(r0, r14)
            r15 = r26
            addDeprecated(r0, r15)
            int r16 = endField(r17)
            return r16
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
            com.google.flatbuffers.reflection.Field r0 = getRootAsField(r1, r0)
            return r0
    }

    public static com.google.flatbuffers.reflection.Field getRootAsField(java.nio.ByteBuffer r2, com.google.flatbuffers.reflection.Field r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r0 = r0 + r1
            com.google.flatbuffers.reflection.Field r0 = r3.__assign(r0, r2)
            return r0
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
            com.google.flatbuffers.reflection.KeyValue r0 = r1.attributes(r0, r2)
            return r0
    }

    public com.google.flatbuffers.reflection.KeyValue attributes(com.google.flatbuffers.reflection.KeyValue r4, int r5) {
            r3 = this;
            r0 = 22
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L1a
            int r1 = r3.__vector(r0)
            int r2 = r5 * 4
            int r1 = r1 + r2
            int r1 = r3.__indirect(r1)
            java.nio.ByteBuffer r2 = r3.f50bb
            com.google.flatbuffers.reflection.KeyValue r1 = r4.__assign(r1, r2)
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    public com.google.flatbuffers.reflection.KeyValue attributesByKey(com.google.flatbuffers.reflection.KeyValue r4, java.lang.String r5) {
            r3 = this;
            r0 = 22
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L13
            int r1 = r3.__vector(r0)
            java.nio.ByteBuffer r2 = r3.f50bb
            com.google.flatbuffers.reflection.KeyValue r1 = com.google.flatbuffers.reflection.KeyValue.__lookup_by_key(r4, r1, r5, r2)
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public com.google.flatbuffers.reflection.KeyValue attributesByKey(java.lang.String r5) {
            r4 = this;
            r0 = 22
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L13
            int r2 = r4.__vector(r0)
            java.nio.ByteBuffer r3 = r4.f50bb
            com.google.flatbuffers.reflection.KeyValue r1 = com.google.flatbuffers.reflection.KeyValue.__lookup_by_key(r1, r2, r5, r3)
        L13:
            return r1
    }

    public int attributesLength() {
            r2 = this;
            r0 = 22
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r2.__vector_len(r0)
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public com.google.flatbuffers.reflection.KeyValue.Vector attributesVector() {
            r1 = this;
            com.google.flatbuffers.reflection.KeyValue$Vector r0 = new com.google.flatbuffers.reflection.KeyValue$Vector
            r0.<init>()
            com.google.flatbuffers.reflection.KeyValue$Vector r0 = r1.attributesVector(r0)
            return r0
    }

    public com.google.flatbuffers.reflection.KeyValue.Vector attributesVector(com.google.flatbuffers.reflection.KeyValue.Vector r5) {
            r4 = this;
            r0 = 22
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L14
            int r1 = r4.__vector(r0)
            r2 = 4
            java.nio.ByteBuffer r3 = r4.f50bb
            com.google.flatbuffers.reflection.KeyValue$Vector r1 = r5.__assign(r1, r2, r3)
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public long defaultInteger() {
            r3 = this;
            r0 = 12
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            long r1 = r1.getLong(r2)
            goto L14
        L12:
            r1 = 0
        L14:
            return r1
    }

    public double defaultReal() {
            r3 = this;
            r0 = 14
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            double r1 = r1.getDouble(r2)
            goto L14
        L12:
            r1 = 0
        L14:
            return r1
    }

    public boolean deprecated() {
            r4 = this;
            r0 = 16
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r2 = r4.f50bb
            int r3 = r4.bb_pos
            int r3 = r3 + r0
            byte r2 = r2.get(r3)
            if (r2 == 0) goto L15
            r1 = 1
        L15:
            return r1
    }

    public java.lang.String documentation(int r4) {
            r3 = this;
            r0 = 24
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L14
            int r1 = r3.__vector(r0)
            int r2 = r4 * 4
            int r1 = r1 + r2
            java.lang.String r1 = r3.__string(r1)
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public int documentationLength() {
            r2 = this;
            r0 = 24
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r2.__vector_len(r0)
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public com.google.flatbuffers.StringVector documentationVector() {
            r1 = this;
            com.google.flatbuffers.StringVector r0 = new com.google.flatbuffers.StringVector
            r0.<init>()
            com.google.flatbuffers.StringVector r0 = r1.documentationVector(r0)
            return r0
    }

    public com.google.flatbuffers.StringVector documentationVector(com.google.flatbuffers.StringVector r5) {
            r4 = this;
            r0 = 24
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L14
            int r1 = r4.__vector(r0)
            r2 = 4
            java.nio.ByteBuffer r3 = r4.f50bb
            com.google.flatbuffers.StringVector r1 = r5.__assign(r1, r2, r3)
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    /* JADX INFO: renamed from: id */
    public int m71id() {
            r3 = this;
            r0 = 8
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            short r1 = r1.getShort(r2)
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public boolean key() {
            r4 = this;
            r0 = 20
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r2 = r4.f50bb
            int r3 = r4.bb_pos
            int r3 = r3 + r0
            byte r2 = r2.get(r3)
            if (r2 == 0) goto L15
            r1 = 1
        L15:
            return r1
    }

    @Override // com.google.flatbuffers.Table
    protected int keysCompare(java.lang.Integer r4, java.lang.Integer r5, java.nio.ByteBuffer r6) {
            r3 = this;
            int r0 = r4.intValue()
            r1 = 4
            int r0 = __offset(r1, r0, r6)
            int r2 = r5.intValue()
            int r1 = __offset(r1, r2, r6)
            int r0 = compareStrings(r0, r1, r6)
            return r0
    }

    public java.lang.String name() {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Lf
            int r1 = r2.bb_pos
            int r1 = r1 + r0
            java.lang.String r1 = r2.__string(r1)
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
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
            java.nio.ByteBuffer r0 = r2.__vector_in_bytebuffer(r3, r0, r1)
            return r0
    }

    public int offset() {
            r3 = this;
            r0 = 10
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            short r1 = r1.getShort(r2)
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public boolean offset64() {
            r4 = this;
            r0 = 30
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r2 = r4.f50bb
            int r3 = r4.bb_pos
            int r3 = r3 + r0
            byte r2 = r2.get(r3)
            if (r2 == 0) goto L15
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
            java.nio.ByteBuffer r2 = r4.f50bb
            int r3 = r4.bb_pos
            int r3 = r3 + r0
            byte r2 = r2.get(r3)
            if (r2 == 0) goto L15
            r1 = 1
        L15:
            return r1
    }

    public int padding() {
            r3 = this;
            r0 = 28
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            short r1 = r1.getShort(r2)
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public boolean required() {
            r4 = this;
            r0 = 18
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r2 = r4.f50bb
            int r3 = r4.bb_pos
            int r3 = r3 + r0
            byte r2 = r2.get(r3)
            if (r2 == 0) goto L15
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

    public com.google.flatbuffers.reflection.Type type(com.google.flatbuffers.reflection.Type r4) {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L15
            int r1 = r3.bb_pos
            int r1 = r1 + r0
            int r1 = r3.__indirect(r1)
            java.nio.ByteBuffer r2 = r3.f50bb
            com.google.flatbuffers.reflection.Type r1 = r4.__assign(r1, r2)
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }
}
