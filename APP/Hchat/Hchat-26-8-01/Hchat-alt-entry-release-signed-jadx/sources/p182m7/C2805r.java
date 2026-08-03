package p182m7;

import java.util.AbstractList;

/* JADX INFO: renamed from: m7.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2805r extends AbstractList {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC2796i f9063g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2805r(AbstractC2796i abstractC2796i) {
        this.f9063g = abstractC2796i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        return (AbstractC2804q) this.f9063g.mo6185R().m6524Q(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9063g.mo6185R().f9926k.size();
    }
}
