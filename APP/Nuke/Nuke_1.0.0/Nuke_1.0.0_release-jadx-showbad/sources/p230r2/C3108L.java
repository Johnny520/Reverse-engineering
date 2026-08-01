package p230r2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import p213o2.AbstractC2770B;
import p213o2.C2789r;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.L */
/* JADX INFO: loaded from: classes.dex */
public class C3108L extends AbstractC2770B {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        if (c3390a.m5630J() == 9) {
            c3390a.m5626F();
            return null;
        }
        try {
            String strM5628H = c3390a.m5628H();
            if (strM5628H.equals("null")) {
                return null;
            }
            return new URI(strM5628H);
        } catch (URISyntaxException e5) {
            throw new C2789r(e5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        URI uri = (URI) obj;
        c3391b.m5655E(uri == null ? null : uri.toASCIIString());
    }
}
