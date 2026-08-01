package com.google.flatbuffers.reflection;

/* JADX INFO: loaded from: classes2.dex */
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
                com.google.flatbuffers.reflection.EnumVal r0 = r1.get(r0, r2)
                return r0
        }

        public com.google.flatbuffers.reflection.EnumVal get(com.google.flatbuffers.reflection.EnumVal r3, int r4) {
                r2 = this;
                int r0 = r2.__element(r4)
                java.nio.ByteBuffer r1 = r2.f44bb
                int r0 = com.google.flatbuffers.reflection.EnumVal.access$000(r0, r1)
                java.nio.ByteBuffer r1 = r2.f44bb
                com.google.flatbuffers.reflection.EnumVal r0 = r3.__assign(r0, r1)
                return r0
        }

        public com.google.flatbuffers.reflection.EnumVal getByKey(long r4) {
                r3 = this;
                int r0 = r3.__vector()
                java.nio.ByteBuffer r1 = r3.f44bb
                r2 = 0
                com.google.flatbuffers.reflection.EnumVal r0 = com.google.flatbuffers.reflection.EnumVal.__lookup_by_key(r2, r0, r4, r1)
                return r0
        }

        public com.google.flatbuffers.reflection.EnumVal getByKey(com.google.flatbuffers.reflection.EnumVal r3, long r4) {
                r2 = this;
                int r0 = r2.__vector()
                java.nio.ByteBuffer r1 = r2.f44bb
                com.google.flatbuffers.reflection.EnumVal r0 = com.google.flatbuffers.reflection.EnumVal.__lookup_by_key(r3, r0, r4, r1)
                return r0
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

    public static com.google.flatbuffers.reflection.EnumVal __lookup_by_key(com.google.flatbuffers.reflection.EnumVal r8, int r9, long r10, java.nio.ByteBuffer r12) {
            int r0 = r9 + (-4)
            int r0 = r12.getInt(r0)
            r1 = 0
        L7:
            if (r0 == 0) goto L48
            int r2 = r0 / 2
            int r3 = r1 + r2
            int r3 = r3 * 4
            int r3 = r3 + r9
            int r3 = __indirect(r3, r12)
            int r4 = r12.capacity()
            int r4 = r4 - r3
            r5 = 6
            int r4 = __offset(r5, r4, r12)
            long r4 = r12.getLong(r4)
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 <= 0) goto L28
            r6 = 1
            goto L2f
        L28:
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 >= 0) goto L2e
            r6 = -1
            goto L2f
        L2e:
            r6 = 0
        L2f:
            if (r6 <= 0) goto L33
            r0 = r2
            goto L39
        L33:
            if (r6 >= 0) goto L3a
            int r2 = r2 + 1
            int r1 = r1 + r2
            int r0 = r0 - r2
        L39:
            goto L7
        L3a:
            if (r8 != 0) goto L42
            com.google.flatbuffers.reflection.EnumVal r7 = new com.google.flatbuffers.reflection.EnumVal
            r7.<init>()
            goto L43
        L42:
            r7 = r8
        L43:
            com.google.flatbuffers.reflection.EnumVal r7 = r7.__assign(r3, r12)
            return r7
        L48:
            r2 = 0
            return r2
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

    public static void addValue(com.google.flatbuffers.FlatBufferBuilder r1, long r2) {
            r1.addLong(r2)
            r0 = 1
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

    public static int createEnumVal(com.google.flatbuffers.FlatBufferBuilder r1, int r2, long r3, int r5, int r6, int r7) {
            r0 = 6
            r1.startTable(r0)
            addValue(r1, r3)
            addAttributes(r1, r7)
            addDocumentation(r1, r6)
            addUnionType(r1, r5)
            addName(r1, r2)
            int r0 = endEnumVal(r1)
            return r0
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
            com.google.flatbuffers.reflection.EnumVal r0 = getRootAsEnumVal(r1, r0)
            return r0
    }

    public static com.google.flatbuffers.reflection.EnumVal getRootAsEnumVal(java.nio.ByteBuffer r2, com.google.flatbuffers.reflection.EnumVal r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r0 = r0 + r1
            com.google.flatbuffers.reflection.EnumVal r0 = r3.__assign(r0, r2)
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

    public java.lang.String documentation(int r4) {
            r3 = this;
            r0 = 12
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
            r0 = 12
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
            r0 = 12
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

    @Override // com.google.flatbuffers.Table
    protected int keysCompare(java.lang.Integer r6, java.lang.Integer r7, java.nio.ByteBuffer r8) {
            r5 = this;
            int r0 = r6.intValue()
            r1 = 6
            int r0 = __offset(r1, r0, r8)
            long r2 = r8.getLong(r0)
            int r0 = r7.intValue()
            int r0 = __offset(r1, r0, r8)
            long r0 = r8.getLong(r0)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L1f
            r4 = 1
            goto L26
        L1f:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L25
            r4 = -1
            goto L26
        L25:
            r4 = 0
        L26:
            return r4
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

    public com.google.flatbuffers.reflection.Type unionType() {
            r1 = this;
            com.google.flatbuffers.reflection.Type r0 = new com.google.flatbuffers.reflection.Type
            r0.<init>()
            com.google.flatbuffers.reflection.Type r0 = r1.unionType(r0)
            return r0
    }

    public com.google.flatbuffers.reflection.Type unionType(com.google.flatbuffers.reflection.Type r4) {
            r3 = this;
            r0 = 10
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L16
            int r1 = r3.bb_pos
            int r1 = r1 + r0
            int r1 = r3.__indirect(r1)
            java.nio.ByteBuffer r2 = r3.f50bb
            com.google.flatbuffers.reflection.Type r1 = r4.__assign(r1, r2)
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public long value() {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            long r1 = r1.getLong(r2)
            goto L13
        L11:
            r1 = 0
        L13:
            return r1
    }
}
