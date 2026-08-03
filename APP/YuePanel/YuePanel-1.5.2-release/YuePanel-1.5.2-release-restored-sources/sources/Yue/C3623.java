package Yue;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3623 implements InterfaceC7015 {

    /* JADX INFO: renamed from: ۥ */
    public final ByteBuffer f421;

    public C3623(ByteBuffer byteBuffer) {
        this.f421 = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // Yue.InterfaceC7011
    public byte[] data() {
        return this.f421.array();
    }

    @Override // Yue.InterfaceC7011
    public byte get(int i) {
        return this.f421.get(i);
    }

    @Override // Yue.InterfaceC7011
    public boolean getBoolean(int i) {
        return get(i) != 0;
    }

    @Override // Yue.InterfaceC7011
    public double getDouble(int i) {
        return this.f421.getDouble(i);
    }

    @Override // Yue.InterfaceC7011
    public float getFloat(int i) {
        return this.f421.getFloat(i);
    }

    @Override // Yue.InterfaceC7011
    public int getInt(int i) {
        return this.f421.getInt(i);
    }

    @Override // Yue.InterfaceC7011
    public long getLong(int i) {
        return this.f421.getLong(i);
    }

    @Override // Yue.InterfaceC7011
    public short getShort(int i) {
        return this.f421.getShort(i);
    }

    @Override // Yue.InterfaceC7011
    public String getString(int i, int i2) {
        return C8154.m26823(this.f421, i, i2);
    }

    @Override // Yue.InterfaceC7015, Yue.InterfaceC7011
    public int limit() {
        return this.f421.limit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC7015
    public void put(byte[] bArr, int i, int i2) {
        this.f421.put(bArr, i, i2);
    }

    @Override // Yue.InterfaceC7015
    public void putBoolean(boolean z) {
        this.f421.put(z ? (byte) 1 : (byte) 0);
    }

    @Override // Yue.InterfaceC7015
    public void putDouble(double d) {
        this.f421.putDouble(d);
    }

    @Override // Yue.InterfaceC7015
    public void putFloat(float f) {
        this.f421.putFloat(f);
    }

    @Override // Yue.InterfaceC7015
    public void putInt(int i) {
        this.f421.putInt(i);
    }

    @Override // Yue.InterfaceC7015
    public void putLong(long j) {
        this.f421.putLong(j);
    }

    @Override // Yue.InterfaceC7015
    public void putShort(short s) {
        this.f421.putShort(s);
    }

    @Override // Yue.InterfaceC7015
    public boolean requestCapacity(int i) {
        return i <= this.f421.limit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC7015
    public void set(int i, byte b) {
        requestCapacity(i + 1);
        this.f421.put(i, b);
    }

    @Override // Yue.InterfaceC7015
    public void setBoolean(int i, boolean z) {
        set(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // Yue.InterfaceC7015
    public void setDouble(int i, double d) {
        requestCapacity(i + 8);
        this.f421.putDouble(i, d);
    }

    @Override // Yue.InterfaceC7015
    public void setFloat(int i, float f) {
        requestCapacity(i + 4);
        this.f421.putFloat(i, f);
    }

    @Override // Yue.InterfaceC7015
    public void setInt(int i, int i2) {
        requestCapacity(i + 4);
        this.f421.putInt(i, i2);
    }

    @Override // Yue.InterfaceC7015
    public void setLong(int i, long j) {
        requestCapacity(i + 8);
        this.f421.putLong(i, j);
    }

    @Override // Yue.InterfaceC7015
    public void setShort(int i, short s) {
        requestCapacity(i + 2);
        this.f421.putShort(i, s);
    }

    @Override // Yue.InterfaceC7015
    public int writePosition() {
        return this.f421.position();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC7015
    public void put(byte b) {
        this.f421.put(b);
    }

    @Override // Yue.InterfaceC7015
    public void set(int i, byte[] bArr, int i2, int i3) {
        requestCapacity((i3 - i2) + i);
        int iPosition = this.f421.position();
        this.f421.position(i);
        this.f421.put(bArr, i2, i3);
        this.f421.position(iPosition);
    }
}
