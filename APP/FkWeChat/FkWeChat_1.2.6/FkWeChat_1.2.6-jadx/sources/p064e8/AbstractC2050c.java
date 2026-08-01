package p064e8;

import java.io.EOFException;
import java.nio.ByteBuffer;
import p010a9.InterfaceC0184l;
import p215oc.C5708d;
import p215oc.C5721p;
import p215oc.InterfaceC5728w;
import p376zd.C10010p0;
import p376zd.C9987e;
import tc.C8218d;

/* JADX INFO: renamed from: e8.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2050c {
    /* JADX INFO: renamed from: a */
    public static final void m7396a(InterfaceC5728w interfaceC5728w, InterfaceC0184l interfaceC0184l) throws EOFException {
        interfaceC5728w.getClass();
        interfaceC0184l.getClass();
        C8218d c8218d = C8218d.f27528a;
        C5708d c5708dMo23102b = interfaceC5728w.mo23102b();
        if (c5708dMo23102b.mo23108g()) {
            C9987e.m38645a("Buffer is empty");
            return;
        }
        C5721p c5721pM23109h = c5708dMo23102b.m23109h();
        c5721pM23109h.getClass();
        byte[] bArrM23142b = c5721pM23109h.m23142b(true);
        int iM23146f = c5721pM23109h.m23146f();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrM23142b, iM23146f, c5721pM23109h.m23144d() - iM23146f);
        byteBufferWrap.getClass();
        interfaceC0184l.mo27m(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - iM23146f;
        if (iPosition != 0) {
            if (iPosition < 0) {
                C10010p0.m38820a("Returned negative read bytes count");
            } else if (iPosition <= c5721pM23109h.m23150j()) {
                c5708dMo23102b.skip(iPosition);
            } else {
                C10010p0.m38820a("Returned too many bytes");
            }
        }
    }
}
