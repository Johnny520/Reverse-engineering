package p044d4;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: d4.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1873a extends AbstractC1875c {
    /* JADX INFO: renamed from: f */
    public C1873a m6637f(int i10, ByteBuffer byteBuffer) {
        m6638g(i10, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m6638g(int i10, ByteBuffer byteBuffer) {
        m6655c(i10, byteBuffer);
    }

    /* JADX INFO: renamed from: h */
    public int m6639h(int i10) {
        int iM6654b = m6654b(16);
        if (iM6654b != 0) {
            return this.f5207b.getInt(m6656d(iM6654b) + (i10 * 4));
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public int m6640i() {
        int iM6654b = m6654b(16);
        if (iM6654b != 0) {
            return m6657e(iM6654b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public boolean m6641j() {
        int iM6654b = m6654b(6);
        return (iM6654b == 0 || this.f5207b.get(iM6654b + this.f5206a) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public short m6642k() {
        int iM6654b = m6654b(14);
        if (iM6654b != 0) {
            return this.f5207b.getShort(iM6654b + this.f5206a);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: l */
    public int m6643l() {
        int iM6654b = m6654b(4);
        if (iM6654b != 0) {
            return this.f5207b.getInt(iM6654b + this.f5206a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public short m6644m() {
        int iM6654b = m6654b(8);
        if (iM6654b != 0) {
            return this.f5207b.getShort(iM6654b + this.f5206a);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: n */
    public short m6645n() {
        int iM6654b = m6654b(12);
        if (iM6654b != 0) {
            return this.f5207b.getShort(iM6654b + this.f5206a);
        }
        return (short) 0;
    }
}
