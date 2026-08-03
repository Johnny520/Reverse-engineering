package com.google.flatbuffers;

import Yue.C8039;
import Yue.C8080;
import Yue.C8578;
import java.nio.ByteBuffer;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes.dex */
public class FlexBuffers {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ReadBuf EMPTY_BB = new ArrayReadWriteBuf(new byte[]{0}, 1);
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

    public static class Blob extends Sized {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final Blob EMPTY = new Blob(FlexBuffers.EMPTY_BB, 1, 1);

        public Blob(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static Blob empty() {
            return EMPTY;
        }

        public ByteBuffer data() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f4153bb.data());
            byteBufferWrap.position(this.end);
            byteBufferWrap.limit(this.end + size());
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i) {
            return this.f4153bb.get(this.end + i);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = this.f4153bb.get(this.end + i);
            }
            return bArr;
        }

        @Override // com.google.flatbuffers.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.google.flatbuffers.FlexBuffers.Object
        public String toString() {
            return this.f4153bb.getString(this.end, size());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // com.google.flatbuffers.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(C8039.f3212);
            sb.append(this.f4153bb.getString(this.end, size()));
            sb.append(C8039.f3212);
            return sb;
        }
    }

    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    public static class Key extends Object {
        private static final Key EMPTY = new Key(FlexBuffers.EMPTY_BB, 0, 0);

        public Key(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static Key empty() {
            return EMPTY;
        }

        public int compareTo(byte[] bArr) {
            byte b;
            byte b2;
            int i = this.end;
            int i2 = 0;
            do {
                b = this.f4153bb.get(i);
                b2 = bArr[i2];
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
                if (i2 == bArr.length) {
                    int i3 = b - b2;
                    if (i3 != 0 || this.f4153bb.get(i) == 0) {
                        return i3;
                    }
                    return 1;
                }
            } while (b == b2);
            return b - b2;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.end == this.end && key.byteWidth == this.byteWidth;
        }

        public int hashCode() {
            return this.end ^ this.byteWidth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.google.flatbuffers.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // com.google.flatbuffers.FlexBuffers.Object
        public String toString() {
            int i = this.end;
            while (this.f4153bb.get(i) != 0) {
                i++;
            }
            int i2 = this.end;
            return this.f4153bb.getString(i2, i - i2);
        }
    }

    public static class KeyVector {
        private final TypedVector vec;

        public KeyVector(TypedVector typedVector) {
            this.vec = typedVector;
        }

        public Key get(int i) {
            if (i >= size()) {
                return Key.EMPTY;
            }
            TypedVector typedVector = this.vec;
            int i2 = typedVector.end + (i * typedVector.byteWidth);
            TypedVector typedVector2 = this.vec;
            ReadBuf readBuf = typedVector2.f4153bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, i2, typedVector2.byteWidth), 1);
        }

        public int size() {
            return this.vec.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
            for (int i = 0; i < this.vec.size(); i++) {
                this.vec.get(i).toString(sb);
                if (i != this.vec.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static abstract class Object {

        /* JADX INFO: renamed from: bb */
        ReadBuf f4153bb;
        int byteWidth;
        int end;

        public Object(ReadBuf readBuf, int i, int i2) {
            this.f4153bb = readBuf;
            this.end = i;
            this.byteWidth = i2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    public static class Reference {
        private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.EMPTY_BB, 0, 1, 0);

        /* JADX INFO: renamed from: bb */
        private ReadBuf f4154bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Reference(ReadBuf readBuf, int i, int i2, int i3) {
            this(readBuf, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public Blob asBlob() {
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            ReadBuf readBuf = this.f4154bb;
            return new Blob(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public boolean asBoolean() {
            return isBoolean() ? this.f4154bb.get(this.end) != 0 : asUInt() != 0;
        }

        public double asFloat() {
            int i = this.type;
            if (i == 3) {
                return FlexBuffers.readDouble(this.f4154bb, this.end, this.parentWidth);
            }
            if (i == 1) {
                return FlexBuffers.readInt(this.f4154bb, this.end, this.parentWidth);
            }
            if (i != 2) {
                if (i == 5) {
                    return Double.parseDouble(asString());
                }
                if (i == 6) {
                    ReadBuf readBuf = this.f4154bb;
                    return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                }
                if (i == 7) {
                    ReadBuf readBuf2 = this.f4154bb;
                    return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                }
                if (i == 8) {
                    ReadBuf readBuf3 = this.f4154bb;
                    return FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                }
                if (i == 10) {
                    return asVector().size();
                }
                if (i != 26) {
                    return 0.0d;
                }
            }
            return FlexBuffers.readUInt(this.f4154bb, this.end, this.parentWidth);
        }

        public int asInt() {
            int i = this.type;
            if (i == 1) {
                return FlexBuffers.readInt(this.f4154bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                return (int) FlexBuffers.readUInt(this.f4154bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (int) FlexBuffers.readDouble(this.f4154bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                return Integer.parseInt(asString());
            }
            if (i == 6) {
                ReadBuf readBuf = this.f4154bb;
                return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                ReadBuf readBuf2 = this.f4154bb;
                return (int) FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i == 8) {
                ReadBuf readBuf3 = this.f4154bb;
                return (int) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0;
            }
            return FlexBuffers.readInt(this.f4154bb, this.end, this.parentWidth);
        }

        public Key asKey() {
            if (!isKey()) {
                return Key.empty();
            }
            ReadBuf readBuf = this.f4154bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public long asLong() {
            int i = this.type;
            if (i == 1) {
                return FlexBuffers.readLong(this.f4154bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                return FlexBuffers.readUInt(this.f4154bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) FlexBuffers.readDouble(this.f4154bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i == 6) {
                ReadBuf readBuf = this.f4154bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                ReadBuf readBuf2 = this.f4154bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i == 8) {
                ReadBuf readBuf3 = this.f4154bb;
                return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0L;
            }
            return FlexBuffers.readInt(this.f4154bb, this.end, this.parentWidth);
        }

        public Map asMap() {
            if (!isMap()) {
                return Map.empty();
            }
            ReadBuf readBuf = this.f4154bb;
            return new Map(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public String asString() {
            if (isString()) {
                int iIndirect = FlexBuffers.indirect(this.f4154bb, this.end, this.parentWidth);
                ReadBuf readBuf = this.f4154bb;
                int i = this.byteWidth;
                return this.f4154bb.getString(iIndirect, (int) FlexBuffers.readUInt(readBuf, iIndirect - i, i));
            }
            if (!isKey()) {
                return "";
            }
            int iIndirect2 = FlexBuffers.indirect(this.f4154bb, this.end, this.byteWidth);
            int i2 = iIndirect2;
            while (this.f4154bb.get(i2) != 0) {
                i2++;
            }
            return this.f4154bb.getString(iIndirect2, i2 - iIndirect2);
        }

        public long asUInt() {
            int i = this.type;
            if (i == 2) {
                return FlexBuffers.readUInt(this.f4154bb, this.end, this.parentWidth);
            }
            if (i == 1) {
                return FlexBuffers.readLong(this.f4154bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) FlexBuffers.readDouble(this.f4154bb, this.end, this.parentWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i == 26) {
                return FlexBuffers.readInt(this.f4154bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                return Long.parseLong(asString());
            }
            if (i == 6) {
                ReadBuf readBuf = this.f4154bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                ReadBuf readBuf2 = this.f4154bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
            }
            if (i != 8) {
                return 0L;
            }
            ReadBuf readBuf3 = this.f4154bb;
            return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.parentWidth);
        }

        public Vector asVector() {
            if (isVector()) {
                ReadBuf readBuf = this.f4154bb;
                return new Vector(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i = this.type;
            if (i == 15) {
                ReadBuf readBuf2 = this.f4154bb;
                return new TypedVector(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            }
            if (!FlexBuffers.isTypedVector(i)) {
                return Vector.empty();
            }
            ReadBuf readBuf3 = this.f4154bb;
            return new TypedVector(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth, FlexBuffers.toTypedVectorElementType(this.type));
        }

        public int getType() {
            return this.type;
        }

        public boolean isBlob() {
            return this.type == 25;
        }

        public boolean isBoolean() {
            return this.type == 26;
        }

        public boolean isFloat() {
            int i = this.type;
            return i == 3 || i == 8;
        }

        public boolean isInt() {
            int i = this.type;
            return i == 1 || i == 6;
        }

        public boolean isIntOrUInt() {
            return isInt() || isUInt();
        }

        public boolean isKey() {
            return this.type == 4;
        }

        public boolean isMap() {
            return this.type == 9;
        }

        public boolean isNull() {
            return this.type == 0;
        }

        public boolean isNumeric() {
            return isIntOrUInt() || isFloat();
        }

        public boolean isString() {
            return this.type == 5;
        }

        public boolean isTypedVector() {
            return FlexBuffers.isTypedVector(this.type);
        }

        public boolean isUInt() {
            int i = this.type;
            return i == 2 || i == 7;
        }

        public boolean isVector() {
            int i = this.type;
            return i == 10 || i == 9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Reference(ReadBuf readBuf, int i, int i2, int i3, int i4) {
            this.f4154bb = readBuf;
            this.end = i;
            this.parentWidth = i2;
            this.byteWidth = i3;
            this.type = i4;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public StringBuilder toString(StringBuilder sb) {
            int i = this.type;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(asLong());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(asUInt());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(asFloat());
                        return sb;
                    case 4:
                        Key keyAsKey = asKey();
                        sb.append(C8039.f3212);
                        StringBuilder string = keyAsKey.toString(sb);
                        string.append(C8039.f3212);
                        return string;
                    case 5:
                        sb.append(C8039.f3212);
                        sb.append(asString());
                        sb.append(C8039.f3212);
                        return sb;
                    case 9:
                        return asMap().toString(sb);
                    case 10:
                        return asVector().toString(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.type);
                    case 25:
                        return asBlob().toString(sb);
                    case 26:
                        sb.append(asBoolean());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(asVector());
            return sb;
        }
    }

    public static abstract class Sized extends Object {
        protected final int size;

        public Sized(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
            this.size = (int) FlexBuffers.readUInt(this.f4153bb, i - i2, i2);
        }

        public int size() {
            return this.size;
        }
    }

    public static class TypedVector extends Vector {
        private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.EMPTY_BB, 1, 1, 1);
        private final int elemType;

        public TypedVector(ReadBuf readBuf, int i, int i2, int i3) {
            super(readBuf, i, i2);
            this.elemType = i3;
        }

        public static TypedVector empty() {
            return EMPTY_VECTOR;
        }

        @Override // com.google.flatbuffers.FlexBuffers.Vector
        public Reference get(int i) {
            if (i >= size()) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f4153bb, this.end + (i * this.byteWidth), this.byteWidth, 1, this.elemType);
        }

        public int getElemType() {
            return this.elemType;
        }

        public boolean isEmptyVector() {
            return this == EMPTY_VECTOR;
        }
    }

    public static class Unsigned {
        public static int byteToUnsignedInt(byte b) {
            return b & 255;
        }

        public static long intToUnsignedLong(int i) {
            return ((long) i) & C8578.f25466;
        }

        public static int shortToUnsignedInt(short s) {
            return s & C8080.f23970;
        }
    }

    public static class Vector extends Sized {
        private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.EMPTY_BB, 1, 1);

        public Vector(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
        }

        public static Vector empty() {
            return EMPTY_VECTOR;
        }

        public Reference get(int i) {
            long size = size();
            long j = i;
            if (j >= size) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f4153bb, this.end + (i * this.byteWidth), this.byteWidth, Unsigned.byteToUnsignedInt(this.f4153bb.get((int) (((long) this.end) + (size * ((long) this.byteWidth)) + j))));
        }

        public boolean isEmpty() {
            return this == EMPTY_VECTOR;
        }

        @Override // com.google.flatbuffers.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.google.flatbuffers.FlexBuffers.Object
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // com.google.flatbuffers.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i = 0; i < size; i++) {
                get(i).toString(sb);
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new ByteBufferReadWriteBuf(byteBuffer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indirect(ReadBuf readBuf, int i, int i2) {
        return (int) (((long) i) - readUInt(readBuf, i, i2));
    }

    public static boolean isTypeInline(int i) {
        return i <= 3 || i == 26;
    }

    public static boolean isTypedVector(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    public static boolean isTypedVectorElementType(int i) {
        return (i >= 1 && i <= 4) || i == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(ReadBuf readBuf, int i, int i2) {
        if (i2 == 4) {
            return readBuf.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(ReadBuf readBuf, int i, int i2) {
        return (int) readLong(readBuf, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(ReadBuf readBuf, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = readBuf.get(i);
        } else if (i2 == 2) {
            i3 = readBuf.getShort(i);
        } else {
            if (i2 != 4) {
                if (i2 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i);
            }
            i3 = readBuf.getInt(i);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(ReadBuf readBuf, int i, int i2) {
        if (i2 == 1) {
            return Unsigned.byteToUnsignedInt(readBuf.get(i));
        }
        if (i2 == 2) {
            return Unsigned.shortToUnsignedInt(readBuf.getShort(i));
        }
        if (i2 == 4) {
            return Unsigned.intToUnsignedLong(readBuf.getInt(i));
        }
        if (i2 != 8) {
            return -1L;
        }
        return readBuf.getLong(i);
    }

    public static int toTypedVector(int i, int i2) {
        if (i2 == 0) {
            return i + 10;
        }
        if (i2 == 2) {
            return i + 15;
        }
        if (i2 == 3) {
            return i + 18;
        }
        if (i2 != 4) {
            return 0;
        }
        return i + 21;
    }

    public static int toTypedVectorElementType(int i) {
        return i - 10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static Reference getRoot(ReadBuf readBuf) {
        int iLimit = readBuf.limit();
        byte b = readBuf.get(iLimit - 1);
        int i = iLimit - 2;
        return new Reference(readBuf, i - b, b, Unsigned.byteToUnsignedInt(readBuf.get(i)));
    }

    public static class Map extends Vector {
        private static final Map EMPTY_MAP = new Map(FlexBuffers.EMPTY_BB, 1, 1);
        private final byte[] comparisonBuffer;

        public Map(ReadBuf readBuf, int i, int i2) {
            super(readBuf, i, i2);
            this.comparisonBuffer = new byte[4];
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private int binarySearch(CharSequence charSequence) {
            int i = this.size - 1;
            int i2 = this.end;
            int i3 = this.byteWidth;
            int i4 = i2 - (i3 * 3);
            int iIndirect = FlexBuffers.indirect(this.f4153bb, i4, i3);
            ReadBuf readBuf = this.f4153bb;
            int i5 = this.byteWidth;
            int i6 = FlexBuffers.readInt(readBuf, i4 + i5, i5);
            int i7 = 0;
            while (i7 <= i) {
                int i8 = (i7 + i) >>> 1;
                int iCompareCharSequence = compareCharSequence(FlexBuffers.indirect(this.f4153bb, (i8 * i6) + iIndirect, i6), charSequence);
                if (iCompareCharSequence < 0) {
                    i7 = i8 + 1;
                } else {
                    if (iCompareCharSequence <= 0) {
                        return i8;
                    }
                    i = i8 - 1;
                }
            }
            return -(i7 + 1);
        }

        private int compareBytes(ReadBuf readBuf, int i, byte[] bArr) {
            byte b;
            byte b2;
            int i2 = 0;
            do {
                b = readBuf.get(i);
                b2 = bArr[i2];
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
                if (i2 == bArr.length) {
                    int i3 = b - b2;
                    if (i3 != 0 || readBuf.get(i) == 0) {
                        return i3;
                    }
                    return 1;
                }
            } while (b == b2);
            return b - b2;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private int compareCharSequence(int i, CharSequence charSequence) {
            int iLimit = this.f4153bb.limit();
            int length = charSequence.length();
            int i2 = 0;
            while (i2 < length) {
                byte bCharAt = charSequence.charAt(i2);
                if (bCharAt >= 128) {
                    break;
                }
                byte b = this.f4153bb.get(i);
                if (b == 0) {
                    return -bCharAt;
                }
                if (b < 0) {
                    break;
                }
                if (((char) b) != bCharAt) {
                    return b - bCharAt;
                }
                i++;
                i2++;
            }
            while (i < iLimit) {
                int iEncodeUtf8CodePoint = Utf8.encodeUtf8CodePoint(charSequence, i2, this.comparisonBuffer);
                if (iEncodeUtf8CodePoint == 0) {
                    return this.f4153bb.get(i);
                }
                int i3 = 0;
                while (i3 < iEncodeUtf8CodePoint) {
                    int i4 = i + 1;
                    byte b2 = this.f4153bb.get(i);
                    byte b3 = this.comparisonBuffer[i3];
                    if (b2 == 0) {
                        return -b3;
                    }
                    if (b2 != b3) {
                        return b2 - b3;
                    }
                    i3++;
                    i = i4;
                }
                i2 += iEncodeUtf8CodePoint == 4 ? 2 : 1;
            }
            return 0;
        }

        public static Map empty() {
            return EMPTY_MAP;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Reference get(String str) {
            int iBinarySearch = binarySearch(str);
            return (iBinarySearch < 0 || iBinarySearch >= this.size) ? Reference.NULL_REFERENCE : get(iBinarySearch);
        }

        public KeyVector keys() {
            int i = this.end - (this.byteWidth * 3);
            ReadBuf readBuf = this.f4153bb;
            int iIndirect = FlexBuffers.indirect(readBuf, i, this.byteWidth);
            ReadBuf readBuf2 = this.f4153bb;
            int i2 = this.byteWidth;
            return new KeyVector(new TypedVector(readBuf, iIndirect, FlexBuffers.readInt(readBuf2, i + i2, i2), 4));
        }

        @Override // com.google.flatbuffers.FlexBuffers.Vector, com.google.flatbuffers.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("{ ");
            KeyVector keyVectorKeys = keys();
            int size = size();
            Vector vectorValues = values();
            for (int i = 0; i < size; i++) {
                sb.append(C8039.f3212);
                sb.append(keyVectorKeys.get(i).toString());
                sb.append("\" : ");
                sb.append(vectorValues.get(i).toString());
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public Vector values() {
            return new Vector(this.f4153bb, this.end, this.byteWidth);
        }

        public Reference get(byte[] bArr) {
            int iBinarySearch = binarySearch(bArr);
            if (iBinarySearch >= 0 && iBinarySearch < this.size) {
                return get(iBinarySearch);
            }
            return Reference.NULL_REFERENCE;
        }

        private int binarySearch(byte[] bArr) {
            int i = this.size - 1;
            int i2 = this.end;
            int i3 = this.byteWidth;
            int i4 = i2 - (i3 * 3);
            int iIndirect = FlexBuffers.indirect(this.f4153bb, i4, i3);
            ReadBuf readBuf = this.f4153bb;
            int i5 = this.byteWidth;
            int i6 = FlexBuffers.readInt(readBuf, i4 + i5, i5);
            int i7 = 0;
            while (i7 <= i) {
                int i8 = (i7 + i) >>> 1;
                int iCompareBytes = compareBytes(this.f4153bb, FlexBuffers.indirect(this.f4153bb, (i8 * i6) + iIndirect, i6), bArr);
                if (iCompareBytes < 0) {
                    i7 = i8 + 1;
                } else {
                    if (iCompareBytes <= 0) {
                        return i8;
                    }
                    i = i8 - 1;
                }
            }
            return -(i7 + 1);
        }
    }
}
