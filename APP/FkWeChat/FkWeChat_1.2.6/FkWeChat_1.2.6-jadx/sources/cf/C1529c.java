package cf;

import java.nio.ByteBuffer;
import p024b9.AbstractC1043k;
import p322w5.AbstractC9187b;

/* JADX INFO: renamed from: cf.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1529c extends AbstractC9187b {

    /* JADX INFO: renamed from: f */
    public static final a f4499f = new a(null);

    /* JADX INFO: renamed from: l */
    public final int m5982l() {
        int iM35787c = m35787c(4);
        if (iM35787c != 0) {
            return m35793k(iM35787c);
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final C1531d m5983m(int i10) {
        return m5984n(new C1531d(), i10);
    }

    /* JADX INFO: renamed from: n */
    public final C1531d m5984n(C1531d c1531d, int i10) {
        c1531d.getClass();
        int iM35787c = m35787c(4);
        if (iM35787c == 0) {
            return null;
        }
        int iM35786a = m35786a(m35791i(iM35787c) + (i10 * 4));
        ByteBuffer byteBuffer = this.f31405b;
        byteBuffer.getClass();
        return c1531d.m5995l(iM35786a, byteBuffer);
    }

    /* JADX INFO: renamed from: cf.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
