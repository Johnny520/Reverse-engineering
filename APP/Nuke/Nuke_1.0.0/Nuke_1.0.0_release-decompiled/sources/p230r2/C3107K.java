package p230r2;

import java.io.IOException;
import java.net.URL;
import p213o2.AbstractC2770B;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.K */
/* JADX INFO: loaded from: classes.dex */
public class C3107K extends AbstractC2770B {
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        if (c3390a.m5630J() == 9) {
            c3390a.m5626F();
            return null;
        }
        String strM5628H = c3390a.m5628H();
        if (strM5628H.equals("null")) {
            return null;
        }
        return new URL(strM5628H);
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        URL url = (URL) obj;
        c3391b.m5655E(url == null ? null : url.toExternalForm());
    }
}
