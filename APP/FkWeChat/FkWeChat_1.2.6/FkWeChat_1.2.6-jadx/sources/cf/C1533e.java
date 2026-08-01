package cf;

import java.nio.ByteBuffer;
import p024b9.AbstractC1043k;
import p172l8.C4684a0;
import p322w5.AbstractC9187b;

/* JADX INFO: renamed from: cf.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1533e extends AbstractC9187b {

    /* JADX INFO: renamed from: f */
    public static final a f4503f = new a(null);

    /* JADX INFO: renamed from: l */
    public final C1533e m6006l(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m6007m(i10, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m6007m(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        m35788d(i10, byteBuffer);
    }

    /* JADX INFO: renamed from: n */
    public final C1527b m6008n(int i10) {
        return m6009o(new C1527b(), i10);
    }

    /* JADX INFO: renamed from: o */
    public final C1527b m6009o(C1527b c1527b, int i10) {
        c1527b.getClass();
        int iM35787c = m35787c(12);
        if (iM35787c == 0) {
            return null;
        }
        int iM35786a = m35786a(m35791i(iM35787c) + (i10 * 4));
        ByteBuffer byteBuffer = this.f31405b;
        byteBuffer.getClass();
        return c1527b.m5957l(iM35786a, byteBuffer);
    }

    /* JADX INFO: renamed from: p */
    public final int m6010p() {
        int iM35787c = m35787c(4);
        if (iM35787c != 0) {
            return C4684a0.m18703c(this.f31405b.getInt(iM35787c + this.f31404a));
        }
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public final int m6011q() {
        int iM35787c = m35787c(12);
        if (iM35787c != 0) {
            return m35793k(iM35787c);
        }
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public final String m6012r() {
        int iM35787c = m35787c(8);
        if (iM35787c != 0) {
            return m35789e(iM35787c + this.f31404a);
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final int m6013s() {
        int iM35787c = m35787c(6);
        if (iM35787c != 0) {
            return C4684a0.m18703c(this.f31405b.getInt(iM35787c + this.f31404a));
        }
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public final byte m6014t() {
        int iM35787c = m35787c(10);
        if (iM35787c != 0) {
            return this.f31405b.get(iM35787c + this.f31404a);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: cf.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
