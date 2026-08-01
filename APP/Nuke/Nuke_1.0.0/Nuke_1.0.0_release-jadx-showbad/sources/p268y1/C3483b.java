package p268y1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: y1.b */
/* JADX INFO: loaded from: classes.dex */
public class C3483b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: h */
    public static final ByteOrder f10812h = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: i */
    public static final ByteOrder f10813i = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: d */
    public final DataInputStream f10814d;

    /* JADX INFO: renamed from: e */
    public ByteOrder f10815e;

    /* JADX INFO: renamed from: f */
    public int f10816f;

    /* JADX INFO: renamed from: g */
    public byte[] f10817g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3483b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int available() {
        return this.f10814d.available();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5712b(int i5) throws IOException {
        int i6 = 0;
        while (i6 < i5) {
            int i7 = i5 - i6;
            DataInputStream dataInputStream = this.f10814d;
            int iSkip = (int) dataInputStream.skip(i7);
            if (iSkip <= 0) {
                if (this.f10817g == null) {
                    this.f10817g = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f10817g, 0, Math.min(8192, i7));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC0231b.m397h(i5, "Reached EOF while skipping ", " bytes."));
                }
            }
            i6 += iSkip;
        }
        this.f10816f += i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void mark(int i5) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read() {
        this.f10816f++;
        return this.f10814d.read();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f10816f++;
        return this.f10814d.readBoolean();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f10816f++;
        int i5 = this.f10814d.read();
        if (i5 >= 0) {
            return (byte) i5;
        }
        throw new EOFException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final char readChar() {
        this.f10816f += 2;
        return this.f10814d.readChar();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i5, int i6) throws IOException {
        this.f10816f += i6;
        this.f10814d.readFully(bArr, i5, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f10816f += 4;
        DataInputStream dataInputStream = this.f10814d;
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10815e;
        if (byteOrder == f10812h) {
            return (i8 << 24) + (i7 << 16) + (i6 << 8) + i5;
        }
        if (byteOrder == f10813i) {
            return (i5 << 24) + (i6 << 16) + (i7 << 8) + i8;
        }
        throw new IOException("Invalid byte order: " + this.f10815e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j5;
        long j6;
        this.f10816f += 8;
        DataInputStream dataInputStream = this.f10814d;
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i5 | i6 | i7 | i8 | i9 | i10 | i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10815e;
        if (byteOrder == f10812h) {
            j5 = (((long) i12) << 56) + (((long) i11) << 48) + (((long) i10) << 40) + (((long) i9) << 32) + (((long) i8) << 24) + (((long) i7) << 16) + (((long) i6) << 8);
            j6 = i5;
        } else {
            if (byteOrder != f10813i) {
                throw new IOException("Invalid byte order: " + this.f10815e);
            }
            j5 = (((long) i5) << 56) + (((long) i6) << 48) + (((long) i7) << 40) + (((long) i8) << 32) + (((long) i9) << 24) + (((long) i10) << 16) + (((long) i11) << 8);
            j6 = i12;
        }
        return j5 + j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f10816f += 2;
        DataInputStream dataInputStream = this.f10814d;
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        if ((i5 | i6) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10815e;
        if (byteOrder == f10812h) {
            return (short) ((i6 << 8) + i5);
        }
        if (byteOrder == f10813i) {
            return (short) ((i5 << 8) + i6);
        }
        throw new IOException("Invalid byte order: " + this.f10815e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final String readUTF() {
        this.f10816f += 2;
        return this.f10814d.readUTF();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f10816f++;
        return this.f10814d.readUnsignedByte();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f10816f += 2;
        DataInputStream dataInputStream = this.f10814d;
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        if ((i5 | i6) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10815e;
        if (byteOrder == f10812h) {
            return (i6 << 8) + i5;
        }
        if (byteOrder == f10813i) {
            return (i5 << 8) + i6;
        }
        throw new IOException("Invalid byte order: " + this.f10815e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.DataInput
    public final int skipBytes(int i5) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3483b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C3483b(InputStream inputStream, int i5) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f10815e = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f10814d = dataInputStream;
        dataInputStream.mark(0);
        this.f10816f = 0;
        this.f10815e = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) throws IOException {
        int i7 = this.f10814d.read(bArr, i5, i6);
        this.f10816f += i7;
        return i7;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f10816f += bArr.length;
        this.f10814d.readFully(bArr);
    }
}
