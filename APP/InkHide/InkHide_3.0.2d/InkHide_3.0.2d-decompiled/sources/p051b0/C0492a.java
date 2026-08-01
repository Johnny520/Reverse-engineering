package p051b0;

import java.util.Iterator;
import java.util.Map;
import p022L.AbstractC0174d;
import p037T.C0268s;
import p042W.C0336h;

/* JADX INFO: renamed from: b0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0492a {

    /* JADX INFO: renamed from: a */
    public static C0492a f1545a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m939a(C0493b c0493b) {
        if (c0493b instanceof C0336h) {
            C0336h c0336h = (C0336h) c0493b;
            c0336h.m564F(5);
            Map.Entry entry = (Map.Entry) ((Iterator) c0336h.m568J()).next();
            c0336h.m570L(entry.getValue());
            c0336h.m570L(new C0268s((String) entry.getKey()));
            return;
        }
        int iM945d = c0493b.f1553h;
        if (iM945d == 0) {
            iM945d = c0493b.m945d();
        }
        if (iM945d == 13) {
            c0493b.f1553h = 9;
            return;
        }
        if (iM945d == 12) {
            c0493b.f1553h = 8;
        } else {
            if (iM945d == 14) {
                c0493b.f1553h = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + AbstractC0174d.m361q(c0493b.mo585x()) + c0493b.m949m());
        }
    }
}
