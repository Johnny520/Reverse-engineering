package cf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p024b9.AbstractC1043k;
import p322w5.AbstractC9187b;

/* JADX INFO: renamed from: cf.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1532d0 extends AbstractC9187b {

    /* JADX INFO: renamed from: f */
    public static final a f4502f = new a(null);

    /* JADX INFO: renamed from: l */
    public final C1532d0 m5999l(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m6000m(i10, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m6000m(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m35788d(i10, byteBuffer);
    }

    /* JADX INFO: renamed from: n */
    public final int m6001n() {
        int iM35787c = m35787c(4);
        if (iM35787c != 0) {
            return m35793k(iM35787c);
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final C1530c0 m6002o(int i10) {
        return m6003p(new C1530c0(), i10);
    }

    /* JADX INFO: renamed from: p */
    public final C1530c0 m6003p(C1530c0 c1530c0, int i10) {
        c1530c0.getClass();
        int iM35787c = m35787c(4);
        if (iM35787c == 0) {
            return null;
        }
        int iM35786a = m35786a(m35791i(iM35787c) + (i10 * 4));
        ByteBuffer byteBuffer = this.f31405b;
        byteBuffer.getClass();
        return c1530c0.m5985l(iM35786a, byteBuffer);
    }

    /* JADX INFO: renamed from: cf.d0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1532d0 m6004a(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return m6005b(byteBuffer, new C1532d0());
        }

        /* JADX INFO: renamed from: b */
        public final C1532d0 m6005b(ByteBuffer byteBuffer, C1532d0 c1532d0) {
            byteBuffer.getClass();
            c1532d0.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return c1532d0.m5999l(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        }

        public a() {
        }
    }
}
