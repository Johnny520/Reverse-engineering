package p273s7;

import p136j8.C2104o;
import p152k7.InterfaceC2336f;
import p209o7.C3069c;
import p257r7.AbstractC3721k;
import p314v7.C4490d;
import p379z7.C6107c;

/* JADX INFO: renamed from: s7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3934c extends C3069c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static C6107c m8126l0(C3933b c3933b) {
        int size = c3933b.f9926k.size();
        C6107c c6107c = new C6107c(size);
        for (int i9 = 0; i9 < size; i9++) {
            C4490d c4490d = (C4490d) c3933b.m6524Q(i9);
            if (!c4490d.mo5555y()) {
                c6107c.add(Integer.valueOf(c4490d.m8925L()));
            }
        }
        return c6107c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final void m8127k0(C3933b c3933b, InterfaceC2336f interfaceC2336f) {
        if (c3933b.isEmpty()) {
            m6532b0(interfaceC2336f);
            return;
        }
        C3069c c3069c = c3933b.f12915n;
        if (((C3934c) c3069c).f9927l == AbstractC3721k.f12090p) {
            C3934c c3934c = (C3934c) c3069c;
            if (c3934c.f9926k.size() >= 2) {
                C6107c c6107c = c3934c.f9926k;
                c6107c.getClass();
                if (c3933b == c6107c) {
                    C2104o.m5294t("swappable == this");
                    return;
                } else if (c6107c.m10872k(new C3932a(c3933b))) {
                    c3934c.m6536h0(0);
                }
            }
        }
        C6107c c6107cM8126l0 = m8126l0(c3933b);
        int i9 = c6107cM8126l0.f24644i;
        int iIntValue = ((Integer) c6107cM8126l0.f24642g[i9 - 1]).intValue();
        m6521N();
        m6532b0(interfaceC2336f);
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int iIntValue2 = ((Integer) c6107cM8126l0.f24642g[i10]).intValue();
            while (true) {
                i11++;
                if (i11 < iIntValue2) {
                    c3933b.m6522O(i11);
                }
            }
            i10++;
            i11 = iIntValue2;
        }
        c3933b.mo6520d0(iIntValue + 1, false);
        mo5557c0(c3933b.f9926k.size());
    }
}
