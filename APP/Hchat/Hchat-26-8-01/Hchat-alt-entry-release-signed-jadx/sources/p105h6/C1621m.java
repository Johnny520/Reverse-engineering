package p105h6;

import p208o6.C3066a;

/* JADX INFO: renamed from: h6.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1621m extends AbstractC1622n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1622n f5316a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1621m(AbstractC1622n abstractC1622n) {
        this.f5316a = abstractC1622n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) {
        if (obj == null) {
            c3066a.m6508l();
        } else {
            this.f5316a.mo4127b(c3066a, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f5316a + "]";
    }
}
