package cf;

import java.nio.ByteBuffer;
import p024b9.AbstractC1043k;
import p322w5.AbstractC9187b;

/* JADX INFO: renamed from: cf.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1544j0 extends AbstractC9187b {

    /* JADX INFO: renamed from: f */
    public static final a f4514f = new a(null);

    /* JADX INFO: renamed from: l */
    public final C1544j0 m6083l(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m6084m(i10, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m6084m(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m35788d(i10, byteBuffer);
    }

    /* JADX INFO: renamed from: n */
    public final C1556u m6085n(C1556u c1556u) {
        c1556u.getClass();
        int iM35787c = m35787c(4);
        if (iM35787c == 0) {
            return null;
        }
        int iM35786a = m35786a(iM35787c + this.f31404a);
        ByteBuffer byteBuffer = this.f31405b;
        byteBuffer.getClass();
        return c1556u.m6134l(iM35786a, byteBuffer);
    }

    /* JADX INFO: renamed from: o */
    public final C1556u m6086o() {
        return m6085n(new C1556u());
    }

    /* JADX INFO: renamed from: p */
    public final byte m6087p() {
        int iM35787c = m35787c(6);
        if (iM35787c != 0) {
            return this.f31405b.get(iM35787c + this.f31404a);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: cf.j0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
