package p151k6;

import java.io.IOException;
import java.util.BitSet;
import p105h6.AbstractC1622n;
import p208o6.C3066a;

/* JADX INFO: renamed from: k6.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2318t0 extends AbstractC1622n {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c3066a.m6501b();
        int length = bitSet.length();
        for (int i9 = 0; i9 < length; i9++) {
            c3066a.m6514u(bitSet.get(i9) ? 1L : 0L);
        }
        c3066a.m6504g();
    }
}
