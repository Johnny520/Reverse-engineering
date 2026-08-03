package com.google.flatbuffers.reflection;

/* JADX INFO: loaded from: classes.dex */
public final class EnumVal extends com.google.flatbuffers.Table {

    public static final class Vector extends com.google.flatbuffers.BaseVector {
        public Vector() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.flatbuffers.reflection.EnumVal.Vector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
                r0 = this;
                r0.__reset(r1, r2, r3)
                return r0
        }

        public com.google.flatbuffers.reflection.EnumVal get(int r2) {
                r1 = this;
                com.google.flatbuffers.reflection.EnumVal r0 = new com.google.flatbuffers.reflection.EnumVal
                r0.<init>()
                com.google.flatbuffers.reflection.EnumVal r2 = r1.get(r0, r2)
                return r2
        }

        public com.google.flatbuffers.reflection.EnumVal get(com.google.flatbuffers.reflection.EnumVal r2, int r3) {
                r1 = this;
                int r3 = r1.__element(r3)
                java.nio.ByteBuffer r0 = r1.bb
                int r3 = com.google.flatbuffers.reflection.EnumVal.access$000(r3, r0)
                java.nio.ByteBuffer r0 = r1.bb
                com.google.flatbuffers.reflection.EnumVal r2 = r2.__assign(r3, r0)
                return r2
        }

        public com.google.flatbuffers.reflection.EnumVal getByKey(long r4) {
                r3 = this;
                int r0 = r3.__vector()
                java.nio.ByteBuffer r1 = r3.bb
                r2 = 0
                com.google.flatbuffers.reflection.EnumVal r4 = com.google.flatbuffers.reflection.EnumVal.__lookup_by_key(r2, r0, r4, r1)
                return r4
        }

