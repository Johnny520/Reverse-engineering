package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0871 implements Yue.InterfaceC5204 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.nio.ByteBuffer f2545;

    public C0871(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.<init>()
            r1.f2545 = r2
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            return
    }

    @Override // Yue.InterfaceC5200
    public byte[] data() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            byte[] r0 = r0.array()
            return r0
    }

    @Override // Yue.InterfaceC5200
    public byte get(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            byte r2 = r0.get(r2)
            return r2
    }

    @Override // Yue.InterfaceC5200
    public boolean getBoolean(int r1) {
            r0 = this;
            byte r1 = r0.get(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // Yue.InterfaceC5200
    public double getDouble(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f2545
            double r0 = r0.getDouble(r3)
            return r0
    }

    @Override // Yue.InterfaceC5200
    public float getFloat(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            float r2 = r0.getFloat(r2)
            return r2
    }

    @Override // Yue.InterfaceC5200
    public int getInt(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // Yue.InterfaceC5200
    public long getLong(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f2545
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // Yue.InterfaceC5200
    public short getShort(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            short r2 = r0.getShort(r2)
            return r2
    }

    @Override // Yue.InterfaceC5200
    public java.lang.String getString(int r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            java.lang.String r2 = Yue.C6649.m25542(r0, r2, r3)
            return r2
    }

    @Override // Yue.InterfaceC5204, Yue.InterfaceC5200
    public int limit() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            int r0 = r0.limit()
            return r0
    }

    @Override // Yue.InterfaceC5204
    public void put(byte r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            r0.put(r2)
            return
    }

    @Override // Yue.InterfaceC5204
    public void put(byte[] r2, int r3, int r4) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            r0.put(r2, r3, r4)
            return
    }

    @Override // Yue.InterfaceC5204
    public void putBoolean(boolean r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            r0.put(r2)
            return
    }

    @Override // Yue.InterfaceC5204
    public void putDouble(double r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            r0.putDouble(r2)
            return
    }

    @Override // Yue.InterfaceC5204
    public void putFloat(float r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            r0.putFloat(r2)
            return
    }

    @Override // Yue.InterfaceC5204
    public void putInt(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            r0.putInt(r2)
            return
    }

    @Override // Yue.InterfaceC5204
    public void putLong(long r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            r0.putLong(r2)
            return
    }

    @Override // Yue.InterfaceC5204
    public void putShort(short r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            r0.putShort(r2)
            return
    }

    @Override // Yue.InterfaceC5204
    public boolean requestCapacity(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            int r0 = r0.limit()
            if (r2 > r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // Yue.InterfaceC5204
    public void set(int r2, byte r3) {
            r1 = this;
            int r0 = r2 + 1
            r1.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r1.f2545
            r0.put(r2, r3)
            return
    }

    @Override // Yue.InterfaceC5204
    public void set(int r3, byte[] r4, int r5, int r6) {
            r2 = this;
            int r0 = r6 - r5
            int r0 = r0 + r3
            r2.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r2.f2545
            int r0 = r0.position()
            java.nio.ByteBuffer r1 = r2.f2545
            r1.position(r3)
            java.nio.ByteBuffer r3 = r2.f2545
            r3.put(r4, r5, r6)
            java.nio.ByteBuffer r3 = r2.f2545
            r3.position(r0)
            return
    }

    @Override // Yue.InterfaceC5204
    public void setBoolean(int r1, boolean r2) {
            r0 = this;
            r0.set(r1, r2)
            return
    }

    @Override // Yue.InterfaceC5204
    public void setDouble(int r2, double r3) {
            r1 = this;
            int r0 = r2 + 8
            r1.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r1.f2545
            r0.putDouble(r2, r3)
            return
    }

    @Override // Yue.InterfaceC5204
    public void setFloat(int r2, float r3) {
            r1 = this;
            int r0 = r2 + 4
            r1.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r1.f2545
            r0.putFloat(r2, r3)
            return
    }

    @Override // Yue.InterfaceC5204
    public void setInt(int r2, int r3) {
            r1 = this;
            int r0 = r2 + 4
            r1.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r1.f2545
            r0.putInt(r2, r3)
            return
    }

    @Override // Yue.InterfaceC5204
    public void setLong(int r2, long r3) {
            r1 = this;
            int r0 = r2 + 8
            r1.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r1.f2545
            r0.putLong(r2, r3)
            return
    }

    @Override // Yue.InterfaceC5204
    public void setShort(int r2, short r3) {
            r1 = this;
            int r0 = r2 + 2
            r1.requestCapacity(r0)
            java.nio.ByteBuffer r0 = r1.f2545
            r0.putShort(r2, r3)
            return
    }

    @Override // Yue.InterfaceC5204
    public int writePosition() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f2545
            int r0 = r0.position()
            return r0
    }
}
