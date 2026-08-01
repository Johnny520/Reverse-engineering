package p064e8;

import java.nio.charset.Charset;
import p024b9.AbstractC1061t;
import p048d8.AbstractC1921a;
import p048d8.AbstractC1922b;
import p215oc.AbstractC5707c0;
import p215oc.InterfaceC5726u;
import p215oc.InterfaceC5728w;
import p299ub.AbstractC8611a0;
import p299ub.C8614c;

/* JADX INFO: renamed from: e8.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2053f {
    /* JADX INFO: renamed from: a */
    public static final String m7402a(InterfaceC5728w interfaceC5728w, Charset charset, int i10) {
        interfaceC5728w.getClass();
        charset.getClass();
        return AbstractC1061t.m3842c(charset, C8614c.f28652b) ? i10 == Integer.MAX_VALUE ? AbstractC5707c0.m23092c(interfaceC5728w) : AbstractC5707c0.m23093d(interfaceC5728w, Math.min(interfaceC5728w.mo23102b().m23111j(), i10)) : AbstractC1922b.m6975a(charset.newDecoder(), interfaceC5728w, i10);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m7403b(InterfaceC5728w interfaceC5728w, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = C8614c.f28652b;
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return m7402a(interfaceC5728w, charset, i10);
    }

    /* JADX INFO: renamed from: c */
    public static final byte[] m7404c(String str, Charset charset) {
        str.getClass();
        charset.getClass();
        return AbstractC1061t.m3842c(charset, C8614c.f28652b) ? AbstractC8611a0.m33058C(str, 0, 0, true, 3, null) : AbstractC1921a.m6969c(charset.newEncoder(), str, 0, str.length());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ byte[] m7405d(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C8614c.f28652b;
        }
        return m7404c(str, charset);
    }

    /* JADX INFO: renamed from: e */
    public static final void m7406e(InterfaceC5726u interfaceC5726u, CharSequence charSequence, int i10, int i11, Charset charset) {
        interfaceC5726u.getClass();
        charSequence.getClass();
        charset.getClass();
        if (charset == C8614c.f28652b) {
            AbstractC5707c0.m23094e(interfaceC5726u, charSequence.toString(), i10, i11);
        } else {
            AbstractC1922b.m6976b(charset.newEncoder(), interfaceC5726u, charSequence, i10, i11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m7407f(InterfaceC5726u interfaceC5726u, CharSequence charSequence, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        if ((i12 & 8) != 0) {
            charset = C8614c.f28652b;
        }
        m7406e(interfaceC5726u, charSequence, i10, i11, charset);
    }
}