        public com.google.flatbuffers.reflection.EnumVal getByKey(com.google.flatbuffers.reflection.EnumVal r3, long r4) {
                r2 = this;
                int r0 = r2.__vector()
                java.nio.ByteBuffer r1 = r2.bb
                com.google.flatbuffers.reflection.EnumVal r3 = com.google.flatbuffers.reflection.EnumVal.__lookup_by_key(r3, r0, r4, r1)
                return r3
        }
    }

    public EnumVal() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ValidateVersion() {
            com.google.flatbuffers.Constants.FLATBUFFERS_23_5_26()
            return
    }

    public static com.google.flatbuffers.reflection.EnumVal __lookup_by_key(com.google.flatbuffers.reflection.EnumVal r7, int r8, long r9, java.nio.ByteBuffer r11) {
            int r0 = r8 + (-4)
            int r0 = r11.getInt(r0)
            r1 = 0
            r2 = r1
        L8:
            if (r0 == 0) goto L45
            int r3 = r0 / 2
            int r4 = r2 + r3
            int r4 = r4 * 4
            int r4 = r4 + r8
            int r4 = com.google.flatbuffers.Table.__indirect(r4, r11)
            int r5 = r11.capacity()
            int r5 = r5 - r4
            r6 = 6
            int r5 = com.google.flatbuffers.Table.__offset(r6, r5, r11)
            long r5 = r11.getLong(r5)
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 <= 0) goto L29
            r5 = 1
            goto L2e
        L29:
            if (r5 >= 0) goto L2d
            r5 = -1
            goto L2e
        L2d:
            r5 = r1
        L2e:
            if (r5 <= 0) goto L32
            r0 = r3
            goto L8
        L32:
            if (r5 >= 0) goto L39
            int r3 = r3 + 1
            int r2 = r2 + r3
            int r0 = r0 - r3
            goto L8
        L39:
            if (r7 != 0) goto L40
            com.google.flatbuffers.reflection.EnumVal r7 = new com.google.flatbuffers.reflection.EnumVal
            r7.<init>()
        L40:
            com.google.flatbuffers.reflection.EnumVal r7 = r7.__assign(r4, r11)
            return r7
        L45:
            r7 = 0
            return r7
    }

    public static /* synthetic */ int access$000(int r0, java.nio.ByteBuffer r1) {
            int r0 = com.google.flatbuffers.Table.__indirect(r0, r1)
            return r0
    }

    public static void addAttributes(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 5
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addDocumentation(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 4
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addName(com.google.flatbuffers.FlatBufferBuilder r1, int r2) {
            r0 = 0
            r1.addOffset(r0, r2, r0)
            return
    }

    public static void addUnionType(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 3
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addValue(com.google.flatbuffers.FlatBufferBuilder r0, long r1) {
            r0.addLong(r1)
            r1 = 1
            r0.slot(r1)
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

    public static int createEnumVal(com.google.flatbuffers.FlatBufferBuilder r1, int r2, long r3, int r5, int r6, int r7) {
            r0 = 6
            r1.startTable(r0)
            addValue(r1, r3)
            addAttributes(r1, r7)
            addDocumentation(r1, r6)
            addUnionType(r1, r5)
            addName(r1, r2)
            int r1 = endEnumVal(r1)
            return r1
    }

    public static int endEnumVal(com.google.flatbuffers.FlatBufferBuilder r2) {
            int r0 = r2.endTable()
            r1 = 4
            r2.required(r0, r1)
            return r0
    }

    public static com.google.flatbuffers.reflection.EnumVal getRootAsEnumVal(java.nio.ByteBuffer r1) {
            com.google.flatbuffers.reflection.EnumVal r0 = new com.google.flatbuffers.reflection.EnumVal
            r0.<init>()
            com.google.flatbuffers.reflection.EnumVal r1 = getRootAsEnumVal(r1, r0)
            return r1
    }

    public static com.google.flatbuffers.reflection.EnumVal getRootAsEnumVal(java.nio.ByteBuffer r2, com.google.flatbuffers.reflection.EnumVal r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r0 = r0 + r1
            com.google.flatbuffers.reflection.EnumVal r2 = r3.__assign(r0, r2)
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

    public static void startEnumVal(com.google.flatbuffers.FlatBufferBuilder r1) {
            r0 = 6
            r1.startTable(r0)
            return
    }

    public com.google.flatbuffers.reflection.EnumVal __assign(int r1, java.nio.ByteBuffer r2) {
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
            r0 = 14
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
            r0 = 14
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
            r0 = 14
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
            r0 = 14
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
            r0 = 14
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

    public java.lang.String documentation(int r2) {
            r1 = this;
            r0 = 12
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
            r0 = 12
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
            r0 = 12
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

    @Override // com.google.flatbuffers.Table
    public int keysCompare(java.lang.Integer r4, java.lang.Integer r5, java.nio.ByteBuffer r6) {
            r3 = this;
            int r4 = r4.intValue()
            r0 = 6
            int r4 = com.google.flatbuffers.Table.__offset(r0, r4, r6)
            long r1 = r6.getLong(r4)
            int r4 = r5.intValue()
            int r4 = com.google.flatbuffers.Table.__offset(r0, r4, r6)
            long r4 = r6.getLong(r4)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L1f
            r4 = 1
            goto L24
        L1f:
            if (r4 >= 0) goto L23
            r4 = -1
            goto L24
        L23:
            r4 = 0
        L24:
            return r4
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

    public com.google.flatbuffers.reflection.Type unionType() {
            r1 = this;
            com.google.flatbuffers.reflection.Type r0 = new com.google.flatbuffers.reflection.Type
            r0.<init>()
            com.google.flatbuffers.reflection.Type r0 = r1.unionType(r0)
            return r0
    }

    public com.google.flatbuffers.reflection.Type unionType(com.google.flatbuffers.reflection.Type r3) {
            r2 = this;
            r0 = 10
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L16
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r1 = r2.bb
            com.google.flatbuffers.reflection.Type r3 = r3.__assign(r0, r1)
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }

    public long value() {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            long r0 = r1.getLong(r0)
            goto L13
        L11:
            r0 = 0
        L13:
            return r0
    }
}
