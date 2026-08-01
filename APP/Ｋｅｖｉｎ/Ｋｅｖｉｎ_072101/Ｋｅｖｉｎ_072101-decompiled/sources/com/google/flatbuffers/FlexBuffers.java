package com.google.flatbuffers;

/* JADX INFO: loaded from: classes2.dex */
public class FlexBuffers {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final com.google.flatbuffers.ReadBuf EMPTY_BB = null;
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    public static class Blob extends com.google.flatbuffers.FlexBuffers.Sized {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final com.google.flatbuffers.FlexBuffers.Blob EMPTY = null;

        static {
                java.lang.Class<com.google.flatbuffers.FlexBuffers> r0 = com.google.flatbuffers.FlexBuffers.class
                com.google.flatbuffers.FlexBuffers$Blob r0 = new com.google.flatbuffers.FlexBuffers$Blob
                com.google.flatbuffers.ReadBuf r1 = com.google.flatbuffers.FlexBuffers.access$000()
                r2 = 1
                r0.<init>(r1, r2, r2)
                com.google.flatbuffers.FlexBuffers.Blob.EMPTY = r0
                return
        }

        Blob(com.google.flatbuffers.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static com.google.flatbuffers.FlexBuffers.Blob empty() {
                com.google.flatbuffers.FlexBuffers$Blob r0 = com.google.flatbuffers.FlexBuffers.Blob.EMPTY
                return r0
        }

        public java.nio.ByteBuffer data() {
                r3 = this;
                com.google.flatbuffers.ReadBuf r0 = r3.f46bb
                byte[] r0 = r0.data()
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                int r1 = r3.end
                r0.position(r1)
                int r1 = r3.end
                int r2 = r3.size()
                int r1 = r1 + r2
                r0.limit(r1)
                java.nio.ByteBuffer r1 = r0.asReadOnlyBuffer()
                java.nio.ByteBuffer r1 = r1.slice()
                return r1
        }

        public byte get(int r3) {
                r2 = this;
                com.google.flatbuffers.ReadBuf r0 = r2.f46bb
                int r1 = r2.end
                int r1 = r1 + r3
                byte r0 = r0.get(r1)
                return r0
        }

        public byte[] getBytes() {
                r5 = this;
                int r0 = r5.size()
                byte[] r1 = new byte[r0]
                r2 = 0
            L7:
                if (r2 >= r0) goto L17
                com.google.flatbuffers.ReadBuf r3 = r5.f46bb
                int r4 = r5.end
                int r4 = r4 + r2
                byte r3 = r3.get(r4)
                r1[r2] = r3
                int r2 = r2 + 1
                goto L7
            L17:
                return r1
        }

        @Override // com.google.flatbuffers.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
                r1 = this;
                int r0 = super.size()
                return r0
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public java.lang.String toString() {
                r3 = this;
                com.google.flatbuffers.ReadBuf r0 = r3.f46bb
                int r1 = r3.end
                int r2 = r3.size()
                java.lang.String r0 = r0.getString(r1, r2)
                return r0
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder r5) {
                r4 = this;
                r0 = 34
                r5.append(r0)
                com.google.flatbuffers.ReadBuf r1 = r4.f46bb
                int r2 = r4.end
                int r3 = r4.size()
                java.lang.String r1 = r1.getString(r2, r3)
                r5.append(r1)
                java.lang.StringBuilder r0 = r5.append(r0)
                return r0
        }
    }

    public static class FlexBufferException extends java.lang.RuntimeException {
        FlexBufferException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static class Key extends com.google.flatbuffers.FlexBuffers.Object {
        private static final com.google.flatbuffers.FlexBuffers.Key EMPTY = null;

        static {
                com.google.flatbuffers.FlexBuffers$Key r0 = new com.google.flatbuffers.FlexBuffers$Key
                com.google.flatbuffers.ReadBuf r1 = com.google.flatbuffers.FlexBuffers.access$000()
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.google.flatbuffers.FlexBuffers.Key.EMPTY = r0
                return
        }

        Key(com.google.flatbuffers.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static /* synthetic */ com.google.flatbuffers.FlexBuffers.Key access$700() {
                com.google.flatbuffers.FlexBuffers$Key r0 = com.google.flatbuffers.FlexBuffers.Key.EMPTY
                return r0
        }

        public static com.google.flatbuffers.FlexBuffers.Key empty() {
                com.google.flatbuffers.FlexBuffers$Key r0 = com.google.flatbuffers.FlexBuffers.Key.EMPTY
                return r0
        }

        int compareTo(byte[] r7) {
                r6 = this;
                int r0 = r6.end
                r1 = 0
            L3:
                com.google.flatbuffers.ReadBuf r2 = r6.f46bb
                byte r2 = r2.get(r0)
                r3 = r7[r1]
                if (r2 != 0) goto L10
                int r4 = r2 - r3
                return r4
            L10:
                int r0 = r0 + 1
                int r1 = r1 + 1
                int r4 = r7.length
                if (r1 != r4) goto L27
                int r4 = r2 - r3
                if (r4 != 0) goto L26
                com.google.flatbuffers.ReadBuf r5 = r6.f46bb
                byte r5 = r5.get(r0)
                if (r5 != 0) goto L24
                goto L26
            L24:
                r5 = 1
                return r5
            L26:
                return r4
            L27:
                if (r2 == r3) goto L3
                int r4 = r2 - r3
                return r4
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.flatbuffers.FlexBuffers.Key
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r0 = r4
                com.google.flatbuffers.FlexBuffers$Key r0 = (com.google.flatbuffers.FlexBuffers.Key) r0
                int r0 = r0.end
                int r2 = r3.end
                if (r0 != r2) goto L19
                r0 = r4
                com.google.flatbuffers.FlexBuffers$Key r0 = (com.google.flatbuffers.FlexBuffers.Key) r0
                int r0 = r0.byteWidth
                int r2 = r3.byteWidth
                if (r0 != r2) goto L19
                r1 = 1
            L19:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.end
                int r1 = r2.byteWidth
                r0 = r0 ^ r1
                return r0
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public java.lang.String toString() {
                r3 = this;
                int r0 = r3.end
            L2:
                com.google.flatbuffers.ReadBuf r1 = r3.f46bb
                byte r1 = r1.get(r0)
                if (r1 != 0) goto L18
                int r1 = r3.end
                int r1 = r0 - r1
                com.google.flatbuffers.ReadBuf r0 = r3.f46bb
                int r2 = r3.end
                java.lang.String r0 = r0.getString(r2, r1)
                return r0
            L18:
                int r0 = r0 + 1
                goto L2
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder r2) {
                r1 = this;
                java.lang.String r0 = r1.toString()
                java.lang.StringBuilder r0 = r2.append(r0)
                return r0
        }
    }

    public static class KeyVector {
        private final com.google.flatbuffers.FlexBuffers.TypedVector vec;

        KeyVector(com.google.flatbuffers.FlexBuffers.TypedVector r1) {
                r0 = this;
                r0.<init>()
                r0.vec = r1
                return
        }

        public com.google.flatbuffers.FlexBuffers.Key get(int r7) {
                r6 = this;
                int r0 = r6.size()
                if (r7 < r0) goto Lb
                com.google.flatbuffers.FlexBuffers$Key r1 = com.google.flatbuffers.FlexBuffers.Key.access$700()
                return r1
            Lb:
                com.google.flatbuffers.FlexBuffers$TypedVector r1 = r6.vec
                int r1 = r1.end
                com.google.flatbuffers.FlexBuffers$TypedVector r2 = r6.vec
                int r2 = r2.byteWidth
                int r2 = r2 * r7
                int r1 = r1 + r2
                com.google.flatbuffers.FlexBuffers$Key r2 = new com.google.flatbuffers.FlexBuffers$Key
                com.google.flatbuffers.FlexBuffers$TypedVector r3 = r6.vec
                com.google.flatbuffers.ReadBuf r3 = r3.f46bb
                com.google.flatbuffers.FlexBuffers$TypedVector r4 = r6.vec
                com.google.flatbuffers.ReadBuf r4 = r4.f46bb
                com.google.flatbuffers.FlexBuffers$TypedVector r5 = r6.vec
                int r5 = r5.byteWidth
                int r4 = com.google.flatbuffers.FlexBuffers.access$200(r4, r1, r5)
                r5 = 1
                r2.<init>(r3, r4, r5)
                return r2
        }

        public int size() {
                r1 = this;
                com.google.flatbuffers.FlexBuffers$TypedVector r0 = r1.vec
                int r0 = r0.size()
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 91
                r0.append(r1)
                r1 = 0
            Lb:
                com.google.flatbuffers.FlexBuffers$TypedVector r2 = r3.vec
                int r2 = r2.size()
                if (r1 >= r2) goto L2e
                com.google.flatbuffers.FlexBuffers$TypedVector r2 = r3.vec
                com.google.flatbuffers.FlexBuffers$Reference r2 = r2.get(r1)
                r2.toString(r0)
                com.google.flatbuffers.FlexBuffers$TypedVector r2 = r3.vec
                int r2 = r2.size()
                int r2 = r2 + (-1)
                if (r1 == r2) goto L2b
                java.lang.String r2 = ", "
                r0.append(r2)
            L2b:
                int r1 = r1 + 1
                goto Lb
            L2e:
                java.lang.String r1 = "]"
                java.lang.StringBuilder r1 = r0.append(r1)
                java.lang.String r1 = r1.toString()
                return r1
        }
    }

    public static class Map extends com.google.flatbuffers.FlexBuffers.Vector {
        private static final com.google.flatbuffers.FlexBuffers.Map EMPTY_MAP = null;
        private final byte[] comparisonBuffer;

        static {
                com.google.flatbuffers.FlexBuffers$Map r0 = new com.google.flatbuffers.FlexBuffers$Map
                com.google.flatbuffers.ReadBuf r1 = com.google.flatbuffers.FlexBuffers.access$000()
                r2 = 1
                r0.<init>(r1, r2, r2)
                com.google.flatbuffers.FlexBuffers.Map.EMPTY_MAP = r0
                return
        }

        Map(com.google.flatbuffers.ReadBuf r2, int r3, int r4) {
                r1 = this;
                r1.<init>(r2, r3, r4)
                r0 = 4
                byte[] r0 = new byte[r0]
                r1.comparisonBuffer = r0
                return
        }

        private int binarySearch(java.lang.CharSequence r10) {
                r9 = this;
                r0 = 0
                int r1 = r9.size
                int r1 = r1 + (-1)
                r2 = 3
                int r3 = r9.end
                int r4 = r9.byteWidth
                int r4 = r4 * 3
                int r3 = r3 - r4
                com.google.flatbuffers.ReadBuf r4 = r9.f46bb
                int r5 = r9.byteWidth
                int r4 = com.google.flatbuffers.FlexBuffers.access$200(r4, r3, r5)
                com.google.flatbuffers.ReadBuf r5 = r9.f46bb
                int r6 = r9.byteWidth
                int r6 = r6 + r3
                int r7 = r9.byteWidth
                int r5 = com.google.flatbuffers.FlexBuffers.access$100(r5, r6, r7)
            L20:
                if (r0 > r1) goto L3e
                int r6 = r0 + r1
                int r6 = r6 >>> 1
                com.google.flatbuffers.ReadBuf r7 = r9.f46bb
                int r8 = r6 * r5
                int r8 = r8 + r4
                int r7 = com.google.flatbuffers.FlexBuffers.access$200(r7, r8, r5)
                int r8 = r9.compareCharSequence(r7, r10)
                if (r8 >= 0) goto L38
                int r0 = r6 + 1
                goto L3c
            L38:
                if (r8 <= 0) goto L3d
                int r1 = r6 + (-1)
            L3c:
                goto L20
            L3d:
                return r6
            L3e:
                int r6 = r0 + 1
                int r6 = -r6
                return r6
        }

        private int binarySearch(byte[] r10) {
                r9 = this;
                r0 = 0
                int r1 = r9.size
                int r1 = r1 + (-1)
                r2 = 3
                int r3 = r9.end
                int r4 = r9.byteWidth
                int r4 = r4 * 3
                int r3 = r3 - r4
                com.google.flatbuffers.ReadBuf r4 = r9.f46bb
                int r5 = r9.byteWidth
                int r4 = com.google.flatbuffers.FlexBuffers.access$200(r4, r3, r5)
                com.google.flatbuffers.ReadBuf r5 = r9.f46bb
                int r6 = r9.byteWidth
                int r6 = r6 + r3
                int r7 = r9.byteWidth
                int r5 = com.google.flatbuffers.FlexBuffers.access$100(r5, r6, r7)
            L20:
                if (r0 > r1) goto L40
                int r6 = r0 + r1
                int r6 = r6 >>> 1
                com.google.flatbuffers.ReadBuf r7 = r9.f46bb
                int r8 = r6 * r5
                int r8 = r8 + r4
                int r7 = com.google.flatbuffers.FlexBuffers.access$200(r7, r8, r5)
                com.google.flatbuffers.ReadBuf r8 = r9.f46bb
                int r8 = r9.compareBytes(r8, r7, r10)
                if (r8 >= 0) goto L3a
                int r0 = r6 + 1
                goto L3e
            L3a:
                if (r8 <= 0) goto L3f
                int r1 = r6 + (-1)
            L3e:
                goto L20
            L3f:
                return r6
            L40:
                int r6 = r0 + 1
                int r6 = -r6
                return r6
        }

        private int compareBytes(com.google.flatbuffers.ReadBuf r7, int r8, byte[] r9) {
                r6 = this;
                r0 = r8
                r1 = 0
            L2:
                byte r2 = r7.get(r0)
                r3 = r9[r1]
                if (r2 != 0) goto Ld
                int r4 = r2 - r3
                return r4
            Ld:
                int r0 = r0 + 1
                int r1 = r1 + 1
                int r4 = r9.length
                if (r1 != r4) goto L22
                int r4 = r2 - r3
                if (r4 != 0) goto L21
                byte r5 = r7.get(r0)
                if (r5 != 0) goto L1f
                goto L21
            L1f:
                r5 = 1
                return r5
            L21:
                return r4
            L22:
                if (r2 == r3) goto L2
                int r4 = r2 - r3
                return r4
        }

        private int compareCharSequence(int r10, java.lang.CharSequence r11) {
                r9 = this;
                r0 = r10
                r1 = 0
                com.google.flatbuffers.ReadBuf r2 = r9.f46bb
                int r2 = r2.limit()
                int r3 = r11.length()
            Lc:
                if (r1 >= r3) goto L30
                char r4 = r11.charAt(r1)
                r5 = 128(0x80, float:1.8E-43)
                if (r4 < r5) goto L17
                goto L30
            L17:
                com.google.flatbuffers.ReadBuf r5 = r9.f46bb
                byte r5 = r5.get(r0)
                if (r5 != 0) goto L21
                int r6 = -r4
                return r6
            L21:
                if (r5 >= 0) goto L24
                goto L30
            L24:
                char r6 = (char) r5
                if (r6 == r4) goto L2a
                int r6 = r5 - r4
                return r6
            L2a:
                int r0 = r0 + 1
                int r1 = r1 + 1
                goto Lc
            L30:
                if (r0 >= r2) goto L65
                byte[] r4 = r9.comparisonBuffer
                int r4 = com.google.flatbuffers.Utf8.encodeUtf8CodePoint(r11, r1, r4)
                if (r4 != 0) goto L41
                com.google.flatbuffers.ReadBuf r5 = r9.f46bb
                byte r5 = r5.get(r0)
                return r5
            L41:
                r5 = 0
            L42:
                if (r5 >= r4) goto L5d
                com.google.flatbuffers.ReadBuf r6 = r9.f46bb
                int r7 = r0 + 1
                byte r0 = r6.get(r0)
                byte[] r6 = r9.comparisonBuffer
                r6 = r6[r5]
                if (r0 != 0) goto L54
                int r8 = -r6
                return r8
            L54:
                if (r0 == r6) goto L59
                int r8 = r0 - r6
                return r8
            L59:
                int r5 = r5 + 1
                r0 = r7
                goto L42
            L5d:
                r5 = 4
                if (r4 != r5) goto L62
                r5 = 2
                goto L63
            L62:
                r5 = 1
            L63:
                int r1 = r1 + r5
                goto L30
            L65:
                r4 = 0
                return r4
        }

        public static com.google.flatbuffers.FlexBuffers.Map empty() {
                com.google.flatbuffers.FlexBuffers$Map r0 = com.google.flatbuffers.FlexBuffers.Map.EMPTY_MAP
                return r0
        }

        public com.google.flatbuffers.FlexBuffers.Reference get(java.lang.String r3) {
                r2 = this;
                int r0 = r2.binarySearch(r3)
                if (r0 < 0) goto Lf
                int r1 = r2.size
                if (r0 >= r1) goto Lf
                com.google.flatbuffers.FlexBuffers$Reference r1 = r2.get(r0)
                return r1
            Lf:
                com.google.flatbuffers.FlexBuffers$Reference r1 = com.google.flatbuffers.FlexBuffers.Reference.access$600()
                return r1
        }

        public com.google.flatbuffers.FlexBuffers.Reference get(byte[] r3) {
                r2 = this;
                int r0 = r2.binarySearch(r3)
                if (r0 < 0) goto Lf
                int r1 = r2.size
                if (r0 >= r1) goto Lf
                com.google.flatbuffers.FlexBuffers$Reference r1 = r2.get(r0)
                return r1
            Lf:
                com.google.flatbuffers.FlexBuffers$Reference r1 = com.google.flatbuffers.FlexBuffers.Reference.access$600()
                return r1
        }

        public com.google.flatbuffers.FlexBuffers.KeyVector keys() {
                r9 = this;
                r0 = 3
                int r1 = r9.end
                int r2 = r9.byteWidth
                int r2 = r2 * 3
                int r1 = r1 - r2
                com.google.flatbuffers.FlexBuffers$KeyVector r2 = new com.google.flatbuffers.FlexBuffers$KeyVector
                com.google.flatbuffers.FlexBuffers$TypedVector r3 = new com.google.flatbuffers.FlexBuffers$TypedVector
                com.google.flatbuffers.ReadBuf r4 = r9.f46bb
                com.google.flatbuffers.ReadBuf r5 = r9.f46bb
                int r6 = r9.byteWidth
                int r5 = com.google.flatbuffers.FlexBuffers.access$200(r5, r1, r6)
                com.google.flatbuffers.ReadBuf r6 = r9.f46bb
                int r7 = r9.byteWidth
                int r7 = r7 + r1
                int r8 = r9.byteWidth
                int r6 = com.google.flatbuffers.FlexBuffers.access$100(r6, r7, r8)
                r7 = 4
                r3.<init>(r4, r5, r6, r7)
                r2.<init>(r3)
                return r2
        }

        @Override // com.google.flatbuffers.FlexBuffers.Vector, com.google.flatbuffers.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder r7) {
                r6 = this;
                java.lang.String r0 = "{ "
                r7.append(r0)
                com.google.flatbuffers.FlexBuffers$KeyVector r0 = r6.keys()
                int r1 = r6.size()
                com.google.flatbuffers.FlexBuffers$Vector r2 = r6.values()
                r3 = 0
            L12:
                if (r3 >= r1) goto L42
                r4 = 34
                java.lang.StringBuilder r4 = r7.append(r4)
                com.google.flatbuffers.FlexBuffers$Key r5 = r0.get(r3)
                java.lang.String r5 = r5.toString()
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r5 = "\" : "
                r4.append(r5)
                com.google.flatbuffers.FlexBuffers$Reference r4 = r2.get(r3)
                java.lang.String r4 = r4.toString()
                r7.append(r4)
                int r4 = r1 + (-1)
                if (r3 == r4) goto L3f
                java.lang.String r4 = ", "
                r7.append(r4)
            L3f:
                int r3 = r3 + 1
                goto L12
            L42:
                java.lang.String r3 = " }"
                r7.append(r3)
                return r7
        }

        public com.google.flatbuffers.FlexBuffers.Vector values() {
                r4 = this;
                com.google.flatbuffers.FlexBuffers$Vector r0 = new com.google.flatbuffers.FlexBuffers$Vector
                com.google.flatbuffers.ReadBuf r1 = r4.f46bb
                int r2 = r4.end
                int r3 = r4.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    private static abstract class Object {

        /* JADX INFO: renamed from: bb */
        com.google.flatbuffers.ReadBuf f46bb;
        int byteWidth;
        int end;

        Object(com.google.flatbuffers.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f46bb = r1
                r0.end = r2
                r0.byteWidth = r3
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.8E-43)
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r2.toString(r0)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public abstract java.lang.StringBuilder toString(java.lang.StringBuilder r1);
    }

    public static class Reference {
        private static final com.google.flatbuffers.FlexBuffers.Reference NULL_REFERENCE = null;

        /* JADX INFO: renamed from: bb */
        private com.google.flatbuffers.ReadBuf f47bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        static {
                com.google.flatbuffers.FlexBuffers$Reference r0 = new com.google.flatbuffers.FlexBuffers$Reference
                com.google.flatbuffers.ReadBuf r1 = com.google.flatbuffers.FlexBuffers.access$000()
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3, r2)
                com.google.flatbuffers.FlexBuffers.Reference.NULL_REFERENCE = r0
                return
        }

        Reference(com.google.flatbuffers.ReadBuf r9, int r10, int r11, int r12) {
                r8 = this;
                r0 = r12 & 3
                r1 = 1
                int r6 = r1 << r0
                int r7 = r12 >> 2
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r2.<init>(r3, r4, r5, r6, r7)
                return
        }

        Reference(com.google.flatbuffers.ReadBuf r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.f47bb = r1
                r0.end = r2
                r0.parentWidth = r3
                r0.byteWidth = r4
                r0.type = r5
                return
        }

        static /* synthetic */ com.google.flatbuffers.FlexBuffers.Reference access$600() {
                com.google.flatbuffers.FlexBuffers$Reference r0 = com.google.flatbuffers.FlexBuffers.Reference.NULL_REFERENCE
                return r0
        }

        public com.google.flatbuffers.FlexBuffers.Blob asBlob() {
                r5 = this;
                boolean r0 = r5.isBlob()
                if (r0 != 0) goto L12
                boolean r0 = r5.isString()
                if (r0 == 0) goto Ld
                goto L12
            Ld:
                com.google.flatbuffers.FlexBuffers$Blob r0 = com.google.flatbuffers.FlexBuffers.Blob.empty()
                return r0
            L12:
                com.google.flatbuffers.FlexBuffers$Blob r0 = new com.google.flatbuffers.FlexBuffers$Blob
                com.google.flatbuffers.ReadBuf r1 = r5.f47bb
                com.google.flatbuffers.ReadBuf r2 = r5.f47bb
                int r3 = r5.end
                int r4 = r5.parentWidth
                int r2 = com.google.flatbuffers.FlexBuffers.access$200(r2, r3, r4)
                int r3 = r5.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
        }

        public boolean asBoolean() {
                r7 = this;
                boolean r0 = r7.isBoolean()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L15
                com.google.flatbuffers.ReadBuf r0 = r7.f47bb
                int r3 = r7.end
                byte r0 = r0.get(r3)
                if (r0 == 0) goto L13
                goto L14
            L13:
                r1 = r2
            L14:
                return r1
            L15:
                long r3 = r7.asUInt()
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 == 0) goto L20
                goto L21
            L20:
                r1 = r2
            L21:
                return r1
        }

        public double asFloat() {
                r4 = this;
                int r0 = r4.type
                r1 = 3
                if (r0 != r1) goto L10
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                double r0 = com.google.flatbuffers.FlexBuffers.access$400(r0, r1, r2)
                return r0
            L10:
                int r0 = r4.type
                r1 = 0
                switch(r0) {
                    case 0: goto L7e;
                    case 1: goto L72;
                    case 2: goto L66;
                    case 5: goto L5d;
                    case 6: goto L49;
                    case 7: goto L35;
                    case 8: goto L22;
                    case 10: goto L18;
                    case 26: goto L66;
                    default: goto L17;
                }
            L17:
                return r1
            L18:
                com.google.flatbuffers.FlexBuffers$Vector r0 = r4.asVector()
                int r0 = r0.size()
                double r0 = (double) r0
                return r0
            L22:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = com.google.flatbuffers.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                double r0 = com.google.flatbuffers.FlexBuffers.access$400(r0, r1, r2)
                return r0
            L35:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = com.google.flatbuffers.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                long r0 = com.google.flatbuffers.FlexBuffers.access$300(r0, r1, r2)
                double r0 = (double) r0
                return r0
            L49:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = com.google.flatbuffers.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                int r0 = com.google.flatbuffers.FlexBuffers.access$100(r0, r1, r2)
                double r0 = (double) r0
                return r0
            L5d:
                java.lang.String r0 = r4.asString()
                double r0 = java.lang.Double.parseDouble(r0)
                return r0
            L66:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = com.google.flatbuffers.FlexBuffers.access$300(r0, r1, r2)
                double r0 = (double) r0
                return r0
            L72:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = com.google.flatbuffers.FlexBuffers.access$100(r0, r1, r2)
                double r0 = (double) r0
                return r0
            L7e:
                return r1
        }

        public int asInt() {
                r4 = this;
                int r0 = r4.type
                r1 = 1
                if (r0 != r1) goto L10
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = com.google.flatbuffers.FlexBuffers.access$100(r0, r1, r2)
                return r0
            L10:
                int r0 = r4.type
                r1 = 0
                switch(r0) {
                    case 0: goto L87;
                    case 2: goto L7b;
                    case 3: goto L6f;
                    case 5: goto L66;
                    case 6: goto L53;
                    case 7: goto L3f;
                    case 8: goto L2b;
                    case 10: goto L22;
                    case 26: goto L17;
                    default: goto L16;
                }
            L16:
                return r1
            L17:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = com.google.flatbuffers.FlexBuffers.access$100(r0, r1, r2)
                return r0
            L22:
                com.google.flatbuffers.FlexBuffers$Vector r0 = r4.asVector()
                int r0 = r0.size()
                return r0
            L2b:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = com.google.flatbuffers.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                double r0 = com.google.flatbuffers.FlexBuffers.access$400(r0, r1, r2)
                int r0 = (int) r0
                return r0
            L3f:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = com.google.flatbuffers.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.parentWidth
                long r0 = com.google.flatbuffers.FlexBuffers.access$300(r0, r1, r2)
                int r0 = (int) r0
                return r0
            L53:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = com.google.flatbuffers.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                int r0 = com.google.flatbuffers.FlexBuffers.access$100(r0, r1, r2)
                return r0
            L66:
                java.lang.String r0 = r4.asString()
                int r0 = java.lang.Integer.parseInt(r0)
                return r0
            L6f:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                double r0 = com.google.flatbuffers.FlexBuffers.access$400(r0, r1, r2)
                int r0 = (int) r0
                return r0
            L7b:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = com.google.flatbuffers.FlexBuffers.access$300(r0, r1, r2)
                int r0 = (int) r0
                return r0
            L87:
                return r1
        }

        public com.google.flatbuffers.FlexBuffers.Key asKey() {
                r5 = this;
                boolean r0 = r5.isKey()
                if (r0 == 0) goto L1a
                com.google.flatbuffers.FlexBuffers$Key r0 = new com.google.flatbuffers.FlexBuffers$Key
                com.google.flatbuffers.ReadBuf r1 = r5.f47bb
                com.google.flatbuffers.ReadBuf r2 = r5.f47bb
                int r3 = r5.end
                int r4 = r5.parentWidth
                int r2 = com.google.flatbuffers.FlexBuffers.access$200(r2, r3, r4)
                int r3 = r5.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
            L1a:
                com.google.flatbuffers.FlexBuffers$Key r0 = com.google.flatbuffers.FlexBuffers.Key.empty()
                return r0
        }

        public long asLong() {
                r4 = this;
                int r0 = r4.type
                r1 = 1
                if (r0 != r1) goto L10
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = com.google.flatbuffers.FlexBuffers.access$500(r0, r1, r2)
                return r0
            L10:
                int r0 = r4.type
                r1 = 0
                switch(r0) {
                    case 0: goto L8a;
                    case 2: goto L7f;
                    case 3: goto L73;
                    case 5: goto L68;
                    case 6: goto L55;
                    case 7: goto L42;
                    case 8: goto L2e;
                    case 10: goto L24;
                    case 26: goto L18;
                    default: goto L17;
                }
            L17:
                return r1
            L18:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = com.google.flatbuffers.FlexBuffers.access$100(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L24:
                com.google.flatbuffers.FlexBuffers$Vector r0 = r4.asVector()
                int r0 = r0.size()
                long r0 = (long) r0
                return r0
            L2e:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = com.google.flatbuffers.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                double r0 = com.google.flatbuffers.FlexBuffers.access$400(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L42:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = com.google.flatbuffers.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.parentWidth
                long r0 = com.google.flatbuffers.FlexBuffers.access$300(r0, r1, r2)
                return r0
            L55:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = com.google.flatbuffers.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                long r0 = com.google.flatbuffers.FlexBuffers.access$500(r0, r1, r2)
                return r0
            L68:
                java.lang.String r0 = r4.asString()     // Catch: java.lang.NumberFormatException -> L71
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L71
                return r0
            L71:
                r0 = move-exception
                return r1
            L73:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                double r0 = com.google.flatbuffers.FlexBuffers.access$400(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L7f:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = com.google.flatbuffers.FlexBuffers.access$300(r0, r1, r2)
                return r0
            L8a:
                return r1
        }

        public com.google.flatbuffers.FlexBuffers.Map asMap() {
                r5 = this;
                boolean r0 = r5.isMap()
                if (r0 == 0) goto L1a
                com.google.flatbuffers.FlexBuffers$Map r0 = new com.google.flatbuffers.FlexBuffers$Map
                com.google.flatbuffers.ReadBuf r1 = r5.f47bb
                com.google.flatbuffers.ReadBuf r2 = r5.f47bb
                int r3 = r5.end
                int r4 = r5.parentWidth
                int r2 = com.google.flatbuffers.FlexBuffers.access$200(r2, r3, r4)
                int r3 = r5.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
            L1a:
                com.google.flatbuffers.FlexBuffers$Map r0 = com.google.flatbuffers.FlexBuffers.Map.empty()
                return r0
        }

        public java.lang.String asString() {
                r4 = this;
                boolean r0 = r4.isString()
                if (r0 == 0) goto L24
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = com.google.flatbuffers.FlexBuffers.access$200(r0, r1, r2)
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.byteWidth
                int r2 = r0 - r2
                int r3 = r4.byteWidth
                long r1 = com.google.flatbuffers.FlexBuffers.access$300(r1, r2, r3)
                int r1 = (int) r1
                com.google.flatbuffers.ReadBuf r2 = r4.f47bb
                java.lang.String r2 = r2.getString(r0, r1)
                return r2
            L24:
                boolean r0 = r4.isKey()
                if (r0 == 0) goto L49
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.byteWidth
                int r0 = com.google.flatbuffers.FlexBuffers.access$200(r0, r1, r2)
                r1 = r0
            L35:
                com.google.flatbuffers.ReadBuf r2 = r4.f47bb
                byte r2 = r2.get(r1)
                if (r2 != 0) goto L46
                com.google.flatbuffers.ReadBuf r2 = r4.f47bb
                int r3 = r1 - r0
                java.lang.String r2 = r2.getString(r0, r3)
                return r2
            L46:
                int r1 = r1 + 1
                goto L35
            L49:
                java.lang.String r0 = ""
                return r0
        }

        public long asUInt() {
                r4 = this;
                int r0 = r4.type
                r1 = 2
                if (r0 != r1) goto L10
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = com.google.flatbuffers.FlexBuffers.access$300(r0, r1, r2)
                return r0
            L10:
                int r0 = r4.type
                r1 = 0
                switch(r0) {
                    case 0: goto L88;
                    case 1: goto L7d;
                    case 3: goto L71;
                    case 5: goto L68;
                    case 6: goto L55;
                    case 7: goto L42;
                    case 8: goto L2e;
                    case 10: goto L24;
                    case 26: goto L18;
                    default: goto L17;
                }
            L17:
                return r1
            L18:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                int r0 = com.google.flatbuffers.FlexBuffers.access$100(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L24:
                com.google.flatbuffers.FlexBuffers$Vector r0 = r4.asVector()
                int r0 = r0.size()
                long r0 = (long) r0
                return r0
            L2e:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = com.google.flatbuffers.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.parentWidth
                double r0 = com.google.flatbuffers.FlexBuffers.access$400(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L42:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = com.google.flatbuffers.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                long r0 = com.google.flatbuffers.FlexBuffers.access$300(r0, r1, r2)
                return r0
            L55:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                com.google.flatbuffers.ReadBuf r1 = r4.f47bb
                int r2 = r4.end
                int r3 = r4.parentWidth
                int r1 = com.google.flatbuffers.FlexBuffers.access$200(r1, r2, r3)
                int r2 = r4.byteWidth
                long r0 = com.google.flatbuffers.FlexBuffers.access$500(r0, r1, r2)
                return r0
            L68:
                java.lang.String r0 = r4.asString()
                long r0 = java.lang.Long.parseLong(r0)
                return r0
            L71:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                double r0 = com.google.flatbuffers.FlexBuffers.access$400(r0, r1, r2)
                long r0 = (long) r0
                return r0
            L7d:
                com.google.flatbuffers.ReadBuf r0 = r4.f47bb
                int r1 = r4.end
                int r2 = r4.parentWidth
                long r0 = com.google.flatbuffers.FlexBuffers.access$500(r0, r1, r2)
                return r0
            L88:
                return r1
        }

        public com.google.flatbuffers.FlexBuffers.Vector asVector() {
                r5 = this;
                boolean r0 = r5.isVector()
                if (r0 == 0) goto L1a
                com.google.flatbuffers.FlexBuffers$Vector r0 = new com.google.flatbuffers.FlexBuffers$Vector
                com.google.flatbuffers.ReadBuf r1 = r5.f47bb
                com.google.flatbuffers.ReadBuf r2 = r5.f47bb
                int r3 = r5.end
                int r4 = r5.parentWidth
                int r2 = com.google.flatbuffers.FlexBuffers.access$200(r2, r3, r4)
                int r3 = r5.byteWidth
                r0.<init>(r1, r2, r3)
                return r0
            L1a:
                int r0 = r5.type
                r1 = 15
                if (r0 != r1) goto L35
                com.google.flatbuffers.FlexBuffers$TypedVector r0 = new com.google.flatbuffers.FlexBuffers$TypedVector
                com.google.flatbuffers.ReadBuf r1 = r5.f47bb
                com.google.flatbuffers.ReadBuf r2 = r5.f47bb
                int r3 = r5.end
                int r4 = r5.parentWidth
                int r2 = com.google.flatbuffers.FlexBuffers.access$200(r2, r3, r4)
                int r3 = r5.byteWidth
                r4 = 4
                r0.<init>(r1, r2, r3, r4)
                return r0
            L35:
                int r0 = r5.type
                boolean r0 = com.google.flatbuffers.FlexBuffers.isTypedVector(r0)
                if (r0 == 0) goto L57
                com.google.flatbuffers.FlexBuffers$TypedVector r0 = new com.google.flatbuffers.FlexBuffers$TypedVector
                com.google.flatbuffers.ReadBuf r1 = r5.f47bb
                com.google.flatbuffers.ReadBuf r2 = r5.f47bb
                int r3 = r5.end
                int r4 = r5.parentWidth
                int r2 = com.google.flatbuffers.FlexBuffers.access$200(r2, r3, r4)
                int r3 = r5.byteWidth
                int r4 = r5.type
                int r4 = com.google.flatbuffers.FlexBuffers.toTypedVectorElementType(r4)
                r0.<init>(r1, r2, r3, r4)
                return r0
            L57:
                com.google.flatbuffers.FlexBuffers$Vector r0 = com.google.flatbuffers.FlexBuffers.Vector.empty()
                return r0
        }

        public int getType() {
                r1 = this;
                int r0 = r1.type
                return r0
        }

        public boolean isBlob() {
                r2 = this;
                int r0 = r2.type
                r1 = 25
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean isBoolean() {
                r2 = this;
                int r0 = r2.type
                r1 = 26
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean isFloat() {
                r2 = this;
                int r0 = r2.type
                r1 = 3
                if (r0 == r1) goto Le
                int r0 = r2.type
                r1 = 8
                if (r0 != r1) goto Lc
                goto Le
            Lc:
                r0 = 0
                goto Lf
            Le:
                r0 = 1
            Lf:
                return r0
        }

        public boolean isInt() {
                r3 = this;
                int r0 = r3.type
                r1 = 1
                if (r0 == r1) goto Lc
                int r0 = r3.type
                r2 = 6
                if (r0 != r2) goto Lb
                goto Lc
            Lb:
                r1 = 0
            Lc:
                return r1
        }

        public boolean isIntOrUInt() {
                r1 = this;
                boolean r0 = r1.isInt()
                if (r0 != 0) goto Lf
                boolean r0 = r1.isUInt()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        public boolean isKey() {
                r2 = this;
                int r0 = r2.type
                r1 = 4
                if (r0 != r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        public boolean isMap() {
                r2 = this;
                int r0 = r2.type
                r1 = 9
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean isNull() {
                r1 = this;
                int r0 = r1.type
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public boolean isNumeric() {
                r1 = this;
                boolean r0 = r1.isIntOrUInt()
                if (r0 != 0) goto Lf
                boolean r0 = r1.isFloat()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        public boolean isString() {
                r2 = this;
                int r0 = r2.type
                r1 = 5
                if (r0 != r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        public boolean isTypedVector() {
                r1 = this;
                int r0 = r1.type
                boolean r0 = com.google.flatbuffers.FlexBuffers.isTypedVector(r0)
                return r0
        }

        public boolean isUInt() {
                r2 = this;
                int r0 = r2.type
                r1 = 2
                if (r0 == r1) goto Ld
                int r0 = r2.type
                r1 = 7
                if (r0 != r1) goto Lb
                goto Ld
            Lb:
                r0 = 0
                goto Le
            Ld:
                r0 = 1
            Le:
                return r0
        }

        public boolean isVector() {
                r2 = this;
                int r0 = r2.type
                r1 = 10
                if (r0 == r1) goto Lf
                int r0 = r2.type
                r1 = 9
                if (r0 != r1) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.8E-43)
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r2.toString(r0)
                java.lang.String r0 = r0.toString()
                return r0
        }

        java.lang.StringBuilder toString(java.lang.StringBuilder r4) {
                r3 = this;
                int r0 = r3.type
                r1 = 34
                switch(r0) {
                    case 0: goto L8d;
                    case 1: goto L84;
                    case 2: goto L7b;
                    case 3: goto L72;
                    case 4: goto L61;
                    case 5: goto L50;
                    case 6: goto L84;
                    case 7: goto L7b;
                    case 8: goto L72;
                    case 9: goto L47;
                    case 10: goto L3e;
                    case 11: goto L35;
                    case 12: goto L35;
                    case 13: goto L35;
                    case 14: goto L35;
                    case 15: goto L35;
                    case 16: goto L1a;
                    case 17: goto L1a;
                    case 18: goto L1a;
                    case 19: goto L1a;
                    case 20: goto L1a;
                    case 21: goto L1a;
                    case 22: goto L1a;
                    case 23: goto L1a;
                    case 24: goto L1a;
                    case 25: goto L11;
                    case 26: goto L8;
                    case 27: goto L7;
                    case 28: goto L7;
                    case 29: goto L7;
                    case 30: goto L7;
                    case 31: goto L7;
                    case 32: goto L7;
                    case 33: goto L7;
                    case 34: goto L7;
                    case 35: goto L7;
                    case 36: goto L35;
                    default: goto L7;
                }
            L7:
                return r4
            L8:
                boolean r0 = r3.asBoolean()
                java.lang.StringBuilder r0 = r4.append(r0)
                return r0
            L11:
                com.google.flatbuffers.FlexBuffers$Blob r0 = r3.asBlob()
                java.lang.StringBuilder r0 = r0.toString(r4)
                return r0
            L1a:
                com.google.flatbuffers.FlexBuffers$FlexBufferException r0 = new com.google.flatbuffers.FlexBuffers$FlexBufferException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "not_implemented:"
                java.lang.StringBuilder r1 = r1.append(r2)
                int r2 = r3.type
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L35:
                com.google.flatbuffers.FlexBuffers$Vector r0 = r3.asVector()
                java.lang.StringBuilder r0 = r4.append(r0)
                return r0
            L3e:
                com.google.flatbuffers.FlexBuffers$Vector r0 = r3.asVector()
                java.lang.StringBuilder r0 = r0.toString(r4)
                return r0
            L47:
                com.google.flatbuffers.FlexBuffers$Map r0 = r3.asMap()
                java.lang.StringBuilder r0 = r0.toString(r4)
                return r0
            L50:
                java.lang.StringBuilder r0 = r4.append(r1)
                java.lang.String r2 = r3.asString()
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                return r0
            L61:
                com.google.flatbuffers.FlexBuffers$Key r0 = r3.asKey()
                java.lang.StringBuilder r2 = r4.append(r1)
                java.lang.StringBuilder r0 = r0.toString(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                return r0
            L72:
                double r0 = r3.asFloat()
                java.lang.StringBuilder r0 = r4.append(r0)
                return r0
            L7b:
                long r0 = r3.asUInt()
                java.lang.StringBuilder r0 = r4.append(r0)
                return r0
            L84:
                long r0 = r3.asLong()
                java.lang.StringBuilder r0 = r4.append(r0)
                return r0
            L8d:
                java.lang.String r0 = "null"
                java.lang.StringBuilder r0 = r4.append(r0)
                return r0
        }
    }

    private static abstract class Sized extends com.google.flatbuffers.FlexBuffers.Object {
        protected final int size;

        Sized(com.google.flatbuffers.ReadBuf r3, int r4, int r5) {
                r2 = this;
                r2.<init>(r3, r4, r5)
                com.google.flatbuffers.ReadBuf r0 = r2.f46bb
                int r1 = r4 - r5
                long r0 = com.google.flatbuffers.FlexBuffers.access$300(r0, r1, r5)
                int r0 = (int) r0
                r2.size = r0
                return
        }

        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    public static class TypedVector extends com.google.flatbuffers.FlexBuffers.Vector {
        private static final com.google.flatbuffers.FlexBuffers.TypedVector EMPTY_VECTOR = null;
        private final int elemType;

        static {
                com.google.flatbuffers.FlexBuffers$TypedVector r0 = new com.google.flatbuffers.FlexBuffers$TypedVector
                com.google.flatbuffers.ReadBuf r1 = com.google.flatbuffers.FlexBuffers.access$000()
                r2 = 1
                r0.<init>(r1, r2, r2, r2)
                com.google.flatbuffers.FlexBuffers.TypedVector.EMPTY_VECTOR = r0
                return
        }

        TypedVector(com.google.flatbuffers.ReadBuf r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.elemType = r4
                return
        }

        public static com.google.flatbuffers.FlexBuffers.TypedVector empty() {
                com.google.flatbuffers.FlexBuffers$TypedVector r0 = com.google.flatbuffers.FlexBuffers.TypedVector.EMPTY_VECTOR
                return r0
        }

        @Override // com.google.flatbuffers.FlexBuffers.Vector
        public com.google.flatbuffers.FlexBuffers.Reference get(int r10) {
                r9 = this;
                int r0 = r9.size()
                if (r10 < r0) goto Lb
                com.google.flatbuffers.FlexBuffers$Reference r1 = com.google.flatbuffers.FlexBuffers.Reference.access$600()
                return r1
            Lb:
                int r1 = r9.end
                int r2 = r9.byteWidth
                int r2 = r2 * r10
                int r1 = r1 + r2
                com.google.flatbuffers.FlexBuffers$Reference r2 = new com.google.flatbuffers.FlexBuffers$Reference
                com.google.flatbuffers.ReadBuf r4 = r9.f46bb
                int r6 = r9.byteWidth
                r7 = 1
                int r8 = r9.elemType
                r3 = r2
                r5 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                return r2
        }

        public int getElemType() {
                r1 = this;
                int r0 = r1.elemType
                return r0
        }

        public boolean isEmptyVector() {
                r1 = this;
                com.google.flatbuffers.FlexBuffers$TypedVector r0 = com.google.flatbuffers.FlexBuffers.TypedVector.EMPTY_VECTOR
                if (r1 != r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    static class Unsigned {
        Unsigned() {
                r0 = this;
                r0.<init>()
                return
        }

        static int byteToUnsignedInt(byte r1) {
                r0 = r1 & 255(0xff, float:3.57E-43)
                return r0
        }

        static long intToUnsignedLong(int r4) {
                long r0 = (long) r4
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = r0 & r2
                return r0
        }

        static int shortToUnsignedInt(short r1) {
                r0 = 65535(0xffff, float:9.1834E-41)
                r0 = r0 & r1
                return r0
        }
    }

    public static class Vector extends com.google.flatbuffers.FlexBuffers.Sized {
        private static final com.google.flatbuffers.FlexBuffers.Vector EMPTY_VECTOR = null;

        static {
                com.google.flatbuffers.FlexBuffers$Vector r0 = new com.google.flatbuffers.FlexBuffers$Vector
                com.google.flatbuffers.ReadBuf r1 = com.google.flatbuffers.FlexBuffers.access$000()
                r2 = 1
                r0.<init>(r1, r2, r2)
                com.google.flatbuffers.FlexBuffers.Vector.EMPTY_VECTOR = r0
                return
        }

        Vector(com.google.flatbuffers.ReadBuf r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static com.google.flatbuffers.FlexBuffers.Vector empty() {
                com.google.flatbuffers.FlexBuffers$Vector r0 = com.google.flatbuffers.FlexBuffers.Vector.EMPTY_VECTOR
                return r0
        }

        public com.google.flatbuffers.FlexBuffers.Reference get(int r8) {
                r7 = this;
                int r0 = r7.size()
                long r0 = (long) r0
                long r2 = (long) r8
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 < 0) goto Lf
                com.google.flatbuffers.FlexBuffers$Reference r2 = com.google.flatbuffers.FlexBuffers.Reference.access$600()
                return r2
            Lf:
                com.google.flatbuffers.ReadBuf r2 = r7.f46bb
                int r3 = r7.end
                long r3 = (long) r3
                int r5 = r7.byteWidth
                long r5 = (long) r5
                long r5 = r5 * r0
                long r3 = r3 + r5
                long r5 = (long) r8
                long r3 = r3 + r5
                int r3 = (int) r3
                byte r2 = r2.get(r3)
                int r2 = com.google.flatbuffers.FlexBuffers.Unsigned.byteToUnsignedInt(r2)
                int r3 = r7.end
                int r4 = r7.byteWidth
                int r4 = r4 * r8
                int r3 = r3 + r4
                com.google.flatbuffers.FlexBuffers$Reference r4 = new com.google.flatbuffers.FlexBuffers$Reference
                com.google.flatbuffers.ReadBuf r5 = r7.f46bb
                int r6 = r7.byteWidth
                r4.<init>(r5, r3, r6, r2)
                return r4
        }

        public boolean isEmpty() {
                r1 = this;
                com.google.flatbuffers.FlexBuffers$Vector r0 = com.google.flatbuffers.FlexBuffers.Vector.EMPTY_VECTOR
                if (r1 != r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // com.google.flatbuffers.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
                r1 = this;
                int r0 = super.size()
                return r0
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public /* bridge */ /* synthetic */ java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = super.toString()
                return r0
        }

        @Override // com.google.flatbuffers.FlexBuffers.Object
        public java.lang.StringBuilder toString(java.lang.StringBuilder r4) {
                r3 = this;
                java.lang.String r0 = "[ "
                r4.append(r0)
                int r0 = r3.size()
                r1 = 0
            La:
                if (r1 >= r0) goto L1f
                com.google.flatbuffers.FlexBuffers$Reference r2 = r3.get(r1)
                r2.toString(r4)
                int r2 = r0 + (-1)
                if (r1 == r2) goto L1c
                java.lang.String r2 = ", "
                r4.append(r2)
            L1c:
                int r1 = r1 + 1
                goto La
            L1f:
                java.lang.String r1 = " ]"
                r4.append(r1)
                return r4
        }
    }

    static {
            com.google.flatbuffers.ArrayReadWriteBuf r0 = new com.google.flatbuffers.ArrayReadWriteBuf
            r1 = 1
            byte[] r2 = new byte[r1]
            r3 = 0
            r2[r3] = r3
            r0.<init>(r2, r1)
            com.google.flatbuffers.FlexBuffers.EMPTY_BB = r0
            return
    }

    public FlexBuffers() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.google.flatbuffers.ReadBuf access$000() {
            com.google.flatbuffers.ReadBuf r0 = com.google.flatbuffers.FlexBuffers.EMPTY_BB
            return r0
    }

    static /* synthetic */ int access$100(com.google.flatbuffers.ReadBuf r1, int r2, int r3) {
            int r0 = readInt(r1, r2, r3)
            return r0
    }

    static /* synthetic */ int access$200(com.google.flatbuffers.ReadBuf r1, int r2, int r3) {
            int r0 = indirect(r1, r2, r3)
            return r0
    }

    static /* synthetic */ long access$300(com.google.flatbuffers.ReadBuf r2, int r3, int r4) {
            long r0 = readUInt(r2, r3, r4)
            return r0
    }

    static /* synthetic */ double access$400(com.google.flatbuffers.ReadBuf r2, int r3, int r4) {
            double r0 = readDouble(r2, r3, r4)
            return r0
    }

    static /* synthetic */ long access$500(com.google.flatbuffers.ReadBuf r2, int r3, int r4) {
            long r0 = readLong(r2, r3, r4)
            return r0
    }

    public static com.google.flatbuffers.FlexBuffers.Reference getRoot(com.google.flatbuffers.ReadBuf r4) {
            int r0 = r4.limit()
            int r0 = r0 + (-1)
            byte r1 = r4.get(r0)
            int r0 = r0 + (-1)
            byte r2 = r4.get(r0)
            int r2 = com.google.flatbuffers.FlexBuffers.Unsigned.byteToUnsignedInt(r2)
            int r0 = r0 - r1
            com.google.flatbuffers.FlexBuffers$Reference r3 = new com.google.flatbuffers.FlexBuffers$Reference
            r3.<init>(r4, r0, r1, r2)
            return r3
    }

    @java.lang.Deprecated
    public static com.google.flatbuffers.FlexBuffers.Reference getRoot(java.nio.ByteBuffer r3) {
            boolean r0 = r3.hasArray()
            if (r0 == 0) goto L14
            com.google.flatbuffers.ArrayReadWriteBuf r0 = new com.google.flatbuffers.ArrayReadWriteBuf
            byte[] r1 = r3.array()
            int r2 = r3.limit()
            r0.<init>(r1, r2)
            goto L19
        L14:
            com.google.flatbuffers.ByteBufferReadWriteBuf r0 = new com.google.flatbuffers.ByteBufferReadWriteBuf
            r0.<init>(r3)
        L19:
            com.google.flatbuffers.FlexBuffers$Reference r0 = getRoot(r0)
            return r0
    }

    private static int indirect(com.google.flatbuffers.ReadBuf r4, int r5, int r6) {
            long r0 = (long) r5
            long r2 = readUInt(r4, r5, r6)
            long r0 = r0 - r2
            int r0 = (int) r0
            return r0
    }

    static boolean isTypeInline(int r1) {
            r0 = 3
            if (r1 <= r0) goto La
            r0 = 26
            if (r1 != r0) goto L8
            goto La
        L8:
            r0 = 0
            goto Lb
        La:
            r0 = 1
        Lb:
            return r0
    }

    static boolean isTypedVector(int r1) {
            r0 = 11
            if (r1 < r0) goto L8
            r0 = 15
            if (r1 <= r0) goto Lc
        L8:
            r0 = 36
            if (r1 != r0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    static boolean isTypedVectorElementType(int r2) {
            r0 = 1
            if (r2 < r0) goto L6
            r1 = 4
            if (r2 <= r1) goto La
        L6:
            r1 = 26
            if (r2 != r1) goto Lb
        La:
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    private static double readDouble(com.google.flatbuffers.ReadBuf r2, int r3, int r4) {
            switch(r4) {
                case 4: goto Lb;
                case 8: goto L6;
                default: goto L3;
            }
        L3:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            return r0
        L6:
            double r0 = r2.getDouble(r3)
            return r0
        Lb:
            float r0 = r2.getFloat(r3)
            double r0 = (double) r0
            return r0
    }

    private static int readInt(com.google.flatbuffers.ReadBuf r2, int r3, int r4) {
            long r0 = readLong(r2, r3, r4)
            int r0 = (int) r0
            return r0
    }

    private static long readLong(com.google.flatbuffers.ReadBuf r2, int r3, int r4) {
            switch(r4) {
                case 1: goto L17;
                case 2: goto L11;
                case 4: goto Lb;
                case 8: goto L6;
                default: goto L3;
            }
        L3:
            r0 = -1
            return r0
        L6:
            long r0 = r2.getLong(r3)
            return r0
        Lb:
            int r0 = r2.getInt(r3)
            long r0 = (long) r0
            return r0
        L11:
            short r0 = r2.getShort(r3)
            long r0 = (long) r0
            return r0
        L17:
            byte r0 = r2.get(r3)
            long r0 = (long) r0
            return r0
    }

    private static long readUInt(com.google.flatbuffers.ReadBuf r2, int r3, int r4) {
            switch(r4) {
                case 1: goto L1e;
                case 2: goto L14;
                case 4: goto Lb;
                case 8: goto L6;
                default: goto L3;
            }
        L3:
            r0 = -1
            return r0
        L6:
            long r0 = r2.getLong(r3)
            return r0
        Lb:
            int r0 = r2.getInt(r3)
            long r0 = com.google.flatbuffers.FlexBuffers.Unsigned.intToUnsignedLong(r0)
            return r0
        L14:
            short r0 = r2.getShort(r3)
            int r0 = com.google.flatbuffers.FlexBuffers.Unsigned.shortToUnsignedInt(r0)
            long r0 = (long) r0
            return r0
        L1e:
            byte r0 = r2.get(r3)
            int r0 = com.google.flatbuffers.FlexBuffers.Unsigned.byteToUnsignedInt(r0)
            long r0 = (long) r0
            return r0
    }

    static int toTypedVector(int r1, int r2) {
            switch(r2) {
                case 0: goto L14;
                case 1: goto L4;
                case 2: goto Lf;
                case 3: goto La;
                case 4: goto L5;
                default: goto L4;
            }
        L4:
            goto L19
        L5:
            int r0 = r1 + (-1)
            int r0 = r0 + 22
            return r0
        La:
            int r0 = r1 + (-1)
            int r0 = r0 + 19
            return r0
        Lf:
            int r0 = r1 + (-1)
            int r0 = r0 + 16
            return r0
        L14:
            int r0 = r1 + (-1)
            int r0 = r0 + 11
            return r0
        L19:
            r0 = 0
            return r0
    }

    static int toTypedVectorElementType(int r1) {
            int r0 = r1 + (-11)
            int r0 = r0 + 1
            return r0
    }
}
