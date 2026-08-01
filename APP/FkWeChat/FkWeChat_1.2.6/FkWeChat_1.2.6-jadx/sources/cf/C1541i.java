package cf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p024b9.AbstractC1043k;
import p322w5.AbstractC9187b;

/* JADX INFO: renamed from: cf.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1541i extends AbstractC9187b {

    /* JADX INFO: renamed from: f */
    public static final a f4511f = new a(null);

    /* JADX INFO: renamed from: l */
    public final C1541i m6070l(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m6071m(i10, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m6071m(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m35788d(i10, byteBuffer);
    }

    /* JADX INFO: renamed from: n */
    public final C1539h m6072n(int i10) {
        return m6073o(new C1539h(), i10);
    }

    /* JADX INFO: renamed from: o */
    public final C1539h m6073o(C1539h c1539h, int i10) {
        c1539h.getClass();
        int iM35787c = m35787c(4);
        if (iM35787c == 0) {
            return null;
        }
        int iM35786a = m35786a(m35791i(iM35787c) + (i10 * 4));
        ByteBuffer byteBuffer = this.f31405b;
        byteBuffer.getClass();
        return c1539h.m6052l(iM35786a, byteBuffer);
    }

    /* JADX INFO: renamed from: p */
    public final int m6074p() {
        int iM35787c = m35787c(4);
        if (iM35787c != 0) {
            return m35793k(iM35787c);
        }
        return 0;
    }

    /* JADX INFO: renamed from: cf.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1541i m6075a(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return m6076b(byteBuffer, new C1541i());
        }

        /* JADX INFO: renamed from: b */
        public final C1541i m6076b(ByteBuffer byteBuffer, C1541i c1541i) {
            byteBuffer.getClass();
            c1541i.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return c1541i.m6070l(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        }

        public a() {
        }
    }
}
