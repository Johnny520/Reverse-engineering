package p230r2;

import java.io.IOException;
import p011B4.AbstractC0231b;
import p213o2.AbstractC2770B;
import p213o2.C2789r;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.X */
/* JADX INFO: loaded from: classes.dex */
public class C3119X extends AbstractC2770B {
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        if (c3390a.m5630J() == 9) {
            c3390a.m5626F();
            return null;
        }
        try {
            int iM5622A = c3390a.m5622A();
            if (iM5622A <= 255 && iM5622A >= -128) {
                return Byte.valueOf((byte) iM5622A);
            }
            StringBuilder sbM404o = AbstractC0231b.m404o(iM5622A, "Lossy conversion from ", " to byte; at path ");
            sbM404o.append(c3390a.m5646m(true));
            throw new C2789r(sbM404o.toString());
        } catch (NumberFormatException e5) {
            throw new C2789r(e5);
        }
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        if (((Number) obj) == null) {
            c3391b.m5666n();
        } else {
            c3391b.m5653C(r4.byteValue());
        }
    }
}
