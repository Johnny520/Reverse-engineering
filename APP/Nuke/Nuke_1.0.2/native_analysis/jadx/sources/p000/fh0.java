package p000;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class fh0 extends InputStream implements DataInput {

    /* JADX INFO: renamed from: l */
    public static final ByteOrder f3000l = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: m */
    public static final ByteOrder f3001m = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: h */
    public final DataInputStream f3002h;

    /* JADX INFO: renamed from: i */
    public ByteOrder f3003i;

    /* JADX INFO: renamed from: j */
    public int f3004j;

    /* JADX INFO: renamed from: k */
    public byte[] f3005k;

    public fh0(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f3003i = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f3002h = dataInputStream;
        dataInputStream.mark(0);
        this.f3004j = 0;
        this.f3003i = byteOrder;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f3002h.available();
    }

    /* JADX INFO: renamed from: b */
    public final void m1654b(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.f3002h;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f3005k == null) {
                    this.f3005k = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f3005k, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(hk1.m2208g(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.f3004j += i2;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f3004j++;
        return this.f3002h.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f3004j++;
        return this.f3002h.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f3004j++;
        int i = this.f3002h.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f3004j += 2;
        return this.f3002h.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f3004j += bArr.length;
        this.f3002h.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f3004j += 4;
        DataInputStream dataInputStream = this.f3002h;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f3003i;
        if (byteOrder == f3000l) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == f3001m) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        c80.m679w("Invalid byte order: ", this.f3003i);
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f3004j += 8;
        DataInputStream dataInputStream = this.f3002h;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f3003i;
        if (byteOrder == f3000l) {
            return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
        }
        if (byteOrder == f3001m) {
            return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
        }
        c80.m679w("Invalid byte order: ", this.f3003i);
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f3004j += 2;
        DataInputStream dataInputStream = this.f3002h;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f3003i;
        if (byteOrder == f3000l) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == f3001m) {
            return (short) ((i << 8) + i2);
        }
        c80.m679w("Invalid byte order: ", this.f3003i);
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f3004j += 2;
        return this.f3002h.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f3004j++;
        return this.f3002h.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f3004j += 2;
        DataInputStream dataInputStream = this.f3002h;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f3003i;
        if (byteOrder == f3000l) {
            return (i2 << 8) + i;
        }
        if (byteOrder == f3001m) {
            return (i << 8) + i2;
        }
        c80.m679w("Invalid byte order: ", this.f3003i);
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f3004j += i2;
        this.f3002h.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f3002h.read(bArr, i, i2);
        this.f3004j += i3;
        return i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fh0(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public fh0(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }
}
