package Yue;

import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3396 implements InterfaceC7015 {

    /* JADX INFO: renamed from: ۥ */
    public byte[] f270;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f271;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3396() {
        this(10);
    }

    @Override // Yue.InterfaceC7011
    public byte[] data() {
        return this.f270;
    }

    @Override // Yue.InterfaceC7011
    public byte get(int i) {
        return this.f270[i];
    }

    @Override // Yue.InterfaceC7011
    public boolean getBoolean(int i) {
        return this.f270[i] != 0;
    }

    @Override // Yue.InterfaceC7011
    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    @Override // Yue.InterfaceC7011
    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    @Override // Yue.InterfaceC7011
    public int getInt(int i) {
        byte[] bArr = this.f270;
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    @Override // Yue.InterfaceC7011
    public long getLong(int i) {
        byte[] bArr = this.f270;
        int i2 = i + 6;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i2]) & 255) << 48) | (((long) bArr[i + 7]) << 56);
    }

    @Override // Yue.InterfaceC7011
    public short getShort(int i) {
        byte[] bArr = this.f270;
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    @Override // Yue.InterfaceC7011
    public String getString(int i, int i2) {
        return C8154.m26822(this.f270, i, i2);
    }

    @Override // Yue.InterfaceC7015, Yue.InterfaceC7011
    public int limit() {
        return this.f271;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC7015
    public void put(byte[] bArr, int i, int i2) {
        set(this.f271, bArr, i, i2);
        this.f271 += i2;
    }

    @Override // Yue.InterfaceC7015
    public void putBoolean(boolean z) {
        setBoolean(this.f271, z);
        this.f271++;
    }

    @Override // Yue.InterfaceC7015
    public void putDouble(double d) {
        setDouble(this.f271, d);
        this.f271 += 8;
    }

    @Override // Yue.InterfaceC7015
    public void putFloat(float f) {
        setFloat(this.f271, f);
        this.f271 += 4;
    }

    @Override // Yue.InterfaceC7015
    public void putInt(int i) {
        setInt(this.f271, i);
        this.f271 += 4;
    }

    @Override // Yue.InterfaceC7015
    public void putLong(long j) {
        setLong(this.f271, j);
        this.f271 += 8;
    }

    @Override // Yue.InterfaceC7015
    public void putShort(short s) {
        setShort(this.f271, s);
        this.f271 += 2;
    }

    @Override // Yue.InterfaceC7015
    public boolean requestCapacity(int i) {
        byte[] bArr = this.f270;
        if (bArr.length > i) {
            return true;
        }
        int length = bArr.length;
        this.f270 = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC7015
    public void set(int i, byte b) {
        requestCapacity(i + 1);
        this.f270[i] = b;
    }

    @Override // Yue.InterfaceC7015
    public void setBoolean(int i, boolean z) {
        set(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // Yue.InterfaceC7015
    public void setDouble(int i, double d) {
        requestCapacity(i + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i2 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.f270;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
        int i3 = (int) (jDoubleToRawLongBits >> 32);
        bArr[i + 4] = (byte) (i3 & 255);
        bArr[i + 5] = (byte) ((i3 >> 8) & 255);
        bArr[i + 6] = (byte) ((i3 >> 16) & 255);
        bArr[i + 7] = (byte) ((i3 >> 24) & 255);
    }

    @Override // Yue.InterfaceC7015
    public void setFloat(int i, float f) {
        requestCapacity(i + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        byte[] bArr = this.f270;
        bArr[i] = (byte) (iFloatToRawIntBits & 255);
        bArr[i + 1] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i + 2] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i + 3] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    @Override // Yue.InterfaceC7015
    public void setInt(int i, int i2) {
        requestCapacity(i + 4);
        byte[] bArr = this.f270;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    @Override // Yue.InterfaceC7015
    public void setLong(int i, long j) {
        requestCapacity(i + 8);
        int i2 = (int) j;
        byte[] bArr = this.f270;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
        int i3 = (int) (j >> 32);
        bArr[i + 4] = (byte) (i3 & 255);
        bArr[i + 5] = (byte) ((i3 >> 8) & 255);
        bArr[i + 6] = (byte) ((i3 >> 16) & 255);
        bArr[i + 7] = (byte) ((i3 >> 24) & 255);
    }

    @Override // Yue.InterfaceC7015
    public void setShort(int i, short s) {
        requestCapacity(i + 2);
        byte[] bArr = this.f270;
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    @Override // Yue.InterfaceC7015
    public int writePosition() {
        return this.f271;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3396(int i) {
        this(new byte[i]);
    }

    public C3396(byte[] bArr) {
        this.f270 = bArr;
        this.f271 = 0;
    }

    @Override // Yue.InterfaceC7015
    public void put(byte b) {
        set(this.f271, b);
        this.f271++;
    }

    @Override // Yue.InterfaceC7015
    public void set(int i, byte[] bArr, int i2, int i3) {
        requestCapacity((i3 - i2) + i);
        System.arraycopy(bArr, i2, this.f270, i, i3);
    }

    public C3396(byte[] bArr, int i) {
        this.f270 = bArr;
        this.f271 = i;
    }
}
