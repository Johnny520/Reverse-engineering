package p230r2;

import java.io.IOException;
import java.net.InetAddress;
import p213o2.AbstractC2770B;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.M */
/* JADX INFO: loaded from: classes.dex */
public class C3109M extends AbstractC2770B {
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        if (c3390a.m5630J() != 9) {
            return InetAddress.getByName(c3390a.m5628H());
        }
        c3390a.m5626F();
        return null;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        c3391b.m5655E(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
