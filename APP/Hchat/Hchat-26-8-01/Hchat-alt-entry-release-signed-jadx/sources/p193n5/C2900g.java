package p193n5;

import p068eh.AbstractC0921a;
import p122i5.AbstractC1988c;
import p150k5.C2270u;
import p312v5.C4478a;

/* JADX INFO: renamed from: n5.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2900g extends AbstractC1988c {

    /* JADX INFO: renamed from: j */
    public final C2270u f9366j;

    /* JADX INFO: renamed from: k */
    public final int f9367k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2900g(C2270u c2270u, int i9) {
        this.f9366j = c2270u;
        this.f9367k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.AbstractC0000a, p312v5.InterfaceC4479b
    /* JADX INFO: renamed from: a */
    public final void mo105a() throws C4478a {
        int i9 = this.f9367k;
        if (i9 < 0 || i9 >= this.f9366j.f7549s.f7530h.f7536f) {
            throw new C4478a(AbstractC0921a.m2249l(i9, "type@"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p312v5.InterfaceC4480c
    public final String getType() {
        return this.f9366j.f7549s.m5521b(this.f9367k);
    }
}
