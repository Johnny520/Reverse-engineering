package p150k5;

import java.util.AbstractList;

/* JADX INFO: renamed from: k5.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2251e extends AbstractList {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7458g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7459h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2264o f7460i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2251e(C2264o c2264o, int i9, int i10) {
        this.f7460i = c2264o;
        this.f7458g = i9;
        this.f7459h = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        C2270u c2270u = this.f7460i.f7511j;
        return c2270u.f7549s.m5521b(c2270u.f7532b.m585P((i9 * 2) + this.f7458g + 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7459h;
    }
}
