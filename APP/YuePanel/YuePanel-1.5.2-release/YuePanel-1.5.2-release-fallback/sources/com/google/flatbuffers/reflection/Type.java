package com.google.flatbuffers.reflection;

/* JADX INFO: loaded from: classes.dex */
public final class Type extends com.google.flatbuffers.Table {

    public static final class Vector extends com.google.flatbuffers.BaseVector {
        public Vector() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.flatbuffers.reflection.Type.Vector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
                r0 = this;
                r0.__reset(r1, r2, r3)
                return r0
        }

        public com.google.flatbuffers.reflection.Type get(int r2) {
                r1 = this;
                com.google.flatbuffers.reflection.Type r0 = new com.google.flatbuffers.reflection.Type
                r0.<init>()
                com.google.flatbuffers.reflection.Type r2 = r1.get(r0, r2)
                return r2
        }

        public com.google.flatbuffers.reflection.Type get(com.google.flatbuffers.reflection.Type r2, int r3) {
                r1 = this;
                int r3 = r1.__element(r3)
                java.nio.ByteBuffer r0 = r1.bb
                int r3 = com.google.flatbuffers.reflection.Type.access$000(r3, r0)
                java.nio.ByteBuffer r0 = r1.bb
                com.google.flatbuffers.reflection.Type r2 = r2.__assign(r3, r0)
                return r2
        }
    }

    public Type() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ValidateVersion() {
            com.google.flatbuffers.Constants.FLATBUFFERS_23_5_26()
            return
    }

    public static /* synthetic */ int access$000(int r0, java.nio.ByteBuffer r1) {
            int r0 = com.google.flatbuffers.Table.__indirect(r0, r1)
            return r0
    }

    public static void addBaseSize(com.google.flatbuffers.FlatBufferBuilder r1, long r2) {
            r0 = 4
            int r2 = (int) r2
            r1.addInt(r0, r2, r0)
            return
    }

    public static void addBaseType(com.google.flatbuffers.FlatBufferBuilder r1, byte r2) {
            r0 = 0
            r1.addByte(r0, r2, r0)
            return
    }

    public static void addElement(com.google.flatbuffers.FlatBufferBuilder r2, byte r3) {
            r0 = 1
            r1 = 0
            r2.addByte(r0, r3, r1)
            return
    }

    public static void addElementSize(com.google.flatbuffers.FlatBufferBuilder r1, long r2) {
            int r2 = (int) r2
            r3 = 0
            r0 = 5
            r1.addInt(r0, r2, r3)
            return
    }

    public static void addFixedLength(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            short r3 = (short) r3
            r0 = 0
            r1 = 3
            r2.addShort(r1, r3, r0)
            return
    }

    public static void addIndex(com.google.flatbuffers.FlatBufferBuilder r2, int r3) {
            r0 = 2
            r1 = -1
            r2.addInt(r0, r3, r1)
            return
    }

    public static int createType(com.google.flatbuffers.FlatBufferBuilder r1, byte r2, byte r3, int r4, int r5, long r6, long r8) {
            r0 = 6
            r1.startTable(r0)
            addElementSize(r1, r8)
            addBaseSize(r1, r6)
            addIndex(r1, r4)
            addFixedLength(r1, r5)
            addElement(r1, r3)
            addBaseType(r1, r2)
            int r1 = endType(r1)
            return r1
    }

    public static int endType(com.google.flatbuffers.FlatBufferBuilder r0) {
            int r0 = r0.endTable()
            return r0
    }

    public static com.google.flatbuffers.reflection.Type getRootAsType(java.nio.ByteBuffer r1) {
            com.google.flatbuffers.reflection.Type r0 = new com.google.flatbuffers.reflection.Type
            r0.<init>()
            com.google.flatbuffers.reflection.Type r1 = getRootAsType(r1, r0)
            return r1
    }

    public static com.google.flatbuffers.reflection.Type getRootAsType(java.nio.ByteBuffer r2, com.google.flatbuffers.reflection.Type r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r0 = r0 + r1
            com.google.flatbuffers.reflection.Type r2 = r3.__assign(r0, r2)
            return r2
    }

    public static void startType(com.google.flatbuffers.FlatBufferBuilder r1) {
            r0 = 6
            r1.startTable(r0)
            return
    }

    public com.google.flatbuffers.reflection.Type __assign(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__init(r1, r2)
            return r0
    }

    public void __init(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.__reset(r1, r2)
            return
    }

    public long baseSize() {
            r4 = this;
            r0 = 12
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L19
            java.nio.ByteBuffer r1 = r4.bb
            int r2 = r4.bb_pos
            int r0 = r0 + r2
            int r0 = r1.getInt(r0)
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            goto L1b
        L19:
            r0 = 4
        L1b:
            return r0
    }

    public byte baseType() {
            r3 = this;
            r0 = 4
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            byte r0 = r1.get(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public byte element() {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            byte r0 = r1.get(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public long elementSize() {
            r4 = this;
            r0 = 14
            int r0 = r4.__offset(r0)
            if (r0 == 0) goto L19
            java.nio.ByteBuffer r1 = r4.bb
            int r2 = r4.bb_pos
            int r0 = r0 + r2
            int r0 = r1.getInt(r0)
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            goto L1b
        L19:
            r0 = 0
        L1b:
            return r0
    }

    public int fixedLength() {
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

    public int index() {
            r3 = this;
            r0 = 8
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.bb
            int r2 = r3.bb_pos
            int r0 = r0 + r2
            int r0 = r1.getInt(r0)
            goto L13
        L12:
            r0 = -1
        L13:
            return r0
    }
}
