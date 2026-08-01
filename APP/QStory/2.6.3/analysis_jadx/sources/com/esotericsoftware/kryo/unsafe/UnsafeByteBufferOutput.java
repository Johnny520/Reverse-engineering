package com.esotericsoftware.kryo.unsafe;

import com.esotericsoftware.kryo.io.ByteBufferOutput;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class UnsafeByteBufferOutput extends ByteBufferOutput {
    private long bufferAddress;

    public UnsafeByteBufferOutput(long j, int i) {
        super(UnsafeUtil.newDirectBuffer(j, i));
        updateBufferAddress();
    }

    private void setBufferPosition(Buffer buffer, int i) {
        buffer.position(i);
    }

    private void updateBufferAddress() {
        this.bufferAddress = this.byteBuffer.address();
    }

    public void dispose() {
        UnsafeUtil.dispose(this.byteBuffer);
        this.byteBuffer = null;
        this.bufferAddress = 0L;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public boolean require(int i) {
        ByteBuffer byteBuffer = this.byteBuffer;
        boolean zRequire = super.require(i);
        if (this.byteBuffer != byteBuffer) {
            UnsafeUtil.dispose(byteBuffer);
            updateBufferAddress();
        }
        return zRequire;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput
    public void setBuffer(ByteBuffer byteBuffer, int i) {
        C5925.m11310("buffer must be direct.");
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output, java.io.OutputStream
    public void write(int i) {
        if (this.position == this.capacity) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j = this.bufferAddress;
        int i2 = this.position;
        this.position = i2 + 1;
        unsafe.putByte(j + ((long) i2), (byte) i);
        setBufferPosition(this.byteBuffer, this.position);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeBoolean(boolean z) {
        if (this.position == this.capacity) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j = this.bufferAddress;
        int i = this.position;
        this.position = i + 1;
        unsafe.putByte(j + ((long) i), z ? (byte) 1 : (byte) 0);
        setBufferPosition(this.byteBuffer, this.position);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeBooleans(boolean[] zArr, int i, int i2) {
        writeBytes(zArr, UnsafeUtil.booleanArrayBaseOffset, zArr.length);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeByte(int i) {
        if (this.position == this.capacity) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j = this.bufferAddress;
        int i2 = this.position;
        this.position = i2 + 1;
        unsafe.putByte(j + ((long) i2), (byte) i);
        setBufferPosition(this.byteBuffer, this.position);
    }

    public void writeBytes(Object obj, long j, int i) {
        int iMin = Math.min(this.capacity - this.position, i);
        long j2 = j;
        while (true) {
            long j3 = iMin;
            Object obj2 = obj;
            UnsafeUtil.unsafe.copyMemory(obj2, j2, (Object) null, this.bufferAddress + ((long) this.position), j3);
            int i2 = this.position + iMin;
            this.position = i2;
            i -= iMin;
            if (i == 0) {
                setBufferPosition(this.byteBuffer, i2);
                return;
            }
            j2 += j3;
            iMin = Math.min(this.capacity, i);
            require(iMin);
            obj = obj2;
        }
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeChar(char c) {
        require(2);
        UnsafeUtil.unsafe.putChar(this.bufferAddress + ((long) this.position), c);
        int i = this.position + 2;
        this.position = i;
        setBufferPosition(this.byteBuffer, i);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeChars(char[] cArr, int i, int i2) {
        writeBytes(cArr, UnsafeUtil.charArrayBaseOffset, cArr.length << 1);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeDouble(double d) {
        require(8);
        UnsafeUtil.unsafe.putDouble(this.bufferAddress + ((long) this.position), d);
        int i = this.position + 8;
        this.position = i;
        setBufferPosition(this.byteBuffer, i);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeDoubles(double[] dArr, int i, int i2) {
        writeBytes(dArr, UnsafeUtil.doubleArrayBaseOffset, dArr.length << 3);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeFloat(float f) {
        require(4);
        UnsafeUtil.unsafe.putFloat(this.bufferAddress + ((long) this.position), f);
        int i = this.position + 4;
        this.position = i;
        setBufferPosition(this.byteBuffer, i);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeFloats(float[] fArr, int i, int i2) {
        writeBytes(fArr, UnsafeUtil.floatArrayBaseOffset, fArr.length << 2);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeInt(int i) {
        require(4);
        UnsafeUtil.unsafe.putInt(this.bufferAddress + ((long) this.position), i);
        int i2 = this.position + 4;
        this.position = i2;
        setBufferPosition(this.byteBuffer, i2);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeInts(int[] iArr, int i, int i2) {
        writeBytes(iArr, UnsafeUtil.intArrayBaseOffset, iArr.length << 2);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeLong(long j) {
        require(8);
        UnsafeUtil.unsafe.putLong(this.bufferAddress + ((long) this.position), j);
        int i = this.position + 8;
        this.position = i;
        setBufferPosition(this.byteBuffer, i);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeLongs(long[] jArr, int i, int i2) {
        writeBytes(jArr, UnsafeUtil.longArrayBaseOffset, jArr.length << 3);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeShort(int i) {
        require(2);
        UnsafeUtil.unsafe.putShort(this.bufferAddress + ((long) this.position), (short) i);
        int i2 = this.position + 2;
        this.position = i2;
        setBufferPosition(this.byteBuffer, i2);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeShorts(short[] sArr, int i, int i2) {
        writeBytes(sArr, UnsafeUtil.shortArrayBaseOffset, sArr.length << 1);
    }

    public UnsafeByteBufferOutput(int i) {
        super(i);
        updateBufferAddress();
    }

    public UnsafeByteBufferOutput(int i, int i2) {
        super(i, i2);
        updateBufferAddress();
    }

    public UnsafeByteBufferOutput(OutputStream outputStream) {
        super(outputStream);
        updateBufferAddress();
    }

    public UnsafeByteBufferOutput(OutputStream outputStream, int i) {
        super(outputStream, i);
        updateBufferAddress();
    }

    public UnsafeByteBufferOutput() {
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeByte(byte b) {
        if (this.position == this.capacity) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j = this.bufferAddress;
        int i = this.position;
        this.position = i + 1;
        unsafe.putByte(j + ((long) i), b);
        setBufferPosition(this.byteBuffer, this.position);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeBytes(byte[] bArr, int i, int i2) {
        writeBytes(bArr, UnsafeUtil.byteArrayBaseOffset + ((long) i), i2);
    }
}
