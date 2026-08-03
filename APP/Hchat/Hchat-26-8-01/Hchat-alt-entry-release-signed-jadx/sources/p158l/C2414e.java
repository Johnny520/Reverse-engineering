package p158l;

import p015b0.C0151q;
import p036c9.C0455k0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1876r1;
import p266s0.C3874d;
import p322w0.C4665p;

/* JADX INFO: renamed from: l.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2414e {

    /* JADX INFO: renamed from: a */
    public final C4665p f7893a = new C4665p();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m5751b(C2414e c2414e, InterfaceC1235p interfaceC1235p, C3874d c3874d, InterfaceC1220a interfaceC1220a, int i9) {
        if ((i9 & 8) != 0) {
            c3874d = null;
        }
        c2414e.f7893a.add(new C3874d(-1789283891, new C0455k0(interfaceC1235p, c2414e, c3874d, interfaceC1220a), true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5752a(C2413d c2413d, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-798501095);
        int i10 = (c1836h0.m4534f(c2413d) ? 4 : 2) | i9 | (c1836h0.m4534f(this) ? 32 : 16);
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            C4665p c4665p = this.f7893a;
            int size = c4665p.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((InterfaceC1236q) c4665p.get(i11)).mo734b(c2413d, c1836h0, Integer.valueOf(i10 & 14));
            }
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0151q(this, c2413d, i9, 9);
        }
    }
}
