package com.google.flatbuffers.reflection;

import Yue.C8080;
import Yue.C8578;
import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class Type extends Table {

    public static final class Vector extends BaseVector {
        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Type get(int i) {
            return get(new Type(), i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Type get(Type type, int i) {
            return type.__assign(Table.__indirect(__element(i), this.f4151bb), this.f4151bb);
        }
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static void addBaseSize(FlatBufferBuilder flatBufferBuilder, long j) {
        flatBufferBuilder.addInt(4, (int) j, 4);
    }

    public static void addBaseType(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(0, b, 0);
    }

    public static void addElement(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(1, b, 0);
    }

    public static void addElementSize(FlatBufferBuilder flatBufferBuilder, long j) {
        flatBufferBuilder.addInt(5, (int) j, 0);
    }

    public static void addFixedLength(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addShort(3, (short) i, 0);
    }

    public static void addIndex(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(2, i, -1);
    }

    public static int createType(FlatBufferBuilder flatBufferBuilder, byte b, byte b2, int i, int i2, long j, long j2) {
        flatBufferBuilder.startTable(6);
        addElementSize(flatBufferBuilder, j2);
        addBaseSize(flatBufferBuilder, j);
        addIndex(flatBufferBuilder, i);
        addFixedLength(flatBufferBuilder, i2);
        addElement(flatBufferBuilder, b2);
        addBaseType(flatBufferBuilder, b);
        return endType(flatBufferBuilder);
    }

    public static int endType(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type getRootAsType(ByteBuffer byteBuffer) {
        return getRootAsType(byteBuffer, new Type());
    }

    public static void startType(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(6);
    }

    public Type __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public long baseSize() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return ((long) this.f4157bb.getInt(i__offset + this.bb_pos)) & C8578.f25466;
        }
        return 4L;
    }

    public byte baseType() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f4157bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public byte element() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f4157bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public long elementSize() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return ((long) this.f4157bb.getInt(i__offset + this.bb_pos)) & C8578.f25466;
        }
        return 0L;
    }

    public int fixedLength() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f4157bb.getShort(i__offset + this.bb_pos) & C8080.f23970;
        }
        return 0;
    }

    public int index() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f4157bb.getInt(i__offset + this.bb_pos);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static Type getRootAsType(ByteBuffer byteBuffer, Type type) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return type.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }
}
