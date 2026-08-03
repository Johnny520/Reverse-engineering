package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: Ag */
/* JADX INFO: loaded from: classes.dex */
public class C0023Ag extends InputStream implements DataInput {

    /* JADX INFO: renamed from: a */
    public final DataInputStream f45a;

    /* JADX INFO: renamed from: b */
    public int f46b;

    /* JADX INFO: renamed from: c */
    public ByteOrder f47c;

    /* JADX INFO: renamed from: d */
    public byte[] f48d;

    /* JADX INFO: renamed from: e */
    public final int f49e;

    public C0023Ag(byte[] r3) {
        ByteArrayInputStream r0 = new ByteArrayInputStream(r3);
        ByteOrder r1 = ByteOrder.BIG_ENDIAN;
        this(r0, 0);
        this.f49e = r3.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f45a.available();
    }

    /* JADX INFO: renamed from: d */
    public final void m34d(int r7) {
        int r1 = 0;
    L3:
        if (r1 >= r7) goto L15;
        int r2 = r7 - r1;
        DataInputStream r5 = this.f45a;
        int r3 = (int) r5.skip(r2);
        if (r3 > 0) goto L14;
        if (this.f48d != null) goto L9;
        this.f48d = new byte[8192];
    L9:
        r3 = r5.read(this.f48d, 0, Math.min(8192, r2));
        if (r3 != (-1)) goto L14;
        throw new EOFException(AbstractC2374ph.m4813j(r7, "Reached EOF while skipping ", " bytes."));
    L14:
        r1 = r1 + r3;
        goto L3
    L15:
        this.f46b += r1;
    }

    @Override // java.io.InputStream
    public final void mark(int r2) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f46b++;
        return this.f45a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f46b++;
        return this.f45a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f46b++;
        int r0 = this.f45a.read();
        if (r0 < 0) goto L7;
        return (byte) r0;
    L7:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f46b += 2;
        return this.f45a.readChar();
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
    public final void readFully(byte[] r2, int r3, int r4) {
        this.f46b += r4;
        this.f45a.readFully(r2, r3, r4);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f46b += 4;
        DataInputStream r0 = this.f45a;
        int r1 = r0.read();
        int r2 = r0.read();
        int r3 = r0.read();
        int r02 = r0.read();
        if ((((r1 | r2) | r3) | r02) < 0) goto L15;
        ByteOrder r4 = this.f47c;
        if (r4 != ByteOrder.LITTLE_ENDIAN) goto L9;
        return (((r02 << 24) + (r3 << 16)) + (r2 << 8)) + r1;
    L9:
        if (r4 != ByteOrder.BIG_ENDIAN) goto L13;
        return (((r1 << 24) + (r2 << 16)) + (r3 << 8)) + r02;
    L13:
        throw new IOException("Invalid byte order: " + this.f47c);
    L15:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f46b += 8;
        DataInputStream r1 = this.f45a;
        int r3 = r1.read();
        int r4 = r1.read();
        int r5 = r1.read();
        int r6 = r1.read();
        int r7 = r1.read();
        int r8 = r1.read();
        int r9 = r1.read();
        int r12 = r1.read();
        if ((((((((r3 | r4) | r5) | r6) | r7) | r8) | r9) | r12) < 0) goto L15;
        ByteOrder r10 = this.f47c;
        if (r10 != ByteOrder.LITTLE_ENDIAN) goto L10;
        long r102 = ((((((((long) r12) << 56) + (((long) r9) << 48)) + (((long) r8) << 40)) + (((long) r7) << 32)) + (((long) r6) << 24)) + (((long) r5) << 16)) + (((long) r4) << 8);
        long r13 = r3;
    L8:
        return r102 + r13;
    L10:
        if (r10 != ByteOrder.BIG_ENDIAN) goto L13;
        r102 = ((((((((long) r3) << 56) + (((long) r4) << 48)) + (((long) r5) << 40)) + (((long) r6) << 32)) + (((long) r7) << 24)) + (((long) r8) << 16)) + (((long) r9) << 8);
        r13 = r12;
        goto L8
    L13:
        throw new IOException("Invalid byte order: " + this.f47c);
    L15:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f46b += 2;
        DataInputStream r0 = this.f45a;
        int r1 = r0.read();
        int r02 = r0.read();
        if ((r1 | r02) < 0) goto L15;
        ByteOrder r2 = this.f47c;
        if (r2 != ByteOrder.LITTLE_ENDIAN) goto L9;
        return (short) ((r02 << 8) + r1);
    L9:
        if (r2 != ByteOrder.BIG_ENDIAN) goto L13;
        return (short) ((r1 << 8) + r02);
    L13:
        throw new IOException("Invalid byte order: " + this.f47c);
    L15:
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f46b += 2;
        return this.f45a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f46b++;
        return this.f45a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f46b += 2;
        DataInputStream r0 = this.f45a;
        int r1 = r0.read();
        int r02 = r0.read();
        if ((r1 | r02) < 0) goto L15;
        ByteOrder r2 = this.f47c;
        if (r2 != ByteOrder.LITTLE_ENDIAN) goto L9;
        return (r02 << 8) + r1;
    L9:
        if (r2 != ByteOrder.BIG_ENDIAN) goto L13;
        return (r1 << 8) + r02;
    L13:
        throw new IOException("Invalid byte order: " + this.f47c);
    L15:
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int r2) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C0023Ag(InputStream r2) {
        ByteOrder r0 = ByteOrder.BIG_ENDIAN;
        this(r2, 0);
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        int r22 = this.f45a.read(r2, r3, r4);
        this.f46b += r22;
        return r22;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] r3) {
        this.f46b += r3.length;
        this.f45a.readFully(r3);
    }

    public C0023Ag(InputStream r3, int r4) {
        ByteOrder r42 = ByteOrder.BIG_ENDIAN;
        DataInputStream r0 = new DataInputStream(r3);
        this.f45a = r0;
        r0.mark(0);
        this.f46b = 0;
        this.f47c = r42;
        if ((r3 instanceof C0023Ag) == false) goto L5;
        int r32 = ((C0023Ag) r3).f49e;
    L6:
        this.f49e = r32;
        return;
    L5:
        r32 = -1;
        goto L6
    }
}
