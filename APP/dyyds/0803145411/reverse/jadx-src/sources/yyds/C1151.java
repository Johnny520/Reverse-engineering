package yyds;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: renamed from: yyds.ᛵᛷᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1151 extends AbstractC2720 {
    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) throws IOException {
        boolean zM3760;
        BitSet bitSet = new BitSet();
        c1942.m3746();
        int iM3744 = c1942.m3744();
        int i = 0;
        while (iM3744 != 2) {
            int iM4012 = AbstractC2104.m4012(iM3744);
            if (iM4012 == 5 || iM4012 == 6) {
                int iM3771 = c1942.m3771();
                if (iM3771 == 0) {
                    zM3760 = false;
                } else {
                    if (iM3771 != 1) {
                        C1693.m3434("Invalid bitset value ", iM3771, ", expected 0 or 1; at path ", c1942.m3749(true));
                        return null;
                    }
                    zM3760 = true;
                }
            } else {
                if (iM4012 != 7) {
                    throw new C1600("Invalid bitset value type: " + AbstractC0897.m1992(iM3744) + "; at path " + c1942.m3749(false));
                }
                zM3760 = c1942.m3760();
            }
            if (zM3760) {
                bitSet.set(i);
            }
            i++;
            iM3744 = c1942.m3744();
        }
        c1942.m3750();
        return bitSet;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c1405.m2866();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            c1405.m2861(bitSet.get(i) ? 1L : 0L);
        }
        c1405.m2855();
    }
}
