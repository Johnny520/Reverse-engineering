package io.ktor.utils.p131io;

import java.nio.ByteBuffer;
import p010a9.InterfaceC0184l;
import p064e8.AbstractC2052e;
import p172l8.C4700i0;
import p215oc.AbstractC5723r;
import p215oc.C5705b0;
import p215oc.C5708d;
import p215oc.C5721p;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import tc.C8218d;

/* JADX INFO: renamed from: io.ktor.utils.io.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3477o {
    /* JADX INFO: renamed from: a */
    public static final Object m12990a(InterfaceC3473k interfaceC3473k, int i10, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        C8218d c8218d = C8218d.f27528a;
        C5708d c5708dMo23102b = interfaceC3473k.mo12880d().mo23102b();
        C5721p c5721pM23097G = c5708dMo23102b.m23097G(i10);
        byte[] bArrM23142b = c5721pM23097G.m23142b(false);
        int iM23144d = c5721pM23097G.m23144d();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrM23142b, iM23144d, bArrM23142b.length - iM23144d);
        byteBufferWrap.getClass();
        interfaceC0184l.mo27m(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - iM23144d;
        if (iPosition == i10) {
            c5721pM23097G.m23137A(bArrM23142b, iPosition);
            c5721pM23097G.m23156p(c5721pM23097G.m23144d() + iPosition);
            c5708dMo23102b.m23121t(c5708dMo23102b.m23112k() + ((long) iPosition));
        } else {
            if (iPosition < 0 || iPosition > c5721pM23097G.m23148h()) {
                C5705b0.m23088a(iPosition, c5721pM23097G.m23148h());
                return null;
            }
            if (iPosition != 0) {
                c5721pM23097G.m23137A(bArrM23142b, iPosition);
                c5721pM23097G.m23156p(c5721pM23097G.m23144d() + iPosition);
                c5708dMo23102b.m23121t(c5708dMo23102b.m23112k() + ((long) iPosition));
            } else if (AbstractC5723r.m23170b(c5721pM23097G)) {
                c5708dMo23102b.m23115n();
            }
        }
        Object objMo12879b = interfaceC3473k.mo12879b(interfaceC5976f);
        return objMo12879b == AbstractC6325c.m24992g() ? objMo12879b : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m12991b(InterfaceC3473k interfaceC3473k, int i10, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return m12990a(interfaceC3473k, i10, interfaceC0184l, interfaceC5976f);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m12992c(InterfaceC3473k interfaceC3473k, ByteBuffer byteBuffer, InterfaceC5976f interfaceC5976f) {
        AbstractC2052e.m7401a(interfaceC3473k.mo12880d(), byteBuffer);
        Object objMo12879b = interfaceC3473k.mo12879b(interfaceC5976f);
        return objMo12879b == AbstractC6325c.m24992g() ? objMo12879b : C4700i0.f13910a;
    }
}
