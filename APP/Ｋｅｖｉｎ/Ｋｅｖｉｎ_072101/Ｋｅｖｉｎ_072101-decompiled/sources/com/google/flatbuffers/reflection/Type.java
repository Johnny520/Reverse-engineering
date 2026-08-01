package com.google.flatbuffers.reflection;

/* JADX INFO: loaded from: classes2.dex */
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
                com.google.flatbuffers.reflection.Type r0 = r1.get(r0, r2)
                return r0
        }

        public com.google.flatbuffers.reflection.Type get(com.google.flatbuffers.reflection.Type r3, int r4) {
                r2 = this;
                int r0 = r2.__element(r4)
                java.nio.ByteBuffer r1 = r2.f44bb
                int r0 = com.google.flatbuffers.reflection.Type.access$000(r0, r1)
                java.nio.ByteBuffer r1 = r2.f44bb
                com.google.flatbuffers.reflection.Type r0 = r3.__assign(r0, r1)
                return r0
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

    static /* synthetic */ int access$000(int r1, java.nio.ByteBuffer r2) {
            int r0 = __indirect(r1, r2)
            return r0
    }

    public static void addBaseSize(com.google.flatbuffers.FlatBufferBuilder r2, long r3) {
            r0 = 4
            int r1 = (int) r3
            r2.addInt(r0, r1, r0)
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

    public static void addElementSize(com.google.flatbuffers.FlatBufferBuilder r3, long r4) {
            int r0 = (int) r4
            r1 = 0
            r2 = 5
            r3.addInt(r2, r0, r1)
            return
    }

    public static void addFixedLength(com.google.flatbuffers.FlatBufferBuilder r3, int r4) {
            short r0 = (short) r4
            r1 = 0
            r2 = 3
            r3.addShort(r2, r0, r1)
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
            int r0 = endType(r1)
            return r0
    }

    public static int endType(com.google.flatbuffers.FlatBufferBuilder r1) {
            int r0 = r1.endTable()
            return r0
    }

    public static com.google.flatbuffers.reflection.Type getRootAsType(java.nio.ByteBuffer r1) {
            com.google.flatbuffers.reflection.Type r0 = new com.google.flatbuffers.reflection.Type
            r0.<init>()
            com.google.flatbuffers.reflection.Type r0 = getRootAsType(r1, r0)
            return r0
    }

    public static com.google.flatbuffers.reflection.Type getRootAsType(java.nio.ByteBuffer r2, com.google.flatbuffers.reflection.Type r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r0 = r0 + r1
            com.google.flatbuffers.reflection.Type r0 = r3.__assign(r0, r2)
            return r0
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
            r5 = this;
            r0 = 12
            int r0 = r5.__offset(r0)
            if (r0 == 0) goto L19
            java.nio.ByteBuffer r1 = r5.f50bb
            int r2 = r5.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            goto L1b
        L19:
            r1 = 4
        L1b:
            return r1
    }

    public byte baseType() {
            r3 = this;
            r0 = 4
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            byte r1 = r1.get(r2)
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public byte element() {
            r3 = this;
            r0 = 6
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            byte r1 = r1.get(r2)
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public long elementSize() {
            r5 = this;
            r0 = 14
            int r0 = r5.__offset(r0)
            if (r0 == 0) goto L19
            java.nio.ByteBuffer r1 = r5.f50bb
            int r2 = r5.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            goto L1b
        L19:
            r1 = 0
        L1b:
            return r1
    }

    public int fixedLength() {
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

    public int index() {
            r3 = this;
            r0 = 8
            int r0 = r3.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r3.f50bb
            int r2 = r3.bb_pos
            int r2 = r2 + r0
            int r1 = r1.getInt(r2)
            goto L13
        L12:
            r1 = -1
        L13:
            return r1
    }
}
