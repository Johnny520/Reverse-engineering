package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class EncodedValueReader {
    public static final int ENCODED_ANNOTATION = 29;
    public static final int ENCODED_ARRAY = 28;
    public static final int ENCODED_BOOLEAN = 31;
    public static final int ENCODED_BYTE = 0;
    public static final int ENCODED_CHAR = 3;
    public static final int ENCODED_DOUBLE = 17;
    public static final int ENCODED_ENUM = 27;
    public static final int ENCODED_FIELD = 25;
    public static final int ENCODED_FLOAT = 16;
    public static final int ENCODED_INT = 4;
    public static final int ENCODED_LONG = 6;
    public static final int ENCODED_METHOD = 26;
    public static final int ENCODED_METHOD_HANDLE = 22;
    public static final int ENCODED_METHOD_TYPE = 21;
    public static final int ENCODED_NULL = 30;
    public static final int ENCODED_SHORT = 2;
    public static final int ENCODED_STRING = 23;
    public static final int ENCODED_TYPE = 24;
    private static final int MUST_READ = -1;
    private int annotationType;
    private int arg;
    protected final com.android.dex.util.ByteInput in;
    private int type;

    public EncodedValueReader(com.android.dex.EncodedValue r1) {
            r0 = this;
            com.android.dex.util.ByteInput r1 = r1.asByteInput()
            r0.<init>(r1)
            return
    }

    public EncodedValueReader(com.android.dex.EncodedValue r1, int r2) {
            r0 = this;
            com.android.dex.util.ByteInput r1 = r1.asByteInput()
            r0.<init>(r1, r2)
            return
    }

    public EncodedValueReader(com.android.dex.util.ByteInput r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.type = r0
            r1.in = r2
            return
    }

    public EncodedValueReader(com.android.dex.util.ByteInput r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.in = r1
            r0.type = r2
            return
    }

    private void checkType(int r3) {
            r2 = this;
            int r0 = r2.peek()
            if (r0 != r3) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r1 = r2.peek()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1}
            java.lang.String r1 = "Expected %x but was %x"
            java.lang.String r3 = java.lang.String.format(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    public int getAnnotationType() {
            r1 = this;
            int r0 = r1.annotationType
            return r0
    }

    public int peek() {
            r2 = this;
            int r0 = r2.type
            r1 = -1
            if (r0 != r1) goto L15
            com.android.dex.util.ByteInput r0 = r2.in
            byte r0 = r0.readByte()
            r1 = r0 & 31
            r2.type = r1
            r0 = r0 & 224(0xe0, float:3.14E-43)
            int r0 = r0 >> 5
            r2.arg = r0
        L15:
            int r0 = r2.type
            return r0
    }

    public int readAnnotation() {
            r1 = this;
            r0 = 29
            r1.checkType(r0)
            r0 = -1
            r1.type = r0
            com.android.dex.util.ByteInput r0 = r1.in
            int r0 = com.android.dex.Leb128.readUnsignedLeb128(r0)
            r1.annotationType = r0
            com.android.dex.util.ByteInput r0 = r1.in
            int r0 = com.android.dex.Leb128.readUnsignedLeb128(r0)
            return r0
    }

    public int readAnnotationName() {
            r1 = this;
            com.android.dex.util.ByteInput r0 = r1.in
            int r0 = com.android.dex.Leb128.readUnsignedLeb128(r0)
            return r0
    }

    public int readArray() {
            r1 = this;
            r0 = 28
            r1.checkType(r0)
            r0 = -1
            r1.type = r0
            com.android.dex.util.ByteInput r0 = r1.in
            int r0 = com.android.dex.Leb128.readUnsignedLeb128(r0)
            return r0
    }

    public boolean readBoolean() {
            r1 = this;
            r0 = 31
            r1.checkType(r0)
            r0 = -1
            r1.type = r0
            int r0 = r1.arg
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public byte readByte() {
            r2 = this;
            r0 = 0
            r2.checkType(r0)
            r0 = -1
            r2.type = r0
            com.android.dex.util.ByteInput r0 = r2.in
            int r1 = r2.arg
            int r0 = com.android.dex.EncodedValueCodec.readSignedInt(r0, r1)
            byte r0 = (byte) r0
            return r0
    }

    public char readChar() {
            r3 = this;
            r0 = 3
            r3.checkType(r0)
            r0 = -1
            r3.type = r0
            com.android.dex.util.ByteInput r0 = r3.in
            int r1 = r3.arg
            r2 = 0
            int r0 = com.android.dex.EncodedValueCodec.readUnsignedInt(r0, r1, r2)
            char r0 = (char) r0
            return r0
    }

    public double readDouble() {
            r3 = this;
            r0 = 17
            r3.checkType(r0)
            r0 = -1
            r3.type = r0
            com.android.dex.util.ByteInput r0 = r3.in
            int r1 = r3.arg
            r2 = 1
            long r0 = com.android.dex.EncodedValueCodec.readUnsignedLong(r0, r1, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public int readEnum() {
            r3 = this;
            r0 = 27
            r3.checkType(r0)
            r0 = -1
            r3.type = r0
            com.android.dex.util.ByteInput r0 = r3.in
            int r1 = r3.arg
            r2 = 0
            int r0 = com.android.dex.EncodedValueCodec.readUnsignedInt(r0, r1, r2)
            return r0
    }

    public int readField() {
            r3 = this;
            r0 = 25
            r3.checkType(r0)
            r0 = -1
            r3.type = r0
            com.android.dex.util.ByteInput r0 = r3.in
            int r1 = r3.arg
            r2 = 0
            int r0 = com.android.dex.EncodedValueCodec.readUnsignedInt(r0, r1, r2)
            return r0
    }

    public float readFloat() {
            r3 = this;
            r0 = 16
            r3.checkType(r0)
            r0 = -1
            r3.type = r0
            com.android.dex.util.ByteInput r0 = r3.in
            int r1 = r3.arg
            r2 = 1
            int r0 = com.android.dex.EncodedValueCodec.readUnsignedInt(r0, r1, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    public int readInt() {
            r2 = this;
            r0 = 4
            r2.checkType(r0)
            r0 = -1
            r2.type = r0
            com.android.dex.util.ByteInput r0 = r2.in
            int r1 = r2.arg
            int r0 = com.android.dex.EncodedValueCodec.readSignedInt(r0, r1)
            return r0
    }

    public long readLong() {
            r2 = this;
            r0 = 6
            r2.checkType(r0)
            r0 = -1
            r2.type = r0
            com.android.dex.util.ByteInput r0 = r2.in
            int r1 = r2.arg
            long r0 = com.android.dex.EncodedValueCodec.readSignedLong(r0, r1)
            return r0
    }

    public int readMethod() {
            r3 = this;
            r0 = 26
            r3.checkType(r0)
            r0 = -1
            r3.type = r0
            com.android.dex.util.ByteInput r0 = r3.in
            int r1 = r3.arg
            r2 = 0
            int r0 = com.android.dex.EncodedValueCodec.readUnsignedInt(r0, r1, r2)
            return r0
    }

    public int readMethodHandle() {
            r3 = this;
            r0 = 22
            r3.checkType(r0)
            r0 = -1
            r3.type = r0
            com.android.dex.util.ByteInput r0 = r3.in
            int r1 = r3.arg
            r2 = 0
            int r0 = com.android.dex.EncodedValueCodec.readUnsignedInt(r0, r1, r2)
            return r0
    }

    public int readMethodType() {
            r3 = this;
            r0 = 21
            r3.checkType(r0)
            r0 = -1
            r3.type = r0
            com.android.dex.util.ByteInput r0 = r3.in
            int r1 = r3.arg
            r2 = 0
            int r0 = com.android.dex.EncodedValueCodec.readUnsignedInt(r0, r1, r2)
            return r0
    }

    public void readNull() {
            r1 = this;
            r0 = 30
            r1.checkType(r0)
            r0 = -1
            r1.type = r0
            return
    }

    public short readShort() {
            r2 = this;
            r0 = 2
            r2.checkType(r0)
            r0 = -1
            r2.type = r0
            com.android.dex.util.ByteInput r0 = r2.in
            int r1 = r2.arg
            int r0 = com.android.dex.EncodedValueCodec.readSignedInt(r0, r1)
            short r0 = (short) r0
            return r0
    }

    public int readString() {
            r3 = this;
            r0 = 23
            r3.checkType(r0)
            r0 = -1
            r3.type = r0
            com.android.dex.util.ByteInput r0 = r3.in
            int r1 = r3.arg
            r2 = 0
            int r0 = com.android.dex.EncodedValueCodec.readUnsignedInt(r0, r1, r2)
            return r0
    }

    public int readType() {
            r3 = this;
            r0 = 24
            r3.checkType(r0)
            r0 = -1
            r3.type = r0
            com.android.dex.util.ByteInput r0 = r3.in
            int r1 = r3.arg
            r2 = 0
            int r0 = com.android.dex.EncodedValueCodec.readUnsignedInt(r0, r1, r2)
            return r0
    }

    public void skipValue() {
            r3 = this;
            int r0 = r3.peek()
            if (r0 == 0) goto L92
            r1 = 6
            if (r0 == r1) goto L8e
            r1 = 2
            if (r0 == r1) goto L8a
            r1 = 3
            if (r0 == r1) goto L86
            r1 = 4
            if (r0 == r1) goto L82
            r1 = 16
            if (r0 == r1) goto L7e
            r1 = 17
            if (r0 == r1) goto L7a
            r1 = 0
            switch(r0) {
                case 21: goto L76;
                case 22: goto L72;
                case 23: goto L6e;
                case 24: goto L6a;
                case 25: goto L66;
                case 26: goto L62;
                case 27: goto L5e;
                case 28: goto L52;
                case 29: goto L43;
                case 30: goto L3f;
                case 31: goto L3b;
                default: goto L1e;
            }
        L1e:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected type: "
            r1.append(r2)
            int r2 = r3.type
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3b:
            r3.readBoolean()
            goto L95
        L3f:
            r3.readNull()
            goto L95
        L43:
            int r0 = r3.readAnnotation()
        L47:
            if (r1 >= r0) goto L95
            r3.readAnnotationName()
            r3.skipValue()
            int r1 = r1 + 1
            goto L47
        L52:
            int r0 = r3.readArray()
        L56:
            if (r1 >= r0) goto L95
            r3.skipValue()
            int r1 = r1 + 1
            goto L56
        L5e:
            r3.readEnum()
            goto L95
        L62:
            r3.readMethod()
            goto L95
        L66:
            r3.readField()
            goto L95
        L6a:
            r3.readType()
            goto L95
        L6e:
            r3.readString()
            goto L95
        L72:
            r3.readMethodHandle()
            goto L95
        L76:
            r3.readMethodType()
            goto L95
        L7a:
            r3.readDouble()
            goto L95
        L7e:
            r3.readFloat()
            goto L95
        L82:
            r3.readInt()
            goto L95
        L86:
            r3.readChar()
            goto L95
        L8a:
            r3.readShort()
            goto L95
        L8e:
            r3.readLong()
            goto L95
        L92:
            r3.readByte()
        L95:
            return
    }
}
