package p000;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class g53 extends q43 {
    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        if (l41Var.m2814I() != 9) {
            return InetAddress.getByName(l41Var.m2812G());
        }
        l41Var.m2810E();
        return null;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        o41Var.m3487D(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
