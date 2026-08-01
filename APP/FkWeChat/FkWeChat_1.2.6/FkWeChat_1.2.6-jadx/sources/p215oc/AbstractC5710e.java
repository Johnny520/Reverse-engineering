package p215oc;

import java.nio.ByteBuffer;
import tc.C8218d;

/* JADX INFO: renamed from: oc.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5710e {
    /* JADX INFO: renamed from: a */
    public static final C5708d m23127a(C5708d c5708d, ByteBuffer byteBuffer) {
        c5708d.getClass();
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        while (iRemaining > 0) {
            C8218d c8218d = C8218d.f27528a;
            C5721p c5721pM23097G = c5708d.m23097G(1);
            byte[] bArrM23142b = c5721pM23097G.m23142b(false);
            int iM23144d = c5721pM23097G.m23144d();
            int iMin = Math.min(iRemaining, bArrM23142b.length - iM23144d);
            byteBuffer.get(bArrM23142b, iM23144d, iMin);
            iRemaining -= iMin;
            if (iMin == 1) {
                c5721pM23097G.m23137A(bArrM23142b, iMin);
                c5721pM23097G.m23156p(c5721pM23097G.m23144d() + iMin);
                c5708d.m23121t(c5708d.m23112k() + ((long) iMin));
            } else {
                if (iMin < 0 || iMin > c5721pM23097G.m23148h()) {
                    C5705b0.m23088a(iMin, c5721pM23097G.m23148h());
                    return null;
                }
                if (iMin != 0) {
                    c5721pM23097G.m23137A(bArrM23142b, iMin);
                    c5721pM23097G.m23156p(c5721pM23097G.m23144d() + iMin);
                    c5708d.m23121t(c5708d.m23112k() + ((long) iMin));
                } else if (AbstractC5723r.m23170b(c5721pM23097G)) {
                    c5708d.m23115n();
                }
            }
        }
        return c5708d;
    }
}
