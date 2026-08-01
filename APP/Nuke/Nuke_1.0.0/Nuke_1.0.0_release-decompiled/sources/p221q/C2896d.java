package p221q;

import p000A.C0094w0;
import p028F.C0352m;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p136b0.C1843e;
import p158f0.C2085q;

/* JADX INFO: renamed from: q.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2896d {

    /* JADX INFO: renamed from: a */
    public final C2085q f9155a = new C2085q();

    /* JADX INFO: renamed from: b */
    public static void m5091b(C2896d c2896d, InterfaceC1603e interfaceC1603e, C1843e c1843e, InterfaceC1599a interfaceC1599a, int i5) {
        if ((i5 & 8) != 0) {
            c1843e = null;
        }
        c2896d.f9155a.add(new C1843e(-1789283891, true, new C0094w0(interfaceC1603e, c2896d, c1843e, interfaceC1599a)));
    }

    /* JADX INFO: renamed from: a */
    public final void m5092a(C2895c c2895c, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-798501095);
        int i6 = (c1383r.m2582f(c2895c) ? 4 : 2) | i5 | (c1383r.m2582f(this) ? 32 : 16);
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            C2085q c2085q = this.f9155a;
            int size = c2085q.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((InterfaceC1604f) c2085q.get(i7)).mo5f(c2895c, c1383r, Integer.valueOf(i6 & 14));
            }
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0352m(i5, 12, this, c2895c);
        }
    }
}
