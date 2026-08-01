package cf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p024b9.AbstractC1043k;
import p322w5.AbstractC9187b;

/* JADX INFO: renamed from: cf.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1557v extends AbstractC9187b {

    /* JADX INFO: renamed from: f */
    public static final a f4527f = new a(null);

    /* JADX INFO: renamed from: l */
    public final C1557v m6142l(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m6143m(i10, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m6143m(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m35788d(i10, byteBuffer);
    }

    /* JADX INFO: renamed from: n */
    public final C1556u m6144n(int i10) {
        return m6145o(new C1556u(), i10);
    }

    /* JADX INFO: renamed from: o */
    public final C1556u m6145o(C1556u c1556u, int i10) {
        c1556u.getClass();
        int iM35787c = m35787c(4);
        if (iM35787c == 0) {
            return null;
        }
        int iM35786a = m35786a(m35791i(iM35787c) + (i10 * 4));
        ByteBuffer byteBuffer = this.f31405b;
        byteBuffer.getClass();
        return c1556u.m6134l(iM35786a, byteBuffer);
    }

    /* JADX INFO: renamed from: p */
    public final int m6146p() {
        int iM35787c = m35787c(4);
        if (iM35787c != 0) {
            return m35793k(iM35787c);
        }
        return 0;
    }

    /* JADX INFO: renamed from: cf.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1557v m6147a(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return m6148b(byteBuffer, new C1557v());
        }

        /* JADX INFO: renamed from: b */
        public final C1557v m6148b(ByteBuffer byteBuffer, C1557v c1557v) {
            byteBuffer.getClass();
            c1557v.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return c1557v.m6142l(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        }

        public a() {
        }
    }
}
