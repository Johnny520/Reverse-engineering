package com.google.flatbuffers;

/* JADX INFO: loaded from: classes2.dex */
public class FlexBuffersBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    private static final int WIDTH_16 = 1;
    private static final int WIDTH_32 = 2;
    private static final int WIDTH_64 = 3;
    private static final int WIDTH_8 = 0;

    /* JADX INFO: renamed from: bb */
    private final com.google.flatbuffers.ReadWriteBuf f48bb;
    private boolean finished;
    private final int flags;
    private java.util.Comparator<com.google.flatbuffers.FlexBuffersBuilder.Value> keyComparator;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> keyPool;
    private final java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder.Value> stack;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> stringPool;


    private static class Value {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final double dValue;
        long iValue;
        int key;
        final int minBitWidth;
        final int type;

        static {
                java.lang.Class<com.google.flatbuffers.FlexBuffersBuilder> r0 = com.google.flatbuffers.FlexBuffersBuilder.class
                return
        }

        Value(int r3, int r4, int r5, double r6) {
                r2 = this;
                r2.<init>()
                r2.key = r3
                r2.type = r4
                r2.minBitWidth = r5
                r2.dValue = r6
                r0 = -9223372036854775808
                r2.iValue = r0
                return
        }

        Value(int r3, int r4, int r5, long r6) {
                r2 = this;
                r2.<init>()
                r2.key = r3
                r2.type = r4
                r2.minBitWidth = r5
                r2.iValue = r6
                r0 = 1
                r2.dValue = r0
                return
        }

        static /* synthetic */ int access$100(int r1, int r2) {
                int r0 = paddingBytes(r1, r2)
                return r0
        }

        static /* synthetic */ int access$200(com.google.flatbuffers.FlexBuffersBuilder.Value r1, int r2, int r3) {
                int r0 = r1.elemWidth(r2, r3)
                return r0
        }

        static /* synthetic */ byte access$300(com.google.flatbuffers.FlexBuffersBuilder.Value r1) {
                byte r0 = r1.storedPackedType()
                return r0
        }

        static /* synthetic */ byte access$400(com.google.flatbuffers.FlexBuffersBuilder.Value r1, int r2) {
                byte r0 = r1.storedPackedType(r2)
                return r0
        }

        static /* synthetic */ int access$500(int r1, int r2, long r3, int r5, int r6) {
                int r0 = elemWidth(r1, r2, r3, r5, r6)
                return r0
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value blob(int r7, int r8, int r9, int r10) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                long r4 = (long) r8
                r0 = r6
                r1 = r7
                r2 = r9
                r3 = r10
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value bool(int r7, boolean r8) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                if (r8 == 0) goto L7
                r0 = 1
                goto L9
            L7:
                r0 = 0
            L9:
                r4 = r0
                r2 = 26
                r3 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        private int elemWidth(int r7, int r8) {
                r6 = this;
                int r0 = r6.type
                int r1 = r6.minBitWidth
                long r2 = r6.iValue
                r4 = r7
                r5 = r8
                int r0 = elemWidth(r0, r1, r2, r4, r5)
                return r0
        }

        private static int elemWidth(int r9, int r10, long r11, int r13, int r14) {
                boolean r0 = com.google.flatbuffers.FlexBuffers.isTypeInline(r9)
                if (r0 == 0) goto L7
                return r10
            L7:
                r0 = 1
            L8:
                r1 = 32
                if (r0 > r1) goto L26
                int r1 = paddingBytes(r13, r0)
                int r1 = r1 + r13
                int r2 = r14 * r0
                int r1 = r1 + r2
                long r2 = (long) r1
                long r2 = r2 - r11
                int r4 = com.google.flatbuffers.FlexBuffersBuilder.widthUInBits(r2)
                r5 = 1
                long r5 = r5 << r4
                long r7 = (long) r0
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 != 0) goto L23
                return r4
            L23:
                int r0 = r0 * 2
                goto L8
            L26:
                r0 = 3
                return r0
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value float32(int r7, float r8) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                r3 = 2
                double r4 = (double) r8
                r2 = 3
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value float64(int r7, double r8) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                r2 = 3
                r3 = 3
                r0 = r6
                r1 = r7
                r4 = r8
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value int16(int r7, int r8) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                r3 = 1
                long r4 = (long) r8
                r2 = 1
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value int32(int r7, int r8) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                r3 = 2
                long r4 = (long) r8
                r2 = 1
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value int64(int r7, long r8) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                r2 = 1
                r3 = 3
                r0 = r6
                r1 = r7
                r4 = r8
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value int8(int r7, int r8) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                r3 = 0
                long r4 = (long) r8
                r2 = 1
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value nullValue(int r7) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                r3 = 0
                r4 = 0
                r2 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        private static byte packedType(int r1, int r2) {
                int r0 = r2 << 2
                r0 = r0 | r1
                byte r0 = (byte) r0
                return r0
        }

        private static int paddingBytes(int r2, int r3) {
                int r0 = ~r2
                int r0 = r0 + 1
                int r1 = r3 + (-1)
                r0 = r0 & r1
                return r0
        }

        private byte storedPackedType() {
                r1 = this;
                r0 = 0
                byte r0 = r1.storedPackedType(r0)
                return r0
        }

        private byte storedPackedType(int r3) {
                r2 = this;
                int r0 = r2.storedWidth(r3)
                int r1 = r2.type
                byte r0 = packedType(r0, r1)
                return r0
        }

        private int storedWidth(int r2) {
                r1 = this;
                int r0 = r1.type
                boolean r0 = com.google.flatbuffers.FlexBuffers.isTypeInline(r0)
                if (r0 == 0) goto Lf
                int r0 = r1.minBitWidth
                int r0 = java.lang.Math.max(r0, r2)
                return r0
            Lf:
                int r0 = r1.minBitWidth
                return r0
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value uInt16(int r7, int r8) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                r3 = 1
                long r4 = (long) r8
                r2 = 2
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value uInt32(int r7, int r8) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                r3 = 2
                long r4 = (long) r8
                r2 = 2
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value uInt64(int r7, long r8) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                r2 = 2
                r3 = 3
                r0 = r6
                r1 = r7
                r4 = r8
                r0.<init>(r1, r2, r3, r4)
                return r6
        }

        static com.google.flatbuffers.FlexBuffersBuilder.Value uInt8(int r7, int r8) {
                com.google.flatbuffers.FlexBuffersBuilder$Value r6 = new com.google.flatbuffers.FlexBuffersBuilder$Value
                r3 = 0
                long r4 = (long) r8
                r2 = 2
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4)
                return r6
        }
    }

    static {
            return
    }

    public FlexBuffersBuilder() {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1.<init>(r0)
            return
    }

    public FlexBuffersBuilder(int r3) {
            r2 = this;
            com.google.flatbuffers.ArrayReadWriteBuf r0 = new com.google.flatbuffers.ArrayReadWriteBuf
            r0.<init>(r3)
            r1 = 1
            r2.<init>(r0, r1)
            return
    }

    public FlexBuffersBuilder(com.google.flatbuffers.ReadWriteBuf r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.stack = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.keyPool = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.stringPool = r0
            r0 = 0
            r1.finished = r0
            com.google.flatbuffers.FlexBuffersBuilder$1 r0 = new com.google.flatbuffers.FlexBuffersBuilder$1
            r0.<init>(r1)
            r1.keyComparator = r0
            r1.f48bb = r2
            r1.flags = r3
            return
    }

    public FlexBuffersBuilder(java.nio.ByteBuffer r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public FlexBuffersBuilder(java.nio.ByteBuffer r3, int r4) {
            r2 = this;
            com.google.flatbuffers.ArrayReadWriteBuf r0 = new com.google.flatbuffers.ArrayReadWriteBuf
            byte[] r1 = r3.array()
            r0.<init>(r1)
            r2.<init>(r0, r4)
            return
    }

    static /* synthetic */ com.google.flatbuffers.ReadWriteBuf access$000(com.google.flatbuffers.FlexBuffersBuilder r1) {
            com.google.flatbuffers.ReadWriteBuf r0 = r1.f48bb
            return r0
    }

    private int align(int r5) {
            r4 = this;
            r0 = 1
            int r0 = r0 << r5
            com.google.flatbuffers.ReadWriteBuf r1 = r4.f48bb
            int r1 = r1.writePosition()
            int r1 = com.google.flatbuffers.FlexBuffersBuilder.Value.access$100(r1, r0)
        Lc:
            int r2 = r1 + (-1)
            if (r1 == 0) goto L18
            com.google.flatbuffers.ReadWriteBuf r1 = r4.f48bb
            r3 = 0
            r1.put(r3)
            r1 = r2
            goto Lc
        L18:
            return r0
    }

    private com.google.flatbuffers.FlexBuffersBuilder.Value createKeyVector(int r13, int r14) {
            r12 = this;
            long r0 = (long) r14
            int r0 = widthUInBits(r0)
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            r2 = 1
            r3 = r13
        Lc:
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r4 = r12.stack
            int r4 = r4.size()
            if (r3 >= r4) goto L34
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r4 = r12.stack
            java.lang.Object r4 = r4.get(r3)
            com.google.flatbuffers.FlexBuffersBuilder$Value r4 = (com.google.flatbuffers.FlexBuffersBuilder.Value) r4
            int r4 = r4.key
            long r7 = (long) r4
            com.google.flatbuffers.ReadWriteBuf r4 = r12.f48bb
            int r9 = r4.writePosition()
            int r10 = r3 + r2
            r5 = 4
            r6 = 0
            int r4 = com.google.flatbuffers.FlexBuffersBuilder.Value.access$500(r5, r6, r7, r9, r10)
            int r0 = java.lang.Math.max(r0, r4)
            int r3 = r3 + 1
            goto Lc
        L34:
            int r3 = r12.align(r0)
            long r4 = (long) r14
            r12.writeInt(r4, r3)
            com.google.flatbuffers.ReadWriteBuf r4 = r12.f48bb
            int r10 = r4.writePosition()
            r4 = r13
        L43:
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r5 = r12.stack
            int r5 = r5.size()
            if (r4 >= r5) goto L67
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r5 = r12.stack
            java.lang.Object r5 = r5.get(r4)
            com.google.flatbuffers.FlexBuffersBuilder$Value r5 = (com.google.flatbuffers.FlexBuffersBuilder.Value) r5
            int r5 = r5.key
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r6 = r12.stack
            java.lang.Object r6 = r6.get(r4)
            com.google.flatbuffers.FlexBuffersBuilder$Value r6 = (com.google.flatbuffers.FlexBuffersBuilder.Value) r6
            int r6 = r6.key
            long r6 = (long) r6
            r12.writeOffset(r6, r3)
            int r4 = r4 + 1
            goto L43
        L67:
            com.google.flatbuffers.FlexBuffersBuilder$Value r11 = new com.google.flatbuffers.FlexBuffersBuilder$Value
            r4 = 4
            int r6 = com.google.flatbuffers.FlexBuffers.toTypedVector(r4, r1)
            long r8 = (long) r10
            r5 = -1
            r4 = r11
            r7 = r0
            r4.<init>(r5, r6, r7, r8)
            return r11
    }

    private com.google.flatbuffers.FlexBuffersBuilder.Value createVector(int r18, int r19, int r20, boolean r21, boolean r22, com.google.flatbuffers.FlexBuffersBuilder.Value r23) {
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = r23
            r3 = r21 ^ 1
            r3 = r22 & r3
            if (r3 != 0) goto Leb
            long r3 = (long) r1
            int r3 = widthUInBits(r3)
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            r5 = 1
            if (r2 == 0) goto L29
            com.google.flatbuffers.ReadWriteBuf r6 = r0.f48bb
            int r6 = r6.writePosition()
            int r6 = com.google.flatbuffers.FlexBuffersBuilder.Value.access$200(r2, r6, r4)
            int r3 = java.lang.Math.max(r3, r6)
            int r5 = r5 + 2
        L29:
            r6 = 4
            r7 = r19
        L2c:
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r8 = r0.stack
            int r8 = r8.size()
            if (r7 >= r8) goto L71
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r8 = r0.stack
            java.lang.Object r8 = r8.get(r7)
            com.google.flatbuffers.FlexBuffersBuilder$Value r8 = (com.google.flatbuffers.FlexBuffersBuilder.Value) r8
            com.google.flatbuffers.ReadWriteBuf r9 = r0.f48bb
            int r9 = r9.writePosition()
            int r10 = r7 + r5
            int r8 = com.google.flatbuffers.FlexBuffersBuilder.Value.access$200(r8, r9, r10)
            int r3 = java.lang.Math.max(r3, r8)
            if (r21 == 0) goto L6c
            r14 = r19
            if (r7 != r14) goto L6b
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r9 = r0.stack
            java.lang.Object r9 = r9.get(r7)
            com.google.flatbuffers.FlexBuffersBuilder$Value r9 = (com.google.flatbuffers.FlexBuffersBuilder.Value) r9
            int r6 = r9.type
            boolean r9 = com.google.flatbuffers.FlexBuffers.isTypedVectorElementType(r6)
            if (r9 == 0) goto L63
            goto L6e
        L63:
            com.google.flatbuffers.FlexBuffers$FlexBufferException r4 = new com.google.flatbuffers.FlexBuffers$FlexBufferException
            java.lang.String r9 = "TypedVector does not support this element type"
            r4.<init>(r9)
            throw r4
        L6b:
            goto L6e
        L6c:
            r14 = r19
        L6e:
            int r7 = r7 + 1
            goto L2c
        L71:
            r14 = r19
            int r7 = r0.align(r3)
            if (r2 == 0) goto L87
            long r8 = r2.iValue
            r0.writeOffset(r8, r7)
            r8 = 1
            int r10 = r2.minBitWidth
            long r8 = r8 << r10
            r0.writeInt(r8, r7)
        L87:
            if (r22 != 0) goto L8d
            long r8 = (long) r1
            r0.writeInt(r8, r7)
        L8d:
            com.google.flatbuffers.ReadWriteBuf r8 = r0.f48bb
            int r15 = r8.writePosition()
            r8 = r19
        L95:
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r9 = r0.stack
            int r9 = r9.size()
            if (r8 >= r9) goto Lab
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r9 = r0.stack
            java.lang.Object r9 = r9.get(r8)
            com.google.flatbuffers.FlexBuffersBuilder$Value r9 = (com.google.flatbuffers.FlexBuffersBuilder.Value) r9
            r0.writeAny(r9, r7)
            int r8 = r8 + 1
            goto L95
        Lab:
            if (r21 != 0) goto Lcb
            r8 = r19
        Laf:
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r9 = r0.stack
            int r9 = r9.size()
            if (r8 >= r9) goto Lcb
            com.google.flatbuffers.ReadWriteBuf r9 = r0.f48bb
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r10 = r0.stack
            java.lang.Object r10 = r10.get(r8)
            com.google.flatbuffers.FlexBuffersBuilder$Value r10 = (com.google.flatbuffers.FlexBuffersBuilder.Value) r10
            byte r10 = com.google.flatbuffers.FlexBuffersBuilder.Value.access$400(r10, r3)
            r9.put(r10)
            int r8 = r8 + 1
            goto Laf
        Lcb:
            com.google.flatbuffers.FlexBuffersBuilder$Value r16 = new com.google.flatbuffers.FlexBuffersBuilder$Value
            if (r2 == 0) goto Ld3
            r4 = 9
            r10 = r4
            goto Le1
        Ld3:
            if (r21 == 0) goto Lde
            if (r22 == 0) goto Ld8
            r4 = r1
        Ld8:
            int r4 = com.google.flatbuffers.FlexBuffers.toTypedVector(r6, r4)
            r10 = r4
            goto Le1
        Lde:
            r4 = 10
            r10 = r4
        Le1:
            long r12 = (long) r15
            r8 = r16
            r9 = r18
            r11 = r3
            r8.<init>(r9, r10, r11, r12)
            return r16
        Leb:
            r14 = r19
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "Untyped fixed vector is not supported"
            r3.<init>(r4)
            throw r3
    }

    private int putKey(java.lang.String r7) {
            r6 = this;
            if (r7 != 0) goto L4
            r0 = -1
            return r0
        L4:
            com.google.flatbuffers.ReadWriteBuf r0 = r6.f48bb
            int r0 = r0.writePosition()
            int r1 = r6.flags
            r1 = r1 & 1
            r2 = 0
            if (r1 == 0) goto L3b
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r6.keyPool
            java.lang.Object r1 = r1.get(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L36
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r7.getBytes(r3)
            com.google.flatbuffers.ReadWriteBuf r4 = r6.f48bb
            int r5 = r3.length
            r4.put(r3, r2, r5)
            com.google.flatbuffers.ReadWriteBuf r4 = r6.f48bb
            r4.put(r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r6.keyPool
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2.put(r7, r4)
            goto L3a
        L36:
            int r0 = r1.intValue()
        L3a:
            goto L55
        L3b:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r7.getBytes(r1)
            com.google.flatbuffers.ReadWriteBuf r3 = r6.f48bb
            int r4 = r1.length
            r3.put(r1, r2, r4)
            com.google.flatbuffers.ReadWriteBuf r3 = r6.f48bb
            r3.put(r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r6.keyPool
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.put(r7, r3)
        L55:
            return r0
    }

    private void putUInt(java.lang.String r5, long r6) {
            r4 = this;
            int r0 = r4.putKey(r5)
            int r1 = widthUInBits(r6)
            if (r1 != 0) goto L10
            int r2 = (int) r6
            com.google.flatbuffers.FlexBuffersBuilder$Value r2 = com.google.flatbuffers.FlexBuffersBuilder.Value.uInt8(r0, r2)
            goto L26
        L10:
            r2 = 1
            if (r1 != r2) goto L19
            int r2 = (int) r6
            com.google.flatbuffers.FlexBuffersBuilder$Value r2 = com.google.flatbuffers.FlexBuffersBuilder.Value.uInt16(r0, r2)
            goto L26
        L19:
            r2 = 2
            if (r1 != r2) goto L22
            int r2 = (int) r6
            com.google.flatbuffers.FlexBuffersBuilder$Value r2 = com.google.flatbuffers.FlexBuffersBuilder.Value.uInt32(r0, r2)
            goto L26
        L22:
            com.google.flatbuffers.FlexBuffersBuilder$Value r2 = com.google.flatbuffers.FlexBuffersBuilder.Value.uInt64(r0, r6)
        L26:
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r3 = r4.stack
            r3.add(r2)
            return
    }

    private void putUInt64(java.lang.String r3, long r4) {
            r2 = this;
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r2.stack
            int r1 = r2.putKey(r3)
            com.google.flatbuffers.FlexBuffersBuilder$Value r1 = com.google.flatbuffers.FlexBuffersBuilder.Value.uInt64(r1, r4)
            r0.add(r1)
            return
    }

    static int widthUInBits(long r3) {
            r0 = -1
            int r1 = com.google.flatbuffers.FlexBuffers.Unsigned.byteToUnsignedInt(r0)
            long r1 = (long) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r1 = com.google.flatbuffers.FlexBuffers.Unsigned.shortToUnsignedInt(r0)
            long r1 = (long) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L17
            r0 = 1
            return r0
        L17:
            long r0 = com.google.flatbuffers.FlexBuffers.Unsigned.intToUnsignedLong(r0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L21
            r0 = 2
            return r0
        L21:
            r0 = 3
            return r0
    }

    private void writeAny(com.google.flatbuffers.FlexBuffersBuilder.Value r3, int r4) {
            r2 = this;
            int r0 = r3.type
            switch(r0) {
                case 0: goto L11;
                case 1: goto L11;
                case 2: goto L11;
                case 3: goto Lb;
                case 26: goto L11;
                default: goto L5;
            }
        L5:
            long r0 = r3.iValue
            r2.writeOffset(r0, r4)
            goto L17
        Lb:
            double r0 = r3.dValue
            r2.writeDouble(r0, r4)
            goto L17
        L11:
            long r0 = r3.iValue
            r2.writeInt(r0, r4)
        L17:
            return
    }

    private com.google.flatbuffers.FlexBuffersBuilder.Value writeBlob(int r7, byte[] r8, int r9, boolean r10) {
            r6 = this;
            int r0 = r8.length
            long r0 = (long) r0
            int r0 = widthUInBits(r0)
            int r1 = r6.align(r0)
            int r2 = r8.length
            long r2 = (long) r2
            r6.writeInt(r2, r1)
            com.google.flatbuffers.ReadWriteBuf r2 = r6.f48bb
            int r2 = r2.writePosition()
            com.google.flatbuffers.ReadWriteBuf r3 = r6.f48bb
            int r4 = r8.length
            r5 = 0
            r3.put(r8, r5, r4)
            if (r10 == 0) goto L23
            com.google.flatbuffers.ReadWriteBuf r3 = r6.f48bb
            r3.put(r5)
        L23:
            com.google.flatbuffers.FlexBuffersBuilder$Value r3 = com.google.flatbuffers.FlexBuffersBuilder.Value.blob(r7, r2, r9, r0)
            return r3
    }

    private void writeDouble(double r3, int r5) {
            r2 = this;
            r0 = 4
            if (r5 != r0) goto La
            com.google.flatbuffers.ReadWriteBuf r0 = r2.f48bb
            float r1 = (float) r3
            r0.putFloat(r1)
            goto L13
        La:
            r0 = 8
            if (r5 != r0) goto L13
            com.google.flatbuffers.ReadWriteBuf r0 = r2.f48bb
            r0.putDouble(r3)
        L13:
            return
    }

    private void writeInt(long r3, int r5) {
            r2 = this;
            switch(r5) {
                case 1: goto L19;
                case 2: goto L11;
                case 4: goto La;
                case 8: goto L4;
                default: goto L3;
            }
        L3:
            goto L20
        L4:
            com.google.flatbuffers.ReadWriteBuf r0 = r2.f48bb
            r0.putLong(r3)
            goto L20
        La:
            com.google.flatbuffers.ReadWriteBuf r0 = r2.f48bb
            int r1 = (int) r3
            r0.putInt(r1)
            goto L20
        L11:
            com.google.flatbuffers.ReadWriteBuf r0 = r2.f48bb
            int r1 = (int) r3
            short r1 = (short) r1
            r0.putShort(r1)
            goto L20
        L19:
            com.google.flatbuffers.ReadWriteBuf r0 = r2.f48bb
            int r1 = (int) r3
            byte r1 = (byte) r1
            r0.put(r1)
        L20:
            return
    }

    private void writeOffset(long r4, int r6) {
            r3 = this;
            com.google.flatbuffers.ReadWriteBuf r0 = r3.f48bb
            int r0 = r0.writePosition()
            long r0 = (long) r0
            long r0 = r0 - r4
            int r0 = (int) r0
            long r1 = (long) r0
            r3.writeInt(r1, r6)
            return
    }

    private com.google.flatbuffers.FlexBuffersBuilder.Value writeString(int r4, java.lang.String r5) {
            r3 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r5.getBytes(r0)
            r1 = 5
            r2 = 1
            com.google.flatbuffers.FlexBuffersBuilder$Value r0 = r3.writeBlob(r4, r0, r1, r2)
            return r0
    }

    public void clear() {
            r1 = this;
            com.google.flatbuffers.ReadWriteBuf r0 = r1.f48bb
            r0.clear()
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r1.stack
            r0.clear()
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.keyPool
            r0.clear()
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.stringPool
            r0.clear()
            r0 = 0
            r1.finished = r0
            return
    }

    public int endMap(java.lang.String r10, int r11) {
            r9 = this;
            int r7 = r9.putKey(r10)
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r9.stack
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r1 = r9.stack
            int r1 = r1.size()
            java.util.List r0 = r0.subList(r11, r1)
            java.util.Comparator<com.google.flatbuffers.FlexBuffersBuilder$Value> r1 = r9.keyComparator
            java.util.Collections.sort(r0, r1)
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r9.stack
            int r0 = r0.size()
            int r0 = r0 - r11
            com.google.flatbuffers.FlexBuffersBuilder$Value r8 = r9.createKeyVector(r11, r0)
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r9.stack
            int r0 = r0.size()
            int r3 = r0 - r11
            r4 = 0
            r5 = 0
            r0 = r9
            r1 = r7
            r2 = r11
            r6 = r8
            com.google.flatbuffers.FlexBuffersBuilder$Value r0 = r0.createVector(r1, r2, r3, r4, r5, r6)
        L32:
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r1 = r9.stack
            int r1 = r1.size()
            if (r1 <= r11) goto L48
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r1 = r9.stack
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r2 = r9.stack
            int r2 = r2.size()
            int r2 = r2 + (-1)
            r1.remove(r2)
            goto L32
        L48:
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r1 = r9.stack
            r1.add(r0)
            long r1 = r0.iValue
            int r1 = (int) r1
            return r1
    }

    public int endVector(java.lang.String r9, int r10, boolean r11, boolean r12) {
            r8 = this;
            int r7 = r8.putKey(r9)
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r8.stack
            int r0 = r0.size()
            int r3 = r0 - r10
            r6 = 0
            r0 = r8
            r1 = r7
            r2 = r10
            r4 = r11
            r5 = r12
            com.google.flatbuffers.FlexBuffersBuilder$Value r0 = r0.createVector(r1, r2, r3, r4, r5, r6)
        L16:
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r1 = r8.stack
            int r1 = r1.size()
            if (r1 <= r10) goto L2c
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r1 = r8.stack
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r2 = r8.stack
            int r2 = r2.size()
            int r2 = r2 + (-1)
            r1.remove(r2)
            goto L16
        L2c:
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r1 = r8.stack
            r1.add(r0)
            long r1 = r0.iValue
            int r1 = (int) r1
            return r1
    }

    public java.nio.ByteBuffer finish() {
            r4 = this;
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r4.stack
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.flatbuffers.FlexBuffersBuilder$Value r0 = (com.google.flatbuffers.FlexBuffersBuilder.Value) r0
            com.google.flatbuffers.ReadWriteBuf r2 = r4.f48bb
            int r2 = r2.writePosition()
            int r0 = com.google.flatbuffers.FlexBuffersBuilder.Value.access$200(r0, r2, r1)
            int r0 = r4.align(r0)
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r2 = r4.stack
            java.lang.Object r2 = r2.get(r1)
            com.google.flatbuffers.FlexBuffersBuilder$Value r2 = (com.google.flatbuffers.FlexBuffersBuilder.Value) r2
            r4.writeAny(r2, r0)
            com.google.flatbuffers.ReadWriteBuf r2 = r4.f48bb
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r3 = r4.stack
            java.lang.Object r3 = r3.get(r1)
            com.google.flatbuffers.FlexBuffersBuilder$Value r3 = (com.google.flatbuffers.FlexBuffersBuilder.Value) r3
            byte r3 = com.google.flatbuffers.FlexBuffersBuilder.Value.access$300(r3)
            r2.put(r3)
            com.google.flatbuffers.ReadWriteBuf r2 = r4.f48bb
            byte r3 = (byte) r0
            r2.put(r3)
            r2 = 1
            r4.finished = r2
            com.google.flatbuffers.ReadWriteBuf r2 = r4.f48bb
            byte[] r2 = r2.data()
            com.google.flatbuffers.ReadWriteBuf r3 = r4.f48bb
            int r3 = r3.writePosition()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r2, r1, r3)
            return r1
    }

    public com.google.flatbuffers.ReadWriteBuf getBuffer() {
            r1 = this;
            com.google.flatbuffers.ReadWriteBuf r0 = r1.f48bb
            return r0
    }

    public int putBlob(java.lang.String r5, byte[] r6) {
            r4 = this;
            int r0 = r4.putKey(r5)
            r1 = 25
            r2 = 0
            com.google.flatbuffers.FlexBuffersBuilder$Value r1 = r4.writeBlob(r0, r6, r1, r2)
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r2 = r4.stack
            r2.add(r1)
            long r2 = r1.iValue
            int r2 = (int) r2
            return r2
    }

    public int putBlob(byte[] r2) {
            r1 = this;
            r0 = 0
            int r0 = r1.putBlob(r0, r2)
            return r0
    }

    public void putBoolean(java.lang.String r3, boolean r4) {
            r2 = this;
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r2.stack
            int r1 = r2.putKey(r3)
            com.google.flatbuffers.FlexBuffersBuilder$Value r1 = com.google.flatbuffers.FlexBuffersBuilder.Value.bool(r1, r4)
            r0.add(r1)
            return
    }

    public void putBoolean(boolean r2) {
            r1 = this;
            r0 = 0
            r1.putBoolean(r0, r2)
            return
    }

    public void putFloat(double r2) {
            r1 = this;
            r0 = 0
            r1.putFloat(r0, r2)
            return
    }

    public void putFloat(float r2) {
            r1 = this;
            r0 = 0
            r1.putFloat(r0, r2)
            return
    }

    public void putFloat(java.lang.String r3, double r4) {
            r2 = this;
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r2.stack
            int r1 = r2.putKey(r3)
            com.google.flatbuffers.FlexBuffersBuilder$Value r1 = com.google.flatbuffers.FlexBuffersBuilder.Value.float64(r1, r4)
            r0.add(r1)
            return
    }

    public void putFloat(java.lang.String r3, float r4) {
            r2 = this;
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r2.stack
            int r1 = r2.putKey(r3)
            com.google.flatbuffers.FlexBuffersBuilder$Value r1 = com.google.flatbuffers.FlexBuffersBuilder.Value.float32(r1, r4)
            r0.add(r1)
            return
    }

    public void putInt(int r2) {
            r1 = this;
            r0 = 0
            r1.putInt(r0, r2)
            return
    }

    public void putInt(long r2) {
            r1 = this;
            r0 = 0
            r1.putInt(r0, r2)
            return
    }

    public void putInt(java.lang.String r3, int r4) {
            r2 = this;
            long r0 = (long) r4
            r2.putInt(r3, r0)
            return
    }

    public void putInt(java.lang.String r4, long r5) {
            r3 = this;
            int r0 = r3.putKey(r4)
            r1 = -128(0xffffffffffffff80, double:NaN)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L1b
            r1 = 127(0x7f, double:6.27E-322)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L1b
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r1 = r3.stack
            int r2 = (int) r5
            com.google.flatbuffers.FlexBuffersBuilder$Value r2 = com.google.flatbuffers.FlexBuffersBuilder.Value.int8(r0, r2)
            r1.add(r2)
            goto L54
        L1b:
            r1 = -32768(0xffffffffffff8000, double:NaN)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L32
            r1 = 32767(0x7fff, double:1.6189E-319)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L32
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r1 = r3.stack
            int r2 = (int) r5
            com.google.flatbuffers.FlexBuffersBuilder$Value r2 = com.google.flatbuffers.FlexBuffersBuilder.Value.int16(r0, r2)
            r1.add(r2)
            goto L54
        L32:
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L4b
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L4b
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r1 = r3.stack
            int r2 = (int) r5
            com.google.flatbuffers.FlexBuffersBuilder$Value r2 = com.google.flatbuffers.FlexBuffersBuilder.Value.int32(r0, r2)
            r1.add(r2)
            goto L54
        L4b:
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r1 = r3.stack
            com.google.flatbuffers.FlexBuffersBuilder$Value r2 = com.google.flatbuffers.FlexBuffersBuilder.Value.int64(r0, r5)
            r1.add(r2)
        L54:
            return
    }

    public void putNull() {
            r1 = this;
            r0 = 0
            r1.putNull(r0)
            return
    }

    public void putNull(java.lang.String r3) {
            r2 = this;
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r2.stack
            int r1 = r2.putKey(r3)
            com.google.flatbuffers.FlexBuffersBuilder$Value r1 = com.google.flatbuffers.FlexBuffersBuilder.Value.nullValue(r1)
            r0.add(r1)
            return
    }

    public int putString(java.lang.String r2) {
            r1 = this;
            r0 = 0
            int r0 = r1.putString(r0, r2)
            return r0
    }

    public int putString(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            int r0 = r6.putKey(r7)
            int r1 = r6.flags
            r1 = r1 & 2
            if (r1 == 0) goto L49
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r6.stringPool
            java.lang.Object r1 = r1.get(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L2d
            com.google.flatbuffers.FlexBuffersBuilder$Value r2 = r6.writeString(r0, r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r6.stringPool
            long r4 = r2.iValue
            int r4 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r8, r4)
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r3 = r6.stack
            r3.add(r2)
            long r3 = r2.iValue
            int r3 = (int) r3
            return r3
        L2d:
            int r2 = r8.length()
            long r2 = (long) r2
            int r2 = widthUInBits(r2)
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r3 = r6.stack
            int r4 = r1.intValue()
            r5 = 5
            com.google.flatbuffers.FlexBuffersBuilder$Value r4 = com.google.flatbuffers.FlexBuffersBuilder.Value.blob(r0, r4, r5, r2)
            r3.add(r4)
            int r3 = r1.intValue()
            return r3
        L49:
            com.google.flatbuffers.FlexBuffersBuilder$Value r1 = r6.writeString(r0, r8)
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r2 = r6.stack
            r2.add(r1)
            long r2 = r1.iValue
            int r2 = (int) r2
            return r2
    }

    public void putUInt(int r4) {
            r3 = this;
            r0 = 0
            long r1 = (long) r4
            r3.putUInt(r0, r1)
            return
    }

    public void putUInt(long r2) {
            r1 = this;
            r0 = 0
            r1.putUInt(r0, r2)
            return
    }

    public void putUInt64(java.math.BigInteger r4) {
            r3 = this;
            r0 = 0
            long r1 = r4.longValue()
            r3.putUInt64(r0, r1)
            return
    }

    public int startMap() {
            r1 = this;
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r1.stack
            int r0 = r0.size()
            return r0
    }

    public int startVector() {
            r1 = this;
            java.util.ArrayList<com.google.flatbuffers.FlexBuffersBuilder$Value> r0 = r1.stack
            int r0 = r0.size()
            return r0
    }
}
