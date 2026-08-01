package p230r2;

import java.io.IOException;
import java.math.BigInteger;
import p213o2.AbstractC2770B;
import p213o2.C2789r;
import p224q2.AbstractC2917h;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.F */
/* JADX INFO: loaded from: classes.dex */
public class C3102F extends AbstractC2770B {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        if (c3390a.m5630J() == 9) {
            c3390a.m5626F();
            return null;
        }
        String strM5628H = c3390a.m5628H();
        try {
            AbstractC2917h.m5112d(strM5628H);
            return new BigInteger(strM5628H);
        } catch (NumberFormatException e5) {
            throw new C2789r("Failed parsing '" + strM5628H + "' as BigInteger; at path " + c3390a.m5646m(true), e5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        c3391b.m5654D((BigInteger) obj);
    }
}
