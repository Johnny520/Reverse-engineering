package com.esotericsoftware.kryo.io;

import bsh.C2633;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.esotericsoftware.kryo.util.Pool;
import java.io.IOException;
import java.io.InputStream;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Input extends InputStream implements Pool.Poolable {
    protected byte[] buffer;
    protected int capacity;
    protected char[] chars;
    protected InputStream inputStream;
    protected int limit;
    protected int position;
    protected long total;
    protected boolean varEncoding;

    public Input(int i) {
        this.chars = new char[32];
        this.varEncoding = true;
        this.capacity = i;
        this.buffer = new byte[i];
    }

    private String readAsciiString() {
        char[] cArr = this.chars;
        byte[] bArr = this.buffer;
        int i = this.position;
        int iMin = Math.min(cArr.length, this.limit - i);
        int i2 = 0;
        while (i2 < iMin) {
            byte b = bArr[i];
            if ((b & 128) == 128) {
                this.position = i + 1;
                cArr[i2] = (char) (b & 127);
                return new String(cArr, 0, i2 + 1);
            }
            cArr[i2] = (char) b;
            i2++;
            i++;
        }
        this.position = i;
        return readAscii_slow(i2);
    }

    private String readAscii_slow(int i) {
        char[] cArr = this.chars;
        byte[] bArr = this.buffer;
        while (true) {
            if (this.position == this.limit) {
                require(1);
            }
            int i2 = this.position;
            this.position = i2 + 1;
            byte b = bArr[i2];
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
        byte[] bArr = this.buffer;
        char[] cArr = this.chars;
        int iMin = Math.min(require(1), i);
        int i2 = this.position;
        int i3 = 0;
        while (i3 < iMin) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                break;
            }
            cArr[i3] = (char) b;
            i3++;
            i2 = i4;
        }
        this.position = i2;
        if (i3 < i) {
            readUtf8Chars_slow(i, i3);
        }
    }

    private void readUtf8Chars_slow(int i, int i2) {
        char[] cArr = this.chars;
        byte[] bArr = this.buffer;
        while (i2 < i) {
            if (this.position == this.limit) {
                require(1);
            }
            int i3 = this.position;
            int i4 = i3 + 1;
            this.position = i4;
            byte b = bArr[i3];
            int i5 = b & DefaultClassResolver.NAME;
            switch (i5 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i2] = (char) i5;
                    break;
                case 12:
                case 13:
                    if (i4 == this.limit) {
                        require(1);
                    }
                    int i6 = this.position;
                    this.position = i6 + 1;
                    cArr[i2] = (char) (((b & 31) << 6) | (bArr[i6] & 63));
                    break;
                case 14:
                    require(2);
                    int i7 = this.position;
                    this.position = i7 + 2;
                    cArr[i2] = (char) (((b & 15) << 12) | ((bArr[i7] & 63) << 6) | (bArr[i7 + 1] & 63));
                    break;
            }
            i2++;
        }
    }

    private int readVarIntFlag_slow(boolean z) {
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b = bArr[i];
        int i3 = b & 63;
        if ((b & 64) != 0) {
            if (i2 == this.limit) {
                require(1);
            }
            byte[] bArr2 = this.buffer;
            int i4 = this.position;
            int i5 = i4 + 1;
            this.position = i5;
            byte b2 = bArr2[i4];
            i3 |= (b2 & 127) << 6;
            if ((b2 & 128) != 0) {
                if (i5 == this.limit) {
                    require(1);
                }
                int i6 = this.position;
                int i7 = i6 + 1;
                this.position = i7;
                byte b3 = bArr2[i6];
                i3 |= (b3 & 127) << 13;
                if ((b3 & 128) != 0) {
                    if (i7 == this.limit) {
                        require(1);
                    }
                    int i8 = this.position;
                    int i9 = i8 + 1;
                    this.position = i9;
                    byte b4 = bArr2[i8];
                    i3 |= (b4 & 127) << 20;
                    if ((b4 & 128) != 0) {
                        if (i9 == this.limit) {
                            require(1);
                        }
                        int i10 = this.position;
                        this.position = i10 + 1;
                        i3 |= (bArr2[i10] & 127) << 27;
                    }
                }
            }
        }
        return z ? i3 : (i3 >>> 1) ^ (-(i3 & 1));
    }

    private int readVarInt_slow(boolean z) {
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b = bArr[i];
        int i3 = b & 127;
        if ((b & 128) != 0) {
            if (i2 == this.limit) {
                require(1);
            }
            byte[] bArr2 = this.buffer;
            int i4 = this.position;
            int i5 = i4 + 1;
            this.position = i5;
            byte b2 = bArr2[i4];
            i3 |= (b2 & 127) << 7;
            if ((b2 & 128) != 0) {
                if (i5 == this.limit) {
                    require(1);
                }
                int i6 = this.position;
                int i7 = i6 + 1;
                this.position = i7;
                byte b3 = bArr2[i6];
                i3 |= (b3 & 127) << 14;
                if ((b3 & 128) != 0) {
                    if (i7 == this.limit) {
                        require(1);
                    }
                    int i8 = this.position;
                    int i9 = i8 + 1;
                    this.position = i9;
                    byte b4 = bArr2[i8];
                    i3 |= (b4 & 127) << 21;
                    if ((b4 & 128) != 0) {
                        if (i9 == this.limit) {
                            require(1);
                        }
                        int i10 = this.position;
                        this.position = i10 + 1;
                        i3 |= (bArr2[i10] & 127) << 28;
                    }
                }
            }
        }
        return z ? i3 : (i3 >>> 1) ^ (-(i3 & 1));
    }

    private long readVarLong_slow(boolean z) {
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b = bArr[i];
        long j = b & 127;
        if ((b & 128) != 0) {
            if (i2 == this.limit) {
                require(1);
            }
            byte[] bArr2 = this.buffer;
            int i3 = this.position;
            int i4 = i3 + 1;
            this.position = i4;
            byte b2 = bArr2[i3];
            j |= (long) ((b2 & 127) << 7);
            if ((b2 & 128) != 0) {
                if (i4 == this.limit) {
                    require(1);
                }
                int i5 = this.position;
                int i6 = i5 + 1;
                this.position = i6;
                byte b3 = bArr2[i5];
                j |= (long) ((b3 & 127) << 14);
                if ((b3 & 128) != 0) {
                    if (i6 == this.limit) {
                        require(1);
                    }
                    int i7 = this.position;
                    int i8 = i7 + 1;
                    this.position = i8;
                    byte b4 = bArr2[i7];
                    j |= (long) ((b4 & 127) << 21);
                    if ((b4 & 128) != 0) {
                        if (i8 == this.limit) {
                            require(1);
                        }
                        int i9 = this.position;
                        int i10 = i9 + 1;
                        this.position = i10;
                        byte b5 = bArr2[i9];
                        j |= ((long) (b5 & 127)) << 28;
                        if ((b5 & 128) != 0) {
                            if (i10 == this.limit) {
                                require(1);
                            }
                            int i11 = this.position;
                            int i12 = i11 + 1;
                            this.position = i12;
                            byte b6 = bArr2[i11];
                            j |= ((long) (b6 & 127)) << 35;
                            if ((b6 & 128) != 0) {
                                if (i12 == this.limit) {
                                    require(1);
                                }
                                int i13 = this.position;
                                int i14 = i13 + 1;
                                this.position = i14;
                                byte b7 = bArr2[i13];
                                j |= ((long) (b7 & 127)) << 42;
                                if ((b7 & 128) != 0) {
                                    if (i14 == this.limit) {
                                        require(1);
                                    }
                                    int i15 = this.position;
                                    int i16 = i15 + 1;
                                    this.position = i16;
                                    byte b8 = bArr2[i15];
                                    j |= ((long) (b8 & 127)) << 49;
                                    if ((b8 & 128) != 0) {
                                        if (i16 == this.limit) {
                                            require(1);
                                        }
                                        int i17 = this.position;
                                        this.position = i17 + 1;
                                        j |= ((long) bArr2[i17]) << 56;
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

    @Override // java.io.InputStream
    public int available() {
        int i = this.limit - this.position;
        InputStream inputStream = this.inputStream;
        return i + (inputStream != null ? inputStream.available() : 0);
    }

    public boolean canReadInt() {
        return this.varEncoding ? canReadVarInt() : this.limit - this.position >= 4 || optional(4) == 4;
    }

    public boolean canReadLong() {
        return this.varEncoding ? canReadVarLong() : this.limit - this.position >= 8 || optional(8) == 8;
    }

    public boolean canReadVarInt() {
        if (this.limit - this.position >= 5) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i = this.position;
        int i2 = this.limit;
        byte[] bArr = this.buffer;
        int i3 = i + 1;
        if ((bArr[i] & 128) == 0) {
            return true;
        }
        if (i3 == i2) {
            return false;
        }
        int i4 = i + 2;
        if ((bArr[i3] & 128) == 0) {
            return true;
        }
        if (i4 == i2) {
            return false;
        }
        int i5 = i + 3;
        if ((bArr[i4] & 128) == 0) {
            return true;
        }
        if (i5 == i2) {
            return false;
        }
        return (bArr[i5] & 128) == 0 || i + 4 != i2;
    }

    public boolean canReadVarLong() {
        if (this.limit - this.position >= 9) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i = this.position;
        int i2 = this.limit;
        byte[] bArr = this.buffer;
        int i3 = i + 1;
        if ((bArr[i] & 128) == 0) {
            return true;
        }
        if (i3 == i2) {
            return false;
        }
        int i4 = i + 2;
        if ((bArr[i3] & 128) == 0) {
            return true;
        }
        if (i4 == i2) {
            return false;
        }
        int i5 = i + 3;
        if ((bArr[i4] & 128) == 0) {
            return true;
        }
        if (i5 == i2) {
            return false;
        }
        int i6 = i + 4;
        if ((bArr[i5] & 128) == 0) {
            return true;
        }
        if (i6 == i2) {
            return false;
        }
        int i7 = i + 5;
        if ((bArr[i6] & 128) == 0) {
            return true;
        }
        if (i7 == i2) {
            return false;
        }
        int i8 = i + 6;
        if ((bArr[i7] & 128) == 0) {
            return true;
        }
        if (i8 == i2) {
            return false;
        }
        int i9 = i + 7;
        if ((bArr[i8] & 128) == 0) {
            return true;
        }
        if (i9 == i2) {
            return false;
        }
        return (bArr[i9] & 128) == 0 || i + 8 != i2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public boolean end() {
        return optional(1) <= 0;
    }

    public int fill(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.inputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i, i2);
        } catch (IOException e) {
            throw new KryoException(e);
        }
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public boolean getVariableLengthEncoding() {
        return this.varEncoding;
    }

    public int limit() {
        return this.limit;
    }

    public int optional(int i) {
        int i2 = this.limit - this.position;
        if (i2 >= i) {
            return i;
        }
        int iMin = Math.min(i, this.capacity);
        byte[] bArr = this.buffer;
        int i3 = this.limit;
        int iFill = fill(bArr, i3, this.capacity - i3);
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
        byte[] bArr2 = this.buffer;
        System.arraycopy(bArr2, this.position, bArr2, 0, i4);
        this.total += (long) this.position;
        this.position = 0;
        do {
            int iFill2 = fill(this.buffer, i4, this.capacity - i4);
            if (iFill2 == -1) {
                break;
            }
            i4 += iFill2;
        } while (i4 < iMin);
        this.limit = i4;
        if (i4 == 0) {
            return -1;
        }
        return Math.min(i4, iMin);
    }

    public int position() {
        return this.position;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            C5925.m11310("bytes cannot be null.");
            return 0;
        }
        int iMin = Math.min(this.limit - this.position, i2);
        int i3 = i2;
        while (true) {
            System.arraycopy(this.buffer, this.position, bArr, i, iMin);
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

    public boolean readBoolean() {
        if (this.position == this.limit) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] == 1;
    }

    public boolean[] readBooleans(int i) {
        boolean[] zArr = new boolean[i];
        if (optional(i) != i) {
            for (int i2 = 0; i2 < i; i2++) {
                zArr[i2] = readBoolean();
            }
            return zArr;
        }
        byte[] bArr = this.buffer;
        int i3 = this.position;
        int i4 = 0;
        while (i4 < i) {
            zArr[i4] = bArr[i3] != 0;
            i4++;
            i3++;
        }
        this.position = i3;
        return zArr;
    }

    public byte readByte() {
        if (this.position == this.limit) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        return bArr[i];
    }

    public int readByteUnsigned() {
        if (this.position == this.limit) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & DefaultClassResolver.NAME;
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            C5925.m11310("bytes cannot be null.");
            return;
        }
        int iMin = Math.min(this.limit - this.position, i2);
        while (true) {
            System.arraycopy(this.buffer, this.position, bArr, i, iMin);
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

    public char readChar() {
        require(2);
        int i = this.position;
        this.position = i + 2;
        byte[] bArr = this.buffer;
        return (char) (((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | (bArr[i] & DefaultClassResolver.NAME));
    }

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
        byte[] bArr = this.buffer;
        int i4 = this.position;
        while (i3 < i) {
            cArr[i3] = (char) ((bArr[i4] & DefaultClassResolver.NAME) | ((bArr[i4 + 1] & DefaultClassResolver.NAME) << 8));
            i3++;
            i4 += 2;
        }
        this.position = i4;
        return cArr;
    }

    public double readDouble() {
        require(8);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 8;
        return Double.longBitsToDouble((((long) bArr[i + 7]) << 56) | ((long) ((bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16))) | (((long) (bArr[i + 3] & DefaultClassResolver.NAME)) << 24) | (((long) (bArr[i + 4] & DefaultClassResolver.NAME)) << 32) | (((long) (bArr[i + 5] & DefaultClassResolver.NAME)) << 40) | (((long) (bArr[i + 6] & DefaultClassResolver.NAME)) << 48));
    }

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
        byte[] bArr = this.buffer;
        int i4 = this.position;
        while (i3 < i) {
            dArr[i3] = Double.longBitsToDouble(((long) ((bArr[i4] & DefaultClassResolver.NAME) | ((bArr[i4 + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i4 + 2] & DefaultClassResolver.NAME) << 16))) | (((long) (bArr[i4 + 3] & DefaultClassResolver.NAME)) << 24) | (((long) (bArr[i4 + 4] & DefaultClassResolver.NAME)) << 32) | (((long) (bArr[i4 + 5] & DefaultClassResolver.NAME)) << 40) | (((long) (bArr[i4 + 6] & DefaultClassResolver.NAME)) << 48) | (((long) bArr[i4 + 7]) << 56));
            i3++;
            i4 += 8;
        }
        this.position = i4;
        return dArr;
    }

    public float readFloat() {
        require(4);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 4;
        return Float.intBitsToFloat((bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16) | ((bArr[i + 3] & DefaultClassResolver.NAME) << 24));
    }

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
        byte[] bArr = this.buffer;
        int i4 = this.position;
        while (i3 < i) {
            fArr[i3] = Float.intBitsToFloat((bArr[i4] & DefaultClassResolver.NAME) | ((bArr[i4 + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i4 + 2] & DefaultClassResolver.NAME) << 16) | ((bArr[i4 + 3] & DefaultClassResolver.NAME) << 24));
            i3++;
            i4 += 4;
        }
        this.position = i4;
        return fArr;
    }

    public int readInt(int i) {
        if (i < 0 || i > 4) {
            C5925.m11310(AbstractC6183.m11588(i, "count must be >= 0 and <= 4: "));
            return 0;
        }
        require(i);
        int i2 = this.position;
        this.position = i2 + i;
        if (i == 1) {
            return this.buffer[i2];
        }
        if (i == 2) {
            byte[] bArr = this.buffer;
            return (bArr[i2 + 1] & DefaultClassResolver.NAME) | (bArr[i2] << 8);
        }
        if (i == 3) {
            byte[] bArr2 = this.buffer;
            return (bArr2[i2 + 2] & DefaultClassResolver.NAME) | (bArr2[i2] << 16) | ((bArr2[i2 + 1] & DefaultClassResolver.NAME) << 8);
        }
        if (i != 4) {
            C2633.m5341();
            return 0;
        }
        byte[] bArr3 = this.buffer;
        return (bArr3[i2 + 3] & DefaultClassResolver.NAME) | (bArr3[i2] << 24) | ((bArr3[i2 + 1] & DefaultClassResolver.NAME) << 16) | ((bArr3[i2 + 2] & DefaultClassResolver.NAME) << 8);
    }

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
        byte[] bArr = this.buffer;
        int i4 = this.position;
        while (i3 < i) {
            iArr[i3] = (bArr[i4] & DefaultClassResolver.NAME) | ((bArr[i4 + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i4 + 2] & DefaultClassResolver.NAME) << 16) | ((bArr[i4 + 3] & DefaultClassResolver.NAME) << 24);
            i3++;
            i4 += 4;
        }
        this.position = i4;
        return iArr;
    }

    public long readLong() {
        require(8);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 8;
        return (((long) bArr[i + 7]) << 56) | ((long) ((bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16))) | (((long) (bArr[i + 3] & DefaultClassResolver.NAME)) << 24) | (((long) (bArr[i + 4] & DefaultClassResolver.NAME)) << 32) | (((long) (bArr[i + 5] & DefaultClassResolver.NAME)) << 40) | (((long) (bArr[i + 6] & DefaultClassResolver.NAME)) << 48);
    }

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
        byte[] bArr = this.buffer;
        int i4 = this.position;
        while (i3 < i) {
            jArr[i3] = ((long) ((bArr[i4] & DefaultClassResolver.NAME) | ((bArr[i4 + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i4 + 2] & DefaultClassResolver.NAME) << 16))) | (((long) (bArr[i4 + 3] & DefaultClassResolver.NAME)) << 24) | (((long) (bArr[i4 + 4] & DefaultClassResolver.NAME)) << 32) | (((long) (bArr[i4 + 5] & DefaultClassResolver.NAME)) << 40) | (((long) (bArr[i4 + 6] & DefaultClassResolver.NAME)) << 48) | (((long) bArr[i4 + 7]) << 56);
            i3++;
            i4 += 8;
        }
        this.position = i4;
        return jArr;
    }

    public short readShort() {
        require(2);
        int i = this.position;
        this.position = i + 2;
        byte[] bArr = this.buffer;
        return (short) (((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | (bArr[i] & DefaultClassResolver.NAME));
    }

    public int readShortUnsigned() {
        require(2);
        int i = this.position;
        this.position = i + 2;
        byte[] bArr = this.buffer;
        return ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | (bArr[i] & DefaultClassResolver.NAME);
    }

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
        byte[] bArr = this.buffer;
        int i4 = this.position;
        while (i3 < i) {
            sArr[i3] = (short) ((bArr[i4] & DefaultClassResolver.NAME) | ((bArr[i4 + 1] & DefaultClassResolver.NAME) << 8));
            i3++;
            i4 += 2;
        }
        this.position = i4;
        return sArr;
    }

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

    public StringBuilder readStringBuilder() {
        if (!readVarIntFlag()) {
            return new StringBuilder(readAsciiString());
        }
        int varIntFlag = readVarIntFlag(true);
        if (varIntFlag == 0) {
            return null;
        }
        if (varIntFlag == 1) {
            return new StringBuilder(0);
        }
        int i = varIntFlag - 1;
        readUtf8Chars(i);
        StringBuilder sb = new StringBuilder(i);
        sb.append(this.chars, 0, i);
        return sb;
    }

    public double readVarDouble(double d, boolean z) {
        return readVarLong(z) / d;
    }

    public float readVarFloat(float f, boolean z) {
        return readVarInt(z) / f;
    }

    public int readVarInt(boolean z) {
        if (require(1) < 5) {
            return readVarInt_slow(z);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b = bArr[i];
        int i3 = b & 127;
        if ((b & 128) != 0) {
            int i4 = i + 2;
            byte b2 = bArr[i2];
            i3 |= (b2 & 127) << 7;
            if ((b2 & 128) != 0) {
                int i5 = i + 3;
                byte b3 = bArr[i4];
                i3 |= (b3 & 127) << 14;
                if ((b3 & 128) != 0) {
                    i4 = i + 4;
                    byte b4 = bArr[i5];
                    i3 |= (b4 & 127) << 21;
                    if ((b4 & 128) != 0) {
                        i3 = ((bArr[i4] & 127) << 28) | i3;
                        i4 = 5 + i;
                    }
                } else {
                    i4 = i5;
                }
            }
            this.position = i4;
        }
        return z ? i3 : (i3 >>> 1) ^ (-(i3 & 1));
    }

    public int readVarIntFlag(boolean z) {
        if (require(1) < 5) {
            return readVarIntFlag_slow(z);
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b = bArr[i];
        int i3 = b & 63;
        if ((b & 64) != 0) {
            int i4 = i + 2;
            byte b2 = bArr[i2];
            i3 |= (b2 & 127) << 6;
            if ((b2 & 128) != 0) {
                int i5 = i + 3;
                byte b3 = bArr[i4];
                i3 |= (b3 & 127) << 13;
                if ((b3 & 128) != 0) {
                    i4 = i + 4;
                    byte b4 = bArr[i5];
                    i3 |= (b4 & 127) << 20;
                    if ((b4 & 128) != 0) {
                        i3 = ((bArr[i4] & 127) << 27) | i3;
                        i4 = 5 + i;
                    }
                } else {
                    i4 = i5;
                }
            }
            this.position = i4;
        }
        return z ? i3 : (i3 >>> 1) ^ (-(i3 & 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008d A[PHI: r5 r6
  0x008d: PHI (r5v3 int) = (r5v2 int), (r5v6 int), (r5v9 int), (r5v12 int) binds: [B:9:0x0029, B:13:0x0045, B:17:0x0063, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r6v4 long) = (r6v3 long), (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:9:0x0029, B:13:0x0045, B:17:0x0063, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readVarLong(boolean r12) {
        /*
            r11 = this;
            r0 = 1
            int r1 = r11.require(r0)
            r2 = 9
            if (r1 >= r2) goto Le
            long r11 = r11.readVarLong_slow(r12)
            return r11
        Le:
            int r1 = r11.position
            byte[] r3 = r11.buffer
            int r4 = r1 + 1
            r5 = r3[r1]
            r6 = r5 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r6
            r5 = r5 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L8e
            int r5 = r1 + 2
            r4 = r3[r4]
            r8 = r4 & 127(0x7f, float:1.78E-43)
            int r8 = r8 << 7
            long r8 = (long) r8
            long r6 = r6 | r8
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto L8d
            int r4 = r1 + 3
            r5 = r3[r5]
            r8 = r5 & 127(0x7f, float:1.78E-43)
            int r8 = r8 << 14
            long r8 = (long) r8
            long r6 = r6 | r8
            r5 = r5 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L8e
            int r5 = r1 + 4
            r4 = r3[r4]
            r8 = r4 & 127(0x7f, float:1.78E-43)
            int r8 = r8 << 21
            long r8 = (long) r8
            long r6 = r6 | r8
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto L8d
            int r4 = r1 + 5
            r5 = r3[r5]
            r8 = r5 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r10 = 28
            long r8 = r8 << r10
            long r6 = r6 | r8
            r5 = r5 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L8e
            int r5 = r1 + 6
            r4 = r3[r4]
            r8 = r4 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r10 = 35
            long r8 = r8 << r10
            long r6 = r6 | r8
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto L8d
            int r4 = r1 + 7
            r5 = r3[r5]
            r8 = r5 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r10 = 42
            long r8 = r8 << r10
            long r6 = r6 | r8
            r5 = r5 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L8e
            int r5 = r1 + 8
            r4 = r3[r4]
            r8 = r4 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r10 = 49
            long r8 = r8 << r10
            long r6 = r6 | r8
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto L8d
            int r4 = r1 + 9
            r1 = r3[r5]
            long r1 = (long) r1
            r3 = 56
            long r1 = r1 << r3
            long r6 = r6 | r1
            goto L8e
        L8d:
            r4 = r5
        L8e:
            r11.position = r4
            if (r12 == 0) goto L93
            return r6
        L93:
            long r11 = r6 >>> r0
            r0 = 1
            long r0 = r0 & r6
            long r0 = -r0
            long r11 = r11 ^ r0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.io.Input.readVarLong(boolean):long");
    }

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
            int iFill = fill(this.buffer, i2, i4 - i2);
            if (iFill == -1) {
                throw new KryoBufferUnderflowException("Buffer underflow.");
            }
            i3 += iFill;
            if (i3 >= i) {
                this.limit += iFill;
                return i3;
            }
        }
        byte[] bArr = this.buffer;
        System.arraycopy(bArr, this.position, bArr, 0, i3);
        this.total += (long) this.position;
        this.position = 0;
        while (true) {
            int iFill2 = fill(this.buffer, i3, this.capacity - i3);
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
        return i3;
    }

    @Override // java.io.InputStream, com.esotericsoftware.kryo.util.Pool.Poolable
    public void reset() {
        this.position = 0;
        this.total = 0L;
    }

    public void setBuffer(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            C5925.m11310("bytes cannot be null.");
            return;
        }
        this.buffer = bArr;
        this.position = i;
        this.limit = i + i2;
        this.capacity = bArr.length;
        this.total = 0L;
        this.inputStream = null;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        this.limit = 0;
        reset();
    }

    public void setLimit(int i) {
        this.limit = i;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setTotal(long j) {
        this.total = j;
    }

    public void setVariableLengthEncoding(boolean z) {
        this.varEncoding = z;
    }

    public void skip(int i) {
        int iMin = Math.min(this.limit - this.position, i);
        while (true) {
            this.position += iMin;
            i -= iMin;
            if (i == 0) {
                return;
            }
            iMin = Math.min(i, this.capacity);
            require(iMin);
        }
    }

    public long total() {
        return this.total + ((long) this.position);
    }

    public Input() {
        this.chars = new char[32];
        this.varEncoding = true;
    }

    public Input(byte[] bArr) {
        this.chars = new char[32];
        this.varEncoding = true;
        setBuffer(bArr, 0, bArr.length);
    }

    public Input(byte[] bArr, int i, int i2) {
        this.chars = new char[32];
        this.varEncoding = true;
        setBuffer(bArr, i, i2);
    }

    public void setBuffer(byte[] bArr) {
        setBuffer(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(2147483639L, j2);
            skip(iMin);
            j2 -= (long) iMin;
        }
        return j;
    }

    public Input(InputStream inputStream) {
        this(4096);
        if (inputStream != null) {
            this.inputStream = inputStream;
        } else {
            C5925.m11310("inputStream cannot be null.");
            throw null;
        }
    }

    public Input(InputStream inputStream, int i) {
        this(i);
        if (inputStream != null) {
            this.inputStream = inputStream;
        } else {
            C5925.m11310("inputStream cannot be null.");
            throw null;
        }
    }

    public void readBytes(byte[] bArr) {
        readBytes(bArr, 0, bArr.length);
    }

    public byte[] readBytes(int i) {
        byte[] bArr = new byte[i];
        readBytes(bArr, 0, i);
        return bArr;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() {
        if (optional(1) <= 0) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & DefaultClassResolver.NAME;
    }

    public int[] readInts(int i, boolean z) {
        if (this.varEncoding) {
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = readVarInt(z);
            }
            return iArr;
        }
        return readInts(i);
    }

    public long readLong(int i) {
        if (i < 0 || i > 8) {
            C5925.m11310(AbstractC6183.m11588(i, "count must be >= 0 and <= 8: "));
            return 0L;
        }
        if (i <= 4) {
            return readInt(i);
        }
        require(i);
        return (((long) readInt(4)) & 4294967295L) | (((long) readInt(i - 4)) << 32);
    }

    public boolean readVarIntFlag() {
        if (this.position == this.limit) {
            require(1);
        }
        return (this.buffer[this.position] & 128) != 0;
    }

    public long readLong(boolean z) {
        return this.varEncoding ? readVarLong(z) : readLong();
    }

    public int readInt() {
        require(4);
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 4;
        return (bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16) | ((bArr[i + 3] & DefaultClassResolver.NAME) << 24);
    }

    public long[] readLongs(int i, boolean z) {
        if (this.varEncoding) {
            long[] jArr = new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr[i2] = readVarLong(z);
            }
            return jArr;
        }
        return readLongs(i);
    }

    public int readInt(boolean z) {
        return this.varEncoding ? readVarInt(z) : readInt();
    }
}
