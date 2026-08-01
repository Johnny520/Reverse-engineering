package p076f5;

import bsh.C1259t2;
import okhttp3.internal.url._UrlKt;
import p032c5.C1351y;
import p094g5.C2526i;
import p094g5.InterfaceC2518a;
import p094g5.InterfaceC2527j;
import p254r5.C6492c0;
import p254r5.InterfaceC6489b;
import p309v5.AbstractC8826h;
import p309v5.C8822d;
import p376zd.C9987e;

/* JADX INFO: renamed from: f5.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2290b {
    /* JADX INFO: renamed from: a */
    public final InterfaceC2518a m8347a(C2293e c2293e, int i10, int i11, InterfaceC2527j interfaceC2527j) {
        String str;
        if (c2293e == null) {
            C1259t2.m5095a("cf == null");
            return null;
        }
        if (i10 < 0 || i10 >= 4) {
            C9987e.m38645a("bad context");
            return null;
        }
        C6492c0 c6492c0 = null;
        try {
            C8822d c8822dM8364e = c2293e.m8364e();
            InterfaceC6489b interfaceC6489bM8365f = c2293e.m8365f();
            int iM33858n = c8822dM8364e.m33858n(i11);
            int i12 = i11 + 2;
            int iM33853i = c8822dM8364e.m33853i(i12);
            C6492c0 c6492c02 = (C6492c0) interfaceC6489bM8365f.get(iM33858n);
            if (interfaceC2527j != null) {
                try {
                    interfaceC2527j.m9032b(c8822dM8364e, i11, 2, "name: " + c6492c02.mo6828g());
                    interfaceC2527j.m9032b(c8822dM8364e, i12, 4, "length: " + AbstractC8826h.m33901j(iM33853i));
                } catch (C2526i e10) {
                    e = e10;
                    c6492c0 = c6492c02;
                    StringBuilder sb2 = new StringBuilder("...while parsing ");
                    if (c6492c0 != null) {
                        str = c6492c0.mo6828g() + " ";
                    } else {
                        str = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    sb2.append(str);
                    sb2.append("attribute at offset ");
                    sb2.append(AbstractC8826h.m33901j(i11));
                    e.m3685a(sb2.toString());
                    throw e;
                }
            }
            return mo8348b(c2293e, i10, c6492c02.m25741n(), i11 + 6, iM33853i, interfaceC2527j);
        } catch (C2526i e11) {
            e = e11;
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC2518a mo8348b(C2293e c2293e, int i10, String str, int i11, int i12, InterfaceC2527j interfaceC2527j) {
        C8822d c8822dM8364e = c2293e.m8364e();
        C1351y c1351y = new C1351y(str, c8822dM8364e, i11, i12, c2293e.m8365f());
        if (interfaceC2527j != null) {
            interfaceC2527j.m9032b(c8822dM8364e, i11, i12, "attribute data");
        }
        return c1351y;
    }
}
