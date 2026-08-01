package com.esotericsoftware.kryo.io;

import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.Util;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ByteBufferOutput extends Output {
    private static final ByteOrder nativeOrder = ByteOrder.nativeOrder();
    protected ByteBuffer byteBuffer;

    public ByteBufferOutput(int i, int i2) {
        if (i2 < -1) {
            C5919.m11249(AbstractC6136.m11556(i2, "maxBufferSize cannot be < -1: "));
            throw null;
        }
        this.capacity = i;
        this.maxCapacity = i2 == -1 ? Util.maxArraySize : i2;
        this.byteBuffer = ByteBuffer.allocateDirect(i);
    }

    private int getBufferPosition(Buffer buffer) {
        return buffer.position();
    }

    private void setBufferLimit(Buffer buffer, int i) {
        buffer.limit(i);
    }

    private void setBufferPosition(Buffer buffer, int i) {
        buffer.position(i);
    }

    private void writeAscii_slow(String str, int i) {
        ByteBuffer byteBuffer = this.byteBuffer;
        int iMin = Math.min(i, this.capacity - this.position);
        int i2 = 0;
        while (i2 < i) {
            byte[] bArr = new byte[i];
            int i3 = i2 + iMin;
            str.getBytes(i2, i3, bArr, 0);
            byteBuffer.put(bArr, 0, iMin);
            this.position += iMin;
            iMin = Math.min(i - i3, this.capacity);
            if (require(iMin)) {
                byteBuffer = this.byteBuffer;
            }
            i2 = i3;
        }
    }

    private void writeUtf8_slow(String str, int i, int i2) {
        while (i2 < i) {
            int i3 = this.position;
            int i4 = this.capacity;
            if (i3 == i4) {
                require(Math.min(i4, i - i2));
            }
            this.position++;
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 127) {
                this.byteBuffer.put((byte) cCharAt);
            } else {
                ByteBuffer byteBuffer = this.byteBuffer;
                if (cCharAt > 2047) {
                    byteBuffer.put((byte) (((cCharAt >> '\f') & 15) | Opcodes.SHL_INT_LIT8));
                    require(2);
                    this.position += 2;
                    this.byteBuffer.put((byte) (((cCharAt >> 6) & 63) | 128));
                    this.byteBuffer.put((byte) ((cCharAt & '?') | 128));
                } else {
                    byteBuffer.put((byte) (((cCharAt >> 6) & 31) | 192));
                    if (this.position == this.capacity) {
                        require(1);
                    }
                    this.position++;
                    this.byteBuffer.put((byte) ((cCharAt & '?') | 128));
                }
            }
            i2++;
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flush();
        OutputStream outputStream = this.outputStream;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (this.outputStream == null) {
            return;
        }
        try {
            byte[] bArr = new byte[this.position];
            setBufferPosition(this.byteBuffer, 0);
            this.byteBuffer.get(bArr);
            setBufferPosition(this.byteBuffer, 0);
            this.outputStream.write(bArr, 0, this.position);
            this.total += (long) this.position;
            this.position = 0;
        } catch (IOException e) {
            throw new KryoException(e);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public byte[] getBuffer() {
        throw new UnsupportedOperationException("This buffer does not used a byte[], see #getByteBuffer().");
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public boolean require(int i) {
        int iMin;
        if (this.capacity - this.position >= i) {
            return false;
        }
        flush();
        int i2 = this.capacity;
        int i3 = this.position;
        if (i2 - i3 >= i) {
            return true;
        }
        int i4 = this.maxCapacity;
        if (i > i4 - i3) {
            int i5 = this.maxCapacity;
            if (i > i4) {
                throw new KryoBufferOverflowException(AbstractC6136.m11559(i5, i, "Buffer overflow. Max capacity: ", ", required: "));
            }
            throw new KryoBufferOverflowException("Buffer overflow. Available: " + (i5 - this.position) + ", required: " + i);
        }
        if (i2 == 0) {
            this.capacity = 16;
        }
        do {
            iMin = Math.min(this.capacity * 2, this.maxCapacity);
            this.capacity = iMin;
        } while (iMin - this.position < i);
        boolean zIsDirect = this.byteBuffer.isDirect();
        int i6 = this.capacity;
        ByteBuffer byteBufferAllocate = !zIsDirect ? ByteBuffer.allocate(i6) : ByteBuffer.allocateDirect(i6);
        setBufferPosition(this.byteBuffer, 0);
        setBufferLimit(this.byteBuffer, this.position);
        byteBufferAllocate.put(this.byteBuffer);
        byteBufferAllocate.order(this.byteBuffer.order());
        this.byteBuffer = byteBufferAllocate;
        return true;
    }

    @Override // com.esotericsoftware.kryo.io.Output, com.esotericsoftware.kryo.util.Pool.Poolable
    public void reset() {
        super.reset();
        setBufferPosition(this.byteBuffer, 0);
    }

    public void setBuffer(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            C5919.m11249("buffer cannot be null.");
            return;
        }
        if (i < -1) {
            C5919.m11249(AbstractC6136.m11556(i, "maxBufferSize cannot be < -1: "));
            return;
        }
        this.byteBuffer = byteBuffer;
        if (i == -1) {
            i = Util.maxArraySize;
        }
        this.maxCapacity = i;
        this.capacity = byteBuffer.capacity();
        this.position = byteBuffer.position();
        this.total = 0L;
        this.outputStream = null;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void setPosition(int i) {
        this.position = i;
        setBufferPosition(this.byteBuffer, i);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public byte[] toBytes() {
        byte[] bArr = new byte[this.position];
        setBufferPosition(this.byteBuffer, 0);
        this.byteBuffer.get(bArr, 0, this.position);
        return bArr;
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream
    public void write(int i) {
        if (this.position == this.capacity) {
            require(1);
        }
        this.byteBuffer.put((byte) i);
        this.position++;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeAscii(String str) {
        if (str == null) {
            writeByte(128);
            return;
        }
        int length = str.length();
        if (length == 0) {
            writeByte(129);
            return;
        }
        if (length == 1) {
            require(2);
            this.byteBuffer.put((byte) -126);
            this.byteBuffer.put((byte) str.charAt(0));
            this.position += 2;
            return;
        }
        if (this.capacity - this.position < length) {
            writeAscii_slow(str, length);
        } else {
            ByteBuffer byteBuffer = this.byteBuffer;
            int length2 = str.length();
            for (int i = 0; i < length2; i++) {
                byteBuffer.put((byte) str.charAt(i));
            }
            this.position += length;
        }
        ByteBuffer byteBuffer2 = this.byteBuffer;
        int i2 = this.position;
        byteBuffer2.put(i2 - 1, (byte) (byteBuffer2.get(i2 - 1) | 128));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBoolean(boolean z) {
        if (this.position == this.capacity) {
            require(1);
        }
        this.byteBuffer.put(z ? (byte) 1 : (byte) 0);
        this.position++;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBooleans(boolean[] zArr, int i, int i2) {
        if (this.capacity < i2) {
            int i3 = i2 + i;
            while (i < i3) {
                writeBoolean(zArr[i]);
                i++;
            }
            return;
        }
        require(i2);
        int i4 = i2 + i;
        while (true) {
            ByteBuffer byteBuffer = this.byteBuffer;
            if (i >= i4) {
                this.position = getBufferPosition(byteBuffer);
                return;
            } else {
                byteBuffer.put(zArr[i] ? (byte) 1 : (byte) 0);
                i++;
            }
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeByte(int i) {
        if (this.position == this.capacity) {
            require(1);
        }
        this.byteBuffer.put((byte) i);
        this.position++;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBytes(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            C5919.m11249("bytes cannot be null.");
            return;
        }
        int iMin = Math.min(this.capacity - this.position, i2);
        while (true) {
            this.byteBuffer.put(bArr, i, iMin);
            this.position += iMin;
            i2 -= iMin;
            if (i2 == 0) {
                return;
            }
            i += iMin;
            iMin = Math.min(this.capacity, i2);
            require(iMin);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeChar(char c) {
        require(2);
        this.position += 2;
        this.byteBuffer.put((byte) c);
        this.byteBuffer.put((byte) (c >>> '\b'));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeChars(char[] cArr, int i, int i2) {
        int i3 = i2 << 1;
        if (this.capacity < i3) {
            int i4 = i2 + i;
            while (i < i4) {
                writeChar(cArr[i]);
                i++;
            }
            return;
        }
        require(i3);
        int i5 = i2 + i;
        while (i < i5) {
            char c = cArr[i];
            this.byteBuffer.put((byte) c);
            this.byteBuffer.put((byte) (c >>> '\b'));
            i++;
        }
        this.position = getBufferPosition(this.byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeDouble(double d) {
        require(8);
        this.position += 8;
        ByteBuffer byteBuffer = this.byteBuffer;
        byteBuffer.put((byte) Double.doubleToLongBits(d));
        byteBuffer.put((byte) (r3 >>> 8));
        byteBuffer.put((byte) (r3 >>> 16));
        byteBuffer.put((byte) (r3 >>> 24));
        byteBuffer.put((byte) (r3 >>> 32));
        byteBuffer.put((byte) (r3 >>> 40));
        byteBuffer.put((byte) (r3 >>> 48));
        byteBuffer.put((byte) (r3 >>> 56));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeDoubles(double[] dArr, int i, int i2) {
        int i3 = i2 << 3;
        if (this.capacity < i3) {
            int i4 = i2 + i;
            while (i < i4) {
                writeDouble(dArr[i]);
                i++;
            }
            return;
        }
        require(i3);
        ByteBuffer byteBuffer = this.byteBuffer;
        int i5 = i2 + i;
        while (i < i5) {
            byteBuffer.put((byte) Double.doubleToLongBits(dArr[i]));
            byteBuffer.put((byte) (r1 >>> 8));
            byteBuffer.put((byte) (r1 >>> 16));
            byteBuffer.put((byte) (r1 >>> 24));
            byteBuffer.put((byte) (r1 >>> 32));
            byteBuffer.put((byte) (r1 >>> 40));
            byteBuffer.put((byte) (r1 >>> 48));
            byteBuffer.put((byte) (r1 >>> 56));
            i++;
        }
        this.position = getBufferPosition(byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeFloat(float f) {
        require(4);
        ByteBuffer byteBuffer = this.byteBuffer;
        this.position += 4;
        int iFloatToIntBits = Float.floatToIntBits(f);
        byteBuffer.put((byte) iFloatToIntBits);
        byteBuffer.put((byte) (iFloatToIntBits >> 8));
        byteBuffer.put((byte) (iFloatToIntBits >> 16));
        byteBuffer.put((byte) (iFloatToIntBits >> 24));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeFloats(float[] fArr, int i, int i2) {
        int i3 = i2 << 2;
        if (this.capacity < i3) {
            int i4 = i2 + i;
            while (i < i4) {
                writeFloat(fArr[i]);
                i++;
            }
            return;
        }
        require(i3);
        ByteBuffer byteBuffer = this.byteBuffer;
        int i5 = i2 + i;
        while (i < i5) {
            int iFloatToIntBits = Float.floatToIntBits(fArr[i]);
            byteBuffer.put((byte) iFloatToIntBits);
            byteBuffer.put((byte) (iFloatToIntBits >> 8));
            byteBuffer.put((byte) (iFloatToIntBits >> 16));
            byteBuffer.put((byte) (iFloatToIntBits >> 24));
            i++;
        }
        this.position = getBufferPosition(byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeInt(int i, int i2) {
        if (i2 < 0 || i2 > 4) {
            C5919.m11249(AbstractC6136.m11556(i2, "count must be >= 0 and <= 4: "));
            return;
        }
        require(i2);
        this.position += i2;
        ByteBuffer byteBuffer = this.byteBuffer;
        if (i2 == 1) {
            byteBuffer.put((byte) i);
            return;
        }
        if (i2 == 2) {
            byteBuffer.put((byte) (i >> 8));
            byteBuffer.put((byte) i);
            return;
        }
        if (i2 == 3) {
            byteBuffer.put((byte) (i >> 16));
            byteBuffer.put((byte) (i >> 8));
            byteBuffer.put((byte) i);
        } else {
            if (i2 != 4) {
                return;
            }
            byteBuffer.put((byte) (i >> 24));
            byteBuffer.put((byte) (i >> 16));
            byteBuffer.put((byte) (i >> 8));
            byteBuffer.put((byte) i);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeInts(int[] iArr, int i, int i2) {
        int i3 = i2 << 2;
        if (this.capacity < i3) {
            int i4 = i2 + i;
            while (i < i4) {
                writeInt(iArr[i]);
                i++;
            }
            return;
        }
        require(i3);
        ByteBuffer byteBuffer = this.byteBuffer;
        int i5 = i2 + i;
        while (i < i5) {
            int i6 = iArr[i];
            byteBuffer.put((byte) i6);
            byteBuffer.put((byte) (i6 >> 8));
            byteBuffer.put((byte) (i6 >> 16));
            byteBuffer.put((byte) (i6 >> 24));
            i++;
        }
        this.position = getBufferPosition(byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeLong(long j) {
        require(8);
        this.position += 8;
        ByteBuffer byteBuffer = this.byteBuffer;
        byteBuffer.put((byte) j);
        byteBuffer.put((byte) (j >>> 8));
        byteBuffer.put((byte) (j >>> 16));
        byteBuffer.put((byte) (j >>> 24));
        byteBuffer.put((byte) (j >>> 32));
        byteBuffer.put((byte) (j >>> 40));
        byteBuffer.put((byte) (j >>> 48));
        byteBuffer.put((byte) (j >>> 56));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeLongs(long[] jArr, int i, int i2) {
        int i3 = i2 << 3;
        if (this.capacity < i3) {
            int i4 = i2 + i;
            while (i < i4) {
                writeLong(jArr[i]);
                i++;
            }
            return;
        }
        require(i3);
        ByteBuffer byteBuffer = this.byteBuffer;
        int i5 = i2 + i;
        while (i < i5) {
            byteBuffer.put((byte) jArr[i]);
            byteBuffer.put((byte) (r1 >>> 8));
            byteBuffer.put((byte) (r1 >>> 16));
            byteBuffer.put((byte) (r1 >>> 24));
            byteBuffer.put((byte) (r1 >>> 32));
            byteBuffer.put((byte) (r1 >>> 40));
            byteBuffer.put((byte) (r1 >>> 48));
            byteBuffer.put((byte) (r1 >>> 56));
            i++;
        }
        this.position = getBufferPosition(byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeShort(int i) {
        require(2);
        this.position += 2;
        this.byteBuffer.put((byte) i);
        this.byteBuffer.put((byte) (i >>> 8));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeShorts(short[] sArr, int i, int i2) {
        int i3 = i2 << 1;
        if (this.capacity < i3) {
            int i4 = i2 + i;
            while (i < i4) {
                writeShort(sArr[i]);
                i++;
            }
            return;
        }
        require(i3);
        int i5 = i2 + i;
        while (i < i5) {
            short s = sArr[i];
            this.byteBuffer.put((byte) s);
            this.byteBuffer.put((byte) (s >>> 8));
            i++;
        }
        this.position = getBufferPosition(this.byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeString(String str) {
        if (str == null) {
            writeByte(128);
            return;
        }
        int length = str.length();
        if (length == 0) {
            writeByte(129);
            return;
        }
        int i = 0;
        if (length > 1 && length <= 32) {
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) <= 127) {
                }
            }
            if (this.capacity - this.position < length) {
                writeAscii_slow(str, length);
            } else {
                int length2 = str.length();
                while (i < length2) {
                    this.byteBuffer.put((byte) str.charAt(i));
                    i++;
                }
                this.position += length;
            }
            ByteBuffer byteBuffer = this.byteBuffer;
            int i3 = this.position;
            byteBuffer.put(i3 - 1, (byte) (byteBuffer.get(i3 - 1) | 128));
            return;
        }
        writeVarIntFlag(true, length + 1, true);
        if (this.capacity - this.position >= length) {
            ByteBuffer byteBuffer2 = this.byteBuffer;
            do {
                char cCharAt = str.charAt(i);
                if (cCharAt > 127) {
                    this.position = getBufferPosition(byteBuffer2);
                } else {
                    byteBuffer2.put((byte) cCharAt);
                    i++;
                }
            } while (i != length);
            this.position = getBufferPosition(byteBuffer2);
            return;
        }
        if (i < length) {
            writeUtf8_slow(str, length, i);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeVarInt(int i, boolean z) {
        if (!z) {
            i = (i >> 31) ^ (i << 1);
        }
        int i2 = i >>> 7;
        if (i2 == 0) {
            if (this.position == this.capacity) {
                require(1);
            }
            this.position++;
            this.byteBuffer.put((byte) i);
            return 1;
        }
        int i3 = i >>> 14;
        if (i3 == 0) {
            require(2);
            this.position += 2;
            this.byteBuffer.put((byte) ((i & 127) | 128));
            this.byteBuffer.put((byte) i2);
            return 2;
        }
        int i4 = i >>> 21;
        if (i4 == 0) {
            require(3);
            this.position += 3;
            ByteBuffer byteBuffer = this.byteBuffer;
            byteBuffer.put((byte) ((i & 127) | 128));
            byteBuffer.put((byte) (i2 | 128));
            byteBuffer.put((byte) i3);
            return 3;
        }
        int i5 = i >>> 28;
        if (i5 == 0) {
            require(4);
            this.position += 4;
            ByteBuffer byteBuffer2 = this.byteBuffer;
            byteBuffer2.put((byte) ((i & 127) | 128));
            byteBuffer2.put((byte) (i2 | 128));
            byteBuffer2.put((byte) (i3 | 128));
            byteBuffer2.put((byte) i4);
            return 4;
        }
        require(5);
        this.position += 5;
        ByteBuffer byteBuffer3 = this.byteBuffer;
        byteBuffer3.put((byte) ((i & 127) | 128));
        byteBuffer3.put((byte) (i2 | 128));
        byteBuffer3.put((byte) (i3 | 128));
        byteBuffer3.put((byte) (i4 | 128));
        byteBuffer3.put((byte) i5);
        return 5;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeVarIntFlag(boolean z, int i, boolean z2) {
        if (!z2) {
            i = (i >> 31) ^ (i << 1);
        }
        int i2 = (z ? 128 : 0) | (i & 63);
        int i3 = i >>> 6;
        if (i3 == 0) {
            if (this.position == this.capacity) {
                require(1);
            }
            this.byteBuffer.put((byte) i2);
            this.position++;
            return 1;
        }
        int i4 = i >>> 13;
        if (i4 == 0) {
            require(2);
            this.position += 2;
            this.byteBuffer.put((byte) (i2 | 64));
            this.byteBuffer.put((byte) i3);
            return 2;
        }
        int i5 = i >>> 20;
        if (i5 == 0) {
            require(3);
            this.position += 3;
            ByteBuffer byteBuffer = this.byteBuffer;
            byteBuffer.put((byte) (i2 | 64));
            byteBuffer.put((byte) (i3 | 128));
            byteBuffer.put((byte) i4);
            return 3;
        }
        int i6 = i >>> 27;
        if (i6 == 0) {
            require(4);
            this.position += 4;
            ByteBuffer byteBuffer2 = this.byteBuffer;
            byteBuffer2.put((byte) (i2 | 64));
            byteBuffer2.put((byte) (i3 | 128));
            byteBuffer2.put((byte) (i4 | 128));
            byteBuffer2.put((byte) i5);
            return 4;
        }
        require(5);
        this.position += 5;
        ByteBuffer byteBuffer3 = this.byteBuffer;
        byteBuffer3.put((byte) (i2 | 64));
        byteBuffer3.put((byte) (i3 | 128));
        byteBuffer3.put((byte) (i4 | 128));
        byteBuffer3.put((byte) (i5 | 128));
        byteBuffer3.put((byte) i6);
        return 5;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeVarLong(long j, boolean z) {
        long j2 = !z ? (j << 1) ^ (j >> 63) : j;
        long j3 = j2 >>> 7;
        if (j3 == 0) {
            if (this.position == this.capacity) {
                require(1);
            }
            this.position++;
            this.byteBuffer.put((byte) j2);
            return 1;
        }
        long j4 = j2 >>> 14;
        if (j4 == 0) {
            require(2);
            this.position += 2;
            this.byteBuffer.put((byte) ((j2 & 127) | 128));
            this.byteBuffer.put((byte) j3);
            return 2;
        }
        long j5 = j2 >>> 21;
        if (j5 == 0) {
            require(3);
            this.position += 3;
            ByteBuffer byteBuffer = this.byteBuffer;
            byteBuffer.put((byte) ((j2 & 127) | 128));
            byteBuffer.put((byte) (j3 | 128));
            byteBuffer.put((byte) j4);
            return 3;
        }
        long j6 = j2 >>> 28;
        if (j6 == 0) {
            require(4);
            this.position += 4;
            ByteBuffer byteBuffer2 = this.byteBuffer;
            byteBuffer2.put((byte) ((j2 & 127) | 128));
            byteBuffer2.put((byte) (j3 | 128));
            byteBuffer2.put((byte) (j4 | 128));
            byteBuffer2.put((byte) j5);
            return 4;
        }
        long j7 = j2 >>> 35;
        if (j7 == 0) {
            require(5);
            this.position += 5;
            ByteBuffer byteBuffer3 = this.byteBuffer;
            byteBuffer3.put((byte) ((j2 & 127) | 128));
            byteBuffer3.put((byte) (j3 | 128));
            byteBuffer3.put((byte) (j4 | 128));
            byteBuffer3.put((byte) (j5 | 128));
            byteBuffer3.put((byte) j6);
            return 5;
        }
        long j8 = j2 >>> 42;
        if (j8 == 0) {
            require(6);
            this.position += 6;
            ByteBuffer byteBuffer4 = this.byteBuffer;
            byteBuffer4.put((byte) ((j2 & 127) | 128));
            byteBuffer4.put((byte) (j3 | 128));
            byteBuffer4.put((byte) (j4 | 128));
            byteBuffer4.put((byte) (j5 | 128));
            byteBuffer4.put((byte) (j6 | 128));
            byteBuffer4.put((byte) j7);
            return 6;
        }
        long j9 = j2;
        long j10 = j9 >>> 49;
        if (j10 == 0) {
            require(7);
            this.position += 7;
            ByteBuffer byteBuffer5 = this.byteBuffer;
            byteBuffer5.put((byte) ((j9 & 127) | 128));
            byteBuffer5.put((byte) (j3 | 128));
            byteBuffer5.put((byte) (j4 | 128));
            byteBuffer5.put((byte) (j5 | 128));
            byteBuffer5.put((byte) (j6 | 128));
            byteBuffer5.put((byte) (j7 | 128));
            byteBuffer5.put((byte) j8);
            return 7;
        }
        long j11 = j9 >>> 56;
        if (j11 == 0) {
            require(8);
            this.position += 8;
            ByteBuffer byteBuffer6 = this.byteBuffer;
            byteBuffer6.put((byte) ((j9 & 127) | 128));
            byteBuffer6.put((byte) (j3 | 128));
            byteBuffer6.put((byte) (j4 | 128));
            byteBuffer6.put((byte) (j5 | 128));
            byteBuffer6.put((byte) (j6 | 128));
            byteBuffer6.put((byte) (j7 | 128));
            byteBuffer6.put((byte) (j8 | 128));
            byteBuffer6.put((byte) j10);
            return 8;
        }
        require(9);
        this.position += 9;
        ByteBuffer byteBuffer7 = this.byteBuffer;
        byteBuffer7.put((byte) ((j9 & 127) | 128));
        byteBuffer7.put((byte) (j3 | 128));
        byteBuffer7.put((byte) (j4 | 128));
        byteBuffer7.put((byte) (j5 | 128));
        byteBuffer7.put((byte) (j6 | 128));
        byteBuffer7.put((byte) (j7 | 128));
        byteBuffer7.put((byte) (j8 | 128));
        byteBuffer7.put((byte) (j10 | 128));
        byteBuffer7.put((byte) j11);
        return 9;
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream
    public void write(byte[] bArr) {
        if (bArr != null) {
            writeBytes(bArr, 0, bArr.length);
        } else {
            C5919.m11249("bytes cannot be null.");
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeByte(byte b) {
        if (this.position == this.capacity) {
            require(1);
        }
        this.byteBuffer.put(b);
        this.position++;
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        writeBytes(bArr, i, i2);
    }

    public ByteBufferOutput(int i) {
        this(i, i);
    }

    public ByteBufferOutput() {
    }

    public ByteBufferOutput(ByteBuffer byteBuffer) {
        setBuffer(byteBuffer);
    }

    public ByteBufferOutput(ByteBuffer byteBuffer, int i) {
        setBuffer(byteBuffer, i);
    }

    public ByteBufferOutput(OutputStream outputStream) {
        this(4096, 4096);
        if (outputStream != null) {
            this.outputStream = outputStream;
        } else {
            C5919.m11249("outputStream cannot be null.");
            throw null;
        }
    }

    public ByteBufferOutput(OutputStream outputStream, int i) {
        this(i, i);
        if (outputStream != null) {
            this.outputStream = outputStream;
        } else {
            C5919.m11249("outputStream cannot be null.");
            throw null;
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBytes(byte[] bArr) {
        if (bArr != null) {
            writeBytes(bArr, 0, bArr.length);
        } else {
            C5919.m11249("bytes cannot be null.");
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void setBuffer(byte[] bArr, int i) {
        throw new UnsupportedOperationException("This buffer does not used a byte[], see #setByteBuffer(ByteBuffer).");
    }

    public void setBuffer(byte[] bArr, int i, int i2) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr, i, i2);
        setBufferPosition(byteBufferAllocateDirect, 0);
        setBufferLimit(byteBufferAllocateDirect, bArr.length);
        setBuffer(byteBufferAllocateDirect);
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        setBuffer(byteBuffer, byteBuffer.capacity());
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void setBuffer(byte[] bArr) {
        throw new UnsupportedOperationException("This buffer does not used a byte[], see #setByteBuffer(ByteBuffer).");
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeInt(int i) {
        require(4);
        this.position += 4;
        ByteBuffer byteBuffer = this.byteBuffer;
        byteBuffer.put((byte) i);
        byteBuffer.put((byte) (i >> 8));
        byteBuffer.put((byte) (i >> 16));
        byteBuffer.put((byte) (i >> 24));
    }
}
