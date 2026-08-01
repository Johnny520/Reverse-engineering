package p230r2;

import java.io.IOException;
import p213o2.AbstractC2770B;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.D */
/* JADX INFO: loaded from: classes.dex */
public class C3100D extends AbstractC2770B {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        int iM5630J = c3390a.m5630J();
        if (iM5630J != 9) {
            return iM5630J == 8 ? Boolean.toString(c3390a.m5650w()) : c3390a.m5628H();
        }
        c3390a.m5626F();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        c3391b.m5655E((String) obj);
    }
}
