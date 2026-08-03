package com.google.flatbuffers.reflection;

/* JADX INFO: loaded from: classes.dex */
public final class SchemaFile extends com.google.flatbuffers.Table {

    public static final class Vector extends com.google.flatbuffers.BaseVector {
        public Vector() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.flatbuffers.reflection.SchemaFile.Vector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
                r0 = this;
                r0.__reset(r1, r2, r3)
                return r0
        }

        public com.google.flatbuffers.reflection.SchemaFile get(int r2) {
                r1 = this;
                com.google.flatbuffers.reflection.SchemaFile r0 = new com.google.flatbuffers.reflection.SchemaFile
                r0.<init>()
                com.google.flatbuffers.reflection.SchemaFile r2 = r1.get(r0, r2)
                return r2
        }

        public com.google.flatbuffers.reflection.SchemaFile get(com.google.flatbuffers.reflection.SchemaFile r2, int r3) {
                r1 = this;
                int r3 = r1.__element(r3)
                java.nio.ByteBuffer r0 = r1.bb
                int r3 = com.google.flatbuffers.reflection.SchemaFile.access$000(r3, r0)
                java.nio.ByteBuffer r0 = r1.bb
                com.google.flatbuffers.reflection.SchemaFile r2 = r2.__assign(r3, r0)
                return r2
        }

        public com.google.flatbuffers.reflection.SchemaFile getByKey(com.google.flatbuffers.reflection.SchemaFile r3, java.lang.String r4) {
                r2 = this;
                int r0 = r2.__vector()
                java.nio.ByteBuffer r1 = r2.bb
                com.google.flatbuffers.reflection.SchemaFile r3 = com.google.flatbuffers.reflection.SchemaFile.__lookup_by_key(r3, r0, r4, r1)
                return r3
        }

        public com.google.flatbuffers.reflection.SchemaFile getByKey(java.lang.String r4) {
                r3 = this;
                int r0 = r3.__vector()
                java.nio.ByteBuffer r1 = r3.bb
                r2 = 0
                com.google.flatbuffers.reflection.SchemaFile r4 = com.google.flatbuffers.reflection.SchemaFile.__lookup_by_key(r2, r0, r4, r1)
                return r4
        }
    }

    public SchemaFile() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ValidateVersion() {
            com.google.flatbuffers.Constants.FLATBUFFERS_23_5_26()
            return
    }

    public static com.google.flatbuffers.reflection.SchemaFile __lookup_by_key(com.google.flatbuffers.reflection.SchemaFile r6, int r7, java.lang.String r8, java.nio.ByteBuffer r9) {
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
            com.google.flatbuffers.reflection.SchemaFile r6 = new com.google.flatbuffers.reflection.SchemaFile
            r6.<init>()
        L39:
            com.google.flatbuffers.reflection.SchemaFile r6 = r6.__assign(r3, r9)
            return r6
        L3e:
            r6 = 0
            return r6
    }

    public static /* synthetic */ int access$000(int r0, java.nio.ByteBuffer r1) {
            int r0 = com.google.flatbuffers.Table.__indirect(r0, r1)
            return r0
    }

    public static void addFilename(com.google.flatbuffers.FlatBufferBuilder r0, int r1) {
            r0.addOffset(r1)
            r1 = 0
            r0.slot(r1)
            return
    }

    public static void addIncludedFilenames(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 1
            r1 = 0
            r2.addOffset(r0, r3, r1)
            return
    }

    public static int createIncludedFilenamesVector(com.google.flatbuffers.FlatBufferBuilder r2, int[] r3) {
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

    public static int createSchemaFile(com.google.flatbuffers.FlatBufferBuilder r1, int r2, int r3) {
            r0 = 2
            r1.startTable(r0)
            addIncludedFilenames(r1, r3)
            addFilename(r1, r2)
            int r1 = endSchemaFile(r1)
            return r1
    }

    public static int endSchemaFile(com.google.flatbuffers.FlatBufferBuilder r2) {
            int r0 = r2.endTable()
            r1 = 4
            r2.required(r0, r1)
            return r0
    }

    public static com.google.flatbuffers.reflection.SchemaFile getRootAsSchemaFile(java.nio.ByteBuffer r1) {
            com.google.flatbuffers.reflection.SchemaFile r0 = new com.google.flatbuffers.reflection.SchemaFile
            r0.<init>()
            com.google.flatbuffers.reflection.SchemaFile r1 = getRootAsSchemaFile(r1, r0)
            return r1
    }

    public static com.google.flatbuffers.reflection.SchemaFile getRootAsSchemaFile(java.nio.ByteBuffer r2, com.google.flatbuffers.reflection.SchemaFile r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r0 = r0 + r1
            com.google.flatbuffers.reflection.SchemaFile r2 = r3.__assign(r0, r2)
            return r2
    }

    public static void startIncludedFilenamesVector(com.google.flatbuffers.FlatBufferBuilder r1, int r2) {
            r0 = 4
            r1.startVector(r0, r2, r0)
            return
    }

    public static void startSchemaFile(com.google.flatbuffers.FlatBufferBuilder r1) {
            r0 = 2
            r1.startTable(r0)
            return
    }

    public com.google.flatbuffers.reflection.SchemaFile __assign(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__init(r1, r2)
            return r0
    }

    public void __init(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__reset(r1, r2)
            return
    }

    public java.lang.String filename() {
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

    public java.nio.ByteBuffer filenameAsByteBuffer() {
            r2 = this;
            r0 = 4
            r1 = 1
            java.nio.ByteBuffer r0 = r2.__vector_as_bytebuffer(r0, r1)
            return r0
    }

    public java.nio.ByteBuffer filenameInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 4
            r1 = 1
            java.nio.ByteBuffer r3 = r2.__vector_in_bytebuffer(r3, r0, r1)
            return r3
    }

    public java.lang.String includedFilenames(int r2) {
            r1 = this;
            r0 = 6
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L13
            int r0 = r1.__vector(r0)
            int r2 = r2 * 4
            int r0 = r0 + r2
            java.lang.String r2 = r1.__string(r0)
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
    }

    public int includedFilenamesLength() {
            r1 = this;
            r0 = 6
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Lc
            int r0 = r1.__vector_len(r0)
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public com.google.flatbuffers.StringVector includedFilenamesVector() {
            r1 = this;
            com.google.flatbuffers.StringVector r0 = new com.google.flatbuffers.StringVector
            r0.<init>()
            com.google.flatbuffers.StringVector r0 = r1.includedFilenamesVector(r0)
            return r0
    }

    public com.google.flatbuffers.StringVector includedFilenamesVector(com.google.flatbuffers.StringVector r4) {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L13
            int r0 = r3.__vector(r0)
            r1 = 4
            java.nio.ByteBuffer r2 = r3.bb
            com.google.flatbuffers.StringVector r4 = r4.__assign(r0, r1, r2)
            goto L14
        L13:
            r4 = 0
        L14:
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
}
