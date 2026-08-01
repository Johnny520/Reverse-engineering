package p230r2;

import java.io.IOException;
import java.util.BitSet;
import p011B4.AbstractC0231b;
import p042H1.AbstractC0636d;
import p213o2.AbstractC2770B;
import p213o2.C2789r;
import p237s4.AbstractC3202a;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.T */
/* JADX INFO: loaded from: classes.dex */
public class C3115T extends AbstractC2770B {
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        boolean zM5650w;
        BitSet bitSet = new BitSet();
        c3390a.m5639b();
        int iM5630J = c3390a.m5630J();
        int i5 = 0;
        while (iM5630J != 2) {
            int iM1088a = AbstractC0636d.m1088a(iM5630J);
            if (iM1088a == 5 || iM1088a == 6) {
                int iM5622A = c3390a.m5622A();
                if (iM5622A == 0) {
                    zM5650w = false;
                } else {
                    if (iM5622A != 1) {
                        StringBuilder sbM404o = AbstractC0231b.m404o(iM5622A, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbM404o.append(c3390a.m5646m(true));
                        throw new C2789r(sbM404o.toString());
                    }
                    zM5650w = true;
                }
            } else {
                if (iM1088a != 7) {
                    throw new C2789r("Invalid bitset value type: " + AbstractC3202a.m5469d(iM5630J) + "; at path " + c3390a.m5646m(false));
                }
                zM5650w = c3390a.m5650w();
            }
            if (zM5650w) {
                bitSet.set(i5);
            }
            i5++;
            iM5630J = c3390a.m5630J();
        }
        c3390a.m5643h();
        return bitSet;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c3391b.m5659c();
        int length = bitSet.length();
        for (int i5 = 0; i5 < length; i5++) {
            c3391b.m5653C(bitSet.get(i5) ? 1L : 0L);
        }
        c3391b.m5662h();
    }
}
