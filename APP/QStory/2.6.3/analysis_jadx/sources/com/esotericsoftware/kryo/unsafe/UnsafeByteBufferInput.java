package com.esotericsoftware.kryo.unsafe;

import com.esotericsoftware.kryo.io.ByteBufferInput;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class UnsafeByteBufferInput extends ByteBufferInput {
    private long bufferAddress;

    public UnsafeByteBufferInput(long j, int i) {
        super(UnsafeUtil.newDirectBuffer(j, i));
        updateBufferAddress();
    }

    private void setBufferPosition(Buffer buffer, int i) {
        buffer.position(i);
    }

    private void updateBufferAddress() {
        this.bufferAddress = this.byteBuffer.address();
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read() {
        if (optional(1) <= 0) {
            return -1;
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j = this.bufferAddress;
        int i = this.position;
        this.position = i + 1;
        int i2 = unsafe.getByte(j + ((long) i)) & DefaultClassResolver.NAME;
        setBufferPosition(this.byteBuffer, this.position);
        return i2;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public boolean readBoolean() {
        if (this.position == this.limit) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j = this.bufferAddress;
        int i = this.position;
        this.position = i + 1;
        boolean z = unsafe.getByte(j + ((long) i)) != 0;
        setBufferPosition(this.byteBuffer, this.position);
        return z;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public boolean[] readBooleans(int i) {
        boolean[] zArr = new boolean[i];
        readBytes(zArr, UnsafeUtil.booleanArrayBaseOffset, i);
        return zArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public byte readByte() {
        if (this.position == this.limit) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j = this.bufferAddress;
        int i = this.position;
        this.position = i + 1;
        byte b = unsafe.getByte(j + ((long) i));
        setBufferPosition(this.byteBuffer, this.position);
        return b;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public int readByteUnsigned() {
        if (this.position == this.limit) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j = this.bufferAddress;
        int i = this.position;
        this.position = i + 1;
        int i2 = unsafe.getByte(j + ((long) i)) & DefaultClassResolver.NAME;
        setBufferPosition(this.byteBuffer, this.position);
        return i2;
    }

    public void readBytes(Object obj, long j, int i) {
        int iMin = Math.min(this.limit - this.position, i);
        long j2 = j;
        while (true) {
            long j3 = iMin;
            Object obj2 = obj;
            UnsafeUtil.unsafe.copyMemory((Object) null, this.bufferAddress + ((long) this.position), obj2, j2, j3);
            int i2 = this.position + iMin;
            this.position = i2;
            i -= iMin;
            if (i == 0) {
                setBufferPosition(this.byteBuffer, i2);
                return;
            }
            j2 += j3;
            iMin = Math.min(i, this.capacity);
            require(iMin);
            obj = obj2;
        }
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public char readChar() {
        require(2);
        char c = UnsafeUtil.unsafe.getChar(this.bufferAddress + ((long) this.position));
        int i = this.position + 2;
        this.position = i;
        setBufferPosition(this.byteBuffer, i);
        return c;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public char[] readChars(int i) {
        char[] cArr = new char[i];
        readBytes(cArr, UnsafeUtil.charArrayBaseOffset, i << 1);
        return cArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public double readDouble() {
        require(8);
        double d = UnsafeUtil.unsafe.getDouble(this.bufferAddress + ((long) this.position));
        int i = this.position + 8;
        this.position = i;
        setBufferPosition(this.byteBuffer, i);
        return d;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public double[] readDoubles(int i) {
        double[] dArr = new double[i];
        readBytes(dArr, UnsafeUtil.doubleArrayBaseOffset, i << 3);
        return dArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public float readFloat() {
        require(4);
        float f = UnsafeUtil.unsafe.getFloat(this.bufferAddress + ((long) this.position));
        int i = this.position + 4;
        this.position = i;
        setBufferPosition(this.byteBuffer, i);
        return f;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public float[] readFloats(int i) {
        float[] fArr = new float[i];
        readBytes(fArr, UnsafeUtil.floatArrayBaseOffset, i << 2);
        return fArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public int readInt() {
        require(4);
        int i = UnsafeUtil.unsafe.getInt(this.bufferAddress + ((long) this.position));
        int i2 = this.position + 4;
        this.position = i2;
        setBufferPosition(this.byteBuffer, i2);
        return i;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public int[] readInts(int i) {
        int[] iArr = new int[i];
        readBytes(iArr, UnsafeUtil.intArrayBaseOffset, i << 2);
        return iArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public long readLong() {
        require(8);
        long j = UnsafeUtil.unsafe.getLong(this.bufferAddress + ((long) this.position));
        int i = this.position + 8;
        this.position = i;
        setBufferPosition(this.byteBuffer, i);
        return j;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public long[] readLongs(int i) {
        long[] jArr = new long[i];
        readBytes(jArr, UnsafeUtil.longArrayBaseOffset, i << 3);
        return jArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public short readShort() {
        require(2);
        short s = UnsafeUtil.unsafe.getShort(this.bufferAddress + ((long) this.position));
        int i = this.position + 2;
        this.position = i;
        setBufferPosition(this.byteBuffer, i);
        return s;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public short[] readShorts(int i) {
        short[] sArr = new short[i];
        readBytes(sArr, UnsafeUtil.shortArrayBaseOffset, i << 1);
        return sArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput
    public void setBuffer(ByteBuffer byteBuffer) {
        C5925.m11310("buffer must be direct.");
    }

    public UnsafeByteBufferInput(int i) {
        super(i);
        updateBufferAddress();
    }

    public UnsafeByteBufferInput(byte[] bArr) {
        super(bArr);
        updateBufferAddress();
    }

    public UnsafeByteBufferInput(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
        updateBufferAddress();
    }

    public UnsafeByteBufferInput(ByteBuffer byteBuffer) {
        super(byteBuffer);
        updateBufferAddress();
    }

    public UnsafeByteBufferInput() {
    }

    public UnsafeByteBufferInput(InputStream inputStream) {
        super(inputStream);
        updateBufferAddress();
    }

    public UnsafeByteBufferInput(InputStream inputStream, int i) {
        super(inputStream, i);
        updateBufferAddress();
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public void readBytes(byte[] bArr, int i, int i2) {
        readBytes(bArr, UnsafeUtil.byteArrayBaseOffset + ((long) i), i2);
    }
}
