package p193n5;

import java.util.Collections;
import java.util.List;
import p068eh.AbstractC0921a;
import p122i5.AbstractC1987b;
import p150k5.C2270u;
import p150k5.C2274y;
import p312v5.C4478a;

/* JADX INFO: renamed from: n5.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2898e extends AbstractC1987b {

    /* JADX INFO: renamed from: j */
    public final C2270u f9361j;

    /* JADX INFO: renamed from: k */
    public final int f9362k;

    /* JADX INFO: renamed from: l */
    public int f9363l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2898e(C2270u c2270u, int i9) {
        this.f9361j = c2270u;
        this.f9362k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.AbstractC0000a, p312v5.InterfaceC4479b
    /* JADX INFO: renamed from: a */
    public final void mo105a() throws C4478a {
        int i9 = this.f9362k;
        if (i9 < 0 || i9 >= this.f9361j.f7551u.f7524h.f7542l) {
            throw new C4478a(AbstractC0921a.m2249l(i9, "method@"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1987b
    /* JADX INFO: renamed from: f1 */
    public final String mo4929f1() {
        C2270u c2270u = this.f9361j;
        return c2270u.f7549s.m5521b(c2270u.f7531a.m585P(c2270u.f7551u.m5519b(this.f9362k)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1987b
    /* JADX INFO: renamed from: g1 */
    public final List mo4930g1() {
        int iM6304i1 = m6304i1();
        C2270u c2270u = this.f9361j;
        int iM583N = c2270u.f7531a.m583N(iM6304i1 + 8);
        if (iM583N <= 0) {
            return Collections.EMPTY_LIST;
        }
        return new C2274y(this, iM583N + 4, c2270u.f7532b.m583N(iM583N), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1987b
    public final String getName() {
        C2270u c2270u = this.f9361j;
        return c2270u.f7548r.m5521b(c2270u.f7531a.m583N(c2270u.f7551u.m5519b(this.f9362k) + 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1987b
    /* JADX INFO: renamed from: h1 */
    public final String mo4931h1() {
        int iM6304i1 = m6304i1();
        C2270u c2270u = this.f9361j;
        return c2270u.f7549s.m5521b(c2270u.f7531a.m583N(iM6304i1 + 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i1 */
    public final int m6304i1() {
        if (this.f9363l == 0) {
            C2270u c2270u = this.f9361j;
            this.f9363l = c2270u.f7552v.m5519b(c2270u.f7531a.m585P(c2270u.f7551u.m5519b(this.f9362k) + 2));
        }
        return this.f9363l;
    }
}
