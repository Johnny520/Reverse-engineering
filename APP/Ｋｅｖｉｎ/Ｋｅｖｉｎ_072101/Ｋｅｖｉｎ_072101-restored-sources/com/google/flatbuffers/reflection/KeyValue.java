package com.google.flatbuffers.reflection;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyValue extends com.google.flatbuffers.Table {

    public static final class Vector extends com.google.flatbuffers.BaseVector {
        public Vector() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.flatbuffers.reflection.KeyValue.Vector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
                r0 = this;
                r0.__reset(r1, r2, r3)
                return r0
        }

        public com.google.flatbuffers.reflection.KeyValue get(int r2) {
                r1 = this;
                com.google.flatbuffers.reflection.KeyValue r0 = new com.google.flatbuffers.reflection.KeyValue
                r0.<init>()
                com.google.flatbuffers.reflection.KeyValue r0 = r1.get(r0, r2)
                return r0
        }

        public com.google.flatbuffers.reflection.KeyValue get(com.google.flatbuffers.reflection.KeyValue r3, int r4) {
                r2 = this;
                int r0 = r2.__element(r4)
                java.nio.ByteBuffer r1 = r2.f44bb
                int r0 = com.google.flatbuffers.reflection.KeyValue.access$000(r0, r1)
                java.nio.ByteBuffer r1 = r2.f44bb
                com.google.flatbuffers.reflection.KeyValue r0 = r3.__assign(r0, r1)
                return r0
        }

        public com.google.flatbuffers.reflection.KeyValue getByKey(com.google.flatbuffers.reflection.KeyValue r3, java.lang.String r4) {
                r2 = this;
                int r0 = r2.__vector()
                java.nio.ByteBuffer r1 = r2.f44bb
                com.google.flatbuffers.reflection.KeyValue r0 = com.google.flatbuffers.reflection.KeyValue.__lookup_by_key(r3, r0, r4, r1)
                return r0
        }

        public com.google.flatbuffers.reflection.KeyValue getByKey(java.lang.String r4) {
                r3 = this;
                int r0 = r3.__vector()
                java.nio.ByteBuffer r1 = r3.f44bb
                r2 = 0
                com.google.flatbuffers.reflection.KeyValue r0 = com.google.flatbuffers.reflection.KeyValue.__lookup_by_key(r2, r0, r4, r1)
                return r0
        }
    }

    public KeyValue() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ValidateVersion() {
            com.google.flatbuffers.Constants.FLATBUFFERS_23_5_26()
            return
    }

    public static com.google.flatbuffers.reflection.KeyValue __lookup_by_key(com.google.flatbuffers.reflection.KeyValue r7, int r8, java.lang.String r9, java.nio.ByteBuffer r10) {
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
            com.google.flatbuffers.reflection.KeyValue r6 = new com.google.flatbuffers.reflection.KeyValue
            r6.<init>()
            goto L3b
        L3a:
            r6 = r7
        L3b:
            com.google.flatbuffers.reflection.KeyValue r6 = r6.__assign(r4, r10)
            return r6
        L40:
            r3 = 0
            return r3
    }

    static /* synthetic */ int access$000(int r1, java.nio.ByteBuffer r2) {
            int r0 = __indirect(r1, r2)
            return r0
    }

    public static void addKey(com.google.flatbuffers.FlatBufferBuilder r1, int r2) {
            r1.addOffset(r2)
            r0 = 0
            r1.slot(r0)
            return
    }

    public static void addValue(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 1
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static int createKeyValue(com.google.flatbuffers.FlatBufferBuilder r1, int r2, int r3) {
            r0 = 2
            r1.startTable(r0)
            addValue(r1, r3)
            addKey(r1, r2)
            int r0 = endKeyValue(r1)
            return r0
    }

    public static int endKeyValue(com.google.flatbuffers.FlatBufferBuilder r2) {
            int r0 = r2.endTable()
            r1 = 4
            r2.required(r0, r1)
            return r0
    }

    public static com.google.flatbuffers.reflection.KeyValue getRootAsKeyValue(java.nio.ByteBuffer r1) {
            com.google.flatbuffers.reflection.KeyValue r0 = new com.google.flatbuffers.reflection.KeyValue
            r0.<init>()
            com.google.flatbuffers.reflection.KeyValue r0 = getRootAsKeyValue(r1, r0)
            return r0
    }

    public static com.google.flatbuffers.reflection.KeyValue getRootAsKeyValue(java.nio.ByteBuffer r2, com.google.flatbuffers.reflection.KeyValue r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r0 = r0 + r1
            com.google.flatbuffers.reflection.KeyValue r0 = r3.__assign(r0, r2)
            return r0
    }

    public static void startKeyValue(com.google.flatbuffers.FlatBufferBuilder r1) {
            r0 = 2
            r1.startTable(r0)
            return
    }

    public com.google.flatbuffers.reflection.KeyValue __assign(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__init(r1, r2)
            return r0
    }

    public void __init(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__reset(r1, r2)
            return
    }

    public java.lang.String key() {
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

    public java.nio.ByteBuffer keyAsByteBuffer() {
            r2 = this;
            r0 = 4
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            return r0
    }

    public java.nio.ByteBuffer keyInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 4
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_in_bytebuffer(r3, r0, r1)
            return r0
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

    public java.lang.String value() {
            r2 = this;
            r0 = 6
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

    public java.nio.ByteBuffer valueAsByteBuffer() {
            r2 = this;
            r0 = 6
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            return r0
    }

    public java.nio.ByteBuffer valueInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 6
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_in_bytebuffer(r3, r0, r1)
            return r0
    }
}
