package com.google.flatbuffers.reflection;

/* JADX INFO: loaded from: classes.dex */
public final class RPCCall extends com.google.flatbuffers.Table {

    public static final class Vector extends com.google.flatbuffers.BaseVector {
        public Vector() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.flatbuffers.reflection.RPCCall.Vector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
                r0 = this;
                r0.__reset(r1, r2, r3)
                return r0
        }

        public com.google.flatbuffers.reflection.RPCCall get(int r2) {
                r1 = this;
                com.google.flatbuffers.reflection.RPCCall r0 = new com.google.flatbuffers.reflection.RPCCall
                r0.<init>()
                com.google.flatbuffers.reflection.RPCCall r2 = r1.get(r0, r2)
                return r2
        }

        public com.google.flatbuffers.reflection.RPCCall get(com.google.flatbuffers.reflection.RPCCall r2, int r3) {
                r1 = this;
                int r3 = r1.__element(r3)
                java.nio.ByteBuffer r0 = r1.bb
                int r3 = com.google.flatbuffers.reflection.RPCCall.access$000(r3, r0)
                java.nio.ByteBuffer r0 = r1.bb
                com.google.flatbuffers.reflection.RPCCall r2 = r2.__assign(r3, r0)
                return r2
        }

        public com.google.flatbuffers.reflection.RPCCall getByKey(com.google.flatbuffers.reflection.RPCCall r3, java.lang.String r4) {
                r2 = this;
                int r0 = r2.__vector()
                java.nio.ByteBuffer r1 = r2.bb
                com.google.flatbuffers.reflection.RPCCall r3 = com.google.flatbuffers.reflection.RPCCall.__lookup_by_key(r3, r0, r4, r1)
                return r3
        }

        public com.google.flatbuffers.reflection.RPCCall getByKey(java.lang.String r4) {
                r3 = this;
                int r0 = r3.__vector()
                java.nio.ByteBuffer r1 = r3.bb
                r2 = 0
                com.google.flatbuffers.reflection.RPCCall r4 = com.google.flatbuffers.reflection.RPCCall.__lookup_by_key(r2, r0, r4, r1)
                return r4
        }
    }

    public RPCCall() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ValidateVersion() {
            com.google.flatbuffers.Constants.FLATBUFFERS_23_5_26()
            return
    }

    public static com.google.flatbuffers.reflection.RPCCall __lookup_by_key(com.google.flatbuffers.reflection.RPCCall r6, int r7, java.lang.String r8, java.nio.ByteBuffer r9) {
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
            com.google.flatbuffers.reflection.RPCCall r6 = new com.google.flatbuffers.reflection.RPCCall
            r6.<init>()
        L39:
            com.google.flatbuffers.reflection.RPCCall r6 = r6.__assign(r3, r9)
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
            r0 = 3
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

    public static void addName(com.google.flatbuffers.FlatBufferBuilder r0, int r1) {
            r0.addOffset(r1)
            r1 = 0
            r0.slot(r1)
            return
    }

    public static void addRequest(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 1
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static void addResponse(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 2
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

    public static int createRPCCall(com.google.flatbuffers.FlatBufferBuilder r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = 5
            r1.startTable(r0)
            addDocumentation(r1, r6)
            addAttributes(r1, r5)
            addResponse(r1, r4)
            addRequest(r1, r3)
            addName(r1, r2)
            int r1 = endRPCCall(r1)
            return r1
    }

    public static int endRPCCall(com.google.flatbuffers.FlatBufferBuilder r2) {
            int r0 = r2.endTable()
            r1 = 4
            r2.required(r0, r1)
            r1 = 6
            r2.required(r0, r1)
            r1 = 8
            r2.required(r0, r1)
            return r0
    }

    public static com.google.flatbuffers.reflection.RPCCall getRootAsRPCCall(java.nio.ByteBuffer r1) {
            com.google.flatbuffers.reflection.RPCCall r0 = new com.google.flatbuffers.reflection.RPCCall
            r0.<init>()
            com.google.flatbuffers.reflection.RPCCall r1 = getRootAsRPCCall(r1, r0)
            return r1
    }

    public static com.google.flatbuffers.reflection.RPCCall getRootAsRPCCall(java.nio.ByteBuffer r2, com.google.flatbuffers.reflection.RPCCall r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r0 = r0 + r1
            com.google.flatbuffers.reflection.RPCCall r2 = r3.__assign(r0, r2)
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

    public static void startRPCCall(com.google.flatbuffers.FlatBufferBuilder r1) {
            r0 = 5
            r1.startTable(r0)
            return
    }

    public com.google.flatbuffers.reflection.RPCCall __assign(int r1, java.nio.ByteBuffer r2) {
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
            r0 = 10
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
            r0 = 10
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
            r0 = 10
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
            r0 = 10
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
            r0 = 10
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

    public com.google.flatbuffers.reflection.Object request() {
            r1 = this;
            com.google.flatbuffers.reflection.Object r0 = new com.google.flatbuffers.reflection.Object
            r0.<init>()
            com.google.flatbuffers.reflection.Object r0 = r1.request(r0)
            return r0
    }

    public com.google.flatbuffers.reflection.Object request(com.google.flatbuffers.reflection.Object r3) {
            r2 = this;
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L15
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r1 = r2.bb
            com.google.flatbuffers.reflection.Object r3 = r3.__assign(r0, r1)
            goto L16
        L15:
            r3 = 0
        L16:
            return r3
    }

    public com.google.flatbuffers.reflection.Object response() {
            r1 = this;
            com.google.flatbuffers.reflection.Object r0 = new com.google.flatbuffers.reflection.Object
            r0.<init>()
            com.google.flatbuffers.reflection.Object r0 = r1.response(r0)
            return r0
    }

    public com.google.flatbuffers.reflection.Object response(com.google.flatbuffers.reflection.Object r3) {
            r2 = this;
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L16
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r1 = r2.bb
            com.google.flatbuffers.reflection.Object r3 = r3.__assign(r0, r1)
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }
}
