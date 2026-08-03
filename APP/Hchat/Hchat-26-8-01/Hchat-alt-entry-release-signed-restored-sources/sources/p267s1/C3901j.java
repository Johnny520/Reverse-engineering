package p267s1;

import p069f.C0933f0;
import p069f.C0952p;
import p100h0.C1545q0;
import p131j0.C2046b;
import p308v1.InterfaceC4428t;

/* JADX INFO: renamed from: s1.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3901j {

    /* JADX INFO: renamed from: a */
    public final C2046b f12795a = new C2046b(new C3899i[16]);

    /* JADX INFO: renamed from: b */
    public final C0933f0 f12796b = new C0933f0(10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public boolean mo8092a(C0952p c0952p, InterfaceC4428t interfaceC4428t, C1545q0 c1545q0, boolean z9) {
        C2046b c2046b = this.f12795a;
        Object[] objArr = c2046b.f6891g;
        int i9 = c2046b.f6893i;
        boolean z10 = false;
        for (int i10 = 0; i10 < i9; i10++) {
            z10 = ((C3899i) objArr[i10]).mo8092a(c0952p, interfaceC4428t, c1545q0, z9) || z10;
        }
        return z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    /* JADX INFO: renamed from: b */
    public void mo8093b(C1545q0 c1545q0) {
        C2046b c2046b = this.f12795a;
        int i9 = c2046b.f6893i;
        while (true) {
            i9--;
            if (-1 >= i9) {
                return;
            }
            if (((C3899i) c2046b.f6891g[i9]).f12784d.f55h == 0) {
                c2046b.m5065k(i9);
            }
        }
    }
}
