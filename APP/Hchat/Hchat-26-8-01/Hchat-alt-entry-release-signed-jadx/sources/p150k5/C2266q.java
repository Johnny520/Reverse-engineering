package p150k5;

import p207o5.AbstractC3060o;

/* JADX INFO: renamed from: k5.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2266q extends AbstractC3060o {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2270u f7525g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2266q(C2270u c2270u) {
        this.f7525g = c2270u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3060o
    /* JADX INFO: renamed from: a */
    public final Object mo5520a(int i9) {
        return (C2264o) this.f7525g.f7553w.get(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7525g.f7544n;
    }
}
