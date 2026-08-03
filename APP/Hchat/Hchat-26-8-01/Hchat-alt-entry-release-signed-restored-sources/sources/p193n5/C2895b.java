package p193n5;

import p068eh.AbstractC0921a;
import p122i5.AbstractC1986a;
import p150k5.C2270u;
import p312v5.C4478a;

/* JADX INFO: renamed from: n5.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2895b extends AbstractC1986a {

    /* JADX INFO: renamed from: j */
    public final C2270u f9354j;

    /* JADX INFO: renamed from: k */
    public final int f9355k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2895b(C2270u c2270u, int i9) {
        this.f9354j = c2270u;
        this.f9355k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.AbstractC0000a, p312v5.InterfaceC4479b
    /* JADX INFO: renamed from: a */
    public final void mo105a() throws C4478a {
        int i9 = this.f9355k;
        if (i9 < 0 || i9 >= this.f9354j.f7550t.f7524h.f7540j) {
            throw new C4478a(AbstractC0921a.m2249l(i9, "field@"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1986a
    /* JADX INFO: renamed from: f1 */
    public final String mo4927f1() {
        C2270u c2270u = this.f9354j;
        return c2270u.f7549s.m5521b(c2270u.f7531a.m585P(c2270u.f7550t.m5519b(this.f9355k)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1986a
    public final String getName() {
        C2270u c2270u = this.f9354j;
        return c2270u.f7548r.m5521b(c2270u.f7531a.m583N(c2270u.f7550t.m5519b(this.f9355k) + 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1986a
    public final String getType() {
        C2270u c2270u = this.f9354j;
        return c2270u.f7549s.m5521b(c2270u.f7531a.m585P(c2270u.f7550t.m5519b(this.f9355k) + 2));
    }
}
