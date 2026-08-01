package p215oc;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.EOFException;
import okhttp3.internal.url._UrlKt;
import p024b9.C1046l0;
import p376zd.C10010p0;
import sc.AbstractC7297a;
import tc.AbstractC8219e;
import tc.C8218d;
import tc.InterfaceC8216b;
import tc.InterfaceC8217c;

/* JADX INFO: renamed from: oc.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5707c0 {
    /* JADX INFO: renamed from: a */
    public static final String m23090a(C5708d c5708d, long j10) throws EOFException {
        if (j10 == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        C8218d c8218d = C8218d.f27528a;
        C5721p c5721pM23109h = c5708d.m23109h();
        if (c5721pM23109h == null) {
            C10010p0.m38820a("Unreacheable");
            return null;
        }
        InterfaceC8216b unused = AbstractC8219e.f27529a;
        if (c5721pM23109h.m23150j() < j10) {
            return AbstractC7297a.m28925b(AbstractC5703a0.m23083d(c5708d, (int) j10), 0, 0, 3, null);
        }
        byte[] bArrM23142b = c5721pM23109h.m23142b(true);
        int iM23146f = c5721pM23109h.m23146f();
        String strM28924a = AbstractC7297a.m28924a(bArrM23142b, iM23146f, Math.min(c5721pM23109h.m23144d(), ((int) j10) + iM23146f));
        c5708d.skip(j10);
        return strM28924a;
    }

    /* JADX INFO: renamed from: b */
    public static final String m23091b(C5708d c5708d) {
        c5708d.getClass();
        return m23090a(c5708d, c5708d.m23111j());
    }

    /* JADX INFO: renamed from: c */
    public static final String m23092c(InterfaceC5728w interfaceC5728w) {
        interfaceC5728w.getClass();
        interfaceC5728w.mo23110i(Long.MAX_VALUE);
        return m23090a(interfaceC5728w.mo23102b(), interfaceC5728w.mo23102b().m23111j());
    }

    /* JADX INFO: renamed from: d */
    public static final String m23093d(InterfaceC5728w interfaceC5728w, long j10) {
        interfaceC5728w.getClass();
        interfaceC5728w.mo23116o(j10);
        return m23090a(interfaceC5728w.mo23102b(), j10);
    }

    /* JADX INFO: renamed from: e */
    public static final void m23094e(InterfaceC5726u interfaceC5726u, String str, int i10, int i11) {
        int i12;
        interfaceC5726u.getClass();
        str.getClass();
        int i13 = i10;
        AbstractC5709d0.m23124a(str.length(), i13, i11);
        C5708d c5708dMo23102b = interfaceC5726u.mo23102b();
        while (i13 < i11) {
            C1046l0 c1046l0 = new C1046l0();
            char cCharAt = str.charAt(i13);
            c1046l0.f3205q = cCharAt;
            if (cCharAt < 128) {
                C8218d c8218d = C8218d.f27528a;
                C5721p c5721pM23097G = c5708dMo23102b.m23097G(1);
                InterfaceC8217c interfaceC8217c = AbstractC8219e.f27530b;
                int i14 = -i13;
                int iMin = Math.min(i11, c5721pM23097G.m23148h() + i13);
                interfaceC8217c.mo31916c(c5721pM23097G, i13 + i14, (byte) c1046l0.f3205q);
                i13++;
                while (i13 < iMin) {
                    char cCharAt2 = str.charAt(i13);
                    c1046l0.f3205q = cCharAt2;
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    interfaceC8217c.mo31916c(c5721pM23097G, i13 + i14, (byte) cCharAt2);
                    i13++;
                }
                int i15 = i14 + i13;
                if (i15 == 1) {
                    c5721pM23097G.m23156p(c5721pM23097G.m23144d() + i15);
                    c5708dMo23102b.m23121t(c5708dMo23102b.m23112k() + ((long) i15));
                } else if (i15 < 0 || i15 > c5721pM23097G.m23148h()) {
                    C5705b0.m23088a(i15, c5721pM23097G.m23148h());
                    return;
                } else if (i15 != 0) {
                    c5721pM23097G.m23156p(c5721pM23097G.m23144d() + i15);
                    c5708dMo23102b.m23121t(c5708dMo23102b.m23112k() + ((long) i15));
                } else if (AbstractC5723r.m23170b(c5721pM23097G)) {
                    c5708dMo23102b.m23115n();
                }
            } else {
                if (cCharAt < 2048) {
                    C8218d c8218d2 = C8218d.f27528a;
                    i12 = 2;
                    C5721p c5721pM23097G2 = c5708dMo23102b.m23097G(2);
                    InterfaceC8217c interfaceC8217c2 = AbstractC8219e.f27530b;
                    int i16 = c1046l0.f3205q;
                    interfaceC8217c2.mo31917d(c5721pM23097G2, 0, (byte) ((i16 >> 6) | Opcodes.CHECKCAST), (byte) ((i16 & 63) | 128));
                    c5721pM23097G2.m23156p(c5721pM23097G2.m23144d() + 2);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    C8218d c8218d3 = C8218d.f27528a;
                    i12 = 3;
                    C5721p c5721pM23097G3 = c5708dMo23102b.m23097G(3);
                    InterfaceC8217c interfaceC8217c3 = AbstractC8219e.f27530b;
                    int i17 = c1046l0.f3205q;
                    interfaceC8217c3.mo31914a(c5721pM23097G3, 0, (byte) ((i17 >> 12) | 224), (byte) (((i17 >> 6) & 63) | 128), (byte) ((i17 & 63) | 128));
                    c5721pM23097G3.m23156p(c5721pM23097G3.m23144d() + 3);
                } else {
                    int i18 = i13 + 1;
                    char cCharAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    int i19 = c1046l0.f3205q;
                    if (i19 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        c5708dMo23102b.mo23099I(JSONB.Constants.BC_INT32_BYTE_MAX);
                        i13 = i18;
                    } else {
                        int i20 = (((i19 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C8218d c8218d4 = C8218d.f27528a;
                        C5721p c5721pM23097G4 = c5708dMo23102b.m23097G(4);
                        AbstractC8219e.f27530b.mo31915b(c5721pM23097G4, 0, (byte) ((i20 >> 18) | 240), (byte) (((i20 >> 12) & 63) | 128), (byte) (((i20 >> 6) & 63) | 128), (byte) ((i20 & 63) | 128));
                        c5721pM23097G4.m23156p(c5721pM23097G4.m23144d() + 4);
                        c5708dMo23102b.m23121t(c5708dMo23102b.m23112k() + ((long) 4));
                        i13 += 2;
                    }
                }
                c5708dMo23102b.m23121t(c5708dMo23102b.m23112k() + ((long) i12));
                i13++;
            }
        }
        interfaceC5726u.mo23118p0();
    }
}
