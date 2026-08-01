package com.esotericsoftware.kryo.p006io;

import bsh.C3466;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ByteBufferInput extends Input {
    private static final ByteOrder nativeOrder = ByteOrder.nativeOrder();
    protected ByteBuffer byteBuffer;
    private byte[] tempBuffer;

    public ByteBufferInput(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            C6755.m11869("bytes cannot be null.");
            throw null;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        flipBuffer(byteBufferAllocateDirect);
        setBuffer(byteBufferAllocateDirect);
    }

    private void flipBuffer(Buffer buffer) {
        buffer.flip();
    }

    private int getBufferPosition(Buffer buffer) {
        return buffer.position();
    }

    private String readAsciiString() {
        char[] cArr = this.chars;
        ByteBuffer byteBuffer = this.byteBuffer;
        int iMin = Math.min(cArr.length, this.limit - this.position);
        int i = 0;
        while (i < iMin) {
            byte b = byteBuffer.get();
            if ((b & 128) == 128) {
                this.position = getBufferPosition(byteBuffer);
                cArr[i] = (char) (b & 127);
                return new String(cArr, 0, i + 1);
            }
            cArr[i] = (char) b;
            i++;
        }
        this.position = getBufferPosition(byteBuffer);
        return readAscii_slow(i);
    }

    private String readAscii_slow(int i) {
        char[] cArr = this.chars;
        ByteBuffer byteBuffer = this.byteBuffer;
        while (true) {
            if (this.position == this.limit) {
                require(1);
            }
            this.position++;
            byte b = byteBuffer.get();
            if (i == cArr.length) {
                char[] cArr2 = new char[i * 2];
                System.arraycopy(cArr, 0, cArr2, 0, i);
                this.chars = cArr2;
                cArr = cArr2;
            }
            if ((b & 128) == 128) {
                cArr[i] = (char) (b & 127);
                return new String(cArr, 0, i + 1);
            }
            cArr[i] = (char) b;
            i++;
        }
    }

    private void readUtf8Chars(int i) {
        if (this.chars.length < i) {
            this.chars = new char[i];
        }
        char[] cArr = this.chars;
        ByteBuffer byteBuffer = this.byteBuffer;
        int iMin = Math.min(require(1), i);
        int i2 = 0;
        while (i2 < iMin) {
            byte b = byteBuffer.get();
            if (b < 0) {
                break;
            }
            cArr[i2] = (char) b;
            i2++;
        }
        int i3 = this.position + i2;
        this.position = i3;
        if (i2 < i) {
            setBufferPosition(byteBuffer, i3);
            readUtf8Chars_slow(i, i2);
        }
    }

    private void readUtf8Chars_slow(int i, int i2) {
        ByteBuffer byteBuffer = this.byteBuffer;
        char[] cArr = this.chars;
        while (i2 < i) {
            if (this.position == this.limit) {
                require(1);
            }
            this.position++;
            byte b = byteBuffer.get();
            int i3 = b & DefaultClassResolver.NAME;
            switch (i3 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i2] = (char) i3;
                    break;
                case 12:
                case 13:
                    if (this.position == this.limit) {
                        require(1);
                    }
                    this.position++;
                    cArr[i2] = (char) (((b & 31) << 6) | (byteBuffer.get() & 63));
                    break;
                case 14:
                    require(2);
                    this.position += 2;
                    cArr[i2] = (char) (((b & 15) << 12) | ((byteBuffer.get() & 63) << 6) | (byteBuffer.get() & 63));
                    break;
            }
            i2++;
        }
    }

    private int readVarIntFlag_slow(boolean z) {
        this.position++;
        byte b = this.byteBuffer.get();
        int i = b & 63;
        if ((b & 64) != 0) {
            if (this.position == this.limit) {
                require(1);
            }
            this.position++;
            ByteBuffer byteBuffer = this.byteBuffer;
            byte b2 = byteBuffer.get();
            i |= (b2 & 127) << 6;
            if ((b2 & 128) != 0) {
                if (this.position == this.limit) {
                    require(1);
                }
                this.position++;
                byte b3 = byteBuffer.get();
                i |= (b3 & 127) << 13;
                if ((b3 & 128) != 0) {
                    if (this.position == this.limit) {
                        require(1);
                    }
                    this.position++;
                    byte b4 = byteBuffer.get();
                    i |= (b4 & 127) << 20;
                    if ((b4 & 128) != 0) {
                        if (this.position == this.limit) {
                            require(1);
                        }
                        this.position++;
                        i |= (byteBuffer.get() & 127) << 27;
                    }
                }
            }
        }
        return z ? i : (i >>> 1) ^ (-(i & 1));
    }

    private int readVarInt_slow(boolean z) {
        this.position++;
        byte b = this.byteBuffer.get();
        int i = b & 127;
        if ((b & 128) != 0) {
            if (this.position == this.limit) {
                require(1);
            }
            ByteBuffer byteBuffer = this.byteBuffer;
            this.position++;
            byte b2 = byteBuffer.get();
            i |= (b2 & 127) << 7;
            if ((b2 & 128) != 0) {
                if (this.position == this.limit) {
                    require(1);
                }
                this.position++;
                byte b3 = byteBuffer.get();
                i |= (b3 & 127) << 14;
                if ((b3 & 128) != 0) {
                    if (this.position == this.limit) {
                        require(1);
                    }
                    this.position++;
                    byte b4 = byteBuffer.get();
                    i |= (b4 & 127) << 21;
                    if ((b4 & 128) != 0) {
                        if (this.position == this.limit) {
                            require(1);
                        }
                        this.position++;
                        i |= (byteBuffer.get() & 127) << 28;
                    }
                }
            }
        }
        return z ? i : (i >>> 1) ^ (-(i & 1));
    }

    private long readVarLong_slow(boolean z) {
        this.position++;
        byte b = this.byteBuffer.get();
        long j = b & 127;
        if ((b & 128) != 0) {
            if (this.position == this.limit) {
                require(1);
            }
            ByteBuffer byteBuffer = this.byteBuffer;
            this.position++;
            byte b2 = byteBuffer.get();
            j |= (long) ((b2 & 127) << 7);
            if ((b2 & 128) != 0) {
                if (this.position == this.limit) {
                    require(1);
                }
                this.position++;
                byte b3 = byteBuffer.get();
                j |= (long) ((b3 & 127) << 14);
                if ((b3 & 128) != 0) {
                    if (this.position == this.limit) {
                        require(1);
                    }
                    this.position++;
                    byte b4 = byteBuffer.get();
                    j |= (long) ((b4 & 127) << 21);
                    if ((b4 & 128) != 0) {
                        if (this.position == this.limit) {
                            require(1);
                        }
                        this.position++;
                        byte b5 = byteBuffer.get();
                        j |= ((long) (b5 & 127)) << 28;
                        if ((b5 & 128) != 0) {
                            if (this.position == this.limit) {
                                require(1);
                            }
                            this.position++;
                            byte b6 = byteBuffer.get();
                            j |= ((long) (b6 & 127)) << 35;
                            if ((b6 & 128) != 0) {
                                if (this.position == this.limit) {
                                    require(1);
                                }
                                this.position++;
                                byte b7 = byteBuffer.get();
                                j |= ((long) (b7 & 127)) << 42;
                                if ((b7 & 128) != 0) {
                                    if (this.position == this.limit) {
                                        require(1);
                                    }
                                    this.position++;
                                    byte b8 = byteBuffer.get();
                                    j |= ((long) (b8 & 127)) << 49;
                                    if ((b8 & 128) != 0) {
                                        if (this.position == this.limit) {
                                            require(1);
                                        }
                                        this.position++;
                                        j |= ((long) byteBuffer.get()) << 56;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z ? j : (j >>> 1) ^ (-(1 & j));
    }

    private void setBufferLimit(Buffer buffer, int i) {
        buffer.limit(i);
    }

    private void setBufferPosition(Buffer buffer, int i) {
        buffer.position(i);
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public boolean canReadVarInt() {
        if (this.limit - this.position >= 5) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i = this.position;
        int i2 = this.limit;
        ByteBuffer byteBuffer = this.byteBuffer;
        int i3 = i + 1;
        if ((byteBuffer.get(i) & 128) == 0) {
            return true;
        }
        if (i3 == i2) {
            return false;
        }
        int i4 = i + 2;
        if ((byteBuffer.get(i3) & 128) == 0) {
            return true;
        }
        if (i4 == i2) {
            return false;
        }
        int i5 = i + 3;
        if ((byteBuffer.get(i4) & 128) == 0) {
            return true;
        }
        if (i5 == i2) {
            return false;
        }
        return (byteBuffer.get(i5) & 128) == 0 || i + 4 != i2;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public boolean canReadVarLong() {
        if (this.limit - this.position >= 9) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i = this.position;
        int i2 = this.limit;
        ByteBuffer byteBuffer = this.byteBuffer;
        int i3 = i + 1;
        if ((byteBuffer.get(i) & 128) == 0) {
            return true;
        }
        if (i3 == i2) {
            return false;
        }
        int i4 = i + 2;
        if ((byteBuffer.get(i3) & 128) == 0) {
            return true;
        }
        if (i4 == i2) {
            return false;
        }
        int i5 = i + 3;
        if ((byteBuffer.get(i4) & 128) == 0) {
            return true;
        }
        if (i5 == i2) {
            return false;
        }
        int i6 = i + 4;
        if ((byteBuffer.get(i5) & 128) == 0) {
            return true;
        }
        if (i6 == i2) {
            return false;
        }
        int i7 = i + 5;
        if ((byteBuffer.get(i6) & 128) == 0) {
            return true;
        }
        if (i7 == i2) {
            return false;
        }
        int i8 = i + 6;
        if ((byteBuffer.get(i7) & 128) == 0) {
            return true;
        }
        if (i8 == i2) {
            return false;
        }
        int i9 = i + 7;
        if ((byteBuffer.get(i8) & 128) == 0) {
            return true;
        }
        if (i9 == i2) {
            return false;
        }
        return (byteBuffer.get(i9) & 128) == 0 || i + 8 != i2;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public int fill(ByteBuffer byteBuffer, int i, int i2) {
        if (this.inputStream == null) {
            return -1;
        }
        try {
            if (this.tempBuffer == null) {
                this.tempBuffer = new byte[2048];
            }
            setBufferPosition(byteBuffer, i);
            int i3 = 0;
            while (true) {
                if (i2 <= 0) {
                    break;
                }
                InputStream inputStream = this.inputStream;
                byte[] bArr = this.tempBuffer;
                int i4 = inputStream.read(bArr, 0, Math.min(bArr.length, i2));
                if (i4 != -1) {
                    byteBuffer.put(this.tempBuffer, 0, i4);
                    i2 -= i4;
                    i3 += i4;
                } else if (i3 == 0) {
                    return -1;
                }
            }
            return i3;
        } catch (IOException e) {
            throw new KryoException(e);
        }
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public byte[] getBuffer() {
        throw new UnsupportedOperationException("This input does not used a byte[], see #getByteBuffer().");
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public int optional(int i) {
        int i2 = this.limit - this.position;
        if (i2 >= i) {
            return i;
        }
        int iMin = Math.min(i, this.capacity);
        ByteBuffer byteBuffer = this.byteBuffer;
        int i3 = this.limit;
        int iFill = fill(byteBuffer, i3, this.capacity - i3);
        setBufferPosition(this.byteBuffer, this.position);
        if (iFill == -1) {
            if (i2 == 0) {
                return -1;
            }
            return Math.min(i2, iMin);
        }
        int i4 = i2 + iFill;
        if (i4 >= iMin) {
            this.limit += iFill;
            return iMin;
        }
        this.byteBuffer.compact();
        this.total += (long) this.position;
        this.position = 0;
        do {
            int iFill2 = fill(this.byteBuffer, i4, this.capacity - i4);
            if (iFill2 == -1) {
                break;
            }
            i4 += iFill2;
        } while (i4 < iMin);
        this.limit = i4;
        setBufferPosition(this.byteBuffer, 0);
        if (i4 == 0) {
            return -1;
        }
        return Math.min(i4, iMin);
    }

    @Override // com.esotericsoftware.kryo.p006io.Input, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            C6755.m11869("bytes cannot be null.");
            return 0;
        }
        int iMin = Math.min(this.limit - this.position, i2);
        int i3 = i2;
        while (true) {
            this.byteBuffer.get(bArr, i, iMin);
            this.position += iMin;
            i3 -= iMin;
            if (i3 == 0) {
                break;
            }
            i += iMin;
            iMin = optional(i3);
            if (iMin == -1) {
                if (i2 == i3) {
                    return -1;
                }
            } else if (this.position == this.limit) {
                break;
            }
        }
        return i2 - i3;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public boolean readBoolean() {
        if (this.position == this.limit) {
            require(1);
        }
        this.position++;
        return this.byteBuffer.get() == 1;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public boolean[] readBooleans(int i) {
        boolean[] zArr = new boolean[i];
        if (optional(i) != i) {
            for (int i2 = 0; i2 < i; i2++) {
                zArr[i2] = readBoolean();
            }
            return zArr;
        }
        ByteBuffer byteBuffer = this.byteBuffer;
        for (int i3 = 0; i3 < i; i3++) {
            zArr[i3] = byteBuffer.get() != 0;
        }
        this.position = getBufferPosition(byteBuffer);
        return zArr;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public byte readByte() {
        if (this.position == this.limit) {
            require(1);
        }
        this.position++;
        return this.byteBuffer.get();
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public int readByteUnsigned() {
        if (this.position == this.limit) {
            require(1);
        }
        this.position++;
        return this.byteBuffer.get() & DefaultClassResolver.NAME;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public void readBytes(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            C6755.m11869("bytes cannot be null.");
            return;
        }
        int iMin = Math.min(this.limit - this.position, i2);
        while (true) {
            this.byteBuffer.get(bArr, i, iMin);
            this.position += iMin;
            i2 -= iMin;
            if (i2 == 0) {
                return;
            }
            i += iMin;
            iMin = Math.min(i2, this.capacity);
            require(iMin);
        }
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public char readChar() {
        require(2);
        this.position += 2;
        return (char) (((this.byteBuffer.get() & DefaultClassResolver.NAME) << 8) | (this.byteBuffer.get() & DefaultClassResolver.NAME));
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public char[] readChars(int i) {
        char[] cArr = new char[i];
        int i2 = i << 1;
        int i3 = 0;
        if (optional(i2) != i2) {
            while (i3 < i) {
                cArr[i3] = readChar();
                i3++;
            }
            return cArr;
        }
        ByteBuffer byteBuffer = this.byteBuffer;
        while (i3 < i) {
            cArr[i3] = (char) ((byteBuffer.get() & DefaultClassResolver.NAME) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 8));
            i3++;
        }
        this.position = getBufferPosition(byteBuffer);
        return cArr;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public double readDouble() {
        require(8);
        ByteBuffer byteBuffer = this.byteBuffer;
        this.position += 8;
        return Double.longBitsToDouble((((long) byteBuffer.get()) << 56) | ((long) ((byteBuffer.get() & DefaultClassResolver.NAME) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 16))) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 24) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 32) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 40) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 48));
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public double[] readDoubles(int i) {
        double[] dArr = new double[i];
        int i2 = i << 3;
        int i3 = 0;
        if (optional(i2) != i2) {
            while (i3 < i) {
                dArr[i3] = readDouble();
                i3++;
            }
            return dArr;
        }
        ByteBuffer byteBuffer = this.byteBuffer;
        while (i3 < i) {
            dArr[i3] = Double.longBitsToDouble(((long) ((byteBuffer.get() & DefaultClassResolver.NAME) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 16))) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 24) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 32) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 40) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 48) | (((long) byteBuffer.get()) << 56));
            i3++;
        }
        this.position = getBufferPosition(byteBuffer);
        return dArr;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public float readFloat() {
        require(4);
        ByteBuffer byteBuffer = this.byteBuffer;
        this.position += 4;
        return Float.intBitsToFloat((byteBuffer.get() & DefaultClassResolver.NAME) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 16) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 24));
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public float[] readFloats(int i) {
        float[] fArr = new float[i];
        int i2 = i << 2;
        int i3 = 0;
        if (optional(i2) != i2) {
            while (i3 < i) {
                fArr[i3] = readFloat();
                i3++;
            }
            return fArr;
        }
        ByteBuffer byteBuffer = this.byteBuffer;
        while (i3 < i) {
            fArr[i3] = Float.intBitsToFloat((byteBuffer.get() & DefaultClassResolver.NAME) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 16) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 24));
            i3++;
        }
        this.position = getBufferPosition(byteBuffer);
        return fArr;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public int readInt(int i) {
        int i2;
        byte b;
        if (i < 0 || i > 4) {
            C6755.m11869(AbstractC7012.m12147(i, "count must be >= 0 and <= 4: "));
            return 0;
        }
        require(i);
        this.position += i;
        ByteBuffer byteBuffer = this.byteBuffer;
        if (i == 1) {
            return byteBuffer.get();
        }
        if (i == 2) {
            i2 = byteBuffer.get() << 8;
            b = byteBuffer.get();
        } else if (i == 3) {
            i2 = (byteBuffer.get() << 16) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 8);
            b = byteBuffer.get();
        } else {
            if (i != 4) {
                C3466.m5901();
                return 0;
            }
            i2 = (byteBuffer.get() << 24) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 16) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 8);
            b = byteBuffer.get();
        }
        return (b & DefaultClassResolver.NAME) | i2;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public int[] readInts(int i) {
        int[] iArr = new int[i];
        int i2 = i << 2;
        int i3 = 0;
        if (optional(i2) != i2) {
            while (i3 < i) {
                iArr[i3] = readInt();
                i3++;
            }
            return iArr;
        }
        ByteBuffer byteBuffer = this.byteBuffer;
        while (i3 < i) {
            iArr[i3] = (byteBuffer.get() & DefaultClassResolver.NAME) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 16) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 24);
            i3++;
        }
        this.position = getBufferPosition(byteBuffer);
        return iArr;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public long readLong() {
        require(8);
        this.position += 8;
        ByteBuffer byteBuffer = this.byteBuffer;
        return ((long) (((byteBuffer.get() & DefaultClassResolver.NAME) << 8) | (byteBuffer.get() & DefaultClassResolver.NAME) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 16))) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 24) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 32) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 40) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 48) | (((long) byteBuffer.get()) << 56);
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public long[] readLongs(int i) {
        long[] jArr = new long[i];
        int i2 = i << 3;
        int i3 = 0;
        if (optional(i2) != i2) {
            while (i3 < i) {
                jArr[i3] = readLong();
                i3++;
            }
            return jArr;
        }
        ByteBuffer byteBuffer = this.byteBuffer;
        while (i3 < i) {
            jArr[i3] = ((long) ((byteBuffer.get() & DefaultClassResolver.NAME) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 16))) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 24) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 32) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 40) | (((long) (byteBuffer.get() & DefaultClassResolver.NAME)) << 48) | (((long) byteBuffer.get()) << 56);
            i3++;
        }
        this.position = getBufferPosition(byteBuffer);
        return jArr;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public short readShort() {
        require(2);
        this.position += 2;
        return (short) (((this.byteBuffer.get() & DefaultClassResolver.NAME) << 8) | (this.byteBuffer.get() & DefaultClassResolver.NAME));
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public int readShortUnsigned() {
        require(2);
        this.position += 2;
        return ((this.byteBuffer.get() & DefaultClassResolver.NAME) << 8) | (this.byteBuffer.get() & DefaultClassResolver.NAME);
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public short[] readShorts(int i) {
        short[] sArr = new short[i];
        int i2 = i << 1;
        int i3 = 0;
        if (optional(i2) != i2) {
            while (i3 < i) {
                sArr[i3] = readShort();
                i3++;
            }
            return sArr;
        }
        ByteBuffer byteBuffer = this.byteBuffer;
        while (i3 < i) {
            sArr[i3] = (short) ((byteBuffer.get() & DefaultClassResolver.NAME) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 8));
            i3++;
        }
        this.position = getBufferPosition(byteBuffer);
        return sArr;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public String readString() {
        if (!readVarIntFlag()) {
            return readAsciiString();
        }
        int varIntFlag = readVarIntFlag(true);
        if (varIntFlag == 0) {
            return null;
        }
        if (varIntFlag == 1) {
            return "";
        }
        int i = varIntFlag - 1;
        readUtf8Chars(i);
        return new String(this.chars, 0, i);
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public StringBuilder readStringBuilder() {
        if (!readVarIntFlag()) {
            return new StringBuilder(readAsciiString());
        }
        int varIntFlag = readVarIntFlag(true);
        if (varIntFlag == 0) {
            return null;
        }
        if (varIntFlag == 1) {
            return new StringBuilder("");
        }
        int i = varIntFlag - 1;
        readUtf8Chars(i);
        StringBuilder sb = new StringBuilder(i);
        sb.append(this.chars, 0, i);
        return sb;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public int readVarInt(boolean z) {
        if (require(1) < 5) {
            return readVarInt_slow(z);
        }
        byte b = this.byteBuffer.get();
        int i = b & 127;
        if ((b & 128) != 0) {
            ByteBuffer byteBuffer = this.byteBuffer;
            byte b2 = byteBuffer.get();
            i |= (b2 & 127) << 7;
            if ((b2 & 128) != 0) {
                byte b3 = byteBuffer.get();
                i |= (b3 & 127) << 14;
                if ((b3 & 128) != 0) {
                    byte b4 = byteBuffer.get();
                    i |= (b4 & 127) << 21;
                    if ((b4 & 128) != 0) {
                        i |= (byteBuffer.get() & 127) << 28;
                    }
                }
            }
        }
        this.position = getBufferPosition(this.byteBuffer);
        return z ? i : (i >>> 1) ^ (-(i & 1));
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public int readVarIntFlag(boolean z) {
        if (require(1) < 5) {
            return readVarIntFlag_slow(z);
        }
        byte b = this.byteBuffer.get();
        int i = b & 63;
        if ((b & 64) != 0) {
            ByteBuffer byteBuffer = this.byteBuffer;
            byte b2 = byteBuffer.get();
            i |= (b2 & 127) << 6;
            if ((b2 & 128) != 0) {
                byte b3 = byteBuffer.get();
                i |= (b3 & 127) << 13;
                if ((b3 & 128) != 0) {
                    byte b4 = byteBuffer.get();
                    i |= (b4 & 127) << 20;
                    if ((b4 & 128) != 0) {
                        i |= (byteBuffer.get() & 127) << 27;
                    }
                }
            }
        }
        this.position = getBufferPosition(this.byteBuffer);
        return z ? i : (i >>> 1) ^ (-(i & 1));
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public long readVarLong(boolean z) {
        if (require(1) < 9) {
            return readVarLong_slow(z);
        }
        byte b = this.byteBuffer.get();
        long j = b & 127;
        if ((b & 128) != 0) {
            ByteBuffer byteBuffer = this.byteBuffer;
            byte b2 = byteBuffer.get();
            j |= (long) ((b2 & 127) << 7);
            if ((b2 & 128) != 0) {
                byte b3 = byteBuffer.get();
                j |= (long) ((b3 & 127) << 14);
                if ((b3 & 128) != 0) {
                    byte b4 = byteBuffer.get();
                    j |= (long) ((b4 & 127) << 21);
                    if ((b4 & 128) != 0) {
                        byte b5 = byteBuffer.get();
                        j |= ((long) (b5 & 127)) << 28;
                        if ((b5 & 128) != 0) {
                            byte b6 = byteBuffer.get();
                            j |= ((long) (b6 & 127)) << 35;
                            if ((b6 & 128) != 0) {
                                byte b7 = byteBuffer.get();
                                j |= ((long) (b7 & 127)) << 42;
                                if ((b7 & 128) != 0) {
                                    byte b8 = byteBuffer.get();
                                    j |= ((long) (b8 & 127)) << 49;
                                    if ((b8 & 128) != 0) {
                                        j |= ((long) byteBuffer.get()) << 56;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.position = getBufferPosition(this.byteBuffer);
        return z ? j : (j >>> 1) ^ (-(1 & j));
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public int require(int i) {
        int i2 = this.limit;
        int i3 = i2 - this.position;
        if (i3 >= i) {
            return i3;
        }
        int i4 = this.capacity;
        if (i > i4) {
            throw new KryoException("Buffer too small: capacity: " + this.capacity + ", required: " + i);
        }
        if (i3 > 0) {
            int iFill = fill(this.byteBuffer, i2, i4 - i2);
            if (iFill == -1) {
                throw new KryoBufferUnderflowException("Buffer underflow.");
            }
            setBufferPosition(this.byteBuffer, this.position);
            i3 += iFill;
            if (i3 >= i) {
                this.limit += iFill;
                return i3;
            }
        }
        this.byteBuffer.compact();
        this.total += (long) this.position;
        this.position = 0;
        while (true) {
            int iFill2 = fill(this.byteBuffer, i3, this.capacity - i3);
            if (iFill2 != -1) {
                i3 += iFill2;
                if (i3 >= i) {
                    break;
                }
            } else if (i3 < i) {
                throw new KryoBufferUnderflowException("Buffer underflow.");
            }
        }
        this.limit = i3;
        setBufferPosition(this.byteBuffer, 0);
        return i3;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input, java.io.InputStream, com.esotericsoftware.kryo.util.Pool.Poolable
    public void reset() {
        super.reset();
        setBufferPosition(this.byteBuffer, 0);
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            C6755.m11869("buffer cannot be null.");
            return;
        }
        this.byteBuffer = byteBuffer;
        this.position = byteBuffer.position();
        this.limit = byteBuffer.limit();
        this.capacity = byteBuffer.capacity();
        this.total = 0L;
        this.inputStream = null;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        this.limit = 0;
        reset();
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public void setLimit(int i) {
        this.limit = i;
        setBufferLimit(this.byteBuffer, i);
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public void setPosition(int i) {
        this.position = i;
        setBufferPosition(this.byteBuffer, i);
    }

    @Override // com.esotericsoftware.kryo.p006io.Input, java.io.InputStream
    public long skip(long j) {
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(2147483639L, j2);
            skip(iMin);
            j2 -= (long) iMin;
        }
        return j;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public void skip(int i) {
        super.skip(i);
        setBufferPosition(this.byteBuffer, this.position);
    }

    public ByteBufferInput(int i) {
        this.capacity = i;
        this.byteBuffer = ByteBuffer.allocateDirect(i);
    }

    public ByteBufferInput(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ByteBufferInput() {
    }

    public ByteBufferInput(ByteBuffer byteBuffer) {
        setBuffer(byteBuffer);
    }

    public ByteBufferInput(InputStream inputStream) {
        this(4096);
        if (inputStream != null) {
            this.inputStream = inputStream;
        } else {
            C6755.m11869("inputStream cannot be null.");
            throw null;
        }
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public void setBuffer(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("This input does not used a byte[], see #setByteBufferByteBuffer().");
    }

    public ByteBufferInput(InputStream inputStream, int i) {
        this(i);
        if (inputStream != null) {
            this.inputStream = inputStream;
        } else {
            C6755.m11869("inputStream cannot be null.");
            throw null;
        }
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public void setBuffer(byte[] bArr) {
        throw new UnsupportedOperationException("This input does not used a byte[], see #setByteBuffer(ByteBuffer).");
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public byte[] readBytes(int i) {
        byte[] bArr = new byte[i];
        readBytes(bArr, 0, i);
        return bArr;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.esotericsoftware.kryo.p006io.Input, java.io.InputStream
    public int read() {
        if (optional(1) <= 0) {
            return -1;
        }
        this.position++;
        return this.byteBuffer.get() & DefaultClassResolver.NAME;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public boolean readVarIntFlag() {
        if (this.position == this.limit) {
            require(1);
        }
        return (this.byteBuffer.get(this.position) & 128) != 0;
    }

    @Override // com.esotericsoftware.kryo.p006io.Input
    public int readInt() {
        require(4);
        this.position += 4;
        ByteBuffer byteBuffer = this.byteBuffer;
        return ((byteBuffer.get() & DefaultClassResolver.NAME) << 24) | (byteBuffer.get() & DefaultClassResolver.NAME) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get() & DefaultClassResolver.NAME) << 16);
    }
}
