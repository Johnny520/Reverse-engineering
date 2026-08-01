package p370z6;

import java.nio.charset.Charset;
import java.util.Iterator;
import p024b9.AbstractC1061t;
import p048d8.AbstractC1921a;
import p281t6.AbstractC8168u;
import p281t6.C8156l;
import p281t6.C8169v;
import p281t6.InterfaceC8163p;
import p299ub.C8614c;

/* JADX INFO: renamed from: z6.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9881e {
    /* JADX INFO: renamed from: a */
    public static final Charset m38361a(InterfaceC8163p interfaceC8163p, Charset charset) {
        interfaceC8163p.getClass();
        charset.getClass();
        Iterator it = AbstractC8168u.m31662d(interfaceC8163p.mo12334e(C8169v.f27347a.m31675d())).iterator();
        while (it.hasNext()) {
            String strM31633a = ((C8156l) it.next()).m31633a();
            if (AbstractC1061t.m3842c(strM31633a, "*")) {
                return charset;
            }
            C8614c c8614c = C8614c.f28651a;
            if (AbstractC1921a.m6974h(c8614c, strM31633a)) {
                return AbstractC1921a.m6971e(c8614c, strM31633a);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Charset m38362b(InterfaceC8163p interfaceC8163p, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C8614c.f28652b;
        }
        return m38361a(interfaceC8163p, charset);
    }
}
