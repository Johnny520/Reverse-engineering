package com.google.flatbuffers.reflection;

/* JADX INFO: loaded from: classes2.dex */
public final class Object extends com.google.flatbuffers.Table {

    public static final class Vector extends com.google.flatbuffers.BaseVector {
        public Vector() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.flatbuffers.reflection.Object.Vector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
                r0 = this;
                r0.__reset(r1, r2, r3)
                return r0
        }

        public com.google.flatbuffers.reflection.Object get(int r2) {
                r1 = this;
                com.google.flatbuffers.reflection.Object r0 = new com.google.flatbuffers.reflection.Object
                r0.<init>()
                com.google.flatbuffers.reflection.Object r0 = r1.get(r0, r2)
                return r0
        }

        public com.google.flatbuffers.reflection.Object get(com.google.flatbuffers.reflection.Object r3, int r4) {
                r2 = this;
                int r0 = r2.__element(r4)
                java.nio.ByteBuffer r1 = r2.f44bb
                int r0 = com.google.flatbuffers.reflection.Object.access$000(r0, r1)
                java.nio.ByteBuffer r1 = r2.f44bb
                com.google.flatbuffers.reflection.Object r0 = r3.__assign(r0, r1)
                return r0
        }

        public com.google.flatbuffers.reflection.Object getByKey(com.google.flatbuffers.reflection.Object r3, java.lang.String r4) {
                r2 = this;
                int r0 = r2.__vector()
                java.nio.ByteBuffer r1 = r2.f44bb
                com.google.flatbuffers.reflection.Object r0 = com.google.flatbuffers.reflection.Object.__lookup_by_key(r3, r0, r4, r1)
                return r0
        }

