package p048d8;

import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import p215oc.InterfaceC5726u;
import p215oc.InterfaceC5728w;
import p376zd.C10010p0;

/* JADX INFO: renamed from: d8.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1922b {
    /* JADX INFO: renamed from: a */
    public static final String m6975a(CharsetDecoder charsetDecoder, InterfaceC5728w interfaceC5728w, int i10) throws IOException {
        charsetDecoder.getClass();
        interfaceC5728w.getClass();
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10, interfaceC5728w.mo23102b().m23111j()));
        AbstractC1921a.m6967a(charsetDecoder, interfaceC5728w, sb2, i10);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final void m6976b(CharsetEncoder charsetEncoder, InterfaceC5726u interfaceC5726u, CharSequence charSequence, int i10, int i11) {
        charsetEncoder.getClass();
        interfaceC5726u.getClass();
        charSequence.getClass();
        if (i10 >= i11) {
            return;
        }
        do {
            int iM6968b = AbstractC1921a.m6968b(charsetEncoder, charSequence, i10, i11, interfaceC5726u);
            if (iM6968b < 0) {
                C10010p0.m38820a("Check failed.");
                return;
            }
            i10 += iM6968b;
        } while (i10 < i11);
    }
}
