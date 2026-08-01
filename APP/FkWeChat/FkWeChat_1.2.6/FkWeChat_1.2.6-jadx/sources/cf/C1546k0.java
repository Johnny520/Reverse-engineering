package cf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p024b9.AbstractC1043k;
import p322w5.AbstractC9187b;

/* JADX INFO: renamed from: cf.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1546k0 extends AbstractC9187b {

    /* JADX INFO: renamed from: f */
    public static final a f4516f = new a(null);

    /* JADX INFO: renamed from: l */
    public final C1546k0 m6092l(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m6093m(i10, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m6093m(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m35788d(i10, byteBuffer);
    }

    /* JADX INFO: renamed from: n */
    public final int m6094n() {
        int iM35787c = m35787c(4);
        if (iM35787c != 0) {
            return m35793k(iM35787c);
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final C1544j0 m6095o(int i10) {
        return m6096p(new C1544j0(), i10);
    }

    /* JADX INFO: renamed from: p */
    public final C1544j0 m6096p(C1544j0 c1544j0, int i10) {
        c1544j0.getClass();
        int iM35787c = m35787c(4);
        if (iM35787c == 0) {
            return null;
        }
        int iM35786a = m35786a(m35791i(iM35787c) + (i10 * 4));
        ByteBuffer byteBuffer = this.f31405b;
        byteBuffer.getClass();
        return c1544j0.m6083l(iM35786a, byteBuffer);
    }

    /* JADX INFO: renamed from: cf.k0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1546k0 m6097a(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return m6098b(byteBuffer, new C1546k0());
        }

        /* JADX INFO: renamed from: b */
        public final C1546k0 m6098b(ByteBuffer byteBuffer, C1546k0 c1546k0) {
            byteBuffer.getClass();
            c1546k0.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return c1546k0.m6092l(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        }

        public a() {
        }
    }
}
