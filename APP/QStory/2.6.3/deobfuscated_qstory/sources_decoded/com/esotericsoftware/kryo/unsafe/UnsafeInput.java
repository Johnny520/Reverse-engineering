package com.esotericsoftware.kryo.unsafe;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.InputStream;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class UnsafeInput extends Input {
    public UnsafeInput() {
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read() {
        if (optional(1) <= 0) {
            return -1;
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        byte[] bArr = this.buffer;
        long j = UnsafeUtil.byteArrayBaseOffset;
        int i = this.position;
        this.position = i + 1;
        return unsafe.getByte(bArr, j + ((long) i)) & DefaultClassResolver.NAME;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean readBoolean() {
        if (this.position == this.limit) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        byte[] bArr = this.buffer;
        long j = UnsafeUtil.byteArrayBaseOffset;
        int i = this.position;
        this.position = i + 1;
        return unsafe.getByte(bArr, j + ((long) i)) != 0;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean[] readBooleans(int i) {
        boolean[] zArr = new boolean[i];
        readBytes(zArr, UnsafeUtil.booleanArrayBaseOffset, i);
        return zArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public byte readByte() {
        if (this.position == this.limit) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        byte[] bArr = this.buffer;
        long j = UnsafeUtil.byteArrayBaseOffset;
        int i = this.position;
        this.position = i + 1;
        return unsafe.getByte(bArr, j + ((long) i));
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readByteUnsigned() {
        if (this.position == this.limit) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        byte[] bArr = this.buffer;
        long j = UnsafeUtil.byteArrayBaseOffset;
        int i = this.position;
        this.position = i + 1;
        return unsafe.getByte(bArr, j + ((long) i)) & DefaultClassResolver.NAME;
    }

    public void readBytes(Object obj, long j, int i) {
        int iMin = Math.min(this.limit - this.position, i);
        long j2 = j;
        while (true) {
            long j3 = iMin;
            Object obj2 = obj;
            UnsafeUtil.unsafe.copyMemory(this.buffer, ((long) this.position) + UnsafeUtil.byteArrayBaseOffset, obj2, j2, j3);
            this.position += iMin;
            i -= iMin;
            if (i == 0) {
                return;
            }
            j2 += j3;
            iMin = Math.min(i, this.capacity);
            require(iMin);
            obj = obj2;
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public char readChar() {
        require(2);
        char c = UnsafeUtil.unsafe.getChar(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 2;
        return c;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public char[] readChars(int i) {
        char[] cArr = new char[i];
        readBytes(cArr, UnsafeUtil.charArrayBaseOffset, i << 1);
        return cArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public double readDouble() {
        require(8);
        double d = UnsafeUtil.unsafe.getDouble(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 8;
        return d;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public double[] readDoubles(int i) {
        double[] dArr = new double[i];
        readBytes(dArr, UnsafeUtil.doubleArrayBaseOffset, i << 3);
        return dArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public float readFloat() {
        require(4);
        float f = UnsafeUtil.unsafe.getFloat(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 4;
        return f;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public float[] readFloats(int i) {
        float[] fArr = new float[i];
        readBytes(fArr, UnsafeUtil.floatArrayBaseOffset, i << 2);
        return fArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readInt() {
        require(4);
        int i = UnsafeUtil.unsafe.getInt(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 4;
        return i;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int[] readInts(int i) {
        int[] iArr = new int[i];
        readBytes(iArr, UnsafeUtil.intArrayBaseOffset, i << 2);
        return iArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long readLong() {
        require(8);
        long j = UnsafeUtil.unsafe.getLong(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 8;
        return j;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long[] readLongs(int i) {
        long[] jArr = new long[i];
        readBytes(jArr, UnsafeUtil.longArrayBaseOffset, i << 3);
        return jArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public short readShort() {
        require(2);
        short s = UnsafeUtil.unsafe.getShort(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 2;
        return s;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public short[] readShorts(int i) {
        short[] sArr = new short[i];
        readBytes(sArr, UnsafeUtil.shortArrayBaseOffset, i << 1);
        return sArr;
    }

    public UnsafeInput(int i) {
        super(i);
    }

    public UnsafeInput(byte[] bArr) {
        super(bArr);
    }

    public UnsafeInput(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public UnsafeInput(InputStream inputStream) {
        super(inputStream);
    }

    public UnsafeInput(InputStream inputStream, int i) {
        super(inputStream, i);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void readBytes(byte[] bArr, int i, int i2) {
        readBytes(bArr, UnsafeUtil.byteArrayBaseOffset + ((long) i), i2);
    }
}