        public com.google.flatbuffers.reflection.Object getByKey(java.lang.String r4) {
                r3 = this;
                int r0 = r3.__vector()
                java.nio.ByteBuffer r1 = r3.f44bb
                r2 = 0
                com.google.flatbuffers.reflection.Object r0 = com.google.flatbuffers.reflection.Object.__lookup_by_key(r2, r0, r4, r1)
                return r0
        }
    }

    public Object() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ValidateVersion() {
            com.google.flatbuffers.Constants.FLATBUFFERS_23_5_26()
            return
    }

    public static com.google.flatbuffers.reflection.Object __lookup_by_key(com.google.flatbuffers.reflection.Object r7, int r8, java.lang.String r9, java.nio.ByteBuffer r10) {
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
            com.google.flatbuffers.reflection.Object r6 = new com.google.flatbuffers.reflection.Object
            r6.<init>()
            goto L3b
        L3a:
            r6 = r7
        L3b:
            com.google.flatbuffers.reflection.Object r6 = r6.__assign(r4, r10)
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
            r0 = 5
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addBytesize(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 4
            r1 = 0
            r2.addInt(r0, r3, r1)
            return
    }

    public static void addDeclarationFile(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 7
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addDocumentation(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 6
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addFields(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 1
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addIsStruct(com.google.flatbuffers.FlatBufferBuilder r2, boolean r3) {
            r0 = 2
            r1 = 0
            r2.addBoolean(r0, r3, r1)
            return
    }

    public static void addMinalign(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 3
            r1 = 0
            r2.addInt(r0, r3, r1)
            return
    }

    public static void addName(com.google.flatbuffers.FlatBufferBuilder r1, int r2) {
            r1.addOffset(r2)
            r0 = 0
            r1.slot(r0)
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

    public static int createFieldsVector(com.google.flatbuffers.FlatBufferBuilder r2, int[] r3) {
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

    public static int createObject(com.google.flatbuffers.FlatBufferBuilder r1, int r2, int r3, boolean r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = 8
            r1.startTable(r0)
            addDeclarationFile(r1, r9)
            addDocumentation(r1, r8)
            addAttributes(r1, r7)
            addBytesize(r1, r6)
            addMinalign(r1, r5)
            addFields(r1, r3)
            addName(r1, r2)
            addIsStruct(r1, r4)
            int r0 = endObject(r1)
            return r0
    }

    public static int endObject(com.google.flatbuffers.FlatBufferBuilder r2) {
            int r0 = r2.endTable()
            r1 = 4
            r2.required(r0, r1)
            r1 = 6
            r2.required(r0, r1)
            return r0
    }

    public static com.google.flatbuffers.reflection.Object getRootAsObject(java.nio.ByteBuffer r1) {
            com.google.flatbuffers.reflection.Object r0 = new com.google.flatbuffers.reflection.Object
            r0.<init>()
            com.google.flatbuffers.reflection.Object r0 = getRootAsObject(r1, r0)
            return r0
    }

    public static com.google.flatbuffers.reflection.Object getRootAsObject(java.nio.ByteBuffer r2, com.google.flatbuffers.reflection.Object r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r0 = r0 + r1
            com.google.flatbuffers.reflection.Object r0 = r3.__assign(r0, r2)
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

    public static void startFieldsVector(com.google.flatbuffers.FlatBufferBuilder r1, int r2) {
            r0 = 4
            r1.startVector(r0, r2, r0)
            return
    }

    public static void startObject(com.google.flatbuffers.FlatBufferBuilder r1) {
            r0 = 8
            r1.startTable(r0)
            return
    }

    public com.google.flatbuffers.reflection.Object __assign(int r1, java.nio.ByteBuffer r2) {
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
            r0 = 14
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
            r0 = 14
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
            r0 = 14
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
            r0 = 14
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
            r0 = 14
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

    public int bytesize() {
            r3 = this;
            r0 = 12
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public java.lang.String declarationFile() {
            r2 = this;
            r0 = 18
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L10
            int r1 = r2.bb_pos
            int r1 = r1 + r0
            java.lang.String r1 = r2.__string(r1)
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public java.nio.ByteBuffer declarationFileAsByteBuffer() {
            r2 = this;
            r0 = 18
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            return r0
    }

    public java.nio.ByteBuffer declarationFileInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 18
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_in_bytebuffer(r3, r0, r1)
            return r0
    }

    public java.lang.String documentation(int r4) {
            r3 = this;
            r0 = 16
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
            r0 = 16
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
            r0 = 16
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

    public com.google.flatbuffers.reflection.Field fields(int r2) {
            r1 = this;
            com.google.flatbuffers.reflection.Field r0 = new com.google.flatbuffers.reflection.Field
            r0.<init>()
            com.google.flatbuffers.reflection.Field r0 = r1.fields(r0, r2)
            return r0
    }

    public com.google.flatbuffers.reflection.Field fields(com.google.flatbuffers.reflection.Field r4, int r5) {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L19
            int r1 = r3.__vector(r0)
            int r2 = r5 * 4
            int r1 = r1 + r2
            int r1 = r3.__indirect(r1)
            java.nio.ByteBuffer r2 = r3.f50bb
            com.google.flatbuffers.reflection.Field r1 = r4.__assign(r1, r2)
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
    }

    public com.google.flatbuffers.reflection.Field fieldsByKey(com.google.flatbuffers.reflection.Field r4, java.lang.String r5) {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            int r1 = r3.__vector(r0)
            java.nio.ByteBuffer r2 = r3.f50bb
            com.google.flatbuffers.reflection.Field r1 = com.google.flatbuffers.reflection.Field.__lookup_by_key(r4, r1, r5, r2)
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public com.google.flatbuffers.reflection.Field fieldsByKey(java.lang.String r5) {
            r4 = this;
            r0 = 6
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L12
            int r2 = r4.__vector(r0)
            java.nio.ByteBuffer r3 = r4.f50bb
            com.google.flatbuffers.reflection.Field r1 = com.google.flatbuffers.reflection.Field.__lookup_by_key(r1, r2, r5, r3)
        L12:
            return r1
    }

    public int fieldsLength() {
            r2 = this;
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Lc
            int r1 = r2.__vector_len(r0)
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public com.google.flatbuffers.reflection.Field.Vector fieldsVector() {
            r1 = this;
            com.google.flatbuffers.reflection.Field$Vector r0 = new com.google.flatbuffers.reflection.Field$Vector
            r0.<init>()
            com.google.flatbuffers.reflection.Field$Vector r0 = r1.fieldsVector(r0)
            return r0
    }

    public com.google.flatbuffers.reflection.Field.Vector fieldsVector(com.google.flatbuffers.reflection.Field.Vector r5) {
            r4 = this;
            r0 = 6
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L13
            int r1 = r4.__vector(r0)
            r2 = 4
            java.nio.ByteBuffer r3 = r4.f50bb
            com.google.flatbuffers.reflection.Field$Vector r1 = r5.__assign(r1, r2, r3)
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public boolean isStruct() {
            r4 = this;
            r0 = 8
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

    public int minalign() {
            r3 = this;
            r0 = 10
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
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
}
