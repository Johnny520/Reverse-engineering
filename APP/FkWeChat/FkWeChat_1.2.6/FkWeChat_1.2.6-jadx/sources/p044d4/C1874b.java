package p044d4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: d4.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1874b extends AbstractC1875c {
    /* JADX INFO: renamed from: h */
    public static C1874b m6646h(ByteBuffer byteBuffer) {
        return m6647i(byteBuffer, new C1874b());
    }

    /* JADX INFO: renamed from: i */
    public static C1874b m6647i(ByteBuffer byteBuffer, C1874b c1874b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c1874b.m6648f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* JADX INFO: renamed from: f */
    public C1874b m6648f(int i10, ByteBuffer byteBuffer) {
        m6649g(i10, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m6649g(int i10, ByteBuffer byteBuffer) {
        m6655c(i10, byteBuffer);
    }

    /* JADX INFO: renamed from: j */
    public C1873a m6650j(C1873a c1873a, int i10) {
        int iM6654b = m6654b(6);
        if (iM6654b != 0) {
            return c1873a.m6637f(m6653a(m6656d(iM6654b) + (i10 * 4)), this.f5207b);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public int m6651k() {
        int iM6654b = m6654b(6);
        if (iM6654b != 0) {
            return m6657e(iM6654b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public int m6652l() {
        int iM6654b = m6654b(4);
        if (iM6654b != 0) {
            return this.f5207b.getInt(iM6654b + this.f5206a);
        }
        return 0;
    }
}
